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

    <!-- 当月班次统计色条；空月份与原版一致显示提示 -->
    <view v-if="hasSchedule && showStat" class="legend">
      <view v-for="(it, i) in legendItems" :key="i" class="legend__item">
        <view class="legend__dot" :style="{ background: it.color }" />
        <text class="legend__text">{{ it.name }}({{ it.value }})</text>
      </view>
    </view>
    <view v-else-if="showStat" class="empty-month">当前月份没有设置排班</view>

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
      :show-begin-time="showBeginTime"
      :show-end-time="showEndTime"
      :date-font-size="dateFontSize"
      :work-font-size="workFontSize"
      :time-font-size="timeFontSize"
      :work-radius="workRadius"
      :show-h-line="showHLine"
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
          <text v-if="selectedTimeText" class="work-row__time">{{ selectedTimeText }}</text>
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
      <view v-if="showRemark" class="remark" :class="{ 'remark--accent': !remarkText }" @click="onRemark">
        <ri-icon :name="remarkText ? 'pencil' : 'add'" :size="13" />
        <text>{{ remarkText || '设置备注' }}</text>
      </view>
    </view>

    <!-- 操作按钮：与原版一致，无记录=通栏按钮；有记录=三个小按钮 -->
    <view v-if="!selectedHasRecord" class="start-card" @click="startSchedule">
      <text>{{ store.editMode ? '完成排班' : '开启排班' }}</text>
    </view>
    <view v-else class="home-actions">
      <view class="home-action" @click="onRemark">设置备注</view>
      <view class="home-action" @click="startSchedule">{{ store.editMode ? '完成排班' : '开启排班' }}</view>
      <view class="home-action" @click="openSheet('shift', 'second')">第二班次</view>
    </view>

    <!-- 排班操作面板（原版 ScheduleOperView 的底部弹窗） -->
    <view v-if="store.editMode" class="oper-mask" @click.self="closeOper" @touchmove.stop.prevent="noop">
      <view class="oper-sheet" @touchmove.stop.prevent="noop">
        <view class="oper-handle" />
        <view class="oper-tabs">
          <view
            v-for="op in operItems"
            :key="op.label"
            class="oper-tab"
            :class="{ 'oper-tab--on': operTab === op.label }"
            @click="onOper(op.label)"
          >{{ op.label }}</view>
        </view>
        <view class="oper-body">
          <template v-if="operTab === '自定义排班'">
            <view v-if="!store.shifts.length" class="oper-empty">你还没有设置班次喔</view>
            <view v-else class="oper-shift-grid">
              <view
                v-for="sh in store.shifts"
                :key="sh.id"
                class="oper-shift-cell"
                @click.stop="pickOperShift(sh.id)"
              >
                <shift-badge :shift="sh" :show-begin="showBeginTime" :show-end="showEndTime" />
              </view>
            </view>
          </template>

          <template v-else-if="operTab === '周期轮班'">
            <view v-if="!store.plans.length" class="oper-empty">你还没有设置周期排班喔</view>
            <view v-else class="oper-plan-list">
              <view v-for="plan in store.plans" :key="plan.id" class="oper-plan-item">
                <view class="oper-plan-item__head">
                  <text class="oper-plan-item__name">{{ plan.name }}</text>
                  <text class="oper-plan-item__use" @click="applyOperPlan(plan)">使用此轮班</text>
                </view>
                <view class="oper-plan-seq">
                  <view
                    v-for="(item, idx) in planItems(plan)"
                    :key="idx"
                    class="oper-seq-chip"
                    :style="{ background: item.color }"
                  >{{ item.name }}</view>
                </view>
              </view>
            </view>
            <view class="oper-plan">
              <view class="oper-plan__row">
                <text>周期轮班天数</text>
                <input v-model="planDays" class="oper-input" type="number" />
              </view>
              <view class="oper-plan__btn" @click="clearPlanDays">清空从 {{ selectedDateText }} 开始的 {{ planDays }} 天排班</view>
              <view class="oper-plan__btn oper-plan__btn--primary" @click="addPlan">添加周期轮班</view>
            </view>
          </template>
        </view>
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
          <picker
            v-else-if="isNumericConfig(it.k)"
            :range="numericOptions(it.k)"
            :value="numericIndex(it.k)"
            @change="onNumericChange(it.k, $event)"
          >
            <view class="form-row__v form-row__pick">{{ it.v }}</view>
          </picker>
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
  saveRemark, WEEK, applyBootstrap, setWeekStart, setDayWork, shiftById, rebuildDays, loadPlans, syncPlans
} from '@/composables/use-store.js'
import { useTheme } from '@/composables/use-theme.js'
import { goPage, toast } from '@/composables/use-nav.js'
import api, { isCloud } from '@/services/api.js'
import config from '@/config.js'

export default {
  setup() {
    const { themeClass } = useTheme()
    const remarkDraft = ref('')

    const legendItems = computed(() => {
      const counts = {}
      ;(store.days || []).forEach((d) => {
        if (d.work) counts[d.work] = (counts[d.work] || 0) + 1
      })
      const list = []
      Object.keys(counts).forEach((id) => {
        const sh = store.shifts.find((s) => (s.id || s._id) === id)
        list.push({ name: sh ? sh.name : id, value: counts[id], color: sh ? sh.color : '#55BB8A' })
      })
      return list
    })
    const hasSchedule = computed(() => legendItems.value.length > 0)
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
      { label: '自定义排班' },
      { label: '周期轮班' },
      { label: '清除' },
      { label: '上一天' },
      { label: '下一天' },
      { label: '关闭' }
    ]
    const operTab = ref('自定义排班')
    const planDays = ref('90')
    let lastPickAt = 0
    const selectedHasRecord = computed(() => !!(selectedShift.value || secondShift.value || remarkText.value))

    const configValue = (key, fallback) => {
      const it = store.displayConfig.find((x) => x.k === key)
      return it ? it.v : fallback
    }
    const configNumber = (key, fallback) => {
      const n = Number(configValue(key, fallback))
      return Number.isFinite(n) ? n : fallback
    }
    const showLunar = computed(() => !!configValue('显示中国农历', true))
    const showHoliday = computed(() => !!configValue('显示中国节假日', true))
    const showBeginTime = computed(() => !!configValue('显示上班时间', true))
    const showEndTime = computed(() => !!configValue('显示下班时间', false))
    const showRemark = computed(() => !!configValue('显示备注', false))
    const showStat = computed(() => !!configValue('显示统计指标', true))
    const showHLine = computed(() => !!configValue('显示分割线', true))
    const dateFontSize = computed(() => configNumber('日期字号', 17))
    const workFontSize = computed(() => configNumber('班次字号', 11))
    const timeFontSize = computed(() => configNumber('时间字号', 11))
    const workRadius = computed(() => configNumber('班次圆角', 4))
    const selectedTimeText = computed(() => {
      const sh = selectedShift.value
      if (!sh) return ''
      if (sh.allDay) return showBeginTime.value || showEndTime.value ? '全天' : ''
      if (showBeginTime.value && showEndTime.value) return sh.start + '~' + sh.end
      if (showBeginTime.value) return sh.start
      if (showEndTime.value) return sh.end
      return ''
    })
    function isNumericConfig(key) {
      return ['日期字号', '班次字号', '时间字号', '班次圆角'].includes(key)
    }
    function numericOptions(key) {
      const max = key === '班次圆角' ? 10 : 30
      const min = key === '班次圆角' ? 0 : 8
      return Array.from({ length: max - min + 1 }, (_, i) => String(min + i))
    }
    function numericIndex(key) {
      const opts = numericOptions(key)
      const idx = opts.indexOf(String(configValue(key, opts[0])))
      return idx < 0 ? 0 : idx
    }
    function onNumericChange(key, e) {
      const opts = numericOptions(key)
      const idx = Number(e.detail.value) || 0
      const it = store.displayConfig.find((x) => x.k === key)
      if (it) it.v = opts[idx]
    }

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
        store.loaded = true
        rebuildDays()
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
    function noop() {}
    function startSchedule() {
      if (!store.shifts.length) {
        toast('请先设置好班次再来排班')
        return
      }
      if (store.editMode) {
        store.editMode = false
        return
      }
      operTab.value = '自定义排班'
      store.editMode = true
    }
    function closeOper() {
      store.editMode = false
    }
    function moveSelected(delta) {
      const dt = new Date(store.view.y, store.view.m - 1, store.selected + delta)
      store.view.y = dt.getFullYear()
      store.view.m = dt.getMonth() + 1
      store.selected = dt.getDate()
    }
    async function pickOperShift(id) {
      const now = Date.now()
      if (now - lastPickAt < 320) {
        toast('不要太着急了')
        return
      }
      lastPickAt = now
      const date = selectedDateText.value
      const prev = store.scheduleRaw[date] || { date }
      const payload = { ...prev, date, workId: id, secondWorkId: '', remark: prev.remark || '' }
      store.scheduleRaw[date] = payload
      store.secondWorks[store.selected] = ''
      rebuildDays()
      moveSelected(1)
      try {
        await api.setDay(payload)
      } catch (e) {
        // 本地已经生效，云端失败时保留本机结果
      }
    }
    async function clearSelectedDay() {
      const date = selectedDateText.value
      delete store.scheduleRaw[date]
      delete store.remarks[store.selected]
      store.secondWorks[store.selected] = ''
      rebuildDays()
      moveSelected(1)
      try {
        await api.setDay({ date, workId: '', secondWorkId: '', remark: '' })
      } catch (e) {}
    }
    async function clearPlanDays() {
      const n = Math.max(1, Math.min(365, Number(planDays.value) || 90))
      uni.showModal({
        title: '清空排班',
        content: '清空从 ' + selectedDateText.value + ' 开始的 ' + n + ' 天排班？',
        success: async (r) => {
          if (!r.confirm) return
          const start = new Date(store.view.y, store.view.m - 1, store.selected)
          const tasks = []
          for (let i = 0; i < n; i += 1) {
            const d = new Date(start.getTime() + i * 86400000)
            const date = d.getFullYear() + '-' + String(d.getMonth() + 1).padStart(2, '0') + '-' + String(d.getDate()).padStart(2, '0')
            delete store.scheduleRaw[date]
            tasks.push(api.setDay({ date, workId: '', secondWorkId: '', remark: '' }).catch(() => {}))
          }
          rebuildDays()
          await Promise.all(tasks)
          toast('已清空 ' + n + ' 天')
        }
      })
    }
    function planItems(plan) {
      return (plan.sequence || []).map((sid) => {
        if (!sid) return { name: '空', color: '#999999' }
        const sh = store.shifts.find((x) => x.id === sid)
        return sh ? { name: sh.name, color: sh.color } : { name: '空', color: '#999999' }
      })
    }
    async function applyOperPlan(plan) {
      const n = Math.max(1, Math.min(365, Number(planDays.value) || 90))
      const seq = plan.sequence || []
      if (!seq.length) return toast('该轮班还没有班次')
      const start = new Date(store.view.y, store.view.m - 1, store.selected)
      const tasks = []
      for (let i = 0; i < n; i += 1) {
        const d = new Date(start.getTime() + i * 86400000)
        const date = d.getFullYear() + '-' + String(d.getMonth() + 1).padStart(2, '0') + '-' + String(d.getDate()).padStart(2, '0')
        const sid = seq[i % seq.length] || ''
        const payload = { date, workId: sid, secondWorkId: '', remark: '' }
        store.scheduleRaw[date] = payload
        tasks.push(api.setDay(payload).catch(() => {}))
      }
      rebuildDays()
      await Promise.all(tasks)
      toast('已应用轮班 ' + plan.name)
      closeOper()
    }
    function addPlan() {
      goPage('plan-edit')
    }
    function onOper(label) {
      if (label === '关闭') return closeOper()
      if (label === '上一天') return moveSelected(-1)
      if (label === '下一天') return moveSelected(1)
      if (label === '清除') {
        clearSelectedDay()
        return
      }
      operTab.value = label
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
      hasSchedule,
      operItems,
      operTab,
      planDays,
      selectedHasRecord,
      dayMapData,
      showLunar,
      showHoliday,
      showBeginTime,
      showEndTime,
      showRemark,
      showStat,
      showHLine,
      dateFontSize,
      workFontSize,
      timeFontSize,
      workRadius,
      selectedTimeText,
      isNumericConfig,
      numericOptions,
      numericIndex,
      onNumericChange,
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
      planItems,
      applyOperPlan,
      startSchedule,
      noop,
      closeOper,
      pickOperShift,
      clearSelectedDay,
      clearPlanDays,
      addPlan,
      onOper
    }
  },
  onShow() {
    loadPlans()
    syncPlans()
    this.loadData()
  }
}
</script>

<style lang="scss" scoped>
.start-card {
  margin-top: 14px;
  height: 50px;
  border-radius: var(--r-card);
  background: var(--surface);
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 16px;
  color: var(--text-1);
  box-shadow: 0 1px 2px rgba(0, 0, 0, 0.03);
  &:active {
    background: var(--surface-2);
  }
}
.home-actions {
  padding: 14px 0 0;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  gap: 8px;
}
.home-action {
  height: 34px;
  padding: 0 16px;
  border-radius: var(--r-pill);
  background: var(--surface);
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 13px;
  color: var(--text-2);
  &:active {
    background: var(--surface-2);
  }
}
.oper-mask {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  background: var(--scrim);
  z-index: 9999;
  display: flex;
  align-items: flex-end;
}
.oper-sheet {
  width: 100%;
  background: var(--surface);
  border-radius: var(--r-sheet) var(--r-sheet) 0 0;
  padding-bottom: env(safe-area-inset-bottom);
  overflow: hidden;
}
.oper-handle {
  width: 36px;
  height: 4px;
  border-radius: 2px;
  background: var(--line);
  margin: 8px auto 2px;
}
.oper-tabs {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px 14px 12px;
}
.oper-tab {
  font-size: 13px;
  color: var(--text-2);
  padding: 4px 2px;
}
.oper-tab--on {
  color: var(--primary);
  font-weight: 600;
}
.oper-body {
  background: var(--surface-2);
  min-height: 200px;
  max-height: 300px;
  overflow-y: auto;
  padding: 10px;
  box-sizing: border-box;
}
.oper-empty {
  padding: 36px 0;
  text-align: center;
  font-size: 13px;
  color: var(--text-3);
}
.oper-shift-grid {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}
.oper-shift-cell {
  width: calc((100% - 12px) / 3);
  min-width: 0;
  &:active {
    opacity: 0.8;
  }
}
.oper-plan {
  padding-top: 4px;
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.oper-plan__row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  font-size: 13px;
  color: var(--text-2);
}
.oper-input {
  width: 72px;
  height: 30px;
  padding: 0 10px;
  border-radius: 8px;
  background: var(--surface);
  font-size: 13px;
  text-align: center;
}
.oper-plan__btn {
  height: 36px;
  border-radius: 8px;
  background: var(--surface);
  color: var(--text-2);
  font-size: 13px;
  display: flex;
  align-items: center;
  justify-content: center;
  &:active {
    opacity: 0.8;
  }
}
.oper-plan__btn--primary {
  background: var(--primary);
  color: #ffffff;
}
.oper-clear {
  height: 42px;
  margin-top: 8px;
  border-radius: 10px;
  background: var(--surface);
  color: var(--delete);
  font-size: 14px;
  display: flex;
  align-items: center;
  justify-content: center;
}
.form-row__pick {
  padding: 6px 10px;
  border-radius: 8px;
  background: var(--surface-2);
  font-size: 13px;
  color: var(--text-2);
}
.oper-plan-list {
  display: flex;
  flex-direction: column;
  gap: 10px;
  margin-bottom: 10px;
}
.oper-plan-item {
  background: var(--surface);
  border-radius: 10px;
  padding: 9px 10px;
}
.oper-plan-item__head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 7px;
}
.oper-plan-item__name {
  font-size: 13px;
  color: var(--text-1);
  font-weight: 500;
}
.oper-plan-item__use {
  font-size: 12px;
  color: var(--primary);
  padding: 2px 4px;
}
.oper-plan-seq {
  display: flex;
  gap: 5px;
  overflow-x: auto;
}
.oper-seq-chip {
  flex-shrink: 0;
  padding: 2px 6px;
  border-radius: 4px;
  color: #ffffff;
  font-size: 10px;
}
.empty-month {
  font-size: 13px;
  color: var(--text-3);
  padding: 4px 2px 10px;
}
.legend {
  display: flex;
  gap: 16px;
  overflow-x: auto;
  white-space: nowrap;
}
</style>
