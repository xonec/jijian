#!/usr/bin/env python3
import json, os, glob
BASE='/Users/hogar/.dsh/ungrouped/jianyun/analysis/rea'
JADX='/Users/hogar/.dsh/ungrouped/jianyun/jadx-src/sources'
Q=chr(96)
SM=set(os.path.basename(p)[:-6] for p in glob.glob(os.path.join(BASE,'source-smali','*.smali')))
PART=set(os.path.basename(p)[:-5] for p in glob.glob(os.path.join(BASE,'source-partial','*.java')))
JAVA=set(os.path.basename(p)[:-5] for p in glob.glob(os.path.join(BASE,'source','*.java')))
def warn_count(path):
    t=open(path,encoding='utf-8',errors='replace').read()
    return t.count('Code decompiled incorrectly')+t.count('Failed to decompile')+t.count('JADX WARN')
jadx_dir=os.path.join(JADX,'cn','jianyun'); jadx_warn={}
for p in glob.glob(os.path.join(jadx_dir,'**','*.java'), recursive=True):
    rel=p[len(jadx_dir)+1:-5].replace('/','.')
    w=warn_count(p)
    if w: jadx_warn['cn.jianyun.'+rel]=w
rea_warn=dict((cls, warn_count(os.path.join(BASE,'source',cls+'.java'))) for cls in JAVA)
rea_warn=dict((k,v) for k,v in rea_warn.items() if v>0)
recovered=sorted(set(jadx_warn)-set(rea_warn)-SM)
L=[]
L.append('# 反编译质量对比（REA/JADX vs 之前 jadx 批量输出）'); L.append('')
L.append('> 统计 Code decompiled incorrectly / Failed to decompile / JADX WARN 标记，并区分真实 Java / partial Java / smali 回退。'); L.append('')
L.append('| 项 | 数值 |'); L.append('|---|---|')
L.append('| REA 提取的**真实 Java 源码**（顶层类） | '+str(len(JAVA))+' |')
L.append('| 其中仍带反编译告警的类 | '+str(len(rea_warn))+' |')
L.append('| **smali 回退类**（Java 反编译完全失败，源码在 source-smali/） | '+str(len(SM))+' |')
L.append('| 对应 partial Java（带反编译桩，供阅读，source-partial/） | '+str(len(PART))+' |')
L.append('| 旧 jadx-src 中带告警的类 | '+str(len(jadx_warn))+' |')
L.append('| **旧 jadx 有告警、REA 得到干净 Java 的类** | '+str(len(recovered))+' |'); L.append('')
if recovered:
    L.append('## 恢复列表（旧 jadx 有告警、REA 得到干净 Java）'); L.append('')
    for c in recovered: L.append('- '+Q+c+Q)
    L.append('')
    open(os.path.join(BASE,'quality-recovered.txt'),'w').write('\n'.join(recovered)+'\n')
if SM:
    L.append('## smali 回退类（源码在 source-smali/，同类 partial Java 在 source-partial/）'); L.append('')
    for c in sorted(SM): L.append('- '+Q+c+Q)
    L.append('')
    open(os.path.join(BASE,'quality-smali-fallback.txt'),'w').write('\n'.join(sorted(SM))+'\n')
open(os.path.join(BASE,'DECOMPILE-QUALITY.md'),'w').write('\n'.join(L)+'\n')
print(json.dumps({'java':len(JAVA),'smali':len(SM),'partial':len(PART),'rea_warn':len(rea_warn),'jadx_warn':len(jadx_warn),'recovered':len(recovered)}, ensure_ascii=False))
