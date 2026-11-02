'use strict'
/**
 * backup 云函数：云备份快照的创建 / 列表 / 还原 / 删除
 *
 * 入参：{ action, deviceId, userId, uniIdToken, ...payload }
 * 出参：{ code: 0, data } / { code: 非0, message }
 *
 * action（客户端 src/services/api.js 已对接）：
 *   backup.list    { scope }        → 备份列表（按 owner 查询、limit 50、created_at 倒序）
 *   backup.create  { name, scope }  → 服务端读取业务集合生成快照并写入 jy_backup
 *   backup.restore { id }           → 用快照覆盖写回当前 owner 的业务数据，返回 { ok: true }
 *   backup.delete  { id }           → 按 _id + owner 删除一条备份
 *
 * 数据归属 owner：uni-id-common 校验 token 成功取 uid，否则回落 deviceId（游客模式）。
 * 本文件仅使用云函数可用 API（uniCloud.database / uni-id-common），不调用任何客户端专有 API。
 */
const db = uniCloud.database()
const dbCmd = db.command
const uniIdCommon = require('uni-id-common')

const C = {
  backup: 'jy_backup',
  shift: 'jy_shift',
  schedule: 'jy_schedule',
  alarm: 'jy_alarm',
  project: 'jy_project',
  config: 'jy_config'
}

/* 快照覆盖的业务集合（顺序固定：还原时按此顺序逐个清空 + 回写） */
const DATA_COLLECTIONS = [C.shift, C.schedule, C.alarm, C.project, C.config]

const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })

function pad2(n) {
  return n < 10 ? '0' + n : String(n)
}

/* 服务端兜底备份名（东八区）；客户端正常都会传 name，如「备份 2024-09-01 12:30」 */
function defaultBackupName(scope) {
  const d = new Date(Date.now() + 8 * 60 * 60 * 1000)
  const date = d.getUTCFullYear() + '-' + pad2(d.getUTCMonth() + 1) + '-' + pad2(d.getUTCDate())
  const time = pad2(d.getUTCHours()) + ':' + pad2(d.getUTCMinutes())
  return (scope === 'cloud' ? '全量备份 ' : '备份 ') + date + ' ' + time
}

function normalizeScope(scope) {
  return scope === 'local' ? 'local' : 'cloud'
}

/* token → uid；uni-id-common 校验失败时其错误会被模块内部转换，这里再兜底返回空字符串 */
async function verifyToken(token) {
  if (!token) return ''
  try {
    const clientInfo = (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {}
    const ins = uniIdCommon.createInstance({ clientInfo })
    const res = await ins.checkToken(token, { autoRefresh: false })
    if (!res || !res.uid) return ''
    const u = await db.collection('uni-id-users').doc(res.uid).get()
    const user = (u.data || [])[0]
    if (!user) return ''
    if (user.status === 1 || user.status === 4) return ''
    const iat = 1000 * Number(res.iat || 0)
    if (user.valid_token_date && user.valid_token_date > iat) return ''
    if (Array.isArray(user.token) && user.token.length && user.token.indexOf(token) === -1) return ''
    return res.uid
  } catch (e) {
    return ''
  }
}

/* owner = 有效 token 的 uid，否则 deviceId */
async function resolveOwner(event) {
  const uid = await verifyToken(String(event.uniIdToken || event.token || ''))
  if (!uid) throw new Error('请先登录后再使用云备份')
  return { uid, deviceId: '', owner: uid }
}

/*
 * 业务数据归属条件。兼容两种落库方式：
 *  - 现有实现：owner 写在 deviceId 字段（登录后为 uid，游客为设备号）
 *  - 后续扩展：user_id 字段存 uid
 */
function ownerQuery(owner) {
  return dbCmd.or([{ owner: owner }, { deviceId: owner }, { user_id: owner }])
}

async function queryOwned(col, owner, orderField) {
  try {
    let q = db.collection(col).where(ownerQuery(owner))
    if (orderField) q = q.orderBy(orderField, 'asc')
    const res = await q.limit(1000).get()
    return res.data || []
  } catch (e) {
    /* 环境不支持 where(or) 时退化为 deviceId 单字段查询，保证云备份可用 */
    let q = db.collection(col).where({ deviceId: owner })
    if (orderField) q = q.orderBy(orderField, 'asc')
    const res = await q.limit(1000).get()
    return res.data || []
  }
}

/* 服务端组装快照（不调用客户端接口） */
async function buildSnapshot(owner) {
  const [shifts, schedule, alarms, projects, configs] = await Promise.all([
    queryOwned(C.shift, owner, 'sort'),
    queryOwned(C.schedule, owner, 'date'),
    queryOwned(C.alarm, owner),
    queryOwned(C.project, owner),
    queryOwned(C.config, owner)
  ])
  return {
    shifts,
    schedule,
    alarms,
    projects,
    config: (configs && configs[0]) || null
  }
}

/* 与 local-db.js 的 countItems 保持一致：班次 + 排班 + 提醒 + 项目 */
function countItems(snapshot) {
  const s = snapshot || {}
  return (
    (s.shifts || []).length +
    (s.schedule || []).length +
    (s.alarms || []).length +
    (s.projects || []).length
  )
}

/* 列表不返回 snapshot，避免多份快照撑爆云函数响应体；还原时服务端按 id 读取 */
function backupBrief(doc) {
  const item = Object.assign({}, doc)
  delete item.snapshot
  return item
}

async function listBackups(event, ctx) {
  const scope = normalizeScope(event.scope)
  const res = await db
    .collection(C.backup)
    .where({ user_id: ctx.owner, scope })
    .orderBy('created_at', 'desc')
    .limit(50)
    .get()
  return (res.data || []).map(backupBrief)
}

async function createBackup(event, ctx) {
  const scope = normalizeScope(event.scope)
  const snapshot = await buildSnapshot(ctx.owner)
  const size = countItems(snapshot)
  if (!size) throw new Error('当前没有数据可以备份')
  const rawName = String(event.name || '').trim()
  const name = (rawName || defaultBackupName(scope)).slice(0, 60)
  const doc = {
    user_id: ctx.owner,
    deviceId: ctx.deviceId,
    name,
    scope,
    snapshot,
    size,
    created_at: Date.now()
  }
  const res = await db.collection(C.backup).add(doc)
  return Object.assign({ _id: res.id }, doc)
}

async function clearOwned(col, owner) {
  await db.collection(col).where(ownerQuery(owner)).remove()
}

/* 快照里的数据保留业务字段，归属字段统一重写为当前 owner */
function ownedDoc(item, ctx) {
  const payload = Object.assign({}, item || {})
  delete payload._id
  delete payload.user_id
  delete payload.owner
  payload.owner = ctx.owner
  if (!ctx.uid) payload.deviceId = ctx.deviceId
  return payload
}

async function insertOwned(col, list, ctx) {
  const items = Array.isArray(list) ? list : []
  for (let i = 0; i < items.length; i += 1) {
    await db.collection(col).add(ownedDoc(items[i], ctx))
  }
}

async function restoreBackup(event, ctx) {
  const id = String(event.id || '')
  if (!id) throw new Error('缺少备份 id')
  const res = await db.collection(C.backup).where({ _id: id, user_id: ctx.owner }).get()
  const doc = (res.data || [])[0]
  if (!doc || !doc.snapshot) throw new Error('备份不存在或已删除')
  const snapshot = doc.snapshot

  /* 先按 owner 清空对应集合，再逐条写回快照 */
  for (let i = 0; i < DATA_COLLECTIONS.length; i += 1) {
    await clearOwned(DATA_COLLECTIONS[i], ctx.owner)
  }
  await insertOwned(C.shift, snapshot.shifts, ctx)
  await insertOwned(C.schedule, snapshot.schedule, ctx)
  await insertOwned(C.alarm, snapshot.alarms, ctx)
  await insertOwned(C.project, snapshot.projects, ctx)
  if (snapshot.config && Object.keys(snapshot.config).length) {
    await insertOwned(C.config, [snapshot.config], ctx)
  }
  return { ok: true, restored: countItems(snapshot) }
}

async function deleteBackup(event, ctx) {
  const id = String(event.id || '')
  if (!id) throw new Error('缺少备份 id')
  const res = await db.collection(C.backup).where({ _id: id, user_id: ctx.owner }).get()
  const doc = (res.data || [])[0]
  if (!doc) throw new Error('备份不存在或已删除')
  await db.collection(C.backup).doc(doc._id).remove()
  return { ok: true, id }
}

/* backup.list → list，兼容直接传 list 的调用方 */
function actionVerb(action) {
  const raw = String(action || '')
  if (!raw) return ''
  const idx = raw.lastIndexOf('.')
  return idx >= 0 ? raw.slice(idx + 1) : raw
}

exports.main = async (event) => {
  const ev = event || {}
  const verb = actionVerb(ev.action)
  try {
    const ctx = await resolveOwner(ev)
    if (verb === 'list') return ok(await listBackups(ev, ctx))
    if (verb === 'create') return ok(await createBackup(ev, ctx))
    if (verb === 'restore') return ok(await restoreBackup(ev, ctx))
    if (verb === 'delete' || verb === 'remove') return ok(await deleteBackup(ev, ctx))
    return fail('未知 action: ' + ev.action)
  } catch (e) {
    return fail(e && e.message ? e.message : String(e))
  }
}
