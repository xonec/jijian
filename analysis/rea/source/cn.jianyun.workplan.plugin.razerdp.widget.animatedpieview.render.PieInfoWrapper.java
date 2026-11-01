package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.PieOption;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.SimplePieInfo;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.DegreeUtil;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.PLog;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class PieInfoWrapper implements Serializable {
    private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);
    private static final long serialVersionUID = -8551831728967624659L;
    private boolean autoDesc;
    private volatile boolean checkPrePieCached;
    private String desc;
    private float fromAngle;
    private volatile boolean hasCached;
    private Bitmap icon;
    private final String id;
    private Paint mAlphaDrawPaint;
    private Paint mDrawPaint;
    private Paint mIconPaint;
    private Path mLinePath;
    private Path mLinePathMeasure;
    private final IPieInfo mPieInfo;
    private Paint mTexPaint;
    RectF mTextArea;
    private PieInfoWrapper nextWrapper;
    private PieInfoWrapper preWrapper;
    private float sweepAngle;
    private float toAngle;

    PieInfoWrapper(IPieInfo pieInfo) {
        if (pieInfo == null) {
            throw new NullPointerException("pieinfo must not be null");
        }
        this.id = generateId();
        this.mPieInfo = pieInfo;
    }

    String getId() {
        return this.id;
    }

    PieInfoWrapper prepare(AnimatedPieViewConfig config) {
        this.hasCached = false;
        if (this.mDrawPaint == null) {
            this.mDrawPaint = new Paint(5);
        }
        if (this.mAlphaDrawPaint == null) {
            this.mAlphaDrawPaint = new Paint(5);
        }
        if (this.mTexPaint == null) {
            this.mTexPaint = new Paint(5);
        }
        if (this.mIconPaint == null) {
            Paint paint = new Paint(5);
            this.mIconPaint = paint;
            paint.setFilterBitmap(true);
        }
        if (this.mLinePath == null) {
            this.mLinePath = new Path();
        }
        if (this.mLinePathMeasure == null) {
            this.mLinePathMeasure = new Path();
        }
        this.mDrawPaint.setStyle(config.isStrokeMode() ? Paint.Style.STROKE : Paint.Style.FILL);
        this.mDrawPaint.setStrokeWidth(config.getStrokeWidth());
        this.mDrawPaint.setColor(this.mPieInfo.getColor());
        if (config.getTypeFace() != null) {
            this.mDrawPaint.setTypeface(config.getTypeFace());
        }
        this.mAlphaDrawPaint.set(this.mDrawPaint);
        this.mTexPaint.setStyle(Paint.Style.FILL);
        this.mTexPaint.setTextSize(config.getTextSize());
        this.mLinePath.reset();
        return this;
    }

    public IPieInfo getPieInfo() {
        return this.mPieInfo;
    }

    public Paint getIconPaint() {
        return this.mIconPaint;
    }

    public Paint getDrawPaint() {
        return this.mDrawPaint;
    }

    public Paint getAlphaDrawPaint() {
        this.mAlphaDrawPaint.set(this.mDrawPaint);
        return this.mAlphaDrawPaint;
    }

    public Path getLinePath() {
        this.mLinePath.rewind();
        return this.mLinePath;
    }

    public Path getLinePathMeasure() {
        this.mLinePathMeasure.rewind();
        return this.mLinePathMeasure;
    }

    public float getFromAngle() {
        return this.fromAngle;
    }

    public float getMiddleAngle() {
        return this.fromAngle + (this.sweepAngle / 2.0f);
    }

    public float getToAngle() {
        return this.toAngle;
    }

    public float getSweepAngle() {
        return this.sweepAngle;
    }

    public boolean isAutoDesc() {
        return this.autoDesc;
    }

    public void setAutoDesc(boolean autoDesc) {
        this.autoDesc = autoDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public PieOption getPieOption() {
        return this.mPieInfo.getPieOption();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    public Bitmap getIcon(int textWidth, int textHeight) {
        Matrix matrix;
        float iconWidth;
        Matrix matrix2;
        Bitmap bitmap = this.icon;
        if (bitmap != null) {
            return bitmap;
        }
        PieOption pieOption = this.mPieInfo.getPieOption();
        if (pieOption == null || pieOption.getLabelIcon() == null || pieOption.getLabelIcon().isRecycled()) {
            return null;
        }
        boolean z = pieOption.getIconWidth() > 0.0f || pieOption.getIconHeight() > 0.0f || pieOption.getIconScaledWidth() > 0.0f || pieOption.getIconScaledHeight() > 0.0f || TextUtils.isEmpty(this.desc);
        Bitmap labelIcon = pieOption.getLabelIcon();
        int width = labelIcon.getWidth();
        int height = labelIcon.getHeight();
        float iconHeight = 1.0f;
        if (z) {
            if (pieOption.getIconWidth() > 0.0f || pieOption.getIconHeight() > 0.0f) {
                matrix = new Matrix();
                iconHeight = (pieOption.getIconWidth() <= 0.0f ? pieOption.getIconHeight() : pieOption.getIconWidth()) / width;
                iconWidth = (pieOption.getIconHeight() <= 0.0f ? pieOption.getIconWidth() : pieOption.getIconHeight()) / height;
            } else {
                if (pieOption.getIconScaledWidth() > 0.0f || pieOption.getIconScaledHeight() > 0.0f) {
                    matrix = new Matrix();
                    iconHeight = pieOption.getIconScaledWidth() <= 0.0f ? pieOption.getIconScaledHeight() : pieOption.getIconScaledWidth();
                    iconWidth = pieOption.getIconScaledHeight() <= 0.0f ? pieOption.getIconScaledWidth() : pieOption.getIconScaledHeight();
                } else {
                    matrix2 = null;
                    iconWidth = 1.0f;
                }
                if (matrix2 != null) {
                    matrix2.postScale(iconHeight, iconWidth);
                    this.icon = Bitmap.createBitmap(labelIcon, 0, 0, width, height, matrix2, true);
                } else {
                    this.icon = labelIcon;
                }
            }
            matrix2 = matrix;
            if (matrix2 != null) {
                matrix2.postScale(iconHeight, iconWidth);
                this.icon = Bitmap.createBitmap(labelIcon, 0, 0, width, height, matrix2, true);
            } else {
                this.icon = labelIcon;
            }
        } else if (width > textWidth || height > textHeight) {
            Matrix matrix3 = new Matrix();
            float fMin = Math.min(width > textWidth ? textWidth / width : 1.0f, height > textHeight ? textHeight / height : 1.0f);
            matrix3.postScale(fMin, fMin);
            this.icon = Bitmap.createBitmap(labelIcon, 0, 0, width, height, matrix3, true);
        }
        return this.icon;
    }

    public float calculateDegree(float lastPieDegree, double sum, AnimatedPieViewConfig config) {
        this.fromAngle = lastPieDegree;
        float fAbs = (float) ((Math.abs(this.mPieInfo.getValue()) / sum) * 360.0d);
        this.sweepAngle = fAbs;
        this.toAngle = this.fromAngle + fAbs;
        if (this.autoDesc) {
            String str = String.format(config.getAutoDescStringFormat(), AnimatedPieViewConfig.sFormateRate.format((this.mPieInfo.getValue() / sum) * 100.0d));
            this.desc = str;
            IPieInfo iPieInfo = this.mPieInfo;
            if (iPieInfo instanceof SimplePieInfo) {
                ((SimplePieInfo) iPieInfo).setDesc(str);
            }
        } else {
            this.desc = this.mPieInfo.getDesc();
        }
        PLog.d("【calculate】 { \nid = " + this.id + "\nfromAngle = " + this.fromAngle + "\nsweepAngle = " + this.sweepAngle + "\ntoAngle = " + this.toAngle + "\n desc = " + this.desc + "\n  }");
        return this.toAngle;
    }

    public boolean isCached() {
        return this.hasCached;
    }

    public void setCached(boolean hasCached) {
        this.hasCached = hasCached;
    }

    public boolean isCheckPrePieCached() {
        return this.checkPrePieCached;
    }

    public PieInfoWrapper setCheckPrePieCached(boolean checkPrePieCached) {
        this.checkPrePieCached = checkPrePieCached;
        return this;
    }

    public PieInfoWrapper getPreWrapper() {
        return this.preWrapper;
    }

    public void setPreWrapper(PieInfoWrapper preWrapper) {
        this.preWrapper = preWrapper;
    }

    public PieInfoWrapper getNextWrapper() {
        return this.nextWrapper;
    }

    public void setNextWrapper(PieInfoWrapper nextWrapper) {
        this.nextWrapper = nextWrapper;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PieInfoWrapper) {
            return obj == this || TextUtils.equals(((PieInfoWrapper) obj).getId(), this.id);
        }
        return false;
    }

    private String generateId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = sNextGeneratedId;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return Integer.toString(i);
    }

    boolean contains(float angle) {
        return angle >= this.fromAngle && angle <= this.toAngle;
    }

    boolean containsLabelTouch(float x, float y) {
        StringBuilder sbAppend = new StringBuilder("x = ").append(x).append(" y = ").append(y).append("   rect = ");
        RectF rectF = this.mTextArea;
        PLog.i(sbAppend.append(rectF == null ? "null" : rectF.toString()).toString());
        RectF rectF2 = this.mTextArea;
        return (rectF2 == null || rectF2.isEmpty() || !this.mTextArea.contains(x, y)) ? false : true;
    }

    boolean containsTouch(float angle) {
        PLog.i("containsTouch from = " + this.fromAngle + " to = " + this.toAngle + " angle = " + angle);
        float fLimitDegreeInTo360 = DegreeUtil.limitDegreeInTo360(angle);
        float fLimitDegreeInTo361 = DegreeUtil.limitDegreeInTo360(this.fromAngle);
        float fLimitDegreeInTo362 = DegreeUtil.limitDegreeInTo360(this.toAngle);
        PLog.d("containsTouch  >>  tStart： " + fLimitDegreeInTo361 + "   tEnd： " + fLimitDegreeInTo362 + "   tAngle： " + fLimitDegreeInTo360);
        boolean z = true;
        if (fLimitDegreeInTo362 >= fLimitDegreeInTo361 ? fLimitDegreeInTo360 < fLimitDegreeInTo361 || fLimitDegreeInTo360 > fLimitDegreeInTo362 : fLimitDegreeInTo360 <= 180.0f ? 360.0f + fLimitDegreeInTo360 < fLimitDegreeInTo361 || fLimitDegreeInTo360 > fLimitDegreeInTo362 : fLimitDegreeInTo360 > fLimitDegreeInTo362 && (fLimitDegreeInTo360 < fLimitDegreeInTo361 || 360.0f - fLimitDegreeInTo360 > this.sweepAngle)) {
            z = false;
        }
        if (z) {
            PLog.i("find touch point  >>  " + toString());
        }
        return z;
    }

    public String toString() {
        return "{ \nid = " + this.id + "\nvalue =  " + getPieInfo().getValue() + "\nfromAngle = " + this.fromAngle + "\ntoAngle = " + this.toAngle + "\n  }";
    }
}