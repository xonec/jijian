package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.manager;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.PLog;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class PieManager {
    private IPieView pieView;
    private Paint textMeasurePaint;
    private List<BaseRender> mRenders = new ArrayList();
    private RectF drawBounds = new RectF();
    private Rect textBounds = new Rect();

    public PieManager(IPieView pieView) {
        this.pieView = pieView;
        TextPaint textPaint = new TextPaint();
        this.textMeasurePaint = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
    }

    public void setChartContentRect(int width, int height, int paddingLeft, int paddingTop, int paddingRight, int paddingBottom) {
        PLog.i(String.format(Locale.getDefault(), "size change : { \n width = %s;\n height = %s;\n paddingLeft = %s;\n padding top = %s;\n paddingRight = %s;\n paddingBottom = %s;\n}", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(paddingLeft), Integer.valueOf(paddingTop), Integer.valueOf(paddingRight), Integer.valueOf(paddingBottom)));
        this.drawBounds.set(paddingLeft, paddingTop, width - paddingRight, height - paddingBottom);
        Iterator<BaseRender> it = this.mRenders.iterator();
        while (it.hasNext()) {
            it.next().onSizeChanged(width, height, paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public float getDrawWidth() {
        return this.drawBounds.width();
    }

    public float getDrawHeight() {
        return this.drawBounds.height();
    }

    public RectF getDrawBounds() {
        return this.drawBounds;
    }

    public Rect measureTextBounds(String text, int textSize) {
        if (TextUtils.isEmpty(text)) {
            this.textBounds.setEmpty();
            return this.textBounds;
        }
        this.textMeasurePaint.setTextSize(textSize);
        this.textMeasurePaint.getTextBounds(text, 0, text.length(), this.textBounds);
        return this.textBounds;
    }

    public Rect measureTextBounds(String text, Paint paint) {
        if (TextUtils.isEmpty(text) || paint == null) {
            this.textBounds.setEmpty();
            return this.textBounds;
        }
        paint.getTextBounds(text, 0, text.length(), this.textBounds);
        return this.textBounds;
    }

    public void registerRender(BaseRender render) {
        if (render == null || this.mRenders.contains(render)) {
            return;
        }
        this.mRenders.add(render);
    }

    public void unRegisterRender(BaseRender render) {
        if (Util.isListEmpty(this.mRenders) || !this.mRenders.contains(render)) {
            return;
        }
        this.mRenders.remove(render);
    }
}