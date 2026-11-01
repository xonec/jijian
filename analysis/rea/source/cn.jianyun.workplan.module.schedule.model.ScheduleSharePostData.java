package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006C"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleSharePostData;", "", "uuid", "", "appId", "appCode", "shareId", "compress", "", "name", "remark", "content", "userUuid", "checked", "common", "groupUuid", "gmtCreate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "setAppCode", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getChecked", "()Z", "setChecked", "(Z)V", "getCommon", "setCommon", "getCompress", "setCompress", "getContent", "setContent", "getGmtCreate", "setGmtCreate", "getGroupUuid", "setGroupUuid", "getName", "setName", "getRemark", "setRemark", "getShareId", "setShareId", "getUserUuid", "setUserUuid", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleSharePostData {
    public static final int $stable = 8;
    private String appCode;
    private String appId;
    private boolean checked;
    private boolean common;
    private boolean compress;
    private String content;
    private String gmtCreate;
    private String groupUuid;
    private String name;
    private String remark;
    private String shareId;
    private String userUuid;
    private String uuid;

    public ScheduleSharePostData() {
        this(null, null, null, null, false, null, null, null, null, false, false, null, null, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getCommon() {
        return this.common;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGroupUuid() {
        return this.groupUuid;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShareId() {
        return this.shareId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCompress() {
        return this.compress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserUuid() {
        return this.userUuid;
    }

    public final ScheduleSharePostData copy(String uuid, String appId, String appCode, String shareId, boolean compress, String name, String remark, String content, String userUuid, boolean checked, boolean common, String groupUuid, String gmtCreate) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(userUuid, "userUuid");
        Intrinsics.checkNotNullParameter(groupUuid, "groupUuid");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        return new ScheduleSharePostData(uuid, appId, appCode, shareId, compress, name, remark, content, userUuid, checked, common, groupUuid, gmtCreate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleSharePostData)) {
            return false;
        }
        ScheduleSharePostData scheduleSharePostData = (ScheduleSharePostData) other;
        return Intrinsics.areEqual(this.uuid, scheduleSharePostData.uuid) && Intrinsics.areEqual(this.appId, scheduleSharePostData.appId) && Intrinsics.areEqual(this.appCode, scheduleSharePostData.appCode) && Intrinsics.areEqual(this.shareId, scheduleSharePostData.shareId) && this.compress == scheduleSharePostData.compress && Intrinsics.areEqual(this.name, scheduleSharePostData.name) && Intrinsics.areEqual(this.remark, scheduleSharePostData.remark) && Intrinsics.areEqual(this.content, scheduleSharePostData.content) && Intrinsics.areEqual(this.userUuid, scheduleSharePostData.userUuid) && this.checked == scheduleSharePostData.checked && this.common == scheduleSharePostData.common && Intrinsics.areEqual(this.groupUuid, scheduleSharePostData.groupUuid) && Intrinsics.areEqual(this.gmtCreate, scheduleSharePostData.gmtCreate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((this.uuid.hashCode() * 31) + this.appId.hashCode()) * 31) + this.appCode.hashCode()) * 31) + this.shareId.hashCode()) * 31;
        boolean z = this.compress;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((iHashCode + r1) * 31) + this.name.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.content.hashCode()) * 31) + this.userUuid.hashCode()) * 31;
        boolean z2 = this.checked;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        boolean z3 = this.common;
        return ((((i + (z3 ? 1 : z3)) * 31) + this.groupUuid.hashCode()) * 31) + this.gmtCreate.hashCode();
    }

    public String toString() {
        return "ScheduleSharePostData(uuid=" + this.uuid + ", appId=" + this.appId + ", appCode=" + this.appCode + ", shareId=" + this.shareId + ", compress=" + this.compress + ", name=" + this.name + ", remark=" + this.remark + ", content=" + this.content + ", userUuid=" + this.userUuid + ", checked=" + this.checked + ", common=" + this.common + ", groupUuid=" + this.groupUuid + ", gmtCreate=" + this.gmtCreate + ")";
    }

    public ScheduleSharePostData(String uuid, String appId, String appCode, String shareId, boolean z, String name, String remark, String content, String userUuid, boolean z2, boolean z3, String groupUuid, String gmtCreate) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(userUuid, "userUuid");
        Intrinsics.checkNotNullParameter(groupUuid, "groupUuid");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        this.uuid = uuid;
        this.appId = appId;
        this.appCode = appCode;
        this.shareId = shareId;
        this.compress = z;
        this.name = name;
        this.remark = remark;
        this.content = content;
        this.userUuid = userUuid;
        this.checked = z2;
        this.common = z3;
        this.groupUuid = groupUuid;
        this.gmtCreate = gmtCreate;
    }

    public /* synthetic */ ScheduleSharePostData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, boolean z2, boolean z3, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? false : z2, (i & 1024) == 0 ? z3 : false, (i & 2048) != 0 ? "" : str9, (i & 4096) == 0 ? str10 : "");
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final String getAppCode() {
        return this.appCode;
    }

    public final void setAppCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCode = str;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final void setShareId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareId = str;
    }

    public final boolean getCompress() {
        return this.compress;
    }

    public final void setCompress(boolean z) {
        this.compress = z;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final String getUserUuid() {
        return this.userUuid;
    }

    public final void setUserUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userUuid = str;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final boolean getCommon() {
        return this.common;
    }

    public final void setCommon(boolean z) {
        this.common = z;
    }

    public final String getGroupUuid() {
        return this.groupUuid;
    }

    public final void setGroupUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupUuid = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }
}