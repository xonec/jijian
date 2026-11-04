<template>
  <page-frame title="排班中心" back>
    <template #header-right>
      <view v-if="scope === 'personal'" class="header__icon" @click="openAdd">
        <ri-icon name="add" :size="20" />
      </view>
    </template>

    <view class="scope-tabs">
      <view class="scope-tab" :class="{ 'scope-tab--on': scope === 'personal' }" @click="setScope('personal')">个人排班</view>
      <view class="scope-tab" :class="{ 'scope-tab--on': scope === 'team' }" @click="setScope('team')">团队排班</view>
      <view class="scope-tab" :class="{ 'scope-tab--on': scope === 'org' }" @click="setScope('org')">组织排班</view>
    </view>

    <template v-if="scope === 'personal'">
    <view v-if="projects.length" class="card">
      <view v-for="p in projects" :key="p.id || p._id" class="project-row" @click="openMenu(p)">
        <text class="project-row__name">{{ p.name }}</text>
        <view v-if="p.current" class="tag tag--ok project-row__tag">当前</view>
        <text v-else class="project-row__count">{{ p.count || 0 }} 天</text>
        <view class="project-row__more" @click.stop="openMenu(p)">
          <ri-icon name="more2" :size="18" class="project-row__more-icon" />
        </view>
      </view>
    </view>
    <view v-else class="empty">暂无项目</view>

    <view class="add-row" @click="openAdd">添加项目</view>
    <view class="sort-link" @click="sortTip">项目排序</view>
    <view class="hint">删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？</view>
    </template>

    <template v-else-if="scope === 'team'">
      <view v-if="!isLogin" class="empty">
        <text class="empty__t">登录后使用团队排班</text>
        <view class="btn btn--primary mt14" @click="goLogin">去登录</view>
      </view>
      <view v-else-if="teamLoading" class="empty"><text class="empty__t">加载中…</text></view>
      <view v-else-if="teamError" class="empty"><text class="empty__t">{{ teamError }}</text></view>
      <view v-else-if="!teams.length" class="empty">
        <text class="empty__t">还没有加入团队</text>
        <view class="btn btn--primary mt14" @click="goTeams">去我的团队</view>
      </view>
      <template v-else>
        <view class="card">
          <view v-for="t in teams" :key="t._id" class="scope-row" @click="openTeam(t)">
            <view class="scope-row__main">
              <text class="scope-row__name">{{ t.name }}</text>
              <text class="scope-row__sub">{{ roleText(t.role) }}<template v-if="t.unread"> · {{ t.unread }} 条未读</template></text>
            </view>
            <ri-icon name="arrow_right" :size="15" class="gray" />
          </view>
        </view>
        <view class="scope-action" @click="goTeams">管理我的团队</view>
      </template>
    </template>

    <template v-else>
      <view v-if="!isLogin" class="empty">
        <text class="empty__t">登录后使用组织排班</text>
        <view class="btn btn--primary mt14" @click="goLogin">去登录</view>
      </view>
      <view v-else-if="orgLoading" class="empty"><text class="empty__t">加载中…</text></view>
      <view v-else-if="orgError" class="empty"><text class="empty__t">{{ orgError }}</text></view>
      <view v-else-if="!companies.length" class="empty">
        <text class="empty__t">还没有公司</text>
        <view class="btn btn--primary mt14" @click="goOrg">创建公司</view>
        <view class="btn btn--ghost mt10" @click="goClaim">认领员工</view>
      </view>
      <template v-else>
        <view class="card">
          <view v-for="c in companies" :key="c._id" class="scope-row" @click="openCompany(c)">
            <view class="scope-row__main">
              <text class="scope-row__name">{{ c.name }}</text>
              <text class="scope-row__sub">{{ roleText(c.role) }}</text>
            </view>
            <ri-icon name="arrow_right" :size="15" class="gray" />
          </view>
        </view>
        <view class="scope-actions">
          <view class="scope-action" @click="goOrg">公司/部门管理</view>
          <view class="scope-action" @click="goClaim">认领员工</view>
        </view>
      </template>
    </template>

    <app-sheet :visible="menuVisible" :title="actionTitle" @close="menuVisible = false">
      <view v-if="menuProject && !menuProject.current" class="opt-row" @click="switchCurrent">
        <ri-icon name="check" :size="18" class="opt-row__icon accent" />
        <text class="opt-row__t">切换为当前项目</text>
      </view>
      <view class="opt-row" @click="askDelete">
        <ri-icon name="delete_bin" :size="18" class="opt-row__icon opt-row__icon--danger" />
        <text class="opt-row__t opt-row__t--danger">删除项目</text>
      </view>
    </app-sheet>

    <app-sheet :visible="sortVisible" title="项目排序" @close="sortVisible = false">
      <view v-for="(p, i) in projects" :key="p.id || p._id" class="sort-item">
        <text class="sort-item__name">{{ p.name }}</text>
        <view class="sort-item__ops">
          <text class="sort-arrow" :class="{ disabled: i === 0 }" @click.stop="moveProject(i, -1)">↑</text>
          <text class="sort-arrow" :class="{ disabled: i === projects.length - 1 }" @click.stop="moveProject(i, 1)">↓</text>
        </view>
      </view>
    </app-sheet>

    <app-dialog :visible="addVisible" title="添加项目" @close="addVisible = false">
      <input
        v-model="newName"
        class="dialog-input"
        type="text"
        maxlength="12"
        placeholder="请输入项目名称"
        :placeholder-style="placeholderStyle"
      />
      <template #actions>
        <view class="btn btn--ghost dialog-btn" @click="addVisible = false">取消</view>
        <view class="btn btn--primary dialog-btn" @click="doAdd">添加</view>
      </template>
    </app-dialog>
  </page-frame>
</template>

<script setup>
import { ref, computed, onMounted } from 'vue'
import api from '@/services/api.js'
import { store } from '@/composables/use-store.js'
import { goPage, toast } from '@/composables/use-nav.js'
import { clearSession } from '@/composables/use-auth.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const scope = ref('personal')
const user = ref(uni.getStorageSync('uni_id_user') || null)
const teams = ref([])
const companies = ref([])
const teamLoading = ref(false)
const orgLoading = ref(false)
const teamError = ref('')
const orgError = ref('')
const isLogin = computed(() => !!(user.value && (user.value._id || user.value.username)))
const projects = ref([])
const menuVisible = ref(false)
const menuProject = ref(null)
const addVisible = ref(false)
const sortVisible = ref(false)
const newName = ref('')

const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const actionTitle = computed(() => (menuProject.value ? menuProject.value.name : '选择一项操作'))

function normalize(list) {
  return (list || []).map((p) => ({ ...p, id: p.id || p._id }))
}

async function load() {
  try {
    const list = await api.fetchProjects()
    projects.value = normalize(list).sort((a, b) => (Number(a.sort) || 0) - (Number(b.sort) || 0))
  } catch (e) {
    projects.value = normalize(store.projects).sort((a, b) => (Number(a.sort) || 0) - (Number(b.sort) || 0))
  }
  syncStoreProjects()
}

/* 同步到共享 store，首页项目面板可立即看到最新项目 */
function syncStoreProjects() {
  store.projects.splice(0, store.projects.length, ...projects.value.map((p) => ({ ...p })))
}

function roleText(role) {
  return role === 'owner' ? '创建者' : role === 'admin' ? '管理员' : '成员'
}
function setScope(next) {
  scope.value = next
  user.value = uni.getStorageSync('uni_id_user') || null
  if (next === 'team' && isLogin.value) loadTeams()
  if (next === 'org' && isLogin.value) loadCompanies()
}
function goLogin() { goPage('login') }
function goTeams() { goPage('teams') }
function goOrg() { goPage('org') }
function goClaim() { goPage('org-claim') }
function openTeam(t) { goPage('team-schedule', { id: t._id }) }
function openCompany(c) { goPage('org-company', { id: c._id }) }
function authExpired(e) {
  const msg = (e && (e.message || e.errMsg)) || ''
  return /未登录|登录状态|token|失效|30202|30203|请先登录/i.test(msg)
}
async function loadTeams() {
  if (!isLogin.value) return
  teamLoading.value = true
  teamError.value = ''
  try { teams.value = (await api.team.listMine()) || [] } catch (e) {
    teams.value = []
    if (authExpired(e)) { clearSession(); user.value = null; toast('登录已过期，请重新登录') }
    else teamError.value = '团队加载失败，请下拉重试'
  } finally { teamLoading.value = false }
}
async function loadCompanies() {
  if (!isLogin.value) return
  orgLoading.value = true
  orgError.value = ''
  try { companies.value = ((await api.org.listCompanies()) || {}).list || [] } catch (e) {
    companies.value = []
    if (authExpired(e)) { clearSession(); user.value = null; toast('登录已过期，请重新登录') }
    else orgError.value = '公司加载失败，请下拉重试'
  } finally { orgLoading.value = false }
}

onMounted(() => {
  load()
  loadTeams()
  loadCompanies()
})

function openMenu(p) {
  menuProject.value = p
  menuVisible.value = true
}
function openAdd() {
  newName.value = ''
  addVisible.value = true
}
function sortTip() {
  sortVisible.value = true
}

async function moveProject(index, delta) {
  const next = index + delta
  if (next < 0 || next >= projects.value.length) return
  const list = projects.value.slice()
  const [item] = list.splice(index, 1)
  list.splice(next, 0, item)
  projects.value = list.map((p, i) => ({ ...p, sort: i }))
  try {
    await api.sortProjects(projects.value.map((p) => p._id || p.id))
    await load()
    toast('排序已保存')
  } catch (e) {
    toast('排序保存失败')
  }
}

async function switchCurrent() {
  const p = menuProject.value
  menuVisible.value = false
  if (!p) return
  try {
    await api.setCurrentProject(p._id || p.id)
    await load()
    toast('已切换为当前项目')
  } catch (e) {
    toast('切换失败，请重试')
  }
}

function askDelete() {
  const p = menuProject.value
  menuVisible.value = false
  if (!p) return
  if (projects.value.length <= 1) {
    toast('至少保留一个项目')
    return
  }
  uni.showModal({
    title: '删除项目',
    content: '删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？',
    confirmText: '删除',
    confirmColor: '#F87679',
    success: async (res) => {
      if (!res.confirm) return
      try {
        await api.deleteProject(p._id || p.id)
        await load()
        toast('已删除')
      } catch (e) {
        toast('删除失败，请重试')
      }
    }
  })
}

async function doAdd() {
  const name = String(newName.value || '').trim()
  if (!name) {
    toast('请输入项目名称')
    return
  }
  addVisible.value = false
  try {
    await api.saveProject({ name, current: false, count: 0 })
    await load()
    toast('项目已添加')
  } catch (e) {
    toast('添加失败，请重试')
  }
}
</script>

<style lang="scss" scoped>
.scope-tabs { display: flex; gap: 8px; padding: 4px 2px 12px; }
.scope-tab { flex: 1; text-align: center; padding: 8px 0; border-radius: 99px; background: var(--surface-2); color: var(--text-3); font-size: 13px; }
.scope-tab--on { color: #fff; background: var(--primary); }
.scope-row { display: flex; align-items: center; gap: 10px; padding: 14px; border-bottom: 1px solid var(--line); }
.scope-row:last-child { border-bottom: 0; }
.scope-row__main { flex: 1; min-width: 0; }
.scope-row__name { display: block; font-size: 14px; color: var(--text-1); }
.scope-row__sub { display: block; margin-top: 3px; font-size: 11px; color: var(--text-3); }
.scope-action { margin-top: 12px; height: 44px; border-radius: var(--r-card); background: var(--surface); color: var(--primary); display: flex; align-items: center; justify-content: center; font-size: 14px; }
.scope-actions { display: flex; gap: 10px; }
.scope-actions .scope-action { flex: 1; }
.empty__t { display: block; font-size: 14px; color: var(--text-2); }

.project-row {
  display: flex;
  align-items: center;
  gap: 10px;
  min-height: 56px;
  padding: 0 14px;
  position: relative;
}
.sort-item {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 12px 4px;
  border-bottom: 1px solid var(--line);
}
.sort-item:last-child { border-bottom: 0; }
.sort-item__name { font-size: 14px; color: var(--text-1); }
.sort-item__ops { display: flex; gap: 16px; }
.sort-arrow { font-size: 18px; color: var(--primary); padding: 0 6px; }
.sort-arrow.disabled { color: var(--text-3); opacity: 0.35; }
.project-row + .project-row::before {
  content: '';
  position: absolute;
  top: 0;
  left: 14px;
  right: 0;
  height: 1px;
  background: var(--line);
}
.project-row__name {
  flex: 1;
  font-size: 15px;
  color: var(--text-1);
}
.project-row__tag {
  flex: none;
  font-size: 11px;
}
.project-row__count {
  font-size: 14px;
  color: var(--text-3);
}
.project-row__more {
  display: flex;
  align-items: center;
  padding: 6px 0 6px 4px;
}
.project-row__more-icon {
  color: var(--text-3);
}
.opt-row {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 13px 12px;
  border-radius: 10px;
}
.opt-row__t {
  font-size: 15px;
  color: var(--text-1);
}
.opt-row__t--danger {
  color: var(--delete);
}
.opt-row__icon {
  flex: none;
}
.opt-row__icon--danger {
  color: var(--delete);
}
.dialog-input {
  width: 100%;
  height: 42px;
  background: var(--surface-2);
  border-radius: 10px;
  padding: 0 12px;
  font-size: 15px;
  color: var(--text-1);
}
.dialog-btn {
  height: 40px;
  font-size: 15px;
  flex: 1;
}
</style>