# PVE 本地打包机

已在用户的 PVE 上创建 Ubuntu 24.04 打包虚拟机：

| 项 | 值 |
|---|---|
| PVE | https://10.0.0.250:8006（节点 pve） |
| VMID | 110 |
| 名称 | android-builder |
| IP | 10.0.0.251/24 |
| 配置 | 8 vCPU / 16GB RAM / 100GB，开机自启 |
| SSH | `ssh android-builder`（密钥 ~/.ssh/android-builder） |

## 已安装环境

- OpenJDK 17
- Node 20 + pnpm 9
- Gradle 8.6
- Android SDK：platform-tools、android-34、build-tools 34.0.0
- 项目仓库：`/root/jijian`
- 资源构建：`/root/build-resources.sh`（内部执行 `pnpm build:app`，输出 `dist/build/app`）

## 离线打包 DCloud SDK（已安装）

已使用用户下载的 `Android-SDK@5.34.82692_20261030`，解压到：

```
/opt/dcloud-offline-sdk/HBuilder-Integrate-AS
```

离线工程 `simpleDemo` 已配置：appid `__UNI__11376C4`、包名 `cn.jianyun.workplan.replica`、versionCode 100、versionName 1.0.0、DCloud 云端证书签名、uni-widget AAR。

一键构建：

```bash
ssh android-builder /root/build-offline-apk.sh
```

产物：

```
/opt/dcloud-offline-sdk/HBuilder-Integrate-AS/simpleDemo/build/outputs/apk/release/simpleDemo-release.apk
```

已验证：SHA1 `C1:E5:55:37:13:A1:43:77:0F:A4:C1:E1:31:E7:0A:86:49:82:84:F9`，包含月历/班次小组件。

## 手动步骤（已完成，保留备查）

DCloud 的 Android 离线 SDK 只提供网盘下载，需要手动下载后放到：

```
/opt/dcloud-offline-sdk/HBuilder-Integrate-AS
```

下载地址：https://nativesupport.dcloud.net.cn/AppDocs/download/android.html
要求版本与 HBuilderX 5.34 对应。

之后将 `dist/build/app` 复制到：

```
app/src/main/assets/apps/__UNI__11376C4/www
```

并把 `uniapp/nativeplugins/uni-widget/android/uni-widget.aar` 加入离线工程，配置签名后执行：

```bash
./gradlew assembleRelease
```

## 快捷脚本

虚拟机内已提供：

```bash
/root/build-resources.sh      # 只生成 dist/build/app
/root/build-shell-apk.sh      # 构建 WebView 壳 APK
/root/build-offline-apk.sh    # 生成资源 + 离线原生 APK（需先放 DCloud SDK）
```

## 签名证书

虚拟机内已放置（仅本地，不提交仓库）：

- `/root/keystores/replica-release.jks`：演示证书，alias `replica`
- `/root/keystores/dcloud-__UNI__11376C4.jks`：DCloud 云端证书，alias `__uni__11376c4`
- 密码：`/root/keystores/password.txt`

## 离线 APK 验证记录

- 2026-11-02：DCloud Android-SDK@5.34.82692 安装完成
- 2026-11-02：`simpleDemo` 离线工程构建成功，APK 30.8MB
- 已确认包名、targetSdk 34、13 项权限、云端证书 SHA1、uni-widget Provider 全部正确

## 验证记录

- `pnpm build:app` 已成功，生成 `dist/build/app`（约 2.1MB）
- `pnpm build:h5` 已成功
- Android SDK / Gradle / JDK / Node 全部可用
