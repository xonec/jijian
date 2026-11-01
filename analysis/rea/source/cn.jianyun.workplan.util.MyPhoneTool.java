package cn.jianyun.workplan.util;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyPhoneTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0015\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcn/jianyun/workplan/util/MyPhoneTool;", "", "()V", "getBrand", "", "getDeviceName", "getDid", "getManufacturer", "getModelName", "getSDKVersion", "getSystemLanguage", "getSystemLanguageList", "", "Ljava/util/Locale;", "()[Ljava/util/Locale;", "getSystemVersion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MyPhoneTool {
    public static final int $stable = 0;
    public static final MyPhoneTool INSTANCE = new MyPhoneTool();

    private MyPhoneTool() {
    }

    public final String getDeviceName() {
        try {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            return DEVICE;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getModelName() {
        try {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            return MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getSystemVersion() {
        try {
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            return RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getBrand() {
        try {
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            return BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getManufacturer() {
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            return MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getSDKVersion() {
        try {
            String SDK = Build.VERSION.SDK;
            Intrinsics.checkNotNullExpressionValue(SDK, "SDK");
            return SDK;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getSystemLanguage() {
        try {
            String language = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
            return language;
        } catch (Exception unused) {
            return "";
        }
    }

    public final Locale[] getSystemLanguageList() {
        return Locale.getAvailableLocales();
    }

    public final String getDid() {
        return getBrand() + getModelName() + getSystemVersion() + getSDKVersion();
    }
}