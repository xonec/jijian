# screen-06 · Tab2「班次」的轮班（周期轮班）列表 + 轮班编辑页

> 源码：`module/schedule/views/plan/SchedulePlanManageViewKt.java`、`SchdulePlanEditViewKt.java`、`PlanItemViewKt.java`

## 1. 轮班列表（SchedulePlanManageView.kt:41）
- 位置：Tab2 选中「轮班」时（ScheduleMainViewKt.java:294-302）
- 根：Column(fillMaxSize, 背景 background, verticalScroll, 底部 80dp)（:144,175）
- 空态：`EmptyDataView("暂无轮班")`（:208）
- 每个方案（`for plan`）：
  - 顶部标题文字：方案名（`LeadingHintView`，:213）
  - `PlanItemView(plan, clickable)`（:214）：卡片 `GroupView` 内横向排列该轮班的班次色块序列（Size.normal，色块间 padding 5dp/3dp）（PlanItemView.java:53,106）；空 config → 卡片底部 20dp
  - 点击 → push `SchedulePlanEdit`（model=JSON(plan)）（:230）
  - 卡片间距 10dp（:233）
- 底部固定按钮：**"添加轮班"**（height 50dp，背景 surface，:238-255）→ push `SchedulePlanEdit`（空 model）
- 下方链接 **"轮班排序"** → SortDialogView（:316, :364）
- 列表底部同样带滚轮上滑/拖拽排序弹窗。

## 2. 轮班编辑页（SchdulePlanEditView.kt:51）— 路由 `SchedulePlanEdit`
- HeaderView 标题：**"添加轮班" / "编辑轮班"**（:199）
- 内容 Column(verticalScroll, padding h10/v25, 底部 80dp)（:217）
- 从上到下：
  1. **"基本信息"**（LeadingHint）+ GroupView：`InputItemView("轮班名称")`（:270）
  2. **"周期轮班"**（LeadingHint）+ 右上 `SmallTipText("排序")` 打开 SortDialogView「轮班排序」（:321-364）+ `EditPlanItemView(editItem)`（当前轮班序列，可删除单个班次；GroupView 卡片）（:349）
  3. **"选择下列班次加入周期轮班"**（LeadingHint）+ GroupView：列出全部班次（Size.normal，5dp/3dp padding，点击加入序列），末尾固定一项 **"空"**（灰色 #999999 的伪班次，表示"休息/空空档"）（:370-468）
  4. 底部：`LongOkButton("保存")`；编辑态 `LongDeleteButton()` + DeleteDialog（:490-545）

## 3. 数据模型（SchedulePlan）
- 字段：`uuid, name, config(JSON 班次数组), ordinal, remark, gmtCreate, state, ...`（见 `model/SchedulePlan.java`）
- `fetchPlans()` 返回 List<ScheduleWork>；"空" 项 = `ScheduleWork(name="空", theme="#999999")`（SchdulePlanEditViewKt.java:451）
- 应用方式：首页操作面板「使用此轮班」→ 按 `config.autoDay` 天数从当前日展开（screen-03 §4）
