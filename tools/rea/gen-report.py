#!/usr/bin/env python3
# 生成 REA 深度代码提取的索引/报告
import json, os, re, glob
from collections import Counter, defaultdict

BASE = '/Users/hogar/.dsh/ungrouped/jianyun/analysis/rea'
JADX = '/Users/hogar/.dsh/ungrouped/jianyun/jadx-src/sources'

inv = {}
for p in glob.glob(os.path.join(BASE, 'inventories', '*.json')):
    try:
        d = json.load(open(p))
        inv[d.get('full_name') or os.path.basename(p)[:-5]] = d
    except Exception:
        pass
src_files = {os.path.basename(p)[:-5] for p in glob.glob(os.path.join(BASE, 'source', '*.java'))}

rows = []
composables = []
for cls, d in sorted(inv.items()):
    methods = d.get('methods') or []
    rows.append((cls, len(methods), len(d.get('fields') or []), len(d.get('inner_classes') or []), cls in src_files))
    for m in methods:
        sig = m.get('signature') or ''
        if 'Composer' in sig:
            composables.append((cls, m.get('name'), sig))
with open(os.path.join(BASE, 'METHODS.tsv'), 'w') as f:
    f.write('class\tmethods\tfields\tinner_classes\thas_source\n')
    for r in rows:
        f.write('\t'.join(str(x) for x in r) + '\n')

pkgs = Counter(); pkg_methods = Counter()
for cls, d in inv.items():
    parts = cls.split('.')
    pkg = '.'.join(parts[:-1]) if len(parts) > 1 else '(default)'
    pkgs[pkg] += 1
    pkg_methods[pkg] += len(d.get('methods') or [])

def short(pkg):
    return pkg.replace('cn.jianyun.workplan.', '').replace('cn.jianyun.', '')

def bq(s):
    return '`' + s + '`'

lines = []
lines.append('# 极简排班 3.5.0 · REA/JADX 深度代码索引')
lines.append('')
lines.append('> 由 REA（morluto/rea）依赖的 jadx-headless-mcp 0.7.1 引擎在**单个常驻会话**中批量提取：')
lines.append('> ' + str(len(inv)) + ' 个类成员清单 + ' + str(len(src_files)) + ' 个顶层类反编译源码 + ' + str(len(glob.glob(os.path.join(BASE, 'xrefs', '*.json')))) + ' 组交叉引用。原始数据见 inventories/、source/、xrefs/。')
lines.append('')
lines.append('## 总览')
lines.append('')
lines.append('| 项 | 数值 |')
lines.append('|---|---|')
lines.append('| 应用类（manifest 包 + timetable） | ' + str(len(inv)) + ' |')
lines.append('| 已提取反编译源码（顶层类） | ' + str(len(src_files)) + ' |')
lines.append('| 方法总数 | ' + str(sum(len(d.get('methods') or []) for d in inv.values())) + ' |')
lines.append('| Compose Composable 方法 | ' + str(len(composables)) + ' |')
lines.append('| 交叉引用目标 | ' + str(len(glob.glob(os.path.join(BASE, 'xrefs', '*.json')))) + ' |')
lines.append('')
lines.append('## 按包统计（类数 / 方法数）')
lines.append('')
lines.append('| 包 | 类数 | 方法数 |')
lines.append('|---|---|---|')
for pkg, n in sorted(pkgs.items(), key=lambda x: -x[1]):
    lines.append('| ' + bq(short(pkg)) + ' | ' + str(n) + ' | ' + str(pkg_methods[pkg]) + ' |')
lines.append('')
lines.append('## Compose Composable 方法索引（按类）')
lines.append('')
lines.append('| 类 | Composable 方法 |')
lines.append('|---|---|')
by_class = defaultdict(list)
for cls, name, sig in composables:
    by_class[cls].append(name + '()')
for cls in sorted(by_class):
    names = ', '.join(by_class[cls][:12])
    more = '' if len(by_class[cls]) <= 12 else ' …(+' + str(len(by_class[cls]) - 12) + ')'
    lines.append('| ' + bq(short(cls)) + ' | ' + names + more + ' |')
lines.append('')
lines.append('## 方法最多的类（定位核心逻辑）')
lines.append('')
lines.append('| 类 | 方法数 | 字段数 | 内部类 | 源码 |')
lines.append('|---|---|---|---|---|')
for cls, mc, fc, ic, has_src in sorted(rows, key=lambda r: -r[1])[:30]:
    lines.append('| ' + bq(short(cls)) + ' | ' + str(mc) + ' | ' + str(fc) + ' | ' + str(ic) + ' | ' + ('✅' if has_src else '—') + ' |')
lines.append('')
with open(os.path.join(BASE, 'CODE-INDEX.md'), 'w') as f:
    f.write('\n'.join(lines) + '\n')

with open(os.path.join(BASE, 'COMPOSE-UI.tsv'), 'w') as f:
    f.write('class\tmethod\tsignature\n')
    for cls, name, sig in sorted(composables):
        f.write(cls + '\t' + str(name) + '\t' + str(sig) + '\n')

xl = ['# 交叉引用地图（REA/JADX xref）', '', '> get_xrefs_to_class / get_xrefs_to_method 结果汇总；完整 JSON 见 xrefs/。', '']
for p in sorted(glob.glob(os.path.join(BASE, 'xrefs', '*.json'))):
    name = os.path.basename(p)[:-5]
    try:
        d = json.load(open(p))
    except Exception:
        continue
    items = d.get('items') or []
    refs = Counter()
    for it in items:
        top = it.get('top_class') or it.get('full_name') or ''
        if top and top != d.get('target'):
            refs[short(top)] += 1
    xl.append('## ' + name)
    xl.append('')
    xl.append('- 目标：' + bq(str(d.get('target'))))
    xl.append('- 引用点：' + str(d.get('total', len(items))))
    if refs:
        xl.append('- 引用来源（按顶层类）：')
        for k, v in refs.most_common(12):
            xl.append('  - ' + bq(k) + ' × ' + str(v))
    xl.append('')
with open(os.path.join(BASE, 'XREF-MAP.md'), 'w') as f:
    f.write('\n'.join(xl) + '\n')

smali_like = []
for p in glob.glob(os.path.join(BASE, 'source', '*.java')):
    head = open(p, encoding='utf-8', errors='replace').read(4000)
    if '.class' in head and ('invoke-' in head or 'iput' in head):
        smali_like.append(p)

def warn_count(path):
    try:
        t = open(path, encoding='utf-8', errors='replace').read()
    except Exception:
        return 0
    return t.count('Code decompiled incorrectly') + t.count('Failed to decompile') + t.count('JADX WARN')

jadx_dir = os.path.join(JADX, 'cn', 'jianyun')
jadx_warn = {}
for p in glob.glob(os.path.join(jadx_dir, '**', '*.java'), recursive=True):
    rel = p[len(jadx_dir)+1:-5].replace('/', '.')
    w = warn_count(p)
    if w: jadx_warn['cn.jianyun.' + rel] = w
rea_warn = {}
for cls in src_files:
    p = os.path.join(BASE, 'source', cls + '.java')
    if os.path.exists(p):
        w = warn_count(p)
        if w: rea_warn[cls] = w
recovered = sorted(set(jadx_warn) - set(rea_warn))
ql = ['# 反编译质量对比（REA/JADX vs 之前 jadx 批量输出）', '',
      '> 统计 Code decompiled incorrectly / Failed to decompile / JADX WARN 标记数量。', '',
      '| 项 | 数值 |', '|---|---|',
      '| REA 提取的源码数 | ' + str(len(src_files)) + ' |',
      '| REA 源码中仍带反编译告警的类 | ' + str(len(rea_warn)) + ' |',
      '| REA 源码疑似 smali 回退的类 | ' + str(len(smali_like)) + ' |',
      '| 旧 jadx-src 中带告警的类 | ' + str(len(jadx_warn)) + ' |',
      '| **REA 成功、旧 jadx-src 有告警的类** | ' + str(len(recovered)) + ' |', '']
if recovered:
    ql.append('## 恢复列表（旧 jadx 有告警、REA 无反编译告警）')
    ql.append('')
    for c in recovered[:60]:
        ql.append('- ' + bq(c))
    if len(recovered) > 60:
        ql.append('- …共 ' + str(len(recovered)) + ' 个，完整列表见 quality-recovered.txt')
    ql.append('')
    open(os.path.join(BASE, 'quality-recovered.txt'), 'w').write('\n'.join(recovered) + '\n')
if smali_like:
    ql.append('## 疑似 smali 回退')
    ql.append('')
    for p in smali_like[:30]:
        ql.append('- ' + bq(os.path.basename(p)[:-5]))
with open(os.path.join(BASE, 'DECOMPILE-QUALITY.md'), 'w') as f:
    f.write('\n'.join(ql) + '\n')

print(json.dumps({
  'classes': len(inv), 'sources': len(src_files), 'methods': sum(len(d.get('methods') or []) for d in inv.values()),
  'composables': len(composables), 'compose_classes': len(by_class), 'pkgs': len(pkgs),
  'xref_files': len(glob.glob(os.path.join(BASE, 'xrefs', '*.json'))),
  'jadx_warn_classes': len(jadx_warn), 'rea_warn_classes': len(rea_warn), 'recovered': len(recovered), 'smali_like': len(smali_like)
}, ensure_ascii=False))
