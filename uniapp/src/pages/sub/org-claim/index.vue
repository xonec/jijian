<template>
  <page-frame title="认领员工" back>
    <view class="card intro">
      <text class="intro__t">加入公司并关联员工档案</text>
      <text class="intro__s">向公司管理员获取邀请码，输入姓名和工号，认领后即可查看公司全部排班和统计。</text>
    </view>
    <view class="form-card">
      <view class="form-row"><text class="form-row__k">邀请码</text><input v-model="form.inviteCode" class="form-input" maxlength="12" placeholder="公司邀请码" /></view>
      <view class="form-row"><text class="form-row__k">姓名</text><input v-model="form.name" class="form-input" maxlength="30" placeholder="员工姓名" /></view>
      <view class="form-row"><text class="form-row__k">工号</text><input v-model="form.employeeNo" class="form-input" maxlength="40" placeholder="工号（同名时必填）" /></view>
    </view>
    <view class="btn btn--primary mt14" :class="{ 'btn--busy': loading }" @click="submit">{{ loading ? '认领中…' : '认领员工' }}</view>
    <view class="hint">认领后账号会和员工档案绑定；一个员工只能被一个账号认领。</view>
  </page-frame>
</template>

<script setup>
import { reactive, ref } from 'vue'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const form = reactive({ inviteCode: '', name: '', employeeNo: '' })
const loading = ref(false)
async function submit() {
  if (loading.value) return
  if (!form.inviteCode.trim()) return toast('请输入邀请码')
  if (!form.name.trim()) return toast('请输入姓名')
  loading.value = true
  try {
    const res = await api.org.claimCompany({ inviteCode: form.inviteCode.trim(), name: form.name.trim(), employeeNo: form.employeeNo.trim() })
    toast('认领成功')
    setTimeout(() => goPage('org-company', { id: res.companyId }), 350)
  } catch (e) { toast((e && (e.message || e.errMsg)) || '认领失败') } finally { loading.value = false }
}
</script>

<style lang="scss" scoped>
.intro { padding: 16px; }
.intro__t { display: block; font-size: 15px; color: var(--text-1); margin-bottom: 6px; }
.intro__s { display: block; font-size: 12px; color: var(--text-3); line-height: 1.6; }
</style>
