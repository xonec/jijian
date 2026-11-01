<template>
  <view class="page-frame" :class="themeClass">
    <slot name="header">
      <view class="header">
        <view class="header__side">
          <view v-if="back" class="header__back" @click="onBack">
            <ri-icon name="back" :size="21" />
          </view>
        </view>
        <text v-if="title" class="header__title">{{ title }}</text>
        <view class="header__side header__side--right">
          <slot name="header-right" />
        </view>
      </view>
    </slot>
    <view class="page-body" :class="tab ? 'page-body--tabbar' : 'page-body--plain'">
      <slot />
    </view>
    <app-tabbar v-if="tab" :current="tab" />
    <privacy-dialog :visible="privacyVisible" @agree="onPrivacyAgree" />
  </view>
</template>

<script>
import { useTheme } from '@/composables/use-theme.js'
import { back } from '@/composables/use-nav.js'
import PrivacyDialog from '@/components/privacy-dialog/privacy-dialog.vue'

export default {
  name: 'page-frame',
  components: { PrivacyDialog },
  props: {
    title: { type: String, default: '' },
    back: { type: Boolean, default: false },
    tab: { type: String, default: '' }
  },
  data() {
    let agreed = false
    try {
      agreed = !!uni.getStorageSync('jy_privacy_agreed')
    } catch (e) {}
    return {
      privacyVisible: !agreed
    }
  },
  setup() {
    const { themeClass } = useTheme()
    return { themeClass }
  },
  methods: {
    onBack() {
      back()
    },
    onPrivacyAgree() {
      try {
        uni.setStorageSync('jy_privacy_agreed', true)
      } catch (e) {}
      this.privacyVisible = false
    }
  }
}
</script>

<style lang="scss" scoped>
.page-frame {
  padding-top: var(--status-bar-height, 0px);
}
</style>
