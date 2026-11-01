package cn.jianyun.workplan.widget;

import androidx.core.view.ViewCompat;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.model.MonthDateInfo;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.util.MyDateTool;
import com.tianmu.biz.bean.AdType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.poi.ss.util.IEEEDouble;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: WidgetDataModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000b\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0015\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u0015\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000bHÆ\u0003J\u0091\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000b2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010?\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020@J\u000e\u0010A\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020@J\u000e\u0010B\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020@J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018¨\u0006F"}, d2 = {"Lcn/jianyun/workplan/widget/WidgetDataModel;", "", XmlErrorCodes.DATE, "", "weekName", "year", "month", "day", "widgetConfig", "Lcn/jianyun/workplan/widget/WidgetConfig;", "dutys", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;", "works", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "monthInfos", "Lcn/jianyun/workplan/model/MonthDateInfo;", "holidayMap", "", "Lcn/jianyun/workplan/api/FestivalData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/widget/WidgetConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDay", "setDay", "getDutys", "()Ljava/util/List;", "setDutys", "(Ljava/util/List;)V", "getHolidayMap", "()Ljava/util/Map;", "setHolidayMap", "(Ljava/util/Map;)V", "getMonth", "setMonth", "getMonthInfos", "setMonthInfos", "getWeekName", "setWeekName", "getWidgetConfig", "()Lcn/jianyun/workplan/widget/WidgetConfig;", "setWidgetConfig", "(Lcn/jianyun/workplan/widget/WidgetConfig;)V", "getWorks", "setWorks", "getYear", "setYear", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", AdType.TYPE_OTHER, "fetchDutyRemark", "Ljava/util/Date;", "fetchDutyWork", "fetchSecondDutyWork", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WidgetDataModel {
    public static final int $stable = 8;
    private String date;
    private String day;
    private List<ScheduleDuty> dutys;
    private Map<String, FestivalData> holidayMap;
    private String month;
    private List<? extends List<MonthDateInfo>> monthInfos;
    private String weekName;
    private WidgetConfig widgetConfig;
    private List<ScheduleWork> works;
    private String year;

    public WidgetDataModel() {
        this(null, null, null, null, null, null, null, null, null, null, IEEEDouble.EXPONENT_BIAS, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final Map<String, FestivalData> component10() {
        return this.holidayMap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeekName() {
        return this.weekName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WidgetConfig getWidgetConfig() {
        return this.widgetConfig;
    }

    public final List<ScheduleDuty> component7() {
        return this.dutys;
    }

    public final List<ScheduleWork> component8() {
        return this.works;
    }

    public final List<List<MonthDateInfo>> component9() {
        return this.monthInfos;
    }

    public final WidgetDataModel copy(String date, String weekName, String year, String month, String day, WidgetConfig widgetConfig, List<ScheduleDuty> dutys, List<ScheduleWork> works, List<? extends List<MonthDateInfo>> monthInfos, Map<String, FestivalData> holidayMap) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(weekName, "weekName");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(dutys, "dutys");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(monthInfos, "monthInfos");
        Intrinsics.checkNotNullParameter(holidayMap, "holidayMap");
        return new WidgetDataModel(date, weekName, year, month, day, widgetConfig, dutys, works, monthInfos, holidayMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetDataModel)) {
            return false;
        }
        WidgetDataModel widgetDataModel = (WidgetDataModel) other;
        return Intrinsics.areEqual(this.date, widgetDataModel.date) && Intrinsics.areEqual(this.weekName, widgetDataModel.weekName) && Intrinsics.areEqual(this.year, widgetDataModel.year) && Intrinsics.areEqual(this.month, widgetDataModel.month) && Intrinsics.areEqual(this.day, widgetDataModel.day) && Intrinsics.areEqual(this.widgetConfig, widgetDataModel.widgetConfig) && Intrinsics.areEqual(this.dutys, widgetDataModel.dutys) && Intrinsics.areEqual(this.works, widgetDataModel.works) && Intrinsics.areEqual(this.monthInfos, widgetDataModel.monthInfos) && Intrinsics.areEqual(this.holidayMap, widgetDataModel.holidayMap);
    }

    public int hashCode() {
        return (((((((((((((((((this.date.hashCode() * 31) + this.weekName.hashCode()) * 31) + this.year.hashCode()) * 31) + this.month.hashCode()) * 31) + this.day.hashCode()) * 31) + this.widgetConfig.hashCode()) * 31) + this.dutys.hashCode()) * 31) + this.works.hashCode()) * 31) + this.monthInfos.hashCode()) * 31) + this.holidayMap.hashCode();
    }

    public String toString() {
        return "WidgetDataModel(date=" + this.date + ", weekName=" + this.weekName + ", year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", widgetConfig=" + this.widgetConfig + ", dutys=" + this.dutys + ", works=" + this.works + ", monthInfos=" + this.monthInfos + ", holidayMap=" + this.holidayMap + ")";
    }

    public WidgetDataModel(String date, String weekName, String year, String month, String day, WidgetConfig widgetConfig, List<ScheduleDuty> dutys, List<ScheduleWork> works, List<? extends List<MonthDateInfo>> monthInfos, Map<String, FestivalData> holidayMap) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(weekName, "weekName");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(dutys, "dutys");
        Intrinsics.checkNotNullParameter(works, "works");
        Intrinsics.checkNotNullParameter(monthInfos, "monthInfos");
        Intrinsics.checkNotNullParameter(holidayMap, "holidayMap");
        this.date = date;
        this.weekName = weekName;
        this.year = year;
        this.month = month;
        this.day = day;
        this.widgetConfig = widgetConfig;
        this.dutys = dutys;
        this.works = works;
        this.monthInfos = monthInfos;
        this.holidayMap = holidayMap;
    }

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final String getWeekName() {
        return this.weekName;
    }

    public final void setWeekName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weekName = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.year = str;
    }

    public final String getMonth() {
        return this.month;
    }

    public final void setMonth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.month = str;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public /* synthetic */ WidgetDataModel(String str, String str2, String str3, String str4, String str5, WidgetConfig widgetConfig, List list, List list2, List list3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? new WidgetConfig(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, false, false, false, false, false, false, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null) : widgetConfig, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? CollectionsKt.emptyList() : list3, (i & 512) != 0 ? MapsKt.emptyMap() : map);
    }

    public final WidgetConfig getWidgetConfig() {
        return this.widgetConfig;
    }

    public final void setWidgetConfig(WidgetConfig widgetConfig) {
        Intrinsics.checkNotNullParameter(widgetConfig, "<set-?>");
        this.widgetConfig = widgetConfig;
    }

    public final List<ScheduleDuty> getDutys() {
        return this.dutys;
    }

    public final void setDutys(List<ScheduleDuty> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dutys = list;
    }

    public final List<ScheduleWork> getWorks() {
        return this.works;
    }

    public final void setWorks(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.works = list;
    }

    public final List<List<MonthDateInfo>> getMonthInfos() {
        return this.monthInfos;
    }

    public final void setMonthInfos(List<? extends List<MonthDateInfo>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.monthInfos = list;
    }

    public final Map<String, FestivalData> getHolidayMap() {
        return this.holidayMap;
    }

    public final void setHolidayMap(Map<String, FestivalData> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.holidayMap = map;
    }

    public final String fetchDutyRemark(Date date) {
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = this.dutys.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        return scheduleDuty == null ? "" : scheduleDuty.getRemark();
    }

    public final ScheduleWork fetchDutyWork(Date date) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = this.dutys.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        if (scheduleDuty == null) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        for (Object obj2 : this.works) {
            if (Intrinsics.areEqual(((ScheduleWork) obj2).getUuid(), scheduleDuty.getWorkUuid())) {
                obj = obj2;
                break;
            }
        }
        ScheduleWork scheduleWork = (ScheduleWork) obj;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }

    public final ScheduleWork fetchSecondDutyWork(Date date) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(date, "date");
        Iterator<T> it = this.dutys.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleDuty) next).getDay(), MyDateTool.toDateString(date)));
        ScheduleDuty scheduleDuty = (ScheduleDuty) next;
        if (scheduleDuty == null) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        for (Object obj2 : this.works) {
            if (Intrinsics.areEqual(((ScheduleWork) obj2).getUuid(), scheduleDuty.getSecondWorkUuid())) {
                obj = obj2;
                break;
            }
        }
        ScheduleWork scheduleWork = (ScheduleWork) obj;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }
}