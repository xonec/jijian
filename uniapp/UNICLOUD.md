# uniCloud 接入指南（uni-app + uniCloud）

> 本工程的云后端已经写好：`uniCloud-aliyun/cloudfunctions/{workplan,seedDemo}` + `uniCloud-aliyun/database/*.schema.json`。
> 未绑定云空间时，客户端自动使用本地 mock（uni storage），所有页面照常运行。绑定并上传后，把 `src/config.js` 的 `useCloud` 改为 `true` 即可切换到云端，页面代码零改动。

## 1. 前置

- 安装 [HBuilderX](https://www.dcloud.io/hbuilderx.html)（uniCloud 的服务空间管理、云函数上传都在 HBuilderX 中完成）
- 注册 DCloud 账号（HBuilderX 右上角登录）
- 项目可用 HBuilderX 直接「打开目录」导入；命令行 `pnpm dev:h5` 依然可用

## 2. 创建并关联服务空间

1. HBuilderX 左侧项目树 → 右键 `uniCloud-aliyun` 目录 → **关联云服务空间**
2. 没有空间时选择 **创建服务空间**：
   - 服务商：`阿里云`（本工程目录名按阿里云组织；如用腾讯云，把目录改名为 `uniCloud-tcb`，schema/云函数代码通用）
   - 免费版即可满足演示；建议开启「前端网页托管」便于部署 H5
3. 创建完成后再次右键 → 关联，等待云端环境就绪

## 3. 初始化数据库集合

7 个集合（schema 已在 `uniCloud-aliyun/database/`）：

| 集合 | 用途 | 关键索引 |
|---|---|---|
| jy_shift | 班次定义 | deviceId+sort |
| jy_schedule | 按天排班 | deviceId+date（唯一） |
| jy_alarm | 班次提醒 | deviceId |
| jy_project | 排班项目/班组 | — |
| jy_config | 日历显示配置 / 主题 | deviceId（唯一） |
| jy_share | 分享秘钥快照 | key（唯一） |
| jy_faq | 常见问题 | — |

两种初始化方式：

- **方式 A（推荐）**：右键 `uniCloud-aliyun/database` → **上传所有 DB Schema**；然后调用一次 `seedDemo`（见下一步），首次 `bootstrap` 也会自动 seed。
- **方式 B**：在 uniCloud 控制台 → 云数据库手动新建上述集合并按需导入数据。

> 所有 schema 的 permission 均为 read/create/update/delete = false：客户端不能直连数据库，只能通过 `workplan` 云函数访问（数据按 deviceId 隔离）。

## 4. 上传云函数

1. 右键 `uniCloud-aliyun/cloudfunctions/workplan` → **上传部署**
2. 右键 `uniCloud-aliyun/cloudfunctions/seedDemo` → **上传部署**
3. 可选：在 HBuilderX 云函数列表里对 `seedDemo` 执行「运行测试」，传入

    {"deviceId": "dev-demo"}

   返回 `{ code: 0, data: { shifts: 3, schedule: 30, ... } }` 即成功。

`workplan` 的 action 列表（客户端 `src/services/api.js` 已全部对接）：

    bootstrap            首屏：shifts + schedule + alarms + projects + config + faq（空数据自动 seed）
    schedule.range       区间排班   { start, end }
    schedule.set         写入某天   { date, workId, secondWorkId, remark }
    shift.list|save|delete            班次
    alarm.list|save|toggle|delete     提醒
    project.list|save|setCurrent|delete  项目/班组
    config.get|save                   显示配置 / 主题
    stat.range           统计聚合   { start, end } → donut / totalHours / avgHours / restHours / details
    share.generate|import 分享秘钥   { projectId } / { key }
    faq.list             常见问题

## 5. 客户端切换

修改 `src/config.js`：

    export default {
      useCloud: true,            // 改为 true
      cloudFunction: "workplan",
      seedFunction: "seedDemo"
    }

重新运行 `pnpm dev:h5`。控制台 Network 里应能看到 `uniCloud.callFunction` 请求；`localStorage` 里的 `jy_db_v1` 不再被使用。

- 若云空间未就绪：api.js 会 reject，页面 `catch` 后回落到本地 mock（不影响演示）。
- 想恢复纯本地模式：把 `useCloud` 改回 `false`，并清除站点存储。

## 6. 数据隔离与用户体系

- 演示版用 `deviceId`（首次启动生成并存在本地）隔离数据，等价于「单机多用户」的最小实现。
- 生产化建议接入 **uni-id**（uniCloud 官方用户体系）：
  1. 安装 `uni-id-common` 公共模块 + `uni-id-pages` 页面（可选），或在 HBuilderX 插件市场导入 uni-id-pages
  2. 云函数内用 `uniCloud.getCurrentUserInfo()` 取 `uid`，把各集合的 `deviceId` 换成 `user_id`
  3. schema 的 permission 改为 `{ "read": "doc.user_id == auth.uid", ... }`，并开放客户端直连（clientDB）
- 会员（VIP）与支付：示例为静态页面；生产化可接 `uni-pay`，把 `jy_config.themeMode`、会员到期时间等挂到用户表。

## 7. 部署 H5（可选）

    pnpm build:h5

产物 `dist/build/h5` 可直接部署到：uniCloud 前端网页托管（右键 `dist/build/h5` → 上传）、或任意静态服务器。
H5 使用 hash 路由，刷新子页面不会 404。

## 8. 小程序 / App

- 微信小程序：`pnpm dev:mp-weixin` → 用微信开发者工具打开 `dist/dev/mp-weixin`；需在 `manifest.json` 填入自己的 appid。
  - 图标字体已 base64 内联，不受小程序本地字体限制。
  - H5 专用的 `?theme=` 参数不生效，主题请用「我的 → APP风格」切换。
- App：用 HBuilderX 打开工程 → 运行到手机或模拟器；`uniCloud` 需在 HBuilderX 里关联空间后打自定义基座才能用云函数。

## 8.5 新增：uni-id 登录 + 备份/WebDAV/反馈云函数

### 8.5.1 目录与模块

    uniCloud-aliyun/
    ├─ cloudfunctions/
    │  ├─ common/
    │  │  ├─ uni-id-common/         官方模块（v1.0.16，token 签发/校验）
    │  │  └─ uni-config-center/     官方模块 + uni-id/config.json
    │  ├─ workplan/                 业务主函数（含 token 归属逻辑）
    │  ├─ user/                     uni-id 注册/登录/信息/改密
    │  ├─ backup/                   云备份快照 list/create/restore/delete
    │  ├─ webdav/                   WebDAV 账号与文件（uniCloud.httpclient）
    │  └─ feedback/                 用户反馈
    └─ database/                    jy_* + uni-id-users + jy_backup + jy_webdav + jy_feedback

上传顺序：先右键 cloudfunctions/common 下两个公共模块 → 上传公共模块；再上传 workplan / user / backup / webdav / feedback / vip 六个云函数；最后上传 database 下全部 schema。

> 注意：workplan / user / backup / webdav / feedback / vip 的 package.json 都依赖公共模块（uni-id-common；vip 还依赖 uni-config-center），务必先上传公共模块，否则云函数会报 module not found。

> 会员支付：`vip` 云函数 + `jy_vip` / `jy_vip_order` schema + `common/uni-config-center/vip/config.json`，详见 [PAYMENT.md](PAYMENT.md)。默认 `mock: true` 可在本地模拟开通，上线前改 `false` 并配置支付宝密钥。

> owner 字段说明：云函数使用传统 MongoDB API，不受 schema 校验限制；jy_* 集合中既有历史 deviceId 字段，也有新增 owner/user_id 字段（登录后）。若后续切换 clientDB/JQL，需要给 jy_* schema 补 owner 字段与 (owner, date) 索引，并把 permission 改为 read: doc.owner == auth.uid。

### 8.5.2 uni-id 配置

- 配置位置：uni-config-center/uni-id/config.json（已生成随机 tokenSecret；生产环境请替换）。
- 用户集合：uni-id-users（字段与官方 uni-id 兼容；密码以 pbkdf2-sha256 加盐存储）。
- token：由 uni-id-common 签发 JWT，有效期 7200s；客户端存 uni_id_token / uni_id_user，请求自动带 uniIdToken。
- 数据归属：云函数优先用 token 解析出的 uid，未登录回落 deviceId（游客模式）；首次登录会把游客数据迁移到账号下（见 user 云函数）。
- 替换为官方 uni-id-pages / uni-id-co：见工程根 AUTH.md。

### 8.5.3 新增集合

| 集合 | 用途 |
|---|---|
| uni-id-users | 用户（密码哈希、token 列表、状态） |
| jy_backup | 云备份快照（scope=cloud） |
| jy_webdav | WebDAV 账号（密码加密存储） |
| jy_feedback | 用户反馈 |
| jy_vip | 会员（赞助）状态（每个 uid 一条） |
| jy_vip_order | 会员订单（支付宝 / mock） |

## 9. 验证清单

1. `seedDemo` 运行测试返回 code=0；
2. 首页能显示 2024-09 的 30 天排班、早/晚/休息三种班次；
3. 点开「开启排班」给某天换班次 → 云数据库 `jy_schedule` 对应 date 记录变化；
4. 统计页总工时 270 小时、早 14 / 晚 12 / 休 4；
5. 分享页生成 6 位秘钥 → `jy_share` 新增快照；换 deviceId（清缓存）后导入成功；
6. 我的 → APP风格 切暗色 → 刷新后保持；
7. 断开云空间（把 useCloud 改回 false）仍可完整演示；
8. 登录/注册（我的 → 登录或注册账号）成功后再刷新，用户卡显示昵称；退出登录后回落游客；
9. 备份：本地/云备份各做一次「一键备份」→ 列表出现；还原后首页数据一致；
10. WebDAV：添加账号（可填任意地址）→ 测试连接返回延迟 → 我的文件能列出目录；
11. 反馈页提交成功（jy_feedback 新增记录）；权限引导页、协议页正常打开。
