<template>
  <view v-if="visible" class="dialog-mask" @click="$emit('close')">
    <view class="dialog" @click.stop>
      <text v-if="title" class="dialog__title">{{ title }}</text>
      <text v-if="text" class="dialog__text">{{ text }}</text>
      <view class="dialog__content">
        <slot />
      </view>
      <view class="dialog__actions">
        <slot name="actions" />
      </view>
    </view>
  </view>
</template>

<script>
export default {
  name: 'app-dialog',
  props: {
    visible: { type: Boolean, default: false },
    title: { type: String, default: '' },
    text: { type: String, default: '' }
  },
  emits: ['close']
}
</script>

<style lang="scss" scoped>
.dialog-mask {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 400;
  background: var(--scrim);
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 32px;
}
.dialog {
  width: 100%;
  background: var(--surface);
  border-radius: 16px;
  padding: 20px 18px 14px;
  animation: dialog-pop 0.2s cubic-bezier(0.2, 0.9, 0.3, 1.2);
}
@keyframes dialog-pop {
  from {
    transform: scale(0.94);
    opacity: 0;
  }
  to {
    transform: scale(1);
    opacity: 1;
  }
}
.dialog__title {
  display: block;
  font-size: 16px;
  font-weight: 600;
  text-align: center;
  color: var(--text-1);
  margin-bottom: 10px;
}
.dialog__text {
  display: block;
  font-size: 13px;
  line-height: 1.6;
  color: var(--text-2);
  margin-bottom: 16px;
  white-space: pre-line;
}
.dialog__actions {
  display: flex;
  gap: 10px;
  margin-top: 14px;
}
.dialog__actions .btn {
  height: 40px;
  font-size: 15px;
}
</style>
