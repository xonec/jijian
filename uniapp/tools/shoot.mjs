#!/usr/bin/env node
/**
 * 通过 Chrome DevTools Protocol 截图 / 交互验证（uni-app H5）
 * 前置：Chrome 以 --remote-debugging-port=9222 启动
 * 用法：
 *   node tools/shoot.mjs --url "http://127.0.0.1:5273/?theme=dark#/pages/home/index" --out shots/home.png
 *   node tools/shoot.mjs --url "..." --out shots/x.png --actions '[{"type":"click","selector":".header__icon"},{"type":"wait","ms":500}]'
 */
const args = process.argv.slice(2)
function arg(name, def) {
  const i = args.indexOf('--' + name)
  return i >= 0 ? args[i + 1] : def
}
const url = arg('url')
const out = arg('out')
const theme = arg('theme', '')
const width = Number(arg('width', 390))
const height = Number(arg('height', 844))
const scale = Number(arg('scale', 2))
const actionsFile = arg('actions-file', '')
const actionsJson = arg('actions', '[]')
const extraWait = Number(arg('wait', 1200))
if (!url || !out) {
  console.error('用法: node tools/shoot.mjs --url <URL> --out <PNG> [--actions JSON]')
  process.exit(1)
}

const fs = await import('node:fs')
const actions = actionsFile ? JSON.parse(fs.readFileSync(actionsFile, 'utf8')) : JSON.parse(actionsJson)

async function newTarget() {
  const res = await fetch('http://127.0.0.1:9222/json/new?about:blank', { method: 'PUT' })
  if (!res.ok) throw new Error('创建 target 失败: ' + res.status)
  return res.json()
}

const target = await newTarget()
const ws = new WebSocket(target.webSocketDebuggerUrl)
let id = 0
const pending = new Map()
const events = []
function send(method, params = {}) {
  return new Promise((resolve, reject) => {
    const mid = ++id
    pending.set(mid, { resolve, reject })
    ws.send(JSON.stringify({ id: mid, method, params }))
  })
}
ws.addEventListener('message', (ev) => {
  let data
  try {
    data = JSON.parse(ev.data)
  } catch (e) {
    return
  }
  if (data.id && pending.has(data.id)) {
    const p = pending.get(data.id)
    pending.delete(data.id)
    if (data.error) p.reject(new Error(JSON.stringify(data.error)))
    else p.resolve(data.result)
  } else if (data.method) {
    events.push(data)
  }
})
const sleep = (ms) => new Promise((r) => setTimeout(r, ms))

ws.addEventListener('open', async () => {
  try {
    await send('Page.enable')
    await send('Runtime.enable')
    await send('Emulation.setDeviceMetricsOverride', {
      width,
      height,
      deviceScaleFactor: scale,
      mobile: true
    })
    await send('Page.navigate', { url })
    await sleep(800)
    for (const a of actions) {
      if (a.type === 'wait') await sleep(a.ms || 400)
      if (a.type === 'click') {
        const expr = a.index
          ? 'document.querySelectorAll(' + JSON.stringify(a.selector) + ')[' + a.index + '].click()'
          : '(document.querySelector(' + JSON.stringify(a.selector) + ')||{click(){}}).click()'
        await send('Runtime.evaluate', { expression: expr })
      }
      if (a.type === 'eval') {
        const r = await send('Runtime.evaluate', { expression: a.js, awaitPromise: true, returnByValue: true })
        console.log('EVAL', (r && r.result && r.result.value !== undefined ? r.result.value : JSON.stringify(r && r.result)))
      }
    }
    await sleep(extraWait)
    const shot = await send('Page.captureScreenshot', { format: 'png', captureBeyondViewport: false })
    fs.writeFileSync(out, Buffer.from(shot.data, 'base64'))
    const errs = events
      .filter((e) => e.method === 'Runtime.exceptionThrown')
      .map((e) => e.params.exceptionDetails.text + ' ' + (e.params.exceptionDetails.exception && e.params.exceptionDetails.exception.description))
    console.log('OK ' + out + (errs.length ? '  JS_ERRORS: ' + JSON.stringify(errs).slice(0, 500) : ''))
    await fetch('http://127.0.0.1:9222/json/close/' + target.id)
  } catch (e) {
    console.error('FAIL', e.message)
    process.exitCode = 1
  } finally {
    ws.close()
  }
})
ws.addEventListener('error', (e) => {
  // 正常关闭时也会触发 error 事件（Chromium headless），忽略
})
