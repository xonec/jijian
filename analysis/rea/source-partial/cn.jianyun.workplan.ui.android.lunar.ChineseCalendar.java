package cn.jianyun.workplan.ui.android.lunar;

import androidx.webkit.ProxyConfig;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.loper7.date_time_picker.utils.lunar.LunarConstants;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.util.Chars;
import org.apache.logging.log4j.util.ProcessIdUtil;
import org.apache.xmlbeans.impl.common.NameUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class ChineseCalendar extends GregorianCalendar {
    public static final int CHINESE_DATE = 803;
    public static final int CHINESE_EARTHLY_BRANCH = 807;
    public static final int CHINESE_HEAVENLY_STEM = 806;
    public static final int CHINESE_MONTH = 802;
    public static final int CHINESE_PRINCIPLE_TERM = 805;
    public static final int CHINESE_SECTIONAL_TERM = 804;
    public static final int CHINESE_TERM_OR_DATE = 888;
    public static final int CHINESE_YEAR = 801;
    public static final int CHINESE_ZODIAC = 808;
    private static final int baseChineseDate = 11;
    private static final int baseChineseMonth = 11;
    private static final int baseChineseYear = 1900;
    private static final int baseDate = 1;
    private static final int baseIndex = 0;
    private static final int baseMonth = 1;
    private static final int baseYear = 1901;
    private static final long serialVersionUID = 8;
    private boolean areChineseFieldsComputed;
    private boolean areSolarTermsComputed;
    private int chineseDate;
    private int chineseMonth;
    private int chineseYear;
    private boolean lastSetChinese;
    private int principleTerm;
    private int sectionalTerm;
    private static final String[] chineseWeekNames = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    private static final String[] chineseMonthNames = {"", "正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    private static final String[] chineseDateNames = {"", "初一", "初二", "初三", "初四", "初五", "初六", "初七", "初八", "初九", "初十", "十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九", "二十", "廿一", "廿二", "廿三", "廿四", "廿五", "廿六", "廿七", "廿八", "廿九", "三十"};
    private static final String[] principleTermNames = {"大寒", "雨水", "春分", "谷雨", "夏满", "夏至", "大暑", "处暑", "秋分", "霜降", "小雪", "冬至"};
    private static final String[] sectionalTermNames = {"小寒", "立春", "惊蛰", "清明", "立夏", "芒种", "小暑", "立秋", "白露", "寒露", "立冬", "大雪"};
    private static final String[] stemNames = {"", "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
    private static final String[] branchNames = {"", "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    private static final String[] animalNames = {"", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
    private static final int[] bigLeapMonthYears = {6, 14, 19, 25, 33, 36, 38, 41, 44, 52, 55, 79, 117, 136, 147, 150, 155, 158, 185, 193};
    private static final char[][] sectionalTermMap = {new char[]{7, 6, 6, 6, 6, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5}, new char[]{5, 4, 5, 5, 5, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 3, 4, 4, 4, 3, 3, 4, 4, 3, 3, 3}, new char[]{6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 4, 4, 5, 5, 4, 4, 4, 5, 4, 4, 4, 4, 5}, new char[]{6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{6, 6, 7, 7, 6, 6, 6, 7, 6, 6, 6, 6, 5, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5, 6, 5, 5, 5, 5, 4, 5, 5, 5, 5}, new char[]{7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 6, 6, 6, 7, 7}, new char[]{'\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 7}, new char[]{'\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 7}, new char[]{'\t', '\t', '\t', '\t', '\b', '\t', '\t', '\t', '\b', '\b', '\t', '\t', '\b', '\b', '\b', '\t', '\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', '\b'}, new char[]{'\b', '\b', '\b', '\b', 7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 7}, new char[]{7, '\b', '\b', '\b', 7, 7, '\b', '\b', 7, 7, 7, '\b', 7, 7, 7, 7, 6, 7, 7, 7, 6, 6, 7, 7, 6, 6, 6, 7, 7}};
    private static final char[][] sectionalTermYear = {new char[]{Chars.CR, '1', 'U', 'u', 149, 185, 201, 250, 250}, new char[]{Chars.CR, '-', 'Q', 'u', 149, 185, 201, 250, 250}, new char[]{Chars.CR, '0', 'T', 'p', 148, 184, 200, 201, 250}, new char[]{Chars.CR, '-', 'L', 'l', 140, 172, 200, 201, 250}, new char[]{Chars.CR, ',', 'H', 'h', 132, 168, 200, 201, 250}, new char[]{5, '!', 'D', '`', '|', 152, 188, 200, 201}, new char[]{29, '9', 'U', 'x', 148, Typography.degree, 200, 201, 250}, new char[]{Chars.CR, '0', 'L', 'h', 132, 168, 196, 200, 201}, new char[]{25, Typography.less, 'X', 'x', 148, 184, 200, 201, 250}, new char[]{16, ',', 'L', 'l', 144, 172, 200, 201, 250}, new char[]{28, Typography.less, IOUtils.DIR_SEPARATOR_WINDOWS, '|', Typography.nbsp, 192, 200, 201, 250}, new char[]{17, '5', 'U', '|', 156, 188, 200, 201, 250}};
    private static final char[][] principleTermMap = {new char[]{21, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 20, 20, 20, 20, 20, 19, 20, 20, 20, 19, 19, 20}, new char[]{20, 19, 19, 20, 20, 19, 19, 19, 19, 19, 19, 19, 19, 18, 19, 19, 19, 18, 18, 19, 19, 18, 18, 18, 18, 18, 18, 18}, new char[]{21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 20, 20, 20, 20, 19, 20, 20, 20, 20}, new char[]{20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 20, 20, 20, 20, 19, 20, 20, 20, 19, 19, 20, 20, 19, 19, 19, 20, 20}, new char[]{21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 20, 20, 20, 21, 21}, new char[]{22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 20, 21, 21, 21, 20, 20, 21, 21, 21}, new char[]{23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 23}, new char[]{23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 23}, new char[]{23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 23}, new char[]{24, 24, 24, 24, 23, 24, 24, 24, 23, 23, 24, 24, 23, 23, 23, 24, 23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 23}, new char[]{23, 23, 23, 23, 22, 23, 23, 23, 22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 22}, new char[]{22, 22, 23, 23, 22, 22, 22, 23, 22, 22, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 21, 21, 21, 22, 21, 21, 21, 21, 22}};
    private static final char[][] principleTermYear = {new char[]{Chars.CR, '-', 'Q', 'q', 149, 185, 201}, new char[]{21, '9', ']', '}', 161, 193, 201}, new char[]{21, '8', 'X', 'x', 152, 188, 200, 201}, new char[]{21, '1', 'Q', 't', 144, Typography.degree, 200, 201}, new char[]{17, '1', 'M', 'p', 140, 168, 200, 201}, new char[]{28, Typography.less, 'X', 't', 148, 180, 200, 201}, new char[]{25, '5', 'T', 'p', 144, 172, 200, 201}, new char[]{29, '9', 'Y', 'x', 148, 180, 200, 201}, new char[]{17, '-', 'I', 'l', 140, 168, 200, 201}, new char[]{28, Typography.less, IOUtils.DIR_SEPARATOR_WINDOWS, '|', Typography.nbsp, 192, 200, 201}, new char[]{16, ',', 'P', 'p', 148, 180, 200, 201}, new char[]{17, '5', 'X', 'x', 156, 188, 200, 201}};
    private static final char[] daysInGregorianMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final char[] chineseMonths = {0, 4, 173, '\b', 'Z', 1, 213, 'T', 180, '\t', 'd', 5, 'Y', 'E', 149, '\n', 166, 4, 'U', Typography.dollar, 173, '\b', 'Z', 'b', 218, 4, 180, 5, 180, 'U', 'R', Chars.CR, 148, '\n', 'J', '*', 'V', 2, 'm', 'q', 'm', 1, 218, 2, 210, 'R', Typography.copyright, 5, 'I', Chars.CR, '*', 'E', '+', '\t', 'V', 1, 181, Chars.SPACE, 'm', 1, 'Y', 'i', 212, '\n', 168, 5, Typography.copyright, 'V', 165, 4, '+', '\t', 158, '8', Typography.paragraph, '\b', 236, 't', 'l', 5, 212, '\n', 228, 'j', 'R', 5, 149, '\n', 'Z', 'B', '[', 4, Typography.paragraph, 4, 180, '\"', 'j', 5, 'R', 'u', 201, '\n', 'R', 5, '5', 'U', 'M', '\n', 'Z', 2, ']', '1', 181, 2, 'j', 138, 'h', 5, Typography.copyright, '\n', 138, 'j', '*', 5, '-', '\t', 170, 'H', 'Z', 1, 181, '\t', Typography.degree, '9', 'd', 5, '%', 'u', 149, '\n', 150, 4, 'M', 'T', 173, 4, 218, 4, 212, 'D', 180, 5, 'T', 133, 'R', Chars.CR, 146, '\n', 'V', 'j', 'V', 2, 'm', 2, 'j', 'A', 218, 2, 178, 161, Typography.copyright, 5, 'I', Chars.CR, '\n', 'm', '*', '\t', 'V', 1, 173, 'P', 'm', 1, 217, 2, 209, NameUtil.COLON, 168, 5, ')', 133, 165, '\f', '*', '\t', 150, 'T', Typography.paragraph, '\b', 'l', '\t', 'd', 'E', 212, '\n', 164, 5, 'Q', '%', 149, '\n', '*', 'r', '[', 4, Typography.paragraph, 4, 172, 'R', 'j', 5, 210, '\n', Typography.cent, 'J', 'J', 5, 'U', 148, '-', '\n', 'Z', 2, 'u', 'a', 181, 2, 'j', 3, 'a', 'E', Typography.copyright, '\n', 'J', 5, '%', '%', '-', '\t', 154, 'h', 218, '\b', 180, '\t', 168, 'Y', 'T', 3, 165, '\n', 145, NameUtil.COLON, 150, 4, 173, Typography.degree, 173, 4, 218, 4, 244, 'b', 180, 5, 'T', 11, 'D', ']', 'R', '\n', 149, 4, 'U', '\"', 'm', 2, 'Z', 'q', 218, 2, 170, 5, 178, 'U', 'I', 11, 'J', '\n', '-', '9', '6', 1, 'm', 128, 'm', 1, 217, 2, 233, 'j', 168, 5, ')', 11, 154, 'L', 170, '\b', Typography.paragraph, '\b', 180, '8', 'l', '\t', 'T', 'u', 212, '\n', 164, 5, 'E', 'U', 149, '\n', 154, 4, 'U', 'D', 181, 4, 'j', 130, 'j', 5, 210, '\n', 146, 'j', 'J', 5, 'U', '\n', '*', 'J', 'Z', 2, 181, 2, 178, '1', 'i', 3, '1', 's', Typography.copyright, '\n', 'J', 5, '-', 'U', '-', '\t', 'Z', 1, 213, 'H', 180, '\t', 'h', 137, 'T', 11, 164, '\n', 165, 'j', 149, 4, 173, '\b', 'j', 'D', 218, 4, 't', 5, Typography.degree, '%', 'T', 3};

    private boolean isChineseField(int field) {
        if (field == 888) {
            return true;
        }
        switch (field) {
            case 801:
            case 802:
            case 803:
            case 804:
            case 805:
            case 806:
            case 807:
            case 808:
                return true;
            default:
                return false;
        }
    }

    private boolean isChineseTermsField(int field) {
        return field == 804 || field == 805 || field == 888;
    }

    public ChineseCalendar() {
    }

    public ChineseCalendar(Date d2) {
        super.setTime(d2);
    }

    public ChineseCalendar(Calendar c2) {
        this(c2.getTime());
    }

    public ChineseCalendar(int y, int m, int d2) {
        super(y, m, d2);
    }

    public ChineseCalendar(boolean isChinese, int y, int m, int d2) {
        if (isChinese) {
            set(801, y);
            set(802, m);
            set(803, d2);
            return;
        }
        set(y, m, d2);
    }

    @Override // java.util.Calendar
    public void set(int field, int value) {
        computeIfNeed(field);
        if (isChineseField(field)) {
            switch (field) {
                case 801:
                    this.chineseYear = value;
                    break;
                case 802:
                    this.chineseMonth = value;
                    break;
                case 803:
                    this.chineseDate = value;
                    break;
                default:
                    throw new IllegalArgumentException("field not supported, field : " + field);
            }
            this.lastSetChinese = true;
        } else {
            super.set(field, value);
            this.lastSetChinese = false;
        }
        this.areFieldsSet = false;
        this.areChineseFieldsComputed = false;
        this.areSolarTermsComputed = false;
    }

    @Override // java.util.Calendar
    public int get(int field) {
        int i;
        computeIfNeed(field);
        if (!isChineseField(field)) {
            return super.get(field);
        }
        if (field != 888) {
            switch (field) {
                case 801:
                    return this.chineseYear;
                case 802:
                    return this.chineseMonth;
                case 803:
                    return this.chineseDate;
                case 804:
                    return this.sectionalTerm;
                case 805:
                    return this.principleTerm;
                case 806:
                    i = (this.chineseYear - 4) % 10;
                    break;
                case 807:
                case 808:
                    i = (this.chineseYear - 4) % 12;
                    break;
                default:
                    throw new IllegalArgumentException("field not supported, field : " + field);
            }
            return i + 1;
        }
        if (get(5) == get(804)) {
            return 804;
        }
        if (get(5) == get(805)) {
            return 805;
        }
        return get(803) == 1 ? 802 : 803;
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public void add(int field, int amount) {
        computeIfNeed(field);
        if (!isChineseField(field)) {
            super.add(field, amount);
            this.lastSetChinese = false;
            this.areChineseFieldsComputed = false;
            this.areSolarTermsComputed = false;
            return;
        }
        switch (field) {
            case 801:
                this.chineseYear += amount;
                this.lastSetChinese = true;
                this.areFieldsSet = false;
                this.areChineseFieldsComputed = false;
                this.areSolarTermsComputed = false;
                return;
            case 802:
                for (int i = 0; i < amount; i++) {
                    int iNextChineseMonth = nextChineseMonth(this.chineseYear, this.chineseMonth);
                    this.chineseMonth = iNextChineseMonth;
                    if (iNextChineseMonth == 1) {
                        this.chineseYear++;
                    }
                }
                this.lastSetChinese = true;
                this.areFieldsSet = false;
                this.areChineseFieldsComputed = false;
                this.areSolarTermsComputed = false;
                return;
            case 803:
                int iDaysInChineseMonth = daysInChineseMonth(this.chineseYear, this.chineseMonth);
                for (int i2 = 0; i2 < amount; i2++) {
                    int i3 = this.chineseDate + 1;
                    this.chineseDate = i3;
                    if (i3 > iDaysInChineseMonth) {
                        this.chineseDate = 1;
                        int iNextChineseMonth2 = nextChineseMonth(this.chineseYear, this.chineseMonth);
                        this.chineseMonth = iNextChineseMonth2;
                        if (iNextChineseMonth2 == 1) {
                            this.chineseYear++;
                        }
                        iDaysInChineseMonth = daysInChineseMonth(this.chineseYear, iNextChineseMonth2);
                    }
                }
            default:
                throw new IllegalArgumentException("field not supported, field : " + field);
        }
    }

    @Override // java.util.GregorianCalendar, java.util.Calendar
    public void roll(int field, int amount) {
        computeIfNeed(field);
        if (!isChineseField(field)) {
            super.roll(field, amount);
            this.lastSetChinese = false;
            this.areChineseFieldsComputed = false;
            this.areSolarTermsComputed = false;
            return;
        }
        switch (field) {
            case 801:
                this.chineseYear += amount;
                this.lastSetChinese = true;
                this.areFieldsSet = false;
                this.areChineseFieldsComputed = false;
                this.areSolarTermsComputed = false;
                return;
            case 802:
                for (int i = 0; i < amount; i++) {
                    this.chineseMonth = nextChineseMonth(this.chineseYear, this.chineseMonth);
                }
                this.lastSetChinese = true;
                this.areFieldsSet = false;
                this.areChineseFieldsComputed = false;
                this.areSolarTermsComputed = false;
                return;
            case 803:
                int iDaysInChineseMonth = daysInChineseMonth(this.chineseYear, this.chineseMonth);
                for (int i2 = 0; i2 < amount; i2++) {
                    int i3 = this.chineseDate + 1;
                    this.chineseDate = i3;
                    if (i3 > iDaysInChineseMonth) {
                        this.chineseDate = 1;
                    }
                }
            default:
                throw new IllegalArgumentException("field not supported, field : " + field);
        }
    }

    public String getChinese(int field) {
        computeIfNeed(field);
        if (field == 7) {
            return chineseWeekNames[get(field)];
        }
        if (field != 888) {
            switch (field) {
                case 801:
                    return this.chineseYear + "年";
                case 802:
                    if (this.chineseMonth > 0) {
                        return chineseMonthNames[this.chineseMonth] + "月";
                    }
                    return "闰" + chineseMonthNames[-this.chineseMonth] + "月";
                case 803:
                    return chineseDateNames[this.chineseDate];
                case 804:
                    return sectionalTermNames[get(2)];
                case 805:
                    return principleTermNames[get(2)];
                case 806:
                    return stemNames[get(field)];
                case 807:
                    return branchNames[get(field)];
                case 808:
                    return animalNames[get(field)];
                default:
                    throw new IllegalArgumentException("field not supported, field : " + field);
            }
        }
        return getChinese(get(CHINESE_TERM_OR_DATE));
    }

    public String getSimpleGregorianDateString() {
        return new StringBuffer().append(get(1)).append(ProcessIdUtil.DEFAULT_PROCESSID).append(get(2) + 1).append(ProcessIdUtil.DEFAULT_PROCESSID).append(get(5)).toString();
    }

    public String getSimpleChineseDateString() {
        return new StringBuffer().append(get(801)).append(ProcessIdUtil.DEFAULT_PROCESSID).append(get(802) > 0 ? "" + get(802) : ProxyConfig.MATCH_ALL_SCHEMES + (-get(802))).append(ProcessIdUtil.DEFAULT_PROCESSID).append(get(803)).toString();
    }

    public String getChineseDateString() {
        return new StringBuffer().append(getChinese(801)).append(getChinese(802)).append(getChinese(803)).toString();
    }

    @Override // java.util.Calendar
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getSimpleGregorianDateString()).append(" | ").append(getChinese(7)).append(" | [lunar]").append(getChineseDateString()).append(" ").append(getChinese(808)).append("year ").append(get(804)).append("day").append(getChinese(804)).append(" ").append(get(805)).append("day").append(getChinese(805));
        return stringBuffer.toString();
    }

    private void computeIfNeed(int field) {
        if (isChineseField(field)) {
            if (!this.lastSetChinese && !this.areChineseFieldsComputed) {
                super.complete();
                computeChineseFields();
                this.areFieldsSet = true;
                this.areChineseFieldsComputed = true;
                this.areSolarTermsComputed = false;
            }
            if (!isChineseTermsField(field) || this.areSolarTermsComputed) {
                return;
            }
            computeSolarTerms();
            this.areSolarTermsComputed = true;
            return;
        }
        if (!this.lastSetChinese || this.areFieldsSet) {
            return;
        }
        computeGregorianFields();
        super.complete();
        this.areFieldsSet = true;
        this.areChineseFieldsComputed = true;
        this.areSolarTermsComputed = false;
    }

    private void computeGregorianFields() {
        int i = this.chineseYear;
        int i2 = this.chineseMonth;
        int i3 = this.chineseDate;
        this.areChineseFieldsComputed = true;
        this.areFieldsSet = true;
        int iDaysInChineseMonth = 0;
        this.lastSetChinese = false;
        if (i < 1900) {
            i = LunarConstants.MIN_LUNAR_YEAR;
        } else if (i > 2100) {
            i = 2101;
        }
        if (i2 < -12) {
            i2 = -12;
        } else if (i2 > 12) {
            i2 = 12;
        }
        if (i3 < 1) {
            i3 = 1;
        } else if (i3 > 30) {
            i3 = 30;
        }
        int iAbs = (i * 10000) + (Math.abs(i2) * 100) + i3;
        if (iAbs < 19001111) {
            set(baseYear, 0, 1);
            super.complete();
        } else if (iAbs > 21001201) {
            set(2100, 11, 31);
            super.complete();
        } else {
            int i4 = Math.abs(i2) <= 12 ? i2 : 12;
            int iDaysInChineseMonth2 = daysInChineseMonth(i, i4);
            if (iDaysInChineseMonth2 == 0) {
                i4 = -i4;
                iDaysInChineseMonth2 = daysInChineseMonth(i, i4);
            }
            if (i3 > iDaysInChineseMonth2) {
                i3 = iDaysInChineseMonth2;
            }
            set(i, Math.abs(i4) - 1, i3);
            computeChineseFields();
            while (true) {
                int i5 = this.chineseYear;
                if (i5 == i && this.chineseMonth == i4) {
                    break;
                }
                iDaysInChineseMonth += daysInChineseMonth(i5, this.chineseMonth);
                int iNextChineseMonth = nextChineseMonth(this.chineseYear, this.chineseMonth);
                this.chineseMonth = iNextChineseMonth;
                if (iNextChineseMonth == 1) {
                    this.chineseYear++;
                }
            }
            super.add(5, iDaysInChineseMonth + (i3 - this.chineseDate));
        }
        computeChineseFields();
    }

    private void computeChineseFields() {
        int iInternalGet = internalGet(1);
        int iInternalGet2 = internalGet(2) + 1;
        int iInternalGet3 = internalGet(5);
        int i = baseYear;
        if (iInternalGet < baseYear || iInternalGet > 2100) {
            return;
        }
        if (iInternalGet < 2000) {
            this.chineseYear = 1900;
            this.chineseMonth = 11;
            this.chineseDate = 11;
        } else {
            this.chineseYear = 1999;
            this.chineseMonth = 11;
            this.chineseDate = 25;
            i = 2000;
        }
        int iDaysInGregorianMonth = 0;
        while (i < iInternalGet) {
            iDaysInGregorianMonth = isGregorianLeapYear(i) ? iDaysInGregorianMonth + MediaPlayer.MEDIA_PLAYER_OPTION_LAST_VIDEO_DECODE_TIME : iDaysInGregorianMonth + MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_DEMUX_TIME;
            i++;
        }
        for (int i2 = 1; i2 < iInternalGet2; i2++) {
            iDaysInGregorianMonth += daysInGregorianMonth(iInternalGet, i2 - 1);
        }
        this.chineseDate += iDaysInGregorianMonth + (iInternalGet3 - 1);
        int iDaysInChineseMonth = daysInChineseMonth(this.chineseYear, this.chineseMonth);
        while (true) {
            int i3 = this.chineseDate;
            if (i3 <= iDaysInChineseMonth) {
                return;
            }
            this.chineseDate = i3 - iDaysInChineseMonth;
            int iNextChineseMonth = nextChineseMonth(this.chineseYear, this.chineseMonth);
            this.chineseMonth = iNextChineseMonth;
            if (iNextChineseMonth == 1) {
                this.chineseYear++;
            }
            iDaysInChineseMonth = daysInChineseMonth(this.chineseYear, iNextChineseMonth);
        }
    }

    private void computeSolarTerms() {
        int iInternalGet = internalGet(1);
        int iInternalGet2 = internalGet(2);
        if (iInternalGet < baseYear || iInternalGet > 2100) {
            return;
        }
        this.sectionalTerm = sectionalTerm(iInternalGet, iInternalGet2);
        this.principleTerm = principleTerm(iInternalGet, iInternalGet2);
    }

    public static boolean isGregorianLeapYear(int year) {
        boolean z = year % 100 != 0 ? year % 4 == 0 : false;
        if (year % 400 == 0) {
            return true;
        }
        return z;
    }

    public static int daysInGregorianMonth(int y, int m) {
        char c2 = daysInGregorianMonth[m];
        return (m == 1 && isGregorianLeapYear(y)) ? c2 + 1 : c2;
    }

    public static int sectionalTerm(int y, int m) {
        int i;
        int i2 = m + 1;
        int i3 = 0;
        if (y < baseYear || y > 2100) {
            return 0;
        }
        int i4 = (y - baseYear) + 1;
        while (true) {
            i = i2 - 1;
            if (i4 < sectionalTermYear[i][i3]) {
                break;
            }
            i3++;
        }
        char c2 = sectionalTermMap[i][(i3 * 4) + (i4 % 4)];
        if (i4 == 121 && i2 == 4) {
            c2 = 5;
        }
        char c3 = (i4 == 132 && i2 == 4) ? (char) 5 : c2;
        if (i4 == 194 && i2 == 6) {
            return 6;
        }
        return c3;
    }

    public static int principleTerm(int y, int m) {
        int i;
        int i2 = m + 1;
        int i3 = 0;
        if (y < baseYear || y > 2100) {
            return 0;
        }
        int i4 = (y - baseYear) + 1;
        while (true) {
            i = i2 - 1;
            if (i4 < principleTermYear[i][i3]) {
                break;
            }
            i3++;
        }
        char c2 = principleTermMap[i][(i3 * 4) + (i4 % 4)];
        if (i4 == 171 && i2 == 3) {
            c2 = 21;
        }
        if (i4 == 181 && i2 == 5) {
            return 21;
        }
        return c2;
    }

    public static int getMonthLeapByYear(int y) {
        return -((chineseMonths[(((y - 1900) + 0) * 2) + 1] >> 4) & 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (((cn.jianyun.workplan.ui.android.lunar.ChineseCalendar.chineseMonths[(r6 * 2) + 1] >> (r7 - 9)) & 1) == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (((cn.jianyun.workplan.ui.android.lunar.ChineseCalendar.chineseMonths[r6 * 2] >> (r7 - 1)) & 1) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int daysInChineseMonth(int y, int m) {
        int i = 0;
        int i2 = (y - 1900) + 0;
        if (1 > m || m > 8) {
            if (9 > m || m > 12) {
                if (((chineseMonths[(i2 * 2) + 1] >> 4) & 15) != Math.abs(m)) {
                    return 0;
                }
                while (true) {
                    int[] iArr = bigLeapMonthYears;
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] == i2) {
                        return 30;
                    }
                    i++;
                }
                return 29;
            }
        }
    }

    public static int nextChineseMonth(int y, int m) {
        int iAbs = Math.abs(m) + 1;
        if (m > 0 && ((chineseMonths[(((y - 1900) + 0) * 2) + 1] >> 4) & 15) == m) {
            iAbs = -m;
        }
        if (iAbs == 13) {
            return 1;
        }
        return iAbs;
    }
}