package cn.jianyun.workplan.api.dto;

import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.util.CommonToolKt;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProjectDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003JW\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\u0006\u0010*\u001a\u00020+J\t\u0010,\u001a\u00020\u0003HÖ\u0001R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006-"}, d2 = {"Lcn/jianyun/workplan/api/dto/ProjectDTO;", "", "uuid", "", "name", "mark", "works", "", "Lcn/jianyun/workplan/api/dto/WorkDTO;", "plans", "Lcn/jianyun/workplan/api/dto/PlanDTO;", "dutys", "Lcn/jianyun/workplan/api/dto/DutyDTO;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDutys", "()Ljava/util/List;", "setDutys", "(Ljava/util/List;)V", "getMark", "()Ljava/lang/String;", "setMark", "(Ljava/lang/String;)V", "getName", "setName", "getPlans", "setPlans", "getUuid", "setUuid", "getWorks", "setWorks", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toProject", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProjectDTO {
    public static final int $stable = 8;
    private List<DutyDTO> dutys;
    private String mark;
    private String name;
    private List<PlanDTO> plans;
    private String uuid;
    private List<WorkDTO> works;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectDTO copy$default(ProjectDTO projectDTO, String str, String str2, String str3, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectDTO.uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectDTO.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = projectDTO.mark;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = projectDTO.works;
        }
        List list4 = list;
        if ((i & 16) != 0) {
            list2 = projectDTO.plans;
        }
        List list5 = list2;
        if ((i & 32) != 0) {
            list3 = projectDTO.dutys;
        }
        return projectDTO.copy(str, str4, str5, list4, list5, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMark() {
        return this.mark;
    }

    public final List<WorkDTO> component4() {
        return this.works;
    }

    public final List<PlanDTO> component5() {
        return this.plans;
    }

    public final List<DutyDTO> component6() {
        return this.dutys;
    }

    public final ProjectDTO copy(String uuid, String name, String mark, List<WorkDTO> works, List<PlanDTO> plans, List<DutyDTO> dutys) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(dutys, "dutys");
        return new ProjectDTO(uuid, name, mark, works, plans, dutys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectDTO)) {
            return false;
        }
        ProjectDTO projectDTO = (ProjectDTO) other;
        return Intrinsics.areEqual(this.uuid, projectDTO.uuid) && Intrinsics.areEqual(this.name, projectDTO.name) && Intrinsics.areEqual(this.mark, projectDTO.mark) && Intrinsics.areEqual(this.works, projectDTO.works) && Intrinsics.areEqual(this.plans, projectDTO.plans) && Intrinsics.areEqual(this.dutys, projectDTO.dutys);
    }

    public int hashCode() {
        return (((((((((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31) + this.mark.hashCode()) * 31) + this.works.hashCode()) * 31) + this.plans.hashCode()) * 31) + this.dutys.hashCode();
    }

    public String toString() {
        return "ProjectDTO(uuid=" + this.uuid + ", name=" + this.name + ", mark=" + this.mark + ", works=" + this.works + ", plans=" + this.plans + ", dutys=" + this.dutys + ")";
    }

    public ProjectDTO(String uuid, String name, String mark, List<WorkDTO> works, List<PlanDTO> plans, List<DutyDTO> dutys) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(dutys, "dutys");
        this.uuid = uuid;
        this.name = name;
        this.mark = mark;
        this.works = works;
        this.plans = plans;
        this.dutys = dutys;
    }

    public /* synthetic */ ProjectDTO(String str, String str2, String str3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, list, list2, list3);
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getMark() {
        return this.mark;
    }

    public final void setMark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark = str;
    }

    public final List<WorkDTO> getWorks() {
        return this.works;
    }

    public final void setWorks(List<WorkDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.works = list;
    }

    public final List<PlanDTO> getPlans() {
        return this.plans;
    }

    public final void setPlans(List<PlanDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.plans = list;
    }

    public final List<DutyDTO> getDutys() {
        return this.dutys;
    }

    public final void setDutys(List<DutyDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dutys = list;
    }

    public final ScheduleProject toProject() {
        CommonToolKt.mlog("project", this.uuid, this.name, this.mark);
        return new ScheduleProject(this.uuid, this.name, this.mark, null, 0, 0, false, null, null, null, null, 0, null, 8184, null);
    }
}