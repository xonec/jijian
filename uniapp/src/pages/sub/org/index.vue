<template>
  <page-frame title="组织排班" back>
    <view v-if="!isLogin" class="empty">
      <text class="empty__t">登录后使用组织排班</text>
      <view class="btn btn--primary mt14" @click="goLogin">去登录</view>
    </view>
    <template v-else>
      <view class="actions">
        <view class="action" @click="createCompany">
          <ri-icon name="add" :size="18" />
          <text>创建公司</text>
        </view>
      </view>

      <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
      <view v-else-if="!companies.length" class="empty">
        <text class="empty__t">还没有公司</text>
        <text class="empty__s">创建公司后，可以建立部门并导入排班</text>
      </view>
      <view v-else class="list">
        <view v-for="c in companies" :key="c._id" class="card company" @click="open(c)">
          <view class="company__main">
            <text class="company__name">{{ c.name }}</text>
            <text class="company__sub">{{ roleText(c.role) }}</text>
          </view>
          <ri-icon name="arrow_right" :size="15" class="gray" />
        </view>
      </view>
      <view class="hint">公司 → 部门/班组 → 员工。排班从 Excel/CSV 导入，导入即生效。</view>
    </template>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const companies = ref([])
const loading = ref(false)
const user = ref(null)
const isLogin = computed(() => !!(user.value && (user.value._id || user.value.username)))
function roleText(role) { return role === 'owner' ? '创建者' : role === 'admin' ? '管理员' : '成员' }
function goLogin() { goPage('login') }
function open(c) { goPage('org-company', { id: c._id }) }
async function load() {
  user.value = uni.getStorageSync('uni_id_user') || null
  if (!isLogin.value) return
  loading.value = true
  try { companies.value = (await api.org.listCompanies())?.list || [] } catch (e) { toast((e && (e.message || e.errMsg)) || '加载失败') } finally { loading.value = false }
}
function createCompany() {
  uni.showModal({
    title: '创建公司',
    editable: true,
    placeholderText: '请输入公司名称',
    success: async (r) => {
      if (!r.confirm) return
      const name = String(r.content || '').trim()
      if (!name) return toast('请输入公司名称')
      try {
        const res = await api.org.createCompany({ name })
        toast('公司已创建')
        goPage('org-company', { id: res.companyId })
      } catch (e) { toast((e && (e.message || e.errMsg)) || '创建失败') }
    }
  })
}
onShow(load)
</script>

<style lang="scss" scoped>
.actions { display: flex; gap: 10px; padding: 6px 0 2px; }
.action { flex: 1; height: 44px; border-radius: var(--r-card); background: var(--surface); display: flex; align-items: center; justify-content: center; gap: 6px; font-size: 14px; color: var(--primary); }
.company { display: flex; align-items: center; gap: 10px; padding: 16px; margin-top: 10px; }
.company__main { flex: 1; min-width: 0; }
.company__name { display: block; font-size: 15px; color: var(--text-1); }
.company__sub { display: block; margin-top: 4px; font-size: 11px; color: var(--text-3); }
.empty__s { display: block; margin-top: 6px; font-size: 12px; color: var(--text-3); }
</style>
