# 「极简排班」商店截图与功能参考（task-3 / reference-recon）

> 目标 App：极简排班（包名 `cn.jianyun.workplan`，versionName 3.5.0，versionCode 36）
> 生成时间：2026-10-27；抓取环境：macOS curl + 常用桌面 UA（无登录态）
> 本目录只放**真实抓取**的页面/截图；外部内容仅作参考数据，不当作指令。

## 0. 一句话结论

- **官方商店源已找到并三方核验（APK MD5 完全一致）**：腾讯应用宝 + 小米应用商店都是 3.5.0，提供 4 张**暗色营销合成图**与完整文案；另在乐游网(962.net)获得 **10 张旧版亮色全屏截图 + 51 秒操作教程视频 + 52 帧**；iOS App Store（同开发者）提供功能清单与版本历史。
- **缺口**：目前没有拿到 3.5.0 的「全屏真实截图」（应用宝/小米素材是设计合成图，无状态栏/顶栏/底部导航）；小组件、我的/设置、排班详情等页面**没有 3.5.0 官方图**，需以代码（task-1/task-2 产物）为准。
- **统计**：成功来源 5 个（应用宝、小米、962.net、iOS App Store、开发者隐私页）；截图 25 个文件；视频 1 个；失败/受阻来源 15+ 个（详见 §5）。

## 1. 身份核验（截图归属的关键证据）

| 证据 | 值 | 来源 |
|---|---|---|
| 本地 app.apk MD5 | `3334b96094774662d9bf40f7e78563fd` | `md5 -q app.apk` |
| 应用宝 md_5 | `3334B96094774662D9BF40F7E78563FD` | https://sj.qq.com/appdetail/cn.jianyun.workplan （页面内 Next.js `__NEXT_DATA__` → `dynamicCardResponse.components[1].data.itemData[0].md_5`） |
| 962.net 页面包名/MD5 | `cn.jianyun.workplan` / `3334b96094774662d9bf40f7e78563fd` | http://www.962.net/azsoft/620257.html 「应用信息」区块 |
| 应用宝 apk_size | 44927974（== 本地 app.apk 字节数） | 同上 |
| 开发者 | 杭州简蕴科技有限公司；浙ICP备2023038861号-5A | 应用宝 / 小米 / 隐私政策页 |
| iOS 版开发者 | Hangzhou Jianyun Technology Co., Ltd（杭州简蕴科技有限公司） | https://apps.apple.com/cn/app/id1607307427 |

结论：**应用宝/小米页面的 3.5.0 截图与文案、962.net 的包元数据，均与本工作区 app.apk 是同一构建**（MD5 完全一致），可放心作为该 APK 的参考；但 962.net 的**图片素材**上传于 2025-11-17，早于 3.5.0 发布（2026-08-20），属于**旧版本界面**（见 §3.2 版本归属推断）。

## 2. 来源清单（含抓取结果）

| # | 来源 | URL | 状态 | 拿到什么 |
|---|---|---|---|---|
| S1 | 腾讯应用宝（官方商店） | https://sj.qq.com/appdetail/cn.jianyun.workplan | 200, 246 KB | 完整元数据 JSON（版本/大小/MD5/描述/权限/评分/评论/截图 URL），4 张 1080x1920 官方截图 + 256 图标 |
| S2 | 小米应用商店（官方商店） | https://app.mi.com/details?id=cn.jianyun.workplan | 200, 26 KB | 版本 3.5.0、2026-08-20、42.85M、appID 1609469、权限清单、同一套 4 张截图（607x1080）、「新版特性：第一个版本」 |
| S3 | 乐游网 962.net（第三方下载站） | http://www.962.net/azsoft/620257.html | 200, 28 KB | 6 张图库截图（554x984，2025-11-17 上传）+ 4 张教程步骤截图 + 51s 教程视频链接 + 页面元数据（包名/MD5 与 APK 一致） |
| S4 | iOS App Store（同开发者） | https://apps.apple.com/cn/app/id1607307427 | 200, 795 KB | 功能清单（10 项）、版本历史（当前 5.6.0，2026-08-21）、评分 4.8/6866、用户评论与开发者回复 |
| S5 | 开发者隐私政策页 | https://api.kotal.cn/privacy_workplan.html | 200, 5.5 KB | 开发者名称/地址/邮箱、权限用途说明、生效 2024-08-20、「第三方 SDK：暂无」 |
| S6 | 应用宝评论区（同页） | S1 内嵌 | 200 | 2 条评论（见 §6 舆情） |

辅助核验：本工作区 `jadx-src`（3.5.0 反编译源码）与 `decoded` 资源，用于判断截图界面在 3.5.0 是否仍存在（§4）。

## 3. 截图清单与界面描述

目录：`shots/`。命名规则：来源前缀 + 序号 + 屏名。

### 3.1 官方商店图（S1/S2，3.5.0，暗色，**营销合成图**）

> 重要：这 4 张是**设计合成宣传图**——纯黑背景 + 大标题 + 真实 UI 元素重新排版，**没有状态栏、顶栏、底部导航**，不等同于完整屏幕截图。用于取色/组件样式/文案可以，用于还原导航结构不行。
> 应用宝的 4 张与小米的 4 张是同一套素材（小米 607x1080 缩放版，顺序不同）。

| 文件 | 来源 | 尺寸 | 界面内容 |
|---|---|---|---|
| `yj_qq_01.jpg` | S1 | 1080x1920 | 「极简排班」首页月历（暗色）：7 列 周日→周六；日期=公历数字+农历小字（廿九/三十/八月/初二…）；每格下方班次徽章：`早班 09:00`（绿）、`晚班 20:00`（靛蓝）、`休息 全天`（橙）；2 日有选中描边；14、29 日右侧有蓝色小字「调班」（2024-09-14、2024-09-29 均为国务院调休补班日 ⇒ **推断**为调休上班标记）；月历数据为 2024-09（1 日周日，与真实星期吻合） |
| `yj_qq_02.jpg` | S1 | 1080x1920 | 「自定义班次」：顶部 segmented `班次`(选中绿)/`轮班`；3 行班次卡：早班 `09:00~18:00`、晚班 `20:00~次日08:00`、休息 `全天`；`添加班次` 行；下方文字链 `班次排序` |
| `yj_qq_03.jpg` | S1 | 1080x1920 | 「排班统计」：区间 `2024-09-01至2024-09-30`（绿字）；环形图 + 引线标签（早班 47%/晚班 40%/休息 13%）；底部图例 `早班 14次 47%`、`晚班 12次 40%`、`休息 4次 13%` |
| `yj_qq_04.jpg` | S1 | 1080x1920 | 「排班提醒」列表：左 07:55 + `晚班` + `20:00~次日08:00`，标签 `普通提醒`(绿描边)/`第二天`(灰)，辅助行 `后天 07:55提醒`，右侧开关开；第二行 08:30 + `早班` + `09:00~18:00`，标签 `普通提醒`/`当天`，`5天后 08:30提醒` |
| `yj_qq_icon.png` | S1 | 256x256 | 官方图标（用于还原 app icon/桌面小组件头图参考） |
| `mi_store_01_statistics.jpg` | S2 | 607x1080 | 同 `yj_qq_03`（排班统计） |
| `mi_store_02_reminder.jpg` | S2 | 607x1080 | 同 `yj_qq_04`（排班提醒） |
| `mi_store_03_shifts.jpg` | S2 | 607x1080 | 同 `yj_qq_02`（自定义班次） |
| `mi_store_04_calendar.jpg` | S2 | 607x1080 | 同 `yj_qq_01`（首页月历） |

### 3.2 旧版亮色全屏截图（S3，**完整屏幕含状态栏**，2025-11-17 上传）

> 版本归属（**推断**）：图库 6 张与教程 4 张均上传于 2025-11-17，早于 2025-11-03 的 iOS 5.3.1 与 2026-08-20 的 Android 3.5.0，对应 **3.4.x/更早的亮色版**。页面虽写 v3.5.0，但仅「下载包元数据」随源站更新，截图未更新（962 页面「发售时间 2025年11月17日」）。
> 价值：目前唯一拿到的**全屏结构**参考（顶栏、底部导航、弹层、空态），可与 3.5.0 代码做「结构是否变化」对照（§4）。

| 文件 | 尺寸 | 界面内容 |
|---|---|---|
| `n962_01_calendar_month.jpg` | 554x984 | 首页：顶栏左「2025年11月」，右侧两图标（列表/齿轮）；副标题「当前月份没有设置排班」；周一起始日历（日期+农历）；17 日选中（绿描边圆角）；底部「← 上月 / 下月 →」+ 全宽「开启排班」按钮；底部 5 tab 导航（排班选中） |
| `n962_02_project_sheet.jpg` | 554x984 | 底部弹层「选择排班项目」+ 右上「管理」；唯一项「默认项目」+「当前」绿标；「共1条记录」 |
| `n962_03_calendar_settings.jpg` | 554x984 | 底部弹层「日历显示设置」：一周开始日（周一/周日 segmented，周一选中）、显示中国农历(on)、显示中国节假日(on)、显示上班时间(off)、显示备注(off)、显示统计指标(on)、显示分割线(on)、全宽「保存」 |
| `n962_04_shift_empty.jpg` | 554x984 | 班次 tab 空态：segmented「班次/轮班」；「暂无班次」；全宽「添加班次」卡片；底部导航（班次选中） |
| `n962_05_shift_alarm_auth.jpg` | 554x984 | 「班次提醒」：两个绿色授权按钮「授权极简排班操作您的日历（更新数据）」「授权极简排班查询您的日历（查询数据）」；列表「关于班次提醒? >」「检查班次提醒是否生效? >」；底部导航（提醒选中） |
| `n962_06_statistics_empty.jpg` | 554x984 | 「排班统计」：居中标题；区间卡「2025-11-01至2025-11-30」；内容卡「暂无数据」；底部导航（统计选中） |
| `n962_07_tutorial_home.jpg` | 554x984 | 教程步骤 1：首页（同 01，含红箭头标注），演示「开启排班」 |
| `n962_08_tutorial_add_shift.jpg` | 554x984 | 教程步骤：「添加班次」表单——顶栏←+标题；segmented「普通班次」/「组合班次」；「基本信息」：班次名称(早班)、是否全天(开关)、开始时间 08:00、结束时间 18:00、班次颜色(粉色块)；「样式预览」徽章；全宽绿色「保存」 |
| `n962_09_tutorial_shift_list.jpg` | 554x984 | 教程步骤：班次 tab 空态（同 04） |
| `n962_10_tutorial_custom_schedule.jpg` | 554x984 | 教程步骤：首页「自定义排班」模式——底部操作条「自定义排班 / 周期轮班　清除 上一天 下一天 关闭」+ 粉色「早班」按钮；21 日选中，17-20 日挂「早班」徽章 |

### 3.3 教程视频与抽帧（S3）

| 文件 | 说明 |
|---|---|
| `video/n962_620257.mp4` | 962.net 教程视频，51.125s，720x1280，24fps，3,225,329 字节（Last-Modified: 2026-08-29，内容仍为亮色旧版 UI，含录制时间 5:25~5:37） |
| `shots/video_tut_01_home.png` ~ `video_tut_06_custom_schedule.png` | 从视频按 1s 抽帧后人工挑选的 6 帧：首页 / 选择排班项目 / 日历显示设置 / 班次空态 / 添加班次表单 / 自定义排班；**带教程气泡与红箭头**，只作流程参考 |
| `video/frames/`（46 帧） | 其余抽帧原图（1s/帧） |
| `contact_sheet_1.png` / `contact_sheet_2.png` | 52 帧总览拼图（7x4/张），用于快速定位某个操作瞬间 |

## 4. 与静态分析（本 APK 3.5.0 反编译）的对照

> 「静态证据」均指本工作区 `jadx-src/sources/...`（3.5.0 反编译）与 `decoded/`。

| # | 截图/商店事实 | 静态证据 | 结论 |
|---|---|---|---|
| 1 | 底部 5 tab：排班 / 班次 / 提醒 / 统计 / **我的**（旧版截图第 5 个被 962 水印遮住） | `module/schedule/views/ScheduleMainViewKt.java:351/371/391/410/429`（`NavItemView("排班", IconFont.home…)` 等） | **一致**；第 5 个 tab 确为「我的」，图标 `IconFont.user` |
| 2 | 首页「2025年11月」标题、列表+齿轮图标、副标题「当前月份没有设置排班」、「开启排班」按钮、上月/下月 | `module/schedule/views/main/ScheduleHomeViewKt.java:632`（副标题）、`:945`（开启排班） | **一致**，3.5.0 仍保留 |
| 3 | 日历显示设置：一周开始日/显示中国农历/节假日/上班时间/备注/统计指标/分割线 | `module/schedule/views/config/ScheduleConfigViewKt.java:98`（标题）、`:417`（一周开始日）等 | **一致**；「周日/周一开始」两种都实现，故 3.5.0 暗图周日开头、旧版周一开头并不矛盾（设置不同） |
| 4 | 选择排班项目弹层「默认项目/当前/共1条记录/管理」 | `module/schedule/views/main/BottomProjectChooseViewKt.java:52`；「条记录」见 `ui/component/form/FormItemKt.java:146810` | **一致**（3.5.0 仍在） |
| 5 | 班次页 segmented 班次/轮班、添加班次、**班次排序** | `module/schedule/views/work/ScheduleWorkManageViewKt.java:404`（添加班次）、`:432`（班次排序） | **一致**；旧版空态没显示「班次排序」⇒ 推断仅非空列表时出现（待 task-2 确认） |
| 6 | 添加班次：普通班次/组合班次、基本信息（名称/全天/开始/结束/颜色）、样式预览、保存 | `module/schedule/views/work/SchduleWorkEditViewKt.java:369`（普通班次）、`:458`（样式预览） | **一致**；官方 3.5.0 暗图未展示此页 |
| 7 | 提醒页列表：普通提醒/当天/第二天/下次提醒时间/开关 + 日历授权按钮 | `module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:143`（班次提醒）、`:554`（授权操作日历）；`ComposableSingletons$ScheduleAlarmManageViewKt.java:34`（关于班次提醒） | **一致**；推断 3.5.0 该页同时含「授权区 + 提醒列表」，两张图各截了局部 |
| 8 | 统计页饼图 + 次数/占比图例；空态「暂无数据」+ 区间卡 | `module/schedule/views/stat/ScheduleStatViewKt.java:189`；饼图组件 `ui/graph/PieGraphKt.java` | **一致**；3.5.0 应用内更新日志第 3 条明确「新增时长统计、时长占比饼图、排班明细导出 Excel」，与 3.5.0 暗图（有饼图）匹配 |
| 9 | 暗图 14/29 日蓝色小字「调班」 | 源码/资源均**未**找到「调班」字面量（`jadx-src`、`decoded/res`、`assets` 全量 grep 无命中） | **存疑**：推断为节假日调休补班标记，由数据/绘制产生，或为设计后期叠加。**不要据截图臆造该控件**，等 task-2 用代码确认 |
| 10 | 桌面小组件（商店文案 + 更新日志多次提及） | `widget/config/WidgetConfigViewKt.java:988`（小组件添加/刷新提示 4 条）；更新日志第 5/6 条 | **代码存在，但无任何 3.5.0 小组件截图** → 还原度缺口，需按 task-2 的 widget 规格做 |
| 11 | 应用宝/小米截图无状态栏/顶栏/底部导航 | — | 官方素材是**营销合成图**，不可用于导航/顶栏还原 |
| 12 | 主题：官方 3.5.0 图全暗色；旧版截图全亮色 | 代码支持暗黑（`ThemeKt.WorkplanTheme(... getDarkTheme ...)`，见 `MainActivityKt.java` 附近）；商店文案第 7 条「支持暗黑模式」 | 两套主题都需还原；3.5.0 宣传主推暗色 |

## 5. 失败/受阻来源记录（不伪造、不替代）

| 来源 | URL | 结果 |
|---|---|---|
| 酷安（应用页） | https://www.coolapk.com/apk/cn.jianyun.workplan | **404**（反爬/未收录，桌面 UA 直连） |
| 酷安（搜索） | https://www.coolapk.com/search?q=极简排班 | **404** |
| 华为应用市场 | https://appgallery.huawei.com/search/极简排班 | 200 但仅 **SPA 外壳 3.0KB**，无数据；其接口 `web-drcn.hispace.dbankcloud.cn/uowap/index` → **403** `rtnCode 1002 InterfaceCode Verification failed`（需签名） |
| 豌豆荚（应用页） | https://www.wandoujia.com/apps/cn.jianyun.workplan | **404**（跳 /apps/8461009） |
| 豌豆荚（搜索） | https://www.wandoujia.com/search?key=极简排班 | 200，但 10 个结果全是**其他**排班 App（排班易/排班日历/365排班表…），**无本 App** |
| APKPure | https://apkpure.com/cn.jianyun.workplan/cn.jianyun.workplan | **403**（Cloudflare）；apkpure.net 同 403 |
| APKCombo | https://apkcombo.com/cn.jianyun.workplan/ | **连接失败 (curl 000)** |
| APKMonk / apk.support | /app/cn.jianyun.workplan | **连接失败 (000)** |
| APKFab | https://apkfab.com/... | **404** |
| Uptodown | https://cn.uptodown.com/...搜索 | **404** |
| 应用汇 | http://www.appchina.com/app/cn.jianyun.workplan | **404** |
| 360 手机助手 | https://zhushou.360.cn/search/index/?kw=极简排班 | **302 → 首页**，无搜索结果 |
| 百度手机助手 | https://shouji.baidu.com/s?wd=极简排班 | 200 但仅首页壳（8.9KB，搜索需 JS） |
| 搜狗应用 | https://as.sogou.com/app/apkdetail?docid=3542465962774271456 | 200，但页面是**另一款**「倒班排班表」（深圳市学勤信息技术有限公司），非本 App |
| 七麦数据 qimai.cn | https://www.qimai.cn/search/index/searchword/极简排班 | 200 仅 SPA 壳 3.2KB（需登录/JS） |
| 历趣 liqucn.com | https://www.liqucn.com/rj/9859965743542.shtml | **连接失败 (000)**，http/https/m 均不可达 |
| 9k9k 应用市场 | https://www.9k9k.com/app/95698.html | 200 但反爬空壳（压缩后 2.7KB，正文为空） |
| 962.net 标签页 | https://www.962.net/tags/极简排班.html | **500** |
| Wayback Machine | CDX for sj.qq.com / coolapk / kotal.cn | 前两者**无快照**；kotal.cn 抓取被 archive.org 反爬拦截（suspected abusive bot） |
| 应用宝移动页 | https://m.yyb.qq.com/appdetail/cn.jianyun.workplan | **404** 错误页 |
| 应用宝历史版本路由 | https://sj.qq.com/appdetail/cn.jianyun.workplan/history | **404**（PC 页无「更新日志/历史版本」卡片，更新 tab 内容需登录 App/接口，未取得） |
| kotal.cn 官网首页 | https://kotal.cn/ | **403** |
| OPPO 商店 | app.cdo.oppomobile.com / store.oppomobile.com 按包名 | 前者 302 回官网；后者 **404** |
| vivo 商店 | h5.appstore.vivo.com.cn | 200 仅 SPA 壳 1.7KB（无 appId 无法定位） |
| TapTap | https://www.taptap.cn/search?q=极简排班 | 200 但为游戏平台，无该应用（未采用） |
| 小红书（搜索片段） | 站内帖子 | 仅搜索摘要，未抓取（登录墙）；不采用 |

## 6. 舆情与可信度提示（务必读）

1. **应用宝评论仅 2 条**（`total: 2`，平均分 1.00）：
   - 2026-01-18：「这個应用开发方耍流氓，强制更新，否则不让使用，结果更新完发现就添加了個开屏广告，其他的什么都没变。」→ 与「无广告」宣传、以及 APK 内多套广告 SDK 的事实相关，说明**3.5.0 也可能有开屏/激励广告位**（静态分析已见 beizi/pangle/gdt/ks 等 SDK）。还原 HTML 原型时如做「启动流程」，需注意开屏广告入口存在，但**原型是否包含广告由 Lead 决定**。
   - 2025-10-11：「好用 简单 明了」。
2. **隐私政策与实现不符**：`api.kotal.cn/privacy_workplan.html` 写「8. 第三方 SDK：暂无」，而 APK 实际打包倍孜/pangle/gdt/ks 等广告 SDK（Lead 静态分析结论）；且该页文案混入「工时数据/课程信息」等他 App 用语 → 属于**开发者复用模板**，只能用于取开发者信息，**不能作为 SDK 清单证据**。
3. **962.net 的「软件介绍/最新动态/更新日志」是第三方 SEO/AI 风格文案，不可当作官方**。例如它声称 v3.5.0「新增一键换班、日历拖拽、修复排班表加载缓慢」——在 3.5.0 源码与官方应用内更新日志中**均无依据**。真实 3.5.0 更新日志见 `features.md` §3（来自 APK 内 `UpdateIntroDialog` 字符串）。
4. **同名/近名 App 干扰**（不要混淆）：
   - `com.dkais.cjdkeow`「极简排班表」— 开发者 **长沙丰欧信息技术有限公司**，版本 1.3.0，另一款 App（应用宝有页面）；
   - iOS「简单排班-极简排班日历值班倒班轮班助手」id 6758877946（Sensor Tower 结果）— 非本开发者；
   - 正确的 iOS 同产品：`极简排班·排班日历·排班闹钟` id **1607307427**，开发者杭州简蕴（见 S4）。

## 7. 缺口与建议

1. **3.5.0 全屏截图缺口**：官方只给营销合成图；962 是旧版。建议以 task-2 的 `ui-spec.json` 为准，官方暗图只用于对照配色/徽章/图表样式。
2. **小组件无图**：商店文案、更新日志、`WidgetConfigViewKt` 都强调小组件，但无截图；建议 task-2 从 `widget/` 包 + Glance 代码还原，参考 `WidgetConfigViewKt.java:988` 的 4 条提示文案。
3. **「调班」蓝标**：截图中存在但源码 grep 无字面量，需 task-2 定位（可能是节假日数据绘制/热更新配置/设计叠加）。
4. 若需更多版本历史：应用宝无历史版本接口（未取得），可尝试抓 Android 版 APKPure（当前 403，需换 IP/代理）或使用开发者 App 内更新弹窗（仅 3.5.0 一条）。

## 8. 产物索引

- `README.md` 本文件
- `features.md` 商店功能清单 + 官方更新日志（Android 3.5.0 / iOS 版本历史）+ 功能↔界面↔代码对照
- `store-metadata.json` 结构化商店元数据（应用宝/小米/iOS/962/隐私页），供程序读取
- `shots/*.jpg|png` 25 个真实截图/图标（见 §3）
- `video/n962_620257.mp4`、`video/frames/` 46 帧、`contact_sheet_1.png`/`contact_sheet_2.png`
