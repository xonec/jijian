package cn.jianyun.workplan.ui.android.lunar;

import java.util.GregorianCalendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class Util {
    public static final String[] lunarNumbers = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    public static final String[] lunarMonths = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    public static final String[] lunarDays = {"初一", "初二", "初三", "初四", "初五", "初六", "初七", "初八", "初九", "初十", "十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九", "廿十", "廿一", "廿二", "廿三", "廿四", "廿五", "廿六", "廿七", "廿八", "廿九", "三十"};
    public static HashMap<Integer, String[]> twelveMonthWithLeapCache = new HashMap<>();

    public static int getMonthLeapByYear(int year) {
        return ChineseCalendar.getMonthLeapByYear(year);
    }

    public static int getSumOfDayInMonth(int year, int monthSway, boolean isGregorian) {
        if (isGregorian) {
            return getSumOfDayInMonthForGregorianByMonth(year, monthSway);
        }
        return getSumOfDayInMonthForLunarByMonthSway(year, monthSway);
    }

    public static int getSumOfDayInMonthForGregorianByMonth(int year, int month) {
        return new GregorianCalendar(year, month, 0).get(5);
    }

    public static int getSumOfDayInMonthForLunarByMonthSway(int year, int monthSway) {
        return ChineseCalendar.daysInChineseMonth(year, convertMonthSwayToMonthLunar(monthSway, ChineseCalendar.getMonthLeapByYear(year)));
    }

    public static int getSumOfDayInMonthForLunarByMonthLunar(int year, int monthLunar) {
        return ChineseCalendar.daysInChineseMonth(year, monthLunar);
    }

    public static int getSumOfDayInMonthForLunarLeapYear(int year, int monthSway, int monthLeap) {
        return ChineseCalendar.daysInChineseMonth(year, convertMonthSwayToMonthLunar(monthSway, monthLeap));
    }

    public static String getLunarNameOfYear(int year) {
        StringBuilder sb = new StringBuilder();
        while (year > 0) {
            sb.insert(0, lunarNumbers[year % 10]);
            year /= 10;
        }
        return sb.toString();
    }

    public static String getLunarNameOfMonth(int month) {
        if (month > 0 && month < 13) {
            return lunarMonths[month - 1];
        }
        throw new IllegalArgumentException("month should be in range of [1, 12] month is " + month);
    }

    public static String getLunarNameOfDay(int day) {
        if (day > 0 && day < 31) {
            return lunarDays[day - 1];
        }
        throw new IllegalArgumentException("day should be in range of [1, 30] day is " + day);
    }

    public static String[] getLunarMonthsNamesWithLeap(int monthLeap) {
        if (monthLeap == 0) {
            return lunarMonths;
        }
        if (monthLeap < -12 || monthLeap > 0) {
            throw new IllegalArgumentException("month should be in range of [-12, 0]");
        }
        int iAbs = Math.abs(monthLeap);
        String[] strArr = twelveMonthWithLeapCache.get(Integer.valueOf(iAbs));
        if (strArr != null && strArr.length == 13) {
            return strArr;
        }
        String[] strArr2 = new String[13];
        String[] strArr3 = lunarMonths;
        System.arraycopy(strArr3, 0, strArr2, 0, iAbs);
        strArr2[iAbs] = "闰" + getLunarNameOfMonth(iAbs);
        System.arraycopy(strArr3, iAbs, strArr2, iAbs + 1, strArr3.length - iAbs);
        twelveMonthWithLeapCache.put(Integer.valueOf(iAbs), strArr2);
        return strArr2;
    }

    public static int convertMonthLunarToMonthSway(int monthLunar, int monthLeap) {
        if (monthLeap > 0) {
            throw new IllegalArgumentException("convertChineseMonthToMonthSway monthLeap should be in range of [-12, 0]");
        }
        if (monthLeap == 0) {
            return monthLunar;
        }
        if (monthLunar == monthLeap) {
            return (-monthLunar) + 1;
        }
        return monthLunar < (-monthLeap) + 1 ? monthLunar : monthLunar + 1;
    }

    public static int convertMonthSwayToMonthLunar(int monthSway, int monthLeap) {
        if (monthLeap > 0) {
            throw new IllegalArgumentException("convertChineseMonthToMonthSway monthLeap should be in range of [-12, 0]");
        }
        if (monthLeap == 0) {
            return monthSway;
        }
        int i = (-monthLeap) + 1;
        if (monthSway == i) {
            return monthLeap;
        }
        return monthSway < i ? monthSway : monthSway - 1;
    }

    public static int convertMonthSwayToMonthLunarByYear(int monthSway, int year) {
        return convertMonthSwayToMonthLunar(monthSway, getMonthLeapByYear(year));
    }
}