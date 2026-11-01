#!/usr/bin/env node
/**
 * 常驻 JADX MCP 计划执行器：一次加载 APK，按 JSON 计划批量调用工具并落盘。
 * 用法: node plan-runner.mjs --apk <apk> --plan <plan.json> [--outdir <dir>]
 */
import { spawn } from 'node:child_process'
import { readFileSync, writeFileSync, mkdirSync } from 'node:fs'
import { fileURLToPath } from 'node:url'
import { dirname, join, resolve } from 'node:path'

const here = dirname(fileURLToPath(import.meta.url))
const args = process.argv.slice(2)
function arg(name, def) { const i = args.indexOf('--' + name); return i >= 0 ? args[i + 1] : def }
const JAR = arg('jar', join(here, 'jadx-headless-mcp-0.7.1-all.jar'))
const APK = arg('apk', '')
const PLAN = arg('plan', '')
const OUTDIR = resolve(arg('outdir', join(here, 'out')))
const MAX_MS = Number(arg('timeout', '3600000'))
mkdirSync(OUTDIR, { recursive: true })
const plan = JSON.parse(readFileSync(PLAN, 'utf8'))

const child = spawn('java', ['-Xmx6g', '-jar', JAR, '--transport', 'stdio', ...(APK ? ['--apk', APK] : [])], { stdio: ['pipe', 'pipe', 'pipe'] })
let buf = '', id = 0
const pending = new Map()
const stderrBuf = []
child.stdout.on('data', (d) => {
  buf += d.toString('utf8')
  let i
  while ((i = buf.indexOf('\n')) >= 0) {
    const line = buf.slice(0, i).trim(); buf = buf.slice(i + 1)
    if (!line) continue
    let msg; try { msg = JSON.parse(line) } catch { continue }
    if (msg.id && pending.has(msg.id)) { const p = pending.get(msg.id); pending.delete(msg.id); msg.error ? p.reject(new Error(JSON.stringify(msg.error))) : p.resolve(msg.result) }
  }
})
child.stderr.on('data', (d) => stderrBuf.push(d.toString('utf8')))
function send(method, params, notify = false) {
  const m = { jsonrpc: '2.0', method, ...(params ? { params } : {}) }
  if (!notify) { id += 1; m.id = id }
  child.stdin.write(JSON.stringify(m) + '\n')
  return notify ? Promise.resolve(null) : new Promise((res, rej) => pending.set(m.id, { resolve: res, reject: rej }))
}
const deadline = setTimeout(() => { console.error('TIMEOUT'); child.kill('SIGKILL'); process.exit(2) }, MAX_MS)
function safeName(s) { return String(s).replace(/[^A-Za-z0-9._$-]/g, '_') }
try {
  await send('initialize', { protocolVersion: '2025-06-18', capabilities: {}, clientInfo: { name: 'dsh-batch', version: '1.0.0' } })
  await send('notifications/initialized', null, true)
  const t0 = Date.now()
  for (const step of plan) {
    const tool = step.tool || step.name
    const a = step.args || {}
    const label = tool + (step.label ? ' [' + step.label + ']' : '')
    const r = await send('tools/call', { name: tool, arguments: a })
    const text = (r && r.content || []).map((c) => c.text || '').join('\n')
    const payload = text || JSON.stringify(r)
    let outFile = ''
    if (step.out) {
      outFile = join(OUTDIR, step.out.replace(/\{([^}]+)\}/g, (_, k) => safeName(a[k] !== undefined ? a[k] : step[k] || '')))
      mkdirSync(dirname(outFile), { recursive: true })
      writeFileSync(outFile, payload)
    }
    if (step.echo !== false) console.log('OK ' + label + (outFile ? ' -> ' + outFile : '') + ' (' + payload.length + 'B, ' + (Date.now() - t0) + 'ms)')
  }
  clearTimeout(deadline)
} catch (e) {
  console.error('ERR ' + e.message)
  if (stderrBuf.length) console.error('JAVA STDERR: ' + stderrBuf.join('').slice(-1500))
  process.exitCode = 1
} finally {
  child.stdin.end(); setTimeout(() => child.kill('SIGKILL'), 300)
}
