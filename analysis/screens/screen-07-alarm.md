# screen-07 · Tab3「提醒」：提醒列表 + 提醒编辑页 + 日历权限引导

> 源码：`module/schedule/views/alarm/ScheduleAlarmManageViewKt.java`、`ScheduleAlarmEditViewKt.java`、`main/setting/notify/NotifySettingViewKt.java`

## 1. 提醒列表（ScheduleAlarmManageView.kt:66）
- 容器：`SimpleSubAppPageView(nav, null, headerTitle="班次提醒", body)`（:143）→ 48dp 头部 + 居中标题 + 可滚动 body
- 权限：进入页面即申请 `WRITE_CALENDAR / READ_CALENDAR`（:142）；未授权时内容区显示两个通栏授权按钮：
  - **"授权极简排班操作您的日历（更新数据）"**（LongOkButton，:554）
  - **"授权极简排班查询您的日历（查询数据）"**（LongOkButton，:589）
  - 拒绝且不再询问 → toast **"请前往系统设置页面允许极简排班访问您的日历"**（:574/:609）
- 空态：`EmptyIconDataView("暂无提醒")`（:199）
- 每条提醒卡片 `GroupView`（卡片底部间距 20dp，:209-227）：
  - 点击 → push `ScheduleAlarmEdit`（model=JSON(ScheduleAlarm)）（:225）
  - 内容 `TwoColumnView`：
    - 左：关联班次色块 `WorkItemView(refWork, Size.small)`（:341），其下 3dp：班次名 + 提醒时间等
      - 若提醒已关闭：班次名加**删除线**（`TextDecoration.LineThrough`）（:333）
    - 标签行：`TagView("强提醒"/"普通提醒")` 颜色：开启时 强提醒=DeleteColor(#F87679) / 普通=ThemeColor；关闭时 Color.Gray（:374）
      - `TagView(beforeInfo())`（提醒提前量文案），灰色（:377）
      - **"下次提醒时间"** 文本（OnlySmallTipText，:391）
    - 右侧开关 `SingleSwitch(opened)`（:406）——关闭后该提醒不触发
  - 卡片内还可显示备注等（推断）
- 底部固定按钮：**"添加提醒"**（fillMaxWidth, 50dp, 圆角 ThemeColor? 背景 surface，:451-470）→ push `ScheduleAlarmEdit`（空 model）
- 页面底部提示卡片：说明提醒依赖系统日历（GroupView，:627）

## 2. 提醒编辑页（ScheduleAlarmEditView.kt:60）— 路由 `ScheduleAlarmEdit`
- HeaderView 标题：**"添加提醒" / "编辑提醒"**（:214-235）
- Column(verticalScroll, padding h10/v25, 底部 80dp)（:237）
- 从上到下：
  1. **"选择班次"**（LeadingHint，:270）+ `Row(horizontalScroll)`：每个班次一个 chip
     - chip：`widthIn(min=120dp)`、圆角 8dp、背景 **选中 = ThemeColor** / 未选中 = surface、垂直 padding 10dp；内含班次名 + 时间（:306-327）
  2. **"提醒设置"**（LeadingHint，:388）+ GroupView：
     - `SelectItemView("什么时候提醒")` 选项：**当天 / 第二天 / 提前1天**（值 0/1/-1，`SelectUtil.BEFORE_NOTIFY_DAYS`）（:435）
     - `TimePickerItemView3("提醒时间")`（HH:mm）（:438）
     - `SwitchItemView("是否强提醒")`（:462）
       - 其下 TagView 说明：**"开启后，系统日程提醒会有铃声提醒，不只是滴一下的那种提醒，但这个只有部分安卓机型支持"**（灰色，:484）
     - `InputItemView("备注")` 快捷标签 [**上班打卡, 下班打卡**]（:487-490）
  3. **"快捷选项"**（LeadingHint，:523）+ `FlowTagView` 三个快捷标签（点击自动填充提醒时间）：
     - **上班前30分钟**（value "a:30"）、**上班前10分钟**（"a:10"）、**下班前5分钟**（"b:5"）（:524-526）
     - 逻辑：用关联班次的开始/结束时间减 N 分钟；未选班次时 toast **"请先选择一个班次"**（:556）
  4. 底部：`LongOkButton("保存")`；编辑态 `LongDeleteButton()` + DeleteDialog（:595-650）

## 3. 提醒数据模型（ScheduleAlarm.java）
- 关键字段：`uuid, workUuid(关联班次), notifyTime("HH:mm"), beforeDay("0"/"1"/"-1"), alarm(强提醒 bool), opened(启用), remark, gmtCreate, projectUuid, ...`
- `beforeInfo()`：根据 beforeDay 生成"当天/第二天/提前1天"中文标签（管理页 TagView 使用）
- 提醒实现：系统 **AlarmManager + 系统日历**（通过 `util/CalendarReminderUtils.java` 写入日历事件）；无自定义 Service/Receiver（manifest 仅有 MainActivity + Widget receiver）
- 通知/日历权限引导页路由 `NotifySetting`（详见 screen-14）
