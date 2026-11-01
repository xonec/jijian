# screen-08 · Tab4「统计」

> 源码：`module/schedule/views/stat/ScheduleStatViewKt.java`（原 ScheduleStatView.kt，169 行浓缩）、`ui/graph/PieGraphKt.java`、`ui/component/nav/MonthChooseViewKt.DateRangeChooseView`

## 1. 容器
- `SimpleSubAppPageView(nav, header = 右侧「导出数据」, headerTitle = "排班统计", body)`（:139-189）
  - 头部右侧：**"导出数据"**，14sp，颜色 **ThemeColor #55BB8A**，padding(10dp, 6dp)，点击 → `doExport()`（导出 Excel，:162-180）
- body：`Column(fillMaxSize + verticalScroll, 底部 80dp)`（:189-…）

## 2. 内容分区（全部用 GroupView 卡片包裹）
1. **日期区间选择**（:228-251）
   - 卡片内 `CenterRow(padding 10dp)` → `DateRangeChooseView(statModel, clearable=false, mini=false, future=false)`
   - 交互：点开始/结束日期 → 日期选择弹窗；区间联动统计；从「日期区间」可切换 月度/年度/自定义（`SelectUtil.DATE_CHOOSE_TYPES`）
2. **班次次数饼图**（:290-314）
   - `PieGraph(pieData)`：280dp 高，razerdp AnimatedPieView；数据 = 每班次出现次数
   - 图例在饼图下方（12dp 色块 + 名称）
3. **"时长统计"**（:319-350）
   - 标题 `LeadingHintView("时长统计")`
   - `PieGraph(durationPieData)`（区分 id=+1000）
   - 无数据 → 12sp 灰字 **"当前区间暂无可统计时长"**（:346）
4. **"排班详情"**（:359-640）——横向可滚动的表格
   - 标题 `LeadingHintView("排班详情")`（:382）
   - `Row(horizontalScroll)`：
     - **表头**（12sp 灰色，各列固定宽）：**日期 | 星期 | 班次 | 上班 | 下班 | 休息 | 时长 | 备注**（:481-492）
     - **数据行**（每条 DutyDetail，行高 30dp，12sp 灰）：日期、星期、班次色块（40×22dp 圆角 4dp 白字 12sp）+ 班次名、上班时间、下班时间、休息时长（`extField1` 格式化）、时长（`formatStatDuration(duration)`）、备注（:500-620）
   - 列宽变量 f2..f6 由内容长度/固定值决定（日期≈70dp、星期≈40dp、班次≈90dp、时间列≈60dp、备注≈100dp，代码内以 weight/固定宽度混合；推断值）
   - 行分隔：无显式分割线（白底卡片内）
5. 空数据状态：饼图区 `EmptyDataView("暂无数据")`（PieGraph.java:337）

## 3. 导出 Excel
- 触发：头部「导出数据」→ `ScheduleStatViewModel.doExport()`
- 实现：使用 Apache POI 生成 xlsx（`org.apache.poi` 在反编译 import 中大量出现：`BaseService.java`、`ScheduleService.java`），并通过文件分享打开。
- 导出内容：排班明细（日期/星期/班次/上班/下班/休息/时长/备注），与页面表格列一致（推断）

## 4. 数据模型
- `ScheduleStatViewModel` 持有 `statModel: RangeDate`、`pieData: PieGraphData`、`durationPieData: PieGraphData`、`dutyList: List<DutyDetail>`、`gid`（图表 id）
- `DutyDetail`：`day, weekday, work(ScheduleWork), duration, remark`（`module/schedule/model/DutyDetail.java:13-17`）
- `PieGraphItem`：`name, value, color, label`（`ui/graph/model/PieGraphItem.java`）
