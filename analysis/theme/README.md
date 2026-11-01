# analysis/theme 索引（task-1 产物）

| 文件 | 说明 |
|---|---|
| design-tokens.md | 设计令牌总览（颜色/排版/圆角/间距/字体/图标/主题核查），带证据路径与行号 |
| design-tokens.json | 机器可读令牌（colors/typography/radius/spacing/fonts/icons/assets/evidence）；colors.themePresets 含 230 中国色 |
| design-tokens.css | 可直接被 HTML 原型引用的 CSS 变量 + remixicon @font-face（路径已按 prototype/ 相对 asset 目录写好） |
| strings.zh.md | App 自有中文文案，按界面分 15 节（748 条去重），含 file:line |
| strings.zh.full.tsv | 全量文案清单 text/file/line（748 条去重） |
| copy-options.md | SelectUtil.java 全部 44 组枚举（显示名→存储值/颜色） |
| resource-map.tsv | 7426 行资源映射：resourceId/type/name/config/混淆 APK 路径/解码路径/ownership(app 或 thirdparty) |
| resource-table-full.tsv | 同 resource-map.tsv（全量资源表，便于 grep） |
| scripts/ | 产物生成脚本（Python3，复现用；依赖 fontTools、Pillow） |

关联产物：

- ../assets_extracted/（App 自有素材：app-icon / widget / cloud / layouts / fonts / palette + manifest.md）

引用约定：原型若位于 jianyun/prototype/，CSS 用 ../analysis/theme/design-tokens.css、素材用 ../assets_extracted/...；若原型位于 jianyun/ 根，则用 analysis/theme/... 与 assets_extracted/...。
