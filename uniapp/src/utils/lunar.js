/** 农历日 / 月份 / 节气（基于 lunar-javascript），春节等节日由 data/holidays.js 提供 */
import { Solar } from 'lunar-javascript'

const EMPTY = { lunarDay: '', monthLabel: '', jieqi: '' }

export function getLunarInfo(y, m, d) {
  try {
    const solar = Solar.fromYmd(Number(y), Number(m), Number(d))
    const lunar = solar.getLunar()
    const monthInChinese = lunar.getMonthInChinese()
    return {
      lunarDay: lunar.getDayInChinese(),
      // 闰月显示 2 字（闰八），普通月份带「月」（八月）
      monthLabel: /^闰/.test(monthInChinese) ? monthInChinese : monthInChinese + '月',
      jieqi: lunar.getJieQi() || ''
    }
  } catch (e) {
    return { ...EMPTY }
  }
}
