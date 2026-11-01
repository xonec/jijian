# screen-13 · 会员 / 我的信息 / 登录注册

> 源码：`main/setting/vip/VipViewKt.java`、`main/setting/user/UserDetailViewKt.java`、`LoginDialogKt.java`

## 1. 会员页 VipPage（路由 Vip）
- 容器：`FullDialog`（全屏弹窗式页面）+ 返回（`VipView.kt:56,145-163`）；背景为会员主题视觉。
- 内容（Column 可滚动，底部 80dp，:185-187）：
  1. 顶部会员大标题/Logo 区（`CenterRow(20dp)` + ComposableSingletons lambda2，:240）
  2. **"购买方案"**（LeadingHint，:241）
     - 三个价格卡横排（Row，均 weight 1）：
       | 方案 | 价格 | 副标题 | 角标 |
       |---|---|---|---|
       | 月度 `month` | **3元** | 每天1毛钱 | — |
       | 年度 `year` | **12元** | 每天3.3分钱 | — |
       | 永久 `forever` | **18元** | 一次性买断 | **"最划算"**（ImportantColor #EE3F4D 标签） |
     - 价格卡选中态：边框 **ThemeColor** 1dp + 圆角；未选中灰色 50% 边框（:494-512）
  3. **"会员权益"**（LeadingHint，:288）三项（`VipItemView`，图标 30sp ThemeColor + 标题/说明，surfaceVariant 圆角卡）（:289-291, :617-660）：
     - 支持开发（IconFont.thumb）：促使开发者砥砺前行，呈现更优质的App功能
     - 无广告秒开（IconFont.image）：没有任何开屏和视频广告
     - 专属客服（IconFont.vip）：会员用户优先响应
  4. 通栏主按钮 **"确认购买"**（LongOkButton，:298）
     - 未登录 → 弹 LoginDialog + toast **"请先登录"**（:315-316）
     - 购买成功 → goBack
  5. 通栏次按钮 **"返回"**（LongCancelButton，:352）
  6. 底部链接文字：**"购买前请查看《会员使用协议》"**（LinkText ThemeColor，:378）
- 数据：`AppSettingViewModel.currentMode`（month/year/forever）、`isVip/isRealVip`；支付走支付宝 SDK（`vm/AliPayResult`）

## 2. 我的信息 UserDetailView（路由 UserDetail）
- 容器：`PageView(nav, "我的信息")`（:123）→ 48dp header（左侧返回、右侧 `HeaderIcon(IconFont.refresh)` 刷新用户信息，:142）
- 内容（:139-…）：
  1. **用户卡片** `SettingGroupView`（:188）：
     - `TwoColumnView`：左 `AppLogoView(40dp)`；右 Column：昵称（15sp）+ 会员标签（"普通用户"/vipName）
     - 标签：会员 → **VipColor**；有效期文字：**"有效期：" + vipDate**（VipColor，:317）
     - **"退出登录"**（TagView，DeleteColor，可点，:341）
     - 点击 "退出登录" → `ConfirmDialog("退出登录会导致当前设备的会员身份丢失喔，请问还要继续退出吗？")`（:669）
  2. **"其他信息" / "编辑信息"**（LeadingHint，:377-380）：右侧链接 **"编辑"/"取消"**（:402-439）
  3. 信息表单 `SettingGroupView`（:456）：`InputItemView("昵称")`、**"微信"**、**"QQ"**、**"城市"**（:478-550）；编辑态可改，保存 `LongOkButton("保存")`（:590）
  4. 提示小字：**"登录账号仅用于记录用户付费状态，如果需要对数据进行云备份，请自行绑定第三方云备份账号"**（SmallTipText，:610）
  5. 通栏次按钮 **"我要注销账号"**（LongCancelButton，:626）→ 弹输入框：
     - 提示文案：**"提示:请输入账号密码来确认你身份，注销账号，意味之前购买的会员也会随之失效，但您本地的排班数据，我们不会删除，仅做账号注销喔！"**（:708）

## 3. 登录/注册弹窗 LoginDialog（非路由）
- 触发：我的→用户卡（未登录）、会员页购买、反馈等（`formType == "login"`）
- 容器：`SelfDialog`（居中卡片弹窗），可关闭（:76）
- 内容（:95-420）：
  1. 顶部图标/标题（登录/注册分段）
  2. 提示文字（按场景）：
     - **"请登录或注册账号后再购买，避免无法绑定会员身份"**（14sp 警告，:154）
     - **"请登录或注册账号后再反馈，避免无法查看回复"**（12sp，:160）
  3. 账号/密码输入项（`InnerInputItemView`）
  4. 说明小字：**"注意：目前仅用于绑定您的付费状态和反馈意见"**（SmallTipText，:273）
  5. 主按钮（登录/注册）+ 切换注册/登录链接（:312-388）
- 数据：`AppSettingViewModel.doLogin/doRegist` → `BaseRepository.makeLogin`（:390）
