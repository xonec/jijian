<template>
  <view class="row-cell" @click="$emit('click')">
    <ri-icon v-if="icon" :name="icon" :size="19" class="row-cell__icon" />
    <text class="row-cell__label">{{ label }}</text>
    <text v-if="value" class="row-cell__value">{{ value }}</text>
    <ri-icon v-if="chevron" name="arrow_right" :size="15" class="row-cell__chev" />
  </view>
</template>

<script>
export default {
  name: 'cell-row',
  props: {
    icon: { type: String, default: '' },
    label: { type: String, default: '' },
    value: { type: String, default: '' },
    chevron: { type: Boolean, default: true }
  },
  emits: ['click']
}
</script>
