import re, os, json, collections
SRC='/Users/hogar/.dsh/ungrouped/jianyun'
APP=os.path.join(SRC,'jadx-src/sources/cn/jianyun')

# 1. ColorKt constants
p=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java')
lines=open(p,encoding='utf-8').read().splitlines()
colors=[]
for i,l in enumerate(lines,1):
    m=re.search(r'(?:private|public) static (?:final )?long (\w+) = androidx\.compose\.ui\.graphics\.ColorKt\.Color\((\d+)L?\);', l)
    if m:
        val=int(m.group(2))
        colors.append({'name':m.group(1),'decimal':val,'hex':'#%08X'%val,'argb':'#%08X'%(val & 0xFFFFFFFF),'line':i})
print('ColorKt constants:',len(colors))
for c in colors: print(' ',c['name'],c['hex'],'line',c['line'])

# 2. radius usage distribution
rad=collections.Counter()
sp=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        pth=os.path.join(dirpath,fn)
        txt=open(pth,encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'RoundedCornerShape0680j_4\(Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)\)', txt):
            rad[float(m.group(1))]+=1
        for m in re.finditer(r'(?:Dp|TextUnitKt\.getSp)\.m609[0-9]+(?:constructorimpl|getSp)\((\d+(?:\.\d+)?)\)', txt):
            sp[float(m.group(1))]+=1
print('\nRoundedCornerShape dp distribution:', rad.most_common(20))
print('\nDp/sp numeric distribution (top 25):', sp.most_common(25))

# 3. fontWeight usage
fw=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'FontWeight\.INSTANCE\.get(\w+)\(\)', txt):
            fw[m.group(1)]+=1
        for m in re.finditer(r'new FontWeight\((\d+)\)', txt):
            fw['num'+m.group(1)]+=1
print('\nFontWeight usage:', fw.most_common(15))

# 4. sp (font size) usage
fs=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'TextUnitKt\.getSp\((\d+(?:\.\d+)?)d?\)', txt):
            fs[float(m.group(1))]+=1
print('\nfontSize sp distribution:', fs.most_common(20))

# 5. color.json palette
pal=json.load(open(os.path.join(SRC,'decoded/assets/data/color.json'),encoding='utf-8'))
cat=collections.Counter(x.get('catalog') for x in pal)
print('\ncolor.json entries:',len(pal),'catalogs:',dict(cat))
print('first 5:',pal[:5])
print('names sample:',[x['name'] for x in pal[:10]])
# find specific colors used in app defaults
def find(hexv):
    return [x for x in pal if x['color'].upper()==hexv.upper()]
for h in ['#55BB8A','#776AD4','#1974E8','#F87679','#EE3F4D','#F07C82','#EE8055']:
    print(h, find(h))
