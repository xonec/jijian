<template>
  <page-frame tab="stat" title="排班统计">
    <template #header-right>
      <text class="export-btn" @click="onExport">导出数据</text>
    </template>

    <view class="stat-range" @click="onRange">
      <text>{{ stat.range[0] }} 至 {{ stat.range[1] }}</text>
      <ri-icon name="down" :size="14" />
    </view>

    <view class="card mt10">
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

    <view class="stat-card">
      <view class="stat-card__title">时长统计</view>
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
      <view class="hint center" @click="onExport">查看并导出全部 Excel</view>
    </view>
  </page-frame>
</template>

<script>
import { api } from '@/services/api.js'
import { store, shiftById } from '@/composables/use-store.js'
import { toast } from '@/composables/use-nav.js'

export default {
  name: 'StatTabPage',
  data() {
    return {
      store,
      stat: store.stat
    }
  },
  computed: {
    avgText() {
      const v = this.stat.avgHours
      return v === undefined || v === null ? '0' : String(Number(v))
    },
    bars() {
      const d = this.stat.donut || []
      return [
        { label: '早班', width: 56, hours: '126h', color: (d[0] && d[0].color) || '#1BA784' },
        { label: '晚班', width: 64, hours: '144h', color: (d[1] && d[1].color) || '#303048' }
      ]
    }
  },
  onShow() {
    this.loadStat()
  },
  methods: {
    shiftOf(id) {
      return shiftById(id)
    },
    async loadStat() {
      try {
        const st = await api.fetchStat('2024-09-01', '2024-09-30')
        if (st && Array.isArray(st.donut) && st.donut.length) this.stat = st
      } catch (e) {
        /* 异常时保留 store 内置统计 */
      }
    },
    onExport() {
      toast('功能演示')
    },
    onRange() {
      toast('功能演示')
    }
  }
}
</script>

<style lang="scss" scoped>
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
