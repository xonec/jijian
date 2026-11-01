package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Jw\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006<"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosDutyDO;", "", "uuid", "", "projectUuid", "day", "planUuid", "gmtBed", "gmtSign", "gmtExit", "remark", "secondPlanUuid", "refSecondPlan", "Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "refPlan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "getGmtBed", "setGmtBed", "getGmtExit", "setGmtExit", "getGmtSign", "setGmtSign", "getPlanUuid", "setPlanUuid", "getProjectUuid", "setProjectUuid", "getRefPlan", "()Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "setRefPlan", "(Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;)V", "getRefSecondPlan", "setRefSecondPlan", "getRemark", "setRemark", "getSecondPlanUuid", "setSecondPlanUuid", "getUuid", "setUuid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosDutyDO {
    public static final int $stable = 8;
    private String day;
    private String gmtBed;
    private String gmtExit;
    private String gmtSign;
    private String planUuid;
    private String projectUuid;
    private IosWorkPlanDO refPlan;
    private IosWorkPlanDO refSecondPlan;
    private String remark;
    private String secondPlanUuid;
    private String uuid;

    public IosDutyDO() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final IosWorkPlanDO getRefSecondPlan() {
        return this.refSecondPlan;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final IosWorkPlanDO getRefPlan() {
        return this.refPlan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlanUuid() {
        return this.planUuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGmtBed() {
        return this.gmtBed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGmtSign() {
        return this.gmtSign;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGmtExit() {
        return this.gmtExit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSecondPlanUuid() {
        return this.secondPlanUuid;
    }

    public final IosDutyDO copy(String uuid, String projectUuid, String day, String planUuid, String gmtBed, String gmtSign, String gmtExit, String remark, String secondPlanUuid, IosWorkPlanDO refSecondPlan, IosWorkPlanDO refPlan) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(planUuid, "planUuid");
        Intrinsics.checkNotNullParameter(gmtBed, "gmtBed");
        Intrinsics.checkNotNullParameter(gmtSign, "gmtSign");
        Intrinsics.checkNotNullParameter(gmtExit, "gmtExit");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(secondPlanUuid, "secondPlanUuid");
        Intrinsics.checkNotNullParameter(refSecondPlan, "refSecondPlan");
        Intrinsics.checkNotNullParameter(refPlan, "refPlan");
        return new IosDutyDO(uuid, projectUuid, day, planUuid, gmtBed, gmtSign, gmtExit, remark, secondPlanUuid, refSecondPlan, refPlan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosDutyDO)) {
            return false;
        }
        IosDutyDO iosDutyDO = (IosDutyDO) other;
        return Intrinsics.areEqual(this.uuid, iosDutyDO.uuid) && Intrinsics.areEqual(this.projectUuid, iosDutyDO.projectUuid) && Intrinsics.areEqual(this.day, iosDutyDO.day) && Intrinsics.areEqual(this.planUuid, iosDutyDO.planUuid) && Intrinsics.areEqual(this.gmtBed, iosDutyDO.gmtBed) && Intrinsics.areEqual(this.gmtSign, iosDutyDO.gmtSign) && Intrinsics.areEqual(this.gmtExit, iosDutyDO.gmtExit) && Intrinsics.areEqual(this.remark, iosDutyDO.remark) && Intrinsics.areEqual(this.secondPlanUuid, iosDutyDO.secondPlanUuid) && Intrinsics.areEqual(this.refSecondPlan, iosDutyDO.refSecondPlan) && Intrinsics.areEqual(this.refPlan, iosDutyDO.refPlan);
    }

    public int hashCode() {
        return (((((((((((((((((((this.uuid.hashCode() * 31) + this.projectUuid.hashCode()) * 31) + this.day.hashCode()) * 31) + this.planUuid.hashCode()) * 31) + this.gmtBed.hashCode()) * 31) + this.gmtSign.hashCode()) * 31) + this.gmtExit.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.secondPlanUuid.hashCode()) * 31) + this.refSecondPlan.hashCode()) * 31) + this.refPlan.hashCode();
    }

    public String toString() {
        return "IosDutyDO(uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", day=" + this.day + ", planUuid=" + this.planUuid + ", gmtBed=" + this.gmtBed + ", gmtSign=" + this.gmtSign + ", gmtExit=" + this.gmtExit + ", remark=" + this.remark + ", secondPlanUuid=" + this.secondPlanUuid + ", refSecondPlan=" + this.refSecondPlan + ", refPlan=" + this.refPlan + ")";
    }

    public IosDutyDO(String uuid, String projectUuid, String day, String planUuid, String gmtBed, String gmtSign, String gmtExit, String remark, String secondPlanUuid, IosWorkPlanDO refSecondPlan, IosWorkPlanDO refPlan) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(planUuid, "planUuid");
        Intrinsics.checkNotNullParameter(gmtBed, "gmtBed");
        Intrinsics.checkNotNullParameter(gmtSign, "gmtSign");
        Intrinsics.checkNotNullParameter(gmtExit, "gmtExit");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(secondPlanUuid, "secondPlanUuid");
        Intrinsics.checkNotNullParameter(refSecondPlan, "refSecondPlan");
        Intrinsics.checkNotNullParameter(refPlan, "refPlan");
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.day = day;
        this.planUuid = planUuid;
        this.gmtBed = gmtBed;
        this.gmtSign = gmtSign;
        this.gmtExit = gmtExit;
        this.remark = remark;
        this.secondPlanUuid = secondPlanUuid;
        this.refSecondPlan = refSecondPlan;
        this.refPlan = refPlan;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getProjectUuid() {
        return this.projectUuid;
    }

    public final void setProjectUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectUuid = str;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final String getPlanUuid() {
        return this.planUuid;
    }

    public final void setPlanUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.planUuid = str;
    }

    public final String getGmtBed() {
        return this.gmtBed;
    }

    public final void setGmtBed(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtBed = str;
    }

    public final String getGmtSign() {
        return this.gmtSign;
    }

    public final void setGmtSign(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtSign = str;
    }

    public final String getGmtExit() {
        return this.gmtExit;
    }

    public final void setGmtExit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtExit = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getSecondPlanUuid() {
        return this.secondPlanUuid;
    }

    public final void setSecondPlanUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondPlanUuid = str;
    }

    public /* synthetic */ IosDutyDO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, IosWorkPlanDO iosWorkPlanDO, IosWorkPlanDO iosWorkPlanDO2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? new IosWorkPlanDO(null, null, null, null, null, null, null, null, false, 0, false, null, false, null, null, null, null, 0, 262143, null) : iosWorkPlanDO, (i & 1024) != 0 ? new IosWorkPlanDO(null, null, null, null, null, null, null, null, false, 0, false, null, false, null, null, null, null, 0, 262143, null) : iosWorkPlanDO2);
    }

    public final IosWorkPlanDO getRefSecondPlan() {
        return this.refSecondPlan;
    }

    public final void setRefSecondPlan(IosWorkPlanDO iosWorkPlanDO) {
        Intrinsics.checkNotNullParameter(iosWorkPlanDO, "<set-?>");
        this.refSecondPlan = iosWorkPlanDO;
    }

    public final IosWorkPlanDO getRefPlan() {
        return this.refPlan;
    }

    public final void setRefPlan(IosWorkPlanDO iosWorkPlanDO) {
        Intrinsics.checkNotNullParameter(iosWorkPlanDO, "<set-?>");
        this.refPlan = iosWorkPlanDO;
    }
}