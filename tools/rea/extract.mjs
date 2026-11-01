#!/usr/bin/env node
/**
 * 极简排班 APK 深度代码提取（REA 依赖的 jadx-headless-mcp 引擎，常驻单会话）
 * 产出：类清单 / 每类成员清单 / 每个顶层类的反编译源码 / 交叉引用 / 资源字符串
 */
import { spawn } from 'node:child_process'
import { writeFileSync, mkdirSync } from 'node:fs'
import { fileURLToPath } from 'node:url'
import { dirname, join, resolve } from 'node:path'

const here = dirname(fileURLToPath(import.meta.url))
const args = process.argv.slice(2)
function arg(n, d) { const i = args.indexOf('--' + n); return i >= 0 ? args[i + 1] : d }
const APK = arg('apk', '/Users/hogar/.dsh/ungrouped/jianyun/app.apk')
const OUT = resolve(arg('out', '/Users/hogar/.dsh/ungrouped/jianyun/analysis/rea'))
const JAR = join(here, 'jadx-headless-mcp-0.7.1-all.jar')
mkdirSync(join(OUT, 'inventories'), { recursive: true })
mkdirSync(join(OUT, 'source'), { recursive: true })
mkdirSync(join(OUT, 'xrefs'), { recursive: true })
mkdirSync(join(OUT, 'raw'), { recursive: true })

const child = spawn('java', ['-Xmx6g', '-jar', JAR, '--transport', 'stdio', '--apk', APK], { stdio: ['pipe', 'pipe', 'pipe'] })
let buf = '', id = 0
const pending = new Map(), stderrBuf = []
child.stdout.on('data', (d) => {
  buf += d.toString('utf8')
  let i
  while ((i = buf.indexOf('\n')) >= 0) {
    const line = buf.slice(0, i).trim(); buf = buf.slice(i + 1)
    if (!line) continue
    let m; try { m = JSON.parse(line) } catch { continue }
    if (m.id && pending.has(m.id)) { const p = pending.get(m.id); pending.delete(m.id); m.error ? p.reject(new Error(JSON.stringify(m.error))) : p.resolve(m.result) }
  }
})
child.stderr.on('data', (d) => stderrBuf.push(d.toString('utf8')))
function send(method, params, notify = false) {
  const msg = { jsonrpc: '2.0', method, ...(params ? { params } : {}) }
  if (!notify) { id += 1; msg.id = id }
  child.stdin.write(JSON.stringify(msg) + '\n')
  return notify ? Promise.resolve() : new Promise((res, rej) => pending.set(msg.id, { resolve: res, reject: rej }))
}
async function call(tool, a = {}) {
  const r = await send('tools/call', { name: tool, arguments: a })
  const c = (r && r.content) || []
  return c.map((x) => x.text || '').join('\n')
}
const safe = (s) => String(s).replace(/[^A-Za-z0-9._$-]/g, '_')
const sleep = (ms) => new Promise((r) => setTimeout(r, ms))

await send('initialize', { protocolVersion: '2025-06-18', capabilities: {}, clientInfo: { name: 'dsh-extract', version: '1.0.0' } })
await send('notifications/initialized', null, true)
const t0 = Date.now()
const stats = { total: 0, summary_ok: 0, source_ok: 0, source_failed: [], smali_fallback: [], skipped: [] }

try {
  const appInfo = await call('get_app_info'); writeFileSync(join(OUT, 'app-info.json'), appInfo)
  const manifest = await call('get_android_manifest', { max_bytes: 600000 }); writeFileSync(join(OUT, 'AndroidManifest.xml'), manifest)
  const mainAct = await call('get_main_activity_class'); writeFileSync(join(OUT, 'main-activity.txt'), mainAct)
  const classesRaw = await call('get_main_application_classes_names')
  writeFileSync(join(OUT, 'raw', 'app-classes.raw.json'), classesRaw)
  let classes = []
  try { classes = JSON.parse(classesRaw).items || [] } catch { classes = classesRaw.split('\n').map((s) => s.trim()).filter(Boolean) }
  stats.total = classes.length
  writeFileSync(join(OUT, 'classes-app.json'), JSON.stringify(classes, null, 1))
  console.log('app classes:', classes.length)

  const SKIP_SOURCE = (c) => c.endsWith('.R') || c.endsWith('.BuildConfig') || c.includes('$')
  const summaries = []
  for (let i = 0; i < classes.length; i++) {
    const cls = classes[i]
    try {
      const summary = await call('get_class_summary', { class_name: cls })
      writeFileSync(join(OUT, 'inventories', safe(cls) + '.json'), summary)
      summaries.push({ class: cls, summary })
      stats.summary_ok++
    } catch (e) { stats.source_failed.push(cls + ' :: summary: ' + e.message) }
    if (!SKIP_SOURCE(cls)) {
      try {
        const src = await call('get_class_source', { class_name: cls, max_bytes: 400000 })
        if (src && src.trim().length > 40) { writeFileSync(join(OUT, 'source', safe(cls) + '.java'), src); stats.source_ok++ }
        else { stats.source_failed.push(cls + ' :: empty source'); }
      } catch (e) {
        stats.source_failed.push(cls + ' :: ' + e.message)
        try {
          const smali = await call('get_smali_of_class', { class_name: cls })
          writeFileSync(join(OUT, 'source', safe(cls) + '.smali'), smali)
          stats.smali_fallback.push(cls)
        } catch (e2) { stats.smali_fallback.push(cls + ' :: smali failed') }
      }
    } else stats.skipped.push(cls)
    if (i % 25 === 0 || i === classes.length - 1) console.log('[' + (i + 1) + '/' + classes.length + '] ' + cls + ' (' + ((Date.now() - t0) / 1000).toFixed(0) + 's)')
  }
  writeFileSync(join(OUT, 'raw', 'summaries.jsonl'), summaries.map((s) => JSON.stringify(s)).join('\n'))

  // 交叉引用：UI / 导航 / 数据层关键节点
  const xrefTargets = [
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.main.MainActivityKt' }, name: 'MainActivityKt' },
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt' }, name: 'ScheduleMainViewKt' },
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt' }, name: 'ScheduleHomeViewKt' },
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.ui.component.nav.HeaderViewKt' }, name: 'HeaderViewKt' },
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.hilt.respo.BaseRepository' }, name: 'BaseRepository' },
    { tool: 'get_xrefs_to_class', args: { class_name: 'cn.jianyun.workplan.main.Router' }, name: 'Router' },
    { tool: 'get_xrefs_to_method', args: { class_name: 'cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt', method_name: 'ScheduleMainView' }, name: 'ScheduleMainView' },
    { tool: 'get_xrefs_to_method', args: { class_name: 'cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt', method_name: 'ScheduleHomeView' }, name: 'ScheduleHomeView' },
    { tool: 'get_xrefs_to_method', args: { class_name: 'cn.jianyun.workplan.ui.component.nav.HeaderViewKt', method_name: 'PageView' }, name: 'PageView' },
  ]
  for (const t of xrefTargets) {
    try {
      const r = await call(t.tool, t.args)
      writeFileSync(join(OUT, 'xrefs', safe(t.name) + '.json'), r)
      console.log('xref OK', t.name, r.length + 'B')
    } catch (e) { writeFileSync(join(OUT, 'xrefs', safe(t.name) + '.error.txt'), e.message); console.log('xref FAIL', t.name) }
  }
  // 资源字符串
  try {
    const strs = await call('get_strings', {})
    writeFileSync(join(OUT, 'raw', 'strings.json'), strs)
  } catch (e) {}
  writeFileSync(join(OUT, 'stats.json'), JSON.stringify(stats, null, 1))
  console.log('DONE', JSON.stringify({ ...stats, source_failed: stats.source_failed.length, smali_fallback: stats.smali_fallback.length, skipped: stats.skipped.length }))
} catch (e) {
  console.error('FATAL', e.message)
  process.exitCode = 1
} finally {
  child.stdin.end(); setTimeout(() => child.kill('SIGKILL'), 300)
}
