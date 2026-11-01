# screen-03 · 排班操作面板（ScheduleOperView，非路由底部弹窗）

> 源码：`module/schedule/views/main/ScheduleOperViewKt.java`（原 ScheduleOperView.kt:55）、`ui/component/bottomdialog/BottomSheetDialogViewKt.java`
> 触发：首页点「开启排班」（homeEdit=true）后立即弹出（ScheduleMainViewKt.java:453-457；ScheduleHomeViewKt.java:945-960/1008-1011）
> 关闭：点「关闭」/遮罩/完成排班后消失。

## 1. 外观
- `BottomSheetDialog`（底部弹窗，白卡片 surface 背景，顶部圆角，带拖拽把手；`ScheduleOperView.java:136`）。
- 内部 Column：
  - **顶部 tab 行**：`Row(fillMaxWidth, padding 10dp, SpaceBetween)`（:212-213）
  - **内容区**：`fillMaxWidth`，背景 **surfaceVariant #EEEEEE**，高度 **200dp（自定义排班 tab）/ 300dp（其它 tab）**（:176）
- 字号自适应：系统字体放大时 tab 文字 12→按比例缩小、内容 16→14（:102-103）

## 2. 顶部 6 个 tab（文字按钮，等距 spaceBetween）
| Tab | 文案 | 行为 | 证据 |
|---|---|---|---|
| 1 | **自定义排班** | `formType = "self"`（内容区 200dp） | :278-295 |
| 2 | **周期轮班** | `formType = "plan"`（内容区 300dp） | :296-313 |
| 3 | **清除** | 清除模式（300dp） | :350 |
| 4 | **上一天** | 当前日期 -1 天，面板保持 | :368 |
| 5 | **下一天** | 当前日期 +1 天 | :386 |
| 6 | **关闭** | 关闭面板（homeEdit=false） | :404 |
- 每个 tab 为 Text（无显式字号 → 默认 16sp，sp/14sp 自适应），带圆角点击热区（radius f5），选中态未显式高亮（推断：仅文字排布）。
- tab 容器 Row(start) 内层再嵌 Row（:244-247），实际渲染为一整行 6 个字。

## 3. 「自定义排班」内容（formType == "self"）
- Column(verticalScroll, padding horizontal 10dp)，高度 200dp（:438）
- 列出**当前项目的全部班次**（`WorkItemView(work, Size.normal, 宽/高 0, clickable)`，:504）
  - 色块样式 = 首页班次块（圆角 8dp、内边距 h8/v3、文字白色 13sp）
  - 点击 → 把该班次设置为**当前选中日期**的第一班次；
- 限流：连续点击过快 toast **"不要太着急了"**（:521）
- 数据结构：第一班次/第二班次通过点击首页色块或「第二班次」按钮另行选择。

## 4. 「周期轮班」内容（formType == "plan"，300dp）
按从上到下：
1. 若无自定义轮班（plan 列表为空）：
   - 空态图标+文字：**"你还没有设置周期排班喔"**（`EmptyIconDataView`，:594）
2. 否则列出每个轮班方案：
   - 顶部行：方案名（`SmallTipText`）+ 右侧标签 **"使用此轮班"**（TagView，点击应用该轮班到当前日期起 N 天）（:629-632）
   - `PlanItemView(plan)`：展示该轮班的班次序列色块（Size.normal，5dp/3dp padding）
   - 0.5dp 分割线（surfaceVariant）+ 间距（:665-666）
3. 「周期轮班天数」数字输入：`InputNumberView("周期轮班天数", 默认 config.autoDay="90", 单位"天", 快捷 30/60/90/180/365)`（:672）
4. 通栏次按钮：**"清空从{yyyy-MM-dd}开始的{N}天排班"**（LongCancelButton）→ 弹 `DeleteDialog("真的要清空吗？")` 确认（:698 / :761）
5. 通栏主按钮：**"添加周期轮班"**（LongOkButton）→ push 路由 `SchedulePlanEdit`（新建轮班页）（:719-734）

## 5. 「清除」tab（300dp，行号 :340-350 附近）
- 与"清除"状态互斥的 DeleteDialog「真的要清空吗？」，确认后清空从当前日期开始的 N 天排班（推断：与周期轮班共用清空逻辑；代码中 DeleteDialog 挂载在 formType clear/plan 分支统一位置 :761）

## 6. 上一天 / 下一天 / 关闭
- 仅改 `viewModel.currentDate`（-1/+1 天）或关闭面板；不弹新层。

## 7. HTML 复刻建议
- 底部 sheet：白底、顶部 8dp 圆角、把手 36×4dp 灰色圆角条。
- 6 个 tab 用 flex space-between；选中 tab 可用品牌绿加粗表示当前模式（代码未显式高亮，作为可交互提示）。
- 内容区浅灰 #EEEEEE，高度 200/300dp，内部班次块为彩色圆角条。
