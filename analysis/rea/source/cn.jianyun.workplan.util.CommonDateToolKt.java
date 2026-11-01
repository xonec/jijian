package cn.jianyun.workplan.util;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonDateTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0001¨\u0006\t"}, d2 = {"dateStr", "", "Ljava/util/Date;", "datetimeStr", "gapDay", "gap", "", "parseChineseMonth", "parseDate", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonDateToolKt {
    public static /* synthetic */ Date gapDay$default(Date date, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return gapDay(date, i);
    }

    public static final Date gapDay(Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Date dateGapDay = MyDateTool.gapDay(date, i);
        Intrinsics.checkNotNullExpressionValue(dateGapDay, "gapDay(this, gap)");
        return dateGapDay;
    }

    public static final String dateStr(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String dateString = MyDateTool.toDateString(date);
        Intrinsics.checkNotNullExpressionValue(dateString, "toDateString(this)");
        return dateString;
    }

    public static final String datetimeStr(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String dateTimeString = MyDateTool.toDateTimeString(date);
        Intrinsics.checkNotNullExpressionValue(dateTimeString, "toDateTimeString(this)");
        return dateTimeString;
    }

    public static final Date parseDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Date date = MyDateTool.parseDate(str);
        Intrinsics.checkNotNullExpressionValue(date, "parseDate(this)");
        return date;
    }

    public static final Date parseChineseMonth(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Date date = MyDateTool.parse(str, "yyyy年MM月");
        Intrinsics.checkNotNullExpressionValue(date, "parse(this, MyDateTool.PATTERN_MONTH_CHINESE)");
        return date;
    }
}