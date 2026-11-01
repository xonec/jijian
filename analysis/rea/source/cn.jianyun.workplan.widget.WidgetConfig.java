package cn.jianyun.workplan.widget;

import androidx.compose.ui.graphics.Color;
import androidx.core.view.ViewCompat;
import androidx.glance.color.DayNightColorProvider;
import androidx.glance.unit.ColorProvider;
import cn.jianyun.workplan.util.CommonToolKt;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetDataModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\u0006\u0010T\u001a\u00020UJ\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0010HÆ\u0003J\t\u0010[\u001a\u00020\u0010HÆ\u0003J\t\u0010\\\u001a\u00020\u0013HÆ\u0003J\t\u0010]\u001a\u00020\u0013HÆ\u0003J\t\u0010^\u001a\u00020\u0013HÆ\u0003J\t\u0010_\u001a\u00020\u0013HÆ\u0003J\t\u0010`\u001a\u00020\u0013HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0013HÆ\u0003J\t\u0010c\u001a\u00020\u0013HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003Jù\u0001\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010o\u001a\u00020\u00132\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020rHÖ\u0001J\u0006\u0010s\u001a\u00020UJ\u0006\u0010t\u001a\u00020UJ\u0006\u0010u\u001a\u00020UJ\u0006\u0010v\u001a\u00020UJ\u0006\u0010w\u001a\u00020UJ\t\u0010x\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00103\"\u0004\b?\u00105R\u001a\u0010\u0015\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R\u001a\u0010\u0016\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010;\"\u0004\bG\u0010=R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010!R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010!R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010!¨\u0006y"}, d2 = {"Lcn/jianyun/workplan/widget/WidgetConfig;", "", "headerBg", "", "headerTextColor", "bgColor", "textColor", "tintColor", "markColor", "darkHeaderBg", "darkHeaderTextColor", "darkBgColor", "darkTextColor", "darkTintColor", "darkMarkColor", "headerOpacity", "", "opacity", "mondayFirst", "", "showRemark", "showBeginTime", "showEndTime", "showLunar", "showLine", "showFestival", "dateFontSize", "workFontSize", "timeFontSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBgColor", "()Ljava/lang/String;", "setBgColor", "(Ljava/lang/String;)V", "getDarkBgColor", "setDarkBgColor", "getDarkHeaderBg", "setDarkHeaderBg", "getDarkHeaderTextColor", "setDarkHeaderTextColor", "getDarkMarkColor", "setDarkMarkColor", "getDarkTextColor", "setDarkTextColor", "getDarkTintColor", "setDarkTintColor", "getDateFontSize", "setDateFontSize", "getHeaderBg", "setHeaderBg", "getHeaderOpacity", "()F", "setHeaderOpacity", "(F)V", "getHeaderTextColor", "setHeaderTextColor", "getMarkColor", "setMarkColor", "getMondayFirst", "()Z", "setMondayFirst", "(Z)V", "getOpacity", "setOpacity", "getShowBeginTime", "setShowBeginTime", "getShowEndTime", "setShowEndTime", "getShowFestival", "setShowFestival", "getShowLine", "setShowLine", "getShowLunar", "setShowLunar", "getShowRemark", "setShowRemark", "getTextColor", "setTextColor", "getTimeFontSize", "setTimeFontSize", "getTintColor", "setTintColor", "getWorkFontSize", "setWorkFontSize", "bodyBgProvider", "Landroidx/glance/unit/ColorProvider;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "headerBgProvider", "headerTextProvider", "markProvider", "textProvider", "tintProvider", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WidgetConfig {
    public static final int $stable = 8;
    private String bgColor;
    private String darkBgColor;
    private String darkHeaderBg;
    private String darkHeaderTextColor;
    private String darkMarkColor;
    private String darkTextColor;
    private String darkTintColor;
    private String dateFontSize;
    private String headerBg;
    private float headerOpacity;
    private String headerTextColor;
    private String markColor;
    private boolean mondayFirst;
    private float opacity;
    private boolean showBeginTime;
    private boolean showEndTime;
    private boolean showFestival;
    private boolean showLine;
    private boolean showLunar;
    private boolean showRemark;
    private String textColor;
    private String timeFontSize;
    private String tintColor;
    private String workFontSize;

    public WidgetConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, false, false, false, false, false, false, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
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

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getMondayFirst() {
        return this.mondayFirst;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShowRemark() {
        return this.showRemark;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShowBeginTime() {
        return this.showBeginTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getShowEndTime() {
        return this.showEndTime;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getShowLunar() {
        return this.showLunar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getShowLine() {
        return this.showLine;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getShowFestival() {
        return this.showFestival;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDateFontSize() {
        return this.dateFontSize;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getWorkFontSize() {
        return this.workFontSize;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTimeFontSize() {
        return this.timeFontSize;
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

    public final WidgetConfig copy(String headerBg, String headerTextColor, String bgColor, String textColor, String tintColor, String markColor, String darkHeaderBg, String darkHeaderTextColor, String darkBgColor, String darkTextColor, String darkTintColor, String darkMarkColor, float headerOpacity, float opacity, boolean mondayFirst, boolean showRemark, boolean showBeginTime, boolean showEndTime, boolean showLunar, boolean showLine, boolean showFestival, String dateFontSize, String workFontSize, String timeFontSize) {
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
        Intrinsics.checkNotNullParameter(dateFontSize, "dateFontSize");
        Intrinsics.checkNotNullParameter(workFontSize, "workFontSize");
        Intrinsics.checkNotNullParameter(timeFontSize, "timeFontSize");
        return new WidgetConfig(headerBg, headerTextColor, bgColor, textColor, tintColor, markColor, darkHeaderBg, darkHeaderTextColor, darkBgColor, darkTextColor, darkTintColor, darkMarkColor, headerOpacity, opacity, mondayFirst, showRemark, showBeginTime, showEndTime, showLunar, showLine, showFestival, dateFontSize, workFontSize, timeFontSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetConfig)) {
            return false;
        }
        WidgetConfig widgetConfig = (WidgetConfig) other;
        return Intrinsics.areEqual(this.headerBg, widgetConfig.headerBg) && Intrinsics.areEqual(this.headerTextColor, widgetConfig.headerTextColor) && Intrinsics.areEqual(this.bgColor, widgetConfig.bgColor) && Intrinsics.areEqual(this.textColor, widgetConfig.textColor) && Intrinsics.areEqual(this.tintColor, widgetConfig.tintColor) && Intrinsics.areEqual(this.markColor, widgetConfig.markColor) && Intrinsics.areEqual(this.darkHeaderBg, widgetConfig.darkHeaderBg) && Intrinsics.areEqual(this.darkHeaderTextColor, widgetConfig.darkHeaderTextColor) && Intrinsics.areEqual(this.darkBgColor, widgetConfig.darkBgColor) && Intrinsics.areEqual(this.darkTextColor, widgetConfig.darkTextColor) && Intrinsics.areEqual(this.darkTintColor, widgetConfig.darkTintColor) && Intrinsics.areEqual(this.darkMarkColor, widgetConfig.darkMarkColor) && Float.compare(this.headerOpacity, widgetConfig.headerOpacity) == 0 && Float.compare(this.opacity, widgetConfig.opacity) == 0 && this.mondayFirst == widgetConfig.mondayFirst && this.showRemark == widgetConfig.showRemark && this.showBeginTime == widgetConfig.showBeginTime && this.showEndTime == widgetConfig.showEndTime && this.showLunar == widgetConfig.showLunar && this.showLine == widgetConfig.showLine && this.showFestival == widgetConfig.showFestival && Intrinsics.areEqual(this.dateFontSize, widgetConfig.dateFontSize) && Intrinsics.areEqual(this.workFontSize, widgetConfig.workFontSize) && Intrinsics.areEqual(this.timeFontSize, widgetConfig.timeFontSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.headerBg.hashCode() * 31) + this.headerTextColor.hashCode()) * 31) + this.bgColor.hashCode()) * 31) + this.textColor.hashCode()) * 31) + this.tintColor.hashCode()) * 31) + this.markColor.hashCode()) * 31) + this.darkHeaderBg.hashCode()) * 31) + this.darkHeaderTextColor.hashCode()) * 31) + this.darkBgColor.hashCode()) * 31) + this.darkTextColor.hashCode()) * 31) + this.darkTintColor.hashCode()) * 31) + this.darkMarkColor.hashCode()) * 31) + Float.hashCode(this.headerOpacity)) * 31) + Float.hashCode(this.opacity)) * 31;
        boolean z = this.mondayFirst;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showRemark;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showBeginTime;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.showEndTime;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.showLunar;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.showLine;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = (i5 + r6) * 31;
        boolean z7 = this.showFestival;
        return ((((((i6 + (z7 ? 1 : z7)) * 31) + this.dateFontSize.hashCode()) * 31) + this.workFontSize.hashCode()) * 31) + this.timeFontSize.hashCode();
    }

    public String toString() {
        return "WidgetConfig(headerBg=" + this.headerBg + ", headerTextColor=" + this.headerTextColor + ", bgColor=" + this.bgColor + ", textColor=" + this.textColor + ", tintColor=" + this.tintColor + ", markColor=" + this.markColor + ", darkHeaderBg=" + this.darkHeaderBg + ", darkHeaderTextColor=" + this.darkHeaderTextColor + ", darkBgColor=" + this.darkBgColor + ", darkTextColor=" + this.darkTextColor + ", darkTintColor=" + this.darkTintColor + ", darkMarkColor=" + this.darkMarkColor + ", headerOpacity=" + this.headerOpacity + ", opacity=" + this.opacity + ", mondayFirst=" + this.mondayFirst + ", showRemark=" + this.showRemark + ", showBeginTime=" + this.showBeginTime + ", showEndTime=" + this.showEndTime + ", showLunar=" + this.showLunar + ", showLine=" + this.showLine + ", showFestival=" + this.showFestival + ", dateFontSize=" + this.dateFontSize + ", workFontSize=" + this.workFontSize + ", timeFontSize=" + this.timeFontSize + ")";
    }

    public WidgetConfig(String headerBg, String headerTextColor, String bgColor, String textColor, String tintColor, String markColor, String darkHeaderBg, String darkHeaderTextColor, String darkBgColor, String darkTextColor, String darkTintColor, String darkMarkColor, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String dateFontSize, String workFontSize, String timeFontSize) {
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
        Intrinsics.checkNotNullParameter(dateFontSize, "dateFontSize");
        Intrinsics.checkNotNullParameter(workFontSize, "workFontSize");
        Intrinsics.checkNotNullParameter(timeFontSize, "timeFontSize");
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
        this.mondayFirst = z;
        this.showRemark = z2;
        this.showBeginTime = z3;
        this.showEndTime = z4;
        this.showLunar = z5;
        this.showLine = z6;
        this.showFestival = z7;
        this.dateFontSize = dateFontSize;
        this.workFontSize = workFontSize;
        this.timeFontSize = timeFontSize;
    }

    public /* synthetic */ WidgetConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#55BB8A" : str, (i & 2) != 0 ? "#FFFFFF" : str2, (i & 4) != 0 ? "#FFFFFF" : str3, (i & 8) != 0 ? "#111111" : str4, (i & 16) != 0 ? "#111111" : str5, (i & 32) == 0 ? str6 : "#111111", (i & 64) != 0 ? "#22352D" : str7, (i & 128) == 0 ? str8 : "#FFFFFF", (i & 256) != 0 ? "#141414" : str9, (i & 512) != 0 ? "#F5F5F5" : str10, (i & 1024) != 0 ? "#D8D8D8" : str11, (i & 2048) == 0 ? str12 : "#D8D8D8", (i & 4096) != 0 ? 1.0f : f2, (i & 8192) == 0 ? f3 : 1.0f, (i & 16384) != 0 ? true : z, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? false : z3, (i & 131072) != 0 ? false : z4, (i & 262144) != 0 ? true : z5, (i & 524288) == 0 ? z6 : false, (i & 1048576) == 0 ? z7 : true, (i & 2097152) != 0 ? "17" : str13, (i & 4194304) != 0 ? "11" : str14, (i & 8388608) == 0 ? str15 : "11");
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

    public final boolean getMondayFirst() {
        return this.mondayFirst;
    }

    public final void setMondayFirst(boolean z) {
        this.mondayFirst = z;
    }

    public final boolean getShowRemark() {
        return this.showRemark;
    }

    public final void setShowRemark(boolean z) {
        this.showRemark = z;
    }

    public final boolean getShowBeginTime() {
        return this.showBeginTime;
    }

    public final void setShowBeginTime(boolean z) {
        this.showBeginTime = z;
    }

    public final boolean getShowEndTime() {
        return this.showEndTime;
    }

    public final void setShowEndTime(boolean z) {
        this.showEndTime = z;
    }

    public final boolean getShowLunar() {
        return this.showLunar;
    }

    public final void setShowLunar(boolean z) {
        this.showLunar = z;
    }

    public final boolean getShowLine() {
        return this.showLine;
    }

    public final void setShowLine(boolean z) {
        this.showLine = z;
    }

    public final boolean getShowFestival() {
        return this.showFestival;
    }

    public final void setShowFestival(boolean z) {
        this.showFestival = z;
    }

    public final String getDateFontSize() {
        return this.dateFontSize;
    }

    public final void setDateFontSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateFontSize = str;
    }

    public final String getWorkFontSize() {
        return this.workFontSize;
    }

    public final void setWorkFontSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.workFontSize = str;
    }

    public final String getTimeFontSize() {
        return this.timeFontSize;
    }

    public final void setTimeFontSize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeFontSize = str;
    }

    public final ColorProvider headerBgProvider() {
        return new DayNightColorProvider(Color.m3754copywmQWz5c$default(CommonToolKt.color(this.headerBg), this.headerOpacity, 0.0f, 0.0f, 0.0f, 14, null), Color.m3754copywmQWz5c$default(CommonToolKt.color(this.darkHeaderBg), this.headerOpacity, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public final ColorProvider headerTextProvider() {
        return new DayNightColorProvider(CommonToolKt.color(this.headerTextColor), CommonToolKt.color(this.darkHeaderTextColor), null);
    }

    public final ColorProvider bodyBgProvider() {
        return new DayNightColorProvider(Color.m3754copywmQWz5c$default(CommonToolKt.color(this.bgColor), this.opacity, 0.0f, 0.0f, 0.0f, 14, null), Color.m3754copywmQWz5c$default(CommonToolKt.color(this.darkBgColor), this.opacity, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public final ColorProvider textProvider() {
        return new DayNightColorProvider(CommonToolKt.color(this.textColor), CommonToolKt.color(this.darkTextColor), null);
    }

    public final ColorProvider tintProvider() {
        return new DayNightColorProvider(CommonToolKt.color(this.tintColor), CommonToolKt.color(this.darkTintColor), null);
    }

    public final ColorProvider markProvider() {
        return new DayNightColorProvider(CommonToolKt.color(this.markColor), CommonToolKt.color(this.darkMarkColor), null);
    }
}