package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
import org.apache.commons.math3.geometry.VectorFormat;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PLog {
    public static boolean DEBUG = false;
    static String tag;

    private PLog() {
    }

    public static boolean isDebuggable() {
        return DEBUG;
    }

    public static void setDebuggable(boolean debug) {
        DEBUG = debug;
    }

    private static StackTraceElement getTag() {
        StackTraceElement currentStackTrace = getCurrentStackTrace();
        tag = currentStackTrace == null ? "Unknow" : currentStackTrace.getFileName().replace(".java", "");
        return currentStackTrace;
    }

    public static void e(String message) {
        if (isDebuggable()) {
            Log.e(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    public static void i(String message) {
        if (isDebuggable()) {
            Log.i(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    public static void d(String message) {
        if (isDebuggable()) {
            Log.d(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    public static void v(String message) {
        if (isDebuggable()) {
            Log.v(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    public static void w(String message) {
        if (isDebuggable()) {
            Log.w(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    public static void wtf(String message) {
        if (isDebuggable()) {
            Log.wtf(tag, wrapLogWithMethodLocation(getTag(), message));
        }
    }

    private static String wrapLogWithMethodLocation(StackTraceElement element, String msg) {
        String fileName;
        int lineNumber;
        String methodName;
        if (element == null) {
            element = getCurrentStackTrace();
        }
        if (element != null) {
            fileName = element.getFileName();
            methodName = element.getMethodName();
            lineNumber = element.getLineNumber();
        } else {
            fileName = "unknow";
            lineNumber = -1;
            methodName = "unknow";
        }
        StringBuilder sb = new StringBuilder("  (");
        sb.append(fileName).append(ParameterizedMessage.ERROR_MSG_SEPARATOR).append(lineNumber).append(") #").append(methodName).append("：\n").append(wrapJson(msg));
        return sb.toString();
    }

    public static String wrapJson(String jsonStr) {
        if (TextUtils.isEmpty(jsonStr)) {
            return "json为空";
        }
        try {
            if (jsonStr.startsWith(VectorFormat.DEFAULT_PREFIX)) {
                jsonStr = "\n================JSON================\n" + new JSONObject(jsonStr).toString(2) + "\n================JSON================\n";
            } else if (jsonStr.startsWith("[")) {
                jsonStr = "\n================JSONARRAY================\n" + new JSONArray(jsonStr).toString(4) + "\n================JSONARRAY================\n";
            }
        } catch (JSONException unused) {
        }
        return jsonStr;
    }

    public static String getCrashInfo(Throwable tr) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        tr.printStackTrace(printWriter);
        for (Throwable cause = tr.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        String string = stringWriter.toString();
        printWriter.close();
        return string;
    }

    private static StackTraceElement getCurrentStackTrace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int stackOffset = getStackOffset(stackTrace, PLog.class);
        if (stackOffset == -1 && (stackOffset = getStackOffset(stackTrace, Logger.class)) == -1 && (stackOffset = getStackOffset(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[stackOffset];
    }

    private static int getStackOffset(StackTraceElement[] trace, Class cla) {
        int i = -1;
        for (int i2 = 0; i2 < trace.length; i2++) {
            if (!TextUtils.equals(trace[i2].getClassName(), cla.getName())) {
                if (i > -1) {
                    break;
                }
            } else {
                i = i2;
            }
        }
        int i3 = i + 1;
        return i3 >= trace.length ? trace.length - 1 : i3;
    }
}