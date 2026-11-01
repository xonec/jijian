# 权限与原生能力配置

> 本项目在 `manifest.json` + 运行时申请中已经配置了常用权限；需要企业资质的项目暂缓。

## 已配置

| 能力 | Android 权限 / 模块 | 运行时申请 | 说明 |
|---|---|---|---|
| 网络 | `INTERNET`（uni-app 自动）、`ACCESS_NETWORK_STATE`、`ACCESS_WIFI_STATE` | 否 | 安装即授予 |
| 位置 | `ACCESS_FINE_LOCATION`、`ACCESS_COARSE_LOCATION`，模块 `Geolocation` | 是 | 仅前台定位；后台定位暂缓 |
| 日历 | `READ_CALENDAR`、`WRITE_CALENDAR` | 是 | 提醒写入系统日历 |
| 通知 | `POST_NOTIFICATIONS`（Android 13+）、`VIBRATE` | 是 | 本地通知/提醒 |
| 文件 | `READ_MEDIA_IMAGES/VIDEO/AUDIO`（手动声明）；旧系统 `READ/WRITE_EXTERNAL_STORAGE` 由 HBuilderX 基础/模块自动合并，**不要手写** | 是（旧系统） | App 私有目录不需要；导出/保存到公共目录时申请 |
| 相机 | `CAMERA`，模块 `Camera` | 是 | 拍照/扫码等 |
| 相册 | `READ_MEDIA_IMAGES`、`READ_MEDIA_VIDEO`（Android 13+） | 是 | 选择图片/视频 |
| 录音 | `RECORD_AUDIO`，模块 `Record` | 是 | 相机录像/语音相关 |
| 消息推送 | 模块 `Push`（uni-push 2.0） | 否（需开通服务） | 需在 DCloud 控制台开通 uni-push 2.0 后才能打包/收到推送 |
| 支付 | — | — | **暂缓**：支付宝 App 支付、微信支付需要企业资质/签约 |

## 运行时申请入口

App 内：**我的 → 通知权限设置 → 申请全部权限**（网络/日历/通知/位置/相机/相册/文件/录音）。

权限状态页在 WebView 壳（`release/`）里通过 `AndroidBridge` 显示；在 HBuilderX 原生包里走 `plus.android` 检测与申请。

## 暂缓 / 需要企业资质

| 项目 | 原因 | 后续如何加 |
|---|---|---|
| 支付宝 App 支付 | 需要企业支付宝账号并签约「App 支付」 | 见 `PAYMENT.md`；签名参数进云函数配置，manifest 加 `Payment` 模块 + `sdkConfigs.payment.alipay.appid` |
| 微信登录/支付 | 需要企业微信开放平台账号/签约 | 后续接入 uni 登录/支付模块 |
| 厂商推送通道（华为/小米/OPPO/vivo/荣耀） | 需要各厂商企业开发者资质；uni-push 基础能力可先用 | 在 DCloud 控制台 uni-push 2.0 内配置厂商通道 |
| 后台/持续定位 | 需要隐私审核与业务资质 | manifest 加 `ACCESS_BACKGROUND_LOCATION` + 隐私说明 |
| 全盘文件管理 `MANAGE_EXTERNAL_STORAGE` | Google Play / 国内应用市场限制，需企业资质与审核 | 使用 SAF/系统文件选择器替代，不建议声明 |

## 注意

1. **消息推送**：manifest 已配置 `Push`（uni-push 2.0）。如果尚未在 DCloud 控制台开通 uni-push 2.0，云打包会报「应用尚未开通 uni-push 2.0 服务」；开通后重新打包即可。
2. **支付**：当前 manifest 未加入 `Payment` / 支付宝配置，避免因空 appid 导致打包校验失败；会员页默认走 mock 支付。
3. 权限被拒绝后，可在系统设置里手动开启；权限页提供「前往系统设置」。
4. 相机/相册/文件/定位如果需要上架应用市场，需在隐私政策中说明用途。

## 云打包 AndroidManifest 重复错误

报错示例：

```
Element uses-permission#android.permission.WRITE_EXTERNAL_STORAGE duplicated
Manifest merger failed
```

原因：HBuilderX 云打包会生成 `includePermissions` 模块，基础包和所选模块（Camera/Record/Push 等）已经自动声明了 `READ_EXTERNAL_STORAGE`/`WRITE_EXTERNAL_STORAGE`。如果在 `manifest.json` 的 `android.permissions` 里再手写同名权限，尤其是带 `android:maxSdkVersion` 属性的版本，Manifest Merger 会认为属性不一致而报 duplicated。

修复：

1. 删除手写的 `READ_EXTERNAL_STORAGE`、`WRITE_EXTERNAL_STORAGE`；
2. 只保留 `READ_MEDIA_IMAGES`/`READ_MEDIA_VIDEO`/`READ_MEDIA_AUDIO` 等模块不会自动声明的媒体权限；
3. 重启 HBuilderX 后重新云打包。
