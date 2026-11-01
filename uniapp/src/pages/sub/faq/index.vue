<template>
  <page-frame title="常见问题解答" back>
    <view v-for="(item, i) in list" :key="i" class="faq">
      <text class="faq__cat">{{ item.cat }}</text>
      <text class="faq__q">{{ item.q }}</text>
      <text class="faq__a">{{ item.a }}</text>
    </view>
    <view v-if="!list.length" class="empty">暂无内容</view>
  </page-frame>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import api from '@/services/api.js'
import { store } from '@/composables/use-store.js'

const list = ref([])

onMounted(async () => {
  try {
    const res = await api.fetchFaq()
    list.value = Array.isArray(res) && res.length ? res : store.faq
  } catch (e) {
    list.value = store.faq
  }
})
</script>

<style lang="scss" scoped>
.faq__cat {
  display: block;
}
.faq__q {
  display: block;
}
.faq__a {
  display: block;
}
</style>
