'use strict'
const uniIdCommon = require('uni-id-common')
const db = uniCloud.database()
const _ = db.command
const C = {
  team: 'jy_team', member: 'jy_team_member', request: 'jy_team_join_request',
  shift: 'jy_team_shift', schedule: 'jy_team_schedule', audit: 'jy_team_audit', notice: 'jy_team_notification'
}
const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })
const now = () => new Date()
const trim = (v, n) => String(v == null ? '' : v).trim().slice(0, n || 100)

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
    return (r && r.uid) || ''
  } catch (e) { return '' }
}

function code6() {
  const chars = 'ABCDEFGHJKLMNPQRSTUVWXYZ23456789'
  let s = ''
  for (let i = 0; i < 6; i += 1) s += chars[Math.floor(Math.random() * chars.length)]
  return s
}
function dateStr(d) {
  const x = d instanceof Date ? d : new Date(d)
  return x.getFullYear() + '-' + String(x.getMonth() + 1).padStart(2, '0') + '-' + String(x.getDate()).padStart(2, '0')
}
function isDate(s) { return /^[0-9]{4}-[0-9]{2}-[0-9]{2}$/.test(String(s || '')) }

async function teamById(id) {
  const r = await db.collection(C.team).doc(id).get()
  return (r.data || [])[0] || null
}
async function memberOf(teamId, uid) {
  const r = await db.collection(C.member).where({ teamId, uid }).limit(1).get()
  return (r.data || [])[0] || null
}
async function requireMember(teamId, uid) {
  const t = await teamById(teamId)
  if (!t || t.status !== 'active') throw new Error('团队不存在')
  const m = await memberOf(teamId, uid)
  if (!m || m.status !== 'active') throw new Error('你不是该团队成员')
  return { team: t, member: m }
}
function isAdmin(m) { return m && (m.role === 'owner' || m.role === 'admin') }
async function requireAdmin(teamId, uid) {
  const ctx = await requireMember(teamId, uid)
  if (!isAdmin(ctx.member)) throw new Error('需要管理员权限')
  return ctx
}
async function requireOwner(teamId, uid) {
  const ctx = await requireMember(teamId, uid)
  if (ctx.member.role !== 'owner') throw new Error('需要创建者权限')
  return ctx
}
function maskPhone(m, viewer) {
  const self = m.uid === viewer.uid
  const admin = isAdmin(viewer)
  const can = self || (admin && m.phoneSetBy === 'admin')
  return Object.assign({}, m, {
    phone: can ? (m.phone || '') : '',
    phoneHidden: !can && !!m.phone,
    phoneSetByView: m.phoneSetBy || ''
  })
}
async function addNotice(teamId, targetUid, type, title, content, payload) {
  await db.collection(C.notice).add({ teamId, targetUid, type, title, content, payload: payload || {}, read: false, createdAt: now() })
}
async function notifyAdmins(teamId, operator, title, content, payload) {
  const r = await db.collection(C.member).where({ teamId, status: 'active', role: _.in(['owner', 'admin']) }).get()
  for (const m of r.data || []) {
    if (m.uid !== operator) await addNotice(teamId, m.uid, 'schedule_changed', title, content, payload)
  }
}
async function writeAudit(teamId, targetUid, date, before, after, operator, role) {
  await db.collection(C.audit).add({ teamId, targetUid, date, before: before || {}, after: after || {}, operatorUid: operator, operatorRole: role, createdAt: now() })
}
async function scheduleOf(teamId, uid, date) {
  const r = await db.collection(C.schedule).where({ teamId, uid, date }).limit(1).get()
  return (r.data || [])[0] || null
}
async function validateShift(teamId, id) {
  if (!id) return
  const r = await db.collection(C.shift).doc(id).get()
  const s = (r.data || [])[0]
  if (!s || s.teamId !== teamId) throw new Error('班次不存在')
}
async function setSchedule(event, uid, role) {
  if (!isDate(event.date)) throw new Error('日期错误')
  const targetUid = event.uid || uid
  await validateShift(event.teamId, event.workId)
  await validateShift(event.teamId, event.secondWorkId)
  const beforeDoc = await scheduleOf(event.teamId, targetUid, event.date)
  const before = beforeDoc ? { workId: beforeDoc.workId, secondWorkId: beforeDoc.secondWorkId, remark: beforeDoc.remark } : null
  const payload = {
    teamId: event.teamId, uid: targetUid, date: event.date,
    workId: event.workId || '', secondWorkId: event.secondWorkId || '', remark: trim(event.remark, 200),
    createdBy: beforeDoc ? beforeDoc.createdBy : uid, updatedBy: uid, updatedAt: now()
  }
  if (beforeDoc) await db.collection(C.schedule).doc(beforeDoc._id).update(payload)
  else await db.collection(C.schedule).add(payload)
  await writeAudit(event.teamId, targetUid, event.date, before, payload, uid, role)
  if (targetUid !== uid) {
    await addNotice(event.teamId, targetUid, 'schedule_changed', '排班已更新', '管理员修改了你 ' + event.date + ' 的排班', { date: event.date, operatorUid: uid })
  } else if (isAdmin({ role })) {
    await notifyAdmins(event.teamId, uid, '排班已更新', '管理员修改了自己 ' + event.date + ' 的排班', { date: event.date, uid })
  } else {
    await notifyAdmins(event.teamId, uid, '成员修改了排班', '成员修改了 ' + event.date + ' 的排班', { date: event.date, uid })
  }
}

const handlers = {
  async 'team.create'(e, c, uid) {
    const name = trim(e.name, 30)
    if (!name) throw new Error('请输入团队名称')
    const team = { name, ownerId: uid, inviteCode: code6(), joinMode: 'approval', allowMemberEditSelf: true, status: 'active', createdAt: now(), updatedAt: now() }
    const r = await db.collection(C.team).add(team)
    await db.collection(C.member).add({ teamId: r.id, uid, role: 'owner', nickname: trim(e.nickname, 20), realName: '', phone: '', phoneSetBy: '', phoneSetById: '', employeeNo: '', status: 'active', joinedAt: now(), updatedAt: now() })
    return { team: Object.assign({ _id: r.id }, team), role: 'owner' }
  },
  async 'team.listMine'(e, c, uid) {
    const r = await db.collection(C.member).where({ uid, status: 'active' }).limit(100).get()
    const list = []
    for (const m of r.data || []) {
      const t = await teamById(m.teamId)
      if (!t || t.status !== 'active') continue
      const n = await db.collection(C.notice).where({ teamId: m.teamId, targetUid: uid, read: false }).count()
      list.push({ _id: t._id, name: t.name, role: m.role, unread: n.total || 0 })
    }
    return list
  },
  async 'team.detail'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const n = await db.collection(C.member).where({ teamId: e.teamId, status: 'active' }).count()
    const team = Object.assign({}, x.team)
    if (!isAdmin(x.member)) delete team.inviteCode
    return { team, role: x.member.role, memberCount: n.total || 0 }
  },
  async 'team.generateInvite'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const code = code6()
    await db.collection(C.team).doc(e.teamId).update({ inviteCode: code, updatedAt: now() })
    return { inviteCode: code }
  },
  async 'team.memberList'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const r = await db.collection(C.member).where({ teamId: e.teamId, status: 'active' }).orderBy('joinedAt', 'asc').limit(200).get()
    return (r.data || []).map((m) => maskPhone(m, x.member))
  },
  async 'team.updateMemberProfile'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const targetUid = e.uid || uid
    if (targetUid !== uid && !isAdmin(x.member)) throw new Error('无权限')
    const m = await memberOf(e.teamId, targetUid)
    if (!m) throw new Error('成员不存在')
    const patch = { updatedAt: now() }
    if (e.realName !== undefined) patch.realName = trim(e.realName, 30)
    if (e.employeeNo !== undefined) patch.employeeNo = trim(e.employeeNo, 40)
    if (e.phone !== undefined) {
      const phone = trim(e.phone, 20)
      patch.phone = phone
      patch.phoneSetBy = phone ? (targetUid === uid ? 'self' : 'admin') : ''
      patch.phoneSetById = phone ? uid : ''
    }
    await db.collection(C.member).doc(m._id).update(patch)
    return { ok: true }
  },
  async 'team.setRole'(e, c, uid) {
    await requireOwner(e.teamId, uid)
    const m = await memberOf(e.teamId, e.uid)
    if (!m || m.status !== 'active') throw new Error('成员不存在')
    if (m.role === 'owner') throw new Error('不能修改创建者')
    await db.collection(C.member).doc(m._id).update({ role: e.role === 'admin' ? 'admin' : 'member', updatedAt: now() })
    return { ok: true }
  },
  async 'team.removeMember'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const m = await memberOf(e.teamId, e.uid)
    if (!m) throw new Error('成员不存在')
    if (m.role === 'owner') throw new Error('不能移除创建者')
    await db.collection(C.member).doc(m._id).update({ status: 'removed', updatedAt: now() })
    return { ok: true }
  },
  async 'team.join'(e, c, uid) {
    const code = trim(e.inviteCode, 12).toUpperCase()
    const tr = await db.collection(C.team).where({ inviteCode: code, status: 'active' }).limit(1).get()
    const t = (tr.data || [])[0]
    if (!t) throw new Error('邀请码无效')
    const old = await memberOf(t._id, uid)
    if (old && old.status === 'active') return { status: 'active', teamId: t._id }
    if (old && old.status === 'removed') {
      await db.collection(C.member).doc(old._id).update({ status: 'active', role: 'member', updatedAt: now() })
      return { status: 'active', teamId: t._id, restored: true }
    }
    const pending = await db.collection(C.request).where({ teamId: t._id, uid, status: 'pending' }).limit(1).get()
    if ((pending.data || []).length) return { status: 'pending', teamId: t._id }
    await db.collection(C.request).add({ teamId: t._id, uid, nickname: trim(e.nickname, 20), realName: trim(e.realName, 30), phone: trim(e.phone, 20), employeeNo: trim(e.employeeNo, 40), message: trim(e.message, 200), status: 'pending', createdAt: now() })
    return { status: 'pending', teamId: t._id }
  },
  async 'teamJoin.listPending'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const r = await db.collection(C.request).where({ teamId: e.teamId, status: 'pending' }).orderBy('createdAt', 'asc').get()
    return r.data || []
  },
  async 'teamJoin.approve'(e, c, uid) {
    const x = await requireAdmin(e.teamId, uid)
    const rr = await db.collection(C.request).doc(e.requestId).get()
    const req = (rr.data || [])[0]
    if (!req || req.teamId !== x.team._id || req.status !== 'pending') throw new Error('申请不存在')
    const old = await memberOf(x.team._id, req.uid)
    if (old) await db.collection(C.member).doc(old._id).update({ status: 'active', role: old.role === 'owner' ? 'owner' : 'member', nickname: req.nickname, realName: req.realName, phone: req.phone, phoneSetBy: req.phone ? 'self' : '', phoneSetById: req.uid, employeeNo: req.employeeNo, updatedAt: now() })
    else await db.collection(C.member).add({ teamId: x.team._id, uid: req.uid, role: 'member', nickname: req.nickname, realName: req.realName, phone: req.phone, phoneSetBy: req.phone ? 'self' : '', phoneSetById: req.uid, employeeNo: req.employeeNo, status: 'active', joinedAt: now(), updatedAt: now() })
    await db.collection(C.request).doc(req._id).update({ status: 'approved', reviewedBy: uid, reviewedAt: now() })
    return { ok: true }
  },
  async 'teamJoin.reject'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const rr = await db.collection(C.request).doc(e.requestId).get()
    const req = (rr.data || [])[0]
    if (!req || req.teamId !== e.teamId || req.status !== 'pending') throw new Error('申请不存在')
    await db.collection(C.request).doc(req._id).update({ status: 'rejected', reviewedBy: uid, reviewedAt: now() })
    return { ok: true }
  },
  async 'teamShift.list'(e, c, uid) {
    await requireMember(e.teamId, uid)
    const r = await db.collection(C.shift).where({ teamId: e.teamId }).orderBy('sort', 'asc').get()
    return r.data || []
  },
  async 'teamShift.save'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const s = e.shift || {}
    const payload = { teamId: e.teamId, name: trim(s.name, 20), color: trim(s.color, 20), start: trim(s.start, 10), end: trim(s.end, 10), allDay: !!s.allDay, sort: Number(s.sort) || 0, createdBy: uid, updatedAt: now() }
    if (!payload.name) throw new Error('请输入班次名称')
    if (s._id) { await db.collection(C.shift).doc(s._id).update(payload); return { _id: s._id } }
    const r = await db.collection(C.shift).add(payload)
    return { _id: r.id }
  },
  async 'teamShift.delete'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const r = await db.collection(C.shift).doc(e.id).get()
    const s = (r.data || [])[0]
    if (!s || s.teamId !== e.teamId) throw new Error('班次不存在')
    await db.collection(C.shift).doc(e.id).remove()
    return { ok: true }
  },
  async 'teamSchedule.range'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const start = isDate(e.start) ? e.start : dateStr(new Date())
    const end = isDate(e.end) ? e.end : start
    const where = { teamId: e.teamId, date: _.gte(start).and(_.lte(end)) }
    if (!isAdmin(x.member)) where.uid = uid
    else if (e.uid) where.uid = e.uid
    const r = await db.collection(C.schedule).where(where).orderBy('date', 'asc').limit(1000).get()
    return r.data || []
  },
  async 'teamSchedule.set'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const target = e.uid || uid
    if (target !== uid && !isAdmin(x.member)) throw new Error('只能修改自己的排班')
    await setSchedule(Object.assign({}, e, { uid: target }), uid, x.member.role)
    return { ok: true }
  },
  async 'teamSchedule.clear'(e, c, uid) {
    const x = await requireMember(e.teamId, uid)
    const target = e.uid || uid
    if (target !== uid && !isAdmin(x.member)) throw new Error('只能修改自己的排班')
    await setSchedule(Object.assign({}, e, { uid: target, workId: '', secondWorkId: '', remark: '' }), uid, x.member.role)
    return { ok: true }
  },
  async 'teamNotification.list'(e, c, uid) {
    await requireMember(e.teamId, uid)
    const offset = Math.max(0, Number(e.offset) || 0)
    const limit = Math.min(100, Math.max(1, Number(e.limit) || 50))
    const r = await db.collection(C.notice).where({ teamId: e.teamId, targetUid: uid }).orderBy('createdAt', 'desc').skip(offset).limit(limit).get()
    return r.data || []
  },
  async 'teamNotification.unreadCount'(e, c, uid) {
    const r = await db.collection(C.notice).where({ targetUid: uid, read: false }).count()
    return { total: r.total || 0 }
  },
  async 'teamNotification.markAllRead'(e, c, uid) {
    await db.collection(C.notice).where({ teamId: e.teamId, targetUid: uid, read: false }).update({ read: true })
    return { ok: true }
  },
  async 'teamAudit.list'(e, c, uid) {
    await requireAdmin(e.teamId, uid)
    const r = await db.collection(C.audit).where({ teamId: e.teamId }).orderBy('createdAt', 'desc').limit(100).get()
    return r.data || []
  }
}

exports.main = async (event, context) => {
  const action = event && event.action
  const handler = handlers[action]
  if (!handler) return fail('未知 action: ' + action)
  try {
    const uid = await getUid(event || {}, context || {})
    if (!uid) return fail('请先登录')
    return ok(await handler(event || {}, context || {}, uid))
  } catch (err) {
    return fail((err && (err.errMsg || err.message)) || String(err))
  }
}
