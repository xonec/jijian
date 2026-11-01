# uni-id 登录接入说明（极简排班 uni-app 复刻）

> 适用工程：`uniapp/`。客户端默认本地演示模式（`src/config.js` 的 `useCloud=false`），此时登录/注册走本地实现
> （token 形如 `local-xxxx`，仅用于界面与流程演示）；绑定 uniCloud 并上传云函数后，由官方 **uni-id-common v1.0.16**
> 签发/校验 JWT，数据归属切换为登录账号（owner = uid）。

## 1. 目录与模块来源

官方公共模块（已放入工程，无需 npm 安装；来源：DCloud 插件市场 uni-id-common / uni-config-center）：

```
uniCloud-aliyun/cloudfunctions/
├── common/
│   ├── uni-id-common/            # 官方 uni-id-common v1.0.16（JWT 签发/校验/刷新）
│   └── uni-config-center/        # 官方 uni-config-center v0.0.3（读取 uni-id/config.json）
│       └── uni-id/config.json    # uni-id 配置（tokenSecret 等）
├── user/                         # 本工程：注册/登录/退出/改密/用户信息
├── workplan/                     # 本工程：业务数据（owner 归属改造）
└── seedDemo/                     # 本工程：2024-09 示例数据
```

客户端：

| 文件 | 说明 |
|---|---|
| `src/composables/use-auth.js` | 全局登录态 `auth = { token, userInfo, isLogin }` + login/register/logout/fetchInfo/updateInfo/changePassword |
| `src/pages/sub/login/index.vue` | 登录/注册页（已注册路由 `pages/sub/login/index`） |
| `src/services/api.js` | `api.auth.*` 双后端（云端/本地），页面直接调用；`authToken()/userId()/ownerId()` 已导出 |
| `src/services/local-db.js` | 本地演示后端（auth* 实现，token = `local-xxx`） |

## 2. 配置说明

配置文件：`uniCloud-aliyun/cloudfunctions/common/uni-config-center/uni-id/config.json`
（**服务端**读取，不是客户端；修改后需重新上传/运行云函数）

| 字段 | 默认值 | 说明 |
|---|---|---|
| `tokenSecret` | 工程内演示值 | JWT HS256 密钥，**生产环境必须替换为 32+ 位随机串**，且只存在服务端 |
| `tokenExpiresIn` | 7200（秒） | Web/H5 端 token 有效期 |
| `tokenExpiresThreshold` | 1200（秒） | uni-id 自动续签阈值；本工程 `checkToken` 统一用 `autoRefresh:false`，不做隐式续签 |
| `maxTokenLength` | 10 | 用户 token 数组最多保留条数 |
| `app` 段 | `tokenExpiresIn:604800` | App 端单独覆盖 token 有效期（7 天） |
| `passwordErrorLimit/passwordErrorRetryTime` | 6 / 1200 | uni-id 预留的登录失败限制配置；本工程 `user` 云函数暂未启用（见 §8） |

> 生产建议：用 `uni-config-center` 的多环境能力（`config.json` 按 `dcloudAppid` 区分）或环境变量管理密钥；
> 不要把生产 tokenSecret 提交到公开仓库。替换 tokenSecret 会让所有已签发 token 立即失效（用户需重新登录）。

## 3. 数据库集合与字段

### 3.1 `uni-id-users`（schema：`uniCloud-aliyun/database/uni-id-users.schema.json`）

| 字段 | 类型 | 说明 |
|---|---|---|
| `username` | string | 账号（3-32 位，中英文/数字/`_ @ . -`），唯一索引 `uk_username` |
| `password` | string | 密码哈希，格式 `pbkdf2:sha256:<salt>:<hash>`（salt 16 字节 hex；hash = pbkdf2Sync(sha256, salt, 100000, 32) hex；比对用 `crypto.timingSafeEqual`） |
| `nickname` | string | 昵称（≤20 字，注册默认 = username） |
| `avatar` | string | 头像地址（可空） |
| `status` | int | 0 正常 / 1 封禁 / 2 审核中 / 4 注销（user 云函数对 1、4 拦截） |
| `role` / `permission` | array | 角色/权限（本工程为空数组，为后续会员/管理端预留） |
| `token` | array | uni-id-common 维护的 token 列表（最多 `maxTokenLength` 条） |
| `valid_token_date` | timestamp | 签发时间早于此值的 token 一律失效；**退出登录 / 修改密码时写入 `Date.now()`** |
| `register_date` / `last_login_date` | timestamp | 注册 / 最后登录时间（登录时由 uni-id-common 自动更新） |

- schema 的 `permission` 全为 `false`：客户端不能直连数据库，只能通过云函数访问。
- 官方说明：云函数里用传统 MongoDB API 操作数据库时 **DB Schema 不生效**；因此本工程云函数可直接写入
  schema 中未声明的 `owner` 字段。若改为 clientDB/JQL 访问，必须先补全 schema（见 §7/§10）。

### 3.2 `jy_*` 业务集合：owner 归属约定

业务集合：`jy_shift / jy_schedule / jy_alarm / jy_project / jy_config / jy_faq / jy_share`。

| 字段 | 说明 |
|---|---|
| `owner` | **新增字段**。数据归属：登录用户 = uid；游客 = deviceId |
| `deviceId` | 兼容字段。游客数据同时写入 `deviceId`；游客查询用 `db.command.or([{owner},{deviceId}])` 兼容历史数据 |

读写规则（`workplan` 云函数）：

1. `resolveOwner(event)`：请求带有效 `uniIdToken` → uid，否则用 `deviceId`（兜底 `dev-anonymous`）。
2. **登录**：只按 `owner = uid` 读写；新增数据只写 `owner`（不写 deviceId）。
3. **游客**：按 `or([{owner: deviceId}, {deviceId: deviceId}])` 读写；新增数据同时写 `owner` 和 `deviceId`。
4. 按 id 修改/删除前校验归属（`ownsDoc`），跨账号/跨设备修改返回「无权操作该数据」。
5. `jy_share` 的分享秘钥全局可导入（不区分归属）；导入后的数据归属当前 owner。
6. `jy_faq` 为静态内容：当前归属无数据时兜底取任意一份 seed 数据（按问题去重）。

游客数据迁移（登录/注册时，由 `user` 云函数执行）：

- 仅当账号在 5 个业务集合（`jy_shift/jy_schedule/jy_alarm/jy_project/jy_config`）中**都没有数据**时才迁移；
- 只迁移 `owner` 为空 或 `owner == deviceId` 的文档（不会误动其他账号数据）；
- 迁移动作：`update({ owner: uid, deviceId: db.command.remove() })`（移除 deviceId，避免退出登录后游客态读到账号数据）；
- 迁移失败只打日志，不影响登录结果（数据仍以游客身份留在本机）；
- 注册成功即登录，同样执行一次迁移。

> 建议后续在 `database/jy_*.schema.json` 中补 `owner` 字段与 `(owner, date)` / `(owner, sort)` 索引。
> 云函数不受 schema 校验限制，补 schema 主要是为了将来切 clientDB/JQL 时的权限规则（`"read": "doc.owner == auth.uid"`）。

## 4. 云函数 `user` —— actions

调用约定（与 `workplan` 一致）：

   入参：{ action, deviceId, uniIdToken, ...payload }
   出参：{ code: 0, data } / { code: -1, message }

| action | 入参 | 返回 `data` | 说明 |
|---|---|---|---|
| `auth.register` | `{username, password, nickname?}` | `{token, tokenExpired, userInfo}` | 校验长度/密码≥6/查重 → pbkdf2 存密码 → `createToken`；注册即登录，并迁移游客数据 |
| `auth.login` | `{username, password}` | `{token, tokenExpired, userInfo}` | 校验密码（统一提示「账号或密码错误」防枚举）→ 更新 last_login_date（createToken 内）→ 迁移游客数据 |
| `auth.logout` | 无 | `{ok: true}` | 校验 token → 写 `valid_token_date = Date.now()`，旧 token 全部失效 |
| `auth.getInfo` | 无 | `{userInfo}` | 校验 token → 返回用户信息（剔除 password/token） |
| `auth.updateInfo` | `{nickname?, avatar?}` | `{userInfo}` | 更新昵称（≤20）/头像 |
| `auth.changePassword` | `{oldPassword, newPassword}` | `{ok: true}` | 校验旧密码 → 写新哈希 + `valid_token_date`，客户端需重新登录 |

错误示例：`{code:-1, message:'账号或密码错误'}`、`'该账号已注册，请直接登录'`、`'登录状态已失效，请重新登录'`、`'原密码错误'`。

`userInfo` 结构：`{ _id, username, nickname, avatar, status, role, register_date, last_login_date }`。

## 5. token 流程

```
注册/登录
  └─ user 云函数：校验账号密码
       └─ uni-id-common.createToken({uid})
            ├─ JWT = base64(header).base64({uid,role,permission,iat,exp,uniIdVersion}).HMAC_SHA256(tokenSecret)
            ├─ 写 uni-id-users.token[] / last_login_date / last_login_ip
            └─ 返回 { token, tokenExpired }
客户端 use-auth.persist()
  ├─ uni.setStorageSync('uni_id_token', token)
  └─ uni.setStorageSync('uni_id_user', userInfo)
业务请求 api.js → uniCloud.callFunction({ action, deviceId, userId, uniIdToken, ... })
  └─ workplan 云函数：checkToken(token, { autoRefresh:false }) → r.uid → owner = uid
       └─ token 缺失/无效/过期：按游客处理（owner = deviceId）
user 云函数：无效 token → {code:-1, message:'登录状态已失效，请重新登录'}
退出/改密
  └─ 写 valid_token_date = Date.now() → 所有 iat < valid_token_date 的旧 token 失效
```

- `tokenExpired` = 签发时间 + `tokenExpiresIn * 1000`，客户端可自行判断；`use-auth.fetchInfo()` 会在 token 失效时自动清本地会话。
- **注意（uni-id-common v1.0.16 行为）**：`checkToken(token, { autoRefresh:false })` 在 token 内已缓存 `role/permission` 时
  **只做 JWT 验签、不再查库**（性能设计）。因此本工程的 `user`/`workplan` 云函数在验签后都会补查一次
  `uni-id-users`，校验 `status`、`valid_token_date`、`token` 列表，保证「退出登录 / 修改密码」立即让旧 token 失效。
  如果直接照搬官方 `checkToken` 返回结果而不补查，退出登录后旧 token 仍可继续访问（需注意）。
- **同秒边界**：`valid_token_date` 是毫秒、JWT 的 `iat` 是秒（向下取整），因此「退出/改密 → 同一秒内立即重新登录」
  的新 token 可能被旧 `valid_token_date` 误伤。`user` 云函数在签发新 token 后会把 `valid_token_date` 对齐到新 token 的
  `iat`（`normalizeValidDateAfterIssue`），实际生产登录间隔通常远大于 1 秒，无需特殊处理。
- 本工程 `checkToken` 传 `autoRefresh:false`：只校验，不隐式续签。需要「无感续签」时改为 `autoRefresh:true`（uni-id 返回新的 `{token, tokenExpired}`，客户端需回写 storage）。
- 多端登录：uni-id-common 保留最近 `maxTokenLength` 个 token；`valid_token_date` 可实现全端强制下线（退出/改密）。若需要单端互踢，可在登录后清空 `token` 数组再签发。

### 客户端接入示例

```js
import { useAuth } from '@/composables/use-auth.js'
const { auth, isLogin, login, register, logout, fetchInfo } = useAuth()

await login({ username: 'demo', password: '123456' }) // 成功后 storage 已写入
if (isLogin.value) console.log(auth.userInfo.nickname)
await fetchInfo()  // 校验并刷新用户信息（token 失效时自动清会话）
await logout()     // 云端旧 token 失效 + 清本地
```

storage key：

| key | 内容 |
|---|---|
| `uni_id_token` | 登录 token（api.js 自动随请求发送，云函数用 `event.uniIdToken` 读取） |
| `uni_id_user` | 用户信息缓存（各页面读取用于展示登录态） |

## 6. 本地演示模式（无云空间）

`src/config.js` 的 `useCloud=false`（默认）时，`api.auth.*` 走 `src/services/local-db.js`：

- 用户存本地 storage `jy_local_users`；密码用非加密的简单哈希（**仅演示，不安全**）；
- token 形如 `local-<时间戳>-` + 随机串，有效期 7 天；`auth.getInfo/updateInfo/logout/changePassword` 均本地实现；
- 本地模式下业务数据仍存 `jy_db_v1`（不区分账号，登录只影响界面/会员/反馈语义）；
- 无云空间也能完整演示 登录 → 退出 → 再登录 的流程，便于 H5 预览与截图。

切换到云端：按 `UNICLOUD.md` 关联服务空间 → 上传 common 模块与 `user/workplan/seedDemo` 云函数 → 上传 schema →
把 `useCloud` 改为 `true`。

## 7. 如何替换为官方 uni-id-pages / uni-id-co

本工程的 `user` 云函数是「官方 uni-id-common + 自研账号密码逻辑」的最小接入。要换成 DCloud 官方完整方案：

1. 在 HBuilderX 插件市场导入 `uni-id-pages`（登录/注册/忘记密码/绑定手机/微信登录等完整页面）与 `uni-id-co`（云对象），
   同时把 `uni-id-common`、`uni-config-center` 更新到与 `uni-id-co` 匹配的官方版本（`uni-id-pages` 依赖 `uni-id-co`）。
2. 用官方 `database/uni-id-users.schema.json`（包含 mobile/email/weixin_openid 等字段）替换本工程的简化 schema；
   保留现有用户数据时需做字段映射（`username/password/nickname/avatar/status` 可复用）。
3. 客户端二选一：
   - **推荐**：用 `uni-id-pages` 的页面，删除本工程 `pages/sub/login`（或保留为自定义样式页），并把 `pages.json` 里的登录入口指向官方页面；
   - 保留本工程登录页：把 `src/services/api.js` 的 `auth.*` 改为 `uni-id-co` 调用（`login/register/logout/updateUserInfo/updatePwd/getUserInfo`），
     `use-auth.js` 的 storage 约定（`uni_id_token/uni_id_user`）保持不变即可，页面零改动。
4. 服务端 token 校验逻辑不变：`workplan` 里 `uni-id-common.checkToken` → uid → owner，可原样复用；
   官方 `uni-id-co` 场景下也可以直接 `uniCloud.getCurrentUserInfo()` 取 uid。
5. 密码哈希格式：官方 `uni-id-co` 的 `password` 字段格式与本工程自研格式不同。替换时必须做一次性处理：
   让老用户走「忘记密码→重置密码」，或在登录成功时用新算法重写密码（本工程 `verifyPassword` 已支持
   `pbkdf2:sha256:<salt>:<hash>` 与 `pbkdf2:sha256$<salt>$<hash>` 两种历史写法，便于平滑迁移）。
6. 删除本工程 `cloudfunctions/user` 与 `local-db.js` 中 auth* 本地实现（或保留本地模式用于离线演示）。
7. `uni-config-center/uni-id/config.json` 按官方要求补充 `passwordSecret`、`mp-weixin.oauth.weixin.appid/appsecret` 等；
   `uni-id-pages` 的页面路径需在 `pages.json` 注册（官方文档有完整清单）。
8. 官方 uni-id 的客户端也会把 token 存 `uni_id_token`，另存 `uni_id_token_expired`；如需与 `use-auth` 互通，
   在 `use-auth` 的 persist/clearSession 里同步该 key。

## 8. 生产建议

- **密钥**：`tokenSecret` 用 32+ 位随机串，仅存服务端；按环境隔离；泄露后立即轮换（所有用户重登）。
- **登录方式**：接入短信验证码登录（uni-id-co 已支持）、微信/Apple 登录、邮箱验证码；纯密码登录建议加图形/短信验证码。
- **密码策略**：长度 ≥8 且字母+数字混合、禁止弱密码字典、定期提醒更换；不要沿用本工程的自研 pbkdf2 逻辑，
  生产请使用官方 `uni-id-co`（其密码哈希/重置流程经过审计）。
- **防爆破**：按 `username` + `clientIP` 记录失败次数（可复用 config 的 `passwordErrorLimit/passwordErrorRetryTime`，
  本工程尚未启用），超阈值临时锁定或强制验证码；uniCloud 网关侧配置频率限制/安全网络。
- **接口安全**：全链路 HTTPS；错误提示避免账号枚举（登录统一「账号或密码错误」已实现）；
  `uni-id-users` 权限保持 false；token 不写日志。
- **数据归属**：所有业务集合统一写 `owner`；切换到 clientDB 时补 schema 字段与索引，并设置
  `"read": "doc.owner == auth.uid"`、`"create": "auth.uid != null"` 等权限。
- **注销账号**：置 `status=4` + `valid_token_date=now`，并匿名化/删除业务数据（本工程未实现，可后续补 action）。
- **数据迁移**：登录迁移只改归属，不复制内容；生产建议迁移前做一次数据库快照，并给迁移逻辑加日志/重试。
- **登录后刷新数据**：切换账号后建议重新调用 `api.bootstrap()` 刷新业务数据（切换 Tab / 重启 App 会自动重新拉取）。

## 9. 部署与验证清单

1. HBuilderX 打开工程 → 右键 `uniCloud-aliyun` 关联服务空间（阿里云）。
2. 上传 `database/*.schema.json`（含 `uni-id-users`）。
3. 上传云函数：`user`、`workplan`、`seedDemo`（common 下的公共模块会被自动带上；
   `package.json` 中已声明 `"uni-id-common": "file:../common/uni-id-common"`）。
4. 云函数测试：
   - `{"action":"auth.register","username":"demo","password":"123456"}` → 返回 `token/tokenExpired/userInfo`；
   - 带同一 token 调 `{"action":"auth.getInfo","uniIdToken":"<token>"}` → 返回 userInfo；
   - `{"action":"auth.logout","uniIdToken":"<token>"}` → 再调 getInfo 应返回「登录状态已失效」；
   - `{"action":"bootstrap","deviceId":"dev-demo","uniIdToken":"<token>"}` → 返回该账号排班数据（自动 seed + 归属转换）。
5. 客户端把 `src/config.js` 的 `useCloud` 改为 `true`，重新运行 H5，验证登录 → 我的 → 退出登录 → 游客数据隔离。

## 10. 已知限制 / TODO

- 未实现：短信/邮箱验证码、微信/Apple 登录、找回密码、注销账号、登录失败锁定与验证码。
- 密码强度仅校验长度（6-64），无复杂度/弱密码字典。
- 本地演示模式的密码哈希与假 token 不具备任何安全性。
- `workplan` 对无效 token 静默按游客处理（不返回 401）；如需前端感知 token 过期，可改为返回 30203，
  或由 `use-auth.fetchInfo()` 主动校验（已实现自动清理本地会话）。
- `database/jy_*.schema.json` 尚未补 `owner` 字段与索引（云函数传统 API 不受 schema 校验影响；
  改造为 clientDB 前必须补齐）。
- 多设备并发登录/刷新 token：签发时 uni-id-common 只保留最近 N 个 token；如业务需要"单端在线"，
  需在登录流程里清空 `token` 数组。
