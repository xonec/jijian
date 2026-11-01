<template>
  <page-frame title="用户在线反馈" back>
    <view class="seg-row">
      <seg-tabs v-model="type" :items="tabs" />
    </view>

    <view class="group-title">反馈内容</view>
    <view class="form-card feedback-card">
      <textarea
        v-model="content"
        class="feedback-input"
        maxlength="500"
        placeholder="请描述你遇到的问题或建议，至少 5 个字"
        :placeholder-style="placeholderStyle"
      />
      <view class="feedback-meta">
        <text class="feedback-meta__tip">请尽量描述具体场景，便于我们定位问题</text>
        <text
          class="feedback-meta__count"
          :class="{ 'feedback-meta__count--warn': content.length > 0 && content.length < 5 }"
        >{{ content.length }}/500</text>
      </view>
    </view>

    <view class="group-title">联系方式（选填）</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">联系方式</text>
        <input
          v-model="contact"
          class="form-input"
          type="text"
          maxlength="50"
          placeholder="手机号 / 微信号 / 邮箱"
          :placeholder-style="placeholderStyle"
        />
      </view>
    </view>

    <view class="btn btn--primary mt14" :class="{ 'btn--disabled': busy }" @click="submit">
      {{ busy ? '提交中…' : '提交反馈' }}
    </view>
    <view class="hint">我们会认真阅读每一条反馈。若留下联系方式，我们可能会就反馈内容与你进一步沟通，联系方式仅用于本次反馈回访。</view>
  </page-frame>
</template>

<script setup>
import { ref, computed } from 'vue'
import api from '@/services/api.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const tabs = [
  { key: 'feature', label: '功能建议' },
  { key: 'bug', label: '问题反馈' },
  { key: 'other', label: '其他' }
]

const type = ref('feature')
const content = ref('')
const contact = ref('')
const busy = ref(false)
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))

async function submit() {
  if (busy.value) return
  const text = String(content.value || '').trim()
  if (text.length < 5) {
    toast('请至少输入 5 个字')
    return
  }
  busy.value = true
  try {
    await api.submitFeedback({
      type: type.value,
      content: text,
      contact: String(contact.value || '').trim()
    })
    toast('提交成功，感谢你的反馈')
    setTimeout(() => back(), 700)
  } catch (e) {
    toast((e && e.message) || '提交失败，请稍后重试')
  } finally {
    busy.value = false
  }
}
</script>

<style lang="scss" scoped>
.seg-row {
  display: flex;
  justify-content: center;
  padding: 4px 0 14px;
}
.feedback-card {
  padding: 12px;
}
.feedback-input {
  width: 100%;
  height: 150px;
  padding: 12px;
  border-radius: 10px;
  background: var(--surface-2);
  color: var(--text-1);
  font-size: 15px;
  line-height: 1.6;
  box-sizing: border-box;
}
.feedback-meta {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 10px 2px 0;
}
.feedback-meta__tip {
  flex: 1;
  font-size: 11.5px;
  line-height: 1.5;
  color: var(--text-3);
}
.feedback-meta__count {
  flex: none;
  font-size: 12px;
  color: var(--text-3);
  font-variant-numeric: tabular-nums;
}
.feedback-meta__count--warn {
  color: var(--delete);
}
.btn--disabled {
  opacity: 0.65;
}
</style>
