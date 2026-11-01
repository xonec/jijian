from PIL import Image
import os
ROOT = os.path.dirname(os.path.abspath(__file__))
PROJ = os.path.join(ROOT, 'webview-apk')
SRC = '/Users/hogar/.dsh/ungrouped/jianyun/assets_extracted/app-icon/ic_launcher-xxxhdpi.png'
if not os.path.exists(SRC):
    SRC = '/Users/hogar/.dsh/ungrouped/jianyun/assets_extracted/app-icon/logo.png'
sizes = {'mdpi': 48, 'hdpi': 72, 'xhdpi': 96, 'xxhdpi': 144, 'xxxhdpi': 192}
im = Image.open(SRC).convert('RGBA')
for d, s in sizes.items():
    out = os.path.join(PROJ, 'res', 'mipmap-' + d)
    os.makedirs(out, exist_ok=True)
    im.resize((s, s), Image.LANCZOS).save(os.path.join(out, 'ic_launcher.png'))
print('icons generated from', SRC)
