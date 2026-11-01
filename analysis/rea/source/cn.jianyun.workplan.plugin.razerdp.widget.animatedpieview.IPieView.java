package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview;

import android.content.Context;
import android.view.View;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.manager.PieManager;

/* JADX INFO: loaded from: classes2.dex */
public interface IPieView {
    AnimatedPieViewConfig getConfig();

    PieManager getManager();

    View getPieView();

    Context getViewContext();

    void onCallInvalidate();
}