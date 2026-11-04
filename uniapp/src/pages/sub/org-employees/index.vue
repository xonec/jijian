<template>
  <page-frame title="员工档案" back>
    <view class="toolbar">
      <view class="filter" @click="pickDepartment">{{ departmentName }} ▾</view>
      <view class="add" @click="openEdit()">+ 新增员工</view>
    </view>
    <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
    <view v-else-if="!employees.length" class="empty"><text class="empty__t">没有员工档案</text></view>
    <view v-else class="card">
      <view v-for="e in employees" :key="e._id" class="employee" @click="openEdit(e)">
        <view class="avatar">{{ (e.name || '?').slice(0, 1) }}</view>
        <view class="main">
          <text class="name">{{ e.name }}<text v-if="e.status === 'pending'" class="pending"> 待认领</text></text>
          <text class="sub"><template v-if="e.employeeNo">工号 {{ e.employeeNo }} · </template>{{ deptName(e.departmentId) }}<template v-if="e.uid"> · 已关联账号</template></text>
        </view>
        <ri-icon name="arrow_right" :size="14" class="gray" />
      </view>
    </view>
    <view class="hint">从排班导入自动生成的员工为“待认领”；关联账号后员工可查看自己的排班和统计。</view>

    <app-dialog :visible="editVisible" :title="form._id ? '编辑员工' : '新增员工'" @close="editVisible = false">
      <view class="form">
        <input v-model="form.name" class="input" maxlength="30" placeholder="姓名" />
        <input v-model="form.employeeNo" class="input" maxlength="40" placeholder="工号（选填）" />
        <input v-model="form.position" class="input" maxlength="40" placeholder="岗位（选填）" />
        <input v-model="form.phone" class="input" maxlength="30" placeholder="手机号（选填）" />
        <view class="input select" @click="pickFormDepartment">{{ deptName(form.departmentId) || '选择部门' }} ▾</view>
        <input v-model="form.uid" class="input" maxlength="64" placeholder="关联账号 UID（选填）" />
      </view>
      <template #actions>
        <view class="btn btn--ghost dialog-btn" @click="editVisible = false">取消</view>
        <view class="btn btn--primary dialog-btn" @click="save">保存</view>
      </template>
    </app-dialog>
  </page-frame>
</template>

<script setup>
import { computed, reactive, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const companyId = ref('')
const departmentId = ref('')
const departments = ref([])
const employees = ref([])
const loading = ref(false)
const editVisible = ref(false)
const form = reactive({ _id: '', name: '', employeeNo: '', position: '', phone: '', departmentId: '', uid: '' })
const departmentName = computed(() => {
  if (!departmentId.value) return '全部部门'
  return deptName(departmentId.value)
})
function deptName(id) {
  if (!id) return ''
  const d = departments.value.find((x) => x._id === id)
  return d ? d.name : ''
}
async function load() {
  loading.value = true
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    departments.value = d.departments || []
    const r = await api.org.listEmployees({ companyId: companyId.value, departmentId: departmentId.value })
    employees.value = r?.list || []
  } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') } finally { loading.value = false }
}
function pickDepartment() {
  const items = ['全部部门'].concat(departments.value.map((d) => d.name))
  uni.showActionSheet({ itemList: items, success: (r) => {
    departmentId.value = r.tapIndex === 0 ? '' : departments.value[r.tapIndex - 1]._id
    load()
  } })
}
function pickFormDepartment() {
  const items = departments.value.map((d) => d.name)
  if (!items.length) return toast('请先创建部门')
  uni.showActionSheet({ itemList: items, success: (r) => { form.departmentId = departments.value[r.tapIndex]._id } })
}
function openEdit(e) {
  Object.assign(form, e ? { _id: e._id, name: e.name || '', employeeNo: e.employeeNo || '', position: e.position || '', phone: e.phone || '', departmentId: e.departmentId || departmentId.value, uid: e.uid || '' } : { _id: '', name: '', employeeNo: '', position: '', phone: '', departmentId: departmentId.value, uid: '' })
  editVisible.value = true
}
async function save() {
  if (!form.name.trim()) return toast('请输入姓名')
  try {
    await api.org.saveEmployee({ companyId: companyId.value, _id: form._id || undefined, name: form.name.trim(), employeeNo: form.employeeNo.trim(), position: form.position.trim(), phone: form.phone.trim(), departmentId: form.departmentId, uid: form.uid.trim() })
    editVisible.value = false
    toast('已保存')
    load()
  } catch (e) { toast((e && (e.message || e.errMsg)) || '保存失败') }
}
onLoad((o) => { companyId.value = (o && o.companyId) || ''; departmentId.value = ''; load() })
</script>

<style lang="scss" scoped>
.toolbar { display: flex; align-items: center; justify-content: space-between; padding: 8px 2px; }
.filter { font-size: 13px; color: var(--primary); }
.add { font-size: 13px; color: var(--primary); }
.employee { display: flex; align-items: center; gap: 10px; padding: 12px 14px; border-bottom: 1px solid var(--line); }
.employee:last-child { border-bottom: 0; }
.avatar { width: 34px; height: 34px; border-radius: 50%; background: var(--primary-soft); color: var(--primary); display: flex; align-items: center; justify-content: center; font-size: 14px; }
.main { flex: 1; min-width: 0; }
.name { display: block; font-size: 14px; color: var(--text-1); }
.pending { font-size: 10px; color: var(--warning); }
.sub { display: block; margin-top: 3px; font-size: 11px; color: var(--text-3); overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
.form { display: flex; flex-direction: column; gap: 10px; }
.input { height: 42px; padding: 0 12px; border-radius: 10px; background: var(--surface-2); color: var(--text-1); font-size: 14px; }
.select { display: flex; align-items: center; color: var(--text-2); }
.dialog-btn { flex: 1; }
</style>
