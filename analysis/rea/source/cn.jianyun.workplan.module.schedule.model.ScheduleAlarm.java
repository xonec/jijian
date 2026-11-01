package cn.jianyun.workplan.module.schedule.model;

import androidx.core.app.NotificationCompat;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.adgain.sdk.base.models.AdConstants;
import com.tianmu.biz.bean.AdType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleAlarm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\u0006\u0010H\u001a\u00020\u0003J\u0006\u0010I\u001a\u00020\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0014HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J³\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\\\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010^\u001a\u00020\u0014J\t\u0010_\u001a\u00020\u0014HÖ\u0001J\u0006\u0010`\u001a\u00020\u000bJ\u0006\u0010a\u001a\u00020\u0003J\u0006\u0010b\u001a\u00020\u0003J\u0006\u0010c\u001a\u00020\u0003J\t\u0010d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001e\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR \u0010:\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010\u001eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010\u001e¨\u0006e"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "", "uuid", "", "name", "type", "beforeDay", "notifyTime", "workUuid", "projectUuid", NotificationCompat.CATEGORY_ALARM, "", "opened", "nextTime", "remark", "gmtCreate", "extField1", "extField2", "extField3", "cc", "", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAlarm", "()Z", "setAlarm", "(Z)V", "getBeforeDay", "()Ljava/lang/String;", "setBeforeDay", "(Ljava/lang/String;)V", "getCc", "()I", "setCc", "(I)V", "getCid", "setCid", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getGmtCreate", "setGmtCreate", "getName", "setName", "nextAlertTime", "getNextAlertTime", "setNextAlertTime", "getNextTime", "setNextTime", "getNotifyTime", "setNotifyTime", "getOpened", "setOpened", "getProjectUuid", "setProjectUuid", "refWork", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "getRefWork", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "setRefWork", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V", "getRemark", "setRemark", "getType", "setType", "getUuid", "setUuid", "getWorkUuid", "setWorkUuid", "beforeInfo", "beforeInfo2", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "fetchOrder", "hashCode", "isAdd", "isValid", "nextTimeInfo", "realRemark", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleAlarm {
    public static final int $stable = 8;
    private boolean alarm;
    private String beforeDay;
    private int cc;
    private String cid;
    private String extField1;
    private String extField2;
    private String extField3;
    private String gmtCreate;
    private String name;
    private String nextAlertTime;
    private String nextTime;
    private String notifyTime;
    private boolean opened;
    private String projectUuid;
    private ScheduleWork refWork;
    private String remark;
    private String type;
    private String uuid;
    private String workUuid;

    public ScheduleAlarm() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 0, null, 131071, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNextTime() {
        return this.nextTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getExtField1() {
        return this.extField1;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getExtField2() {
        return this.extField2;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExtField3() {
        return this.extField3;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getCc() {
        return this.cc;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBeforeDay() {
        return this.beforeDay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNotifyTime() {
        return this.notifyTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWorkUuid() {
        return this.workUuid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAlarm() {
        return this.alarm;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getOpened() {
        return this.opened;
    }

    public final ScheduleAlarm copy(String uuid, String name, String type, String beforeDay, String notifyTime, String workUuid, String projectUuid, boolean alarm, boolean opened, String nextTime, String remark, String gmtCreate, String extField1, String extField2, String extField3, int cc, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beforeDay, "beforeDay");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(nextTime, "nextTime");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new ScheduleAlarm(uuid, name, type, beforeDay, notifyTime, workUuid, projectUuid, alarm, opened, nextTime, remark, gmtCreate, extField1, extField2, extField3, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleAlarm)) {
            return false;
        }
        ScheduleAlarm scheduleAlarm = (ScheduleAlarm) other;
        return Intrinsics.areEqual(this.uuid, scheduleAlarm.uuid) && Intrinsics.areEqual(this.name, scheduleAlarm.name) && Intrinsics.areEqual(this.type, scheduleAlarm.type) && Intrinsics.areEqual(this.beforeDay, scheduleAlarm.beforeDay) && Intrinsics.areEqual(this.notifyTime, scheduleAlarm.notifyTime) && Intrinsics.areEqual(this.workUuid, scheduleAlarm.workUuid) && Intrinsics.areEqual(this.projectUuid, scheduleAlarm.projectUuid) && this.alarm == scheduleAlarm.alarm && this.opened == scheduleAlarm.opened && Intrinsics.areEqual(this.nextTime, scheduleAlarm.nextTime) && Intrinsics.areEqual(this.remark, scheduleAlarm.remark) && Intrinsics.areEqual(this.gmtCreate, scheduleAlarm.gmtCreate) && Intrinsics.areEqual(this.extField1, scheduleAlarm.extField1) && Intrinsics.areEqual(this.extField2, scheduleAlarm.extField2) && Intrinsics.areEqual(this.extField3, scheduleAlarm.extField3) && this.cc == scheduleAlarm.cc && Intrinsics.areEqual(this.cid, scheduleAlarm.cid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.beforeDay.hashCode()) * 31) + this.notifyTime.hashCode()) * 31) + this.workUuid.hashCode()) * 31) + this.projectUuid.hashCode()) * 31;
        boolean z = this.alarm;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.opened;
        return ((((((((((((((((i + (z2 ? 1 : z2)) * 31) + this.nextTime.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.gmtCreate.hashCode()) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public String toString() {
        return "ScheduleAlarm(uuid=" + this.uuid + ", name=" + this.name + ", type=" + this.type + ", beforeDay=" + this.beforeDay + ", notifyTime=" + this.notifyTime + ", workUuid=" + this.workUuid + ", projectUuid=" + this.projectUuid + ", alarm=" + this.alarm + ", opened=" + this.opened + ", nextTime=" + this.nextTime + ", remark=" + this.remark + ", gmtCreate=" + this.gmtCreate + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public ScheduleAlarm(String uuid, String name, String type, String beforeDay, String notifyTime, String workUuid, String projectUuid, boolean z, boolean z2, String nextTime, String remark, String gmtCreate, String extField1, String extField2, String extField3, int i, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beforeDay, "beforeDay");
        Intrinsics.checkNotNullParameter(notifyTime, "notifyTime");
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(nextTime, "nextTime");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.uuid = uuid;
        this.name = name;
        this.type = type;
        this.beforeDay = beforeDay;
        this.notifyTime = notifyTime;
        this.workUuid = workUuid;
        this.projectUuid = projectUuid;
        this.alarm = z;
        this.opened = z2;
        this.nextTime = nextTime;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.cc = i;
        this.cid = cid;
        this.nextAlertTime = "";
    }

    public /* synthetic */ ScheduleAlarm(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8, String str9, String str10, String str11, String str12, String str13, int i, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? NotificationCompat.CATEGORY_ALARM : str3, (i2 & 8) != 0 ? AdConstants.FAIL : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? "" : str14);
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

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getBeforeDay() {
        return this.beforeDay;
    }

    public final void setBeforeDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beforeDay = str;
    }

    public final String getNotifyTime() {
        return this.notifyTime;
    }

    public final void setNotifyTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notifyTime = str;
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

    public final boolean getAlarm() {
        return this.alarm;
    }

    public final void setAlarm(boolean z) {
        this.alarm = z;
    }

    public final boolean getOpened() {
        return this.opened;
    }

    public final void setOpened(boolean z) {
        this.opened = z;
    }

    public final String getNextTime() {
        return this.nextTime;
    }

    public final void setNextTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextTime = str;
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

    public final ScheduleWork getRefWork() {
        return this.refWork;
    }

    public final void setRefWork(ScheduleWork scheduleWork) {
        this.refWork = scheduleWork;
    }

    public final String getNextAlertTime() {
        return this.nextAlertTime;
    }

    public final void setNextAlertTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextAlertTime = str;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final String isValid() {
        if (Intrinsics.areEqual(this.beforeDay, "")) {
            return "什么时候提醒不能为空";
        }
        if (Intrinsics.areEqual(this.notifyTime, "")) {
            return "提醒时间不能为空";
        }
        return Intrinsics.areEqual(this.workUuid, "") ? "提醒班次不能为空" : "ok";
    }

    public final String beforeInfo() {
        Object next;
        List<SelectDO> BEFORE_NOTIFY_DAYS = SelectUtil.BEFORE_NOTIFY_DAYS;
        Intrinsics.checkNotNullExpressionValue(BEFORE_NOTIFY_DAYS, "BEFORE_NOTIFY_DAYS");
        Iterator<T> it = BEFORE_NOTIFY_DAYS.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SelectDO) next).value, this.beforeDay));
        SelectDO selectDO = (SelectDO) next;
        String str = selectDO != null ? selectDO.label : null;
        return str == null ? "错误" : str;
    }

    public final String beforeInfo2() {
        if (Intrinsics.areEqual(this.beforeDay, AdConstants.FAIL)) {
            return "今天";
        }
        return Intrinsics.areEqual(this.beforeDay, "1") ? "明天" : "";
    }

    public final String realRemark() {
        return Intrinsics.areEqual(this.remark, "") ? "来自计划师提醒" : this.remark;
    }

    public final String nextTimeInfo() {
        if (Intrinsics.areEqual(this.nextTime, "")) {
            return "近7天无提醒";
        }
        return this.nextTime + "提醒";
    }

    public final int fetchOrder() {
        if (!this.opened) {
            return 1000000;
        }
        if (Intrinsics.areEqual(this.nextAlertTime, "")) {
            return 100000;
        }
        return (int) (((MyDateTool.parseShortDateTimeString(this.nextAlertTime).getTime() - System.currentTimeMillis()) / ((long) 1000)) / ((long) 60));
    }
}