package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.manager.PieManager;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.UIUtil;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatedPieView extends View implements IPieView {
    protected final String TAG;
    private AnimatedPieViewConfig mConfig;
    private PieChartRender mPieChartRender;
    private PieManager mPieManager;

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView
    public View getPieView() {
        return this;
    }

    public AnimatedPieView(Context context) {
        this(context, null);
    }

    public AnimatedPieView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimatedPieView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.TAG = getClass().getSimpleName();
        initView(context, attrs);
    }

    public AnimatedPieView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.TAG = getClass().getSimpleName();
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        setLayerType(1, null);
        this.mPieManager = new PieManager(this);
        this.mPieChartRender = new PieChartRender(this);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getSize(UIUtil.dip2px(getContext(), 300.0f), widthMeasureSpec), getSize(UIUtil.dip2px(getContext(), 300.0f), heightMeasureSpec));
    }

    private int getSize(int defaultSize, int measureSpec) {
        return View.MeasureSpec.getMode(measureSpec) != 1073741824 ? defaultSize : View.MeasureSpec.getSize(measureSpec);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.mPieChartRender.draw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mPieManager.setChartContentRect(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public AnimatedPieView applyConfig(AnimatedPieViewConfig config) {
        this.mConfig = config;
        return this;
    }

    public void start() {
        start(this.mConfig);
    }

    public void start(AnimatedPieViewConfig config) {
        applyConfig(config);
        if (this.mConfig == null) {
            throw new NullPointerException("config must not be null");
        }
        this.mPieChartRender.prepare();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return this.mPieChartRender.onTouchEvent(event) || super.onTouchEvent(event);
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView
    public PieManager getManager() {
        return this.mPieManager;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView
    public Context getViewContext() {
        return getContext();
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView
    public AnimatedPieViewConfig getConfig() {
        return this.mConfig;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView
    public void onCallInvalidate() {
        if (isMainThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}