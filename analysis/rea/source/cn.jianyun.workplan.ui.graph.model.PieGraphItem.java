package cn.jianyun.workplan.ui.graph.model;

import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDataTool;
import com.adgain.sdk.base.models.AdConstants;
import com.alipay.sdk.m.u0.b;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.poi.ss.formula.functions.Complex;

/* JADX INFO: compiled from: PieGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006!"}, d2 = {"Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;", "", "name", "", b.f2259d, "color", "percent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getColor", "()Ljava/lang/String;", "getName", "getPercent", "()F", "setPercent", "(F)V", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", AdType.TYPE_OTHER, AdConstants.total, "hashCode", "", "label", Complex.DEFAULT_SUFFIX, "percentValue", "showName", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PieGraphItem {
    public static final int $stable = 8;
    private final String color;
    private final String name;
    private float percent;
    private final String value;

    public PieGraphItem() {
        this(null, null, null, 0.0f, 15, null);
    }

    public static /* synthetic */ PieGraphItem copy$default(PieGraphItem pieGraphItem, String str, String str2, String str3, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pieGraphItem.name;
        }
        if ((i & 2) != 0) {
            str2 = pieGraphItem.value;
        }
        if ((i & 4) != 0) {
            str3 = pieGraphItem.color;
        }
        if ((i & 8) != 0) {
            f2 = pieGraphItem.percent;
        }
        return pieGraphItem.copy(str, str2, str3, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    public final PieGraphItem copy(String name, String value, String color, float percent) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(color, "color");
        return new PieGraphItem(name, value, color, percent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PieGraphItem)) {
            return false;
        }
        PieGraphItem pieGraphItem = (PieGraphItem) other;
        return Intrinsics.areEqual(this.name, pieGraphItem.name) && Intrinsics.areEqual(this.value, pieGraphItem.value) && Intrinsics.areEqual(this.color, pieGraphItem.color) && Float.compare(this.percent, pieGraphItem.percent) == 0;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.percent);
    }

    public String toString() {
        return "PieGraphItem(name=" + this.name + ", value=" + this.value + ", color=" + this.color + ", percent=" + this.percent + ")";
    }

    public PieGraphItem(String name, String value, String color, float f2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(color, "color");
        this.name = name;
        this.value = value;
        this.color = color;
        this.percent = f2;
    }

    public /* synthetic */ PieGraphItem(String str, String str2, String str3, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0f : f2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getColor() {
        return this.color;
    }

    public final float getPercent() {
        return this.percent;
    }

    public final void setPercent(float f2) {
        this.percent = f2;
    }

    public final String label(int i) {
        if (i > 2 && this.percent < 8.0f) {
            return "";
        }
        return showName() + " " + MyDataTool.getShownPrice(String.valueOf(this.percent), 0) + "%";
    }

    public final String showName() {
        if (this.name.length() > 5) {
            String strSubstring = this.name.substring(0, 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        return this.name;
    }

    public final String percentValue() {
        return MyDataTool.getShownPrice(String.valueOf(this.percent), 0) + "%";
    }

    public final float getPercent(float total) {
        if (total == 0.0f) {
            return 0.0f;
        }
        return (Math.abs(CommonToolKt.toFloatData(this.value, 2)) / total) * 100;
    }
}