<template>
  <page-frame title="团队班次" back>
    <view class="card">
      <view v-for="s in shifts" :key="s._id" class="shift-row" @click="editShift(s)">
        <view class="shift-dot" :style="{ background: s.color }" />
        <view class="shift-main">
          <text class="shift-name">{{ s.name }}</text>
          <text class="shift-time">{{ s.allDay ? '全天' : s.start + '~' + s.end }}</text>
        </view>
        <text class="shift-del" @click.stop="removeShift(s)">删除</text>
      </view>
      <view v-if="!shifts.length" class="empty">暂无团队班次</view>
    </view>

    <template v-if="isAdmin">
      <view class="group-title">{{ form.id ? '编辑班次' : '添加班次' }}</view>
      <view class="form-card">
        <view class="form-row"><text class="form-row__k">名称</text><input v-model="form.name" class="form-input" maxlength="20" placeholder="早班" /></view>
        <view class="form-row"><text class="form-row__k">开始</text><input v-model="form.start" class="form-input" maxlength="5" placeholder="08:00" /></view>
        <view class="form-row"><text class="form-row__k">结束</text><input v-model="form.end" class="form-input" maxlength="8" placeholder="16:00" /></view>
        <view class="form-row"><text class="form-row__k">颜色</text><input v-model="form.color" class="form-input" maxlength="7" placeholder="#55BB8A" /></view>
      </view>
      <view class="btn btn--primary mt14" @click="saveShift">保存班次</view>
      <view v-if="form.id" class="btn btn--ghost mt6" @click="resetForm">取消编辑</view>
    </template>
    <view class="hint">成员只读；管理员可维护团队班次。</view>
  </page-frame>
</template>

<script setup>
import { reactive, ref, computed } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const teamId = ref('')
const role = ref('')
const shifts = ref([])
const form = reactive({ id: '', name: '', start: '08:00', end: '16:00', color: '#55BB8A', allDay: false })
const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')

async function load() {
  try {
    const detail = await api.team.detail(teamId.value)
    role.value = detail.role
    shifts.value = (await api.team.shifts(teamId.value)) || []
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '加载失败')
  }
}
function resetForm() {
  form.id = ''
  form.name = ''
  form.start = '08:00'
  form.end = '16:00'
  form.color = '#55BB8A'
  form.allDay = false
}
function editShift(s) {
  if (!isAdmin.value) return
  form.id = s._id
  form.name = s.name
  form.start = s.start
  form.end = s.end
  form.color = s.color
  form.allDay = !!s.allDay
}
async function saveShift() {
  if (!form.name.trim()) return toast('请输入班次名称')
  try {
    await api.team.saveShift(teamId.value, { _id: form.id || undefined, name: form.name.trim(), start: form.start, end: form.end, color: form.color, allDay: form.allDay })
    toast('已保存')
    resetForm()
    load()
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '保存失败')
  }
}
function removeShift(s) {
  if (!isAdmin.value) return
  uni.showModal({
    title: '删除班次', content: '确定删除「' + s.name + '」？', confirmText: '删除',
    success: async (r) => {
      if (!r.confirm) return
      try { await api.team.deleteShift(teamId.value, s._id); toast('已删除'); load() }
      catch (e) { toast((e && (e.message || e.errMsg)) || '删除失败') }
    }
  })
}
onLoad((o) => { teamId.value = (o && o.id) || ''; load() })
</script>

<style lang="scss" scoped>
.shift-row { display: flex; align-items: center; gap: 10px; padding: 12px 14px; border-bottom: 1px solid var(--line); }
.shift-row:last-child { border-bottom: 0; }
.shift-dot { width: 16px; height: 16px; border-radius: 5px; }
.shift-main { flex: 1; }
.shift-name { display: block; font-size: 14px; color: var(--text-1); }
.shift-time { display: block; margin-top: 2px; font-size: 11px; color: var(--text-3); }
.shift-del { font-size: 12px; color: var(--delete); }
.empty { padding: 30px; text-align: center; color: var(--text-3); font-size: 13px; }
</style>
