package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.callback;

import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface OnPieSelectListener<T extends IPieInfo> {
    void onSelectPie(T pieInfo, boolean isFloatUp);
}