# 极简排班 3.5.0 · 高保真 UI 复刻原型

> 目标：仅凭 APK（cn.jianyun.workplan 3.5.0, versionCode 36）还原其前端界面，可直接在浏览器查看/交互。
> 颜色、字号、图标、文案、页面结构均取自 **APK 反编译产物**（jadx 源码 + apktool 资源），并与官方商店截图、旧版全屏截图 & 教程视频交叉校准。

---

## 1. 快速打开

    cd jianyun/prototype
    python3 -m http.server 8765
    # 浏览器打开 http://127.0.0.1:8765/index.html

| 页面 | 说明 |
|---|---|
| `index.html` | 交互原型（手机外框 + 侧栏：切换界面 / 明暗主题 / 一周开始日） |
| `board.html` | 画廊：暗色 5 Tab + 8 个二级页 + 亮色 5 Tab（整屏平铺，便于截图比对） |
| `compare.html` | 官方商店截图 vs 复刻原型 左右对照 |
| `shots/` | 已渲染好的 PNG（2x，390×844dp） |

单屏截图参数：`index.html?screen=home&theme=dark&bare=1`

- `screen`：home / work / alarm / stat / setting / workEdit / alarmEdit / share / vip / widget / project / faq / userDetail
- `theme`：dark / light
- `bare=1`：去掉手机外框与侧栏，只留 390×844 屏幕
- `sheet=config`、`edit=1`：直接打开「日历显示设置」浮层 / 首页排班模式

---

## 2. 目录

    prototype/
    ├─ index.html            交互原型
    ├─ board.html            画廊
    ├─ compare.html          官方截图 vs 原型
    ├─ css/
    │  ├─ tokens.css         设计令牌（明暗两套 + 语义色）
    │  └─ app.css            组件与页面样式
    ├─ js/
    │  ├─ data.js            示例数据（2024-09 排班/统计/提醒/主题色/FAQ…）
    │  └─ app.js             渲染层（原生 JS，无依赖；13 个页面 + 5 个浮层/状态）
    ├─ assets/
    │  ├─ fonts/remixicon.ttf        ← 直接取自 APK res/font/remixicon.ttf（17KB 子集）
    │  └─ icons/icon.css|icon-map.json|icon-cmap.json|theme-colors.json
    ├─ reference/            官方商店截图 + App 图标（对照用）
    └─ shots/                渲染截图

---

## 3. 设计令牌与代码出处

| Token | 值（亮 / 暗） | APK 出处 |
|---|---|---|
| background 页面底 | `#F6F5F4` / `#111111` | `ui/theme/ColorKt.java:16,22` → `ThemeKt.java` |
| surface 卡片面 | `#FDFDFD` / `#191919` | `ColorKt.java:15,23` |
| surfaceVariant 选中面 | `#EEEEEE` / `#222222` | `ColorKt.java:17,24` |
| 主文字 / 次文字 / 三级文字 | `#000` `#222` `#999` / `#FFF` `#DDD` `#888` | `ColorKt.java:18-20,25-27` |
| 强调色 ThemeColor | `#55BB8A`（3.5.0 固定，无换肤入口） | `ColorKt.java:10`；100+ 处组件引用 |
| 删除 / 重要 / VIP / 私密 | `#F87679` / `#EE3F4D` / `#C5A874` / `#806D9E` | `ColorKt.java:9,12-14` |
| 分割线 | `#E5E5E5` | `decoded/res/values/colors.xml` colorDivider |
| 字体 | 系统默认字体 | `ui/theme/TypeKt.java:35` |
| 正文 bodyLarge | 16sp / Normal / lineHeight 24sp / letterSpacing 0.5sp | `TypeKt.java:36`（唯一被覆盖的 M3 字号） |
| 界面常用字号 | 12 / 13 / 15sp，标题 20sp，字重 Medium(500) 最多 | jadx 全量 `getSp()` 统计 |
| 圆角 | 卡片 12dp 最高频（149 次），另有 20/10dp；小标签 4/6dp | jadx `RoundedCornerShape` 统计 |
| 间距节奏 | 5dp / 10dp 为主，页面边距 12dp | jadx `PaddingKt` 统计 |
| 图标 | Remix Icon v4.3 子集 79 枚（`IconFont.java` 码点 → `icon.css`） | `TypeKt.java:37`、`ui/component/nav/IconFont.java` |
| 主题色板 | 230 个中国传统色（8 组） | `decoded/assets/data/color.json`（用于班次颜色/小组件配色，非整体换肤） |

原型按此实现：正文 15px、次要 13px、说明 12px、标题 20px/500；卡片 12px 圆角。

---

## 4. 已还原界面（与 APK 路由 / Composable 对应）

| # | 原型 screen | 对应 APK | 代码位置 |
|---|---|---|---|
| 1 | `home` 排班首页 | `ScheduleHomeView` + `ScheduleCalendarView` | `module/schedule/views/main/ScheduleHomeViewKt.java:128`、`biz/ScheduleCalendarViewKt.java` |
| 2 | `work` 班次/轮班 | `ScheduleWorkManageView` / `SchedulePlanManageView` + SegmentPicker | `views/ScheduleMainViewKt.java:253-302` |
| 3 | `alarm` 班次提醒 | `ScheduleAlarmManageView` | `views/alarm/ScheduleAlarmManageViewKt.java` |
| 4 | `stat` 排班统计 | `ScheduleStatView`（饼图 + 时长 + 明细） | `views/stat/ScheduleStatViewKt.java`、`ui/graph/PieGraphKt.java` |
| 5 | `setting` 我的/排班设置 | `ScheduleSettingView` | `views/setting/ScheduleSettingViewKt.java` |
| 6 | `workEdit` 添加班次 | `ScheduleWorkEditView` | `views/work/SchduleWorkEditViewKt.java` |
| 7 | `alarmEdit` 添加提醒 | `ScheduleAlarmEditView` | `views/alarm/ScheduleAlarmEditViewKt.java` |
| 8 | `share` 分享与导入 | `ScheduleShareView` | `views/share/ScheduleShareViewKt.java` |
| 9 | `vip` 会员 | `VipPage` | `main/setting/vip/VipViewKt.java` |
| 10 | `widget` 桌面小组件配置 | `WidgetConfigView` | `widget/config/WidgetConfigViewKt.java` |
| 11 | `project` 项目管理 | `ScheduleProjectManagerView` | `views/project/ScheduleProjectManagerViewKt.java` |
| 12 | `faq` 常见问题 | `QuestionView` | `main/question/QuestionViewKt.java` |
| 13 | `userDetail` 我的信息 | `UserDetailView` | `main/setting/user/UserDetailViewKt.java` |
| 浮层 | 月份选择 / 日历显示设置 / 选择排班项目 / 选择班次 / 备注输入 | `MonthChooseView`、`BottomScheduleConfigView`、`BottomProjectChooseView`、`BottomDialogView` | `ui/component/nav/*`、`views/main/BottomProjectChooseViewKt.java` |
| 状态 | 首页排班模式（底部操作条） | `ScheduleOperView` | `views/main/ScheduleOperViewKt.java` |

---

## 5. 还原度说明 / 已知差异

**已按代码还原**

- 5 Tab 结构与图标：排班 `home` / 班次 `sun` / 提醒 `alarm` / 统计 `stat` / 我的 `user`（`ScheduleMainViewKt.java:351-447`）。
- 明暗两套 Material3 配色（`ThemeKt.java`），状态栏/导航栏跟随 background。
- 首页结构：月份栏（18sp）→ 提示条（可关闭）→ 班次统计色条（12sp）→ 日历 → 选中日班次/备注 → 操作按钮（`ScheduleHomeViewKt.java:128-1182`）。
- 日历：7 列网格、日期 + 农历角标、班次色块（名称+时间）、底部「上个月/今天/下个月」（`ScheduleCalendarViewKt.java` 的 `BottomNavView`）。
- 日历态样式按 `analysis/screens/screen-02-calendar.md`：**今天 = 红字加粗 + 8% 红底**；**选中日 = #55BB8A 20% 底 + 描边 + 6dp 圆角**；月水印 = 当月月名（大号、6% 透明度）；节假日农历红字、调班蓝字。
- 顶栏月份文字为强调绿 #55BB8A（18sp）。
- 班次色块尺寸/圆角/字号档位（`WorkItemViewKt.java` 的 small/medium/big：字号 11/13/14sp、圆角 2/4/6/8dp）。
- 全部图标字体与真实中文文案（如「当前月份没有设置排班」「温馨提示:点击右上角设置按钮…」「班次排序」「授权极简排班操作您的日历（更新数据）」）。

**依据官方暗色营销截图补齐**

- 班次示例色 `#1BA784`(早班) / `#303048`(晚班) / `#F8723D`(休息)、2024-09 排班节奏与统计占比（早 14 / 晚 12 / 休 4）。
- 统计环形图样式与图例、提醒卡片布局（时间/班次/时段/标签/下次提醒/开关）。

**依据旧版亮色截图 & 教程视频校准**

- 顶栏「2024年9月」+ 列表/齿轮图标、日历底部「上个月 / 今天 / 下个月」。
- 日历显示设置浮层字段与顺序（一周开始日、日期/班次/时间字号、班次圆角、显示农历/节假日/上下班时间/备注/统计指标/分割线 + 保存）。
- 添加班次表单结构（普通班次/组合班次 + 基本信息 + 班次颜色 + 样式预览 + 保存）。
- 提醒页日历授权按钮与「关于班次提醒 / 检查班次提醒是否生效」入口。

**存疑 / 未还原**

- 官方暗图中 14/29 日的蓝色「调班」角标：源码与资源中无字面量，推断来自节假日调休数据，原型按截图示意保留。
- 桌面小组件真实桌面效果未截图；`widget` 页为代码结构 + 配置项还原（可对照 `assets_extracted/widget/quick.png` 官方小组件预览图）。
- 「我的」页公开素材中无全屏截图，按 `ScheduleSettingViewKt` 的真实条目与图标还原。
- 3.5.0 未开放整体换肤（`ColorKt` 的 8 个 setter 无调用方），原型侧栏色板仅作演示；230 中国色实际用于班次/小组件配色。
- 一周开始日：APK 小组件默认 `mondayFirst=true`（周一），官方月历截图用的是周日；原型默认周日并可在侧栏切换。

---

## 6. 怎么用这份原型继续做

1. **改名换品牌**：改 `css/tokens.css` 的 `--theme-color/--primary`，其余语义色不动即可保持原 App 质感。
2. **搬组件**：`css/app.css` 里的 `.calendar / .shift-badge / .chip / .segment / .tabbar / .sheet / .switch / .donut` 都是自包含的，可直接移植到 Vue/React。
3. **换成真数据**：`js/data.js` 是唯一数据入口，结构对齐 APK 的 `ScheduleWork / ScheduleDuty / ScheduleStat` DTO（见 `../analysis/screens/ui-spec.json`）。
4. **要原生 Compose 复刻**：直接对照 `../analysis/screens/screen-*.md`（逐屏结构 + dp 尺寸 + 文案 + 代码行号）。
