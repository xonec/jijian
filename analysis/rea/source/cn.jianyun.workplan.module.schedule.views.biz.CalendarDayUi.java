package cn.jianyun.workplan.module.schedule.views.biz;

import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleCalendarView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcn/jianyun/workplan/module/schedule/views/biz/CalendarDayUi;", "", "firstWork", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "secondWork", "remark", "", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;)V", "getFirstWork", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "getRemark", "()Ljava/lang/String;", "getSecondWork", "component1", "component2", "component3", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class CalendarDayUi {
    private final ScheduleWork firstWork;
    private final String remark;
    private final ScheduleWork secondWork;

    public static /* synthetic */ CalendarDayUi copy$default(CalendarDayUi calendarDayUi, ScheduleWork scheduleWork, ScheduleWork scheduleWork2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            scheduleWork = calendarDayUi.firstWork;
        }
        if ((i & 2) != 0) {
            scheduleWork2 = calendarDayUi.secondWork;
        }
        if ((i & 4) != 0) {
            str = calendarDayUi.remark;
        }
        return calendarDayUi.copy(scheduleWork, scheduleWork2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScheduleWork getFirstWork() {
        return this.firstWork;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScheduleWork getSecondWork() {
        return this.secondWork;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final CalendarDayUi copy(ScheduleWork firstWork, ScheduleWork secondWork, String remark) {
        Intrinsics.checkNotNullParameter(firstWork, "firstWork");
        Intrinsics.checkNotNullParameter(secondWork, "secondWork");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new CalendarDayUi(firstWork, secondWork, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDayUi)) {
            return false;
        }
        CalendarDayUi calendarDayUi = (CalendarDayUi) other;
        return Intrinsics.areEqual(this.firstWork, calendarDayUi.firstWork) && Intrinsics.areEqual(this.secondWork, calendarDayUi.secondWork) && Intrinsics.areEqual(this.remark, calendarDayUi.remark);
    }

    public int hashCode() {
        return (((this.firstWork.hashCode() * 31) + this.secondWork.hashCode()) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "CalendarDayUi(firstWork=" + this.firstWork + ", secondWork=" + this.secondWork + ", remark=" + this.remark + ")";
    }

    public CalendarDayUi(ScheduleWork firstWork, ScheduleWork secondWork, String remark) {
        Intrinsics.checkNotNullParameter(firstWork, "firstWork");
        Intrinsics.checkNotNullParameter(secondWork, "secondWork");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.firstWork = firstWork;
        this.secondWork = secondWork;
        this.remark = remark;
    }

    public final ScheduleWork getFirstWork() {
        return this.firstWork;
    }

    public final ScheduleWork getSecondWork() {
        return this.secondWork;
    }

    public final String getRemark() {
        return this.remark;
    }
}