package cn.jianyun.workplan.util;

import com.adgain.sdk.base.models.AdConstants;
import org.apache.logging.log4j.message.ParameterizedMessage;

/* JADX INFO: loaded from: classes2.dex */
public class MyTimeTool {
    public static String gapTime(String begin, int gap) {
        if (begin.length() != 5) {
            return AdConstants.FAIL;
        }
        String[] strArrSplit = begin.split(ParameterizedMessage.ERROR_MSG_SEPARATOR);
        int iIntValue = MyDataTool.toInteger(strArrSplit[0], 0).intValue();
        int iIntValue2 = MyDataTool.toInteger(strArrSplit[1], 0).intValue() + gap;
        if (iIntValue2 < 0) {
            iIntValue2 += 60;
            iIntValue--;
        }
        int i = iIntValue2 / 60;
        int i2 = iIntValue2 % 60;
        int i3 = iIntValue + i;
        if (i3 > 23) {
            i3 -= 24;
        }
        if (i3 < 0) {
            i3 += 24;
        }
        return MyDataTool.getTwo(i3) + ParameterizedMessage.ERROR_MSG_SEPARATOR + MyDataTool.getTwo(i2);
    }

    public static boolean isPassHours(long t, int hours) {
        return ((System.currentTimeMillis() - t) / 1000) / 3600 > ((long) hours);
    }

    public static boolean isPassDays(long t, int days) {
        return (((System.currentTimeMillis() - t) / 1000) / 3600) / 24 > ((long) days);
    }
}