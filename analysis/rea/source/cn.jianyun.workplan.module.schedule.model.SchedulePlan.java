package cn.jianyun.workplan.module.schedule.model;

import cn.jianyun.workplan.util.SelectDO;
import com.alibaba.fastjson2.JSON;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: SchedulePlan.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RJ\t\u0010T\u001a\u00020\rHÖ\u0001J\u0006\u0010U\u001a\u00020OJ\u0006\u0010V\u001a\u00020\u0003J\u0006\u0010W\u001a\u00020XJ\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006Z"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "", "uuid", "", "name", "userId", "gmtBegin", "gmtEnd", "remark", "theme", "projectUuid", "config", "ordinal", "", "state", "gmtCreate", "extField1", "extField2", "extField3", "cc", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCc", "()I", "setCc", "(I)V", "getCid", "()Ljava/lang/String;", "setCid", "(Ljava/lang/String;)V", "getConfig", "setConfig", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getGmtBegin", "setGmtBegin", "getGmtCreate", "setGmtCreate", "getGmtEnd", "setGmtEnd", "getName", "setName", "getOrdinal", "setOrdinal", "getProjectUuid", "setProjectUuid", "getRemark", "setRemark", "getState", "setState", "getTheme", "setTheme", "getUserId", "setUserId", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "fetchPlans", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "hashCode", "isAdd", "isValid", "toSelect", "Lcn/jianyun/workplan/util/SelectDO;", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SchedulePlan {
    public static final int $stable = 8;
    private int cc;
    private String cid;
    private String config;
    private String extField1;
    private String extField2;
    private String extField3;
    private String gmtBegin;
    private String gmtCreate;
    private String gmtEnd;
    private String name;
    private int ordinal;
    private String projectUuid;
    private String remark;
    private int state;
    private String theme;
    private String userId;
    private String uuid;

    public SchedulePlan() {
        this(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, 131071, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getState() {
        return this.state;
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
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProjectUuid() {
        return this.projectUuid;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    public final SchedulePlan copy(String uuid, String name, String userId, String gmtBegin, String gmtEnd, String remark, String theme, String projectUuid, String config, int ordinal, int state, String gmtCreate, String extField1, String extField2, String extField3, int cc, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new SchedulePlan(uuid, name, userId, gmtBegin, gmtEnd, remark, theme, projectUuid, config, ordinal, state, gmtCreate, extField1, extField2, extField3, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulePlan)) {
            return false;
        }
        SchedulePlan schedulePlan = (SchedulePlan) other;
        return Intrinsics.areEqual(this.uuid, schedulePlan.uuid) && Intrinsics.areEqual(this.name, schedulePlan.name) && Intrinsics.areEqual(this.userId, schedulePlan.userId) && Intrinsics.areEqual(this.gmtBegin, schedulePlan.gmtBegin) && Intrinsics.areEqual(this.gmtEnd, schedulePlan.gmtEnd) && Intrinsics.areEqual(this.remark, schedulePlan.remark) && Intrinsics.areEqual(this.theme, schedulePlan.theme) && Intrinsics.areEqual(this.projectUuid, schedulePlan.projectUuid) && Intrinsics.areEqual(this.config, schedulePlan.config) && this.ordinal == schedulePlan.ordinal && this.state == schedulePlan.state && Intrinsics.areEqual(this.gmtCreate, schedulePlan.gmtCreate) && Intrinsics.areEqual(this.extField1, schedulePlan.extField1) && Intrinsics.areEqual(this.extField2, schedulePlan.extField2) && Intrinsics.areEqual(this.extField3, schedulePlan.extField3) && this.cc == schedulePlan.cc && Intrinsics.areEqual(this.cid, schedulePlan.cid);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.gmtBegin.hashCode()) * 31) + this.gmtEnd.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.theme.hashCode()) * 31) + this.projectUuid.hashCode()) * 31) + this.config.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + Integer.hashCode(this.state)) * 31) + this.gmtCreate.hashCode()) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public String toString() {
        return "SchedulePlan(uuid=" + this.uuid + ", name=" + this.name + ", userId=" + this.userId + ", gmtBegin=" + this.gmtBegin + ", gmtEnd=" + this.gmtEnd + ", remark=" + this.remark + ", theme=" + this.theme + ", projectUuid=" + this.projectUuid + ", config=" + this.config + ", ordinal=" + this.ordinal + ", state=" + this.state + ", gmtCreate=" + this.gmtCreate + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public SchedulePlan(String uuid, String name, String userId, String gmtBegin, String gmtEnd, String remark, String theme, String projectUuid, String config, int i, int i2, String gmtCreate, String extField1, String extField2, String extField3, int i3, String cid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(projectUuid, "projectUuid");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.uuid = uuid;
        this.name = name;
        this.userId = userId;
        this.gmtBegin = gmtBegin;
        this.gmtEnd = gmtEnd;
        this.remark = remark;
        this.theme = theme;
        this.projectUuid = projectUuid;
        this.config = config;
        this.ordinal = i;
        this.state = i2;
        this.gmtCreate = gmtCreate;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.cc = i3;
        this.cid = cid;
    }

    public /* synthetic */ SchedulePlan(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, String str12, String str13, int i3, String str14, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) != 0 ? "" : str8, (i4 & 256) != 0 ? "" : str9, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) != 0 ? "" : str10, (i4 & 4096) != 0 ? "" : str11, (i4 & 8192) != 0 ? "" : str12, (i4 & 16384) != 0 ? "" : str13, (i4 & 32768) != 0 ? 0 : i3, (i4 & 65536) != 0 ? "" : str14);
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

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
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

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final void setTheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.theme = str;
    }

    public final String getProjectUuid() {
        return this.projectUuid;
    }

    public final void setProjectUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectUuid = str;
    }

    public final String getConfig() {
        return this.config;
    }

    public final void setConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.config = str;
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
        if (Intrinsics.areEqual(this.name, "")) {
            return "名称不能为空";
        }
        return (Intrinsics.areEqual(this.config, "") || Intrinsics.areEqual(this.config, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) ? "至少选择一个班次来轮班" : "ok";
    }

    public final List<ScheduleWork> fetchPlans() {
        if (Intrinsics.areEqual(this.config, "")) {
            return CollectionsKt.emptyList();
        }
        List<ScheduleWork> array = JSON.parseArray(this.config, ScheduleWork.class);
        Intrinsics.checkNotNullExpressionValue(array, "parseArray(config, ScheduleWork::class.java)");
        return array;
    }
}