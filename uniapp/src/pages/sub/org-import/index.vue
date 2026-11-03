<template>
  <page-frame title="导入排班" back>
    <view class="form-card">
      <view class="form-row" @click="pickDepartment">
        <text class="form-row__k">部门</text>
        <text class="form-row__v">{{ departmentName || '请选择部门' }} ›</text>
      </view>
      <view class="form-row">
        <text class="form-row__k">日期</text>
        <picker mode="date" :value="date" @change="onDateChange">
          <text class="form-row__v">{{ date }} ›</text>
        </picker>
      </view>
    </view>

    <view class="file-box" @click="pickFile">
      <ri-icon name="folder" :size="26" />
      <text class="file-box__t">{{ fileLabel || '选择 Excel 或 CSV 文件' }}</text>
      <text class="file-box__s">一份文件应对应一天 + 一个部门</text>
    </view>

    <view v-if="preview" class="card preview">
      <view class="preview__head">
        <text class="preview__title">预览</text>
        <text class="preview__date">{{ preview.date }}</text>
      </view>
      <view class="metrics">
        <view class="metric"><text class="metric__n">{{ preview.counts.rows }}</text><text class="metric__l">工序</text></view>
        <view class="metric"><text class="metric__n">{{ preview.counts.people }}</text><text class="metric__l">人员</text></view>
        <view class="metric"><text class="metric__n">{{ preview.counts.assignments }}</text><text class="metric__l">班次记录</text></view>
      </view>
      <view v-if="preview.missing.length" class="warn">
        <text class="warn__t">新增员工 {{ preview.missing.length }} 人</text>
        <text class="warn__s">{{ preview.missing.slice(0, 8).join('、') }}{{ preview.missing.length > 8 ? ' 等' : '' }}</text>
      </view>
      <view v-if="preview.duplicates.length" class="warn warn--danger">
        <text class="warn__t">重名需要人工确认 {{ preview.duplicates.length }} 人</text>
        <text class="warn__s">{{ preview.duplicates.slice(0, 8).join('、') }}</text>
      </view>
      <view v-if="preview.warnings.length" class="warn">
        <text class="warn__t">数据提醒 {{ preview.warnings.length }} 条</text>
        <text v-for="(w, i) in preview.warnings.slice(0, 4)" :key="i" class="warn__s">第 {{ w.row }} 行：{{ w.message }}</text>
      </view>
      <view class="preview__list">
        <view v-for="(e, i) in preview.entries.slice(0, 6)" :key="i" class="preview-row">
          <text class="preview-row__p">{{ e.processName }}</text>
          <text class="preview-row__s">{{ shiftText(e) }}</text>
        </view>
      </view>
    </view>

    <view v-if="preview" class="btn btn--primary mt14" :class="{ 'btn--busy': importing }" @click="confirmImport">{{ importing ? '导入中…' : '确认导入，立即生效' }}</view>
    <view class="hint">导入后会覆盖同部门同日期现有排班；支持 8 小时/12 小时制和请假/休息行。员工可由排班表自动建档。</view>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const companyId = ref('')
const departmentId = ref('')
const departments = ref([])
const date = ref(new Date().toISOString().slice(0, 10))
const fileName = ref('')
const base64 = ref('')
const preview = ref(null)
const importing = ref(false)
const departmentName = computed(() => {
  const d = departments.value.find((x) => x._id === departmentId.value)
  return d ? d.name : ''
})
const fileLabel = computed(() => fileName.value)
function onDateChange(e) { date.value = e.detail.value; preview.value = null }
function pickDepartment() {
  const items = departments.value.map((d) => d.name)
  if (!items.length) return toast('请先在电脑/小程序创建部门')
  uni.showActionSheet({ itemList: items, success: (r) => { departmentId.value = departments.value[r.tapIndex]._id; preview.value = null } })
}
function shiftText(e) {
  const m = {}
  ;(e.assignments || []).forEach((a) => { m[a.shiftName] = (m[a.shiftName] ? m[a.shiftName] + '、' : '') + a.employeeName })
  return Object.keys(m).map((k) => k + '：' + m[k]).join('  ')
}
function pickFile() {
  // #ifdef MP-WEIXIN
  uni.chooseMessageFile({
    count: 1,
    type: 'file',
    extension: ['xlsx', 'xls', 'csv'],
    success: async (r) => {
      const f = (r.tempFiles || [])[0]
      if (!f) return
      const fs = uni.getFileSystemManager()
      fs.readFile({
        filePath: f.path,
        encoding: 'base64',
        success: async (rr) => {
          fileName.value = f.name || '排班表.xlsx'
          base64.value = rr.data || ''
          await doPreview()
        },
        fail: () => toast('读取文件失败')
      })
    }
  })
  // #endif
  // #ifdef H5
  const input = document.createElement('input')
  input.type = 'file'
  input.accept = '.xlsx,.xls,.csv'
  input.onchange = () => {
    const f = input.files && input.files[0]
    if (!f) return
    const reader = new FileReader()
    reader.onload = async () => {
      const raw = String(reader.result || '')
      base64.value = raw.slice(raw.indexOf(',') + 1)
      fileName.value = f.name
      await doPreview()
    }
    reader.readAsDataURL(f)
  }
  input.click()
  // #endif
  // #ifdef APP-PLUS
  try {
    const input = document.createElement('input')
    input.type = 'file'
    input.accept = '.xlsx,.xls,.csv'
    input.onchange = () => {
      const f = input.files && input.files[0]
      if (!f) return
      const reader = new FileReader()
      reader.onload = async () => {
        const raw = String(reader.result || '')
        base64.value = raw.slice(raw.indexOf(',') + 1)
        fileName.value = f.name
        await doPreview()
      }
      reader.readAsDataURL(f)
    }
    input.click()
  } catch (e) {
    toast('当前设备无法打开文件选择器，请用微信小程序导入')
  }
  // #endif
}
async function doPreview() {
  if (!companyId.value || !departmentId.value) return toast('请选择部门')
  if (!base64.value) return
  try {
    uni.showLoading({ title: '解析中' })
    preview.value = await api.org.previewImport({ companyId: companyId.value, departmentId: departmentId.value, date: date.value, fileName: fileName.value, base64: base64.value })
  } catch (e) { toast((e && (e.message || e.errMsg)) || '解析失败') } finally { uni.hideLoading() }
}
async function confirmImport() {
  if (!preview.value || importing.value) return
  importing.value = true
  try {
    const res = await api.org.importSchedule({ companyId: companyId.value, departmentId: departmentId.value, date: preview.value.date, fileName: fileName.value, base64: base64.value })
    toast('导入成功')
    setTimeout(() => goPage('org-board', { companyId: companyId.value, departmentId: departmentId.value, date: preview.value.date }), 350)
  } catch (e) { toast((e && (e.message || e.errMsg)) || '导入失败') } finally { importing.value = false }
}
async function load() {
  try {
    const d = await api.org.companyDetail({ companyId: companyId.value })
    departments.value = d.departments || []
    if (!departmentId.value || !departments.value.some((x) => x._id === departmentId.value)) departmentId.value = departments.value[0]?._id || ''
  } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') }
}
onLoad((o) => { companyId.value = (o && o.companyId) || ''; departmentId.value = (o && o.departmentId) || ''; load() })
</script>

<style lang="scss" scoped>
.form-row__v { font-size: 13px; color: var(--text-2); }
.file-box { margin-top: 14px; border-radius: var(--r-card); background: var(--surface); padding: 26px 16px; display: flex; flex-direction: column; align-items: center; gap: 5px; color: var(--primary); }
.file-box__t { font-size: 14px; }
.file-box__s { font-size: 11px; color: var(--text-3); }
.preview { margin-top: 14px; padding: 16px; }
.preview__head { display: flex; justify-content: space-between; align-items: center; }
.preview__title { font-size: 15px; color: var(--text-1); }
.preview__date { font-size: 12px; color: var(--text-3); }
.metrics { display: flex; gap: 8px; margin-top: 14px; }
.metric { flex: 1; background: var(--surface-2); border-radius: 10px; padding: 10px 8px; text-align: center; }
.metric__n { display: block; font-size: 18px; color: var(--primary); font-weight: 600; }
.metric__l { display: block; margin-top: 2px; font-size: 10px; color: var(--text-3); }
.warn { margin-top: 12px; padding: 10px 12px; background: var(--warning-soft); border-radius: 10px; }
.warn--danger { background: var(--danger-soft); }
.warn__t { display: block; font-size: 12px; color: var(--text-1); }
.warn__s { display: block; margin-top: 3px; font-size: 11px; color: var(--text-2); line-height: 1.5; }
.preview__list { margin-top: 12px; border-top: 1px solid var(--line); }
.preview-row { display: flex; gap: 10px; padding: 8px 0; border-bottom: 1px solid var(--line); }
.preview-row:last-child { border-bottom: 0; }
.preview-row__p { width: 100px; font-size: 12px; color: var(--text-1); flex-shrink: 0; }
.preview-row__s { flex: 1; font-size: 11px; color: var(--text-3); overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
</style>
