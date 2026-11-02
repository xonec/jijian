<template>
  <page-frame title="团队排班" back>
    <view class="view-tabs">
      <text class="view-tab" :class="{ 'view-tab--on': viewMode === 'calendar' }" @click="setView('calendar')">月历</text>
      <text v-if="isAdmin" class="view-tab" :class="{ 'view-tab--on': viewMode === 'matrix' }" @click="setView('matrix')">排班表</text>
    </view>

    <view class="top">
      <view class="month">
        <text class="month__btn" @click="stepMonth(-1)">‹</text>
        <text class="month__txt">{{ year }}年{{ month }}月</text>
        <text class="month__btn" @click="stepMonth(1)">›</text>
      </view>
      <view v-if="isAdmin && viewMode === 'calendar'" class="member-pick" @click="pickMember">{{ memberName }} ▾</view>
      <text v-else class="member-pick">{{ memberName }}</text>
    </view>

    <template v-if="viewMode === 'calendar'">
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
    </template>

    <template v-else>
      <scroll-view class="matrix-scroll" scroll-x>
        <view class="matrix-table">
          <view class="matrix-row matrix-row--head">
            <view class="matrix-name matrix-sticky">成员</view>
            <view v-for="d in dates" :key="d.date" class="matrix-cell matrix-cell--head">
              <text class="matrix-day">{{ d.day }}</text>
              <text class="matrix-week">{{ d.week }}</text>
            </view>
          </view>
          <view v-for="m in members" :key="m.uid" class="matrix-row">
            <view class="matrix-name matrix-sticky">
              <text class="matrix-member">{{ displayName(m) }}</text>
              <text v-if="m.role !== 'member'" class="matrix-role">{{ m.role === 'owner' ? '创建者' : '管理员' }}</text>
            </view>
            <view
              v-for="d in dates"
              :key="m.uid + d.date"
              class="matrix-cell matrix-cell--shift"
              :style="matrixCellStyle(m, d)"
              @click="pickMatrixCell(m, d)"
            >{{ matrixCellName(m, d) }}</view>
          </view>
          <view class="matrix-row matrix-row--stats">
            <view class="matrix-name matrix-sticky">在岗/未排</view>
            <view v-for="d in dates" :key="'s' + d.date" class="matrix-cell matrix-cell--stats">
              {{ matrixStats[d.date].on }}/{{ matrixStats[d.date].off }}
            </view>
          </view>
        </view>
      </scroll-view>
      <view class="legend">
        <view v-for="s in shifts" :key="s._id" class="legend-item">
          <view class="legend-dot" :style="{ background: s.color }" />
          <text>{{ s.name }}</text>
        </view>
        <view class="legend-item">
          <view class="legend-dot legend-dot--empty" />
          <text>未排班</text>
        </view>
      </view>
      <view class="hint">点击单元格给成员排班；横向滑动查看整月。</view>
    </template>
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
const matrixSchedule = ref([])
const viewMode = ref('calendar')
const year = ref(new Date().getFullYear())
const month = ref(new Date().getMonth() + 1)

const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')
const memberName = computed(() => {
  const m = members.value.find((x) => x.uid === targetUid.value)
  return m ? (m.realName || m.nickname || m.uid) : '我'
})
const dates = computed(() => {
  const total = new Date(year.value, month.value, 0).getDate()
  const list = []
  for (let i = 1; i <= total; i += 1) {
    const date = year.value + '-' + String(month.value).padStart(2, '0') + '-' + String(i).padStart(2, '0')
    const wd = new Date(year.value, month.value - 1, i).getDay()
    list.push({ date, day: i, week: WEEK[wd].replace('周', '') })
  }
  return list
})
const matrixMap = computed(() => {
  const map = {}
  ;(matrixSchedule.value || []).forEach((r) => { map[r.uid + '|' + r.date] = r })
  return map
})
const matrixStats = computed(() => {
  const out = {}
  dates.value.forEach((d) => {
    let on = 0
    members.value.forEach((m) => {
      const rec = matrixMap.value[m.uid + '|' + d.date]
      if (rec && rec.workId) on += 1
    })
    out[d.date] = { on, off: Math.max(0, members.value.length - on) }
  })
  return out
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
function setView(mode) {
  if (mode === viewMode.value) return
  viewMode.value = mode
  if (mode === 'matrix') loadMatrixSchedule()
  else loadSchedule()
}
function displayName(m) {
  return m.realName || m.nickname || m.uid || '成员'
}
function shiftOf(id) {
  return (shifts.value || []).find((x) => x._id === id)
}
function matrixCellRecord(m, d) {
  return matrixMap.value[m.uid + '|' + d.date]
}
function matrixCellName(m, d) {
  const rec = matrixCellRecord(m, d)
  const sh = rec && shiftOf(rec.workId)
  return sh ? sh.name : '—'
}
function matrixCellStyle(m, d) {
  const rec = matrixCellRecord(m, d)
  const sh = rec && shiftOf(rec.workId)
  return sh ? { background: sh.color, color: '#fff' } : {}
}
async function loadMatrixSchedule() {
  const start = year.value + '-' + String(month.value).padStart(2, '0') + '-01'
  const end = year.value + '-' + String(month.value).padStart(2, '0') + '-' + String(new Date(year.value, month.value, 0).getDate()).padStart(2, '0')
  matrixSchedule.value = (await api.team.scheduleRange({ teamId: teamId.value, start, end })) || []
}
function pickMatrixCell(m, d) {
  if (!isAdmin.value) return
  const items = shifts.value.map((s) => s.name).concat(['清除排班'])
  uni.showActionSheet({
    itemList: items,
    success: async (r) => {
      try {
        if (r.tapIndex === items.length - 1) {
          await api.team.clearSchedule({ teamId: teamId.value, uid: m.uid, date: d.date })
        } else {
          const sh = shifts.value[r.tapIndex]
          await api.team.setSchedule({ teamId: teamId.value, uid: m.uid, date: d.date, workId: sh._id, secondWorkId: '', remark: '' })
        }
        toast('已保存')
        await loadMatrixSchedule()
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '保存失败')
      }
    }
  })
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
  if (viewMode.value === 'matrix') loadMatrixSchedule()
  else loadSchedule()
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
.view-tabs { display: flex; justify-content: center; gap: 8px; padding: 4px 0 2px; }
.view-tab { font-size: 13px; color: var(--text-3); padding: 6px 14px; border-radius: 99px; background: var(--surface-2); }
.view-tab--on { color: #fff; background: var(--primary); }
.matrix-scroll { margin-top: 4px; border-radius: var(--r-card); background: var(--surface); overflow: hidden; }
.matrix-table { display: flex; flex-direction: column; min-width: max-content; }
.matrix-row { display: flex; align-items: stretch; border-bottom: 1px solid var(--line); }
.matrix-row:last-child { border-bottom: 0; }
.matrix-name { width: 88px; min-width: 88px; padding: 8px 10px; display: flex; flex-direction: column; justify-content: center; background: var(--surface); border-right: 1px solid var(--line); }
.matrix-sticky { position: sticky; left: 0; z-index: 2; }
.matrix-member { font-size: 12px; color: var(--text-1); white-space: nowrap; overflow: hidden; text-overflow: ellipsis; }
.matrix-role { margin-top: 2px; font-size: 10px; color: var(--text-3); }
.matrix-cell { width: 42px; min-width: 42px; height: 48px; display: flex; flex-direction: column; align-items: center; justify-content: center; border-right: 1px solid var(--line); font-size: 11px; color: var(--text-2); }
.matrix-row--head .matrix-cell { height: 40px; background: var(--surface); }
.matrix-cell--head { font-size: 10px; color: var(--text-3); }
.matrix-day { font-size: 12px; color: var(--text-1); }
.matrix-week { font-size: 9px; color: var(--text-3); margin-top: 1px; }
.matrix-cell--shift { cursor: pointer; }
.matrix-cell--shift:active { opacity: 0.7; }
.matrix-row--stats .matrix-cell { height: 34px; font-size: 10px; color: var(--text-3); background: var(--surface-2); }
.matrix-cell--stats { color: var(--text-2); }
.legend { display: flex; flex-wrap: wrap; gap: 10px; padding: 10px 4px 0; }
.legend-item { display: flex; align-items: center; gap: 4px; font-size: 11px; color: var(--text-3); }
.legend-dot { width: 10px; height: 10px; border-radius: 3px; }
.legend-dot--empty { background: var(--surface-2); border: 1px solid var(--line); }
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
