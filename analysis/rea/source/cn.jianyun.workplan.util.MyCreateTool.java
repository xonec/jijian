package cn.jianyun.workplan.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class MyCreateTool {
    public static Map<String, Object> createMap(Object... argv) {
        HashMap map = new HashMap();
        if (argv != null && argv.length != 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= argv.length) {
                    break;
                }
                Object obj = argv[i];
                if (obj != null) {
                    map.put(obj.toString(), argv[i2]);
                }
                i += 2;
            }
        }
        return map;
    }

    public static Map<String, String> createStringMap(String... argv) {
        HashMap map = new HashMap();
        if (argv != null && argv.length != 0) {
            for (int i = 0; i < argv.length; i += 2) {
                String str = argv[i];
                if (str != null) {
                    map.put(str, argv[i + 1]);
                }
            }
        }
        return map;
    }

    public static int[] createArray(int n) {
        int[] iArr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            iArr[i] = random.nextInt(100);
        }
        return iArr;
    }

    public static List<Integer> createIntegerList(int n) {
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.valueOf(random.nextInt(1000)));
        }
        return arrayList;
    }

    public static List<Double> createDoubleList(int n) {
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arrayList.add(Double.valueOf(random.nextDouble() * 1000.0d));
        }
        return arrayList;
    }
}