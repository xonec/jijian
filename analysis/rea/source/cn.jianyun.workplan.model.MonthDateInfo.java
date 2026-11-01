package cn.jianyun.workplan.model;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.meishu.sdk.core.MSAdConfig;
import com.tianmu.biz.bean.AdType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: MonthDateInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u0010+\u001a\u00020,H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b1\u00102J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcn/jianyun/workplan/model/MonthDateInfo;", "", XmlErrorCodes.DATE, "Ljava/util/Date;", "day", "", "lunarDay", "today", "", "empty", "holiday", "work", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "getEmpty", "()Z", "setEmpty", "(Z)V", "getHoliday", "setHoliday", "getLunarDay", "setLunarDay", "getToday", "setToday", "getWork", "setWork", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", AdType.TYPE_OTHER, "fetchDayColor", "Landroidx/compose/ui/graphics/Color;", "fetchDayColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "fetchLunarColor", "defaultColor", "fetchLunarColor-vNxB06k", "(Ljava/lang/String;)J", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MonthDateInfo {
    public static final int $stable = 8;
    private Date date;
    private String day;
    private boolean empty;
    private boolean holiday;
    private String lunarDay;
    private boolean today;
    private boolean work;

    public MonthDateInfo() {
        this(null, null, null, false, false, false, false, 127, null);
    }

    public static /* synthetic */ MonthDateInfo copy$default(MonthDateInfo monthDateInfo, Date date, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            date = monthDateInfo.date;
        }
        if ((i & 2) != 0) {
            str = monthDateInfo.day;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = monthDateInfo.lunarDay;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = monthDateInfo.today;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = monthDateInfo.empty;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = monthDateInfo.holiday;
        }
        boolean z7 = z3;
        if ((i & 64) != 0) {
            z4 = monthDateInfo.work;
        }
        return monthDateInfo.copy(date, str3, str4, z5, z6, z7, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLunarDay() {
        return this.lunarDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getToday() {
        return this.today;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEmpty() {
        return this.empty;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHoliday() {
        return this.holiday;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getWork() {
        return this.work;
    }

    public final MonthDateInfo copy(Date date, String day, String lunarDay, boolean today, boolean empty, boolean holiday, boolean work) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(lunarDay, "lunarDay");
        return new MonthDateInfo(date, day, lunarDay, today, empty, holiday, work);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthDateInfo)) {
            return false;
        }
        MonthDateInfo monthDateInfo = (MonthDateInfo) other;
        return Intrinsics.areEqual(this.date, monthDateInfo.date) && Intrinsics.areEqual(this.day, monthDateInfo.day) && Intrinsics.areEqual(this.lunarDay, monthDateInfo.lunarDay) && this.today == monthDateInfo.today && this.empty == monthDateInfo.empty && this.holiday == monthDateInfo.holiday && this.work == monthDateInfo.work;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.date.hashCode() * 31) + this.day.hashCode()) * 31) + this.lunarDay.hashCode()) * 31;
        boolean z = this.today;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.empty;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.holiday;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.work;
        return i3 + (z4 ? 1 : z4);
    }

    public String toString() {
        return "MonthDateInfo(date=" + this.date + ", day=" + this.day + ", lunarDay=" + this.lunarDay + ", today=" + this.today + ", empty=" + this.empty + ", holiday=" + this.holiday + ", work=" + this.work + ")";
    }

    public MonthDateInfo(Date date, String day, String lunarDay, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(lunarDay, "lunarDay");
        this.date = date;
        this.day = day;
        this.lunarDay = lunarDay;
        this.today = z;
        this.empty = z2;
        this.holiday = z3;
        this.work = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MonthDateInfo(Date date, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Date dateMake;
        if ((i & 1) != 0) {
            dateMake = MyDateTool.make("1930", MSAdConfig.GENDER_FEMALE, "1");
            Intrinsics.checkNotNullExpressionValue(dateMake, "make(\"1930\", \"10\", \"1\")");
        } else {
            dateMake = date;
        }
        this(dateMake, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, (i & 64) == 0 ? z4 : false);
    }

    public final Date getDate() {
        return this.date;
    }

    public final void setDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.date = date;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final String getLunarDay() {
        return this.lunarDay;
    }

    public final void setLunarDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lunarDay = str;
    }

    public final boolean getToday() {
        return this.today;
    }

    public final void setToday(boolean z) {
        this.today = z;
    }

    public final boolean getEmpty() {
        return this.empty;
    }

    public final void setEmpty(boolean z) {
        this.empty = z;
    }

    public final boolean getHoliday() {
        return this.holiday;
    }

    public final void setHoliday(boolean z) {
        this.holiday = z;
    }

    public final boolean getWork() {
        return this.work;
    }

    public final void setWork(boolean z) {
        this.work = z;
    }

    /* JADX INFO: renamed from: fetchDayColor-WaAFU9c, reason: not valid java name */
    public final long m6704fetchDayColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-205662796);
        ComposerKt.sourceInformation(composer, "C(fetchDayColor)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-205662796, i, -1, "cn.jianyun.workplan.model.MonthDateInfo.fetchDayColor (MonthDateInfo.kt:23)");
        }
        if (this.today) {
            long deleteColor = ColorKt.getDeleteColor();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return deleteColor;
        }
        long secondary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getSecondary();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return secondary;
    }

    /* JADX INFO: renamed from: fetchLunarColor-vNxB06k$default, reason: not valid java name */
    public static /* synthetic */ long m6703fetchLunarColorvNxB06k$default(MonthDateInfo monthDateInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return monthDateInfo.m6705fetchLunarColorvNxB06k(str);
    }

    /* JADX INFO: renamed from: fetchLunarColor-vNxB06k, reason: not valid java name */
    public final long m6705fetchLunarColorvNxB06k(String defaultColor) {
        Intrinsics.checkNotNullParameter(defaultColor, "defaultColor");
        if (this.holiday) {
            return ColorKt.getThemeColor();
        }
        if (!Intrinsics.areEqual(defaultColor, "")) {
            return CommonToolKt.color(defaultColor);
        }
        if (this.work) {
            return ColorKt.getPrimaryColor();
        }
        return Color.INSTANCE.m3785getGray0d7_KjU();
    }
}