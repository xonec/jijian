# 提醒 / 系统日历 / 通知原生能力（App 端）

> 复刻原 App 的提醒方案：**把提醒写入系统日历**，由系统日历在设定时间通知（不依赖 APP 常驻后台，也不做自建推送）。在 App 端通过 `plus.android` 直接调用 Android 系统 API，**无需 UTS 插件/自定义基座重打包**；H5、小程序自动降级。

## 1. 能力矩阵

| 能力 | App（Android） | H5 / 小程序 |
|---|---|---|
| 写入系统日历（排班提醒） | ✅ `CalendarContract.Events` + `Reminders` | ❌（提示不支持） |
| 更新 / 删除对应日历事件 | ✅（本地保存 alarmId → eventId 映射） | ❌ |
| 测试日历提醒（1 分钟后） | ✅ 权限页「验证日历提醒」 | ❌ |
| 通知权限状态 / 申请（Android 13+） | ✅ `POST_NOTIFICATIONS` | ❌ |
| 日历权限状态 / 申请（读+写） | ✅ `READ/WRITE_CALENDAR` | ❌ |
| 精确闹钟状态（Android 12+） | ✅ `AlarmManager.canScheduleExactAlarms()` | ❌ |
| 立即本地通知 | ✅ `uni.createPushMessage` | ⚠️ toast 降级 |
| 打开系统设置（通知/日历/精确闹钟/应用） | ✅ Intent | ❌ |

## 2. 实现

`src/services/reminder.js`（394 行）：

- `isSupported()`：`plus.os.name === 'Android'`；
- `diagnose()`：返回 `{ supported, sdkInt, notification, calendarRead, calendarWrite, canExactAlarm, calendarId }`；
- `requestPermissions(kind)`：`kind = 'notification' | 'calendar' | 'all'`，封装 `plus.android.requestPermissions`；
- `syncAlarm(alarm)`：确保有可写日历（优先系统已有可写日历，否则创建本地日历「极简排班」）→ 插入/更新事件 + 0 分钟提醒；返回 `{ eventId, start, calendarId }`；
- `removeAlarm(alarmId)`：删除映射的日历事件；
- `testCalendarAlarm()`：写一条 1 分钟后的测试事件；
- `notifyNow({title, content})`：`uni.createPushMessage`；
- `openSettings(kind)`：跳系统通知/精确闹钟/应用详情页。

**为什么不用 UTS 插件**：系统日历方案本身不需要自建后台服务；`plus.android` 能直接调 CalendarContract / NotificationManager，省掉自定义基座与插件清单配置。若以后需要「APP 被完全杀掉也能弹自有通知」，再升级为 UTS 插件（AlarmManager 精确闹钟 + 通知渠道 + manifest 声明 Receiver）。

## 3. 页面接入点

| 页面 | 行为 |
|---|---|
| 提醒编辑页 `pages/sub/alarm-edit` | 新增「同步到系统日历」开关（默认开）；保存时写入/更新日历事件，关闭开关则删除；toast 提示同步结果（未授权/失败不阻塞保存） |
| 提醒列表 `pages/alarm` | 开关打开时同步到日历、关闭时删除对应事件；「授权」按钮跳系统日历权限入口 |
| 权限页 `pages/sub/permission` | 真实权限诊断（通知/日历/精确闹钟）、申请权限、写入 1 分钟后测试事件、立即发通知、跳系统设置；H5 显示「—」并提示去 App 操作 |

## 4. 权限与系统限制

| 平台版本 | 要求 |
|---|---|
| Android 13+ | `POST_NOTIFICATIONS` 运行时权限 |
| Android 6+ | `READ_CALENDAR` / `WRITE_CALENDAR` 运行时权限 |
| Android 12+ | 精确闹钟权限（`SCHEDULE_EXACT_ALARM`）；本项目提醒走系统日历，不强制依赖该权限 |
| 厂商定制 | 后台限制会影响自建通知，但**系统日历提醒不受影响**（这就是原 App 选择日历方案的原因） |

权限文案（App 会显示）：

- 「授权极简排班操作您的日历（更新数据）」
- 「授权极简排班查询您的日历（查询数据）」

## 5. 真机验证步骤

1. HBuilderX 运行到 Android 真机（标准基座即可，无需自定义基座）；
2. 我的 → 通知权限设置：查看三项权限状态；
3. 点「验证日历提醒」→ 授权日历 → 打开系统日历，确认 1 分钟后出现「极简排班 · 日历提醒测试」事件；
4. 班次 → 提醒 → 添加提醒 → 保存，提示「已同步系统日历」；打开系统日历查看事件；
5. 在提醒列表关闭开关 → 系统日历事件被删除；
6. 修改提醒时间再保存 → 日历事件时间更新（同一事件，不重复创建）。

## 6. 已知限制

- 依赖系统日历 App 的通知行为（部分机型可自定义提醒铃声/强提醒）；
- 事件为单次（下一天不重复）；重复规则（RRULE）与按「上班前 N 分钟」自动偏移到具体日期，后续可扩展；
- 日历选择：优先系统已有可写日历，没有则创建本地日历「极简排班」；用户删除该日历后，下次同步会重建；
- 若用户拒绝「不再询问」，只能引导去系统设置；权限页已提供入口。

## 7. 后续可扩展

| 能力 | 做法 |
|---|---|
| 自有通知（APP 被杀也弹） | UTS 插件：AlarmManager 精确闹钟 + 通知渠道 + manifest Receiver |
| 重复提醒 | CalendarContract RRULE（FREQ=DAILY/WEEKLY）+ 按排班周期生成 |
| 提前量精确化 | 由 `when`（上班前 N 分钟）反推事件时间（当前提醒时间是保存时算好的） |
| 多设备 | 提醒数据已在 uniCloud（jy_alarm），换机后可重新同步日历 |
