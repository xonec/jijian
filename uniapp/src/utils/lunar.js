/**
 * 农历 / 节气 / 节日（基于 lunar-javascript，供日历与小组件复用）
 *
 * label 优先级：节日 > 节气 > 初一显示月份 > 农历日名
 * holiday=true 表示按节日红色显示（节气里只有清明算节日）。
 */
import { Solar } from 'lunar-javascript'

const LUNAR_FESTIVAL = {
  '春节': '春节',
  '元宵节': '元宵',
  '龙头节': '龙头',
  '上巳节': '上巳',
  '端午节': '端午',
  '七夕节': '七夕',
  '中元节': '中元',
  '中秋节': '中秋',
  '重阳节': '重阳',
  '寒衣节': '寒衣',
  '下元节': '下元',
  '腊八节': '腊八',
  '祭灶节': '小年',
  '除夕': '除夕'
}

const SOLAR_FESTIVAL = {
  '元旦': '元旦',
  '情人节': '情人',
  '妇女节': '妇女',
  '植树节': '植树',
  '愚人节': '愚人',
  '劳动节': '劳动',
  '青年节': '青年',
  '儿童节': '儿童',
  '建党节': '建党',
  '建军节': '建军',
  '教师节': '教师',
  '国庆节': '国庆',
  '万圣节': '万圣',
  '感恩节': '感恩',
  '平安夜': '平安',
  '圣诞节': '圣诞'
}

const EMPTY = { label: '', lunarDay: '', monthLabel: '', holiday: false, jieqi: '', festival: '' }

function shortFestival(name, map) {
  if (!name) return ''
  const v = map[name] || String(name).replace(/节$/, '')
  return String(v).slice(0, 2)
}

export function getLunarInfo(y, m, d) {
  let solar
  let lunar
  try {
    solar = Solar.fromYmd(Number(y), Number(m), Number(d))
    lunar = solar.getLunar()
  } catch (e) {
    return { ...EMPTY }
  }
  const lunarDay = lunar.getDayInChinese()
  const monthInChinese = lunar.getMonthInChinese()
  const monthLabel = monthInChinese + '月'
  const jieqi = lunar.getJieQi() || ''
  const lunarFest = (lunar.getFestivals() || [])[0] || ''
  const solarFest = (solar.getFestivals() || [])[0] || ''

  let label = ''
  let holiday = false
  let festival = ''
  const knownLunar = lunarFest && LUNAR_FESTIVAL[lunarFest]
  const knownSolar = solarFest && SOLAR_FESTIVAL[solarFest]
  if (knownLunar) {
    label = shortFestival(lunarFest, LUNAR_FESTIVAL)
    holiday = true
    festival = lunarFest
  } else if (knownSolar) {
    label = shortFestival(solarFest, SOLAR_FESTIVAL)
    holiday = true
    festival = solarFest
  } else if (jieqi) {
    label = jieqi
    holiday = jieqi === '清明'
    festival = jieqi
  } else if (lunarDay === '初一') {
    label = monthLabel
  } else {
    label = lunarDay
  }
  return { label: String(label).slice(0, 2), lunarDay, monthLabel: String(monthLabel).slice(0, 2), holiday, jieqi, festival }
}

