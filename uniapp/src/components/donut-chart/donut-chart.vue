<template>
  <view class="donut-wrap" :style="{ width: size + 'px', height: size + 'px' }">
    <view class="donut" :style="{ background: gradient }">
      <view class="donut__hole" :style="{ width: hole + '%', height: hole + '%' }" />
    </view>
    <view
      v-if="labels"
      v-for="(item, i) in items"
      :key="i"
      class="donut-label"
      :style="labelStyle(item, i)"
    >
      <text class="donut-label__text" :style="{ color: item.color }">{{ item.name }} {{ item.pct }}%</text>
    </view>
  </view>
</template>

<script>
export default {
  name: 'donut-chart',
  props: {
    items: { type: Array, default: () => [] },
    labels: { type: Boolean, default: true },
    size: { type: Number, default: 232 },
    hole: { type: Number, default: 78 }
  },
  computed: {
    gradient() {
      const total = this.items.reduce((s, x) => s + x.pct, 0) || 100
      let acc = 0
      const stops = []
      const gap = 0.8
      this.items.forEach((x, i) => {
        const from = (acc / total) * 100
        acc += x.pct
        const to = (acc / total) * 100
        stops.push(x.color + ' ' + from.toFixed(2) + '% ' + (to - gap).toFixed(2) + '%')
        stops.push('var(--surface-2) ' + (to - gap).toFixed(2) + '% ' + to.toFixed(2) + '%')
      })
      return 'conic-gradient(from -90deg, ' + stops.join(', ') + ')'
    }
  },
  methods: {
    labelStyle(item, i) {
      const total = this.items.reduce((s, x) => s + x.pct, 0) || 100
      let before = 0
      for (let k = 0; k < i; k++) before += this.items[k].pct
      const mid = ((before + item.pct / 2) / total) * 360 - 90
      const rad = (mid * Math.PI) / 180
      const r = this.size / 2 + 2
      const x = this.size / 2 + Math.cos(rad) * r
      const y = this.size / 2 + Math.sin(rad) * r
      const right = Math.cos(rad) >= 0
      return {
        left: x + 'px',
        top: y + 'px',
        transform: right ? 'translate(6px, -50%)' : 'translate(calc(-100% - 6px), -50%)'
      }
    }
  }
}
</script>

<style lang="scss" scoped>
.donut-wrap {
  position: relative;
  margin: 0 auto;
}
.donut {
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  border-radius: 50%;
}
.donut__hole {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  border-radius: 50%;
  background: var(--surface);
}
.donut-label {
  position: absolute;
  white-space: nowrap;
  width: max-content;
}
.donut-label__text {
  font-size: 12.5px;
  font-weight: 500;
  white-space: nowrap;
}
</style>
