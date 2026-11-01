package cn.jianyun.workplan.ui.graph.model;

import cn.jianyun.workplan.util.MyDataTool;
import com.tianmu.biz.bean.AdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LineGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\bJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\bJ\t\u0010'\u001a\u00020$HÖ\u0001J\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0003H\u0002J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "", "name", "", "unit", "mode", "color", "datalist", "", "Lcn/jianyun/workplan/ui/graph/model/LineGraphItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getDatalist", "()Ljava/util/List;", "setDatalist", "(Ljava/util/List;)V", "getMode", "setMode", "getName", "setName", "getUnit", "setUnit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", AdType.TYPE_OTHER, "fetchMarker", "x", "", "fetchXData", "fetchYData", "hashCode", "step", "", "toNumber", "y", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LineGraphData {
    public static final int $stable = 8;
    private String color;
    private List<LineGraphItem> datalist;
    private String mode;
    private String name;
    private String unit;

    public LineGraphData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineGraphData copy$default(LineGraphData lineGraphData, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineGraphData.name;
        }
        if ((i & 2) != 0) {
            str2 = lineGraphData.unit;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = lineGraphData.mode;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = lineGraphData.color;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = lineGraphData.datalist;
        }
        return lineGraphData.copy(str, str5, str6, str7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final List<LineGraphItem> component5() {
        return this.datalist;
    }

    public final LineGraphData copy(String name, String unit, String mode, String color, List<LineGraphItem> datalist) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(datalist, "datalist");
        return new LineGraphData(name, unit, mode, color, datalist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineGraphData)) {
            return false;
        }
        LineGraphData lineGraphData = (LineGraphData) other;
        return Intrinsics.areEqual(this.name, lineGraphData.name) && Intrinsics.areEqual(this.unit, lineGraphData.unit) && Intrinsics.areEqual(this.mode, lineGraphData.mode) && Intrinsics.areEqual(this.color, lineGraphData.color) && Intrinsics.areEqual(this.datalist, lineGraphData.datalist);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.unit.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.color.hashCode()) * 31) + this.datalist.hashCode();
    }

    public String toString() {
        return "LineGraphData(name=" + this.name + ", unit=" + this.unit + ", mode=" + this.mode + ", color=" + this.color + ", datalist=" + this.datalist + ")";
    }

    public LineGraphData(String name, String unit, String mode, String color, List<LineGraphItem> datalist) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(datalist, "datalist");
        this.name = name;
        this.unit = unit;
        this.mode = mode;
        this.color = color;
        this.datalist = datalist;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final void setUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }

    public final String getMode() {
        return this.mode;
    }

    public final void setMode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mode = str;
    }

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public /* synthetic */ LineGraphData(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<LineGraphItem> getDatalist() {
        return this.datalist;
    }

    public final void setDatalist(List<LineGraphItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist = list;
    }

    public final List<Integer> fetchXData() {
        List<LineGraphItem> list = this.datalist;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((LineGraphItem) it.next()).getX()));
        }
        return arrayList;
    }

    public final List<Integer> fetchYData() {
        List<LineGraphItem> list = this.datalist;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(toNumber(((LineGraphItem) it.next()).getValue())));
        }
        return arrayList;
    }

    public final float step() {
        if (this.datalist.size() >= 30) {
            return this.datalist.size() / 8.0f;
        }
        return this.datalist.size() >= 15 ? 2.0f : 1.0f;
    }

    private final int toNumber(String y) {
        if (Intrinsics.areEqual(this.mode, "time")) {
            String realPrice = MyDataTool.getRealPrice(MyDataTool.timeToDecimal(y), 0);
            Intrinsics.checkNotNullExpressionValue(realPrice, "getRealPrice(MyDataTool.timeToDecimal(y), 0)");
            return Integer.parseInt(realPrice);
        }
        String realPrice2 = MyDataTool.getRealPrice(y, 0);
        Intrinsics.checkNotNullExpressionValue(realPrice2, "getRealPrice(y, 0)");
        return Integer.parseInt(realPrice2);
    }

    public final String fetchMarker(int x) {
        return this.datalist.get(x).getDay() + this.name + " " + MyDataTool.withUnit(this.datalist.get(x).getValue(), this.unit);
    }
}