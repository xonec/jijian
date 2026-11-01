# assets_extracted · 极简排班 3.5.0 (cn.jianyun.workplan) UI 素材清单

来源: APK 原始件 app.apk (只读)。路径约定: 若原型页位于 prototype/ 目录, 引用为 ../assets_extracted/<category>/<file>; 若原型放在仓库根 jianyun/ 下则为 assets_extracted/<category>/<file>。

## 归类原则
- 只收录本 App 自有素材; 已排除广告 SDK(倍孜 beizi_ / 穿山甲 tt_ / 天目 tianmu_ / 美数 ms_ / adgain_ / hjyt 等)、AndroidX/Material/Glance、coil 等三方资源。
- App 自有资源判定依据: (a) App 源码直接引用 R.drawable.xxx / R.mipmap.xxx (附 file:line); (b) AndroidManifest 的 icon/theme/provider 引用; (c) App 自有布局/样式文件引用。
- 9-patch: 本次 App 自有素材中未发现 .9.png。

## app-icon

| 文件 | 尺寸 | 源 APK 路径 | 用途 | 证据 | 备注 |
|---|---|---|---|---|---|
| app-icon/ic_launcher-mdpi.png | 48x48 | decoded/res/mipmap-mdpi/ic_launcher.png | App launcher icon | AndroidManifest.xml:56 android:icon=@mipmap/ic_launcher; res.txt mipmap/ic_launcher |  |

| app-icon/ic_launcher_round-mdpi.png | 48x48 | decoded/res/mipmap-mdpi/ic_launcher_round.png | Round launcher icon | AndroidManifest.xml:56 android:roundIcon=@mipmap/ic_launcher_round |  |

| app-icon/ic_launcher-hdpi.png | 72x72 | decoded/res/mipmap-hdpi/ic_launcher.png | App launcher icon | AndroidManifest.xml:56 android:icon=@mipmap/ic_launcher; res.txt mipmap/ic_launcher |  |

| app-icon/ic_launcher_round-hdpi.png | 72x72 | decoded/res/mipmap-hdpi/ic_launcher_round.png | Round launcher icon | AndroidManifest.xml:56 android:roundIcon=@mipmap/ic_launcher_round |  |

| app-icon/ic_launcher-xhdpi.png | 96x96 | decoded/res/mipmap-xhdpi/ic_launcher.png | App launcher icon | AndroidManifest.xml:56 android:icon=@mipmap/ic_launcher; res.txt mipmap/ic_launcher |  |

| app-icon/ic_launcher_round-xhdpi.png | 96x96 | decoded/res/mipmap-xhdpi/ic_launcher_round.png | Round launcher icon | AndroidManifest.xml:56 android:roundIcon=@mipmap/ic_launcher_round |  |

| app-icon/ic_launcher-xxhdpi.png | 144x144 | decoded/res/mipmap-xxhdpi/ic_launcher.png | App launcher icon | AndroidManifest.xml:56 android:icon=@mipmap/ic_launcher; res.txt mipmap/ic_launcher |  |

| app-icon/ic_launcher_round-xxhdpi.png | 144x144 | decoded/res/mipmap-xxhdpi/ic_launcher_round.png | Round launcher icon | AndroidManifest.xml:56 android:roundIcon=@mipmap/ic_launcher_round |  |

| app-icon/ic_launcher-xxxhdpi.png | 192x192 | decoded/res/mipmap-xxxhdpi/ic_launcher.png | App launcher icon | AndroidManifest.xml:56 android:icon=@mipmap/ic_launcher; res.txt mipmap/ic_launcher |  |

| app-icon/ic_launcher_round-xxxhdpi.png | 192x192 | decoded/res/mipmap-xxxhdpi/ic_launcher_round.png | Round launcher icon | AndroidManifest.xml:56 android:roundIcon=@mipmap/ic_launcher_round |  |

| app-icon/logo.png | 192x192 | decoded/res/drawable/logo.png | Splash logo bitmap (used by splash_background layer-list) | decoded/res/drawable/splash_background.xml (@drawable/logo); res.txt drawable/logo -> res/zu.png |  |

| app-icon/minilogo.xml | - | decoded/res/drawable/minilogo.xml | Splash animated icon (windowSplashScreenAnimatedIcon) | decoded/res/values/styles.xml:2249-2254 Theme.App.Starting; 注意: 实际内容为空 selector(原 APK 中即如此, raw/res/il.xml) |  |

| app-icon/splash_background.xml | - | decoded/res/drawable/splash_background.xml | Splash window background layer-list | res.txt drawable/splash_background -> res/5w.xml; 引用 @color/screen + @drawable/logo |  |

## widget

| 文件 | 尺寸 | 源 APK 路径 | 用途 | 证据 | 备注 |
|---|---|---|---|---|---|
| widget/quick.png | 452x466 | decoded/res/drawable/quick.png | 桌面小组件预览图 appwidget previewImage (452x466) | decoded/res/xml/app_widget.xml previewImage=@drawable/quick; res.txt drawable/quick -> res/1e.png |  |

| widget/app_widget.xml | - | decoded/res/xml/app_widget.xml | AppWidgetProviderInfo (min 320x180dp, resize h+v, update 30min) | AndroidManifest.xml:63-68 MyAppWidgetReceiver; res.txt xml/app_widget -> res/Ic.xml |  |

| widget/widget_today.xml | - | decoded/res/drawable/widget_today.xml | 今日日期格边框 shape 2dp #EE4863 radius 6dp | WidgetCalendarBodyViewKt.java:301 R.drawable.widget_today; res.txt -> res/L-1.xml |  |

| widget/widget_otherday.xml | - | decoded/res/drawable/widget_otherday.xml | 非今日日期格边框 shape 2dp 透明 radius 6dp | WidgetCalendarBodyViewKt.java:301 R.drawable.widget_otherday; res.txt -> res/hk.xml |  |

## cloud

| 文件 | 尺寸 | 源 APK 路径 | 用途 | 证据 | 备注 |
|---|---|---|---|---|---|
| cloud/cloud.png | 96x96 | decoded/res/mipmap-hdpi/cloud.png | WebDAV 云备份默认图标 (GoogleDrive/通用) | MyWebdavTool.java:334-342 R.mipmap.cloud; platform GoogleDrive |  |

| cloud/jgy.png | 120x120 | decoded/res/mipmap-hdpi/jgy.png | 坚果云 WebDAV 图标 | MyWebdavTool.java:334-342 R.mipmap.jgy; platform 坚果云 |  |

| cloud/koofr.png | 32x32 | decoded/res/mipmap-hdpi/koofr.png | Koofr WebDAV 图标 | MyWebdavTool.java:334-342 R.mipmap.koofr; platform Koofr |  |

## layouts

| 文件 | 尺寸 | 源 APK 路径 | 用途 | 证据 | 备注 |
|---|---|---|---|---|---|
| layouts/main.xml | - | decoded/res/layout/main.xml | MainActivity 布局: ComposeView(container) + ads1/ads2 FrameLayout | res.txt layout/main -> res/01.xml |  |

| layouts/view_gregorian_lunar_calendar.xml | - | decoded/res/layout/view_gregorian_lunar_calendar.xml | 公历+农历年月日选择器 (NumberPickerView x3) | res.txt layout/view_gregorian_lunar_calendar -> res/lO.xml |  |

| layouts/widget_circle_pie_legends.xml | - | decoded/res/layout/widget_circle_pie_legends.xml | 饼图图例布局 (15dp 色块 + 14sp #767676 文字) | res.txt layout/widget_circle_pie_legends -> res/aS.xml |  |

| layouts/widget_default_pie_legends.xml | - | decoded/res/layout/widget_default_pie_legends.xml | 饼图图例布局 | res.txt layout/widget_default_pie_legends -> res/ff.xml |  |

## palette

| 文件 | 尺寸 | 源 APK 路径 | 用途 | 证据 | 备注 |
|---|---|---|---|---|---|
| palette/color.json | - | decoded/assets/data/color.json | 230 个中国色预设 (name/color/catalog), 用于班次颜色与小组件取色 | FormItemKt ShowColorPickerView 读取 assets/data/color.json |  |

## 已排除的易混淆素材（非 App 自有）

| 资源 | 实际归属 | 证据 |
|---|---|---|
| drawable/hjyt_icon.png, card_view_33efefef_bg.xml, card_view_black_bg.xml, circle_solid_main.xml | com.hjyt.adsdk 广告 SDK | jadx-src/sources/com/hjyt/adsdk/R.java; com/hjyt/ad/adManager/c.java 引用 |

| mipmap/logo.png (355x355 饼图) | 未在 App 源码出现引用, 疑似三方库示例图标 (razerdp animatedpieview 相关) | cn/jianyun 源码无 R.mipmap.logo; 仅资源表存在 |

| drawable/close.png | coil 图片库 | coil/util/Utils.java 等引用 |

| mipmap/beizi_*, tianmu_*, tt_*, ms_*; drawable/adgain_*, adsdk_* | 广告 SDK | 资源名前缀与对应 SDK 包 |

| layout/root_*, box_*, column_*, row_*, radio_* | androidx Glance 生成布局 (GeneratedLayoutsKt) | jadx-src/sources/androidx/glance/appwidget/GeneratedLayoutsKt.java |

| drawable/ad_close, image_ad_logo_default, native_item_btn_bg, anim_shake_download | 广告 SDK | 资源名前缀/被 SDK 布局引用 |

## 字体/图标

- fonts/remixicon.ttf - Remix Icon v4.3 子集 (17KB, 87 个 codepoint, 79 个 IconFont 常量全部命中 cmap)
- fonts/icon-map.json - name -> codepoint/glyphName 机器可读映射 (含别名与字体中未被引用的 11 个码点)
- fonts/icon-font.css - @font-face + .ri-<name>::before content 规则, 原型 <link> 后 <i class="ri-calendar"></i> 即可
- fonts/icon-sheet.html - 全部 79 图标可视图

## 关键视觉参考

- widget/quick.png 是 APK 内置的真实小组件预览图 (452x466), 显示默认排班日历样式: 绿色标题栏 2024年08月排班 + 上个月/本月/下个月 + 周一..周日 + 日期/农历 + 班次色块(白班/夜班/休息)。复刻小组件可直接作为对照基准。
- app-icon/ic_launcher-*.png 与 app-icon/logo.png 为绿色 (#55BB8A 系) 圆角方形底 + 白色 极简排班 字样。

