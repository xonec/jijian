from PIL import Image, ImageDraw, ImageFont
import os
base = '/Users/hogar/.dsh/ungrouped/jianyun/release/qa'
files = ['01-home-after-agree.png', '02-mine-tab.png', '03-stat-tab.png', '04-relaunch.png']
labels = ['1. 同意隐私后首页', '2. 我的 Tab', '3. 统计 Tab', '4. 冷启动（隐私不再弹）']
font = None
for p in ['/System/Library/Fonts/PingFang.ttc', '/System/Library/Fonts/STHeiti Light.ttc', '/System/Library/Fonts/Supplemental/Arial Unicode.ttf']:
    try:
        font = ImageFont.truetype(p, 22); break
    except Exception:
        pass
H = 720
ims = [Image.open(os.path.join(base, f)).convert('RGB') for f in files]
tw = int(ims[0].width * H / ims[0].height)
sheet = Image.new('RGB', (len(ims) * (tw + 10) + 10, H + 52), (245, 245, 245))
d = ImageDraw.Draw(sheet)
for i, (im, l) in enumerate(zip(ims, labels)):
    x = 10 + i * (tw + 10)
    sheet.paste(im.resize((tw, H)), (x, 46))
    d.text((x, 12), l, fill=(0, 0, 0), font=font)
sheet.save('/Users/hogar/.dsh/ungrouped/jianyun/release/qa-board.png')
print('qa board', sheet.size, 'font:', bool(font))