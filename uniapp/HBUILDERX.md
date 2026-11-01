# HBuilderX 导入项目 & 生成完整原生包

> 目标：把本仓库的 `uniapp/`（uni-app Vue3 + Vite CLI 项目）导入 HBuilderX，打出**带 plus 原生能力**的正式 APK（系统日历提醒 / 本地通知 / 桌面小组件 / 支付宝支付），而不是仓库里 `release/` 下的 WebView 壳。

---

## 0. 先弄清楚两种包的区别

| | `release/replica-*.apk`（WebView 壳） | HBuilderX 原生包（本文档） |
|---|---|---|
| 运行方式 | 本地 AssetServer + WebView 加载 H5 | uni-app App 运行时（plus） |
| 系统日历 / 通知 | ❌ 只有权限声明，无 plus 能力 | ✅ `plus.android` 调 CalendarContract / NotificationManager |
| 桌面小组件 | ❌ | ✅ 需要原生插件 `uni-widget` + 自定义基座 |
| 支付宝支付 | ❌（mock） | ✅ `uni.requestPayment` + 云函数签名 |
| 用途 | 快速预览、UI 验证、权限弹窗验证 | 真机日常使用 |

---

## 1. 环境准备

1. 安装最新稳定版 **HBuilderX**（建议 4.75+，App 开发版）：https://www.dcloud.io/hbuilderx.html
2. 注册并登录 **DCloud 账号**（HBuilderX 右上角头像）——云打包、uniCloud、获取 appid 都需要。
3. 安装 Node.js **18+**（方式 B 的 CLI 项目需要，`pnpm` 建议 9/10）。
4. 准备正式签名证书（测试可用仓库里的 demo 证书，见第 7 节）。
5. Android Studio（只有构建 `uni-widget` 的 AAR 时需要，见第 5 节）。

---

## 2. 导入项目（二选一）

### 方式 A（推荐、最稳）：HBuilderX 新建项目 + 复制源码

HBuilderX 对「CLI 项目 + 本地原生插件 + 云打包」的兼容性不如标准项目，推荐直接用标准项目：

1. HBuilderX → **文件 → 新建 → 项目** → 选择 **uni-app** → 模板 **默认模板（Vue3）** → 填项目名（如 `jijian-app`）→ 创建。
2. 把本仓库 `uniapp/src/` 下的**全部内容**复制到新项目**根目录**（覆盖 `App.vue`、`main.js`、`pages.json`、`manifest.json`、`uni.scss`）：

       src/App.vue            → 项目根/App.vue
       src/main.js            → 项目根/main.js
       src/pages.json         → 项目根/pages.json
       src/manifest.json      → 项目根/manifest.json
       src/uni.scss           → 项目根/uni.scss
       src/pages/             → 项目根/pages/
       src/components/        → 项目根/components/
       src/composables/       → 项目根/composables/
       src/services/          → 项目根/services/
       src/styles/            → 项目根/styles/
       src/data/              → 项目根/data/
       src/utils/             → 项目根/utils/
       src/config.js          → 项目根/config.js
       src/static/            → 项目根/static/

3. 复制两个特殊目录到新项目根目录：

       uniapp/uniCloud-aliyun/      → 项目根/uniCloud-aliyun/
       uniapp/nativeplugins/        → 项目根/nativeplugins/

4. 在项目根目录安装依赖（`lunar-javascript` 是 npm 包，HBuilderX 内置编译器不会自动装）：

       cd /path/to/jijian-app
       npm install lunar-javascript@1.7.7

5. HBuilderX 中右键项目 → **重新识别项目类型**；菜单出现「运行 / 发行」即成功。

### 方式 B：直接打开 CLI 项目（快速预览 H5）

1. HBuilderX → **文件 → 导入 → 从本地目录导入** → 选择本仓库的 `uniapp/` 目录（不是 `src/`）。
2. 打开 HBuilderX 内置终端，执行：

       cd uniapp
       pnpm install

3. 之后可以「运行 → 运行到浏览器」预览 H5；App 相关步骤同方式 A（在方式 B 里目录层级是 `src/...`）。

> 如果 HBuilderX 不显示「发行 → 原生App-云打包」，说明它没有按标准项目识别，请改用方式 A。

---

## 3. manifest 配置（已预置，需改 appid）

打开 `manifest.json` → **可视化界面**，逐项检查：

### 3.1 基础配置

- **应用名称**：极简排班（复刻）
- **appid**：当前是占位 `__UNI__JIANYUNREPLICA`，**必须换成真实 appid**。点「重新获取」：HBuilderX 登录 DCloud 后会自动申请一个 `__UNI__XXXXXXXX`。云打包会校验 appid，占位值会报「appid 不合法」。
- **版本名称 / 版本号**：`versionName`（如 1.0.0）、`versionCode`（整数，每次发版递增）。

### 3.2 App 图标

- 打开「App 图标配置」→ 选择 `static/app-icon.png` → 点「自动生成所有图标」→ 保存。
- 不配置图标云打包可能直接失败。

### 3.3 Android 权限（已写入 `src/manifest.json`）

```json
"permissions": [
  "<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>",
  "<uses-permission android:name=\"android.permission.READ_CALENDAR\"/>",
  "<uses-permission android:name=\"android.permission.WRITE_CALENDAR\"/>",
  "<uses-permission android:name=\"android.permission.POST_NOTIFICATIONS\"/>",
  "<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\"/>",
  "<uses-permission android:name=\"android.permission.ACCESS_COARSE_LOCATION\"/>"
]
```

`INTERNET` 由 uni-app 自动加入。Android 6+ 的日历/位置/相机/相册/文件、Android 13+ 的通知属于**运行时权限**：App 里「我的 → 通知权限设置」会调用 `plus.android.requestPermissions` 申请。

完整权限清单、模块配置、暂缓项见 [PERMISSIONS.md](./PERMISSIONS.md)。

> 注意：manifest 已加入 `Push`（uni-push 2.0）模块。若尚未在 DCloud 控制台开通 uni-push 2.0，云打包会报「应用尚未开通 uni-push 2.0 服务」；开通后再打包。支付模块暂未加入（需企业支付宝资质）。

### 3.4 支付模块（可选，真实支付宝才需要）

真实支付时在 manifest 中加入（默认为空，避免 HBuilderX 校验「appid 不能为空」而打包失败）：

```json
"modules": { "Payment": {} },
"distribute": {
  "sdkConfigs": {
    "payment": {
      "alipay": { "appid": "你的支付宝开放平台 AppId" }
    }
  }
}
```

- 只做 UI 预览 / mock 支付：不要添加 Payment 模块和 sdkConfigs.payment（本项目默认未添加），`src/config.js` 保持 `useCloud: false`。
- 真实支付：填支付宝 AppId，并把 `src/composables/use-vip.js` 走 `uni.requestPayment({ provider: "alipay" ... })` 的分支打开；云函数 `vip` 的 `mock` 必须设为 `false`（见 `PAYMENT.md`）。

### 3.5 原生插件 uni-widget（桌面小组件）

`manifest.json` 的 `app-plus.nativePlugins` 已写入 `uni-widget`。还需要：

1. 按第 5 节把插件构建成 `nativeplugins/uni-widget/android/uni-widget.aar`；
2. 在 manifest → **App 原生插件配置** → 检查 `uni-widget` 在列表中（本地插件，非云端插件）；
3. 没有 AAR 时不要勾选/保留该插件，否则打包会报插件缺失；只打普通功能可先移除。
4. **HBuilderX 5.34 校验要求**：`_dp_nativeplugin.android.plugins` 必须是非空数组（即使插件没有 JS API）。本插件已放一个占位 `module` 条目，AAR 里的 AppWidget Provider 仍会正常合并进 APK；不要删除该条目，否则会报「plugins节点下存在为空的对象」。

---

## 4. uniCloud 配置（需要登录/云备份/支付时才做）

默认 `src/config.js` 的 `useCloud: false`，用本地存储，**不配置 uniCloud 也能正常打包**。要启用云端：

1. HBuilderX 左侧右键 `uniCloud-aliyun` → **关联云服务空间**（没有则创建，阿里云免费额度够用）。
2. 先上传公共模块：右键 `uniCloud-aliyun/cloudfunctions/common/uni-id-common` 和 `uni-config-center` → **上传公共模块**。
3. 上传云函数：`workplan`、`user`、`backup`、`webdav`、`feedback`、`vip`、`seedDemo` 逐个右键 → **上传部署**。
4. 上传数据库 Schema：右键 `uniCloud-aliyun/database` → **上传所有 DB Schema**。
5. 改 `src/config.js`：`useCloud: true`。
6. 云打包时 HBuilderX 会把当前关联的云空间写进 App，正式包即可直接调用云函数。

详细字段/说明见 `UNICLOUD.md`。

---

## 5. 构建 uni-widget 的 AAR（只做小组件才需要）

目前仓库里只有插件 Android 源码，没有 AAR，需要先构建一次：

1. Android Studio 打开目录 `uniapp/nativeplugins/uni-widget/android`（或复制后的项目同名目录）。
2. 首次 Sync 会下载 AGP 8.1.4 / Kotlin 1.9.22 / Glance 依赖（需要网络）。
3. 菜单 **Build → Build Module 'uni-widget'**（或 Gradle 面板 `uni-widget → Tasks → build → assembleRelease`）。
4. 产物：`android/build/outputs/aar/uni-widget-release.aar`。
5. 复制并改名：

       cp android/build/outputs/aar/uni-widget-release.aar android/uni-widget.aar

6. 回到 HBuilderX，manifest 的本地插件配置里确认 `uni-widget` 的 AAR 路径正确。

插件说明见 `WIDGET.md` 与 `nativeplugins/uni-widget/README.md`。

---

## 6. 制作自定义基座（必须先做）

本地原生插件（uni-widget）**不会包含在标准基座**里，必须做自定义基座：

1. HBuilderX 连接安卓手机（USB 调试）或启动模拟器。
2. 菜单 **运行 → 运行到手机或模拟器 → 制作自定义调试基座**。
3. 选择 Android → 证书可使用「自动生成」或自有证书 → 打包。
4. 完成后运行 **运行 → 运行到 Android App 基座**，选择刚生成的基座。
5. 验证：桌面小组件配置页保存刷新 → 长按桌面 → 小组件 → 极简排班 → 添加。

---

## 7. 云打包正式 APK

1. 菜单 **发行 → 原生App-云打包**。
2. Android 设置：
   - **包名**：`cn.jianyun.workplan.replica`（或你自己的包名，发布后不可改）。
   - **证书**：选「使用自有证书」。（公共测试证书已被 DCloud 禁用，会报「存在安全隐患」；云端证书需申请。）测试可用仓库 demo 证书：

         keystore: release/keystore/replica-release.jks
         别名: replica
         密码: 见 release/keystore/password.txt（demo 密码，正式包请自己重新生成）

     正式发布建议生成新证书：

         keytool -genkey -v -keystore ~/jijian-prod.jks -alias jijian \
           -keyalg RSA -keysize 2048 -validity 36500

   - **打包类型**：传统打包（完整运行时）。
   - **模块**：勾选 Payment（真实支付时）；广告不勾。
   - **本地插件**：勾选 `uni-widget`（已构建 AAR 时）。
3. 点「打包」→ 等待云端返回 → 下载 APK。
4. 安装验证：
   - 首页农历/班次正常；
   - 「我的 → 通知权限设置」点击「申请全部权限」，日历/通知/位置弹窗；
   - 提醒页新建提醒 → 写入系统日历（需要系统日历 App 存在）；
   - 小组件可添加并显示班次；
   - 会员页支付（真实支付需配置完整）。

### 如果云打包提示「本地插件不支持云打包」

这是 DCloud 对本地原生插件的限制。有两个办法：

1. **离线打包（推荐、可控）**：
   - 在 HBuilderX 菜单 **发行 → 原生App-本地打包 → 生成本地打包App资源**；
   - 下载对应版本的 DCloud **Android 离线 SDK**，用其中的 `HBuilder-Integrate-AS` 工程；
   - 把生成资源放到 `app/src/main/assets/apps/<appid>/www`；
   - 把 `uni-widget.aar` 放进 `app/libs` 并加入依赖，`AndroidManifest` 合并小组件 Provider；
   - Android Studio 打 APK，用第 7 节的证书签名。
2. **放弃本地插件**：如果不需要桌面小组件，从 manifest 移除 `nativePlugins`，只云打包其余功能。

---

## 8. 真实支付宝支付（可选）

1. 支付宝开放平台创建应用，签约「App 支付」，得到 AppId、应用私钥、支付宝公钥。
2. manifest → App 模块配置 → Payment → 填支付宝 AppId；`sdkConfigs.payment.alipay.appid` 同步填写。
3. `uniCloud-aliyun/cloudfunctions/common/uni-config-center/vip/config.json`：

       { "mock": false, "alipayAppId": "...", "privateKey": "...", "alipayPublicKey": "...", "notifyUrl": "..." }

   （密钥建议放到服务空间环境变量/配置中心，不要提交仓库。）
4. 上传 `vip` 云函数，确认 `mockPay` 在 mock=false 时不可用。
5. 完整字段说明见 `PAYMENT.md`。

---

## 9. 验证清单

- [ ] HBuilderX 识别项目，运行到浏览器正常；
- [ ] manifest appid 是真实 DCloud appid（非 `__UNI__JIANYUNREPLICA`）；
- [ ] App 图标已生成；
- [ ] 自定义基座安装成功（含 uni-widget）；
- [ ] 权限页可申请日历/通知/位置；
- [ ] 提醒写入系统日历成功；
- [ ] 小组件可添加并显示；
- [ ] 云打包/离线打包出的 APK 安装、启动正常；
- [ ] 支付（如启用）走通真实支付宝。

---

## 10. 常见问题

| 现象 | 处理 |
|---|---|
| HBuilderX 没有「发行」菜单 | 用方式 A（标准项目），并确认 `pages.json`/`manifest.json` 在项目根目录 |
| 云打包报 appid 不合法 | manifest 里点「重新获取 appid」，确保已登录 DCloud |
| 云打包失败：找不到本地插件 | 先构建 AAR 并放到 `nativeplugins/uni-widget/android/uni-widget.aar`；或从 manifest 移除插件 |
| 自定义基座白屏 | 用 HBuilderX「运行到 Android App 基座」而不是浏览器；检查 `dist` 是否被误提交/污染 |
| 小组件显示「正在加载」 | 打开 App 的小组件配置页点「保存并刷新小组件」；确认基座是自定义基座 |
| 日历提醒不写入 | 系统日历权限未授予；部分机型需先有系统日历账户 |
| 通知不弹 | Android 13+ 通知权限；厂商后台限制，官方建议以系统日历提醒为主 |
| targetSdk 34 打包失败 | 升级 HBuilderX 到最新版；或暂时去掉 `targetSdkVersion` 用默认值 |
| 支付报「支付未配置」 | manifest 支付宝 AppId + 云函数 `vip` mock=false、密钥配置 |

---

## 附：打包产物与仓库内 APK 的关系

- `release/replica-1.0.x-release.apk`：WebView 壳，用于快速验证 UI/权限弹窗，不是完整原生包；
- HBuilderX 打出的 APK：完整 uni-app 运行时，包名相同会覆盖安装（签名必须一致）。
