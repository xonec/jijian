<template>
  <view v-if="mode === 'chip'" class="chip" :class="{ 'chip--big': big }" :style="{ background: shift.color }">
    {{ shift.name }}
  </view>
  <view v-else class="shift-badge" :style="{ background: shift.color, borderRadius: radius + 'px' }">
    <text class="shift-badge__n" :style="{ fontSize: nameSize + 'px' }">{{ shift.name }}</text>
    <text v-if="timeText" class="shift-badge__t" :style="{ fontSize: timeSize + 'px' }">{{ timeText }}</text>
  </view>
</template>

<script>
export default {
  name: 'shift-badge',
  props: {
    shift: { type: Object, required: true },
    mode: { type: String, default: 'badge' },
    big: { type: Boolean, default: false },
    showBegin: { type: Boolean, default: true },
    showEnd: { type: Boolean, default: false },
    nameSize: { type: Number, default: 11 },
    timeSize: { type: Number, default: 11 },
    radius: { type: Number, default: 4 }
  },
  computed: {
    timeText() {
      const s = this.shift
      if (!s) return ''
      if (s.allDay) return this.showBegin || this.showEnd ? '全天' : ''
      if (this.showBegin && this.showEnd) return s.start + '~' + s.end
      if (this.showBegin) return s.start
      if (this.showEnd) return s.end
      return ''
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
