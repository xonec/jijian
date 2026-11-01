package cn.jianyun.workplan.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bykv.vk.component.ttvideo.player.C;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyPermissionTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcn/jianyun/workplan/util/MyPermissionTool;", "", "()V", "toAppSettingPage", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MyPermissionTool {
    public static final int $stable = 0;
    public static final MyPermissionTool INSTANCE = new MyPermissionTool();

    private MyPermissionTool() {
    }

    public final void toAppSettingPage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.addFlags(C.ENCODING_PCM_MU_LAW);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }
}