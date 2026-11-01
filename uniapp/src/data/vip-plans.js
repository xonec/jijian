/**
 * 会员（赞助）方案与权益：本地 mock 与客户端兜底共用；云端以 vip 云函数 vs 配置为准。
 * 注意：本项目不接入广告，「无需去广告」；权益只保留赞助/客服/标识。
 */
export const VIP_PLANS = [
  { id: 'month', price: 3, display: '3元', unit: '每月', note: '每天1毛钱', days: 30 },
  { id: 'year', price: 12, display: '12元', unit: '每年', note: '每天3.3分钱', days: 365, best: true },
  { id: 'forever', price: 18, display: '18元', unit: '永久', note: '一次性买断', days: 36500 }
]

export const VIP_RIGHTS = [
  { icon: 'lightbulb_flash', title: '支持开发', desc: '促使开发者砥砺前行，呈现更优质的App功能' },
  { icon: 'user', title: '专属客服', desc: '会员用户优先响应' },
  { icon: 'vip', title: '会员标识', desc: '个人主页展示会员徽章' }
]

export function planById(id) {
  return VIP_PLANS.find((p) => p.id === id) || VIP_PLANS[0]
}

export function fmtExpire(ts) {
  if (!ts) return ''
  const d = new Date(Number(ts))
  const p = (n) => (n < 10 ? '0' + n : String(n))
  return d.getFullYear() + '-' + p(d.getMonth() + 1) + '-' + p(d.getDate())
}
