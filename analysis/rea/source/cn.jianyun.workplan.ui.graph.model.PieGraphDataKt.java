package cn.jianyun.workplan.ui.graph.model;

import cn.jianyun.workplan.util.CommonToolKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: PieGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e\" \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"colors", "", "", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "makePieStatData", "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "title", "unit", "datalist", "Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;", XmlErrorCodes.DECIMAL, "", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PieGraphDataKt {
    private static List<String> colors = CollectionsKt.listOf((Object[]) new String[]{"#46B887", "#F07C82", "#894276", "#12AA9C", "#E7A23F", "#D99156", "#475164", "#EE8055", "#1661AB", "#8A998E", "#22A2C3", "#8DC269", "#FA7E23", "#8D91AA", "#A6BAB0", "#5E5D65", "#B7B7BD", "#B09279", "#9EA886", "#5B7494", "#A05B52", "#D19977", "#B98A82", "#ACAB79", "#6F7887", "#7F8976", "#9AA2AE", "#BFCAC3", "#79677B", "#8B7C93"});

    public static final List<String> getColors() {
        return colors;
    }

    public static final void setColors(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        colors = list;
    }

    public static /* synthetic */ PieGraphData makePieStatData$default(String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return makePieStatData(str, str2, list, i);
    }

    public static final PieGraphData makePieStatData(String title, String unit, List<PieGraphItem> datalist, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(datalist, "datalist");
        if (datalist.isEmpty()) {
            return new PieGraphData(title, unit, CollectionsKt.emptyList(), null, 8, null);
        }
        ArrayList arrayList = new ArrayList();
        final PieGraphDataKt$makePieStatData$k$1 pieGraphDataKt$makePieStatData$k$1 = new Function2<PieGraphItem, PieGraphItem, Integer>() { // from class: cn.jianyun.workplan.ui.graph.model.PieGraphDataKt$makePieStatData$k$1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(PieGraphItem pieGraphItem, PieGraphItem pieGraphItem2) {
                float f2 = 100;
                return Integer.valueOf((int) ((Math.abs(CommonToolKt.toFloatData(pieGraphItem2.getValue(), 2)) * f2) - (Math.abs(CommonToolKt.toFloatData(pieGraphItem.getValue(), 2)) * f2)));
            }
        };
        List<PieGraphItem> listSortedWith = CollectionsKt.sortedWith(datalist, new Comparator() { // from class: cn.jianyun.workplan.ui.graph.model.PieGraphDataKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PieGraphDataKt.makePieStatData$lambda$0(pieGraphDataKt$makePieStatData$k$1, obj, obj2);
            }
        });
        Iterator it = listSortedWith.iterator();
        float floatData = 0.0f;
        while (it.hasNext()) {
            floatData += CommonToolKt.toFloatData(((PieGraphItem) it.next()).getValue(), 2);
        }
        int i2 = 0;
        for (PieGraphItem pieGraphItem : listSortedWith) {
            boolean zAreEqual = Intrinsics.areEqual(pieGraphItem.getColor(), "");
            List<String> list = colors;
            arrayList.add(PieGraphItem.copy$default(pieGraphItem, null, null, (String) CommonToolKt.ifv(zAreEqual, list.get(i2 % list.size()), pieGraphItem.getColor()), pieGraphItem.getPercent(floatData), 3, null));
            i2++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(CommonToolKt.toFloatData(((PieGraphItem) obj).getValue(), i) == 0.0f)) {
                arrayList2.add(obj);
            }
        }
        final AnonymousClass4 anonymousClass4 = new Function2<PieGraphItem, PieGraphItem, Integer>() { // from class: cn.jianyun.workplan.ui.graph.model.PieGraphDataKt.makePieStatData.4
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(PieGraphItem pieGraphItem2, PieGraphItem pieGraphItem3) {
                return Integer.valueOf((int) (pieGraphItem3.getPercent() - pieGraphItem2.getPercent()));
            }
        };
        return new PieGraphData(title, unit, CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: cn.jianyun.workplan.ui.graph.model.PieGraphDataKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return PieGraphDataKt.makePieStatData$lambda$4(anonymousClass4, obj2, obj3);
            }
        }), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int makePieStatData$lambda$0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int makePieStatData$lambda$4(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}