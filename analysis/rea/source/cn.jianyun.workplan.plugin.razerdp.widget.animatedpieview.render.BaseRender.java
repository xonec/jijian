package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render;

import android.graphics.Canvas;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.manager.PieManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRender {
    protected String TAG = getClass().getSimpleName();
    private volatile boolean isPrepared;
    IPieView mIPieView;
    PieManager mPieManager;

    public interface OnPrepareFinishListener {
        boolean onPrepareFin();
    }

    public abstract void onDestroy();

    public abstract void onDraw(Canvas canvas);

    public abstract boolean onPrepare();

    public abstract void onSizeChanged(int width, int height, int paddingLeft, int paddingTop, int paddingRight, int paddingBottom);

    public abstract void reset();

    public BaseRender(IPieView iPieView) {
        this.mIPieView = iPieView;
        PieManager manager = iPieView.getManager();
        this.mPieManager = manager;
        manager.registerRender(this);
    }

    public void draw(Canvas canvas) {
        if (this.isPrepared) {
            onDraw(canvas);
        }
    }

    public final void prepare() {
        prepare(null);
    }

    public final void prepare(final OnPrepareFinishListener l) {
        this.isPrepared = false;
        reset();
        this.mIPieView.getPieView().post(new Runnable() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender.1
            @Override // java.lang.Runnable
            public void run() {
                BaseRender baseRender = BaseRender.this;
                baseRender.isPrepared = baseRender.onPrepare();
                if (BaseRender.this.isPrepared) {
                    BaseRender.this.handlePrepareFinish(l);
                }
            }
        });
    }

    public void destroy() {
        onDestroy();
        this.mPieManager.unRegisterRender(this);
    }

    public void callInvalidate() {
        this.mIPieView.onCallInvalidate();
    }

    protected void handlePrepareFinish(OnPrepareFinishListener l) {
        if (l == null || !l.onPrepareFin()) {
            callInvalidate();
        }
    }
}