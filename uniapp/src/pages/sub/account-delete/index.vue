<template>
  <page-frame title="注销账号" back>
    <view class="warning">
      <text class="warning__title">注销后将永久删除</text>
      <text class="warning__item">• 账号、昵称、登录凭证</text>
      <text class="warning__item">• 个人班次、排班、提醒、项目、备份</text>
      <text class="warning__item">• 团队成员关系、团队排班、通知</text>
      <text class="warning__item">• 云备份、WebDAV 账号与密码</text>
      <text class="warning__hint">创建者如果团队还有其他成员，需先转让或解散团队。删除后不可恢复。</text>
    </view>

    <view class="group-title">身份确认</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">当前密码</text>
        <input v-model="form.password" class="form-input" :password="true" maxlength="64" placeholder="请输入当前账号密码" />
      </view>
      <view class="form-row">
        <text class="form-row__k">确认文字</text>
        <input v-model="form.confirm" class="form-input" maxlength="10" placeholder="请输入：注销账号" />
      </view>
    </view>

    <view class="btn btn--danger mt14" @click="submit">确认注销并删除数据</view>
    <view class="hint">该操作会立即失效当前账号的所有登录凭证。</view>
  </page-frame>
</template>

<script setup>
import { reactive, ref } from 'vue'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const form = reactive({ password: '', confirm: '' })
const submitting = ref(false)
const expected = '注销账号'

async function submit() {
  if (submitting.value) return
  if (!form.password) return toast('请输入当前账号密码')
  if (form.confirm !== expected) return toast('请输入“注销账号”确认')
  submitting.value = true
  try {
    await api.auth.deleteAccount({ password: form.password, confirm: form.confirm })
    uni.removeStorageSync('uni_id_token')
    uni.removeStorageSync('uni_id_user')
    uni.showModal({
      title: '账号已注销',
      content: '账号及个人数据已删除。',
      showCancel: false,
      success: () => uni.reLaunch({ url: '/pages/setting/index' })
    })
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '注销失败')
  } finally {
    submitting.value = false
  }
}
</script>

<style lang="scss" scoped>
.warning {
  margin-top: 12px;
  padding: 16px;
  border-radius: var(--r-card);
  background: rgba(248, 118, 121, 0.08);
  border: 1px solid rgba(248, 118, 121, 0.22);
}
.warning__title { display: block; font-size: 15px; font-weight: 600; color: var(--delete); margin-bottom: 8px; }
.warning__item { display: block; font-size: 12px; color: var(--text-2); line-height: 1.9; }
.warning__hint { display: block; margin-top: 8px; font-size: 11px; color: var(--text-3); line-height: 1.6; }
</style>
