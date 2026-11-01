# screen-01 · 主界面骨架 + Tab1「排班」首页

> 源码：`module/schedule/views/ScheduleMainViewKt.java`（骨架）、`module/schedule/views/main/ScheduleHomeViewKt.java`（首页）、`views/biz/ScheduleCalendarViewKt.java`（日历）
> 本文所有尺寸/颜色/文案均给出 jadx .java 行号（括号内为原始 .kt 行号，来自 traceEventStart）。

## A. 主界面骨架（ScheduleMainView.kt:42）

```
┌──────────────────────────────────────────────┐
│ App 内容区（Column，背景 #F6F5F4 / 暗色 #191919，fillMaxSize，padding top 6dp?）│
│   ← 当前 Tab 页面（排班 / 班次 / 提醒 / 统计 / 我的）│
│                                              │
│                                              │
├──────────────────────────────────────────────┤
│ 底部导航 Row（背景 = background）              │
│   排班   班次   提醒   统计   我的             │
│  (home) (sun) (alarm)(stat) (user)            │
└──────────────────────────────────────────────┘
```

实现（ScheduleMainViewKt.java:115-574）：
1. `Scaffold`（contentWindowInsets 默认）→ 内层 `Box(alignment=BottomCenter)`。
2. Box 内 `Column(背景=colorScheme.background, fillMaxSize, padding top 6dp)` 放页面内容（:170-173 外层 padding(6dp,0,0,0)）。
3. 页面切换是 **if 判断 pageType**（不是 NavHost）：
   - `isHomePage()` → `ScheduleHomeView`（:202-204）
   - `isSettingPage()` → `ScheduleSettingView`（:207-209）
   - `isWorkPage()` → `SelfHeaderView`（48dp，右侧 padding 10dp）内放 `SegmentPickerView(班次/轮班)`（:212-293），然后 `formType.isForm("work") ? ScheduleWorkManageView : SchedulePlanManageView`（:294-302）
   - `isAlarmPage()` → `ScheduleAlarmManageView`（:306-308）
   - `isStatPage()` → `ScheduleStatView`（:311-313）
4. 底部导航 `Row(背景=background)` + 5 × `NavItemView`（:320-447），每项 weight(1f)，选中色 **#55BB8A**、未选中 Color.Gray(#888888)；图标 20sp、文字 10sp Medium。
5. 浮层顺序：`homeEdit` 时显示 `ScheduleOperView`（底部操作面板，:453-457）；`formType.isForm("upgrade")` 时显示网络断开/升级提醒 TipDialog（:458-559）。
6. 全局：`LoadingDialog`（PageView 内部）、隐私遮罩在 MainView 层。

## B. Tab1「排班」首页逐段布局（ScheduleHomeView.kt:59）

整体：`Column(fillMaxSize, top, start)`
- B1 顶部标题栏（48dp）
- B2 可滚动内容区 `Column(verticalScroll, padding bottom 80dp)`
  - B2-1 公告条（条件）
  - B2-2 当月班次统计色块条（条件）
  - B2-3 设置提示条（条件）
  - B2-4 日历卡片（含星期行、日期网格、上下月）
  - B2-5 选中日「班次」区
  - B2-6 选中日「备注」区（条件）
  - B2-7 底部操作按钮区
- B3 浮层弹窗（配置面板 / 项目选择 / 班次选择 / 备注输入）

### B1 顶部标题栏（ScheduleHomeView.java:199-345）
`Row(fillMaxWidth, height 48dp, SpaceBetween, CenterVertically)`
- 左：`MonthChooseView(currentDateStr, fontSize=18sp, showNav=false)`（:232）
  - 渲染为单行文本：**"yyyy年MM月"**（月份两位补零，如 2026年10月 / 2026年01月），颜色 **ThemeColor #55BB8A**，18sp（`MonthChooseViewKt.java:367-399`、`MyDateTool.toChineseMonthString` = SimpleDateFormat("yyyy年MM月")）
  - 点击 → 底部弹窗「选择月份」（300dp 高，年份列 + 12 个月网格，:441-493）
- 右：`Row(start, centerVertically)`
  - 条件：`appTipInfo.showPurchase && !isAdVip` → `SmallButton("去广告")` + 间距 5dp（:286-305；按钮样式见 §E）
  - `HeaderIcon(62361 = IconFont.list)` → `setFormType("chooseProject")` 打开项目选择面板（:308-325）
  - `HeaderIcon(61668 = IconFont.settings)` → `setFormType("config")` 打开日历显示设置（:327-344）
  - 图标按钮：36dp 圆形热区、图标 20sp、默认色 primary

### B2-1 公告条（:388-537）
条件 `appTipInfo.show && baseRepository.showTip`
- 白色卡片 `GroupView`（可点击）：
  - 文本：**"温馨提示:" + appTipInfo.message**，12sp，颜色 = `appTipInfo.showColor`，padding bottom 10dp（:465）
  - 右上角 `"×"` 16sp 灰色（:466-531），点击写入 cache 关闭公告
  - 点击整卡：若 appTipInfo.page=="web" 且有 url → 打开内置 web；若 "purchase" → 会员页（:406-412）

### B2-2 当月统计条（:552-634）
- 条件：`config.showStat == true`
- 有数据（pieData.datalist 非空）：`Row(horizontalScroll)` 若干项，每项 `Row(start, centerVertically)`（`BoxViewKt.VerticalRow`）：
  - 色块：**10dp×10dp，圆角 4dp**，颜色 = item.color（:608-609）
  - 文本：**"班次名(次数)"**，12sp，lineHeight 8sp（:610）
  - 项间距：0（Blank(0)），相邻色块之间靠文字自然间距
- 无数据：`SmallTipText("当前月份没有设置排班")`（:632）—— 灰色小字，居中
- 该行在 GroupView 卡片内？否：直接横向滚动（无卡片背景）

### B2-3 设置提示条（:637-741）
条件 `viewModel.showConfigHint`（首次进入提示，可关闭）
- 卡片 `GroupView`（clickable → 打开 config）：
  - 文本：**"温馨提示:点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项"**，12sp，颜色 **colorScheme.tertiary（#999999）**，padding bottom 10dp（:707）
  - 右上 `"×"` 16sp 灰（:708）

### B2-4 日历卡片（:743）
- 组件：`ScheduleCalendarView(viewModel)`（详见 screen-02-calendar.md）
- 外观：`GroupView`（表面色 #FDFDFD、圆角 10dp、底部 padding 2dp）内：
  1. 星期行 `CalendarHeaderView(mondayFirst)`：Row(fillMaxWidth, SpaceBetween)；每格 weight(1f)，文字 **周一…周日**，12sp，Color.Gray，Normal，居中（`cn/qsfty/workplan/component/CalendarViewKt.java:50-155`）
  2. 月份横向翻页 `LazyRow`（无限项 + snap），每页一个月网格（详见 calendar.md）
  3. 底部导航 `BottomNavView`（ScheduleCalendarViewKt.java:748-958）：
     - 左：「上个月」（`IconFont.back=60000` 20sp 灰 + "上个月" 灰）→ 上一月
     - 中：条件显示「今天」小按钮：**60×30dp**，背景 `mainBg`，文字 **12sp，颜色 #F87679**（DeleteColor）（:840-862）→ 回到今天
     - 右：「下个月」（"下个月" 灰 + `IconFont.arrow_right=60012` 灰）→ 下一月
     - 上/下月文字与图标均 **Color.Gray**，系统默认字号（16sp）

### B2-5 选中日「班次」区（:745-859）
- 小节标题：`GroupTitleView("" + dateStr + "班次")`，如 **"2026-10-27班次"**，标题上方 padding **5dp**（:749）
- 卡片内容：`Column(centerHorizontally) padding top 10dp`：
  - 第一班次色块：`WholeWorkItemView(firstWork)`（:792）
    - 样式：背景 = 班次颜色（组合班次为两色渐变），圆角 8dp，padding(h 8dp, v 3dp)，内部行：**班次名**（白色，13sp）+ 间距(4dp) + **时间**（白色，13sp，如 "09:00~18:00"/"全天"），整块可点击 → `setFormType("chooseFirstWork")` 打开「选择第一班次」底部弹窗（500dp 高，:1183-1408）
  - 若存在第二班次（名称非空）：间距 0 + `WholeWorkItemView(secondWork)`，点击 → `chooseSecondWork`（:815-840, 1410-1633）
  - **空态**：当 selected 日没有任何班次时，仍显示上述「+」外观的空色块？——事实：firstWork 为空时 WholeWorkItemView 会渲染空白（`WorkItemViewKt.java:588-593` 空字符串分支），无占位文字。

### B2-6 「备注」区（:861-940）
- 条件 `duty.remark != ""`
- 标题 `GroupTitleView(dateStr + "备注")`（如 "2026-10-27备注"）
- 内容：`SmallTipText(remark)`（灰字），点击 → `showRemark` 输入弹窗（:904-923）

### B2-7 底部操作按钮区（:943-1053）
两种状态：
1. `duty.isAdd()`（当天无排班记录）：单个通栏按钮 `LongCancelButton(homeEdit ? "完成排班" : "开启排班")`，字号动态 sp（默认16sp，大字体适配 14sp）（:945-960）
2. 有记录：`CenterRow(padding vertical 10dp)` 一组小按钮，依次：
   - `CancelButton("设置备注")` → 备注输入（:988）
   - `CancelButton(homeEdit ? "完成排班" : "开启排班")`（:1008-1011）
   - `CancelButton("第二班次")` → chooseSecondWork（:1033）
   - 按钮之间 Blank(0)
- 「开启排班」会打开底部操作面板 `ScheduleOperView`（homeEdit=true）

## C. 首页状态与联动
- ViewModel：`ScheduleMasterViewModel`（Hilt，主界面共享）
- 关键状态：`currentDate: Date`、`currentDateStr`、`pageType: FormType`、`formType: FormType`、`homeEdit: Boolean`、`config: ScheduleConfig`、`pieData: PieGraphData`、`showConfigHint`（`vm/ScheduleMasterViewModel.java`）
- 日期变更：点击日期格 → `setCurrentDate(monthDateInfo.date)`（ScheduleCalendarViewKt.java:1138）；左右滑动月份 → LaunchedEffect 更新 currentDate（:1425-1450）
- 底部 tab 点击 → `setPageType(FormType("home"/"work"/"alarm"/"stat"/"self"))`（ScheduleMainViewKt.java:351-447）

## D. 首页浮层/弹窗清单
| 浮层 | formType 值 | 触发 | 规格 |
|---|---|---|---|
| 日历显示设置面板 | `config` | 右上角设置图标 / 提示条 | 底部弹窗「日历显示设置」（screen-04） |
| 项目选择面板 | `chooseProject` | 右上角 list 图标 | 底部弹窗（BottomProjectChooseView，:1089） |
| 第一班次选择 | `chooseFirstWork` | 首班次色块 | BottomDialogView「选择第一班次」，高 **500dp**，列表项 = 班次名 + 时间（:1183-1408） |
| 第二班次选择 | `chooseSecondWork` | 「第二班次」按钮 | BottomDialogView「选择第二班次」，高 500dp，额外首项 **"取消第二班次"**（文字 #F87679 红色）（:1410-1633, :1433） |
| 备注输入 | `showRemark` | 备注 / 设置备注 | `ShowInputDialog` 底部输入弹窗（:1095-1140） |
| 排班操作面板 | `homeEdit=true` | 开启排班 | ScheduleOperView 底部操作面板（screen-03） |

## E. 复用组件的关键实参（首页）
- `SmallButton("去广告")`：小胶囊按钮（CommonUIKt.m6951），默认主题色文字，用于非会员去广告入口
- `HeaderIcon`：36dp 圆、20sp 图标（见 components.md）
- `GroupTitleView`：小节标题（15sp? 代码未显式字号 → 默认 16sp Bold? 推断为 primary 15sp Medium），标题与卡片间距 5-10dp
- `WholeWorkItemView`：首页班次色块 = 圆角 **8dp**、内边距 h8/v3、字号 **13sp**、白字（WorkItemViewKt.java:536-545）
- `SmallTipText`：灰色（Color.Gray）12-13sp 小字
- `CenterRow`（hCenter+centerVertically Row）/ `VerticalRow`（Column）/ `TwoColumnView`（Row 双槽）/ `BoxView(w,h,color,r)` 为布局小工具（ui/component/nav/BoxViewKt.java，逾 5000 个调用点，jadx 展开冗余）

## F. 与 HTML 原型相关的备注
- 顶部状态栏：App 通过 `WorkplanTheme` 的 SideEffect 设置 statusBar/navigationBar 颜色 = background，并设浅色/深色图标（`ui/theme/ThemeKt.java:107-115`）。
- 底部导航栏高度：由内容决定（图标 20sp + 10sp 文字 + 上下 padding 10dp ≈ **58-60dp**），无 Material NavigationBar 组件。
- 首页滚动区底部预留 **80dp**，确保 5 tab 不遮挡最后一行按钮。
- 字号自适应：首页按钮字号在系统字体放大 >1.15 倍时按比例缩小（:167）。
