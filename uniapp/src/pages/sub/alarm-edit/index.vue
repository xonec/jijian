<template>
  <page-frame :title="pageTitle" back>
    <template #header-right>
      <view class="header-save" @click="save">保存</view>
    </template>

    <view class="group-title">基本信息</view>
    <view class="form-card">
      <view class="form-row" @click="sheet = 'shift'">
        <text class="form-row__k">选择班次</text>
        <view class="form-row__v">
          <shift-badge mode="chip" :shift="shift" />
          <ri-icon name="arrow_right" :size="15" class="chev" />
        </view>
      </view>
      <view class="form-row" @click="sheet = 'when'">
        <text class="form-row__k">什么时候提醒</text>
        <view class="form-row__v">
          <text>{{ form.when }}</text>
          <ri-icon name="arrow_right" :size="15" class="chev" />
        </view>
      </view>
      <view class="form-row">
        <text class="form-row__k">是否强提醒</text>
        <view class="flex1" />
        <app-switch v-model="form.strong" />
      </view>
      <view class="form-row">
        <text class="form-row__k">同步到系统日历</text>
        <view class="flex1" />
        <app-switch v-model="calendarSync" />
      </view>
    </view>
    <view class="hint">开启强提醒后，系统日程提醒会有铃声提醒（部分安卓机型支持）。开启「同步到系统日历」后，提醒会写入系统日历，由系统在设定时间准时通知；需要授权极简排班访问日历（读 + 写）。</view>

    <view class="group-title">快捷选项</view>
    <view class="form-card">
      <view class="quick-tags">
        <view
          v-for="q in quickOptions"
          :key="q"
          class="tag quick-tag"
          :class="{ 'tag--ok': form.when === q }"
          @click="form.when = q"
        >
          {{ q }}
        </view>
      </view>
    </view>
    <view class="hint">提醒会写入系统日历：需要授权极简排班操作您的日历（更新数据）与查询您的日历（查询数据）。</view>

    <app-sheet :visible="!!sheet" :title="sheetTitle" @close="sheet = ''">
      <template v-if="sheet === 'shift'">
        <view v-for="sh in store.shifts" :key="sh.id || sh._id" class="opt-row" @click="pickShift(sh)">
          <shift-badge mode="chip" :shift="sh" />
          <text class="opt-row__t">{{ fmtTime(sh) }}</text>
          <view class="flex1" />
          <ri-icon v-if="form.shift === (sh.id || sh._id)" name="check" :size="16" class="accent" />
        </view>
      </template>
      <template v-else>
        <view v-for="q in quickOptions" :key="q" class="opt-row" @click="pickWhen(q)">
          <text class="opt-row__t flex1">{{ q }}</text>
          <ri-icon v-if="form.when === q" name="check" :size="16" class="accent" />
        </view>
      </template>
    </app-sheet>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { store, fmtTime } from '@/composables/use-store.js'
import { back, toast } from '@/composables/use-nav.js'
import { isSupported, syncAlarm, removeAlarm } from '@/services/reminder.js'

const quickOptions = ['上班前30分钟', '上班前10分钟', '下班前5分钟']

const form = store.alarmForm
const sheet = ref('')
const editId = ref('')
const calendarSync = ref(true)

const pageTitle = computed(() => (editId.value ? '编辑提醒' : '添加提醒'))
const shift = computed(
  () => store.shifts.find((s) => s.id === form.shift || s._id === form.shift) || store.shifts[0]
)
const sheetTitle = computed(() => (sheet.value === 'shift' ? '选择班次' : '什么时候提醒'))

function parseTime(t) {
  const m = /^(\d{1,2}):(\d{2})$/.exec(String(t || '').replace(/^次日/, ''))
  return m ? Number(m[1]) * 60 + Number(m[2]) : 0
}
function notifyTime() {
  const sh = shift.value || {}
  const fromEnd = form.when && form.when.indexOf('下班') === 0
  const base = fromEnd ? sh.end : sh.start
  const mins = Number((/(\d+)分钟/.exec(form.when) || [])[1] || 0)
  let total = parseTime(base || sh.start || '09:00') - mins
  if (total < 0) total += 24 * 60
  const h = Math.floor(total / 60)
  const m = total % 60
  return String(h).padStart(2, '0') + ':' + String(m).padStart(2, '0')
}
function pickShift(sh) {
  form.shift = sh.id || sh._id
  sheet.value = ''
}
function pickWhen(q) {
  form.when = q
  sheet.value = ''
}

onLoad((options) => {
  if (!options || !options.id) return
  editId.value = options.id
  api.fetchAlarms()
    .then((list) => {
      const al = (list || []).find((x) => x._id === options.id || x.id === options.id)
      if (!al) return
      form.shift = al.shift || form.shift
      form.strong = !!al.strong
      form.when = al.when || form.when
    })
    .catch(() => {})
})

async function save() {
  const sh = shift.value
  const time = notifyTime()
  const payload = {
    time,
    shift: form.shift,
    range: fmtTime(sh),
    tags: [form.strong ? '强提醒' : '普通提醒', '当天'],
    next: '明天 ' + time + ' 提醒',
    on: true,
    strong: !!form.strong,
    when: form.when
  }
  if (editId.value) payload._id = editId.value
  try {
    const saved = await api.saveAlarm(payload)
    const savedId = (saved && (saved._id || saved.id)) || editId.value || payload._id || ''
    let calTip = ''
    if (isSupported() && savedId) {
      try {
        if (calendarSync.value) {
          await syncAlarm({
            id: savedId,
            time,
            when: form.when,
            strong: !!form.strong,
            shiftName: (sh && sh.name) || ''
          })
          calTip = '，已同步系统日历'
        } else {
          await removeAlarm(savedId)
          calTip = '，已取消日历同步'
        }
      } catch (e) {
        if (e && e.code === 'NO_CALENDAR_PERMISSION') calTip = '（未授权日历，未同步）'
        else calTip = '（日历同步失败）'
      }
    }
    toast('提醒已保存' + calTip)
    setTimeout(() => back(), 600)
  } catch (e) {
    toast('保存失败，请重试')
  }
}
</script>

<style lang="scss" scoped>
.header-save {
  font-size: 14px;
  color: var(--primary);
  padding: 6px 0 6px 10px;
}
.chev {
  color: var(--text-3);
  opacity: 0.8;
}
.quick-tags {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  padding: 12px 14px 16px;
}
.quick-tag {
  font-size: 12.5px;
  padding: 7px 11px;
  border-radius: 8px;
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
</style>