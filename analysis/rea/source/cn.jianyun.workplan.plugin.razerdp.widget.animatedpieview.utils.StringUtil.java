package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtil {
    public static boolean noEmpty(String source) {
        return !TextUtils.isEmpty(source);
    }

    public static boolean isEmptyWithNull(String source) {
        return TextUtils.isEmpty(source) || TextUtils.equals(source, "null") || TextUtils.equals(source, "Null") || TextUtils.equals(source, "NULL");
    }

    public static String trim(String source) {
        return noEmpty(source) ? source.trim() : source;
    }
}