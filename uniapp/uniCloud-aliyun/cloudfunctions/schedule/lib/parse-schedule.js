'use strict'
const XLSX = require('xlsx')

const PROCESS_ALIASES = ['工序名称', '工序', '工序名']
const BATCH_ALIASES = ['批次', '批次号', '生产批次']
const REMARK_ALIASES = ['备注', '说明']
const DATE_ALIASES = ['排班日期', '日期']
const SHIFT_ALIASES = { '早班': 'early', '中班': 'mid', '晚班': 'late', '夜班': 'night' }

function trim(v) { return String(v == null ? '' : v).replace(/\u00a0/g, ' ').trim() }
function norm(v) { return trim(v).replace(/\s+/g, '') }

function parseCsv(text) {
  const rows = []
  let row = []
  let cell = ''
  let quoted = false
  for (let i = 0; i < text.length; i += 1) {
    const ch = text[i]
    if (quoted) {
      if (ch === '"') {
        if (text[i + 1] === '"') { cell += '"'; i += 1 } else quoted = false
      } else cell += ch
    } else if (ch === '"') quoted = true
    else if (ch === ',') { row.push(cell); cell = '' }
    else if (ch === '\n') { row.push(cell); rows.push(row); row = []; cell = '' }
    else if (ch === '\r') { /* skip */ }
    else cell += ch
  }
  row.push(cell)
  if (row.some((v) => trim(v))) rows.push(row)
  return rows
}

function formatDate(v) {
  if (v == null || v === '') return ''
  if (v instanceof Date && !isNaN(v.getTime())) {
    return v.getFullYear() + '-' + String(v.getMonth() + 1).padStart(2, '0') + '-' + String(v.getDate()).padStart(2, '0')
  }
  if (typeof v === 'number' && v > 20000 && v < 80000) {
    const d = XLSX.SSF.parse_date_code(v)
    if (d) return d.y + '-' + String(d.m).padStart(2, '0') + '-' + String(d.d).padStart(2, '0')
  }
  const s = trim(v)
  const m = s.match(/^(\d{4})\D+(\d{1,2})\D+(\d{1,2})/)
  if (m) return m[1] + '-' + String(m[2]).padStart(2, '0') + '-' + String(m[3]).padStart(2, '0')
  return ''
}

function splitNames(v) {
  return trim(v).split(/[,，、;；\n]+/).map((x) => trim(x)).filter(Boolean)
}

function detect12(remark) {
  const s = String(remark || '').toLowerCase()
  if (/12\s*点/.test(s) && !/12\s*(小时|h)/.test(s)) return false
  return /12\s*小时/.test(s) || /(^|[^0-9a-z])12\s*h([^0-9a-z]|$)/.test(s)
}

/**
 * 解析 12 小时制：
 * - 备注开头/没有点名人员：整行 12 小时
 * - “张三、李四12小时”：只点名人员 12 小时
 * - “12点上班”：不是 12 小时制
 */
function resolve12(remark, rowNames) {
  const raw = String(remark || '')
  const lower = raw.toLowerCase()
  const matches = []
  const re = /12\s*(?:小时|h(?![0-9a-z]))/gi
  let m
  while ((m = re.exec(lower))) matches.push(m.index)
  if (!matches.length) return { all: false, names: [] }
  const specific = new Set()
  let all = false
  for (const idx of matches) {
    const prefix = raw.slice(0, idx)
    const clause = prefix.split(/[,，;；。\n]/).pop().replace(/\s+/g, '')
    const tokens = clause.split('、')
    const named = rowNames.filter((n) => tokens.includes(n))
    if (named.length) named.forEach((n) => specific.add(n))
    else all = true
  }
  return { all, names: Array.from(specific) }
}

function rowTypeOf(process) {
  const s = norm(process)
  if (s === '请假') return 'leave'
  if (s === '休息') return 'rest'
  return 'work'
}

function findHeader(rows) {
  for (let i = 0; i < Math.min(rows.length, 12); i += 1) {
    const cells = (rows[i] || []).map(norm)
    const hasProcess = cells.some((c) => PROCESS_ALIASES.includes(c))
    const hasShift = cells.some((c) => SHIFT_ALIASES[c])
    if (hasProcess && (hasShift || cells.some((c) => DATE_ALIASES.includes(c)))) {
      const map = { process: -1, batch: -1, remark: -1, date: -1, shifts: [] }
      cells.forEach((c, idx) => {
        if (PROCESS_ALIASES.includes(c)) map.process = idx
        else if (BATCH_ALIASES.includes(c)) map.batch = idx
        else if (REMARK_ALIASES.includes(c)) map.remark = idx
        else if (DATE_ALIASES.includes(c)) map.date = idx
        else if (SHIFT_ALIASES[c]) map.shifts.push({ index: idx, name: c, code: SHIFT_ALIASES[c] })
      })
      if (map.process >= 0) return { headerIndex: i, map }
    }
  }
  throw new Error('未找到表头：需要“工序名称”和至少一个班次列或“排班日期”')
}

function parseRows(rows, options) {
  const { headerIndex, map } = findHeader(rows)
  const selectedDate = formatDate(options.selectedDate)
  const entries = []
  const warnings = []
  const allNames = new Set()
  let detectedDate = ''

  for (let i = headerIndex + 1; i < rows.length; i += 1) {
    const row = rows[i] || []
    const process = trim(row[map.process])
    const shiftCells = map.shifts.map((sh) => ({ ...sh, names: splitNames(row[sh.index]) }))
    const hasAny = process || shiftCells.some((s) => s.names.length)
    if (!hasAny) continue

    const rowDate = map.date >= 0 ? formatDate(row[map.date]) : ''
    if (rowDate) {
      if (!detectedDate) detectedDate = rowDate
      else if (rowDate !== detectedDate) warnings.push({ code: 'mixed_date', row: i + 1, message: '同一文件中出现多个日期：' + detectedDate + ' / ' + rowDate })
    }
    if (!process) {
      warnings.push({ code: 'empty_process', row: i + 1, message: '工序名称为空，已跳过' })
      continue
    }

    const batchNo = map.batch >= 0 ? trim(row[map.batch]) : ''
    const remark = map.remark >= 0 ? trim(row[map.remark]) : ''
    const rowType = rowTypeOf(process)
    const rowNames = Array.from(new Set(shiftCells.flatMap((s) => s.names)))
    rowNames.forEach((n) => allNames.add(n))
    const twelve = resolve12(remark, rowNames)
    const mentions12 = twelve.all || twelve.names.length > 0
    const mentionedNames = twelve.names
    const assignments = []
    for (const sh of shiftCells) {
      for (const name of sh.names) {
        let workHours = 8
        let workSystem = '8h'
        if (mentions12 && (twelve.all || mentionedNames.includes(name))) {
          workHours = 12
          workSystem = '12h'
        }
        assignments.push({
          shiftName: sh.name,
          shiftCode: sh.code,
          employeeName: name,
          workHours,
          workSystem,
          sourceRow: i + 1
        })
      }
    }
    if (!assignments.length && rowType === 'work') {
      warnings.push({ code: 'empty_shift', row: i + 1, process, message: '工序没有排班人员' })
    }
    const flat = shiftCells.flatMap((s) => s.names)
    const dupInRow = rowNames.filter((n) => flat.filter((x) => x === n).length > 1)
    if (dupInRow.length) warnings.push({ code: 'duplicate_name_in_row', row: i + 1, process, names: dupInRow, message: '同一行同一人员出现多次' })
    entries.push({ processName: process, batchNo, remark, rowType, sort: entries.length, assignments })
  }

  if (!entries.length) throw new Error('文件中没有可导入的排班行')
  if (detectedDate && selectedDate && detectedDate !== selectedDate) {
    throw new Error('文件日期 ' + detectedDate + ' 与选择的日期 ' + selectedDate + ' 不一致')
  }
  return { headerIndex, map, entries, warnings, names: Array.from(allNames), detectedDate: detectedDate || selectedDate }
}

function parseScheduleFile(input) {
  const { base64, fileName, selectedDate } = input || {}
  if (!base64) throw new Error('缺少文件内容')
  const buf = Buffer.from(base64, 'base64')
  const ext = String(fileName || '').toLowerCase()
  const isCsv = ext.endsWith('.csv') || (!ext.endsWith('.xlsx') && !ext.endsWith('.xls') && buf[0] !== 0x50)
  let rows
  let sheetName = ''
  let sourceType = 'xlsx'
  if (isCsv) {
    sourceType = 'csv'
    rows = parseCsv(buf.toString('utf8').replace(/^\ufeff/, ''))
  } else {
    const wb = XLSX.read(buf, { type: 'buffer', cellDates: true })
    const preferred = wb.SheetNames.find((n) => n.trim() === '排班') || wb.SheetNames[0]
    sheetName = preferred
    rows = XLSX.utils.sheet_to_json(wb.Sheets[preferred], { header: 1, raw: false, defval: '', blankrows: false })
  }
  const parsed = parseRows(rows, { selectedDate })
  const date = formatDate(parsed.detectedDate || selectedDate)
  if (!date) throw new Error('无法确定排班日期')
  return {
    sourceType,
    sheetName,
    date,
    entries: parsed.entries,
    warnings: parsed.warnings,
    employeeNames: parsed.names,
    counts: {
      rows: parsed.entries.length,
      assignments: parsed.entries.reduce((n, e) => n + e.assignments.length, 0),
      people: parsed.names.length
    }
  }
}

module.exports = { parseScheduleFile, formatDate, detect12, resolve12, splitNames }
