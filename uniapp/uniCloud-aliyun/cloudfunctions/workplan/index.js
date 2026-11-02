'use strict'
/**
 * workplan 云函数：极简排班复刻的统一业务后端
 * 入参: { action, deviceId, uniIdToken, ...payload }
 * 出参: { code: 0, data } / { code: 非0, message }
 *
 * 数据归属 owner（uni-id）：
 *   - 请求携带有效 uni-id token → owner = uid（登录账号）
 *   - 未登录 → owner = deviceId（游客，数据仅在本设备使用）
 * 兼容历史数据（只有 deviceId 字段、没有 owner）：
 *   - 游客读取时同时匹配 owner=deviceId / deviceId（db.command.or）
 *   - 登录时由 user 云函数把本设备游客数据迁移为 owner=uid（见 AUTH.md）
 * 首次 bootstrap 自动调用 seedDemo 写入 2024-09 示例数据；
 * 登录账号首次使用（无数据）时 seed 后把示例数据归属改为 uid。
 */
const uniIdCommon = require('uni-id-common')
const db = uniCloud.database()
const _ = db.command

const C = {
  shift: 'jy_shift',
  schedule: 'jy_schedule',
  alarm: 'jy_alarm',
  project: 'jy_project',
  config: 'jy_config',
  plan: 'jy_plan',
  share: 'jy_share',
  faq: 'jy_faq'
}

const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })

/* ============================================================
   身份与数据归属
   ============================================================ */

/**
 * 创建 uni-id 实例（每次请求创建，避免单实例多并发时 clientInfo 串号）。
 * 优先用 uniCloud.getClientInfo()；云函数环境通常没有该 API，用 context 兜底。
 */
function getUniId(context) {
  let info = {}
  try {
    info = (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {}
  } catch (e) {
    info = {}
  }
  const c = context || {}
  if (!info.PLATFORM) info.PLATFORM = c.PLATFORM || c.platform || 'h5'
  if (!info.APPID) info.APPID = c.APPID || c.appId || ''
  if (!info.LOCALE) info.LOCALE = c.LOCALE || c.locale || 'zh-Hans'
  if (!info.CLIENTIP) info.CLIENTIP = c.CLIENTIP || c.clientIP || ''
  if (!info.DEVICEID) info.DEVICEID = c.DEVICEID || c.deviceId || ''
  return uniIdCommon.createInstance({ clientInfo: info })
}

/**
 * 校验 uni-id token，返回 uid；无效/过期/已退出返回 ''（按游客处理）。
 * uni-id-common v1.0.16 的 checkToken 在 autoRefresh:false 时只验签、不查库
 * （role/permission 缓存在 token 中），因此这里补查 uni-id-users：
 *   status 封禁/注销、valid_token_date（退出登录/改密后旧 token 失效）、token 列表。
 */
async function checkToken(token, context) {
  if (!token) return ''
  let r
  try {
    r = await getUniId(context).checkToken(token, { autoRefresh: false })
  } catch (e) {
    r = e
  }
  if (!r || (r.errCode && r.errCode !== 0) || (r.code && r.code !== 0) || !r.uid) return ''
  try {
    const res = await db.collection('uni-id-users').doc(r.uid).get()
    const user = (res.data || [])[0]
    if (!user) return ''
    if (user.status === 1 || user.status === 4) return ''
    const iat = 1000 * Number(r.iat || 0)
    if (user.valid_token_date && user.valid_token_date > iat) return ''
    if (Array.isArray(user.token) && user.token.length && user.token.indexOf(token) === -1) return ''
  } catch (e) {
    console.warn('[workplan] verify user failed:', (e && (e.errMsg || e.message)) || e)
    return ''
  }
  return r.uid
}

async function resolveOwner(event, context) {
  const deviceId = event.deviceId || 'dev-anonymous'
  const uid = await checkToken(event.uniIdToken || event.token || '', context)
  return { deviceId, uid, owner: uid || deviceId }
}

/** 新增数据时写入的归属字段：登录账号只写 owner；游客 owner 与 deviceId 同值 */
function ownedFields(ctx) {
  const fields = { owner: ctx.owner }
  if (!ctx.uid) fields.deviceId = ctx.deviceId
  return fields
}

/**
 * 查询条件：
 *   登录 → { owner: uid, ...extra }
 *   游客 → or([{ owner: deviceId, ...extra }, { deviceId, ...extra }])
 */
function ownerCond(ctx, extra) {
  const where = extra || {}
  if (ctx.uid) return Object.assign({}, where, { owner: ctx.uid })
  return _.or([
    Object.assign({}, where, { owner: ctx.deviceId }),
    Object.assign({}, where, { deviceId: ctx.deviceId })
  ])
}

function ownsDoc(ctx, doc) {
  if (!doc) return false
  if (ctx.uid) return doc.owner === ctx.uid
  if (doc.owner) return doc.owner === ctx.deviceId
  return doc.deviceId === ctx.deviceId
}

async function getOwnedDoc(ctx, col, id) {
  if (!id) throw new Error('缺少数据 id')
  const cur = await db.collection(col).doc(id).get()
  const found = (cur.data || [])[0]
  if (!found) throw new Error('数据不存在')
  if (!ownsDoc(ctx, found)) throw new Error('无权操作该数据')
  return found
}

async function getList(ctx, col, field) {
  let q = db.collection(col).where(ownerCond(ctx))
  if (field) q = q.orderBy(field, 'asc')
  const res = await q.get()
  return res.data || []
}

async function getConfig(ctx) {
  const res = await db.collection(C.config).where(ownerCond(ctx)).get()
  return (res.data && res.data[0]) || null
}

/** FAQ 是静态内容：当前归属下没有数据时，兜底取任意一份 seed 数据（按问题去重） */
async function getFaq(ctx) {
  const mine = await getList(ctx, C.faq, 'sort')
  if (mine.length) return mine
  const res = await db.collection(C.faq).orderBy('sort', 'asc').limit(20).get()
  const seen = {}
  return (res.data || []).filter((item) => {
    const key = item.q || item._id
    if (seen[key]) return false
    seen[key] = true
    return true
  })
}

/* ============================================================
   示例数据 seed
   ============================================================ */

async function ensureSeed(ctx) {
  const res = await db.collection(C.shift).where(ownerCond(ctx)).count()
  if (res.total) return
  await uniCloud.callFunction({ name: 'seedDemo', data: { deviceId: ctx.deviceId } })
  if (ctx.uid) await adoptSeededData(ctx)
}

/**
 * 登录账号首次使用：seedDemo 是按 deviceId 写入的，这里把示例数据归属改为 uid，
 * 并移除 deviceId，避免退出登录后游客态读到账号数据。
 */
async function adoptSeededData(ctx) {
  const cols = [C.shift, C.schedule, C.alarm, C.project, C.config, C.faq]
  for (const col of cols) {
    const res = await db.collection(col).where({ deviceId: ctx.deviceId }).limit(1000).get()
    for (const doc of res.data || []) {
      if (doc.owner && doc.owner !== ctx.deviceId) continue
      await db.collection(col).doc(doc._id).update({ owner: ctx.uid, deviceId: _.remove() })
    }
  }
}

/* ============================================================
   通用写入
   ============================================================ */

async function upsert(ctx, col, doc) {
  const payload = Object.assign({}, doc)
  const id = payload._id
  delete payload._id
  delete payload.owner
  delete payload.deviceId
  if (id) {
    const found = await getOwnedDoc(ctx, col, id)
    await db.collection(col).doc(id).update(payload)
    return Object.assign({}, found, payload)
  }
  const next = Object.assign({}, payload, ownedFields(ctx))
  const addRes = await db.collection(col).add(next)
  return Object.assign({}, next, { _id: addRes.id })
}

/* ============================================================
   统计
   ============================================================ */

function parseTime(t) {
  const cleaned = String(t || '').replace(/[^\d:]/g, '')
  const m = /^(\d{1,2}):(\d{2})$/.exec(cleaned)
  return m ? Number(m[1]) * 60 + Number(m[2]) : 0
}

function shiftHours(shift) {
  if (!shift || shift.allDay) return 0
  const start = parseTime(shift.start)
  let end = parseTime(shift.end)
  if (/次日/.test(shift.end || '')) end += 24 * 60
  let diff = end - start
  if (diff < 0) diff += 24 * 60
  return diff / 60
}

function weekdayText(date) {
  const d = new Date(date.replace(/-/g, '/')).getDay()
  return '周' + '日一二三四五六'[d]
}

function formatStatDuration(hours) {
  if (!hours || hours <= 0) return '--'
  if (hours < 1) return Math.round(hours * 60) + 'min'
  if (Number.isInteger(hours)) return hours + 'h'
  return hours.toFixed(1) + 'h'
}

function formatStatRest(minutes) {
  const m = Number(minutes) || 0
  if (m <= 0) return '--'
  if (m < 60) return m + 'min'
  if (m % 60 === 0) return m / 60 + 'h'
  return (m / 60).toFixed(1) + 'h'
}

async function computeStat(ctx, start, end) {
  const shifts = await getList(ctx, C.shift)
  const shiftMap = {}
  // 种子数据/客户端里 workId 存的是业务 id（early/late…），同时按 _id 与 id 建索引
  shifts.forEach((s) => {
    shiftMap[s._id] = s
    if (s.id) shiftMap[s.id] = s
  })
  const res = await db.collection(C.schedule).where(
    ownerCond(ctx, { date: _.gte(start).and(_.lte(end)) })
  ).get()
  const schedule = res.data || []
  const counts = {}
  let totalHours = 0
  let restHours = 0
  const details = []
  schedule.forEach((d) => {
    const s = shiftMap[d.workId]
    const hours = shiftHours(s)
    if (s) {
      counts[s.name] = (counts[s.name] || 0) + 1
      totalHours += hours
      const restMin = s && (s.rest === undefined || s.rest === '') ? (s.allDay ? 0 : 60) : Number(s.rest) || 0
      restHours += s.allDay ? 0 : restMin / 60
    }
    if (d.workId) {
      details.push({
        d: d.date.slice(5),
        w: weekdayText(d.date),
        work: d.workId,
        start: s && !s.allDay ? s.start : '—',
        end: s && !s.allDay ? s.end : '—',
        restText: formatStatRest(s && s.rest),
        dur: formatStatDuration(hours),
        remark: d.remark || ''
      })
    }
  })
  details.sort((a, b) => (a.d > b.d ? 1 : -1))
  const total = details.length
  const donut = Object.keys(counts).map((name) => {
    const s = shifts.find((x) => x.name === name)
    return {
      name,
      value: counts[name],
      pct: Math.round((counts[name] / total) * 100),
      color: s ? s.color : '#55BB8A'
    }
  })
  return {
    range: [start, end],
    donut,
    totalHours: Math.round(totalHours),
    avgHours: totalHours && total ? Number((totalHours / total).toFixed(1)) : 0,
    restHours: Math.round(restHours),
    details
  }
}

/* ============================================================
   分享 / 导入
   ============================================================ */

async function createShare(ctx, projectId) {
  const [shifts, schedule, alarms, projects, config, faq] = await Promise.all([
    getList(ctx, C.shift),
    getList(ctx, C.schedule, 'date'),
    getList(ctx, C.alarm),
    getList(ctx, C.project),
    getConfig(ctx),
    getFaq(ctx)
  ])
  const chars = 'ABCDEFGHJKLMNPQRSTUVWXYZ23456789'
  let key = ''
  for (let i = 0; i < 6; i++) key += chars.charAt(Math.floor(Math.random() * chars.length))
  await db.collection(C.share).add(Object.assign({
    key,
    projectId: projectId || '',
    snapshot: { shifts, schedule, alarms, projects, config, faq },
    createdAt: Date.now()
  }, ownedFields(ctx)))
  return { key }
}

async function importShare(ctx, key) {
  // 分享秘钥全局可导入（不区分归属），导入后归属当前 owner
  const res = await db.collection(C.share).where({ key: String(key || '').toUpperCase() }).get()
  const doc = (res.data || [])[0]
  if (!doc || !doc.snapshot) throw new Error('秘钥不存在或已过期')
  const snap = doc.snapshot
  const cols = [C.shift, C.schedule, C.alarm, C.project, C.config, C.faq]
  for (const c of cols) await db.collection(c).where(ownerCond(ctx)).remove()
  const copy = async (col, list) => {
    for (const item of list || []) {
      const payload = Object.assign({}, item)
      delete payload._id
      delete payload.owner
      delete payload.deviceId
      await db.collection(col).add(Object.assign(payload, ownedFields(ctx)))
    }
  }
  await copy(C.shift, snap.shifts)
  await copy(C.schedule, snap.schedule)
  await copy(C.alarm, snap.alarms)
  await copy(C.project, snap.projects)
  await copy(C.faq, snap.faq)
  if (snap.config) {
    const cfg = Object.assign({}, snap.config)
    delete cfg._id
    delete cfg.owner
    delete cfg.deviceId
    await db.collection(C.config).add(Object.assign(cfg, ownedFields(ctx)))
  }
  return { ok: true, projects: (snap.projects || []).length }
}

/* ============================================================
   入口
   ============================================================ */

exports.main = async (event, context) => {
  event = event || {}
  const action = event.action
  try {
    const ctx = await resolveOwner(event, context || {})

    if (action === 'bootstrap') {
      await ensureSeed(ctx)
      const [shifts, schedule, alarms, projects, config, faq] = await Promise.all([
        getList(ctx, C.shift, 'sort'),
        getList(ctx, C.schedule, 'date'),
        getList(ctx, C.alarm),
        getList(ctx, C.project),
        getConfig(ctx),
        getFaq(ctx)
      ])
      return ok({ shifts, schedule, alarms, projects, config: config || {}, faq })
    }

    if (action === 'schedule.range') {
      const res = await db.collection(C.schedule).where(
        ownerCond(ctx, { date: _.gte(event.start).and(_.lte(event.end)) })
      ).orderBy('date', 'asc').get()
      return ok(res.data || [])
    }

    if (action === 'schedule.set') {
      const date = event.date
      const cur = await db.collection(C.schedule).where(ownerCond(ctx, { date })).get()
      const found = (cur.data || [])[0]
      const payload = {
        date,
        workId: event.workId || '',
        secondWorkId: event.secondWorkId || '',
        remark: event.remark || ''
      }
      if (found) {
        await db.collection(C.schedule).doc(found._id).update(payload)
        return ok(Object.assign({}, found, payload))
      }
      const next = Object.assign({}, payload, ownedFields(ctx))
      const addRes = await db.collection(C.schedule).add(next)
      return ok(Object.assign({}, next, { _id: addRes.id }))
    }

    if (action === 'plan.list') return ok(await getList(ctx, C.plan, 'sort'))
    if (action === 'plan.save') {
      const plan = Object.assign({}, event.plan || {})
      if (!plan._id && plan.id) {
        const found = await db.collection(C.plan).where(ownerCond(ctx, { id: plan.id })).limit(1).get()
        if (found.data && found.data[0]) plan._id = found.data[0]._id
      }
      return ok(await upsert(ctx, C.plan, plan))
    }
    if (action === 'plan.delete') {
      await getOwnedDoc(ctx, C.plan, event.id)
      await db.collection(C.plan).doc(event.id).remove()
      return ok({ ok: true })
    }
    if (action === 'shift.list') return ok(await getList(ctx, C.shift, 'sort'))
    if (action === 'shift.save') return ok(await upsert(ctx, C.shift, event.shift || {}))
    if (action === 'shift.delete') {
      await getOwnedDoc(ctx, C.shift, event.id)
      await db.collection(C.shift).doc(event.id).remove()
      // 级联：清空排班中对该班次的引用
      const schedules = await getList(ctx, C.schedule)
      for (const s of schedules) {
        if (s.workId === event.id || s.secondWorkId === event.id) {
          await db.collection(C.schedule).doc(s._id).update({
            workId: s.workId === event.id ? '' : s.workId,
            secondWorkId: s.secondWorkId === event.id ? '' : s.secondWorkId
          })
        }
      }
      return ok(true)
    }

    if (action === 'alarm.list') return ok(await getList(ctx, C.alarm))
    if (action === 'alarm.save') return ok(await upsert(ctx, C.alarm, event.alarm || {}))
    if (action === 'alarm.toggle') {
      await getOwnedDoc(ctx, C.alarm, event.id)
      await db.collection(C.alarm).doc(event.id).update({ on: !!event.on })
      return ok({ id: event.id, on: !!event.on })
    }
    if (action === 'alarm.delete') {
      await getOwnedDoc(ctx, C.alarm, event.id)
      await db.collection(C.alarm).doc(event.id).remove()
      return ok(true)
    }

    if (action === 'project.list') return ok(await getList(ctx, C.project, 'sort'))
    if (action === 'project.save') {
      const p = event.project || {}
      if (!p._id && !p.id && p.sort === undefined) {
        const list = await getList(ctx, C.project)
        p.sort = list.length
      }
      return ok(await upsert(ctx, C.project, p))
    }
    if (action === 'project.setCurrent') {
      const list = await getList(ctx, C.project)
      for (const p of list) {
        await db.collection(C.project).doc(p._id).update({ current: p._id === event.id || p.id === event.id })
      }
      return ok(true)
    }
    if (action === 'project.delete') {
      await getOwnedDoc(ctx, C.project, event.id)
      await db.collection(C.project).doc(event.id).remove()
      return ok(true)
    }

    if (action === 'config.get') return ok((await getConfig(ctx)) || {})
    if (action === 'config.save') {
      const cfg = event.config || {}
      const cur = await getConfig(ctx)
      if (cur && cur._id) {
        const payload = Object.assign({}, cfg)
        delete payload._id
        delete payload.owner
        delete payload.deviceId
        await db.collection(C.config).doc(cur._id).update(payload)
      } else {
        await db.collection(C.config).add(Object.assign({}, cfg, ownedFields(ctx)))
      }
      return ok(cfg)
    }

    if (action === 'stat.range') {
      return ok(await computeStat(ctx, event.start, event.end))
    }

    if (action === 'share.generate') return ok(await createShare(ctx, event.projectId))
    if (action === 'share.import') return ok(await importShare(ctx, event.key))

    if (action === 'faq.list') return ok(await getFaq(ctx))

    return fail('未知 action: ' + action)
  } catch (e) {
    return fail(e && (e.errMsg || e.message) ? e.errMsg || e.message : String(e))
  }
}
