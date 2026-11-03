<template>
  <page-frame title="排班看板" back>
    <view class="toolbar">
      <picker mode="date" :value="date" @change="onDate">
        <text class="tool">{{ date }} ▾</text>
      </picker>
      <view class="tool" @click="pickDepartment">{{ departmentName || '全部部门' }} ▾</view>
      <view class="tool" @click="openStats">统计</view>
    </view>

    <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
    <view v-else-if="!plans.length" class="empty">
      <text class="empty__t">当天还没有排班</text>
      <view class="btn btn--primary mt14" @click="openImport">导入排班</view>
    </view>
    <view v-else class="plan-list">
      <view v-for="p in plans" :key="p._id" class="card plan">
        <view class="plan__head">
          <view>
            <text class="plan__dept">{{ deptName(p.departmentId) }}</text>
            <text class="plan__meta">{{ p.fileName || p.sourceType }} · v{{ p.version }}</text>
          </view>
          <text class="plan__date">{{ p.date }}</text>
        </view>

        <view class="board-head">
          <text class="col-process">工序</text>
          <text class="col-batch">批次</text>
          <text v-for="s in shiftsOf(p)" :key="s" class="col-shift">{{ s }}</text>
        </view>
        <view v-for="(e, ei) in p.entries" :key="ei" class="board-row" :class="{ 'board-row--leave': e.rowType === 'leave', 'board-row--rest': e.rowType === 'rest' }">
          <view class="col-process">
            <text class="process">{{ e.processName }}</text>
            <text v-if="e.rowType !== 'work'" class="status">{{ e.rowType === 'leave' ? '请假' : '休息' }}</text>
          </view>
          <text class="col-batch">{{ e.batchNo || '-' }}</text>
          <view v-for="s in shiftsOf(p)" :key="s" class="col-shift">
            <text v-for="(a, ai) in assignmentsOf(e, s)" :key="ai" class="chip" :class="{ 'chip--12': a.workHours === 12 }" @click="editAssignment(p, ei, a)">{{ a.employeeName }}<text v-if="a.workHours === 12" class="chip__h">12h</text></text>
            <text v-if="!assignmentsOf(e, s).length" class="none">-</text>
          </view>
        </view>
        <view v-if="p.warnings && p.warnings.length" class="plan__warn">导入提醒 {{ p.warnings.length }} 条</view>
      </view>
    </view>
    <view class="hint">点击人员可修改姓名或 8h/12h；同部门同日期重新导入会覆盖旧版本。</view>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const companyId = ref('')
const departmentId = ref('')
const departments = ref([])
const date = ref(new Date().toISOString().slice(0, 10))
const plans = ref([])
const loading = ref(false)
const departmentName = computed(() => {
  const d = departments.value.find((x) => x._id === departmentId.value)
  return d ? d.name : ''
})
function deptName(id) {
  const d = departments.value.find((x) => x._id === id)
  return d ? d.name : '部门'
}
function shiftsOf(plan) {
  const order = { '早班': 1, '中班': 2, '晚班': 3, '夜班': 4 }
  const set = new Set()
  ;(plan.entries || []).forEach((e) => (e.assignments || []).forEach((a) => set.add(a.shiftName)))
  return Array.from(set).sort((a, b) => (order[a] || 99) - (order[b] || 99))
}
function assignmentsOf(entry, shift) {
  return (entry.assignments || []).filter((a) => a.shiftName === shift)
}
function onDate(e) { date.value = e.detail.value; load() }
function pickDepartment() {
  const items = ['全部部门'].concat(departments.value.map((d) => d.name))
  uni.showActionSheet({ itemList: items, success: (r) => { departmentId.value = r.tapIndex === 0 ? '' : departments.value[r.tapIndex - 1]._id; load() } })
}
function openImport() { goPage('org-import', { companyId: companyId.value, departmentId: departmentId.value }) }
function openStats() { goPage('org-stats', { companyId: companyId.value, departmentId: departmentId.value }) }
function editAssignment(plan, entryIndex, a) {
  uni.showActionSheet({ itemList: ['修改姓名', '改为 8 小时', '改为 12 小时'], success: (r) => {
    if (r.tapIndex === 0) {
      uni.showModal({ title: '修改姓名', editable: true, placeholderText: a.employeeName, content: a.employeeName, success: (m) => {
        if (!m.confirm) return
        const name = String(m.content || '').trim()
        if (!name) return toast('姓名不能为空')
        update(plan, entryIndex, a, { employeeName: name })
      } })
    } else update(plan, entryIndex, a, { workHours: r.tapIndex === 1 ? 8 : 12 })
  } })
}
async function update(plan, entryIndex, a, patch) {
  const assignmentIndex = plan.entries[entryIndex].assignments.indexOf(a)
  if (assignmentIndex < 0) return
  try {
    await api.org.updateAssignment({ planId: plan._id, entryIndex, assignmentIndex, employeeName: patch.employeeName || a.employeeName, shiftName: a.shiftName, workHours: patch.workHours || a.workHours })
    toast('已保存')
    load()
  } catch (e) { toast((e && (e.message || e.errMsg)) || '保存失败') }
}
async function load() {
  loading.value = true
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    departments.value = d.departments || []
    const r = await api.org.board({ companyId: companyId.value, departmentId: departmentId.value, date: date.value })
    plans.value = r?.plans || []
  } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') } finally { loading.value = false }
}
onLoad((o) => { companyId.value = (o && o.companyId) || ''; departmentId.value = (o && o.departmentId) || ''; date.value = (o && o.date) || date.value; load() })
</script>

<style lang="scss" scoped>
.toolbar { display: flex; align-items: center; gap: 10px; padding: 6px 2px; }
.tool { font-size: 13px; color: var(--primary); }
.plan { margin-top: 12px; padding: 14px; overflow-x: auto; }
.plan__head { display: flex; justify-content: space-between; align-items: flex-start; margin-bottom: 10px; }
.plan__dept { display: block; font-size: 15px; color: var(--text-1); }
.plan__meta { display: block; margin-top: 3px; font-size: 10px; color: var(--text-3); }
.plan__date { font-size: 11px; color: var(--text-3); }
.board-head, .board-row { display: flex; min-width: 500px; align-items: stretch; border-bottom: 1px solid var(--line); }
.board-head { background: var(--surface-2); border-radius: 8px 8px 0 0; }
.board-row:last-child { border-bottom: 0; }
.board-row--leave, .board-row--rest { background: var(--surface-2); }
.col-process { width: 86px; min-width: 86px; padding: 8px 6px; font-size: 11px; color: var(--text-2); }
.col-batch { width: 100px; min-width: 100px; padding: 8px 6px; font-size: 10px; color: var(--text-3); overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
.col-shift { width: 104px; min-width: 104px; padding: 8px 6px; font-size: 11px; color: var(--text-2); }
.process { display: block; color: var(--text-1); font-size: 12px; line-height: 1.4; }
.status { display: inline-block; margin-top: 3px; padding: 1px 5px; border-radius: 4px; background: var(--danger-soft); color: var(--danger); font-size: 9px; }
.board-row--rest .status { background: var(--warning-soft); color: var(--warning); }
.chip { display: inline-flex; align-items: center; margin: 2px 3px 2px 0; padding: 3px 6px; border-radius: 5px; background: var(--primary-soft); color: var(--primary); font-size: 10px; line-height: 1.3; }
.chip--12 { background: var(--warning-soft); color: var(--warning); }
.chip__h { margin-left: 3px; font-size: 8px; opacity: 0.8; }
.none { color: var(--text-3); font-size: 10px; }
.plan__warn { margin-top: 8px; font-size: 10px; color: var(--warning); }
</style>
