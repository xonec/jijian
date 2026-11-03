<template>
  <page-frame title="公司" back>
    <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
    <template v-else-if="company">
      <view class="card head">
        <view>
          <text class="head__name">{{ company.name }}</text>
          <text class="head__sub">{{ roleText(role) }} · {{ employeeCount }} 名员工</text>
        </view>
      </view>

      <view class="links">
        <view class="link" @click="openImport"><text class="link__t">导入排班</text><text class="link__s">Excel / CSV</text></view>
        <view class="link" @click="openBoard"><text class="link__t">排班看板</text><text class="link__s">按部门/日期</text></view>
        <view class="link" @click="openStats"><text class="link__t">统计</text><text class="link__s">按月</text></view>
        <view class="link" @click="openEmployees"><text class="link__t">员工档案</text><text class="link__s">自动建档</text></view>
      </view>

      <view class="section-head"><text>部门 / 班组</text><text v-if="isAdmin" class="section-add" @click="addDepartment">+ 新建</text></view>
      <view v-if="!departments.length" class="card empty"><text class="empty__t">还没有部门</text></view>
      <view v-else class="card">
        <view v-for="d in flatDepartments" :key="d._id" class="dept" :style="{ paddingLeft: 14 + d.depth * 18 + 'px' }" @click="openBoard(d)">
          <view class="dept__main">
            <text class="dept__name">{{ d.name }}</text>
            <text class="dept__type">{{ d.type === 'group' ? '班组' : '部门' }}<template v-if="d.managerUid === myUid"> · 我负责</template></text>
          </view>
          <ri-icon name="arrow_right" :size="14" class="gray" />
        </view>
      </view>
      <view class="hint">员工可查看公司全部排班明细；统计按月查看。</view>
    </template>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad, onShow } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const companyId = ref('')
const company = ref(null)
const role = ref('member')
const departments = ref([])
const employeeCount = ref(0)
const loading = ref(false)
const myUid = ref((uni.getStorageSync('uni_id_user') || {})._id || '')
const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')
const flatDepartments = computed(() => {
  const byParent = {}
  departments.value.forEach((d) => { const k = d.parentId || ''; if (!byParent[k]) byParent[k] = []; byParent[k].push(d) })
  Object.values(byParent).forEach((list) => list.sort((a, b) => (a.sort || 0) - (b.sort || 0)))
  const out = []
  const walk = (parent, depth) => {
    ;(byParent[parent] || []).forEach((d) => { out.push({ ...d, depth }); walk(d._id, depth + 1) })
  }
  walk('', 0)
  return out
})
function roleText(r) { return r === 'owner' ? '创建者' : r === 'admin' ? '管理员' : '成员' }
function openImport() { goPage('org-import', { companyId: companyId.value, departmentId: firstDeptId() }) }
function openBoard(d) { goPage('org-board', { companyId: companyId.value, departmentId: d ? d._id : firstDeptId() }) }
function openStats() { goPage('org-stats', { companyId: companyId.value }) }
function openEmployees() { goPage('org-employees', { companyId: companyId.value, departmentId: firstDeptId() }) }
function firstDeptId() { return departments.value.length ? departments.value[0]._id : '' }
function addDepartment() {
  uni.showActionSheet({
    itemList: ['新建部门', '新建班组'],
    success: (r) => {
      const type = r.tapIndex === 1 ? 'group' : 'dept'
      if (type === 'group' && !departments.value.some((d) => d.type === 'dept')) return toast('请先创建部门')
      if (type === 'group') {
        const depts = departments.value.filter((d) => d.type === 'dept')
        uni.showActionSheet({
          itemList: depts.map((d) => '上级：' + d.name),
          success: (p) => promptDepartment(type, depts[p.tapIndex]._id)
        })
      } else promptDepartment(type, '')
    }
  })
}
function promptDepartment(type, parentId) {
  uni.showModal({
    title: type === 'group' ? '新建班组' : '新建部门',
    editable: true,
    placeholderText: '名称',
    success: async (r) => {
      if (!r.confirm) return
      const name = String(r.content || '').trim()
      if (!name) return toast('请输入名称')
      try { await api.org.saveDepartment({ companyId: companyId.value, name, type, parentId }); toast('已创建'); load() } catch (e) { toast((e && (e.message || e.errMsg)) || '创建失败') }
    }
  })
}
async function load() {
  loading.value = true
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    company.value = d.company
    role.value = d.role
    departments.value = d.departments || []
    employeeCount.value = d.employeeCount || 0
  } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') } finally { loading.value = false }
}
onLoad((o) => { companyId.value = (o && o.id) || ''; load() })
onShow(() => { if (companyId.value && company.value) load() })
</script>

<style lang="scss" scoped>
.head { padding: 16px; }
.head__name { display: block; font-size: 18px; color: var(--text-1); }
.head__sub { display: block; margin-top: 5px; font-size: 12px; color: var(--text-3); }
.links { display: grid; grid-template-columns: 1fr 1fr; gap: 10px; margin: 12px 0; }
.link { background: var(--surface); border-radius: var(--r-card); padding: 14px; }
.link__t { display: block; font-size: 14px; color: var(--text-1); }
.link__s { display: block; margin-top: 3px; font-size: 11px; color: var(--text-3); }
.section-head { display: flex; justify-content: space-between; align-items: center; padding: 8px 2px; font-size: 13px; color: var(--text-2); }
.section-add { color: var(--primary); font-size: 12px; }
.dept { display: flex; align-items: center; gap: 8px; padding: 13px 14px; border-bottom: 1px solid var(--line); }
.dept:last-child { border-bottom: 0; }
.dept__main { flex: 1; }
.dept__name { display: block; font-size: 14px; color: var(--text-1); }
.dept__type { display: block; margin-top: 2px; font-size: 10px; color: var(--text-3); }
</style>
