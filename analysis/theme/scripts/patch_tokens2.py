import os, re, json, collections
SRC='/Users/hogar/.dsh/ungrouped/jianyun'
APP=os.path.join(SRC,'jadx-src/sources/cn/jianyun')
padding=collections.Counter()
pat=re.compile(r'PaddingKt\.m5\d+[A-Za-z0-9_$]*\([^;]{0,400}?Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)')
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in pat.finditer(txt):
            padding[float(m.group(1))]+=1
print('padding matches total:', sum(padding.values()), padding.most_common(20))
p=os.path.join(SRC,'analysis/theme/design-tokens.json')
t=json.load(open(p,encoding='utf-8'))
t['spacing']['observedPaddingDp']={str(k):v for k,v in padding.most_common(15)}
t['spacing']['paddingSample']={'note':'PaddingKt.*(Dp...) 近似统计(部分调用跨行未计入)','total':sum(padding.values())}
t['typography']['material3Overrides']['bodyLarge']['evidence']='jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java:36 (bodyLarge = TextStyle(fontSize=16sp, fontWeight=Normal, fontFamily=FontFamily.Default, letterSpacing=0.5sp, lineHeight=24sp))'
json.dump(t,open(p,'w'),ensure_ascii=False,indent=2)
print('patched')
