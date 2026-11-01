'use strict'
/**
 * vip 云函数：会员（赞助）订单 + 会员状态 + 支付宝 App 支付
 *
 * 入参: { action, deviceId, uniIdToken, ...payload }
 * 出参: { code: 0, data } / { code: 非0, message }
 *
 * actions:
 *   vip.plans                 会员方案/权益/支付配置状态
 *   vip.status                当前登录用户的会员状态
 *   vip.createOrder  { planId, payType? }  创建订单；支付宝已配置时返回 payInfo
 *   vip.queryOrder   { outTradeNo }         查询订单状态
 *   vip.mockPay      { outTradeNo }         仅 mock=true 时可用：模拟支付成功（开发/演示）
 *   vip.notify                 支付宝异步通知（HTTP 触发，需在 uniCloud 配置 URL 化路径）
 *
 * 数据集合：
 *   jy_vip        每个 uid 一条会员记录（expireAt / planId）
 *   jy_vip_order  订单（outTradeNo / status / amount / planId）
 *
 * 配置：common/uni-config-center/vip/config.json
 *   - alipay.appId / privateKey / alipayPublicKey / notifyUrl
 *   - mock=true 时 createOrder 返回 mock 订单，可用 mockPay 模拟成功（默认开，上线必须关）
 */
const crypto = require('crypto')
const uniIdCommon = require('uni-id-common')
const createConfig = require('uni-config-center')

const db = uniCloud.database()
const orderCol = db.collection('jy_vip_order')

const ok = (data) => ({ code: 0, data })
const fail = (message, code = -1) => ({ code, message })

const DEFAULT_PLANS = [
  { id: 'month', price: 3, unit: '每月', note: '每天1毛钱', days: 30 },
  { id: 'year', price: 12, unit: '每年', note: '每天3.3分钱', days: 365, best: true },
  { id: 'forever', price: 18, unit: '永久', note: '一次性买断', days: 36500 }
]
const DEFAULT_RIGHTS = [
  { icon: 'lightbulb_flash', title: '支持开发', desc: '促使开发者砥砺前行，呈现更优质的App功能' },
  { icon: 'user', title: '专属客服', desc: '会员用户优先响应' },
  { icon: 'vip', title: '会员标识', desc: '个人主页展示会员徽章' }
]

let cachedConfig = null
function config() {
  if (cachedConfig) return cachedConfig
  let c = {}
  try {
    const center = createConfig({ pluginId: 'vip' })
    c = center.config() || {}
  } catch (e) {
    console.warn('[vip] load config failed:', e && (e.message || e))
  }
  const defaults = {
    mock: true,
    plans: DEFAULT_PLANS,
    rights: DEFAULT_RIGHTS,
    alipay: { appId: '', privateKey: '', alipayPublicKey: '', notifyUrl: '', gateway: 'https://openapi.alipay.com/gateway.do' }
  }
  cachedConfig = Object.assign({}, defaults, c)
  cachedConfig.alipay = Object.assign({}, defaults.alipay, c.alipay || {})
  if (!Array.isArray(cachedConfig.plans) || !cachedConfig.plans.length) cachedConfig.plans = DEFAULT_PLANS
  if (!Array.isArray(cachedConfig.rights) || !cachedConfig.rights.length) cachedConfig.rights = DEFAULT_RIGHTS
  return cachedConfig
}

function isAlipayReady(cfg) {
  return !!(cfg.alipay.appId && cfg.alipay.privateKey)
}

function findPlan(cfg, planId) {
  return (cfg.plans || []).find((p) => p.id === planId) || null
}

/* ---------------- 身份（与 workplan/user 一致） ---------------- */
function getUniId(context) {
  let info = {}
  try { info = (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {} } catch (e) { info = {} }
  const c = context || {}
  if (!info.PLATFORM) info.PLATFORM = c.PLATFORM || c.platform || 'h5'
  if (!info.APPID) info.APPID = c.APPID || c.appId || ''
  if (!info.LOCALE) info.LOCALE = c.LOCALE || c.locale || 'zh-Hans'
  if (!info.CLIENTIP) info.CLIENTIP = c.CLIENTIP || c.clientIP || ''
  if (!info.DEVICEID) info.DEVICEID = c.DEVICEID || c.deviceId || ''
  return uniIdCommon.createInstance({ clientInfo: info })
}

async function checkToken(token, context) {
  if (!token) return ''
  let r
  try { r = await getUniId(context).checkToken(token, { autoRefresh: false }) } catch (e) { r = e }
  if (!r || (r.errCode && r.errCode !== 0) || (r.code && r.code !== 0) || !r.uid) return ''
  try {
    const res = await db.collection('uni-id-users').doc(r.uid).get()
    const user = (res.data || [])[0]
    if (!user) return ''
    if (user.status === 1 || user.status === 4) return ''
    const iat = 1000 * Number(r.iat || 0)
    if (user.valid_token_date && user.valid_token_date > iat) return ''
    if (Array.isArray(user.token) && user.token.length && user.token.indexOf(token) === -1) return ''
  } catch (e) { return '' }
  return r.uid
}

/* ---------------- 支付宝 RSA2 签名 ---------------- */
function normalizeKey(key, type) {
  const k = String(key || '').trim()
  if (!k) return ''
  if (k.indexOf('BEGIN') >= 0) return k
  const body = k.replace(/\s+/g, '').match(/.{1,64}/g)
  return '-----BEGIN ' + type + '-----\n' + (body ? body.join('\n') : k) + '\n-----END ' + type + '-----'
}

function signContent(params) {
  return Object.keys(params)
    .filter((k) => k !== 'sign' && params[k] !== '' && params[k] !== null && params[k] !== undefined)
    .sort()
    .map((k) => k + '=' + params[k])
    .join('&')
}

function alipaySign(params, privateKey) {
  const content = signContent(params)
  return crypto.createSign('RSA-SHA256').update(content, 'utf8').sign(normalizeKey(privateKey, 'PRIVATE KEY'), 'base64')
}

function alipayVerify(params, publicKey) {
  if (!params.sign) return false
  const content = signContent(params)
  return crypto.createVerify('RSA-SHA256').update(content, 'utf8').verify(normalizeKey(publicKey, 'PUBLIC KEY'), params.sign, 'base64')
}

function pad(n) { return n < 10 ? '0' + n : '' + n }
function alipayTimestamp(d) {
  const t = d || new Date()
  return t.getFullYear() + '-' + pad(t.getMonth() + 1) + '-' + pad(t.getDate()) + ' ' + pad(t.getHours()) + ':' + pad(t.getMinutes()) + ':' + pad(t.getSeconds())
}

function buildAlipayOrderInfo(cfg, order) {
  const params = {
    app_id: cfg.alipay.appId,
    method: 'alipay.trade.app.pay',
    format: 'JSON',
    charset: 'utf-8',
    sign_type: 'RSA2',
    timestamp: alipayTimestamp(),
    version: '1.0',
    biz_content: JSON.stringify({
      out_trade_no: order.outTradeNo,
      total_amount: Number(order.amount).toFixed(2),
      subject: order.subject,
      product_code: 'QUICK_MSECURITY_PAY',
      timeout_express: '30m'
    })
  }
  if (cfg.alipay.notifyUrl) params.notify_url = cfg.alipay.notifyUrl
  params.sign = alipaySign(params, cfg.alipay.privateKey)
  return Object.keys(params).map((k) => k + '=' + encodeURIComponent(params[k])).join('&')
}

/* ---------------- 会员 ---------------- */
function active(expireAt) { return Number(expireAt || 0) > Date.now() }

async function getMembership(uid) {
  if (!uid) return { active: false, loggedIn: false, expireAt: 0, planId: '' }
  const res = await db.collection('jy_vip').where({ uid }).limit(1).get()
  const doc = (res.data || [])[0]
  return {
    active: !!(doc && active(doc.expireAt)),
    loggedIn: true,
    expireAt: (doc && doc.expireAt) || 0,
    planId: (doc && doc.planId) || '',
    updatedAt: (doc && doc.updatedAt) || 0
  }
}

async function grantMembership(uid, plan, orderId) {
  const now = Date.now()
  const col = db.collection('jy_vip')
  const res = await col.where({ uid }).limit(1).get()
  const doc = (res.data || [])[0]
  let base = now
  if (doc && Number(doc.expireAt) > now) base = Number(doc.expireAt)
  const days = Number(plan.days || 0)
  const expireAt = days >= 36500 ? new Date('2099-12-31T00:00:00+08:00').getTime() : base + days * 86400000
  if (doc) {
    await col.doc(doc._id).update({ planId: plan.id, expireAt, updatedAt: now, lastOrderId: orderId || '' })
  } else {
    await col.add({ uid, planId: plan.id, expireAt, createdAt: now, updatedAt: now, lastOrderId: orderId || '' })
  }
  return { active: true, loggedIn: true, expireAt, planId: plan.id }
}

function genOutTradeNo(uid) {
  const rand = crypto.randomBytes(4).toString('hex').toUpperCase()
  return 'VIP' + Date.now() + rand + String(uid || '').slice(-4)
}

async function createOrder(event, uid) {
  const cfg = config()
  const plan = findPlan(cfg, event.planId)
  if (!plan) return fail('未知的会员方案')
  const now = Date.now()
  const order = {
    outTradeNo: genOutTradeNo(uid),
    uid,
    planId: plan.id,
    planUnit: plan.unit,
    amount: Number(plan.price),
    subject: '极简排班会员（' + plan.unit + '）',
    status: 'pending',
    payType: event.payType === 'wxpay' ? 'wxpay' : 'alipay',
    createdAt: now,
    updatedAt: now
  }
  await orderCol.add(order)
  const base = { configured: isAlipayReady(cfg), mock: !!cfg.mock, order: { outTradeNo: order.outTradeNo, amount: order.amount, planId: plan.id, subject: order.subject } }
  if (cfg.mock) return ok(base)
  if (!isAlipayReady(cfg)) return ok(Object.assign({}, base, { configured: false, message: '支付未配置，请联系客服' }))
  try {
    const orderInfo = buildAlipayOrderInfo(cfg, order)
    return ok(Object.assign({}, base, { payInfo: { provider: 'alipay', orderInfo } }))
  } catch (e) {
    console.error('[vip] build alipay order failed', e)
    return fail('生成支付参数失败：' + (e && (e.message || e)))
  }
}

async function markPaid(order, tradeNo) {
  if (order.status === 'paid') return
  await orderCol.doc(order._id).update({ status: 'paid', tradeNo: tradeNo || '', paidAt: Date.now(), updatedAt: Date.now() })
}

async function mockPay(event, uid) {
  const cfg = config()
  if (!cfg.mock) return fail('mock 支付未开启')
  const res = await orderCol.where({ outTradeNo: event.outTradeNo, uid }).limit(1).get()
  const order = (res.data || [])[0]
  if (!order) return fail('订单不存在')
  const plan = findPlan(cfg, order.planId)
  if (!plan) return fail('方案不存在')
  await markPaid(order, 'MOCK-' + Date.now())
  return ok(await grantMembership(uid, plan, order.outTradeNo))
}

async function notify(event) {
  const cfg = config()
  const params = event || {}
  if (!params.out_trade_no) return 'fail'
  if (isAlipayReady(cfg) && cfg.alipay.alipayPublicKey) {
    if (!alipayVerify(params, cfg.alipay.alipayPublicKey)) {
      console.warn('[vip] notify sign verify failed', params.out_trade_no)
      return 'fail'
    }
  }
  if (params.trade_status !== 'TRADE_SUCCESS' && params.trade_status !== 'TRADE_FINISHED') return 'success'
  const res = await orderCol.where({ outTradeNo: params.out_trade_no }).limit(1).get()
  const order = (res.data || [])[0]
  if (!order) return 'fail'
  const plan = findPlan(cfg, order.planId)
  if (!plan) return 'fail'
  await markPaid(order, params.trade_no || '')
  await grantMembership(order.uid, plan, order.outTradeNo)
  return 'success'
}

/* ---------------- 入口 ---------------- */
exports.main = async (event, context) => {
  const action = String((event && event.action) || '').replace(/^vip\./, '')
  try {
    if (action === 'notify') return await notify(event)

    const uid = await checkToken((event && (event.uniIdToken || event.token)) || '', context)
    const cfg = config()

    if (action === 'plans') {
      return ok({
        plans: cfg.plans,
        rights: cfg.rights,
        configured: isAlipayReady(cfg),
        mock: !!cfg.mock,
        mockAllowed: !!cfg.mock
      })
    }

    if (action === 'status') return ok(await getMembership(uid))

    if (action === 'createOrder') {
      if (!uid) return fail('请先登录', -2)
      return await createOrder(event, uid)
    }
    if (action === 'queryOrder') {
      if (!uid) return fail('请先登录', -2)
      const res = await orderCol.where({ outTradeNo: event.outTradeNo, uid }).limit(1).get()
      const order = (res.data || [])[0]
      if (!order) return fail('订单不存在')
      return ok({ status: order.status, paidAt: order.paidAt || 0, amount: order.amount, planId: order.planId })
    }
    if (action === 'mockPay') {
      if (!uid) return fail('请先登录', -2)
      return await mockPay(event, uid)
    }

    return fail('未知 action: ' + action)
  } catch (e) {
    console.error('[vip] error', e)
    return fail((e && (e.errMsg || e.message)) || String(e))
  }
}
