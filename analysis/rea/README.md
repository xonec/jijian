# REA 深度逆向：极简排班 APK 代码提取

> 用 [REA（morluto/rea）](https://github.com/morluto/rea) 及其依赖的 `jadx-headless-mcp 0.7.1` 引擎，对 `cn.jianyun.workplan` 3.5.0 做了**证据化、类/方法级**的代码提取，作为 `jadx-src/` 的补充与质量校验。

## 1. 工具链与运行环境

| 项 | 值 |
|---|---|
| REA CLI | `rea-agents` 6.8.0（`npx -y rea-agents@latest`） |
| JADX 引擎 | `jadx-headless-mcp 0.7.1`（REA 要求调用方自备；已下载并 SHA256 校验，存 `tools/rea/jadx-headless-mcp-0.7.1-all.jar`） |
| JAR SHA256 | `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75` |
| JDK | 17.0.20（Temurin） |
| 备注 | 本机 Node 24.15 低于 REA 建议的 24.22+，仅有 EBADENGINE 警告，功能正常 |

## 2. 做法（为什么不是一条条跑 REA CLI）

1. 先用 REA CLI 做不可替代的**包级证据**：`inspect-apk-signature`、`inspect-android-package`（后者需配置 `REA_JADX_MCP_JAR`）。
2. 再用同一 JADX 引擎的**常驻 MCP 模式**（`java -jar jadx-headless-mcp-0.7.1-all.jar --apk app.apk --transport stdio`）批量查询：一次加载 APK，逐类取 `get_class_summary` / `get_class_source` / `get_xrefs_to_class|method`，避免每次 CLI 重新加载 45MB APK。
3. 批处理脚本：`tools/rea/extract.mjs`（全量）、`tools/rea/plan-runner.mjs`（按计划执行）、`tools/rea/gen-report.py`（生成索引/报告）。

复现命令：

    cd jianyun/tools/rea
    node extract.mjs                 # 默认输出到 jianyun/analysis/rea/
    python3 gen-report.py            # 生成 CODE-INDEX / XREF-MAP / DECOMPILE-QUALITY

## 3. 产物清单

| 路径 | 内容 | 规模 |
|---|---|---|
| `source/` | 367 个顶层类的**反编译 Java 源码**（含内部类） | 10 MB / 148,594 行 |
| `source-smali/` | 13 个 Java 反编译失败类的 **smali** 源码 | 2.5 MB |
| `source-partial/` | 上述 13 个类的 **partial Java**（带反编译桩，便于阅读） | 1.3 MB |
| `inventories/` | 436 个类的**成员清单**（方法签名/字段/内部类） | 2.0 MB |
| `classes-app.json` / `classes-cn.json` | 应用类清单（manifest 包 434 + timetable 2） | — |
| `METHODS.tsv` | 类 → 方法数/字段数/内部类/是否有源码 | — |
| `COMPOSE-UI.tsv` | **262 个 Compose Composable 方法**索引（类/方法/签名） | — |
| `xrefs/` | 15 组交叉引用原始结果 | — |
| `XREF-MAP.md` | 交叉引用汇总（谁引用了谁） | — |
| `CODE-INDEX.md` | 包统计 + Composable 索引 + 方法最多 Top30 | — |
| `DECOMPILE-QUALITY.md` | 与旧 `jadx-src/` 的反编译质量对比 | — |
| `AndroidManifest.xml` / `app-info.json` / `apk-signature.json` | 清单、包信息、签名证据 | — |
| `raw/` | 原始响应（类清单、成员清单 JSONL、字符串资源） | — |

## 4. 关键数据

| 指标 | 数值 |
|---|---|
| APK 类总数（含三方库） | 26,578 |
| 应用自有类（manifest 包） | 434（+ timetable 2 = 436） |
| 应用方法总数 | 5,290 |
| Compose Composable | 262（分布在 91 个类） |
| 资源文件 | 4,840 |
| 权限 | 25 |
| 签名 | v2 单签名，证书 `CN=lihe/O=jianyun/L=hz`，`self_consistent=true` |

## 5. 相对旧 `jadx-src/` 的新增价值

1. **质量恢复**：旧批量反编译有 202 个类带告警；REA 重跑后 **34 个类得到干净 Java**（列表见 `quality-recovered.txt`）。另有 13 个类 JADX 完全失败（如 `BaseRepository`、`ScheduleMasterViewModel`、`ScheduleStatViewModel`、`FormItemKt`、`ScheduleService`），已保存 smali（`source-smali/`）与 partial Java（`source-partial/`）用于对照。
2. **成员索引**：`inventories/` + `METHODS.tsv` 提供精确的方法签名/字段/内部类，便于检索（旧 jadx-src 只有全文搜索）。
3. **Composable 索引**：`COMPOSE-UI.tsv` 直接列出 262 个 UI 函数，按类定位界面实现（例如 `FormItemKt` 36 个、`BoxViewKt` 28、`HeaderViewKt` 18）。
4. **交叉引用**：`XREF-MAP.md` 给出组件/导航的真实调用关系，例如：
   - `BaseRepository` 被 69 个顶层类引用（237 处）
   - `FormItemKt` 被 21 个类引用（86 处）
   - `HeaderViewKt` 被 27 个类引用（66 处，即所有用 PageView 的页面）
   - `Router` 被 9 个类引用（50 处，导航入口）
   - `ScheduleCalendarViewKt` 仅被 `ScheduleHomeViewKt` 引用（确认日历只在首页）
5. **证据化**：REA 输出带 `evidence_id`、`confidence`、`limitations`（见 `apk-signature.json`、`raw/`）。

## 6. 已知局限

- 13 个类只能 smali 回退（见 `DECOMPILE-QUALITY.md` 与 `quality-smali-fallback.txt`），已附带 partial Java 便于阅读。
- JADX 反编译是「近似 Java」，Compose 内联 lambda 会展开成 `AnonymousClass` 与超长方法，阅读时建议配合 `inventories/` 的签名索引与 `xrefs/` 的调用关系。
- REA 不做 UI 复刻；界面结构结论仍以 `analysis/screens/` 为准，本目录用于补全代码证据与定位实现。

## 7. 与现有资产的关系

| 资产 | 用途 |
|---|---|
| `jadx-src/`（440MB 全量） | 全库代码搜索、三方库查阅 |
| `analysis/rea/`（本目录） | 应用自有代码的**结构化索引 + 干净源码 + 交叉引用** |
| `analysis/screens/` | 界面结构规格（由代码+截图整理） |
| `prototype/`、`uniapp/` | 复刻实现 |

## 8. REA MCP 接入（DSH 已注册）

本会话已把 REA 注册为 DSH 的 MCP 服务器，`mcp__rea__*` 工具可直接调用（本次真机/模拟器截图就用了 `install_adb_package`、`start_adb_app`、`inspect_adb_device` 等）。

| 项 | 值 |
|---|---|
| 注册命令 | `npx -y rea-agents@6.8.0 setup --client dsh --yes` |
| Node 版本 | **24.22.1**（REA 6.8.0 要求 ≥24.22.1；本机原 24.15 会被拒绝，已用 nvm 安装） |
| 写入配置 | `~/.dsh/cordis.patch.yml` → `rea-mcp`（serverName `rea`，package `rea-agents@6.8.0`） |
| 引擎环境变量 | `REA_JADX_MCP_JAR=<jianyun>/tools/rea/jadx-headless-mcp-0.7.1-all.jar` |
| 生效方式 | 重载/重启 DSH 客户端后出现 `mcp__rea__*` 工具（本会话已生效） |

注册后的能力分层：

- **静态分析**：`open_binary` + Ghidra/Hopper 家族（本机未装 Ghidra/Hopper，仅 JADX 可用）；
- **Android**：`inspect_android_package`、`inspect_apk_signature`、`inspect_android_class/method`、`trace_android_references` 等（依赖 `REA_JADX_MCP_JAR`）；
- **设备/运行时**：`list_adb_devices`、`inspect_adb_device`、`install_adb_package`、`start_adb_app`、`capture_adb_screen`、`pull_adb_package` 等（本次已实测）。

> 注意：本次注册只写入 DSH 配置；若升级 REA 或移动 JAR 路径，需重新执行 `rea setup --client dsh --yes` 刷新。

