package cn.jianyun.workplan.widget;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetDataModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0006\u0010H\u001a\u00020IR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006J"}, d2 = {"Lcn/jianyun/workplan/widget/DefaultWidgetConfig;", "", "headerBg", "", "headerTextColor", "bgColor", "textColor", "tintColor", "markColor", "darkHeaderBg", "darkHeaderTextColor", "darkBgColor", "darkTextColor", "darkTintColor", "darkMarkColor", "headerOpacity", "", "opacity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FF)V", "getBgColor", "()Ljava/lang/String;", "setBgColor", "(Ljava/lang/String;)V", "getDarkBgColor", "setDarkBgColor", "getDarkHeaderBg", "setDarkHeaderBg", "getDarkHeaderTextColor", "setDarkHeaderTextColor", "getDarkMarkColor", "setDarkMarkColor", "getDarkTextColor", "setDarkTextColor", "getDarkTintColor", "setDarkTintColor", "getHeaderBg", "setHeaderBg", "getHeaderOpacity", "()F", "setHeaderOpacity", "(F)V", "getHeaderTextColor", "setHeaderTextColor", "getMarkColor", "setMarkColor", "getOpacity", "setOpacity", "getTextColor", "setTextColor", "getTintColor", "setTintColor", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "toWidgetConfig", "Lcn/jianyun/workplan/widget/WidgetConfig;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DefaultWidgetConfig {
    public static final int $stable = 8;
    private String bgColor;
    private String darkBgColor;
    private String darkHeaderBg;
    private String darkHeaderTextColor;
    private String darkMarkColor;
    private String darkTextColor;
    private String darkTintColor;
    private String headerBg;
    private float headerOpacity;
    private String headerTextColor;
    private String markColor;
    private float opacity;
    private String textColor;
    private String tintColor;

    public DefaultWidgetConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderBg() {
        return this.headerBg;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDarkTextColor() {
        return this.darkTextColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDarkTintColor() {
        return this.darkTintColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDarkMarkColor() {
        return this.darkMarkColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getHeaderOpacity() {
        return this.headerOpacity;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarkColor() {
        return this.markColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDarkHeaderBg() {
        return this.darkHeaderBg;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDarkHeaderTextColor() {
        return this.darkHeaderTextColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDarkBgColor() {
        return this.darkBgColor;
    }

    public final DefaultWidgetConfig copy(String headerBg, String headerTextColor, String bgColor, String textColor, String tintColor, String markColor, String darkHeaderBg, String darkHeaderTextColor, String darkBgColor, String darkTextColor, String darkTintColor, String darkMarkColor, float headerOpacity, float opacity) {
        Intrinsics.checkNotNullParameter(headerBg, "headerBg");
        Intrinsics.checkNotNullParameter(headerTextColor, "headerTextColor");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        Intrinsics.checkNotNullParameter(markColor, "markColor");
        Intrinsics.checkNotNullParameter(darkHeaderBg, "darkHeaderBg");
        Intrinsics.checkNotNullParameter(darkHeaderTextColor, "darkHeaderTextColor");
        Intrinsics.checkNotNullParameter(darkBgColor, "darkBgColor");
        Intrinsics.checkNotNullParameter(darkTextColor, "darkTextColor");
        Intrinsics.checkNotNullParameter(darkTintColor, "darkTintColor");
        Intrinsics.checkNotNullParameter(darkMarkColor, "darkMarkColor");
        return new DefaultWidgetConfig(headerBg, headerTextColor, bgColor, textColor, tintColor, markColor, darkHeaderBg, darkHeaderTextColor, darkBgColor, darkTextColor, darkTintColor, darkMarkColor, headerOpacity, opacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultWidgetConfig)) {
            return false;
        }
        DefaultWidgetConfig defaultWidgetConfig = (DefaultWidgetConfig) other;
        return Intrinsics.areEqual(this.headerBg, defaultWidgetConfig.headerBg) && Intrinsics.areEqual(this.headerTextColor, defaultWidgetConfig.headerTextColor) && Intrinsics.areEqual(this.bgColor, defaultWidgetConfig.bgColor) && Intrinsics.areEqual(this.textColor, defaultWidgetConfig.textColor) && Intrinsics.areEqual(this.tintColor, defaultWidgetConfig.tintColor) && Intrinsics.areEqual(this.markColor, defaultWidgetConfig.markColor) && Intrinsics.areEqual(this.darkHeaderBg, defaultWidgetConfig.darkHeaderBg) && Intrinsics.areEqual(this.darkHeaderTextColor, defaultWidgetConfig.darkHeaderTextColor) && Intrinsics.areEqual(this.darkBgColor, defaultWidgetConfig.darkBgColor) && Intrinsics.areEqual(this.darkTextColor, defaultWidgetConfig.darkTextColor) && Intrinsics.areEqual(this.darkTintColor, defaultWidgetConfig.darkTintColor) && Intrinsics.areEqual(this.darkMarkColor, defaultWidgetConfig.darkMarkColor) && Float.compare(this.headerOpacity, defaultWidgetConfig.headerOpacity) == 0 && Float.compare(this.opacity, defaultWidgetConfig.opacity) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.headerBg.hashCode() * 31) + this.headerTextColor.hashCode()) * 31) + this.bgColor.hashCode()) * 31) + this.textColor.hashCode()) * 31) + this.tintColor.hashCode()) * 31) + this.markColor.hashCode()) * 31) + this.darkHeaderBg.hashCode()) * 31) + this.darkHeaderTextColor.hashCode()) * 31) + this.darkBgColor.hashCode()) * 31) + this.darkTextColor.hashCode()) * 31) + this.darkTintColor.hashCode()) * 31) + this.darkMarkColor.hashCode()) * 31) + Float.hashCode(this.headerOpacity)) * 31) + Float.hashCode(this.opacity);
    }

    public String toString() {
        return "DefaultWidgetConfig(headerBg=" + this.headerBg + ", headerTextColor=" + this.headerTextColor + ", bgColor=" + this.bgColor + ", textColor=" + this.textColor + ", tintColor=" + this.tintColor + ", markColor=" + this.markColor + ", darkHeaderBg=" + this.darkHeaderBg + ", darkHeaderTextColor=" + this.darkHeaderTextColor + ", darkBgColor=" + this.darkBgColor + ", darkTextColor=" + this.darkTextColor + ", darkTintColor=" + this.darkTintColor + ", darkMarkColor=" + this.darkMarkColor + ", headerOpacity=" + this.headerOpacity + ", opacity=" + this.opacity + ")";
    }

    public DefaultWidgetConfig(String headerBg, String headerTextColor, String bgColor, String textColor, String tintColor, String markColor, String darkHeaderBg, String darkHeaderTextColor, String darkBgColor, String darkTextColor, String darkTintColor, String darkMarkColor, float f2, float f3) {
        Intrinsics.checkNotNullParameter(headerBg, "headerBg");
        Intrinsics.checkNotNullParameter(headerTextColor, "headerTextColor");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        Intrinsics.checkNotNullParameter(markColor, "markColor");
        Intrinsics.checkNotNullParameter(darkHeaderBg, "darkHeaderBg");
        Intrinsics.checkNotNullParameter(darkHeaderTextColor, "darkHeaderTextColor");
        Intrinsics.checkNotNullParameter(darkBgColor, "darkBgColor");
        Intrinsics.checkNotNullParameter(darkTextColor, "darkTextColor");
        Intrinsics.checkNotNullParameter(darkTintColor, "darkTintColor");
        Intrinsics.checkNotNullParameter(darkMarkColor, "darkMarkColor");
        this.headerBg = headerBg;
        this.headerTextColor = headerTextColor;
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.tintColor = tintColor;
        this.markColor = markColor;
        this.darkHeaderBg = darkHeaderBg;
        this.darkHeaderTextColor = darkHeaderTextColor;
        this.darkBgColor = darkBgColor;
        this.darkTextColor = darkTextColor;
        this.darkTintColor = darkTintColor;
        this.darkMarkColor = darkMarkColor;
        this.headerOpacity = f2;
        this.opacity = f3;
    }

    public /* synthetic */ DefaultWidgetConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#55BB8A" : str, (i & 2) != 0 ? "#FFFFFF" : str2, (i & 4) != 0 ? "#FFFFFF" : str3, (i & 8) != 0 ? "#111111" : str4, (i & 16) != 0 ? "#111111" : str5, (i & 32) == 0 ? str6 : "#111111", (i & 64) != 0 ? "#22352D" : str7, (i & 128) == 0 ? str8 : "#FFFFFF", (i & 256) != 0 ? "#141414" : str9, (i & 512) != 0 ? "#F5F5F5" : str10, (i & 1024) != 0 ? "#D8D8D8" : str11, (i & 2048) == 0 ? str12 : "#D8D8D8", (i & 4096) != 0 ? 1.0f : f2, (i & 8192) == 0 ? f3 : 1.0f);
    }

    public final String getHeaderBg() {
        return this.headerBg;
    }

    public final void setHeaderBg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerBg = str;
    }

    public final String getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final void setHeaderTextColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerTextColor = str;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final void setBgColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bgColor = str;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textColor = str;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    public final void setTintColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tintColor = str;
    }

    public final String getMarkColor() {
        return this.markColor;
    }

    public final void setMarkColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.markColor = str;
    }

    public final String getDarkHeaderBg() {
        return this.darkHeaderBg;
    }

    public final void setDarkHeaderBg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkHeaderBg = str;
    }

    public final String getDarkHeaderTextColor() {
        return this.darkHeaderTextColor;
    }

    public final void setDarkHeaderTextColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkHeaderTextColor = str;
    }

    public final String getDarkBgColor() {
        return this.darkBgColor;
    }

    public final void setDarkBgColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkBgColor = str;
    }

    public final String getDarkTextColor() {
        return this.darkTextColor;
    }

    public final void setDarkTextColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkTextColor = str;
    }

    public final String getDarkTintColor() {
        return this.darkTintColor;
    }

    public final void setDarkTintColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkTintColor = str;
    }

    public final String getDarkMarkColor() {
        return this.darkMarkColor;
    }

    public final void setDarkMarkColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkMarkColor = str;
    }

    public final float getHeaderOpacity() {
        return this.headerOpacity;
    }

    public final void setHeaderOpacity(float f2) {
        this.headerOpacity = f2;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final void setOpacity(float f2) {
        this.opacity = f2;
    }

    public final WidgetConfig toWidgetConfig() {
        return new WidgetConfig(this.headerBg, this.headerTextColor, this.bgColor, this.textColor, this.tintColor, this.markColor, this.darkHeaderBg, this.darkHeaderTextColor, this.darkBgColor, this.darkTextColor, this.darkTintColor, this.darkMarkColor, this.headerOpacity, this.opacity, false, false, false, false, false, false, false, null, null, null, 16760832, null);
    }
}