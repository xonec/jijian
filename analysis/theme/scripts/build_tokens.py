import os, re, json, collections, struct
SRC='/Users/hogar/.dsh/ungrouped/jianyun'
OUT=os.path.join(SRC,'analysis/theme')
os.makedirs(OUT, exist_ok=True)
APP=os.path.join(SRC,'jadx-src/sources/cn/jianyun')

# ---------- helpers ----------
rows=[]
for line in open(os.path.join(SRC,'work/theme/all-resources.tsv'),encoding='utf-8'):
    parts=line.rstrip('\n').split('\t')
    if not parts or parts[0]=='id': continue
    while len(parts)<6: parts.append('')
    rows.append(dict(zip(['id','type','name','config','raw','kind'],parts)))

APP_TYPES = {'string','drawable','mipmap','layout','xml','font','color','style','array','attr','id','raw'}
appset=set()
appset |= {'drawable/'+x for x in ['logo','minilogo','quick','splash_background','widget_today','widget_otherday']}
appset |= {'mipmap/'+x for x in ['ic_launcher','ic_launcher_round','cloud','jgy','koofr']}
appset |= {'layout/'+x for x in ['main','view_gregorian_lunar_calendar','widget_circle_pie_legends','widget_default_pie_legends']}
appset |= {'xml/'+x for x in ['app_widget','network_security_config','backup_rules','data_extraction_rules']}
appset |= {'font/remixicon','color/screen','string/app_name','string/day','string/month','string/year'}
appset |= {'style/Theme.App.Starting','style/Theme.Subject_segmentation_compose','style/Glance.AppWidget.Background'}
appset |= {'array/'+x for x in ['npv_lunar_day_with_measure_hint','npv_lunar_month_without_measure_hint','npv_lunar_year_without_measure_hint']}
appset |= {'raw/glance_appwidget_keep'}
# ids in app layouts
for i in ['container','ads1','ads2','view_tag','tv_desc','picker_year','picker_month','picker_day']:
    appset.add('id/'+i)
# npv attrs
npvattrs=[r['name'] for r in rows if r['type']=='attr' and r['name'].split('/')[1].startswith('npv_')]
appset |= set(npvattrs)

def decode_path(r):
    if not r['raw']: return ''
    ext=r['raw'].rsplit('.',1)[-1]
    cfg=('-' + r['config']) if r['config'] and r['config'] not in ('default','') else ''
    t=r['type']
    p=os.path.join(SRC,'decoded/res',t+cfg,r['name'].split('/',1)[1]+'.'+ext)
    return os.path.relpath(p, SRC) if os.path.exists(p) else ''

# ---------- resource-map.tsv ----------
lines=['resource_id\ttype\tresource_name\tconfig\tobfuscated_apk_path\tdecoded_path\townership\tnote']
for r in rows:
    own='app' if r['name'] in appset else 'thirdparty/unknown'
    dp=decode_path(r)
    lines.append('\t'.join([r['id'],r['type'],r['name'],r['config'] or 'default',r['raw'] or '',dp,own,'']))
open(os.path.join(OUT,'resource-map.tsv'),'w').write('\n'.join(lines)+'\n')
# full table (same, but also a copy for analysis)
open(os.path.join(OUT,'resource-table-full.tsv'),'w').write('\n'.join(lines)+'\n')
print('resource-map rows:',len(rows),'app-owned:',sum(1 for r in rows if r['name'] in appset))

# ---------- ColorKt ----------
p=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java')
clines=open(p,encoding='utf-8').read().splitlines()
ck={}
for i,l in enumerate(clines,1):
    m=re.search(r'(?:private|public) static (?:final )?long (\w+) = androidx\.compose\.ui\.graphics\.ColorKt\.Color\((\d+)L?\);', l)
    if m:
        v=int(m.group(2)); ck[m.group(1)]={'value':'#%08X'%(v & 0xFFFFFFFF),'argb_int':v,'evidence':'jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java:%d'%i}
print('colors:',len(ck))

# usage counts of ColorKt getters in app code
usage=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'ColorKt\.get(\w+)\(\)', txt):
            usage[m.group(1)]+=1
for k in ck:
    ck[k]['usageCount']=usage.get(k,0)

# ---------- typography ----------
TOK=os.path.join(SRC,'jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java')
tok=open(TOK,encoding='utf-8').read()
bodyLarge_ev = 'jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java:32-34 (bodyLarge = TextStyle(fontSize=16sp, fontWeight=Normal, fontFamily=FontFamily.Default, letterSpacing=0.5sp, lineHeight=24sp))'
# observed sp distribution recompute
fsize=collections.Counter(); fweight=collections.Counter(); radius=collections.Counter()
for dirpath,_,files in os.walk(APP):
    for fn in files:
        if not fn.endswith('.java'): continue
        txt=open(os.path.join(dirpath,fn),encoding='utf-8',errors='ignore').read()
        for m in re.finditer(r'TextUnitKt\.getSp\((\d+(?:\.\d+)?)d?\)', txt): fsize[float(m.group(1))]+=1
        for m in re.finditer(r'FontWeight\.INSTANCE\.get(\w+)\(\)', txt): fweight[m.group(1)]+=1
        for m in re.finditer(r'RoundedCornerShape0680j_4\(Dp\.m6097constructorimpl\((\d+(?:\.\d+)?)\)\)', txt): radius[float(m.group(1))]+=1

# ---------- palette ----------
pal=json.load(open(os.path.join(SRC,'decoded/assets/data/color.json'),encoding='utf-8'))
cats=collections.OrderedDict()
for x in pal: cats.setdefault(x['catalog'],[]).append(x)
palette_groups=[]
names={0:'红/粉 色系',1:'橙 色系',2:'黄 色系',3:'绿 色系',4:'青/靛 色系',5:'蓝 色系',6:'紫 色系',7:'灰/褐 色系'}
for k,v in cats.items():
    palette_groups.append({'catalog':k,'approxName':names.get(k,''),'count':len(v),'colors':v})
print('palette groups', [(g['catalog'],g['count']) for g in palette_groups])

# ---------- tokens json ----------
tokens={
  '_meta':{
    'app':{'name':'极简排班','package':'cn.jianyun.workplan','versionName':'3.5.0','versionCode':36,'minSdk':26,'targetSdk':33},
    'generatedAt':'2026-10-27',
    'sources':[
      'jadx-src/sources/cn/jianyun/workplan/ui/theme/ColorKt.java',
      'jadx-src/sources/cn/jianyun/workplan/ui/theme/ThemeKt.java',
      'jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java',
      'jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java',
      'jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java',
      'decoded/res/values/colors.xml','decoded/res/values/styles.xml','decoded/res/values-night/colors.xml',
      'decoded/assets/data/color.json',
      'jadx-src/sources/cn/jianyun/workplan/ui/component/nav/IconFont.java',
      'decoded/res/font/remixicon.ttf'
    ],
    'method':'反编译 Kotlin/Compose 源码 + apktool 解码资源 + aapt2 资源表(/tmp/res.txt) 交叉核对; 每项附 evidence 路径:行号; 标注 inferred 的为推断。',
    'notes':[
      'Compose Material3 调色板在 Kotlin (ColorKt/ThemeKt) 中, 不在 res/values/colors.xml; res 颜色仅 splash 背景等少量 App 自有色。',
      '主题色可变性: ColorKt 的 Light*/Dark* 字段是 Kotlin var (有 setter), 但反编译代码中未发现 setter 调用方 (见 evidence.negativeFindings)。App 唯一强调色为 ThemeColor #55BB8A (麦苗绿), 大量组件直接引用 ColorKt.getThemeColor()。',
      '230 个中国色预设 (assets/data/color.json) 用于班次颜色/小组件颜色选择器 (ShowColorPickerView), 不是 App 整体换肤。'
    ]
  },
  'colors':{
    'brand':{
      'theme':{'value':ck['ThemeColor']['value'],'usage':'App 强调色/选中态/按钮/图标/小组件标题栏默认色','source':'ColorKt.ThemeColor','alias':'麦苗绿 (assets/data/color.json catalog=3)','evidence':ck['ThemeColor']['evidence']},
      'primaryAction':{'value':ck['PrimaryColor']['value'],'usage':'补贴/次要强调(蓝)','source':'ColorKt.PrimaryColor','evidence':ck['PrimaryColor']['evidence']}
    },
    'semantic':{
      'delete':{'value':ck['DeleteColor']['value'],'usage':'删除/扣款/错误','source':'ColorKt.DeleteColor','evidence':ck['DeleteColor']['evidence']},
      'important':{'value':ck['ImportantColor']['value'],'usage':'重要提醒(茶花红)','source':'ColorKt.ImportantColor','evidence':ck['ImportantColor']['evidence']},
      'vip':{'value':ck['VipColor']['value'],'usage':'会员/VIP 金色','source':'ColorKt.VipColor','evidence':ck['VipColor']['evidence']},
      'private':{'value':ck['PrivateColor']['value'],'usage':'私密/加密(紫)','source':'ColorKt.PrivateColor','evidence':ck['PrivateColor']['evidence']}
    },
    'lightScheme':{
      'background':{'value':ck['LightBgColor']['value'],'source':'ColorKt.LightBgColor','evidence':ck['LightBgColor']['evidence']},
      'surface':{'value':ck['LightBg0Color']['value'],'source':'ColorKt.LightBg0Color','evidence':ck['LightBg0Color']['evidence']},
      'surfaceVariant':{'value':ck['LightSelectColor']['value'],'source':'ColorKt.LightSelectColor','evidence':ck['LightSelectColor']['evidence']},
      'textPrimary':{'value':ck['LightPrimaryColor']['value'],'source':'ColorKt.LightPrimaryColor (mutable var, 运行时默认 #FF000000)','evidence':ck['LightPrimaryColor']['evidence']},
      'textSecondary':{'value':ck['LightSecondColor']['value'],'source':'ColorKt.LightSecondColor','evidence':ck['LightSecondColor']['evidence']},
      'textTertiary':{'value':ck['LightThirdColor']['value'],'source':'ColorKt.LightThirdColor','evidence':ck['LightThirdColor']['evidence']},
      'divider':{'value':'#FFE5E5E5','source':'decoded/res/values/colors.xml colorDivider','evidence':'decoded/res/values/colors.xml (colorDivider)','inferred':False},
      'splashBackground':{'value':'#FFFFFFFF','source':'decoded/res/values/colors.xml color/screen','evidence':'decoded/res/values/colors.xml:170'},
      'widgetLegendText':{'value':'#FF767676','source':'decoded/res/layout/widget_circle_pie_legends.xml android:textColor','evidence':'decoded/res/layout/widget_circle_pie_legends.xml'}
    },
    'darkScheme':{
      'background':{'value':ck['DarkBg0Color']['value'],'source':'ColorKt.DarkBg0Color','evidence':ck['DarkBg0Color']['evidence']},
      'surface':{'value':ck['DarkBgColor']['value'],'source':'ColorKt.DarkBgColor','evidence':ck['DarkBgColor']['evidence']},
      'surfaceVariant':{'value':ck['DarkSelectColor']['value'],'source':'ColorKt.DarkSelectColor','evidence':ck['DarkSelectColor']['evidence']},
      'textPrimary':{'value':ck['DarkPrimaryColor']['value'],'source':'ColorKt.DarkPrimaryColor (mutable var)','evidence':ck['DarkPrimaryColor']['evidence']},
      'textSecondary':{'value':ck['DarkSecondColor']['value'],'source':'ColorKt.DarkSecondColor','evidence':ck['DarkSecondColor']['evidence']},
      'textTertiary':{'value':ck['DarkThirdColor']['value'],'source':'ColorKt.DarkThirdColor','evidence':ck['DarkThirdColor']['evidence']},
      'splashBackground':{'value':'#FF111111','source':'decoded/res/values-night/colors.xml color/screen','evidence':'decoded/res/values-night/colors.xml:30'}
    },
    'material3Mapping':{
      'note':'ThemeKt 用 lightColorScheme/darkColorScheme 覆盖以下槽位 (位置参数语义), 其余为 Material3 默认值; 文本色被映射到 primary/secondary/tertiary 槽 (代码中 getPrimary 399次/getTertiary 195次/getSurface 714次)。',
      'light':{'primary':'LightPrimaryColor (#FF000000)','secondary':'LightSecondColor (#FF222222)','tertiary':'LightThirdColor (#FF999999)','background':'LightBgColor (#FFF6F5F4)','onBackground':'LightPrimaryColor (#FF000000)','surface':'LightBg0Color (#FFFDFDFD)','surfaceVariant':'LightSelectColor (#FFEEEEEE)','error':'LightDeleteColor (#FFF87679)','onSurface':'Material3 默认 #FF1C1B1F (推断)','evidence':'jadx-src/sources/cn/jianyun/workplan/ui/theme/ThemeKt.java:41'},
      'dark':{'primary':'DarkPrimaryColor (#FFFFFFFF)','secondary':'DarkSecondColor (#FFDDDDDD)','tertiary':'DarkThirdColor (#FF888888)','background':'DarkBg0Color (#FF111111)','surface':'DarkBgColor (#FF191919)','surfaceVariant':'DarkSelectColor (#FF222222)','error':'DarkDeleteColor (#FFF87679)','onSurface':'Material3 默认 #FFE6E1E5 (推断)','evidence':'jadx-src/sources/cn/jianyun/workplan/ui/theme/ThemeKt.java:40'}
    },
    'tagColors':{
      'note':'排班/记账项默认标签配色 (SelectUtil.DEFAULT_TYPES: 打卡/补贴/扣款)',
      'sign':{'value':'#FF776AD4','name':'打卡','evidence':'jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27'},
      'award':{'value':'#FF1974E8','name':'补贴','evidence':'jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27'},
      'fine':{'value':'#FFF87679','name':'扣款','evidence':'jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java:27'}
    },
    'widgetDefaults':{
      'note':'桌面小组件 WidgetConfig 默认值 (亮/暗色独立配置)',
      'light':{'headerBg':'#FF55BB8A','headerTextColor':'#FFFFFFFF','bgColor':'#FFFFFFFF','textColor':'#FF111111','tintColor':'#FF111111','markColor':'#FF111111','headerOpacity':1.0,'opacity':1.0,'evidence':'jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java:341'},
      'dark':{'headerBg':'#FF22352D','headerTextColor':'#FFFFFFFF','bgColor':'#FF141414','textColor':'#FFF5F5F5','tintColor':'#FFD8D8D8','markColor':'#FFD8D8D8','evidence':'jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java:341'},
      'todayBorder':{'value':'#FFEE4863','usage':'widget_today.xml 2dp stroke / radius 6dp','evidence':'decoded/res/drawable/widget_today.xml'},
      'legendText':{'value':'#FF767676','evidence':'decoded/res/layout/widget_default_pie_legends.xml'},
      'fontSizes':{'dateFontSize':'17','workFontSize':'11','timeFontSize':'11','evidence':'jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java:341'},
      'toggles':{'mondayFirst':True,'showLunar':True,'showFestival':True,'showRemark':False,'showBeginTime':False,'showEndTime':False,'showLine':False,'evidence':'jadx-src/sources/cn/jianyun/workplan/widget/WidgetConfig.java:341'},
      'layoutDp':{'minWidth':320,'minHeight':180,'updatePeriodMillis':1800000,'resizeMode':'horizontal|vertical','evidence':'decoded/res/xml/app_widget.xml'}
    },
    'widgetPreviewSampled':{
      'note':'从 APK 内置小组件预览图 assets_extracted/widget/quick.png 采样(图像有压缩噪点, 仅供对照; 代码默认值以上方 widgetDefaults 为准)',
      'headerApprox':'#FF4AB380','blueChipApprox':'#FF1A67AC','purpleChipApprox':'#FF5A5893','body':'#FFFFFFFF','evidence':'decoded/res/drawable/quick.png (452x466)',
      'nearestChineseColors':{'header':'麦苗绿 #55BB8A / 蛙绿 #45B787','blueChip':'靛青 #1661AB','purpleChip':'野菊紫 #525288 / 山梗紫 #61649F'}
    },
    'chinesePalette':{
      'source':'decoded/assets/data/color.json',
      'copiedTo':'assets_extracted/palette/color.json',
      'count':len(pal),
      'groups':palette_groups,
      'evidence':'decoded/assets/data/color.json; FormItemKt.java ShowColorPickerView 读取 assets/data/color.json'
    },
    'others':{
      'colorPrimaryRes':{'value':'#FF000000','evidence':'decoded/res/values/colors.xml colorPrimary'},
      'colorAccentRes':{'value':'#FFD81B60','evidence':'decoded/res/values/colors.xml colorAccent'},
      'viewDividerBg':{'value':'#FFE8E9EB','evidence':'decoded/res/values/colors.xml view_divider_bg'},
      'warningColor':{'value':'#FFF4511E','evidence':'decoded/res/values/colors.xml warning_color'},
      'successColor':{'value':'#FF009688','evidence':'decoded/res/values/colors.xml success_color'}
    }
  },
  'typography':{
    'fontFamily':{'ui':'系统默认字体 (FontFamily.Default)','evidence':'jadx-src/sources/cn/jianyun/workplan/ui/theme/TypeKt.java:35','icon':'remixicon'},
    'material3Overrides':{
      'bodyLarge':{'fontSize':'16sp','fontWeight':'Normal(400)','lineHeight':'24sp','letterSpacing':'0.5sp','evidence':bodyLarge_ev}
    },
    'observedFontSizesSp':{str(k):v for k,v in fsize.most_common(20)},
    'observedFontWeights':dict(fweight.most_common()),
    'note':'字号分布来自 App 代码中 TextUnitKt.getSp(N) 的字面量统计; 12/13/15sp 为最常用正文尺寸, 20sp 常用于标题。',
    'widgetTextSizes':{'date':'17sp','work':'11sp','time':'11sp','source':'WidgetConfig.dateFontSize/workFontSize/timeFontSize 默认值'}
  },
  'radius':{
    'observedDp':{str(k):v for k,v in radius.most_common()},
    'tokens':{'xs':4,'sm':6,'md':10,'lg':12,'xl':20,'pill':30},
    'note':'最常见的 Compose RoundedCornerShape: 12dp(149次)、20dp(81次)、10dp(63次)、4dp(62次)。6dp 用于小组件日期格边框(widget_today.xml corners)。30dp 见于 AppCompat 形状(card_view_*)为三方库资源。',
    'evidence':'统计自 jadx-src/sources/cn/jianyun/** 中 RoundedCornerShape0680j_4(Dp...) 字面量'
  },
  'spacing':{
    'unit':4,
    'scale':[2,4,6,8,10,12,15,16,20,24,30,40,50,60,80],
    'observedDp':{str(k):v for k,v in fsize.most_common(0)} if False else {'note':'该维度从同一正则统计中混入 Dp 与 sp, 仅作量级参考'},
    'evidence':'App 代码中 Dp 字面量统计(见 design-tokens.md 表)'
  },
  'shadows':{
    'note':'未发现自定义 shadow/elevation 常量; 使用 Material3 默认 elevation。小组件使用 RemoteViews 形状背景(圆角、描边), 阴影由启动器决定。'
  },
  'fonts':[
    {'name':'system','file':None,'usage':'全部文本','evidence':'TypeKt.java:35 FontFamily.Default'},
    {'name':'remixicon','file':'assets_extracted/fonts/remixicon.ttf','css':'assets_extracted/fonts/icon-font.css','map':'assets_extracted/fonts/icon-map.json','version':'Remix Icon v4.3 subset (87 codepoints)','usage':'全部图标 (IconView)','evidence':'TypeKt.java:37 R.font.remixicon; decoded/res/font/remixicon.ttf'}
  ],
  'icons':{
    'family':'remixicon',
    'constantsCount':79,
    'uniqueCodepoints':87,
    'source':'jadx-src/sources/cn/jianyun/workplan/ui/component/nav/IconFont.java',
    'css':'assets_extracted/fonts/icon-font.css',
    'map':'assets_extracted/fonts/icon-map.json',
    'sheet':'assets_extracted/fonts/icon-sheet.html',
    'aliases':{'apps':'catalog (同码点 0xEA42)','box_none':'product (同码点 0xF3A7)','list':'list_indefinite (同码点 0xF379)'},
    'notInIconFontButInFont':['U+EA0F add-box-line','U+EA48 archive-line','U+EB7F checkbox-blank-line','U+EB9F cloud-off-line','U+EF76 more-2-fill','U+F009 play-circle-line','U+F011 play-list-line','U+F3A1 prohibited-line','U+F3A9 inbox-2-line','U+F40B flower-line','U+F4DF function-add-line']
  },
  'assets':{
    'root':'assets_extracted/',
    'referenceConvention':'原型位于 prototype/ 目录时引用../assets_extracted/<category>/<file>; 位于仓库根时引用 assets_extracted/<category>/<file>',
    'appIcon':'assets_extracted/app-icon/','widget':'assets_extracted/widget/','cloud':'assets_extracted/cloud/','layouts':'assets_extracted/layouts/','palette':'assets_extracted/palette/color.json','fonts':'assets_extracted/fonts/','manifest':'assets_extracted/manifest.md'
  },
  'evidence':{
    'negativeFindings':[
      'ColorKt 的 8 个 setter(m69xxsetLight/Dark*) 在 jadx-src 全工程中无调用方 — 推断: 3.5.0 中主题强调色固定为 ThemeColor, 运行时改主题色能力未接线/为遗留代码。',
      'res/values/colors.xml 中无 App 主色; 主色全部在 Kotlin ColorKt.java。',
      'drawable/minilogo.xml 是空 selector (原 APK 即如此), 即启动屏图标资源为空。',
      'No 9-patch app assets found.'
    ],
    'themeWiring':[
      'AndroidManifest.xml:56 application android:theme=@style/Theme.App.Starting',
      'decoded/res/values/styles.xml:2249-2254 Theme.App.Starting → postSplashScreenTheme=Theme.Subject_segmentation_compose, windowSplashScreenAnimatedIcon=@drawable/minilogo, windowSplashScreenBackground=@color/screen',
      'decoded/res/values/styles.xml:2432 Theme.Subject_segmentation_compose parent Theme.AppCompat.Light.DarkActionBar (夜间: values-night/styles.xml:27 parent Theme.AppCompat.DayNight.DarkActionBar)',
      'MainActivityKt.java / ThemeKt.java: Compose WorkplanTheme(darkTheme, dynamicColor) → MaterialTheme(colorScheme, typography)'
    ]
  }
}
json.dump(tokens, open(os.path.join(OUT,'design-tokens.json'),'w'), ensure_ascii=False, indent=2)
print('design-tokens.json written')

# ---------- design-tokens.css ----------
def cv(name): return ck[name]['value']
css=[]
A=css.append
A('/* 极简排班 3.5.0 设计令牌 (自动生成, 来源见 design-tokens.json.evidence) */')
A(':root {')
for k in ['ThemeColor','PrimaryColor','DeleteColor','ImportantColor','VipColor','PrivateColor','LightBg0Color','LightBgColor','LightSelectColor','LightPrimaryColor','LightSecondColor','LightThirdColor','DarkBg0Color','DarkBgColor','DarkSelectColor','DarkPrimaryColor','DarkSecondColor','DarkThirdColor']:
    A('  --color-%s: %s;'%(k[0].lower()+k[1:], cv(k)))
A('  --color-tag-sign: #776AD4;')
A('  --color-tag-award: #1974E8;')
A('  --color-tag-fine: #F87679;')
A('  --color-widget-today-border: #EE4863;')
A('  --color-widget-legend-text: #767676;')
A('  --color-light-divider: #E5E5E5;')
A('  --color-light-splash-bg: #FFFFFF;')
A('  --color-dark-splash-bg: #111111;')
A('  --radius-xs: 4px;')
A('  --radius-sm: 6px;')
A('  --radius-md: 10px;')
A('  --radius-lg: 12px;')
A('  --radius-xl: 20px;')
A('  --radius-pill: 30px;')
for sp in [10,11,12,13,14,15,16,17,18,20,22,26,30]:
    A('  --font-size-%d: %dpx;'%(sp,sp))
A('  --font-weight-normal: 400;')
A('  --font-weight-medium: 500;')
A('  --font-weight-bold: 700;')
A('  --line-height-body: 1.5;')
A('  --space-1: 4px; --space-2: 8px; --space-3: 12px; --space-4: 16px; --space-5: 20px; --space-6: 24px;')
A('}')
A('@font-face { font-family: "remixicon"; src: url("../assets_extracted/fonts/remixicon.ttf") format("truetype"); font-weight: normal; font-style: normal; }')
A('.ri { font-family: "remixicon"; font-style: normal; -webkit-font-smoothing: antialiased; }')
A('[data-theme="dark"] {')
A('  --color-page-bg: %s;'%cv('DarkBg0Color'))
A('  --color-surface: %s;'%cv('DarkBgColor'))
A('  --color-surface-variant: %s;'%cv('DarkSelectColor'))
A('  --color-text-primary: %s;'%cv('DarkPrimaryColor'))
A('  --color-text-secondary: %s;'%cv('DarkSecondColor'))
A('  --color-text-tertiary: %s;'%cv('DarkThirdColor'))
A('}')
A('[data-theme="light"] {')
A('  --color-page-bg: %s;'%cv('LightBgColor'))
A('  --color-surface: %s;'%cv('LightBg0Color'))
A('  --color-surface-variant: %s;'%cv('LightSelectColor'))
A('  --color-text-primary: %s;'%cv('LightPrimaryColor'))
A('  --color-text-secondary: %s;'%cv('LightSecondColor'))
A('  --color-text-tertiary: %s;'%cv('LightThirdColor'))
A('}')
open(os.path.join(OUT,'design-tokens.css'),'w').write('\n'.join(css)+'\n')
print('design-tokens.css written')
