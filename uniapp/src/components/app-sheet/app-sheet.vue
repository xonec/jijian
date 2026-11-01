<template>
  <view v-if="visible" class="sheet-mask" @click="$emit('close')">
    <view class="sheet" @click.stop>
      <view class="sheet__grabber" />
      <text v-if="title" class="sheet__title">{{ title }}</text>
      <view class="sheet__body">
        <slot />
      </view>
      <view v-if="$slots.footer" class="sheet__footer">
        <slot name="footer" />
      </view>
      <view class="sheet__safe" />
    </view>
  </view>
</template>

<script>
export default {
  name: 'app-sheet',
  props: {
    visible: { type: Boolean, default: false },
    title: { type: String, default: '' }
  },
  emits: ['close']
}
</script>

<style lang="scss" scoped>
.sheet-mask {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 300;
  background: var(--scrim);
  display: flex;
  flex-direction: column;
  justify-content: flex-end;
}
.sheet {
  background: var(--surface);
  border-radius: var(--r-sheet) var(--r-sheet) 0 0;
  padding: 8px 0 0;
  max-height: 78vh;
  display: flex;
  flex-direction: column;
  animation: sheet-up 0.24s cubic-bezier(0.2, 0.8, 0.2, 1);
}
@keyframes sheet-up {
  from {
    transform: translateY(100%);
  }
  to {
    transform: translateY(0);
  }
}
.sheet__grabber {
  width: 36px;
  height: 4px;
  border-radius: 2px;
  background: var(--text-3);
  opacity: 0.35;
  margin: 6px auto 8px;
}
.sheet__title {
  display: block;
  text-align: center;
  font-size: 16px;
  font-weight: 600;
  color: var(--text-1);
  padding: 4px 18px 10px;
}
.sheet__body {
  overflow-y: auto;
  padding: 0 12px 6px;
}
.sheet__footer {
  padding: 10px 12px 0;
}
.sheet__safe {
  height: calc(16px + constant(safe-area-inset-bottom));
  height: calc(16px + env(safe-area-inset-bottom));
}
</style>
