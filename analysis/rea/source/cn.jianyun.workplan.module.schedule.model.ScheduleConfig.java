package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b_\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u001dHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u000bHÆ\u0003J\t\u0010s\u001a\u00020\u000bHÆ\u0003J\u008d\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010u\u001a\u00020\u000b2\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010w\u001a\u00020\u001dHÖ\u0001J\u0006\u0010x\u001a\u00020\u000bJ\u0006\u0010y\u001a\u00020\u000bJ\u0006\u0010z\u001a\u00020\u0003J\t\u0010{\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00109\"\u0004\bE\u0010;R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00109\"\u0004\bI\u0010;R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00109\"\u0004\bK\u0010;R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R\u001a\u0010\u0012\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00109\"\u0004\bQ\u0010;R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010!\"\u0004\bY\u0010#¨\u0006|"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "", "uuid", "", "autoDay", "beginDay", "dateFontSize", "workFontSize", "timeFontSize", "workRadius", "showLunar", "", "showFestival", "showBeginTime", "showEndTime", "showHLine", "fillCalendar", "showRemark", "showStat", "protectMode", "extField1", "extField2", "extField3", "extField4", "extField5", "projectUuid", "remark", "gmtCreate", "cc", "", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAutoDay", "()Ljava/lang/String;", "setAutoDay", "(Ljava/lang/String;)V", "getBeginDay", "setBeginDay", "getCc", "()I", "setCc", "(I)V", "getCid", "setCid", "getDateFontSize", "setDateFontSize", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getExtField4", "setExtField4", "getExtField5", "setExtField5", "getFillCalendar", "()Z", "setFillCalendar", "(Z)V", "getGmtCreate", "setGmtCreate", "getProjectUuid", "setProjectUuid", "getProtectMode", "setProtectMode", "getRemark", "setRemark", "getShowBeginTime", "setShowBeginTime", "getShowEndTime", "setShowEndTime", "getShowFestival", "setShowFestival", "getShowHLine", "setShowHLine", "getShowLunar", "setShowLunar", "getShowRemark", "setShowRemark", "getShowStat", "setShowStat", "getTimeFontSize", "setTimeFontSize", "getUuid", "setUuid", "getWorkFontSize", "setWorkFontSize", "getWorkRadius", "setWorkRadius", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "isAdd", "isMondayFirst", "isValid", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleConfig {
    public static final int $stable = 8;
    private String autoDay;
    private String beginDay;
    private int cc;
    private String cid;
    private String dateFontSize;
    private String extField1;
    private String extField2;
    private String extField3;
    private String extField4;
    private String extField5;
    private boolean fillCalendar;
    private String gmtCreate;
    private String projectUuid;
    private boolean protectMode;
    private String remark;
    private boolean showBeginTime;
    private boolean showEndTime;
    private boolean showFestival;
    private boolean showHLine;
    private boolean showLunar;
    private boolean showRemark;
    private boolean showStat;
    private String timeFontSize;
    private String uuid;
    private String workFontSize;
    private String workRadius;

    public ScheduleConfig() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, 0, null, 67108863, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShowBeginTime() {
        return this.showBeginTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getShowEndTime() {
        return this.showEndTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShowHLine() {
        return this.showHLine;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getFillCalendar() {
        return this.fillCalendar;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShowRemark() {
        return this.showRemark;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShowStat() {
        return this.showStat;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getProtectMode() {
        return this.protectMode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getExtField1() {
        return this.extField1;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getExtField2() {
        return this.extField2;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getExtField3() {
        return this.extField3;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAutoDay() {
        return this.autoDay;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getExtField4() {
        return this.extField4;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getExtField5() {
        return this.extField5;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getCc() {
        return this.cc;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBeginDay() {
        return this.beginDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDateFontSize() {
        return this.dateFontSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWorkFontSize() {
        return this.workFontSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeFontSize() {
        return this.timeFontSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWorkRadius() {
        return this.workRadius;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowLunar() {
        return this.showLunar;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowFestival() {
        return this.showFestival;
    }

    public final ScheduleConfig copy(String uuid, String autoDay, String beginDay, String dateFontSize, String workFontSize, String timeFontSize, String workRadius, boolean showLunar, boolean showFestival, boolean showBeginTime, boolean showEndTime, boolean showHLine, boolean fillCalendar, boolean showRemark, boolean showStat, boolean protectMode, String extField1, String extField2, String extField3, String extField4, String extField5, String projectUuid, String remark, String gmtCreate, int cc, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(autoDay, "autoDay");
        Intrinsics.checkNotNullParameter(beginDay, "beginDay");
        Intrinsics.checkNotNullParameter(dateFontSize, "dateFontSize");
        Intrinsics.checkNotNullParameter(workFontSize, "workFontSize");
        Intrinsics.checkNotNullParameter(timeFontSize, "timeFontSize");
        Intrinsics.checkNotNullParameter(workRadius, "workRadius");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(extField4, "extField4");
        Intrinsics.checkNotNullParameter(extField5, "extField5");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new ScheduleConfig(uuid, autoDay, beginDay, dateFontSize, workFontSize, timeFontSize, workRadius, showLunar, showFestival, showBeginTime, showEndTime, showHLine, fillCalendar, showRemark, showStat, protectMode, extField1, extField2, extField3, extField4, extField5, projectUuid, remark, gmtCreate, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleConfig)) {
            return false;
        }
        ScheduleConfig scheduleConfig = (ScheduleConfig) other;
        return Intrinsics.areEqual(this.uuid, scheduleConfig.uuid) && Intrinsics.areEqual(this.autoDay, scheduleConfig.autoDay) && Intrinsics.areEqual(this.beginDay, scheduleConfig.beginDay) && Intrinsics.areEqual(this.dateFontSize, scheduleConfig.dateFontSize) && Intrinsics.areEqual(this.workFontSize, scheduleConfig.workFontSize) && Intrinsics.areEqual(this.timeFontSize, scheduleConfig.timeFontSize) && Intrinsics.areEqual(this.workRadius, scheduleConfig.workRadius) && this.showLunar == scheduleConfig.showLunar && this.showFestival == scheduleConfig.showFestival && this.showBeginTime == scheduleConfig.showBeginTime && this.showEndTime == scheduleConfig.showEndTime && this.showHLine == scheduleConfig.showHLine && this.fillCalendar == scheduleConfig.fillCalendar && this.showRemark == scheduleConfig.showRemark && this.showStat == scheduleConfig.showStat && this.protectMode == scheduleConfig.protectMode && Intrinsics.areEqual(this.extField1, scheduleConfig.extField1) && Intrinsics.areEqual(this.extField2, scheduleConfig.extField2) && Intrinsics.areEqual(this.extField3, scheduleConfig.extField3) && Intrinsics.areEqual(this.extField4, scheduleConfig.extField4) && Intrinsics.areEqual(this.extField5, scheduleConfig.extField5) && Intrinsics.areEqual(this.projectUuid, scheduleConfig.projectUuid) && Intrinsics.areEqual(this.remark, scheduleConfig.remark) && Intrinsics.areEqual(this.gmtCreate, scheduleConfig.gmtCreate) && this.cc == scheduleConfig.cc && Intrinsics.areEqual(this.cid, scheduleConfig.cid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.uuid.hashCode() * 31) + this.autoDay.hashCode()) * 31) + this.beginDay.hashCode()) * 31) + this.dateFontSize.hashCode()) * 31) + this.workFontSize.hashCode()) * 31) + this.timeFontSize.hashCode()) * 31) + this.workRadius.hashCode()) * 31;
        boolean z = this.showLunar;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showFestival;
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
        boolean z5 = this.showHLine;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.fillCalendar;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = (i5 + r6) * 31;
        boolean z7 = this.showRemark;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i7 = (i6 + r7) * 31;
        boolean z8 = this.showStat;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = (i7 + r8) * 31;
        boolean z9 = this.protectMode;
        return ((((((((((((((((((((i8 + (z9 ? 1 : z9)) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + this.extField4.hashCode()) * 31) + this.extField5.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public final String isValid() {
        return "ok";
    }

    public String toString() {
        return "ScheduleConfig(uuid=" + this.uuid + ", autoDay=" + this.autoDay + ", beginDay=" + this.beginDay + ", dateFontSize=" + this.dateFontSize + ", workFontSize=" + this.workFontSize + ", timeFontSize=" + this.timeFontSize + ", workRadius=" + this.workRadius + ", showLunar=" + this.showLunar + ", showFestival=" + this.showFestival + ", showBeginTime=" + this.showBeginTime + ", showEndTime=" + this.showEndTime + ", showHLine=" + this.showHLine + ", fillCalendar=" + this.fillCalendar + ", showRemark=" + this.showRemark + ", showStat=" + this.showStat + ", protectMode=" + this.protectMode + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", extField4=" + this.extField4 + ", extField5=" + this.extField5 + ", projectUuid=" + this.projectUuid + ", remark=" + this.remark + ", gmtCreate=" + this.gmtCreate + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public ScheduleConfig(String uuid, String autoDay, String beginDay, String dateFontSize, String workFontSize, String timeFontSize, String workRadius, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String extField1, String extField2, String extField3, String extField4, String extField5, String projectUuid, String remark, String gmtCreate, int i, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(autoDay, "autoDay");
        Intrinsics.checkNotNullParameter(beginDay, "beginDay");
        Intrinsics.checkNotNullParameter(dateFontSize, "dateFontSize");
        Intrinsics.checkNotNullParameter(workFontSize, "workFontSize");
        Intrinsics.checkNotNullParameter(timeFontSize, "timeFontSize");
        Intrinsics.checkNotNullParameter(workRadius, "workRadius");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(extField4, "extField4");
        Intrinsics.checkNotNullParameter(extField5, "extField5");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.uuid = uuid;
        this.autoDay = autoDay;
        this.beginDay = beginDay;
        this.dateFontSize = dateFontSize;
        this.workFontSize = workFontSize;
        this.timeFontSize = timeFontSize;
        this.workRadius = workRadius;
        this.showLunar = z;
        this.showFestival = z2;
        this.showBeginTime = z3;
        this.showEndTime = z4;
        this.showHLine = z5;
        this.fillCalendar = z6;
        this.showRemark = z7;
        this.showStat = z8;
        this.protectMode = z9;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.extField4 = extField4;
        this.extField5 = extField5;
        this.projectUuid = projectUuid;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.cc = i;
        this.cid = cid;
    }

    public /* synthetic */ ScheduleConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "only" : str, (i2 & 2) != 0 ? "90" : str2, (i2 & 4) != 0 ? "monday" : str3, (i2 & 8) != 0 ? "17" : str4, (i2 & 16) != 0 ? "11" : str5, (i2 & 32) == 0 ? str6 : "11", (i2 & 64) != 0 ? "4" : str7, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) != 0 ? true : z5, (i2 & 4096) != 0 ? false : z6, (i2 & 8192) != 0 ? false : z7, (i2 & 16384) != 0 ? true : z8, (i2 & 32768) != 0 ? true : z9, (i2 & 65536) != 0 ? "" : str8, (i2 & 131072) != 0 ? "" : str9, (i2 & 262144) != 0 ? "" : str10, (i2 & 524288) != 0 ? "" : str11, (i2 & 1048576) != 0 ? "" : str12, (i2 & 2097152) != 0 ? "" : str13, (i2 & 4194304) != 0 ? "" : str14, (i2 & 8388608) != 0 ? "" : str15, (i2 & 16777216) != 0 ? 0 : i, (i2 & 33554432) == 0 ? str16 : "");
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getAutoDay() {
        return this.autoDay;
    }

    public final void setAutoDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.autoDay = str;
    }

    public final String getBeginDay() {
        return this.beginDay;
    }

    public final void setBeginDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beginDay = str;
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

    public final String getWorkRadius() {
        return this.workRadius;
    }

    public final void setWorkRadius(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.workRadius = str;
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

    public final boolean getShowHLine() {
        return this.showHLine;
    }

    public final void setShowHLine(boolean z) {
        this.showHLine = z;
    }

    public final boolean getFillCalendar() {
        return this.fillCalendar;
    }

    public final void setFillCalendar(boolean z) {
        this.fillCalendar = z;
    }

    public final boolean getShowRemark() {
        return this.showRemark;
    }

    public final void setShowRemark(boolean z) {
        this.showRemark = z;
    }

    public final boolean getShowStat() {
        return this.showStat;
    }

    public final void setShowStat(boolean z) {
        this.showStat = z;
    }

    public final boolean getProtectMode() {
        return this.protectMode;
    }

    public final void setProtectMode(boolean z) {
        this.protectMode = z;
    }

    public final String getExtField1() {
        return this.extField1;
    }

    public final void setExtField1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField1 = str;
    }

    public final String getExtField2() {
        return this.extField2;
    }

    public final void setExtField2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField2 = str;
    }

    public final String getExtField3() {
        return this.extField3;
    }

    public final void setExtField3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField3 = str;
    }

    public final String getExtField4() {
        return this.extField4;
    }

    public final void setExtField4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField4 = str;
    }

    public final String getExtField5() {
        return this.extField5;
    }

    public final void setExtField5(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField5 = str;
    }

    public final String getProjectUuid() {
        return this.projectUuid;
    }

    public final void setProjectUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectUuid = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }

    public final int getCc() {
        return this.cc;
    }

    public final void setCc(int i) {
        this.cc = i;
    }

    public final String getCid() {
        return this.cid;
    }

    public final void setCid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cid = str;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final boolean isMondayFirst() {
        return Intrinsics.areEqual("monday", this.beginDay);
    }
}