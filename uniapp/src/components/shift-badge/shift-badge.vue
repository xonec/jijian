<template>
  <view v-if="mode === 'chip'" class="chip" :class="{ 'chip--big': big }" :style="{ background: shift.color }">
    {{ shift.name }}
  </view>
  <view v-else class="shift-badge" :style="{ background: shift.color }">
    <text class="shift-badge__n">{{ shift.name }}</text>
    <text v-if="showTime" class="shift-badge__t">{{ timeText }}</text>
  </view>
</template>

<script>
export default {
  name: 'shift-badge',
  props: {
    shift: { type: Object, required: true },
    mode: { type: String, default: 'badge' },
    big: { type: Boolean, default: false },
    showTime: { type: Boolean, default: true }
  },
  computed: {
    timeText() {
      const s = this.shift
      if (!s) return ''
      return s.allDay ? '全天' : s.start
    }
  }
}
</script>

<style lang="scss" scoped>
.shift-badge {
  width: 100%;
  min-height: 27px;
  border-radius: var(--r-badge);
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 2px 2px 3px;
  line-height: 1.15;
  overflow: hidden;
}
.shift-badge__n {
  font-size: 11.5px;
  font-weight: 500;
  color: #ffffff;
  white-space: nowrap;
}
.shift-badge__t {
  font-size: 9.5px;
  color: rgba(255, 255, 255, 0.95);
  white-space: nowrap;
}
</style>
