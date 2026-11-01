# screen-05 · Tab2「班次」：班次列表 + 班次编辑页

> 源码：`module/schedule/views/work/ScheduleWorkManageViewKt.java`（列表）、`SchduleWorkEditViewKt.java`（编辑）、`WorkItemViewKt.java`（色块）

## 1. Tab2 顶部（ScheduleMainViewKt.java:212-293）
- `SelfHeaderView`（48dp，右侧 padding 10dp）内放 `SegmentPickerView(type, options=班次/轮班)`
  - 选项：**"班次" → value "work"**、**"轮班" → value "plan"**（`SelectUtil.initValues("班次","work","轮班","plan")`）
  - 选中 work → 显示班次列表；plan → 显示轮班列表（screen-06）
- 分段选择器为胶囊样式（FormItemKt.SegmentPickerView），整行宽

## 2. 班次列表（ScheduleWorkManageView.kt:42）
- 根：`Column(fillMaxSize, 背景 background, verticalScroll, padding bottom 80dp)`（:151,182）
- 空态：`EmptyDataView("暂无班次")`（:215）
- 每个班次一张卡片 `GroupView`（背景 surface，圆角 10dp，卡片间距约 15dp，可点击）（:223-241）：
  - 内容 `TwoColumnView`（Row 左右两槽）：
    - 左：班次色块 `WorkItemView(work, Size.normal)`（:280/:324）
      - 普通班次：色块 + 右侧「工作时间」文本 `WorkTimeView(work)`（:325）
      - 组合班次：渐变主色块（两色块并排显示第一/第二班次，Size.small，间距 2dp）（:278-321）
    - 右：无额外内容（TwoColumnView 第二槽为空/无）
  - 点击 → push `ScheduleWorkEdit`，参数 `model = JSON(ScheduleWork)`（:239）
- 底部固定按钮（浮在列表底部，fillMaxWidth, height 50dp, 圆角 10dp, 背景 surface）：
  - 文案 **"添加班次"**（:404）→ push `ScheduleWorkEdit`（空 model）
  - 下方链接 **"班次排序"**（`SmallTipText`，仅在班次 >1 时显示）→ `formType = SORT` → `SortDialogView("班次排序", ...)` 拖拽排序（:432, :480）

## 3. 班次编辑页（SchduleWorkEditView.kt:68）— 路由 `ScheduleWorkEdit`
- 容器：`Scaffold` + `HeaderView(title = isAdd ? "添加班次" : "编辑班次", backAction = goBack)`（:205-220）
- 内容：`Column(verticalScroll, padding(h 10dp, v 25dp), 底部 80dp)`（:224）
- 结构（从上到下）：
  1. **班次类型分段选择**：`SegmentPickerView` 选项 **普通班次(simple) / 组合班次(combine)**（:276-280；`SelectUtil.WORK_TYPES`）
  2. **可折叠说明** `PanelView("了解组合班次?")`（:315）
  3. 组合班次时：
     - `GroupView`：`InputItemView("组合班次命名")`（:338）；`LeadingHintView("从已有普通班次中选择两个")`（:369）；下方列出全部普通班次（可点选，选中显示序号圆标 1/2，背景 ThemeColor 圆点 20dp）（:373-434）
     - **样式预览**：88dp 高 surfaceVariant 圆角 8dp 画布（:478），内含组合色块（两个 Size.small 色块叠加）+ 农历"初六"示例文字（:511-559）
  4. 普通班次时：
     - **"基本信息"** 标题（`LeadingHintView`）+ `GroupView`：
       - `InputItemView("班次名称")`：**上限 5 个字**，快捷标签 [早班, 中班, 晚班, 白班, 夜班, 休息, 请假, 休假]（:600-602）
       - `SwitchItemView("是否全天")`（:626）
       - 非全天时：`TimePickerItemView3("开始时间")` / **"结束时间"** / **"休息时长"**（休息时长存 `extField1`）（:650-698）
       - `ColorSelectItemView("班次颜色")`（中国色 230 色 picker，详见 components.md §5.1）（:724）
     - **"样式预览"** 标题 + `CenterGroupView` 内 `WorkItemView(editItem)`（:755-776）
  5. 底部按钮：`LongOkButton("保存")`（:789）；编辑态追加 `LongDeleteButton()`（红色删除，:811）→ `DeleteDialog` 确认（:844）

## 4. 数据模型 / 校验（ScheduleWork.java）
- 字段：`uuid, name, userId, gmtBegin("HH:mm"), gmtEnd, remark, theme("#RRGGBB"), projectUuid, complex(组合班次), config(组合班次 JSON: 2 个子班次), ordinal(排序), fullDay, state, gmtCreate, subId, extField1(休息时长), extField2/3, cc, cid`（:202-232）
- 校验（`isValid()`, :482-501）：名称非空、≤5 字、非全天需开始/结束时间、颜色非空
- 展示时间 `fetchShownTime()`（:461-472）：全天→"全天"；跨天→"HH:mm~次日HH:mm"；否则 "HH:mm~HH:mm"
- 颜色：`fetchCombineColor()`（:535-544）普通=纯色 Brush，组合=两班次颜色水平渐变
- 色块尺寸（WorkItemView）：Size **normal** = 圆角 8dp、内边距 h8/v3、字 13sp；**small** = 圆角 3dp、h3/v2、字 11sp；**big** = 圆角 12dp、h12/v6、字 14sp（`WorkItemViewKt.java:145-148, 536-545`）
