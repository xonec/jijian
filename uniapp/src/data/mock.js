/* ============================================================
   示例数据：与 prototype/js/data.js 完全同构
   来源：官方商店截图（2024-09）+ APK 反编译的真实文案
   ============================================================ */

export const TODAY = { y: 2024, m: 9, d: 2 }
export const VIEW0 = { y: 2024, m: 9 }

export const SHIFTS = [
  { id: 'early', name: '早班', color: '#1BA784', start: '08:00', end: '16:00', allDay: false, rest: '0' },
  { id: 'mid', name: '中班', color: '#3E7BD6', start: '16:00', end: '24:00', allDay: false, rest: '0' },
  { id: 'night', name: '夜班', color: '#303048', start: '00:00', end: '08:00', allDay: false, rest: '0' },
  { id: 'long_early', name: '长早班', color: '#2D8A7A', start: '08:00', end: '20:00', allDay: false, rest: '0' },
  { id: 'long_night', name: '中夜班', color: '#806D9E', start: '20:00', end: '次日08:00', allDay: false, rest: '0' },
  { id: 'rest', name: '休息', color: '#F8723D', start: '', end: '', allDay: true, rest: '0' }
]

/* 2024-09 排班：work=班次 id；农历/节日/节气由 src/utils/lunar.js 按真实日期计算，swap=调班蓝标 */
export const DAYS = [
  { d: 1, work: 'early' },
  { d: 2, work: 'mid' },
  { d: 3, work: 'night' },
  { d: 4, work: 'long_early' },
  { d: 5, work: 'long_night' },
  { d: 6, work: 'rest' },
  { d: 7, work: 'early' },
  { d: 8, work: 'mid' },
  { d: 9, work: 'night' },
  { d: 10, work: 'long_early' },
  { d: 11, work: 'long_night' },
  { d: 12, work: 'rest' },
  { d: 13, work: 'early' },
  { d: 14, work: 'mid' },
  { d: 15, work: 'night' },
  { d: 16, work: 'long_early' },
  { d: 17, work: 'long_night' },
  { d: 18, work: 'rest' },
  { d: 19, work: 'early' },
  { d: 20, work: 'mid' },
  { d: 21, work: 'night' },
  { d: 22, work: 'long_early' },
  { d: 23, work: 'long_night' },
  { d: 24, work: 'rest' },
  { d: 25, work: 'early' },
  { d: 26, work: 'mid' },
  { d: 27, work: 'night' },
  { d: 28, work: 'long_early' },
  { d: 29, work: 'long_night' },
  { d: 30, work: 'rest' }
]

export const REMARKS = { 2: '下午例会，记得带工牌' }

export const ALARMS = [
  { id: 'a1', time: '07:30', shift: 'early', range: '08:00~16:00', tags: ['普通提醒', '当天'], next: '明天 07:30提醒', on: true },
  { id: 'a2', time: '19:30', shift: 'long_night', range: '20:00~次日08:00', tags: ['普通提醒', '当天'], next: '明天 19:30提醒', on: true }
]

export const STAT = {
  range: ['2024-09-01', '2024-09-30'],
  donut: [
    { name: '早班', value: 5, pct: 17, color: '#1BA784' },
    { name: '中班', value: 5, pct: 17, color: '#3E7BD6' },
    { name: '夜班', value: 5, pct: 17, color: '#303048' },
    { name: '长早班', value: 5, pct: 17, color: '#2D8A7A' },
    { name: '中夜班', value: 5, pct: 17, color: '#806D9E' },
    { name: '休息', value: 5, pct: 17, color: '#F8723D' }
  ],
  totalHours: 240,
  avgHours: 8.0,
  restHours: 25,
  details: [
    { d: '09-01', w: '周日', work: 'early', start: '08:00', end: '16:00', dur: '8h' },
    { d: '09-02', w: '周一', work: 'mid', start: '16:00', end: '24:00', dur: '8h' },
    { d: '09-03', w: '周二', work: 'night', start: '00:00', end: '08:00', dur: '8h' },
    { d: '09-04', w: '周三', work: 'long_early', start: '08:00', end: '20:00', dur: '12h' },
    { d: '09-05', w: '周四', work: 'long_night', start: '20:00', end: '次日08:00', dur: '12h' },
    { d: '09-06', w: '周五', work: 'rest', start: '—', end: '—', dur: '0h' }
  ]
}

export const SETTING_GROUPS = [
  {
    title: '排班',
    items: [
      { icon: 'apps', label: '我的排班项目', value: '默认班表' },
      { icon: 'cloud', label: '本地备份设置', value: '' },
      { icon: 'share', label: '分享与导入排班', value: '' },
      { icon: 'download', label: '本地备份与恢复', value: '' }
    ]
  },
  {
    title: '个性化',
    items: [
      { icon: 'palette', label: 'APP风格', value: '跟随系统', action: 'theme' },
      { icon: 'calendar', label: '桌面小组件配置', value: '' },
      { icon: 'settings', label: '通知与系统权限', value: '' },
      { icon: 'file_download', label: '导入小程序排班', value: '' }
    ]
  },
  {
    title: '关于',
    items: [
      { icon: 'info', label: '本次更新说明', value: '' },
      { icon: 'questionnaire', label: '常见问题解答', value: '' },
      { icon: 'pencil', label: '用户在线反馈', value: '' },
      { icon: 'doc', label: '用户使用协议', value: '' },
      { icon: 'doc', label: '应用隐私政策', value: '' }
    ]
  }
]

export const DISPLAY_CONFIG = [
  { k: '一周开始日', v: '周一', type: 'segment' },
  { k: '日期字号', v: '20' },
  { k: '班次字号', v: '12' },
  { k: '时间字号', v: '10' },
  { k: '班次圆角', v: '4' },
  { k: '显示中国农历', v: true },
  { k: '显示中国节假日', v: true },
  { k: '显示上班时间', v: true },
  { k: '显示下班时间', v: true },
  { k: '显示备注', v: true },
  { k: '显示统计指标', v: true },
  { k: '显示分割线', v: true }
]

export const PALETTES = [
  { name: '红', colors: ['#F07C82', '#EB507E', '#FC6315', '#F5391C', '#ED3333'] },
  { name: '橙', colors: ['#FCA104', '#FBA414', '#FA7E23', '#F0945D', '#F86B1D'] },
  { name: '黄', colors: ['#BEC936', '#B78B26', '#806332', '#F9A633', '#8C4B31'] },
  { name: '绿', colors: ['#57C3C2', '#223E36', '#61AC85', '#253D24', '#55BB8A'] },
  { name: '青', colors: ['#BC84A8', '#2B333E', '#1661AB', '#1772B4', '#87723E'] },
  { name: '蓝', colors: ['#A7A8BD', '#2775B6', '#1677B3', '#126E82', '#648E93'] },
  { name: '紫', colors: ['#5C2223', '#A8456B', '#681752', '#322F3B', '#5D3131'] },
  { name: '灰', colors: ['#7A7374', '#2D2E36', '#B5AA90', '#4F4032', '#4B2E2B'] }
]

export const VIP = {
  plans: [
    { price: '3元', unit: '每月', note: '每天1毛钱' },
    { price: '12元', unit: '每年', note: '每天3.3分钱', best: true },
    { price: '18元', unit: '永久', note: '一次性买断' }
  ],
  rights: [
    { icon: 'lightbulb_flash', title: '支持开发', desc: '促使开发者砥砺前行，呈现更优质的App功能' },
    { icon: 'sun', title: '无广告秒开', desc: '没有任何开屏和视频广告' },
    { icon: 'user', title: '专属客服', desc: '会员用户优先响应' }
  ],
  tip: '不会出现自动扣费，会员到期需要手动续费'
}

export const PROJECTS = [
  { id: 'p1', name: '默认班表', current: true, count: 30 },
  { id: 'p2', name: '夜班小组', current: false, count: 12 },
  { id: 'p3', name: '门诊排班', current: false, count: 8 }
]

export const FAQ = [
  {
    cat: '入门',
    q: '极简排班如何使用？',
    a: '第一步：添加自定义班次，如早班、晚班，并设置好上下班时间。\n第二步：添加周期排班，如果你的班次在以某一个周期循环排班，只要建立这一周期的排班情况，就可以通过首页周期排班功能循环设置。\n第三步：首页进行排班，既可以自定义排班，也可以周期排班。\n第四步：设置提醒，基于班次设置提醒。'
  },
  {
    cat: '班次',
    q: '什么是组合班次？',
    a: '由两个普通班次组成的班次我们称为组合班次。组合班次创建好后，就可以一次性在某一天设置 2 个班次，同时也适用于周期轮班。\n比如：张三班次有 A、B、C 班，平时偶尔有 A、B 班同时上，B、C 班同时上的情况，这个时候建两个组合班次就可以在主页一次性设置 2 个班次了。'
  },
  {
    cat: '数据',
    q: '换手机后如何迁移排班数据？',
    a: '排班数据默认只保存在当前手机本地。可以在「我的 → 分享与导入排班」生成 6 位秘钥，在新手机导入；也可以用「本地备份与恢复」或绑定坚果云等 WebDAV 云备份。'
  },
  {
    cat: '小组件',
    q: '桌面小组件一直显示“正在加载”？',
    a: '可以先删除小组件，重新添加一次；若仍不显示，请检查是否限制了后台运行。'
  }
]

export const UPDATE_INTRO = '亲爱的老用户，感谢你一直在使用极简排班。\n\n本次更新重点优化了这些内容：\n\n1. 首页日历支持左右滑动切换月份，浏览排班更顺手。\n2. 首页显示配置和小组件显示配置做了进一步拆分，调节更清晰。\n3. 统计页新增了时长统计、时长占比饼图，以及排班明细导出 Excel。\n4. 排班详情补充了休息时长、工作时长等信息，统计更准确。\n5. 小组件入口、暗黑模式、显示样式等细节都做了持续优化。\n6. 若小组件一直显示“正在加载”，可以先删除小组件，重新添加。\n7. 没有班次也可以添加备注了。'
