/**
 * 本地数据后端（uniCloud 未绑定时的 fallback）
 * 存储：uni.setStorageSync('jy_db_v1')，多设备隔离用 deviceId 前缀（本地即单设备）
 */
import { SHIFTS, DAYS, REMARKS, ALARMS, PROJECTS, DISPLAY_CONFIG, FAQ } from '@/data/mock.js'

const KEY = 'jy_db_v1'
const SEED_VERSION = 6

function seed() {
  const shifts = SHIFTS.map((s, i) => ({ _id: s.id, ...s, sort: i }))
  const schedule = DAYS.map((d) => ({
    _id: 'd' + d.d,
    date: '2024-09-' + String(d.d).padStart(2, '0'),
    workId: d.work || '',
    secondWorkId: '',
    remark: REMARKS[d.d] || ''
  }))
  return {
    shifts,
    schedule: schedule.concat(
      Array.from({ length: 30 }, (_, i) => i + 1)
        .filter((d) => !DAYS.find((x) => x.d === d))
        .map((d) => ({ _id: 'd' + d, date: '2024-09-' + String(d).padStart(2, '0'), workId: '', secondWorkId: '', remark: '' }))
    ),
    alarms: ALARMS.map((a) => ({ ...a })),
    projects: PROJECTS.map((p) => ({ ...p })),
    config: { ...DISPLAY_CONFIG.reduce((o, x) => ((o[x.k] = x.v), o), {}), currentProjectId: 'p1', themeMode: 'system' },
    faq: FAQ,
    _seedVersion: SEED_VERSION
  }
}

/* 旧版默认班次（早班 09:00-18:00 / 晚班 20:00-次日08:00 / 休息）→ 新默认班次迁移 */
function isLegacyDefaultShifts(shifts) {
  const list = shifts || []
  const ids = list.map((s) => s.id || s._id).sort().join(',')
  if (ids !== 'early,late,rest') return false
  const get = (id) => list.find((s) => (s.id || s._id) === id) || {}
  const early = get('early')
  const late = get('late')
  const rest = get('rest')
  return early.start === '09:00' && early.end === '18:00' && late.start === '20:00' && !!rest.allDay
}

function migrateSeedV2(db) {
  const fresh = seed()
  db.shifts = fresh.shifts
  db.schedule = fresh.schedule
  db.alarms = fresh.alarms
  db._seedVersion = SEED_VERSION
  save(db)
}

function load() {
  let db = uni.getStorageSync(KEY)
  if (!db || !db.shifts) {
    db = seed()
    uni.setStorageSync(KEY, db)
    return db
  }
  if (!db._seedVersion) {
    if (isLegacyDefaultShifts(db.shifts)) {
      migrateSeedV2(db)
      db = uni.getStorageSync(KEY)
    } else {
      // 用户已自定义过班次：只记录版本，不覆盖数据
      db._seedVersion = SEED_VERSION
      uni.setStorageSync(KEY, db)
    }
  }
  if ((db._seedVersion || 0) < SEED_VERSION) {
    // v3：原版日历默认周一开头；v4：默认班次补休息时长
    if (db.config && db.config['一周开始日'] === '周日') db.config['一周开始日'] = '周一'
    if (Array.isArray(db.shifts)) {
      // v6：每个班的休息时长统一为 0
      db.shifts.forEach((s) => {
        s.rest = '0'
      })
    }
    db._seedVersion = SEED_VERSION
    save(db)
  }
  return db
}

function save(db) {
  uni.setStorageSync(KEY, db)
}

const delay = (ms) => new Promise((r) => setTimeout(r, ms))

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

export async function fetchAll() {
  await delay(30)
  return load()
}

export async function saveShift(shift) {
  const db = load()
  if (shift._id) {
    const idx = db.shifts.findIndex((s) => s._id === shift._id)
    if (idx >= 0) db.shifts[idx] = { ...db.shifts[idx], ...shift }
    else db.shifts.push(shift)
  } else {
    shift._id = 's' + Date.now()
    shift.sort = db.shifts.length
    db.shifts.push(shift)
  }
  save(db)
  return shift
}

export async function deleteShift(id) {
  const db = load()
  db.shifts = db.shifts.filter((s) => s._id !== id && s.id !== id)
  // 级联：清空排班中对该班次的引用
  db.schedule = db.schedule.map((d) => ({
    ...d,
    workId: d.workId === id ? '' : d.workId,
    secondWorkId: d.secondWorkId === id ? '' : d.secondWorkId
  }))
  save(db)
  return true
}

export async function setDay(payload) {
  const db = load()
  const idx = db.schedule.findIndex((d) => d.date === payload.date)
  if (idx >= 0) db.schedule[idx] = { ...db.schedule[idx], ...payload }
  else db.schedule.push({ _id: 'd' + Date.now(), ...payload })
  save(db)
  return true
}

export async function saveAlarm(alarm) {
  const db = load()
  if (alarm._id) {
    const idx = db.alarms.findIndex((a) => a._id === alarm._id || a.id === alarm._id)
    if (idx >= 0) db.alarms[idx] = { ...db.alarms[idx], ...alarm }
  } else {
    alarm._id = 'a' + Date.now()
    db.alarms.push(alarm)
  }
  save(db)
  return alarm
}

export async function toggleAlarm(id, on) {
  const db = load()
  const a = db.alarms.find((x) => x._id === id || x.id === id)
  if (a) a.on = on
  save(db)
  return a
}

export async function deleteAlarm(id) {
  const db = load()
  db.alarms = db.alarms.filter((a) => a._id !== id && a.id !== id)
  save(db)
  return true
}

export async function saveProject(project) {
  const db = load()
  if (project._id || project.id) {
    const idx = db.projects.findIndex((p) => p._id === project._id || p.id === project._id || p.id === project.id)
    if (idx >= 0) db.projects[idx] = { ...db.projects[idx], ...project }
  } else {
    project._id = 'p' + Date.now()
    project.sort = project.sort === undefined ? db.projects.length : project.sort
    db.projects.push(project)
  }
  db.projects.sort((a, b) => (Number(a.sort) || 0) - (Number(b.sort) || 0))
  save(db)
  return project
}

export async function setCurrentProject(id) {
  const db = load()
  db.projects.forEach((p) => (p.current = p._id === id || p.id === id))
  db.config.currentProjectId = id
  save(db)
  return true
}

export async function deleteProject(id) {
  const db = load()
  db.projects = db.projects.filter((p) => p._id !== id && p.id !== id)
  save(db)
  return true
}

export async function saveConfig(config) {
  const db = load()
  db.config = { ...db.config, ...config }
  save(db)
  return db.config
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

export async function computeStat(start, end) {
  const db = load()
  const shiftMap = {}
  db.shifts.forEach((s) => (shiftMap[s._id] = s))
  const inRange = db.schedule.filter((d) => d.date >= start && d.date <= end)
  const counts = {}
  let totalHours = 0
  let restHours = 0
  const details = []
  inRange.forEach((d) => {
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
        w: '周' + '日一二三四五六'[new Date(d.date.replace(/-/g, '/')).getDay()],
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
    const s = db.shifts.find((x) => x.name === name)
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
   本地认证（uni-id 兼容演示实现）
   - 云端模式下由 cloudfunctions/user 用官方 uni-id-common 签发 JWT
   - 未绑定云空间时用本地实现，token 形如 local-xxxx，接口与云端一致
   ============================================================ */
const USERS_KEY = 'jy_local_users'
const TOKEN_KEY = 'uni_id_token'
const USER_KEY = 'uni_id_user'

function simpleHash(pwd) {
  let h = 5381
  const s = 'jy:' + String(pwd || '')
  for (let i = 0; i < s.length; i++) h = ((h << 5) + h + s.charCodeAt(i)) >>> 0
  return 'local$' + h.toString(16)
}

function loadUsers() {
  try {
    return uni.getStorageSync(USERS_KEY) || []
  } catch (e) {
    return []
  }
}

function saveUsers(list) {
  uni.setStorageSync(USERS_KEY, list)
}

function publicUser(u) {
  if (!u) return null
  return {
    _id: u._id,
    username: u.username,
    nickname: u.nickname || '',
    avatar: u.avatar || '',
    role: u.role || [],
    register_date: u.register_date,
    last_login_date: u.last_login_date
  }
}

function persistSession(user) {
  const token = 'local-' + Date.now().toString(36) + Math.random().toString(36).slice(2, 8)
  uni.setStorageSync(TOKEN_KEY, token)
  uni.setStorageSync(USER_KEY, publicUser(user))
  return { token, tokenExpired: Date.now() + 7 * 24 * 3600 * 1000, userInfo: publicUser(user) }
}

export async function authRegister(payload) {
  const username = String((payload && payload.username) || '').trim()
  const password = String((payload && payload.password) || '')
  if (!username || password.length < 6) throw new Error('用户名不能为空，密码至少 6 位')
  const users = loadUsers()
  if (users.some((u) => u.username === username)) throw new Error('该用户名已被注册')
  const user = {
    _id: 'u' + Date.now().toString(36),
    username,
    password: simpleHash(password),
    nickname: (payload && payload.nickname) || username,
    avatar: '',
    status: 0,
    role: [],
    register_date: Date.now(),
    last_login_date: Date.now()
  }
  users.push(user)
  saveUsers(users)
  return persistSession(user)
}

export async function authLogin(payload) {
  const username = String((payload && payload.username) || '').trim()
  const password = String((payload && payload.password) || '')
  const user = loadUsers().find((u) => u.username === username)
  if (!user) throw new Error('账号不存在')
  if (user.password !== simpleHash(password)) throw new Error('密码错误')
  user.last_login_date = Date.now()
  saveUsers(loadUsers().map((u) => (u._id === user._id ? user : u)))
  return persistSession(user)
}

export async function authLogout() {
  uni.removeStorageSync(TOKEN_KEY)
  uni.removeStorageSync(USER_KEY)
  return { ok: true }
}

export async function authGetInfo() {
  const u = uni.getStorageSync(USER_KEY)
  if (!u) throw new Error('未登录')
  return { userInfo: u }
}

export async function authUpdateInfo(payload) {
  const cur = uni.getStorageSync(USER_KEY)
  if (!cur) throw new Error('未登录')
  const users = loadUsers()
  const idx = users.findIndex((u) => u._id === cur._id)
  if (idx < 0) throw new Error('账号不存在')
  const next = Object.assign({}, users[idx], {
    nickname: payload && payload.nickname !== undefined ? payload.nickname : users[idx].nickname,
    avatar: payload && payload.avatar !== undefined ? payload.avatar : users[idx].avatar
  })
  users[idx] = next
  saveUsers(users)
  uni.setStorageSync(USER_KEY, publicUser(next))
  return { userInfo: publicUser(next) }
}

export async function authChangePassword(payload) {
  const cur = uni.getStorageSync(USER_KEY)
  if (!cur) throw new Error('未登录')
  const users = loadUsers()
  const idx = users.findIndex((u) => u._id === cur._id)
  if (idx < 0) throw new Error('账号不存在')
  if (users[idx].password !== simpleHash((payload && payload.oldPassword) || '')) throw new Error('原密码错误')
  users[idx].password = simpleHash((payload && payload.newPassword) || '')
  saveUsers(users)
  uni.removeStorageSync(TOKEN_KEY)
  uni.removeStorageSync(USER_KEY)
  return { ok: true }
}

/* ============================================================
   备份（本地 / 云模拟）
   ============================================================ */
const LOCAL_BACKUP_KEY = 'jy_local_backups'
const CLOUD_BACKUP_KEY = 'jy_cloud_backups'

function snapshotAll() {
  const db = load()
  return {
    shifts: db.shifts,
    schedule: db.schedule,
    alarms: db.alarms,
    projects: db.projects,
    config: db.config
  }
}

function backupKey(scope) {
  return scope === 'cloud' ? CLOUD_BACKUP_KEY : LOCAL_BACKUP_KEY
}

function countItems(snapshot) {
  return (
    (snapshot.shifts || []).length +
    (snapshot.schedule || []).length +
    (snapshot.alarms || []).length +
    (snapshot.projects || []).length
  )
}

export async function backupList(scope) {
  const list = uni.getStorageSync(backupKey(scope)) || []
  return list.sort((a, b) => b.created_at - a.created_at)
}

export async function backupCreate(payload) {
  const scope = (payload && payload.scope) === 'cloud' ? 'cloud' : 'local'
  const snapshot = snapshotAll()
  const item = {
    _id: 'b' + Date.now().toString(36),
    name: (payload && payload.name) || '备份 ' + new Date().toLocaleString('zh-CN'),
    scope,
    created_at: Date.now(),
    size: countItems(snapshot),
    snapshot
  }
  const list = uni.getStorageSync(backupKey(scope)) || []
  list.unshift(item)
  uni.setStorageSync(backupKey(scope), list)
  return item
}

export async function backupRestore(id) {
  const all = (uni.getStorageSync(LOCAL_BACKUP_KEY) || []).concat(uni.getStorageSync(CLOUD_BACKUP_KEY) || [])
  const item = all.find((x) => x._id === id)
  if (!item || !item.snapshot) throw new Error('备份不存在')
  const db = load()
  db.shifts = item.snapshot.shifts || db.shifts
  db.schedule = item.snapshot.schedule || db.schedule
  db.alarms = item.snapshot.alarms || db.alarms
  db.projects = item.snapshot.projects || db.projects
  db.config = Object.assign({}, db.config, item.snapshot.config || {})
  save(db)
  return { ok: true, restored: countItems(item.snapshot) }
}

export async function backupDelete(id) {
  for (const key of [LOCAL_BACKUP_KEY, CLOUD_BACKUP_KEY]) {
    const list = (uni.getStorageSync(key) || []).filter((x) => x._id !== id)
    uni.setStorageSync(key, list)
  }
  return { ok: true }
}

/* ============================================================
   WebDAV（本地模拟；云端用 uniCloud.httpclient 真实请求）
   ============================================================ */
const WEBDAV_KEY = 'jy_webdav_accounts'
const WEBDAV_FILE_KEY = 'jy_webdav_files'

export const WEBDAV_PLATFORMS = [
  { key: 'jianguoyun', name: '坚果云', url: 'https://dav.jianguoyun.com/dav/', tip: '账号 → 安全选项 → 添加应用密码' },
  { key: 'koofr', name: 'Koofr', url: 'https://app.koofr.net/dav/', tip: '使用应用专用密码' },
  { key: 'onedrive', name: 'OneDrive', url: 'https://dav.onedrive.com/', tip: '国际版 WebDAV 地址' },
  { key: 'googledrive', name: 'Google Drive', url: 'https://dav.google.com/', tip: '需开启 WebDAV 支持' },
  { key: 'custom', name: '自定义', url: '', tip: '填写完整的 WebDAV 根地址' }
]

function loadWebdav() {
  return uni.getStorageSync(WEBDAV_KEY) || []
}

export async function webdavAccounts() {
  return loadWebdav()
}

export async function webdavSaveAccount(account) {
  const list = loadWebdav()
  if (account._id) {
    const idx = list.findIndex((a) => a._id === account._id)
    if (idx >= 0) list[idx] = Object.assign({}, list[idx], account, { updated_at: Date.now() })
    uni.setStorageSync(WEBDAV_KEY, list)
    return list[idx] || account
  }
  const item = Object.assign({}, account, {
    _id: 'w' + Date.now().toString(36),
    status: 'disconnected',
    created_at: Date.now()
  })
  list.push(item)
  uni.setStorageSync(WEBDAV_KEY, list)
  return item
}

export async function webdavDeleteAccount(id) {
  uni.setStorageSync(WEBDAV_KEY, loadWebdav().filter((a) => a._id !== id))
  const files = uni.getStorageSync(WEBDAV_FILE_KEY) || {}
  delete files[id]
  uni.setStorageSync(WEBDAV_FILE_KEY, files)
  return { ok: true }
}

export async function webdavTestAccount(id) {
  const list = loadWebdav()
  const idx = list.findIndex((a) => a._id === id)
  if (idx < 0) throw new Error('账号不存在')
  if (!list[idx].baseUrl || !list[idx].username) throw new Error('请先填写地址与账号')
  // 本地模拟：始终成功（云端模式会真实请求 PROPFIND）
  list[idx].status = 'connected'
  list[idx].last_check = Date.now()
  uni.setStorageSync(WEBDAV_KEY, list)
  return { ok: true, status: 'connected', latency: 42, platform: list[idx].platform, path: list[idx].path || '/' }
}

function filesOf(accountId) {
  const all = uni.getStorageSync(WEBDAV_FILE_KEY) || {}
  if (!all[accountId]) {
    all[accountId] = [
      { name: '极简排班-备份', type: 'dir', path: '/极简排班-备份', children: [] },
      { name: '本机备份.json', type: 'file', path: '/本机备份.json', size: 12, created_at: Date.now() - 86400000 }
    ]
    uni.setStorageSync(WEBDAV_FILE_KEY, all)
  }
  return all
}

export async function webdavFiles(payload) {
  const accountId = (payload && payload.accountId) || ''
  const p = (payload && payload.path) || '/'
  const tree = filesOf(accountId)[accountId] || []
  if (p === '/' || !p) return tree
  const dir = findDir(tree, p)
  return (dir && dir.children) || []
}

function findDir(nodes, path) {
  for (const n of nodes) {
    if (n.path === path) return n
    if (n.children && n.children.length) {
      const found = findDir(n.children, path)
      if (found) return found
    }
  }
  return null
}

export async function webdavUpload(payload) {
  const accountId = (payload && payload.accountId) || ''
  const dirPath = (payload && payload.path) || '/'
  const snapshot = payload && payload.snapshot
  const all = filesOf(accountId)
  const tree = all[accountId]
  const dir = dirPath === '/' ? { children: tree } : findDir(tree, dirPath)
  if (!dir) throw new Error('目录不存在')
  if (!dir.children) dir.children = []
  const name = (payload && payload.name) || '排班备份-' + new Date().toISOString().slice(0, 10) + '.json'
  const file = {
    name,
    type: 'file',
    path: (dirPath === '/' ? '' : dirPath) + '/' + name,
    size: JSON.stringify(snapshot || {}).length,
    created_at: Date.now()
  }
  dir.children.push(file)
  uni.setStorageSync(WEBDAV_FILE_KEY, all)
  return file
}

export async function webdavDownload(payload) {
  // 本地模拟：返回最近一次本地/云备份快照
  const list = (uni.getStorageSync(LOCAL_BACKUP_KEY) || []).concat(uni.getStorageSync(CLOUD_BACKUP_KEY) || [])
  if (!list.length) throw new Error('没有可下载的备份')
  return { snapshot: list[0].snapshot, name: (payload && payload.path) || 'backup.json' }
}

export async function webdavDeleteFile(payload) {
  const accountId = (payload && payload.accountId) || ''
  const target = payload && payload.path
  const all = filesOf(accountId)
  const prune = (nodes) => nodes.filter((n) => {
    if (n.path === target) return false
    if (n.children) n.children = prune(n.children)
    return true
  })
  all[accountId] = prune(all[accountId])
  uni.setStorageSync(WEBDAV_FILE_KEY, all)
  return { ok: true }
}

/* ============================================================
   反馈
   ============================================================ */
const FEEDBACK_KEY = 'jy_local_feedback'

export async function submitFeedback(payload) {
  const content = String((payload && payload.content) || '').trim()
  if (content.length < 5) throw new Error('请至少输入 5 个字')
  const list = uni.getStorageSync(FEEDBACK_KEY) || []
  const item = {
    _id: 'f' + Date.now().toString(36),
    type: (payload && payload.type) || 'feedback',
    content,
    contact: (payload && payload.contact) || '',
    created_at: Date.now(),
    status: 0
  }
  list.unshift(item)
  uni.setStorageSync(FEEDBACK_KEY, list)
  return item
}

/* ============================================================
   会员（赞助）/ 订单（本地 mock）
   ============================================================ */
import { VIP_PLANS, VIP_RIGHTS } from '@/data/vip-plans.js'

const VIP_MEMBER_KEY = 'jy_vip_membership'
const VIP_ORDER_KEY = 'jy_vip_orders'

function vipMemberRaw() {
  try { return uni.getStorageSync(VIP_MEMBER_KEY) || null } catch (e) { return null }
}

export async function vipPlans() {
  return { plans: VIP_PLANS, rights: VIP_RIGHTS, configured: false, mock: true, mockAllowed: true }
}

export async function vipStatus() {
  const m = vipMemberRaw()
  return {
    loggedIn: true,
    active: !!(m && Number(m.expireAt) > Date.now()),
    expireAt: (m && m.expireAt) || 0,
    planId: (m && m.planId) || ''
  }
}

export async function vipCreateOrder(payload) {
  const plan = VIP_PLANS.find((p) => p.id === (payload && payload.planId)) || VIP_PLANS[0]
  const order = {
    outTradeNo: 'LOCAL' + Date.now() + Math.random().toString(36).slice(2, 6).toUpperCase(),
    planId: plan.id,
    amount: plan.price,
    subject: '极简排班会员（' + plan.unit + '）',
    status: 'pending',
    createdAt: Date.now()
  }
  const list = uni.getStorageSync(VIP_ORDER_KEY) || []
  list.unshift(order)
  uni.setStorageSync(VIP_ORDER_KEY, list)
  return { configured: false, mock: true, order }
}

export async function vipMockPay(payload) {
  const outTradeNo = payload && payload.outTradeNo
  const list = uni.getStorageSync(VIP_ORDER_KEY) || []
  const order = list.find((o) => o.outTradeNo === outTradeNo)
  if (!order) throw new Error('订单不存在')
  order.status = 'paid'
  order.paidAt = Date.now()
  uni.setStorageSync(VIP_ORDER_KEY, list)
  const plan = VIP_PLANS.find((p) => p.id === order.planId) || VIP_PLANS[0]
  const cur = vipMemberRaw()
  const base = Math.max(Date.now(), (cur && Number(cur.expireAt)) || 0)
  const expireAt = plan.days >= 36500 ? new Date('2099-12-31T00:00:00+08:00').getTime() : base + plan.days * 86400000
  const member = { expireAt, planId: plan.id, updatedAt: Date.now() }
  uni.setStorageSync(VIP_MEMBER_KEY, member)
  return { active: true, loggedIn: true, expireAt, planId: plan.id }
}

export async function vipQueryOrder(payload) {
  const list = uni.getStorageSync(VIP_ORDER_KEY) || []
  const order = list.find((o) => o.outTradeNo === (payload && payload.outTradeNo))
  if (!order) throw new Error('订单不存在')
  return { status: order.status, paidAt: order.paidAt || 0, amount: order.amount, planId: order.planId }
}
