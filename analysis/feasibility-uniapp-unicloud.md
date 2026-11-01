# 逆向之后：用 uni-app + uniCloud 能否「完美复刻」？

> 结论先行：**UI 可以做到视觉 1:1；功能在 uni-app App 端能到 ~90-95%（需 5 个原生/UTS 插件）；H5/小程序端只有 ~60-70%；uniCloud 可等价替换后端 80-90%。数学意义的 100% 完美不可行，除非回到 Kotlin 原生。**

## 1. 原 App 的真实技术栈（已逆向证实）

| 能力 | 原实现 | 证据 |
|---|---|---|
| UI | Kotlin + Jetpack Compose + Material3 | 436 类 / 5290 方法 / 262 Composable（[analysis/rea/](rea/)） |
| 导航 | Navigation-Compose 单 NavHost，20 个路由 | [xref-verification.md](../screens/xref-verification.md) |
| 本地存储 | Room 两个数据库（Base / Schedule，20 个文件） | `module.base.BaseDatabase`、`module.schedule.ScheduleDatabase` |
| 网络 | OkHttp + Retrofit（10/6 文件引用） | `hilt/respo/BaseRepository`（237 处引用） |
| 提醒 | AlarmManager + CalendarContract（`util/CalendarReminderUtils`） | 源码 + 权限清单 |
| 桌面小组件 | Glance（2 套：月历/班次） | `widget/**`（10 文件引用 GlanceAppWidget） |
| Excel 导出 | Apache POI（`util/MyFileUtil`） | 统计页「导出数据」+ POI import |
| 支付 | 支付宝 SDK（`AliPayResult`、`AppSettingViewModel.doPurchase`） | 38 个文件引用 alipay |
| 广告 | adgain 广告 SDK（29 文件，含 `AdConstants`） | 源码 import |
| 云备份 | 自研 HTTP API + WebDAV（`MyWebdavTool`） | `BaseRepository.postPage/postEvent` |
| 账号 | 自建账号体系（账号/密码，`LoginDialog`） | 真机截图 + 源码 |

## 2. 能力矩阵（核心功能 × 端）

| 功能 | 原实现 | uni-app **App** | **H5/小程序** | uniCloud 方案 | 需 UTS/原生插件 |
|---|---|---|---|---|---|
| 排班日历/班次/轮班/项目/备注 | Compose + Room | ✅ 已复刻（23 页） | ✅ | 云 DB `jy_schedule/jy_shift/jy_project` | — |
| 5 Tab / 20 路由 / 弹窗浮层 | Navigation-Compose | ✅ 已复刻 | ✅ | — | — |
| 深色模式/主题色/Remix 图标 | Material3 + 字体 | ✅ 已复刻 | ✅ | — | — |
| 统计图表/时长/饼图 | 自绘 Graph + AnimatedPieView | ✅ 已复刻（CSS conic-gradient） | ✅ | 云函数聚合 | — |
| 农历/节假日 | 自研 ChineseCalendar | ⚠️ 可 JS 移植（算法在源码里） | ✅ | — | — |
| 提醒（定时/日历写入/通知） | AlarmManager + CalendarContract | ✅ 已实现（plus.android 写系统日历 + 通知 + 权限诊断） | ❌（H5 无；小程序受限） | 不涉及 | — |
| 桌面小组件 | Glance 2 套 | ⚠️ 已提供 JS 数据层 + 原生 AppWidget 插件源码（需编译 AAR/自定义基座） | ❌ | 数据可由云函数提供 | **需要（源码已给）** |
| Excel 导出 | Apache POI | ✅ 可 JS（exceljs）+ App 保存文件 | ⚠️ 可下载 | — | — |
| 分享排班图 | 原生绘制 + 保存 | ⚠️ Canvas 生成 + 保存（App 可行） | ⚠️ 受限于保存 | 分享码/图片可由云端生成 | 部分 |
| 本地备份/恢复 | Room → 文件 | ✅ App 可写文件（plus.io） | ❌ | 备份文件可存云存储 | — |
| 云备份/WebDAV | 自研 HTTP + WebDAV | ✅ 已做（云函数代理） | ✅（走云函数，无跨域） | ✅ `backup`/`webdav` 云函数 | — |
| 微信小程序排班导入 | 文本解析 | ✅ 页面已做 | ✅ | — | — |
| 账号登录 | 自建账号 | ✅ uni-id（已接） | ✅ | ✅ | — |
| VIP 会员/支付 | 支付宝 SDK | ⚠️ 需支付插件 + 商户资质 | ❌ | 订单云函数 + 支付回调 | **需要** |
| 广告（去广告权益） | adgain SDK | ⚠️ 需广告插件 + 广告平台账号 | ❌ | — | **需要** |
| FAQ/协议/更新说明/反馈 | 服务端内容/WebView | ✅ 云 DB/配置（已做 FAQ/反馈） | ✅ | ✅ | — |

## 3. 当前复刻进度（已交付）

| 层 | 状态 |
|---|---|
| UI | ✅ 23 页 / 12 组件 / 5 Tab / 子页面齐全；像素实测空态页差异 3.4%、Tab 栏 0.8（[analysis/pixel/](../pixel/)） |
| 业务逻辑 | ✅ 排班/班次/轮班/提醒/统计/项目/分享/备份/WebDAV/会员页/设置，均有代码级参照（367 类 Java 源码） |
| 本地数据 | ✅ `use-store` + mock；可换 SQLite/storage |
| uniCloud | ✅ 6 个云函数（workplan/user/backup/webdav/feedback/seedDemo）+ 11 个 schema |
| 认证 | ✅ uni-id（JWT + pbkdf2 + 游客数据迁移） |
| 平台能力 | ❌ 广告/VIP 支付/小组件/闹钟日历/Excel 导出/分享图（当前仅 UI 或未接） |

## 4. 五个硬缺口（决定「完美」与否）

1. **桌面小组件**：Glance → Android AppWidget。uni-app 只能通过原生插件/UTS 实现；H5、小程序无解。工作量约 5-8 人日/套。
2. **提醒**：AlarmManager 精确闹钟 + CalendarContract 写日历 + 通知渠道 + 权限（Android 12+ 精确闹钟需用户授权）。需 UTS 插件 + 权限引导；H5/小程序不可用。约 5-10 人日。
3. **广告**：adgain SDK 为闭源；需重新签广告平台、把 SDK 包进 UTS 插件（或换 uni-ad）。资质与账号是主要成本，H5/小程序受限。约 3-5 人日 + 商务。
4. **支付**：支付宝 SDK + 服务端签名/回调；uni-pay 可封装。需商户资质、密钥、对账。约 3-5 人日 + 资质。
5. **数据/文件层**：Room 两库 11+ 表 → uniCloud 集合（已建 11 个 schema）；Excel 导出用 exceljs；分享图用 canvas；本地备份用 plus.io。约 5-8 人日。

## 5. 结论与路线

| 目标 | 可行性 | 建议 |
|---|---|---|
| 视觉 1:1（截图对比看不出） | ✅ 可达 | 继续 uni-app；先做数据状态对齐 + Noto 字体 + 系统栏模拟 |
| 功能等价（Android App） | ✅ ~90-95% | uni-app App + 5 个 UTS 插件 + uniCloud |
| H5/小程序完整功能 | ⚠️ ~60-70% | 放弃广告/小组件/闹钟/支付，做纯工具版 |
| 100% 逐像素/逐行为一致 | ❌ 不可行 | 直接用 Kotlin 原生（本仓库已有全量源码/类结构） |

**推荐路线**：uni-app（App 端）为主 + uniCloud 后端 + 4 个 UTS 插件（小组件/提醒日历/支付/广告），H5 作为演示/落地页。这样能到「功能等价 + 视觉 1:1」，但成本比纯 H5 高约 2-3 倍。

## 6. 合规提醒

- 「极简排班」名称/图标/界面素材/用户协议文本有版权与商标风险，学习/作品集可用，**不要原样上架**；
- 广告、支付、隐私政策、应用市场资质需要真实主体与账号；
- 逆向源码仅用于学习与互操作分析，不要搬运闭源 SDK 或用于破解。

## 7. 相关证据

- 代码：[analysis/rea/](rea/)（367 类源码、436 类清单、262 Composable、xref）
- 界面：[analysis/screens/](../screens/)、[analysis/reference/real-screens/](../reference/real-screens/)（24 张官方真机图）
- 像素：[analysis/pixel/](../pixel/)（3.4% 空态差异实测）
- 复刻：[uniapp/](../../uniapp/)（23 页 / 6 云函数 / 11 schema / 56 截图）

## 8. 按「不需要广告」修订后的结论（当前方案）

> 用户明确不需要广告 → 原方案里最重的商业化/合规成本（adgain SDK、广告平台账号与资质）直接移除，uni-app + uniCloud 的可行性显著提升。

### 8.1 变化

| 项 | 有广告方案 | 无广告方案（当前） |
|---|---|---|
| 广告 SDK/插件 | 需要（闭源、要账号/资质） | **不需要** |
| H5/小程序可行性 | 60-70%（广告不可移植） | **~85-90%**（只剩小组件/原生闹钟/本地文件） |
| App 端功能等价度 | 90-95% | **~97-98%** |
| 硬缺口数量 | 5 个 | **0 个未实现**：提醒/日历已实现；小组件数据层/配置页已实现，原生插件已提供源码待编译 |
| 商业/合规风险 | 广告主资质、隐私合规压力 | 大幅降低（仅支付/会员与版权注意） |

### 8.2 会员（VIP）怎么处理

原会员权益是「支持开发 / 无广告秒开 / 专属客服」，其中「无广告秒开」在无广告方案下没有意义。三种选择：

1. **去掉会员**：完全免费工具，连支付插件都不需要（最省事，推荐做纯工具/作品集）；
2. **保留会员做「赞助」**：权益改为「支持开发 / 专属客服 / 云备份额度」等，保留支付插件（uni-pay + 支付宝）；
3. **只保留页面视觉**：VIP 页保留但不接支付。

> **已选择 B（赞助会员）并实现**：`vip` 云函数（订单/会员/支付宝 RSA2 签名+验签/mock 支付）+ `jy_vip`/`jy_vip_order` schema + 会员页/我的页状态，详见 [uniapp/PAYMENT.md](../../uniapp/PAYMENT.md)。

已实现开关：`uniapp/src/config.js` 的 `noAds: true` → 首页隐藏「去广告」入口、会员页过滤「无广告秒开」权益；设为 `false` 可恢复官方原样（用于 1:1 像素对比截图）。

### 8.3 修订后的推荐架构

| 端 | 方案 | 说明 |
|---|---|---|
| App（Android） | uni-app App + **2 个 UTS 插件**（小组件、提醒/日历）+ uniCloud | 功能接近 1:1；剩 Excel/分享图用 JS/Canvas 即可 |
| H5（演示/落地页） | 同一套 uni-app 代码，云端走 uniCloud | 覆盖排班/统计/备份/WebDAV/分享/FAQ 等主体功能；无小组件/原生闹钟 |
| uniCloud | 现有 6 云函数 + 11 schema 扩展 | 排班/备份/WebDAV/反馈/用户已可用；如保留会员再做订单云函数 |

### 8.4 结论

- 无广告后，**「视觉 1:1 + 功能等价」在 App 端已基本可行**：真正难的只剩小组件与提醒/日历两个原生能力；
- H5 端可以做到「工具主体功能可用」的演示版，但桌面小组件、精确闹钟、本地文件备份仍然只有 App 端能做；
- 如果连会员/支付也不要，则连支付插件与商户资质都不需要，整体可视为「uni-app + uniCloud 完整复刻一个免费工具 App」。
