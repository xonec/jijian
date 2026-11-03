/**
 * Android 原生 Excel/CSV 文件选择（jy-native）。
 */
const PLUGIN = 'jy-native'

function plugin() {
  try {
    // #ifdef APP-PLUS
    return uni.requireNativePlugin(PLUGIN)
    // #endif
    return null
  } catch (e) { return null }
}

export function isSupported() {
  const p = plugin()
  return !!(p && typeof p.pickScheduleFile === 'function' && typeof p.getPickedScheduleFile === 'function')
}

function call(method) {
  return new Promise((resolve, reject) => {
    const p = plugin()
    if (!p || typeof p[method] !== 'function') return reject(new Error('原生文件选择插件不可用'))
    p[method]((res) => {
      if (!res || res.success === false) reject(new Error((res && (res.error || res.code)) || '文件选择失败'))
      else resolve(res)
    })
  })
}

export async function pickScheduleFile() {
  if (!isSupported()) throw new Error('当前版本不支持系统文件选择')
  await call('pickScheduleFile')
  for (let i = 0; i < 240; i += 1) {
    await new Promise((r) => setTimeout(r, 500))
    const res = await call('getPickedScheduleFile')
    if (!res || !res.status) continue
    if (res.status === 'canceled') return null
    if (res.status === 'error') throw new Error(res.error || '读取文件失败')
    if (res.status === 'success') {
      if (!res.base64) throw new Error('文件内容为空')
      return { name: res.name || '排班表.xlsx', base64: res.base64 }
    }
  }
  throw new Error('文件选择超时')
}
