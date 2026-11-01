package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.callback;

import android.view.ViewGroup;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface OnPieLegendBindListener<V extends BasePieLegendsView> {
    boolean onAddView(ViewGroup parent, V view);

    V onCreateLegendView(int position, IPieInfo info);
}