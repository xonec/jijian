# 会员（赞助）与支付接入（uni-app + uniCloud）

> 方案 B：**不接广告**，会员定位为“赞助开发者”，权益为「支持开发 / 专属客服 / 会员标识」。支付走 **支付宝 App 支付**（`uni.requestPayment({ provider: 'alipay', orderInfo })`），服务端由 `vip` 云函数签名/验签/发放会员。

## 1. 结构

    uniCloud-aliyun/
    ├─ cloudfunctions/
    │  └─ vip/                      会员云函数（订单/会员状态/支付宝签名/mock）
    ├─ common/uni-config-center/
    │  └─ vip/config.json           方案、权益、支付宝密钥、mock 开关
    └─ database/
       ├─ jy_vip.schema.json        每个 uid 一条会员记录（expireAt/planId）
       └─ jy_vip_order.schema.json  订单（outTradeNo/status/amount/planId）

客户端：

- `src/data/vip-plans.js`：方案/权益常量（本地 mock 与云端兜底共用）
- `src/composables/use-vip.js`：会员状态、加载、购买流程（真实支付 / mock 支付）
- `src/pages/sub/vip/index.vue`：会员页（状态条、方案、权益、开通/续费）
- `src/pages/setting/index.vue`：我的页会员卡片与会员徽章
- `src/services/api.js` 的 `api.vip.*`：双后端（云端 `vip` 云函数 / 本地 storage）

## 2. 云函数 actions

| action | 入参 | 出参 |
|---|---|---|
| `plans` | — | `{ plans, rights, configured, mock }` |
| `status` | — | `{ active, loggedIn, expireAt, planId }` |
| `createOrder` | `{ planId, payType }` | `{ order, configured, mock, payInfo? }` |
| `queryOrder` | `{ outTradeNo }` | `{ status, paidAt, amount, planId }` |
| `mockPay` | `{ outTradeNo }` | 会员状态（仅 `mock=true` 可用） |
| `notify` | 支付宝异步 POST | `'success'` / `'fail'`（HTTP 触发） |

价格只由服务端 `vip/config.json` 决定，客户端只传 `planId`，避免改价。

## 3. 配置（`common/uni-config-center/vip/config.json`）

    {
      "mock": true,
      "plans": [
        { "id": "month",   "price": 3,  "unit": "每月", "days": 30 },
        { "id": "year",    "price": 12, "unit": "每年", "days": 365, "best": true },
        { "id": "forever", "price": 18, "unit": "永久", "days": 36500 }
      ],
      "alipay": {
        "appId": "20210xxxxxxxxxxxxx",
        "privateKey": "MIIEv...（应用私钥，PKCS8，可带或不带 PEM 头）",
        "alipayPublicKey": "MIIBIj...（支付宝公钥，用于验签异步通知）",
        "notifyUrl": "https://<你的云函数URL化地址>/vip-notify"
      }
    }

### mock 模式（默认）

- `mock: true`：`createOrder` 不返回真实支付串，客户端弹「模拟支付」确认框，确认后调用 `mockPay` 直接发放会员；
- 用于本地/演示/H5 截图；**上线前必须改为 `false` 并配置支付宝密钥**，否则任何人都能白嫖会员。

## 4. 支付宝开通步骤

1. [支付宝开放平台](https://open.alipay.com/) 创建「移动应用」，获取 **APPID**；
2. 为应用签约 **APP 支付**（需要企业/个体户资质与营业执照）；
3. 在「开发设置 → 接口加签方式」生成 RSA2 密钥：
   - **应用私钥**（自己保存，填到 `alipay.privateKey`）；
   - **支付宝公钥**（开放平台提供，填到 `alipayPublicKey`）；
4. 在 uniCloud 控制台把 `vip` 云函数 **开启 URL 化**（或绑定自定义域名），把地址填到 `notifyUrl`，并加入支付宝应用的「授权回调/异步通知」白名单；
5. 上传 `vip` 云函数和 `jy_vip`、`jy_vip_order` 两个 schema（见 `UNICLOUD.md`）；
6. 真机联调：HBuilderX 打自定义基座（支付宝 SDK 需要原生运行环境，**H5 不支持** `uni.requestPayment` 的 alipay provider）。

沙箱：支付宝开放平台提供沙箱 APPID/密钥/买家账号，可先用沙箱联调，注意沙箱网关为 `https://openapi.alipaydev.com/gateway.do`（如需可把 `alipay.gateway` 配成沙箱地址，当前云函数签名不依赖网关，仅用于文档说明）。

## 5. 客户端支付流程

    点击「立即开通 / 续费」
      → 未登录且启用云端：提示「请先登录」并跳登录页
      → api.vip.createOrder({ planId })
          ├─ mock:true      → uni.showModal「模拟支付」→ api.vip.mockPay() → 刷新会员状态
          ├─ payInfo 存在   → uni.requestPayment({ provider:'alipay', orderInfo })
          │                    成功 → api.vip.status() 刷新；失败/取消 → toast
          └─ 未配置         → toast「支付暂未配置，请联系客服」

会员状态展示：

- 会员页顶部状态条：`已开通 · 有效期至 YYYY-MM-DD`；按钮变「续费」（续费时长累加）；
- 我的页会员卡片：`已开通会员 · 有效期至 …` / `去开通`；
- 用户卡副标题：`已登录 · 会员`（本地演示为 `本地演示 · 会员`），即「会员标识」权益。

截图：`shots/vip-flow.png`（依次为：立即开通→模拟支付确认；支付成功→有效期；我的页会员卡片与徽章）。

## 6. 安全与合规

- **价格服务端定价**：客户端只传 planId；金额、时长、权益全部在云函数/配置里；
- **幂等**：`mockPay`/`notify` 用订单号 + 已支付判断，重复通知不会重复发放；
- **验签**：`notify` 用支付宝公钥验 RSA2 签名（配置了公钥时强制验签）；
- **禁止上线开 mock**：`config.mock=false`；
- **合规**：会员属付费服务，需要商户资质/开票/退款规则；不要把「极简排班」商标与素材用于商业上架；
- **退款**：当前为人工客服处理（页面已提示「购买失败或使用微信支付，请微信联系客服」），如需自动化再接支付宝退款接口。

## 7. 后续可扩展

| 能力 | 做法 |
|---|---|
| 微信支付 | 云函数增加 `wxpay` 分支 + 微信支付商户号；客户端 `provider:'wxpay'` |
| 会员到期提醒 | 定时云函数扫描 `jy_vip.expireAt`，发订阅消息/邮件 |
| 订单后台 | 云函数增加 `order.list`（管理员权限）或直接看 uniCloud 数据库 |
| 兑换码/活动 | 新增 `jy_vip_code` 集合 + `redeem` action |
