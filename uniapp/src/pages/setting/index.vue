<template>
  <page-frame tab="setting" title="排班设置">
    <view class="user-card" @click="openUser">
      <view class="avatar">
        <ri-icon name="user" :size="22" />
      </view>
      <view class="user-info">
        <view class="user-info__name">{{ displayName }}</view>
        <view class="user-info__sub">{{ userSubText }}</view>
      </view>
      <ri-icon name="arrow_right" :size="15" class="user-chev" />
    </view>

    <view class="vip-card" @click="openVip">
      <ri-icon name="vip" :size="24" class="vip-card__icon" />
      <text class="vip-card__txt">{{ vipCardText }}</text>
      <text class="vip-card__go">{{ vipCardGo }}</text>
    </view>

    <view class="group">
      <cell-row icon="user" label="我的团队" @click="goTeams" />
      <cell-row icon="calendar" label="组织排班" @click="goOrg" />
    </view>

    <view v-for="g in store.settingGroups" :key="g.title" class="group">
      <cell-row
        v-for="it in g.items"
        :key="it.label"
        :icon="it.icon"
        :label="it.label"
        :value="valueOf(it)"
        @click="onItem(it)"
      />
    </view>

    <view class="version">极简排班 v3.5.0 · 独立开发者</view>

    <app-sheet :visible="themeSheet" title="APP风格" @close="themeSheet = false">
      <view
        v-for="opt in themeOptions"
        :key="opt.key"
        class="sheet-row"
        @click="pickTheme(opt.key)"
      >
        <text class="sheet-row__t">{{ opt.label }}</text>
        <ri-icon v-if="themeMode === opt.key" name="check" :size="18" class="sheet-row__check" />
      </view>
    </app-sheet>

    <app-dialog
      :visible="updateDialog"
      title="本次更新说明"
      :text="store.updateIntro"
      @close="updateDialog = false"
    >
      <template #actions>
        <view class="btn btn--ghost dialog-btn" @click="updateDialog = false">知道了</view>
      </template>
    </app-dialog>
  </page-frame>
</template>

<script>
import { store } from '@/composables/use-store.js'
import { goPage, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'
import { vipState, loadVip } from '@/composables/use-vip.js'
import { fmtExpire } from '@/data/vip-plans.js'

const theme = useTheme()

export default {
  name: 'SettingTabPage',
  data() {
    return {
      store,
      vip: vipState,
      themeSheet: false,
      updateDialog: false,
      themeOptions: [
        { key: 'light', label: '亮白主题' },
        { key: 'dark', label: '暗黑主题' },
        { key: 'system', label: '跟随系统' }
      ],
      userInfo: uni.getStorageSync('uni_id_user') || null,
      routes: {
        我的排班项目: 'project',
        本地备份设置: 'backup',
        本地备份与恢复: 'backup',
        分享与导入排班: 'share',
        桌面小组件配置: 'widget',
        通知与系统权限: 'permission',
        导入小程序排班: 'wechat',
        常见问题解答: 'faq',
        用户在线反馈: 'feedback'
      }
    }
  },
  onShow() {
    this.refreshUser()
    loadVip()
  },
  computed: {
    themeMode() {
      return theme.state.mode
    },
    modeLabel() {
      return theme.modeLabel.value
    },
    isLogin() {
      return !!(this.userInfo && (this.userInfo._id || this.userInfo.username))
    },
    displayName() {
      if (!this.isLogin) return '登录或注册账号'
      return this.userInfo.nickname || this.userInfo.username || '已登录用户'
    },
    vipActive() {
      return !!this.vip.active
    },
    vipCardText() {
      if (this.vipActive) return '已开通会员 · 有效期至 ' + fmtExpire(this.vip.expireAt)
      return '购买会员，支持独立开发，获取专属客服与会员标识'
    },
    vipCardGo() {
      return this.vipActive ? '已开通' : '去开通'
    },
    userSubText() {
      if (this.vipActive) return this.isLogin ? '已登录 · 会员' : '本地演示 · 会员'
      return this.isLogin ? '已登录 · 普通用户' : '未登录 · 普通用户'
    }
  },
  methods: {
    goTeams() {
      goPage('teams')
    },
    valueOf(item) {
      if (item.label === 'APP风格') return this.modeLabel
      return item.value || ''
    },
    onItem(item) {
      if (item.label === 'APP风格') {
        this.themeSheet = true
        return
      }
      if (item.label === '本次更新说明') {
        this.updateDialog = true
        return
      }
      if (item.label === '用户使用协议') {
        uni.navigateTo({ url: '/pages/sub/agreement/index?type=user' })
        return
      }
      if (item.label === '应用隐私政策') {
        uni.navigateTo({ url: '/pages/sub/agreement/index?type=privacy' })
        return
      }
      const path = this.routes[item.label]
      if (path) {
        goPage(path)
        return
      }
      toast('功能暂不可用')
    },
    pickTheme(key) {
      theme.setMode(key)
      this.themeSheet = false
    },
    openUser() {
      if (this.isLogin) goPage('user-detail')
      else goPage('login')
    },
    refreshUser() {
      this.userInfo = uni.getStorageSync('uni_id_user') || null
    },
    openVip() {
      goPage('vip')
    }
  }
}
</script>

<style lang="scss" scoped>
.user-chev {
  color: var(--text-3);
  opacity: 0.8;
}
.sheet-row__check {
  color: var(--primary);
}
.dialog-btn {
  height: 40px;
  font-size: 15px;
}
/* 更新说明较长：限制弹窗高度，正文内部滚动，保证「知道了」始终可见 */
:deep(.dialog) {
  max-height: 78vh;
}
:deep(.dialog__text) {
  max-height: 52vh;
  overflow-y: auto;
}
</style>
