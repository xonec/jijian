<template>
  <page-frame :title="pageTitle" back>
    <view class="group-title group-title--first">基本信息</view>
    <view class="form-card">
      <view class="form-row">
        <text class="form-row__k">轮班名称</text>
        <input
          v-model="form.name"
          class="form-input"
          type="text"
          maxlength="20"
          placeholder="例如：四班两运转"
          :placeholder-style="placeholderStyle"
        />
      </view>
    </view>

    <view class="group-title">周期轮班</view>
    <view class="form-card">
      <view v-if="!seqItems.length" class="plan-empty">点击下方班次，按顺序加入周期</view>
      <view v-else class="plan-seq">
        <view
          v-for="(item, idx) in seqItems"
          :key="idx"
          class="plan-seq__item"
          @click="removeAt(idx)"
        >
          <text class="plan-seq__idx">{{ idx + 1 }}</text>
          <view class="plan-seq__chip" :style="{ background: item.color }">{{ item.name }}</view>
          <text class="plan-seq__op" @click.stop="moveAt(idx, -1)">↑</text>
          <text class="plan-seq__op" @click.stop="moveAt(idx, 1)">↓</text>
          <ri-icon name="remove" :size="14" class="plan-seq__del" />
        </view>
      </view>
      <view class="plan-hint">点按已加入的班次可移除</view>
    </view>

    <view class="group-title">选择下列班次加入周期轮班</view>
    <view class="form-card">
      <view class="plan-add">
        <view
          v-for="sh in store.shifts"
          :key="sh.id"
          class="plan-add__chip"
          :style="{ background: sh.color }"
          @click="addShift(sh.id)"
        >{{ sh.name }}</view>
        <view class="plan-add__chip plan-add__chip--empty" @click="addShift('')">空</view>
      </view>
    </view>

    <view class="btn btn--primary mt14" @click="onSave">保存</view>
    <view v-if="planId" class="btn btn--danger-text mt6" @click="onDelete">删除轮班</view>
    <view class="plan-bottom" />
  </page-frame>
</template>

<script setup>
import { computed, reactive, ref } from 'vue'
import { onLoad } from '@dcloudio/uni-app'
import { store, loadPlans, savePlan, removePlan } from '@/composables/use-store.js'
import { back, toast } from '@/composables/use-nav.js'

const planId = ref('')
const form = reactive({ name: '', sequence: [] })
const pageTitle = computed(() => (planId.value ? '编辑轮班' : '添加轮班'))
const placeholderStyle = 'color:#999999'

const seqItems = computed(() =>
  form.sequence.map((sid) => {
    if (!sid) return { name: '空', color: '#999999' }
    const sh = store.shifts.find((x) => (x.id || x._id) === sid)
    return sh ? { name: sh.name, color: sh.color } : { name: '空', color: '#999999' }
  })
)

onLoad((options) => {
  loadPlans()
  const id = options && options.id
  if (!id) return
  const plan = store.plans.find((x) => x.id === id)
  if (!plan) return
  planId.value = plan.id
  form.name = plan.name
  form.sequence = (plan.sequence || []).slice()
})

function addShift(id) {
  form.sequence.push(id || '')
}
function removeAt(idx) {
  form.sequence.splice(idx, 1)
}
function moveAt(idx, delta) {
  const to = idx + delta
  if (to < 0 || to >= form.sequence.length) return
  const list = form.sequence.slice()
  const [item] = list.splice(idx, 1)
  list.splice(to, 0, item)
  form.sequence = list
}
async function onSave() {
  const name = String(form.name || '').trim()
  if (!name) return toast('请输入轮班名称')
  if (!form.sequence.length) return toast('请至少加入一个班次')
  await savePlan({ id: planId.value || undefined, name, sequence: form.sequence })
  toast('已保存')
  setTimeout(() => back(), 300)
}
function onDelete() {
  uni.showModal({
    title: '删除轮班',
    content: '确定删除「' + form.name + '」？',
    confirmText: '删除',
    success: async (r) => {
      if (!r.confirm) return
      await removePlan(planId.value)
      toast('已删除')
      setTimeout(() => back(), 300)
    }
  })
}
</script>

<style lang="scss" scoped>
.plan-empty {
  padding: 24px 12px;
  text-align: center;
  color: var(--text-3);
  font-size: 13px;
}
.plan-seq {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  padding: 12px;
}
.plan-seq__item {
  position: relative;
  display: flex;
  align-items: center;
  gap: 4px;
}
.plan-seq__idx {
  font-size: 10px;
  color: var(--text-3);
}
.plan-seq__chip {
  padding: 4px 9px;
  border-radius: 6px;
  color: #ffffff;
  font-size: 12px;
}
.plan-seq__op {
  font-size: 12px;
  color: var(--text-3);
  padding: 0 2px;
}
.plan-seq__del {
  color: var(--delete);
}
.plan-hint {
  padding: 0 12px 12px;
  font-size: 11px;
  color: var(--text-3);
}
.plan-add {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  padding: 12px;
}
.plan-add__chip {
  padding: 6px 12px;
  border-radius: 8px;
  color: #ffffff;
  font-size: 12px;
}
.plan-add__chip--empty {
  background: #999999;
}
.plan-bottom {
  height: 30px;
}
</style>
