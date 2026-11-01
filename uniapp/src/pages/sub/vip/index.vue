<template>
  <page-frame title="会员" back>
    <view class="vip-hero">
      <ri-icon name="vip" :size="34" class="vip-hero__crown" />
      <text class="vip-hero__title">极简排班 · 会员</text>
      <text class="vip-hero__sub">{{ heroSub }}</text>
    </view>

    <view v-if="vipState.active" class="vip-status">
      <ri-icon name="check" :size="16" class="vip-status__ico" />
      <text class="vip-status__txt">已开通 · 有效期至 {{ vipExpireText }}</text>
    </view>

    <view class="plan-grid">
      <view
        v-for="p in vipState.plans"
        :key="p.id"
        class="plan"
        :class="{ 'plan--on': vipState.selectedPlanId === p.id }"
        @click="vipState.selectedPlanId = p.id"
      >
        <text v-if="p.best" class="plan__best">最划算</text>
        <text class="plan__p">{{ planLabel(p) }}</text>
        <text class="plan__d">{{ p.unit }}</text>
        <text class="plan__d">{{ p.note }}</text>
      </view>
    </view>

    <view class="group-title">会员权益</view>
    <view class="card">
      <view class="rights">
        <view v-for="r in vipRights" :key="r.title" class="right-item">
          <ri-icon :name="r.icon" :size="20" class="right-item__icon" />
          <view class="right-item__body">
            <text class="right-item__t">{{ r.title }}</text>
            <text class="right-item__d">{{ r.desc }}</text>
          </view>
        </view>
      </view>
    </view>

    <view class="btn btn--vip mt14" @click="onBuy">{{ vipState.active ? '续费' : '立即开通' }}</view>
    <view class="hint center">{{ vipState.active ? '续费时长会累加到当前到期时间之后' : '不会出现自动扣费，会员到期需要手动续费' }}</view>
    <view class="hint center">购买失败或使用微信支付，请微信联系客服</view>
    <view v-if="vipState.mock" class="hint center mock-tip">当前为模拟支付（未配置支付宝商户）</view>
    <view v-if="vipState.error" class="hint center">会员状态加载失败：{{ vipState.error }}</view>
  </page-frame>
</template>

<script setup>
import { computed, onMounted } from 'vue'
import {
  vipState, vipRights, vipExpireText, loadVip, buyPlan, planLabel
} from '@/composables/use-vip.js'
import config from '@/config.js'

const heroSub = computed(() => {
  if (vipState.active) return '感谢支持，已解锁全部会员权益'
  return config.noAds ? '支持独立开发，解锁专属客服' : '一次付费，解锁全部特权'
})

onMounted(() => {
  loadVip()
})

function onBuy() {
  buyPlan(vipState.selectedPlanId)
}
</script>

<style lang="scss" scoped>
.vip-hero__crown {
  display: block;
}
.vip-hero__title {
  display: block;
}
.vip-hero__sub {
  display: block;
}
.vip-status {
  display: flex;
  align-items: center;
  gap: 6px;
  margin: 14px 16px 0;
  padding: 10px 14px;
  border-radius: 10px;
  background: rgba(197, 168, 116, 0.14);
  color: #8c6f38;
}
.vip-status__ico {
  color: #c5a874;
  flex: none;
}
.vip-status__txt {
  font-size: 13px;
}
.plan__p {
  display: block;
}
.plan__d {
  display: block;
}
.plan__best {
  display: block;
}
.right-item__icon {
  flex: none;
}
.right-item__body {
  flex: 1;
}
.right-item__t {
  display: block;
}
.right-item__d {
  display: block;
}
.mock-tip {
  color: #c5a874;
}
</style>
