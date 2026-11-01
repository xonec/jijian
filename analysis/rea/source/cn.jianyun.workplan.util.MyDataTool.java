package cn.jianyun.workplan.util;

import com.adgain.sdk.base.models.AdConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.util.ProcessIdUtil;

/* JADX INFO: loaded from: classes2.dex */
public class MyDataTool {
    public static Integer toInteger(Object obj) {
        return toInteger(obj, null);
    }

    public static Integer toInteger(Object obj, Integer defVal) {
        try {
            return Integer.valueOf(obj.toString());
        } catch (Exception unused) {
            return defVal;
        }
    }

    public static Long toLong(Object obj) {
        return toLong(obj, null);
    }

    public static Long toLong(Object obj, Long defVal) {
        try {
            return Long.valueOf(obj.toString());
        } catch (Exception unused) {
            return defVal;
        }
    }

    public static boolean toBoolean(Object obj) {
        try {
            return Boolean.parseBoolean(obj.toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public static Double toDouble(Object obj) {
        return toDouble(obj, null);
    }

    public static Double toDouble(Object obj, Double defVal) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception unused) {
            return defVal;
        }
    }

    public static String toFixed(float x, int len) {
        String string = new BigDecimal(x).setScale(len, 4).toString();
        return (string.endsWith(".00") || string.endsWith(".0")) ? toFixed(x, 0) : string;
    }

    public static String getFileSize(String fileSize) {
        int iIntValue = toInteger(fileSize, 0).intValue();
        if (iIntValue < 1024) {
            return iIntValue + "B";
        }
        if (iIntValue < 1048576) {
            return toFixed((float) ((((double) iIntValue) * 1.0d) / 1024.0d), 2) + "KB";
        }
        return toFixed((float) (((((double) iIntValue) * 1.0d) / 1024.0d) / 1024.0d), 2) + "MB";
    }

    public static String leftPad(String data, int len, String leftChar) {
        if (data == null) {
            return "";
        }
        if (data.length() >= len) {
            return data;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(data);
        while (stringBuffer.length() < len) {
            stringBuffer.insert(0, leftChar);
        }
        return stringBuffer.toString();
    }

    public static String leftPadZero(String data, int len) {
        return leftPad(data, len, AdConstants.FAIL);
    }

    public static String leftPadZero(int data, int len) {
        return leftPad(String.valueOf(data), len, AdConstants.FAIL);
    }

    public static String getTwo(int data) {
        return leftPad(String.valueOf(data), 2, AdConstants.FAIL);
    }

    public static String toString(Object text, String defaultValue) {
        return text == null ? defaultValue : text.toString();
    }

    public static String join(List<Integer> fixWeeks) {
        if (fixWeeks == null || fixWeeks.isEmpty()) {
            return "empty";
        }
        final StringBuffer stringBuffer = new StringBuffer();
        fixWeeks.stream().sorted().forEach(new Consumer() { // from class: cn.jianyun.workplan.util.MyDataTool$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                stringBuffer.append(((Integer) obj) + ",");
            }
        });
        return stringBuffer.toString();
    }

    public static String getShownPrice(String price, int decimal) {
        if ("".equals(price)) {
            return "无";
        }
        try {
            return new BigDecimal(price).setScale(decimal, RoundingMode.HALF_UP).toString();
        } catch (Exception unused) {
            return "无";
        }
    }

    public static String getRealPrice(String price, int decimal) {
        if ("".equals(price)) {
            return AdConstants.FAIL;
        }
        try {
            return new BigDecimal(price).setScale(decimal, RoundingMode.HALF_UP).toString();
        } catch (Exception unused) {
            return AdConstants.FAIL;
        }
    }

    public static float getPriceWithFloat(String price, int decimal) {
        if ("".equals(price) || ProcessIdUtil.DEFAULT_PROCESSID.equals(price)) {
            return 0.0f;
        }
        try {
            return new BigDecimal(price).setScale(decimal, RoundingMode.HALF_UP).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static String divide(String price, String part, int decimal) {
        if (!"".equals(part) && !AdConstants.FAIL.equals(part)) {
            Double d2 = toDouble(price);
            Double d3 = toDouble(part);
            if (d2 != null && d3 != null) {
                return new BigDecimal(d2.doubleValue()).divide(new BigDecimal(d3.doubleValue()), decimal, RoundingMode.HALF_UP).toString();
            }
        }
        return "无";
    }

    public static float divideWithFloat(String price, String part, int decimal) {
        if (!"".equals(part) && !AdConstants.FAIL.equals(part)) {
            Double d2 = toDouble(price);
            Double d3 = toDouble(part);
            if (d2 != null && d3 != null) {
                return new BigDecimal(d2.doubleValue()).divide(new BigDecimal(d3.doubleValue()), decimal, RoundingMode.HALF_UP).floatValue();
            }
        }
        return 0.0f;
    }

    public static String plusTime(String t1, String t2) {
        String[] strArrSplit = t1.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        String[] strArrSplit2 = t2.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        if (strArrSplit.length != 2 || strArrSplit2.length != 2) {
            return "".equals(t1) ? t2 : t1;
        }
        int iPlusNum = plusNum(strArrSplit[0], strArrSplit2[0]);
        int iPlusNum2 = plusNum(strArrSplit[1], strArrSplit2[1]);
        if (iPlusNum2 >= 60) {
            iPlusNum += iPlusNum2 / 60;
            iPlusNum2 %= 60;
        }
        return iPlusNum + ParameterizedMessage.ERROR_MSG_SEPARATOR + iPlusNum2;
    }

    public static int plusNum(String t1, String t2) {
        return (int) (getPriceWithFloat(t1, 0) + getPriceWithFloat(t2, 0));
    }

    public static float plusPrice(String t1, String t2) {
        return getPriceWithFloat(t1, 2) + getPriceWithFloat(t2, 2);
    }

    public static float minusPrice(String t1, String t2) {
        return getPriceWithFloat(t1, 2) - getPriceWithFloat(t2, 2);
    }

    public static String plusPriceWithString(String v1, String v2) {
        return toFixed(plusPrice(v1, v2), 2);
    }

    public static String minusPriceWithString(String v1, String v2) {
        return toFixed(minusPrice(v1, v2), 2);
    }

    public static String minusTime(String t2, String t1, boolean beyond) {
        String[] strArrSplit = t1.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        String[] strArrSplit2 = t2.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        if (strArrSplit.length != 2 || strArrSplit2.length != 2) {
            return "".equals(t1) ? t2 : t1;
        }
        int iIntValue = toInteger(strArrSplit[0], 0).intValue();
        int iIntValue2 = toInteger(strArrSplit2[0], 0).intValue();
        if (iIntValue2 < iIntValue && beyond) {
            iIntValue2 += 24;
        }
        int iIntValue3 = (((iIntValue2 * 60) + toInteger(strArrSplit2[1], 0).intValue()) - (iIntValue * 60)) - toInteger(strArrSplit[1], 0).intValue();
        return (iIntValue3 / 60) + ParameterizedMessage.ERROR_MSG_SEPARATOR + (iIntValue3 % 60);
    }

    public static float multipy(String v1, String v2) {
        return getPriceWithFloat(v1, 2) * getPriceWithFloat(v2, 2);
    }

    public static String multipyWithString(String v1, String v2) {
        return toFixed(multipy(v1, v2), 1);
    }

    public static String timeToDecimal(String time) {
        if ("".equals(time)) {
            return "";
        }
        String[] strArrSplit = time.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        if (strArrSplit.length != 2) {
            return "";
        }
        return toFixed((float) (((double) toInteger(strArrSplit[0], 0).intValue()) + ((((double) toInteger(strArrSplit[1], 0).intValue()) * 1.0d) / 60.0d)), 1);
    }

    public static String getShownTime(String time) {
        return getShownTime(time, false);
    }

    public static String getShownTime(String time, boolean small) {
        if ("".equals(time)) {
            return "无";
        }
        String[] strArrSplit = time.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        if (strArrSplit.length != 2) {
            return "无";
        }
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        if (small) {
            return toFixed((float) ((((double) ((toInteger(str).intValue() * 60) + toInteger(str2).intValue())) * 1.0d) / 60.0d), 1) + "h";
        }
        String str3 = toInteger(str, 0).intValue() > 0 ? str + "小时" : "";
        return toInteger(str2, 0).intValue() > 0 ? str3 + str2 + "分钟" : str3;
    }

    public static String withUnit(String value, String unit) {
        return withUnit(value, -1, unit);
    }

    public static String withUnit(String value, int decimal, String unit) {
        if ("".equals(value)) {
            return "无";
        }
        if (decimal >= 0) {
            return toFixed(toDouble(value).floatValue(), decimal) + unit;
        }
        return value + unit;
    }
}