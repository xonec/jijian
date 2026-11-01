package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes2.dex */
public class UIUtil {
    public static int getResourceColor(Context context, int colorResId) {
        try {
            return ContextCompat.getColor(context, colorResId);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int dip2px(Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int sp2px(Context context, float spValue) {
        return (int) TypedValue.applyDimension(2, spValue, context.getResources().getDisplayMetrics());
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }
}