<template>
  <page-frame tab="stat" title="排班统计">
    <template #header-right>
      <text class="export-btn" @click="onExport">导出数据</text>
    </template>

    <view class="stat-range" @click="openMonth">
      <text>{{ statMonthTitle }}</text>
      <ri-icon name="down" :size="14" />
    </view>

    <view v-if="hasData" class="card mt10">
      <view class="stat-donut">
        <donut-chart :items="stat.donut" :size="232" :labels="false" />
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
      <view class="detail-scroll">
        <view class="detail-table">
          <view class="detail-tr detail-tr--head">
            <text class="detail-td detail-td--date">日期</text>
            <text class="detail-td detail-td--week">星期</text>
            <text class="detail-td detail-td--shift">班次</text>
            <text class="detail-td detail-td--time">上班</text>
            <text class="detail-td detail-td--end">下班</text>
          </view>
          <view v-for="d in stat.details || []" :key="d.d" class="detail-tr">
            <text class="detail-td detail-td--date">{{ d.d }}</text>
            <text class="detail-td detail-td--week">{{ d.w }}</text>
            <view class="detail-td detail-td--shift">
              <view class="detail-chip" :style="{ background: shiftColor(d.work) }">{{ shiftName(d.work) }}</view>
            </view>
            <text class="detail-td detail-td--time">{{ d.start }}</text>
            <text class="detail-td detail-td--end">{{ d.end }}</text>
          </view>
        </view>
      </view>
      <view v-if="stat.details && stat.details.length" class="hint center" @click="onExport">查看并导出全部 Excel</view>
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

function csvCell(v) {
  const s = String(v == null ? '' : v)
  return /[",\r\n]/.test(s) ? '"' + s.replace(/"/g, '""') + '"' : s
}
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
    shiftName(id) {
      const s = shiftById(id)
      return s ? s.name : id
    },
    shiftColor(id) {
      const s = shiftById(id)
      return s ? s.color : '#55BB8A'
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
      const start = y + '-' + m + '-01'
      const end = y + '-' + m + '-' + String(last).padStart(2, '0')
      try {
        const st = await api.fetchStat(start, end)
        if (st) this.stat = st
      } catch (e) {
        /* 异常时保留已有统计 */
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
      if (!this.hasData) {
        toast('暂无数据可导出')
        return
      }
      const rows = [['日期', '星期', '班次', '上班', '下班']]
      ;(this.stat.details || []).forEach((d) => {
        rows.push([d.d, d.w, this.shiftName(d.work), d.start || '', d.end || ''])
      })
      const csv = '\ufeff' + rows.map((r) => r.map(csvCell).join(',')).join('\r\n')
      const name = '排班统计-' + this.statMonthTitle + '.csv'
      // #ifdef H5
      try {
        const blob = new Blob([csv], { type: 'text/csv;charset=utf-8;' })
        const a = document.createElement('a')
        a.href = URL.createObjectURL(blob)
        a.download = name
        document.body.appendChild(a)
        a.click()
        document.body.removeChild(a)
        URL.revokeObjectURL(a.href)
        toast('已导出 CSV')
        return
      } catch (e) {}
      // #endif
      // #ifdef APP-PLUS
      if (plus && plus.io) {
        plus.io.requestFileSystem(plus.io.PRIVATE_DOC, (fs) => {
          fs.root.getFile(name, { create: true }, (entry) => {
            entry.createWriter((writer) => {
              writer.onwrite = () => toast('已导出到应用文档目录')
              writer.onerror = () => toast('导出失败')
              writer.write(csv)
            }, () => toast('导出失败'))
          }, () => toast('导出失败'))
        }, () => toast('导出失败'))
        return
      }
      // #endif
      // #ifdef MP-WEIXIN
      try {
        const filePath = wx.env.USER_DATA_PATH + '/' + name
        wx.getFileSystemManager().writeFileSync(filePath, csv, 'utf8')
        if (uni.shareFileMessage) {
          uni.shareFileMessage({ filePath, fileName: name, success: () => toast('已导出'), fail: () => {
            uni.setClipboardData({ data: csv, success: () => toast('统计已复制到剪贴板') })
          } })
        } else {
          uni.setClipboardData({ data: csv, success: () => toast('统计已复制到剪贴板') })
        }
        return
      } catch (e) {}
      // #endif
      uni.setClipboardData({ data: csv, success: () => toast('统计已复制到剪贴板') })
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
.stat-range {
  margin-top: 10px;
  background: var(--surface);
  border-radius: var(--r-card);
  padding: 14px 0;
}
.empty-stat {
  padding: 36px 0;
  text-align: center;
  font-size: 14px;
  color: var(--text-3);
}
.stat-donut {
  padding: 8px 0 2px;
}
.detail-scroll {
  width: 100%;
  margin-top: 2px;
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
}
.detail-scroll::-webkit-scrollbar {
  display: none;
  width: 0;
  height: 0;
}
.detail-table {
  display: inline-block;
  min-width: 100%;
}
.detail-tr {
  display: flex;
  align-items: center;
  height: 40px;
  font-size: 12px;
  color: var(--text-2);
  border-bottom: 1px solid var(--line);
  white-space: nowrap;
}
.detail-tr--head {
  height: 32px;
  color: var(--text-3);
  border-bottom: 1px solid var(--line);
}
.detail-td {
  flex: none;
  padding-right: 6px;
  white-space: nowrap;
}
.detail-td--date {
  width: 22%;
  font-variant-numeric: tabular-nums;
}
.detail-td--week {
  width: 14%;
}
.detail-td--shift {
  width: 24%;
}
.detail-td--time {
  width: 18%;
  font-variant-numeric: tabular-nums;
}
.detail-td--end {
  width: 22%;
  font-size: 11px;
  font-variant-numeric: tabular-nums;
}
.detail-chip {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  height: 22px;
  padding: 0 8px;
  border-radius: 6px;
  color: #ffffff;
  font-size: 11.5px;
  line-height: 1;
}
</style>
