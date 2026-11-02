<template>
  <page-frame title="团队班次" back>
    <view v-if="shifts.length" class="card">
      <view
        v-for="s in shifts"
        :key="s._id"
        class="shift-row"
        @click="openEdit(s)"
        @longpress="onLongPress(s)"
      >
        <shift-badge mode="chip" :shift="s" />
        <text class="shift-row__name" />
        <text class="shift-row__time">{{ s.allDay ? '全天' : s.start + '~' + s.end }}</text>
      </view>
    </view>
    <view v-else class="empty">暂无团队班次</view>

    <view v-if="isAdmin" class="add-row" @click="openAdd">添加班次</view>
    <view class="hint center">{{ isAdmin ? '点击班次编辑，长按删除' : '成员只读' }}</view>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onShow, onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const teamId = ref('')
const role = ref('')
const shifts = ref([])
const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')

async function load() {
  try {
    const d = await api.team.detail(teamId.value)
    role.value = d.role
    shifts.value = (await api.team.shifts(teamId.value)) || []
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '加载失败')
  }
}
function openAdd() {
  if (!isAdmin.value) return
  goPage('team-shift-edit', { teamId: teamId.value })
}
function openEdit(s) {
  if (!isAdmin.value) return
  goPage('team-shift-edit', { teamId: teamId.value, id: s._id })
}
function onLongPress(s) {
  if (!isAdmin.value) return
  uni.showModal({
    title: '删除班次',
    content: '确定删除「' + s.name + '」？',
    confirmText: '删除',
    success: async (r) => {
      if (!r.confirm) return
      try {
        await api.team.deleteShift(teamId.value, s._id)
        toast('已删除')
        load()
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '删除失败')
      }
    }
  })
}
onLoad((o) => { teamId.value = (o && o.id) || ''; load() })
onShow(() => { if (teamId.value) load() })
</script>

<style lang="scss" scoped>
.empty { padding: 50px 20px; text-align: center; color: var(--text-3); font-size: 13px; }
.shift-row { display: flex; align-items: center; gap: 10px; padding: 12px 14px; border-bottom: 1px solid var(--line); }
.shift-row:last-child { border-bottom: 0; }
.shift-row__name { flex: 1; }
.shift-row__time { font-size: 13px; color: var(--text-2); }
.add-row { margin-top: 12px; height: 46px; border-radius: var(--r-card); background: var(--surface); display: flex; align-items: center; justify-content: center; font-size: 15px; color: var(--primary); }
</style>
