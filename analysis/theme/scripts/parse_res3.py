import json, collections
lines=open('/tmp/res.txt',encoding='utf-8',errors='replace').read().splitlines()
cur_type=None; rows=[]
for line in lines:
    s=line.strip()
    if line.startswith('  type ') and ' entryCount=' in line:
        cur_type=line.split()[1]
        continue
    if line.startswith('    resource 0x'):
        parts=s.split()
        rows.append({'id':parts[1],'type':cur_type,'name':parts[2],'files':[]})
        continue
    if ' (file) ' in line and rows:
        # e.g. "      () (file) res/zu.png type=PNG" or "      (xxhdpi) (file) res/SJ.png type=PNG"
        pre, rest = line.split(' (file) ',1)
        cfg = pre.strip().strip('()').strip()
        toks = rest.split()
        fname = toks[0]
        kind = toks[2] if len(toks)>2 and toks[1].startswith('type=') else (toks[1][5:] if len(toks)>1 and toks[1].startswith('type=') else '')
        rows[-1]['files'].append({'config': cfg or 'default','file': fname,'kind': kind})
print('rows',len(rows),'with files',sum(1 for r in rows if r['files']))
with open('/Users/hogar/.dsh/ungrouped/jianyun/work/theme/all-resources.tsv','w') as f:
    f.write('id' + '\t' + 'type' + '\t' + 'name' + '\t' + 'config' + '\t' + 'rawfile' + '\t' + 'kind' + '\n')
    for r in rows:
        if not r['files']:
            f.write('\t'.join([r['id'],r['type'],r['name'],'','',''])+'\n')
        for fl in r['files']:
            f.write('\t'.join([r['id'],r['type'],r['name'],fl['config'],fl['file'],fl['kind']])+'\n')
want=['drawable/logo','drawable/minilogo','drawable/quick','drawable/widget_today','drawable/widget_otherday','drawable/splash_background','drawable/hjyt_icon','drawable/close','drawable/card_view_33efefef_bg','drawable/card_view_black_bg','drawable/circle_solid_main','mipmap/ic_launcher','mipmap/ic_launcher_round','mipmap/cloud','mipmap/jgy','mipmap/koofr','mipmap/logo','font/remixicon','xml/app_widget','layout/main','layout/view_gregorian_lunar_calendar','layout/widget_circle_pie_legends','layout/widget_default_pie_legends']
for r in rows:
    if r['name'] in want:
        print(r['name'], r['id'], r['files'])
