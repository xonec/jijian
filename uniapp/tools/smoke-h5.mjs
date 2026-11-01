#!/usr/bin/env node
/**
 * H5 冒烟测试：逐页打开 23 个路由，收集 JS 异常 / console.error / 关键文本。
 * 前置：静态服务器 5280 + Chrome CDP 9222（与 shoot.mjs 相同）。
 * 用法：node tools/smoke-h5.mjs [--out ../../analysis/qa/smoke-report.json]
 */
import fs from 'node:fs'
import path from 'node:path'

const args = process.argv.slice(2)
function arg(name, def) {
  const i = args.indexOf('--' + name)
  return i >= 0 ? args[i + 1] : def
}
const OUT = path.resolve(process.cwd(), arg('out', '../analysis/qa/smoke-report.json'))
const BASE = arg('base', 'http://127.0.0.1:5280')
const CDP = arg('cdp', 'http://127.0.0.1:9222')

const pagesJson = fs.readFileSync(new URL('../src/pages.json', import.meta.url), 'utf8')
const routes = [...pagesJson.matchAll(/"path"\s*:\s*"([^"]+)"/g)].map((m) => m[1])

async function newTarget() {
  const res = await fetch(CDP + '/json/new?about:blank', { method: 'PUT' })
  if (!res.ok) throw new Error('创建 target 失败: ' + res.status)
  return res.json()
}
function sleep(ms) { return new Promise((r) => setTimeout(r, ms)) }

async function runPage(route) {
  const target = await newTarget()
  const ws = new WebSocket(target.webSocketDebuggerUrl)
  let id = 0
  const pending = new Map()
  const errors = []
  function send(method, params = {}) {
    return new Promise((resolve, reject) => {
      const mid = ++id
      pending.set(mid, { resolve, reject })
      ws.send(JSON.stringify({ id: mid, method, params }))
    })
  }
  ws.addEventListener('message', (ev) => {
    let data
    try { data = JSON.parse(ev.data) } catch (e) { return }
    if (data.id && pending.has(data.id)) {
      const p = pending.get(data.id)
      pending.delete(data.id)
      if (data.error) p.reject(new Error(JSON.stringify(data.error)))
      else p.resolve(data.result)
    } else if (data.method === 'Runtime.exceptionThrown') {
      const d = data.params.exceptionDetails || {}
      errors.push('exception: ' + (d.text || '') + ' ' + ((d.exception && d.exception.description) || ''))
    } else if (data.method === 'Runtime.consoleAPICalled' && data.params.type === 'error') {
      errors.push('console.error: ' + (data.params.args || []).map((a) => a.value || a.description || '').join(' '))
    }
  })
  await new Promise((resolve, reject) => {
    ws.addEventListener('open', resolve)
    ws.addEventListener('error', reject)
  })
  await send('Page.enable')
  await send('Runtime.enable')
  await send('Emulation.setDeviceMetricsOverride', { width: 411, height: 914, deviceScaleFactor: 2, mobile: true })
  await send('Page.navigate', { url: BASE + '/?theme=light#/' + route })
  await sleep(1400)
  const r = await send('Runtime.evaluate', {
    expression: 'JSON.stringify({len: document.body.innerText.length, text: document.body.innerText.slice(0,120), title: document.title})',
    returnByValue: true
  })
  let info = { len: 0, text: '', title: '' }
  try { info = JSON.parse(r.result.value) } catch (e) {}
  await fetch(CDP + '/json/close/' + target.id)
  ws.close()
  return { route, ok: errors.length === 0 && info.len > 20, errors, ...info }
}

// 预置 localStorage（隐私协议/主题），一次即可
const warm = await newTarget()
const wws = new WebSocket(warm.webSocketDebuggerUrl)
await new Promise((resolve) => wws.addEventListener('open', resolve))
let wid = 0
function wsend(method, params = {}) {
  return new Promise((resolve) => {
    const mid = ++wid
    function onMsg(ev) {
      const d = JSON.parse(ev.data)
      if (d.id === mid) { wws.removeEventListener('message', onMsg); resolve(d.result) }
    }
    wws.addEventListener('message', onMsg)
    wws.send(JSON.stringify({ id: mid, method, params }))
  })
}
await wsend('Page.enable')
await wsend('Runtime.enable')
await wsend('Page.navigate', { url: BASE + '/' })
await sleep(1200)
await wsend('Runtime.evaluate', { expression: "localStorage.setItem('jy_privacy_agreed','true');localStorage.setItem('jy_theme_mode','light')" })
await fetch(CDP + '/json/close/' + warm.id)
wws.close()

const results = []
for (const route of routes) {
  process.stdout.write('· ' + route + ' ... ')
  try {
    const r = await runPage(route)
    results.push(r)
    console.log(r.ok ? 'OK' : 'FAIL' + (r.errors.length ? ' | ' + r.errors.join(' ; ').slice(0, 120) : ''))
  } catch (e) {
    results.push({ route, ok: false, errors: [String(e)], len: 0, text: '' })
    console.log('ERROR ' + e.message)
  }
}

const failed = results.filter((r) => !r.ok)
const report = {
  generatedAt: new Date().toISOString(),
  base: BASE,
  total: results.length,
  passed: results.length - failed.length,
  failed: failed.length,
  pages: results
}
fs.mkdirSync(path.dirname(OUT), { recursive: true })
fs.writeFileSync(OUT, JSON.stringify(report, null, 2))
console.log('\n结果: ' + report.passed + '/' + report.total + ' 通过，' + report.failed + ' 失败')
console.log('报告: ' + OUT)
process.exit(report.failed ? 1 : 0)
