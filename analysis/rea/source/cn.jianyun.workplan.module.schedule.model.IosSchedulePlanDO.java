package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosSchedulePlanDO;", "", "uuid", "", "projectUuid", "name", "detail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "getName", "setName", "getProjectUuid", "setProjectUuid", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosSchedulePlanDO {
    public static final int $stable = 8;
    private String detail;
    private String name;
    private String projectUuid;
    private String uuid;

    public IosSchedulePlanDO() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IosSchedulePlanDO copy$default(IosSchedulePlanDO iosSchedulePlanDO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iosSchedulePlanDO.uuid;
        }
        if ((i & 2) != 0) {
            str2 = iosSchedulePlanDO.projectUuid;
        }
        if ((i & 4) != 0) {
            str3 = iosSchedulePlanDO.name;
        }
        if ((i & 8) != 0) {
            str4 = iosSchedulePlanDO.detail;
        }
        return iosSchedulePlanDO.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final IosSchedulePlanDO copy(String uuid, String projectUuid, String name, String detail) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new IosSchedulePlanDO(uuid, projectUuid, name, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosSchedulePlanDO)) {
            return false;
        }
        IosSchedulePlanDO iosSchedulePlanDO = (IosSchedulePlanDO) other;
        return Intrinsics.areEqual(this.uuid, iosSchedulePlanDO.uuid) && Intrinsics.areEqual(this.projectUuid, iosSchedulePlanDO.projectUuid) && Intrinsics.areEqual(this.name, iosSchedulePlanDO.name) && Intrinsics.areEqual(this.detail, iosSchedulePlanDO.detail);
    }

    public int hashCode() {
        return (((((this.uuid.hashCode() * 31) + this.projectUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "IosSchedulePlanDO(uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", name=" + this.name + ", detail=" + this.detail + ")";
    }

    public IosSchedulePlanDO(String uuid, String projectUuid, String name, String detail) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.name = name;
        this.detail = detail;
    }

    public /* synthetic */ IosSchedulePlanDO(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
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
}