package cn.jianyun.workplan.main.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Hilt_AlarmWidgetReceiver extends BroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private final boolean onReceiveBytecodeInjectionMarker = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((AlarmWidgetReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectAlarmWidgetReceiver((AlarmWidgetReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }
}