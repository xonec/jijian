package cn.jianyun.workplan.module.schedule.model;

import androidx.compose.ui.layout.LayoutKt;
import androidx.core.app.NotificationCompat;
import com.adgain.sdk.base.models.AdConstants;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010I\u001a\u00020\u000f2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010\u0018¨\u0006N"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosAlarmDO;", "", "uuid", "", "projectUuid", "type", "beforeDay", "name", "alarmSound", "notifySound", "notifyTime", "times", "planUuid", "remark", "sleep", "", "sleepMinute", "open", "refPlan", "Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;)V", "getAlarmSound", "()Ljava/lang/String;", "setAlarmSound", "(Ljava/lang/String;)V", "getBeforeDay", "setBeforeDay", "getName", "setName", "getNotifySound", "setNotifySound", "getNotifyTime", "setNotifyTime", "getOpen", "()Z", "setOpen", "(Z)V", "getPlanUuid", "setPlanUuid", "getProjectUuid", "setProjectUuid", "getRefPlan", "()Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "setRefPlan", "(Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;)V", "getRemark", "setRemark", "getSleep", "setSleep", "getSleepMinute", "setSleepMinute", "getTimes", "setTimes", "getType", "setType", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosAlarmDO {
    public static final int $stable = 8;
    private String alarmSound;
    private String beforeDay;
    private String name;
    private String notifySound;
    private String notifyTime;
    private boolean open;
    private String planUuid;
    private String projectUuid;
    private IosWorkPlanDO refPlan;
    private String remark;
    private boolean sleep;
    private String sleepMinute;
    private String times;
    private String type;
    private String uuid;

    public IosAlarmDO() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, LayoutKt.LargeDimension, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPlanUuid() {
        return this.planUuid;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSleepMinute() {
        return this.sleepMinute;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final IosWorkPlanDO getRefPlan() {
        return this.refPlan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBeforeDay() {
        return this.beforeDay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAlarmSound() {
        return this.alarmSound;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNotifySound() {
        return this.notifySound;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNotifyTime() {
        return this.notifyTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTimes() {
        return this.times;
    }

    public final IosAlarmDO copy(String uuid, String projectUuid, String type, String beforeDay, String name, String alarmSound, String notifySound, String notifyTime, String times, String planUuid, String remark, boolean sleep, String sleepMinute, boolean open, IosWorkPlanDO refPlan) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beforeDay, "beforeDay");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alarmSound, "alarmSound");
        Intrinsics.checkNotNullParameter(notifySound, "notifySound");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(planUuid, "planUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(sleepMinute, "sleepMinute");
        Intrinsics.checkNotNullParameter(refPlan, "refPlan");
        return new IosAlarmDO(uuid, projectUuid, type, beforeDay, name, alarmSound, notifySound, notifyTime, times, planUuid, remark, sleep, sleepMinute, open, refPlan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosAlarmDO)) {
            return false;
        }
        IosAlarmDO iosAlarmDO = (IosAlarmDO) other;
        return Intrinsics.areEqual(this.uuid, iosAlarmDO.uuid) && Intrinsics.areEqual(this.projectUuid, iosAlarmDO.projectUuid) && Intrinsics.areEqual(this.type, iosAlarmDO.type) && Intrinsics.areEqual(this.beforeDay, iosAlarmDO.beforeDay) && Intrinsics.areEqual(this.name, iosAlarmDO.name) && Intrinsics.areEqual(this.alarmSound, iosAlarmDO.alarmSound) && Intrinsics.areEqual(this.notifySound, iosAlarmDO.notifySound) && Intrinsics.areEqual(this.notifyTime, iosAlarmDO.notifyTime) && Intrinsics.areEqual(this.times, iosAlarmDO.times) && Intrinsics.areEqual(this.planUuid, iosAlarmDO.planUuid) && Intrinsics.areEqual(this.remark, iosAlarmDO.remark) && this.sleep == iosAlarmDO.sleep && Intrinsics.areEqual(this.sleepMinute, iosAlarmDO.sleepMinute) && this.open == iosAlarmDO.open && Intrinsics.areEqual(this.refPlan, iosAlarmDO.refPlan);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.uuid.hashCode() * 31) + this.projectUuid.hashCode()) * 31) + this.type.hashCode()) * 31) + this.beforeDay.hashCode()) * 31) + this.name.hashCode()) * 31) + this.alarmSound.hashCode()) * 31) + this.notifySound.hashCode()) * 31) + this.notifyTime.hashCode()) * 31) + this.times.hashCode()) * 31) + this.planUuid.hashCode()) * 31) + this.remark.hashCode()) * 31;
        boolean z = this.sleep;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.sleepMinute.hashCode()) * 31;
        boolean z2 = this.open;
        return ((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.refPlan.hashCode();
    }

    public String toString() {
        return "IosAlarmDO(uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", type=" + this.type + ", beforeDay=" + this.beforeDay + ", name=" + this.name + ", alarmSound=" + this.alarmSound + ", notifySound=" + this.notifySound + ", notifyTime=" + this.notifyTime + ", times=" + this.times + ", planUuid=" + this.planUuid + ", remark=" + this.remark + ", sleep=" + this.sleep + ", sleepMinute=" + this.sleepMinute + ", open=" + this.open + ", refPlan=" + this.refPlan + ")";
    }

    public IosAlarmDO(String uuid, String projectUuid, String type, String beforeDay, String name, String alarmSound, String notifySound, String notifyTime, String times, String planUuid, String remark, boolean z, String sleepMinute, boolean z2, IosWorkPlanDO refPlan) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beforeDay, "beforeDay");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alarmSound, "alarmSound");
        Intrinsics.checkNotNullParameter(notifySound, "notifySound");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(planUuid, "planUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(sleepMinute, "sleepMinute");
        Intrinsics.checkNotNullParameter(refPlan, "refPlan");
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.type = type;
        this.beforeDay = beforeDay;
        this.name = name;
        this.alarmSound = alarmSound;
        this.notifySound = notifySound;
        this.notifyTime = notifyTime;
        this.times = times;
        this.planUuid = planUuid;
        this.remark = remark;
        this.sleep = z;
        this.sleepMinute = sleepMinute;
        this.open = z2;
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

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getBeforeDay() {
        return this.beforeDay;
    }

    public final void setBeforeDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beforeDay = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getAlarmSound() {
        return this.alarmSound;
    }

    public final void setAlarmSound(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alarmSound = str;
    }

    public final String getNotifySound() {
        return this.notifySound;
    }

    public final void setNotifySound(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notifySound = str;
    }

    public final String getNotifyTime() {
        return this.notifyTime;
    }

    public final void setNotifyTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notifyTime = str;
    }

    public final String getTimes() {
        return this.times;
    }

    public final void setTimes(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.times = str;
    }

    public final String getPlanUuid() {
        return this.planUuid;
    }

    public final void setPlanUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.planUuid = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final boolean getSleep() {
        return this.sleep;
    }

    public final void setSleep(boolean z) {
        this.sleep = z;
    }

    public final String getSleepMinute() {
        return this.sleepMinute;
    }

    public final void setSleepMinute(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepMinute = str;
    }

    public final boolean getOpen() {
        return this.open;
    }

    public final void setOpen(boolean z) {
        this.open = z;
    }

    public /* synthetic */ IosAlarmDO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, boolean z2, IosWorkPlanDO iosWorkPlanDO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? NotificationCompat.CATEGORY_ALARM : str3, (i & 8) != 0 ? AdConstants.FAIL : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "alarm1" : str6, (i & 64) != 0 ? "default" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? true : z, (i & 4096) != 0 ? "5" : str12, (i & 8192) == 0 ? z2 : true, (i & 16384) != 0 ? new IosWorkPlanDO(null, null, null, null, null, null, null, null, false, 0, false, null, false, null, null, null, null, 0, 262143, null) : iosWorkPlanDO);
    }

    public final IosWorkPlanDO getRefPlan() {
        return this.refPlan;
    }

    public final void setRefPlan(IosWorkPlanDO iosWorkPlanDO) {
        Intrinsics.checkNotNullParameter(iosWorkPlanDO, "<set-?>");
        this.refPlan = iosWorkPlanDO;
    }
}