<template>
  <page-frame title="我的文件" back>
    <template #header-right>
      <view class="header__icon" @click="loadFiles">
        <ri-icon name="refresh" :size="19" />
      </view>
    </template>

    <view class="path-bar">
      <view class="path-bar__main" @click="goRoot">
        <ri-icon name="folder" :size="15" class="path-bar__icon" />
        <text class="path-bar__text">{{ path === '/' ? '根目录' : path }}</text>
      </view>
      <text v-if="path !== '/'" class="path-bar__up" @click="goParent">返回上级</text>
    </view>

    <view v-if="!accountId" class="empty">缺少云备份账号</view>
    <view v-else-if="loading" class="empty">加载中…</view>
    <view v-else-if="files.length" class="file-list">
      <view v-for="f in files" :key="f.path || f.name" class="file-item">
        <view class="file-row" @click="openItem(f)">
          <view class="file-row__icon" :class="{ 'file-row__icon--dir': f.type === 'dir' }">
            <ri-icon :name="f.type === 'dir' ? 'folder' : 'file'" :size="20" />
          </view>
          <view class="file-row__info">
            <text class="file-row__name">{{ f.name }}</text>
            <text class="file-row__meta">{{ metaOf(f) }}</text>
          </view>
          <ri-icon v-if="f.type === 'dir'" name="arrow_right" :size="15" class="file-row__chev" />
        </view>
        <view v-if="f.type !== 'dir'" class="file-ops">
          <text class="file-op" @click.stop="downloadAndRestore(f)">
            {{ busyFile === f.path ? '下载中…' : '下载并还原' }}
          </text>
          <text class="file-op file-op--danger" @click.stop="removeFile(f)">删除</text>
        </view>
      </view>
    </view>
    <view v-else class="empty">此目录暂无文件</view>

    <view class="btn btn--primary mt14" :class="{ 'btn--busy': uploading }" @click="uploadBackup">
      {{ uploading ? '正在上传…' : '上传当前排班备份' }}
    </view>
    <view class="hint">WebDAV 文件保存在你自己的网盘，不占用 uniCloud 空间</view>
  </page-frame>
</template>

<script setup>
import { ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { applyBootstrap } from '@/composables/use-store.js'
import { toast } from '@/composables/use-nav.js'

const accountId = ref('')
const path = ref('/')
const files = ref([])
const loading = ref(false)
const uploading = ref(false)
const busyFile = ref('')

onLoad((options) => {
  accountId.value = options && options.accountId ? String(options.accountId) : ''
  if (!accountId.value) {
    toast('缺少云备份账号')
    return
  }
  loadFiles()
})

async function loadFiles() {
  if (!accountId.value) return
  loading.value = true
  try {
    const list = await api.webdav.files({ accountId: accountId.value, path: path.value })
    files.value = Array.isArray(list) ? list : []
  } catch (e) {
    files.value = []
    toast(errorMessage(e))
  } finally {
    loading.value = false
  }
}

function openItem(f) {
  if (!f || f.type !== 'dir') return
  path.value = normalizePath(f.path || joinPath(path.value, f.name))
  loadFiles()
}

function goParent() {
  if (path.value === '/') return
  const index = path.value.lastIndexOf('/')
  path.value = index <= 0 ? '/' : path.value.slice(0, index)
  loadFiles()
}

function goRoot() {
  if (path.value === '/') return
  path.value = '/'
  loadFiles()
}

async function uploadBackup() {
  if (uploading.value) return
  if (!accountId.value) {
    toast('缺少云备份账号')
    return
  }
  uploading.value = true
  try {
    const backup = await api.backup.create({
      name: '排班备份-' + stampNow(),
      scope: 'local'
    })
    if (!backup || !backup.snapshot) throw new Error('创建本地备份失败')
    await api.webdav.upload({
      accountId: accountId.value,
      path: path.value,
      snapshot: backup.snapshot
    })
    toast('已上传到网盘')
    await loadFiles()
  } catch (e) {
    toast(errorMessage(e))
  } finally {
    uploading.value = false
  }
}

function downloadAndRestore(f) {
  if (busyFile.value) return
  busyFile.value = f.path
  api.webdav.download({ accountId: accountId.value, path: f.path })
    .then((res) => {
      const snapshot = res && res.snapshot ? res.snapshot : null
      const count = countSnapshot(snapshot)
      uni.showModal({
        title: '下载并还原',
        content: snapshot
          ? '已下载「' + f.name + '」，包含 ' + count + ' 条排班数据。是否还原到当前排班？'
          : '已下载「' + f.name + '」。',
        confirmText: snapshot ? '还原' : '知道了',
        confirmColor: '#55BB8A',
        showCancel: !!snapshot,
        success: (r) => {
          if (!r.confirm) return
          if (snapshot) {
            restoreSnapshot(snapshot)
          } else {
            toast('已恢复')
          }
        }
      })
    })
    .catch((e) => {
      toast(errorMessage(e))
    })
    .finally(() => {
      busyFile.value = ''
    })
}

async function restoreSnapshot(snapshot) {
  try {
    const list = (v) => (Array.isArray(v) ? v : [])
    for (const s of list(snapshot.shifts)) {
      await api.saveShift({ ...s })
    }
    for (const d of list(snapshot.schedule)) {
      await api.setDay({
        date: d.date,
        workId: d.workId || '',
        secondWorkId: d.secondWorkId || '',
        remark: d.remark || ''
      })
    }
    let currentAlarms = []
    try {
      currentAlarms = (await api.fetchAlarms()) || []
    } catch (e) {
      currentAlarms = []
    }
    const alarmIdMap = {}
    currentAlarms.forEach((a) => {
      if (a._id) alarmIdMap[a._id] = a._id
      if (a.id) alarmIdMap[a.id] = a._id || a.id
    })
    for (const a of list(snapshot.alarms)) {
      const payload = { ...a }
      const match = alarmIdMap[payload._id] || alarmIdMap[payload.id]
      if (match) payload._id = match
      else delete payload._id
      await api.saveAlarm(payload)
    }
    for (const p of list(snapshot.projects)) {
      await api.saveProject({ ...p })
    }
    if (snapshot.config) await api.saveConfig(snapshot.config)
    toast('已恢复')
    try {
      const db = await api.bootstrap()
      applyBootstrap(db)
    } catch (e) {}
    loadFiles()
  } catch (e) {
    toast('还原失败：' + errorMessage(e))
  }
}

function removeFile(f) {
  uni.showModal({
    title: '删除文件',
    content: '确定删除「' + f.name + '」？此操作会同时删除网盘中的文件。',
    confirmText: '删除',
    confirmColor: '#F87679',
    success: async (r) => {
      if (!r.confirm) return
      try {
        await api.webdav.removeFile({ accountId: accountId.value, path: f.path })
        toast('已删除')
        loadFiles()
      } catch (e) {
        toast(errorMessage(e))
      }
    }
  })
}

function countSnapshot(snapshot) {
  if (!snapshot) return 0
  return ['shifts', 'schedule', 'alarms', 'projects'].reduce((total, key) => {
    return total + (Array.isArray(snapshot[key]) ? snapshot[key].length : 0)
  }, 0)
}

function metaOf(f) {
  if (f.type === 'dir') return '文件夹'
  const parts = []
  const size = formatSize(f.size)
  if (size) parts.push(size)
  const time = formatTime(f.modified || f.created_at)
  if (time) parts.push(time)
  return parts.join(' · ') || '文件'
}

function formatSize(value) {
  if (value === undefined || value === null || value === '') return ''
  const size = Number(value)
  if (!isFinite(size) || size < 0) return ''
  if (size < 1024) return size + ' B'
  if (size < 1024 * 1024) return (size / 1024).toFixed(1) + ' KB'
  return (size / 1024 / 1024).toFixed(1) + ' MB'
}

function formatTime(value) {
  if (value === undefined || value === null || value === '') return ''
  let date
  if (typeof value === 'number') {
    date = new Date(value)
  } else {
    const text = String(value)
    const num = Number(text)
    date = isFinite(num) && text.trim() !== '' ? new Date(num) : new Date(text)
  }
  if (isNaN(date.getTime())) return String(value)
  const pad = (n) => String(n).padStart(2, '0')
  return date.getFullYear() + '-' + pad(date.getMonth() + 1) + '-' + pad(date.getDate()) +
    ' ' + pad(date.getHours()) + ':' + pad(date.getMinutes())
}

function normalizePath(value) {
  let p = String(value || '/').trim()
  if (!p) p = '/'
  if (p.charAt(0) !== '/') p = '/' + p
  p = p.replace(/\/{2,}/g, '/')
  if (p.length > 1) p = p.replace(/\/+$/, '')
  return p || '/'
}

function joinPath(dir, name) {
  return normalizePath((dir === '/' ? '' : dir) + '/' + name)
}

function stampNow() {
  const now = new Date()
  const pad = (n) => String(n).padStart(2, '0')
  return now.getFullYear() + pad(now.getMonth() + 1) + pad(now.getDate()) + '-' +
    pad(now.getHours()) + pad(now.getMinutes())
}

function errorMessage(e) {
  if (!e) return '操作失败，请重试'
  return e.message || e.errMsg || e.msg || '操作失败，请重试'
}
</script>

<style lang="scss" scoped>
.path-bar {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 2px 2px 0;
}
.path-bar__main {
  display: flex;
  align-items: center;
  gap: 6px;
  flex: 1;
  min-width: 0;
  padding: 4px 0;
}
.path-bar__icon {
  flex: none;
  color: var(--primary);
}
.path-bar__text {
  font-size: 12.5px;
  color: var(--text-2);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.path-bar__up {
  flex: none;
  font-size: 12.5px;
  color: var(--primary);
  padding: 4px 2px 4px 8px;
}
.file-list {
  padding-top: 2px;
}
.file-item {
  background: var(--surface);
  border-radius: var(--r-card);
  margin-top: 10px;
  overflow: hidden;
}
.file-row {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 12px 14px;
}
.file-row:active {
  background: var(--surface-2);
}
.file-row__icon {
  width: 36px;
  height: 36px;
  border-radius: 10px;
  background: var(--surface-2);
  display: flex;
  align-items: center;
  justify-content: center;
  flex: none;
  color: var(--text-2);
}
.file-row__icon--dir {
  color: var(--primary);
  background: rgba(85, 187, 138, 0.12);
}
.file-row__info {
  flex: 1;
  min-width: 0;
}
.file-row__name {
  display: block;
  font-size: 14.5px;
  color: var(--text-1);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.file-row__meta {
  display: block;
  font-size: 11.5px;
  color: var(--text-3);
  margin-top: 3px;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.file-row__chev {
  flex: none;
  color: var(--text-3);
  opacity: 0.8;
}
.file-ops {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 16px;
  margin: 0 14px;
  padding: 8px 0;
  border-top: 1px solid var(--line);
}
.file-op {
  font-size: 12.5px;
  color: var(--primary);
  padding: 2px 0;
}
.file-op--danger {
  color: var(--delete);
}
.btn--busy {
  opacity: 0.6;
}
</style>
