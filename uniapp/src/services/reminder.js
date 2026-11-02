/**
 * 提醒 / 系统日历 / 通知 / 精确闹钟 原生能力（uni-app App 端 Android）。
 *
 * 实现方式：通过 plus.android 直接调用 Android 系统 API（CalendarContract /
 * NotificationManager / AlarmManager），无需 UTS 插件重新打包；H5、小程序自动降级为
 * { supported:false }，页面用 toast 提示。
 *
 * 对外 API（均为 async，失败抛 Error 或返回 supported:false）：
 *   isSupported()
 *   diagnose()               → { supported, platform, notification, calendarRead, calendarWrite, location, camera, media, file, record, canExactAlarm, sdkInt, calendarId }
 *   requestPermissions(kind) → kind: 'notification' | 'calendar' | 'location' | 'camera' | 'record' | 'media' | 'file' | 'all'
 *   syncAlarm(alarm)         → 把提醒写入系统日历（有则更新），返回 { eventId, start, calendarId }
 *   removeAlarm(alarmId)     → 删除该提醒对应的系统日历事件
 *   testCalendarAlarm()      → 1 分钟后的测试日历事件（权限页「验证日历提醒」用）
 *   notifyNow({title,content}) → 立即发一条本地通知（App）
 *   openSettings(kind)       → 打开系统设置页（notification/calendar/exact/app）
 *
 * 存储：jy_reminder_events = { [alarmId]: eventId }；jy_reminder_calendar_id = 自建日历 id。
 */

const EVENTS_KEY = 'jy_reminder_events'
const CAL_ID_KEY = 'jy_reminder_calendar_id'

function androidReady() {
  return (
    typeof plus !== 'undefined' &&
    plus &&
    plus.os &&
    plus.os.name === 'Android' &&
    typeof plus.android !== 'undefined'
  )
}

function readMap() {
  try {
    const raw = uni.getStorageSync(EVENTS_KEY)
    if (!raw) return {}
    return typeof raw === 'string' ? JSON.parse(raw) : raw
  } catch (e) {
    return {}
  }
}

function writeMap(map) {
  try {
    uni.setStorageSync(EVENTS_KEY, map)
  } catch (e) {}
}

function pad(n) { return n < 10 ? '0' + n : '' + n }

/** 'HH:MM' → 今天该时刻（若已过去则顺延到明天）的毫秒时间戳 */
function nextOccurrence(hhmm) {
  const m = /^(\d{1,2}):(\d{2})$/.exec(String(hhmm || '09:00').replace(/^次日/, ''))
  const h = m ? Number(m[1]) : 9
  const min = m ? Number(m[2]) : 0
  const d = new Date()
  d.setSeconds(0, 0)
  d.setHours(h, min, 0, 0)
  if (d.getTime() <= Date.now()) d.setDate(d.getDate() + 1)
  return d.getTime()
}

/* ---------------- Android 实现 ---------------- */
function createAndroidImpl() {
  const main = plus.android.runtimeMainActivity()
  const Build = plus.android.importClass('android.os.Build')
  const Intent = plus.android.importClass('android.content.Intent')
  const Settings = plus.android.importClass('android.provider.Settings')
  const Uri = plus.android.importClass('android.net.Uri')
  const ContentValues = plus.android.importClass('android.content.ContentValues')
  const ContentUris = plus.android.importClass('android.content.ContentUris')
  const CalendarContract = plus.android.importClass('android.provider.CalendarContract')
  const Events = CalendarContract.Events
  const Reminders = CalendarContract.Reminders
  const Calendars = CalendarContract.Calendars
  const sdkInt = Number(Build.VERSION.SDK_INT)
  const pkg = main.getPackageName()

  function cr() {
    return plus.android.invoke(main, 'getContentResolver')
  }

  function checkPerm(perm) {
    if (sdkInt < 23) return true
    try {
      return plus.android.invoke(main, 'checkSelfPermission', perm) === 0
    } catch (e) {
      return false
    }
  }

  function canExactAlarm() {
    if (sdkInt < 31) return true
    try {
      const am = plus.android.invoke(main, 'getSystemService', 'alarm')
      return !!plus.android.invoke(am, 'canScheduleExactAlarms')
    } catch (e) {
      return false
    }
  }

  function diagnose() {
    const hasMedia = sdkInt >= 33 ? checkPerm('android.permission.READ_MEDIA_IMAGES') : checkPerm('android.permission.READ_EXTERNAL_STORAGE')
    return {
      supported: true,
      platform: 'android',
      sdkInt,
      notification: sdkInt < 33 ? true : checkPerm('android.permission.POST_NOTIFICATIONS'),
      calendarRead: checkPerm('android.permission.READ_CALENDAR'),
      calendarWrite: checkPerm('android.permission.WRITE_CALENDAR'),
      network: true,
      location: checkPerm('android.permission.ACCESS_FINE_LOCATION') || checkPerm('android.permission.ACCESS_COARSE_LOCATION'),
      camera: checkPerm('android.permission.CAMERA'),
      record: checkPerm('android.permission.RECORD_AUDIO'),
      media: hasMedia,
      file: sdkInt >= 33 ? true : hasMedia,
      canExactAlarm: canExactAlarm(),
      calendarId: uni.getStorageSync(CAL_ID_KEY) || ''
    }
  }

  function requestPermissions(kind) {
    const list = []
    const add = (...items) => {
      items.forEach((p) => {
        if (p && list.indexOf(p) < 0) list.push(p)
      })
    }
    const want = (k) => kind === k || kind === 'all'
    if (want('notification') && sdkInt >= 33) add('android.permission.POST_NOTIFICATIONS')
    if (want('calendar')) add('android.permission.READ_CALENDAR', 'android.permission.WRITE_CALENDAR')
    if (want('location')) add('android.permission.ACCESS_FINE_LOCATION', 'android.permission.ACCESS_COARSE_LOCATION')
    if (want('camera')) add('android.permission.CAMERA')
    if (want('record')) add('android.permission.RECORD_AUDIO')
    if (want('media')) {
      if (sdkInt >= 33) add('android.permission.READ_MEDIA_IMAGES', 'android.permission.READ_MEDIA_VIDEO')
      else add('android.permission.READ_EXTERNAL_STORAGE')
    }
    if (want('file')) {
      if (sdkInt <= 32) add('android.permission.READ_EXTERNAL_STORAGE')
      if (sdkInt <= 28) add('android.permission.WRITE_EXTERNAL_STORAGE')
    }
    if (!list.length) return Promise.resolve({ granted: [], denied: [], sdkInt })
    return new Promise((resolve) => {
      plus.android.requestPermissions(
        list,
        (e) => resolve({ granted: e.granted || [], denied: (e.deniedPresent || []).concat(e.deniedAlways || []), sdkInt }),
        (err) => resolve({ granted: [], denied: list, error: String(err), sdkInt })
      )
    })
  }

  function queryFirstCalendar() {
    try {
      const c = cr()
      const projection = ['_id', 'calendar_displayName', 'calendar_access_level', 'visible', 'isPrimary']
      const cursor = plus.android.invoke(c, 'query', Calendars.CONTENT_URI, projection, null, null, null)
      let best = ''
      if (cursor) {
        while (plus.android.invoke(cursor, 'moveToNext')) {
          const id = String(plus.android.invoke(cursor, 'getLong', 0) || '')
          const level = Number(plus.android.invoke(cursor, 'getInt', 2) || 0)
          const visible = Number(plus.android.invoke(cursor, 'getInt', 3) || 0)
          const primary = Number(plus.android.invoke(cursor, 'getInt', 4) || 0)
          if (id && (visible === 1 || primary === 1) && level >= 500) { best = id; if (primary === 1) break }
        }
        plus.android.invoke(cursor, 'close')
      }
      return best
    } catch (e) {
      return ''
    }
  }

  function createLocalCalendar() {
    const c = cr()
    const values = new ContentValues()
    values.put('account_name', 'JianyunReplica')
    values.put('account_type', 'LOCAL')
    values.put('name', '极简排班')
    values.put('calendar_displayName', '极简排班')
    values.put('ownerAccount', 'JianyunReplica')
    values.put('visible', 1)
    values.put('sync_events', 1)
    const builder = plus.android.invoke(Calendars.CONTENT_URI, 'buildUpon')
    plus.android.invoke(builder, 'appendQueryParameter', 'account_name', 'JianyunReplica')
    plus.android.invoke(builder, 'appendQueryParameter', 'account_type', 'LOCAL')
    plus.android.invoke(builder, 'appendQueryParameter', 'caller_is_syncadapter', 'true')
    const uri = plus.android.invoke(builder, 'build')
    const newUri = plus.android.invoke(c, 'insert', uri, values)
    if (!newUri) return ''
    return String(plus.android.invoke(ContentUris, 'parseId', newUri))
  }

  function ensureCalendarId() {
    let id = String(uni.getStorageSync(CAL_ID_KEY) || '')
    if (id) return id
    id = queryFirstCalendar()
    if (!id) id = createLocalCalendar()
    if (id) uni.setStorageSync(CAL_ID_KEY, id)
    return id
  }

  function buildEventValues(calendarId, title, beginMs, endMs, description, strong) {
    const values = new ContentValues()
    values.put('calendar_id', String(calendarId))
    values.put('title', title)
    values.put('description', description || '')
    values.put('eventLocation', '')
    values.put('dtstart', String(beginMs))
    values.put('dtend', String(endMs))
    values.put('eventTimezone', 'Asia/Shanghai')
    values.put('allDay', '0')
    values.put('hasAlarm', '1')
    values.put('eventStatus', String(Events.STATUS_CONFIRMED))
    values.put('visibility', String(Events.VISIBILITY_DEFAULT))
    if (strong) {
      // 强提醒：允许系统在勿扰下提醒（部分机型支持）
      values.put('availability', String(Events.AVAILABILITY_BUSY))
    }
    return values
  }

  function insertEvent(calendarId, title, beginMs, endMs, description, strong) {
    const c = cr()
    const values = buildEventValues(calendarId, title, beginMs, endMs, description, strong)
    const uri = plus.android.invoke(c, 'insert', Events.CONTENT_URI, values)
    if (!uri) return ''
    const eventId = String(plus.android.invoke(ContentUris, 'parseId', uri))
    const rem = new ContentValues()
    rem.put('event_id', Number(eventId))
    rem.put('minutes', 0)
    rem.put('method', Reminders.METHOD_ALERT)
    plus.android.invoke(c, 'insert', Reminders.CONTENT_URI, rem)
    return eventId
  }

  function updateEvent(eventId, calendarId, title, beginMs, endMs, description, strong) {
    const c = cr()
    const values = buildEventValues(calendarId, title, beginMs, endMs, description, strong)
    const uri = plus.android.invoke(ContentUris, 'withAppendedId', Events.CONTENT_URI, Number(eventId))
    return plus.android.invoke(c, 'update', uri, values, null, null)
  }

  function deleteEvent(eventId) {
    try {
      const c = cr()
      const uri = plus.android.invoke(ContentUris, 'withAppendedId', Events.CONTENT_URI, Number(eventId))
      return plus.android.invoke(c, 'delete', uri, null, null)
    } catch (e) {
      return 0
    }
  }

  function alarmTitle(alarm) {
    const shift = alarm && (alarm.shiftName || alarm.range)
    return '极简排班提醒' + (shift ? ' · ' + shift : '')
  }

  function alarmDescription(alarm) {
    const parts = []
    if (alarm && alarm.time) parts.push('提醒时间 ' + alarm.time)
    if (alarm && alarm.when) parts.push(alarm.when)
    if (alarm && alarm.shiftName) parts.push('班次 ' + alarm.shiftName)
    return '极简排班（复刻）自动写入的系统日历提醒' + (parts.length ? '：' + parts.join('；') : '')
  }

  /** 写入/更新一条提醒到系统日历；alarm: { id/_id, time, shiftName, when, strong } */
  function syncAlarm(alarm) {
    if (!alarm) throw new Error('缺少提醒数据')
    const id = String(alarm.id || alarm._id || '')
    if (!id) throw new Error('提醒没有 id')
    if (!checkPerm('android.permission.WRITE_CALENDAR')) {
      const err = new Error('未授权日历写入权限')
      err.code = 'NO_CALENDAR_PERMISSION'
      throw err
    }
    const calendarId = ensureCalendarId()
    if (!calendarId) {
      const err = new Error('没有可写入的系统日历')
      err.code = 'NO_CALENDAR'
      throw err
    }
    const begin = nextOccurrence(alarm.time)
    const end = begin + 15 * 60 * 1000
    const map = readMap()
    let eventId = map[id]
    if (eventId) {
      updateEvent(eventId, calendarId, alarmTitle(alarm), begin, end, alarmDescription(alarm), !!alarm.strong)
    } else {
      eventId = insertEvent(calendarId, alarmTitle(alarm), begin, end, alarmDescription(alarm), !!alarm.strong)
      map[id] = eventId
      writeMap(map)
    }
    return { eventId, start: begin, end, calendarId, title: alarmTitle(alarm) }
  }

  function removeAlarm(alarmId) {
    const id = String(alarmId || '')
    const map = readMap()
    const eventId = map[id]
    if (!eventId) return { removed: false }
    deleteEvent(eventId)
    delete map[id]
    writeMap(map)
    return { removed: true }
  }

  /** 1 分钟后的测试事件，用于权限页验证日历链路 */
  function testCalendarAlarm() {
    if (!checkPerm('android.permission.WRITE_CALENDAR')) {
      const err = new Error('未授权日历写入权限')
      err.code = 'NO_CALENDAR_PERMISSION'
      throw err
    }
    const calendarId = ensureCalendarId()
    if (!calendarId) {
      const err = new Error('没有可写入的系统日历')
      err.code = 'NO_CALENDAR'
      throw err
    }
    const begin = Date.now() + 60 * 1000
    const end = begin + 5 * 60 * 1000
    const eventId = insertEvent(
      calendarId,
      '极简排班 · 日历提醒测试',
      begin,
      end,
      '这是「极简排班（复刻）」写入的测试提醒，1 分钟后由系统日历提醒。',
      false
    )
    return { eventId, start: begin, calendarId }
  }

  function notifyNow(payload) {
    const title = (payload && payload.title) || '极简排班提醒'
    const content = (payload && payload.content) || '该处理提醒了'
    if (typeof uni.createPushMessage === 'function') {
      uni.createPushMessage({ title, content, payload: (payload && payload.payload) || {} })
      return { sent: true }
    }
    return { sent: false }
  }

  function openSettings(kind) {
    const intent = new Intent()
    if (kind === 'notification' && sdkInt >= 26) {
      intent.setAction('android.settings.APP_NOTIFICATION_SETTINGS')
      intent.putExtra('android.provider.extra.APP_PACKAGE', pkg)
    } else if (kind === 'exact' && sdkInt >= 31) {
      intent.setAction('android.settings.REQUEST_SCHEDULE_EXACT_ALARM')
      intent.setData(Uri.parse('package:' + pkg))
    } else if (kind === 'calendar' || kind === 'app' || kind === 'exact') {
      intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
      intent.setData(Uri.parse('package:' + pkg))
    } else {
      intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
      intent.setData(Uri.parse('package:' + pkg))
    }
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    plus.android.invoke(main, 'startActivity', intent)
    return { opened: true, kind }
  }

  return {
    supported: true,
    diagnose,
    requestPermissions,
    syncAlarm,
    removeAlarm,
    testCalendarAlarm,
    notifyNow,
    openSettings
  }
}

/* ---------------- 非 Android 端降级 ---------------- */
function createFallbackImpl() {
  const unsupported = () => ({ supported: false })
  const fail = (msg) => {
    const e = new Error(msg)
    e.code = 'UNSUPPORTED'
    throw e
  }
  return {
    supported: false,
    diagnose: async () => ({ supported: false, platform: 'h5', notification: false, calendarRead: false, calendarWrite: false, canExactAlarm: false }),
    requestPermissions: async () => ({ granted: [], denied: [], supported: false }),
    syncAlarm: async () => fail('当前平台不支持系统日历同步'),
    removeAlarm: async () => ({ removed: false, supported: false }),
    testCalendarAlarm: async () => fail('当前平台不支持系统日历'),
    notifyNow: async (payload) => {
      if (typeof uni !== 'undefined' && uni.showToast) uni.showToast({ title: (payload && payload.title) || '提醒', icon: 'none' })
      return { sent: false, supported: false }
    },
    openSettings: async () => unsupported()
  }
}

const impl = androidReady() ? createAndroidImpl() : createFallbackImpl()

export const isSupported = () => !!impl.supported
export const diagnose = () => impl.diagnose()
export const requestPermissions = (kind) => impl.requestPermissions(kind || 'all')
export const syncAlarm = (alarm) => impl.syncAlarm(alarm)
export const removeAlarm = (alarmId) => impl.removeAlarm(alarmId)
export const testCalendarAlarm = () => impl.testCalendarAlarm()
export const notifyNow = (payload) => impl.notifyNow(payload)
export const openSettings = (kind) => impl.openSettings(kind || 'app')
