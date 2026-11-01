package cn.jianyun.workplan.module.schedule.model;

import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.m.m.b;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0003J\t\u0010:\u001a\u00020\u0015HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0003J\u009f\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\u0006\u0010I\u001a\u00020\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001b¨\u0006L"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleShareData;", "", "newProjectName", "", b.z0, "", "cover", "partnerUuid", "gmtCreate", "projects", "", "Lcn/jianyun/workplan/module/schedule/model/IosProjectDO;", "duties", "Lcn/jianyun/workplan/module/schedule/model/IosDutyDO;", "workPlans", "Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "schedulePlans", "Lcn/jianyun/workplan/module/schedule/model/IosSchedulePlanDO;", "alarms", "Lcn/jianyun/workplan/module/schedule/model/IosAlarmDO;", "showModel", "Lcn/jianyun/workplan/module/schedule/model/IosShowModel;", "currentProject", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcn/jianyun/workplan/module/schedule/model/IosShowModel;Ljava/lang/String;)V", "getAlarms", "()Ljava/util/List;", "setAlarms", "(Ljava/util/List;)V", "getCover", "()Z", "setCover", "(Z)V", "getCurrentProject", "()Ljava/lang/String;", "setCurrentProject", "(Ljava/lang/String;)V", "getDuties", "setDuties", "getGmtCreate", "setGmtCreate", "getNewProjectName", "setNewProjectName", "getPartner", "setPartner", "getPartnerUuid", "setPartnerUuid", "getProjects", "setProjects", "getSchedulePlans", "setSchedulePlans", "getShowModel", "()Lcn/jianyun/workplan/module/schedule/model/IosShowModel;", "setShowModel", "(Lcn/jianyun/workplan/module/schedule/model/IosShowModel;)V", "getWorkPlans", "setWorkPlans", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "toJson", "toString", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleShareData {
    private List<IosAlarmDO> alarms;
    private boolean cover;
    private String currentProject;
    private List<IosDutyDO> duties;
    private String gmtCreate;
    private String newProjectName;
    private boolean partner;
    private String partnerUuid;
    private List<IosProjectDO> projects;
    private List<IosSchedulePlanDO> schedulePlans;
    private IosShowModel showModel;
    private List<IosWorkPlanDO> workPlans;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ScheduleShareData() {
        this(null, false, false, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNewProjectName() {
        return this.newProjectName;
    }

    public final List<IosAlarmDO> component10() {
        return this.alarms;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final IosShowModel getShowModel() {
        return this.showModel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCurrentProject() {
        return this.currentProject;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPartner() {
        return this.partner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCover() {
        return this.cover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPartnerUuid() {
        return this.partnerUuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final List<IosProjectDO> component6() {
        return this.projects;
    }

    public final List<IosDutyDO> component7() {
        return this.duties;
    }

    public final List<IosWorkPlanDO> component8() {
        return this.workPlans;
    }

    public final List<IosSchedulePlanDO> component9() {
        return this.schedulePlans;
    }

    public final ScheduleShareData copy(String newProjectName, boolean partner, boolean cover, String partnerUuid, String gmtCreate, List<IosProjectDO> projects, List<IosDutyDO> duties, List<IosWorkPlanDO> workPlans, List<IosSchedulePlanDO> schedulePlans, List<IosAlarmDO> alarms, IosShowModel showModel, String currentProject) {
        Intrinsics.checkNotNullParameter(newProjectName, "newProjectName");
        Intrinsics.checkNotNullParameter(partnerUuid, "partnerUuid");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(duties, "duties");
        Intrinsics.checkNotNullParameter(workPlans, "workPlans");
        Intrinsics.checkNotNullParameter(schedulePlans, "schedulePlans");
        Intrinsics.checkNotNullParameter(alarms, "alarms");
        Intrinsics.checkNotNullParameter(showModel, "showModel");
        Intrinsics.checkNotNullParameter(currentProject, "currentProject");
        return new ScheduleShareData(newProjectName, partner, cover, partnerUuid, gmtCreate, projects, duties, workPlans, schedulePlans, alarms, showModel, currentProject);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleShareData)) {
            return false;
        }
        ScheduleShareData scheduleShareData = (ScheduleShareData) other;
        return Intrinsics.areEqual(this.newProjectName, scheduleShareData.newProjectName) && this.partner == scheduleShareData.partner && this.cover == scheduleShareData.cover && Intrinsics.areEqual(this.partnerUuid, scheduleShareData.partnerUuid) && Intrinsics.areEqual(this.gmtCreate, scheduleShareData.gmtCreate) && Intrinsics.areEqual(this.projects, scheduleShareData.projects) && Intrinsics.areEqual(this.duties, scheduleShareData.duties) && Intrinsics.areEqual(this.workPlans, scheduleShareData.workPlans) && Intrinsics.areEqual(this.schedulePlans, scheduleShareData.schedulePlans) && Intrinsics.areEqual(this.alarms, scheduleShareData.alarms) && Intrinsics.areEqual(this.showModel, scheduleShareData.showModel) && Intrinsics.areEqual(this.currentProject, scheduleShareData.currentProject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.newProjectName.hashCode() * 31;
        boolean z = this.partner;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.cover;
        return ((((((((((((((((((i + (z2 ? 1 : z2)) * 31) + this.partnerUuid.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + this.projects.hashCode()) * 31) + this.duties.hashCode()) * 31) + this.workPlans.hashCode()) * 31) + this.schedulePlans.hashCode()) * 31) + this.alarms.hashCode()) * 31) + this.showModel.hashCode()) * 31) + this.currentProject.hashCode();
    }

    public String toString() {
        return "ScheduleShareData(newProjectName=" + this.newProjectName + ", partner=" + this.partner + ", cover=" + this.cover + ", partnerUuid=" + this.partnerUuid + ", gmtCreate=" + this.gmtCreate + ", projects=" + this.projects + ", duties=" + this.duties + ", workPlans=" + this.workPlans + ", schedulePlans=" + this.schedulePlans + ", alarms=" + this.alarms + ", showModel=" + this.showModel + ", currentProject=" + this.currentProject + ")";
    }

    public ScheduleShareData(String newProjectName, boolean z, boolean z2, String partnerUuid, String gmtCreate, List<IosProjectDO> projects, List<IosDutyDO> duties, List<IosWorkPlanDO> workPlans, List<IosSchedulePlanDO> schedulePlans, List<IosAlarmDO> alarms, IosShowModel showModel, String currentProject) {
        Intrinsics.checkNotNullParameter(newProjectName, "newProjectName");
        Intrinsics.checkNotNullParameter(partnerUuid, "partnerUuid");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(duties, "duties");
        Intrinsics.checkNotNullParameter(workPlans, "workPlans");
        Intrinsics.checkNotNullParameter(schedulePlans, "schedulePlans");
        Intrinsics.checkNotNullParameter(alarms, "alarms");
        Intrinsics.checkNotNullParameter(showModel, "showModel");
        Intrinsics.checkNotNullParameter(currentProject, "currentProject");
        this.newProjectName = newProjectName;
        this.partner = z;
        this.cover = z2;
        this.partnerUuid = partnerUuid;
        this.gmtCreate = gmtCreate;
        this.projects = projects;
        this.duties = duties;
        this.workPlans = workPlans;
        this.schedulePlans = schedulePlans;
        this.alarms = alarms;
        this.showModel = showModel;
        this.currentProject = currentProject;
    }

    public final String getNewProjectName() {
        return this.newProjectName;
    }

    public final void setNewProjectName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newProjectName = str;
    }

    public final boolean getPartner() {
        return this.partner;
    }

    public final void setPartner(boolean z) {
        this.partner = z;
    }

    public final boolean getCover() {
        return this.cover;
    }

    public final void setCover(boolean z) {
        this.cover = z;
    }

    public final String getPartnerUuid() {
        return this.partnerUuid;
    }

    public final void setPartnerUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.partnerUuid = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }

    public /* synthetic */ ScheduleShareData(String str, boolean z, boolean z2, String str2, String str3, List list, List list2, List list3, List list4, List list5, IosShowModel iosShowModel, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt.emptyList() : list3, (i & 256) != 0 ? CollectionsKt.emptyList() : list4, (i & 512) != 0 ? CollectionsKt.emptyList() : list5, (i & 1024) != 0 ? new IosShowModel(false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, 67108863, null) : iosShowModel, (i & 2048) == 0 ? str4 : "");
    }

    public final List<IosProjectDO> getProjects() {
        return this.projects;
    }

    public final void setProjects(List<IosProjectDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.projects = list;
    }

    public final List<IosDutyDO> getDuties() {
        return this.duties;
    }

    public final void setDuties(List<IosDutyDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.duties = list;
    }

    public final List<IosWorkPlanDO> getWorkPlans() {
        return this.workPlans;
    }

    public final void setWorkPlans(List<IosWorkPlanDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.workPlans = list;
    }

    public final List<IosSchedulePlanDO> getSchedulePlans() {
        return this.schedulePlans;
    }

    public final void setSchedulePlans(List<IosSchedulePlanDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.schedulePlans = list;
    }

    public final List<IosAlarmDO> getAlarms() {
        return this.alarms;
    }

    public final void setAlarms(List<IosAlarmDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.alarms = list;
    }

    public final IosShowModel getShowModel() {
        return this.showModel;
    }

    public final void setShowModel(IosShowModel iosShowModel) {
        Intrinsics.checkNotNullParameter(iosShowModel, "<set-?>");
        this.showModel = iosShowModel;
    }

    public final String getCurrentProject() {
        return this.currentProject;
    }

    public final void setCurrentProject(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentProject = str;
    }

    /* JADX INFO: compiled from: ScheduleShareData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleShareData$Companion;", "", "()V", "parse", "Lcn/jianyun/workplan/module/schedule/model/ScheduleShareData;", "content", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ScheduleShareData parse(String content) {
            Object objM7405constructorimpl;
            Intrinsics.checkNotNullParameter(content, "content");
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                objM7405constructorimpl = Result.m7405constructorimpl((ScheduleShareData) JSON.parseObject(content, ScheduleShareData.class));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
                objM7405constructorimpl = null;
            }
            return (ScheduleShareData) objM7405constructorimpl;
        }
    }

    public final String toJson() {
        String jSONString = JSON.toJSONString(this);
        Intrinsics.checkNotNullExpressionValue(jSONString, "this.toJSONString()");
        return jSONString;
    }
}