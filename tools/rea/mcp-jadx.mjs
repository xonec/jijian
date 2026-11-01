#!/usr/bin/env node
/**
 * 常驻 JADX (jadx-headless-mcp) MCP stdio 客户端：一次加载 APK，批量查询/导出代码。
 * 用法：
 *   node mcp-jadx.mjs --apk <apk> --list-tools
 *   node mcp-jadx.mjs --apk <apk> --call <toolName> --args '<json>' [--out file]
 */
import { spawn } from 'node:child_process'
import { readFileSync, writeFileSync } from 'node:fs'
import { fileURLToPath } from 'node:url'
import { dirname, join } from 'node:path'

const here = dirname(fileURLToPath(import.meta.url))
const args = process.argv.slice(2)
function arg(name, def, hasValue = true) {
  const i = args.indexOf('--' + name)
  if (i < 0) return def
  return hasValue ? args[i + 1] : true
}
const JAR = arg('jar', join(here, 'jadx-headless-mcp-0.7.1-all.jar'))
const APK = arg('apk', '')
const listTools = arg('list-tools', false, false)
const callTool = arg('call', '')
const callArgs = JSON.parse(arg('args', '{}'))
const outFile = arg('out', '')

const javaArgs = ['-Xmx4g', '-jar', JAR, '--transport', 'stdio']
if (APK) javaArgs.push('--apk', APK)
const child = spawn('java', javaArgs, { stdio: ['pipe', 'pipe', 'pipe'] })

let buf = ''
let id = 0
const pending = new Map()
const errors = []

function send(method, params, isNotify = false) {
  const msg = { jsonrpc: '2.0', method, ...(params ? { params } : {}) }
  if (!isNotify) { id += 1; msg.id = id; }
  child.stdin.write(JSON.stringify(msg) + '\n')
  if (isNotify) return Promise.resolve(null)
  return new Promise((resolve, reject) => pending.set(msg.id, { resolve, reject }))
}
function handle(line) {
  let msg
  try { msg = JSON.parse(line) } catch { return }
  if (msg.method === 'notifications/message' || msg.method === 'notifications/progress') return
  if (msg.id && pending.has(msg.id)) {
    const p = pending.get(msg.id); pending.delete(msg.id)
    if (msg.error) p.reject(new Error(JSON.stringify(msg.error))); else p.resolve(msg.result)
  }
}
child.stdout.on('data', (d) => {
  buf += d.toString('utf8')
  let idx
  while ((idx = buf.indexOf('\n')) >= 0) {
    const line = buf.slice(0, idx).trim(); buf = buf.slice(idx + 1)
    if (line) handle(line)
  }
})
child.stderr.on('data', (d) => errors.push(d.toString('utf8')))

const timeout = Number(arg('timeout', '300000'))
const timer = setTimeout(() => { console.error('TIMEOUT'); child.kill('SIGKILL'); process.exit(2) }, timeout)

try {
  await send('initialize', {
    protocolVersion: '2025-06-18',
    capabilities: {},
    clientInfo: { name: 'dsh-batch', version: '1.0.0' }
  })
  await send('notifications/initialized', null, true)
  if (listTools) {
    const r = await send('tools/list', {})
    const tools = (r && r.tools) || []
    console.log(JSON.stringify(tools.map((t) => ({ name: t.name, description: (t.description || '').slice(0, 160), input: t.inputSchema })), null, 1))
  } else if (callTool) {
    const r = await send('tools/call', { name: callTool, arguments: callArgs })
    const text = (r && r.content || []).map((c) => c.text || '').join('\n')
    const payload = text || JSON.stringify(r)
    if (outFile) { writeFileSync(outFile, payload); console.log('WROTE ' + outFile + ' (' + payload.length + ' bytes)') }
    else console.log(payload)
  }
} catch (e) {
  console.error('ERR', e.message)
  if (errors.length) console.error('JAVA STDERR:', errors.join('').slice(-2000))
  process.exitCode = 1
} finally {
  clearTimeout(timer)
  child.stdin.end()
  setTimeout(() => child.kill('SIGKILL'), 500)
}
