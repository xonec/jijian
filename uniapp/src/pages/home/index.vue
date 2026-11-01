<template>
  <page-frame tab="home">
    <template #header>
      <view class="header">
        <view class="header__side">
          <view class="month-btn" @click="openSheet('month')">
            <text>{{ monthTitle }}</text>
            <ri-icon name="down" :size="15" />
          </view>
        </view>
        <view class="header__side header__side--right">
          <view v-if="!noAds" class="small-btn" @click="goPage('vip')">去广告</view>
          <view class="header__icon" @click="openSheet('project')">
            <ri-icon name="list" :size="20" />
          </view>
          <view class="header__icon" @click="openSheet('config')">
            <ri-icon name="settings" :size="20" />
          </view>
        </view>
      </view>
    </template>

    <!-- 公告/提示条 -->
    <view v-if="store.tipVisible" class="tip">
      <ri-icon name="notification" :size="16" class="tip__ico" />
      <text class="tip__text">温馨提示: 点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项</text>
      <view class="tip__close" @click="store.tipVisible = false">
        <ri-icon name="remove" :size="14" />
      </view>
    </view>

    <!-- 当月班次统计色条 -->
    <view class="legend">
      <view v-for="(it, i) in legendItems" :key="i" class="legend__item">
        <view class="legend__dot" :style="{ background: it.color }" />
        <text class="legend__text">{{ it.name }}({{ it.value }})</text>
      </view>
    </view>

    <!-- 月历 -->
    <calendar-grid
      :year="store.view.y"
      :month="store.view.m"
      :days="dayMapData"
      :selected="store.selected"
      :today="store.today"
      :week-start="store.weekStart"
      :show-lunar="showLunar"
      :show-holiday="showHoliday"
      :show-time="showTime"
      @select="onSelect"
      @prev="prevMonth"
      @next="nextMonth"
      @today="jumpToday"
    />

    <!-- 选中日班次 / 备注 -->
    <view class="card mt10">
      <view class="day-head">
        <text class="day-head__d">{{ selectedDateText }}</text>
        <text class="day-head__w">{{ selectedWeekdayText }}</text>
      </view>
      <view class="work-row" @click="openSheet('shift', 'first')">
        <template v-if="selectedShift">
          <shift-badge :shift="selectedShift" mode="chip" big />
          <text class="work-row__time">{{ fmtTime(selectedShift) }}</text>
        </template>
        <text v-else class="work-row__add">
          <ri-icon name="add" :size="14" />
          选择第一班次
        </text>
        <view class="work-row__blank" />
        <ri-icon name="arrow_right" :size="15" class="gray" />
      </view>
      <view class="work-row" @click="openSheet('shift', 'second')">
        <template v-if="secondShift">
          <shift-badge :shift="secondShift" mode="chip" big />
          <text class="work-row__time">{{ fmtTime(secondShift) }}</text>
          <view class="work-row__blank" />
          <text class="remark--accent" style="font-size: 12.5px" @click.stop="clearSecond">取消第二班次</text>
        </template>
        <template v-else>
          <text class="work-row__add">
            <ri-icon name="add" :size="14" />
            选择第二班次
          </text>
        </template>
      </view>
      <view class="remark" :class="{ 'remark--accent': !remarkText }" @click="onRemark">
        <ri-icon :name="remarkText ? 'pencil' : 'add'" :size="13" />
        <text>{{ remarkText || '设置备注' }}</text>
      </view>
    </view>

    <!-- 操作按钮 -->
    <view class="home-actions">
      <view class="btn btn--primary" @click="store.editMode = !store.editMode">
        {{ store.editMode ? '完成排班' : '开启排班' }}
      </view>
      <view v-if="!store.editMode" class="btn btn--ghost" @click="openSheet('shift', 'second')">
        第二班次
      </view>
    </view>

    <!-- 排班模式底部操作条 -->
    <view v-if="store.editMode" class="oper-panel">
      <view v-for="op in operItems" :key="op.label" class="oper-item" @click="onOper(op.label)">
        <ri-icon :name="op.icon" :size="20" />
        <text>{{ op.label }}</text>
      </view>
    </view>

    <!-- 月份选择 -->
    <app-sheet :visible="store.sheet === 'month'" title="选择月份" @close="closeSheet">
      <view class="month-bar">
        <view class="month-bar__nav" @click="store.view.y = store.view.y - 1">
          <ri-icon name="back" :size="18" />
        </view>
        <text class="month-bar__y">{{ store.view.y }}年</text>
        <view class="month-bar__nav" @click="store.view.y = store.view.y + 1">
          <ri-icon name="right" :size="18" />
        </view>
      </view>
      <view class="month-grid">
        <view
          v-for="m in 12"
          :key="m"
          class="month-cell"
          :class="{ 'month-cell--on': m === store.view.m }"
          @click="pickMonth(m)"
        >
          {{ m }}月
        </view>
      </view>
    </app-sheet>

    <!-- 日历显示设置 -->
    <app-sheet :visible="store.sheet === 'config'" title="日历显示设置" @close="closeSheet">
      <view class="form-card">
        <view v-for="it in store.displayConfig" :key="it.k" class="form-row">
          <text class="form-row__k">{{ it.k }}</text>
          <template v-if="it.type === 'segment'">
            <seg-tabs
              :items="[{ key: '0', label: '周日' }, { key: '1', label: '周一' }]"
              :model-value="String(store.weekStart)"
              @update:model-value="onWeekStart"
            />
          </template>
          <app-switch
            v-else-if="typeof it.v === 'boolean'"
            :model-value="it.v"
            @update:model-value="(v) => (it.v = v)"
          />
          <text v-else class="form-row__v">{{ it.v }}</text>
        </view>
      </view>
      <template #footer>
        <view class="btn btn--primary" @click="saveConfigAction">保存</view>
      </template>
    </app-sheet>

    <!-- 排班项目选择 -->
    <app-sheet :visible="store.sheet === 'project'" title="选择排班项目" @close="closeSheet">
      <view
        v-for="p in store.projects"
        :key="p.id"
        class="sheet-row"
        @click="pickProject(p)"
      >
        <text class="sheet-row__t">{{ p.name }}</text>
        <text v-if="p.current" class="tag tag--ok">当前</text>
        <text v-else class="sheet-row__sub">{{ p.count }} 天</text>
      </view>
      <view class="sheet-row sheet-row--center" @click="goPage('project')">
        <text class="sheet-row__t">管理</text>
      </view>
    </app-sheet>

    <!-- 班次选择 -->
    <app-sheet :visible="store.sheet === 'shift'" :title="sheetShiftTitle" @close="closeSheet">
      <view
        v-for="s in store.shifts"
        :key="s.id"
        class="sheet-row"
        @click="pickShift(s.id)"
      >
        <shift-badge :shift="s" mode="chip" big />
        <text class="sheet-row__t">{{ fmtTime(s) }}</text>
      </view>
      <view
        v-if="store.sheetArg === 'second'"
        class="sheet-row sheet-row--center"
        @click="clearSecond"
      >
        <text class="sheet-row__t">取消第二班次</text>
      </view>
    </app-sheet>

    <!-- 备注输入 -->
    <app-dialog
      :visible="store.dialog === 'remark'"
      title="设置备注"
      @close="closeDialog"
    >
      <input v-model="remarkDraft" class="dialog-input" placeholder="输入当天备注" />
      <template #actions>
        <view class="btn btn--ghost" @click="closeDialog">取消</view>
        <view class="btn btn--primary" @click="saveRemarkAction">确定</view>
      </template>
    </app-dialog>
  </page-frame>
</template>

<script>
import { computed, ref } from 'vue'
import {
  store, monthTitle, selectedDateText, selectedShift, selectedWeekday, fmtTime,
  selectDay, stepMonth, jumpToday, closeSheet, openSheet, closeDialog, openDialog,
  saveRemark, WEEK, applyBootstrap, setWeekStart, setDayWork, shiftById
} from '@/composables/use-store.js'
import { useTheme } from '@/composables/use-theme.js'
import { goPage, toast } from '@/composables/use-nav.js'
import api, { isCloud } from '@/services/api.js'
import config from '@/config.js'

export default {
  setup() {
    const { themeClass } = useTheme()
    const remarkDraft = ref('')

    const legendItems = computed(() => store.stat.donut || [])
    const selectedWeekdayText = computed(() => WEEK[selectedWeekday.value])
    const remarkText = computed(() => store.remarks[store.selected] || '')
    const secondShift = computed(() => {
      const id = store.secondWorks[store.selected]
      return id ? shiftById(id) : null
    })
    const sheetShiftTitle = computed(() =>
      store.sheetArg === 'second' ? '选择第二班次' : '选择第一班次'
    )
    const operItems = [
      { label: '自定义排班', icon: 'pencil' },
      { label: '周期轮班', icon: 'refresh' },
      { label: '清除', icon: 'delete_bin' },
      { label: '上一天', icon: 'down' },
      { label: '下一天', icon: 'down2' },
      { label: '关闭', icon: 'remove' }
    ]

    const configValue = (key, fallback) => {
      const it = store.displayConfig.find((x) => x.k === key)
      return it ? it.v : fallback
    }
    const showLunar = computed(() => configValue('显示中国农历', true))
    const showHoliday = computed(() => configValue('显示中国节假日', true))
    const showTime = computed(() => configValue('显示上班时间', true))

    const dayMapData = computed(() => {
      const map = {}
      store.days.forEach((d) => {
        const info = { ...d }
        if (store.remarks[d.d]) info.lunar = info.lunar
        map[d.d] = info
      })
      return map
    })

    async function loadData() {
      try {
        const db = await api.bootstrap()
        applyBootstrap(db && db.data ? db.data : db)
      } catch (e) {
        console.warn('[home] bootstrap failed, fallback local', e)
      }
    }

    function onSelect(day) {
      selectDay(day)
      if (store.editMode) openSheet('shift', 'first')
    }
    function prevMonth() {
      stepMonth(-1)
    }
    function nextMonth() {
      stepMonth(1)
    }
    function pickMonth(m) {
      store.view.m = m
      closeSheet()
    }
    function pickShift(id) {
      const which = store.sheetArg === 'second' ? 'second' : 'first'
      setDayWork(store.selected, id).then(() => {
        if (which === 'second') store.secondWorks[store.selected] = id
        else store.secondWorks[store.selected] = ''
        closeSheet()
      })
    }
    function clearSecond() {
      store.secondWorks[store.selected] = ''
      closeSheet()
    }
    function pickProject(p) {
      store.projects.forEach((x) => (x.current = x.id === p.id))
      api.setCurrentProject(p.id).catch(() => {})
      closeSheet()
    }
    function onWeekStart(v) {
      setWeekStart(v)
    }
    function saveConfigAction() {
      const cfg = {}
      store.displayConfig.forEach((it) => (cfg[it.k] = it.v))
      cfg['一周开始日'] = store.weekStart === 1 ? '周一' : '周日'
      api.saveConfig(cfg).catch(() => {})
      closeSheet()
      toast('已保存')
    }
    function onRemark() {
      remarkDraft.value = remarkText.value
      openDialog('remark')
    }
    function saveRemarkAction() {
      saveRemark(remarkDraft.value.trim())
      const y = store.view.y
      const m = String(store.view.m).padStart(2, '0')
      const date = y + '-' + m + '-' + String(store.selected).padStart(2, '0')
      const rec = store.scheduleRaw[date] || { date }
      api.setDay({ ...rec, date, remark: remarkDraft.value.trim() }).catch(() => {})
      closeDialog()
    }
    function onOper(label) {
      if (label === '关闭') {
        store.editMode = false
        return
      }
      if (label === '上一天' && store.selected > 1) store.selected -= 1
      if (label === '下一天') store.selected += 1
      if (label === '清除') {
        store.secondWorks[store.selected] = ''
      }
      if (label === '周期轮班') {
        goPage('work-edit')
        return
      }
      toast(label + '（示例）')
    }

    return {
      store,
      noAds: config.noAds,
      monthTitle,
      selectedDateText,
      selectedShift,
      selectedWeekdayText,
      fmtTime,
      remarkText,
      secondShift,
      sheetShiftTitle,
      legendItems,
      operItems,
      dayMapData,
      showLunar,
      showHoliday,
      showTime,
      remarkDraft,
      selectDay,
      stepMonth,
      jumpToday,
      closeSheet,
      openSheet,
      closeDialog,
      openDialog,
      saveRemark,
      goPage,
      loadData,
      onSelect,
      prevMonth,
      nextMonth,
      pickMonth,
      pickShift,
      clearSecond,
      pickProject,
      onWeekStart,
      saveConfigAction,
      onRemark,
      saveRemarkAction,
      onOper
    }
  },
  onShow() {
    this.loadData()
  }
}
</script>

<style lang="scss" scoped>
.legend {
  display: flex;
  gap: 16px;
  overflow-x: auto;
  white-space: nowrap;
}
</style>
