package cn.jianyun.workplan.model;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StatTimeModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcn/jianyun/workplan/model/StatTimeModel;", "", "gmtBegin", "", "gmtEnd", "(Ljava/lang/String;Ljava/lang/String;)V", "getGmtBegin", "()Ljava/lang/String;", "getGmtEnd", "component1", "component2", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "isValid", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StatTimeModel {
    public static final int $stable = 0;
    private final String gmtBegin;
    private final String gmtEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public StatTimeModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StatTimeModel copy$default(StatTimeModel statTimeModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statTimeModel.gmtBegin;
        }
        if ((i & 2) != 0) {
            str2 = statTimeModel.gmtEnd;
        }
        return statTimeModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    public final StatTimeModel copy(String gmtBegin, String gmtEnd) {
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        return new StatTimeModel(gmtBegin, gmtEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatTimeModel)) {
            return false;
        }
        StatTimeModel statTimeModel = (StatTimeModel) other;
        return Intrinsics.areEqual(this.gmtBegin, statTimeModel.gmtBegin) && Intrinsics.areEqual(this.gmtEnd, statTimeModel.gmtEnd);
    }

    public int hashCode() {
        return (this.gmtBegin.hashCode() * 31) + this.gmtEnd.hashCode();
    }

    public String toString() {
        return "StatTimeModel(gmtBegin=" + this.gmtBegin + ", gmtEnd=" + this.gmtEnd + ")";
    }

    public StatTimeModel(String gmtBegin, String gmtEnd) {
        Intrinsics.checkNotNullParameter(gmtBegin, "gmtBegin");
        Intrinsics.checkNotNullParameter(gmtEnd, "gmtEnd");
        this.gmtBegin = gmtBegin;
        this.gmtEnd = gmtEnd;
    }

    public /* synthetic */ StatTimeModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "2024-05-01" : str, (i & 2) != 0 ? "2024-05-30" : str2);
    }

    public final String getGmtBegin() {
        return this.gmtBegin;
    }

    public final String getGmtEnd() {
        return this.gmtEnd;
    }

    public final boolean isValid() {
        return (Intrinsics.areEqual(this.gmtBegin, "") || Intrinsics.areEqual(this.gmtEnd, "")) ? false : true;
    }
}