package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleDuty.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u000fHÖ\u0001J\u0006\u0010A\u001a\u00020>J\u0006\u0010B\u001a\u00020>J\u0006\u0010C\u001a\u00020\u0003J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019¨\u0006E"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "", "uuid", "", "day", "userId", "workUuid", "secondWorkUuid", "projectUuid", "remark", "gmtCreate", "extField1", "extField2", "extField3", "cc", "", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCc", "()I", "setCc", "(I)V", "getCid", "()Ljava/lang/String;", "setCid", "(Ljava/lang/String;)V", "getDay", "setDay", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getGmtCreate", "setGmtCreate", "getProjectUuid", "setProjectUuid", "getRemark", "setRemark", "getSecondWorkUuid", "setSecondWorkUuid", "getUserId", "setUserId", "getUuid", "getWorkUuid", "setWorkUuid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "isAdd", "isEmpty", "isValid", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleDuty {
    public static final int $stable = 8;
    private int cc;
    private String cid;
    private String day;
    private String extField1;
    private String extField2;
    private String extField3;
    private String gmtCreate;
    private String projectUuid;
    private String remark;
    private String secondWorkUuid;
    private String userId;
    private final String uuid;
    private String workUuid;

    public ScheduleDuty() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, null, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExtField2() {
        return this.extField2;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExtField3() {
        return this.extField3;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCc() {
        return this.cc;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWorkUuid() {
        return this.workUuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondWorkUuid() {
        return this.secondWorkUuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExtField1() {
        return this.extField1;
    }

    public final ScheduleDuty copy(String uuid, String day, String userId, String workUuid, String secondWorkUuid, String projectUuid, String remark, String gmtCreate, String extField1, String extField2, String extField3, int cc, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(secondWorkUuid, "secondWorkUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new ScheduleDuty(uuid, day, userId, workUuid, secondWorkUuid, projectUuid, remark, gmtCreate, extField1, extField2, extField3, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleDuty)) {
            return false;
        }
        ScheduleDuty scheduleDuty = (ScheduleDuty) other;
        return Intrinsics.areEqual(this.uuid, scheduleDuty.uuid) && Intrinsics.areEqual(this.day, scheduleDuty.day) && Intrinsics.areEqual(this.userId, scheduleDuty.userId) && Intrinsics.areEqual(this.workUuid, scheduleDuty.workUuid) && Intrinsics.areEqual(this.secondWorkUuid, scheduleDuty.secondWorkUuid) && Intrinsics.areEqual(this.projectUuid, scheduleDuty.projectUuid) && Intrinsics.areEqual(this.remark, scheduleDuty.remark) && Intrinsics.areEqual(this.gmtCreate, scheduleDuty.gmtCreate) && Intrinsics.areEqual(this.extField1, scheduleDuty.extField1) && Intrinsics.areEqual(this.extField2, scheduleDuty.extField2) && Intrinsics.areEqual(this.extField3, scheduleDuty.extField3) && this.cc == scheduleDuty.cc && Intrinsics.areEqual(this.cid, scheduleDuty.cid);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.uuid.hashCode() * 31) + this.day.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.workUuid.hashCode()) * 31) + this.secondWorkUuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public String toString() {
        return "ScheduleDuty(uuid=" + this.uuid + ", day=" + this.day + ", userId=" + this.userId + ", workUuid=" + this.workUuid + ", secondWorkUuid=" + this.secondWorkUuid + ", projectUuid=" + this.projectUuid + ", remark=" + this.remark + ", gmtCreate=" + this.gmtCreate + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public ScheduleDuty(String uuid, String day, String userId, String workUuid, String secondWorkUuid, String projectUuid, String remark, String gmtCreate, String extField1, String extField2, String extField3, int i, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(secondWorkUuid, "secondWorkUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.uuid = uuid;
        this.day = day;
        this.userId = userId;
        this.workUuid = workUuid;
        this.secondWorkUuid = secondWorkUuid;
        this.projectUuid = projectUuid;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.cc = i;
        this.cid = cid;
    }

    public /* synthetic */ ScheduleDuty(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) == 0 ? str12 : "");
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final String getWorkUuid() {
        return this.workUuid;
    }

    public final void setWorkUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.workUuid = str;
    }

    public final String getSecondWorkUuid() {
        return this.secondWorkUuid;
    }

    public final void setSecondWorkUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondWorkUuid = str;
    }

    public final String getProjectUuid() {
        return this.projectUuid;
    }

    public final void setProjectUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectUuid = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }

    public final String getExtField1() {
        return this.extField1;
    }

    public final void setExtField1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField1 = str;
    }

    public final String getExtField2() {
        return this.extField2;
    }

    public final void setExtField2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField2 = str;
    }

    public final String getExtField3() {
        return this.extField3;
    }

    public final void setExtField3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extField3 = str;
    }

    public final int getCc() {
        return this.cc;
    }

    public final void setCc(int i) {
        this.cc = i;
    }

    public final String getCid() {
        return this.cid;
    }

    public final void setCid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cid = str;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final boolean isEmpty() {
        return Intrinsics.areEqual(this.workUuid, "") || Intrinsics.areEqual(this.workUuid, "empty");
    }

    public final String isValid() {
        return Intrinsics.areEqual(this.workUuid, "") ? "名称不能为空" : "ok";
    }
}