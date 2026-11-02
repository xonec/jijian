<template>
  <page-frame title="申请加入团队" back>
    <view class="group-title group-title--first">团队信息</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">邀请码</text>
        <input v-model="form.inviteCode" class="form-input" maxlength="12" placeholder="请输入邀请码" />
      </view>
    </view>

    <view class="group-title">申请资料</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">真实姓名 <text class="req">*</text></text>
        <input v-model="form.realName" class="form-input" maxlength="30" placeholder="必填" />
      </view>
      <view class="form-row">
        <text class="form-row__k">工号 <text class="req">*</text></text>
        <input v-model="form.employeeNo" class="form-input" maxlength="40" placeholder="必填" />
      </view>
      <view class="form-row">
        <text class="form-row__k">手机号</text>
        <input v-model="form.phone" class="form-input" type="number" maxlength="20" placeholder="选填" />
      </view>
      <view class="form-row">
        <text class="form-row__k">申请备注</text>
        <input v-model="form.message" class="form-input" maxlength="100" placeholder="选填" />
      </view>
    </view>

    <view class="hint">真实姓名和工号必填，手机号选填。管理员审批通过后即可加入团队。</view>
    <view class="btn btn--primary mt14" :class="{ 'btn--disabled': submitting }" @click="submit">{{ submitting ? '提交中…' : '提交申请' }}</view>
  </page-frame>
</template>

<script setup>
import { reactive, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { back, toast } from '@/composables/use-nav.js'

const form = reactive({ inviteCode: '', realName: '', employeeNo: '', phone: '', message: '' })
const submitting = ref(false)
const user = uni.getStorageSync('uni_id_user') || {}

function validPhone(v) {
  if (!v) return true
  return /^[0-9+\-\s]{6,20}$/.test(v)
}

async function submit() {
  if (submitting.value) return
  const code = form.inviteCode.trim().toUpperCase()
  const realName = form.realName.trim()
  const employeeNo = form.employeeNo.trim()
  if (!code) return toast('请输入邀请码')
  if (!realName) return toast('请填写真实姓名')
  if (!employeeNo) return toast('请填写工号')
  if (!validPhone(form.phone.trim())) return toast('手机号格式不正确')
  submitting.value = true
  try {
    const res = await api.team.join({
      inviteCode: code,
      nickname: user.nickname || user.username || '',
      realName,
      employeeNo,
      phone: form.phone.trim(),
      message: form.message.trim()
    })
    if (res && res.status === 'pending') {
      uni.showModal({ title: '申请已提交', content: '等待管理员审批，通过后即可加入团队。', showCancel: false, success: () => back() })
    } else if (res && res.status === 'active') {
      toast(res.restored ? '已恢复成员身份' : '已加入团队')
      setTimeout(() => back(), 400)
    }
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '申请失败')
  } finally {
    submitting.value = false
  }
}

onLoad((o) => {
  if (o && o.code) form.inviteCode = o.code
})
</script>

<style lang="scss" scoped>
.req { color: var(--delete); font-size: 12px; }
.btn--disabled { opacity: 0.6; }
</style>
