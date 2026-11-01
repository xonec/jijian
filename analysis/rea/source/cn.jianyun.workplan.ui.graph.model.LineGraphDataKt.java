package cn.jianyun.workplan.ui.graph.model;

import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDataTool;
import cn.jianyun.workplan.util.MyDateTool;
import com.adgain.sdk.base.models.AdConstants;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: LineGraphData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u001aL\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u001aJ\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u001a\u001c\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u0003\u001a\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u0003¨\u0006\u0012"}, d2 = {"makeLineGraphDataByDay", "Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "beginDay", "", "endDay", "unit", "name", "color", "mode", "datalist", "", "Lcn/jianyun/workplan/ui/graph/model/LineGraphItem;", "makeLineGraphDataByMonth", "makeLineGraphStatData", "makeSum", e.m, "makeSumValue", "", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LineGraphDataKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LineGraphData makeLineGraphDataByDay(String str, String str2, String str3, String str4, String str5, String str6, List<LineGraphItem> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (str.compareTo(str2) <= 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((LineGraphItem) obj).getDay(), str)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            String day = MyDateTool.getDay(str);
            Intrinsics.checkNotNullExpressionValue(day, "getDay(t)");
            LineGraphItem lineGraphItem = new LineGraphItem(str, day, i, AdConstants.FAIL);
            if (!arrayList3.isEmpty()) {
                lineGraphItem.setValue(makeSum(arrayList3, str6));
            }
            arrayList.add(lineGraphItem);
            str = MyDateTool.nextDay(str);
            Intrinsics.checkNotNullExpressionValue(str, "nextDay(t)");
            i++;
        }
        return new LineGraphData(str4, str3, str6, str5, CollectionsKt.toList(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineGraphData makeLineGraphDataByMonth(String str, String str2, String str3, String str4, String str5, String str6, List<LineGraphItem> list) {
        String string;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (str.compareTo(str2) <= 0) {
            String month = MyDateTool.toChineseMonthString(CommonDateToolKt.parseDate(str));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((LineGraphItem) obj).getDay(), str)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(month, "month");
                CommonToolKt.pushMapValue(linkedHashMap, month, makeSumValue(arrayList3, str6));
            } else {
                Intrinsics.checkNotNullExpressionValue(month, "month");
                CommonToolKt.pushMapValue(linkedHashMap, month, 0.0f);
            }
            str = MyDateTool.nextDay(str);
            Intrinsics.checkNotNullExpressionValue(str, "nextDay(t)");
        }
        List list2 = CollectionsKt.toList(linkedHashMap.keySet());
        final AnonymousClass1 anonymousClass1 = new Function2<String, String, Integer>() { // from class: cn.jianyun.workplan.ui.graph.model.LineGraphDataKt.makeLineGraphDataByMonth.1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(String str7, String k2) {
                Intrinsics.checkNotNullExpressionValue(k2, "k2");
                return Integer.valueOf(str7.compareTo(k2));
            }
        };
        int i = 0;
        for (String str7 : CollectionsKt.sortedWith(list2, new Comparator() { // from class: cn.jianyun.workplan.ui.graph.model.LineGraphDataKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return LineGraphDataKt.makeLineGraphDataByMonth$lambda$2(anonymousClass1, obj2, obj3);
            }
        })) {
            String string2 = new StringBuilder().append(MyDateTool.getMonth(CommonDateToolKt.parseChineseMonth(str7))).toString();
            Float f2 = (Float) linkedHashMap.get(str7);
            if (f2 == null || (string = f2.toString()) == null) {
                string = "无";
            }
            arrayList.add(new LineGraphItem(str7, string2, i, string));
            i++;
        }
        return new LineGraphData(str4, str3, str6, str5, CollectionsKt.toList(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int makeLineGraphDataByMonth$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public static final LineGraphData makeLineGraphStatData(String beginDay, String endDay, String unit, String name, String color, String mode, List<LineGraphItem> datalist) {
        Intrinsics.checkNotNullParameter(beginDay, "beginDay");
        Intrinsics.checkNotNullParameter(endDay, "endDay");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(datalist, "datalist");
        if (MyDateTool.getBetweenDays(CommonDateToolKt.parseDate(beginDay), CommonDateToolKt.parseDate(endDay)) > 60) {
            return makeLineGraphDataByMonth(beginDay, endDay, unit, name, color, mode, datalist);
        }
        return makeLineGraphDataByDay(beginDay, endDay, unit, name, color, mode, datalist);
    }

    public static final String makeSum(List<LineGraphItem> data, String mode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mode, "mode");
        String strPlusPriceWithString = "";
        for (LineGraphItem lineGraphItem : data) {
            int iHashCode = mode.hashCode();
            if (iHashCode != -1034364087) {
                if (iHashCode != 3560141) {
                    if (iHashCode == 1542263633 && mode.equals(XmlErrorCodes.DECIMAL)) {
                        strPlusPriceWithString = MyDataTool.plusPriceWithString(strPlusPriceWithString, lineGraphItem.getValue());
                        Intrinsics.checkNotNullExpressionValue(strPlusPriceWithString, "plusPriceWithString(result, it.value)");
                    }
                } else if (mode.equals("time")) {
                    strPlusPriceWithString = MyDataTool.plusTime(strPlusPriceWithString, lineGraphItem.getValue());
                    Intrinsics.checkNotNullExpressionValue(strPlusPriceWithString, "plusTime(result, it.value)");
                }
            } else if (mode.equals("number")) {
                strPlusPriceWithString = String.valueOf(MyDataTool.plusNum(strPlusPriceWithString, lineGraphItem.getValue()));
            }
        }
        return strPlusPriceWithString;
    }

    public static final float makeSumValue(List<LineGraphItem> data, String mode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mode, "mode");
        String strPlusPriceWithString = "";
        for (LineGraphItem lineGraphItem : data) {
            int iHashCode = mode.hashCode();
            if (iHashCode != -1034364087) {
                if (iHashCode != 3560141) {
                    if (iHashCode == 1542263633 && mode.equals(XmlErrorCodes.DECIMAL)) {
                        strPlusPriceWithString = MyDataTool.plusPriceWithString(strPlusPriceWithString, lineGraphItem.getValue());
                        Intrinsics.checkNotNullExpressionValue(strPlusPriceWithString, "plusPriceWithString(result, it.value)");
                    }
                } else if (mode.equals("time")) {
                    strPlusPriceWithString = MyDataTool.plusTime(strPlusPriceWithString, lineGraphItem.getValue());
                    Intrinsics.checkNotNullExpressionValue(strPlusPriceWithString, "plusTime(result, it.value)");
                }
            } else if (mode.equals("number")) {
                strPlusPriceWithString = String.valueOf(MyDataTool.plusNum(strPlusPriceWithString, lineGraphItem.getValue()));
            }
        }
        if (Intrinsics.areEqual(mode, "time")) {
            return CommonToolKt.timeToFloat(strPlusPriceWithString, 2);
        }
        return CommonToolKt.toFloatData(strPlusPriceWithString, 2);
    }
}