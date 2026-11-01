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

## 离线打包 DCloud SDK（手动一步）

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

## 验证记录

- `pnpm build:app` 已成功，生成 `dist/build/app`（约 2.1MB）
- `pnpm build:h5` 已成功
- Android SDK / Gradle / JDK / Node 全部可用
