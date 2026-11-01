package cn.jianyun.workplan.api.dto;

import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DutyDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcn/jianyun/workplan/api/dto/DutyDTO;", "", "uuid", "", "workUuid", "projectUuid", "day", "mark", "state", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "getMark", "setMark", "getProjectUuid", "setProjectUuid", "getState", "()I", "setState", "(I)V", "getUuid", "setUuid", "getWorkUuid", "setWorkUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toDuty", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DutyDTO {
    public static final int $stable = 8;
    private String day;
    private String mark;
    private String projectUuid;
    private int state;
    private String uuid;
    private String workUuid;

    public static /* synthetic */ DutyDTO copy$default(DutyDTO dutyDTO, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dutyDTO.uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = dutyDTO.workUuid;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = dutyDTO.projectUuid;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = dutyDTO.day;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = dutyDTO.mark;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = dutyDTO.state;
        }
        return dutyDTO.copy(str, str6, str7, str8, str9, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWorkUuid() {
        return this.workUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMark() {
        return this.mark;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final DutyDTO copy(String uuid, String workUuid, String projectUuid, String day, String mark, int state) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(mark, "mark");
        return new DutyDTO(uuid, workUuid, projectUuid, day, mark, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DutyDTO)) {
            return false;
        }
        DutyDTO dutyDTO = (DutyDTO) other;
        return Intrinsics.areEqual(this.uuid, dutyDTO.uuid) && Intrinsics.areEqual(this.workUuid, dutyDTO.workUuid) && Intrinsics.areEqual(this.projectUuid, dutyDTO.projectUuid) && Intrinsics.areEqual(this.day, dutyDTO.day) && Intrinsics.areEqual(this.mark, dutyDTO.mark) && this.state == dutyDTO.state;
    }

    public int hashCode() {
        return (((((((((this.uuid.hashCode() * 31) + this.workUuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.day.hashCode()) * 31) + this.mark.hashCode()) * 31) + Integer.hashCode(this.state);
    }

    public String toString() {
        return "DutyDTO(uuid=" + this.uuid + ", workUuid=" + this.workUuid + ", projectUuid=" + this.projectUuid + ", day=" + this.day + ", mark=" + this.mark + ", state=" + this.state + ")";
    }

    public DutyDTO(String uuid, String workUuid, String projectUuid, String day, String mark, int i) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.uuid = uuid;
        this.workUuid = workUuid;
        this.projectUuid = projectUuid;
        this.day = day;
        this.mark = mark;
        this.state = i;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getWorkUuid() {
        return this.workUuid;
    }

    public final void setWorkUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.workUuid = str;
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

    public final String getMark() {
        return this.mark;
    }

    public final void setMark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mark = str;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final ScheduleDuty toDuty() {
        return new ScheduleDuty(this.uuid, this.day, null, this.workUuid, null, this.projectUuid, this.mark, null, null, null, null, 0, null, 8084, null);
    }
}