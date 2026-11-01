package cn.jianyun.workplan.util;

import androidx.core.text.util.LocalePreferences;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.FtsOptions;
import com.adgain.sdk.base.models.AdConstants;
import com.adgain.sdk.base.models.point.PointType;
import com.bykv.vk.component.ttvideo.LiveConfigKey;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.meishu.sdk.core.MSAdConfig;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import com.tianmu.biz.bean.AdType;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: loaded from: classes2.dex */
public class SelectUtil {
    public static final List<SelectDO> BACK_TYPES = initValues("本地备份", "local", "云备份", "cloud");
    public static final List<SelectDO> FEEDBACK_TYPES = initValues("功能缺陷", "bug", "产品建议", "advice");
    public static final List<SelectDO> DATE_CHOOSE_TYPES = initValues("月度", "month", "年度", "year", "自定义", DavPrincipal.KEY_SELF);
    public static final List<SelectDO> MONDAY_OR_SUNDAY = initValues("周一", "monday", "周日", "sunday");
    public static final List<SelectDO> ALL_SIGN_TYPES = initValues("工时", "hour", "日结", "day", "时间", "time", "休息", "rest", "请假", "leave");
    public static final List<SelectDO> WORK_DATA_TYPES = initValues("按工时", "hour", "按日结", "day", "按时间", "time", "按补扣", "award");
    public static final List<SelectDO> SIGN_TYPES = initValues("工时", "hour", "日结", "day", "时间", "time");
    public static final List<SelectDO> LEAVE_TYPES = initValues("请假", "leave", "休息", "rest");
    public static final List<SelectDO> DEFAULT_TYPES = initValuesAndColor("打卡", "sign", "#776AD4", "补贴", "award", "#1974E8", "扣款", "fine", "#F87679");
    public static final List<SelectDO> AWARD_TYPES = initValues("补贴", "award", "扣款", "fine");
    public static final List<SelectDO> SALARY_TYPES = initValues("正班薪水", "normal", "加班薪水", "over");
    public static final List<SelectDO> SALARY_CALC_TYPES = initValues("固定工时费", "fix", "按月计算", "month");
    public static final List<SelectDO> OVER_SALARY_CALC_TYPES = initValues("按倍数", "times", "固定工时费", "fix");
    public static final List<SelectDO> REST_TYPES = initValues("单休(25.75天)", "25.75", "单休(26天)", "26", "单双休(23.75天)", "23.75", "单双休(24天)", "24", "双休(21.75天)", "21.75", "双休(22天)", "22");
    public static final List<SelectDO> GIFT_TYPES = initValues("收礼", "receive", "送礼", "send");
    public static final List<SelectDO> LOGIN_TYPES = initValues("登录", "login", "注册", "regist");
    public static final List<SelectDO> GIFT_ALL_TYPES = initValues("全部", "", "送礼", "send", "收礼", "receive");
    public static final List<SelectDO> BORROW_TYPES = initValues("借出", "send", "借进", "receive");
    public static final List<SelectDO> RELATIONS = initSingleValues("亲属", "同学", "朋友", "领导", "同事");
    public static final List<SelectDO> GIFT_PAY_TYPES = initSingleValues("支付宝", "微信", "银行卡", "现金");
    public static final List<SelectDO> BORROW_TIMES = initWithUnit("", "次", 1, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUXER_STALL);
    public static final List<SelectDO> BORROW_NOTIFY_TYPES = initValues("无提醒", LiveConfigKey.NONE, "分期", "period", "自定义", DavPrincipal.KEY_SELF);
    public static final List<SelectDO> GIFT_REASON_TYPES = initSingleValues("结婚", "乔迁", "生日");
    public static final List<SelectDO> IDENTITYS = initSingleValues("本科", "硕士", "专科", "教师");
    public static final List<SelectDO> COLOR_MODES = initValues("中国色", LocalePreferences.CalendarType.CHINESE, "自定义", DavPrincipal.KEY_SELF, "我收藏的", "collect");
    public static final List<SelectDO> JOBS = initValues("学生", "student", "教师", "teacher", "其他", AdType.TYPE_OTHER);
    public static final List<SelectDO> THEMES = initValues("亮白主题", "light", "暗黑主题", "dark", "追随系统", "auto");
    public static final List<SelectDO> WEEKDAYS = initValues("周一", "2", "周二", ExifInterface.GPS_MEASUREMENT_3D, "周三", "4", "周四", "5", "周五", "6", "周六", "7", "周日", "1");
    public static final List<SelectDO> ALL_WEEKS = initWithUnit("", "周", 1, 60);
    public static final List<SelectDO> START_DAYS = initValues("周一", "1", "周日", "7");
    public static final List<SelectDO> CHOOSE_COURSES = initWithUnit("", "节课", 0, 10);
    public static final List<SelectDO> EARLY_CHOOSE_COURSES = initWithUnit("", "节课", 0, 10);
    public static final List<SelectDO> CHOOSE_PERIODS = initWithUnit("", "分钟", "1", "2", "5", MSAdConfig.GENDER_FEMALE, "20", "25", "30", "35", "40", "45", "50", "55", "60", "70", "80", "85", "90", PointType.AdGain_COMMON, PointType.AdGain_CRASH);
    public static final List<SelectDO> CHOOSE_PERIOD_GAPS = initWithUnit("", "分钟", AdConstants.FAIL, "1", "2", "5", MSAdConfig.GENDER_FEMALE, "15", "20", "25", "30", "40", "50", "60");
    public static final List<SelectDO> BEFORE_NOTIFY_TIMES = initWithUnit("", "分钟", AdConstants.FAIL, "1", "2", "5", MSAdConfig.GENDER_FEMALE, "15", "20", "30", "50");
    public static final List<SelectDO> WORK_TYPES = initValues("普通班次", FtsOptions.TOKENIZER_SIMPLE, "组合班次", "combine");
    public static final List<SelectDO> BEFORE_NOTIFY_DAYS = initValues("当天", AdConstants.FAIL, "第二天", "1", "提前1天", "-1");
    public static final List<SelectDO> VIP_TYPES = initValues("每月", "month", "每年", "year", "永久", "forever");
    public static final List<SelectDO> CHOOSE_TIMES = initTime();
    public static final List<SelectDO> CHOOSE_WEEK_TYPES = initValues("自定义", DavPrincipal.KEY_SELF, "所有周", DavPrincipal.KEY_ALL, "单周", "single", "双周", XmlErrorCodes.DOUBLE);
    public static final List<SelectDO> CHOOSE_FONT_SIZES = initWithUnit("", "", 8, 30);
    public static final List<SelectDO> CHOOSE_WIDGET_STYLES = initValues("单行", AdConstants.FAIL, "双行", "1");
    public static final List<SelectDO> CHOOSE_WIDTH_SIZES = initWithUnitAndGap("", "", 100, 200, 5);
    public static final List<SelectDO> CHOOSE_WIDTH_SIZES2 = initWithUnitAndGap("", "", 40, 120, 5);

    public static List<SelectDO> initValues(String... args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < args.length; i += 2) {
            if (i < args.length - 1) {
                arrayList.add(new SelectDO(args[i], args[i + 1]));
            }
        }
        return arrayList;
    }

    public static List<SelectDO> initValuesAndColor(String... args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < args.length; i += 3) {
            if (i < args.length - 2) {
                arrayList.add(new SelectDO(args[i], args[i + 1], args[i + 2]));
            }
        }
        return arrayList;
    }

    public static List<SelectDO> initSingleValues(String... args) {
        ArrayList arrayList = new ArrayList();
        for (String str : args) {
            arrayList.add(new SelectDO(str, str));
        }
        return arrayList;
    }

    public static List<SelectDO> getFromDays() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SelectDO("本月1号到月底", "1"));
        for (int i = 2; i <= 30; i++) {
            arrayList.add(new SelectDO("本月" + i + "号到次月" + (i - 1) + "号", "" + i));
        }
        return arrayList;
    }

    public static final List<SelectDO> initWithUnit(String prefix, String unit, String... args) {
        ArrayList arrayList = new ArrayList();
        for (String str : args) {
            arrayList.add(new SelectDO(prefix + str + unit, str));
        }
        return arrayList;
    }

    public static final List<SelectDO> initWithUnit(String prefix, String unit, int begin, int end) {
        return initWithUnitAndGap(prefix, unit, begin, end, 1);
    }

    public static final List<SelectDO> initWithUnitAndGap(String prefix, String unit, int begin, int end, int gap) {
        ArrayList arrayList = new ArrayList();
        while (begin <= end) {
            arrayList.add(new SelectDO(prefix + begin + unit, String.valueOf(begin)));
            begin += gap;
        }
        return arrayList;
    }

    public static int findPosition(List<SelectDO> options, String value) {
        if (value == null) {
            return 0;
        }
        for (int i = 0; i < options.size(); i++) {
            if (value.equals(options.get(i).value)) {
                return i;
            }
        }
        return 0;
    }

    public static final List<SelectDO> initTime() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < 24) {
            String str = getTwo(i) + ParameterizedMessage.ERROR_MSG_SEPARATOR + getTwo(i2);
            arrayList.add(new SelectDO(str, str));
            i2 += 5;
            if (i2 >= 60) {
                i++;
                i2 = 0;
            }
        }
        return arrayList;
    }

    public static final List<String> initHour() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            arrayList.add(getTwo(i));
        }
        return arrayList;
    }

    public static final List<String> initMinutes() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 60; i++) {
            arrayList.add(getTwo(i));
        }
        return arrayList;
    }

    public static String getTwo(int k) {
        return k < 10 ? AdConstants.FAIL + k : String.valueOf(k);
    }

    public static List<SelectDO> makeCourseNumbers(int maxValue) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= maxValue; i++) {
            arrayList.add(new SelectDO(i + "节课", i + ""));
        }
        return arrayList;
    }

    public static int getDefaultIdx(List<SelectDO> options, String defaultValue) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).value.equals(defaultValue)) {
                return i;
            }
        }
        return 0;
    }

    public static boolean contains(List<SelectDO> options, String value) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static String getLabel(List<SelectDO> options, String value) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).value.equals(value)) {
                return options.get(i).label;
            }
        }
        return "未知";
    }

    public static String getColor(List<SelectDO> options, String value) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).value.equals(value)) {
                return options.get(i).backgroundColor;
            }
        }
        return "#776AD4";
    }

    public static String getLabel(List<SelectDO> options, String value, String defaultValue) {
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).value.equals(value)) {
                return options.get(i).label;
            }
        }
        return defaultValue;
    }
}