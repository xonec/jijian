# 发布产物：可安装 APK（WebView 外壳版）

> 产物：`replica-1.0.0-release.apk`（已签名，可直接安装）
> 包名：`cn.jianyun.workplan.replica` ｜ 版本：1.0.0（versionCode 1） ｜ minSdk 26 / targetSdk 34 ｜ 大小约 347KB
> SHA-256：`681d434770b95db424c31462cfef6dfec5119a2eb093e9d73247c13ea4a38dbb`

## 1. 安装 / 卸载

    adb install -r replica-1.0.0-release.apk
    adb shell am start -n cn.jianyun.workplan.replica/.MainActivity
    adb uninstall cn.jianyun.workplan.replica

也可以直接传到 Android 手机点击安装（允许「安装未知来源应用」）。

## 2. 重新构建

    # 前置：Android SDK（build-tools 34.0.0 / platforms/android-34）、JDK 17、zip、python3 + Pillow
    cd uniapp && pnpm build:h5        # 生成 dist/build/h5
    cd ../release && ./build-apk.sh   # aapt2/javac/d8/zipalign/apksigner 全流程

`build-apk.sh` 做了 8 步：拷贝 H5 产物到 `assets/www` → 生成图标 → aapt2 编译链接 → javac → d8 → 打进 APK → zipalign → apksigner 签名（首次自动生成 keystore）并输出 SHA-256。

## 3. 实现方案（为什么是 WebView 外壳）

本机没有 HBuilderX / uni-app 离线 SDK，无法直接产出 uni-app App 包；因此用**纯 Android SDK 工具链**做一个最小外壳：

- `MainActivity`：启动本地 `AssetServer`（`http://127.0.0.1:8123` 提供 `assets/www` 资源）→ WebView 加载，H5 路由/localStorage 与浏览器一致；
- 相对路径产物直接可用（H5 构建 `./assets/...`）；
- 返回键走 WebView 历史；冷启动保持 localStorage。

源码：`release/webview-apk/`（MainActivity.java、AssetServer.java、AndroidManifest.xml、res）。

## 4. 签名与 keystore

| 项 | 值 |
|---|---|
| keystore | `release/keystore/replica-release.jks` |
| alias | `replica` |
| 密码 | `release/keystore/password.txt`（首次构建随机生成，权限 600） |
| 证书 SHA-256 | `233645D5E8B2592D90831A2F8D81829CFCC1853E1475262D986BA6894A1A6513` |

> 这是**演示/测试签名**：正式上架请换成你自己的 release keystore，并离线备份；签名一旦更换，老版本无法覆盖升级。

## 5. 局限：这个 APK 不包含原生 plus 能力

| 能力 | WebView APK | 正式 App 包 |
|---|---|---|
| 排班/班次/提醒 UI、统计、分享、备份、WebDAV 页面 | ✅ | ✅ |
| 本地 mock / H5 存储 | ✅ | ✅ |
| 系统日历提醒（`plus.android`） | ❌ 自动降级 toast | ✅ |
| 桌面小组件（nativeplugins/uni-widget） | ❌ | ✅（需构建 AAR） |
| 支付宝支付（`uni.requestPayment`） | ❌（H5 不支持） | ✅（自定义基座） |
| uniCloud 云函数 | ⚠️ H5 模式需配置安全域名/前端托管，未在 APK 内联 | ✅ |

因此它适合：**UI/交互验收、演示、非原生功能回归**。要产出「完整功能」的发布包，走下面第 6 节。

## 6. 正式 APK 发布路径（原生能力齐全）

### 方案 A：HBuilderX 自定义基座 / 云打包（推荐）

1. HBuilderX 打开 `uniapp/`，manifest 中确认包名/版本/签名；
2. 制作自定义基座：勾选 `nativeplugins/uni-widget`（先按插件 README 构建 AAR）；
3. 运行到真机验证提醒/日历、小组件、支付；
4. 发行 → 原生 App 云打包（或本地打包）：选择 Android、使用自有证书、勾选所需权限；
5. 产出 `.apk`（或 `.aab` 上架 Google Play；国内商店一般要 APK）。

### 方案 B：uni-app 离线 SDK + Android Studio 本地打包

1. 下载 DCloud uni-app Android 离线 SDK（与 HBuilderX 版本匹配）；
2. 把 `dist/build/app-plus` + `nativeplugins` 集成进 SDK 工程（`apps/<appid>/www`）；
3. 配置 `dcloud_control.xml`、应用包名、签名；
4. Android Studio `assembleRelease` 产出 APK。

## 7. GitHub Actions 自动构建

已提供两个 workflow：

| 文件 | 触发 | 作用 |
|---|---|---|
| `.github/workflows/ci.yml` | push / PR | SFC 检查、云函数语法、H5 构建、23 路由冒烟（runner 有 Chrome 时） |
| `.github/workflows/android-release.yml` | tag `v*` / 手动 | 构建签名 APK、上传 artifact、tag 时发布 GitHub Release |

- 发布：`git tag v1.0.1 && git push origin v1.0.1`；
- 签名：配置 `RELEASE_KEYSTORE_BASE64` / `RELEASE_STORE_PASSWORD` / `RELEASE_KEY_PASSWORD` / `RELEASE_KEY_ALIAS` 四个 secrets（tag 构建强制要求）；
- 手动触发不配 secrets 时用临时演示 keystore 签名，仅供测试；
- 本地等价自测：`./release/ci-local.sh`。

完整说明：[CI.md](CI.md)。

## 8. 上架前检查清单

- [ ] 包名/应用名/图标/截图（各商店尺寸）
- [ ] versionCode/versionName 递增；`manifest.json` 与 `build.gradle` 一致
- [ ] 自有 release 签名 + 证书备份 + 指纹记录
- [ ] 隐私政策 URL（应用内 + 商店后台）、权限用途说明（日历/通知/网络）
- [ ] targetSdk 满足商店要求（2024 年起国内商店普遍要求 33+）
- [ ] 软著/ICP 备案/应用市场开发者账号（国内商店）；Google Play 需 Data safety 表单
- [ ] 真机回归：提醒/日历、小组件、支付、登录、备份/恢复、WebDAV
- [ ] 崩溃/ANR 监控（可用 uni 统计或第三方）
