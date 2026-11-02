package cn.jianyun.replica.nativeplugin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/** 透明 Activity：从系统文件选择器读取 JSON 备份。 */
public class SafImportActivity extends Activity {
    public static final String PREFS = "jy_saf_import";
    public static final String KEY_STATUS = "status";
    public static final String KEY_NAME = "name";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_ERROR = "error";
    private static final int REQ = 9103;
    private static final int MAX = 2 * 1024 * 1024;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("application/json");
            startActivityForResult(intent, REQ);
        } catch (Throwable e) {
            save("error", "", "", String.valueOf(e.getMessage()));
            finish();
        }
    }

    private void save(String status, String name, String content, String error) {
        SharedPreferences sp = getSharedPreferences(PREFS, MODE_PRIVATE);
        sp.edit().putString(KEY_STATUS, status).putString(KEY_NAME, name).putString(KEY_CONTENT, content).putString(KEY_ERROR, error).apply();
    }

    private String fileName(Uri uri) {
        try {
            String p = uri.getLastPathSegment();
            if (p == null) return "backup.json";
            int i = p.lastIndexOf('/');
            return i >= 0 ? p.substring(i + 1) : p;
        } catch (Throwable e) { return "backup.json"; }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQ) { finish(); return; }
        if (resultCode != RESULT_OK || data == null || data.getData() == null) {
            save("canceled", "", "", "");
            finish();
            return;
        }
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            Uri uri = data.getData();
            in = getContentResolver().openInputStream(uri);
            if (in == null) throw new Exception("无法读取文件");
            out = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) > 0) {
                out.write(buf, 0, n);
                if (out.size() > MAX) throw new Exception("备份文件过大");
            }
            save("success", fileName(uri), out.toString("UTF-8"), "");
        } catch (Throwable e) {
            save("error", "", "", String.valueOf(e.getMessage()));
        } finally {
            try { if (in != null) in.close(); } catch (Throwable ignored) {}
            try { if (out != null) out.close(); } catch (Throwable ignored) {}
        }
        finish();
    }
}
