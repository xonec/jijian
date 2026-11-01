package cn.jianyun.workplan.ui.graph.model;

import com.alipay.sdk.m.c0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PieGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0018"}, d2 = {"Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "", "title", "", "unit", "datalist", "", "Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;", "centerText", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCenterText", "()Ljava/lang/String;", "setCenterText", "(Ljava/lang/String;)V", "getDatalist", "()Ljava/util/List;", "setDatalist", "(Ljava/util/List;)V", "getTitle", d.p, "getUnit", "setUnit", "isValid", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PieGraphData {
    public static final int $stable = 8;
    private String centerText;
    private List<PieGraphItem> datalist;
    private String title;
    private String unit;

    public PieGraphData() {
        this(null, null, null, null, 15, null);
    }

    public PieGraphData(String title, String unit, List<PieGraphItem> datalist, String centerText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(datalist, "datalist");
        Intrinsics.checkNotNullParameter(centerText, "centerText");
        this.title = title;
        this.unit = unit;
        this.datalist = datalist;
        this.centerText = centerText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final void setUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unit = str;
    }

    public /* synthetic */ PieGraphData(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3);
    }

    public final List<PieGraphItem> getDatalist() {
        return this.datalist;
    }

    public final void setDatalist(List<PieGraphItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist = list;
    }

    public final String getCenterText() {
        return this.centerText;
    }

    public final void setCenterText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.centerText = str;
    }

    public final boolean isValid() {
        return !this.datalist.isEmpty();
    }
}