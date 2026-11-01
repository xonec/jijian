package cn.jianyun.workplan.module.schedule.model;

import com.adgain.sdk.base.models.AdConstants;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e¢\u0006\u0002\u0010\u0018J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\t\u0010G\u001a\u00020\fHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014HÆ\u0003J\t\u0010N\u001a\u00020\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003JÉ\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u000eHÆ\u0001J\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u000eHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00106\"\u0004\bD\u00108¨\u0006\\"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosWorkPlanDO;", "", Name.MARK, "", "uuid", "projectUuid", "name", "color", "bgColor", "gmtBegin", "gmtEnd", "remind", "", "ordinal", "", "fullDay", "beforeMinute", "enableNewNotify", "remindConfig", "workIds", "", "type", "refGroups", AdConstants.total, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;I)V", "getBeforeMinute", "()Ljava/lang/String;", "setBeforeMinute", "(Ljava/lang/String;)V", "getBgColor", "setBgColor", "getColor", "setColor", "getEnableNewNotify", "()Z", "setEnableNewNotify", "(Z)V", "getFullDay", "setFullDay", "getGmtBegin", "setGmtBegin", "getGmtEnd", "setGmtEnd", "getId", "setId", "getName", "setName", "getOrdinal", "()I", "setOrdinal", "(I)V", "getProjectUuid", "setProjectUuid", "getRefGroups", "()Ljava/util/List;", "setRefGroups", "(Ljava/util/List;)V", "getRemind", "setRemind", "getRemindConfig", "setRemindConfig", "getTotal", "setTotal", "getType", "setType", "getUuid", "setUuid", "getWorkIds", "setWorkIds", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosWorkPlanDO {
    public static final int $stable = 8;
    private String beforeMinute;
    private String bgColor;
    private String color;
    private boolean enableNewNotify;
    private boolean fullDay;
    private String gmtBegin;
    private String gmtEnd;
    private String id;
    private String name;
    private int ordinal;
    private String projectUuid;
    private List<IosWorkPlanDO> refGroups;
    private boolean remind;
    private String remindConfig;
    private int total;
    private String type;
    private String uuid;
    private List<String> workIds;

    public IosWorkPlanDO() {
        this(null, null, null, null, null, null, null, null, false, 0, false, null, false, null, null, null, null, 0, 262143, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getFullDay() {
        return this.fullDay;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBeforeMinute() {
        return this.beforeMinute;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getEnableNewNotify() {
        return this.enableNewNotify;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRemindConfig() {
        return this.remindConfig;
    }

    public final List<String> component15() {
        return this.workIds;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<IosWorkPlanDO> component17() {
        return this.refGroups;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getTotal() {
        return this.total;
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
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRemind() {
        return this.remind;
    }

    public final IosWorkPlanDO copy(String id, String uuid, String projectUuid, String name, String color, String bgColor, String gmtBegin, String gmtEnd, boolean remind, int ordinal, boolean fullDay, String beforeMinute, boolean enableNewNotify, String remindConfig, List<String> workIds, String type, List<IosWorkPlanDO> refGroups, int total) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        Intrinsics.checkNotNullParameter(beforeMinute, "beforeMinute");
        Intrinsics.checkNotNullParameter(remindConfig, "remindConfig");
        Intrinsics.checkNotNullParameter(workIds, "workIds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(refGroups, "refGroups");
        return new IosWorkPlanDO(id, uuid, projectUuid, name, color, bgColor, gmtBegin, gmtEnd, remind, ordinal, fullDay, beforeMinute, enableNewNotify, remindConfig, workIds, type, refGroups, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosWorkPlanDO)) {
            return false;
        }
        IosWorkPlanDO iosWorkPlanDO = (IosWorkPlanDO) other;
        return Intrinsics.areEqual(this.id, iosWorkPlanDO.id) && Intrinsics.areEqual(this.uuid, iosWorkPlanDO.uuid) && Intrinsics.areEqual(this.projectUuid, iosWorkPlanDO.projectUuid) && Intrinsics.areEqual(this.name, iosWorkPlanDO.name) && Intrinsics.areEqual(this.color, iosWorkPlanDO.color) && Intrinsics.areEqual(this.bgColor, iosWorkPlanDO.bgColor) && Intrinsics.areEqual(this.gmtBegin, iosWorkPlanDO.gmtBegin) && Intrinsics.areEqual(this.gmtEnd, iosWorkPlanDO.gmtEnd) && this.remind == iosWorkPlanDO.remind && this.ordinal == iosWorkPlanDO.ordinal && this.fullDay == iosWorkPlanDO.fullDay && Intrinsics.areEqual(this.beforeMinute, iosWorkPlanDO.beforeMinute) && this.enableNewNotify == iosWorkPlanDO.enableNewNotify && Intrinsics.areEqual(this.remindConfig, iosWorkPlanDO.remindConfig) && Intrinsics.areEqual(this.workIds, iosWorkPlanDO.workIds) && Intrinsics.areEqual(this.type, iosWorkPlanDO.type) && Intrinsics.areEqual(this.refGroups, iosWorkPlanDO.refGroups) && this.total == iosWorkPlanDO.total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.uuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.color.hashCode()) * 31) + this.bgColor.hashCode()) * 31) + this.gmtBegin.hashCode()) * 31) + this.gmtEnd.hashCode()) * 31;
        boolean z = this.remind;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.ordinal)) * 31;
        boolean z2 = this.fullDay;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r2) * 31) + this.beforeMinute.hashCode()) * 31;
        boolean z3 = this.enableNewNotify;
        return ((((((((((iHashCode3 + (z3 ? 1 : z3)) * 31) + this.remindConfig.hashCode()) * 31) + this.workIds.hashCode()) * 31) + this.type.hashCode()) * 31) + this.refGroups.hashCode()) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "IosWorkPlanDO(id=" + this.id + ", uuid=" + this.uuid + ", projectUuid=" + this.projectUuid + ", name=" + this.name + ", color=" + this.color + ", bgColor=" + this.bgColor + ", gmtBegin=" + this.gmtBegin + ", gmtEnd=" + this.gmtEnd + ", remind=" + this.remind + ", ordinal=" + this.ordinal + ", fullDay=" + this.fullDay + ", beforeMinute=" + this.beforeMinute + ", enableNewNotify=" + this.enableNewNotify + ", remindConfig=" + this.remindConfig + ", workIds=" + this.workIds + ", type=" + this.type + ", refGroups=" + this.refGroups + ", total=" + this.total + ")";
    }

    public IosWorkPlanDO(String id, String uuid, String projectUuid, String name, String color, String bgColor, String gmtBegin, String gmtEnd, boolean z, int i, boolean z2, String beforeMinute, boolean z3, String remindConfig, List<String> workIds, String type, List<IosWorkPlanDO> refGroups, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        Intrinsics.checkNotNullParameter(beforeMinute, "beforeMinute");
        Intrinsics.checkNotNullParameter(remindConfig, "remindConfig");
        Intrinsics.checkNotNullParameter(workIds, "workIds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(refGroups, "refGroups");
        this.id = id;
        this.uuid = uuid;
        this.projectUuid = projectUuid;
        this.name = name;
        this.color = color;
        this.bgColor = bgColor;
        this.gmtBegin = gmtBegin;
        this.gmtEnd = gmtEnd;
        this.remind = z;
        this.ordinal = i;
        this.fullDay = z2;
        this.beforeMinute = beforeMinute;
        this.enableNewNotify = z3;
        this.remindConfig = remindConfig;
        this.workIds = workIds;
        this.type = type;
        this.refGroups = refGroups;
        this.total = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IosWorkPlanDO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, boolean z2, String str9, boolean z3, String str10, List list, String str11, List list2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        if ((i3 & 1) != 0) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this(string, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "#ffffff" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? "" : str9, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? CollectionsKt.emptyList() : list, (i3 & 32768) != 0 ? "" : str11, (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 131072) != 0 ? 0 : i2);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
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

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final void setBgColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bgColor = str;
    }

    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    public final void setGmtBegin(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtBegin = str;
    }

    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    public final void setGmtEnd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtEnd = str;
    }

    public final boolean getRemind() {
        return this.remind;
    }

    public final void setRemind(boolean z) {
        this.remind = z;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final void setOrdinal(int i) {
        this.ordinal = i;
    }

    public final boolean getFullDay() {
        return this.fullDay;
    }

    public final void setFullDay(boolean z) {
        this.fullDay = z;
    }

    public final String getBeforeMinute() {
        return this.beforeMinute;
    }

    public final void setBeforeMinute(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beforeMinute = str;
    }

    public final boolean getEnableNewNotify() {
        return this.enableNewNotify;
    }

    public final void setEnableNewNotify(boolean z) {
        this.enableNewNotify = z;
    }

    public final String getRemindConfig() {
        return this.remindConfig;
    }

    public final void setRemindConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remindConfig = str;
    }

    public final List<String> getWorkIds() {
        return this.workIds;
    }

    public final void setWorkIds(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.workIds = list;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final List<IosWorkPlanDO> getRefGroups() {
        return this.refGroups;
    }

    public final void setRefGroups(List<IosWorkPlanDO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.refGroups = list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}