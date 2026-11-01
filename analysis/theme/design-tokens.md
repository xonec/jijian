# 极简排班 3.5.0 · 设计令牌（Design Tokens）

> 目标 App：极简排班 cn.jianyun.workplan 3.5.0 (versionCode 36, minSdk 26 / targetSdk 33)
> 事实来源：jadx 1.5.6 反编译 Java/Kotlin 源码 + apktool 3.0.3 解码资源 + aapt2 资源表(/tmp/res.txt)。每条结论附 evidence。

## 0. 结论速览

1. **调色板不在 res/values/colors.xml，而在 Kotlin 的 cn.jianyun.workplan.ui.theme.ColorKt**（20 个 Color(0xFF...) 常量）；Material3 lightColorScheme / darkColorScheme 在 ThemeKt.java 中按位置参数覆盖。
2. **唯一强调色 = ThemeColor #55BB8A（麦苗绿）**，被 100+ 处组件直接使用（按钮、选中态、图标、小组件标题栏默认色、App 图标底色）。
3. **明暗两套语义色**：亮色背景 #F6F5F4 / 卡片面 #FDFDFD / 选中面 #EEEEEE / 文字 #000000·#222222·#999999；暗色背景 #111111 / 面 #191919 / 选中面 #222222 / 文字 #FFFFFF·#DDDDDD·#888888。删除/错误统一 #F87679。
4. **排版**：系统默认字体；仅覆盖 Material3 bodyLarge = 16sp / Normal / lineHeight 24sp / letterSpacing 0.5sp。界面实测最常用 12/13/15sp 正文、20sp 标题；字重 Medium(500) 最多。
5. **全部图标来自 Remix Icon v4.3 子集字体** res/font/remixicon.ttf（87 个 codepoint），79 个 IconFont 常量全部命中；已生成可直接引用的 icon-font.css / icon-map.json。
6. **主题色可变性核查**：ColorKt 的 Light*/Dark* 字段带 setter，但反编译代码中**没有任何调用方**；3.5.0 中 App 整体换肤未接线（详见 2.9 节）。可变色能力实际用于**班次颜色 + 桌面小组件颜色**（230 个中国色预设）。

## 1. 证据与方法

| 输入 | 路径 | 提供的令牌 |
|---|---|---|
| Compose 调色板 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java | 20 个颜色常量（含明暗系统） |
| Material3 主题 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ThemeKt.java | light/dark ColorScheme 槽位映射、状态栏/导航栏取色 |
| 排版 | jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java | Typography（仅 bodyLarge 覆盖）、remixicon FontFamily |
| 图标码点 | jadx-src/sources/cn/jianyun/workplan/ui/component/nav/IconFont.java | 79 个 name→codepoint |
| 图标字体 | decoded/res/font/remixicon.ttf | 87 个实际字形（fontTools cmap 校验） |
| 小组件配置 | jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java、DefaultWidgetConfig.java | 亮/暗各 6 色 + 透明度 + 字号/开关默认值 |
| 选项枚举 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java | 44 组选项（主题模式、班次类型、颜色模式…） |
| 中国色预设 | decoded/assets/data/color.json | 230 色 / 8 组 |
| res 解码 | decoded/res/values*/、values-night/ | splash 背景色、App 主题、App 自有 drawable/layout/xml |
| 资源表 | /tmp/res.txt（aapt2 dump resources） | 7426 条资源（含 density 变体）→ 混淆名映射，见 resource-map.tsv |

## 2. 颜色

### 2.1 品牌/语义色（ColorKt.java，全量 20 项）

| Token | 值 | 用法（代码实证） | 证据 |
|---|---|---|---|
| ThemeColor | #FF55BB8A | 强调色：按钮/选中态/图标/小组件标题栏默认色/App 图标绿 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:10 |
| PrimaryColor | #FF1974E8 | 补贴(蓝)、次要强调 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:11 |
| DeleteColor | #FFF87679 | 删除、扣款、错误 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:12 |
| ImportantColor | #FFEE3F4D | 重要/警示红（= 中国色 茶花红 #EE3F4D） | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:13 |
| VipColor | #FFC5A874 | 会员 VIP 金 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:14 |
| PrivateColor | #FF806D9E | 私密/加密紫 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:9 |
| LightBg0Color | #FFFDFDFD | 亮色 surface（卡片/面板面） | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:15 |
| LightBgColor | #FFF6F5F4 | 亮色 background（页面底） | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:16 |
| LightSelectColor | #FFEEEEEE | 亮色选中/悬浮面 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:17 |
| LightPrimaryColor | #FF000000 | 亮色主文字色（也作 Material3 primary） | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:18 |
| LightSecondColor | #FF222222 | 亮色次文字色 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:19 |
| LightThirdColor | #FF999999 | 亮色三级/提示文字色 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:20 |
| LightDeleteColor | #FFF87679 | 亮色 error | ColorKt.java:21 |
| DarkBg0Color | #FF111111 | 暗色 background | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:22 |
| DarkBgColor | #FF191919 | 暗色 surface | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:23 |
| DarkSelectColor | #FF222222 | 暗色选中/悬浮面 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:24 |
| DarkPrimaryColor | #FFFFFFFF | 暗色主文字色 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:25 |
| DarkSecondColor | #FFDDDDDD | 暗色次文字色 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:26 |
| DarkThirdColor | #FF888888 | 暗色三级文字色 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:27 |
| DarkDeleteColor | #FFF87679 | 暗色 error | ColorKt.java:28 |

### 2.2 明暗语义对照 + 其他 App 自有色

| 语义 | Light | Dark | 证据 |
|---|---|---|---|
| 页面背景 background | #FFF6F5F4 | #FF111111 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:16 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:22 |
| 卡片/容器 surface | #FFFDFDFD | #FF191919 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:15 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:23 |
| 选中/悬浮面 surfaceVariant | #FFEEEEEE | #FF222222 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:17 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:24 |
| 主文字 | #FF000000 | #FFFFFFFF | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:18 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:25 |
| 次文字 | #FF222222 | #FFDDDDDD | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:19 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:26 |
| 三级/提示文字 | #FF999999 | #FF888888 | jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:20 / jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:27 |
| 删除/错误 | #FFF87679 | #FFF87679 | ColorKt.java:21,28 |
| 分割线 colorDivider | #FFE5E5E5 | — | decoded/res/values/colors.xml |
| 启动屏背景 color/screen | #FFFFFFFF | #FF111111 | decoded/res/values/colors.xml:170 / values-night/colors.xml:30 |
| 小组件图例文字 | #FF767676 | — | decoded/res/layout/widget_circle_pie_legends.xml |

### 2.3 Material3 ColorScheme 映射（ThemeKt.java:40-41）

WorkplanTheme 虽接收 dynamicColor 参数，但 SDK>=31 分支最终仍使用固定 scheme（未看到 dynamicLightColorScheme 调用），因此配色固定。下表为位置参数语义（其余槽位取 Material3 默认值）：

| M3 槽位 | Light | Dark |
|---|---|---|
| primary | LightPrimaryColor #FF000000 | DarkPrimaryColor #FFFFFFFF |
| secondary | LightSecondColor #FF222222 | DarkSecondColor #FFDDDDDD |
| tertiary | LightThirdColor #FF999999 | DarkThirdColor #FF888888 |
| background | LightBgColor #FFF6F5F4 | DarkBg0Color #FF111111 |
| onBackground | LightPrimaryColor #FF000000 | 默认（推断 #FFE6E1E5） |
| surface | LightBg0Color #FFFDFDFD | DarkBgColor #FF191919 |
| onSurface | 默认（推断 #FF1C1B1F） | 默认（推断 #FFE6E1E5） |
| surfaceVariant | LightSelectColor #FFEEEEEE | DarkSelectColor #FF222222 |
| error | LightDeleteColor #FFF87679 | DarkDeleteColor #FFF87679 |

代码中 ColorScheme getter 使用次数（jadx 全工程统计）：getSurface 714、getPrimary 399、getTertiary 195、getBackground 188、getSurfaceVariant 149、getSecondary 13、getError 8。**即：primary/secondary/tertiary 三槽位被当作文字色使用**（这解释了为何 primary 亮色是黑色、暗色是白色）。

### 2.4 标签/班次默认色（SelectUtil.DEFAULT_TYPES）

| key | 标签 | 色值 | 证据 |
|---|---|---|---|
| sign | 打卡 | #FF776AD4 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27 |
| award | 补贴 | #FF1974E8 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27 |
| fine | 扣款 | #FFF87679 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27 |

### 2.5 桌面小组件默认配色（WidgetConfig，亮/暗两套）

| 字段 | 亮色默认 | 暗色默认 | 含义 |
|---|---|---|---|
| headerBg | #FF55BB8A | #FF22352D | 标题栏背景 |
| headerTextColor | #FFFFFFFF | #FFFFFFFF | 标题栏文字 |
| bgColor | #FFFFFFFF | #FF141414 | 日历主体背景 |
| textColor | #FF111111 | #FFF5F5F5 | 日期文字 |
| tintColor | #FF111111 | #FFD8D8D8 | 农历/次要文字 |
| markColor | #FF111111 | #FFD8D8D8 | 备注文字 |
| headerOpacity | 1.0 | — | 标题栏不透明度 |
| opacity | 1.0 | — | 主体不透明度 |
| dateFontSize / workFontSize / timeFontSize | 17 / 11 / 11 (sp) | — | 小组件字号 |
| todayBorder | #FFEE4863 | — | 今日日期格 2dp 描边（widget_today.xml, radius 6dp） |

开关默认：mondayFirst=true（周一为首日）、showLunar=true（显示农历）、showFestival=true（显示节日）；showRemark/showBeginTime/showEndTime/showLine=false。证据：WidgetConfig.java:341；AppWidgetInfo：decoded/res/xml/app_widget.xml（min 320x180dp、可调整大小、updatePeriodMillis=30min）。

### 2.6 小组件预览图采样（对照用）

APK 内置预览图 assets_extracted/widget/quick.png (452x466) 是真实小组件样式，主色采样（图像有压缩噪点，仅参考）：

| 区域 | 采样值 | 最近的中国色 |
|---|---|---|
| 标题栏 | #4AB380 系 | 麦苗绿 #55BB8A / 蛙绿 #45B787 |
| 白班色块 | #1A67AC 系 | 靛青 #1661AB |
| 夜班色块 | #5A5893 系 | 野菊紫 #525288 / 山梗紫 #61649F |
| 休息色块 | 绿 | 麦苗绿 #55BB8A / 蛙绿 #45B787 |
| 主体背景 | #FFFFFF | — |

> 班次色为用户可配置（IosWorkPlanDO.color/bgColor 为字符串），预览图展示作者配置的一套样例；代码默认值见 2.4/2.5 节。

### 2.7 中国色预设（assets/data/color.json → 230 色 / 8 组）

| catalog | 推断色系 | 数量 | 代表色（名称 #hex） |
|---|---|---|---|
| 0 | 红/粉 色系 | 51 | 香叶红 #F07C82，玉红 #C04851，茶花红 #EE3F4D，高粱红 #C02C38 … |
| 1 | 橙 色系 | 6 | 橙皮黄 #FCA104，淡橘橙 #FBA414，橘橙 #F97D1C，美人焦橙 #FA7E23 … |
| 2 | 黄 色系 | 23 | 橄榄黄绿 #BEC936，谷黄 #E8B004，土黄 #D6A01D，虎皮黄 #EAAD1A … |
| 3 | 绿 色系 | 38 | 石绿 #57C3C2，美蝶绿 #12AA9C，蓝绿 #12A182，竹绿 #1BA784 … |
| 4 | 青/靛 色系 | 9 | 青蛤壳紫 #BC84A8，青莲 #8B2671，青灰 #2B333E，钢青 #142334 … |
| 5 | 蓝 色系 | 31 | 淡蓝紫 #A7A8BD，燕颔蓝 #131824，暗蓝 #101F30，海涛蓝 #15559A … |
| 6 | 紫 色系 | 38 | 暗玉紫 #5C2223，栗紫 #5A191B，葡萄紫 #4C1F24，茄皮紫 #2D0C13 … |
| 7 | 灰/褐 色系 | 34 | 锌灰 #7A7374，鼠背灰 #73575C，芦灰 #856D72，苍蝇灰 #36282B … |

已复制到 assets_extracted/palette/color.json，原型取色器可直接 fetch。App 内使用位置：FormItemKt.ShowColorPickerView（读取 assets/data/color.json），模式 = 中国色 / 自定义 / 我收藏的（SelectUtil.COLOR_MODES）；用于班次颜色（SchduleWorkEditViewKt.java:724 班次颜色）与小组件颜色（WidgetConfigViewKt 12 个颜色项）。

### 2.8 res 中的 App 自有颜色

| 资源 | 值 | 用途 | 证据 |
|---|---|---|---|
| color/screen | #FFFFFFFF (night #FF111111) | 启动屏 window 背景 | decoded/res/values/colors.xml:170; values-night/colors.xml:30 |
| colorPrimary | #FF000000 | AppCompat 主题（Compose 不使用） | decoded/res/values/colors.xml |
| colorAccent | #FFD81B60 | 同上（默认品红，未在 UI 出现） | decoded/res/values/colors.xml |
| colorDivider | #FFE5E5E5 | 分割线 | decoded/res/values/colors.xml |

其余 350+ 条颜色资源全部来自三方库（tt_/mtrl_/glance_/design_/material_/beizi_/tianmu_/adgain_ 等），见 resource-map.tsv 的 ownership=thirdparty/unknown。

### 2.9 主题色可变性核查（重要）

- 事实 A：ColorKt.java:18-28 中 LightPrimaryColor / LightSecondColor / LightThirdColor / LightDeleteColor / Dark* 是 Kotlin var，编译生成 8 个 setter（如 m6936setLightPrimaryColor8_81llA）。
- 事实 B：在 jadx 全量源码（约 18130 个类）中搜索这 8 个 setter，**除 ColorKt 自身定义外无任何调用方**。
- 事实 C：ThemeKt.LightColorScheme/DarkColorScheme 是 static final，在类初始化时一次性读取这些字段构造 ColorScheme。
- 结论（推断，证据见上）：3.5.0 中不存在 App 整体换肤（改强调色）的有效接线；强调色固定 #55BB8A。可变色能力落在班次颜色/小组件颜色（color.json + ColorModel）。
- 相关设置项：SelectUtil.THEMES = 亮白主题/light、暗黑主题/dark、追随系统/auto（颜色模式），位于设置页；没有"主题色选择"入口的直接证据。
- 若后续要复刻换肤，建议把 ThemeColor 作为 CSS 变量 --color-themeColor，并把明暗两套基础色暴露为 [data-theme] 变量（见 design-tokens.css）。

## 3. 排版 Typography

| 项 | 值 | 证据 |
|---|---|---|
| 正文字体 | 系统默认字体 FontFamily.Default | TypeKt.java:35 |
| bodyLarge 覆盖 | fontSize 16sp / FontWeight.Normal(400) / lineHeight 24sp / letterSpacing 0.5sp | TypeKt.java:36 |
| 字重使用 | Medium(500) 160 次 > Normal(80) > Bold(75) | jadx-src 统计 |
| 字号使用前 10 | 12.0sp×413、13.0sp×296、15.0sp×292、11.0sp×133、14.0sp×119、20.0sp×104、16.0sp×87、10.0sp×78、30.0sp×16、18.0sp×12 | jadx-src TextUnitKt.getSp(N) 统计 |
| 小组件字号 | 日期 17sp / 班次 11sp / 时间 11sp | WidgetConfig.java:341 |
| 图例文字 | 14sp #767676 | decoded/res/layout/widget_circle_pie_legends.xml |

实现建议：原型 body = 15px / line-height 1.5；次要 = 13px；说明 = 12px；标题 = 20px Medium。Material3 其余字号使用默认值（未覆盖）。

## 4. 圆角 Radius

| Token | 值 | 依据 |
|---|---|---|
| xs | 4dp | RoundedCornerShape 使用 62 次 |
| sm | 6dp | 小组件日期格 corners=6dp（widget_today.xml） |
| md | 10dp | 63 次 |
| lg | 12dp | **最高频 149 次**（卡片/弹窗/输入框） |
| xl | 20dp | 81 次（大卡片/面板/按钮） |
| pill | 999dp | 胶囊按钮（自定义，见按钮组件） |

统计来源：jadx-src/sources/cn/jianyun/** 中 RoundedCornerShape0680j_4(Dp.m6097constructorimpl(N)) 字面量。

## 5. 间距 Spacing

| 场景 | 值 | 依据 |
|---|---|---|
| Padding 高频 | 5dp(175次)、2dp(157)、10dp(141)、8dp(67)、12dp(38)、4dp(19) | PaddingKt.*(Dp) 近似统计(901 样本) |
| Size 高频 | width/height 50dp(215)、40dp(68)、12dp(32)、38dp(31) | SizeKt.(width|height) 统计 |

App 实际采用 **5/10dp 为主的紧凑节奏**（不是严格的 4/8 栅格）；组件内边距常用 10dp，行内间距 5dp，页面边距 12dp。原型可按 --space-1:5px / --space-2:10px / --space-3:12px / --space-4:20px 编排。

## 6. 阴影/描边

- 未发现自定义 shadow / elevation 常量；Compose 使用 Material3 默认 elevation + Modifier.border 描边。
- 小组件：widget_today.xml（2dp 描边 #EE4863，圆角 6dp）、widget_otherday.xml（2dp 透明描边，圆角 6dp）。
- 预览图显示小组件整体为圆角卡片 + 外部投影（启动器绘制），原型可用 CSS border-radius:16px; box-shadow:0 8px 24px rgba(0,0,0,.12) 近似。

## 7. 字体与图标（Remix Icon 子集）

- 文件：decoded/res/font/remixicon.ttf → 已复制 assets_extracted/fonts/remixicon.ttf（17KB）。
- 版本：Remix Icon v4.3（TTF name 表）；字体 cmap 共 87 个 codepoint；IconFont.java 定义 79 个常量，全部命中（79/79），另有 11 个字体码点未被常量引用。
- Kotlin 侧：TypeKt.remixicon = FontFamily(Font(R.font.remixicon))，组件 IconView 用 Text(IconFont.xxx, fontFamily=remixicon) 渲染。
- 生成物：assets_extracted/fonts/icon-font.css（@font-face + .ri-<name>::before）、icon-map.json（name→codepoint/glyphName）、icon-sheet.html（可视图）。

| 别名 | 说明 |
|---|---|
| apps | catalog (同码点 0xEA42) |
| box_none | product (同码点 0xF3A7) |
| list | list_indefinite (同码点 0xF379) |

字体中存在但 IconFont 未引用的码点（可能是未使用的子集字形，或旧版本残留）：

| codepoint | glyph name |
|---|---|
| U+EA0F | add-box-line |
| U+EA48 | archive-line |
| U+EB7F | checkbox-blank-line |
| U+EB9F | cloud-off-line |
| U+EF76 | more-2-fill |
| U+F009 | play-circle-line |
| U+F011 | play-list-line |
| U+F3A1 | prohibited-line |
| U+F3A9 | inbox-2-line |
| U+F40B | flower-line |
| U+F4DF | function-add-line |

### 7.1 图标全表（79 个，按 IconFont.java 常量名排序）

| CSS 类 | 常量 | codepoint | glyph name |
|---|---|---|---|
| .ri-add | IconFont.add | U+EA13 | add-line |
| .ri-add2 | IconFont.add2 | U+ED5A | folder-add-line |
| .ri-adjust | IconFont.adjust | U+EA62 | arrow-left-right-line |
| .ri-alarm | IconFont.alarm | U+EA1B | alarm-line |
| .ri-alert | IconFont.alert | U+F385 | megaphone-line |
| .ri-apps | IconFont.apps | U+EA42 | apps-2-line |
| .ri-arrow_right | IconFont.arrow_right | U+EA6C | arrow-right-line |
| .ri-award | IconFont.award | U+EA8A | award-line |
| .ri-back | IconFont.back | U+EA60 | arrow-left-line |
| .ri-back2 | IconFont.back2 | U+EA58 | arrow-go-back-line |
| .ri-batchAdd | IconFont.batchAdd | U+F4C6 | apps-2-add-line |
| .ri-box_none | IconFont.box_none | U+F3A7 | archive-2-line |
| .ri-calendar | IconFont.calendar | U+EB21 | calendar-2-line |
| .ri-catalog | IconFont.catalog | U+EA42 | apps-2-line |
| .ri-change | IconFont.change | U+F477 | exchange-2-line |
| .ri-chart | IconFont.chart | U+EA96 | bar-chart-2-line |
| .ri-check | IconFont.check | U+EB7B | check-line |
| .ri-clear | IconFont.clear | U+EB99 | close-line |
| .ri-cloud | IconFont.cloud | U+EB9D | cloud-line |
| .ri-cloud2 | IconFont.cloud2 | U+F24E | upload-cloud-line |
| .ri-cloud3 | IconFont.cloud3 | U+F442 | folder-cloud-line |
| .ri-computer | IconFont.computer | U+EBCA | computer-line |
| .ri-copy | IconFont.copy | U+ECD5 | file-copy-line |
| .ri-delete_bin | IconFont.delete_bin | U+EC2A | delete-bin-line |
| .ri-doc | IconFont.doc | U+F199 | sticky-note-2-line |
| .ri-down | IconFont.down | U+EA4E | arrow-down-s-line |
| .ri-down2 | IconFont.down2 | U+EA50 | arrow-drop-down-line |
| .ri-down3 | IconFont.down3 | U+EA4F | arrow-drop-down-fill |
| .ri-download | IconFont.download | U+EC54 | download-2-line |
| .ri-file | IconFont.file | U+ECC5 | file-3-line |
| .ri-file_download | IconFont.file_download | U+ECD9 | file-download-line |
| .ri-file_image | IconFont.file_image | U+F3C5 | file-image-line |
| .ri-file_zip | IconFont.file_zip | U+ED1F | file-zip-line |
| .ri-filter | IconFont.filter | U+ED27 | filter-line |
| .ri-flashlight | IconFont.flashlight | U+ED3D | flashlight-line |
| .ri-folder | IconFont.folder | U+ED6A | folder-line |
| .ri-folder_download | IconFont.folder_download | U+ED60 | folder-download-line |
| .ri-gift | IconFont.gift | U+EDB9 | gift-2-line |
| .ri-home | IconFont.home | U+EE1F | home-5-line |
| .ri-image | IconFont.image | U+EE4B | image-line |
| .ri-infinite | IconFont.infinite | U+F3B9 | infinity-line |
| .ri-info | IconFont.info | U+EE59 | information-line |
| .ri-info2 | IconFont.info2 | U+F169 | spam-2-line |
| .ri-lightbulb_flash | IconFont.lightbulb_flash | U+EEA8 | lightbulb-flash-line |
| .ri-list | IconFont.list | U+F399 | list-indefinite |
| .ri-list_indefinite | IconFont.list_indefinite | U+F399 | list-indefinite |
| .ri-mobile | IconFont.mobile | U+F15A | smartphone-line |
| .ri-money | IconFont.money | U+EF61 | money-cny-circle-line |
| .ri-more1 | IconFont.more1 | U+EF77 | more-2-line |
| .ri-more2 | IconFont.more2 | U+EF79 | more-line |
| .ri-move | IconFont.move | U+EA70 | arrow-right-up-line |
| .ri-notification | IconFont.notification | U+EF94 | notification-3-line |
| .ri-palette | IconFont.palette | U+EFC5 | palette-line |
| .ri-password | IconFont.password | U+EECE | lock-line |
| .ri-paste | IconFont.paste | U+ECEF | file-list-3-line |
| .ri-pencil | IconFont.pencil | U+EFE0 | pencil-line |
| .ri-product | IconFont.product | U+F3A7 | archive-2-line |
| .ri-questionnaire | IconFont.questionnaire | U+F048 | questionnaire-line |
| .ri-random | IconFont.random | U+F3FD | dice-5-line |
| .ri-refresh | IconFont.refresh | U+F064 | refresh-line |
| .ri-remove | IconFont.remove | U+EC1A | delete-back-2-line |
| .ri-resize | IconFont.resize | U+ED8C | font-size-2 |
| .ri-right | IconFont.right | U+EA6E | arrow-right-s-line |
| .ri-right2 | IconFont.right2 | U+EA54 | arrow-drop-right-line |
| .ri-right3 | IconFont.right3 | U+EA53 | arrow-drop-right-fill |
| .ri-school | IconFont.school | U+F35A | school-line |
| .ri-search | IconFont.search | U+F3D1 | menu-search-line |
| .ri-search2 | IconFont.search2 | U+F0D1 | search-line |
| .ri-settings | IconFont.settings | U+F0E4 | settings-2-line |
| .ri-share | IconFont.share | U+F0FE | share-line |
| .ri-shear | IconFont.shear | U+F0BF | scissors-2-line |
| .ri-stat | IconFont.stat | U+EA9E | bar-chart-line |
| .ri-sub | IconFont.sub | U+F1AF | subtract-line |
| .ri-sun | IconFont.sun | U+F1BF | sun-line |
| .ri-thumb | IconFont.thumb | U+F207 | thumb-up-line |
| .ri-time | IconFont.time | U+F20F | time-line |
| .ri-todo | IconFont.todo | U+EB23 | calendar-check-line |
| .ri-user | IconFont.user | U+F256 | user-3-line |
| .ri-vip | IconFont.vip | U+F290 | vip-diamond-line |

## 8. App 主题与启动屏

| 项 | 值 | 证据 |
|---|---|---|
| application/activity 主题 | Theme.App.Starting | AndroidManifest.xml:56,57 |
| 启动屏 | parent Theme.SplashScreen; postSplashScreenTheme=Theme.Subject_segmentation_compose; windowSplashScreenAnimatedIcon=@drawable/minilogo; windowSplashScreenBackground=@color/screen; animationDuration=20 | decoded/res/values/styles.xml:2249-2254 |
| 主主题（AppCompat，仅窗口层） | Theme.Subject_segmentation_compose parent Theme.AppCompat.Light.DarkActionBar（night 为 DayNight.DarkActionBar） | decoded/res/values/styles.xml:2432; values-night/styles.xml:27 |
| 主题模式设置 | 亮白/暗黑/追随系统 (light/dark/auto) | SelectUtil.THEMES; SelectUtil.java:46 |
| 状态栏 | Compose 内 setStatusBarColor = colorScheme.background；light status bar 跟随暗色状态 | ThemeKt.java:86-92 |

> 注意：drawable/minilogo.xml 在 APK 中就是空 selector（raw/res/il.xml 二进制解析确认无子节点），即启动图标为空；实际启动观感 = 纯色背景 #FFFFFF/#111111。splash_background.xml（layer-list: screen 色 + logo bitmap）存在于资源中但未被 Theme.App.Starting 引用。

## 9. App 自有素材清单

全部素材已按用途分类拷贝至 assets_extracted/，逐项尺寸/用途/证据见 assets_extracted/manifest.md。摘要：

| 目录 | 内容 | 用途 |
|---|---|---|
| assets_extracted/app-icon/ | ic_launcher / ic_launcher_round 5 密度；logo.png(192x192)；minilogo.xml；splash_background.xml | 桌面图标、启动屏 |
| assets_extracted/widget/ | quick.png(452x466 预览图)、app_widget.xml、widget_today.xml、widget_otherday.xml | 桌面小组件复刻参考 |
| assets_extracted/cloud/ | cloud.png(96x96)、jgy.png(120x120)、koofr.png(32x32) | WebDAV 云备份品牌图标 |
| assets_extracted/layouts/ | main.xml、view_gregorian_lunar_calendar.xml、widget_*legends.xml | App 自有布局 |
| assets_extracted/fonts/ | remixicon.ttf + icon-font.css/json/sheet | 图标系统 |
| assets_extracted/palette/ | color.json (230 中国色) | 颜色选择器 |
| assets_extracted/manifest.md | 素材清单 + 排除清单 | 交付说明 |

## 10. 原型落地建议

1. 直接引入 analysis/theme/design-tokens.css（颜色/圆角/字号/间距 CSS 变量 + remixicon @font-face），图标处写 <i class="ri ri-calendar"></i>。
2. 明暗切换：根节点切换 data-theme="light|dark"（--color-page-bg / --color-surface / --color-text-* 自动切换）。
3. 强调色统一用 var(--color-themeColor)（#55BB8A）；删除用 --color-deleteColor；会员金 --color-vipColor。
4. 卡片圆角 12px、弹窗 20px、小组件日期格 6px；页面边距 12px、卡片内边距 10px、行间距 5px。
5. 小组件复刻直接用 assets_extracted/widget/quick.png 做视觉基准；标题栏 #55BB8A、日期 17sp、班次 11sp、农历 11sp、今日描边 #EE4863 2px。
6. 文案直接查 analysis/theme/strings.zh.md 与 copy-options.md（含所有真实显示文案与选项枚举）。

## 11. 未解决问题 / 边界

- mipmap/logo.png（355x355 饼图）未在 App 源码中被引用，判定为三方库示例图标，未收录（如需可再确认）。
- 班次颜色的默认配色方案未见硬编码：默认班次颜色由用户配置；预览图中的 白班/夜班/休息 配色为作者样例（采样近似值见 2.6 节）。
- 界面文案为 Kotlin 硬编码，共 748 条去重；部分运行时拼接文案（如 本月+i+号到次月）在 strings.zh.md 中保留原始拼接形态。
- Material3 未覆盖的槽位（onSurface 等）取库默认值，已标注推断。
- 桌面小组件的动态样式（Glance Compose → RemoteViews）细节在 compose-analyst 的界面规格中更完整；本文件只负责设计令牌与素材。

