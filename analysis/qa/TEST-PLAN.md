# 测试计划与测试报告（极简排班复刻）

> 范围：uni-app H5/复刻工程 + 可安装 APK（WebView 外壳版）。测试时间：2026-11-01；环境：macOS arm64 / Node 24 / Android 14 模拟器（arm64，1080×2400）。

## 1. 测试分层

| 层 | 内容 | 工具/命令 | 状态 |
|---|---|---|---|
| L1 静态检查 | SFC 语法、云函数语法、manifest/JSON 合法性、H5 构建 | `tools/check-sfc.mjs`、`node --check`、`pnpm build:h5` | ✅ 全通过 |
| L2 H5 冒烟 | 23 个路由逐页打开：JS 异常 / console.error / 页面渲染 | `tools/smoke-h5.mjs`（CDP） | ✅ 23/23 |
| L3 APK 安装运行 | 签名 APK 安装、启动、交互、冷启动持久化 | adb + 模拟器 | ✅ 通过 |
| L4 原生能力 | 提醒/日历、桌面小组件、支付、uniCloud | 需 HBuilderX 自定义基座 + 真机 | ⏳ 待真机 |
| L5 兼容性 | Android 13/14、暗色、不同分辨率 | 模拟器/真机 | ⏳ 部分 |
| L6 发布检查 | 签名、包名、权限、隐私政策、版本号 | 人工清单 | ⏳ 待发布主体确认 |

## 2. 已执行结果

### L1 静态检查

| 检查 | 结果 |
|---|---|
| SFC 检查（35 个 .vue） | 0 失败 |
| 云函数语法（7 个） | 全部通过 |
| manifest.json / pages.json | 合法 |
| `pnpm build:h5` | 成功（dist ≈ 812KB → APK 内压缩后 347KB） |

### L2 H5 冒烟（23/23 通过）

- 页面列表：home / work / alarm / stat / setting + 18 个子页（work-edit、alarm-edit、share、vip、widget、project、faq、user-detail、login、backup、cloud、webdav、webdav-edit、webdav-files、permission、agreement、feedback、wechat）
- 判定：无 `Runtime.exceptionThrown`、无 `console.error`、`body.innerText.length > 20`
- 报告：`analysis/qa/smoke-report.json`

### L3 APK 测试（模拟器）

| 用例 | 步骤 | 结果 |
|---|---|---|
| TC-APK-01 安装 | `adb install -r replica-1.0.0-release.apk` | ✅ Success（incremental install） |
| TC-APK-02 启动 | 启动 MainActivity | ✅ 首屏正常（WebView 加载本地资源） |
| TC-APK-03 隐私弹窗 | 点「同意并继续」 | ✅ 进入首页 |
| TC-APK-04 Tab 切换 | 首页 → 我的 → 统计 | ✅ 页面正确 |
| TC-APK-05 冷启动持久化 | force-stop 后重启 | ✅ 隐私弹窗不再出现（localStorage 生效） |
| TC-APK-06 崩溃检查 | logcat 过滤 FATAL/AndroidRuntime | ✅ 无崩溃 |

证据：`release/qa/01~04*.png`、`release/qa-board.png`。

## 3. 待真机/自定义基座验证（L4）

| 能力 | 用例 | 前置 |
|---|---|---|
| 提醒/系统日历 | 权限诊断 → 授权 → 写入测试提醒（1 分钟后） → 系统日历出现事件 → 删除提醒后事件消失 | HBuilderX 自定义基座（标准基座即可，`plus.android` 不依赖插件） |
| 桌面小组件 | 构建 AAR → 自定义基座 → 桌面添加月历/班次 → 修改配置后刷新 → 点击跳转 App | Android Studio 构建 + 自定义基座 |
| 会员/支付宝 | mock 支付 → 会员有效期 → 我的页徽章；真实支付需配置密钥与商户资质 | 支付宝开放平台配置 |
| uniCloud | 绑定服务空间 → 上传 7 个云函数 + 13 个 schema → `useCloud=true` → 登录/备份/WebDAV | HBuilderX + 云空间 |
| 深色模式 | 系统切换暗色 → 首页/设置/弹窗颜色 | 真机 |
| 多分辨率 | 1080×2400 / 720×1600 / 1440×3200 | 模拟器改分辨率 |

## 4. 已知问题 / 风险

| 项 | 说明 |
|---|---|
| WebView APK 不含 plus 原生能力 | 提醒/日历、小组件、支付宝、原生 uniCloud 需 uni-app App 打包（自定义基座）；WebView 版会自动降级（toast/H5 行为） |
| H5 字体渲染 | macOS/浏览器字体与 Android Noto Sans 有差异（详见 `analysis/pixel/`） |
| 本地 mock 数据 | APK 默认本地模式，展示 2024-09 演示数据 |
| 无自动 UI 测试框架 | 当前用 CDP 冒烟 + adb 截图；后续可接 Appium/uni-automator |

## 5. 复现命令

    # L1
    cd uniapp && node tools/check-sfc.mjs src/pages src/components && pnpm build:h5
    # L2（需先起静态服务器 5280 + Chrome CDP 9222）
    node tools/smoke-h5.mjs
    # L3
    cd release && ./build-apk.sh
    adb install -r replica-1.0.0-release.apk
    adb shell am start -n cn.jianyun.workplan.replica/.MainActivity
