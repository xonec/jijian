# 极简排班 3.5.0 · 界面清单 (inventory)

> 事实来源：jadx 1.5.6 反编译源码 `jadx-src/sources/cn/jianyun/workplan/**`（完成标志 JADX_EXIT 已出现）、`decoded/AndroidManifest.xml`。
> 行号均指 jadx 输出的 .java 文件行号（jadx 会保留原 .kt 行号在 traceEventStart 字符串里，本文档引用时给出 .java 行号 + 原始 .kt 行号）。
> 标注"推断"的条目并非直接从代码读出。

## 0. 总体结论（先读）

| 结论 | 证据 |
|---|---|
| 单 Activity + 全 Compose：App 只有 1 个自研 Activity（`MainActivity`），其余全是广告 SDK Activity | `decoded/AndroidManifest.xml:57` 附近，仅 `cn.jianyun.workplan.main.MainActivity` 属于 App 自身 |
| 导航 = Navigation-Compose 单 NavHost，**20 个已注册 composable 路由**（另有 1 个未注册死路由 `TestMainView`；Home/Schedule 为 2 个入口别名，指向同一主界面） | REA 解析 `analysis/rea/source/...MainActivityKt.java`（20 个 `getRoute()` 注册）+ 77 组 xref（`TestMainViewKt` xref=0）；见 [xref-verification.md](xref-verification.md) |
| 主界面 = Scaffold + 5 个底部 Tab（排班/班次/提醒/统计/我的），Tab 切换是 **状态位（pageType）而非路由** | `module/schedule/views/ScheduleMainViewKt.java:202-455` |
| 所有界面都是 **硬编码 Compose**，没有"服务端 JSON 驱动整屏"的渲染器；服务端只驱动内容数据（公告 appTip、VIP 商品、节日/农历、FAQ、更新说明、用户协议 HTML） | 全仓无 JSON→Compose 渲染入口；`postPage` 仅为埋点上报（`hilt/respo/BaseRepository.java:97 d2`）；页面结构均写成固定 composable |
| 每个功能页分两类外观：① Tab 页用 `SimpleSubAppPageView`（无返回箭头，居中标题）② push 页用 `PageView/LazyAppPageView`（左侧返回 + 居中标题） | `ui/component/nav/HeaderViewKt.java:72` d2 元数据；各屏调用处见下表 |
| 桌面小组件 = Glance（`GlanceAppWidget`）2 套：月历组件 + 班次组件；点击跳 `target_route=Widget` 到小组件配置页 | `decoded/AndroidManifest.xml:63-67`；`widget/calendar/WidgetCalendarViewKt.java:60`；`decoded/res/xml/app_widget.xml` |
| 主题：Material3 自定义 ColorScheme + 仅覆盖 Typography.bodyLarge(16sp/lineHeight 24sp)；图标字体 Remix Icon（`R.font.remixicon`，码点见 `ui/component/nav/IconFont.java`） | `ui/theme/ThemeKt.java:33-34,119`；`ui/theme/TypeKt.java:36-37` |

## 1. 路由级界面清单（NavHost 注册顺序 = MainActivityKt.java:199-744）

| # | 路由字符串 | 路由常量 | 屏幕 composable | 页面容器/标题 | 用途 | 入口 |
|---|---|---|---|---|---|---|
| 1 | `Home` | `Router.Home` | `MainView` → `ScheduleMainView` | Scaffold + 5 Tab | **主界面**（底部 5 tab） | 启动页默认 destination（MainActivityKt.java:177-199） |
| 2 | `Schedule` | `Router.Schedule` | `ScheduleMainView` | 同上（等价别名） | 同主界面；推断为老版本/组件跳转保留兼容路由 | 代码内 navigate 未见，保留 |
| 3 | `ScheduleProjectManage` | `ScheduleRouter.ProjectManage` | `ScheduleProjectManagerView` | PageWithFooterView「项目管理」 | 排班项目（班组）管理：添加/排序/切换当前/改名/删除 | 我的-排班设置→我的排班项目；主页右上角项目图标 |
| 4 | `ScheduleWorkEdit` | `ScheduleRouter.WorkEdit` | `ScheduleWorkEditView` | PageView（标题动态：新建班次/编辑班次） | 班次的新增/编辑（颜色、时间段、名称、休息时长等） | 班次 tab 列表项点击 / 底部「添加班次」 |
| 5 | `SchedulePlanEdit` | `ScheduleRouter.PlanEdit` | `SchedulePlanEditView` | PageView（标题动态） | 周期轮班（多班次循环）新增/编辑 | 轮班 tab 列表项 / 底部按钮 / 排班操作面板 |
| 6 | `ScheduleAlarmEdit` | `ScheduleRouter.AlarmEdit` | `ScheduleAlarmEditView` | PageView（标题动态） | 提醒新增/编辑（时间、提前量、重复、强提醒、日历同步） | 提醒 tab 列表项 / 底部「添加提醒」 |
| 7 | `ScheduleCloudManage` | `ScheduleRouter.CloudManage` | `ScheduleCloudManageView` | PageView（标题动态） | 云备份管理（列表/上传/恢复） | 我的→本地备份设置/云备份账号 等 |
| 8 | `ScheduleShareData` | `ScheduleRouter.ShareData` | `ScheduleShareView` | PageView「分享与导入排班」 | 分享排班图/文本、导入排班数据 | 我的→分享与导入排班 |
| 9 | `Question` | `Router.Question` | `QuestionView` | LazyAppPageView「常见问题解答」 | FAQ 列表 | 我的→常见问题解答 |
| 10 | `UserPolicy` | `Router.UserPolicy` | `UserPolicy` | 自定义（富文本协议） | 用户使用协议 | 我的→用户使用协议 |
| 11 | `Wechat` | `Router.Wechat` | `WechatView` | PageView「导入微信小程序排班数据」 | 粘贴小程序排班文本并解析导入 | 我的→导入小程序排班 |
| 12 | `Widget` | `Router.Widget` | `WidgetConfigView` | PageView「桌面小组件」 | 桌面小组件配置（样式/显示项/颜色/预览） | 我的→桌面小组件配置；小组件点击跳转 |
| 13 | `PrivatePolicy` | `Router.PrivatePolicy` | `PrivatePolicy` | 自定义（富文本隐私政策） | 应用隐私政策 | 我的→应用隐私政策（首启另有隐私同意弹窗 `WelcomeDialog`，见 §3；真机截图 `analysis/reference/real-screens/01-home.png`） |
| 14 | `UserDetail` | `Router.UserDetail` | `UserDetailView` | PageView「我的信息」 | 账号信息/会员信息/退出登录 | 我的→顶部用户卡片 |
| 15 | `WebDAV` | `Router.WebDAV` | `WebDavDataView` | PageView「我的文件」 | WebDAV 云备份文件浏览（上传/下载/删除） | 我的→本地备份设置→云备份 |
| 16 | `WebDAVManage` | `Router.WebDAVManage` | `WebDAVUserManageView` | PageView「云备份账号」 | 云备份账号列表（新增/编辑/测试连接/删除） | WebDavDataView 内「账号管理」 |
| 17 | `WebDAVUserEdit` | `WebDAVRouter.UserEdit` | `WebDAVUserEditView` | PageView「添加/编辑云备份」 | WebDAV 账号表单（平台预设/地址/账号/密码/路径） | 云备份账号→添加/编辑 |
| 18 | `LocalBackup` | `Router.LocalBackup` | `LocalBackupView` | PageView「本地备份」 | 本地备份与恢复 | 我的→本地备份设置/本地备份与恢复 |
| 19 | `NotifySetting` | `Router.NotifySetting` | `NotifySettingView` | PageView「通知权限设置」 | 通知/日历权限引导 | 提醒模块权限引导、我的 |
| 20 | `Vip` | `Router.Vip` | `VipPage` | 自定义全屏（含商品卡片） | 会员购买（去广告/高级功能） | 各屏「去广告」按钮、我的会员卡片 |
| — | `TestMainView` | `Router.TestMainView` | 未注册 NavHost | — | 开发自测页（`main/test/*`，demo 组件） | 死路由，不在导航图 |

## 2. 主界面 5 个 Tab（状态切换，非路由）——ScheduleMainViewKt.java:202-455

| Tab | 文案 | 图标（IconFont） | 页面根 composable | 位置 |
|---|---|---|---|---|
| 1 | 排班 | `home`=60959 | `ScheduleHomeView` | ScheduleMainViewKt.java:202-204, 351 |
| 2 | 班次 | `sun`=61887 | 顶部标题 + SegmentPicker「班次/轮班」→ `ScheduleWorkManageView` 或 `SchedulePlanManageView` | :212-304, 371 |
| 3 | 提醒 | `alarm`=59931 | `ScheduleAlarmManageView` | :306-308, 391 |
| 4 | 统计 | `stat`=60062 | `ScheduleStatView` | :311-313, 410 |
| 5 | 我的 | `user`=62038 | `ScheduleSettingView` | :207-209, 429 |

底部导航栏：Row(background=colorScheme.background) + 5×`NavItemView`(weight 1)，选中态由 `ScheduleMasterViewModel.isXxxPage()` 决定（`pageType` 字段值为 home/work/alarm/stat/self，见 `ScheduleMasterViewModel.java:1513-1529`）。

## 3. 主界面上的浮层/弹窗（不是独立屏）

| 浮层 | 触发 | 代码 |
|---|---|---|
| 启动加载遮罩（Splash：右下角 Logo 40dp + 「极简排班」14sp + 「一个帮助你排班的app」11sp 灰，背景全屏色） | `AppSettingViewModel.startApp==false`（首帧 ~200-300ms） | `main/MainViewKt.java:110-147` + `ComposableSingletons$MainViewKt.java:62-96` |
| 首启隐私同意弹窗 `WelcomeDialog` | 首次启动（hasRegist=false） | `ui/component/form/DialogViewKt.java`（`WelcomeDialog`，含「用户使用协议 / App隐私政策」链接与「不同意 / 同意」）；真机截图 `analysis/reference/real-screens/01-home.png` |
| 版本更新说明 `UpdateIntroDialog` | 版本升级后首次启动 | `main/MainActivityKt.java:829-849`（正文见 §4 文案） |
| 首页公告条（可关闭） | `appTipInfo.show && showTip` | `ScheduleHomeViewKt.java:388-537` |
| 首页「设置提示」条（可关闭） | `showConfigHint` | `ScheduleHomeViewKt.java:637-741` |
| 底部操作面板 `ScheduleOperView`（自定义排班/周期轮班/清除/上一天/下一天） | 首页「开启排班」后 homeEdit=true | `ScheduleHomeViewKt.java:453-457` → `ScheduleOperViewKt.java:94,136` |
| 显示配置面板 `BottomScheduleConfigView` | 首页右上角设置图标 | `ScheduleHomeViewKt.java:1064-1087` → `ScheduleConfigViewKt.java` |
| 项目选择面板 `BottomProjectChooseView` | 首页右上角列表图标 | `ScheduleHomeViewKt.java:1087-1089` → `BottomProjectChooseViewKt.java:243` |
| 第一班次/第二班次选择底部弹窗 | 首页班次色块点击 | `ScheduleHomeViewKt.java:1183,1410`（BottomDialogView 高 500dp） |
| 备注输入弹窗 | 首页「设置备注」/备注文本 | `ScheduleHomeViewKt.java:1095-1140` |
| 网络断开 `TipDialog` | 无网络时尝试联网 | `ScheduleMainViewKt.java:462` |
| 升级提醒 `TipDialog` | 服务端要求升级 | `ScheduleMainViewKt.java:538` |
| 月份选择弹窗（选择月份，300dp 高） | 首页标题月份点击 | `ui/component/nav/MonthChooseViewKt.java:441-493` |
| 云备份恢复子页 `ScheduleCloudRecoveryView`（非路由） | 云备份管理页内点击「恢复」 | xref：仅被 `ScheduleCloudManageViewKt` 引用（`analysis/rea/xrefs/screens/`） |
| 登录/注册弹窗 `LoginDialog`（非路由） | 我的→登录或注册账号 | xref 非任何 NavHost 路由；真机截图 `real-screens/06-login.png` |

## 4. 全 App 真实文案摘录（用户可见、非三方 SDK）

- 更新说明（3.5.0，MainActivityKt.java:132 与 ScheduleSettingViewKt.java:817 各一份）：
  > 亲爱的老用户，感谢你一直在使用极简排班。本次更新重点优化了这些内容：1. 首页日历支持左右滑动切换月份，浏览排班更顺手。2. 首页显示配置和小组件显示配置做了进一步拆分，调节更清晰。3. 统计页新增了时长统计、时长占比饼图，以及排班明细导出 Excel。4. 排班详情补充了休息时长、工作时长等信息，统计更准确。5. 小组件入口、暗黑模式、显示样式等细节都做了持续优化。6. 若小组件一直显示"正在加载"，可以先删除小组件，重新添加。7. 没有班次也可以添加备注了。
- 首页空态：「当前月份没有设置排班」（ScheduleHomeViewKt.java:632）
- 首页设置提示：「温馨提示:点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项」（:707）
- 首页"去广告"按钮（:287）
- 提醒空态：「暂无提醒」（ScheduleAlarmManageViewKt.java:199）
- 班次空态：「暂无班次」（ScheduleWorkManageViewKt.java:215）；轮班空态：「暂无轮班」（SchedulePlanManageViewKt.java:208）；项目空态：「暂无项目」（ScheduleProjectManagerViewKt.java:220）
- 删除项目确认：「删除项目，会把项目下所有排班数据级联删除，确定还要继续吗」（ScheduleProjectManagerViewKt.java:269,538）
- 我 tab 版本号「v3.5.0」（ScheduleSettingViewKt.java:773）
- 权限文案：「授权极简排班操作您的日历（更新数据）」「授权极简排班查询您的日历（查询数据）」（ScheduleAlarmManageViewKt.java:554,589）
- 网络断开弹窗：「网络断开 / 您当前APP网络已断开，可能会影响正常使用, 快去开启手机网络吧!」（ScheduleMainViewKt.java:462）
- 升级提醒弹窗：「升级提醒 / 您当前版本过低，请前往手机应用市场升级」（ScheduleMainViewKt.java:538）

## 5. 逐屏详细规格索引（本目录其它文件）

| 文件 | 覆盖 |
|---|---|
| `screen-01-home.md` | 主界面骨架 + Tab1 排班首页（顶部月份栏/公告/统计条/日历/当日班次/备注/操作按钮/底部 5 tab） |
| `screen-02-calendar.md` | 日历组件细节（星期行、日期网格、班次色块、今日/选中/节假日/农历、左右滑动、上/今天/下月） |
| `screen-03-oper-sheet.md` | 底部操作面板（自定义排班/周期轮班/清除/上一天/下一天） |
| `screen-04-config.md` | 显示配置面板（字体、圆角、显示项、颜色） |
| `screen-05-work.md` | 班次 tab + 班次编辑页 |
| `screen-06-plan.md` | 轮班 tab + 轮班编辑页 |
| `screen-07-alarm.md` | 提醒 tab + 提醒编辑页 + 日历权限引导 |
| `screen-08-stat.md` | 统计 tab（区间选择/饼图/时长统计/明细表） |
| `screen-09-setting.md` | 我的 tab（用户卡/VIP/设置分组） |
| `screen-10-project.md` | 项目管理 |
| `screen-11-share.md` | 分享与导入排班 |
| `screen-12-cloud-backup.md` | 云备份/WebDAV/本地备份/小程序导入 |
| `screen-13-member.md` | 会员页、我的信息、登录弹窗 |
| `screen-14-misc.md` | 常见问题/协议/通知权限/桌面小组件配置 |
| `components.md` | 自研组件库（Header/Nav/Group/Form/Dialog/图表）规格 |
| `navigation.md` | 路由图、Tab 状态机、深链、返回栈 |
| `ui-spec.json` | 机器可读规格（供 HTML 原型） |
| `feature-map.md` | 业务功能地图 |
