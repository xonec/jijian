<template>
  <page-frame tab="alarm" title="班次提醒">
    <template #header-right>
      <view class="header__icon" @click="openEdit">
        <ri-icon name="add" :size="21" />
      </view>
    </template>

    <view class="alarm-body">
      <view class="btn btn--primary mt6 auth-btn" @click="authorize">授权极简排班操作您的日历（更新数据）</view>
      <view class="btn btn--primary mt10 auth-btn" @click="authorize">授权极简排班查询您的日历（查询数据）</view>

      <view class="group mt10">
        <cell-row icon="info" label="关于班次提醒？" @click="onAbout" />
        <cell-row icon="check" label="检查班次提醒是否生效？" @click="onCheck" />
      </view>

      <view class="section-label">我的提醒</view>

      <view v-if="alarms.length" class="alarm-list">
        <view
          v-for="al in alarms"
          :key="al._id || al.id"
          class="alarm-card"
          @click="openEdit"
        >
          <view class="alarm-top">
            <text class="alarm-time">{{ al.time }}</text>
            <shift-badge mode="chip" :shift="shiftOf(al.shift)" />
            <text class="alarm-range">{{ al.range }}</text>
            <view class="alarm-top__spacer" />
            <view class="alarm-switch" @click.stop>
              <app-switch :model-value="al.on" @change="onToggle(al, $event)" />
            </view>
          </view>
          <view class="alarm-meta">
            <text
              v-for="(t, i) in al.tags"
              :key="t"
              class="tag"
              :class="{ 'tag--ok': i === 0 }"
            >{{ t }}</text>
          </view>
          <view class="alarm-next">{{ al.next }}</view>
        </view>
      </view>
      <view v-else class="empty">暂无提醒</view>

      <view class="hint center">提醒会写入系统日历，由系统日历在设定时间通知</view>
    </view>
  </page-frame>
</template>

<script>
import { api } from '@/services/api.js'
import { store, shiftById } from '@/composables/use-store.js'
import { goPage, toast } from '@/composables/use-nav.js'
import { isSupported, syncAlarm, removeAlarm, openSettings } from '@/services/reminder.js'

export default {
  name: 'AlarmTabPage',
  data() {
    return {
      store,
      alarms: store.alarms,
      originNext: {}
    }
  },
  onShow() {
    this.loadAlarms()
  },
  methods: {
    shiftOf(id) {
      return shiftById(id)
    },
    async loadAlarms() {
      try {
        const list = await api.fetchAlarms()
        if (!Array.isArray(list)) return
        const map = {}
        this.alarms = list.map((al) => {
          const id = al._id || al.id
          map[id] = al.next
          return { ...al, next: al.on ? al.next : '提醒已关闭' }
        })
        this.originNext = map
      } catch (e) {
        /* 异常时保留 store 内置提醒 */
      }
    },
    openEdit() {
      goPage('alarm-edit')
    },
    async authorize() {
      if (!isSupported()) {
        toast('请在 App 中授权日历权限（H5 预览不支持）')
        return
      }
      try {
        await openSettings('calendar')
      } catch (e) {
        toast('请前往系统设置页面允许极简排班访问您的日历')
      }
    },
    onAbout() {
      toast('提醒会写入系统日历，由系统日历在设定时间通知')
    },
    onCheck() {
      toast('请前往系统设置检查极简排班的日历权限')
    },
    async onToggle(al, on) {
      const id = al._id || al.id
      try {
        await api.toggleAlarm(id, on)
        al.on = on
        al.next = on ? this.originNext[id] || al.next : '提醒已关闭'
        const cached = this.store.alarms.find((x) => (x._id || x.id) === id)
        if (cached) {
          cached.on = on
          cached.next = al.next
        }
        if (isSupported()) {
          try {
            if (on) {
              const sh = this.shiftOf(al.shift) || {}
              await syncAlarm({ id, time: al.time, when: al.when, strong: !!al.strong, shiftName: sh.name || '' })
            } else {
              await removeAlarm(id)
            }
          } catch (e) {
            /* 日历权限/不可用时不阻塞开关 */
          }
        }
      } catch (e) {
        toast('操作失败，请重试')
      }
    }
  }
}
</script>

<style lang="scss" scoped>
.alarm-body {
  padding-top: 6px;
}
.auth-btn {
  height: 42px;
  font-size: 14px;
}
.alarm-switch {
  flex: none;
  display: flex;
}
</style>
