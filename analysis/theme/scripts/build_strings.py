import os, re, json, collections
SRC='/Users/hogar/.dsh/ungrouped/jianyun'
OUT=os.path.join(SRC,'analysis/theme')
rows=[]
for line in open(os.path.join(SRC,'work/theme/app_cjk_literals.tsv'),encoding='utf-8'):
    parts=line.rstrip('\n').split('\t')
    if len(parts)<3: continue
    rel=parts[0]; ln=parts[1]; s='\t'.join(parts[2:])
    s=s.replace('\\n','\n').replace('\\"','"').replace('\\t','\t')
    rows.append((rel,int(ln),s))
uniq=collections.OrderedDict()
for rel,ln,s in rows:
    if s not in uniq: uniq[s]=(rel,ln)
print('unique', len(uniq))

def section(rel):
    r=rel
    if r.startswith('cn/jianyun/workplan/main/setting/'): return ('06 设置·我的', '设置子页 (账号/VIP/通知/本地备份/云备份)')
    if r.startswith('cn/jianyun/workplan/main/question/'): return ('06 设置·我的', '常见问题 FAQ')
    if r.startswith('cn/jianyun/workplan/main/'): return ('01 应用入口·启动·主页框架', 'MainActivity/MainView/Splash')
    if r.startswith('cn/jianyun/workplan/widget/'): return ('07 桌面小组件', 'Glance 小组件与配置')
    if r.startswith('cn/jianyun/timetable/'): return ('07 桌面小组件', 'timetable 小组件遗留代码')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/main/'): return ('02 首页·日历·排班', '主页日历与排班操作')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/work/'): return ('03 班次·排班编辑', '班次/组合班次编辑')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/plan/'): return ('03 班次·排班编辑', '周期轮班/排班计划')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/project/'): return ('03 班次·排班编辑', '排班项目')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/config/'): return ('03 班次·排班编辑', '排班/日历显示配置')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/stat/'): return ('04 统计', '统计页')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/alarm/'): return ('05 提醒·闹钟', '班次提醒/系统日历提醒')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/setting/'): return ('06 设置·我的', '排班设置/关于/版本更新')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/share/'): return ('08 导入导出·分享·备份', '分享/导入导出')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/wechat/'): return ('08 导入导出·分享·备份', '微信小程序数据导入')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/cloud/'): return ('08 导入导出·分享·备份', '云备份')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/service/'): return ('08 导入导出·分享·备份', '后台服务')
    if r.startswith('cn/jianyun/workplan/module/schedule/views/'): return ('02 首页·日历·排班', '排班主视图')
    if r.startswith('cn/jianyun/workplan/module/schedule/vm/'): return ('09 业务 ViewModel 提示', '排班相关 VM 的 Toast/对话框文案')
    if r.startswith('cn/jianyun/workplan/module/schedule/'): return ('09 业务 ViewModel 提示', '排班模型/DAO')
    if r.startswith('cn/jianyun/workplan/module/base/views/webdav/'): return ('08 导入导出·分享·备份', 'WebDAV 云盘')
    if r.startswith('cn/jianyun/workplan/module/base/views/cloud/'): return ('08 导入导出·分享·备份', '通用云备份')
    if r.startswith('cn/jianyun/workplan/module/base/'): return ('08 导入导出·分享·备份', '基础组件')
    if r.startswith('cn/jianyun/workplan/ui/component/form/'): return ('10 通用组件文案', '表单/按钮/对话框组件')
    if r.startswith('cn/jianyun/workplan/ui/component/nav/'): return ('10 通用组件文案', '导航/面板/滑动行/头部')
    if r.startswith('cn/jianyun/workplan/ui/component/'): return ('10 通用组件文案', '其他通用组件')
    if r.startswith('cn/jianyun/workplan/ui/android/lunar/'): return ('12 农历·日期', '农历/节日算法内置数据')
    if r.startswith('cn/jianyun/workplan/ui/graph/'): return ('04 统计', '图表组件')
    if r.startswith('cn/jianyun/workplan/util/'): return ('11 工具·选项·提示文案', '工具类与常量表')
    if r.startswith('cn/jianyun/workplan/vm/'): return ('09 业务 ViewModel 提示', '全局 VM 的 Toast/对话框文案')
    if r.startswith('cn/jianyun/workplan/api/') or r.startswith('cn/jianyun/workplan/hilt/') or r.startswith('cn/jianyun/workplan/model/'): return ('09 业务 ViewModel 提示', 'API/依赖注入/模型')
    if r.startswith('cn/jianyun/workplan/plugin/'): return ('11 工具·选项·提示文案', '插件')
    return ('13 其他', '')

groups=collections.OrderedDict()
subs=collections.OrderedDict()
for s,(rel,ln) in uniq.items():
    title,sub=section(rel)
    groups.setdefault(title,[]).append((s,rel,ln))
    subs.setdefault(title,set()).add(sub)
order=sorted(groups.keys())
print('sections:', [(k[0],len(v)) for k,v in sorted(groups.items())])

selp=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java')
seltxt=open(selp,encoding='utf-8').read()
options=[]
for m in re.finditer(r'public static final List<SelectDO> (\w+) = (init\w+)\((.*?)\);', seltxt):
    name, fn, args = m.group(1), m.group(2), m.group(3)
    strs=re.findall(r'"((?:[^"\\]|\\.)*)"', args)
    options.append((name,fn,strs))
print('option lists:', len(options))

def esc_md(s):
    return s.replace('|','\\|').replace('\n',' / ')

lines=[]
A=lines.append
A('# 极简排班 3.5.0 · App 自有中文文案（按界面分组）')
A('')
A('数据来源：jadx 反编译源码中的中文字符串字面量 + decoded/res/values/strings.xml 中 App 自有 string 资源。')
A('')
A('- 全量机器可读清单：strings.zh.full.tsv（2003 条字面量 / 748 条去重，含 file:line）。')
A('- 选项枚举表：copy-options.md（SelectUtil.java 中所有「显示名→存储值」枚举，原型下拉/选择器可直接使用）。')
A('- 广告 SDK 文案（beizi_/tt_/tianmu_/adgain_/ms_ 前缀）已按资源前缀排除；App 自有 string 资源只有 app_name/day/month/year 4 条（见第 14 节）。')
A('')
A('> 说明：Compose 界面的文案大量硬编码在 Kotlin 中，字符串资源并非主来源；因此以反编译字面量为准。同一文案可能在多个 Lambda/ComposableSingletons 文件中重复出现，此处按首次出现去重并保留证据行号。')
A('')
for title in order:
    items=groups[title]
    A('## %s（%d 条）'%(title,len(items)))
    A('')
    sublist=[x for x in subs[title] if x]
    if sublist: A('_'+'；'.join(sorted(sublist))+'_'); A('')
    byfile=collections.OrderedDict()
    for s,rel,ln in items:
        byfile.setdefault(rel,[]).append((s,ln))
    for rel,lst in byfile.items():
        A('### %s'%rel)
        A('')
        A('| 文案 | 证据 |')
        A('|---|---|')
        for s,ln in lst:
            A('| %s | %s:%d |'%(esc_md(s), rel, ln))
        A('')
A('## 14 资源 strings.xml 中的 App 自有文案')
A('')
A('筛选方法：decoded/res/values/strings.xml 共 455 条，其中 217 条含中文；带广告 SDK 前缀（tt_/tianmu_/adgain_/beizi_/ms_/abc_ 等）的均属三方库。真正属于 App 的中文条目仅以下 4 条（其余 App 文案在 Kotlin 代码里）：')
A('')
A('| name | value | 证据 |')
A('|---|---|---|')
for name,val in [('app_name','极简排班'),('day','日'),('month','月'),('year','年')]:
    A('| %s | %s | decoded/res/values/strings.xml |'%(name,val))
A('')
A('values-zh-rCN/strings.xml（168 条）是 Material/AndroidX 中文翻译，未被 App 自有 UI 使用（App 为 Compose + 自绘组件）。')
A('')
A('## 15 枚举/选项文案（SelectUtil.java 常量表）')
A('')
A('完整机器可读版本见 copy-options.md。以下为摘要（每个 List 的显示名序列）：')
A('')
A('| 常量 | 函数 | 条数 | 显示名(存储值) | 证据 |')
A('|---|---|---|---|---|')
for name,fn,strs in options:
    if fn=='initValues':
        pairs=list(zip(strs[0::2],strs[1::2]))
        disp=' / '.join('%s(%s)'%(a,b) for a,b in pairs)
    elif fn=='initValuesAndColor':
        trips=list(zip(strs[0::3],strs[1::3],strs[2::3]))
        disp=' / '.join('%s(%s,%s)'%(a,b,c) for a,b,c in trips)
    else:
        disp=' / '.join(strs)
    A('| %s | %s | %d | %s | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |'%(name,fn,len(strs),esc_md(disp)[:400]))
A('')
open(os.path.join(OUT,'strings.zh.md'),'w').write('\n'.join(lines)+'\n')
print('strings.zh.md lines',len(lines))

with open(os.path.join(OUT,'strings.zh.full.tsv'),'w') as f:
    f.write('text\tfile\tline\n')
    for s,(rel,ln) in uniq.items():
        f.write(s.replace('\t',' ')+'\t'+rel+'\t'+str(ln)+'\n')
print('strings full tsv', len(uniq))

ol=[]
O=ol.append
O('# 极简排班 3.5.0 · 枚举/选项文案速查（SelectUtil.java）')
O('')
O('来源：jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java。格式：显示名 → 存储值（App 内部 code）。原型下拉/选择器/分段控件可直接复用。')
O('')
for name,fn,strs in options:
    O('## %s'%name)
    O('')
    if fn=='initValues':
        O('| 显示名 | 存储值 |')
        O('|---|---|')
        for a,b in zip(strs[0::2],strs[1::2]): O('| %s | %s |'%(a,b))
    elif fn=='initValuesAndColor':
        O('| 显示名 | 存储值 | 颜色 |')
        O('|---|---|---|')
        for a,b,c in zip(strs[0::3],strs[1::3],strs[2::3]): O('| %s | %s | %s |'%(a,b,c))
    elif fn=='initSingleValues':
        O('值：'+' / '.join(strs))
    elif fn=='initWithUnit':
        O('前缀=%r 单位=%r 值=%s'%(strs[0] if strs else '', strs[1] if len(strs)>1 else '', ', '.join(strs[2:])))
    else:
        O('值：'+', '.join(strs))
    O('')
open(os.path.join(OUT,'copy-options.md'),'w').write('\n'.join(ol)+'\n')
print('copy-options.md written, lists:', len(options))
