'use strict'
/**
 * user 云函数：uni-id 登录 / 注册 / 会话管理
 *
 * 入参: { action, deviceId?, uniIdToken?, ...payload }
 * 出参: { code: 0, data } / { code: 非0, message }
 *
 * actions:
 *   auth.register        { username, password, nickname? }
 *   auth.login           { username, password }
 *   auth.logout
 *   auth.getInfo
 *   auth.updateInfo      { nickname?, avatar? }
 *   auth.changePassword  { oldPassword, newPassword }
 *
 * token 由官方公共模块 uni-id-common(v1.0.16) 签发/校验：
 *   - 依赖 cloudfunctions/common/uni-id-common + uni-config-center（uni-id/config.json）
 *   - JWT 载荷 { uid, role, permission, iat, exp }，HS256 + tokenSecret
 *
 * 密码存储：crypto.pbkdf2Sync(sha256, 随机 salt, 100000, 32)，格式
 *   pbkdf2:sha256:<salt>:<hash>（salt/hash 均为 hex）
 *
 * 游客数据迁移：登录/注册成功后，若账号下还没有排班数据，则把当前设备
 *   （deviceId）在 jy_shift / jy_schedule / jy_alarm / jy_project / jy_config
 *   中的游客数据归属改为 uid（仅改归属，不复制、不删除内容）。
 */
const crypto = require('crypto')
const uniIdCommon = require('uni-id-common')

const db = uniCloud.database()
const _ = db.command
const usersCol = db.collection('uni-id-users')
const guardCol = db.collection('jy_auth_guard')

const PBKDF2_ITERATIONS = 100000
const PBKDF2_KEYLEN = 32
const PBKDF2_DIGEST = 'sha256'

/** 游客排班数据集合（与 workplan 约定一致） */
const GUEST_DATA_COLLECTIONS = ['jy_shift', 'jy_schedule', 'jy_alarm', 'jy_project', 'jy_config']

const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })

/* ---------------- 登录失败限流 ---------------- */
const LOGIN_MAX_FAIL = 5
const LOGIN_WINDOW_MS = 15 * 60 * 1000
const LOGIN_LOCK_MS = 15 * 60 * 1000

function clientIp(context) {
  const c = context || {}
  return String(c.CLIENTIP || c.clientIP || c.clientIp || 'unknown')
}
function guardKey(kind, account, context) {
  return crypto.createHash('sha256').update(kind + '|' + String(account || '') + '|' + clientIp(context)).digest('hex')
}
async function readGuard(key) {
  try {
    const r = await guardCol.where({ key }).limit(1).get()
    return (r.data || [])[0] || null
  } catch (e) { return null }
}
async function checkLoginGuard(account, context) {
  const key = guardKey('login', account, context)
  const doc = await readGuard(key)
  const t = Date.now()
  if (doc && doc.lockedUntil && doc.lockedUntil > t) {
    return { blocked: true, message: '登录尝试次数过多，请15分钟后再试' }
  }
  if (doc && doc.firstAt && t - doc.firstAt > LOGIN_WINDOW_MS) return { blocked: false, key, doc: null }
  return { blocked: false, key, doc }
}
async function recordLoginFailure(account, context) {
  const key = guardKey('login', account, context)
  const doc = await readGuard(key)
  const t = Date.now()
  if (!doc || !doc.firstAt || t - doc.firstAt > LOGIN_WINDOW_MS) {
    await guardCol.add({ key, count: 1, firstAt: t, lockedUntil: 0, updatedAt: t })
    return
  }
  const count = Number(doc.count || 0) + 1
  const lockedUntil = count >= LOGIN_MAX_FAIL ? t + LOGIN_LOCK_MS : 0
  await guardCol.doc(doc._id).update({ count, lockedUntil, updatedAt: t })
}
async function clearLoginGuard(account, context) {
  const key = guardKey('login', account, context)
  try {
    const r = await guardCol.where({ key }).limit(1).get()
    if ((r.data || [])[0]) await guardCol.doc(r.data[0]._id).remove()
  } catch (e) {}
}

/* ------------------------------------------------------------------ */
/* uni-id 实例与 token                                                 */
/* ------------------------------------------------------------------ */

/**
 * 创建 uni-id 实例。
 * 优先用 uniCloud.getClientInfo()（部分运行时提供）；云函数环境通常没有该 API，
 * 因此再用 exports.main(event, context) 的 context 兜底（APPID/PLATFORM/LOCALE 等）。
 */
function buildClientInfo(context) {
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

/** uni-id-common 出现业务错误时（被 Proxy 包装）会以返回值而非 throw 形式给出 */
function isUniIdError(r) {
  return !!(r && r.errCode !== undefined && r.errCode !== 0)
}

/** 解出 jwt 的 iat（秒） */
function tokenIat(token) {
  try {
    const part = String(token || '').split('.')[1] || ''
    const json = Buffer.from(part.replace(/-/g, '+').replace(/_/g, '/'), 'base64').toString('utf8')
    return Number(JSON.parse(json).iat) || 0
  } catch (e) {
    return 0
  }
}

/**
 * 同一秒内「退出/改密 → 立即重新登录」的边界处理：
 * valid_token_date 是毫秒，token.iat 是秒（向下取整），新 token 可能被旧值误伤。
 * 这里把 valid_token_date 对齐到新 token 的 iat（只会用到 logout/改密后 1 秒内的场景）。
 */
async function normalizeValidDateAfterIssue(uid, token) {
  const iat = tokenIat(token)
  if (!iat) return
  const user = await getUserById(uid)
  if (!user) return
  if (user.valid_token_date && user.valid_token_date > iat * 1000) {
    await usersCol.doc(uid).update({ valid_token_date: iat * 1000 })
  }
}

async function createTokenFor(uid, context) {
  const ins = buildClientInfo(context)
  let r
  try {
    r = await ins.createToken({ uid })
  } catch (e) {
    r = { errCode: 'uni-id-create-token-failed', errMsg: (e && (e.errMsg || e.message)) || String(e) }
  }
  if (isUniIdError(r) || !r || !r.token) {
    return {
      error: (r && (r.errMsg || r.message)) || 'token 签发失败，请稍后重试'
    }
  }
  return { token: r.token, tokenExpired: r.tokenExpired }
}

/**
 * 校验 token，返回 { uid } / { error }
 * autoRefresh: false — 只校验不续签，续签交给客户端下次登录（避免隐式写库）
 */
async function checkToken(token, context) {
  if (!token) return { error: '请先登录' }
  const ins = buildClientInfo(context)
  let r
  try {
    r = await ins.checkToken(token, { autoRefresh: false })
  } catch (e) {
    r = e
  }
  if (isUniIdError(r) || !r || !r.uid) {
    return { error: '登录状态已失效，请重新登录' }
  }
  return { uid: r.uid, payload: r }
}

/**
 * 取当前登录用户。
 * 注意：uni-id-common v1.0.16 的 checkToken 在 autoRefresh:false 时只做 JWT 验签
 * （role/permission 缓存在 token 里，不会查库），因此这里补查用户记录，
 * 让「退出登录 / 修改密码写入 valid_token_date」立即生效。
 */
async function requireUser(event, context) {
  const token = event.uniIdToken || event.token || ''
  const checked = await checkToken(token, context)
  if (checked.error) return { error: checked.error }
  const user = await getUserById(checked.uid)
  if (!user) return { error: '账号不存在' }
  if (user.status === 1) return { error: '该账号已被封禁' }
  if (user.status === 4) return { error: '该账号已注销' }
  const iat = 1000 * Number((checked.payload && checked.payload.iat) || 0)
  if (user.valid_token_date && user.valid_token_date > iat) {
    return { error: '登录状态已失效，请重新登录' }
  }
  if (Array.isArray(user.token) && user.token.length && user.token.indexOf(token) === -1) {
    return { error: '登录状态已失效，请重新登录' }
  }
  return { user }
}

/* ------------------------------------------------------------------ */
/* 密码                                                                */
/* ------------------------------------------------------------------ */

function hashPassword(password) {
  const salt = crypto.randomBytes(16).toString('hex')
  const hash = crypto
    .pbkdf2Sync(String(password), salt, PBKDF2_ITERATIONS, PBKDF2_KEYLEN, PBKDF2_DIGEST)
    .toString('hex')
  return 'pbkdf2:' + PBKDF2_DIGEST + ':' + salt + ':' + hash
}

/**
 * 校验密码。兼容两种历史格式：
 *   pbkdf2:sha256:<salt>:<hash>（本工程）
 *   pbkdf2:sha256$<salt>$<hash>（schema 注释里的旧写法）
 */
function verifyPassword(password, stored) {
  const m = /^pbkdf2:sha256[:$]([0-9a-fA-F]{16,64})[:$]([0-9a-fA-F]{64})$/.exec(String(stored || ''))
  if (!m) return false
  const salt = m[1]
  const expected = Buffer.from(m[2], 'hex')
  const actual = crypto.pbkdf2Sync(String(password), salt, PBKDF2_ITERATIONS, PBKDF2_KEYLEN, PBKDF2_DIGEST)
  if (actual.length !== expected.length) return false
  return crypto.timingSafeEqual(actual, expected)
}

function validateUsername(username) {
  if (!username) return '请输入账号'
  if (username.length < 3 || username.length > 32) return '账号长度需为 3-32 个字符'
  if (!/^[A-Za-z0-9_@.\u4e00-\u9fa5-]+$/.test(username)) return '账号仅支持中英文、数字及 _ @ . -'
  return ''
}

function validatePassword(password) {
  if (typeof password !== 'string' || password.length < 6) return '密码长度不能少于 6 位'
  if (password.length > 64) return '密码长度不能超过 64 位'
  return ''
}

/* ------------------------------------------------------------------ */
/* 用户信息序列化                                                      */
/* ------------------------------------------------------------------ */

function publicUser(user) {
  if (!user) return null
  return {
    _id: user._id,
    username: user.username || '',
    nickname: user.nickname || user.username || '',
    avatar: user.avatar || '',
    status: typeof user.status === 'number' ? user.status : 0,
    role: user.role || [],
    register_date: user.register_date || 0,
    last_login_date: user.last_login_date || 0
  }
}

async function getUserById(uid) {
  const res = await usersCol.doc(uid).get()
  return (res.data || [])[0] || null
}

/* ------------------------------------------------------------------ */
/* 游客数据迁移                                                        */
/* ------------------------------------------------------------------ */

/**
 * 账号下（5 个业务集合）是否已有数据。任一集合有数据则视为“已有数据”。
 */
async function accountHasData(uid) {
  for (const col of GUEST_DATA_COLLECTIONS) {
    const res = await db.collection(col).where({ owner: uid }).count()
    if (res.total > 0) return true
  }
  return false
}

/**
 * 把当前设备的游客数据归属改为 uid。
 * 只处理「没有 owner 字段」或「owner == deviceId」的文档，避免误迁移其他账号数据。
 * 迁移后移除 deviceId 字段，避免退出登录后游客态读到账号数据。
 */
async function migrateGuestData(event, uid) {
  const deviceId = event && event.deviceId
  if (!deviceId) return 0
  const hasData = await accountHasData(uid)
  if (hasData) return 0
  let migrated = 0
  for (const col of GUEST_DATA_COLLECTIONS) {
    let res
    try {
      res = await db.collection(col).where(_.or([{ owner: deviceId }, { deviceId }])).limit(1000).get()
    } catch (e) {
      console.warn('[user] migrate query failed:', col, e && e.message)
      continue
    }
    const list = (res.data || []).filter((doc) => !doc.owner || doc.owner === deviceId)
    for (const doc of list) {
      try {
        await db.collection(col).doc(doc._id).update({ owner: uid, deviceId: _.remove() })
        migrated += 1
      } catch (e) {
        console.warn('[user] migrate update failed:', col, doc._id, e && e.message)
      }
    }
  }
  if (migrated) console.log('[user] migrated guest data to uid:', uid, 'docs:', migrated)
  return migrated
}

/* ------------------------------------------------------------------ */
/* actions                                                             */
/* ------------------------------------------------------------------ */

async function register(event, context) {
  const username = String(event.username || '').trim()
  const password = String(event.password || '')
  const nickname = String(event.nickname || '').trim() || username

  const nameError = validateUsername(username)
  if (nameError) return fail(nameError)
  const pwdError = validatePassword(password)
  if (pwdError) return fail(pwdError)
  if (nickname.length > 20) return fail('昵称不能超过 20 个字符')

  const dup = await usersCol.where({ username }).count()
  if (dup.total > 0) return fail('该账号已注册，请直接登录')

  const now = Date.now()
  const doc = {
    username,
    password: hashPassword(password),
    nickname,
    avatar: '',
    status: 0,
    role: [],
    permission: [],
    token: [],
    valid_token_date: 0,
    register_date: now,
    last_login_date: now
  }
  let addRes
  try {
    addRes = await usersCol.add(doc)
  } catch (e) {
    // 唯一索引冲突（并发注册）
    if (/duplicate|E11000|exists/i.test(String(e && e.message))) return fail('该账号已注册，请直接登录')
    throw e
  }
  const uid = addRes.id

  const tokenRes = await createTokenFor(uid, context)
  if (tokenRes.error) return fail(tokenRes.error)
  await normalizeValidDateAfterIssue(uid, tokenRes.token)

  // 注册即登录：同样把当前设备的游客排班数据迁移到新账号
  try {
    await migrateGuestData(event, uid)
  } catch (e) {
    console.warn('[user] migrate after register failed:', e && e.message)
  }

  const user = await getUserById(uid)
  return ok({
    token: tokenRes.token,
    tokenExpired: tokenRes.tokenExpired,
    userInfo: publicUser(user || Object.assign({ _id: uid }, doc))
  })
}

async function login(event, context) {
  const username = String(event.username || '').trim()
  const password = String(event.password || '')
  if (!username || !password) return fail('请输入账号和密码')

  const guard = await checkLoginGuard(username, context)
  if (guard.blocked) return fail(guard.message)

  const res = await usersCol.where({ username }).limit(1).get()
  const user = (res.data || [])[0]
  // 账号不存在与密码错误统一提示，避免账号枚举
  if (!user || !verifyPassword(password, user.password)) {
    await recordLoginFailure(username, context)
    return fail('账号或密码错误')
  }
  if (user.status === 1) return fail('该账号已被封禁')
  if (user.status === 4) return fail('该账号已注销')

  await clearLoginGuard(username, context)
  const tokenRes = await createTokenFor(user._id, context)
  if (tokenRes.error) return fail(tokenRes.error)
  await normalizeValidDateAfterIssue(user._id, tokenRes.token)

  // 游客数据迁移：失败不影响登录
  try {
    await migrateGuestData(event, user._id)
  } catch (e) {
    console.warn('[user] migrate guest data failed:', e && e.message)
  }

  const fresh = (await getUserById(user._id)) || user
  return ok({
    token: tokenRes.token,
    tokenExpired: tokenRes.tokenExpired,
    userInfo: publicUser(fresh)
  })
}

async function logout(event, context) {
  const ctx = await requireUser(event, context)
  if (ctx.error) return fail(ctx.error)
  // 使当前用户已签发的 token 全部失效
  await usersCol.doc(ctx.user._id).update({ valid_token_date: Date.now() })
  return ok({ ok: true })
}

async function getInfo(event, context) {
  const ctx = await requireUser(event, context)
  if (ctx.error) return fail(ctx.error)
  return ok({ userInfo: publicUser(ctx.user) })
}

async function updateInfo(event, context) {
  const ctx = await requireUser(event, context)
  if (ctx.error) return fail(ctx.error)

  const payload = {}
  if (event.nickname !== undefined) {
    const nickname = String(event.nickname || '').trim()
    if (!nickname) return fail('昵称不能为空')
    if (nickname.length > 20) return fail('昵称不能超过 20 个字符')
    payload.nickname = nickname
  }
  if (event.avatar !== undefined) {
    const avatar = String(event.avatar || '')
    if (avatar.length > 500) return fail('头像地址过长')
    payload.avatar = avatar
  }
  if (!Object.keys(payload).length) return fail('没有需要更新的内容')

  await usersCol.doc(ctx.user._id).update(payload)
  const fresh = await getUserById(ctx.user._id)
  return ok({ userInfo: publicUser(fresh) })
}

async function changePassword(event, context) {
  const ctx = await requireUser(event, context)
  if (ctx.error) return fail(ctx.error)

  const oldPassword = String(event.oldPassword || '')
  const newPassword = String(event.newPassword || '')
  if (!oldPassword) return fail('请输入原密码')
  const pwdError = validatePassword(newPassword)
  if (pwdError) return fail(pwdError)
  if (!verifyPassword(oldPassword, ctx.user.password)) return fail('原密码错误')
  if (oldPassword === newPassword) return fail('新密码不能与原密码相同')

  await usersCol.doc(ctx.user._id).update({
    password: hashPassword(newPassword),
    // 改密后所有旧 token 失效；客户端需重新登录
    valid_token_date: Date.now()
  })
  return ok({ ok: true })
}

/* ------------------------------------------------------------------ */

const handlers = {
  'auth.register': register,
  'auth.login': login,
  'auth.logout': logout,
  'auth.getInfo': getInfo,
  'auth.updateInfo': updateInfo,
  'auth.changePassword': changePassword
}

exports.main = async (event, context) => {
  const action = event && event.action
  const handler = handlers[action]
  if (!handler) return fail('未知 action: ' + action)
  try {
    return await handler(event || {}, context || {})
  } catch (e) {
    console.error('[user] action failed:', action, e)
    return fail((e && (e.errMsg || e.message)) || String(e))
  }
}
