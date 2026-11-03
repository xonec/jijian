'use strict'
const uniIdCommon = require('uni-id-common')
const crypto = require('crypto')
const db = uniCloud.database()
const _ = db.command
const { parseScheduleFile } = require('./lib/parse-schedule')

const C = {
  company: 'jy_company',
  companyMember: 'jy_company_member',
  department: 'jy_department',
  employee: 'jy_employee',
  plan: 'jy_schedule_plan',
  audit: 'jy_schedule_audit'
}
const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })
const now = () => new Date()
const trim = (v, n) => String(v == null ? '' : v).trim().slice(0, n || 200)

async function getUid(event, context) {
  const token = event.uniIdToken || event.token || ''
  if (!token) return ''
  let info = {}
  try { info = (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {} } catch (e) { info = {} }
  const c = context || {}
  const ins = uniIdCommon.createInstance({ clientInfo: {
    PLATFORM: info.PLATFORM || c.PLATFORM || 'app',
    APPID: info.APPID || c.APPID || '',
    LOCALE: info.LOCALE || c.LOCALE || 'zh-Hans',
    CLIENTIP: info.CLIENTIP || c.CLIENTIP || '',
    DEVICEID: info.DEVICEID || c.DEVICEID || ''
  } })
  try {
    const r = await ins.checkToken(token, { autoRefresh: false })
    if (!r || !r.uid) return ''
    const res = await db.collection('uni-id-users').doc(r.uid).get()
    const user = (res.data || [])[0]
    if (!user) return ''
    if (user.status === 1 || user.status === 4) return ''
    const iat = 1000 * Number(r.iat || 0)
    if (user.valid_token_date && user.valid_token_date > iat) return ''
    if (Array.isArray(user.token) && user.token.length && user.token.indexOf(token) === -1) return ''
    return r.uid
  } catch (e) { return '' }
}
async function requireUid(event, context) {
  const uid = await getUid(event, context)
  if (!uid) throw new Error('请先登录')
  return uid
}
async function companyById(id) {
  if (!id) return null
  const r = await db.collection(C.company).doc(id).get()
  return (r.data || [])[0] || null
}
async function departmentById(id) {
  if (!id) return null
  const r = await db.collection(C.department).doc(id).get()
  return (r.data || [])[0] || null
}
async function employeeByUid(companyId, uid) {
  const r = await db.collection(C.employee).where({ companyId, uid, status: 'active' }).limit(1).get()
  return (r.data || [])[0] || null
}
async function membership(companyId, uid) {
  const company = await companyById(companyId)
  if (!company) throw new Error('公司不存在')
  if (company.ownerUid === uid) return { company, role: 'owner', employee: null }
  const mr = await db.collection(C.companyMember).where({ companyId, uid }).limit(1).get()
  const m = (mr.data || [])[0]
  if (m) return { company, role: m.role || 'member', employee: await employeeByUid(companyId, uid) }
  const e = await employeeByUid(companyId, uid)
  if (e) return { company, role: 'member', employee: e }
  throw new Error('你不是该公司成员')
}
async function requireAdmin(companyId, uid, departmentId) {
  const ctx = await membership(companyId, uid)
  if (ctx.role === 'owner' || ctx.role === 'admin') return ctx
  if (departmentId) {
    const d = await departmentById(departmentId)
    if (d && d.companyId === companyId && d.managerUid === uid) return ctx
  }
  throw new Error('需要公司或部门管理员权限')
}
async function companyMembers(companyId) {
  const r = await db.collection(C.employee).where({ companyId, status: 'active' }).limit(1000).get()
  return r.data || []
}
async function nextVersion(companyId, departmentId, date) {
  const r = await db.collection(C.plan).where({ companyId, departmentId, date }).orderBy('version', 'desc').limit(1).get()
  return Number(((r.data || [])[0] || {}).version || 0) + 1
}

/* ---------------- 公司 / 部门 / 员工 ---------------- */
async function createCompany(event, context) {
  const uid = await requireUid(event, context)
  const name = trim(event.name, 60)
  if (!name) return fail('请输入公司名称')
  const t = now()
  const c = await db.collection(C.company).add({ name, ownerUid: uid, status: 'active', createdAt: t, updatedAt: t })
  await db.collection(C.companyMember).add({ companyId: c.id, uid, role: 'owner', createdAt: t })
  const d = await db.collection(C.department).add({ companyId: c.id, parentId: '', name: '默认部门', type: 'dept', managerUid: uid, sort: 0, status: 'active', createdAt: t, updatedAt: t })
  return ok({ companyId: c.id, departmentId: d.id })
}
async function listCompanies(event, context) {
  const uid = await requireUid(event, context)
  const ids = new Set()
  const m = await db.collection(C.companyMember).where({ uid }).limit(200).get()
  ;(m.data || []).forEach((x) => ids.add(x.companyId))
  const e = await db.collection(C.employee).where({ uid, status: 'active' }).limit(200).get()
  ;(e.data || []).forEach((x) => ids.add(x.companyId))
  if (!ids.size) return ok({ list: [] })
  const r = await db.collection(C.company).where({ _id: _.in(Array.from(ids)), status: 'active' }).limit(200).get()
  const list = (r.data || []).map((c) => ({ ...c, role: c.ownerUid === uid ? 'owner' : 'member' }))
  return ok({ list })
}
async function companyDetail(event, context) {
  const uid = await requireUid(event, context)
  const ctx = await membership(event.companyId, uid)
  const deps = await db.collection(C.department).where({ companyId: event.companyId, status: 'active' }).orderBy('sort', 'asc').limit(500).get()
  const employees = await companyMembers(event.companyId)
  return ok({ company: ctx.company, role: ctx.role, employee: ctx.employee, departments: deps.data || [], employeeCount: employees.length })
}
async function saveDepartment(event, context) {
  const uid = await requireUid(event, context)
  await requireAdmin(event.companyId, uid)
  const name = trim(event.name, 40)
  if (!name) return fail('请输入部门名称')
  const parentId = trim(event.parentId, 40)
  if (parentId) {
    const p = await departmentById(parentId)
    if (!p || p.companyId !== event.companyId) return fail('上级部门不存在')
  }
  const t = now()
  const data = { companyId: event.companyId, parentId, name, type: event.type === 'group' ? 'group' : 'dept', managerUid: trim(event.managerUid, 64), sort: Number(event.sort || 0), status: 'active', updatedAt: t }
  if (event._id) {
    const d = await departmentById(event._id)
    if (!d || d.companyId !== event.companyId) return fail('部门不存在')
    await db.collection(C.department).doc(event._id).update(data)
    return ok({ _id: event._id })
  }
  data.createdAt = t
  const r = await db.collection(C.department).add(data)
  return ok({ _id: r.id })
}
async function listEmployees(event, context) {
  const uid = await requireUid(event, context)
  await membership(event.companyId, uid)
  let q = { companyId: event.companyId, status: _.neq('left') }
  if (event.departmentId) q.departmentId = event.departmentId
  const r = await db.collection(C.employee).where(q).orderBy('name', 'asc').limit(1000).get()
  let list = r.data || []
  if (event.keyword) {
    const k = trim(event.keyword, 40)
    list = list.filter((x) => (x.name || '').indexOf(k) >= 0 || (x.employeeNo || '').indexOf(k) >= 0)
  }
  return ok({ list })
}
async function saveEmployee(event, context) {
  const uid = await requireUid(event, context)
  await requireAdmin(event.companyId, uid, event.departmentId)
  const name = trim(event.name, 30)
  if (!name) return fail('请输入姓名')
  const deptId = trim(event.departmentId, 40)
  if (deptId) {
    const d = await departmentById(deptId)
    if (!d || d.companyId !== event.companyId) return fail('部门不存在')
  }
  const patch = {
    companyId: event.companyId,
    departmentId: deptId,
    name,
    employeeNo: trim(event.employeeNo, 40),
    position: trim(event.position, 40),
    phone: trim(event.phone, 30),
    uid: trim(event.uid, 64),
    status: event.status === 'left' ? 'left' : event.status === 'pending' ? 'pending' : 'active',
    updatedAt: now()
  }
  if (event._id) {
    const r = await db.collection(C.employee).doc(event._id).get()
    const old = (r.data || [])[0]
    if (!old || old.companyId !== event.companyId) return fail('员工不存在')
    await db.collection(C.employee).doc(event._id).update(patch)
    return ok({ _id: event._id })
  }
  patch.source = 'manual'
  patch.createdAt = now()
  const r = await db.collection(C.employee).add(patch)
  return ok({ _id: r.id })
}

/* ---------------- 导入 ---------------- */
function cleanEntry(entry) {
  return {
    processName: trim(entry.processName, 60),
    batchNo: trim(entry.batchNo, 500),
    remark: trim(entry.remark, 500),
    rowType: entry.rowType === 'leave' ? 'leave' : entry.rowType === 'rest' ? 'rest' : 'work',
    sort: Number(entry.sort || 0),
    assignments: (entry.assignments || []).map((a) => ({
      shiftName: trim(a.shiftName, 20),
      shiftCode: trim(a.shiftCode, 20),
      employeeName: trim(a.employeeName, 30),
      employeeId: trim(a.employeeId, 64),
      uid: trim(a.uid, 64),
      workHours: Number(a.workHours) === 12 ? 12 : 8,
      workSystem: Number(a.workHours) === 12 ? '12h' : '8h',
      sourceRow: Number(a.sourceRow || 0)
    })).filter((a) => a.employeeName)
  }
}
async function matchEmployees(companyId, departmentId, names, createMissing) {
  const r = await db.collection(C.employee).where({ companyId, status: _.neq('left') }).limit(1000).get()
  const list = r.data || []
  const byName = {}
  list.forEach((e) => { const k = trim(e.name); if (!byName[k]) byName[k] = []; byName[k].push(e) })
  const result = []
  const missing = []
  for (const name of names) {
    const matches = byName[name] || []
    if (matches.length === 1) {
      result.push({ name, employeeId: matches[0]._id, uid: matches[0].uid || '', status: 'matched', departmentId: matches[0].departmentId })
    } else if (matches.length > 1) {
      result.push({ name, employeeId: '', uid: '', status: 'duplicate', candidates: matches.map((e) => ({ _id: e._id, departmentId: e.departmentId, uid: e.uid || '' })) })
    } else if (createMissing) {
      missing.push(name)
    } else {
      result.push({ name, employeeId: '', uid: '', status: 'missing' })
    }
  }
  if (missing.length) {
    const t = now()
    const docs = missing.map((name) => ({
      companyId, departmentId: departmentId || '', uid: '', name,
      employeeNo: '', position: '', phone: '', status: 'pending',
      source: 'schedule_import', createdAt: t, updatedAt: t
    }))
    const add = await db.collection(C.employee).add(docs)
    const ids = add.ids || (add.id ? [add.id] : [])
    missing.forEach((name, i) => result.push({ name, employeeId: ids[i] || '', uid: '', status: 'created' }))
  }
  return result
}
async function prepareImport(event, context) {
  const uid = await requireUid(event, context)
  const companyId = trim(event.companyId, 40)
  const departmentId = trim(event.departmentId, 40)
  if (!companyId || !departmentId) return { error: '请选择公司和部门' }
  await requireAdmin(companyId, uid, departmentId)
  const parsed = parseScheduleFile({ base64: event.base64, fileName: event.fileName, selectedDate: event.date })
  const match = await matchEmployees(companyId, departmentId, parsed.employeeNames, false)
  return { uid, companyId, departmentId, parsed, match }
}
async function previewImport(event, context) {
  const p = await prepareImport(event, context)
  if (p.error) return fail(p.error)
  return ok({
    date: p.parsed.date,
    sourceType: p.parsed.sourceType,
    sheetName: p.parsed.sheetName,
    counts: p.parsed.counts,
    warnings: p.parsed.warnings,
    entries: p.parsed.entries,
    employees: p.match,
    missing: p.match.filter((x) => x.status === 'missing').map((x) => x.name),
    duplicates: p.match.filter((x) => x.status === 'duplicate').map((x) => x.name)
  })
}
async function importSchedule(event, context) {
  const p = await prepareImport(event, context)
  if (p.error) return fail(p.error)
  const { uid, companyId, departmentId, parsed } = p
  const matched = await matchEmployees(companyId, departmentId, parsed.employeeNames, true)
  const byName = {}
  matched.forEach((m) => { byName[m.name] = m })
  const entries = parsed.entries.map((entry) => {
    const e = cleanEntry(entry)
    e.assignments = e.assignments.map((a) => {
      const m = byName[a.employeeName] || {}
      return { ...a, employeeId: m.employeeId || '', uid: m.uid || '' }
    })
    return e
  })
  const t = now()
  const version = await nextVersion(companyId, departmentId, parsed.date)
  await db.collection(C.plan).where({ companyId, departmentId, date: parsed.date, status: 'active' }).update({ status: 'superseded', supersededAt: t })
  const fileHash = crypto.createHash('sha256').update(String(event.base64 || '')).digest('hex')
  const data = {
    companyId, departmentId, date: parsed.date, sourceType: parsed.sourceType,
    fileName: trim(event.fileName, 200), fileHash, entries,
    warnings: parsed.warnings, counts: parsed.counts, version, status: 'active',
    importedBy: uid, importedAt: t
  }
  const add = await db.collection(C.plan).add(data)
  return ok({ planId: add.id, date: parsed.date, version, counts: parsed.counts, warnings: parsed.warnings, employees: matched })
}
async function importHistory(event, context) {
  const uid = await requireUid(event, context)
  await membership(event.companyId, uid)
  const q = { companyId: event.companyId }
  if (event.departmentId) q.departmentId = event.departmentId
  const r = await db.collection(C.plan).where(q).orderBy('importedAt', 'desc').limit(100).get()
  const deps = await db.collection(C.department).where({ companyId: event.companyId }).limit(500).get()
  const dm = {}; (deps.data || []).forEach((d) => { dm[d._id] = d.name })
  return ok({ list: (r.data || []).map((x) => ({ ...x, departmentName: dm[x.departmentId] || '' })) })
}

/* ---------------- 查询 / 修改 ---------------- */
function simplifyPlan(plan) {
  return {
    _id: plan._id, date: plan.date, companyId: plan.companyId, departmentId: plan.departmentId,
    sourceType: plan.sourceType, fileName: plan.fileName, version: plan.version,
    importedAt: plan.importedAt, counts: plan.counts, warnings: plan.warnings,
    entries: (plan.entries || []).map((e) => ({
      ...e,
      assignments: (e.assignments || []).map((a) => ({ ...a }))
    }))
  }
}
async function board(event, context) {
  const uid = await requireUid(event, context)
  await membership(event.companyId, uid)
  if (!event.date) return fail('请选择日期')
  const q = { companyId: event.companyId, date: event.date, status: 'active' }
  if (event.departmentId) q.departmentId = event.departmentId
  const r = await db.collection(C.plan).where(q).limit(50).get()
  const deps = await db.collection(C.department).where({ companyId: event.companyId, status: 'active' }).limit(500).get()
  return ok({ plans: (r.data || []).map(simplifyPlan), departments: deps.data || [], date: event.date })
}
async function planDetail(event, context) {
  const uid = await requireUid(event, context)
  const r = await db.collection(C.plan).doc(event.planId).get()
  const plan = (r.data || [])[0]
  if (!plan) return fail('排班不存在')
  await membership(plan.companyId, uid)
  return ok({ plan: simplifyPlan(plan), role: (await membership(plan.companyId, uid)).role })
}
async function mySchedule(event, context) {
  const uid = await requireUid(event, context)
  await membership(event.companyId, uid)
  const employees = await db.collection(C.employee).where({ companyId: event.companyId, uid, status: 'active' }).limit(20).get()
  const empIds = (employees.data || []).map((e) => e._id)
  const names = (employees.data || []).map((e) => e.name)
  const month = String(event.month || '')
  const q = { companyId: event.companyId, status: 'active' }
  if (month) q.date = _.gte(month + '-01').and(_.lte(month + '-31'))
  const r = await db.collection(C.plan).where(q).orderBy('date', 'asc').limit(100).get()
  const days = []
  for (const plan of r.data || []) {
    for (const e of plan.entries || []) {
      for (const a of e.assignments || []) {
        if ((a.uid && a.uid === uid) || (a.employeeId && empIds.includes(a.employeeId)) || (!a.uid && !a.employeeId && names.includes(a.employeeName))) {
          days.push({ date: plan.date, departmentId: plan.departmentId, processName: e.processName, batchNo: e.batchNo, remark: e.remark, rowType: e.rowType, shiftName: a.shiftName, workHours: a.workHours, workSystem: a.workSystem })
        }
      }
    }
  }
  return ok({ days })
}
async function updateAssignment(event, context) {
  const uid = await requireUid(event, context)
  const r = await db.collection(C.plan).doc(event.planId).get()
  const plan = (r.data || [])[0]
  if (!plan) return fail('排班不存在')
  await requireAdmin(plan.companyId, uid, plan.departmentId)
  const entries = plan.entries || []
  const e = entries[event.entryIndex]
  if (!e) return fail('工序不存在')
  const a = e.assignments[event.assignmentIndex]
  if (!a) return fail('人员不存在')
  const before = { ...a }
  const name = trim(event.employeeName, 30)
  if (!name) return fail('姓名不能为空')
  const shiftName = trim(event.shiftName, 20) || a.shiftName
  const workHours = Number(event.workHours) === 12 ? 12 : 8
  const emps = await db.collection(C.employee).where({ companyId: plan.companyId, name, status: _.neq('left') }).limit(5).get()
  const emp = (emps.data || [])[0]
  const next = { ...a, employeeName: name, shiftName, workHours, workSystem: workHours === 12 ? '12h' : '8h', employeeId: emp ? emp._id : '', uid: emp ? (emp.uid || '') : '' }
  e.assignments[event.assignmentIndex] = next
  entries[event.entryIndex] = e
  await db.collection(C.plan).doc(plan._id).update({ entries, updatedAt: now() })
  await db.collection(C.audit).add({ planId: plan._id, companyId: plan.companyId, departmentId: plan.departmentId, date: plan.date, action: 'update_assignment', before, after: next, operatorUid: uid, createdAt: now() })
  return ok({ ok: true, assignment: next })
}

/* ---------------- 统计 ---------------- */
function mergeAssignment(map, plan, entry, a) {
  const key = a.employeeId || ('name:' + a.employeeName)
  if (!map[key]) map[key] = {
    employeeId: a.employeeId || '', name: a.employeeName, uid: a.uid || '',
    workDates: new Set(), shiftKeys: new Set(), hours: 0, shifts8: 0, shifts12: 0,
    leaveDates: new Set(), restDates: new Set(), shiftsByDate: new Map(), detail: []
  }
  const p = map[key]
  const date = plan.date
  if (entry.rowType === 'leave') { p.leaveDates.add(date); return }
  if (entry.rowType === 'rest') { p.restDates.add(date); return }
  const hours = Number(a.workHours) === 12 ? 12 : 8
  const shiftKey = date + '|' + a.shiftName + '|' + hours
  if (p.shiftKeys.has(shiftKey)) return
  p.shiftKeys.add(shiftKey)
  p.workDates.add(date)
  p.hours += hours
  if (hours === 12) p.shifts12 += 1; else p.shifts8 += 1
  if (!p.shiftsByDate.has(date)) p.shiftsByDate.set(date, new Set())
  p.shiftsByDate.get(date).add(a.shiftName)
  p.detail.push({ date, processName: entry.processName, shiftName: a.shiftName, workHours: hours })
}
function aggregate(plans, filter) {
  const people = {}
  const daily = {}
  const processes = {}
  for (const plan of plans) {
    for (const entry of plan.entries || []) {
      if (!daily[plan.date]) daily[plan.date] = { date: plan.date, workPeople: new Set(), leavePeople: new Set(), restPeople: new Set(), hours: 0, keys: new Set() }
      if (!processes[entry.processName]) processes[entry.processName] = { processName: entry.processName, people: new Set(), hours: 0, shifts: 0 }
      for (const a of entry.assignments || []) {
        const key = a.employeeId || ('name:' + a.employeeName)
        if (filter && !filter(key, a, plan)) continue
        mergeAssignment(people, plan, entry, a)
        const d = daily[plan.date]
        if (entry.rowType === 'leave') d.leavePeople.add(key)
        else if (entry.rowType === 'rest') d.restPeople.add(key)
        else {
          d.workPeople.add(key)
          const h = Number(a.workHours) === 12 ? 12 : 8
          const dk = key + '|' + plan.date + '|' + a.shiftName + '|' + h
          if (!d.keys.has(dk)) { d.keys.add(dk); d.hours += h }
          const pr = processes[entry.processName]
          const pk = key + '|' + plan.date + '|' + a.shiftName + '|' + h
          pr.people.add(key)
          if (!pr.keys) pr.keys = new Set()
          if (!pr.keys.has(pk)) { pr.keys.add(pk); pr.hours += h; pr.shifts += 1 }
        }
      }
    }
  }
  const rows = Object.values(people).map((p) => {
    let multiShiftDays = 0
    p.shiftsByDate.forEach((set) => { if (set.size > 1) multiShiftDays += 1 })
    return {
      employeeId: p.employeeId, name: p.name, uid: p.uid,
      workDays: p.workDates.size, shifts8: p.shifts8, shifts12: p.shifts12,
      hours: p.hours, leaveDays: p.leaveDates.size, restDays: p.restDates.size,
      multiShiftDays, detail: p.detail.sort((a, b) => a.date.localeCompare(b.date))
    }
  }).sort((a, b) => b.hours - a.hours || b.workDays - a.workDays)
  const dailyRows = Object.values(daily).map((d) => ({
    date: d.date, workPeople: d.workPeople.size, leavePeople: d.leavePeople.size, restPeople: d.restPeople.size, hours: d.hours
  })).sort((a, b) => a.date.localeCompare(b.date))
  const processRows = Object.values(processes).map((p) => ({ processName: p.processName, people: p.people.size, hours: p.hours, shifts: p.shifts })).sort((a, b) => b.hours - a.hours)
  return {
    summary: {
      people: rows.length,
      workDays: rows.reduce((n, r) => n + r.workDays, 0),
      hours: rows.reduce((n, r) => n + r.hours, 0),
      shifts8: rows.reduce((n, r) => n + r.shifts8, 0),
      shifts12: rows.reduce((n, r) => n + r.shifts12, 0),
      leave: rows.reduce((n, r) => n + r.leaveDays, 0),
      rest: rows.reduce((n, r) => n + r.restDays, 0)
    },
    rows, daily: dailyRows, processes: processRows
  }
}
async function stats(event, context) {
  const uid = await requireUid(event, context)
  await membership(event.companyId, uid)
  const month = String(event.month || '')
  if (!/^[0-9]{4}-[0-9]{2}$/.test(month)) return fail('月份格式应为 YYYY-MM')
  const q = { companyId: event.companyId, status: 'active', date: _.gte(month + '-01').and(_.lte(month + '-31')) }
  if (event.departmentId) q.departmentId = event.departmentId
  const r = await db.collection(C.plan).where(q).orderBy('date', 'asc').limit(500).get()
  const plans = r.data || []
  let filter = null
  if (event.scope === 'personal' || event.employeeId) {
    const employees = await db.collection(C.employee).where({ companyId: event.companyId, uid, status: 'active' }).limit(20).get()
    if (event.employeeId) {
      const one = await db.collection(C.employee).doc(event.employeeId).get()
      const e = (one.data || [])[0]
      if (e && e.companyId === event.companyId) {
        filter = (key) => key === e._id
      }
    } else {
      const ids = (employees.data || []).map((e) => e._id)
      if (!ids.length) return fail('当前账号未关联员工档案')
      filter = (key) => ids.includes(key)
    }
  }
  const result = aggregate(plans, filter)
  return ok({ month, scope: event.scope || 'company', departmentId: event.departmentId || '', ...result })
}

const handlers = {
  'company.create': createCompany,
  'company.list': listCompanies,
  'company.detail': companyDetail,
  'department.save': saveDepartment,
  'employee.list': listEmployees,
  'employee.save': saveEmployee,
  'schedule.preview': previewImport,
  'schedule.import': importSchedule,
  'schedule.history': importHistory,
  'schedule.board': board,
  'schedule.plan': planDetail,
  'schedule.my': mySchedule,
  'schedule.updateAssignment': updateAssignment,
  'schedule.stats': stats
}

exports.main = async (event, context) => {
  const action = event && event.action
  const handler = handlers[action]
  if (!handler) return fail('未知 action: ' + action)
  try {
    return await handler(event || {}, context || {})
  } catch (e) {
    console.error('[schedule] action failed:', action, e)
    return fail((e && (e.errMsg || e.message)) || String(e))
  }
}
