<template>
  <page-frame title="团队详情" back>
    <view v-if="loading" class="empty">加载中…</view>
    <template v-else-if="team">
      <view class="card">
        <view class="head">
          <view>
            <text class="head__name">{{ team.name }}</text>
            <text class="head__sub">{{ roleText(role) }} · {{ memberCount }} 人</text>
          </view>
          <text v-if="role === 'owner' || role === 'admin'" class="head__code" @click="copyCode">邀请码 {{ team.inviteCode }}</text>
        </view>
      </view>

      <view v-if="isAdmin" class="card mt10">
        <view class="section-row" @click="loadPending">
          <text class="section-title">加入申请</text>
          <text class="section-extra">{{ pending.length ? pending.length + ' 条待审批' : '暂无待审批' }}</text>
        </view>
        <view v-for="req in pending" :key="req._id" class="request">
          <view class="request__main">
            <text class="request__name">{{ req.realName || req.nickname || '成员' }}</text>
            <text class="request__sub">{{ req.employeeNo || '无工号' }} · {{ req.phone || '未填手机' }}</text>
          </view>
          <view class="request__ops">
            <text class="request__ok" @click="approve(req)">通过</text>
            <text class="request__no" @click="reject(req)">拒绝</text>
          </view>
        </view>
      </view>

      <view class="group-title">成员</view>
      <view class="card">
        <view v-for="m in members" :key="m._id" class="member" @click="editMember(m)">
          <view class="member__avatar">{{ (m.realName || m.nickname || '?').slice(0, 1) }}</view>
          <view class="member__main">
            <text class="member__name">{{ m.realName || m.nickname || '未命名' }}</text>
            <text class="member__sub">{{ roleText(m.role) }}<template v-if="m.employeeNo"> · 工号 {{ m.employeeNo }}</template></text>
          </view>
          <text v-if="m.phone" class="member__phone">{{ m.phone }}</text>
          <text v-else-if="m.phoneHidden" class="member__phone">本人设置，不可见</text>
        </view>
      </view>

      <view class="team-links">
        <view class="team-link" @click="toast('团队班次管理开发中')">团队班次</view>
        <view class="team-link" @click="toast('团队排班开发中')">团队排班</view>
      </view>
    </template>
  </page-frame>
</template>

<script setup>
import { computed, ref } from 'vue'
import { onLoad, onShow } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { toast } from '@/composables/use-nav.js'

const teamId = ref('')
const team = ref(null)
const role = ref('')
const memberCount = ref(0)
const members = ref([])
const pending = ref([])
const loading = ref(true)
const isAdmin = computed(() => role.value === 'owner' || role.value === 'admin')

function roleText(r) {
  if (r === 'owner') return '创建者'
  if (r === 'admin') return '管理员'
  return '成员'
}

async function load() {
  if (!teamId.value) return
  loading.value = true
  try {
    const d = await api.team.detail(teamId.value)
    team.value = d.team
    role.value = d.role
    memberCount.value = d.memberCount || 0
    members.value = (await api.team.memberList(teamId.value)) || []
    if (isAdmin.value) await loadPending()
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '加载失败')
  } finally {
    loading.value = false
  }
}

async function loadPending() {
  if (!isAdmin.value) return
  try {
    pending.value = (await api.team.listPending(teamId.value)) || []
  } catch (e) {}
}

async function approve(req) {
  try {
    await api.team.approve(teamId.value, req._id)
    toast('已通过')
    load()
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '操作失败')
  }
}
async function reject(req) {
  try {
    await api.team.reject(teamId.value, req._id)
    toast('已拒绝')
    load()
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '操作失败')
  }
}

function copyCode() {
  if (!team.value || !team.value.inviteCode) return
  uni.setClipboardData({ data: team.value.inviteCode })
  toast('邀请码已复制')
}

function editMember(m) {
  if (!isAdmin.value || m.role === 'owner') return
  uni.showActionSheet({
    itemList: ['修改真实姓名', '修改工号', '修改手机号'],
    success: async (r) => {
      const titles = ['真实姓名', '工号', '手机号']
      const keys = ['realName', 'employeeNo', 'phone']
      uni.showModal({
        title: '修改' + titles[r.tapIndex],
        editable: true,
        placeholderText: '请输入' + titles[r.tapIndex],
        success: async (res) => {
          if (!res.confirm) return
          try {
            await api.team.updateMemberProfile({ teamId: teamId.value, uid: m.uid, [keys[r.tapIndex]]: res.content || '' })
            toast('已保存')
            load()
          } catch (e) {
            toast((e && (e.message || e.errMsg)) || '保存失败')
          }
        }
      })
    }
  })
}

onLoad((options) => {
  teamId.value = (options && options.id) || ''
  load()
})
onShow(() => { if (teamId.value) load() })
</script>

<style lang="scss" scoped>
.empty {
  padding: 60px 20px;
  text-align: center;
  color: var(--text-3);
}
.head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  padding: 16px 14px;
}
.head__name {
  display: block;
  font-size: 18px;
  color: var(--text-1);
}
.head__sub {
  display: block;
  margin-top: 4px;
  font-size: 12px;
  color: var(--text-3);
}
.head__code {
  font-size: 12px;
  color: var(--primary);
}
.section-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 12px 14px;
}
.section-title {
  font-size: 14px;
  color: var(--text-1);
}
.section-extra {
  font-size: 12px;
  color: var(--text-3);
}
.request {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px 14px;
  border-top: 1px solid var(--line);
}
.request__name {
  display: block;
  font-size: 13px;
  color: var(--text-1);
}
.request__sub {
  display: block;
  font-size: 11px;
  color: var(--text-3);
  margin-top: 2px;
}
.request__ops {
  display: flex;
  gap: 14px;
  font-size: 13px;
}
.request__ok { color: var(--primary); }
.request__no { color: var(--delete); }
.member {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 10px 14px;
  border-bottom: 1px solid var(--line);
}
.member:last-child { border-bottom: 0; }
.member__avatar {
  width: 34px;
  height: 34px;
  border-radius: 50%;
  background: var(--surface-2);
  color: var(--primary);
  font-size: 14px;
  display: flex;
  align-items: center;
  justify-content: center;
}
.member__main { flex: 1; min-width: 0; }
.member__name { display: block; font-size: 14px; color: var(--text-1); }
.member__sub { display: block; margin-top: 2px; font-size: 11px; color: var(--text-3); }
.member__phone { font-size: 11px; color: var(--text-3); }
.team-links {
  display: flex;
  gap: 10px;
  margin-top: 14px;
}
.team-link {
  flex: 1;
  height: 40px;
  border-radius: var(--r-card);
  background: var(--surface);
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 13px;
  color: var(--text-2);
}
</style>
