package cn.jianyun.workplan.module.schedule.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleShareData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u00061"}, d2 = {"Lcn/jianyun/workplan/module/schedule/model/IosProjectDO;", "", "uuid", "", "name", "needDuty", "", "needTime", "needProduct", "ordinal", "", "config", "gmtCreate", "(Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "setConfig", "(Ljava/lang/String;)V", "getGmtCreate", "setGmtCreate", "getName", "setName", "getNeedDuty", "()Z", "setNeedDuty", "(Z)V", "getNeedProduct", "setNeedProduct", "getNeedTime", "setNeedTime", "getOrdinal", "()I", "setOrdinal", "(I)V", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IosProjectDO {
    public static final int $stable = 8;
    private String config;
    private String gmtCreate;
    private String name;
    private boolean needDuty;
    private boolean needProduct;
    private boolean needTime;
    private int ordinal;
    private String uuid;

    public IosProjectDO() {
        this(null, null, false, false, false, 0, null, null, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNeedDuty() {
        return this.needDuty;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedTime() {
        return this.needTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNeedProduct() {
        return this.needProduct;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final IosProjectDO copy(String uuid, String name, boolean needDuty, boolean needTime, boolean needProduct, int ordinal, String config, String gmtCreate) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        return new IosProjectDO(uuid, name, needDuty, needTime, needProduct, ordinal, config, gmtCreate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IosProjectDO)) {
            return false;
        }
        IosProjectDO iosProjectDO = (IosProjectDO) other;
        return Intrinsics.areEqual(this.uuid, iosProjectDO.uuid) && Intrinsics.areEqual(this.name, iosProjectDO.name) && this.needDuty == iosProjectDO.needDuty && this.needTime == iosProjectDO.needTime && this.needProduct == iosProjectDO.needProduct && this.ordinal == iosProjectDO.ordinal && Intrinsics.areEqual(this.config, iosProjectDO.config) && Intrinsics.areEqual(this.gmtCreate, iosProjectDO.gmtCreate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.uuid.hashCode() * 31) + this.name.hashCode()) * 31;
        boolean z = this.needDuty;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.needTime;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.needProduct;
        return ((((((i2 + (z3 ? 1 : z3)) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.config.hashCode()) * 31) + this.gmtCreate.hashCode();
    }

    public String toString() {
        return "IosProjectDO(uuid=" + this.uuid + ", name=" + this.name + ", needDuty=" + this.needDuty + ", needTime=" + this.needTime + ", needProduct=" + this.needProduct + ", ordinal=" + this.ordinal + ", config=" + this.config + ", gmtCreate=" + this.gmtCreate + ")";
    }

    public IosProjectDO(String uuid, String name, boolean z, boolean z2, boolean z3, int i, String config, String gmtCreate) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(gmtCreate, "gmtCreate");
        this.uuid = uuid;
        this.name = name;
        this.needDuty = z;
        this.needTime = z2;
        this.needProduct = z3;
        this.ordinal = i;
        this.config = config;
        this.gmtCreate = gmtCreate;
    }

    public /* synthetic */ IosProjectDO(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? "{}" : str3, (i2 & 128) == 0 ? str4 : "");
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

    public final boolean getNeedDuty() {
        return this.needDuty;
    }

    public final void setNeedDuty(boolean z) {
        this.needDuty = z;
    }

    public final boolean getNeedTime() {
        return this.needTime;
    }

    public final void setNeedTime(boolean z) {
        this.needTime = z;
    }

    public final boolean getNeedProduct() {
        return this.needProduct;
    }

    public final void setNeedProduct(boolean z) {
        this.needProduct = z;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final void setOrdinal(int i) {
        this.ordinal = i;
    }

    public final String getConfig() {
        return this.config;
    }

    public final void setConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.config = str;
    }

    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gmtCreate = str;
    }
}