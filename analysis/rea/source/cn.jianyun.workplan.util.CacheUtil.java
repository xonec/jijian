package cn.jianyun.workplan.util;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CacheUtil {
    public static void remove(Context context, String key) {
        FileUtil.remove(context, key);
    }

    public static void appendDebugInfo(Context context, String data, boolean debug) {
        if (debug) {
            String str = get(context, "debugInfo", true);
            System.out.println(str);
            String string = str + MyDateTool.toShortTimeString(new Date()) + ": " + data + "\n\n";
            if (string.length() > 1000) {
                String[] strArrSplit = string.split("\n");
                StringBuffer stringBuffer = new StringBuffer();
                for (int length = strArrSplit.length / 2; length < strArrSplit.length; length++) {
                    stringBuffer.append(strArrSplit[length] + "\n");
                }
                string = stringBuffer.toString();
            }
            set(context, "debugInfo", string);
        }
        Log.d("timetable", data);
    }

    public static void remove(Context context, String key, String module) {
        remove(context, group(key, module));
    }

    public static void set(Context context, String key, String value) {
        FileUtil.saveData(context, key, value);
    }

    public static void set(Context context, String key, String module, String value) {
        FileUtil.saveData(context, group(key, module), value);
    }

    public static void setInt(Context context, String key, Integer k) {
        set(context, key, k == null ? "" : String.valueOf(k));
    }

    public static void setInt(Context context, String key, String module, Integer k) {
        set(context, key, module, k == null ? "" : String.valueOf(k));
    }

    public static void setBoolean(Context context, String key, Boolean k) {
        set(context, key, k == null ? "" : String.valueOf(k));
    }

    public static void setDouble(Context context, String key, Double k) {
        set(context, key, k == null ? "" : String.valueOf(k));
    }

    public static void setLong(Context context, String key, Long k) {
        set(context, key, k == null ? "" : String.valueOf(k));
    }

    public static String get(Context context, String key, boolean withBreak) {
        return FileUtil.loadData(context, key, withBreak);
    }

    public static String get(Context context, String key) {
        return FileUtil.loadData(context, key, false);
    }

    public static String get(Context context, String key, String module) {
        return get(context, group(key, module));
    }

    public static String getWithDefault(Context context, String key, String defaultValue) {
        String str = get(context, key);
        return MyStringTool.isBlank(str) ? defaultValue : str;
    }

    public static Integer getInt(Context context, String key, Integer defaultValue) {
        return MyDataTool.toInteger(get(context, key), defaultValue);
    }

    public static boolean getBoolean(Context context, String key) {
        return MyDataTool.toBoolean(get(context, key));
    }

    public static Double getDouble(Context context, String key, Double defaultValue) {
        return MyDataTool.toDouble(get(context, key), defaultValue);
    }

    public static Long getLong(Context context, String key, Long defaultValue) {
        return MyDataTool.toLong(get(context, key), defaultValue);
    }

    public static void setJson(Context context, String key, Object value) {
        set(context, key, JSON.toJSONString(value));
    }

    public static <T> T getObject(Context context, String str, Class<T> cls) {
        try {
            return (T) JSON.parseObject(get(context, str), (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setJson(Context context, String key, String module, Object value) {
        setJson(context, group(key, module), value);
    }

    public static <T> T getObject(Context context, String str, String str2, Class<T> cls) {
        return (T) getObject(context, group(str, str2), cls);
    }

    public static <T> List<T> getArrayObject(Context context, String key, Class<T> cls) {
        try {
            List<T> array = JSON.parseArray(get(context, key), (Class) cls);
            return array == null ? new ArrayList() : array;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static String group(String key, String module) {
        return key + "__" + module;
    }

    public static boolean isDebug(Context context) {
        return getBoolean(context, "debug");
    }
}