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
  return !!(p && typeof p.exportBackup === 'function' && typeof p.getExportResult === 'function')
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

/** 每次备份时弹出 Android 系统保存文件选择器，并写入 JSON */
export async function exportBackupFile(item) {
  if (!isSupported()) throw new Error('仅 Android App 支持系统文件保存')
  const name = '极简排班备份-' + new Date().toISOString().replace(/[:.]/g, '-').slice(0, 19) + '.json'
  await call('exportBackup', name, JSON.stringify(item, null, 2))
  for (let i = 0; i < 240; i += 1) {
    await new Promise((r) => setTimeout(r, 500))
    const res = await call('getExportResult')
    if (res && res.status === 'success') return { status: 'success', name: res.name || name }
    if (res && res.status === 'canceled') return { status: 'canceled' }
    if (res && res.status === 'error') throw new Error(res.error || '系统文件保存失败')
  }
  throw new Error('系统文件保存超时')
}

/** 从 Android 系统文件选择器读取 JSON 备份 */
export async function importBackupFile() {
  const p = nativePlugin()
  if (!p || typeof p.importBackup !== 'function') throw new Error('当前版本不支持系统文件导入')
  await call('importBackup')
  for (let i = 0; i < 120; i += 1) {
    await new Promise((r) => setTimeout(r, 500))
    const res = await call('getImportResult')
    if (!res || !res.status) continue
    if (res.status === 'canceled') return null
    if (res.status === 'error') throw new Error(res.error || '读取备份文件失败')
    if (res.status === 'success') {
      let data
      try { data = JSON.parse(res.content || '{}') } catch (e) { throw new Error('备份文件不是有效 JSON') }
      const snapshot = data && data.snapshot ? data.snapshot : data
      if (!snapshot || typeof snapshot !== 'object') throw new Error('备份文件格式不正确')
      return { name: (data && data.name) || res.name || '系统文件备份', snapshot }
    }
  }
  throw new Error('读取系统文件超时')
}

/** 通过系统文件保存器导出文本文件（CSV 等） */
export async function exportTextFile(fileName, content) {
  if (!isSupported()) throw new Error('仅 Android App 支持系统文件保存')
  await call('exportText', fileName, content, 'text/csv')
  for (let i = 0; i < 240; i += 1) {
    await new Promise((r) => setTimeout(r, 500))
    const res = await call('getExportResult')
    if (res && res.status === 'success') return { status: 'success', name: res.name || fileName }
    if (res && res.status === 'canceled') return { status: 'canceled' }
    if (res && res.status === 'error') throw new Error(res.error || '文件保存失败')
  }
  throw new Error('文件保存超时')
}
