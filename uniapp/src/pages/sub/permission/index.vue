<template>
  <page-frame title="通知权限设置" back>
    <view class="notice-card">
      <view class="notice-card__head">
        <ri-icon name="notification" :size="17" class="notice-card__icon" />
        <text class="notice-card__title">关于 APP 通知</text>
      </view>
      <text class="notice-card__body">由于安卓手机品牌众多，不同厂商定制的系统对第三方应用的限制各有差异。应用被完全退出或设备锁屏后，本地通知大概率不会触发；而系统日历提醒受系统保护，可以准时触发。因此极简排班的所有提醒都通过系统日历实现。我们只会访问极简排班范围内的提醒数据，不会读取您的其他隐私。</text>
    </view>

    <view class="group-title">权限状态</view>
    <view class="group perm-card">
      <view class="perm-row">
        <text class="perm-row__k">通知权限</text>
        <text class="perm-row__v" :class="stateClass(diag.notification)">{{ stateText(diag.notification) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">日历权限（读 / 写）</text>
        <text class="perm-row__v" :class="stateClass(diag.calendarRead && diag.calendarWrite)">{{ stateText(diag.calendarRead && diag.calendarWrite) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">位置权限</text>
        <text class="perm-row__v" :class="stateClass(diag.location)">{{ stateText(diag.location) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">网络权限</text>
        <text class="perm-row__v" :class="stateClass(diag.network)">{{ stateText(diag.network) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">相机权限</text>
        <text class="perm-row__v" :class="stateClass(diag.camera)">{{ stateText(diag.camera) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">相册权限</text>
        <text class="perm-row__v" :class="stateClass(diag.media)">{{ stateText(diag.media) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">文件权限</text>
        <text class="perm-row__v" :class="stateClass(diag.file)">{{ stateText(diag.file) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">录音权限</text>
        <text class="perm-row__v" :class="stateClass(diag.record)">{{ stateText(diag.record) }}</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">消息推送（uni-push 2.0）</text>
        <text class="perm-row__v">已配置，需在 DCloud 开通</text>
      </view>
      <view class="perm-row">
        <text class="perm-row__k">精确闹钟（Android 12+）</text>
        <text class="perm-row__v" :class="stateClass(diag.canExactAlarm)">{{ stateText(diag.canExactAlarm) }}</text>
      </view>
      <view v-if="!diag.supported" class="hint perm-hint">H5 / 小程序无法检测系统权限，请在 App 中查看与操作。</view>
    </view>

    <view class="btn btn--primary mt14" @click="requestAll">申请全部权限（网络 / 日历 / 通知 / 位置 / 相机 / 相册 / 文件）</view>
    <view class="btn btn--soft mt10" @click="verifyReminder">验证日历提醒（1 分钟后）</view>
    <view class="btn btn--primary mt10" @click="enableNotify">开启通知</view>
    <view class="btn btn--soft auth-btn mt10" @click="requestCalendar">授权极简排班访问日历（读 + 写）</view>
    <view class="btn btn--soft mt10" @click="openSettings('notification')">打开通知设置</view>
    <view class="btn btn--soft mt10" @click="openSettings('exact')">打开精确闹钟设置</view>

    <view class="group-title">手机品牌</view>
    <view class="group brand-card">
      <view class="brand-chips">
        <view
          v-for="b in brands"
          :key="b"
          class="brand-chip"
          :class="{ 'brand-chip--on': brand === b }"
          @click="pickBrand(b)"
        >
          <text>{{ b }}</text>
        </view>
      </view>
      <view class="hint brand-hint">当前品牌（{{ brand }}）权限入口：{{ brandHint }}</view>
    </view>

    <view class="group mt14">
      <cell-row icon="settings" label="前往系统设置" @click="openSettings('app')" />
    </view>

    <view class="hint">不同机型、不同系统版本的权限入口可能略有差异。若授权时选择了「拒绝且不再询问」，请前往系统设置手动开启；找不到入口时，可以在系统设置顶部搜索「极简排班」。</view>
  </page-frame>
</template>

<script setup>
import { ref, computed, onMounted } from 'vue'
import { onShow } from '@dcloudio/uni-app'
import { toast } from '@/composables/use-nav.js'
import {
  isSupported, diagnose, requestPermissions, testCalendarAlarm, notifyNow, openSettings as openNativeSettings
} from '@/services/reminder.js'

const bridge = typeof window !== 'undefined' && window.AndroidBridge ? window.AndroidBridge : null

const brands = ['华为', '小米', '荣耀']
const brand = ref('华为')

const BRAND_HINTS = {
  华为: '设置 → 应用和服务 → 应用管理 → 极简排班 → 权限 → 日历',
  小米: '设置 → 应用设置 → 应用管理 → 极简排班 → 权限管理 → 日历',
  荣耀: '设置 → 应用 → 应用管理 → 极简排班 → 权限 → 日历'
}

const brandHint = computed(() => BRAND_HINTS[brand.value] || '设置 → 应用管理 → 极简排班 → 权限 → 日历')

const diag = ref({
  supported: isSupported() || !!bridge,
  notification: false,
  calendarRead: false,
  calendarWrite: false,
  location: false,
  network: false,
  camera: false,
  media: false,
  file: false,
  record: false,
  canExactAlarm: false,
  platform: bridge ? 'android-webview' : ''
})

function stateText(v) {
  if (!diag.value.supported) return '—'
  return v ? '已授权' : '未授权'
}
function stateClass(v) {
  if (!diag.value.supported) return ''
  return v ? 'perm-row__v--ok' : 'perm-row__v--warn'
}

async function refresh() {
  if (bridge) {
    try {
      const s = JSON.parse(bridge.status() || '{}')
      diag.value = {
        supported: true,
        notification: !!s.notification,
        calendarRead: !!s.calendar,
        calendarWrite: !!s.calendar,
        location: !!s.location,
        network: s.network !== false,
        camera: !!s.camera,
        media: !!s.media,
        file: !!s.file,
        record: !!s.record,
        canExactAlarm: true,
        platform: 'android-webview'
      }
      return
    } catch (e) {}
  }
  try {
    diag.value = await diagnose()
  } catch (e) {
    diag.value = { supported: false, notification: false, calendarRead: false, calendarWrite: false, location: false, network: false, camera: false, media: false, file: false, record: false, canExactAlarm: false }
  }
}

onShow(() => {
  refresh()
})

onMounted(() => {
  try {
    const saved = uni.getStorageSync('jy_notify_brand')
    if (brands.indexOf(saved) >= 0) brand.value = saved
  } catch (e) {}
  refresh()
  if (bridge) {
    window.addEventListener('andpermchange', () => {
      refresh()
    })
  }
})

function pickBrand(name) {
  brand.value = name
  try {
    uni.setStorageSync('jy_notify_brand', name)
  } catch (e) {}
}

async function requestAll() {
  if (bridge) {
    bridge.request()
    toast('请在系统弹窗中允许权限')
    setTimeout(refresh, 800)
    setTimeout(refresh, 2000)
    return
  }
  if (!diag.value.supported) {
    toast('H5 预览无法申请系统权限，请在 App 中操作')
    return
  }
  try {
    await requestPermissions('all')
  } catch (e) {}
  setTimeout(refresh, 800)
  setTimeout(refresh, 2000)
  toast('已发起权限申请')
}

async function verifyReminder() {
  if (bridge) {
    toast('WebView 壳暂不支持写入系统日历，请授权日历权限后使用完整 App')
    return
  }
  if (!diag.value.supported) {
    toast('H5 预览暂不支持验证系统日历提醒，请在 App 中操作')
    return
  }
  try {
    await testCalendarAlarm()
    toast('已写入 1 分钟后的测试提醒，请留意系统日历通知')
    refresh()
  } catch (e) {
    if (e && e.code === 'NO_CALENDAR_PERMISSION') {
      const r = await requestPermissions('calendar')
      if (r.granted && r.granted.length) {
        try {
          await testCalendarAlarm()
          toast('已授权并写入测试提醒')
          refresh()
          return
        } catch (e2) {
          toast(e2.message || '写入失败')
          return
        }
      }
      toast('未获得日历权限，请点击下方「授权极简排班访问日历」')
      return
    }
    toast((e && e.message) || '写入失败')
  }
}

async function enableNotify() {
  if (bridge) {
    bridge.request()
    toast('请在系统弹窗中允许通知权限')
    setTimeout(refresh, 1200)
    return
  }
  if (!diag.value.supported) {
    toast('H5 预览暂不支持系统通知，请在 App 中开启')
    return
  }
  const r = await requestPermissions('notification')
  await refresh()
  if (diag.value.notification) {
    try {
      await notifyNow({ title: '极简排班提醒', content: '通知已开启，排班提醒会准时通知你' })
    } catch (e) {}
    toast('通知已开启')
  } else if (r.denied && r.denied.length) {
    toast('通知权限被拒绝，请前往系统设置手动开启')
  } else {
    toast('通知权限未授予，可前往系统设置开启')
  }
}

async function requestCalendar() {
  if (bridge) {
    bridge.request()
    toast('请在系统弹窗中允许日历权限')
    setTimeout(refresh, 1200)
    return
  }
  if (!diag.value.supported) {
    toast('H5 预览暂不支持日历授权，请在 App 中操作')
    return
  }
  const r = await requestPermissions('calendar')
  await refresh()
  if (diag.value.calendarWrite && diag.value.calendarRead) toast('日历权限已开启')
  else if (r.denied && r.denied.length) toast('日历权限被拒绝，请前往系统设置手动开启')
  else toast('请按系统提示允许访问日历')
}

async function openSettings(kind) {
  if (bridge) {
    bridge.openSettings()
    return
  }
  if (!diag.value.supported) {
    toast('H5 预览无法打开系统设置，请在 App 中操作')
    return
  }
  try {
    await openNativeSettings(kind)
  } catch (e) {
    toast((e && e.message) || '无法打开系统设置')
  }
}
</script>

<style lang="scss" scoped>
.notice-card {
  margin-top: 2px;
  padding: 14px;
  border-radius: var(--r-card);
  background: var(--surface);
}
.notice-card__head {
  display: flex;
  align-items: center;
  gap: 7px;
  margin-bottom: 8px;
}
.notice-card__icon {
  color: var(--primary);
}
.notice-card__title {
  font-size: 14px;
  font-weight: 600;
  color: var(--text-1);
}
.notice-card__body {
  display: block;
  font-size: 12.5px;
  line-height: 1.75;
  color: var(--text-2);
  white-space: pre-line;
}
.perm-card {
  padding: 4px 14px;
}
.perm-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 13px 0;
}
.perm-row__k {
  font-size: 14.5px;
  color: var(--text-1);
}
.perm-row__v {
  font-size: 13px;
  color: var(--text-2);
}
.perm-row__v--ok {
  color: var(--primary);
}
.perm-row__v--warn {
  color: #ee3f4d;
}
.perm-hint {
  padding: 0 0 10px;
}
.brand-card {
  padding: 14px;
}
.brand-chips {
  display: flex;
  gap: 9px;
}
.brand-chip {
  flex: 1;
  height: 38px;
  border-radius: 10px;
  background: var(--surface-2);
  color: var(--text-2);
  font-size: 14px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.16s ease;
}
.brand-chip--on {
  background: rgba(85, 187, 138, 0.14);
  color: var(--primary);
  font-weight: 600;
  box-shadow: inset 0 0 0 1px var(--primary);
}
.brand-hint {
  padding: 10px 0 0;
}
.auth-btn {
  font-size: 15px;
  line-height: 1.3;
  padding: 0 10px;
}
</style>
