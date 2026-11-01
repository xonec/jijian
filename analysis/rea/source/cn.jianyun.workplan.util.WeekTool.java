package cn.jianyun.workplan.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.util.ProcessIdUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WeekTool {
    public static String getWeekName(final String weekday) {
        Optional<SelectDO> optionalFindFirst = SelectUtil.WEEKDAYS.stream().filter(new Predicate() { // from class: cn.jianyun.workplan.util.WeekTool$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((SelectDO) obj).value.equals(weekday);
            }
        }).findFirst();
        return optionalFindFirst.isPresent() ? optionalFindFirst.get().label : "异常";
    }

    public static boolean isContinue(List<Integer> fixWeeks, int step) {
        if (fixWeeks.isEmpty() || fixWeeks.size() < 2) {
            return false;
        }
        int iIntValue = fixWeeks.get(0).intValue();
        int i = 1;
        while (i < fixWeeks.size()) {
            int iIntValue2 = fixWeeks.get(i).intValue();
            if (iIntValue2 - step != iIntValue) {
                return false;
            }
            i++;
            iIntValue = iIntValue2;
        }
        return true;
    }

    public static String getWeekInfo(List<Integer> fixWeeks, String defaultLabel) {
        if (fixWeeks.isEmpty()) {
            return defaultLabel;
        }
        if (fixWeeks.size() < 2) {
            return fixWeeks.get(0) + "周";
        }
        List list = (List) fixWeeks.stream().sorted().collect(Collectors.toList());
        int iIntValue = ((Integer) list.get(0)).intValue();
        int iIntValue2 = ((Integer) list.get(list.size() - 1)).intValue();
        if (isContinue(list, 2)) {
            return iIntValue + ProcessIdUtil.DEFAULT_PROCESSID + iIntValue2 + (iIntValue % 2 == 0 ? "双周" : "单周");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < list.size(); i++) {
            int iIntValue3 = ((Integer) list.get(i - 1)).intValue();
            int iIntValue4 = ((Integer) list.get(i)).intValue();
            if (iIntValue4 - iIntValue3 != 1) {
                if (iIntValue != iIntValue3) {
                    arrayList.add(iIntValue + ProcessIdUtil.DEFAULT_PROCESSID + iIntValue3);
                } else {
                    arrayList.add(iIntValue + "");
                }
                if (i == list.size() - 1) {
                    arrayList.add(iIntValue4 + "");
                }
                iIntValue = iIntValue4;
            } else if (i == list.size() - 1) {
                arrayList.add(iIntValue + ProcessIdUtil.DEFAULT_PROCESSID + iIntValue4);
            }
        }
        return MyCollectionTool.join(arrayList) + "周";
    }
}