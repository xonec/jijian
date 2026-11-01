package cn.jianyun.workplan.widget;

import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Hilt_MyAppWidgetReceiver extends GlanceAppWidgetReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
        super.onReceive(context, intent);
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((MyAppWidgetReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectMyAppWidgetReceiver((MyAppWidgetReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }
}