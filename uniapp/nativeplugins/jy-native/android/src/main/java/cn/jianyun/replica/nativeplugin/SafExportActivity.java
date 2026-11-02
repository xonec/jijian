package cn.jianyun.replica.nativeplugin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import java.io.OutputStream;

/** 透明 Activity：用户选择保存位置后立即写入备份文件，不依赖持久目录授权。 */
public class SafExportActivity extends Activity {
    public static final String PREFS = "jy_saf_export";
    public static final String KEY_STATUS = "status";
    public static final String KEY_NAME = "name";
    public static final String KEY_ERROR = "error";
    private static final int REQ = 9102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String fileName = getIntent().getStringExtra("fileName");
        if (fileName == null || fileName.isEmpty()) { finish(); return; }
        try {
            Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("application/json");
            intent.putExtra(Intent.EXTRA_TITLE, fileName);
            startActivityForResult(intent, REQ);
        } catch (Throwable e) {
            save("error", fileName, String.valueOf(e.getMessage()));
            finish();
        }
    }

    private void save(String status, String name, String error) {
        SharedPreferences sp = getSharedPreferences(PREFS, MODE_PRIVATE);
        sp.edit().putString(KEY_STATUS, status).putString(KEY_NAME, name).putString(KEY_ERROR, error).apply();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String fileName = getIntent().getStringExtra("fileName");
        String content = getIntent().getStringExtra("content");
        if (requestCode != REQ) { finish(); return; }
        if (resultCode != RESULT_OK || data == null || data.getData() == null) {
            save("canceled", fileName, "");
            finish();
            return;
        }
        OutputStream out = null;
        try {
            Uri uri = data.getData();
            out = getContentResolver().openOutputStream(uri);
            if (out == null) throw new Exception("无法写入文件");
            out.write(String.valueOf(content).getBytes("UTF-8"));
            out.flush();
            save("success", fileName, "");
        } catch (Throwable e) {
            save("error", fileName, String.valueOf(e.getMessage()));
        } finally {
            try { if (out != null) out.close(); } catch (Throwable ignored) {}
        }
        finish();
    }
}
