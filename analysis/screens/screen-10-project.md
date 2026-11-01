# screen-10 · 项目管理（ScheduleProjectManagerView）

> 源码：`module/schedule/views/project/ScheduleProjectManagerViewKt.java`（原 ScheduleProjectManagerView.kt:34）
> 路由：`ScheduleProjectManage`（ScheduleRouter.java:25）
> 入口：「我的→排班设置→我的排班项目」；首页右上角 list 图标 → 底部项目选择面板的「管理」（BottomProjectChooseViewKt.java:71-86）

## 1. 容器
- `PageWithFooterView(nav, title="项目管理", ...)`（:98）
  - 顶部：返回箭头 + 居中标题 **"项目管理"**（48dp）
  - 底部：固定 footer 按钮区（高约 50dp + padding）

## 2. 列表内容（:216-620）
- 空态：`EmptyDataView("暂无项目")`（:220）
- 每个项目：`SwipeRowView`（左滑显示删除按钮，:227）包 `GroupView` 卡片：
  - 内容 `VerticalRow`（:321）：
    - 第 1 行：项目名（15sp 主文字）+ 若为当前项目 → `TagView("当前项目")`（:343）
    - 第 2 行：创建时间（灰色小字，:354）
  - 点击项目 → `setFormType("detail")` → 打开动作 SheetDialog（:244, :446-512）
- 动作 SheetDialog（标题 **"选择一项操作"**，`SheetDialog`）三项（:446-512）：
  | 项 | 颜色 | 行为 |
  |---|---|---|
  | **切换为当前项目** | ThemeColor #55BB8A | 设为当前项目 |
  | **编辑项目名称** | ThemeColor | 弹出输入框（ShowInputDialog），保存改名 |
  | **删除项目** | DeleteColor #F87679 | 弹 `DeleteDialog("删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？")`（:269,538） |
  - 约束：**至少保留一个项目**（删除最后一个 → toast "至少保留一个项目"，:263）
- 左滑删除：`SwipeDeleteView`（红色删除按钮，:227），删除前同样弹 DeleteDialog

## 3. 底部按钮区（footer）
- 项目数 = 0 时：单个 `LongOkButton("添加项目")`（:164）
- 有项目时：`OkAndCancelButtonGroup("添加项目", "项目排序")`（:141）
  - **添加项目** → `FormType.add()` → 弹出输入框（ShowInputDialog，:401）→ 保存
  - **项目排序** → `FormType.sort()` → `SortDialogView("项目排序", ...)` 拖拽排序（:589）

## 4. 数据模型（ScheduleProject.java）
- 字段：`uuid, name, remark, ordinal, current(是否当前项目), gmtCreate, ...`
- 项目 = 一套独立的排班数据（班次/轮班/提醒/配置），切换项目切换整个排班上下文（`ScheduleConfig.projectUuid`）
- 删除项目级联删除该项目下排班数据（DeleteDialog 文案证实）
