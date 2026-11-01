#!/usr/bin/env python3
import re, sys
def window(path, funcre, span=120):
    src=open(path,encoding='utf-8',errors='replace').read()
    lines=src.split(chr(10))
    idx=[i for i,l in enumerate(lines) if re.search(funcre,l)]
    out=[]
    for i0 in idx[:3]:
        print('='*20, path.split('/')[-1], 'line', i0+1, ':', lines[i0][:160])
        for j in range(i0, min(len(lines), i0+span)):
            l=lines[j]
            if re.search(r'(constructorimpl|getSp|m621width|m602height|padding|radius|RoundedCorner|weight|fillMaxWidth|aspectRatio|size3ABfNKs|Color\.INSTANCE|getThemeColor|getLight|getDark|TextKt|IconView|Surface|Card)', l):
                s=l.strip()
                if len(s)>200: s=s[:200]+'...'
                print(f'  {j+1:6d} {s}')
if __name__=='__main__':
    window(sys.argv[1], sys.argv[2], int(sys.argv[3]) if len(sys.argv)>3 else 120)
