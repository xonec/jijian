package cn.jianyun.workplan.api.dto;

import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: PlanDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcn/jianyun/workplan/api/dto/PlanDTO;", "", Name.MARK, "", "uuid", "", "projectUuid", "name", "detail", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getName", "setName", "getProjectUuid", "setProjectUuid", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toPlan", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PlanDTO {
    public static final int $stable = 8;
    private String detail;
    private int id;
    private String name;
    private String projectUuid;
    private String uuid;

    public static /* synthetic */ PlanDTO copy$default(PlanDTO planDTO, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = planDTO.id;
        }
        if ((i2 & 2) != 0) {
            str = planDTO.uuid;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = planDTO.projectUuid;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = planDTO.name;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = planDTO.detail;
        }
        return planDTO.copy(i, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final PlanDTO copy(int id, String uuid, String projectUuid, String name, String detail) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new PlanDTO(id, uuid, projectUuid, name, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanDTO)) {
            return false;
        }
        PlanDTO planDTO = (PlanDTO) other;
        return this.id == planDTO.id && Intrinsics.areEqual(this.uuid, planDTO.uuid) && Intrinsics.areEqual(this.projectUuid, planDTO.projectUuid) && Intrinsics.areEqual(this.name, planDTO.name) && Intrinsics.areEqual(this.detail, planDTO.detail);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.uuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "PlanDTO(id=" + this.id + ", uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", name=" + this.name + ", detail=" + this.detail + ")";
    }

    public PlanDTO(int i, String uuid, String projectUuid, String name, String detail) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.id = i;
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.name = name;
        this.detail = detail;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
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

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final void setDetail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detail = str;
    }

    public final SchedulePlan toPlan() {
        return new SchedulePlan(this.uuid, this.name, null, null, null, null, null, this.projectUuid, null, 0, 0, null, null, null, null, 0, null, 130940, null);
    }
}