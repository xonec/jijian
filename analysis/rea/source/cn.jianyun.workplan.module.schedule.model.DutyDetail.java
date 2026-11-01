package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleDuty.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/DutyDetail;", "", "day", "", "weekday", "work", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "duration", "remark", "(Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;Ljava/lang/String;)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "getDuration", "setDuration", "getRemark", "setRemark", "getWeekday", "setWeekday", "getWork", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "setWork", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DutyDetail {
    public static final int $stable = 8;
    private String day;
    private String duration;
    private String remark;
    private String weekday;
    private ScheduleWork work;

    public DutyDetail() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DutyDetail copy$default(DutyDetail dutyDetail, String str, String str2, ScheduleWork scheduleWork, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dutyDetail.day;
        }
        if ((i & 2) != 0) {
            str2 = dutyDetail.weekday;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            scheduleWork = dutyDetail.work;
        }
        ScheduleWork scheduleWork2 = scheduleWork;
        if ((i & 8) != 0) {
            str3 = dutyDetail.duration;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = dutyDetail.remark;
        }
        return dutyDetail.copy(str, str5, scheduleWork2, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeekday() {
        return this.weekday;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ScheduleWork getWork() {
        return this.work;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final DutyDetail copy(String day, String weekday, ScheduleWork work, String duration, String remark) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(weekday, "weekday");
        Intrinsics.checkNotNullParameter(work, "work");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new DutyDetail(day, weekday, work, duration, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DutyDetail)) {
            return false;
        }
        DutyDetail dutyDetail = (DutyDetail) other;
        return Intrinsics.areEqual(this.day, dutyDetail.day) && Intrinsics.areEqual(this.weekday, dutyDetail.weekday) && Intrinsics.areEqual(this.work, dutyDetail.work) && Intrinsics.areEqual(this.duration, dutyDetail.duration) && Intrinsics.areEqual(this.remark, dutyDetail.remark);
    }

    public int hashCode() {
        return (((((((this.day.hashCode() * 31) + this.weekday.hashCode()) * 31) + this.work.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "DutyDetail(day=" + this.day + ", weekday=" + this.weekday + ", work=" + this.work + ", duration=" + this.duration + ", remark=" + this.remark + ")";
    }

    public DutyDetail(String day, String weekday, ScheduleWork work, String duration, String remark) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(weekday, "weekday");
        Intrinsics.checkNotNullParameter(work, "work");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.day = day;
        this.weekday = weekday;
        this.work = work;
        this.duration = duration;
        this.remark = remark;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final String getWeekday() {
        return this.weekday;
    }

    public final void setWeekday(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weekday = str;
    }

    public /* synthetic */ DutyDetail(String str, String str2, ScheduleWork scheduleWork, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }

    public final ScheduleWork getWork() {
        return this.work;
    }

    public final void setWork(ScheduleWork scheduleWork) {
        Intrinsics.checkNotNullParameter(scheduleWork, "<set-?>");
        this.work = scheduleWork;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final void setDuration(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.duration = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }
}