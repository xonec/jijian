package cn.jianyun.replica.nativeplugin;

import android.Manifest;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.provider.DocumentsContract;
import android.provider.CalendarContract.Calendars;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Reminders;
import android.text.TextUtils;
import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/**
 * 极简排班（复刻）原生桥接：本地通知 + 系统日历。
 * 避免 plus.android 在 ContentValues / Notification.Builder 上的桥接限制。
 */
public class JYNativeModule extends UniModule {
    private static final String CHANNEL_ID = "jy_reminder";

    private Context ctx() {
        if (mUniSDKInstance != null && mUniSDKInstance.getContext() != null) {
            return mUniSDKInstance.getContext();
        }
        if (mWXSDKInstance != null) return mWXSDKInstance.getContext();
        return null;
    }

    private static Map<String, Object> ok() {
        Map<String, Object> m = new HashMap<>();
        m.put("success", true);
        return m;
    }

    private static Map<String, Object> error(String code, String msg) {
        Map<String, Object> m = new HashMap<>();
        m.put("success", false);
        m.put("code", code);
        m.put("error", msg == null ? "" : msg);
        return m;
    }

    private void reply(UniJSCallback cb, Map<String, Object> data) {
        if (cb != null) cb.invoke(data);
    }

    @UniJSMethod(uiThread = true)
    public void notify(String title, String content, UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            if (Build.VERSION.SDK_INT >= 33 &&
                    c.checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                reply(callback, error("NO_NOTIFICATION_PERMISSION", "未授权通知权限"));
                return;
            }
            String t = TextUtils.isEmpty(title) ? "极简排班提醒" : title;
            String s = TextUtils.isEmpty(content) ? "该处理提醒了" : content;
            NotificationManager nm = (NotificationManager) c.getSystemService(Context.NOTIFICATION_SERVICE);
            if (nm == null) { reply(callback, error("NO_NOTIFICATION_SERVICE", "通知服务不可用")); return; }
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "排班提醒", NotificationManager.IMPORTANCE_HIGH);
                channel.setDescription("极简排班的本地提醒");
                nm.createNotificationChannel(channel);
            }
            Notification.Builder b;
            if (Build.VERSION.SDK_INT >= 26) b = new Notification.Builder(c, CHANNEL_ID);
            else b = new Notification.Builder(c);
            int icon = c.getApplicationInfo().icon;
            if (icon == 0) icon = android.R.drawable.ic_dialog_info;
            b.setSmallIcon(icon).setContentTitle(t).setContentText(s).setAutoCancel(true);
            nm.notify((int) (System.currentTimeMillis() % 100000), b.build());
            Map<String, Object> r = ok();
            r.put("via", "native");
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("NOTIFY_FAILED", String.valueOf(e.getMessage())));
        }
    }

    private boolean hasCalendarPermission(Context c) {
        return c.checkSelfPermission(Manifest.permission.READ_CALENDAR) == PackageManager.PERMISSION_GRANTED
                && c.checkSelfPermission(Manifest.permission.WRITE_CALENDAR) == PackageManager.PERMISSION_GRANTED;
    }

    private long findWritableCalendar(ContentResolver cr) {
        Cursor cursor = null;
        try {
            String[] projection = new String[]{
                    Calendars._ID, Calendars.CALENDAR_ACCESS_LEVEL, Calendars.VISIBLE, Calendars.IS_PRIMARY
            };
            cursor = cr.query(Calendars.CONTENT_URI, projection, null, null, null);
            if (cursor == null) return 0;
            long fallback = 0;
            while (cursor.moveToNext()) {
                long id = cursor.getLong(0);
                int level = cursor.getInt(1);
                int visible = cursor.getInt(2);
                int primary = cursor.getInt(3);
                if (id <= 0 || level < Calendars.CAL_ACCESS_OWNER) continue;
                if (visible == 1 || primary == 1) return id;
                if (fallback == 0) fallback = id;
            }
            return fallback;
        } catch (Throwable e) {
            return 0;
        } finally {
            if (cursor != null) cursor.close();
        }
    }

    private long createLocalCalendar(ContentResolver cr) {
        ContentValues cv = new ContentValues();
        cv.put(Calendars.ACCOUNT_NAME, "JianyunReplica");
        cv.put(Calendars.ACCOUNT_TYPE, "LOCAL");
        cv.put(Calendars.NAME, "极简排班");
        cv.put(Calendars.CALENDAR_DISPLAY_NAME, "极简排班");
        cv.put(Calendars.CALENDAR_COLOR, -11158646);
        cv.put(Calendars.CALENDAR_ACCESS_LEVEL, Calendars.CAL_ACCESS_OWNER);
        cv.put(Calendars.OWNER_ACCOUNT, "JianyunReplica");
        cv.put(Calendars.VISIBLE, 1);
        cv.put(Calendars.SYNC_EVENTS, 1);
        Uri uri = Calendars.CONTENT_URI.buildUpon()
                .appendQueryParameter(CalendarContract.CALLER_IS_SYNCADAPTER, "true")
                .appendQueryParameter(Calendars.ACCOUNT_NAME, "JianyunReplica")
                .appendQueryParameter(Calendars.ACCOUNT_TYPE, "LOCAL")
                .build();
        Uri newUri = cr.insert(uri, cv);
        return newUri == null ? 0 : ContentUris.parseId(newUri);
    }

    @UniJSMethod(uiThread = true)
    public void addCalendarEvent(String title, double beginMs, double endMs, String description, UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            if (!hasCalendarPermission(c)) {
                reply(callback, error("NO_CALENDAR_PERMISSION", "未授权日历读写权限"));
                return;
            }
            ContentResolver cr = c.getContentResolver();
            long calendarId = findWritableCalendar(cr);
            if (calendarId == 0) calendarId = createLocalCalendar(cr);
            if (calendarId == 0) { reply(callback, error("NO_CALENDAR", "没有可写入的系统日历")); return; }

            ContentValues ev = new ContentValues();
            ev.put(Events.CALENDAR_ID, calendarId);
            ev.put(Events.TITLE, TextUtils.isEmpty(title) ? "极简排班提醒" : title);
            ev.put(Events.DESCRIPTION, description == null ? "" : description);
            ev.put(Events.DTSTART, (long) beginMs);
            ev.put(Events.DTEND, (long) endMs);
            ev.put(Events.EVENT_TIMEZONE, TimeZone.getDefault().getID());
            ev.put(Events.HAS_ALARM, 1);
            Uri eventUri = cr.insert(Events.CONTENT_URI, ev);
            if (eventUri == null) { reply(callback, error("INSERT_EVENT_FAILED", "写入日历事件失败")); return; }
            long eventId = ContentUris.parseId(eventUri);

            ContentValues rem = new ContentValues();
            rem.put(Reminders.EVENT_ID, eventId);
            rem.put(Reminders.MINUTES, 0);
            rem.put(Reminders.METHOD, Reminders.METHOD_ALERT);
            try { cr.insert(Reminders.CONTENT_URI, rem); } catch (Throwable ignored) {}

            Map<String, Object> r = ok();
            r.put("eventId", String.valueOf(eventId));
            r.put("calendarId", String.valueOf(calendarId));
            r.put("start", (long) beginMs);
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("ADD_CALENDAR_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void deleteCalendarEvent(String eventId, UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            if (!hasCalendarPermission(c)) { reply(callback, error("NO_CALENDAR_PERMISSION", "未授权日历读写权限")); return; }
            long id;
            try { id = Long.parseLong(eventId); } catch (Throwable e) { reply(callback, error("BAD_EVENT_ID", "事件 ID 无效")); return; }
            Uri uri = ContentUris.withAppendedId(Events.CONTENT_URI, id);
            int n = c.getContentResolver().delete(uri, null, null);
            Map<String, Object> r = ok();
            r.put("removed", n > 0);
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("DELETE_CALENDAR_FAILED", String.valueOf(e.getMessage())));
        }
    }


    /** 启动系统目录选择 Activity；结果写入 SharedPreferences，需调用 getDirectory 读取 */
    @UniJSMethod(uiThread = true)
    public void clearDirectory(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            c.getSharedPreferences(SafPickerActivity.PREFS, Context.MODE_PRIVATE).edit().remove(SafPickerActivity.KEY_URI).apply();
            reply(callback, ok());
        } catch (Throwable e) {
            reply(callback, error("CLEAR_DIR_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void chooseDirectory(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            c.getSharedPreferences(SafPickerActivity.PREFS, Context.MODE_PRIVATE).edit().remove(SafPickerActivity.KEY_URI).apply();
            Intent intent = new Intent(c, SafPickerActivity.class);
            if (!(c instanceof Activity)) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c.startActivity(intent);
            reply(callback, ok());
        } catch (Throwable e) {
            reply(callback, error("CHOOSE_DIR_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void getDirectory(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            SharedPreferences sp = c.getSharedPreferences(SafPickerActivity.PREFS, Context.MODE_PRIVATE);
            String uri = sp.getString(SafPickerActivity.KEY_URI, "");
            Map<String, Object> r = ok();
            r.put("uri", uri == null ? "" : uri);
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("GET_DIR_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void writeBackup(String uriString, String fileName, String content, UniJSCallback callback) {
        OutputStream out = null;
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            if (TextUtils.isEmpty(uriString)) { reply(callback, error("NO_DIR", "未选择系统目录")); return; }
            String name = TextUtils.isEmpty(fileName) ? "backup.json" : fileName.replace("/", "_");
            Uri treeUri = Uri.parse(uriString);
            Uri fileUri = DocumentsContract.createDocument(c.getContentResolver(), treeUri, "application/json", name);
            if (fileUri == null) { reply(callback, error("CREATE_FILE_FAILED", "无法创建备份文件")); return; }
            out = c.getContentResolver().openOutputStream(fileUri);
            if (out == null) { reply(callback, error("OPEN_STREAM_FAILED", "无法写入备份文件")); return; }
            out.write(String.valueOf(content).getBytes("UTF-8"));
            out.flush();
            Map<String, Object> r = ok();
            r.put("uri", fileUri.toString());
            r.put("name", name);
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("WRITE_BACKUP_FAILED", String.valueOf(e.getMessage())));
        } finally {
            try { if (out != null) out.close(); } catch (Throwable ignored) {}
        }
    }

    @UniJSMethod(uiThread = true)
    public void exportBackup(String fileName, String content, UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            c.getSharedPreferences(SafExportActivity.PREFS, Context.MODE_PRIVATE).edit().clear().apply();
            Intent intent = new Intent(c, SafExportActivity.class);
            intent.putExtra("fileName", fileName == null || fileName.isEmpty() ? "backup.json" : fileName);
            intent.putExtra("content", content == null ? "" : content);
            if (!(c instanceof Activity)) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c.startActivity(intent);
            reply(callback, ok());
        } catch (Throwable e) {
            reply(callback, error("EXPORT_BACKUP_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void getExportResult(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            SharedPreferences sp = c.getSharedPreferences(SafExportActivity.PREFS, Context.MODE_PRIVATE);
            Map<String, Object> r = ok();
            r.put("status", sp.getString(SafExportActivity.KEY_STATUS, ""));
            r.put("name", sp.getString(SafExportActivity.KEY_NAME, ""));
            r.put("error", sp.getString(SafExportActivity.KEY_ERROR, ""));
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("GET_EXPORT_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void importBackup(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            c.getSharedPreferences(SafImportActivity.PREFS, Context.MODE_PRIVATE).edit().clear().apply();
            Intent intent = new Intent(c, SafImportActivity.class);
            if (!(c instanceof Activity)) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            c.startActivity(intent);
            reply(callback, ok());
        } catch (Throwable e) {
            reply(callback, error("IMPORT_BACKUP_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void getImportResult(UniJSCallback callback) {
        try {
            Context c = ctx();
            if (c == null) { reply(callback, error("NO_CONTEXT", "无法获取 Context")); return; }
            SharedPreferences sp = c.getSharedPreferences(SafImportActivity.PREFS, Context.MODE_PRIVATE);
            Map<String, Object> r = ok();
            r.put("status", sp.getString(SafImportActivity.KEY_STATUS, ""));
            r.put("name", sp.getString(SafImportActivity.KEY_NAME, ""));
            r.put("content", sp.getString(SafImportActivity.KEY_CONTENT, ""));
            r.put("error", sp.getString(SafImportActivity.KEY_ERROR, ""));
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("GET_IMPORT_FAILED", String.valueOf(e.getMessage())));
        }
    }

    @UniJSMethod(uiThread = true)
    public void getStatus(UniJSCallback callback) {
        try {
            Context c = ctx();
            Map<String, Object> r = ok();
            r.put("calendar", c != null && hasCalendarPermission(c));
            r.put("notification", c != null && (Build.VERSION.SDK_INT < 33 ||
                    c.checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED));
            reply(callback, r);
        } catch (Throwable e) {
            reply(callback, error("STATUS_FAILED", String.valueOf(e.getMessage())));
        }
    }
}
