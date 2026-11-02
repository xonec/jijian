<template>
  <page-frame :title="shiftId ? '编辑班次' : '添加班次'" back>
    <view class="group-title group-title--first">基本信息</view>
    <view class="form-card">
      <view class="form-row"><text class="form-row__k">班次名称</text><input v-model="form.name" class="form-input" maxlength="20" placeholder="早班" /></view>
      <view class="form-row"><text class="form-row__k">开始时间</text><input v-model="form.start" class="form-input" maxlength="5" placeholder="08:00" /></view>
      <view class="form-row"><text class="form-row__k">结束时间</text><input v-model="form.end" class="form-input" maxlength="8" placeholder="16:00" /></view>
      <view class="form-row">
        <text class="form-row__k">全天</text>
        <view class="flex1" />
        <app-switch v-model="form.allDay" />
      </view>
      <view class="form-row"><text class="form-row__k">颜色</text><input v-model="form.color" class="form-input" maxlength="7" placeholder="#55BB8A" /></view>
    </view>
    <view class="btn btn--primary mt14" @click="save">保存</view>
    <view v-if="shiftId" class="btn btn--danger-text mt6" @click="remove">删除班次</view>
  </page-frame>
</template>

<script setup>
import { reactive, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { back, toast } from '@/composables/use-nav.js'

const teamId = ref('')
const shiftId = ref('')
const form = reactive({ name: '', start: '08:00', end: '16:00', color: '#55BB8A', allDay: false })

async function loadShift() {
  try {
    const list = (await api.team.shifts(teamId.value)) || []
    const s = list.find((x) => x._id === shiftId.value)
    if (!s) return
    form.name = s.name
    form.start = s.start
    form.end = s.end
    form.color = s.color
    form.allDay = !!s.allDay
  } catch (e) {}
}
async function save() {
  if (!form.name.trim()) return toast('请输入班次名称')
  try {
    await api.team.saveShift(teamId.value, {
      _id: shiftId.value || undefined,
      name: form.name.trim(),
      start: form.start,
      end: form.end,
      color: form.color,
      allDay: form.allDay
    })
    toast('已保存')
    setTimeout(() => back(), 300)
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '保存失败')
  }
}
function remove() {
  uni.showModal({
    title: '删除班次',
    content: '确定删除该班次？',
    confirmText: '删除',
    success: async (r) => {
      if (!r.confirm) return
      try {
        await api.team.deleteShift(teamId.value, shiftId.value)
        toast('已删除')
        setTimeout(() => back(), 300)
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '删除失败')
      }
    }
  })
}
onLoad((o) => {
  teamId.value = (o && o.teamId) || ''
  shiftId.value = (o && o.id) || ''
  if (shiftId.value) loadShift()
})
</script>
