<template>
  <page-frame title="导入小程序排班" back>
    <view class="intro-card">
      <view class="intro-card__head">
        <ri-icon name="file_download" :size="20" class="intro-card__icon" />
        <text class="intro-card__title">从微信小程序导入</text>
      </view>
      <text class="intro-card__body">如果你之前使用过「极简排班」微信小程序，只要在下方输入排班小程序「我的」页面头像下的用户 ID（8 位字母数字串），即可快速把小程序排班导入本 App。</text>
    </view>

    <view class="group-title">排班小程序用户 ID</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">用户 ID</text>
        <input
          v-model="miniUserId"
          class="form-input"
          type="text"
          maxlength="8"
          placeholder="8 位字母或数字"
          :placeholder-style="placeholderStyle"
        />
      </view>
    </view>
    <view class="id-meta">
      <text class="gray">用户 ID 为 8 位字母数字串</text>
      <text class="id-meta__count" :class="{ accent: miniUserId.length === 8 }">{{ miniUserId.length }}/8</text>
    </view>

    <view class="btn btn--primary mt14" :class="{ 'btn--disabled': busy }" @click="importData">
      {{ busy ? '导入中…' : '导入排班数据' }}
    </view>
    <view class="hint">导入会按早班 → 晚班 → 休息的顺序，轮转写入 2024-09-01 至 2024-09-07 的排班；导入完成后可回到首页查看。</view>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import api from '@/services/api.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const miniUserId = ref('')
const busy = ref(false)
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))

function shiftIdOf(shift) {
  return shift ? shift.id || shift._id || '' : ''
}

/* 按早班 / 晚班 / 休息的顺序整理班次，找不到名称时按接口顺序兜底 */
function arrangeShifts(list) {
  const byName = (name) => list.find((s) => s.name === name)
  const byId = (id) => list.find((s) => s.id === id || s._id === id)
  const picked = [
    byName('早班') || byId('early') || list[0],
    byName('中班') || byId('mid') || list[1],
    byName('夜班') || byId('night') || list[2],
    byName('休息') || byId('rest') || list[3]
  ]
  const out = []
  picked.forEach((s) => {
    if (s && out.indexOf(s) < 0) out.push(s)
  })
  return out
}

async function importData() {
  if (busy.value) return
  const userId = String(miniUserId.value || '').trim()
  if (!userId) {
    toast('用户ID不能为空')
    return
  }
  if (userId.length !== 8) {
    toast('用户ID是8位喔')
    return
  }
  if (!/^[A-Za-z0-9]{8}$/.test(userId)) {
    toast('用户ID只能包含字母和数字')
    return
  }

  busy.value = true
  try {
    const list = await api.fetchShifts()
    const shifts = Array.isArray(list) ? list : []
    if (!shifts.length) {
      toast('没有数据')
      return
    }
    const ordered = arrangeShifts(shifts)
    if (!ordered.length) {
      toast('没有可用的班次')
      return
    }

    for (let i = 0; i < 7; i += 1) {
      const date = '2024-09-' + String(i + 1).padStart(2, '0')
      const workId = shiftIdOf(ordered[i % ordered.length])
      if (!workId) throw new Error('班次数据不完整')
      await api.setDay({ date, workId })
    }

    toast('导入成功')
    setTimeout(() => back(), 700)
  } catch (e) {
    toast((e && e.message) || '导入失败，请稍后重试')
  } finally {
    busy.value = false
  }
}
</script>

<style lang="scss" scoped>
.intro-card {
  margin-top: 2px;
  padding: 14px;
  border-radius: var(--r-card);
  background: var(--surface);
}
.intro-card__head {
  display: flex;
  align-items: center;
  gap: 7px;
  margin-bottom: 8px;
}
.intro-card__icon {
  color: var(--primary);
}
.intro-card__title {
  font-size: 14px;
  font-weight: 600;
  color: var(--text-1);
}
.intro-card__body {
  display: block;
  font-size: 13px;
  line-height: 1.75;
  color: var(--text-2);
  white-space: pre-line;
}
.id-meta {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 9px 4px 0;
}
.id-meta__count {
  font-size: 12px;
  color: var(--text-3);
  font-variant-numeric: tabular-nums;
}
.btn--disabled {
  opacity: 0.65;
}
</style>
