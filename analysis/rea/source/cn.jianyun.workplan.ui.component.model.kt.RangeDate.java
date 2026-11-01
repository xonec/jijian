package cn.jianyun.workplan.ui.component.model.kt;

import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RangeDate.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "", "beginDate", "", "endDate", "(Ljava/lang/String;Ljava/lang/String;)V", "getBeginDate", "()Ljava/lang/String;", "setBeginDate", "(Ljava/lang/String;)V", "getEndDate", "setEndDate", "component1", "component2", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "", "isValid", "showBeginDate", "showEndDate", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RangeDate {
    public static final int $stable = 8;
    private String beginDate;
    private String endDate;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeDate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RangeDate copy$default(RangeDate rangeDate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rangeDate.beginDate;
        }
        if ((i & 2) != 0) {
            str2 = rangeDate.endDate;
        }
        return rangeDate.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBeginDate() {
        return this.beginDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final RangeDate copy(String beginDate, String endDate) {
        Intrinsics.checkNotNullParameter(beginDate, "beginDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return new RangeDate(beginDate, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeDate)) {
            return false;
        }
        RangeDate rangeDate = (RangeDate) other;
        return Intrinsics.areEqual(this.beginDate, rangeDate.beginDate) && Intrinsics.areEqual(this.endDate, rangeDate.endDate);
    }

    public int hashCode() {
        return (this.beginDate.hashCode() * 31) + this.endDate.hashCode();
    }

    public String toString() {
        return "RangeDate(beginDate=" + this.beginDate + ", endDate=" + this.endDate + ")";
    }

    public RangeDate(String beginDate, String endDate) {
        Intrinsics.checkNotNullParameter(beginDate, "beginDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public /* synthetic */ RangeDate(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getBeginDate() {
        return this.beginDate;
    }

    public final void setBeginDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beginDate = str;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final void setEndDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endDate = str;
    }

    public final boolean isValid() {
        return (Intrinsics.areEqual(this.beginDate, "") || Intrinsics.areEqual(this.endDate, "")) ? false : true;
    }

    public final String showBeginDate() {
        return Intrinsics.areEqual(this.beginDate, "") ? "开始日期" : this.beginDate;
    }

    public final String showEndDate() {
        return Intrinsics.areEqual(this.endDate, "") ? "结束日期" : this.endDate;
    }
}