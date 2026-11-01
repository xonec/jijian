<template>
  <page-frame title="云备份" back>
    <view v-if="!logged" class="card login-hero mt10">
      <view class="login-hero__ico">
        <ri-icon name="cloud3" :size="34" />
      </view>
      <text class="login-hero__title">登录后使用云备份</text>
      <text class="login-hero__sub">登录账号后，排班快照会保存在 uniCloud 数据库，换设备登录同一账号即可恢复全部数据</text>
      <view class="btn btn--soft login-hero__btn" @click="goLogin">去登录</view>
    </view>

    <view v-else class="card account mt10">
      <view class="account__avatar">
        <ri-icon name="user" :size="22" />
      </view>
      <view class="account__main">
        <text class="account__name">{{ accountName }}</text>
        <text class="account__sub">云备份账号 · 数据按账号隔离</text>
      </view>
      <text class="tag tag--ok">已登录</text>
    </view>

    <view class="btn btn--primary mt14" @click="doBackup">
      <ri-icon name="cloud" :size="18" />
      <text>全量备份</text>
    </view>

    <view class="group-title group-title--row">
      <text>云备份列表</text>
      <text v-if="list.length" class="group-title__num">共 {{ list.length }} 份</text>
    </view>

    <view v-if="loading" class="empty">正在读取云备份…</view>
    <view v-else-if="!list.length" class="empty">暂无云备份数据</view>

    <view v-for="item in list" :key="item._id" class="card bk">
      <view class="bk__head">
        <view class="bk__ico">
          <ri-icon name="cloud3" :size="20" />
        </view>
        <view class="bk__main">
          <text class="bk__name">{{ item.name }}</text>
          <view class="bk__meta">
            <text class="bk__meta-t">备份日期: {{ fmtDate(item.created_at) }}</text>
            <text class="bk__meta-t">数据容量: {{ item.size || 0 }} 条</text>
          </view>
        </view>
        <text class="tag tag--cloud">{{ sourceLabel(item) }}</text>
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

    <view v-if="list.length" class="btn btn--danger-text mt6" @click="clearAll">清空备份</view>

    <view class="hint">云端快照存于 uniCloud 数据库 jy_backup 集合，换设备登录同一账号即可恢复。</view>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import api, { userId } from '@/services/api.js'
import { goPage, goTab, toast } from '@/composables/use-nav.js'

const list = ref([])
const loading = ref(true)
const logged = ref(false)
const account = ref({})

const accountName = computed(() => {
  const u = account.value || {}
  return u.nickname || u.username || '已登录用户'
})

function pad2(n) {
  return n < 10 ? '0' + n : String(n)
}

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

function sourceLabel(item) {
  return item && item.scope === 'cloud' ? '云端' : '本地'
}

function refreshAuth() {
  logged.value = !!userId()
  try {
    account.value = uni.getStorageSync('uni_id_user') || {}
  } catch (e) {
    account.value = {}
  }
}

async function loadList() {
  loading.value = true
  try {
    const arr = await api.backup.list('cloud')
    list.value = (arr || []).slice().sort((a, b) => tsOf(b.created_at) - tsOf(a.created_at))
  } catch (e) {
    list.value = []
    toast('读取云备份失败，请检查网络')
  }
  loading.value = false
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

function goLogin() {
  goPage('login')
}

async function doBackup() {
  if (!logged.value) {
    const ok = await confirmModal({
      title: '提示',
      content: '当前未登录，云备份会暂存在当前设备；登录同一账号后可在其他设备恢复。是否继续备份？',
      confirmText: '继续备份',
      cancelText: '取消'
    })
    if (!ok) return
  }
  uni.showLoading({ title: '备份中…', mask: true })
  try {
    await api.backup.create({ name: '全量备份 ' + fmtDate(Date.now()), scope: 'cloud' })
    await loadList()
    hideLoadingSafe()
    toast('云备份成功')
  } catch (e) {
    hideLoadingSafe()
    toast((e && e.message) || '云备份失败，请重试')
  }
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

async function clearAll() {
  if (!list.value.length) return
  const ok = await confirmModal({
    title: '清空备份',
    content: '确定要清空全部 ' + list.value.length + ' 份云备份吗？清空后无法恢复',
    confirmText: '清空',
    confirmColor: '#F87679'
  })
  if (!ok) return
  uni.showLoading({ title: '清空中…', mask: true })
  try {
    const items = list.value.slice()
    for (const it of items) await api.backup.remove(it._id)
    await loadList()
    hideLoadingSafe()
    toast('已清空备份')
  } catch (e) {
    hideLoadingSafe()
    toast((e && e.message) || '清空失败，请重试')
  }
}

/* 从登录页返回时刷新登录态与列表 */
onShow(() => {
  refreshAuth()
  loadList()
})
</script>

<style lang="scss" scoped>
.login-hero {
  padding: 22px 16px 18px;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.login-hero__ico {
  width: 62px;
  height: 62px;
  border-radius: 50%;
  background: rgba(85, 187, 138, 0.13);
  color: var(--primary);
  display: flex;
  align-items: center;
  justify-content: center;
}
.login-hero__title {
  font-size: 16px;
  font-weight: 600;
  color: var(--text-1);
  margin-top: 12px;
}
.login-hero__sub {
  font-size: 12px;
  line-height: 1.6;
  color: var(--text-3);
  text-align: center;
  margin-top: 6px;
  padding: 0 8px;
}
.login-hero__btn {
  height: 40px;
  font-size: 15px;
  margin-top: 16px;
}

.account {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 16px 14px;
}
.account__avatar {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  flex: none;
  background: var(--surface-2);
  color: var(--text-3);
  display: flex;
  align-items: center;
  justify-content: center;
}
.account__main {
  flex: 1;
  min-width: 0;
}
.account__name {
  display: block;
  font-size: 16px;
  font-weight: 500;
  color: var(--text-1);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
.account__sub {
  display: block;
  font-size: 11.5px;
  color: var(--text-3);
  margin-top: 3px;
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
</style>
