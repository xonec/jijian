<template>
  <page-frame title="本地备份与恢复" back>
    <view class="card mt10">
      <view class="form-row">
        <text class="form-row__k">保存方式</text>
        <text class="form-row__v form-row__v--muted">应用私有 + 系统文件</text>
      </view>
      <view class="dir-row">
        <view class="dir-row__ico">
          <ri-icon name="folder" :size="18" />
        </view>
        <view class="dir-row__main">
          <text class="dir-row__t">系统文件保存</text>
          <text class="dir-row__s">每次一键备份后会弹出系统保存位置，可选择 Download、网盘或文件管理器中的目录。仅 Android App 支持。</text>
        </view>
      </view>
    </view>

    <view class="btn btn--primary mt14" @click="openCreate">
      <ri-icon name="download" :size="18" />
      <text>一键备份</text>
    </view>
    <view class="btn btn--accent-text mt6" @click="goCloud">
      <ri-icon name="cloud3" :size="16" />
      <text>云备份 · 多设备同步</text>
    </view>

    <view class="group-title group-title--row">
      <text>备份列表</text>
      <text v-if="list.length" class="group-title__num">共 {{ list.length }} 份</text>
    </view>

    <view v-if="loading" class="empty">正在读取备份…</view>
    <view v-else-if="!list.length" class="empty">暂无本地备份数据</view>

    <view v-for="item in list" :key="item._id" class="card bk">
      <view class="bk__head">
        <view class="bk__ico">
          <ri-icon name="cloud" :size="20" />
        </view>
        <view class="bk__main">
          <text class="bk__name">{{ item.name }}</text>
          <view class="bk__meta">
            <text class="bk__meta-t">备份日期: {{ fmtDate(item.created_at) }}</text>
            <text class="bk__meta-t">数据容量: {{ item.size || 0 }} 条</text>
          </view>
        </view>
        <text class="tag" :class="sourceTagClass(item)">{{ sourceLabel(item) }}</text>
      </view>
      <view class="bk__ops">
        <view class="bk__op" @click="onRestore(item)">
          <ri-icon name="refresh" :size="15" class="bk__op-ico" />
          <text>还原</text>
        </view>
        <view class="bk__op bk__op--danger" @click="onRemove(item)">
          <ri-icon name="delete_bin" :size="15" class="bk__op-ico" />
          <text>删除</text>
        </view>
      </view>
    </view>

    <view class="hint">本地备份保存在应用私有目录；一键备份成功后可选择系统文件位置，卸载 App 也能找回导出的 JSON 文件。</view>

    <app-dialog
      :visible="createVisible"
      title="一键备份"
      text="请输入备份名称，方便日后还原时识别"
      @close="createVisible = false"
    >
      <input
        v-model="backupName"
        class="dialog-input"
        type="text"
        maxlength="30"
        :placeholder="defaultName"
        :placeholder-style="placeholderStyle"
      />
      <template #actions>
        <view class="btn btn--ghost dialog-btn" @click="createVisible = false">取消</view>
        <view class="btn btn--primary dialog-btn" @click="doCreate">开始备份</view>
      </template>
    </app-dialog>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, goTab, toast } from '@/composables/use-nav.js'
import { exportBackupFile, isSupported } from '@/services/backup-dir.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const list = ref([])
const loading = ref(true)
const createVisible = ref(false)
const backupName = ref('')

function pad2(n) {
  return n < 10 ? '0' + n : String(n)
}

/* 兼容 number 时间戳 / ISO 字符串 / Date（云端 timestamp 与本地毫秒数都能格式化） */
function toDate(v) {
  if (v instanceof Date) return v
  if (typeof v === 'number') return new Date(v)
  if (typeof v === 'string') {
    if (/^\d+$/.test(v)) return new Date(Number(v))
    const d = new Date(v.replace(/-/g, '/').replace('T', ' '))
    if (!isNaN(d.getTime())) return d
    return new Date(v)
  }
  return new Date()
}

function fmtDate(v) {
  const d = toDate(v)
  if (isNaN(d.getTime())) return '--'
  return (
    d.getFullYear() +
    '-' +
    pad2(d.getMonth() + 1) +
    '-' +
    pad2(d.getDate()) +
    ' ' +
    pad2(d.getHours()) +
    ':' +
    pad2(d.getMinutes())
  )
}

function tsOf(v) {
  const d = toDate(v)
  return isNaN(d.getTime()) ? 0 : d.getTime()
}

const defaultName = computed(() => '备份 ' + fmtDate(Date.now()))
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))

function sourceLabel(item) {
  return item && item.scope === 'cloud' ? '云端' : '本地'
}
function sourceTagClass(item) {
  return item && item.scope === 'cloud' ? 'tag--cloud' : 'tag--ok'
}

async function loadList() {
  loading.value = true
  try {
    const arr = await api.backup.list('local')
    list.value = (arr || []).slice().sort((a, b) => tsOf(b.created_at) - tsOf(a.created_at))
  } catch (e) {
    list.value = []
    toast('读取备份列表失败')
  }
  loading.value = false
}

function openCreate() {
  backupName.value = defaultName.value
  createVisible.value = true
}

function hideLoadingSafe() {
  try {
    uni.hideLoading()
  } catch (e) {}
}

function confirmModal(options) {
  return new Promise((resolve) => {
    uni.showModal(
      Object.assign({}, options, {
        success: (res) => resolve(!!res.confirm),
        fail: () => resolve(false)
      })
    )
  })
}

async function doCreate() {
  const name = String(backupName.value || '').trim() || defaultName.value
  createVisible.value = false
  uni.showLoading({ title: '备份中…', mask: true })
  try {
    const item = await api.backup.create({ name, scope: 'local' })
    let extra = ''
    if (isSupported()) {
      try {
        const r = await exportBackupFile(item)
        if (r && r.status === 'success') extra = '，已保存到系统文件'
      } catch (e) {
        extra = '，系统文件保存未完成'
      }
    }
    await loadList()
    hideLoadingSafe()
    toast('备份成功' + extra)
  } catch (e) {
    hideLoadingSafe()
    toast((e && e.message) || '备份失败，请重试')
  }
}

function goCloud() {
  goPage('cloud')
}

async function onRestore(item) {
  const ok = await confirmModal({
    title: '还原备份',
    content:
      '确定用「' + (item.name || '该备份') + '」覆盖当前排班数据吗？还原后需要重启 App 或刷新首页才能看到最新数据。',
    confirmText: '还原',
    confirmColor: '#55BB8A'
  })
  if (!ok) return
  uni.showLoading({ title: '还原中…', mask: true })
  try {
    const res = await api.backup.restore(item._id)
    await loadList()
    hideLoadingSafe()
    const restored = (res && res.restored) || item.size || 0
    const goHome = await confirmModal({
      title: '还原成功',
      content: '已恢复 ' + restored + ' 条数据，需要刷新首页后生效。',
      confirmText: '刷新首页',
      cancelText: '稍后'
    })
    if (goHome) goTab('home')
  } catch (e) {
    hideLoadingSafe()
    toast((e && e.message) || '还原失败，请重试')
  }
}

async function onRemove(item) {
  const ok = await confirmModal({
    title: '删除备份',
    content: '确定要删除此备份',
    confirmText: '删除',
    confirmColor: '#F87679'
  })
  if (!ok) return
  try {
    await api.backup.remove(item._id)
    await loadList()
    toast('已删除备份')
  } catch (e) {
    toast((e && e.message) || '删除失败，请重试')
  }
}

onLoad(() => {
  loadList()
})
</script>

<style lang="scss" scoped>
.dir-row {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 12px 14px 14px;
  position: relative;
}
.dir-row::before {
  content: '';
  position: absolute;
  top: 0;
  left: 14px;
  right: 0;
  height: 1px;
  background: var(--line);
}
.dir-row:active {
  background: var(--surface-2);
}
.dir-row__ico {
  width: 34px;
  height: 34px;
  border-radius: 10px;
  background: rgba(85, 187, 138, 0.13);
  color: var(--primary);
  display: flex;
  align-items: center;
  justify-content: center;
  flex: none;
}
.dir-row__main {
  flex: 1;
  min-width: 0;
}
.dir-row__t {
  display: block;
  font-size: 14px;
  color: var(--primary);
}
.dir-row__s {
  display: block;
  font-size: 11.5px;
  line-height: 1.45;
  color: var(--text-3);
  margin-top: 3px;
}
.dir-clear {
  padding: 0 14px 12px;
  font-size: 12px;
  color: var(--delete);
  text-align: right;
}
.dir-row__chev {
  flex: none;
  color: var(--text-3);
  opacity: 0.8;
}

.group-title--row {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
}
.group-title__num {
  font-size: 11px;
  color: var(--text-3);
}

.bk {
  margin-top: 10px;
}
.bk__head {
  display: flex;
  align-items: flex-start;
  gap: 10px;
  padding: 14px 14px 10px;
}
.bk__ico {
  width: 36px;
  height: 36px;
  border-radius: 10px;
  flex: none;
  background: var(--surface-2);
  color: var(--text-2);
  display: flex;
  align-items: center;
  justify-content: center;
}
.bk__main {
  flex: 1;
  min-width: 0;
}
.bk__name {
  display: block;
  font-size: 15px;
  font-weight: 500;
  color: var(--text-1);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
.bk__meta {
  display: flex;
  flex-wrap: wrap;
  gap: 2px 12px;
  margin-top: 4px;
}
.bk__meta-t {
  font-size: 11.5px;
  color: var(--text-3);
  font-variant-numeric: tabular-nums;
}
.bk__ops {
  display: flex;
  justify-content: flex-end;
  gap: 8px;
  padding: 6px 12px 8px;
  border-top: 1px solid var(--line);
}
.bk__op {
  display: flex;
  align-items: center;
  gap: 4px;
  height: 30px;
  padding: 0 12px;
  border-radius: 8px;
  font-size: 13px;
  color: var(--text-2);
  background: var(--surface-2);
}
.bk__op:active {
  opacity: 0.72;
}
.bk__op-ico {
  color: var(--text-2);
}
.bk__op--danger {
  color: var(--delete);
  background: rgba(248, 118, 121, 0.12);
}
.bk__op--danger .bk__op-ico {
  color: var(--delete);
}
.tag--cloud {
  color: var(--link);
  background: rgba(25, 116, 232, 0.12);
}
.dialog-btn {
  height: 40px;
  font-size: 15px;
}
</style>
