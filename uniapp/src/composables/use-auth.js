/**
 * uni-id 登录态（客户端单例）
 * ------------------------------------------------------------
 * - 后端：uniCloud 云函数 user（官方 uni-id-common 签发 JWT）
 * - 本地模式（config.useCloud=false）：services/local-db.js 的本地实现，
 *   token 形如 local-xxxx，仅用于演示，无真实安全性
 *
 * storage 约定（与 api.js / 各页面一致）：
 *   uni_id_token  登录 token（云函数请求会自动携带）
 *   uni_id_user   用户信息缓存 { _id, username, nickname, avatar, ... }
 *
 * 用法：
 *   import { useAuth } from '@/composables/use-auth.js'
 *   const { auth, isLogin, login, logout } = useAuth()
 *   await login({ username, password })
 */
import { reactive, computed } from 'vue'
import api from '@/services/api.js'

const TOKEN_KEY = 'uni_id_token'
const USER_KEY = 'uni_id_user'

function readToken() {
  try {
    return uni.getStorageSync(TOKEN_KEY) || ''
  } catch (e) {
    return ''
  }
}

function readUser() {
  try {
    return uni.getStorageSync(USER_KEY) || null
  } catch (e) {
    return null
  }
}

/**
 * 全局登录态。
 * isLogin 用 getter 暴露，保持 auth = { token, userInfo, isLogin } 的形态，
 * 同时保证 token 变化时依赖它的模板/计算属性会自动更新。
 */
export const auth = reactive({
  token: readToken(),
  userInfo: readUser(),
  get isLogin() {
    return !!this.token
  }
})

/** 只读登录状态（computed，模板里可直接用） */
export const isLogin = computed(() => auth.isLogin)

function persist(data) {
  if (!data) return null
  if (data.token) {
    auth.token = data.token
    try {
      uni.setStorageSync(TOKEN_KEY, data.token)
    } catch (e) {}
  }
  if (data.userInfo) {
    auth.userInfo = data.userInfo
    try {
      uni.setStorageSync(USER_KEY, data.userInfo)
    } catch (e) {}
  }
  return data
}

/** 清除本地会话（不请求云端） */
export function clearSession() {
  auth.token = ''
  auth.userInfo = null
  try {
    uni.removeStorageSync(TOKEN_KEY)
    uni.removeStorageSync(USER_KEY)
  } catch (e) {}
}

/** 把 storage 里的登录态同步进响应式状态（App 启动 / 页面 onShow 时调用） */
export function syncFromStorage() {
  const token = readToken()
  if (token !== auth.token) auth.token = token
  auth.userInfo = readUser()
  return auth
}

/* ---------------- 动作 ---------------- */

/** 登录：成功写入 storage 并更新全局状态；失败抛出 Error(message) */
export async function login(payload) {
  const data = await api.auth.login(payload || {})
  return persist(data)
}

/** 注册（注册成功即登录，返回结构与登录一致） */
export async function register(payload) {
  const data = await api.auth.register(payload || {})
  return persist(data)
}

/** 退出登录：先通知云端（旧 token 失效），再清本地；云端失败也保证本地退出 */
export async function logout() {
  try {
    await api.auth.logout()
  } catch (e) {
    // 离线 / token 已失效：忽略，继续清本地
  }
  clearSession()
  return { ok: true }
}

/**
 * 拉取最新用户信息。
 * - 返回 userInfo；未登录返回 null
 * - token 失效时自动清除本地会话（返回 null）
 * - 网络异常不清会话（返回 null，由调用方决定是否提示）
 */
export async function fetchInfo() {
  if (!auth.token) return null
  try {
    const data = await api.auth.getInfo()
    const userInfo = (data && data.userInfo) || null
    if (userInfo) persist({ userInfo })
    return userInfo
  } catch (e) {
    const msg = (e && (e.message || e.errMsg)) || ''
    if (/未登录|登录状态|token|失效|30202|30203/i.test(msg)) clearSession()
    return null
  }
}

/** 更新昵称/头像 */
export async function updateInfo(payload) {
  const data = await api.auth.updateInfo(payload || {})
  if (data && data.userInfo) persist({ userInfo: data.userInfo })
  return data
}

/**
 * 修改密码。服务端改密后会刷新 valid_token_date，当前 token 立即失效，
 * 因此这里在成功后清除本地会话，调用方应引导用户重新登录。
 */
export async function changePassword(payload) {
  const data = await api.auth.changePassword(payload || {})
  clearSession()
  return data
}

export function useAuth() {
  return {
    auth,
    isLogin,
    syncFromStorage,
    clearSession,
    login,
    register,
    logout,
    fetchInfo,
    updateInfo,
    changePassword
  }
}

export default { auth, isLogin, useAuth }
