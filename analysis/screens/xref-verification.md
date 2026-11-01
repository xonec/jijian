# 界面文档的代码交叉验证（xref + NavHost 解析）

> 用 REA/JADX 的**交叉引用**（77 个 UI 类的 `get_xrefs_to_class`）与 `MainActivityKt` 的 NavHost 注册序列，对 `analysis/screens/` 的结论逐条核对。原始数据：`analysis/rea/xrefs/screens/`。

## 1. 验证方法

1. 从 `analysis/rea/source/cn.jianyun.workplan.main.MainActivityKt.java` 解析所有 `String routeN = X.INSTANCE.getRoute()`，得到 NavHost 注册**顺序**与数量。
2. 对 77 个顶层 UI 类重新执行 `get_xrefs_to_class`（`analysis/rea/xrefs/screens/*.json`），统计每个类的引用来源（top_class）。
3. 对每个 Screen 类检查是否调用 `HeaderViewKt.PageView / SimpleSubAppPageView / LazyAppPageView / PageWithFooterView` 等，确定页面容器。
4. 与 `inventory.md`、`navigation.md`、`components.md` 的结论对照；差异写入本文并回改文档。

## 2. 验证结论

| # | 文档原结论 | 验证结果 | 判定 |
|---|---|---|---|
| 1 | 单 NavHost，**21 个** composable 路由 | 源码中只有 **20** 个 `getRoute()` 注册；`TestMainView` 未注册且 xref=0 | ❌ 修正为 20 + 1 个死路由 |
| 2 | 2 个入口别名 Home/Schedule 指向同一主界面 | 20 个注册中第 1/2 个确为 `Router.Home`、`Router.Schedule` | ✅ |
| 3 | 5 个 Tab = 排班/班次+轮班/提醒/统计/我的，由 `ScheduleMainViewKt` 状态位切换 | 5 个 Tab 页面类（Home/WorkManage/PlanManage/AlarmManage/Stat/Setting）均**只**被 `ScheduleMainViewKt` 引用 | ✅ |
| 4 | Tab 页用 `SimpleSubAppPageView`，push 页用 `PageView/LazyAppPageView` | Alarm/Setting/Stat 确认 SimpleSubAppPageView；Question=LazyAppPageView；备份/WebDAV/分享/编辑页=PageView；项目管理=PageWithFooterView | ✅ |
| 5 | 日历组件只在首页 | `ScheduleCalendarViewKt` 的 xref 只有 `ScheduleHomeViewKt`（9 处引用） | ✅ |
| 6 | `App 无首启隐私勾选弹窗` | 真机截图（`analysis/reference/real-screens/01-home.png`）显示首启**存在**隐私同意弹窗；代码为 `DialogViewKt.WelcomeDialog`（含同意/不同意，`DialogViewKt` 内字面量） | ❌ 修正 |
| 7 | 登录是 `LoginDialog`（弹窗） | xref 显示 `LoginDialogKt` 被 `ComposableSingletons`/设置页引用，非任何 NavHost 路由 | ✅ |
| 8 | 首页浮层：操作面板/显示配置/项目选择/备注/月份选择 | xref：`ScheduleOperViewKt`、`ScheduleConfigViewKt`、`BottomProjectChooseViewKt` 都只被 `ScheduleHomeViewKt` 引用；`MonthChooseViewKt` 被 59 类引用（通用组件） | ✅ |
| 9 | 小组件点击跳 `Widget` 路由 | `WidgetCalendarViewKt` 引用 `Router` 1 处，与 manifest `target_route=Widget` 一致 | ✅ |
| 10 | 云备份恢复是 CloudManage 内部子页 | `ScheduleCloudRecoveryViewKt` 仅被 `ScheduleCloudManageViewKt` 引用（非路由） | ✅（补入 §3） |
| 11 | `TestMainView` 为死路由 | `TestMainViewKt` xref total=0，确认无任何引用 | ✅ |

## 3. 新增：非路由的内部 composable 页（应算「浮层/子页」而非路由）

| composable | 引用来源 | 说明 |
|---|---|---|
| `ScheduleCloudRecoveryViewKt` | `ScheduleCloudManageViewKt` | 云备份「恢复」子页 |
| `ScheduleConfigViewKt` | `ScheduleHomeViewKt` | 首页显示配置底部面板 |
| `BottomProjectChooseViewKt` | `ScheduleHomeViewKt` | 首页项目选择面板 |
| `ScheduleOperViewKt` | `ScheduleMainViewKt` | 首页排班操作面板 |
| `WebDAVUserDocViewKt` | `WebDAVUserEditViewKt`、`WebDAVUserManageViewKt` | WebDAV 账号文档/说明子页 |
| `WelcomeDialog`（DialogViewKt） | 首启 | 隐私同意弹窗 |
| `LoginDialogKt` | 设置页 | 登录/注册弹窗 |

## 4. 导航调用来源（Router 的 9 个引用类）

| 引用类 | 次数 | 含义 |
|---|---|---|
| `ScheduleSettingViewKt` | 8 | “我的/排班设置”页是最大的导航入口（8 个入口） |
| `DialogViewKt` | 4 | 通用弹窗内部的跳转（如会员/协议） |
| `MainActivityKt` | 3 | NavHost 初始化与根跳转 |
| `ScheduleShareViewKt` | 3 | 分享页跳转 |
| `CommonCloudViewKt` | 2 | 云备份通用页跳转 |
| `WebDAVUserManageViewKt` | 2 | WebDAV 账号管理跳转 |
| `CommonToolKt` / `CommonUIKt` | 各 1 | 工具函数内跳转（如去设置/会员） |
| `WidgetCalendarViewKt` | 1 | 小组件点击跳配置页 |

## 5. 组件复用热度（可作为复刻优先级参考）

| 组件 | 被引用次数（top_class 计） |
|---|---|
| `NumberPickerView`（日期/滚轮） | 83 |
| `BoxViewKt` | 106 |
| `DialogViewKt` | 69 |
| `ButtonViewKt` | 63 |
| `MonthChooseViewKt` | 59 |
| `GroupViewKt` | 51 |
| `HeaderViewKt` | 41 |
| `PartTitleViewKt` | 35 |
| `IconViewKt` | 28 |
| `PanelViewKt` | 19 |
| `WorkItemViewKt` | 17 |
| `SwipeRowViewKt` | 12 |
| `NavItemViewKt` | 11 |

## 6. 已据此回改的文档

| 文件 | 修改 |
|---|---|
| `analysis/screens/inventory.md` | §0「21 个路由」→「20 个已注册 + 1 个未注册死路由」；删除「App 无首启隐私勾选弹窗」；`WelcomeDialog` 描述改为首启隐私同意弹窗；§3 增加云备份恢复子页等 |
| `analysis/screens/navigation.md` | §2 标题「共 21 个 composable」→ 20 个已注册 + 1 个死路由 |
| `analysis/reference/real-screens/README.md` | 新增真机截图证据（首启隐私弹窗、登录弹窗、VIP 价格等） |
