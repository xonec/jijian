import { reactive, computed } from 'vue'
import {
  TODAY, VIEW0, SHIFTS, DAYS, REMARKS, ALARMS, STAT,
  SETTING_GROUPS, DISPLAY_CONFIG, PALETTES, VIP, PROJECTS, FAQ, UPDATE_INTRO
} from '@/data/mock.js'
import api from '@/services/api.js'

export const WEEK = ['周日', '周一', '周二', '周三', '周四', '周五', '周六']
export const CN_MONTH = ['一', '二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二']

export const store = reactive({
  today: TODAY,
  view: { ...VIEW0 },
  selected: TODAY.d,
  weekStart: 0, // 0=周日（官方截图）1=周一（APK 小组件默认）
  weekStartLabel: '周日',
  shifts: SHIFTS.map((s) => ({ ...s })),
  days: DAYS.map((d) => ({ ...d })),
  remarks: { ...REMARKS },
  alarms: ALARMS.map((a) => ({ ...a })),
  stat: STAT,
  settingGroups: SETTING_GROUPS,
  displayConfig: DISPLAY_CONFIG,
  palettes: PALETTES,
  vip: VIP,
  projects: PROJECTS,
  faq: FAQ,
  updateIntro: UPDATE_INTRO,

  /* 交互态 */
  tipVisible: false,
  editMode: false,
  workTab: 'work',
  shareTab: 'share',
  vipPlan: 1,
  selectedColor: '#1BA784',
  sheet: '',
  sheetArg: '',
  dialog: '',
  workForm: { tab: 'normal', name: '早班', allDay: false, start: '09:00', end: '18:00', rest: '60' },
  alarmForm: { shift: 'late', when: '上班前30分钟', day: '当天', strong: false },

  /* 第二班次（date -> shiftId），演示数据里为空 */
  secondWorks: {},
  /* 云端/本地数据库合并后的原始排班（date -> {workId, secondWorkId, remark}） */
  scheduleRaw: {},
  loaded: false
})

/* 把 api.bootstrap()/本地 db 合并进 store */
export function applyBootstrap(db) {
  if (!db) return
  const arr = (v) => (Array.isArray(v) ? v : [])
  if (arr(db.shifts).length) {
    store.shifts = db.shifts.map((s) => ({ ...s, id: s.id || s._id }))
  }
  if (arr(db.alarms).length) {
    store.alarms = db.alarms.map((a) => ({ ...a, id: a.id || a._id }))
  }
  if (arr(db.projects).length) {
    store.projects = db.projects.map((p) => ({ ...p, id: p.id || p._id, current: !!p.current }))
  }
  if (arr(db.faq).length) store.faq = db.faq
  if (Array.isArray(db.schedule)) {
    const raw = {}
    db.schedule.forEach((d) => {
      raw[d.date] = d
      if (d.secondWorkId) store.secondWorks[Number(d.date.slice(8))] = d.secondWorkId
    })
    store.scheduleRaw = raw
    rebuildDays()
  }
  if (db.config) {
    const cfg = db.config
    if (cfg.themeMode) store.themeMode = cfg.themeMode
    const next = store.displayConfig.map((it) => {
      if (Object.prototype.hasOwnProperty.call(cfg, it.k)) return { ...it, v: cfg[it.k] }
      return it
    })
    store.displayConfig = next
    if (typeof cfg['一周开始日'] === 'string') {
      setWeekStart(cfg['一周开始日'] === '周一' ? 1 : 0)
    }
  }
  store.loaded = true
}

/* 依据 scheduleRaw 重建当月 days（保留农历/节日静态角标） */
export function rebuildDays() {
  const list = []
  const y = store.view.y
  const m = String(store.view.m).padStart(2, '0')
  const total = monthDays(y, store.view.m)
  const base = {}
  if (y === 2024 && store.view.m === 9) DAYS.forEach((d) => (base[d.d] = d))
  for (let d = 1; d <= total; d++) {
    const key = y + '-' + m + '-' + String(d).padStart(2, '0')
    const rec = store.scheduleRaw[key]
    const info = base[d] || { d, lunar: '' }
    list.push({
      d,
      lunar: info.lunar,
      holiday: info.holiday,
      swap: info.swap,
      work: rec && rec.workId ? rec.workId : info.work || ''
    })
  }
  store.days = list
}

/* 修改某天班次（同时写后端） */
export async function setDayWork(day, workId, reply) {
  const y = store.view.y
  const m = String(store.view.m).padStart(2, '0')
  const date = y + '-' + m + '-' + String(day).padStart(2, '0')
  const remark = store.remarks[day] || ''
  const payload = { date, workId, secondWorkId: '', remark }
  store.scheduleRaw[date] = payload
  await api.setDay(payload)
  rebuildDays()
  if (reply) reply()
}


/* ---------- 便捷方法 ---------- */
export function shiftById(id) {
  return store.shifts.find((s) => s.id === id) || store.shifts[0]
}
export function shiftByName(name) {
  return store.shifts.find((s) => s.name === name)
}
export function fmtTime(sh) {
  if (!sh) return ''
  return sh.allDay ? '全天' : sh.start + '~' + sh.end
}
export function weekdayOf(y, m, d) {
  return new Date(y, m - 1, d).getDay()
}
export function monthDays(y, m) {
  return new Date(y, m, 0).getDate()
}
export function dayMap() {
  const map = {}
  if (store.view.y === 2024 && store.view.m === 9) store.days.forEach((d) => (map[d.d] = d))
  return map
}

export const currentDayInfo = computed(() => store.days.find((d) => d.d === store.selected) || {})
export const selectedShift = computed(() => (currentDayInfo.value.work ? shiftById(currentDayInfo.value.work) : null))
export const selectedWeekday = computed(() => weekdayOf(store.view.y, store.view.m, store.selected))

export const monthTitle = computed(() => store.view.y + '年' + store.view.m + '月')
export const cnMonth = computed(() => CN_MONTH[store.view.m - 1] + '月')
export const selectedDateText = computed(() => {
  const y = store.view.y
  const m = String(store.view.m).padStart(2, '0')
  const d = String(store.selected).padStart(2, '0')
  return y + '-' + m + '-' + d
})

/* ---------- 动作 ---------- */
export function selectDay(d) {
  store.selected = d
}
export function stepMonth(delta) {
  let m = store.view.m + delta
  let y = store.view.y
  if (m > 12) { m = 1; y += 1 }
  if (m < 1) { m = 12; y -= 1 }
  store.view.m = m
  store.view.y = y
}
export function jumpToday() {
  store.view.y = store.today.y
  store.view.m = store.today.m
  store.selected = store.today.d
}
export function setWeekStart(v) {
  store.weekStart = Number(v)
  store.weekStartLabel = Number(v) === 1 ? '周一' : '周日'
}
export function toggleAlarm(id) {
  const a = store.alarms.find((x) => x.id === id)
  if (a) {
    a.on = !a.on
    a.next = a.on ? a.next : '提醒已关闭'
  }
}
export function saveRemark(text) {
  if (text) store.remarks[store.selected] = text
  else delete store.remarks[store.selected]
}
export function openSheet(name, arg) {
  store.sheet = name
  store.sheetArg = arg || ''
}
export function closeSheet() {
  store.sheet = ''
  store.sheetArg = ''
}
export function openDialog(name) {
  store.dialog = name
}
export function closeDialog() {
  store.dialog = ''
}

export function useStore() {
  return { store }
}
