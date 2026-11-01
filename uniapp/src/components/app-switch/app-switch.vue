<template>
  <view class="switch" :class="{ 'switch--on': modelValue }" @click="onTap">
    <view class="switch__knob" />
  </view>
</template>

<script>
export default {
  name: 'app-switch',
  props: { modelValue: { type: Boolean, default: false } },
  emits: ['update:modelValue', 'change'],
  methods: {
    onTap() {
      const v = !this.modelValue
      this.$emit('update:modelValue', v)
      this.$emit('change', v)
    }
  }
}
</script>

<style lang="scss" scoped>
.switch {
  width: 44px;
  height: 26px;
  border-radius: 999px;
  background: var(--surface-2);
  position: relative;
  transition: background 0.2s ease;
  flex: none;
}
.switch__knob {
  position: absolute;
  top: 3px;
  left: 3px;
  width: 20px;
  height: 20px;
  border-radius: 50%;
  background: #fff;
  transition: transform 0.2s ease;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);
}
.switch--on {
  background: var(--primary);
}
.switch--on .switch__knob {
  transform: translateX(18px);
}
</style>
