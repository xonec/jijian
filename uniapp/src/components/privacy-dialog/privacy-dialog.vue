<template>
  <view v-if="visible" class="privacy-mask">
    <view class="privacy-card" @click.stop>
      <view class="privacy-card__icon">
        <ri-icon name="doc" :size="26" />
      </view>
      <text class="privacy-card__title">隐私政策与用户协议</text>
      <text class="privacy-card__desc">很高兴看到你下载极简排班。为了保护你的隐私和个人信息，在使用 App 前请认真阅读以下协议。</text>
      <text class="privacy-card__desc">我们仅会在你授权后访问系统日历用于排班提醒，不会收集与排班无关的个人信息。点击「同意并继续」即表示你已阅读并同意《用户使用协议》与《应用隐私政策》。</text>
      <view class="privacy-card__link" @click="openAgreement">
        <text>查看完整协议</text>
        <ri-icon name="arrow_right" :size="13" />
      </view>
      <view class="privacy-card__actions">
        <view class="privacy-btn privacy-btn--ghost" @click="disagree">暂不同意</view>
        <view class="privacy-btn privacy-btn--primary" @click="agree">同意并继续</view>
      </view>
    </view>
  </view>
</template>

<script>
import { goPage, toast } from '@/composables/use-nav.js'

export default {
  name: 'privacy-dialog',
  props: {
    visible: { type: Boolean, default: false }
  },
  emits: ['agree'],
  methods: {
    openAgreement() {
      goPage('agreement')
    },
    disagree() {
      toast('需同意后才能使用')
    },
    agree() {
      this.$emit('agree')
    }
  }
}
</script>

<style lang="scss" scoped>
.privacy-mask {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 500;
  background: var(--scrim, rgba(0, 0, 0, 0.5));
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 30px;
}
.privacy-card {
  width: 100%;
  background: var(--surface, #fdfdfd);
  border-radius: 16px;
  padding: 20px 18px 16px;
  display: flex;
  flex-direction: column;
  align-items: center;
  animation: privacy-pop 0.2s cubic-bezier(0.2, 0.9, 0.3, 1.2);
}
@keyframes privacy-pop {
  from {
    transform: scale(0.94);
    opacity: 0;
  }
  to {
    transform: scale(1);
    opacity: 1;
  }
}
.privacy-card__icon {
  width: 52px;
  height: 52px;
  border-radius: 50%;
  background: rgba(85, 187, 138, 0.13);
  color: var(--primary, #55bb8a);
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 10px;
}
.privacy-card__title {
  display: block;
  font-size: 17px;
  font-weight: 600;
  color: var(--text-1, #000000);
  text-align: center;
  margin-bottom: 10px;
}
.privacy-card__desc {
  display: block;
  width: 100%;
  font-size: 13px;
  line-height: 1.7;
  color: var(--text-2, #222222);
  text-align: left;
}
.privacy-card__desc + .privacy-card__desc {
  margin-top: 8px;
}
.privacy-card__link {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 2px;
  margin-top: 14px;
  color: var(--primary, #55bb8a);
  font-size: 13px;
  padding: 4px 0;
}
.privacy-card__actions {
  display: flex;
  gap: 10px;
  width: 100%;
  margin-top: 16px;
}
.privacy-btn {
  flex: 1;
  height: 42px;
  border-radius: 12px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 15px;
  font-weight: 500;
}
.privacy-btn--ghost {
  background: var(--surface-2, #eeeeee);
  color: var(--text-2, #222222);
}
.privacy-btn--primary {
  background: var(--primary, #55bb8a);
  color: #ffffff;
}
.privacy-btn:active {
  opacity: 0.82;
}
</style>
