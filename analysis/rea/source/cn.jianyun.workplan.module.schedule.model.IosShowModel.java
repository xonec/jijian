package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b[\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\u001eHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\t\u0010p\u001a\u00020\bHÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\u008d\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001J\u0013\u0010u\u001a\u00020\u00032\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010w\u001a\u00020\u001eHÖ\u0001J\t\u0010x\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010'\"\u0004\b?\u0010)R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010!\"\u0004\bO\u0010#R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010!\"\u0004\bY\u0010#¨\u0006y"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosShowModel;", "", "showLunar", "", "showFestival", "showRemark", "showHLine", "beginDay", "", "partnerUuid", "autoIcloud", "exportRemark", "exportCenter", "showWorkDurationStat", "showNextDuty", "screenshotMode", "allowCalendar", "disableAppAlarm", "showProjectName", "showSecondPlan", "showBeginTime", "showEndTime", "hideStat", "exportCalendar", "optimizeNotify", "bigSize", "needPartnerProject", "transparentWidgetMode", "partnerProjectUuid", "lines", "", "(ZZZZLjava/lang/String;Ljava/lang/String;ZZZZZZZZZZZZZZZZZZLjava/lang/String;I)V", "getAllowCalendar", "()Z", "setAllowCalendar", "(Z)V", "getAutoIcloud", "setAutoIcloud", "getBeginDay", "()Ljava/lang/String;", "setBeginDay", "(Ljava/lang/String;)V", "getBigSize", "setBigSize", "getDisableAppAlarm", "setDisableAppAlarm", "getExportCalendar", "setExportCalendar", "getExportCenter", "setExportCenter", "getExportRemark", "setExportRemark", "getHideStat", "setHideStat", "getLines", "()I", "setLines", "(I)V", "getNeedPartnerProject", "setNeedPartnerProject", "getOptimizeNotify", "setOptimizeNotify", "getPartnerProjectUuid", "setPartnerProjectUuid", "getPartnerUuid", "setPartnerUuid", "getScreenshotMode", "setScreenshotMode", "getShowBeginTime", "setShowBeginTime", "getShowEndTime", "setShowEndTime", "getShowFestival", "setShowFestival", "getShowHLine", "setShowHLine", "getShowLunar", "setShowLunar", "getShowNextDuty", "setShowNextDuty", "getShowProjectName", "setShowProjectName", "getShowRemark", "setShowRemark", "getShowSecondPlan", "setShowSecondPlan", "getShowWorkDurationStat", "setShowWorkDurationStat", "getTransparentWidgetMode", "setTransparentWidgetMode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosShowModel {
    public static final int $stable = 8;
    private boolean allowCalendar;
    private boolean autoIcloud;
    private String beginDay;
    private boolean bigSize;
    private boolean disableAppAlarm;
    private boolean exportCalendar;
    private boolean exportCenter;
    private boolean exportRemark;
    private boolean hideStat;
    private int lines;
    private boolean needPartnerProject;
    private boolean optimizeNotify;
    private String partnerProjectUuid;
    private String partnerUuid;
    private boolean screenshotMode;
    private boolean showBeginTime;
    private boolean showEndTime;
    private boolean showFestival;
    private boolean showHLine;
    private boolean showLunar;
    private boolean showNextDuty;
    private boolean showProjectName;
    private boolean showRemark;
    private boolean showSecondPlan;
    private boolean showWorkDurationStat;
    private boolean transparentWidgetMode;

    public IosShowModel() {
        this(false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, 67108863, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowLunar() {
        return this.showLunar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowWorkDurationStat() {
        return this.showWorkDurationStat;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShowNextDuty() {
        return this.showNextDuty;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getScreenshotMode() {
        return this.screenshotMode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getAllowCalendar() {
        return this.allowCalendar;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getDisableAppAlarm() {
        return this.disableAppAlarm;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShowProjectName() {
        return this.showProjectName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShowSecondPlan() {
        return this.showSecondPlan;
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
    public final boolean getHideStat() {
        return this.hideStat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowFestival() {
        return this.showFestival;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getExportCalendar() {
        return this.exportCalendar;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getOptimizeNotify() {
        return this.optimizeNotify;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getBigSize() {
        return this.bigSize;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getNeedPartnerProject() {
        return this.needPartnerProject;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getTransparentWidgetMode() {
        return this.transparentWidgetMode;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPartnerProjectUuid() {
        return this.partnerProjectUuid;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getLines() {
        return this.lines;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowRemark() {
        return this.showRemark;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowHLine() {
        return this.showHLine;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBeginDay() {
        return this.beginDay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPartnerUuid() {
        return this.partnerUuid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAutoIcloud() {
        return this.autoIcloud;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getExportRemark() {
        return this.exportRemark;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getExportCenter() {
        return this.exportCenter;
    }

    public final IosShowModel copy(boolean showLunar, boolean showFestival, boolean showRemark, boolean showHLine, String beginDay, String partnerUuid, boolean autoIcloud, boolean exportRemark, boolean exportCenter, boolean showWorkDurationStat, boolean showNextDuty, boolean screenshotMode, boolean allowCalendar, boolean disableAppAlarm, boolean showProjectName, boolean showSecondPlan, boolean showBeginTime, boolean showEndTime, boolean hideStat, boolean exportCalendar, boolean optimizeNotify, boolean bigSize, boolean needPartnerProject, boolean transparentWidgetMode, String partnerProjectUuid, int lines) {
        Intrinsics.checkNotNullParameter(beginDay, "beginDay");
        Intrinsics.checkNotNullParameter(partnerUuid, "partnerUuid");
        Intrinsics.checkNotNullParameter(partnerProjectUuid, "partnerProjectUuid");
        return new IosShowModel(showLunar, showFestival, showRemark, showHLine, beginDay, partnerUuid, autoIcloud, exportRemark, exportCenter, showWorkDurationStat, showNextDuty, screenshotMode, allowCalendar, disableAppAlarm, showProjectName, showSecondPlan, showBeginTime, showEndTime, hideStat, exportCalendar, optimizeNotify, bigSize, needPartnerProject, transparentWidgetMode, partnerProjectUuid, lines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosShowModel)) {
            return false;
        }
        IosShowModel iosShowModel = (IosShowModel) other;
        return this.showLunar == iosShowModel.showLunar && this.showFestival == iosShowModel.showFestival && this.showRemark == iosShowModel.showRemark && this.showHLine == iosShowModel.showHLine && Intrinsics.areEqual(this.beginDay, iosShowModel.beginDay) && Intrinsics.areEqual(this.partnerUuid, iosShowModel.partnerUuid) && this.autoIcloud == iosShowModel.autoIcloud && this.exportRemark == iosShowModel.exportRemark && this.exportCenter == iosShowModel.exportCenter && this.showWorkDurationStat == iosShowModel.showWorkDurationStat && this.showNextDuty == iosShowModel.showNextDuty && this.screenshotMode == iosShowModel.screenshotMode && this.allowCalendar == iosShowModel.allowCalendar && this.disableAppAlarm == iosShowModel.disableAppAlarm && this.showProjectName == iosShowModel.showProjectName && this.showSecondPlan == iosShowModel.showSecondPlan && this.showBeginTime == iosShowModel.showBeginTime && this.showEndTime == iosShowModel.showEndTime && this.hideStat == iosShowModel.hideStat && this.exportCalendar == iosShowModel.exportCalendar && this.optimizeNotify == iosShowModel.optimizeNotify && this.bigSize == iosShowModel.bigSize && this.needPartnerProject == iosShowModel.needPartnerProject && this.transparentWidgetMode == iosShowModel.transparentWidgetMode && Intrinsics.areEqual(this.partnerProjectUuid, iosShowModel.partnerProjectUuid) && this.lines == iosShowModel.lines;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    public int hashCode() {
        boolean z = this.showLunar;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showFestival;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showRemark;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.showHLine;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode = (((((i3 + r4) * 31) + this.beginDay.hashCode()) * 31) + this.partnerUuid.hashCode()) * 31;
        boolean z5 = this.autoIcloud;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i4 = (iHashCode + r5) * 31;
        boolean z6 = this.exportRemark;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i5 = (i4 + r6) * 31;
        boolean z7 = this.exportCenter;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i6 = (i5 + r7) * 31;
        boolean z8 = this.showWorkDurationStat;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i7 = (i6 + r8) * 31;
        boolean z9 = this.showNextDuty;
        ?? r9 = z9;
        if (z9) {
            r9 = 1;
        }
        int i8 = (i7 + r9) * 31;
        boolean z10 = this.screenshotMode;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i9 = (i8 + r10) * 31;
        boolean z11 = this.allowCalendar;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i10 = (i9 + r11) * 31;
        boolean z12 = this.disableAppAlarm;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        boolean z13 = this.showProjectName;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i12 = (i11 + r13) * 31;
        boolean z14 = this.showSecondPlan;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i13 = (i12 + r14) * 31;
        boolean z15 = this.showBeginTime;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i14 = (i13 + r15) * 31;
        boolean z16 = this.showEndTime;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i15 = (i14 + r16) * 31;
        boolean z17 = this.hideStat;
        ?? r17 = z17;
        if (z17) {
            r17 = 1;
        }
        int i16 = (i15 + r17) * 31;
        boolean z18 = this.exportCalendar;
        ?? r18 = z18;
        if (z18) {
            r18 = 1;
        }
        int i17 = (i16 + r18) * 31;
        boolean z19 = this.optimizeNotify;
        ?? r19 = z19;
        if (z19) {
            r19 = 1;
        }
        int i18 = (i17 + r19) * 31;
        boolean z20 = this.bigSize;
        ?? r20 = z20;
        if (z20) {
            r20 = 1;
        }
        int i19 = (i18 + r20) * 31;
        boolean z21 = this.needPartnerProject;
        ?? r21 = z21;
        if (z21) {
            r21 = 1;
        }
        int i20 = (i19 + r21) * 31;
        boolean z22 = this.transparentWidgetMode;
        return ((((i20 + (z22 ? 1 : z22)) * 31) + this.partnerProjectUuid.hashCode()) * 31) + Integer.hashCode(this.lines);
    }

    public String toString() {
        return "IosShowModel(showLunar=" + this.showLunar + ", showFestival=" + this.showFestival + ", showRemark=" + this.showRemark + ", showHLine=" + this.showHLine + ", beginDay=" + this.beginDay + ", partnerUuid=" + this.partnerUuid + ", autoIcloud=" + this.autoIcloud + ", exportRemark=" + this.exportRemark + ", exportCenter=" + this.exportCenter + ", showWorkDurationStat=" + this.showWorkDurationStat + ", showNextDuty=" + this.showNextDuty + ", screenshotMode=" + this.screenshotMode + ", allowCalendar=" + this.allowCalendar + ", disableAppAlarm=" + this.disableAppAlarm + ", showProjectName=" + this.showProjectName + ", showSecondPlan=" + this.showSecondPlan + ", showBeginTime=" + this.showBeginTime + ", showEndTime=" + this.showEndTime + ", hideStat=" + this.hideStat + ", exportCalendar=" + this.exportCalendar + ", optimizeNotify=" + this.optimizeNotify + ", bigSize=" + this.bigSize + ", needPartnerProject=" + this.needPartnerProject + ", transparentWidgetMode=" + this.transparentWidgetMode + ", partnerProjectUuid=" + this.partnerProjectUuid + ", lines=" + this.lines + ")";
    }

    public IosShowModel(boolean z, boolean z2, boolean z3, boolean z4, String beginDay, String partnerUuid, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, String partnerProjectUuid, int i) {
        Intrinsics.checkNotNullParameter(beginDay, "beginDay");
        Intrinsics.checkNotNullParameter(partnerUuid, "partnerUuid");
        Intrinsics.checkNotNullParameter(partnerProjectUuid, "partnerProjectUuid");
        this.showLunar = z;
        this.showFestival = z2;
        this.showRemark = z3;
        this.showHLine = z4;
        this.beginDay = beginDay;
        this.partnerUuid = partnerUuid;
        this.autoIcloud = z5;
        this.exportRemark = z6;
        this.exportCenter = z7;
        this.showWorkDurationStat = z8;
        this.showNextDuty = z9;
        this.screenshotMode = z10;
        this.allowCalendar = z11;
        this.disableAppAlarm = z12;
        this.showProjectName = z13;
        this.showSecondPlan = z14;
        this.showBeginTime = z15;
        this.showEndTime = z16;
        this.hideStat = z17;
        this.exportCalendar = z18;
        this.optimizeNotify = z19;
        this.bigSize = z20;
        this.needPartnerProject = z21;
        this.transparentWidgetMode = z22;
        this.partnerProjectUuid = partnerProjectUuid;
        this.lines = i;
    }

    public /* synthetic */ IosShowModel(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? "monday" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? true : z6, (i2 & 256) != 0 ? false : z7, (i2 & 512) != 0 ? false : z8, (i2 & 1024) != 0 ? true : z9, (i2 & 2048) != 0 ? false : z10, (i2 & 4096) != 0 ? true : z11, (i2 & 8192) != 0 ? false : z12, (i2 & 16384) != 0 ? false : z13, (i2 & 32768) != 0 ? true : z14, (i2 & 65536) != 0 ? false : z15, (i2 & 131072) != 0 ? false : z16, (i2 & 262144) != 0 ? false : z17, (i2 & 524288) != 0 ? false : z18, (i2 & 1048576) != 0 ? false : z19, (i2 & 2097152) != 0 ? false : z20, (i2 & 4194304) != 0 ? false : z21, (i2 & 8388608) != 0 ? false : z22, (i2 & 16777216) != 0 ? "" : str3, (i2 & 33554432) != 0 ? 2 : i);
    }

    public final boolean getShowLunar() {
        return this.showLunar;
    }

    public final void setShowLunar(boolean z) {
        this.showLunar = z;
    }

    public final boolean getShowFestival() {
        return this.showFestival;
    }

    public final void setShowFestival(boolean z) {
        this.showFestival = z;
    }

    public final boolean getShowRemark() {
        return this.showRemark;
    }

    public final void setShowRemark(boolean z) {
        this.showRemark = z;
    }

    public final boolean getShowHLine() {
        return this.showHLine;
    }

    public final void setShowHLine(boolean z) {
        this.showHLine = z;
    }

    public final String getBeginDay() {
        return this.beginDay;
    }

    public final void setBeginDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beginDay = str;
    }

    public final String getPartnerUuid() {
        return this.partnerUuid;
    }

    public final void setPartnerUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.partnerUuid = str;
    }

    public final boolean getAutoIcloud() {
        return this.autoIcloud;
    }

    public final void setAutoIcloud(boolean z) {
        this.autoIcloud = z;
    }

    public final boolean getExportRemark() {
        return this.exportRemark;
    }

    public final void setExportRemark(boolean z) {
        this.exportRemark = z;
    }

    public final boolean getExportCenter() {
        return this.exportCenter;
    }

    public final void setExportCenter(boolean z) {
        this.exportCenter = z;
    }

    public final boolean getShowWorkDurationStat() {
        return this.showWorkDurationStat;
    }

    public final void setShowWorkDurationStat(boolean z) {
        this.showWorkDurationStat = z;
    }

    public final boolean getShowNextDuty() {
        return this.showNextDuty;
    }

    public final void setShowNextDuty(boolean z) {
        this.showNextDuty = z;
    }

    public final boolean getScreenshotMode() {
        return this.screenshotMode;
    }

    public final void setScreenshotMode(boolean z) {
        this.screenshotMode = z;
    }

    public final boolean getAllowCalendar() {
        return this.allowCalendar;
    }

    public final void setAllowCalendar(boolean z) {
        this.allowCalendar = z;
    }

    public final boolean getDisableAppAlarm() {
        return this.disableAppAlarm;
    }

    public final void setDisableAppAlarm(boolean z) {
        this.disableAppAlarm = z;
    }

    public final boolean getShowProjectName() {
        return this.showProjectName;
    }

    public final void setShowProjectName(boolean z) {
        this.showProjectName = z;
    }

    public final boolean getShowSecondPlan() {
        return this.showSecondPlan;
    }

    public final void setShowSecondPlan(boolean z) {
        this.showSecondPlan = z;
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

    public final boolean getHideStat() {
        return this.hideStat;
    }

    public final void setHideStat(boolean z) {
        this.hideStat = z;
    }

    public final boolean getExportCalendar() {
        return this.exportCalendar;
    }

    public final void setExportCalendar(boolean z) {
        this.exportCalendar = z;
    }

    public final boolean getOptimizeNotify() {
        return this.optimizeNotify;
    }

    public final void setOptimizeNotify(boolean z) {
        this.optimizeNotify = z;
    }

    public final boolean getBigSize() {
        return this.bigSize;
    }

    public final void setBigSize(boolean z) {
        this.bigSize = z;
    }

    public final boolean getNeedPartnerProject() {
        return this.needPartnerProject;
    }

    public final void setNeedPartnerProject(boolean z) {
        this.needPartnerProject = z;
    }

    public final boolean getTransparentWidgetMode() {
        return this.transparentWidgetMode;
    }

    public final void setTransparentWidgetMode(boolean z) {
        this.transparentWidgetMode = z;
    }

    public final String getPartnerProjectUuid() {
        return this.partnerProjectUuid;
    }

    public final void setPartnerProjectUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.partnerProjectUuid = str;
    }

    public final int getLines() {
        return this.lines;
    }

    public final void setLines(int i) {
        this.lines = i;
    }
}