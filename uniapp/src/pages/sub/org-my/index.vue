<template>
  <page-frame title="我的排班" back>
    <view class="toolbar">
      <picker mode="date" fields="month" :value="month" @change="onMonth"><text class="tool">{{ month }} ▾</text></picker>
      <view class="tool" @click="pickCompany">{{ companyName || '选择公司' }} ▾</view>
    </view>
    <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
    <view v-else-if="!days.length" class="empty"><text class="empty__t">本月没有你的排班</text><text class="empty__s">需先在员工档案中关联当前账号</text></view>
    <view v-else class="list">
      <view v-for="(d, i) in days" :key="i" class="card day">
        <view class="day__head"><text class="day__date">{{ d.date }}</text><text class="day__type" :class="{ 'day__type--leave': d.rowType === 'leave', 'day__type--rest': d.rowType === 'rest' }">{{ d.rowType === 'leave' ? '请假' : d.rowType === 'rest' ? '休息' : d.shiftName }}</text></view>
        <text class="day__process">{{ d.processName }}</text>
        <text v-if="d.batchNo" class="day__batch">批次：{{ d.batchNo }}</text>
        <text v-if="d.remark" class="day__remark">备注：{{ d.remark }}</text>
        <text v-if="d.rowType === 'work'" class="day__hours">{{ d.workHours }} 小时 · {{ d.workSystem }}</text>
      </view>
    </view>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const companies = ref([])
const companyId = ref('')
const month = ref(new Date().toISOString().slice(0, 7))
const days = ref([])
const loading = ref(false)
const companyName = computed(() => {
  const c = companies.value.find((x) => x._id === companyId.value)
  return c ? c.name : ''
})
async function load() {
  if (!companyId.value) return
  loading.value = true
  try { days.value = (await api.org.mySchedule({ companyId: companyId.value, month: month.value }))?.days || [] } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') } finally { loading.value = false }
}
function onMonth(e) { month.value = e.detail.value; load() }
function pickCompany() {
  const items = companies.value.map((c) => c.name)
  if (!items.length) return toast('没有公司')
  uni.showActionSheet({ itemList: items, success: (r) => { companyId.value = companies.value[r.tapIndex]._id; load() } })
}
onLoad(async (o) => {
  try { companies.value = (await api.org.listCompanies())?.list || [] } catch (e) {}
  const id = (o && o.companyId) || ''
  companyId.value = (id && companies.value.some((c) => c._id === id)) ? id : (companies.value[0]?._id || '')
  await load()
})
</script>

<style lang="scss" scoped>
.toolbar { display: flex; gap: 14px; padding: 8px 2px; }
.tool { font-size: 13px; color: var(--primary); }
.day { margin-top: 10px; padding: 14px; }
.day__head { display: flex; justify-content: space-between; align-items: center; }
.day__date { font-size: 14px; color: var(--text-1); }
.day__type { font-size: 11px; padding: 2px 7px; border-radius: 5px; color: var(--primary); background: var(--primary-soft); }
.day__type--leave { color: var(--danger); background: var(--danger-soft); }
.day__type--rest { color: var(--warning); background: var(--warning-soft); }
.day__process { display: block; margin-top: 8px; font-size: 13px; color: var(--text-1); }
.day__batch, .day__remark, .day__hours { display: block; margin-top: 4px; font-size: 11px; color: var(--text-3); line-height: 1.5; }
.empty__s { display: block; margin-top: 5px; font-size: 11px; color: var(--text-3); }
</style>
