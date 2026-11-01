package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePieLegendsView<T extends IPieInfo> extends FrameLayout {
    public abstract void onPieDrawFinish(T pie);

    public abstract void onPieDrawStart(T pie);

    public abstract void onPieDrawing(T pie, float progress);

    public void onPieFloatDown(T pie, float timeSet) {
    }

    public void onPieFloatUp(T pie, float timeSet) {
    }

    public BasePieLegendsView(Context context) {
        super(context);
    }

    public BasePieLegendsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BasePieLegendsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setContentView(View customContentView) {
        if (getChildCount() <= 0) {
            addView(customContentView);
        } else {
            removeAllViewsInLayout();
            addView(customContentView);
        }
    }

    public void setContentView(int layoutId) {
        setContentView(View.inflate(getContext(), layoutId, null));
    }
}