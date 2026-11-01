package cn.jianyun.workplan.module.schedule.model;

import cn.jianyun.workplan.module.base.dto.BaseBackupData;
import cn.jianyun.workplan.util.MyEncryptTool;
import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.m.t.e;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleBackupData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B_\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Jc\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020(HÖ\u0001R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u00061"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;", "Lcn/jianyun/workplan/module/base/dto/BaseBackupData;", "projectList", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "dutyList", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "workList", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "planList", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "alarmList", "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "appConfig", "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V", "getAlarmList", "()Ljava/util/List;", "setAlarmList", "(Ljava/util/List;)V", "getAppConfig", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;", "setAppConfig", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V", "getDutyList", "setDutyList", "getPlanList", "setPlanList", "getProjectList", "setProjectList", "getWorkList", "setWorkList", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "encryptData", "", "equals", "", AdType.TYPE_OTHER, "", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleBackupData extends BaseBackupData {
    private List<ScheduleAlarm> alarmList;
    private ScheduleConfig appConfig;
    private List<ScheduleDuty> dutyList;
    private List<SchedulePlan> planList;
    private List<ScheduleProject> projectList;
    private List<ScheduleWork> workList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ScheduleBackupData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScheduleBackupData copy$default(ScheduleBackupData scheduleBackupData, List list, List list2, List list3, List list4, List list5, ScheduleConfig scheduleConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            list = scheduleBackupData.projectList;
        }
        if ((i & 2) != 0) {
            list2 = scheduleBackupData.dutyList;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = scheduleBackupData.workList;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = scheduleBackupData.planList;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = scheduleBackupData.alarmList;
        }
        List list9 = list5;
        if ((i & 32) != 0) {
            scheduleConfig = scheduleBackupData.appConfig;
        }
        return scheduleBackupData.copy(list, list6, list7, list8, list9, scheduleConfig);
    }

    public final List<ScheduleProject> component1() {
        return this.projectList;
    }

    public final List<ScheduleDuty> component2() {
        return this.dutyList;
    }

    public final List<ScheduleWork> component3() {
        return this.workList;
    }

    public final List<SchedulePlan> component4() {
        return this.planList;
    }

    public final List<ScheduleAlarm> component5() {
        return this.alarmList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScheduleConfig getAppConfig() {
        return this.appConfig;
    }

    public final ScheduleBackupData copy(List<ScheduleProject> projectList, List<ScheduleDuty> dutyList, List<ScheduleWork> workList, List<SchedulePlan> planList, List<ScheduleAlarm> alarmList, ScheduleConfig appConfig) {
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(dutyList, "dutyList");
        Intrinsics.checkNotNullParameter(workList, "workList");
        Intrinsics.checkNotNullParameter(planList, "planList");
        Intrinsics.checkNotNullParameter(alarmList, "alarmList");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        return new ScheduleBackupData(projectList, dutyList, workList, planList, alarmList, appConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleBackupData)) {
            return false;
        }
        ScheduleBackupData scheduleBackupData = (ScheduleBackupData) other;
        return Intrinsics.areEqual(this.projectList, scheduleBackupData.projectList) && Intrinsics.areEqual(this.dutyList, scheduleBackupData.dutyList) && Intrinsics.areEqual(this.workList, scheduleBackupData.workList) && Intrinsics.areEqual(this.planList, scheduleBackupData.planList) && Intrinsics.areEqual(this.alarmList, scheduleBackupData.alarmList) && Intrinsics.areEqual(this.appConfig, scheduleBackupData.appConfig);
    }

    public int hashCode() {
        return (((((((((this.projectList.hashCode() * 31) + this.dutyList.hashCode()) * 31) + this.workList.hashCode()) * 31) + this.planList.hashCode()) * 31) + this.alarmList.hashCode()) * 31) + this.appConfig.hashCode();
    }

    public String toString() {
        return "ScheduleBackupData(projectList=" + this.projectList + ", dutyList=" + this.dutyList + ", workList=" + this.workList + ", planList=" + this.planList + ", alarmList=" + this.alarmList + ", appConfig=" + this.appConfig + ")";
    }

    public /* synthetic */ ScheduleBackupData(List list, List list2, List list3, List list4, List list5, ScheduleConfig scheduleConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4, (i & 16) != 0 ? CollectionsKt.emptyList() : list5, (i & 32) != 0 ? new ScheduleConfig(null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, 0, null, 67108863, null) : scheduleConfig);
    }

    public final List<ScheduleProject> getProjectList() {
        return this.projectList;
    }

    public final void setProjectList(List<ScheduleProject> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.projectList = list;
    }

    public final List<ScheduleDuty> getDutyList() {
        return this.dutyList;
    }

    public final void setDutyList(List<ScheduleDuty> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dutyList = list;
    }

    public final List<ScheduleWork> getWorkList() {
        return this.workList;
    }

    public final void setWorkList(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.workList = list;
    }

    public final List<SchedulePlan> getPlanList() {
        return this.planList;
    }

    public final void setPlanList(List<SchedulePlan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.planList = list;
    }

    public final List<ScheduleAlarm> getAlarmList() {
        return this.alarmList;
    }

    public final void setAlarmList(List<ScheduleAlarm> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.alarmList = list;
    }

    public final ScheduleConfig getAppConfig() {
        return this.appConfig;
    }

    public final void setAppConfig(ScheduleConfig scheduleConfig) {
        Intrinsics.checkNotNullParameter(scheduleConfig, "<set-?>");
        this.appConfig = scheduleConfig;
    }

    public ScheduleBackupData(List<ScheduleProject> projectList, List<ScheduleDuty> dutyList, List<ScheduleWork> workList, List<SchedulePlan> planList, List<ScheduleAlarm> alarmList, ScheduleConfig appConfig) {
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(dutyList, "dutyList");
        Intrinsics.checkNotNullParameter(workList, "workList");
        Intrinsics.checkNotNullParameter(planList, "planList");
        Intrinsics.checkNotNullParameter(alarmList, "alarmList");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        this.projectList = projectList;
        this.dutyList = dutyList;
        this.workList = workList;
        this.planList = planList;
        this.alarmList = alarmList;
        this.appConfig = appConfig;
    }

    /* JADX INFO: compiled from: ScheduleBackupData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData$Companion;", "", "()V", "parse", "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;", e.m, "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ScheduleBackupData parse(Object data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Object object = JSON.parseObject(MyEncryptTool.decrypt((String) data), (Class<Object>) ScheduleBackupData.class);
            Intrinsics.checkNotNullExpressionValue(object, "parseObject(originData, …leBackupData::class.java)");
            return (ScheduleBackupData) object;
        }
    }

    public final String encryptData() {
        String strEncrypt = MyEncryptTool.encrypt(JSON.toJSONString(this));
        Intrinsics.checkNotNullExpressionValue(strEncrypt, "encrypt(this.toJSONString())");
        return strEncrypt;
    }
}