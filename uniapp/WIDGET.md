# 桌面小组件（App 端）

> 原 App 用 Glance 实现两套小组件（月历 / 班次，见 `analysis/rea/source/widget/**` 与 `decoded/res/xml/app_widget.xml`）。复刻方案：**JS 数据层 + 原生 AppWidgetProvider 插件**，数据经 SharedPreferences 传递，样式与配置在 App 内配置页完成。

## 1. 结构

| 层 | 位置 | 说明 |
|---|---|---|
| 数据/配置 | `src/services/widget.js` | 配置持久化、月历载荷生成、SharedPreferences 写入 + 刷新广播、实例诊断 |
| 配置页 | `src/pages/sub/widget/index.vue` | 实时预览、显示项/字号/配色/暗黑模式、保存并刷新、添加指引 |
| 原生插件 | `nativeplugins/uni-widget/` | 两个 AppWidgetProvider + 布局 + 清单（可 Build AAR） |

## 2. 数据流

    配置页保存
      → widget.js 生成 payload（title/weeks/today/theme/sizes/display）
      → SharedPreferences('jy_widget').putString('data' / 'config')
      → sendBroadcast('cn.jianyun.replica.widget.ACTION_REFRESH')
      → Provider.onReceive → 读取 data → RemoteViews 渲染

payload 结构（节选）：

    {
      "title": "2024年9月",
      "weekLabels": ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
      "weeks": [[{"d":1,"lunar":"廿九","work":"早班","color":"#1BA784","textColor":"#FFFFFF","today":false}], ...],
      "today": { "d":2, "shift":"早班", "time":"09:00~18:00", "remark":"", "alarm":"07:55" },
      "display": { "showRemark": true, "showBeginTime": true, "showEndTime": false },
      "theme": { "titleBg":"#55BB8A", "calBg":"#FFFFFF", "dark": false },
      "sizes": { "date":12, "work":9, "time":8 }
    }

## 3. 两个小组件

| 小组件 | 内容 | 大小 |
|---|---|---|
| 月历 | 月份标题 + 星期行 + 6×7 天格子；有班次的天用班次色填充、文字自动反白；今日高亮 | min 320×180dp，可缩放 |
| 班次 | 今日排班：班次名、时间段、备注、提醒时间；无排班显示「今日无排班」 | min 180×80dp，可缩放 |

## 4. 使用步骤

1. 构建并集成插件：见 `nativeplugins/uni-widget/README.md`；
2. App 内：我的 → 桌面小组件配置 → 调整样式 → 「保存并刷新小组件」；
3. 长按桌面空白处 → 小组件 → 找到「极简排班」→ 添加月历/班次小组件；
4. 修改排班后回到配置页点「仅刷新小组件」（或重新保存）。

## 5. H5 / 未安装插件时

- 配置页仍可保存与预览（纯前端 payload）；
- 「保存并刷新」会提示配置已保存、H5 不同步；
- 未安装原生插件时诊断显示「未检测到原生小组件插件」。

## 6. 已知限制 / 后续

| 限制 | 后续 |
|---|---|
| 需要自定义基座（本地插件） | 可把插件发布为 uni 原生插件/UTS 插件，标准基座不可用 |
| 小组件刷新依赖打开 App 或点「刷新」 | 可加 WorkManager 定时刷新；或 Provider 内直接读 App 数据库（需额外桥接） |
| 只支持 Android | iOS 需 WidgetKit（另做） |
| 桌面预览图（previewImage）未做 | 可在 xml 里加 `android:previewImage`，用截图或 SVG 转 PNG |
