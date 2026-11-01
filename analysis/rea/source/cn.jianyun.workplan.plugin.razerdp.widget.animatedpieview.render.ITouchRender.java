package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface ITouchRender {
    void forceAbortTouch();

    boolean onTouchEvent(MotionEvent event);
}