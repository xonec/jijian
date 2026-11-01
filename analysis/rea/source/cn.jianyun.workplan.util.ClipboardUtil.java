package cn.jianyun.workplan.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.pangle.provider.ContentProviderManager;

/* JADX INFO: loaded from: classes2.dex */
public class ClipboardUtil {
    private ClipboardUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void copyText(Context context, final CharSequence text) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", text));
    }

    public static String getText(Context context) {
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        return (primaryClip == null || primaryClip.getItemCount() <= 0) ? "" : primaryClip.getItemAt(0).coerceToText(context).toString();
    }

    public static void copyUri(Context context, final Uri uri) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(context.getContentResolver(), ContentProviderManager.PROVIDER_URI, uri));
    }

    public static Uri getUri(Context context) {
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).getUri();
    }

    public static void copyIntent(Context context, final Intent intent) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newIntent("intent", intent));
    }

    public static Intent getIntent(Context context) {
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).getIntent();
    }

    public static void clearFirstClipboard(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ""));
        if (clipboardManager.hasPrimaryClip()) {
            clipboardManager.getPrimaryClip().getItemAt(0).getText();
        }
    }
}