# screen-14 · 常见问题 / 协议 / 通知权限 / 桌面小组件

> 源码：`main/question/QuestionViewKt.java`、`main/base/UserPolicyKt.java`、`PrivatePolicyKt.java`、`main/setting/notify/NotifySettingViewKt.java`、`widget/config/WidgetConfigViewKt.java`、`widget/calendar/*`、`timetable/widget/AppWidgetView.java`

## 1. 常见问题解答（QuestionView，路由 Question）
- 容器：`LazyAppPageView(nav, "常见问题解答")`（:64）
- 内容：`ListDataView(questions)`（:83），每项为可展开的问答条目（tag 标签 + 标题 + 富文本内容；内容含 `<br>` 富文本，`CommonToolKt.oneLine` 处理）
- **6 条 FAQ 为硬编码**（`QuestionViewModel.java:126-131`，tag 全部 "入门"）：
  1. **关于我们？** → "一个致力于开发工具软件的公司，让用户能真正体验到技术带来的便捷性"
  2. **极简排班适合哪些人用？** → "如果你上班不规律，时而上班次1，时而上班次2，那么恭喜你，非常适合使用极简排班APP来规划你的排班"
  3. **极简排班如何使用？** → 四步说明（添加自定义班次→添加周期排班→首页排班→设置提醒）
  4. **用户排班数据存储在哪里？** → "您的排班信息，安全又私密。我们承诺，所有的排班数据仅存储于您的个人设备上，不会上传至任何服务器…"
  5. **为什么你们不做云备份？** → "开发者认为只有数据掌握在用户自己手里，对用户才是负责任的…"
  6. **后续有哪些开发规划？** → "1.支持分享和导入排班"

## 2. 用户协议 / 隐私政策（UserPolicy / PrivatePolicy）
- 容器：`HeaderView`（返回 + 标题）+ 可滚动富文本（`main/base/UserPolicyKt.java:52` 内嵌长文 `USER_POLICY_DATA`；PrivatePolicy 同结构，标题 **"App隐私政策"**，PrivatePolicyKt.java:109）
- 正文为长字符串常量（含 HTML/Markdown 风格标签），使用富文本渲染
- 入口：我的→用户使用协议 / 应用隐私政策

## 3. 通知权限设置（NotifySettingView，路由 NotifySetting）
- 容器：`PageView(nav, "通知权限设置")`（:126）
- 权限：`READ_CALENDAR` / `WRITE_CALENDAR`（:111）
- 内容（:144-…）：
  1. 可折叠说明 `PanelView("关于APP通知？")`（:146），正文要点：
     > 由于安卓手机品牌众多…本地通知大概率不会触发…所以计划师所有模块的提醒将通过系统日历来实现通知…请点击当前页面按钮授权计划师APP访问您的日历…我们仅会访问计划师范围内的通知数据
     （注：文案仍称旧名"计划师"）
  2. GroupView：`SelectItemView("手机品牌")`，选项 **华为 / 小米 / oppo / vivo / 荣耀**（:207-209）
  3. 通栏按钮 **"验证日历普通提醒"**（LongOkButton，:222）→ 写入一条测试日历提醒
  4. 提示卡片：各品牌自启动/通知设置引导（GroupView + OnlySmallTipText，:251-310）
  5. GroupView：`SwitchItemView("开启通知")`（:352）
  6. 通栏按钮 **"授权计划师操作您的日历（更新数据）"**（:418）、**"授权计划师查询您的日历"**（:447）→ 系统权限弹窗；拒绝且不再询问 → toast 引导去系统设置

## 4. 桌面小组件配置（WidgetConfigView，路由 Widget）
- 容器：`PageView(nav, "桌面小组件")`（:135）；入口：我的→桌面小组件配置；**点击桌面小组件标题/日历区域也会跳到这里**（WidgetCalendarView.kt:60 intent target_route=Widget）
- 内容（:189-1000+，从上到下）：
  1. **"桌面小组件样式设置"**（LeadingHint）+ GroupView：
     - `SwitchItemView("显示备注")`（默认关）
     - `SwitchItemView("显示上班时间")`（默认关）
     - `SwitchItemView("显示下班时间")`（默认关）
     - `SelectItemView("日期字号")` 8~30（默认 17）
     - `SelectItemView("班次字号")` 8~30（默认 11）
     - `SelectItemView("时间字号")` 8~30（默认 11）
     - `FloatAdderView("标题背景透明度")` 0~1（默认 1.0）
     - `FloatAdderView("日历背景透明度")` 0~1（默认 1.0）
  2. GroupView（配色，亮色）：
     `ColorSelectItemView`：**标题背景色**（默认 #55BB8A）/ **标题文字色**（#FFFFFF）/ **日历背景色**（#FFFFFF）/ **日历文字颜色**（#111111）/ **农历颜色**（#111111）/ **备注颜色**（#111111）
  3. **"暗黑模式配色"**（LeadingHint）+ GroupView：
     `ColorSelectItemView`：**暗黑标题背景色**（#22352D）/ **暗黑标题文字色**（#FFFFFF）/ **暗黑日历背景色**（#141414）/ **暗黑日历文字色**（#F5F5F5）/ **暗黑农历颜色**（#D8D8D8）/ **暗黑备注颜色**（#D8D8D8）
     - 快捷链接：**恢复默认配色** / **白色字体**（批量把文字色设为 #FFFFFF）/ **黑色字体**（#111111）（:747-810）
  4. 主按钮 **"保存并刷新桌面小组件"**（LongOkButton，:831）
  5. 次按钮 **"开启闹钟权限，可优化小组件更新"**（LongCancelButton，:853）
  6. GroupView + BlockView（13sp，tertiary）：**"该功能只针对部分厂商设备，如果你的设备点击后仍然没有桌面小组件，请在手机桌面自行添加小组件"**（:896）
  7. 主按钮 **"添加一个小组件到桌面"**（LongPrivateButton，:911）→ requestPinAppWidget 系统弹窗
  8. BlockView 温馨提示（11sp）（:988）：
     > 温馨提示:
     > 1.桌面小组件可以长按后拖拽改变高度
     > 2.点击小组件标题栏「本月」文字，可以强制刷新小组件数据
     > 3.如果小组件一直不更新，试试删除后重新添加
     > 4.由于安卓厂商太多，小组件添加形式各有差异，请自行探索自己的设备如何添加桌面小组件（部分设备在小组件添加页面最底部有一行很小的字，点击进去就可以看到了）

## 5. 桌面小组件本体（Glance，非页面但需复刻）
### 5.1 集团件结构（`widget/calendar/WidgetCalendarViewKt.java:31-170`）
- 整体 Column：
  1. **标题栏**：背景 = `config.headerBgProvider()`，水平 padding 5dp：
     - 左：**"{年}{月}排班"**（如 "2025年10月排班"），16sp Medium，颜色 headerTextColor，点击→打开 App
     - 中：weight 弹簧
     - 右：**"上个月" / "本月" / "下个月"**（10sp，headerTextColor，点击回调刷新月份）；**点击「本月」= 强制刷新数据**
  2. **日历区**：背景 bodyBgProvider，padding 5dp，点击→打开 App：
     - `WidgetCalendarHeaderView`：Row 高 **30dp**，7 个星期标签（12sp Medium，textColor，居中，weight 1）
     - `WidgetCalendarBodyView`：LazyColumn，6 周；每行 7 格 weight(1f)：
       - 日期文本：`dateFontSize` 联动 — **≥24sp→数字容器 34dp/行 40dp；≥20→30/35；否则 26/30**（:87-99）
       - 日期底图：今天用 `R.drawable.widget_today`，其它 `R.drawable.widget_otherday`（:301）
       - 农历竖排（tintColor，6sp，逐字换行）
       - 班次色块：`WidgetWorkItemView`（Small：圆角 3dp、内边距 h3/v2、白字 11sp；宽度填满格；普通班次纯色，组合班次渐变）
       - 第二班次：间距 2dp 再一块
       - 备注（showRemark）：markColor，8sp
     - 数据加载中/失败：显示 **"正在加载"** 文案（更新说明提及；Glance 首帧）
- appwidget-provider（`decoded/res/xml/app_widget.xml`）：minWidth **320dp**、minHeight **180dp**、**updatePeriodMillis=1800000（30 分钟）**、可横向/纵向缩放、previewImage=@drawable/quick
- Receiver：`cn.jianyun.workplan.widget.MyAppWidgetReceiver`（manifest:63-67）
