<template>
  <page-frame title="排班统计" back>
    <view class="tabs">
      <text class="tab" :class="{ 'tab--on': scope === 'personal' }" @click="setScope('personal')">我的统计</text>
      <text class="tab" :class="{ 'tab--on': scope === 'company' }" @click="setScope('company')">公司统计</text>
    </view>

    <view class="toolbar">
      <picker mode="date" fields="month" :value="month" @change="onMonth">
        <text class="tool">{{ month }} ▾</text>
      </picker>
      <view class="tool" @click="pickDepartment">{{ departmentName || '全部部门' }} ▾</view>
      <view class="tool" @click="exportCsv">导出 CSV</view>
    </view>

    <view v-if="loading" class="empty"><text class="empty__t">统计中…</text></view>
    <view v-else-if="error" class="empty"><text class="empty__t">{{ error }}</text></view>
    <template v-else-if="stats">
      <view class="summary">
        <view class="sum-card"><text class="sum-n">{{ stats.summary.people }}</text><text class="sum-l">人数</text></view>
        <view class="sum-card"><text class="sum-n">{{ stats.summary.workDays }}</text><text class="sum-l">上班天数</text></view>
        <view class="sum-card"><text class="sum-n">{{ stats.summary.hours }}</text><text class="sum-l">计划工时</text></view>
        <view class="sum-card"><text class="sum-n">{{ stats.summary.shifts8 }}</text><text class="sum-l">8h 班次</text></view>
        <view class="sum-card"><text class="sum-n">{{ stats.summary.shifts12 }}</text><text class="sum-l">12h 班次</text></view>
        <view class="sum-card"><text class="sum-n">{{ stats.summary.leave }}</text><text class="sum-l">请假人次</text></view>
      </view>

      <view class="section-title">人员统计</view>
      <scroll-view class="table-scroll" scroll-x>
        <view class="table">
          <view class="tr th">
            <text class="td name">姓名</text><text class="td">上班天数</text><text class="td">8h</text><text class="td">12h</text><text class="td">计划工时</text><text class="td">请假</text><text class="td">休息</text>
          </view>
          <view v-for="r in stats.rows" :key="r.employeeId || r.name" class="tr">
            <text class="td name">{{ r.name }}</text><text class="td">{{ r.workDays }}</text><text class="td">{{ r.shifts8 }}</text><text class="td">{{ r.shifts12 }}</text><text class="td">{{ r.hours }}</text><text class="td">{{ r.leaveDays }}</text><text class="td">{{ r.restDays }}</text>
          </view>
        </view>
      </scroll-view>

      <view class="section-title">每日统计</view>
      <scroll-view class="table-scroll" scroll-x>
        <view class="table">
          <view class="tr th">
            <text class="td date">日期</text><text class="td">上班人数</text><text class="td">请假</text><text class="td">休息</text><text class="td">工时</text>
          </view>
          <view v-for="d in stats.daily" :key="d.date" class="tr">
            <text class="td date">{{ d.date }}</text><text class="td">{{ d.workPeople }}</text><text class="td">{{ d.leavePeople }}</text><text class="td">{{ d.restPeople }}</text><text class="td">{{ d.hours }}</text>
          </view>
        </view>
      </scroll-view>

      <view class="section-title">工序统计</view>
      <view class="card">
        <view v-for="p in stats.processes.slice(0, 30)" :key="p.processName" class="proc">
          <text class="proc__n">{{ p.processName }}</text>
          <text class="proc__v">{{ p.people }} 人 · {{ p.shifts }} 班次 · {{ p.hours }}h</text>
        </view>
      </view>
      <view class="hint">计划工时来自 imported 排班：8h/12h 按备注识别；同日同班次多工序只计一次，同日不同班次累加。</view>
    </template>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const companyId = ref('')
const departmentId = ref('')
const departments = ref([])
const scope = ref('personal')
const month = ref(new Date().toISOString().slice(0, 7))
const stats = ref(null)
const loading = ref(false)
const error = ref('')
const initialized = ref(false)
const departmentName = computed(() => {
  const d = departments.value.find((x) => x._id === departmentId.value)
  return d ? d.name : ''
})
function setScope(s) { scope.value = s; load() }
function onMonth(e) { month.value = e.detail.value; load() }
function pickDepartment() {
  const items = ['全部部门'].concat(departments.value.map((d) => d.name))
  uni.showActionSheet({ itemList: items, success: (r) => { departmentId.value = r.tapIndex === 0 ? '' : departments.value[r.tapIndex - 1]._id; load() } })
}
async function load() {
  loading.value = true
  error.value = ''
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    departments.value = d.departments || []
    if (!initialized.value) {
      initialized.value = true
      if (d.role === 'owner' || d.role === 'admin') scope.value = 'company'
    }
    stats.value = await api.org.stats({ companyId: companyId.value, scope: scope.value, departmentId: departmentId.value, month: month.value })
  } catch (e) { error.value = (e && (e.message || e.errMsg)) || '统计失败'; stats.value = null } finally { loading.value = false }
}
function csvText() {
  if (!stats.value) return ''
  const rows = [['姓名', '上班天数', '8h班次', '12h班次', '计划工时', '请假', '休息']]
  stats.value.rows.forEach((r) => rows.push([r.name, r.workDays, r.shifts8, r.shifts12, r.hours, r.leaveDays, r.restDays]))
  return '\ufeff' + rows.map((r) => r.map((v) => '"' + String(v).replace(/"/g, '""') + '"').join(',')).join('\n')
}
function exportCsv() {
  const csv = csvText()
  if (!csv) return toast('暂无数据')
  // #ifdef H5
  const blob = new Blob([csv], { type: 'text/csv;charset=utf-8' })
  const a = document.createElement('a')
  a.href = URL.createObjectURL(blob)
  a.download = '排班统计-' + month.value + '.csv'
  a.click()
  URL.revokeObjectURL(a.href)
  // #endif
  // #ifndef H5
  uni.setClipboardData({ data: csv, success: () => uni.showModal({ title: '已复制 CSV', content: '当前版本已把统计 CSV 复制到剪贴板，可粘贴到表格软件。', showCancel: false }) })
  // #endif
}
onLoad(async (o) => {
  companyId.value = (o && o.companyId) || ''
  departmentId.value = (o && o.departmentId) || ''
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    departments.value = d.departments || []
  } catch (e) {}
  load()
})
</script>

<style lang="scss" scoped>
.tabs { display: flex; justify-content: center; gap: 8px; padding: 4px 0; }
.tab { font-size: 13px; color: var(--text-3); padding: 6px 14px; border-radius: 99px; background: var(--surface-2); }
.tab--on { color: #fff; background: var(--primary); }
.toolbar { display: flex; align-items: center; gap: 12px; padding: 8px 2px; }
.tool { font-size: 12px; color: var(--primary); }
.summary { display: grid; grid-template-columns: repeat(3, 1fr); gap: 8px; }
.sum-card { background: var(--surface); border-radius: 10px; padding: 12px 8px; text-align: center; }
.sum-n { display: block; font-size: 20px; color: var(--primary); font-weight: 600; }
.sum-l { display: block; margin-top: 3px; font-size: 10px; color: var(--text-3); }
.section-title { margin: 16px 2px 8px; font-size: 13px; color: var(--text-2); }
.table-scroll { width: 100%; }
.table { min-width: 640px; background: var(--surface); border-radius: var(--r-card); overflow: hidden; }
.tr { display: flex; border-bottom: 1px solid var(--line); }
.tr:last-child { border-bottom: 0; }
.th { background: var(--surface-2); color: var(--text-3); }
.td { width: 78px; min-width: 78px; padding: 9px 6px; font-size: 11px; color: var(--text-2); text-align: right; }
.td.name { width: 95px; min-width: 95px; text-align: left; color: var(--text-1); }
.td.date { width: 105px; min-width: 105px; text-align: left; color: var(--text-1); }
.proc { display: flex; justify-content: space-between; gap: 10px; padding: 10px 14px; border-bottom: 1px solid var(--line); }
.proc:last-child { border-bottom: 0; }
.proc__n { font-size: 12px; color: var(--text-1); }
.proc__v { font-size: 10px; color: var(--text-3); text-align: right; }
</style>
