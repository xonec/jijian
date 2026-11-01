<template>
  <text class="ri" :style="iconStyle">{{ char }}</text>
</template>

<script>
import { iconChar } from '@/data/icons.js'

export default {
  name: 'ri-icon',
  props: {
    name: { type: String, default: '' },
    size: { type: [Number, String], default: 0 },
    color: { type: String, default: '' }
  },
  computed: {
    char() {
      return iconChar(this.name)
    },
    iconStyle() {
      const style = {}
      if (this.size) style.fontSize = Number(this.size) + 'px'
      if (this.color) style.color = this.color
      return style
    }
  }
}
</script>
