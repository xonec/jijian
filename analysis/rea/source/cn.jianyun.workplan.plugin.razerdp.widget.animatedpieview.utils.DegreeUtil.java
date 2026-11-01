package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils;

/* JADX INFO: loaded from: classes2.dex */
public class DegreeUtil {
    public static float limitDegreeInTo360(double inputAngle) {
        int i = (int) inputAngle;
        float f2 = (float) (((double) (i % 360.0f)) + (inputAngle - ((double) i)));
        return f2 < 0.0f ? f2 + 360.0f : f2;
    }
}