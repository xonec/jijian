<template>
  <page-frame title="绑定微信账号" back>
    <view class="card intro">
      <text class="intro__t">微信已登录，但还没有关联排班账号</text>
      <text class="intro__s">绑定后，小程序一键登录和安卓 App 账号密码登录会进入同一个账号，排班和团队数据保持一致。</text>
    </view>

    <view class="seg-row">
      <seg-tabs v-model="mode" :items="tabs" />
    </view>

    <view v-if="mode === 'password'" class="form-card">
      <view class="form-row"><text class="form-row__k">账号</text><input v-model="form.username" class="form-input" placeholder="安卓 App 账号" maxlength="32" /></view>
      <view class="form-row"><text class="form-row__k">密码</text><input v-model="form.password" class="form-input" :password="true" placeholder="账号密码" maxlength="64" /></view>
    </view>

    <view v-else-if="mode === 'code'" class="form-card">
      <view class="form-row"><text class="form-row__k">绑定码</text><input v-model="form.code" class="form-input" type="number" maxlength="6" placeholder="安卓 App 中生成的 6 位绑定码" /></view>
      <view class="hint">在安卓 App：我的信息 → 微信小程序绑定，生成 6 位绑定码，5 分钟内有效。</view>
    </view>

    <view v-else class="form-card">
      <view class="form-row"><text class="form-row__k">昵称</text><input v-model="form.nickname" class="form-input" maxlength="20" placeholder="创建新账号的昵称" /></view>
      <view class="hint">如果没有安卓 App 账号，可以创建一个新的排班账号。</view>
    </view>

    <view class="btn btn--primary mt14" :class="{ 'btn--busy': loading }" @click="submit">{{ loading ? '处理中…' : submitLabel }}</view>
    <view class="switch-link" @click="cancel">暂不绑定，返回登录</view>
  </page-frame>
</template>

<script setup>
import { computed, reactive, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import { back, goPage, toast } from '@/composables/use-nav.js'
import { bindWxByPassword, bindWxByCode, createWxAccount } from '@/composables/use-auth.js'

const TICKET_KEY = 'jy_wx_bind_ticket'
const ticket = ref('')
const mode = ref('password')
const loading = ref(false)
const form = reactive({ username: '', password: '', code: '', nickname: '' })
const tabs = [
  { key: 'password', label: '绑定已有账号' },
  { key: 'code', label: '使用绑定码' },
  { key: 'create', label: '创建新账号' }
]
const submitLabel = computed(() => (mode.value === 'password' ? '绑定并登录' : mode.value === 'code' ? '使用绑定码绑定' : '创建并登录'))

function cancel() {
  try { uni.removeStorageSync(TICKET_KEY) } catch (e) {}
  back()
}

async function submit() {
  if (loading.value) return
  if (!ticket.value) return toast('绑定会话已失效，请重新微信登录')
  loading.value = true
  try {
    if (mode.value === 'password') {
      if (!form.username.trim() || !form.password) { toast('请输入账号和密码'); loading.value = false; return }
      await bindWxByPassword({ bindTicket: ticket.value, username: form.username.trim(), password: form.password })
    } else if (mode.value === 'code') {
      if (!/^[0-9]{6}$/.test(form.code)) { toast('请输入 6 位绑定码'); loading.value = false; return }
      await bindWxByCode({ bindTicket: ticket.value, code: form.code })
    } else {
      await createWxAccount({ bindTicket: ticket.value, nickname: form.nickname.trim() })
    }
    try { uni.removeStorageSync(TICKET_KEY) } catch (e) {}
    toast('绑定成功')
    setTimeout(() => back(), 350)
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '绑定失败')
  } finally {
    loading.value = false
  }
}

onLoad(() => {
  try { ticket.value = uni.getStorageSync(TICKET_KEY) || '' } catch (e) {}
  if (!ticket.value) toast('绑定会话已失效，请重新微信登录')
})
</script>

<style lang="scss" scoped>
.intro { padding: 16px; }
.intro__t { display: block; font-size: 15px; color: var(--text-1); margin-bottom: 6px; }
.intro__s { display: block; font-size: 12px; line-height: 1.6; color: var(--text-3); }
</style>
