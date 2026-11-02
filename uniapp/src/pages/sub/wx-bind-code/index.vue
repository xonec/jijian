<template>
  <page-frame title="微信小程序绑定" back>
    <view class="card intro">
      <text class="intro__t">用微信小程序绑定当前账号</text>
      <text class="intro__s">在极简排班小程序登录时选择「使用绑定码」，输入下面 6 位数字，即可把微信和当前账号关联。绑定码 5 分钟内有效，仅可使用一次。</text>
    </view>

    <view v-if="code" class="code-card">
      <text class="code-label">绑定码</text>
      <text class="code-value">{{ code }}</text>
      <text class="code-expire">{{ expireText }}</text>
      <view class="code-actions">
        <view class="btn btn--primary" @click="copy">复制绑定码</view>
        <view class="btn btn--ghost" @click="generate">刷新绑定码</view>
      </view>
    </view>
    <view v-else class="empty">
      <text class="empty__t">{{ loading ? '正在生成…' : '点击生成绑定码' }}</text>
      <view v-if="!loading" class="btn btn--primary mt14" @click="generate">生成绑定码</view>
    </view>

    <view class="hint">绑定后小程序一键登录将进入当前账号；不影响安卓 App 的账号密码登录。</view>
  </page-frame>
</template>

<script setup>
import { computed, ref, onUnmounted } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import { createBindCode } from '@/composables/use-auth.js'
import { goPage, toast } from '@/composables/use-nav.js'

const code = ref('')
const expiresAt = ref(0)
const loading = ref(false)
const now = ref(Date.now())
let timer = null
const expireText = computed(() => {
  const sec = Math.max(0, Math.floor((expiresAt.value - now.value) / 1000))
  return sec > 0 ? '有效期剩余 ' + Math.floor(sec / 60) + ' 分 ' + (sec % 60) + ' 秒' : '已过期，请刷新'
})
async function generate() {
  if (loading.value) return
  loading.value = true
  try {
    const res = await createBindCode()
    code.value = res.code || ''
    expiresAt.value = res.expiresAt || 0
    now.value = Date.now()
    if (timer) clearInterval(timer)
    timer = setInterval(() => { now.value = Date.now() }, 1000)
  } catch (e) {
    toast((e && (e.message || e.errMsg)) || '生成失败')
  } finally { loading.value = false }
}
function copy() {
  if (!code.value) return
  uni.setClipboardData({ data: code.value })
  toast('绑定码已复制')
}
onLoad(() => generate())
onUnmounted(() => { if (timer) clearInterval(timer) })
</script>

<style lang="scss" scoped>
.intro { padding: 16px; }
.intro__t { display: block; font-size: 15px; color: var(--text-1); margin-bottom: 6px; }
.intro__s { display: block; font-size: 12px; line-height: 1.7; color: var(--text-3); }
.code-card { margin-top: 14px; border-radius: var(--r-card); background: var(--surface); padding: 22px 16px; text-align: center; }
.code-label { display: block; font-size: 12px; color: var(--text-3); }
.code-value { display: block; margin: 10px 0 6px; font-size: 40px; letter-spacing: 10px; font-weight: 700; color: var(--primary); }
.code-expire { display: block; font-size: 11px; color: var(--text-3); }
.code-actions { display: flex; gap: 10px; margin-top: 20px; }
.code-actions .btn { flex: 1; }
.empty { padding: 45px 20px; text-align: center; color: var(--text-3); }
</style>
