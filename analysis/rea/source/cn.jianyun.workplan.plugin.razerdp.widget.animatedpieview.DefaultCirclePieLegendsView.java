package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import cn.jianyun.workplan.R;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultCirclePieLegendsView extends BasePieLegendsView {
    private static final float SCALE_MAX = 0.8f;
    private static final float SCALE_RATIO = 0.4f;
    private TextView tvDesc;
    private View viewTag;

    public static DefaultCirclePieLegendsView newInstance(Context context) {
        return new DefaultCirclePieLegendsView(context);
    }

    private DefaultCirclePieLegendsView(Context context) {
        this(context, null);
    }

    private DefaultCirclePieLegendsView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private DefaultCirclePieLegendsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setContentView(R.layout.widget_circle_pie_legends);
        this.viewTag = findViewById(R.id.view_tag);
        this.tvDesc = (TextView) findViewById(R.id.tv_desc);
        reset();
    }

    private void reset() {
        this.viewTag.setScaleX(0.0f);
        this.viewTag.setScaleY(0.0f);
        this.viewTag.setAlpha(0.0f);
        this.tvDesc.setAlpha(0.0f);
        this.tvDesc.setScaleX(0.0f);
        this.tvDesc.setScaleY(0.0f);
        this.viewTag.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.DefaultCirclePieLegendsView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DefaultCirclePieLegendsView.this.viewTag.setPivotX(DefaultCirclePieLegendsView.this.viewTag.getWidth() / 2);
                DefaultCirclePieLegendsView.this.viewTag.setPivotY(DefaultCirclePieLegendsView.this.viewTag.getHeight() / 2);
                DefaultCirclePieLegendsView.this.viewTag.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
        this.tvDesc.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.DefaultCirclePieLegendsView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DefaultCirclePieLegendsView.this.tvDesc.setPivotX(DefaultCirclePieLegendsView.this.tvDesc.getWidth() / 2);
                DefaultCirclePieLegendsView.this.tvDesc.setPivotY(DefaultCirclePieLegendsView.this.tvDesc.getHeight() / 2);
                DefaultCirclePieLegendsView.this.tvDesc.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView
    public void onPieDrawStart(IPieInfo pie) {
        Drawable background = this.viewTag.getBackground();
        if (!(background instanceof ShapeDrawable)) {
            new OvalShape();
            background = new ShapeDrawable(new OvalShape());
        }
        ((ShapeDrawable) background).getPaint().setColor(pie.getColor());
        this.viewTag.setBackground(background);
        this.tvDesc.setText(pie.getDesc());
        reset();
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView
    public void onPieDrawing(IPieInfo pie, float progress) {
        this.viewTag.setAlpha(progress);
        View view = this.viewTag;
        float f2 = SCALE_MAX * progress;
        view.setScaleX(f2);
        this.viewTag.setScaleY(f2);
        this.tvDesc.setAlpha(progress);
        this.tvDesc.setScaleX(f2);
        this.tvDesc.setScaleY(f2);
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView
    public void onPieDrawFinish(IPieInfo pie) {
        this.viewTag.setAlpha(1.0f);
        this.viewTag.setScaleX(SCALE_MAX);
        this.viewTag.setScaleY(SCALE_MAX);
        this.tvDesc.setAlpha(1.0f);
        this.tvDesc.setScaleX(SCALE_MAX);
        this.tvDesc.setScaleY(SCALE_MAX);
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView
    public void onPieFloatUp(IPieInfo pie, float timeSet) {
        View view = this.viewTag;
        float f2 = (timeSet * 0.4f) + SCALE_MAX;
        view.setScaleX(f2);
        this.viewTag.setScaleY(f2);
        this.tvDesc.setScaleX(f2);
        this.tvDesc.setScaleY(f2);
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView
    public void onPieFloatDown(IPieInfo pie, float timeSet) {
        View view = this.viewTag;
        float f2 = (timeSet * 0.4f) + SCALE_MAX;
        view.setScaleX(f2);
        this.viewTag.setScaleY(f2);
        this.tvDesc.setScaleX(f2);
        this.tvDesc.setScaleY(f2);
    }
}