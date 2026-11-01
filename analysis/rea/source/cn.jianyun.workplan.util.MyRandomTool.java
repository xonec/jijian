package cn.jianyun.workplan.util;

import java.util.UUID;
import org.apache.logging.log4j.util.ProcessIdUtil;

/* JADX INFO: loaded from: classes2.dex */
public class MyRandomTool {
    public static String uuids() {
        return UUID.randomUUID().toString().replaceAll(ProcessIdUtil.DEFAULT_PROCESSID, "").substring(0, 16);
    }

    public static int randomNumber(int begin, int end) {
        return (int) Math.floor((Math.random() * ((double) (end - begin))) + ((double) begin));
    }

    public static int randomNumber() {
        return randomNumber(0, 1000);
    }

    public static int randomNumber(int max) {
        return randomNumber(0, max);
    }

    public static String random(int len) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            int iRandomNumber = randomNumber(65, 91);
            if (iRandomNumber % 3 == 1) {
                iRandomNumber = randomNumber(48, 58);
            }
            stringBuffer.append((char) iRandomNumber);
        }
        return stringBuffer.toString().toLowerCase();
    }
}