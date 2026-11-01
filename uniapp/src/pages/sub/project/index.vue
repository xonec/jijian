<template>
  <page-frame title="项目管理" back>
    <template #header-right>
      <view class="header__icon" @click="openAdd">
        <ri-icon name="add" :size="20" />
      </view>
    </template>

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
import { toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const projects = ref([])
const menuVisible = ref(false)
const menuProject = ref(null)
const addVisible = ref(false)
const newName = ref('')

const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const actionTitle = computed(() => (menuProject.value ? menuProject.value.name : '选择一项操作'))

function normalize(list) {
  return (list || []).map((p) => ({ ...p, id: p.id || p._id }))
}

async function load() {
  try {
    const list = await api.fetchProjects()
    projects.value = normalize(list)
  } catch (e) {
    projects.value = normalize(store.projects)
  }
  syncStoreProjects()
}

/* 同步到共享 store，首页项目面板可立即看到最新项目 */
function syncStoreProjects() {
  store.projects.splice(0, store.projects.length, ...projects.value.map((p) => ({ ...p })))
}

onMounted(() => {
  load()
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
  toast('项目排序功能暂未接入')
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
.project-row {
  display: flex;
  align-items: center;
  gap: 10px;
  min-height: 56px;
  padding: 0 14px;
  position: relative;
}
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