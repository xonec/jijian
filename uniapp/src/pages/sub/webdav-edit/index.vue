<template>
  <page-frame :title="pageTitle" back>
    <view v-if="loading" class="empty">加载中…</view>

    <view v-else class="edit-body">
      <view class="group-title group-title--first">选择云备份平台</view>
      <view class="platforms">
        <view
          v-for="p in platforms"
          :key="p.key"
          class="platform"
          :class="{ 'platform--on': form.platform === p.key }"
          @click="pickPlatform(p)"
        >
          <image class="platform__logo" :src="logoOf(p.key)" mode="aspectFit" />
          <text class="platform__name">{{ p.name }}</text>
        </view>
      </view>

      <view class="group-title">账号信息</view>
      <view class="form-card">
        <view class="form-row">
          <text class="form-row__k">账号备注</text>
          <input
            v-model="form.name"
            class="form-input"
            type="text"
            maxlength="24"
            placeholder="选填"
            :placeholder-style="placeholderStyle"
          />
        </view>
        <view class="form-row form-row--url">
          <text class="form-row__k">地址</text>
          <input
            v-model="form.baseUrl"
            class="form-input form-input--url"
            type="text"
            maxlength="200"
            placeholder="https://"
            :placeholder-style="placeholderStyle"
          />
        </view>
        <view class="form-row">
          <text class="form-row__k">用户名</text>
          <input
            v-model="form.username"
            class="form-input"
            type="text"
            maxlength="80"
            placeholder="WebDAV 账号"
            :placeholder-style="placeholderStyle"
          />
        </view>
        <view class="form-row">
          <text class="form-row__k">密码</text>
          <input
            v-model="form.password"
            class="form-input"
            type="password"
            maxlength="100"
            :placeholder="passwordPlaceholder"
            :placeholder-style="placeholderStyle"
          />
        </view>
        <view class="form-row">
          <text class="form-row__k">根路径</text>
          <input
            v-model="form.path"
            class="form-input"
            type="text"
            maxlength="120"
            placeholder="/"
            :placeholder-style="placeholderStyle"
          />
        </view>
      </view>

      <view class="btn btn--soft mt14" :class="{ 'btn--busy': testing }" @click="testConnection">
        {{ testing ? '正在测试连接…' : '测试连接' }}
      </view>
      <view class="btn btn--primary mt10" :class="{ 'btn--busy': saving }" @click="save">
        {{ saving ? '保存中…' : '保存' }}
      </view>
      <view v-if="isEdit" class="btn btn--danger-text delete-btn" @click="confirmDelete">删除账号</view>

      <view class="hint">平台提示：{{ platformTip }}</view>
      <view class="hint">云备份账号只用于访问你自己的网盘。密码在云端使用 AES-256-GCM 加密保存；本地模式下仅保存在本机。</view>
    </view>
  </page-frame>
</template>

<script setup>
import { ref, reactive, computed } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { WEBDAV_PLATFORMS } from '@/services/local-db.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const platforms = WEBDAV_PLATFORMS
const LOGOS = {
  jianguoyun: '/static/cloud/jgy.png',
  koofr: '/static/cloud/koofr.png'
}

const firstPlatform = platforms[0] || { key: 'custom', url: '' }
const form = reactive({
  platform: firstPlatform.key,
  name: '',
  baseUrl: firstPlatform.url || '',
  username: '',
  password: '',
  path: '/'
})

const editId = ref('')
const loading = ref(false)
const testing = ref(false)
const saving = ref(false)
const hasStoredPassword = ref(false)
const baseline = ref('')

const isEdit = computed(() => !!editId.value)
const pageTitle = computed(() => (isEdit.value ? '编辑云备份' : '添加云备份'))
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const passwordPlaceholder = computed(() => (isEdit.value ? '不修改请留空' : '应用密码'))
const currentPlatform = computed(() => platforms.find((p) => p.key === form.platform) || null)
const platformTip = computed(() => {
  return (currentPlatform.value && currentPlatform.value.tip) || '填写完整的 WebDAV 根地址'
})

onLoad(async (options) => {
  const id = options && options.id ? String(options.id) : ''
  if (!id) return
  editId.value = id
  loading.value = true
  try {
    const list = await api.webdav.accounts()
    const account = (Array.isArray(list) ? list : []).find((x) => (x._id || x.id) === id)
    if (!account) {
      toast('云备份账号不存在')
      setTimeout(() => back(), 500)
      return
    }
    form.platform = account.platform || 'custom'
    form.name = account.name || ''
    form.baseUrl = account.baseUrl || ''
    form.username = account.username || ''
    form.path = account.path || '/'
    hasStoredPassword.value = !!(account.hasPassword || account.password)
    baseline.value = fingerprint(buildPayload())
  } catch (e) {
    toast(errorMessage(e))
  } finally {
    loading.value = false
  }
})

function normalizePath(value) {
  let path = String(value || '/').trim()
  if (!path) path = '/'
  if (path.charAt(0) !== '/') path = '/' + path
  path = path.replace(/\/{2,}/g, '/')
  if (path.length > 1) path = path.replace(/\/+$/, '')
  return path || '/'
}

function buildPayload() {
  const payload = {
    platform: form.platform,
    name: String(form.name || '').trim(),
    baseUrl: String(form.baseUrl || '').trim(),
    username: String(form.username || '').trim(),
    path: normalizePath(form.path)
  }
  if (isEdit.value) payload._id = editId.value
  if (form.password) payload.password = form.password
  return payload
}

function fingerprint(payload) {
  return JSON.stringify({
    platform: payload.platform,
    name: payload.name,
    baseUrl: payload.baseUrl,
    username: payload.username,
    path: payload.path,
    password: payload.password ? 'set' : ''
  })
}

function validate() {
  if (!form.platform) {
    toast('请选择云备份平台')
    return false
  }
  const baseUrl = String(form.baseUrl || '').trim()
  if (!baseUrl) {
    toast('请填写 WebDAV 地址')
    return false
  }
  if (!/^https?:\/\//i.test(baseUrl)) {
    toast('地址需以 http:// 或 https:// 开头')
    return false
  }
  if (!String(form.username || '').trim()) {
    toast('请填写用户名')
    return false
  }
  if (!hasStoredPassword.value && !form.password) {
    toast('请填写密码')
    return false
  }
  return true
}

async function persistCurrent() {
  const saved = await api.webdav.saveAccount(buildPayload())
  const savedId = saved && (saved._id || saved.id)
  if (savedId) editId.value = savedId
  if (form.password || (saved && saved.hasPassword)) hasStoredPassword.value = true
  form.password = ''
  baseline.value = fingerprint(buildPayload())
  return saved
}

function pickPlatform(p) {
  if (!p || form.platform === p.key) return
  form.platform = p.key
  form.baseUrl = p.url || ''
}

function logoOf(key) {
  return LOGOS[key] || '/static/cloud/cloud.png'
}

async function testConnection() {
  if (testing.value) return
  if (!isEdit.value) {
    toast('请先保存账号后再测试连接')
    return
  }
  if (!validate()) return
  testing.value = true
  try {
    if (fingerprint(buildPayload()) !== baseline.value) await persistCurrent()
    const res = await api.webdav.testAccount(editId.value)
    toast(res && res.latency ? '连接成功（' + res.latency + 'ms）' : '连接成功')
  } catch (e) {
    toast(errorMessage(e))
  } finally {
    testing.value = false
  }
}

async function save() {
  if (saving.value) return
  if (!validate()) return
  saving.value = true
  try {
    await persistCurrent()
    toast('已保存')
    setTimeout(() => back(), 300)
  } catch (e) {
    toast(errorMessage(e))
  } finally {
    saving.value = false
  }
}

function confirmDelete() {
  if (!isEdit.value) return
  uni.showModal({
    title: '删除账号',
    content: '删除后不会移除网盘中的备份文件，确定删除该云备份账号？',
    confirmText: '删除',
    confirmColor: '#F87679',
    success: async (res) => {
      if (!res.confirm) return
      try {
        await api.webdav.removeAccount(editId.value)
        toast('已删除')
        setTimeout(() => back(), 300)
      } catch (e) {
        toast(errorMessage(e))
      }
    }
  })
}

function errorMessage(e) {
  if (!e) return '操作失败，请重试'
  return e.message || e.errMsg || e.msg || '操作失败，请重试'
}
</script>

<style lang="scss" scoped>
.edit-body {
  padding-bottom: 4px;
}
.group-title--first {
  padding-top: 0;
}
.platforms {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  padding: 2px 0 4px;
}
.platform {
  display: flex;
  align-items: center;
  gap: 6px;
  height: 36px;
  padding: 0 12px 0 9px;
  border-radius: 10px;
  background: var(--surface);
  border: 1.5px solid transparent;
}
.platform--on {
  background: rgba(85, 187, 138, 0.12);
  border-color: var(--primary);
}
.platform__logo {
  width: 18px;
  height: 18px;
  flex: none;
}
.platform__name {
  font-size: 13px;
  color: var(--text-1);
}
.platform--on .platform__name {
  color: var(--primary);
  font-weight: 500;
}
.form-row--url .form-row__k {
  flex: none;
  width: 42px;
}
.form-row--url .form-input {
  margin-left: 8px;
}
.form-input--url {
  font-size: 13px;
}
.btn--busy {
  opacity: 0.6;
}
.delete-btn {
  margin-top: 4px;
}
</style>
