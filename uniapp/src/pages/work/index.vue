<template>
  <page-frame tab="work">
    <template #header>
      <view class="work-header">
        <seg-tabs v-model="store.workTab" :items="tabs" />
      </view>
    </template>

    <view v-if="isWork">
      <view v-if="shifts.length" class="card">
        <view
          v-for="sh in shifts"
          :key="sh._id || sh.id"
          class="shift-row"
          @click="openEdit(sh)"
        >
          <shift-badge mode="chip" :shift="sh" />
          <text class="shift-row__name" />
          <text class="shift-row__time">{{ fmtTime(sh) }}</text>
        </view>
      </view>
      <view v-else class="empty">暂无班次</view>
      <view class="add-row" @click="openAdd">添加班次</view>
      <view class="sort-link" @click="onSort">班次排序</view>
    </view>

    <view v-else>
      <!-- 轮班（plan）数据尚未纳入 mock/store，原型空态即为「暂无轮班」 -->
      <view class="empty">暂无轮班</view>
      <view class="add-row" @click="openEdit">添加轮班</view>
      <view class="sort-link" @click="onSort">轮班排序</view>
    </view>
  </page-frame>
</template>

<script>
import { api } from '@/services/api.js'
import { store, fmtTime } from '@/composables/use-store.js'
import { goPage, toast } from '@/composables/use-nav.js'

export default {
  name: 'WorkTabPage',
  data() {
    return {
      store,
      tabs: [
        { key: 'work', label: '班次' },
        { key: 'plan', label: '轮班' }
      ],
      shifts: store.shifts
    }
  },
  computed: {
    isWork() {
      return this.store.workTab === 'work'
    }
  },
  onShow() {
    this.loadShifts()
  },
  methods: {
    fmtTime,
    async loadShifts() {
      try {
        const list = await api.fetchShifts()
        if (Array.isArray(list) && list.length) this.shifts = list
      } catch (e) {
        /* 网络/云函数异常时保留 store 内置班次，保证页面可用 */
      }
    },
    openEdit(sh) {
      if (!sh) return this.openAdd()
      const id = sh._id || sh.id
      goPage('work-edit', id ? { id } : {})
    },
    openAdd() {
      goPage('work-edit')
    },
    onSort() {
      toast('功能演示')
    }
  }
}
</script>

<style lang="scss" scoped>
.work-header {
  display: flex;
  justify-content: center;
  padding: 18px 0 14px;
}
</style>
