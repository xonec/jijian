# uni-widget 原生小组件插件（Android）

> 极简排班（复刻）的桌面小组件：月历 + 班次。数据由 App 端 JS（`src/services/widget.js`）写入 SharedPreferences(`jy_widget`)，插件读取后渲染；点击小组件启动 App。

## 1. 结构

    nativeplugins/uni-widget/
    ├─ package.json                 uni-app 原生插件描述（integrateType=aar，无 JS 模块）
    ├─ android/                     Android Studio 工程（Library 模块，可直接 Build AAR）
    │  ├─ build.gradle
    │  ├─ gradle.properties
    │  ├─ settings.gradle
    │  └─ src/main/
    │     ├─ AndroidManifest.xml   注册两个 AppWidgetProvider + 刷新广播 action
    │     ├─ java/cn/jianyun/replica/widget/
    │     │  ├─ WidgetPrefs.kt     读取 jy_widget SharedPreferences
    │     │  ├─ MonthWidgetProvider.kt  月历小组件（6×7 单元格，班次颜色/今日高亮）
    │     │  └─ ShiftWidgetProvider.kt  班次小组件（今日班次/时间/备注/提醒）
    │     └─ res/layout, res/xml, res/values

## 2. 构建 AAR（Android Studio）

> 仓库已提供预构建 `android/uni-widget.aar`，多数情况可跳过本节；修改插件源码后按下面步骤重新构建。

1. Android Studio 打开 `nativeplugins/uni-widget/android`；
2. 首次同步会自动生成 `local.properties`（sdk.dir 指向你的 Android SDK）；
3. Build → Build Module '`uni-widget`'，产物在 `android/build/outputs/aar/uni-widget-release.aar`；
4. 把 AAR 复制到 `nativeplugins/uni-widget/android/uni-widget.aar`；
5. HBuilderX 打开 uniapp 工程 → 制作自定义基座（本地插件会自动打进基座）；
6. 运行到 Android 真机（自定义基座），长按桌面 → 小组件 → 极简排班 → 添加。

## 3. JS 端接口（无需插件模块）

`src/services/widget.js`：

- `syncWidget(config)`：保存配置 → 生成月历载荷 → 写 SharedPreferences（`jy_widget`：`data` / `config`）→ 发送 `cn.jianyun.replica.widget.ACTION_REFRESH` 广播；
- `diagnoseWidget()`：通过 AppWidgetManager 查询月历/班次小组件实例数量；
- `buildPayload()`：月历 6×7 单元格、今日班次、主题色、字号的纯数据（H5 预览也用它）。

## 4. 注意

- 需要 **自定义基座**（标准基座不含本地插件）；
- App 包名不受限制，Provider 启动 App 用 `getLaunchIntentForPackage(packageName)`；
- 若小组件显示「正在加载」，先打开 App 的「桌面小组件」配置页点一次「保存并刷新小组件」；
- 同一份数据模型也可用于后续 UTS 版本（UTS 插件里读取同样的 SharedPreferences 即可）。
