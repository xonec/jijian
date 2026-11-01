<template>
  <page-frame title="登录" back>
    <!-- 已登录：显示当前账号，可退出 -->
    <template v-if="auth.isLogin">
      <view class="card mt14">
        <view class="me-row">
          <view class="avatar">
            <ri-icon name="user" :size="22" />
          </view>
          <view class="me-main">
            <text class="me-name">{{ displayName }}</text>
            <text class="me-sub">账号：{{ (auth.userInfo && auth.userInfo.username) || '-' }}</text>
          </view>
          <text class="tag tag--ok">已登录</text>
        </view>
        <view class="divider" />
        <cell-row icon="vip" label="会员状态" value="普通用户" />
      </view>

      <view class="btn btn--primary mt14" @click="back">返回</view>
      <view class="btn btn--danger-text mt6" @click="onLogout">退出登录</view>
      <view class="hint">
        登录账号仅用于绑定付费状态与反馈；排班数据默认保存在本机，换机请使用「本地备份与恢复」或「云备份」。
      </view>
    </template>

    <!-- 未登录：登录 / 注册 -->
    <template v-else>
      <view class="auth-hero">
        <view class="auth-badge">
          <ri-icon name="user" :size="30" />
        </view>
        <text class="auth-title">{{ mode === 'login' ? '登录极简排班' : '注册极简排班账号' }}</text>
        <text class="auth-sub">账号仅用于绑定付费状态与反馈</text>
      </view>

      <view class="seg-row">
        <seg-tabs v-model="mode" :items="tabs" />
      </view>

      <view class="card auth-form">
        <view class="form-row">
          <text class="form-row__k">账号</text>
          <input
            v-model="form.username"
            class="form-input"
            type="text"
            maxlength="32"
            placeholder="请输入账号"
            :placeholder-style="placeholderStyle"
            @confirm="submit"
          />
        </view>
        <view class="form-row">
          <text class="form-row__k">密码</text>
          <input
            v-model="form.password"
            class="form-input"
            :password="true"
            maxlength="64"
            placeholder="请输入密码（至少 6 位）"
            :placeholder-style="placeholderStyle"
            @confirm="submit"
          />
        </view>
        <view v-if="mode === 'register'" class="form-row">
          <text class="form-row__k">确认密码</text>
          <input
            v-model="form.confirm"
            class="form-input"
            :password="true"
            maxlength="64"
            placeholder="请再次输入密码"
            :placeholder-style="placeholderStyle"
            @confirm="submit"
          />
        </view>
      </view>

      <view class="btn btn--primary mt14" :class="{ 'btn--busy': loading }" @click="submit">
        {{ loading ? (mode === 'login' ? '登录中…' : '注册中…') : submitLabel }}
      </view>
      <view class="switch-link" @click="switchMode">
        {{ mode === 'login' ? '还没有账号？立即注册' : '已有账号？返回登录' }}
      </view>

      <view class="hint">
        账号仅用于绑定付费状态与反馈意见，不会上传您的排班数据；排班数据默认保存在本机，换机请使用「本地备份与恢复」或「云备份」。
      </view>
    </template>
  </page-frame>
</template>

<script setup>
import { reactive, ref, computed, watch, onUnmounted } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import { useAuth } from '@/composables/use-auth.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { auth, syncFromStorage, login, register, logout } = useAuth()
const { theme } = useTheme()

const tabs = [
  { key: 'login', label: '登录' },
  { key: 'register', label: '注册' }
]

const mode = ref('login')
const loading = ref(false)
const form = reactive({ username: '', password: '', confirm: '' })
let backTimer = null

onUnmounted(() => {
  if (backTimer) clearTimeout(backTimer)
})

const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const submitLabel = computed(() => (mode.value === 'login' ? '登录' : '注册'))
const displayName = computed(() => {
  const u = auth.userInfo || {}
  return u.nickname || u.username || '已登录用户'
})

watch(mode, () => {
  form.password = ''
  form.confirm = ''
})

onShow(() => {
  // 其他页面可能直接改了 storage（如 user-detail 退出登录），进入本页时同步一次
  syncFromStorage()
})

function switchMode() {
  mode.value = mode.value === 'login' ? 'register' : 'login'
}

async function submit() {
  if (loading.value) return
  const username = form.username.trim()
  if (!username) return toast('请输入账号')
  if (username.length < 3) return toast('账号长度不能少于 3 位')
  if (!form.password) return toast('请输入密码')
  if (form.password.length < 6) return toast('密码长度不能少于 6 位')
  if (mode.value === 'register' && form.password !== form.confirm) {
    return toast('两次输入的密码不一致')
  }
  loading.value = true
  try {
    if (mode.value === 'login') {
      await login({ username, password: form.password })
      toast('登录成功')
    } else {
      await register({ username, password: form.password, nickname: username })
      toast('注册成功')
    }
    backTimer = setTimeout(() => back(), 350)
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '操作失败，请重试')
  } finally {
    loading.value = false
  }
}

function onLogout() {
  uni.showModal({
    title: '退出登录',
    content: '退出登录后本机将回到游客模式，请问还要继续退出吗？',
    success: async (r) => {
      if (!r.confirm) return
      await logout()
      toast('已退出登录')
    }
  })
}
</script>

<style lang="scss" scoped>
.auth-hero {
  padding: 30px 8px 2px;
  text-align: center;
}
.auth-badge {
  width: 64px;
  height: 64px;
  border-radius: 50%;
  background: var(--surface);
  color: var(--primary);
  display: flex;
  align-items: center;
  justify-content: center;
  margin: 0 auto 12px;
}
.auth-title {
  display: block;
  font-size: 20px;
  font-weight: 600;
  color: var(--text-1);
}
.auth-sub {
  display: block;
  font-size: 12.5px;
  color: var(--text-3);
  margin-top: 6px;
}
.seg-row {
  display: flex;
  justify-content: center;
  padding: 16px 0 12px;
}
.auth-form {
  margin-top: 0;
}
.btn--busy {
  opacity: 0.65;
}
.switch-link {
  text-align: center;
  font-size: 13px;
  color: var(--primary);
  padding: 14px 0 2px;
}
.me-row {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 16px 14px;
}
.me-main {
  flex: 1;
  display: flex;
  flex-direction: column;
  min-width: 0;
}
.me-name {
  font-size: 16px;
  font-weight: 500;
  color: var(--text-1);
}
.me-sub {
  font-size: 12px;
  color: var(--text-3);
  margin-top: 3px;
}
</style>
