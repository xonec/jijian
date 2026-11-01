<template>
  <page-frame title="云备份账号" back>
    <template #header-right>
      <view class="header-add" @click="addAccount">
        <ri-icon name="add" :size="16" />
        <text class="header-add__text">添加</text>
      </view>
    </template>

    <view v-if="loading" class="empty">加载中…</view>

    <view v-else-if="accounts.length" class="account-list">
      <view
        v-for="a in accounts"
        :key="accountId(a)"
        class="account"
        @click="editAccount(a)"
      >
        <view class="account__top">
          <view class="account__logo">
            <image class="account__logo-img" :src="logoOf(a.platform)" mode="aspectFit" />
          </view>
          <view class="account__info">
            <view class="account__title">
              <text class="account__platform">{{ platformName(a.platform) }}</text>
              <text class="tag" :class="{ 'tag--ok': a.status === 'connected' }">{{ statusText(a) }}</text>
            </view>
            <text class="account__remark">{{ remarkOf(a) }}</text>
          </view>
          <text class="account__view" @click.stop="openFiles(a)">查看</text>
        </view>
        <view class="account__foot">
          <ri-icon name="cloud2" :size="12" class="account__node-icon" />
          <text class="account__node">主节点</text>
          <text class="account__path">{{ a.path || '/' }}</text>
        </view>
      </view>
    </view>

    <view v-else class="empty empty--col">
      <ri-icon name="cloud" :size="32" class="empty__icon" />
      <text class="empty__text">暂无云备份账号</text>
      <text class="empty__link" @click="addAccount">添加云备份账号</text>
    </view>

    <view class="hint">推荐使用坚果云，注册后在安全选项添加应用密码</view>
  </page-frame>
</template>

<script setup>
import { ref } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { WEBDAV_PLATFORMS } from '@/services/local-db.js'
import { goPage, toast } from '@/composables/use-nav.js'

const LOGOS = {
  jianguoyun: '/static/cloud/jgy.png',
  koofr: '/static/cloud/koofr.png'
}

const accounts = ref([])
const loading = ref(false)

onShow(() => {
  loadAccounts()
})

async function loadAccounts() {
  loading.value = true
  try {
    const list = await api.webdav.accounts()
    accounts.value = Array.isArray(list) ? list : []
  } catch (e) {
    accounts.value = []
    toast(errorMessage(e))
  } finally {
    loading.value = false
  }
}

function accountId(a) {
  return a._id || a.id || a.username || ''
}

function platformName(key) {
  const item = WEBDAV_PLATFORMS.find((p) => p.key === key)
  return item ? item.name : '自定义'
}

function logoOf(key) {
  return LOGOS[key] || '/static/cloud/cloud.png'
}

function statusText(a) {
  return a.status === 'connected' ? '已连接' : '已断开'
}

function remarkOf(a) {
  return a.name || a.username || '未填写备注'
}

function addAccount() {
  goPage('webdav-edit')
}

function editAccount(a) {
  const id = accountId(a)
  if (!id) return
  uni.navigateTo({ url: '/pages/sub/webdav-edit/index?id=' + encodeURIComponent(id) })
}

function openFiles(a) {
  const id = accountId(a)
  if (!id) return
  uni.navigateTo({ url: '/pages/sub/webdav-files/index?accountId=' + encodeURIComponent(id) })
}

function errorMessage(e) {
  if (!e) return '加载云备份账号失败'
  return e.message || e.errMsg || e.msg || '加载云备份账号失败'
}
</script>

<style lang="scss" scoped>
.header-add {
  display: flex;
  align-items: center;
  gap: 2px;
  color: var(--primary);
  padding: 6px 0 6px 10px;
}
.header-add__text {
  font-size: 14px;
}
.account-list {
  padding-top: 2px;
}
.account {
  background: var(--surface);
  border-radius: var(--r-card);
  padding: 14px 14px 0;
  margin-top: 10px;
  overflow: hidden;
}
.account:active {
  background: var(--surface-2);
}
.account__top {
  display: flex;
  align-items: center;
  gap: 11px;
  padding-bottom: 12px;
}
.account__logo {
  width: 38px;
  height: 38px;
  border-radius: 10px;
  background: var(--surface-2);
  display: flex;
  align-items: center;
  justify-content: center;
  flex: none;
  overflow: hidden;
}
.account__logo-img {
  width: 26px;
  height: 26px;
}
.account__info {
  flex: 1;
  min-width: 0;
}
.account__title {
  display: flex;
  align-items: center;
  gap: 7px;
}
.account__platform {
  font-size: 15px;
  font-weight: 500;
  color: var(--text-1);
  white-space: nowrap;
}
.account__remark {
  display: block;
  font-size: 12.5px;
  color: var(--text-3);
  margin-top: 3px;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.account__view {
  flex: none;
  font-size: 13px;
  color: var(--primary);
  padding: 6px 0 6px 10px;
}
.account__foot {
  display: flex;
  align-items: center;
  gap: 5px;
  padding: 9px 0 11px;
  border-top: 1px solid var(--line);
}
.account__node-icon {
  color: var(--text-3);
}
.account__node {
  font-size: 11px;
  color: var(--text-3);
}
.account__path {
  font-size: 11.5px;
  color: var(--text-2);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.empty--col {
  flex-direction: column;
  gap: 7px;
  padding: 46px 0 34px;
}
.empty__icon {
  color: var(--text-3);
  opacity: 0.7;
}
.empty__text {
  font-size: 13px;
  color: var(--text-3);
}
.empty__link {
  font-size: 13px;
  color: var(--primary);
  padding: 6px 10px;
}
</style>
