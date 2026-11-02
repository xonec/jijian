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
          @longpress="onLongPress(sh)"
        >
          <shift-badge mode="chip" :shift="sh" />
          <text class="shift-row__name" />
          <text class="shift-row__time">{{ fmtTime(sh) }}</text>
        </view>
      </view>
      <view v-else class="empty">暂无班次</view>
      <view class="add-row" @click="openAdd">添加班次</view>
      <view class="sort-link" @click="onSort">班次排序</view>
      <view class="hint center">长按班次可删除</view>
    </view>

    <view v-else>
      <view v-if="plans.length" class="plan-list">
        <view
          v-for="plan in plans"
          :key="plan.id"
          class="plan-card"
          @click="openPlanEdit(plan)"
          @longpress="onPlanLongPress(plan)"
        >
          <text class="plan-card__name">{{ plan.name }}</text>
          <view class="plan-card__seq">
            <view
              v-for="(item, idx) in planChips(plan)"
              :key="idx"
              class="plan-chip"
              :style="{ background: item.color }"
            >{{ item.name }}</view>
          </view>
        </view>
      </view>
      <view v-else class="empty">暂无轮班</view>
      <view class="add-row" @click="openPlanAdd">添加轮班</view>
      <view class="sort-link" @click="onSort">轮班排序</view>
      <view class="hint center">长按轮班可删除</view>
    </view>
  </page-frame>
</template>

<script>
import { api } from '@/services/api.js'
import { store, fmtTime, loadPlans, removePlan } from '@/composables/use-store.js'
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
    },
    plans() {
      return this.store.plans
    }
  },
  onShow() {
    this.loadShifts()
    loadPlans()
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
    openPlanAdd() {
      goPage('plan-edit')
    },
    openPlanEdit(plan) {
      if (!plan) return this.openPlanAdd()
      goPage('plan-edit', { id: plan.id })
    },
    planChips(plan) {
      return (plan.sequence || []).map((sid) => {
        if (!sid) return { name: '空', color: '#999999' }
        const sh = this.store.shifts.find((x) => (x.id || x._id) === sid)
        return sh ? { name: sh.name, color: sh.color } : { name: '空', color: '#999999' }
      })
    },
    onPlanLongPress(plan) {
      if (!plan) return
      uni.showModal({
        title: '删除轮班',
        content: '确定删除「' + plan.name + '」？',
        confirmText: '删除',
        success: (res) => {
          if (!res.confirm) return
          removePlan(plan.id)
          toast('已删除轮班')
        }
      })
    },
    onLongPress(sh) {
      if (!sh) return
      const id = sh._id || sh.id
      const name = sh.name || '该班次'
      uni.showModal({
        title: '删除班次',
        content: '删除「' + name + '」后，使用该班次的日期会变为未排班，确定删除？',
        confirmText: '删除',
        cancelText: '取消',
        success: async (res) => {
          if (!res.confirm) return
          try {
            await api.deleteShift(id)
            const idx = this.shifts.findIndex((s) => (s._id || s.id) === id || s.id === id)
            if (idx >= 0) this.shifts.splice(idx, 1)
            const si = this.store.shifts.findIndex((s) => (s._id || s.id) === id || s.id === id)
            if (si >= 0) this.store.shifts.splice(si, 1)
            ;(this.store.days || []).forEach((d) => {
              if (d.work === id) d.work = ''
            })
            toast('已删除班次')
          } catch (e) {
            toast('删除失败，请重试')
          }
        }
      })
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
.plan-list {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.plan-card {
  background: var(--surface);
  border-radius: var(--r-card);
  padding: 10px 12px;
}
.plan-card__name {
  display: block;
  font-size: 14px;
  color: var(--text-1);
  margin-bottom: 8px;
}
.plan-card__seq {
  display: flex;
  flex-wrap: wrap;
  gap: 5px;
}
.plan-chip {
  padding: 3px 7px;
  border-radius: 4px;
  color: #ffffff;
  font-size: 11px;
}
</style>
