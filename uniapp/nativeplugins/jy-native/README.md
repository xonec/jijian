# jy-native 原生插件

极简排班使用的 Android 原生桥接 AAR，用于绕开 `plus.android` 在以下场景的桥接限制：

- 本地通知：`NotificationManager` + `NotificationChannel`（不依赖 Push 模块）
- 系统日历：`CalendarContract` 增删改查（自动创建本地日历）

## 方法

```js
const native = uni.requireNativePlugin('jy-native')
native.notify(title, content, callback)
native.addCalendarEvent(title, beginMs, endMs, description, callback)
native.deleteCalendarEvent(eventId, callback)
native.getStatus(callback)
```

## 构建

源码在 `android/src/main/java/cn/jianyun/replica/nativeplugin/JYNativeModule.java`，
编译依赖 DCloud 离线 SDK 的 `uniapp-v8-release.aar`（`UniModule` / `UniJSMethod`）。

预编译产物：`android/jy-native.aar`。
