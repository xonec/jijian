'use strict'
/**
 * webdav 云函数：WebDAV 云备份账号 + 网盘文件读写
 *
 * 入参: { action, deviceId, userId, uniIdToken, ...payload }
 * 出参: { code: 0, data } / { code: 非0, message }
 *
 * 数据归属 owner = 有效 token 的 uid，否则 deviceId。
 * 账号密码使用 AES-256-GCM 加密后写入 jy_webdav.password；
 * 密钥优先取 uni-config-center 的 uni-id/config.json tokenSecret 做 sha256 派生，
 * 配置读取失败时使用固定派生（见 webdavKey），仅用于保证功能可用。
 *
 * WebDAV 动作均为真实请求（uniCloud.httpclient）：
 *   testAccount -> PROPFIND Depth 0
 *   files       -> PROPFIND Depth 1（手写正则解析 multistatus）
 *   upload      -> PUT JSON
 *   download    -> GET JSON
 *   deleteFile  -> DELETE
 */
const crypto = require('crypto')

const db = uniCloud.database()
const C = {
  webdav: 'jy_webdav'
}

const PROPFIND_BODY = '<?xml version="1.0" encoding="utf-8"?>' +
  '<D:propfind xmlns:D="DAV:"><D:prop>' +
  '<D:displayname/><D:getcontentlength/><D:getlastmodified/><D:resourcetype/>' +
  '</D:prop></D:propfind>'

const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })

function errorText(e) {
  if (!e) return '未知错误'
  return e.message || e.errMsg || e.msg || String(e)
}

/* ---------------- 登录态 / 归属 ---------------- */

async function resolveUid(event) {
  const token = event && event.uniIdToken
  if (!token) return ''
  try {
    const uniIdCommon = require('uni-id-common')
    const clientInfo = (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {}
    const ins = uniIdCommon.createInstance({ clientInfo })
    const result = await ins.checkToken(token, { autoRefresh: false })
    if (result && result.uid && !result.errCode) return result.uid
  } catch (e) {
    // token 无效 / 过期时，按游客（deviceId）处理
  }
  return ''
}

function ownerCond(uid, deviceId) {
  if (uid) return { user_id: uid }
  return { deviceId, user_id: '' }
}

function ownerFields(uid, deviceId) {
  if (uid) return { user_id: uid, deviceId }
  return { user_id: '', deviceId }
}

/* ---------------- 密码加解密 ---------------- */

let cachedKey = null

function webdavKey() {
  if (cachedKey) return cachedKey
  let secret = ''
  try {
    const createConfig = require('uni-config-center')
    const center = createConfig({ pluginId: 'uni-id' })
    let conf = center.config()
    if (Array.isArray(conf)) conf = conf.find((item) => item && item.tokenSecret) || conf[0]
    secret = (conf && conf.tokenSecret) || ''
  } catch (e) {
    secret = ''
  }
  if (!secret) {
    // 配置缺失时的固定派生：功能可用，但生产环境请补齐 uni-id/config.json 的 tokenSecret
    secret = 'jianyun-webdav-fixed-secret-v1'
    console.warn('[webdav] 未读取到 uni-config-center 的 tokenSecret，使用固定派生密钥')
  }
  cachedKey = crypto.createHash('sha256').update('jy-webdav|' + secret).digest()
  return cachedKey
}

function encryptPassword(password) {
  const iv = crypto.randomBytes(12)
  const cipher = crypto.createCipheriv('aes-256-gcm', webdavKey(), iv)
  const encrypted = Buffer.concat([cipher.update(String(password), 'utf8'), cipher.final()])
  const tag = cipher.getAuthTag()
  return ['v1', iv.toString('base64'), tag.toString('base64'), encrypted.toString('base64')].join(':')
}

function decryptPassword(payload) {
  if (!payload) return ''
  const text = String(payload)
  // 兼容历史明文数据（旧数据首次保存后会自动升级为 v1 密文）
  if (text.indexOf('v1:') !== 0) return text
  const parts = text.split(':')
  if (parts.length !== 4) throw new Error('云备份账号密码数据已损坏，请重新保存账号')
  try {
    const decipher = crypto.createDecipheriv('aes-256-gcm', webdavKey(), Buffer.from(parts[1], 'base64'))
    decipher.setAuthTag(Buffer.from(parts[2], 'base64'))
    return Buffer.concat([
      decipher.update(Buffer.from(parts[3], 'base64')),
      decipher.final()
    ]).toString('utf8')
  } catch (e) {
    throw new Error('云备份账号密码解密失败，请重新保存账号')
  }
}

/* ---------------- 路径 / URL ---------------- */

function normalizePath(value) {
  let path = String(value === undefined || value === null ? '/' : value).trim()
  if (!path) path = '/'
  if (path.charAt(0) !== '/') path = '/' + path
  path = path.replace(/\/{2,}/g, '/')
  if (path.length > 1) path = path.replace(/\/+$/, '')
  return path || '/'
}

function trimBase(value) {
  return String(value || '').trim().replace(/\/+$/, '')
}

function normalizeBaseUrl(value) {
  const base = trimBase(value)
  return base ? base + '/' : ''
}

function joinRemotePath(dir, name) {
  const d = normalizePath(dir)
  const n = String(name || '').replace(/^\/+/, '')
  return normalizePath(d === '/' ? '/' + n : d + '/' + n)
}

function parentPath(path) {
  if (!path || path === '/') return '/'
  const index = path.lastIndexOf('/')
  return index <= 0 ? '/' : path.slice(0, index)
}

function safeDecode(value) {
  try {
    return decodeURIComponent(String(value || ''))
  } catch (e) {
    return String(value || '')
  }
}

function encodeRemotePath(path) {
  return String(path || '/').split('/').map((seg) => encodeURIComponent(seg)).join('/')
}

function buildUrl(account, relPath, isDir) {
  const base = trimBase(account.baseUrl)
  const root = normalizePath(account.path || '/')
  const relative = normalizePath(relPath || '/')
  // 页面里的路径均相对账号根路径；拼 URL 时补上 account.path
  const full = root === '/' ? relative : normalizePath(root + (relative === '/' ? '' : relative))
  let url = base + (full === '/' ? '/' : encodeRemotePath(full))
  if (isDir && full !== '/' && url.charAt(url.length - 1) !== '/') url += '/'
  return url
}

function remoteBasePath(account) {
  let basePath = '/'
  try {
    const url = new URL(normalizeBaseUrl(account.baseUrl))
    basePath = safeDecode(url.pathname || '/')
  } catch (e) {
    basePath = '/'
  }
  const root = normalizePath(account.path || '/')
  return normalizePath(basePath + (root === '/' ? '' : root))
}

/* ---------------- HTTP / WebDAV ---------------- */

function statusOf(res) {
  return Number((res && (res.status || res.statusCode)) || 0)
}

function responseText(res) {
  const data = res && res.data
  if (data === undefined || data === null) return ''
  if (Buffer.isBuffer(data)) return data.toString('utf8')
  return typeof data === 'string' ? data : String(data)
}

async function davRequest(account, method, relPath, options) {
  const opts = options || {}
  const password = decryptPassword(account.password)
  const headers = Object.assign({
    Authorization: 'Basic ' + Buffer.from(String(account.username || '') + ':' + password, 'utf8').toString('base64'),
    'User-Agent': 'JianYun-UniApp-WebDAV/1.0'
  }, opts.headers || {})
  const request = {
    method,
    headers,
    dataType: 'text',
    timeout: 20000
  }
  if (opts.data !== undefined) request.data = opts.data
  try {
    return await uniCloud.httpclient.request(buildUrl(account, relPath, !!opts.isDir), request)
  } catch (e) {
    throw new Error('连接失败：' + errorText(e))
  }
}

function httpMessage(status, action) {
  if (status === 401) return '账号或密码错误（HTTP 401）'
  if (status === 403) return '没有访问权限（HTTP 403）'
  if (status === 404) {
    return (action === '连接' ? '地址或根路径不存在' : '文件或目录不存在') + '（HTTP 404）'
  }
  if (status === 405) return '服务器不支持 WebDAV（HTTP 405）'
  if (status === 409) return '目标目录不存在（HTTP 409）'
  if (status === 423) return '文件被占用或锁定（HTTP 423）'
  if (status === 507) return '网盘空间不足（HTTP 507）'
  if (status >= 500) return '网盘服务器异常（HTTP ' + status + '）'
  return action + '失败（HTTP ' + status + '）'
}

/* ---------------- XML 解析（手写正则，兼容 D:/d:/无前缀） ---------------- */

function decodeXml(value) {
  return String(value || '').replace(/&(#x?[0-9a-fA-F]+|[a-zA-Z]+);/g, (match, code) => {
    if (code.charAt(0) === '#') {
      const hex = code.charAt(1) === 'x' || code.charAt(1) === 'X'
      const num = parseInt(code.slice(hex ? 2 : 1), hex ? 16 : 10)
      return isNaN(num) ? match : String.fromCharCode(num)
    }
    const map = { amp: '&', lt: '<', gt: '>', quot: '"', apos: "'" }
    return map[code] || match
  })
}

function tagText(block, tag) {
  const re = new RegExp(
    '<(?:[A-Za-z0-9]+:)?' + tag + '\\b[^>]*>([\\s\\S]*?)<\\/(?:[A-Za-z0-9]+:)?' + tag + '>',
    'i'
  )
  const match = re.exec(block)
  return match ? decodeXml(match[1]).trim() : ''
}

function successfulPropstat(response) {
  const re = /<(?:[A-Za-z0-9]+:)?propstat\b[^>]*>[\s\S]*?<\/(?:[A-Za-z0-9]+:)?propstat>/gi
  let hasPropstat = false
  let match
  while ((match = re.exec(response))) {
    hasPropstat = true
    const block = match[0]
    const status = tagText(block, 'status')
    if (!status || /\b200\b/.test(status)) return block
  }
  // 只有 404/403 等 propstat 时视为不可用条目；完全没有 propstat 时退回整个 response
  return hasPropstat ? '' : response
}

function toAppPath(pathname, basePath) {
  const path = normalizePath(pathname)
  if (basePath === '/') return path
  if (path === basePath) return '/'
  if (path.indexOf(basePath + '/') === 0) return normalizePath(path.slice(basePath.length))
  return ''
}

function parseDavResponses(xml, account, currentPath) {
  const responses = String(xml || '').match(
    /<(?:[A-Za-z0-9]+:)?response\b[^>]*>[\s\S]*?<\/(?:[A-Za-z0-9]+:)?response>/gi
  ) || []
  const basePath = remoteBasePath(account)
  const current = normalizePath(currentPath)
  const parent = parentPath(current)
  const result = []

  responses.forEach((response) => {
    const href = tagText(response, 'href')
    if (!href) return

    let pathname = ''
    try {
      pathname = new URL(href, normalizeBaseUrl(account.baseUrl)).pathname
    } catch (e) {
      pathname = href.split('?')[0]
    }
    pathname = safeDecode(pathname)

    const appPath = toAppPath(pathname, basePath)
    if (!appPath) return
    if (appPath === current) return
    if (current !== '/' && appPath === parent) return
    if (current !== '/' && appPath.indexOf(current + '/') !== 0) return
    const relativePath = current === '/' ? appPath.slice(1) : appPath.slice(current.length + 1)
    if (!relativePath || relativePath.indexOf('/') >= 0) return

    const prop = successfulPropstat(response)
    if (!prop) return
    const isDir = /<(?:[A-Za-z0-9]+:)?collection\b/i.test(prop) || /\/$/.test(href)
    const sizeText = tagText(prop, 'getcontentlength')
    const size = sizeText === '' ? null : Number(sizeText)
    const modified = tagText(prop, 'getlastmodified')
    const displayName = tagText(prop, 'displayname')
    const fallbackName = appPath.split('/').filter(Boolean).pop() || ''
    const name = displayName || fallbackName
    if (!name) return

    result.push({
      name,
      type: isDir ? 'dir' : 'file',
      path: appPath,
      size: isFinite(size) && size >= 0 ? size : null,
      modified
    })
  })

  result.sort((a, b) => {
    if (a.type !== b.type) return a.type === 'dir' ? -1 : 1
    return a.name < b.name ? -1 : a.name > b.name ? 1 : 0
  })
  return result
}

/* ---------------- 账号 ---------------- */

async function findAccount(id, uid, deviceId) {
  const accountId = String(id || '')
  if (!accountId) throw new Error('缺少云备份账号ID')
  const res = await db.collection(C.webdav)
    .where(Object.assign({ _id: accountId }, ownerCond(uid, deviceId)))
    .get()
  const account = (res.data || [])[0]
  if (!account) throw new Error('云备份账号不存在或无权访问')
  return account
}

function publicAccount(doc) {
  const account = Object.assign({}, doc)
  delete account.password
  account.status = doc.status === 'connected' ? 'connected' : 'disconnected'
  account.hasPassword = !!doc.password
  return account
}

async function updateStatus(account, status) {
  try {
    await db.collection(C.webdav).doc(account._id).update({
      status,
      last_check: Date.now()
    })
  } catch (e) {
    // 状态回写失败不影响主流程
  }
}

async function listAccounts(uid, deviceId) {
  const res = await db.collection(C.webdav)
    .where(ownerCond(uid, deviceId))
    .orderBy('created_at', 'asc')
    .get()
  return (res.data || []).map(publicAccount)
}

async function saveAccount(event, uid, deviceId) {
  const input = event.account || {}
  const platform = String(input.platform || 'custom').trim().slice(0, 30) || 'custom'
  const name = String(input.name || '').trim().slice(0, 40)
  const rawBaseUrl = String(input.baseUrl || '').trim().slice(0, 300)
  if (!rawBaseUrl) throw new Error('请填写 WebDAV 地址')
  if (!/^https?:\/\//i.test(rawBaseUrl)) throw new Error('地址需以 http:// 或 https:// 开头')
  let parsed
  try {
    parsed = new URL(rawBaseUrl)
  } catch (e) {
    throw new Error('WebDAV 地址格式不正确')
  }
  if (parsed.protocol !== 'http:' && parsed.protocol !== 'https:') {
    throw new Error('仅支持 http/https 地址')
  }
  const baseUrl = normalizeBaseUrl(rawBaseUrl)
  const username = String(input.username || '').trim().slice(0, 120)
  if (!username) throw new Error('请填写用户名')
  const path = normalizePath(input.path || '/')
  const password = input.password ? String(input.password) : ''
  if (password.length > 200) throw new Error('密码过长')

  const id = input._id || input.id || ''
  if (id) {
    const current = await findAccount(id, uid, deviceId)
    const payload = {
      platform,
      name,
      baseUrl,
      username,
      path
    }
    const changed = normalizeBaseUrl(current.baseUrl || '') !== baseUrl ||
      String(current.username || '') !== username ||
      normalizePath(current.path || '/') !== path ||
      !!password
    payload.status = changed
      ? 'disconnected'
      : (current.status === 'connected' ? 'connected' : 'disconnected')
    if (password) payload.password = encryptPassword(password)
    await db.collection(C.webdav).doc(current._id).update(payload)
    return publicAccount(Object.assign({}, current, payload))
  }

  if (!password) throw new Error('请填写密码')
  const doc = Object.assign({
    platform,
    name,
    baseUrl,
    username,
    password: encryptPassword(password),
    path,
    status: 'disconnected',
    created_at: Date.now()
  }, ownerFields(uid, deviceId))
  const addRes = await db.collection(C.webdav).add(doc)
  return publicAccount(Object.assign({}, doc, { _id: addRes.id }))
}

async function deleteAccount(event, uid, deviceId) {
  const account = await findAccount(event.id || event.accountId, uid, deviceId)
  await db.collection(C.webdav).doc(account._id).remove()
  return { ok: true }
}

async function testAccount(event, uid, deviceId) {
  const account = await findAccount(event.id || event.accountId, uid, deviceId)
  const startedAt = Date.now()
  let res
  try {
    res = await davRequest(account, 'PROPFIND', '/', {
      headers: { Depth: '0', 'Content-Type': 'application/xml; charset=utf-8' },
      data: PROPFIND_BODY,
      isDir: true
    })
  } catch (e) {
    await updateStatus(account, 'disconnected')
    throw e
  }
  const status = statusOf(res)
  if (status !== 207 && status !== 200) {
    await updateStatus(account, 'disconnected')
    throw new Error(httpMessage(status, '连接'))
  }
  await updateStatus(account, 'connected')
  return {
    ok: true,
    status: 'connected',
    platform: account.platform,
    path: account.path || '/',
    latency: Date.now() - startedAt
  }
}

/* ---------------- 文件 ---------------- */

async function listFiles(event, uid, deviceId) {
  const account = await findAccount(event.accountId || event.id, uid, deviceId)
  const currentPath = normalizePath(event.path || '/')
  const res = await davRequest(account, 'PROPFIND', currentPath, {
    headers: { Depth: '1', 'Content-Type': 'application/xml; charset=utf-8' },
    data: PROPFIND_BODY,
    isDir: true
  })
  const status = statusOf(res)
  if (status !== 207 && status !== 200) {
    throw new Error(httpMessage(status, '获取文件列表'))
  }
  return parseDavResponses(responseText(res), account, currentPath)
}

function defaultBackupName() {
  const now = new Date(Date.now() + 8 * 60 * 60 * 1000)
  const pad = (n) => String(n).padStart(2, '0')
  return '排班备份-' + now.getUTCFullYear() + pad(now.getUTCMonth() + 1) +
    pad(now.getUTCDate()) + '-' + pad(now.getUTCHours()) + pad(now.getUTCMinutes()) + '.json'
}

async function uploadFile(event, uid, deviceId) {
  const account = await findAccount(event.accountId || event.id, uid, deviceId)
  const snapshot = event.snapshot
  if (!snapshot || typeof snapshot !== 'object' || Array.isArray(snapshot)) {
    throw new Error('备份数据为空，无法上传')
  }
  const dir = normalizePath(event.path || '/')
  let name = String(event.name || '').trim()
  if (!name) name = defaultBackupName()
  name = name.replace(/[\\/:*?"<>|\r\n]/g, '-').replace(/^\.+/, '').slice(0, 80)
  if (!/\.json$/i.test(name)) name += '.json'
  const filePath = joinRemotePath(dir, name)
  const body = JSON.stringify(snapshot)
  if (Buffer.byteLength(body, 'utf8') > 8 * 1024 * 1024) {
    throw new Error('备份数据超过 8MB，暂不支持上传')
  }
  const res = await davRequest(account, 'PUT', filePath, {
    headers: { 'Content-Type': 'application/json; charset=utf-8' },
    data: body
  })
  const status = statusOf(res)
  if (status !== 200 && status !== 201 && status !== 204) {
    throw new Error(httpMessage(status, '上传'))
  }
  return {
    ok: true,
    name,
    path: filePath,
    size: Buffer.byteLength(body, 'utf8')
  }
}

async function downloadFile(event, uid, deviceId) {
  const account = await findAccount(event.accountId || event.id, uid, deviceId)
  const filePath = normalizePath(event.path || '/')
  if (filePath === '/') throw new Error('请选择要下载的备份文件')
  const res = await davRequest(account, 'GET', filePath)
  const status = statusOf(res)
  if (status !== 200) throw new Error(httpMessage(status, '下载'))

  let data = res.data
  if (Buffer.isBuffer(data)) data = data.toString('utf8')
  let parsed
  if (typeof data === 'string') {
    try {
      parsed = JSON.parse(data)
    } catch (e) {
      throw new Error('备份文件格式不正确，无法解析 JSON')
    }
  } else if (data && typeof data === 'object') {
    parsed = data
  } else {
    throw new Error('备份文件内容为空')
  }

  const snapshot = parsed && parsed.snapshot && typeof parsed.snapshot === 'object'
    ? parsed.snapshot
    : parsed
  if (!snapshot || typeof snapshot !== 'object' || Array.isArray(snapshot)) {
    throw new Error('备份文件格式不正确')
  }
  const text = typeof data === 'string' ? data : JSON.stringify(parsed)
  return {
    ok: true,
    name: filePath.split('/').filter(Boolean).pop() || 'backup.json',
    size: Buffer.byteLength(text, 'utf8'),
    snapshot
  }
}

async function deleteFile(event, uid, deviceId) {
  const account = await findAccount(event.accountId || event.id, uid, deviceId)
  const filePath = normalizePath(event.path || '/')
  if (filePath === '/') throw new Error('请选择要删除的文件')
  const res = await davRequest(account, 'DELETE', filePath)
  const status = statusOf(res)
  if (status !== 200 && status !== 204 && status !== 207) {
    throw new Error(httpMessage(status, '删除'))
  }
  return { ok: true }
}

/* ---------------- 入口 ---------------- */

exports.main = async (event) => {
  const evt = event || {}
  const rawAction = String(evt.action || '')
  const action = rawAction.indexOf('webdav.') === 0 ? rawAction.slice(7) : rawAction
  const deviceId = String(evt.deviceId || 'dev-anonymous')

  try {
    const uid = await resolveUid(evt)
    switch (action) {
      case 'accounts':
        return ok(await listAccounts(uid, deviceId))
      case 'saveAccount':
        return ok(await saveAccount(evt, uid, deviceId))
      case 'deleteAccount':
      case 'removeAccount':
        return ok(await deleteAccount(evt, uid, deviceId))
      case 'testAccount':
        return ok(await testAccount(evt, uid, deviceId))
      case 'files':
        return ok(await listFiles(evt, uid, deviceId))
      case 'upload':
        return ok(await uploadFile(evt, uid, deviceId))
      case 'download':
        return ok(await downloadFile(evt, uid, deviceId))
      case 'deleteFile':
      case 'removeFile':
        return ok(await deleteFile(evt, uid, deviceId))
      default:
        return fail('未知 action: ' + rawAction)
    }
  } catch (e) {
    return fail(errorText(e))
  }
}
