<template>
  <page-frame title="团队排班" back>
    <view class="top">
      <view class="month">
        <text class="month__btn" @click="stepMonth(-1)">‹</text>
        <text class="month__txt">{{ year }}年{{ month }}月</text>
        <text class="month__btn" @click="stepMonth(1)">›</text>
      </view>
      <view v-if="isAdmin" class="member-pick" @click="pickMember">{{ memberName }} ▾</view>
      <text v-else class="member-pick">{{ memberName }}</text>
    </view>

    <view class="card">
      <view v-for="d in days" :key="d.date" class="day-row" @click="pickDay(d)">
        <view class="day-main">
          <text class="day-date">{{ d.date }}</text>
          <text class="day-week">{{ d.week }}</text>
        </view>
        <text class="day-shift" :style="{ color: d.color || 'var(--text-3)' }">{{ d.name || '未排班' }}</text>
        <ri-icon name="arrow_right" :size="14" class="gray" />
      </view>
    </view>
    <view class="hint">管理员可给成员排班；成员可修改自己的排班，修改会通知管理员。</view>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const WEEK = ['周日', '周一', '周二', '周三', '周四', '周五', '周六']
const teamId = ref('')
const role = ref('')
const myUid = ref('')
const members = ref([])
const targetUid = ref('')
const shifts = ref([])
const schedule = ref([])
const year = ref(new Date().getFullYear())
const month = ref(new Date().getMonth() + 1)

const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')
const memberName = computed(() => {
  const m = members.value.find((x) => x.uid === targetUid.value)
  return m ? (m.realName || m.nickname || m.uid) : '我'
})
const days = computed(() => {
  const map = {}
  ;(schedule.value || []).forEach((s) => { map[s.date] = s })
  const total = new Date(year.value, month.value, 0).getDate()
  const list = []
  for (let i = 1; i <= total; i += 1) {
    const date = year.value + '-' + String(month.value).padStart(2, '0') + '-' + String(i).padStart(2, '0')
    const rec = map[date]
    const sh = rec ? shifts.value.find((x) => x._id === rec.workId) : null
    const wd = new Date(year.value, month.value - 1, i).getDay()
    list.push({ date, week: WEEK[wd], workId: rec ? rec.workId : '', name: sh ? sh.name : '', color: sh ? sh.color : '' })
  }
  return list
})

async function load() {
  try {
    const detail = await api.team.detail(teamId.value)
    role.value = detail.role
    myUid.value = (uni.getStorageSync('uni_id_user') || {})._id || ''
    if (!targetUid.value) targetUid.value = myUid.value
    members.value = (await api.team.memberList(teamId.value)) || []
    shifts.value = (await api.team.shifts(teamId.value)) || []
    await loadSchedule()
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '加载失败')
  }
}
async function loadSchedule() {
  const start = year.value + '-' + String(month.value).padStart(2, '0') + '-01'
  const end = year.value + '-' + String(month.value).padStart(2, '0') + '-' + String(new Date(year.value, month.value, 0).getDate()).padStart(2, '0')
  schedule.value = (await api.team.scheduleRange({ teamId: teamId.value, start, end, uid: targetUid.value })) || []
}
function stepMonth(d) {
  let m = month.value + d
  let y = year.value
  if (m > 12) { m = 1; y += 1 }
  if (m < 1) { m = 12; y -= 1 }
  month.value = m
  year.value = y
  loadSchedule()
}
function pickMember() {
  if (!isAdmin.value) return
  const list = members.value.map((m) => (m.realName || m.nickname || m.uid))
  uni.showActionSheet({ itemList: list, success: (r) => { targetUid.value = members.value[r.tapIndex].uid; loadSchedule() } })
}
function pickDay(d) {
  const can = isAdmin.value || d.uid === undefined && targetUid.value === myUid.value
  if (!can) return toast('只能修改自己的排班')
  const items = shifts.value.map((s) => s.name + ' ' + (s.allDay ? '全天' : s.start + '~' + s.end)).concat(['清除排班'])
  uni.showActionSheet({
    itemList: items,
    success: async (r) => {
      try {
        if (r.tapIndex === items.length - 1) {
          await api.team.clearSchedule({ teamId: teamId.value, uid: targetUid.value, date: d.date })
        } else {
          const sh = shifts.value[r.tapIndex]
          await api.team.setSchedule({ teamId: teamId.value, uid: targetUid.value, date: d.date, workId: sh._id, secondWorkId: '', remark: '' })
        }
        toast('已保存')
        loadSchedule()
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '保存失败')
      }
    }
  })
}
onLoad((o) => { teamId.value = (o && o.id) || ''; load() })
</script>

<style lang="scss" scoped>
.top { display: flex; align-items: center; justify-content: space-between; padding: 12px 2px; }
.month { display: flex; align-items: center; gap: 12px; }
.month__btn { font-size: 22px; color: var(--text-3); padding: 0 6px; }
.month__txt { font-size: 16px; color: var(--text-1); }
.member-pick { font-size: 13px; color: var(--primary); }
.day-row { display: flex; align-items: center; gap: 10px; padding: 10px 14px; border-bottom: 1px solid var(--line); }
.day-row:last-child { border-bottom: 0; }
.day-main { width: 128px; }
.day-date { display: block; font-size: 13px; color: var(--text-1); }
.day-week { display: block; font-size: 11px; color: var(--text-3); margin-top: 2px; }
.day-shift { flex: 1; font-size: 13px; text-align: right; }
</style>
