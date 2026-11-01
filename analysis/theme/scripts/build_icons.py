import re, os, json, shutil
from fontTools.ttLib import TTFont

SRC='/Users/hogar/.dsh/ungrouped/jianyun'
OUT=os.path.join(SRC,'assets_extracted')
os.makedirs(os.path.join(OUT,'fonts'), exist_ok=True)

# 1. copy font
shutil.copyfile(os.path.join(SRC,'decoded/res/font/remixicon.ttf'), os.path.join(OUT,'fonts','remixicon.ttf'))

# 2. parse IconFont.java
p=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/ui/component/nav/IconFont.java')
txt=open(p,encoding='utf-8').read()
consts={}
for m in re.finditer(r'public static final int (\w+) = (\d+);', txt):
    consts[m.group(1)]=int(m.group(2))
print('IconFont constants:', len(consts))

# 3. cmap
tt=TTFont(os.path.join(OUT,'fonts','remixicon.ttf'))
cmap={}
for table in tt['cmap'].tables:
    if table.isUnicode():
        cmap.update(table.cmap)
print('cmap size:', len(cmap), 'tables:', [ (t.platformID,t.platEncID,t.format) for t in tt['cmap'].tables])
glyphs=tt.getGlyphOrder()
glyphmap={}  # codepoint -> glyph name
for cp,gn in cmap.items():
    glyphmap[cp]=gn
# reverse: glyph name -> cp
name2cp={v:k for k,v in cmap.items()}

# 4. cross-check IconFont list
present=[]; missing=[]
for name,cp in sorted(consts.items()):
    if cp in cmap:
        present.append((name,cp,cmap[cp]))
    else:
        missing.append((name,cp))
print('present:', len(present), 'missing:', len(missing))
print('missing list:', [(n,hex(cp)) for n,cp in missing])

# 5. codepoints in font not in IconFont
used=set(consts.values())
extra=[(hex(cp), gn, name2cp.get(cp)) for cp,gn in sorted(cmap.items()) if cp not in used]
print('cmap codepoints not referenced by IconFont:', len(extra))
for e in extra[:30]:
    print('  extra:', e)

# 6. glyph names for present icons
rows=[]
for name,cp,gn in present:
    rows.append({'name':name,'codepoint':cp,'hex':'%04X'%cp,'css':'\\%04x'%cp,'glyphName':gn,'unicode':'\\u%04x'%cp})

# 7. write icon-map.json
icon_map={
  'family':'remixicon',
  'fontFile':'fonts/remixicon.ttf',
  'fontVersion':'Remix Icon v4.3 (subset)',
  'source':{
    'font':SRC+'/decoded/res/font/remixicon.ttf',
    'codepointDefinitions':'jadx-src/sources/cn/jianyun/workplan/ui/component/nav/IconFont.java',
    'kotlinFamily':'cn.jianyun.workplan.ui.theme.TypeKt#remixicon'
  },
  'count':len(consts),
  'glyphsPresent':len(present),
  'glyphsMissing':[{'name':n,'codepoint':cp,'hex':'%04X'%cp} for n,cp in missing],
  'icons':{name:{'codepoint':cp,'hex':'%04X'%cp,'glyphName':gn} for name,cp,gn in present},
  'fontCodepointsNotInIconFont':[{'codepoint':'%04X'%cp,'glyphName':gn} for cp,gn in sorted(cmap.items()) if cp not in used]
}
json.dump(icon_map, open(os.path.join(OUT,'fonts','icon-map.json'),'w'), ensure_ascii=False, indent=2)

# 8. write icon-font.css
css=[]
css.append('/* Remix Icon subset extracted from cn.jianyun.workplan 3.5.0')
css.append(' * font: decoded/res/font/remixicon.ttf (Remix Icon v4.3 subset, %d glyphs)' % len(cmap))
css.append(' * codepoints: IconFont.java (cn.jianyun.workplan.ui.component.nav) */')
css.append('@font-face {')
css.append('  font-family: "remixicon";')
css.append('  src: url("./remixicon.ttf") format("truetype");')
css.append('  font-weight: normal;')
css.append('  font-style: normal;')
css.append('  font-display: block;')
css.append('}')
css.append('.ri { font-family: "remixicon" !important; font-style: normal; -webkit-font-smoothing: antialiased; }')
css.append('')
for r in rows:
    css.append('.ri-%s::before { content: "\\%04x"; } /* U+%04X %s */' % (r['name'], r['codepoint'], r['codepoint'], r['glyphName']))
open(os.path.join(OUT,'fonts','icon-font.css'),'w').write('\n'.join(css)+'\n')

# 9. write a small html demo? (optional, useful for lead's prototype) - yes, icon-sheet.html
html=['<!doctype html><meta charset="utf-8"><link rel="stylesheet" href="./icon-font.css"><title>极简排班 Remix Icon subset</title>',
'<style>body{font-family:-apple-system,sans-serif;padding:24px;background:#fff;color:#111}h1{font-size:18px}',
'.grid{display:grid;grid-template-columns:repeat(auto-fill,minmax(120px,1fr));gap:8px}.cell{border:1px solid #eee;border-radius:8px;padding:8px;text-align:center;font-size:11px;color:#555}',
'.glyph{font-family:remixicon;font-size:28px;color:#55BB8A;line-height:1.4}</style>',
'<h1>极简排班 · Remix Icon 子集（%d 个）</h1><div class="grid">'%len(present)]
for r in rows:
    html.append('<div class="cell"><div class="glyph">&#x%04x;</div><div>.ri-%s</div><div>U+%04X</div></div>' % (r['codepoint'], r['name'], r['codepoint']))
html.append('</div>')
open(os.path.join(OUT,'fonts','icon-sheet.html'),'w').write('\n'.join(html))

print('wrote assets_extracted/fonts/{remixicon.ttf,icon-map.json,icon-font.css,icon-sheet.html}')
