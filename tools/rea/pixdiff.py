#!/usr/bin/env python3
import json, os
from PIL import Image, ImageChops, ImageFilter, ImageDraw

U='/Users/hogar/.dsh/ungrouped/jianyun'
REAL=os.path.join(U,'analysis/reference/real-screens')
OUT=os.path.join(U,'analysis/pixel'); os.makedirs(OUT, exist_ok=True)
W,H=1080,2211
STATUS=63; NAV=126
screens=[('01-home.png','01-home.png','首页'),('02-work.png','02-work.png','班次'),('03-alarm.png','03-alarm.png','提醒'),('04-stat.png','04-stat.png','统计'),('05-mine.png','05-mine.png','我的')]

def load(pair):
    rp=os.path.join(REAL,pair[0]); up=os.path.join('/tmp/pix-uni842',pair[1])
    r=Image.open(rp).convert('RGB').crop((0,STATUS,W,2400-NAV)).resize((W,H))
    u=Image.open(up).convert('RGB').resize((W,H))
    return r,u

def metrics(a,b):
    g1=a.convert('L'); g2=b.convert('L')
    b1=g1.filter(ImageFilter.GaussianBlur(3)); b2=g2.filter(ImageFilter.GaussianBlur(3))
    d=ImageChops.difference(b1,b2)
    hist=d.histogram(); total=sum(hist); mean=sum(i*c for i,c in enumerate(hist))/total
    over=sum(c for i,c in enumerate(hist) if i>16)/total
    return round(mean,2), round(over*100,2), d

results={}
boards=[]
for rp,up,label in screens:
    r,u=load((rp,up))
    mean,over,diff=metrics(r,u)
    # 分区：顶部 0-360、日历/主体、底部 200px 标签栏
    bands={}
    for name,(y1,y2) in {'header':(0,360),'body':(360,H-220),'tabbar':(H-220,H)}.items():
        bb=diff.crop((0,y1,W,y2)); h=bb.histogram(); t=sum(h)
        bands[name]=round(sum(i*c for i,c in enumerate(h))/t,2)
    results[label]={'blurred_mean_abs':mean,'pct_over16':over,'bands':bands}
    # 色板
    qr=r.convert('P',palette=Image.ADAPTIVE,colors=8).convert('RGB')
    qu=u.convert('P',palette=Image.ADAPTIVE,colors=8).convert('RGB')
    cr=[c for c,_ in sorted(qr.getcolors(1<<20), reverse=True)[:8]]
    cu=[c for c,_ in sorted(qu.getcolors(1<<20), reverse=True)[:8]]
    results[label]['real_colors']=cr[:6]; results[label]['uni_colors']=cu[:6]
    # 左右对照板
    H2=1100; rw=int(W*H2/H); uw=int(W*H2/H)
    board=Image.new('RGB',(rw+uw+30, H2+50),(245,245,245)); dr=ImageDraw.Draw(board)
    board.paste(r.resize((rw,H2)),(10,40)); board.paste(u.resize((uw,H2)),(rw+20,40))
    dr.text((10,10), f'官方真机（左） vs uni-app 411dp（右） — {label}', fill=(0,0,0))
    nb=len(boards); boards.append(board)
    board.save(os.path.join(OUT,'compare-'+rp.replace('.png','')+'-411dp.png'))
    # diff 图（红=差异）
    heat=Image.new('RGB',diff.size,(0,0,0))
    dd=ImageDraw.Draw(heat)
    dg=diff.resize((diff.width//2, diff.height//2))
    heat.paste(dg.convert('RGB'),(0,0))
    heat.save(os.path.join(OUT,'diff-'+rp.replace('.png','')+'.png'))

json.dump(results, open(os.path.join(OUT,'metrics.json'),'w'), ensure_ascii=False, indent=1)
print(json.dumps(results, ensure_ascii=False, indent=1)[:2000])

# 总板：2 列 x 3 行
H2=560
cells=[Image.open(os.path.join(OUT,f)) for f in sorted(os.listdir(OUT)) if f.startswith('compare-') and f.endswith('-411dp.png')]
sheet=Image.new('RGB',(2*(H2*2)+40, 3*(H2+30)+10),(245,245,245))
d=ImageDraw.Draw(sheet)
for i,im in enumerate(cells[:6]):
    im=im.resize((int(im.width*H2/im.height),H2))
    x=10+(i%2)*(H2*2+20); y=10+(i//2)*(H2+30)
    sheet.paste(im,(x,y)); d.text((x,y+H2+4), cell_names[i] if False else '', fill=(0,0,0))
sheet.save(os.path.join(OUT,'board-411dp.png'))
print('saved board', sheet.size)
