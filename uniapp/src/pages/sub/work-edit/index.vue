<template>
  <page-frame :title="pageTitle" back>
    <view class="group-title group-title--first">基本信息</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">班次名称</text>
        <input
          v-model="form.name"
          class="form-input"
          type="text"
          maxlength="5"
          placeholder="早班"
          :placeholder-style="placeholderStyle"
        />
      </view>
      <view class="form-row">
        <text class="form-row__k">是否全天</text>
        <view class="flex1" />
        <app-switch v-model="form.allDay" />
      </view>
      <view v-if="!form.allDay" class="form-row" @click="openSheet('start')">
        <text class="form-row__k">开始时间</text>
        <view class="form-row__v">
          <text>{{ form.start }}</text>
          <ri-icon name="arrow_right" :size="15" class="chev" />
        </view>
      </view>
      <view v-if="!form.allDay" class="form-row" @click="openSheet('end')">
        <text class="form-row__k">结束时间</text>
        <view class="form-row__v">
          <text>{{ endText }}</text>
          <ri-icon name="arrow_right" :size="15" class="chev" />
        </view>
      </view>
      <view class="form-row" @click="openSheet('rest')">
        <text class="form-row__k">休息时长</text>
        <view class="form-row__v form-row__v--muted">
          <text>{{ form.rest }} 分钟</text>
          <ri-icon name="arrow_right" :size="15" class="chev" />
        </view>
      </view>
      <view class="form-row">
        <text class="form-row__k">备注</text>
        <input
          v-model="form.remark"
          class="form-input"
          type="text"
          maxlength="30"
          placeholder="选填"
          :placeholder-style="placeholderStyle"
        />
      </view>
    </view>

    <view class="group-title">班次颜色</view>
    <view class="form-card">
      <view class="color-dots">
        <view
          v-for="c in COLORS"
          :key="c"
          class="color-dot"
          :class="{ 'color-dot--on': store.selectedColor === c }"
          :style="{ background: c }"
          @click="store.selectedColor = c"
        />
      </view>
    </view>

    <view class="group-title">样式预览</view>
    <view class="form-card">
      <view class="preview-box">
        <view class="preview-box__left">
          <shift-badge mode="chip" big :shift="previewShift" />
          <text class="preview-box__time">{{ previewTime }}</text>
        </view>
        <text class="preview-box__label">首页日历效果</text>
      </view>
    </view>

    <view class="btn btn--primary mt14" @click="save">保存</view>
    <view v-if="editId" class="btn btn--danger-text mt10" @click="removeShift">删除班次</view>
    <view class="hint">提示：班次颜色会用于首页日历色块、统计图表与桌面小组件。休息类班次可开启「是否全天」。组合班次由两个普通班次组成，可一次在某天设置 2 个班次。</view>

    <app-sheet :visible="!!sheet" :title="sheetTitle" @close="sheet = ''">
      <view v-if="sheet === 'rest'" class="opt-grid">
        <view
          v-for="r in restOptions"
          :key="r.value"
          class="opt-item"
          :class="{ 'opt-item--on': form.rest === r.value }"
          @click="pickRest(r.value)"
        >
          {{ r.label }}
        </view>
      </view>
      <view v-else class="opt-grid opt-grid--time">
        <view
          v-for="t in timeOptions"
          :key="t"
          class="opt-item"
          :class="{ 'opt-item--on': t === pickerSelected }"
          @click="pickTime(t)"
        >
          {{ t }}
        </view>
      </view>
    </app-sheet>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { store } from '@/composables/use-store.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const COLORS = ['#1BA784', '#303048', '#F8723D', '#3E7BD6', '#C04851', '#E0A12E', '#806D9E', '#4A4A4A', '#2D8A7A', '#B5563F']
const restOptions = [
  { value: '0', label: '0 分钟' },
  { value: '30', label: '30 分钟' },
  { value: '45', label: '45 分钟' },
  { value: '60', label: '60 分钟' },
  { value: '90', label: '90 分钟' },
  { value: '120', label: '120 分钟' }
]

const form = store.workForm

const DEFAULTS = {
  name: '',
  allDay: false,
  start: '08:00',
  end: '16:00',
  rest: '0',
  remark: ''
}

const editId = ref('')
const sheet = ref('')

function resetForm() {
  form.name = DEFAULTS.name
  form.allDay = DEFAULTS.allDay
  form.start = DEFAULTS.start
  form.end = DEFAULTS.end
  form.rest = DEFAULTS.rest
  form.remark = DEFAULTS.remark
  store.selectedColor = COLORS[0]
}

function genId() {
  return 's' + Date.now().toString(36) + Math.random().toString(36).slice(2, 5)
}

const pageTitle = computed(() => (editId.value ? '编辑班次' : '添加班次'))
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const sheetTitle = computed(() => {
  if (sheet.value === 'start') return '开始时间'
  if (sheet.value === 'end') return '结束时间'
  return '休息时长'
})

const timeOptions = computed(() => {
  const list = []
  for (let h = 0; h < 24; h += 1) {
    const hh = String(h).padStart(2, '0')
    list.push(hh + ':00')
    list.push(hh + ':30')
  }
  return list
})
const pickerSelected = computed(() => {
  if (sheet.value === 'start') return form.start
  return (form.end || '').replace(/^次日/, '')
})
const endText = computed(() => {
  const e = form.end || ''
  if (!e) return ''
  return form.start && e <= form.start ? '次日' + e : e
})
const previewShift = computed(() => ({
  name: form.name || '班次',
  color: store.selectedColor,
  allDay: !!form.allDay,
  start: form.start,
  end: form.end
}))
const previewTime = computed(() => (form.allDay ? '全天' : form.start + '~' + endText.value))

function openSheet(kind) {
  sheet.value = kind
}
function pickTime(t) {
  if (sheet.value === 'start') form.start = t
  else form.end = t
  sheet.value = ''
}
function pickRest(v) {
  form.rest = v
  sheet.value = ''
}

onLoad((options) => {
  // 每次进入页面先重置，避免“编辑后返回再添加”残留上一次表单内容
  resetForm()
  if (!options || !options.id) return
  editId.value = options.id
  api.fetchShifts()
    .then((list) => {
      const sh = (list || []).find((x) => x._id === options.id || x.id === options.id)
      if (!sh) {
        toast('班次不存在')
        return
      }
      form.name = sh.name || ''
      form.allDay = !!sh.allDay
      form.start = (sh.start || '09:00').replace(/^次日/, '')
      form.end = (sh.end || '18:00').replace(/^次日/, '')
      form.rest = String(sh.rest || '60')
      form.remark = sh.remark || ''
      store.selectedColor = sh.color || COLORS[0]
    })
    .catch(() => toast('加载班次失败'))
})

async function save() {
  const name = String(form.name || '').trim()
  if (!name) {
    toast('请输入班次名称')
    return
  }
  if (!form.allDay && !form.start) {
    toast('请选择开始时间')
    return
  }
  // 同名班次检查（编辑自身除外）
  const dup = (store.shifts || []).find((s) => {
    const sid = s._id || s.id
    return s.name === name && sid !== editId.value
  })
  if (dup) {
    toast('已存在同名班次')
    return
  }

  const id = editId.value || genId()
  const payload = {
    id,
    name,
    color: store.selectedColor,
    allDay: !!form.allDay,
    start: form.allDay ? '' : form.start,
    end: form.allDay ? '' : endText.value,
    rest: form.rest,
    remark: form.remark || ''
  }
  if (editId.value) payload._id = editId.value
  try {
    const saved = await api.saveShift(payload)
    syncStoreShift(payload, saved)
    toast(editId.value ? '已保存' : '班次已添加')
    setTimeout(() => back(), 400)
  } catch (e) {
    toast('保存失败，请重试')
  }
}

function removeShift() {
  const key = editId.value
  if (!key) return
  uni.showModal({
    title: '删除班次',
    content: '删除后，使用该班次的日期会变为未排班，确定删除？',
    confirmText: '删除',
    cancelText: '取消',
    success: async (res) => {
      if (!res.confirm) return
      try {
        await api.deleteShift(key)
        const idx = store.shifts.findIndex((s) => {
          const sid = s.id || s._id
          return sid === key || s._id === key || s.id === key
        })
        if (idx >= 0) store.shifts.splice(idx, 1)
        ;(store.days || []).forEach((d) => {
          if (d.work === key) d.work = ''
        })
        toast('已删除班次')
        setTimeout(() => back(), 400)
      } catch (e) {
        toast('删除失败，请重试')
      }
    }
  })
}

/* 同步到共享 store，首页/提醒页可立即使用新班次；编辑时按 id/_id 合并，避免重复 */
function syncStoreShift(payload, saved) {
  const item = { ...payload, ...(saved && typeof saved === 'object' ? saved : {}) }
  const key = item.id || item._id || editId.value
  const idx = store.shifts.findIndex((s) => {
    const sid = s.id || s._id
    return (
      (key && sid === key) ||
      (item._id && (s._id === item._id || s.id === item._id))
    )
  })
  if (idx >= 0) {
    store.shifts.splice(idx, 1, { ...store.shifts[idx], ...item, id: key })
  } else {
    store.shifts.push({ ...item, id: key })
  }
}
</script>

<style lang="scss" scoped>
.seg-row {
  display: flex;
  justify-content: center;
  padding: 2px 0 14px;
}
.group-title--first {
  padding-top: 0;
}
.chev {
  color: var(--text-3);
  opacity: 0.8;
}
.color-dots {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  padding: 12px 14px 16px;
}
.color-dot {
  width: 26px;
  height: 26px;
  border-radius: 50%;
  position: relative;
}
.color-dot--on::after {
  content: '';
  position: absolute;
  top: -3px;
  right: -3px;
  bottom: -3px;
  left: -3px;
  border-radius: 50%;
  border: 2px solid var(--text-1);
}
.preview-box {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 16px 14px;
}
.preview-box__left {
  display: flex;
  align-items: center;
  gap: 8px;
}
.preview-box__time {
  font-size: 13px;
  color: var(--text-2);
}
.preview-box__label {
  font-size: 13px;
  color: var(--text-3);
}
.opt-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 8px;
  padding: 2px 0 6px;
}
.opt-grid--time {
  grid-template-columns: repeat(4, 1fr);
  gap: 6px;
}
.opt-item {
  height: 32px;
  border-radius: 8px;
  background: var(--surface-2);
  color: var(--text-1);
  font-size: 13px;
  display: flex;
  align-items: center;
  justify-content: center;
}
.opt-item--on {
  background: var(--primary);
  color: #ffffff;
  font-weight: 500;
}
</style>