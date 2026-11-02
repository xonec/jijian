<template>
  <page-frame title="我的团队" back>
    <view v-if="!isLogin" class="empty">
      <text class="empty__t">登录后可使用团队排班</text>
      <view class="btn btn--primary mt14" @click="goLogin">去登录</view>
    </view>

    <template v-else>
      <view class="team-actions">
        <view class="team-action" @click="createTeam">
          <ri-icon name="add" :size="18" />
          <text>创建团队</text>
        </view>
        <view class="team-action" @click="joinTeam">
          <ri-icon name="share" :size="18" />
          <text>加入团队</text>
        </view>
      </view>

      <view v-if="loading" class="empty"><text class="empty__t">加载中…</text></view>
      <view v-else-if="!teams.length" class="empty">
        <text class="empty__t">还没有加入团队</text>
      </view>
      <view v-else class="team-list">
        <view v-for="t in teams" :key="t._id" class="team-card" @click="openTeam(t)">
          <view class="team-card__main">
            <text class="team-card__name">{{ t.name }}</text>
            <text class="team-card__role">{{ roleText(t.role) }}</text>
          </view>
          <view v-if="t.unread" class="team-card__badge">{{ t.unread > 99 ? '99+' : t.unread }}</view>
          <ri-icon name="arrow_right" :size="15" class="gray" />
        </view>
      </view>
    </template>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import api from '@/services/api.js'
import { goPage, toast } from '@/composables/use-nav.js'

const teams = ref([])
const loading = ref(false)
const user = ref(null)
const isLogin = computed(() => !!(user.value && (user.value._id || user.value.username)))

function roleText(role) {
  if (role === 'owner') return '创建者'
  if (role === 'admin') return '管理员'
  return '成员'
}
function goLogin() { goPage('login') }
function openTeam(t) { goPage('team-detail', { id: t._id }) }

async function load() {
  user.value = uni.getStorageSync('uni_id_user') || null
  if (!isLogin.value) { teams.value = []; return }
  loading.value = true
  try {
    teams.value = (await api.team.listMine()) || []
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '团队加载失败')
  } finally {
    loading.value = false
  }
}

function createTeam() {
  uni.showModal({
    title: '创建团队',
    editable: true,
    placeholderText: '请输入团队名称',
    success: async (r) => {
      if (!r.confirm || !r.content || !r.content.trim()) return
      try {
        const res = await api.team.create({ name: r.content.trim(), nickname: (user.value && user.value.nickname) || '' })
        const code = res && res.team && res.team.inviteCode
        uni.showModal({
          title: '团队已创建',
          content: '邀请码：' + (code || '-') + '\n把邀请码发给成员，成员申请后由你审批。',
          showCancel: false
        })
        load()
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '创建失败')
      }
    }
  })
}

function joinTeam() {
  uni.showModal({
    title: '加入团队',
    editable: true,
    placeholderText: '请输入邀请码',
    success: async (r) => {
      if (!r.confirm || !r.content || !r.content.trim()) return
      try {
        const res = await api.team.join({ inviteCode: r.content.trim() })
        if (res && res.status === 'pending') toast('申请已提交，等待管理员审批')
        else if (res && res.status === 'active') toast(res.restored ? '已恢复成员身份' : '已加入团队')
        load()
      } catch (e) {
        toast((e && (e.message || e.errMsg)) || '加入失败')
      }
    }
  })
}

onShow(load)
</script>

<style lang="scss" scoped>
.empty {
  padding: 60px 20px;
  text-align: center;
}
.empty__t {
  font-size: 13px;
  color: var(--text-3);
}
.team-actions {
  display: flex;
  gap: 10px;
  margin: 12px 0;
}
.team-action {
  flex: 1;
  height: 44px;
  border-radius: var(--r-card);
  background: var(--surface);
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 6px;
  font-size: 14px;
  color: var(--primary);
}
.team-list {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.team-card {
  min-height: 64px;
  border-radius: var(--r-card);
  background: var(--surface);
  padding: 12px 14px;
  display: flex;
  align-items: center;
  gap: 8px;
}
.team-card__main {
  flex: 1;
  min-width: 0;
}
.team-card__name {
  display: block;
  font-size: 15px;
  color: var(--text-1);
}
.team-card__role {
  display: block;
  font-size: 12px;
  color: var(--text-3);
  margin-top: 4px;
}
.team-card__badge {
  min-width: 18px;
  height: 18px;
  padding: 0 5px;
  border-radius: 9px;
  background: var(--delete);
  color: #fff;
  font-size: 10px;
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>
