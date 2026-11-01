import re, os, json, collections
root='/Users/hogar/.dsh/ungrouped/jianyun/jadx-src/sources'
cjk=re.compile(r'[\u4e00-\u9fff]')
pua=re.compile(r'[\ue000-\uf8ff]')
# count CJK per top-level dir
top=collections.Counter()
files_cjk=collections.Counter()
for dirpath,dirs,files in os.walk(root):
    for fn in files:
        if not fn.endswith('.java'): continue
        p=os.path.join(dirpath,fn)
        try: txt=open(p,encoding='utf-8',errors='ignore').read()
        except: continue
        if cjk.search(txt):
            rel=os.path.relpath(p,root)
            top[rel.split('/')[0]]+=1
            if rel.startswith('cn/jianyun'):
                files_cjk[rel]+=2
print('top-level dirs with CJK files:', dict(top.most_common(30)))
print()
print('app cn/jianyun CJK files:', len(files_cjk))
# extract CJK string literals from app code
lit=re.compile(r'"((?:[^"\\]|\\.)*)"')
out=[]
for dirpath,dirs,files in os.walk(os.path.join(root,'cn/jianyun')):
    for fn in sorted(files):
        if not fn.endswith('.java'): continue
        p=os.path.join(dirpath,fn)
        rel=os.path.relpath(p,root)
        try: lines=open(p,encoding='utf-8',errors='ignore').read().splitlines()
        except: continue
        for i,line in enumerate(lines,1):
            if not cjk.search(line): continue
            for m in lit.finditer(line):
                s=m.group(1)
                if cjk.search(s):
                    out.append((rel,i,s))
print('CJK literals in cn/jianyun:', len(out))
with open('/Users/hogar/.dsh/ungrouped/jianyun/work/theme/app_cjk_literals.tsv','w') as f:
    for rel,i,s in out:
        f.write(rel+'\t'+str(i)+'\t'+s+'\n')
# pua literals per package
pua_out=[]
for dirpath,dirs,files in os.walk(root):
    for fn in files:
        if not fn.endswith('.java'): continue
        p=os.path.join(dirpath,fn)
        rel=os.path.relpath(p,root)
        try: txt=open(p,encoding='utf-8',errors='ignore').read()
        except: continue
        if pua.search(txt):
            hits=[m.group(1) for m in lit.finditer(txt) if pua.search(m.group(1))]
            pua_out.append((rel,len(hits),hits[:6]))
print('files with PUA chars:', len(pua_out))
for rel,n,h in pua_out[:40]:
    print(' ',rel,n,[hex(ord(c)) for hh in h for c in hh][:8])
