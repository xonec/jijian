<template>
  <view class="segment">
    <view
      v-for="item in items"
      :key="item.key"
      class="segment__item"
      :class="{ 'segment__item--on': modelValue === item.key }"
      @click="onTap(item.key)"
    >
      {{ item.label }}
    </view>
  </view>
</template>

<script>
export default {
  name: 'seg-tabs',
  props: {
    items: { type: Array, default: () => [] },
    modelValue: { type: String, default: '' }
  },
  emits: ['update:modelValue'],
  methods: {
    onTap(key) {
      if (key !== this.modelValue) this.$emit('update:modelValue', key)
    }
  }
}
</script>
