'use strict'
/**
 * seedDemo 云函数：按 deviceId 幂等写入 2024-09 示例数据
 * 数据与客户端 src/data/mock.js、src/services/local-db.js 完全一致
 */
const db = uniCloud.database()

const SHIFTS = [
  { _id: 'shift-early', id: 'early', name: '早班', color: '#1BA784', start: '08:00', end: '16:00', allDay: false, rest: '60', sort: 0 },
  { _id: 'shift-mid', id: 'mid', name: '中班', color: '#3E7BD6', start: '16:00', end: '24:00', allDay: false, rest: '60', sort: 1 },
  { _id: 'shift-night', id: 'night', name: '夜班', color: '#303048', start: '00:00', end: '08:00', allDay: false, rest: '60', sort: 2 },
  { _id: 'shift-long-early', id: 'long_early', name: '长早班', color: '#2D8A7A', start: '08:00', end: '20:00', allDay: false, rest: '60', sort: 3 },
  { _id: 'shift-long-night', id: 'long_night', name: '中夜班', color: '#806D9E', start: '20:00', end: '次日08:00', allDay: false, rest: '60', sort: 4 },
  { _id: 'shift-rest', id: 'rest', name: '休息', color: '#F8723D', start: '', end: '', allDay: true, rest: '0', sort: 5 }
]

const WORK_BY_DAY = {
  1: 'early', 2: 'mid', 3: 'night', 4: 'long_early', 5: 'long_night', 6: 'rest',
  7: 'early', 8: 'mid', 9: 'night', 10: 'long_early', 11: 'long_night', 12: 'rest',
  13: 'early', 14: 'mid', 15: 'night', 16: 'long_early', 17: 'long_night', 18: 'rest',
  19: 'early', 20: 'mid', 21: 'night', 22: 'long_early', 23: 'long_night', 24: 'rest',
  25: 'early', 26: 'mid', 27: 'night', 28: 'long_early', 29: 'long_night', 30: 'rest'
}

const REMARK_BY_DAY = { 2: '下午例会，记得带工牌' }

const ALARMS = [
  { _id: 'alarm-1', id: 'a1', time: '07:30', shift: 'early', range: '08:00~16:00', tags: ['普通提醒', '当天'], next: '明天 07:30提醒', on: true },
  { _id: 'alarm-2', id: 'a2', time: '19:30', shift: 'long_night', range: '20:00~次日08:00', tags: ['普通提醒', '当天'], next: '明天 19:30提醒', on: true }
]

const PROJECTS = [
  { _id: 'project-1', id: 'p1', name: '默认班表', current: true, count: 30 },
  { _id: 'project-2', id: 'p2', name: '夜班小组', current: false, count: 12 },
  { _id: 'project-3', id: 'p3', name: '门诊排班', current: false, count: 8 }
]

const CONFIG = {
  '一周开始日': '周一',
  '日期字号': '20',
  '班次字号': '12',
  '时间字号': '10',
  '班次圆角': '4',
  '显示中国农历': true,
  '显示中国节假日': true,
  '显示上班时间': true,
  '显示下班时间': true,
  '显示备注': true,
  '显示统计指标': true,
  '显示分割线': true,
  currentProjectId: 'p1',
  themeMode: 'system'
}

const FAQ = [
  { _id: 'faq-1', cat: '入门', q: '极简排班如何使用？', a: '第一步：添加自定义班次，如早班、晚班，并设置好上下班时间。\n第二步：添加周期排班，如果你的班次在以某一个周期循环排班，只要建立这一周期的排班情况，就可以通过首页周期排班功能循环设置。\n第三步：首页进行排班，既可以自定义排班，也可以周期排班。\n第四步：设置提醒，基于班次设置提醒。', sort: 0 },
  { _id: 'faq-2', cat: '班次', q: '什么是组合班次？', a: '由两个普通班次组成的班次我们称为组合班次。组合班次创建好后，就可以一次性在某一天设置 2 个班次，同时也适用于周期轮班。', sort: 1 },
  { _id: 'faq-3', cat: '数据', q: '换手机后如何迁移排班数据？', a: '排班数据默认只保存在当前手机本地。可以在「我的 → 分享与导入排班」生成 6 位秘钥，在新手机导入；也可以用「本地备份与恢复」或绑定坚果云等 WebDAV 云备份。', sort: 2 },
  { _id: 'faq-4', cat: '小组件', q: '桌面小组件一直显示“正在加载”？', a: '可以先删除小组件，重新添加一次；若仍不显示，请检查是否限制了后台运行。', sort: 3 }
]

async function clearDevice(deviceId) {
  const cols = ['jy_shift', 'jy_schedule', 'jy_alarm', 'jy_project', 'jy_config', 'jy_faq']
  for (const c of cols) {
    await db.collection(c).where({ deviceId }).remove()
  }
}

async function insertAll(collection, deviceId, list) {
  for (const item of list) {
    const doc = Object.assign({}, item, { deviceId })
    await db.collection(collection).add(doc)
  }
}

exports.main = async (event) => {
  const deviceId = event.deviceId || 'dev-anonymous'
  try {
    await clearDevice(deviceId)

    await insertAll('jy_shift', deviceId, SHIFTS)
    await insertAll('jy_alarm', deviceId, ALARMS)
    await insertAll('jy_project', deviceId, PROJECTS)
    await insertAll('jy_faq', deviceId, FAQ)

    const schedule = []
    for (let d = 1; d <= 30; d++) {
      const date = '2024-09-' + (d < 10 ? '0' + d : String(d))
      schedule.push({
        date,
        workId: WORK_BY_DAY[d] || '',
        secondWorkId: '',
        remark: REMARK_BY_DAY[d] || ''
      })
    }
    await insertAll('jy_schedule', deviceId, schedule)

    await db.collection('jy_config').add(Object.assign({ deviceId }, CONFIG))

    return { code: 0, data: { shifts: SHIFTS.length, schedule: schedule.length, alarms: ALARMS.length, projects: PROJECTS.length } }
  } catch (e) {
    return { code: -1, message: e.message || String(e) }
  }
}
