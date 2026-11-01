import re, os
p='/Users/hogar/.dsh/ungrouped/jianyun/work/theme/build_strings.py'
src=open(p,encoding='utf-8').read()
src=src.replace("""groups=collections.OrderedDict()
for s,(rel,ln) in uniq.items():
    sec=section(rel); groups.setdefault(sec,[]).append((s,rel,ln))
order=sorted(groups.keys())""","""groups=collections.OrderedDict()
subs=collections.OrderedDict()
for s,(rel,ln) in uniq.items():
    title,sub=section(rel)
    groups.setdefault(title,[]).append((s,rel,ln))
    subs.setdefault(title,set()).add(sub)
order=sorted(groups.keys())""")
src=src.replace("""for sec in order:
    title, sub = sec
    items=groups[sec]
    A('## %s（%d 条）'%(title,len(items)))
    A('')
    if sub: A('_%s_'%sub); A('')""","""for title in order:
    items=groups[title]
    A('## %s（%d 条）'%(title,len(items)))
    A('')
    sublist=[x for x in subs[title] if x]
    if sublist: A('_'+'；'.join(sorted(sublist))+'_'); A('')""")
open(p,'w',encoding='utf-8').write(src)
print('patched build_strings.py')
