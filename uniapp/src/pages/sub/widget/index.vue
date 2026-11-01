<template>
  <page-frame title="桌面小组件" back>
    <template #header-right>
      <view class="header-save" @click="save">保存</view>
    </template>

    <view class="widget-box">
      <view class="widget-preview">
        <view class="widget-preview__head">
          <text class="widget-preview__title">{{ payload.title }}</text>
          <view class="widget-preview__nav">
            <ri-icon name="back2" :size="11" class="widget-preview__arrow" />
            <text class="widget-preview__nav-text">本月</text>
            <ri-icon name="right" :size="11" class="widget-preview__arrow" />
          </view>
        </view>
        <view class="widget-preview__week">
          <text v-for="(w, i) in payload.weekLabels" :key="i" class="widget-preview__wd">{{ w }}</text>
        </view>
        <view class="widget-preview__grid">
          <view v-for="(cell, i) in previewCells" :key="i" class="widget-day">
            <text v-if="cell.d" class="widget-day__n" :class="{ 'widget-day__n--today': cell.today }">{{ cell.d }}</text>
            <view v-if="cell.color" class="widget-day__dot" :style="{ background: cell.color }" />
          </view>
        </view>
      </view>
    </view>

    <view class="sync-card">
      <view class="sync-card__row">
        <text class="sync-card__k">组件状态</text>
        <text class="sync-card__v">{{ statusText }}</text>
      </view>
      <view class="sync-card__row">
        <text class="sync-card__k">今日</text>
        <text class="sync-card__v">{{ todayText }}</text>
      </view>
    </view>

    <view class="group-title">显示内容</view>
    <view class="form-card">
      <cell-row
        v-for="row in displayRows"
        :key="row.key"
        :icon="row.icon"
        :label="row.label"
        :value="row.value"
        @click="cycle(row.key)"
      />
    </view>

    <view class="group-title">字体与配色</view>
    <view class="form-card">
      <cell-row
        v-for="row in styleRows"
        :key="row.key"
        :icon="row.icon"
        :label="row.label"
        :value="row.value"
        @click="cycle(row.key)"
      />
    </view>

    <view class="btn btn--primary mt14" @click="save">{{ syncing ? '正在刷新…' : '保存并刷新小组件' }}</view>
    <view class="btn btn--soft mt10" @click="refresh">仅刷新小组件</view>
    <view class="btn btn--soft mt10" @click="addTip">如何添加桌面小组件</view>

    <view class="hint">若小组件一直显示「正在加载」，可以先删除小组件再重新添加。</view>
    <view class="hint">App 端需要安装并编译 nativeplugins/uni-widget 原生插件后才能显示桌面小组件；未安装时保存仍会写入配置。</view>
  </page-frame>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue'
import { toast } from '@/composables/use-nav.js'
import {
  WIDGET_DEFAULTS, WIDGET_STYLES, WIDGET_DARK_MODES, TITLE_COLORS, CAL_COLORS,
  loadConfig, buildPayload, syncWidget, diagnoseWidget, addWidgetTip
} from '@/services/widget.js'

const cfg = ref(loadConfig())
const syncing = ref(false)
const diag = ref({ supported: false, installed: false, monthCount: 0, shiftCount: 0 })

const payload = computed(() => buildPayload(cfg.value))
const previewCells = computed(() => payload.value.weeks.reduce((a, w) => a.concat(w), []))

const statusText = computed(() => {
  if (!diag.value.supported) return 'H5 预览 · 配置可保存，App 内生效'
  if (!diag.value.installed) return '未检测到原生小组件插件'
  return '已添加 月历 ' + diag.value.monthCount + ' · 班次 ' + diag.value.shiftCount
})

const todayText = computed(() => {
  const t = payload.value.today || {}
  if (!t.shift) return '无排班'
  return t.shift + (t.time ? ' · ' + t.time : '') + (t.remark ? ' · ' + t.remark : '')
})

const displayRows = computed(() => [
  { key: 'style', icon: 'calendar', label: '小组件样式', value: cfg.value.style },
  { key: 'showRemark', icon: 'pencil', label: '显示备注', value: cfg.value.showRemark ? '开' : '关' },
  { key: 'showBeginTime', icon: 'time', label: '显示上班时间', value: cfg.value.showBeginTime ? '开' : '关' },
  { key: 'showEndTime', icon: 'time', label: '显示下班时间', value: cfg.value.showEndTime ? '开' : '关' }
])

const styleRows = computed(() => [
  { key: 'dateFontSize', icon: 'doc', label: '日期字号', value: cfg.value.dateFontSize },
  { key: 'workFontSize', icon: 'doc', label: '班次字号', value: cfg.value.workFontSize },
  { key: 'timeFontSize', icon: 'doc', label: '时间字号', value: cfg.value.timeFontSize },
  { key: 'titleBg', icon: 'palette', label: '标题背景色', value: cfg.value.titleBg },
  { key: 'calBg', icon: 'palette', label: '日历背景色', value: cfg.value.calBg },
  { key: 'darkMode', icon: 'sun', label: '暗黑模式配色', value: cfg.value.darkMode }
])

function nextIn(list, cur) {
  const i = list.indexOf(cur)
  return list[(i + 1) % list.length]
}

function cycle(key) {
  const c = cfg.value
  if (key === 'style') c.style = nextIn(WIDGET_STYLES, c.style)
  else if (key === 'darkMode') c.darkMode = nextIn(WIDGET_DARK_MODES, c.darkMode)
  else if (key === 'titleBg') c.titleBg = nextIn(TITLE_COLORS, c.titleBg)
  else if (key === 'calBg') c.calBg = nextIn(CAL_COLORS, c.calBg)
  else if (key === 'dateFontSize') c.dateFontSize = nextIn([10, 11, 12, 13, 14], c.dateFontSize)
  else if (key === 'workFontSize') c.workFontSize = nextIn([8, 9, 10, 11], c.workFontSize)
  else if (key === 'timeFontSize') c.timeFontSize = nextIn([7, 8, 9, 10], c.timeFontSize)
  else c[key] = !c[key]
}

function refreshDiag() {
  try { diag.value = diagnoseWidget() } catch (e) {}
}

function save() {
  if (syncing.value) return
  syncing.value = true
  const r = syncWidget(cfg.value)
  cfg.value = r.config
  syncing.value = false
  refreshDiag()
  if (!r.supported) toast('配置已保存（H5 预览不会同步到桌面）')
  else if (!r.native) toast('配置已保存，但原生小组件未安装，暂不可见')
  else toast('已保存并刷新桌面小组件')
}

function refresh() {
  const r = syncWidget(cfg.value)
  refreshDiag()
  if (!r.supported) toast('H5 预览无法刷新桌面小组件')
  else if (!r.native) toast('原生小组件插件未安装')
  else toast('已刷新桌面小组件')
}

function addTip() {
  addWidgetTip()
}

onMounted(() => {
  cfg.value = loadConfig()
  refreshDiag()
})
</script>

<style lang="scss" scoped>
.header-save {
  font-size: 14px;
  color: var(--primary);
  padding: 6px 0 6px 10px;
}
.widget-box {
  padding: 10px 14px 2px;
}
.widget-preview__title {
  font-size: 14px;
  font-weight: 600;
  color: var(--text-1);
}
.widget-preview__nav {
  display: flex;
  align-items: center;
  gap: 3px;
}
.widget-preview__arrow {
  color: var(--text-2);
}
.widget-preview__nav-text {
  font-size: 12px;
  color: var(--text-2);
}
.widget-preview__week {
  display: flex;
  margin-top: 8px;
}
.widget-preview__wd {
  flex: 1;
  text-align: center;
  font-size: 10px;
  color: var(--text-3);
}
.widget-day__n--today {
  color: var(--primary);
  font-weight: 600;
}
.sync-card {
  margin: 12px 16px 0;
  padding: 10px 14px;
  border-radius: 10px;
  background: var(--surface);
}
.sync-card__row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 5px 0;
}
.sync-card__k {
  font-size: 13px;
  color: var(--text-2);
}
.sync-card__v {
  font-size: 13px;
  color: var(--text-1);
}
</style>
