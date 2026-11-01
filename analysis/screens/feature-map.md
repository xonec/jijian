# feature-map · 极简排班 3.5.0 业务功能地图

> 依据：jadx 反编译源码 + Room 模型 + 路由。表格中"代码位置"为 jadx .java 文件及行号。

## 1. 功能域总览

```
极简排班 (cn.jianyun.workplan 3.5.0)
├── 1. 排班（核心）
│   ├── 多项目（排班项目/班组）切换、增删改、排序、当前项目
│   ├── 日历视图（月网格、左右滑月、上/今天/下月、农历/节假日）
│   ├── 自定义排班（逐日点选班次：第一班次/第二班次）
│   ├── 周期轮班（多班次循环方案、周期天数、一键铺排）
│   ├── 批量清除（按 N 天）
│   ├── 每日备注
│   └── 统计指标条（当月各班次次数）
├── 2. 班次（work）
│   ├── 普通班次（名称/颜色/上下班时间/全天/休息时长）
│   ├── 组合班次（两个普通班次组合、渐变配色）
│   └── 班次排序
├── 3. 轮班（plan）
│   ├── 周期轮班方案（班次序列 + "空"位）
│   └── 轮班排序
├── 4. 提醒（alarm）
│   ├── 基于班次的提醒（当天/第二天/提前1天、提醒时间、强提醒、备注）
│   ├── 快捷选项（上班前30/10分钟、下班前5分钟）
│   ├── 启用开关、下次提醒时间
│   └── 系统日历提醒（AlarmManager + CalendarProvider）
├── 5. 统计（stat）
│   ├── 日期区间（月度/年度/自定义）
│   ├── 班次次数饼图
│   ├── 时长统计饼图
│   ├── 排班明细表（日期/星期/班次/上班/下班/休息/时长/备注）
│   └── 导出 Excel（Apache POI → xlsx）
├── 6. 数据备份与迁移
│   ├── 本地备份（SAF 目录、全量备份、清空、切换目录）
│   ├── 云备份（WebDAV：坚果云/GoogleDrive/OneDrive/DropBox/Koofr，多账号、主节点）
│   ├── 恢复（增量/覆盖/全新导入）
│   ├── 分享与导入（分享密钥 + 项目命名）
│   └── 微信小程序导入（用户 ID）
├── 7. 个性化
│   ├── 日历显示配置（字号/圆角/农历/节假日/时间/备注/统计/分割线/周首日）
│   ├── APP 风格（亮白/暗黑/跟随系统）
│   ├── 班次/小组件配色（中国色 230 色 + 自定义 + 收藏）
│   ├── 桌面小组件（月历组件、样式/配色/透明度/字号、添加向导）
│   └── 通知/日历权限引导、手机品牌选择
├── 8. 账号与商业化
│   ├── 登录/注册（仅绑定付费状态与反馈）
│   ├── 我的信息（昵称/微信/QQ/城市、退出、注销）
│   ├── 会员（月 3 元 / 年 12 元 / 永久 18 元；去广告、专属客服、支持开发）
│   └── 广告（倍孜/穿山甲/GDT/快手/天目等 SDK；非会员显示开屏与信息流；"去广告"入口）
└── 9. 其它
    ├── 常见问题（6 条硬编码 Q&A）
    ├── 用户使用协议 / 隐私政策（长文本页）
    ├── 用户在线反馈
    └── 版本更新说明弹窗
```

## 2. 功能 → 界面 → 代码映射

| 功能 | 主界面/入口 | 关键代码 |
|---|---|---|
| 日历排班 | 首页 Tab1 | `ScheduleHomeViewKt`、`ScheduleCalendarViewKt` |
| 排班操作面板 | 首页「开启排班」 | `ScheduleOperViewKt` |
| 显示配置 | 首页右上角设置 | `ScheduleConfigViewKt` |
| 项目切换/管理 | 首页右上角 list；我的→我的排班项目 | `BottomProjectChooseViewKt`、`ScheduleProjectManagerViewKt` |
| 班次管理 | Tab2 班次 | `ScheduleWorkManageViewKt`、`SchduleWorkEditViewKt` |
| 轮班管理 | Tab2 轮班 | `SchedulePlanManageViewKt`、`SchdulePlanEditViewKt` |
| 提醒 | Tab3 | `ScheduleAlarmManageViewKt`、`ScheduleAlarmEditViewKt` |
| 统计/导出 | Tab4 | `ScheduleStatViewKt`、`ScheduleStatViewModel`、`BaseService`（POI） |
| 我的/设置 | Tab5 | `ScheduleSettingViewKt` |
| 本地备份 | 我的→本地备份设置/恢复 | `LocalBackupViewKt`、`CommonCloudViewKt` |
| 云备份（WebDAV） | 我的→本地备份设置(云) | `WebDAVUserManageViewKt`、`WebDAVUserEditViewKt`、`WebDavDataViewKt`、`MyWebdavTool` |
| 备份恢复 | 云备份管理内 | `ScheduleCloudRecoveryViewKt` |
| 分享/导入 | 我的→分享与导入排班 | `ScheduleShareViewKt`、`ScheduleShareViewModel` |
| 小程序导入 | 我的→导入小程序排班 | `WechatViewKt`、`WechatViewModel` |
| 桌面小组件 | 我的→桌面小组件配置 | `WidgetConfigViewKt`、`widget/calendar/*`、`MyAppWidgetReceiver` |
| 会员 | 去广告/我的会员卡 | `VipViewKt`、`AppSettingViewModel`、支付宝 SDK |
| 登录注册 | 我的用户卡/购买/反馈 | `LoginDialogKt`、`AppSettingViewModel` |
| 我的信息/注销 | 我的→用户卡 | `UserDetailViewKt` |
| 通知权限 | 提醒页/我的 | `NotifySettingViewKt` |
| FAQ/协议 | 我的 | `QuestionViewKt`、`UserPolicyKt`、`PrivatePolicyKt` |

## 3. 数据层（Room / DataStore）

| 数据 | 存储 | 模型/DAO |
|---|---|---|
| 排班项目 | Room `ScheduleProject` | `module/schedule/dao/ScheduleProjectDao` |
| 班次 | Room `ScheduleWork` | `ScheduleWorkDao` |
| 轮班 | Room `SchedulePlan` | `SchedulePlanDao` |
| 每日排班记录 | Room `ScheduleDuty`（day + workUuid + secondWorkUuid + remark） | `ScheduleDutyDao` |
| 提醒 | Room `ScheduleAlarm` | `ScheduleAlarmDao` |
| 显示配置 | Room `ScheduleConfig` | `ScheduleConfigDao` |
| 用户/偏好 | DataStore Preferences（`BaseRepository`） | `hilt/respo/BaseRepository` |
| WebDAV 账号 | Room `WebDAVUser` | `module/base/dao/WebDAVUserDao` |
| 小组件配置 | DataStore JSON（`WidgetConfig`） | `BaseRepository.getWidgetConfig/setWidgetConfig` |
| 缓存（公告/VIP/节日） | DataStore + JSON | `BaseRepository.cache*/getObjectCache` |

## 4. 网络/服务端（仅内容数据，不驱动 UI 结构）

| API | 用途 |
|---|---|
| `api/BaseApi` | 通用接口（版本、配置、反馈等） |
| `api/ConfigApi` | App 配置 / 广告开关 / 公告 |
| `api/FestivalData` | 节假日/调休数据（按年拉取缓存） |
| `api/FeedbackModel` | 用户反馈 |
| `api/ScheduleShareApi` | 分享/导入排班密钥与数据 |
| `api/TraceApi` | 埋点上报 |
| 广告 SDK | 倍孜 beizi、穿山甲 pangle、广点通 gdt、快手 ks、天目 tianmu、美数 meishu、wangmai 等（与业务 UI 无关，复原时应排除） |

## 5. 权限（业务相关，manifest:8-52）
- `READ_CALENDAR` / `WRITE_CALENDAR`：提醒写系统日历
- `SCHEDULE_EXACT_ALARM`：精确闹钟（小组件/提醒刷新优化）
- `VIBRATE`、`WAKE_LOCK`、`INSTALL_SHORTCUT`
- `INTERNET` / `ACCESS_NETWORK_STATE` / `ACCESS_WIFI_STATE`（含广告）
- 存储读权限（备份导出/分享）
- 广告 SDK 权限与组件：**不属于 App UI，还原时剔除**

## 6. 版本信息
- versionName **3.5.0**，versionCode **36**（`decoded/AndroidManifest.xml` + `BuildConfig.java`）
- App 名：**极简排班**；slogan：**一个帮助你排班的app**（启动遮罩，`ComposableSingletons$MainViewKt.java:95-96`）
- 旧名残留：通知权限页文案仍称 **"计划师"**（NotifySettingViewKt.java:146 等）
