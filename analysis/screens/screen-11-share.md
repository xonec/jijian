# screen-11 · 分享与导入排班（ScheduleShareView）

> 源码：`module/schedule/views/share/ScheduleShareViewKt.java`（原 ScheduleShareView.kt:28）
> 路由：`ScheduleShareData` | 入口：我的→分享与导入排班

## 1. 容器
- `PageView(nav, title="分享与导入排班")`（:94）：48dp 返回箭头 + 居中标题 + 内容（水平 padding 10dp）

## 2. 顶部页签（:113-176）
- `SegmentPickerView(page, options = [分享 share, 导入 import])`（:146）
- 选中 **分享** → `ShareContent`；选中 **导入** → `ImportContent`（:170-176）

## 3. 分享内容（ShareContent, :219-330）
从上到下：
1. `GroupView` 卡片：说明文字（分享数据用途/说明，:221-243）
2. `GroupView` 卡片：展示即将分享的数据摘要（:256-272）
3. 通栏次按钮 **"复制秘钥"**（LongCancelButton，:285）→ 复制分享密钥到剪贴板（ClipboardUtil）
4. 通栏主按钮 **"分享排班数据"**（LongOkButton，:306）→ 唤起系统分享

## 4. 导入内容（ImportContent, :357-490）
从上到下：
1. 说明卡片 `GroupView`（如何获取秘钥/注意事项，ComposableSingletons lambda1）
2. 表单卡片 `GroupView`：
   - `InputItemView("秘钥")`（:380）
   - `InputItemView("项目命名")`（:401）（导入后新项目名称）
3. 通栏主按钮 **"确定导入"**（LongOkButton，:429）
   - 成功 → `navigate(Home, popUpTo(Home) inclusive + launchSingleTop)` 回主页（:462-489）

## 5. 数据模型
- `ScheduleShareData` / `ScheduleSharePostData` / `api/ScheduleShareApi`：分享内容包含项目、班次、轮班、排班记录、配置（`module/schedule/model/ScheduleShareData.java`）
- 分享密钥由服务端生成/校验（`ScheduleShareViewModel.doShare()/doImport()`，含网络请求）
