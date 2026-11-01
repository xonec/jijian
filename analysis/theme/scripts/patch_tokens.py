import os, re, json, collections
SRC='/Users/hogar/.dsh/ungrouped/jianyun'
APP=os.path.join(SRC,'jadx-src/sources/cn/jianyun')
dp=collections.Counter(); padding=collections.Counter(); size=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)', txt):
            dp[float(m.group(1))]+=1
        for m in re.finditer(r'PaddingKt\.m567padding3ABfNKs\([^;]*?Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)', txt):
            padding[float(m.group(1))]+=1
        for m in re.finditer(r'SizeKt\.m60[0-9]+(?:height|width)3ABfNKs\([^;]*?Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)', txt):
            size[float(m.group(1))]+=1
print('Dp distribution top30:', dp.most_common(30))
print('padding Dp top20:', padding.most_common(20))
print('size Dp top20:', size.most_common(20))
p=os.path.join(SRC,'analysis/theme/design-tokens.json')
t=json.load(open(p,encoding='utf-8'))
t['spacing']={
  'unit':4,
  'scale':[2,4,5,6,8,10,12,15,16,20,24,30,40,50],
  'observedDpAll':{str(k):v for k,v in dp.most_common(25)},
  'observedPaddingDp':{str(k):v for k,v in padding.most_common(15)},
  'observedSizeDp':{str(k):v for k,v in size.most_common(15)},
  'note':'统计自 App 代码中 Dp 字面量(含非间距用途); padding 高频值 10/5/12/4/8 可视为间距档位, 组件间常用 10dp、卡片内 12dp。',
  'evidence':'jadx-src/sources/cn/jianyun/** 中 Dp.m6097constructorimpl(N) 统计'
}
t['radius']['note']='最常见的 Compose RoundedCornerShape: 12dp(149次)、20dp(81次)、10dp(63次)、4dp(62次)。6dp 用于小组件日期格边框(widget_today.xml corners=6dp)。30dp 仅见于三方库 shape, 不纳入 App 令牌。'
json.dump(t,open(p,'w'),ensure_ascii=False,indent=2)
print('patched design-tokens.json spacing')
# verify TypeKt bodyLarge line numbers
TP=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java')
for i,l in enumerate(open(TP,encoding='utf-8').read().splitlines(),1):
    if 'new TextStyle' in l or 'Typography = new Typography' in l or 'remixicon = ' in l:
        print('TypeKt line',i,':',l.strip()[:160])
