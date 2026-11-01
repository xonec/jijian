/**
 * 会员（赞助）状态与购买流程（云端/本地双后端）。
 * - 展示：方案/权益/是否 mock 由 api.vip.plans() 提供，云端以 vip 云函数配置为准
 * - 购买：支付宝已配置 → uni.requestPayment(alipay)；mock → 模拟支付；未配置 → 提示
 */
import { reactive, computed } from 'vue'
import api, { isCloud, userId } from '@/services/api.js'
import { toast, goPage } from '@/composables/use-nav.js'
import { VIP_PLANS, VIP_RIGHTS, fmtExpire } from '@/data/vip-plans.js'
import config from '@/config.js'

export const vipState = reactive({
  loaded: false,
  active: false,
  expireAt: 0,
  planId: '',
  selectedPlanId: 'year',
  plans: VIP_PLANS,
  rights: VIP_RIGHTS,
  configured: false,
  mock: false,
  error: ''
})

export const vipExpireText = computed(() => fmtExpire(vipState.expireAt))
export const vipRights = computed(() =>
  config.noAds ? vipState.rights.filter((r) => !r.title.includes('无广告')) : vipState.rights
)

function applyStatus(s) {
  if (!s) return
  vipState.active = !!s.active
  vipState.expireAt = Number(s.expireAt || 0)
  vipState.planId = s.planId || ''
}

export async function loadVip() {
  try {
    const [p, s] = await Promise.all([api.vip.plans(), api.vip.status()])
    if (p) {
      vipState.plans = Array.isArray(p.plans) && p.plans.length ? p.plans : VIP_PLANS
      vipState.rights = Array.isArray(p.rights) && p.rights.length ? p.rights : VIP_RIGHTS
      vipState.configured = !!p.configured
      vipState.mock = !!p.mock
    }
    applyStatus(s)
    vipState.error = ''
  } catch (e) {
    vipState.error = (e && (e.message || e.errMsg)) || '加载失败'
    vipState.plans = VIP_PLANS
    vipState.rights = VIP_RIGHTS
  } finally {
    vipState.loaded = true
  }
}

export async function refreshVipStatus() {
  try {
    applyStatus(await api.vip.status())
  } catch (e) {
    /* 忽略：状态刷新失败不影响页面 */
  }
}

export function planLabel(p) {
  if (!p) return ''
  return p.display || (p.price != null ? p.price + '元' : '')
}

export async function buyPlan(planId) {
  if (isCloud() && !userId()) {
    toast('请先登录账号')
    setTimeout(() => goPage('login'), 400)
    return
  }
  const id = planId || vipState.selectedPlanId
  let r
  try {
    r = await api.vip.createOrder({ planId: id, payType: 'alipay' })
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '下单失败')
    return
  }
  if (r && r.payInfo && r.payInfo.orderInfo) {
    uni.requestPayment({
      provider: r.payInfo.provider || 'alipay',
      orderInfo: r.payInfo.orderInfo,
      success: async () => {
        await refreshVipStatus()
        toast('支付成功，感谢支持！')
      },
      fail: (err) => {
        const msg = (err && (err.errMsg || err.message)) || ''
        if (/cancel/i.test(msg)) toast('已取消支付')
        else toast('支付未完成：' + msg)
      }
    })
    return
  }
  if (r && r.mock && r.order) {
    uni.showModal({
      title: '模拟支付',
      content: '尚未配置支付宝商户，是否模拟支付成功？（仅用于开发/演示）',
      confirmText: '模拟成功',
      cancelText: '取消',
      success: async (res) => {
        if (!res.confirm) return
        try {
          const m = await api.vip.mockPay(r.order.outTradeNo)
          applyStatus(m)
          toast('已开通会员（模拟支付）')
        } catch (e) {
          toast((e && (e.message || e.errMsg)) || '模拟支付失败')
        }
      }
    })
    return
  }
  toast((r && r.message) || '支付暂未配置')
}
