'use strict'
/**
 * feedback 云函数：用户在线反馈
 * 入参: { action: 'feedback.submit', deviceId, userId, uniIdToken, type, content, contact }
 * 出参: { code: 0, data: { id } } / { code: 非 0, message }
 * 数据归属 owner = 有效 token 的 uid，否则 deviceId
 */
const db = uniCloud.database()
const uniIdCommon = require('uni-id-common')

const COLLECTION = 'jy_feedback'
const ALLOWED_TYPES = ['feature', 'bug', 'other', 'feedback']

const ok = (data) => ({ code: 0, data })
const fail = (message) => ({ code: -1, message })

/* 官方 uni-id-common 校验 token；无效/过期的 token 按游客处理 */
async function resolveUid(event) {
  const token = event.uniIdToken
  if (!token) return ''
  try {
    const ins = uniIdCommon.createInstance({
      clientInfo: (uniCloud.getClientInfo && uniCloud.getClientInfo()) || {}
    })
    const res = await ins.checkToken(token, { autoRefresh: false })
    return (res && res.uid) || ''
  } catch (e) {
    return ''
  }
}

exports.main = async (event) => {
  if (event.action !== 'feedback.submit') {
    return fail('未知 action: ' + event.action)
  }

  try {
    const content = String(event.content || '').trim()
    if (content.length < 5) return fail('反馈内容至少需要 5 个字')

    const deviceId = String(event.deviceId || '').trim() || 'dev-anonymous'
    const uid = await resolveUid(event)
    /* owner = uid || deviceId：登录用户按 uid 归属，游客按设备归属 */
    const owner = uid || deviceId
    if (!owner) return fail('无法识别数据归属')

    const type = ALLOWED_TYPES.indexOf(event.type) >= 0 ? event.type : 'feedback'
    const contact = String(event.contact || '').trim().slice(0, 100)

    const addRes = await db.collection(COLLECTION).add({
      user_id: uid || '',
      deviceId,
      owner,
      type,
      content,
      contact,
      status: 0,
      created_at: Date.now()
    })

    return ok({ id: addRes.id })
  } catch (e) {
    return fail(e && e.message ? e.message : String(e))
  }
}
