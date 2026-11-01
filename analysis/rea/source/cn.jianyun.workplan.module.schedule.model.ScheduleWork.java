package cn.jianyun.workplan.module.schedule.model;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.SelectDO;
import com.alibaba.fastjson2.JSON;
import com.tianmu.biz.bean.AdType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleWork.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\t\u0010N\u001a\u00020\fHÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u000fHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\fHÆ\u0003JÑ\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010`\u001a\u00020\f2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010b\u001a\u00020\u0003J\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020\u0003J\u0006\u0010f\u001a\u00020\u0000J\u0006\u0010g\u001a\u00020\u0003J\u0006\u0010h\u001a\u00020\u0000J\u0006\u0010i\u001a\u00020\u0003J\u0006\u0010j\u001a\u00020\u0003J\t\u0010k\u001a\u00020\u000fHÖ\u0001J\u0006\u0010l\u001a\u00020\fJ\u0006\u0010m\u001a\u00020\u0003J\u0006\u0010n\u001a\u00020oJ\t\u0010p\u001a\u00020\u0003HÖ\u0001J\u0006\u0010q\u001a\u00020oR\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010\u001dR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!¨\u0006r"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "", "uuid", "", "name", "userId", "gmtBegin", "gmtEnd", "remark", "theme", "projectUuid", "complex", "", "config", "ordinal", "", "fullDay", "state", "gmtCreate", "subId", "extField1", "extField2", "extField3", "cc", "cid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCc", "()I", "setCc", "(I)V", "getCid", "()Ljava/lang/String;", "setCid", "(Ljava/lang/String;)V", "cnt", "getCnt", "setCnt", "getComplex", "()Z", "setComplex", "(Z)V", "getConfig", "setConfig", "getExtField1", "setExtField1", "getExtField2", "setExtField2", "getExtField3", "setExtField3", "getFullDay", "setFullDay", "getGmtBegin", "setGmtBegin", "getGmtCreate", "setGmtCreate", "getGmtEnd", "setGmtEnd", "getName", "setName", "getOrdinal", "setOrdinal", "getProjectUuid", "setProjectUuid", "getRemark", "setRemark", "getState", "setState", "getSubId", "setSubId", "getTheme", "setTheme", "getUserId", "setUserId", "getUuid", "setUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "fetchBeginTime", "fetchCombineColor", "Landroidx/compose/ui/graphics/Brush;", "fetchEndTime", "fetchFirstWork", "fetchFirstWorkUuid", "fetchSecondWork", "fetchSecondWorkUuid", "fetchShownTime", "hashCode", "isAdd", "isValid", "toSelect", "Lcn/jianyun/workplan/util/SelectDO;", "toString", "toSubSelect", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScheduleWork {
    public static final int $stable = 8;
    private int cc;
    private String cid;
    private int cnt;
    private boolean complex;
    private String config;
    private String extField1;
    private String extField2;
    private String extField3;
    private boolean fullDay;
    private String gmtBegin;
    private String gmtCreate;
    private String gmtEnd;
    private String name;
    private int ordinal;
    private String projectUuid;
    private String remark;
    private int state;
    private String subId;
    private String theme;
    private String userId;
    private String uuid;

    public ScheduleWork() {
        this(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFullDay() {
        return this.fullDay;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSubId() {
        return this.subId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExtField1() {
        return this.extField1;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getExtField2() {
        return this.extField2;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getExtField3() {
        return this.extField3;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getCc() {
        return this.cc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCid() {
        return this.cid;
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
    public final boolean getComplex() {
        return this.complex;
    }

    public final ScheduleWork copy(String uuid, String name, String userId, String gmtBegin, String gmtEnd, String remark, String theme, String projectUuid, boolean complex, String config, int ordinal, boolean fullDay, int state, String gmtCreate, String subId, String extField1, String extField2, String extField3, int cc, String cid) {
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
        Intrinsics.checkNotNullParameter(subId, "subId");
        Intrinsics.checkNotNullParameter(extField1, "extField1");
        Intrinsics.checkNotNullParameter(extField2, "extField2");
        Intrinsics.checkNotNullParameter(extField3, "extField3");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new ScheduleWork(uuid, name, userId, gmtBegin, gmtEnd, remark, theme, projectUuid, complex, config, ordinal, fullDay, state, gmtCreate, subId, extField1, extField2, extField3, cc, cid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleWork)) {
            return false;
        }
        ScheduleWork scheduleWork = (ScheduleWork) other;
        return Intrinsics.areEqual(this.uuid, scheduleWork.uuid) && Intrinsics.areEqual(this.name, scheduleWork.name) && Intrinsics.areEqual(this.userId, scheduleWork.userId) && Intrinsics.areEqual(this.gmtBegin, scheduleWork.gmtBegin) && Intrinsics.areEqual(this.gmtEnd, scheduleWork.gmtEnd) && Intrinsics.areEqual(this.remark, scheduleWork.remark) && Intrinsics.areEqual(this.theme, scheduleWork.theme) && Intrinsics.areEqual(this.projectUuid, scheduleWork.projectUuid) && this.complex == scheduleWork.complex && Intrinsics.areEqual(this.config, scheduleWork.config) && this.ordinal == scheduleWork.ordinal && this.fullDay == scheduleWork.fullDay && this.state == scheduleWork.state && Intrinsics.areEqual(this.gmtCreate, scheduleWork.gmtCreate) && Intrinsics.areEqual(this.subId, scheduleWork.subId) && Intrinsics.areEqual(this.extField1, scheduleWork.extField1) && Intrinsics.areEqual(this.extField2, scheduleWork.extField2) && Intrinsics.areEqual(this.extField3, scheduleWork.extField3) && this.cc == scheduleWork.cc && Intrinsics.areEqual(this.cid, scheduleWork.cid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.gmtBegin.hashCode()) * 31) + this.gmtEnd.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.theme.hashCode()) * 31) + this.projectUuid.hashCode()) * 31;
        boolean z = this.complex;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((iHashCode + r1) * 31) + this.config.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31;
        boolean z2 = this.fullDay;
        return ((((((((((((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.state)) * 31) + this.gmtCreate.hashCode()) * 31) + this.subId.hashCode()) * 31) + this.extField1.hashCode()) * 31) + this.extField2.hashCode()) * 31) + this.extField3.hashCode()) * 31) + Integer.hashCode(this.cc)) * 31) + this.cid.hashCode();
    }

    public String toString() {
        return "ScheduleWork(uuid=" + this.uuid + ", name=" + this.name + ", userId=" + this.userId + ", gmtBegin=" + this.gmtBegin + ", gmtEnd=" + this.gmtEnd + ", remark=" + this.remark + ", theme=" + this.theme + ", projectUuid=" + this.projectUuid + ", complex=" + this.complex + ", config=" + this.config + ", ordinal=" + this.ordinal + ", fullDay=" + this.fullDay + ", state=" + this.state + ", gmtCreate=" + this.gmtCreate + ", subId=" + this.subId + ", extField1=" + this.extField1 + ", extField2=" + this.extField2 + ", extField3=" + this.extField3 + ", cc=" + this.cc + ", cid=" + this.cid + ")";
    }

    public ScheduleWork(String uuid, String name, String userId, String gmtBegin, String gmtEnd, String remark, String theme, String projectUuid, boolean z, String config, int i, boolean z2, int i2, String gmtCreate, String subId, String extField1, String extField2, String extField3, int i3, String cid) {
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
        Intrinsics.checkNotNullParameter(subId, "subId");
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
        this.complex = z;
        this.config = config;
        this.ordinal = i;
        this.fullDay = z2;
        this.state = i2;
        this.gmtCreate = gmtCreate;
        this.subId = subId;
        this.extField1 = extField1;
        this.extField2 = extField2;
        this.extField3 = extField3;
        this.cc = i3;
        this.cid = cid;
    }

    public /* synthetic */ ScheduleWork(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, int i, boolean z2, int i2, String str10, String str11, String str12, String str13, String str14, int i3, String str15, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? "" : str7, (i4 & 128) != 0 ? "" : str8, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? "" : str9, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? false : z2, (i4 & 4096) != 0 ? 0 : i2, (i4 & 8192) != 0 ? "" : str10, (i4 & 16384) != 0 ? "" : str11, (i4 & 32768) != 0 ? "" : str12, (i4 & 65536) != 0 ? "" : str13, (i4 & 131072) != 0 ? "" : str14, (i4 & 262144) != 0 ? 0 : i3, (i4 & 524288) != 0 ? "" : str15);
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

    public final boolean getComplex() {
        return this.complex;
    }

    public final void setComplex(boolean z) {
        this.complex = z;
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

    public final boolean getFullDay() {
        return this.fullDay;
    }

    public final void setFullDay(boolean z) {
        this.fullDay = z;
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

    public final String getSubId() {
        return this.subId;
    }

    public final void setSubId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subId = str;
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

    public final int getCnt() {
        return this.cnt;
    }

    public final void setCnt(int i) {
        this.cnt = i;
    }

    public final boolean isAdd() {
        return Intrinsics.areEqual(this.uuid, "");
    }

    public final SelectDO toSelect() {
        return new SelectDO(this.name, this.uuid);
    }

    public final SelectDO toSubSelect() {
        return new SelectDO(this.name, this.subId);
    }

    public final String fetchShownTime() {
        if (Intrinsics.areEqual(this.uuid, "")) {
            return "";
        }
        if (this.fullDay) {
            return "全天";
        }
        if (this.gmtBegin.compareTo(this.gmtEnd) <= 0) {
            return this.gmtBegin + "~" + this.gmtEnd;
        }
        return this.gmtBegin + "~次日" + this.gmtEnd;
    }

    public final String fetchBeginTime() {
        return this.fullDay ? "全天" : this.gmtBegin;
    }

    public final String fetchEndTime() {
        return this.fullDay ? "全天" : this.gmtEnd;
    }

    public final String isValid() {
        if (Intrinsics.areEqual(this.name, "")) {
            return "班次不能为空";
        }
        if (this.name.length() > 5) {
            return "班次名字不能超过5个字";
        }
        if (this.complex) {
            return "ok";
        }
        if (!this.fullDay) {
            if (Intrinsics.areEqual(this.gmtBegin, "")) {
                return "开始时间不能为空";
            }
            if (Intrinsics.areEqual(this.gmtEnd, "")) {
                return "结束时间不能为空";
            }
        }
        return Intrinsics.areEqual(this.theme, "") ? "班次样式不能为空" : "ok";
    }

    public final ScheduleWork fetchFirstWork() {
        if (!this.complex) {
            return this;
        }
        if (Intrinsics.areEqual(this.config, "")) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        Object obj = JSON.parseArray(this.config, ScheduleWork.class).get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "k.get(0)");
        return (ScheduleWork) obj;
    }

    public final ScheduleWork fetchSecondWork() {
        if (!this.complex) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        if (Intrinsics.areEqual(this.config, "")) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        Object obj = JSON.parseArray(this.config, ScheduleWork.class).get(1);
        Intrinsics.checkNotNullExpressionValue(obj, "k.get(1)");
        return (ScheduleWork) obj;
    }

    public final String fetchFirstWorkUuid() {
        return fetchFirstWork().uuid;
    }

    public final String fetchSecondWorkUuid() {
        return fetchSecondWork().uuid;
    }

    public final Brush fetchCombineColor() {
        if (!this.complex) {
            return Brush.Companion.m3704horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(CommonToolKt.color(this.theme)), Color.m3745boximpl(CommonToolKt.color(this.theme))}), 0.0f, 0.0f, 0, 14, (Object) null);
        }
        if (Intrinsics.areEqual(this.config, "")) {
            return Brush.Companion.m3704horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(Color.m3754copywmQWz5c$default(ColorKt.getThemeColor(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3745boximpl(Color.m3754copywmQWz5c$default(ColorKt.getThemeColor(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null);
        }
        List array = JSON.parseArray(this.config, ScheduleWork.class);
        return Brush.Companion.m3704horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(CommonToolKt.color(((ScheduleWork) array.get(0)).theme)), Color.m3745boximpl(CommonToolKt.color(((ScheduleWork) array.get(1)).theme))}), 0.0f, 0.0f, 0, 14, (Object) null);
    }
}