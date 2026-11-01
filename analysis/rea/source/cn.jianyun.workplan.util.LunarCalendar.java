package cn.jianyun.workplan.util;

import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LunarCalendar {
    public static final int MAX_YEAR = 2099;
    public static final int MIN_YEAR = 1900;
    private static final int[] DAYS_BEFORE_MONTH = {0, 31, 59, 90, 120, 151, 181, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_QCOM_VPP, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RANGE_SIZE, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_HTTP_REQ_FINSIH_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_EFFECT_THRESHOLD, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_CACHE_SEI, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_DEMUX_TIME};
    private static final int[] LUNAR_INFO = {8697535, 306771, 677704, 5580477, 861776, 890180, 4631225, 354893, 634178, 2404022, 306762, 6966718, 675154, 861510, 6116026, 742478, 879171, 2714935, 613195, 7642049, 300884, 674632, 5973436, 435536, 447557, 4905656, 177741, 612162, 2398135, 300874, 6703934, 870993, 959814, 5690554, 372046, 177732, 3749688, 601675, 8165055, 824659, 870984, 7185723, 742735, 354885, 4894137, 154957, 601410, 2921910, 693578, 8080061, 445009, 742726, 5593787, 318030, 678723, 3484600, 338764, 9082175, 955730, 436808, 7001404, 701775, 308805, 4871993, 677709, 337474, 4100917, 890185, 7711422, 354897, 617798, 5549755, 306511, 675139, 5056183, 861515, 9261759, 742482, 748103, 6909244, 613200, 301893, 4869049, 674637, 11216322, 435540, 447561, 7002685, 702033, 612166, 5543867, 300879, 412484, 3581239, 959818, 8827583, 371795, 702023, 5846716, 601680, 824901, 5065400, 870988, 894273, 2468534, 354889, 8039869, 154962, 601415, 6067642, 693582, 739907, 4937015, 709962, 9788095, 309843, 678728, 6630332, 338768, 693061, 4672185, 436812, 709953, 2415286, 308810, 6969149, 675409, 861766, 6198074, 873293, 371267, 3585335, 617803, 11841215, 306515, 675144, 7153084, 861519, 873028, 6138424, 744012, 355649, 2403766, 301898, 8014782, 674641, 697670, 5984954, 447054, 711234, 3496759, 603979, 8689601, 300883, 412488, 6726972, 959823, 436804, 4896312, 699980, 601666, 3970869, 824905, 8211133, 870993, 894277, 5614266, 354894, 683331, 4533943, 339275, 9082303, 693587, 739911, 7034171, 709967, 350789, 4873528, 678732, 338754, 3838902, 430921, 7809469, 436817, 709958, 5561018, 308814, 677699, 4532024, 861770, 9343806, 873042, 895559, 6731067, 355663, 306757, 4869817, 675148, 857409, 2986677};
    static final String[] chineseNumber = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    static final String[] monthTag = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊"};
    public static Map<String, String> recentLanarDayMap = new HashMap();

    static {
        init();
    }

    public static final int[] lunarToSolar(int year, int month, int monthDay, boolean isLeapMonth) {
        if (year < 1900 || year > 2099 || month < 1 || month > 12 || monthDay < 1 || monthDay > 30) {
            throw new IllegalArgumentException("Illegal lunar date, must be like that:\n\tyear : 1900~2099\n\tmonth : 1~12\n\tday : 1~30");
        }
        int i = year - 1900;
        int i2 = LUNAR_INFO[i];
        int i3 = (i2 & 31) - 1;
        if (((i2 & 96) >> 5) == 2) {
            i3 += 31;
        }
        for (int i4 = 1; i4 < month; i4++) {
            i3 = ((524288 >> (i4 + (-1))) & LUNAR_INFO[i]) == 0 ? i3 + 29 : i3 + 30;
        }
        int i5 = i3 + monthDay;
        int i6 = LUNAR_INFO[i];
        int i7 = (15728640 & i6) >> 20;
        if (i7 != 0 && (month > i7 || (month == i7 && isLeapMonth))) {
            i5 = ((524288 >> (month - 1)) & i6) == 0 ? i5 + 29 : i5 + 30;
        }
        if (i5 > 366 || (year % 4 != 0 && i5 > 365)) {
            year++;
            i5 = year % 4 == 1 ? i5 - 366 : i5 - 365;
        }
        int[] iArr = new int[3];
        int i8 = 1;
        while (i8 < 13) {
            int[] iArr2 = DAYS_BEFORE_MONTH;
            int i9 = iArr2[i8];
            int i10 = year % 4;
            if (i10 == 0 && i8 > 2) {
                i9++;
            }
            if (i10 == 0 && i8 == 2 && i9 + 1 == i5) {
                iArr[1] = i8;
                iArr[2] = i5 - 31;
                break;
            }
            if (i9 >= i5) {
                iArr[1] = i8;
                int i11 = iArr2[i8 - 1];
                int i12 = (i10 != 0 || i8 <= 2) ? i11 : i11 + 1;
                if (i5 <= i12) {
                    if (i5 != i12) {
                        iArr[2] = i5;
                        break;
                    }
                    if (i10 == 0 && i8 == 2) {
                        iArr[2] = (iArr2[i8] - i11) + 1;
                        break;
                    }
                    iArr[2] = iArr2[i8] - i11;
                    break;
                }
                iArr[2] = i5 - i12;
                break;
            }
            i8++;
        }
        iArr[0] = year;
        return iArr;
    }

    public static final int[] solarToLunar(int year, int month, int monthDay) {
        int[] iArr = new int[4];
        int i = MIN_YEAR;
        int i2 = 0;
        int time = (int) ((new GregorianCalendar(year, month - 1, monthDay).getTime().getTime() - new GregorianCalendar(MIN_YEAR, 0, 31).getTime().getTime()) / 86400000);
        int iDaysInLunarYear = 0;
        while (i <= 2099 && time > 0) {
            iDaysInLunarYear = daysInLunarYear(i);
            time -= iDaysInLunarYear;
            i++;
        }
        if (time < 0) {
            time += iDaysInLunarYear;
            i--;
        }
        iArr[0] = i;
        int iLeapMonth = leapMonth(i);
        int iDaysInLunarMonth = 0;
        int i3 = 1;
        while (i3 <= 13 && time > 0) {
            iDaysInLunarMonth = daysInLunarMonth(i, i3);
            time -= iDaysInLunarMonth;
            i3++;
        }
        if (iLeapMonth != 0 && i3 > iLeapMonth && (i3 = i3 - 1) == iLeapMonth) {
            i2 = 1;
        }
        if (time < 0) {
            time += iDaysInLunarMonth;
            i3--;
        }
        iArr[1] = i3;
        iArr[2] = time + 1;
        iArr[3] = i2;
        return iArr;
    }

    public static final int daysInMonth(int year, int month) {
        return daysInMonth(year, month, false);
    }

    public static final int daysInMonth(int year, int month, boolean leap) {
        int iLeapMonth = leapMonth(year);
        int i = (iLeapMonth == 0 || month <= iLeapMonth) ? 0 : 1;
        if (!leap) {
            return daysInLunarMonth(year, month + i);
        }
        if (iLeapMonth == 0 || iLeapMonth != month) {
            return 0;
        }
        return daysInLunarMonth(year, month + 1);
    }

    private static int daysInLunarYear(int year) {
        int i = leapMonth(year) != 0 ? MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_VIDEO_QUERY : MediaPlayer.MEDIA_PLAYER_OPTION_ALWAYS_DO_AV_SYNC;
        int i2 = LUNAR_INFO[year - 1900] & 1048448;
        for (int i3 = 524288; i3 > 7; i3 >>= 1) {
            if ((i2 & i3) != 0) {
                i++;
            }
        }
        return i;
    }

    private static int daysInLunarMonth(int year, int month) {
        return (LUNAR_INFO[year + (-1900)] & (1048576 >> month)) == 0 ? 29 : 30;
    }

    private static int leapMonth(int year) {
        return (LUNAR_INFO[year - 1900] & 15728640) >> 20;
    }

    public static String getChinaDayString(int day) {
        String[] strArr = {"初", "十", "廿", "三"};
        int i = day % 10;
        int i2 = i == 0 ? 9 : i - 1;
        if (day > 30) {
            return "";
        }
        return day == 10 ? "初十" : strArr[day / 10] + chineseNumber[i2];
    }

    public static String getLunarDay(Date date) {
        String str = recentLanarDayMap.get(MyDateTool.toDateString(date));
        if (str != null) {
            return str;
        }
        int[] iArrSolarToLunar = solarToLunar(date.getYear() + MIN_YEAR, date.getMonth() + 1, date.getDate());
        int i = iArrSolarToLunar[2];
        int i2 = iArrSolarToLunar[1];
        if (i == 1) {
            return monthTag[i2 - 1] + "月";
        }
        return getChinaDayString(i);
    }

    private static void init() {
        Date date = new Date();
        for (int i = -90; i < 90; i++) {
            Date dateGapDay = MyDateTool.gapDay(date, i);
            recentLanarDayMap.put(MyDateTool.toDateString(dateGapDay), getLunarDay(dateGapDay));
        }
    }
}