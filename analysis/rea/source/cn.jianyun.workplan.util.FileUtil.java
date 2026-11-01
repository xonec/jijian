package cn.jianyun.workplan.util;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    public static boolean saveData(Context context, String fileName, String value) {
        try {
            context.getFilesDir();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(fileName, 0));
            try {
                outputStreamWriter.write(value);
                return true;
            } finally {
                outputStreamWriter.close();
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static String loadData(Context context, String fileName, boolean withBreak) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.openFileInput(fileName)));
            try {
                new String();
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    if (withBreak) {
                        sb.append("\n");
                    }
                }
                String string = sb.toString();
                try {
                    bufferedReader2.close();
                } catch (Exception unused) {
                }
                return string;
            } catch (Exception unused2) {
                bufferedReader = bufferedReader2;
                try {
                    bufferedReader.close();
                    return "";
                } catch (Exception unused3) {
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    bufferedReader.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean remove(Context context, final String fileName) {
        File[] fileArrListFiles = context.getFilesDir().listFiles(new FileFilter() { // from class: cn.jianyun.workplan.util.FileUtil.1
            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                return pathname.getName().equals(fileName);
            }
        });
        if (fileArrListFiles.length > 0) {
            return fileArrListFiles[0].delete();
        }
        return true;
    }
}