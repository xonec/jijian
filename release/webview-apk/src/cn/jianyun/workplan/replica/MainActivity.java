package cn.jianyun.workplan.replica;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * 极简排班（复刻）H5 外壳 Activity：
 * 本地 AssetServer 以 http://127.0.0.1:8123 提供 dist/build/h5 资源，
 * WebView 加载后 H5 路由/本地存储与浏览器中一致。
 */
public class MainActivity extends Activity {
    private static final int REQ_PERMISSIONS = 1001;
    private WebView webView;
    private AssetServer server;

    private boolean granted(String permission) {
        if (Build.VERSION.SDK_INT < 23) return true;
        return checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    private void addIfMissing(List<String> list, String permission) {
        if (!granted(permission)) list.add(permission);
    }

    /** 网络（安装时自动授予）+ 日历读写 + 通知 + 位置 运行时授权 */
    private void requestRuntimePermissions() {
        if (Build.VERSION.SDK_INT < 23) return;
        List<String> need = new ArrayList<>();
        addIfMissing(need, Manifest.permission.READ_CALENDAR);
        addIfMissing(need, Manifest.permission.WRITE_CALENDAR);
        addIfMissing(need, Manifest.permission.ACCESS_FINE_LOCATION);
        addIfMissing(need, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (Build.VERSION.SDK_INT >= 33) {
            addIfMissing(need, Manifest.permission.POST_NOTIFICATIONS);
        }
        if (!need.isEmpty()) {
            requestPermissions(need.toArray(new String[0]), REQ_PERMISSIONS);
        }
    }

    public class PermissionBridge {
        @JavascriptInterface
        public String status() {
            try {
                JSONObject o = new JSONObject();
                o.put("calendar", granted(Manifest.permission.READ_CALENDAR) && granted(Manifest.permission.WRITE_CALENDAR));
                boolean notify;
                if (Build.VERSION.SDK_INT >= 33) {
                    notify = granted(Manifest.permission.POST_NOTIFICATIONS);
                } else {
                    NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notify = nm == null || nm.areNotificationsEnabled();
                }
                o.put("notification", notify);
                o.put("location", granted(Manifest.permission.ACCESS_FINE_LOCATION) || granted(Manifest.permission.ACCESS_COARSE_LOCATION));
                o.put("network", true);
                return o.toString();
            } catch (Exception e) {
                return "{}";
            }
        }

        @JavascriptInterface
        public void request() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    requestRuntimePermissions();
                }
            });
        }

        @JavascriptInterface
        public void openSettings() {
            try {
                Intent i = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                i.setData(Uri.parse("package:" + getPackageName()));
                startActivity(i);
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            Window w = getWindow();
            w.setStatusBarColor(Color.parseColor("#F6F5F4"));
            w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        server = new AssetServer(this);
        int port = 8123;
        try {
            port = server.start(8123);
        } catch (Exception e) {
            try { port = server.start(0); } catch (Exception e2) { port = 0; }
        }
        webView = new WebView(this);
        WebSettings s = webView.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setAllowFileAccess(false);
        s.setMediaPlaybackRequiresUserGesture(false);
        s.setCacheMode(WebSettings.LOAD_DEFAULT);
        s.setSupportZoom(false);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.setBackgroundColor(Color.parseColor("#F6F5F4"));
        setContentView(webView);
        webView.addJavascriptInterface(new PermissionBridge(), "AndroidBridge");
        requestRuntimePermissions();
        if (port > 0) {
            webView.loadUrl("http://127.0.0.1:" + port + "/index.html");
        } else {
            webView.loadUrl("file:///android_asset/www/index.html");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (webView != null) {
            webView.evaluateJavascript("window.dispatchEvent(new Event('andpermchange'))", null);
        }
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        if (server != null) server.stop();
        if (webView != null) webView.destroy();
        super.onDestroy();
    }
}
