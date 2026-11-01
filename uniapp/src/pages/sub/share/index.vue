<template>
  <page-frame title="分享与导入排班" back>
    <view class="seg-row">
      <seg-tabs v-model="store.shareTab" :items="tabs" />
    </view>

    <view v-if="store.shareTab === 'share'" class="card share-card">
      <text class="share-desc">排班数据默认只保存在当前手机本地。换手机、换系统，或想把当前排班给家人同事使用时，可以先在这里分享当前项目，生成一个 6 位秘钥。</text>
      <view class="hint">拿到秘钥后，可以在 Android 或 iOS 端的「导入」里恢复成一个新的排班项目；后续鸿蒙版本也会使用同一套秘钥格式。</view>
      <view class="divider share-divider" />
      <view class="key-row">
        <text class="key-row__k">分享秘钥</text>
        <text class="share-key">{{ shareKey || '······' }}</text>
      </view>
      <view class="btn-row mt14">
        <view class="btn btn--ghost btn--sm" @click="copyKey">
          <ri-icon name="copy" :size="15" />
          <text>复制秘钥</text>
        </view>
        <view class="btn btn--primary btn--sm" @click="shareData">
          <ri-icon name="share" :size="15" />
          <text>分享排班数据</text>
        </view>
      </view>
    </view>

    <view v-else class="card share-card">
      <view class="field-row">
        <text class="field-row__k">秘钥</text>
        <input
          v-model="importKey"
          class="form-input"
          type="text"
          maxlength="6"
          placeholder="请输入 6 位秘钥"
          :placeholder-style="placeholderStyle"
        />
      </view>
      <view class="field-row field-row--second">
        <text class="field-row__k">项目命名</text>
        <input
          v-model="projectName"
          class="form-input"
          type="text"
          maxlength="12"
          placeholder="导入后的项目名称"
          :placeholder-style="placeholderStyle"
        />
      </view>
      <view class="btn btn--primary mt14" @click="doImport">确定导入</view>
      <view class="hint">导入会新建一个排班项目，不会覆盖当前手机里已有的数据。导入成功后会自动回到首页，并切换到刚导入的项目。</view>
    </view>
  </page-frame>
</template>

<script setup>
import { ref, computed, onMounted } from 'vue'
import api from '@/services/api.js'
import { store } from '@/composables/use-store.js'
import { back, toast } from '@/composables/use-nav.js'
import { useTheme } from '@/composables/use-theme.js'

const { theme } = useTheme()

const tabs = [
  { key: 'share', label: '分享' },
  { key: 'import', label: '导入' }
]
const shareKey = ref('')
const importKey = ref('')
const projectName = ref('')
const busy = ref(false)
const placeholderStyle = computed(() => 'color:' + (theme.value === 'dark' ? '#888888' : '#999999'))

async function ensureKey(force) {
  if (shareKey.value && !force) return shareKey.value
  const current = store.projects.find((p) => p.current) || store.projects[0] || {}
  try {
    const res = await api.generateShareKey(current.id || current._id || '')
    shareKey.value = (res && res.key) || ''
  } catch (e) {
    toast('生成秘钥失败')
  }
  return shareKey.value
}

function copyText(data, okText, failText) {
  uni.setClipboardData({
    data,
    success: () => toast(okText),
    fail: () => toast(failText)
  })
}

onMounted(() => {
  ensureKey(false)
})

async function copyKey() {
  const key = await ensureKey(false)
  if (!key) return
  copyText(key, '秘钥已复制', '复制失败，请手动记录：' + key)
}

async function shareData() {
  const key = await ensureKey(true)
  if (!key) return
  copyText(key, '分享秘钥 ' + key + ' 已生成并复制', '分享秘钥已生成：' + key)
}

async function doImport() {
  const key = String(importKey.value || '').trim().toUpperCase()
  if (key.length !== 6) {
    toast('请输入 6 位秘钥')
    return
  }
  if (busy.value) return
  busy.value = true
  try {
    await api.importShareKey(key)
    const name = String(projectName.value || '').trim() || '导入的排班'
    let saved = null
    try {
      saved = await api.saveProject({ name, current: true, count: 0 })
    } catch (e) {
      saved = null
    }
    if (saved) {
      try {
        await api.setCurrentProject(saved._id || saved.id)
      } catch (e) {}
    }
    toast('导入成功')
    setTimeout(() => back(), 600)
  } catch (e) {
    toast((e && e.message) || '导入失败，请检查秘钥')
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
.share-card {
  padding: 16px;
}
.share-desc {
  display: block;
  font-size: 13px;
  color: var(--text-2);
  line-height: 1.7;
}
.share-divider {
  margin: 14px 0;
}
.key-row {
  display: flex;
  align-items: center;
  min-height: 30px;
}
.key-row__k {
  flex: 1;
  font-size: 15px;
  color: var(--text-1);
}
.share-key {
  font-size: 20px;
  letter-spacing: 3px;
  color: var(--primary);
  font-weight: 600;
}
.field-row {
  display: flex;
  align-items: center;
  min-height: 50px;
}
.field-row--second {
  padding-top: 14px;
}
.field-row__k {
  flex: 1;
  font-size: 15px;
  color: var(--text-1);
}
</style>
