#!/usr/bin/env node
/**
 * 轻量 SFC 语法检查（不依赖完整构建，可多人并行调用）
 * 用法: node tools/check-sfc.mjs src/pages/work/index.vue ...
 */
import { readFileSync, readdirSync, statSync } from 'node:fs'
import { join, resolve } from 'node:path'
import { parse, compileScript, compileTemplate } from 'vue/compiler-sfc'

const targets = process.argv.slice(2)
if (!targets.length) {
  console.error('用法: node tools/check-sfc.mjs <file.vue|dir> [...]')
  process.exit(1)
}

function walk(p, out) {
  const st = statSync(p)
  if (st.isDirectory()) {
    for (const f of readdirSync(p)) walk(join(p, f), out)
  } else if (p.endsWith('.vue')) out.push(p)
}
const files = []
targets.forEach((t) => walk(resolve(t), files))

let failed = 0
for (const file of files) {
  const src = readFileSync(file, 'utf8')
  try {
    const { descriptor, errors } = parse(src, { filename: file })
    if (errors.length) throw errors[0]
    if (descriptor.script || descriptor.scriptSetup) {
      compileScript(descriptor, { id: 'check' })
    }
    if (descriptor.template) {
      const r = compileTemplate({
        source: descriptor.template.content,
        filename: file,
        id: 'check',
        compilerOptions: {}
      })
      if (r.errors && r.errors.length) throw r.errors[0]
    }
    console.log('OK   ' + file.replace(process.cwd() + '/', ''))
  } catch (e) {
    failed += 1
    console.error('FAIL ' + file.replace(process.cwd() + '/', ''))
    console.error('     ' + (e && e.message ? e.message : String(e)))
  }
}
console.log('\n检查 ' + files.length + ' 个文件，失败 ' + failed + ' 个')
process.exit(failed ? 1 : 0)
