<template>
  <page-frame title="我的信息" back>
    <view class="card mt10">
      <view class="user-row">
        <view class="avatar avatar--sm">
          <ri-icon name="user" :size="18" />
        </view>
        <view class="user-row__main">
          <text class="user-row__label">{{ displayName }}</text>
          <text class="user-row__sub">{{ isLogin ? '账号：' + userInfo.username : '登录后可同步会员状态与反馈记录' }}</text>
        </view>
        <text class="user-row__value">{{ isLogin ? '普通用户' : '未登录' }}</text>
      </view>
      <view class="user-divider" />
      <cell-row icon="vip" label="会员有效期" value="未开通" />
    </view>

    <view class="group-title">其他信息</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">昵称</text>
        <input
          v-model="form.nick"
          class="form-input"
          type="text"
          maxlength="20"
          placeholder="请输入昵称"
          :placeholder-style="placeholderStyle"
        />
      </view>
      <view class="form-row">
        <text class="form-row__k">微信</text>
        <input
          v-model="form.wechat"
          class="form-input"
          type="text"
          maxlength="24"
          placeholder="选填"
          :placeholder-style="placeholderStyle"
        />
      </view>
      <view class="form-row">
        <text class="form-row__k">城市</text>
        <input
          v-model="form.city"
          class="form-input"
          type="text"
          maxlength="12"
          placeholder="选填"
          :placeholder-style="placeholderStyle"
        />
      </view>
    </view>

    <view v-if="isLogin" class="btn btn--primary mt14" @click="saveInfo">保存</view>
    <view v-else class="btn btn--primary mt14" @click="goLogin">登录或注册</view>
    <view v-if="isLogin" class="btn btn--accent-text mt6" @click="goWxBind">微信小程序绑定</view>
    <view v-if="isLogin" class="btn btn--danger-text mt6" @click="logout">退出登录</view>
    <view v-if="isLogin" class="btn btn--danger-text mt6" @click="goDelete">注销账号并删除数据</view>
    <view class="hint">登录账号仅用于记录用户付费状态，如果需要对数据进行云备份，请自行绑定第三方云备份账号。</view>
  </page-frame>
</template>

<script setup>
import { reactive, computed, ref } from 'vue'
import { toast, goPage } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'
import api from '@/services/api.js'

const { theme } = useTheme()
const form = reactive({ nick: '', wechat: '', city: '' })
const userInfo = ref(uni.getStorageSync('uni_id_user') || null)
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))
const isLogin = computed(() => !!(userInfo.value && (userInfo.value._id || userInfo.value.username)))
const displayName = computed(() => {
  if (!isLogin.value) return '未登录'
  return userInfo.value.nickname || userInfo.value.username
})

async function refresh() {
  try {
    const cached = uni.getStorageSync('uni_id_user') || null
    if (cached) userInfo.value = cached
    if (isLogin.value) {
      const res = await api.auth.getInfo()
      if (res && res.userInfo) {
        userInfo.value = res.userInfo
        uni.setStorageSync('uni_id_user', res.userInfo)
      }
      form.nick = userInfo.value.nickname || ''
    }
  } catch (e) {
    // 未登录或 token 失效：回到未登录态
    userInfo.value = null
  }
}

function goWxBind() {
  goPage('wx-bind-code')
}

function goDelete() {
  goPage('account-delete')
}

function goLogin() {
  goPage('login')
}

async function saveInfo() {
  if (!isLogin.value) {
    toast('请先登录')
    return
  }
  try {
    const res = await api.auth.updateInfo({ nickname: form.nick })
    if (res && res.userInfo) {
      userInfo.value = res.userInfo
      uni.setStorageSync('uni_id_user', res.userInfo)
    }
    toast('已保存')
  } catch (e) {
    toast(e.message || '保存失败')
  }
}

async function logout() {
  uni.showModal({
    title: '退出登录',
    content: '退出登录会导致当前设备的会员身份丢失喔，请问还要继续退出吗？',
    success: async (r) => {
      if (!r.confirm) return
      try {
        await api.auth.logout()
      } catch (e) {}
      uni.removeStorageSync('uni_id_token')
      uni.removeStorageSync('uni_id_user')
      userInfo.value = null
      toast('已退出登录')
      setTimeout(() => uni.reLaunch({ url: '/pages/setting/index' }), 600)
    }
  })
}

defineExpose({ refresh })
import { onShow } from '@dcloudio/uni-app'
onShow(() => refresh())
</script>

<style lang="scss" scoped>
.user-row {
  display: flex;
  align-items: center;
  gap: 10px;
  min-height: 54px;
  padding: 8px 14px;
}
.user-row__main {
  flex: 1;
  display: flex;
  flex-direction: column;
}
.avatar--sm {
  width: 38px;
  height: 38px;
  font-size: 18px;
}
.user-row__label {
  font-size: 15px;
  color: var(--text-1);
}
.user-row__sub {
  font-size: 11.5px;
  color: var(--text-3);
  margin-top: 2px;
}
.user-row__value {
  font-size: 14px;
  color: var(--text-3);
}
.user-divider {
  height: 1px;
  background: var(--line);
  margin-left: 14px;
}
</style>
