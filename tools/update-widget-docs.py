import json, os
U = '/Users/hogar/.dsh/ungrouped/jianyun'

# 1) manifest 注册本地原生插件
p = os.path.join(U, 'uniapp/src/manifest.json')
d = json.load(open(p, encoding='utf-8'))
app = d.setdefault('app-plus', {})
if 'nativePlugins' not in app:
    app['nativePlugins'] = {
        'uni-widget': {
            '__plugin_info__': {
                'name': 'uni-widget',
                'description': '极简排班桌面小组件（月历/班次）',
                'platforms': 'Android',
                'url': '',
                'android_package_name': '',
                'ios_bundle_id': '',
                'isCloud': False,
                'bought': 1,
                'pid': '',
                'parameters': {}
            }
        }
    }
    json.dump(d, open(p, 'w', encoding='utf-8'), ensure_ascii=False, indent=2)
    print('manifest nativePlugins added')

# 2) uniapp README 增加小组件章节
p = os.path.join(U, 'uniapp/README.md')
s = open(p, encoding='utf-8').read()
if 'WIDGET.md' not in s:
    block = '\n'.join([
        '## 桌面小组件（App 端）',
        '',
        '复刻原 App 的 Glance 小组件：月历 + 班次两个桌面组件。App 端为「JS 数据层 + 原生 AppWidgetProvider」。',
        '',
        '- 服务：`src/services/widget.js`（配置持久化、月历载荷、SharedPreferences 写入 + 刷新广播、实例诊断）',
        '- 配置页：`src/pages/sub/widget/index.vue`（实时预览、显示项/字号/配色、保存并刷新、添加指引）',
        '- 原生插件：`nativeplugins/uni-widget/`（两个 Provider + 布局 + 清单，需 Android Studio 构建 AAR）',
        '- 文档：[WIDGET.md](WIDGET.md)；截图：`shots/widget-config.png`',
        '',
        '## 会员（赞助）与支付',
    ])
    s = s.replace('## 会员（赞助）与支付', block, 1)
    open(p, 'w', encoding='utf-8').write(s)
    print('uniapp README widget section added')

# 3) 根 README 行补充
p = os.path.join(U, 'README.md')
s = open(p, encoding='utf-8').read()
old = '**提醒/系统日历原生能力（见 [REMINDER.md](uniapp/REMINDER.md)）**'
new = old + '、**桌面小组件（配置页 + 原生 AppWidget 插件源码，见 [WIDGET.md](uniapp/WIDGET.md)）**'
if 'WIDGET.md' not in s:
    s = s.replace(old, new, 1)
    open(p, 'w', encoding='utf-8').write(s)
    print('root README updated')

# 4) 可行性矩阵：小组件状态
p = os.path.join(U, 'analysis/feasibility-uniapp-unicloud.md')
s = open(p, encoding='utf-8').read()
s = s.replace('| 桌面小组件 | Glance 2 套 | ❌ 需原生 AppWidget 插件 | ❌ | 数据可由云函数提供 | **需要** |',
  '| 桌面小组件 | Glance 2 套 | ⚠️ 已提供 JS 数据层 + 原生 AppWidget 插件源码（需编译 AAR/自定义基座） | ❌ | 数据可由云函数提供 | **需要（源码已给）** |')
s = s.replace('| 硬缺口数量 | 5 个 | **1 个主缺口**（小组件；提醒/日历已用 plus.android 实现） |',
  '| 硬缺口数量 | 5 个 | **0 个未实现**：提醒/日历已实现；小组件数据层/配置页已实现，原生插件已提供源码待编译 |')
open(p, 'w', encoding='utf-8').write(s)
print('feasibility updated')

# 5) 校验 manifest
d = json.load(open(p.replace('analysis/feasibility-uniapp-unicloud.md', 'uniapp/src/manifest.json'), encoding='utf-8'))
print('app-plus keys:', list(d['app-plus'].keys()))