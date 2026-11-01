#!/usr/bin/env python3
"""Extract Compose UI structure hints from jadx-decompiled Java."""
import re, sys, os
from collections import Counter

SKIP = re.compile(r'(Intrinsics|ComposerKt|startRestartGroup|endRestartGroup|ScopeUpdateScope|replaceableGroup|startDefaults|endDefaults|sourceInformation|checkNotNull|updateScope|updateChangedFlags|Function2<|Function1<|Function0<|Unit\.INSTANCE|MeasurePolicy|currentCompositeKeyHash|modifierMaterializerOf|invalidApplier|SkippableUpdater|Consume|SkippableUpdater|slotTable|composer[0-9]?\.|rememberedValue|RecomposeScope)')

def funcs(src):
    out = []
    for m in re.finditer(r'public static final void (\w+)\(', src):
        out.append((src[:m.start()].count('\n') + 1, m.group(1)))
    return out

def literals(src):
    return re.findall(r'"([^"\\]{1,60}[\u4e00-\u9fa5][^"\\]{0,80})"', src)

def dump(path, max_lines=400):
    src = open(path, encoding='utf-8', errors='replace').read()
    print('FILE:', path, 'size', len(src))
    print('=== composables ===')
    for ln, name in funcs(src):
        print(f'  {ln:6d}  {name}')
    print('=== UI calls (order) ===')
    shown = 0
    for i, ln in enumerate(src.split('\n')):
        m = re.search(r'\b([A-Za-z_0-9]+Kt\.[A-Za-z_0-9]+|IconFont\.[A-Za-z_0-9]+)\(', ln)
        zh = literals(ln)
        if (m or zh) and not SKIP.search(ln):
            s = ln.strip()
            if len(s) > 210: s = s[:210] + '...'
            print(f'  {i+1:6d} {s}')
            shown += 1
            if shown >= max_lines:
                print('  ...(truncated)')
                break
    print('=== chinese literals (count) ===')
    for s, c in Counter(literals(src)).most_common(40):
        print(f'  {c:3d}  {s}')

if __name__ == '__main__':
    for p in sys.argv[1:]:
        dump(p)
