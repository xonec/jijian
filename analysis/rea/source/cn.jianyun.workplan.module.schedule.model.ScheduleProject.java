package cn.jianyun.workplan.module.schedule.model;

import androidx.core.app.NotificationCompat;
import cn.jianyun.workplan.util.SelectDO;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleProject.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\bHÖ\u0001J\u0006\u0010D\u001a\u00020\u000bJ\u0006\u0010E\u001a\u00020\u0003J\u0006\u0010F\u001a\u00020GJ\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u0006I"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "", "uuid", "", "name", "remark", "userId", "ordinal", "", "state", NotificationCompat.CATEGORY_ALARM, "", "gmtCreate", "extField1", "extField2", "extField3", "cc", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAlarm", "()Z", "setAlarm", "(Z)V", "getCc", "()I", "setCc", "(I)V", "getCid", "()Ljava/lang/String;", "setCid", "(Ljava/lang/String;)V", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getGmtCreate", "setGmtCreate", "getName", "setName", "getOrdinal", "setOrdinal", "getRemark", "setRemark", "getState", "setState", "getUserId", "setUserId", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "isAdd", "isValid", "toSelect", "Lcn/jianyun/workplan/util/SelectDO;", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleProject {
    public static final int $stable = 8;
    private boolean alarm;
    private int cc;
    private String cid;
    private String extField1;
    private String extField2;
    private String extField3;
    private String gmtCreate;
    private String name;
    private int ordinal;
    private String remark;
    private int state;
    private String userId;
    private String uuid;

    public ScheduleProject() {
        this(null, null, null, null, 0, 0, false, null, null, null, null, 0, null, 8191, null);
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
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAlarm() {
        return this.alarm;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExtField1() {
        return this.extField1;
    }

    public final ScheduleProject copy(String uuid, String name, String remark, String userId, int ordinal, int state, boolean alarm, String gmtCreate, String extField1, String extField2, String extField3, int cc, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new ScheduleProject(uuid, name, remark, userId, ordinal, state, alarm, gmtCreate, extField1, extField2, extField3, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleProject)) {
            return false;
        }
        ScheduleProject scheduleProject = (ScheduleProject) other;
        return Intrinsics.areEqual(this.uuid, scheduleProject.uuid) && Intrinsics.areEqual(this.name, scheduleProject.name) && Intrinsics.areEqual(this.remark, scheduleProject.remark) && Intrinsics.areEqual(this.userId, scheduleProject.userId) && this.ordinal == scheduleProject.ordinal && this.state == scheduleProject.state && this.alarm == scheduleProject.alarm && Intrinsics.areEqual(this.gmtCreate, scheduleProject.gmtCreate) && Intrinsics.areEqual(this.extField1, scheduleProject.extField1) && Intrinsics.areEqual(this.extField2, scheduleProject.extField2) && Intrinsics.areEqual(this.extField3, scheduleProject.extField3) && this.cc == scheduleProject.cc && Intrinsics.areEqual(this.cid, scheduleProject.cid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    public int hashCode() {
        int iHashCode = ((((((((((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + Integer.hashCode(this.state)) * 31;
        boolean z = this.alarm;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + this.gmtCreate.hashCode()) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public String toString() {
        return "ScheduleProject(uuid=" + this.uuid + ", name=" + this.name + ", remark=" + this.remark + ", userId=" + this.userId + ", ordinal=" + this.ordinal + ", state=" + this.state + ", alarm=" + this.alarm + ", gmtCreate=" + this.gmtCreate + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public ScheduleProject(String uuid, String name, String remark, String userId, int i, int i2, boolean z, String gmtCreate, String extField1, String extField2, String extField3, int i3, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.uuid = uuid;
        this.name = name;
        this.remark = remark;
        this.userId = userId;
        this.ordinal = i;
        this.state = i2;
        this.alarm = z;
        this.gmtCreate = gmtCreate;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.cc = i3;
        this.cid = cid;
    }

    public /* synthetic */ ScheduleProject(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, String str6, String str7, String str8, int i3, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) == 0 ? i3 : 0, (i4 & 4096) == 0 ? str9 : "");
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

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final void setOrdinal(int i) {
        this.ordinal = i;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final boolean getAlarm() {
        return this.alarm;
    }

    public final void setAlarm(boolean z) {
        this.alarm = z;
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

    public final SelectDO toSelect() {
        return new SelectDO(this.name, this.uuid);
    }

    public final String isValid() {
        return Intrinsics.areEqual(this.name, "") ? "项目不能为空" : "ok";
    }
}