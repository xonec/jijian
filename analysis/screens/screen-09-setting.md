# screen-09 · Tab5「我的」（排班设置页 ScheduleSettingView）

> 源码：`module/schedule/views/setting/ScheduleSettingViewKt.java`（原 ScheduleSettingView.kt:53），ViewModel：`AppSettingViewModel` + `ScheduleMasterViewModel` + `LocalBackupViewModel`
> 容器：`SimpleSubAppPageView(nav, null, headerTitle="排班设置", body)`（:215）

## 1. 页面结构（从上到下：5 个卡片分组 + 版本号）
body = Column(verticalScroll, 底部 80dp)

### ① 用户卡片（GroupView，可点击，:238-405）
- 未登录：
  - `CenterRow(padding vertical 10dp)` → 应用 Logo `AppLogoView(40dp)`（:283）
  - 登录提示文字（ComposableSingletons lambda）「点击登录」类文案（推断，见 LoginDialog 文案）
- 已登录：
  - `VerticalRow(padding vertical 10dp)`（:287-…）：
    - 左：`AppLogoView(40dp)`（App 图标）
    - 右 Column：昵称 `loginUser.showName()`（**14sp**，lineHeight 13sp，:342）；下一行 `TagView` 会员等级：VIP → `vipName` + **VipColor #C5A874**，普通 → "普通用户" + 灰（:375）
- 点击：已登录 → push `UserDetail`（我的信息）；未登录 → 打开 `LoginDialog`（formType "login"）（:238-257）

### ② 会员横幅（仅非真实会员，:407-428）
- GroupView 可点击 → `toVipPage` 进会员页；内容为会员引导（VIP 卡片，含 VipColor 视觉；文本由 ComposableSingletons/Vip 组件决定）

### ③ 数据与备份组（:431-537）
`SettingGroupView` 内 4 个 `LinkItemView`（label + 右箭头）：
| 顺序 | 文案 | 行为 |
|---|---|---|
| 1 | **我的排班项目** | push `ScheduleProjectManage`（:452） |
| 2 | **本地备份设置** | push `LocalBackup`（:471） |
| 3 | **分享与导入排班** | push `ScheduleShareData`（:490） |
| 4 | **本地备份与恢复** | push `LocalBackup`（条件：`localBackupViewModel.localPath != ""` 已设置目录时才显示，:508-510） |

### ④ 通用设置组（:538-660）
| 顺序 | 文案 | 控件/行为 |
|---|---|---|
| 1 | **APP风格** | `SelectItemView`，选项：**亮白主题(light) / 暗黑主题(dark) / 追随系统(auto)**（`SelectUtil.THEMES`）（:585） |
| 2 | **桌面小组件配置** | push `Widget`（:587） |
| 3 | **导入小程序排班** | push `Wechat`（:606） |
| 4 | **本次更新说明** | 弹 `UpdateIntroDialog`（正文 = 3.5.0 更新说明，:652, :817） |

### ⑤ 关于与求助组（:662-770）
| 顺序 | 文案 | 行为 |
|---|---|---|
| 1 | **常见问题解答** | push `Question`（:684） |
| 2 | **用户在线反馈** | 打开反馈页/URL（:703；FeedbackModel 相关，推断为内嵌 H5 或邮件） |
| 3 | **用户使用协议** | push `UserPolicy`（:725） |
| 4 | **应用隐私政策** | push `PrivatePolicy`（:744） |

### ⑥ 版本号（:771-773）
- 文本 **"v3.5.0"**，**12sp**，Color.Gray，居中（TextAlign.Center），padding bottom 12dp

## 2. 全局浮层
- `LoginDialog`（formType == "login"）→ 登录/注册弹窗（screen-13）
- `UpdateIntroDialog`（"本次更新说明"按钮）→ 更新说明弹窗（正文见 inventory 第 4 节）

## 3. 关键文案（真实）
- 会员标签：vipName 或 **"普通用户"**（:375）
- 版本号 **"v3.5.0"**（:773）
- APP风格选项：**亮白主题 / 暗黑主题 / 追随系统**
