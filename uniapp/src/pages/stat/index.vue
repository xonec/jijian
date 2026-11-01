<template>
  <page-frame tab="stat" title="排班统计">
    <template #header-right>
      <text class="export-btn" @click="onExport">导出数据</text>
    </template>

    <view class="stat-range" @click="openMonth">
      <text>{{ statMonthTitle }}</text>
      <ri-icon name="down" :size="14" />
    </view>

    <view v-if="stat.donut && stat.donut.length" class="card mt10">
      <view class="stat-donut">
        <donut-chart :items="stat.donut" :size="232" />
      </view>
      <view class="legend-grid">
        <view v-for="x in stat.donut" :key="x.name" class="legend-grid__item">
          <view class="legend-grid__dot" :style="{ background: x.color }" />
          <text>{{ x.name }}</text>
          <text class="legend-grid__num">{{ x.value }}次 {{ x.pct }}%</text>
        </view>
      </view>
    </view>
    <view v-else class="card mt10 empty-stat">暂无数据</view>

    <view class="stat-card">
      <view class="stat-card__title">时长统计</view>
      <template v-if="hasData">
        <view class="metric-row">
          <view class="metric">
            <view class="metric__v">{{ stat.totalHours }}<text class="metric__u"> 小时</text></view>
            <view class="metric__k">总工作时长</view>
          </view>
          <view class="metric">
            <view class="metric__v">{{ avgText }}<text class="metric__u"> 小时</text></view>
            <view class="metric__k">平均每班</view>
          </view>
          <view class="metric">
            <view class="metric__v">{{ stat.restHours }}<text class="metric__u"> 小时</text></view>
            <view class="metric__k">休息时长</view>
          </view>
        </view>
        <view v-for="b in bars" :key="b.label" class="bar-line">
          <text>{{ b.label }}</text>
          <view class="bar-line__bar" :style="{ width: b.width + '%', background: b.color }" />
          <text class="bar-line__num">{{ b.hours }}</text>
        </view>
      </template>
      <view v-else class="hint center">当前区间暂无可统计时长</view>
    </view>

    <view class="stat-card">
      <view class="stat-card__title">排班详情</view>
      <view v-for="d in stat.details" :key="d.d" class="detail-row">
        <text class="detail-row__date">{{ d.d }}</text>
        <text class="detail-row__week">{{ d.w }}</text>
        <shift-badge mode="chip" :shift="shiftOf(d.work)" />
        <view class="detail-row__blank" />
        <text class="detail-row__time">{{ d.start }} – {{ d.end }}</text>
        <text class="detail-row__dur">{{ d.dur }}</text>
      </view>
      <view v-if="stat.details && stat.details.length" class="hint center" @click="onExport">查看并导出全部 Excel</view>
      <view v-else class="hint center">当前月份暂无排班记录</view>
    </view>
    <app-sheet :visible="monthSheet" title="选择月份" @close="monthSheet = false">
      <view class="month-bar">
        <view class="month-bar__nav" @click="statView.y = statView.y - 1">
          <ri-icon name="back" :size="18" />
        </view>
        <text class="month-bar__y">{{ statView.y }}年</text>
        <view class="month-bar__nav" @click="statView.y = statView.y + 1">
          <ri-icon name="right" :size="18" />
        </view>
      </view>
      <view class="month-grid">
        <view
          v-for="m in 12"
          :key="m"
          class="month-cell"
          :class="{ 'month-cell--on': m === statView.m }"
          @click="pickMonth(m)"
        >
          {{ m }}月
        </view>
      </view>
    </app-sheet>
  </page-frame>
</template>

<script>
import { api } from '@/services/api.js'
import { store, shiftById } from '@/composables/use-store.js'
import { toast } from '@/composables/use-nav.js'

export default {
  name: 'StatTabPage',
  data() {
    const now = new Date()
    return {
      store,
      stat: store.stat,
      monthSheet: false,
      statView: { y: now.getFullYear(), m: now.getMonth() + 1 }
    }
  },
  computed: {
    statMonthTitle() {
      return this.statView.y + '年' + this.statView.m + '月'
    },
    hasData() {
      return !!(this.stat.donut && this.stat.donut.length)
    },
    avgText() {
      const v = this.stat.avgHours
      return v === undefined || v === null ? '0' : String(Number(v))
    },
    bars() {
      const d = this.stat.donut || []
      const total = d.reduce((s, x) => s + (x.value || 0), 0) || 1
      return d.map((x) => {
        const sh = (this.store.shifts || []).find((s) => s.name === x.name)
        const hours = this.shiftHours(sh) * (x.value || 0)
        return {
          label: x.name,
          width: Math.round(((x.value || 0) / total) * 100),
          hours: Math.round(hours) + 'h',
          color: x.color
        }
      })
    }
  },
  onShow() {
    this.loadStat()
  },
  methods: {
    shiftOf(id) {
      return shiftById(id)
    },
    shiftHours(sh) {
      if (!sh || sh.allDay) return 0
      const toMin = (t) => {
        const m = /^(\d{1,2}):(\d{2})$/.exec(String(t || '').replace(/^次日/, ''))
        return m ? Number(m[1]) * 60 + Number(m[2]) : 0
      }
      let start = toMin(sh.start)
      let end = toMin(sh.end)
      if (/次日/.test(sh.end || '')) end += 24 * 60
      let diff = end - start
      if (diff < 0) diff += 24 * 60
      return diff / 60
    },
    async loadStat() {
      const y = this.statView.y
      const m = String(this.statView.m).padStart(2, '0')
      const last = new Date(y, this.statView.m, 0).getDate()
      const start = `${y}-${m}-01`
      const end = `${y}-${m}-${String(last).padStart(2, '0')}`
      try {
        const st = await api.fetchStat(start, end)
        if (st) this.stat = st
      } catch (e) {
        /* 异常时保留 store 内置统计 */
      }
    },
    openMonth() {
      this.monthSheet = true
    },
    pickMonth(m) {
      this.statView.m = m
      this.monthSheet = false
      this.loadStat()
    },
    onExport() {
      toast('功能演示')
    }
  }
}
</script>

<style lang="scss" scoped>
.empty-stat {
  padding: 36px 0;
  text-align: center;
  font-size: 14px;
  color: var(--text-3);
}
.export-btn {
  font-size: 14px;
  color: var(--primary);
  padding: 6px;
  line-height: 1.2;
}
.stat-donut {
  padding: 8px 0 2px;
}
</style>
