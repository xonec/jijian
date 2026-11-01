# 官方真机界面截图（用于像素级回归）

> 在 **Android 14 模拟器（arm64, pixel_6, 1080×2400 @420dpi）** 上安装官方 APK 3.5.0 后，通过 adb + UIAutomator 自动导航抓取的**官方应用真实界面**，用于和 `uniapp/` 复刻版做像素级对照。

## 1. 采集环境与方法

| 项 | 值 |
|---|---|
| 设备 | Android Emulator 37.2.13，`system-images;android-34;default;arm64-v8a`，pixel_6 配置 |
| 分辨率/密度 | 1080×2400，420 dpi（≈411×914dp） |
| 安装 | REA MCP `install_adb_package`（记录 APK sha256 `e782ca98…`，44,927,974 B） |
| 启动 | REA MCP `start_adb_app` → `cn.jianyun.workplan/.main.MainActivity` |
| 截图 | `adb exec-out screencap -p`（无损 PNG） |
| 导航 | `uiautomator dump` 取控件 bounds → `adb shell input tap`；每页 `am force-stop` 保证确定性初始状态 |
| 暗色 | `adb shell cmd uimode night yes` |
| 数据 | 全新安装、无排班数据（空态）；截图中的日期为模拟器系统时间 |

## 2. 截图清单

| 文件 | 界面 | 说明 |
|---|---|---|
| `01-home.png` | 首启隐私弹窗 + 首页（空态） | 首次启动先弹隐私同意弹窗（见 §3） |
| `02-work.png` | 班次 Tab | 班次/轮班 SegmentPicker + 空态「暂无班次」 |
| `03-alarm.png` | 提醒 Tab | 班次提醒、日历权限引导、空态「暂无提醒」 |
| `04-stat.png` | 统计 Tab | 排班统计、区间、空态 |
| `05-mine.png` | 我的 Tab | 标题「排班设置」；登录卡、VIP 横幅、4 组设置项 |
| `05b-login.png` | 登录弹窗 | 登录/注册 Segment + 账号/密码 + 取消/登录（**弹窗不是页面**） |
| `06-local-backup.png` | 本地备份 | 说明文案 + 「选择备份目录」 |
| `07-share.png` | 分享与导入排班 | 当前项目 + 「分享排班图」 |
| `08-widget.png` | 桌面小组件配置 | 显示项/字号/透明度/颜色等 |
| `09-wechat.png` | 导入小程序排班 | 说明 + 小程序用户 ID + 「导入排班数据」 |
| `10-faq.png` | 常见问题解答 | 可展开问答列表 |
| `11-feedback.png` | 用户在线反馈 | 实际打开 `support.qq.com` 的 WebView（腾讯兔小巢） |
| `12-user-policy.png` | 用户使用协议 | 富文本，含杭州简蕴科技有限公司信息 |
| `13-privacy.png` | 应用隐私政策 | 富文本 + 版本日期 |
| `14-home-settings.png` | 首页「显示配置」底部面板 | 日历字号、一周开始日、显示农历/节日/补班等 |
| `15-work-edit.png` | 添加/编辑班次 | 基本信息/时间/休息时长/颜色/样式预览 |
| `16-plan-manage.png` | 轮班 Tab | 空态「暂无轮班」+「添加轮班」 |
| `17-alarm-edit.png` | 班次提醒 | 日历权限、提醒开关说明 |
| `18-project.png` | 项目管理 | 默认项目 + 添加项目 |
| `19-update-notes.png` | 本次更新说明 | 3.5.0 更新内容弹窗 |
| `20-vip.png` | 会员页 | 3 元/月、12 元/年、18 元永久；权益说明 |
| `21-start-schedule.png` | 首页「开启排班」 | 提示「请先设置好班次再来排班」 |
| `22-home-dark.png` | 首页（暗色） | `cmd uimode night yes` 后 |
| `23-mine-dark.png` | 我的（暗色） | 同上 |

对比板：

- `compare-real-vs-uniapp-main.png` — 5 个主 Tab：官方（左）vs uni-app 复刻（右）
- `compare-real-vs-uniapp-sub.png` — 子页面：本地备份 / 登录 / 会员 / 小组件 / FAQ / 分享
- `board-real-screens.png`、`board-real-edit.png` — 缩略图总览

## 3. 真实界面带来的关键结论（与文档/复刻核对）

1. **首启隐私弹窗确实存在**：文案为「你好 / 很高兴看到你下载极简排班，为了保护您的隐私和个人信息…」，底部「不同意 / 同意」，点同意后才进入首页。之前 `inventory.md` 中「App 无首启隐私勾选弹窗」的说法需要修正（代码里是 `DialogViewKt.WelcomeDialog`）。
2. **登录是弹窗**（`LoginDialogKt`），不是独立页面；与代码 xref 一致。
3. **我的 Tab 标题是「排班设置」**（不是「我的」），底部 Tab 文案才是「我的」。
4. **反馈入口是外链 WebView**（`support.qq.com` 兔小巢），不是原生表单。
5. **VIP 价格**：3 元/月、12 元/年、18 元永久（`VipViewKt` 数据，真实 UI 与代码一致）。
6. **首页右上角两个图标**：左为公告/更新类，右为「显示配置」面板（对应 `ScheduleConfigViewKt`）。
7. **底部导航**是 5 个文字+图标（Remix Icon 字体图标），与 `ui-spec` 一致；系统导航栏为三键（模拟器默认），真机通常为手势条。

## 4. 与 uni-app 复刻的已知差异

- 复刻版截图在 `uniapp/shots/`（H5 390×844 视口、含演示数据）；真机截图为空态、1080×2400。对比时看**结构/间距/字号/颜色**，不看数据内容。
- H5 没有系统状态栏与三键导航，复刻版页面整体比真机少约 48dp 的底部安全区（详见 `uniapp/README.md` 的已知差异）。
- 暗色真机截图（22/23）可用于核对 `uniapp/styles/tokens.scss` 的暗色变量。

## 5. 复现命令

     # 模拟器（本机已建好 AVD rea-34）
     $ANDROID_SDK/emulator/emulator -avd rea-34 -no-window -no-audio -no-boot-anim -gpu swiftshader_indirect &
     adb -s emulator-5554 shell am start -n cn.jianyun.workplan/.main.MainActivity
     adb -s emulator-5554 exec-out screencap -p > shot.png
     # 装包（自动化方式，记录 APK 摘要）用 REA MCP：install_adb_package

说明：最初连接到一台真机（ZTE A2022 / Android 13）并成功安装，但抓取过程中设备断开，之后改用模拟器完成全量截图。
