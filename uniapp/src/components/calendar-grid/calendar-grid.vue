<template>
  <view class="calendar">
    <text class="cal-watermark">{{ watermark }}</text>
    <view class="cal-week">
      <text v-for="w in weekOrder" :key="w" class="cal-week__item">{{ w }}</text>
    </view>
    <view class="cal-grid">
      <view
        v-for="(cell, i) in cells"
        :key="i"
        class="cal-cell"
        :class="cellClass(cell)"
        @click="onSelect(cell)"
      >
        <template v-if="cell.day">
          <view class="cal-date">
            <text class="cal-num">{{ cell.day }}</text>
            <text v-if="cell.lunar" class="cal-lunar" :class="cell.lunarClass">{{ cell.lunar }}</text>
            <text v-if="cell.swap" class="cal-lunar cal-lunar--swap">调班</text>
          </view>
          <shift-badge v-if="cell.shift" :shift="cell.shift" :show-time="showTime" />
        </template>
      </view>
    </view>
    <view class="cal-foot">
      <view class="cal-foot__btn" @click="$emit('prev')">
        <ri-icon name="back2" :size="13" />
        <text>上个月</text>
      </view>
      <text class="cal-foot__today" @click="$emit('today')">今天</text>
      <view class="cal-foot__btn" @click="$emit('next')">
        <text>下个月</text>
        <ri-icon name="right" :size="13" />
      </view>
    </view>
  </view>
</template>

<script>
import { WEEK, CN_MONTH, weekdayOf, monthDays, shiftById } from '@/composables/use-store.js'

export default {
  name: 'calendar-grid',
  props: {
    year: { type: Number, required: true },
    month: { type: Number, required: true },
    days: { type: Object, default: () => ({}) },
    selected: { type: Number, default: 0 },
    today: { type: Object, default: () => ({}) },
    weekStart: { type: Number, default: 0 },
    showLunar: { type: Boolean, default: true },
    showHoliday: { type: Boolean, default: true },
    showTime: { type: Boolean, default: true }
  },
  emits: ['select', 'prev', 'next', 'today'],
  computed: {
    weekOrder() {
      return WEEK.slice(this.weekStart).concat(WEEK.slice(0, this.weekStart))
    },
    watermark() {
      return CN_MONTH[this.month - 1] + '月'
    },
    cells() {
      const list = []
      const first = (weekdayOf(this.year, this.month, 1) - this.weekStart + 7) % 7
      const total = monthDays(this.year, this.month)
      for (let i = 0; i < first; i++) list.push({ day: 0 })
      for (let d = 1; d <= total; d++) {
        const info = this.days[d] || { d, lunar: '' }
        let lunar = ''
        let lunarClass = ''
        if (this.showLunar) {
          lunar = info.lunar || ''
          if (info.holiday && this.showHoliday) lunarClass = 'cal-lunar--holiday'
          else if (info.swap) lunarClass = 'cal-lunar--swap'
        }
        const isToday =
          this.year === this.today.y && this.month === this.today.m && d === this.today.d
        list.push({
          day: d,
          lunar,
          lunarClass,
          swap: !!info.swap,
          shift: info.work ? shiftById(info.work) : null,
          isToday,
          isSelected: d === this.selected
        })
      }
      return list
    }
  },
  methods: {
    cellClass(cell) {
      return {
        'cal-cell--today': cell.isToday,
        'cal-cell--selected': cell.isSelected,
        'cal-cell--empty': !cell.day
      }
    },
    onSelect(cell) {
      if (!cell.day) return
      this.$emit('select', cell.day)
    }
  }
}
</script>

<style lang="scss" scoped>
.calendar {
  position: relative;
  background: var(--surface);
  border-radius: var(--r-card);
  padding: 6px 4px 8px;
  overflow: hidden;
}
.cal-watermark {
  position: absolute;
  left: 50%;
  top: 54%;
  transform: translate(-50%, -50%);
  font-size: 92px;
  font-weight: 700;
  letter-spacing: 10px;
  color: var(--text-1);
  opacity: 0.06;
  line-height: 1;
  white-space: nowrap;
}
.cal-week {
  display: flex;
  height: 32px;
}
.cal-week__item {
  flex: 1;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 13px;
  color: var(--text-3);
}
.cal-grid {
  display: flex;
  flex-wrap: wrap;
}
.cal-cell {
  width: 14.2857%;
  height: 68px;
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 5px 1px 0;
  border-radius: 9px;
  position: relative;
}
.cal-cell--today {
  background: rgba(238, 63, 77, 0.08);
}
.cal-cell--selected {
  background: rgba(85, 187, 138, 0.2);
  box-shadow: inset 0 0 0 1.2px var(--primary);
}
.cal-cell--today.cal-cell--selected {
  background: rgba(85, 187, 138, 0.2);
}
.cal-date {
  display: flex;
  align-items: flex-start;
  gap: 1px;
  height: 22px;
  line-height: 1;
  white-space: nowrap;
}
.cal-num {
  font-size: 19px;
  color: var(--text-1);
  letter-spacing: -0.3px;
}
.cal-cell--today .cal-num {
  color: var(--important);
  font-weight: 700;
}
.cal-lunar {
  font-size: 8.5px;
  color: var(--text-3);
  white-space: nowrap;
  flex-shrink: 0;
  letter-spacing: -0.2px;
}
.cal-lunar--swap {
  font-size: 8px;
  letter-spacing: -0.3px;
}
.cal-lunar--holiday {
  color: var(--important);
}
.cal-lunar--swap {
  color: #5a8fd6;
}
.cal-foot {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 9px 12px 3px;
  margin-top: 2px;
  border-top: 1px solid var(--line);
}
.cal-foot__btn {
  display: flex;
  align-items: center;
  gap: 5px;
  font-size: 13px;
  color: var(--text-3);
}
.cal-foot__btn .ri {
  font-size: 13px;
  color: var(--text-3);
}
.cal-foot__today {
  font-size: 13px;
  color: var(--primary);
}
</style>
