package cn.jianyun.workplan.api.dto;

import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.util.CommonToolKt;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: WorkDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\"\u001a\u00020#R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcn/jianyun/workplan/api/dto/WorkDTO;", "", Name.MARK, "", "uuid", "", "projectUuid", "name", "bgColor", "gmtBegin", "gmtEnd", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBgColor", "()Ljava/lang/String;", "getGmtBegin", "getGmtEnd", "getId", "()I", "getName", "getProjectUuid", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toString", "toWork", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WorkDTO {
    public static final int $stable = 0;
    private final String bgColor;
    private final String gmtBegin;
    private final String gmtEnd;
    private final int id;
    private final String name;
    private final String projectUuid;
    private final String uuid;

    public static /* synthetic */ WorkDTO copy$default(WorkDTO workDTO, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = workDTO.id;
        }
        if ((i2 & 2) != 0) {
            str = workDTO.uuid;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = workDTO.projectUuid;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = workDTO.name;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = workDTO.bgColor;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = workDTO.gmtBegin;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = workDTO.gmtEnd;
        }
        return workDTO.copy(i, str7, str8, str9, str10, str11, str6);
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
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    public final WorkDTO copy(int id, String uuid, String projectUuid, String name, String bgColor, String gmtBegin, String gmtEnd) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        return new WorkDTO(id, uuid, projectUuid, name, bgColor, gmtBegin, gmtEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkDTO)) {
            return false;
        }
        WorkDTO workDTO = (WorkDTO) other;
        return this.id == workDTO.id && Intrinsics.areEqual(this.uuid, workDTO.uuid) && Intrinsics.areEqual(this.projectUuid, workDTO.projectUuid) && Intrinsics.areEqual(this.name, workDTO.name) && Intrinsics.areEqual(this.bgColor, workDTO.bgColor) && Intrinsics.areEqual(this.gmtBegin, workDTO.gmtBegin) && Intrinsics.areEqual(this.gmtEnd, workDTO.gmtEnd);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.uuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.bgColor.hashCode()) * 31) + this.gmtBegin.hashCode()) * 31) + this.gmtEnd.hashCode();
    }

    public String toString() {
        return "WorkDTO(id=" + this.id + ", uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", name=" + this.name + ", bgColor=" + this.bgColor + ", gmtBegin=" + this.gmtBegin + ", gmtEnd=" + this.gmtEnd + ")";
    }

    public WorkDTO(int i, String uuid, String projectUuid, String name, String bgColor, String gmtBegin, String gmtEnd) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        this.id = i;
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.name = name;
        this.bgColor = bgColor;
        this.gmtBegin = gmtBegin;
        this.gmtEnd = gmtEnd;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getProjectUuid() {
        return this.projectUuid;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    public final ScheduleWork toWork() {
        return new ScheduleWork(this.uuid, this.name, null, this.gmtBegin, this.gmtEnd, null, this.bgColor, this.projectUuid, false, null, 0, false, 0, null, CommonToolKt.uuid(), null, null, null, 0, null, 1029924, null);
    }
}