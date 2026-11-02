/**
 * Android 系统目录备份：通过 jy-native 原生插件完成 SAF 选择与写入。
 */
const KEY = 'jy_backup_tree_uri'
const PLUGIN = 'jy-native'

function nativePlugin() {
  try {
    // #ifdef APP-PLUS
    return uni.requireNativePlugin(PLUGIN)
    // #endif
    return null
  } catch (e) {
    return null
  }
}

export function isSupported() {
  const p = nativePlugin()
  return !!(p && typeof p.chooseDirectory === 'function' && typeof p.writeBackup === 'function')
}

export function getDirUri() {
  try { return uni.getStorageSync(KEY) || '' } catch (e) { return '' }
}

export function dirLabel() {
  const uri = getDirUri()
  if (!uri) return ''
  try {
    const decoded = decodeURIComponent(uri)
    const seg = decoded.split('/').pop() || ''
    const name = seg.split(':').pop() || seg
    return name || '已选择系统目录'
  } catch (e) { return '已选择系统目录' }
}

function call(method, ...args) {
  return new Promise((resolve, reject) => {
    const p = nativePlugin()
    if (!p || typeof p[method] !== 'function') {
      reject(new Error('原生备份插件不可用'))
      return
    }
    p[method](...args, (res) => {
      if (!res || res.success === false) {
        reject(new Error((res && (res.error || res.code)) || '原生备份操作失败'))
      } else {
        resolve(res)
      }
    })
  })
}

export async function chooseDir() {
  if (!isSupported()) throw new Error('仅 Android App 支持系统目录')
  await call('clearDirectory')
  await call('chooseDirectory')
  // 等待原生 Activity 返回并写入 SharedPreferences
  for (let i = 0; i < 120; i += 1) {
    await new Promise((r) => setTimeout(r, 500))
    try {
      const res = await call('getDirectory')
      if (res && res.uri) {
        uni.setStorageSync(KEY, res.uri)
        return res.uri
      }
    } catch (e) {}
  }
  throw new Error('未选择系统目录')
}

export function clearDir() {
  try {
    const p = nativePlugin()
    if (p && typeof p.clearDirectory === 'function') p.clearDirectory(() => {})
  } catch (e) {}
  try { uni.removeStorageSync(KEY) } catch (e) {}
}

export async function writeBackupFile(item) {
  if (!isSupported()) throw new Error('仅 Android App 支持系统目录')
  const uri = getDirUri()
  if (!uri) throw new Error('未选择系统目录')
  const name = '极简排班备份-' + new Date().toISOString().replace(/[:.]/g, '-').slice(0, 19) + '.json'
  const res = await call('writeBackup', uri, name, JSON.stringify(item, null, 2))
  return (res && res.name) || name
}
