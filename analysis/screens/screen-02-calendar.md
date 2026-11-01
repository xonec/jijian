# screen-02 · 日历组件（排班首页核心屏）

> 源码：`module/schedule/views/biz/ScheduleCalendarViewKt.java`（原 ScheduleCalendarView.kt）、`cn/qsfty/workplan/component/CalendarViewKt.java`（星期行/竖排文字）、`model/MonthDateInfo.java`（日期数据+配色）、`model/ScheduleConfig.java`（显示配置）、`views/work/WorkItemViewKt.java`（班次色块）。
> 该日历同时被桌面小组件复用（`widget/calendar/*`），二者视觉一致。

## 0. 结构总览

```
GroupView（日历卡片，白色 surface，圆角 0 → 直角，底部 padding 2dp）   ← ScheduleCalendarViewKt.java:228-424
├── 星期行 CalendarHeaderView                     （周一..周日 12sp 灰 居中，weight1）
├── 月份翻页 LazyRow（无限页，每页=一个月）        （左右滑动/吸附）
│   └── 每页 Box(topCenter) → 月网格
│       └── Column：按周分组
│           每周 Row(fillMaxWidth, height IntrinsicSize.Min, SpaceBetween)
│           └── 7 × 日格（weight 1f）
│               ├── 数字区（今日底色 8% 红、字号随配置 8~30sp）
│               ├── 农历/节日竖排文字（8sp）
│               └── 班次色块（最多2个，填满格宽）
├── 大号月份水印文字（80sp，灰 10% 透明度，居中叠加）
└── 底部导航 BottomNavView（上个月 / 今天 / 下个月）
```

## 1. 日期网格（ScheduleCalendarBodyView, ScheduleCalendarView.kt:284；行号 963-1347）

### 1.1 尺寸随「日期字号」配置联动
- 字号来源：`config.dateFontSize`（字符串默认 **"17"**，配置项 8~30）；解析失败回退 **17**（:981-990）
- 数字容器高（dateBoxHeight）：字号 **≥24 → 34dp；≥20 → 30dp；否则 26dp**（:992-998）
- 每格最小高（rowMinHeight）：**≥24 → 42dp；≥20 → 38dp；否则 36dp**（:999-1005）
- 数字容器最小宽：显示农历或（显示节假日且当天为节日）? **46dp : 40dp**（:1176）
- 网格横向内边距：`padding(horizontal 2dp)`（每个日格）
- 卡片纵向内边距：`padding(top 10dp, bottom 10dp)`（:1041-1042）

### 1.2 日格视觉状态（重点，HTML 可 1:1 复刻）
| 状态 | 背景 | 边框 | 数字颜色 | 字重 |
|---|---|---|---|---|
| 普通日 | **surface #FDFDFD**（暗 #111111） | 1dp 同 surface（不可见） | **secondary #222222**（暗 #DDDDDD） | Medium |
| 选中日（viewModel.isFocus） | **ThemeColor #55BB8A 20% 透明** | **1dp ThemeColor #55BB8A** | secondary | Medium |
| 今天 | 数字容器底色 **DeleteColor #F87679 8% 透明** | 同普通/选中 | **DeleteColor #F87679** | **Bold** |
| 空白位（月初/月末补位） | surface | 同普通 | 不渲染数字，不响应点击 | — |

实现证据：日格背景 `if (isFocus) ThemeColor.copy(alpha=0.2f) else colorScheme.surface`（:1140）；边框 `border(1dp, if (isFocus) ThemeColor else surface, RoundedCornerShape(6dp))`（:1140）；今日数字背景 `if (today) DeleteColor.copy(0.08f) else transparent` + 圆角 **8dp**（:1176）；数字颜色 `MonthDateInfo.fetchDayColor()`（MonthDateInfo.java:248-268：today→DeleteColor，否则 **colorScheme.secondary**）；字重 today→Bold，否则 Medium（:1217）。
日格容器还有：`weight(1f)`、`padding(vertical=3dp)`、`clip(RoundedCornerShape(4dp))`、`fillMaxHeight()`、`clickable`（:1119-1140）。

### 1.3 日格内部布局（Column, top + centerHorizontally）
1. 数字容器：Row(center, centerVertically)：Text(day, width=dateBoxHeight, fontSize=dateFontSize, textAlign=Center, lineHeight=dateFontSize)
2. 农历/节日（条件：`config.showLunar || (config.showFestival && 当天是节日)`）：
   - 距数字 1dp
   - 竖排文字：把农历文本逐字换行（如 "初六" → "初\n六"），**8sp，lineHeight 8sp**，颜色见下表（`CalendarViewKt.VerticalView` :158-231）
3. 班次色块（日期格下半部，见 §2）

### 1.4 农历/节日文字颜色（MonthDateInfo.fetchLunarColor, MonthDateInfo.java:279-291）
| 条件 | 颜色 |
|---|---|
| 节日（holiday） | **ThemeColor #55BB8A** |
| 工作日（work） | **PrimaryColor #1974E8**（蓝色） |
| 其他 | **Color.Gray #888888** |
> 注：传入的 defaultColor 为空串时走上述逻辑。

### 1.5 行间分割线与周间距
- `config.showHLine == true`（默认 true）：每行后 → 间距 **5dp** + **1dp 水平线（surfaceVariant #EEEEEE）+ 间距 5dp**（:1309-1316）
- false：行后间距 **10dp**（:1319）

### 1.6 月份水印大字
- 在月网格 `Box(center)` 中再叠一行：`MyDateTool.getBigMonth(currentDate) + "月"`（如 **"十月"**），**80sp**，颜色 **Color.Gray 10% 透明度**（:1341-1345）
- 层级：先绘制网格 Column，再绘制水印 Text → 水印覆盖在网格之上（半透明，视觉上"穿过"格子）

## 2. 日期格内的班次色块（CalendarDayUi → WorkItemView Size.small）
- 数据：`CalendarDayUi(firstWork, secondWork, remark)`（`views/biz/CalendarDayUi.java`）；由 ViewModel 组装：某日 duty 的 work1/work2（`ScheduleCalendarViewKt.java:162-178`）
- 第一班次：`WorkItemView(work, config.showBeginTime, config.showEndTime, config.workFontSize, config.timeFontSize, config.workRadius, Size.small, padding 3dp, 0, fillMaxWidth)`（:393）
- 第二班次（名称非空）：先 `Blank(2dp)`，再同样一块（:396-397）
- 单块（Size.small）规格（`WorkItemViewKt.java:101-353`）：
  - 圆角 = `config.workRadius`（默认 **"4"** dp，配置 0~10）
  - 背景 = `work.fetchCombineColor()`：普通班次为该班次颜色纯色；组合班次为**左右两色水平渐变**（`ScheduleWork.java:535-544`）
  - 内边距：水平 3dp / 垂直 2dp（:147-148）
  - 内容 Column(center, centerHorizontally)：班次名（**白色 11sp**，居中）+ 可选 开始时间/结束时间（白色 11sp，lineHeight 6sp，高约 13dp）
  - 班次名公式：`fetchShownTime()` 仅在 WholeWorkItem 用；此处日历只显示名称
  - 若名称为空 → 不渲染色块（:318-323）
- 备注（`config.showRemark` 开启时）：`Text(remark, Color.Gray, 8sp, lineHeight 8sp)`（:400-401）

## 3. 星期行（CalendarHeaderView, cn/qsfty/workplan/component/CalendarViewKt.java:50-155）
- Row(fillMaxWidth, SpaceBetween, Top)，7 个 `Text`：weight(1f)，**12sp**，**Color.Gray**，Normal，**居中**
- 文案（`MyDateTool.getMonthHeaderInfo`, MyDateTool.java:477-484）：
  - 周一为周首：**周一 周二 周三 周四 周五 周六 周日**
  - 周日为周首：**周日 周一 周二 周三 周四 周五 周六**
- 周首由 `config.beginDay` 决定（"monday"/"sunday"，默认 **"monday"**）

## 4. 月份横向翻页（ScheduleCalendarView.kt:71-226）
- `LazyRow`：`items(Int.MAX_VALUE)` 无限页，初始 index = Int.MAX/2（:203, :292）
- 每页 `fillParentMaxWidth` + `wrapContentSize`，Box(topCenter) → `ScheduleCalendarMonthView`
- 吸附：`rememberSnapFlingBehavior(lazyListState)`（:204）
- 手势：`pointerInput { detectHorizontalDragGestures(onDragEnd → 若 |拖动| ≥80px 则动画翻页) }`（:249-251, :550-560）——**阈值 80px**
- 页码→月份：`MyDateTool.getStartDayOfMonth(gapMonth(anchor, index-baseIndex))`（:321）
- 当前可见页变化时：LaunchedEffect 更新 `viewModel.currentDate` 并同步 `anchorMonthStart`（:1425-1505）
- 今天是"焦点"：`viewModel.isFocus(date)` = 与 currentDate 同日（ViewModel 方法）

## 5. 底部导航（BottomNavView, ScheduleCalendarView.kt:233-958）
Row 均分三段（Box 双槽布局）：
1. 左组：`Row(clickable)`：`IconView(60000=back, 20sp?, Color.Gray)` + 间距 + `Text("上个月", Color.Gray)` → 切上一月
2. 中：仅当 currentDate ≠ 今天时显示按钮「今天」：**60dp × 30dp**，背景 `mainBg`（圆角），文字 **12sp，DeleteColor #F87679**，居中 → 回到今天
3. 右组：`Text("下个月", Color.Gray)` + 间距 + `IconView(60012=arrow_right, Color.Gray)` → 切下一月
> 上下月图标尺寸：IconView 默认 14sp；代码传 20sp?（:831/:921 参数为 `26` 的 mask，实际字号取默认 14sp 推断）。以视觉"小灰箭头"为准。

## 6. 显示配置对日历的影响（ScheduleConfig，默认值来自 `ScheduleConfig.java:377` 默认构造器）
| 字段 | 默认 | 影响 |
|---|---|---|
| `dateFontSize` | **"17"** | 日期数字字号（联动数字容器高 26/30/34dp、行高 36/38/42dp） |
| `workFontSize` | **"11"** | 日历班次色块文字字号 |
| `timeFontSize` | **"11"** | 班次内时间字号 |
| `workRadius` | **"4"** | 班次色块圆角 |
| `showLunar` | **true** | 显示农历 |
| `showFestival` | **true** | 显示节假日（节日文字绿色） |
| `showBeginTime` | **false** | 班次块内显示开始时间 |
| `showEndTime` | **false** | 班次块内显示结束时间 |
| `showHLine` | **true** | 周间分割线 |
| `showRemark` | **false** | 格内显示备注 |
| `showStat` | **true** | 首页顶部统计色块条 |
| `fillCalendar` | **false** | （填充日历，Widget/统计相关） |
| `beginDay` | **"monday"** | 一周开始日 |
| `protectMode` | **true** | 隐私保护模式 |
| `autoDay` | **"90"** | 周期轮班默认天数 |

## 7. 空态 / 加载态
- 日历无"加载中"状态（数据本地 Room 读取，同步）
- 当月无任何排班 → 日历照常显示空白格，且首页统计行显示「当前月份没有设置排班」（ScheduleHomeViewKt.java:632）
- 桌面小组件读取失败时显示「正在加载」（更新说明提及；推断为 Glance 首帧状态，代码中 `widget/...Kt` 的 loading 分支未逐字节确认）

## 8. HTML 复刻要点
- 建议使用 CSS Grid 7 列 + 每格 `aspect-ratio` 近似：行高 36dp（默认字号 17）；日期数字容器 26dp 高、40/46dp 宽、圆角 8dp。
- "选中日"= 整格淡绿底(#55BB8A@20%)+1px 绿边+6dp 圆角；"今天"= 数字背后 8% 红圆角矩形 + 数字红色加粗。
- 农历竖排：用 `writing-mode: vertical-rl` 或逐字换行（原始实现为逐字换行）。
- 月份水印："十月" 80px 灰 10%，绝对居中，位于网格之上。
- 左右滑动用 CSS scroll-snap（snap 阈值语义不同，可近似）。
