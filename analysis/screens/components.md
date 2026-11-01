# 自研 Compose 组件库规格（HTML 原型复用）

> 来源：`jadx-src/sources/cn/jianyun/workplan/ui/component/**`、`ui/theme/**`。
> 单位：尺寸 dp、字号 sp、颜色 hex。**所有组件均为 App 自研**（除 Material3 基础件）。
> 行号为 jadx .java 行号。

## 1. 设计令牌（theme tokens）

### 1.1 ColorScheme（Material3，仅覆写 8 个槽位）
来源 `ui/theme/ThemeKt.java:33-34` + `ui/theme/ColorKt.java:9-28`，掩码解码得以下映射：

| 槽位 | Light | Dark | 用途 |
|---|---|---|---|
| primary | **#000000** | **#FFFFFF** | 标题文字、普通图标、正文主色 |
| secondary | #222222 | #DDDDDD | 日期数字（非今天）、次要文字 |
| tertiary | #999999 | #888888 | 三级提示文字 |
| background | **#F6F5F4** | **#191919** | 页面背景、底部 tab 背景 |
| onBackground | #000000 | (默认) | — |
| surface | **#FDFDFD** | **#111111** | 卡片/弹窗表面、未选中格子背景 |
| surfaceVariant | **#EEEEEE** | **#222222** | 输入框底、预览画布、分割线、圆图标底 |
| error | #F87679 | #F87679 | 删除色（也用作"今天"标记色） |

### 1.2 App 扩展色（固定值，不随明暗变化；`ui/theme/ColorKt.java`）
| 名称 | Hex | 用途（证据） |
|---|---|---|
| ThemeColor | **#55BB8A** | 品牌绿：选中态、日历选中日背景/边框、"今天""保存"链接、tab 选中图标、VIP 图标、分享高亮 |
| PrimaryColor | #1974E8 | 蓝色（备用强调色；农历"上班"日文字色） |
| DeleteColor | #F87679 | 删除/警告红；"今天"日期字色；今日底色 8% 红 |
| ImportantColor | #EE3F4D | 重要红（会员标签、角标） |
| VipColor | #C5A874 | 会员金 |
| PrivateColor | #806D9E | 私密紫（隐私相关内容） |
| Gray | Color.Gray (#888888) | 通用灰：tab 未选中、说明文字、"×" 关闭 |

### 1.3 字体
- 系统默认字体；`Typography` 仅覆写 **bodyLarge**：16sp / Normal / lineHeight 24sp / letterSpacing 0.5sp（`ui/theme/TypeKt.java:36`）。
- 图标：**Remix Icon** 字体 `R.font.remixicon`（`TypeKt.java:37`），通过单字符文本渲染；码点表见 `ui/component/nav/IconFont.java`：
  `home=60959, sun=61887, alarm=59931, stat=60062, user=62038, settings=61668, list=62361, back=60000, right2=59988, arrow_right=60012, add=59923, clear=60313, refresh=61540, share=61694, cloud=60317, download=60500, vip=62096, thumb=61959, image=61003, palette=61381, time=61967, calendar=60193, warning/alert=62341, info=61017, doc=61849, folder=60778, filter=60711` 等。
- 中文文字普遍使用 **FontWeight.Medium（常规条目）/ Bold（标题数字）**。

## 2. 布局与容器（ui/component/nav/HeaderViewKt.java）

| 组件 | 规格 | 证据 |
|---|---|---|
| `HeaderTitle(title)` | 文字居中（fillMaxSize + wrapContent*），颜色 = primary，**16sp Bold**（继承 bodyLarge） | :2919-2935 |
| `HeaderView(title, backAction?, rightTool?)` | Box(fillMaxWidth, **height 48dp**, topStart)：居中标题 + Row(fillMaxSize, spaceBetween, centerVertically) 左返回 / 右工具 | :3004-3236 |
| 返回按钮 | `HeaderIcon(IconFont.back=60000)`：**36dp 圆形**（radius 18dp）热区，图标 **20sp**，颜色 primary | :3174 + :22155-22167 |
| `PageView(nav, title, rightTool?, backAction?, content)` | Scaffold + Column(背景 background) → HeaderView → **Column(verticalScroll, padding horizontal 10dp)** → content → LoadingDialog + BackHandler。**push 页标准容器** | :74-238 |
| `LazyAppPageView(nav, title, rightTool?, body)` | 同 PageView，内容为 LazyColumn（大列表页） | :1340 |
| `SimpleSubAppPageView(nav, header?, headerTitle, body)` | Column → `SubAppHeaderView`（**height 48dp**，spaceBetween：header 自定义区 + 居中标题）→ Column(verticalScroll, padding bottom 80dp) body。**Tab 页标准容器（无返回箭头）** | :7103-7280 / :6040 |
| `SelfHeaderView(backAction?, rightTool?, content)` | 48dp 自定义头部（无标题），右侧 padding 10dp；用于「班次」tab 的 班次/轮班切换行 | :5307 |
| `PageWithFooterView(...)` | PageView + 固定底部 footer（高 50dp 按钮区） | 项目管理 |
| `AppHeaderView / BigHeaderView / HeaderTitle / SinglePageView / SelfPageView / WithFooterView` | 其它变体，本 App 基本未用 | :4644 / :2549 / :2713 |

## 3. 导航条目（ui/component/nav/NavItemViewKt.java + IconViewKt.java）

### NavItemView(label, iconCode, selected, modifier, onClick) — 底部 tab 条目
- 容器：Column(centerHorizontally)，`radius(8dp)`，clickable，**padding vertical 10dp**，由调用方给 `weight(1f)`。
- 图标：`IconView(icon, 20sp, color = selected ? ThemeColor : Color.Gray)`（:196）
- 文案：10sp Medium，lineHeight 10sp，同色（:199）
- 5 个 tab：排班(home 60959) / 班次(sun 61887) / 提醒(alarm 59931) / 统计(stat 60062) / 我的(user 62038)

### IconView(iconCode, fontSize=14sp, color=colorScheme.primary, isFont=true, modifier)
- 用 Remix 字体把码点渲染成图标字形（`IconViewKt.java:82`）

### CircleIconView(iconCode, bg?, size=默认~32dp, color=primary?, ...)
- 圆形底（surfaceVariant） + 居中图标；尺寸缺省 32dp（`IconViewKt.java:1313-1500`）；用于月份左右箭头（IconFont.right2 59988，左箭头 rotate 180°）

### HeaderIcon(iconCode, size=36dp, fontSize=20sp, onClick)
- 圆形热区（radius 一半），Row(center,centerVertically) 居中图标，默认色 primary（`BoxViewKt.java:22099-22230`）
- 首页右上角用法：`HeaderIcon(62361=IconFont.list)` 切换排班项目；`HeaderIcon(61668=IconFont.settings)` 打开日历显示设置

## 4. 卡片/分组（ui/component/form/GroupViewKt.java）

| 组件 | 规格 |
|---|---|
| `GroupView(...)` (:120) | `fillMaxWidth` → 裁剪圆角 **10dp** → 背景 `surface`（z=true 时 surfaceVariant） → 可选 **2dp ThemeColor 边框**（选中态 z2=true） → 内边距（默认约 vertical 10dp / horizontal 5dp，高 15dp 等由调用方覆盖） → Column。列表卡片默认卡片间距 10dp |
| `SettingGroupView(...)` (:5671) | 设置页分组卡（同 GroupView 外观，内部条目常自带下分割线） |
| `CenterGroupView(...)` (:8473) | 内容居中的卡片（预览用） |
| `ZeroGroupView(...)` (:14647) | 无内边距卡片（配置面板容器） |
| `GroupTitleView(title, topPadding?, ...)` (:14864) | 卡片上方小节标题：标题 + 可选右侧内容 + 卡片内容。首页「yyyy-MM-dd班次」「yyyy-MM-dd备注」用它 |
| `BlockView(label, ...)` (:3950) | 灰底说明块（小组件页面提示） |
| `ListDataView(list, emptyInfo?, paddingBottom?, end?, before?, itemContent)` (HeaderViewKt: 列表) | LazyColumn + 空态；用于选择班次弹窗、FAQ 列表 |

## 5. 表单条目（ui/component/form/FormItemKt.java）

| 组件 | 视觉 | 证据 |
|---|---|---|
| 行高 | 标准条目 **约 50dp**，左 label（primary，15sp），右 value（secondary，15sp）+ 可选箭头 | FormItem.kt |
| `LabelItemView` / `ShownItemView` | 纯文本行 |  |
| `ValueItemView` / `Value2ItemView` | label + value + 右箭头（点击） |  |
| `ColorValueItemView` | label + 色块 value |  |
| `LinkItemView(label)` | 设置页链接行（label + 右箭头） | 「我的排班项目」「常见问题解答」等 |
| `InputItemView(label, value, suggestions?, ...)` | 单行输入（right 对齐），可带快捷标签列表 | 班次名称、昵称 |
| `InnerInputItemView` | 内嵌输入（多行/特殊） |  |
| `InputNumberView(label, z, z2, str, ..., value, ..., 快捷值 list)` | 数字加减器 + 单位 + 快捷数字 chip | 周期轮班天数（30/60/90/180/365） |
| `AdderView / FloatAdderView` | - 数字 + / - 步进器（float 用于透明度 0~1） | 小组件透明度 |
| `SwitchItemView(label, checked)` | 右置 Material Switch（开=ThemeColor） | 显示农历/节假日等 |
| `SelectItemView(label, value, options)` | 点击弹底部选择列表 | 字号、手机品牌 |
| `MultiSelectItemView` | 多选弹窗 |  |
| `SegmentItemView(label, width=60dp, value, options)` | label + 分段选择（如 周一/周日） | 「一周开始日」 |
| `SegmentPickerView(value, options, ...)` | 整行分段选择器（无 label，胶囊） | 班次/轮班切换、普通/组合班次、分享/导入 |
| `TimePickerItemView3(label, value)` | 时间选择（HH:mm） | 开始/结束/提醒时间 |
| `TimePeriodPickerItemView3` | 时间段 |  |
| `DatePickerItemView / LunarDatePickerItemView` | 日期选择（含农历） |  |
| `DoublePickerItemView` | 双列选择 |  |
| `ColorSelectItemView(label, value)` | 颜色选择（点击打开调色盘） | 班次颜色、小组件配色 |
| `RepeatConfigItemView` | 重复配置 |  |
| `SheetButtonView` | 弹出底部选择 |  |

### 5.1 颜色选择器（FormItemKt.ShowColorPickerView, FormItem.kt:2210）
- 底部弹出面板：顶部 SegmentPicker「中国色 / 自定义 / 我收藏的」（`SelectUtil.COLOR_MODES`）
- **中国色色板来自 assets/data/color.json：230 个传统色**，字段 `{name, color, catalog}`，catalog 0-7 分组（如 0=红系…7=灰褐系）；示例：香叶红 #F07C82、玉红 #C04851、茶花红 #EE3F4D…
- 自定义：`#RRGGBB` 手动输入 + 收藏、收藏颜色列表、彩色渐变预览条
- 选中态打勾，颜色值以 `#RRGGBB` 字符串存进模型（`CommonToolKt.color()` 解析，非法→灰）

## 6. 按钮（ui/component/form/ButtonViewKt.java）

| 组件 | 视觉 |
|---|---|
| `LongOkButton(text)` | 通栏主按钮：高约 50dp、圆角约 10dp、背景 **ThemeColor**、白字 16sp、居中；页面底部「保存」「确定导入」 |
| `LongCancelButton(text)` | 通栏次按钮：背景 **surface**（卡片色）、primary 字，其余同上；「开启排班」「清空…」「第二班次」等 |
| `LongDeleteButton(text?)` | 通栏删除按钮：红文字/红底（DeleteColor），「删除」 |
| `LongPrivateButton` | 通栏私密色按钮（PrivateColor） |
| `LongVipButton` | 通栏 VIP 金色按钮（VipColor） |
| `OkButton / Cancel2Button` | 小尺寸按钮（弹窗内） |
| `DoubleButtonGroup(text1, text2, ...)` | 双按钮并排（取消/确定） |
| `OkAndDeleteButtonGroup` | 删除 + 确定并排 |
| `DeleteOrHideButton` | 删除/隐藏 |
| `OkAndCancelButtonGroup` | 如项目管理「添加项目 / 项目排序」 |
| `tap(...)` 扩展 | 点击水波纹（无 ripple） |

## 7. 弹窗 / 浮层（ui/component/form/DialogViewKt.java、ButtonViewKt.java、ui/component/bottomdialog/）

| 组件 | 规格 |
|---|---|
| `SelfDialog / FullDialog` | 居中卡片弹窗 / 全屏弹窗（会员页用 FullDialog）；圆角 12-16dp |
| `TipDialog(title, message, ok)` | 标题 + 正文 + 单个确认；网络断开/升级提醒 |
| `ConfirmDialog(title, msg, okText, cancelText, ...)` | 双按钮确认 |
| `DeleteDialog(msg)` | 红色删除确认 |
| `LoadingDialog` | 全局 loading（PageView 内默认挂载） |
| `SheetDialog(title, sheets: List<SheetModel>)` | 底部动作表；SheetModel(text, color, bold)；如项目管理「切换为当前项目/编辑项目名称/删除项目」 |
| `SortDialogView(title, options, ...)` | 拖拽排序弹窗（DragDropColumn） |
| `WeekChooseDialog` | 周选择 |
| `WelcomeDialog / UpdateIntroDialog` | 首启欢迎 / 版本更新说明 |
| `BottomDialogView(title, ...)`（DialogViewKt,m6840） | 通用底部弹窗：标题行 + 内容 + 底部按钮；高度可指定（选择班次 500dp、选择月份 300dp、日历显示设置 auto） |
| `BottomSheetDialogView`（BottomSheetDialogViewKt） | 底部操作面板（ScheduleOperView 用），含拖拽把手、白色卡片圆角顶部 |
| `ShowInputDialog` | 底部输入弹窗（备注、项目名） |

## 8. 图表（ui/graph/）

| 组件 | 规格 |
|---|---|
| `PieGraph(id, PieGraphData)` | AndroidView 包 razerdp `AnimatedPieView`：**高 280dp**、左右 padding 10dp；数据项 `SimplePieInfo(name, value, color, label)`；下方 legend 每行：12dp 色块（圆角 3dp）+ 名称+数值；空数据→"暂无数据"（PieGraph.kt:43, 176-337） |
| `GraphLineView / GraphBarView / GroupLineView / GroupBarView` | 折线/柱状图（统计页旧版可能未用） |
| `AnimatedPieView`（plugin/razerdp） | 第三方饼图控件（Apache 2.0），App 直接复用 |

## 9. 其它自研件

| 组件 | 说明 |
|---|---|
| `MonthChooseView(beginDay, fontSize=18sp, showNav=true)`（ui/component/nav/MonthChooseViewKt.java:143） | 月份标题组件：左箭头（CircleIconView right2 rotate180，仅 showNav）+ 标题（"yyyy年MM月"，ThemeColor 或 primary，可点开「选择月份」弹窗 300dp）+ 右箭头。首页用 fontSize=18sp、showNav=false（由手势滑动切月，BottomNavView 提供上/今天/下月） |
| `YearChooseView`（:9810） | 年份选择竖列 |
| `DateRangeChooseView(rangeDate, clearable, mini, future, onChange)`（:10283） | 日期区间选择（统计页）：开始日期 + "至" + 结束日期 |
| `DragDropColumn / RememberDragDropState`（ui/component/sort） | 拖拽排序列表（排序弹窗） |
| `SwipeRowView`（ui/component/nav/SwipeRowViewKt） | 左滑出现删除按钮（项目管理列表） |
| `SecretCheckView` | 密码/隐私锁校验（应用锁） |
| `WheelPicker / FWheelPicker`（ui/component/form/picker） | iOS 风格滚轮选择器（日期、时间） |
| `lunar/ChineseCalendar + GregorianLunarCalendarView + NumberPickerView` | 中国农历转换与日期选择（Android View 体系，非 Compose） |
