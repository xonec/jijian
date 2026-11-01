<template>
  <view class="tabbar">
    <view
      v-for="item in items"
      :key="item.key"
      class="tab-item"
      :class="{ 'tab-item--on': current === item.key }"
      @click="onTap(item.key)"
    >
      <ri-icon :name="item.icon" :size="20" />
      <text class="tab-item__label">{{ item.label }}</text>
    </view>
    <view class="tabbar__safe" />
  </view>
</template>

<script>
import { goTab } from '@/composables/use-nav.js'

export default {
  name: 'app-tabbar',
  props: { current: { type: String, default: 'home' } },
  data() {
    return {
      items: [
        { key: 'home', label: '排班', icon: 'home' },
        { key: 'work', label: '班次', icon: 'sun' },
        { key: 'alarm', label: '提醒', icon: 'alarm' },
        { key: 'stat', label: '统计', icon: 'stat' },
        { key: 'setting', label: '我的', icon: 'user' }
      ]
    }
  },
  methods: {
    onTap(key) {
      if (key === this.current) return
      goTab(key)
    }
  }
}
</script>

<style lang="scss" scoped>
.tabbar {
  position: fixed;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 100;
  display: flex;
  align-items: stretch;
  height: var(--tabbar-h);
  background: var(--bg);
  border-top: 1px solid var(--line);
}
.tab-item {
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 2px;
  color: var(--text-3);
  font-size: 10px;
}
.tab-item .ri {
  font-size: 20px;
  color: var(--text-3);
}
.tab-item--on .ri,
.tab-item--on .tab-item__label {
  color: var(--primary);
}
.tabbar__safe {
  position: absolute;
  left: 0;
  right: 0;
  bottom: calc(-1 * constant(safe-area-inset-bottom));
  height: constant(safe-area-inset-bottom);
  background: var(--bg);
}
</style>
