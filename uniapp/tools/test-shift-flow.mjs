#!/usr/bin/env node
/** 班次添加/编辑回归测试（CDP）：验证新增、编辑、表单重置、持久化 */
import fs from 'node:fs'
const BASE = process.argv[2] || 'http://127.0.0.1:5280'
const CDP = 'http://127.0.0.1:9222'
const sleep = (ms) => new Promise((r) => setTimeout(r, ms))
async function newTarget() {
  const res = await fetch(CDP + '/json/new?about:blank', { method: 'PUT' })
  return res.json()
}
const target = await newTarget()
const ws = new WebSocket(target.webSocketDebuggerUrl)
let id = 0
const pending = new Map()
function send(method, params = {}) {
  return new Promise((resolve, reject) => {
    const mid = ++id
    pending.set(mid, { resolve, reject })
    ws.send(JSON.stringify({ id: mid, method, params }))
  })
}
ws.addEventListener('message', (ev) => {
  let d; try { d = JSON.parse(ev.data) } catch (e) { return }
  if (d.id && pending.has(d.id)) {
    const p = pending.get(d.id); pending.delete(d.id)
    d.error ? p.reject(new Error(JSON.stringify(d.error))) : p.resolve(d.result)
  }
})
await new Promise((r, j) => { ws.addEventListener('open', r); ws.addEventListener('error', j) })
await send('Page.enable'); await send('Runtime.enable')
await send('Emulation.setDeviceMetricsOverride', { width: 411, height: 914, deviceScaleFactor: 2, mobile: true })
async function evaluate(expression) {
  const r = await send('Runtime.evaluate', { expression, returnByValue: true, awaitPromise: true })
  return r.result && r.result.value
}
async function waitText(needle, timeout = 8000) {
  const start = Date.now()
  while (Date.now() - start < timeout) {
    const ok = await evaluate(`document.body.innerText.indexOf(${JSON.stringify(needle)}) >= 0`)
    if (ok) return true
    await sleep(200)
  }
  return false
}
const results = []
function check(name, ok, detail) { results.push({ name, ok: !!ok, detail }); console.log((ok ? 'PASS ' : 'FAIL ') + name + (detail ? ' | ' + detail : '')) }

await send('Page.navigate', { url: BASE + '/?theme=light#/pages/work/index' })
await sleep(1500)
await evaluate("localStorage.setItem('jy_privacy_agreed','true')")

// 1. 进入添加班次
await evaluate(`(() => { const els=[...document.querySelectorAll('*')]; const el=els.find(n=>n.textContent.trim()==='添加班次'); if(el){el.click();return true} return false })()`)
await sleep(1000)
check('进入添加页', await waitText('添加班次') && (await evaluate('document.body.innerText.indexOf("班次名称")>=0')))

// 2. 填名称并保存
const setInput = (value) => evaluate(`(() => { const i=document.querySelector('input'); if(!i) return false; i.value=${JSON.stringify(value)}; i.dispatchEvent(new Event('input',{bubbles:true})); return true })()`)
check('填写名称', await setInput('测试班次'))
await evaluate(`(() => { const els=[...document.querySelectorAll('*')]; const el=els.filter(n=>n.textContent.trim()==='保存').pop(); if(el){el.click();return true} return false })()`)
await sleep(1200)
const listText1 = await evaluate('document.body.innerText')
const rows1 = await evaluate(`document.querySelectorAll('.shift-row').length`)
check('新增后列表含新班次', listText1.includes('测试班次'), 'rows=' + rows1)
check('新增后行数=4', rows1 === 4, 'actual=' + rows1)

// 3. 点新班次进入编辑
await evaluate(`(() => { const rows=[...document.querySelectorAll('.shift-row')]; const row=rows.find(r=>r.textContent.indexOf('测试班次')>=0); if(row){row.click();return true} return false })()`)
await sleep(1000)
const editTitle = await evaluate('document.body.innerText.slice(0,40)')
const inputVal = await evaluate(`(() => { const i=document.querySelector('input'); return i ? i.value : '' })()`)
check('进入编辑页', editTitle.includes('编辑班次'), editTitle.replace(/\n/g,' '))
check('编辑回填名称', inputVal === '测试班次', 'value=' + inputVal)

// 4. 改名保存
await setInput('测试班次2')
await evaluate(`(() => { const els=[...document.querySelectorAll('*')]; const el=els.filter(n=>n.textContent.trim()==='保存').pop(); if(el){el.click();return true} return false })()`)
await sleep(1200)
const listText2 = await evaluate('document.body.innerText')
const rows2 = await evaluate(`document.querySelectorAll('.shift-row').length`)
check('编辑后名称更新', listText2.includes('测试班次2') && !/测试班次(?!2)/.test(listText2.replace(/测试班次2/g,'')), '')
check('编辑后不重复新增', rows2 === 4, 'actual=' + rows2)

// 5. 再点添加，验证表单已重置
await evaluate(`(() => { const els=[...document.querySelectorAll('*')]; const el=els.find(n=>n.textContent.trim()==='添加班次'); if(el){el.click();return true} return false })()`)
await sleep(1000)
const addVal = await evaluate(`(() => { const i=document.querySelector('input'); return i ? i.value : 'NOINPUT' })()`)
check('再添加时表单已重置', addVal === '', 'value=' + JSON.stringify(addVal))

// 6. 刷新页面验证持久化
await send('Page.navigate', { url: BASE + '/?theme=light#/pages/work/index' })
await sleep(1600)
const persisted = await evaluate('document.body.innerText')
check('刷新后数据持久化', persisted.includes('测试班次2'))

const failed = results.filter((r) => !r.ok)
console.log('\n结果: ' + (results.length - failed.length) + '/' + results.length + ' 通过')
await fetch(CDP + '/json/close/' + target.id)
ws.close()
process.exit(failed.length ? 1 : 0)
