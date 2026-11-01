package cn.jianyun.workplan.util;

import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.model.MonthDateInfo;
import com.adgain.sdk.base.models.AdConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.util.ProcessIdUtil;

/* JADX INFO: loaded from: classes2.dex */
public class MyDateTool {
    public static final String FORMAT_DATE = "yyyy-MM-dd";
    public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_SHORT_DATE = "MM-dd";
    public static final String FORMAT_SHORT_DATE_TIME = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_SHORT_TIME = "HH:mm";
    public static final String FORMAT_TIME = "HH:mm:ss";
    public static final String FORMAT_YEAR_MONTH = "yyyy年MM月";
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_DATE_BEGIN_TIME = "yyyy-MM-dd 00:00:00";
    public static final String PATTERN_DATE_END_TIME = "yyyy-MM-dd 23:59:59";
    public static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_DATE_TIME_SHORT = "yyyy-MM-dd HH:mm";
    public static final String PATTERN_DAY_CHINESE = "dd日";
    public static final String PATTERN_MONTH = "yyyy-MM";
    public static final String PATTERN_MONTH_CHINESE = "yyyy年MM月";
    public static final String PATTERN_MONTH_ONLY = "MM月";
    public static final String PATTERN_SHORT_DATE = "MM-dd";
    public static final String PATTERN_TIME = "HH:mm:ss";
    public static final String PATTERN_TIME_SHORT = "HH:mm";
    public static final String PATTERN_YEAR_CHINESE = "yyyy年";
    public static final Map<Integer, Integer> WEEK_DAY_IDX_MAP = new HashMap<Integer, Integer>() { // from class: cn.jianyun.workplan.util.MyDateTool.1
        {
            put(1, 6);
            put(2, 0);
            put(3, 1);
            put(4, 2);
            put(5, 3);
            put(6, 4);
            put(7, 5);
        }
    };
    public static final Map<Integer, Integer> WEEK_DAY_IDX_MAP_OF_SUNDAY = new HashMap<Integer, Integer>() { // from class: cn.jianyun.workplan.util.MyDateTool.2
        {
            put(1, 0);
            put(2, 1);
            put(3, 2);
            put(4, 3);
            put(5, 4);
            put(6, 5);
            put(7, 6);
        }
    };
    public static final Map<Integer, String> WEEK_NAME_MAP = new HashMap<Integer, String>() { // from class: cn.jianyun.workplan.util.MyDateTool.3
        {
            put(1, "周日");
            put(2, "周一");
            put(3, "周二");
            put(4, "周三");
            put(5, "周四");
            put(6, "周五");
            put(7, "周六");
        }
    };
    public static Map<String, List<List<MonthDateInfo>>> monthCache = new HashMap();
    public static List<String> months = MyDateTool$$ExternalSyntheticBackport0.m(new String[]{AdConstants.FAIL, "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"});

    public static Date getNow() {
        return new Date();
    }

    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    public static String toDateString(Date date) {
        return format(date, "yyyy-MM-dd");
    }

    public static String toShortDateString(Date date) {
        return format(date, "MM-dd");
    }

    public static String toDateTimeString(Date date) {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String toShortDateTimeString(Date date) {
        return format(date, "yyyy-MM-dd HH:mm");
    }

    public static String toTimeString(Date date) {
        return format(date, "HH:mm:ss");
    }

    public static String toShortTimeString(Date date) {
        return format(date, "HH:mm");
    }

    public static String toMonthString(Date date) {
        return format(date, PATTERN_MONTH);
    }

    public static String toChineseMonthString(Date date) {
        return format(date, "yyyy年MM月");
    }

    public static String toChineseYearString(Date date) {
        return format(date, PATTERN_YEAR_CHINESE);
    }

    public static String getDateTimeNow() {
        return toDateTimeString(getNow());
    }

    public static String getDateOfNow() {
        return toDateString(getNow());
    }

    public static Date getStartOfToday() {
        return getStartOfDay(getNow());
    }

    public static Date getEndOfToday() {
        return getEndOfDay(getNow());
    }

    public static Date getStartOfYesterday() {
        return getStartOfDay(gapDay(getNow(), -1));
    }

    public static Date getEndOfYesterday() {
        return getEndOfDay(gapDay(getNow(), -1));
    }

    public static Date parseDateString(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public static Date parseDateTimeString(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateStr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Date parseShortDateTimeString(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateStr);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public static int getField(Date date, int field) {
        return toCalendar(date).get(field);
    }

    public static int getYear(Date date) {
        return getField(date, 1);
    }

    public static int getCurrentYear() {
        return getYear(new Date());
    }

    public static String getCurrentYearStr() {
        return String.valueOf(getCurrentYear());
    }

    public static int getMonth(Date date) {
        return getField(date, 2) + 1;
    }

    public static int getDay(Date date) {
        return getField(date, 5);
    }

    public static String getDay(String date) {
        return String.valueOf(getDay(parseDateString(date)));
    }

    public static int getHour(Date date) {
        return getField(date, 11);
    }

    public static int getMinute(Date date) {
        return getField(date, 12);
    }

    public static int getSecond(Date date) {
        return getField(date, 13);
    }

    public static int getWeekday(Date date) {
        return getField(date, 7);
    }

    public static boolean isSaturday(Date date) {
        return getWeekday(date) == 7;
    }

    public static boolean isSunday(Date date) {
        return getWeekday(date) == 1;
    }

    public static int getWeekdayIdx(Date date, boolean isMondayFirst) {
        int weekday = getWeekday(date);
        if (isMondayFirst) {
            return WEEK_DAY_IDX_MAP.get(Integer.valueOf(weekday)).intValue();
        }
        return WEEK_DAY_IDX_MAP_OF_SUNDAY.get(Integer.valueOf(weekday)).intValue();
    }

    public static String getWeekdayName(Date date) {
        return WEEK_NAME_MAP.get(Integer.valueOf(getWeekday(date)));
    }

    public static Date getStartOfDay(Date date) {
        Calendar calendar = toCalendar(date);
        clearTime(calendar);
        return calendar.getTime();
    }

    public static void clearTime(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static Date clearTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date getEndOfDay(Date date) {
        Calendar calendar = toCalendar(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTime();
    }

    public static Calendar toCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date gap(Date date, int field, int value) {
        Calendar calendar = toCalendar(date);
        calendar.add(field, value);
        return calendar.getTime();
    }

    public static Date gapDayFromNow(int gapDay) {
        return gapDay(getNow(), gapDay);
    }

    public static Date gapMonth(Date date, int gapMonth) {
        return gap(date, 2, gapMonth);
    }

    public static Date getMonthFromNow(int gapMonth) {
        return gapMonth(getNow(), gapMonth);
    }

    public static Date getStartDayOfMonth(Date date) {
        Calendar calendar = toCalendar(date);
        clearTime(calendar);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getFirstDayOfWeek(Date date, boolean isMondayFirst) {
        return gapDay(date, getWeekdayIdx(date, isMondayFirst) * (-1));
    }

    public static List<Date> getWeekDatesFromSomeDay(Date date, boolean isMondayFirst) {
        Date firstDayOfWeek = getFirstDayOfWeek(date, isMondayFirst);
        ArrayList arrayList = new ArrayList();
        arrayList.add(firstDayOfWeek);
        for (int i = 1; i < 7; i++) {
            arrayList.add(gapDay(firstDayOfWeek, i));
        }
        return arrayList;
    }

    public static List<Date> getCurrentWeekDates(boolean isMondayFirst) {
        return getWeekDatesFromSomeDay(new Date(), isMondayFirst);
    }

    public static int getBetweenDays(Date date1, Date date2) {
        return (int) Math.abs(Math.floor(((((date2.getTime() - date1.getTime()) / 1000.0d) / 60.0d) / 60.0d) / 24.0d));
    }

    public static int getBetweenDays(long t1, long t2) {
        return (int) ((((Math.floor(t2 - t1) / 1000.0d) / 60.0d) / 60.0d) / 24.0d);
    }

    public static String getDayInfo(Date date) {
        Date startOfDay = getStartOfDay(date);
        Date startOfDay2 = getStartOfDay(new Date());
        boolean z = startOfDay.getTime() > startOfDay2.getTime();
        int betweenDays = getBetweenDays(startOfDay, startOfDay2);
        if (betweenDays == 0) {
            return "今天";
        }
        if (betweenDays == 1) {
            return z ? "明天" : "昨天";
        }
        if (betweenDays == 2) {
            return z ? "后天" : "前天";
        }
        return betweenDays + "天" + (z ? "后" : "前");
    }

    public static int getWeekFromRefWeek(Date refDate, int refWeek, Date targetDate, boolean isMondayFirst) {
        return (getBetweenDays(getFirstDayOfWeek(refDate, isMondayFirst), getFirstDayOfWeek(targetDate, isMondayFirst)) / 7) + refWeek;
    }

    public static List<Date> getWeekDatesFromRefWeek(Date refDate, int refWeek, int targetWeek, boolean isMondayFirst) {
        return getWeekDatesFromSomeDay(gapDay(getFirstDayOfWeek(refDate, isMondayFirst), (targetWeek - refWeek) * 7), isMondayFirst);
    }

    public static String toStringDate(int year, int month, int day) {
        return year + ProcessIdUtil.DEFAULT_PROCESSID + MyDataTool.getTwo(month + 1) + ProcessIdUtil.DEFAULT_PROCESSID + MyDataTool.getTwo(day);
    }

    public static Date make(String chooseYear, String chooseMonth, String beginDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(1, MyDataTool.toInteger(chooseYear, 2024).intValue());
        calendar.set(2, MyDataTool.toInteger(chooseMonth, 2).intValue() - 1);
        calendar.set(5, MyDataTool.toInteger(beginDay, 1).intValue());
        return calendar.getTime();
    }

    public static String getStartDayStringOfMonth(Date date) {
        return toDateString(getStartDayOfMonth(date));
    }

    public static Date getLastDayOfMonth(Date date) {
        Calendar calendar = toCalendar(date);
        calendar.set(5, 1);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.add(2, 1);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    public static String getLastDayStringOfMonth(Date date) {
        return toDateString(getLastDayOfMonth(date));
    }

    public static List<List<MonthDateInfo>> getMonthInfo(Date date, boolean mondayFirst, Map<String, FestivalData> holidayMap, boolean fill) {
        int i;
        boolean z;
        boolean holiday;
        String lunarDay;
        Date startDayOfMonth = getStartDayOfMonth(date);
        ArrayList arrayList = new ArrayList();
        int firstDayPosition = getFirstDayPosition(startDayOfMonth, mondayFirst);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < firstDayPosition; i2++) {
            arrayList2.add(new MonthDateInfo());
        }
        String dateString = toDateString(new Date());
        Date lastDayOfMonth = getLastDayOfMonth(date);
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            Date dateGap = gap(startDayOfMonth, 5, i3);
            if (dateGap.getTime() > lastDayOfMonth.getTime()) {
                break;
            }
            String dateString2 = toDateString(dateGap);
            boolean zEquals = dateString.equals(dateString2);
            if (holidayMap.containsKey(dateString2)) {
                String name = holidayMap.get(dateString2).getName();
                boolean holiday2 = holidayMap.get(dateString2).getHoliday();
                holiday = true ^ holidayMap.get(dateString2).getHoliday();
                z = holiday2;
                lunarDay = name;
            } else {
                z = false;
                holiday = false;
                lunarDay = LunarCalendar.getLunarDay(dateGap);
            }
            arrayList2.add(new MonthDateInfo(dateGap, getField(dateGap, 5) + "", lunarDay, zEquals, false, z, holiday));
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (i = 1; i <= arrayList2.size(); i++) {
            arrayList3.add((MonthDateInfo) arrayList2.get(i - 1));
            if (i % 7 == 0) {
                arrayList.add(arrayList3);
                arrayList3 = new ArrayList();
            }
        }
        if (arrayList3.size() > 0) {
            int size = 7 - arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(new MonthDateInfo());
            }
            arrayList.add(arrayList3);
        }
        return arrayList;
    }

    public static int getFirstDayPosition(Date date, boolean mondayFirst) {
        int i = toCalendar(date).get(7);
        if (mondayFirst) {
            switch (i) {
                case 1:
                    return 6;
                case 2:
                    return 0;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 3;
                case 6:
                    return 4;
                case 7:
                    return 5;
                default:
                    return 7;
            }
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 7;
        }
    }

    public static List<String> getMonthHeaderInfo(boolean mondayFirst) {
        String[] strArr = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        String[] strArr2 = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        if (mondayFirst) {
            return (List) Arrays.stream(strArr).collect(Collectors.toList());
        }
        return (List) Arrays.stream(strArr2).collect(Collectors.toList());
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public static Date gap(Date date, String field, int value) {
        field.hashCode();
        switch (field) {
            case "d":
                return gap(date, 5, value);
            case "m":
                return gap(date, 2, value);
            case "w":
                return gap(date, 5, value * 7);
            case "y":
                return gap(date, 1, value);
            default:
                return gap(date, 1, value);
        }
    }

    public static Date gapDay(Date date, int value) {
        return gap(date, 5, value);
    }

    public static String nextDay(String date) {
        return toDateString(gapDay(parseDate(date), 1));
    }

    public static Date getBeginOfToday() {
        return parseDate(toDateString(new Date()));
    }

    public static String toYearMonthString(Date date) {
        return format(date, "yyyy年MM月");
    }

    public static boolean between(String targetDate, String beginDate, String endDate) {
        return targetDate.compareTo(beginDate) >= 0 && targetDate.compareTo(endDate) <= 0;
    }

    public static Date parse(String s, String format) {
        try {
            return new SimpleDateFormat(format).parse(s);
        } catch (ParseException unused) {
            return new Date();
        }
    }

    public static String getTwo(int x) {
        return (x < 10 ? new StringBuilder(AdConstants.FAIL) : new StringBuilder("")).append(x).toString();
    }

    public static String getRestTime(long gap) {
        StringBuffer stringBuffer = new StringBuffer();
        long j = gap / 1000;
        long j2 = j % 60;
        long j3 = j / 60;
        long j4 = j3 % 60;
        long j5 = j3 / 60;
        if (j5 > 0) {
            stringBuffer.append(getTwo((int) j5));
            stringBuffer.append(ParameterizedMessage.ERROR_MSG_SEPARATOR);
            stringBuffer.append(getTwo((int) j4));
            stringBuffer.append(ParameterizedMessage.ERROR_MSG_SEPARATOR);
            stringBuffer.append(getTwo((int) j2));
            return stringBuffer.toString();
        }
        if (j4 > 0) {
            stringBuffer.append(getTwo((int) j4));
            stringBuffer.append(ParameterizedMessage.ERROR_MSG_SEPARATOR);
            stringBuffer.append(getTwo((int) j2));
            return stringBuffer.toString();
        }
        stringBuffer.append(getTwo((int) j2));
        stringBuffer.append("秒");
        return stringBuffer.toString();
    }

    public static String getBigMonth(Date currentDate) {
        return months.get(getMonth(currentDate)) + "月";
    }

    public static String getCurrentTime() {
        return toDateTimeString(new Date());
    }
}