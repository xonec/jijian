# screen-12 · 云备份 / 本地备份 / WebDAV / 小程序导入

> 源码：`module/base/views/cloud/CommonCloudViewKt.java`、`module/schedule/views/cloud/*`、`main/setting/local/LocalBackupViewKt.java`、`module/base/views/webdav/*`、`main/setting/cloud/jgy/JgyBindViewKt.java`、`module/schedule/views/wechat/WechatViewKt.java`
> 路由：`ScheduleCloudManage`、`LocalBackup`、`WebDAV`、`WebDAVManage`、`WebDAVUserEdit`、`Wechat`

## 1. 云备份管理（ScheduleCloudManageView → CommonCloudView）
- 容器：`CommonCloudView` 使用 `PageWithFooterView`（CommonCloudView.kt:21/39）
- 顶部 header/footer 由 CommonCloudView 内部 lambda 生成（footer = 主要操作按钮）
- 备份来源 tab（`SelectUtil.BACK_TYPES = 本地备份(local) / 云备份(cloud)`）：
  - **本地备份**：
    - 未设置目录 → 空态 `EmptyIconDataView("点击设置本地备份目录", icon=cloud)`（:211）→ 系统目录选择器（AndroidFilePicker.DirectoryPicker，:237-243）
    - 已设置 → 备份列表；空态 **"暂无本地备份数据"**（:249）
    - 按钮：**"全量备份"** / **"清空备份"**（OkAndCancelButtonGroup，:116）或单 `LongOkButton("全量备份")`（:147）
  - **云备份**：
    - 未绑定账号 → 空态 **"点击绑定云备份账号"**（icon=cloud）→ push `WebDAVManage`（:264-281）
    - 已绑定 → 云端备份列表；空态 **"暂无云备份数据"**（icon=cloud3，:287）
    - 删除备份 → `DeleteDialog`（:355）
- 备份文件：`CloudFile`（`model/CloudFile.java`）
- 业务：`BaseService` 接口实现本地/WebDAV 文件读写与备份 JSON（`main/base/service/BaseService.java`，含 POI/WebDAV 逻辑）

## 2. 备份恢复（ScheduleCloudRecoveryView）
- 底部弹窗 `BottomDialogView("从备份文件导入数据")`（:65）
- 右上 info 图标（`HeaderIcon(IconFont.info2)`）→ `TipDialog("关于几种导入")` 三种模式说明（:512-514）：
  > 1. 增量导入：将备份文件中新的数据写入当前项目
  > 2. 覆盖导入：先将本地项目删除，然后导入备份文件里的项目，即以备份文件项目为主
  > 3. 全新导入：将备份文件里新的项目直接导入
- 项目列表（ListDataView，:232）：每项目卡片两个标签 **"增量导入"** / **"覆盖导入"**（可点，:366-386）+ **"全新导入"**（ThemeColor 主操作，:416）
- 底部按钮：**"全量覆盖导入"** / **"删除备份"**（OkAndCancelButtonGroup，:184）
- 删除确认：`DeleteDialog("确定要删除此备份")`（:491）

## 3. 本地备份（LocalBackupView，路由 LocalBackup）
- 容器：`PageView(nav, "本地备份")`（:85）
- 内容：
  1. 标题 **"本地备份目录"**（LeadingHint，:105）
  2. `SettingGroupView`：当前目录路径/选择状态（:110）
  3. 成功提示链接文案：**"恭喜，你已经成功设置好本地备份目录，即便app卸载，你依然可以从此目录恢复数据，记得勤备份喔"**（LinkText，ThemeColor，:137）
  4. `CenterSmallTipText("切换备份目录")`（:141）
  5. 卡片（ComposableSingletons）+ 通栏次按钮 **"选择备份目录"**（LongCancelButton，:165）→ 系统目录选择器（:229）
  6. 切换确认：`ConfirmDialog("真的要切换吗？这样会导致历史备份目录下备份文件失效喔")`（:207）
- 数据：`LocalBackupConfig` / `LocalBackupViewModel`；持久化用 SAF 目录 URI

## 4. WebDAV 云备份账号
### 4.1 账号列表（WebDAVUserManageView，路由 WebDAVManage）
- `PageView(nav, "云备份账号")`（:104）；右上 info 图标 → 说明/文档（:123-138）
- 每个账号卡片 `GroupView`（可点击 → push `WebDAVUserEdit`，:172-190）：
  - 平台图标 `AppLogoView(16dp, MyWebdavTool.getWebDAVIcon(platform))`（:280）
  - 账号名 + 标签 **"已连接"（ThemeColor）/ "已断开"（灰）**（:284）
  - **"主节点"** 标签；IconFont.cloud2 12sp 灰（:288-293）
  - 右侧链接 **"查看"**（PrimaryColor，点击 → push `WebDAV(我的文件)`，:310-329）
- 底部按钮：**"添加"**（LongCancelButton，:353）→ push `WebDAVUserEdit`（空）
- 说明弹窗：`WebDAVUserDocView`（坚果云等配置教程）

### 4.2 账号编辑（WebDAVUserEditView，路由 WebDAVUserEdit）
- `PageView(nav, title = (新建?"添加":"编辑")+"云备份")`（:85）；右上 info → 教程（:105-121）
- 内容：
  1. **"选择云备份平台"**（LeadingHint）+ FlowTag 选项：**坚果云 / GoogleDrive / OneDrive / DropBox / Koofr**（:151-177）
  2. **"账号信息"** + GroupView：`InputItemView("用户名")`、`InputItemView("密码")`（密文）、`SwitchItemView("主节点")`（:208-281）
  3. 长说明文字：开发者承诺密码仅存本地…（SmallTipText，:310）
  4. GroupView：`SwitchItemView("是否跟计划师登录账号绑定")`（:312-333）
  5. `LongOkButton("保存")`（:364）；编辑态 `LongCancelButton("复制")` + `LongDeleteButton()` + DeleteDialog（:387-457）
- 推荐平台：坚果云（有单独绑定页 `JgyBindView`：账号/密码输入 + "查看坚果云webdav账号设置教程?" + 登录/取消按钮，:110-238）

### 4.3 我的文件（WebDavDataView，路由 WebDAV）
- `PageView(nav, "我的文件")`（:78）
- 顶部当前路径 `SmallTipText(currentPath)`（:119）
- 文件/文件夹列表：GroupView 卡片（间距 15dp，:125-154）：
  - 左侧图标：目录 `IconFont.folder` / 文件 `IconFont.file`（16sp，focusColor）（:201）
  - 文件名 `FocusText(name, isDir)`（:205）
  - 路径/大小说明（OnlySmallTipText，:217）
  - 点击目录进入；长按/菜单上传/下载/删除（推断）
- 空态：`EmptyDataView(viewModel.msg)`（:233）

## 5. 微信小程序导入（WechatView，路由 Wechat）
- `PageView(nav, "导入微信小程序排班数据")`（:73）
- 说明卡片 `GroupView`（ComposableSingletons lambda1）+ 表单卡片：
  - `InputItemView("排班小程序用户ID")`（:146）
- 通栏主按钮 **"导入排班数据"**（LongOkButton，:174）+ LoadingDialog（:198）
- 说明：从"极简排班"微信小程序获取用户 ID 后导入其云端数据（网络请求）
