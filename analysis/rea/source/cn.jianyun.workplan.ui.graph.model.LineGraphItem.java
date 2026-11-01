package cn.jianyun.workplan.ui.graph.model;

import com.alipay.sdk.m.u0.b;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LineGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/ui/graph/model/LineGraphItem;", "", "day", "", "showDay", "x", "", b.f2259d, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "getShowDay", "setShowDay", "getValue", "setValue", "getX", "()I", "setX", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", AdType.TYPE_OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LineGraphItem {
    public static final int $stable = 8;
    private String day;
    private String showDay;
    private String value;
    private int x;

    public LineGraphItem() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ LineGraphItem copy$default(LineGraphItem lineGraphItem, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lineGraphItem.day;
        }
        if ((i2 & 2) != 0) {
            str2 = lineGraphItem.showDay;
        }
        if ((i2 & 4) != 0) {
            i = lineGraphItem.x;
        }
        if ((i2 & 8) != 0) {
            str3 = lineGraphItem.value;
        }
        return lineGraphItem.copy(str, str2, i, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShowDay() {
        return this.showDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final LineGraphItem copy(String day, String showDay, int x, String value) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(showDay, "showDay");
        Intrinsics.checkNotNullParameter(value, "value");
        return new LineGraphItem(day, showDay, x, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineGraphItem)) {
            return false;
        }
        LineGraphItem lineGraphItem = (LineGraphItem) other;
        return Intrinsics.areEqual(this.day, lineGraphItem.day) && Intrinsics.areEqual(this.showDay, lineGraphItem.showDay) && this.x == lineGraphItem.x && Intrinsics.areEqual(this.value, lineGraphItem.value);
    }

    public int hashCode() {
        return (((((this.day.hashCode() * 31) + this.showDay.hashCode()) * 31) + Integer.hashCode(this.x)) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "LineGraphItem(day=" + this.day + ", showDay=" + this.showDay + ", x=" + this.x + ", value=" + this.value + ")";
    }

    public LineGraphItem(String day, String showDay, int i, String value) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(showDay, "showDay");
        Intrinsics.checkNotNullParameter(value, "value");
        this.day = day;
        this.showDay = showDay;
        this.x = i;
        this.value = value;
    }

    public /* synthetic */ LineGraphItem(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final String getShowDay() {
        return this.showDay;
    }

    public final void setShowDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.showDay = str;
    }

    public final int getX() {
        return this.x;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }
}