# screen-04 · 日历显示设置（BottomScheduleConfigView，非路由底部弹窗）

> 源码：`module/schedule/views/config/ScheduleConfigViewKt.java`（原 ScheduleConfigView.kt:23 / :51），ViewModel `ScheduleConfigViewModel`
> 触发：首页右上角 `HeaderIcon(settings)` 或「设置提示」卡片（ScheduleHomeViewKt.java:1064-1087）
> 关闭/保存：面板头部「取消」「保存」（:152/:172）

## 1. 外观
- `BottomDialogView(title = "日历显示设置")`（顶部弹窗，白卡片，`ScheduleConfigViewKt.java:98`）
- 头部行：左侧 **"取消"**（WarnText 样式，灰） + 右侧 **"保存"**（LinkText 样式，ThemeColor）（:152-172）
- 内容：`ZeroGroupView`（无内边距卡片）包一组表单项（:394）

## 2. 表单项（自上而下，原文 + 类型）
| # | 文案 | 控件 | 取值/选项 | 默认 | 证据 |
|---|---|---|---|---|---|
| 1 | **一周开始日** | SegmentItemView（label 宽 60dp） | 周一 / 周日 | 周一 | :417 |
| 2 | **日期字号** | SelectItemView（底部选择） | 8~30（步长 1） | 17 | :463；选项 `SelectUtil.CHOOSE_FONT_SIZES = initWithUnit("", "", 8, 30)` |
| 3 | **班次字号** | SelectItemView | 8~30 | 11 | :489 |
| 4 | **时间字号** | SelectItemView | 8~30 | 11 | :515 |
| 5 | **班次圆角** | SelectItemView | 0~10 | 4 | :541 |
| 6 | **显示中国农历** | Switch | 开/关 | 开 | :544 |
| 7 | **显示中国节假日** | Switch | 开/关 | 开 | :565 |
| 8 | **显示上班时间** | Switch | 开/关 | 关 | :586 |
| 9 | **显示下班时间** | Switch | 开/关 | 关 | :607 |
| 10 | **显示备注** | Switch | 开/关 | 关 | :628 |
| 11 | **显示统计指标** | Switch | 开/关 | 开 | :649 |
| 12 | **显示分割线** | Switch | 开/关 | 开 | :670 |

## 3. 交互
- Switch/Select 改动直接写 `ScheduleConfigViewModel`，点「保存」持久化并关闭，首页立即重绘（config 为 Compose State）。
- 「取消」放弃未保存改动（推断；代码 onDismiss 直接关闭面板）。
- 该配置按 **排班项目（project）** 保存：`ScheduleConfig.projectUuid`（模型字段）。

## 4. 数据模型（ScheduleConfig 默认值，ScheduleConfig.java:377）
`{uuid:"only", autoDay:"90", beginDay:"monday", dateFontSize:"17", workFontSize:"11", timeFontSize:"11", workRadius:"4", showLunar:true, showFestival:true, showBeginTime:false, showEndTime:false, showHLine:true, fillCalendar:false, showRemark:false, showStat:true, protectMode:true, extField1..5:"", projectUuid:"", remark:"", gmtCreate:"", cc:0, cid:""}`
> `uuid:"only"` 表示"仅一个项目"时的默认配置（兼容单项目模式）。
