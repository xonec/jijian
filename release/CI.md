# CI：自动构建发布 APK（GitHub Actions）

> 两个 workflow：
> - `.github/workflows/ci.yml`：push / PR 时做静态检查、云函数语法、H5 构建、**23 路由冒烟测试**（runner 有 Chrome 时）。
> - `.github/workflows/android-release.yml`：打 tag（`v*`）或手动触发时，**自动构建签名 APK 并上传 artifact / 发布 GitHub Release**。

## 1. 仓库准备

仓库根目录应直接是本工程（包含 `uniapp/`、`release/`、`analysis/` 等）：

    cd jianyun
    git init
    git add .
    git commit -m "init: jianyun replica"
    git remote add origin git@github.com:<you>/<repo>.git
    git push -u origin main

`.gitignore` 已排除：`node_modules`、`dist`、`release/keystore`、`*.jks`、`release/*.apk` 等。

## 2. 配置签名 Secrets（tag 发布必须）

在 GitHub 仓库 → Settings → Secrets and variables → Actions 添加：

| Secret | 说明 |
|---|---|
| `RELEASE_KEYSTORE_BASE64` | 你的 release keystore 的 base64 编码 |
| `RELEASE_STORE_PASSWORD` | keystore 密码 |
| `RELEASE_KEY_PASSWORD` | key 密码（默认同 store，可留空） |
| `RELEASE_KEY_ALIAS` | key alias（如 `replica`） |

生成 base64（macOS / Linux 均可）：

    base64 < release/keystore/replica-release.jks | tr -d "\n" > keystore.b64
    # 把 keystore.b64 的内容粘到 RELEASE_KEYSTORE_BASE64

> 不要提交 keystore/password 到仓库；建议离线备份 keystore 与密码。

## 3. 发布新版本

    # 1) 改版本（或手动触发时在 Actions 页面填 version_name/version_code）
    # 2) 打 tag 并推送
    git tag v1.0.1
    git push origin v1.0.1

Workflow 会自动：

1. 安装 pnpm/Node 20，`pnpm install --frozen-lockfile`，`pnpm build:h5`；
2. 用 `android-actions/setup-android` 安装 `platforms;android-34` + `build-tools;34.0.0`；
3. 注入 secrets 里的 keystore，执行 `release/build-apk.sh`（版本号来自 tag）；
4. 校验签名并输出 SHA-256；
5. 上传 `release-apk` artifact（保留 30 天）；
6. tag 构建自动创建 GitHub Release 并附 APK + sha256。

## 4. 手动触发（不发版，产出测试包）

Actions → Android Release APK → Run workflow：

- `version_name` 留空 → 1.0.0；`version_code` 留空 → GITHUB_RUN_NUMBER；
- **未配置 secrets 时**：构建脚本会生成临时演示 keystore 签名（仅用于测试安装，不能上架）；
- tag 推送时强制要求 keystore secret，缺失会失败（避免误发 demo 签名包）。

## 5. 本地等价命令（提交前自测）

    cd uniapp && pnpm install --frozen-lockfile && pnpm build:h5
    node tools/check-sfc.mjs src/pages src/components
    for f in uniCloud-aliyun/cloudfunctions/*/index.js; do node --check "$f"; done
    cd ../release && ./build-apk.sh

本次已在本地验证：

- `VERSION_CODE=2 VERSION_NAME=1.0.1` + base64 keystore 注入 → APK badging 显示 `versionCode=2 versionName=1.0.1`；
- 签名校验通过（证书 SHA-256 `233645D5…A6513`）；
- `bash -n release/build-apk.sh` 通过；两个 workflow YAML 可被解析。

## 6. 注意

- 该 workflow 产出的是 **WebView 外壳版 APK**（与 `release/README.md` §5 一致）；
- 完整原生能力包（提醒/日历、小组件、支付宝）需要 HBuilderX 自定义基座或 uni-app 离线 SDK；
- 可后续把「下载离线 SDK + 集成 nativeplugins + gradle assembleRelease」写成第二个 workflow（需要 DCloud SDK 下载与私有 AAR，不适合公开仓库默认开启）；
- 首次推 tag 前建议先跑一次 `ci.yml`，确认冒烟通过。
