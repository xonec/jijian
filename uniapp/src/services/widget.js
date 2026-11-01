/**
 * 桌面小组件数据层
 *
 * - 配置：jy_widget_config（存储）；负责样式、显示项、字号、配色、暗黑模式
 * - 载荷：月历 6×7 单元格 + 今日班次 + 主题色 + 显示项（供原生 AppWidget 读取）
 * - 同步（App/Android）：写入 SharedPreferences('jy_widget') 并发送刷新广播，
 *   由 nativeplugins/uni-widget 的原生 Provider 读取渲染；H5 只保存配置并返回 supported:false。
 */

import { store, shiftById } from '@/composables/use-store.js'

const CONFIG_KEY = 'jy_widget_config'

export const WIDGET_DEFAULTS = {
  style: '月历',
  showRemark: true,
  showBeginTime: true,
  showEndTime: false,
  dateFontSize: 12,
  workFontSize: 9,
  timeFontSize: 8,
  titleBg: '#55BB8A',
  calBg: '#FFFFFF',
  darkMode: '跟随系统'
}

export const WIDGET_STYLES = ['月历', '班次', '月历+班次']
export const WIDGET_DARK_MODES = ['跟随系统', '亮色', '暗色']
export const TITLE_COLORS = ['#55BB8A', '#1BA784', '#303048', '#F8723D', '#FFFFFF']
export const CAL_COLORS = ['#FFFFFF', '#F6F5F4', '#EEEEEE', '#191919', '#222222']

export function loadConfig() {
  let cfg = {}
  try {
    const raw = uni.getStorageSync(CONFIG_KEY)
    cfg = raw ? (typeof raw === 'string' ? JSON.parse(raw) : raw) : {}
  } catch (e) {
    cfg = {}
  }
  return Object.assign({}, WIDGET_DEFAULTS, cfg)
}

export function saveConfig(cfg) {
  const merged = Object.assign({}, WIDGET_DEFAULTS, cfg || {})
  try {
    uni.setStorageSync(CONFIG_KEY, merged)
  } catch (e) {}
  return merged
}

function weekLabels(weekStart) {
  const all = ['周日', '周一', '周二', '周三', '周四', '周五', '周六']
  return all.slice(weekStart).concat(all.slice(0, weekStart))
}

function textColorFor(hex) {
  if (!hex) return ''
  const h = hex.replace('#', '')
  const r = parseInt(h.slice(0, 2), 16)
  const g = parseInt(h.slice(2, 4), 16)
  const b = parseInt(h.slice(4, 6), 16)
  const lum = (0.299 * r + 0.587 * g + 0.114 * b) / 255
  return lum > 0.62 ? '#222222' : '#FFFFFF'
}

/** 生成供原生 widget 渲染的载荷（纯数据，可在 H5 预览） */
export function buildPayload(cfg) {
  const conf = Object.assign({}, WIDGET_DEFAULTS, cfg || loadConfig())
  const y = store.view.y
  const m = store.view.m
  const weekStart = Number(store.weekStart) === 1 ? 1 : 0
  const firstWeekday = new Date(y, m - 1, 1).getDay()
  const offset = (firstWeekday - weekStart + 7) % 7
  const total = new Date(y, m, 0).getDate()
  const today = store.today || {}
  const isCurrentMonth = today.y === y && today.m === m
  const dayMap = {}
  if (y === 2024 && m === 9) {
    store.days.forEach((d) => { dayMap[d.d] = d })
  }
  const shiftOf = (id) => {
    if (!id) return null
    const s = shiftById(id)
    return s || null
  }
  const cells = []
  for (let i = 0; i < 42; i += 1) {
    const dn = i - offset + 1
    const valid = dn >= 1 && dn <= total
    const info = valid ? dayMap[dn] : null
    const sh = info && info.work ? shiftOf(info.work) : null
    cells.push({
      d: valid ? dn : 0,
      lunar: (info && info.lunar) || '',
      holiday: (info && info.holiday) || '',
      swap: !!(info && info.swap),
      work: sh ? sh.name : '',
      color: sh && sh.color ? sh.color : '',
      textColor: sh && sh.color ? textColorFor(sh.color) : '',
      today: valid && isCurrentMonth && dn === today.d,
      remark: valid ? (store.remarks[dn] || '') : ''
    })
  }
  const weeks = []
  for (let w = 0; w < 6; w += 1) weeks.push(cells.slice(w * 7, w * 7 + 7))
  let todayShift = null
  let todayShiftId = ''
  if (isCurrentMonth) {
    const info = dayMap[today.d]
    todayShiftId = (info && info.work) || ''
    todayShift = shiftOf(todayShiftId)
  }
  const alarm = (store.alarms || []).find((a) => a.on) || null
  return {
    title: y + '年' + m + '月',
    weekStart,
    weekLabels: weekLabels(weekStart),
    weeks,
    today: {
      d: isCurrentMonth ? today.d : 0,
      shift: todayShift ? todayShift.name : '',
      time: todayShift ? (todayShift.allDay ? '全天' : todayShift.start + '~' + todayShift.end) : '',
      remark: (isCurrentMonth && store.remarks[today.d]) || '',
      alarm: alarm ? alarm.time : ''
    },
    display: {
      showRemark: !!conf.showRemark,
      showBeginTime: !!conf.showBeginTime,
      showEndTime: !!conf.showEndTime
    },
    sizes: {
      date: Number(conf.dateFontSize) || 12,
      work: Number(conf.workFontSize) || 9,
      time: Number(conf.timeFontSize) || 8
    },
    theme: {
      titleBg: conf.titleBg,
      calBg: conf.calBg,
      dark: conf.darkMode === '暗色'
    },
    style: conf.style,
    updatedAt: Date.now()
  }
}

function androidReady() {
  return (
    typeof plus !== 'undefined' &&
    plus &&
    plus.os &&
    plus.os.name === 'Android' &&
    typeof plus.android !== 'undefined'
  )
}

/** 写入原生 SharedPreferences 并广播刷新（需安装 nativeplugins/uni-widget） */
function writeNative(payload, cfg) {
  const main = plus.android.runtimeMainActivity()
  const Context = plus.android.importClass('android.content.Context')
  const prefs = plus.android.invoke(main, 'getSharedPreferences', 'jy_widget', Context.MODE_PRIVATE)
  const editor = plus.android.invoke(prefs, 'edit')
  plus.android.invoke(editor, 'putString', 'data', JSON.stringify(payload))
  plus.android.invoke(editor, 'putString', 'config', JSON.stringify(cfg))
  plus.android.invoke(editor, 'putLong', 'updatedAt', Date.now())
  plus.android.invoke(editor, 'commit')
  try {
    const Intent = plus.android.importClass('android.content.Intent')
    const intent = new Intent('cn.jianyun.replica.widget.ACTION_REFRESH')
    plus.android.invoke(intent, 'setPackage', plus.android.invoke(main, 'getPackageName'))
    plus.android.invoke(main, 'sendBroadcast', intent)
  } catch (e) {}
  return true
}

/** 小组件实例诊断（App）：返回已添加的月历/班次小组件数量 */
export function diagnoseWidget() {
  if (!androidReady()) return { supported: false, installed: false, monthCount: 0, shiftCount: 0 }
  try {
    const main = plus.android.runtimeMainActivity()
    const AppWidgetManager = plus.android.importClass('android.appwidget.AppWidgetManager')
    const ComponentName = plus.android.importClass('android.content.ComponentName')
    const mgr = plus.android.invoke(main, 'getSystemService', 'appwidget')
    const pkg = plus.android.invoke(main, 'getPackageName')
    const idsOf = (cls) => {
      const ids = plus.android.invoke(mgr, 'getAppWidgetIds', new ComponentName(pkg, cls))
      return ids ? ids.length : 0
    }
    return {
      supported: true,
      installed: true,
      monthCount: idsOf('cn.jianyun.replica.widget.MonthWidgetProvider'),
      shiftCount: idsOf('cn.jianyun.replica.widget.ShiftWidgetProvider')
    }
  } catch (e) {
    return { supported: true, installed: false, monthCount: 0, shiftCount: 0, error: String(e) }
  }
}

/** 保存配置 + 生成载荷 +（App）同步到原生小组件 */
export function syncWidget(cfg) {
  const conf = saveConfig(cfg || loadConfig())
  const payload = buildPayload(conf)
  let native = false
  if (androidReady()) {
    try {
      native = writeNative(payload, conf)
    } catch (e) {
      native = false
    }
  }
  return { supported: androidReady(), native, payload, config: conf }
}

export function addWidgetTip() {
  const tip = '长按桌面空白处 → 小组件 → 找到「极简排班」→ 选择月历/班次小组件拖到桌面'
  if (typeof uni !== 'undefined' && uni.showModal) {
    uni.showModal({ title: '添加桌面小组件', content: tip, showCancel: false, confirmText: '知道了' })
  }
  return tip
}

export function widgetStyleLabel(cfg) {
  const c = cfg || loadConfig()
  return c.style + (c.darkMode ? ' · ' + c.darkMode : '')
}
