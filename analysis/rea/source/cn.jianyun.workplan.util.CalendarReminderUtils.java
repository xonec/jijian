package cn.jianyun.workplan.util;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import cn.jianyun.workplan.main.base.model.NotifyInfo;
import com.alibaba.fastjson2.util.DateUtils;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class CalendarReminderUtils {
    private static String CALENDARS_ACCOUNT_NAME = "极简排班通知";
    private static String CALENDARS_ACCOUNT_TYPE = "cn.jianyun.workplan";
    private static String CALENDARS_DISPLAY_NAME = "极简排班账户";
    private static String CALENDARS_NAME = "极简排班";
    private static String CALENDER_EVENT_URL = "content://com.android.calendar/events";
    private static String CALENDER_REMINDER_URL = "content://com.android.calendar/reminders";
    private static String CALENDER_URL = "content://com.android.calendar/calendars";

    private static int checkAndAddCalendarAccount(Context context) {
        return 1;
    }

    private static int checkCalendarAccount(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_URL), null, null, null, null);
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return -1;
        }
        try {
            if (cursorQuery.getCount() <= 0) {
                return -1;
            }
            cursorQuery.moveToNext();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private static long addCalendarAccount(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", CALENDARS_NAME);
        contentValues.put("account_name", CALENDARS_ACCOUNT_NAME);
        contentValues.put("account_type", CALENDARS_ACCOUNT_TYPE);
        contentValues.put("calendar_displayName", CALENDARS_DISPLAY_NAME);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", CALENDARS_ACCOUNT_NAME);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(CALENDER_URL).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build(), contentValues);
        if (uriInsert == null) {
            return -1L;
        }
        return ContentUris.parseId(uriInsert);
    }

    public static boolean batchAddCalendarEvent(Context context, List<NotifyInfo> notifyInfos) {
        if (context == null) {
            CommonToolKt.mlog("获取日历账户失败01");
            return false;
        }
        int iCheckAndAddCalendarAccount = checkAndAddCalendarAccount(context);
        if (iCheckAndAddCalendarAccount < 0) {
            CommonToolKt.mlog("获取日历账户失败");
            return false;
        }
        CommonToolKt.mlog("准备写入日历");
        for (NotifyInfo notifyInfo : notifyInfos) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(notifyInfo.getRealTime());
            long time = calendar.getTime().getTime();
            calendar.setTimeInMillis(1000 + time);
            long time2 = calendar.getTime().getTime();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", notifyInfo.getTitle());
            contentValues.put("description", notifyInfo.getDescription());
            contentValues.put("calendar_id", Integer.valueOf(iCheckAndAddCalendarAccount));
            contentValues.put("organizer", CALENDARS_NAME);
            contentValues.put("dtstart", Long.valueOf(time));
            contentValues.put("dtend", Long.valueOf(time2));
            contentValues.put("hasAlarm", (Integer) 1);
            contentValues.put("eventTimezone", DateUtils.SHANGHAI_ZONE_ID_NAME);
            String str = CacheUtil.get(context, "brand");
            try {
                Uri uriTryToCreateAlarmEvent = tryToCreateAlarmEvent(context, contentValues, notifyInfo.getAlarm());
                if (uriTryToCreateAlarmEvent == null) {
                    CommonToolKt.mlog("添加日历事件失败");
                    return false;
                }
                CommonToolKt.mlog("成功添加日历事件:", notifyInfo.getTitle(), notifyInfo.getNotifyTime());
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(uriTryToCreateAlarmEvent)));
                contentValues2.put("minutes", Integer.valueOf(notifyInfo.getBeforeMinute()));
                contentValues2.put(e.s, (Integer) 1);
                if (context.getContentResolver().insert(Uri.parse(CALENDER_REMINDER_URL), contentValues2) == null) {
                    CommonToolKt.mlog("添加日程提醒失败");
                } else {
                    CommonToolKt.mlog("添加日程提醒成功");
                    if (notifyInfo.getAlarm()) {
                        try {
                            Uri uriBuild = CalendarContract.ExtendedProperties.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", CALENDARS_ACCOUNT_NAME).appendQueryParameter("account_type", CALENDARS_ACCOUNT_TYPE).build();
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("event_id", Long.valueOf(ContentUris.parseId(uriTryToCreateAlarmEvent)));
                            if ("小米".equals(str)) {
                                contentValues3.put("name", "agenda_info");
                                contentValues3.put(b.f2259d, "{\"need_alarm\":true}");
                            } else if ("vivo".equals(str)) {
                                contentValues3.put("name", "reminder_alert_type");
                                contentValues3.put(b.f2259d, "1");
                            }
                            if (context.getContentResolver().insert(uriBuild, contentValues3) == null) {
                                CommonToolKt.mlog("添加日程闹钟失败");
                            } else {
                                CommonToolKt.mlog("添加日程闹钟成功");
                            }
                        } catch (Exception unused) {
                            CommonToolKt.mlog("添加日程闹钟失败嘞");
                        }
                    }
                }
            } catch (Exception e2) {
                CommonToolKt.mlog("写入日历失败", e2);
            }
            CommonToolKt.mlog("写入日历失败", e2);
        }
        return true;
    }

    private static Uri tryToCreateAlarmEvent(Context context, ContentValues event, boolean alarm) {
        Uri uriTryToCreateAlarmEvent;
        if (alarm) {
            uriTryToCreateAlarmEvent = tryToCreateAlarmEvent(context, event, "hasAlarmClock");
            if (uriTryToCreateAlarmEvent == null) {
                uriTryToCreateAlarmEvent = tryToCreateAlarmEvent(context, event, "force_reminder");
            }
        } else {
            uriTryToCreateAlarmEvent = null;
        }
        return uriTryToCreateAlarmEvent == null ? tryToCreateAlarmEvent(context, event, (String) null) : uriTryToCreateAlarmEvent;
    }

    private static Uri tryToCreateAlarmEvent(Context context, ContentValues event, String prop) {
        if (prop != null) {
            try {
                if (CacheUtil.getInt(context, prop, 0).intValue() == 404) {
                    return null;
                }
                event.put(prop, "1");
            } catch (Exception e2) {
                if (prop != null) {
                    CacheUtil.setInt(context, prop, Integer.valueOf(TTAdConstant.SDK_NOT_SUPPORT_LIVE_MATE_CODE));
                }
                CommonToolKt.mlog("addEventError", e2);
                event.remove(prop);
            }
        }
        Uri uriInsert = context.getContentResolver().insert(Uri.parse(CALENDER_EVENT_URL), event);
        if (uriInsert != null) {
            return uriInsert;
        }
        return null;
    }

    public static Map<String, String> getTestEventData(Context context) {
        final HashMap map = new HashMap();
        try {
            final Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_EVENT_URL), null, null, null, null);
            if (cursorQuery == null) {
                return new HashMap();
            }
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                while (!cursorQuery.isAfterLast()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("account_name"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("organizer"));
                    if (CALENDARS_NAME.equals(string) && "普通测试".equals(string2)) {
                        Arrays.stream(cursorQuery.getColumnNames()).forEach(new Consumer() { // from class: cn.jianyun.workplan.util.CalendarReminderUtils$$ExternalSyntheticLambda1
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                Map map2 = map;
                                Cursor cursor = cursorQuery;
                                String str = (String) obj;
                                map2.put(str, cursor.getString(cursor.getColumnIndex(str)));
                            }
                        });
                    }
                    cursorQuery.moveToNext();
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return map;
        } catch (Exception unused) {
        }
    }

    private static Map<String, String> getEventExtendProperties(Context context, long eventId) {
        final HashMap map = new HashMap();
        final Cursor cursorQuery = context.getContentResolver().query(CalendarContract.ExtendedProperties.CONTENT_URI, null, null, null, null);
        if (cursorQuery == null) {
            map.put("ext_empty", "1");
            return map;
        }
        if (cursorQuery.getCount() > 0) {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("event_id"));
                if (string != null && string.equals(eventId + "")) {
                    Arrays.stream(cursorQuery.getColumnNames()).forEach(new Consumer() { // from class: cn.jianyun.workplan.util.CalendarReminderUtils$$ExternalSyntheticLambda0
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Map map2 = map;
                            Cursor cursor = cursorQuery;
                            String str = (String) obj;
                            map2.put("ext_" + str, cursor.getString(cursor.getColumnIndex(str)));
                        }
                    });
                }
                cursorQuery.moveToNext();
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return map;
    }

    public static void cleanCalendarEvent(Context context) {
        int i;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(CALENDER_EVENT_URL), null, null, null, null);
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                cursorQuery.close();
                return;
            }
            return;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                while (!cursorQuery.isAfterLast()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("organizer"));
                        if ((CALENDARS_NAME.equals(string) || "Plan_Schedule".equals(string)) && (i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))) > 0 && context.getContentResolver().delete(ContentUris.withAppendedId(Uri.parse(CALENDER_EVENT_URL), i), null, null) > -1) {
                            CommonToolKt.mlog("删除事件成功");
                        }
                    } catch (Exception e2) {
                        CommonToolKt.mlog("clean Error", e2);
                    }
                    cursorQuery.moveToNext();
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}