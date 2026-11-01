package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.BasePieLegendsView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.DefaultPieLegendsView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.IPieView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.callback.OnPieLegendBindListener;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.PieOption;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.AnimationCallbackUtils;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.PLog;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PieChartRender extends BaseRender implements ITouchRender {
    private float animAngle;
    private volatile boolean animHasStart;
    private volatile boolean hasRenderDefaultSelected;
    private volatile boolean isInAnimating;
    private List<PieInfoWrapper> mCachedDrawWrappers;
    private AnimatedPieViewConfig mConfig;
    private List<PieInfoWrapper> mDataWrappers;
    private DrawMode mDrawMode;
    private PieInfoWrapper mDrawingPie;
    private LegendsHelper mLegendsHelper;
    private PathMeasure mPathMeasure;
    private RenderAnimation mRenderAnimation;
    private TouchHelper mTouchHelper;
    private int maxDescTextLength;
    private RectF pieBounds;
    private float pieRadius;

    enum DrawMode {
        DRAW,
        TOUCH
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.ITouchRender
    public void forceAbortTouch() {
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender
    public void onDestroy() {
    }

    enum LineDirection {
        TOP_RIGHT(1, 0),
        BOTTOM_RIGHT(1, 1),
        TOP_LEFT(0, 0),
        BOTTOM_LEFT(0, 1),
        CENTER_RIGHT(1, -1),
        CENTER_LEFT(0, -1);

        int xDirection;
        int yDirection;

        LineDirection(int xDirection, int yDirection) {
            this.xDirection = xDirection;
            this.yDirection = yDirection;
        }
    }

    public PieChartRender(IPieView iPieView) {
        super(iPieView);
        this.mDrawMode = DrawMode.DRAW;
        this.mDataWrappers = new ArrayList();
        this.mCachedDrawWrappers = new ArrayList();
        this.mPathMeasure = new PathMeasure();
        this.pieBounds = new RectF();
        this.mTouchHelper = new TouchHelper(this);
        this.mLegendsHelper = new LegendsHelper();
        this.pieRadius = 0.0f;
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender
    public void reset() {
        this.mTouchHelper.reset();
        this.mLegendsHelper.reset();
        this.pieBounds.setEmpty();
        this.animHasStart = false;
        this.isInAnimating = false;
        this.pieRadius = 0.0f;
        this.hasRenderDefaultSelected = false;
        List<PieInfoWrapper> arrayList = this.mDataWrappers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mDataWrappers = arrayList;
        arrayList.clear();
        List<PieInfoWrapper> arrayList2 = this.mCachedDrawWrappers;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        this.mCachedDrawWrappers = arrayList2;
        arrayList2.clear();
        this.mDrawingPie = null;
        this.mRenderAnimation = null;
        this.mIPieView.getPieView().clearAnimation();
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender
    public boolean onPrepare() {
        int labelPadding;
        int width;
        AnimatedPieViewConfig config = this.mIPieView.getConfig();
        this.mConfig = config;
        if (config == null) {
            Log.e(this.TAG, "onPrepare: config is null,abort draw because of preparing failed");
            return false;
        }
        setDrawMode(DrawMode.DRAW);
        this.mTouchHelper.prepare();
        prepareAnim();
        double dAbs = 0.0d;
        PieInfoWrapper pieInfoWrapper = null;
        for (Pair<IPieInfo, Boolean> pair : this.mConfig.getDatas()) {
            dAbs += Math.abs(((IPieInfo) pair.first).getValue());
            PieInfoWrapper pieInfoWrapper2 = new PieInfoWrapper((IPieInfo) pair.first);
            pieInfoWrapper2.setAutoDesc(((Boolean) pair.second).booleanValue());
            if (pieInfoWrapper != null) {
                pieInfoWrapper.setNextWrapper(pieInfoWrapper2);
                pieInfoWrapper2.setPreWrapper(pieInfoWrapper);
            }
            this.mDataWrappers.add(pieInfoWrapper2);
            pieInfoWrapper = pieInfoWrapper2;
        }
        boolean z = this.mConfig.getLegendsParent() != null;
        float startAngle = this.mConfig.getStartAngle();
        int i = 0;
        for (PieInfoWrapper pieInfoWrapper3 : this.mDataWrappers) {
            pieInfoWrapper3.prepare(this.mConfig);
            startAngle = pieInfoWrapper3.calculateDegree(startAngle, dAbs, this.mConfig);
            int iWidth = this.mPieManager.measureTextBounds(pieInfoWrapper3.getDesc(), (int) this.mConfig.getTextSize()).width();
            Bitmap icon = pieInfoWrapper3.getIcon(iWidth, this.mPieManager.measureTextBounds(pieInfoWrapper3.getDesc(), (int) this.mConfig.getTextSize()).height());
            if (icon != null) {
                labelPadding = pieInfoWrapper3.getPieOption() != null ? pieInfoWrapper3.getPieOption().getLabelPadding() : 0;
                width = icon.getWidth();
                icon.getHeight();
            } else {
                labelPadding = 0;
                width = 0;
            }
            this.maxDescTextLength = Math.max(this.maxDescTextLength, iWidth + width + (labelPadding * 2));
            PLog.i("desc >> " + pieInfoWrapper3.getDesc() + "  maxDesTextSize >> " + this.maxDescTextLength);
            if (z) {
                this.mLegendsHelper.put(pieInfoWrapper3.getId(), getLegendsView(this.mConfig, i, pieInfoWrapper3.getPieInfo()));
            }
            i++;
        }
        if (z) {
            this.mLegendsHelper.prepare();
        }
        return true;
    }

    private BasePieLegendsView getLegendsView(AnimatedPieViewConfig config, int position, IPieInfo pieInfo) {
        OnPieLegendBindListener pieLegendListener = config.getPieLegendListener();
        BasePieLegendsView basePieLegendsViewOnCreateLegendView = pieLegendListener != null ? pieLegendListener.onCreateLegendView(position, pieInfo) : null;
        return basePieLegendsViewOnCreateLegendView == null ? DefaultPieLegendsView.newInstance(this.mIPieView.getViewContext()) : basePieLegendsViewOnCreateLegendView;
    }

    private void prepareAnim() {
        if (this.mConfig.isAnimatePie()) {
            RenderAnimation renderAnimation = new RenderAnimation();
            this.mRenderAnimation = renderAnimation;
            renderAnimation.setInterpolator(this.mConfig.getAnimationInterpolator());
            this.mRenderAnimation.setDuration(this.mConfig.getDuration());
            this.mRenderAnimation.setAnimationListener(new AnimationCallbackUtils.SimpleAnimationListener() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.1
                @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.AnimationCallbackUtils.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    super.onAnimationStart(animation);
                    PieChartRender.this.isInAnimating = true;
                }

                @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.AnimationCallbackUtils.SimpleAnimationListener, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    PieChartRender.this.isInAnimating = false;
                    PieChartRender.this.onDrawFinish();
                }
            });
        }
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender
    public void onSizeChanged(int width, int height, int paddingLeft, int paddingTop, int paddingRight, int paddingBottom) {
        TouchHelper touchHelper = this.mTouchHelper;
        if (touchHelper != null) {
            touchHelper.setCenter();
        }
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.BaseRender
    public void onDraw(Canvas canvas) {
        float drawWidth = this.mPieManager.getDrawWidth();
        float drawHeight = this.mPieManager.getDrawHeight();
        canvas.translate(drawWidth / 2.0f, drawHeight / 2.0f);
        measurePieRadius(drawWidth, drawHeight);
        int i = AnonymousClass2.$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode[this.mDrawMode.ordinal()];
        if (i == 1) {
            renderDraw(canvas);
        } else {
            if (i != 2) {
                return;
            }
            renderTouch(canvas);
        }
    }

    private void renderDraw(Canvas canvas) {
        if (this.mConfig.isAnimatePie()) {
            if (this.mRenderAnimation != null && !this.isInAnimating && !this.animHasStart) {
                this.animHasStart = true;
                this.mIPieView.getPieView().startAnimation(this.mRenderAnimation);
                return;
            } else {
                renderAnimDraw(canvas);
                return;
            }
        }
        renderNormalDraw(canvas);
    }

    private void renderTouch(Canvas canvas) {
        drawCachedPie(canvas, this.mTouchHelper.sameClick ? this.mTouchHelper.lastFloatWrapper : this.mTouchHelper.floatingWrapper);
        renderTouchDraw(canvas, this.mTouchHelper.lastFloatWrapper, this.mTouchHelper.floatDownTime);
        this.mLegendsHelper.onPieFloatDown(this.mTouchHelper.lastFloatWrapper, this.mTouchHelper.floatDownTime);
        renderTouchDraw(canvas, this.mTouchHelper.floatingWrapper, this.mTouchHelper.floatUpTime);
        this.mLegendsHelper.onPieFloatUp(this.mTouchHelper.floatingWrapper, this.mTouchHelper.floatUpTime);
    }

    private void renderNormalDraw(Canvas canvas) {
        if (Util.isListEmpty(this.mCachedDrawWrappers) || this.mCachedDrawWrappers.size() != this.mDataWrappers.size()) {
            this.mCachedDrawWrappers.clear();
            this.mCachedDrawWrappers.addAll(this.mDataWrappers);
        }
        drawCachedPie(canvas, null);
        Iterator<PieInfoWrapper> it = this.mCachedDrawWrappers.iterator();
        while (it.hasNext()) {
            this.mLegendsHelper.onPieDrawFinish(it.next());
        }
        onDrawFinish();
    }

    private void renderAnimDraw(Canvas canvas) {
        PieInfoWrapper pieInfoWrapper = this.mDrawingPie;
        if (pieInfoWrapper != null) {
            drawCachedPie(canvas, pieInfoWrapper);
            canvas.drawArc(this.pieBounds, this.mDrawingPie.getFromAngle(), (this.animAngle - this.mDrawingPie.getFromAngle()) - this.mConfig.getSplitAngle(), !this.mConfig.isStrokeMode(), this.mDrawingPie.getDrawPaint());
            if (this.animAngle >= this.mDrawingPie.getMiddleAngle() && this.animAngle <= this.mDrawingPie.getToAngle()) {
                drawText(canvas, this.mDrawingPie);
            }
            LegendsHelper legendsHelper = this.mLegendsHelper;
            PieInfoWrapper pieInfoWrapper2 = this.mDrawingPie;
            legendsHelper.onPieDrawing(pieInfoWrapper2, angleToProgress(this.animAngle, pieInfoWrapper2));
        }
    }

    private void renderTouchDraw(Canvas canvas, PieInfoWrapper wrapper, float timeSet) {
        if (wrapper == null) {
            return;
        }
        this.mTouchHelper.setTouchBounds(timeSet);
        Paint paintPrepareTouchPaint = this.mTouchHelper.prepareTouchPaint(wrapper);
        paintPrepareTouchPaint.setShadowLayer(this.mConfig.getFloatShadowRadius() * timeSet, 0.0f, 0.0f, paintPrepareTouchPaint.getColor());
        paintPrepareTouchPaint.setStrokeWidth(this.mConfig.getStrokeWidth() + (this.mConfig.getFloatExpandSize() * timeSet));
        applyAlphaToPaint(wrapper, paintPrepareTouchPaint);
        canvas.drawArc(this.mTouchHelper.touchBounds, wrapper.getFromAngle() - (this.mConfig.getFloatExpandAngle() * timeSet), (wrapper.getSweepAngle() + ((this.mConfig.getFloatExpandAngle() * 2.0f) * timeSet)) - this.mConfig.getSplitAngle(), !this.mConfig.isStrokeMode(), paintPrepareTouchPaint);
    }

    private void drawCachedPie(Canvas canvas, PieInfoWrapper excluded) {
        if (Util.isListEmpty(this.mCachedDrawWrappers)) {
            return;
        }
        for (PieInfoWrapper pieInfoWrapper : this.mCachedDrawWrappers) {
            drawText(canvas, pieInfoWrapper);
            Paint alphaDrawPaint = pieInfoWrapper.getAlphaDrawPaint();
            applyAlphaToPaint(pieInfoWrapper, alphaDrawPaint);
            if (!pieInfoWrapper.equals(excluded)) {
                canvas.drawArc(this.pieBounds, pieInfoWrapper.getFromAngle(), pieInfoWrapper.getSweepAngle() - this.mConfig.getSplitAngle(), !this.mConfig.isStrokeMode(), alphaDrawPaint);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x027a  */
    private void drawText(Canvas canvas, PieInfoWrapper wrapper) {
        int iMax;
        int i;
        float fAbsMathCos;
        float fAbsMathCos2;
        float fAbsMathCos3;
        float f2;
        float f3;
        float f4;
        float f5;
        int height;
        if (wrapper == null) {
            return;
        }
        if (!this.mConfig.isDrawText()) {
            if (wrapper.mTextArea == null || wrapper.mTextArea.isEmpty()) {
                return;
            }
            wrapper.mTextArea.setEmpty();
            return;
        }
        String desc = wrapper.getDesc();
        if ("".equals(desc)) {
            return;
        }
        PieOption pieOption = wrapper.getPieOption();
        if (wrapper.mTextArea == null) {
            wrapper.mTextArea = new RectF();
        }
        float fixTextPos = (wrapper.equals(this.mTouchHelper.floatingWrapper) ? getFixTextPos(wrapper) : 0.0f) + (wrapper.equals(this.mTouchHelper.lastFloatWrapper) ? getFixTextPos(wrapper) : 0.0f);
        double guideLineMarginStart = this.pieRadius + fixTextPos + this.mConfig.getGuideLineMarginStart() + (this.mConfig.isStrokeMode() ? this.mConfig.getStrokeWidth() / 2 : 0);
        float fCos = (float) (Math.cos(Math.toRadians(wrapper.getMiddleAngle())) * guideLineMarginStart);
        float fSin = (float) (guideLineMarginStart * Math.sin(Math.toRadians(wrapper.getMiddleAngle())));
        Paint alphaDrawPaint = wrapper.getAlphaDrawPaint();
        if (angleToProgress(this.animAngle, wrapper) > 0.5d) {
            applyAlphaToPaint(wrapper, alphaDrawPaint);
            alphaDrawPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(fCos, fSin, this.mConfig.getGuidePointRadius(), alphaDrawPaint);
        }
        Rect rectMeasureTextBounds = this.mPieManager.measureTextBounds(desc, (int) this.mConfig.getTextSize());
        int iWidth = rectMeasureTextBounds.width();
        int iHeight = rectMeasureTextBounds.height();
        Bitmap icon = wrapper.getIcon(iWidth, iHeight);
        if (icon != null) {
            int width = icon.getWidth();
            icon.getHeight();
            i = width;
            iMax = Math.max(0, wrapper.getPieOption() == null ? 0 : wrapper.getPieOption().getLabelPadding());
        } else {
            iMax = 0;
            i = 0;
        }
        float textMargin = this.mConfig.getTextMargin() + iWidth + (iMax * 2) + i;
        LineDirection lineDirectionCalculateLineGravity = calculateLineGravity(fCos, fSin);
        float fAbs = Math.abs(fSin / 6.0f);
        switch (AnonymousClass2.$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[lineDirectionCalculateLineGravity.ordinal()]) {
            case 1:
                fAbsMathCos = (fCos - (absMathCos(-45.0d) * fAbs)) - fixTextPos;
                fAbsMathCos2 = (fSin - (fAbs * absMathCos(-45.0d))) - fixTextPos;
                f2 = fAbsMathCos - textMargin;
                fAbsMathCos3 = fAbsMathCos;
                f3 = fAbsMathCos2;
                break;
            case 2:
                fAbsMathCos3 = fCos + (absMathCos(45.0d) * fAbs) + fixTextPos;
                fAbsMathCos2 = (fSin - (fAbs * absMathCos(45.0d))) - fixTextPos;
                f2 = textMargin + fAbsMathCos3;
                f3 = fAbsMathCos2;
                break;
            case 3:
                fAbsMathCos3 = (fCos - fAbs) - fixTextPos;
                f2 = fAbsMathCos3 - textMargin;
                f3 = fSin;
                break;
            case 4:
                fAbsMathCos3 = fCos + fAbs + fixTextPos;
                f2 = textMargin + fAbsMathCos3;
                f3 = fSin;
                break;
            case 5:
                fAbsMathCos = (fCos - (absMathCos(-45.0d) * fAbs)) - fixTextPos;
                fAbsMathCos2 = fSin + (fAbs * absMathCos(-45.0d)) + fixTextPos;
                f2 = fAbsMathCos - textMargin;
                fAbsMathCos3 = fAbsMathCos;
                f3 = fAbsMathCos2;
                break;
            case 6:
                fAbsMathCos3 = fCos + (absMathCos(45.0d) * fAbs) + fixTextPos;
                fAbsMathCos2 = fSin + (fAbs * absMathCos(45.0d)) + fixTextPos;
                f2 = textMargin + fAbsMathCos3;
                f3 = fAbsMathCos2;
                break;
            default:
                fAbsMathCos3 = -1.0f;
                f3 = -1.0f;
                f2 = -1.0f;
                break;
        }
        alphaDrawPaint.setStyle(Paint.Style.STROKE);
        alphaDrawPaint.setStrokeWidth(this.mConfig.getGuideLineWidth());
        alphaDrawPaint.setStrokeJoin(Paint.Join.ROUND);
        Path linePath = wrapper.getLinePath();
        Path linePathMeasure = wrapper.getLinePathMeasure();
        linePath.moveTo(fCos, fSin);
        linePath.lineTo(fAbsMathCos3, f3);
        linePath.lineTo(f2, f3);
        this.mPathMeasure.nextContour();
        this.mPathMeasure.setPath(linePath, false);
        float fAngleToProgress = angleToProgress(this.animAngle, wrapper);
        PathMeasure pathMeasure = this.mPathMeasure;
        int i2 = i;
        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * fAngleToProgress, linePathMeasure, true);
        canvas.drawPath(linePathMeasure, alphaDrawPaint);
        alphaDrawPaint.setStyle(Paint.Style.FILL);
        alphaDrawPaint.setTextSize(this.mConfig.getTextSize());
        alphaDrawPaint.setAlpha((int) (fAngleToProgress * 255.0f));
        float fCalculateTextStartX = calculateTextStartX(fAbsMathCos3, f2, lineDirectionCalculateLineGravity, iWidth);
        float fCalculateTextStartY = calculateTextStartY(f3, f3, lineDirectionCalculateLineGravity, iHeight);
        float f6 = lineDirectionCalculateLineGravity.xDirection == 1 ? fAbsMathCos3 : f2;
        float f7 = fCalculateTextStartY - iHeight;
        float textMargin2 = f7 - this.mConfig.getTextMargin();
        if (lineDirectionCalculateLineGravity.xDirection == 1) {
            fAbsMathCos3 = f2;
        }
        if (icon != null) {
            float fFitTextStartXWithLabel = fitTextStartXWithLabel(fCalculateTextStartX, iWidth, i2, lineDirectionCalculateLineGravity, wrapper.getPieOption());
            float fCalculateLabelX = calculateLabelX(wrapper.getPieOption(), i2, fFitTextStartXWithLabel, lineDirectionCalculateLineGravity, iWidth);
            if (Float.isNaN(fCalculateLabelX) && fCalculateLabelX <= fFitTextStartXWithLabel) {
                f6 = fCalculateLabelX;
            }
            if (iHeight != 0) {
                f5 = f7;
            } else {
                int textGravity = this.mConfig.getTextGravity();
                if (textGravity == 32) {
                    height = icon.getHeight();
                } else if (textGravity != 34) {
                    if (textGravity == 35 && lineDirectionCalculateLineGravity.yDirection == 0) {
                        height = icon.getHeight();
                    } else {
                        f5 = f7;
                    }
                } else {
                    height = icon.getHeight() / 2;
                }
                f5 = fCalculateTextStartY - height;
                textMargin2 = f5;
            }
            if (!Float.isNaN(fCalculateLabelX)) {
                canvas.drawBitmap(icon, fCalculateLabelX, f5, wrapper.getIconPaint());
            }
            f4 = textMargin2;
            fCalculateTextStartX = fFitTextStartXWithLabel;
        } else {
            f4 = textMargin2;
        }
        wrapper.mTextArea.set(f6, f4, fAbsMathCos3, fCalculateTextStartY);
        Typeface typeface = alphaDrawPaint.getTypeface();
        if (pieOption != null && pieOption.getTypeFace() != null) {
            alphaDrawPaint.setTypeface(pieOption.getTypeFace());
        }
        canvas.drawText(desc, fCalculateTextStartX, fCalculateTextStartY, alphaDrawPaint);
        alphaDrawPaint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode;
        static final /* synthetic */ int[] $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection;

        static {
            int[] iArr = new int[LineDirection.values().length];
            $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection = iArr;
            try {
                iArr[LineDirection.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[LineDirection.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[LineDirection.CENTER_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[LineDirection.CENTER_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[LineDirection.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[LineDirection.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[DrawMode.values().length];
            $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode = iArr2;
            try {
                iArr2[DrawMode.DRAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode[DrawMode.TOUCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private float fitTextStartXWithLabel(float textStartX, int textBoundsWidth, int labelWidth, LineDirection direction, PieOption pieOption) {
        if (pieOption == null) {
            return textStartX;
        }
        int labelPadding = pieOption.getLabelPadding();
        if (pieOption.getLabelPosition() != 16) {
            return textStartX;
        }
        return direction.xDirection < 1 ? textStartX - ((labelPadding * 2) + labelWidth) : textStartX + (labelPadding * 2) + labelWidth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 == 16) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return (r6 - r5) - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return (r6 + r8) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1 == 16) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float calculateLabelX(PieOption pieOption, int iconWidth, float textStartX, LineDirection direction, int textWidth) {
        if (pieOption == null) {
            return Float.NaN;
        }
        int labelPosition = pieOption.getLabelPosition();
        int labelPadding = pieOption.getLabelPadding();
        switch (AnonymousClass2.$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[direction.ordinal()]) {
            case 1:
            case 3:
            case 5:
                break;
            case 2:
            case 4:
            case 6:
                break;
            default:
                return Float.NaN;
        }
    }

    private float calculateTextStartX(float guideLineEndX1, float guideLineEndX2, LineDirection direction, int textWidth) {
        int textGravity = this.mConfig.getTextGravity();
        int textMargin = this.mConfig.getTextMargin();
        switch (AnonymousClass2.$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[direction.ordinal()]) {
            case 1:
            case 3:
            case 5:
                return textGravity == 34 ? (guideLineEndX2 - textWidth) - textMargin : (guideLineEndX1 - textWidth) - textMargin;
            case 2:
            case 4:
            case 6:
                return textGravity == 34 ? guideLineEndX2 + textMargin : textMargin + guideLineEndX1;
            default:
                return guideLineEndX1;
        }
    }

    private float calculateTextStartY(float guideLineEndY1, float guideLineEndY2, LineDirection direction, int textHeight) {
        int textGravity = this.mConfig.getTextGravity();
        int textMargin = this.mConfig.getTextMargin();
        switch (AnonymousClass2.$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection[direction.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (textGravity == 32 || textGravity == 35) {
                    return (guideLineEndY1 - textMargin) - (textHeight / 2);
                }
                return textGravity == 33 ? guideLineEndY1 + textMargin + textHeight : guideLineEndY1 + (textHeight / 2);
            case 4:
            case 5:
            case 6:
                if (textGravity == 32) {
                    return (guideLineEndY1 - textMargin) - (textHeight / 2);
                }
                return (textGravity == 33 || textGravity == 35) ? guideLineEndY1 + textMargin + textHeight : guideLineEndY1 + (textHeight / 2);
            default:
                return (guideLineEndY1 - textMargin) - (textHeight / 2);
        }
    }

    private LineDirection calculateLineGravity(float startX, float startY) {
        if (startX > 0.0f) {
            return startY > 0.0f ? LineDirection.BOTTOM_RIGHT : LineDirection.TOP_RIGHT;
        }
        if (startX < 0.0f) {
            return startY > 0.0f ? LineDirection.BOTTOM_LEFT : LineDirection.TOP_LEFT;
        }
        if (startY == 0.0f) {
            return startX > 0.0f ? LineDirection.CENTER_RIGHT : LineDirection.CENTER_LEFT;
        }
        return LineDirection.TOP_RIGHT;
    }

    private float getFixTextPos(PieInfoWrapper wrapper) {
        if (wrapper == null) {
            return 0.0f;
        }
        return (!this.mConfig.isStrokeMode() ? this.mConfig.getFloatExpandSize() : 10.0f) * (wrapper.equals(this.mTouchHelper.floatingWrapper) ? this.mTouchHelper.floatUpTime : this.mTouchHelper.floatDownTime);
    }

    private void applyAlphaToPaint(PieInfoWrapper target, Paint paint) {
        boolean zEquals;
        if (paint == null) {
            return;
        }
        if (this.mDrawMode == DrawMode.DRAW) {
            paint.setAlpha(255);
            return;
        }
        boolean z = false;
        if (this.mTouchHelper.floatingWrapper != null) {
            zEquals = this.mTouchHelper.floatingWrapper.equals(target);
        } else {
            zEquals = this.mTouchHelper.lastFloatWrapper != null ? this.mTouchHelper.lastFloatWrapper.equals(target) : false;
        }
        float focusAlpha = 255 - this.mConfig.getFocusAlpha();
        int focusAlphaType = this.mConfig.getFocusAlphaType();
        if (focusAlphaType == 16) {
            if (zEquals && this.mTouchHelper.floatingWrapper != null) {
                z = true;
            }
            if (zEquals) {
                TouchHelper touchHelper = this.mTouchHelper;
                paint.setAlpha((int) (255.0f - (focusAlpha * (z ? touchHelper.floatUpTime : touchHelper.floatDownTime))));
                return;
            } else {
                paint.setAlpha(255);
                return;
            }
        }
        if (focusAlphaType == 17) {
            if (!zEquals && this.mTouchHelper.floatingWrapper != null) {
                z = true;
            }
            if (zEquals) {
                paint.setAlpha(255);
                return;
            } else {
                TouchHelper touchHelper2 = this.mTouchHelper;
                paint.setAlpha((int) (255.0f - (focusAlpha * (z ? touchHelper2.floatUpTime : touchHelper2.floatDownTime))));
                return;
            }
        }
        paint.setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDrawFinish() {
        PLog.i("drawFinish");
        this.mConfig.onFinish();
        if ((!this.mConfig.isAnimatePie() || (this.animHasStart && !this.isInAnimating)) && !this.hasRenderDefaultSelected) {
            for (PieInfoWrapper pieInfoWrapper : this.mDataWrappers) {
                if (pieInfoWrapper.getPieOption() != null && pieInfoWrapper.getPieOption().isDefaultSelected()) {
                    this.hasRenderDefaultSelected = true;
                    this.mTouchHelper.handleUp(pieInfoWrapper);
                    return;
                }
            }
        }
    }

    @Override // cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.ITouchRender
    public boolean onTouchEvent(MotionEvent event) {
        return this.mTouchHelper.handleTouch(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurPie(PieInfoWrapper infoWrapper, float degree) {
        if (this.mDrawingPie != null) {
            if (degree >= infoWrapper.getFromAngle()) {
                checkAndInsertPrePie(infoWrapper);
            }
            if (degree >= this.mDrawingPie.getToAngle()) {
                PLog.i("setCurPie  deg = " + degree + "  from = " + infoWrapper.getFromAngle() + "  to  = " + infoWrapper.getToAngle());
                if (!this.mDrawingPie.isCached()) {
                    this.mCachedDrawWrappers.add(this.mDrawingPie);
                    this.mDrawingPie.setCached(true);
                }
            }
        }
        this.mDrawingPie = infoWrapper;
        this.animAngle = degree;
        callInvalidate();
    }

    private void checkAndInsertPrePie(PieInfoWrapper infoWrapper) {
        if (infoWrapper == null || infoWrapper.isCheckPrePieCached()) {
            return;
        }
        PieInfoWrapper preWrapper = infoWrapper.getPreWrapper();
        PLog.i("lalalal  " + infoWrapper.getId());
        if (preWrapper == null) {
            infoWrapper.setCheckPrePieCached(true);
            return;
        }
        if (this.mCachedDrawWrappers.lastIndexOf(preWrapper) == -1) {
            this.mCachedDrawWrappers.add(preWrapper);
            preWrapper.setCached(true);
            this.mLegendsHelper.onPieDrawFinish(preWrapper);
        }
        infoWrapper.setCheckPrePieCached(true);
        checkAndInsertPrePie(preWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawMode(DrawMode drawMode) {
        if (drawMode == DrawMode.TOUCH && this.isInAnimating) {
            return;
        }
        this.mDrawMode = drawMode;
    }

    private void measurePieRadius(float width, float height) {
        float guideLineMarginStart;
        float f2 = this.pieRadius;
        if (f2 > 0.0f) {
            this.pieBounds.set(-f2, -f2, f2, f2);
            return;
        }
        float fMin = Math.min(width / 2.0f, height / 2.0f);
        float f3 = fMin / 4.0f;
        if (this.mConfig.isAutoSize()) {
            float strokeWidth = Float.MAX_VALUE;
            while (strokeWidth > fMin) {
                if (strokeWidth == Float.MAX_VALUE) {
                    strokeWidth = (fMin - (this.mConfig.isDrawText() ? this.maxDescTextLength : 0)) - (this.mConfig.isStrokeMode() ? this.mConfig.getStrokeWidth() >> 1 : 0);
                    guideLineMarginStart = this.mConfig.getGuideLineMarginStart();
                } else {
                    guideLineMarginStart = fMin / 10.0f;
                }
                strokeWidth -= guideLineMarginStart;
            }
            this.pieRadius = Math.max(f3, strokeWidth);
        } else if (this.mConfig.getPieRadius() > 0.0f) {
            this.pieRadius = this.mConfig.getPieRadius();
        } else if (this.mConfig.getPieRadiusRatio() > 0.0f) {
            this.pieRadius = (fMin / 2.0f) * this.mConfig.getPieRadiusRatio();
        } else {
            this.pieRadius = f3;
        }
        RectF rectF = this.pieBounds;
        float f4 = this.pieRadius;
        rectF.set(-f4, -f4, f4, f4);
    }

    private float absMathSin(double angdeg) {
        return (float) Math.abs(Math.sin(Math.toRadians(angdeg)));
    }

    private float absMathCos(double angdeg) {
        return (float) Math.abs(Math.cos(Math.toRadians(angdeg)));
    }

    private float angleToProgress(float angle, PieInfoWrapper wrapper) {
        if (wrapper == null || !this.mConfig.isAnimatePie()) {
            return 1.0f;
        }
        if (angle < wrapper.getMiddleAngle()) {
            return 0.0f;
        }
        if (angle >= wrapper.getToAngle()) {
            return 1.0f;
        }
        return (angle - wrapper.getMiddleAngle()) / (wrapper.getToAngle() - wrapper.getMiddleAngle());
    }

    private class RenderAnimation extends Animation {
        private PieInfoWrapper lastFoundWrapper = null;

        public RenderAnimation() {
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            if (PieChartRender.this.mConfig == null) {
                throw new NullPointerException("viewConfig为空");
            }
            PLog.i("interpolatedTime = " + interpolatedTime);
            if (interpolatedTime < 0.0f || interpolatedTime > 1.0f) {
                return;
            }
            float startAngle = (interpolatedTime * 360.0f) + PieChartRender.this.mConfig.getStartAngle();
            PieInfoWrapper pieInfoWrapperFindPieinfoWithAngle = findPieinfoWithAngle(startAngle);
            PieChartRender pieChartRender = PieChartRender.this;
            if (pieInfoWrapperFindPieinfoWithAngle == null) {
                pieInfoWrapperFindPieinfoWithAngle = this.lastFoundWrapper;
            }
            pieChartRender.setCurPie(pieInfoWrapperFindPieinfoWithAngle, startAngle);
        }

        public PieInfoWrapper findPieinfoWithAngle(float angle) {
            if (Util.isListEmpty(PieChartRender.this.mDataWrappers)) {
                return null;
            }
            PieInfoWrapper pieInfoWrapper = this.lastFoundWrapper;
            if (pieInfoWrapper != null && pieInfoWrapper.contains(angle)) {
                return this.lastFoundWrapper;
            }
            for (PieInfoWrapper pieInfoWrapper2 : PieChartRender.this.mDataWrappers) {
                if (pieInfoWrapper2.contains(angle)) {
                    this.lastFoundWrapper = pieInfoWrapper2;
                    PieChartRender.this.mLegendsHelper.onPieDrawStart(this.lastFoundWrapper);
                    return pieInfoWrapper2;
                }
            }
            return null;
        }
    }

    private class TouchHelper {
        private float centerX;
        private float centerY;
        private int expandClickRange;
        private ValueAnimator floatDownAnim;
        private float floatDownTime;
        private ValueAnimator floatUpAnim;
        private float floatUpTime;
        private PieInfoWrapper floatingWrapper;
        private PieInfoWrapper lastFloatWrapper;
        private PieInfoWrapper lastTouchWrapper;
        private Paint mTouchPaint;
        private boolean sameClick;
        private RectF touchBounds;
        private float touchX;
        private float touchY;

        TouchHelper(final PieChartRender this$0) {
            this(25);
        }

        TouchHelper(int expandClickRange) {
            this.touchX = -1.0f;
            this.touchY = -1.0f;
            this.expandClickRange = expandClickRange;
            this.touchBounds = new RectF();
        }

        void reset() {
            this.centerX = 0.0f;
            this.centerY = 0.0f;
            this.touchBounds.setEmpty();
            ValueAnimator valueAnimatorOfFloat = this.floatUpAnim;
            if (valueAnimatorOfFloat == null) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            this.floatUpAnim = valueAnimatorOfFloat;
            valueAnimatorOfFloat.removeAllUpdateListeners();
            this.floatUpTime = 0.0f;
            ValueAnimator valueAnimatorOfFloat2 = this.floatDownAnim;
            if (valueAnimatorOfFloat2 == null) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            this.floatDownAnim = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.removeAllUpdateListeners();
            this.floatUpTime = 0.0f;
            this.floatingWrapper = null;
            this.lastFloatWrapper = null;
            this.lastTouchWrapper = null;
            this.touchX = -1.0f;
            this.touchY = -1.0f;
            this.sameClick = false;
        }

        void prepare() {
            setCenter();
            this.mTouchPaint = new Paint(1);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.floatUpAnim = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(PieChartRender.this.mConfig.getFloatUpDuration());
            this.floatUpAnim.setInterpolator(new DecelerateInterpolator());
            this.floatUpAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.TouchHelper.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator animation) {
                    TouchHelper.this.floatUpTime = ((Float) animation.getAnimatedValue()).floatValue();
                    PieChartRender.this.callInvalidate();
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.floatDownAnim = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.setDuration(PieChartRender.this.mConfig.getFloatDownDuration());
            this.floatDownAnim.setInterpolator(new DecelerateInterpolator());
            this.floatDownAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.TouchHelper.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator animation) {
                    TouchHelper.this.floatDownTime = ((Float) animation.getAnimatedValue()).floatValue();
                    PieChartRender.this.callInvalidate();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCenter() {
            this.centerX = PieChartRender.this.mPieManager.getDrawWidth() / 2.0f;
            this.centerY = PieChartRender.this.mPieManager.getDrawHeight() / 2.0f;
        }

        Paint prepareTouchPaint(PieInfoWrapper wrapper) {
            if (this.mTouchPaint == null) {
                this.mTouchPaint = new Paint(1);
            }
            if (wrapper != null) {
                this.mTouchPaint.set(wrapper.getDrawPaint());
            }
            return this.mTouchPaint;
        }

        PieInfoWrapper pointToPieInfoWrapper(float x, float y) {
            boolean zIsStrokeMode = PieChartRender.this.mConfig.isStrokeMode();
            float strokeWidth = PieChartRender.this.mConfig.getStrokeWidth();
            float f2 = PieChartRender.this.pieRadius;
            if (zIsStrokeMode) {
                f2 += strokeWidth / 2.0f;
            }
            float f3 = zIsStrokeMode ? PieChartRender.this.pieRadius - (strokeWidth / 2.0f) : 0.0f;
            double dPow = Math.pow(x - this.centerX, 2.0d) + Math.pow(y - this.centerY, 2.0d);
            if (!(dPow >= ((double) this.expandClickRange) + Math.pow((double) f3, 2.0d) && dPow <= ((double) this.expandClickRange) + Math.pow((double) f2, 2.0d))) {
                if (PieChartRender.this.mConfig.isDrawText()) {
                    return findLabelTouchWrapper(x - this.centerX, y - this.centerY);
                }
                return null;
            }
            return findWrapper(x, y);
        }

        PieInfoWrapper findLabelTouchWrapper(float x, float y) {
            PieInfoWrapper pieInfoWrapper = this.lastTouchWrapper;
            if (pieInfoWrapper != null && pieInfoWrapper.containsLabelTouch(x, y)) {
                return this.lastTouchWrapper;
            }
            for (PieInfoWrapper pieInfoWrapper2 : PieChartRender.this.mDataWrappers) {
                if (pieInfoWrapper2.containsLabelTouch(x, y)) {
                    this.lastTouchWrapper = pieInfoWrapper2;
                    return pieInfoWrapper2;
                }
            }
            return null;
        }

        PieInfoWrapper findWrapper(float x, float y) {
            double degrees = Math.toDegrees(Math.atan2(y - this.centerY, x - this.centerX));
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            PieInfoWrapper pieInfoWrapper = this.lastTouchWrapper;
            if (pieInfoWrapper != null && pieInfoWrapper.containsTouch((float) degrees)) {
                return this.lastTouchWrapper;
            }
            PLog.i("touch角度 = " + degrees);
            for (PieInfoWrapper pieInfoWrapper2 : PieChartRender.this.mDataWrappers) {
                if (pieInfoWrapper2.containsTouch((float) degrees)) {
                    this.lastTouchWrapper = pieInfoWrapper2;
                    return pieInfoWrapper2;
                }
            }
            return null;
        }

        void setTouchBounds(float timeSet) {
            float floatExpandSize = (!PieChartRender.this.mConfig.isStrokeMode() ? PieChartRender.this.mConfig.getFloatExpandSize() : 0.0f) * timeSet;
            this.touchBounds.set(PieChartRender.this.pieBounds.left - floatExpandSize, PieChartRender.this.pieBounds.top - floatExpandSize, PieChartRender.this.pieBounds.right + floatExpandSize, PieChartRender.this.pieBounds.bottom + floatExpandSize);
        }

        boolean handleTouch(MotionEvent event) {
            PieInfoWrapper pieInfoWrapperPointToPieInfoWrapper;
            if (PieChartRender.this.mConfig == null || !PieChartRender.this.mConfig.isCanTouch() || PieChartRender.this.isInAnimating) {
                return false;
            }
            int action = event.getAction();
            if (action == 0) {
                this.touchX = event.getX();
                this.touchY = event.getY();
                return true;
            }
            if (action != 1 || (pieInfoWrapperPointToPieInfoWrapper = pointToPieInfoWrapper(this.touchX, this.touchY)) == null) {
                return false;
            }
            handleUp(pieInfoWrapperPointToPieInfoWrapper);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleUp(PieInfoWrapper touchWrapper) {
            PieChartRender.this.setDrawMode(DrawMode.TOUCH);
            if (touchWrapper.equals(this.floatingWrapper)) {
                this.lastFloatWrapper = touchWrapper;
                this.floatingWrapper = null;
                this.sameClick = true;
            } else {
                this.lastFloatWrapper = this.floatingWrapper;
                this.floatingWrapper = touchWrapper;
                this.sameClick = false;
            }
            if (PieChartRender.this.mConfig.isAnimTouch()) {
                this.floatUpAnim.start();
                this.floatDownAnim.start();
            } else {
                this.floatUpTime = 1.0f;
                this.floatDownTime = 1.0f;
                PieChartRender.this.callInvalidate();
            }
            if (PieChartRender.this.mConfig.getSelectListener() != null) {
                PieChartRender.this.mConfig.getSelectListener().onSelectPie(touchWrapper.getPieInfo(), touchWrapper.equals(this.floatingWrapper));
            }
        }
    }

    private class LegendsHelper {
        private PieInfoWrapper lastDrawingPieInfo;
        private LinkedHashMap<String, BasePieLegendsView> legendsViewBucket;

        private LegendsHelper() {
        }

        void reset() {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap = this.legendsViewBucket;
            if (linkedHashMap != null) {
                linkedHashMap.clear();
            }
        }

        void put(String id, BasePieLegendsView view) {
            if (this.legendsViewBucket == null) {
                this.legendsViewBucket = new LinkedHashMap<>();
            }
            this.legendsViewBucket.put(id, view);
        }

        void prepare() {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            ViewGroup legendsParent = PieChartRender.this.mConfig.getLegendsParent();
            if (legendsParent != null) {
                legendsParent.removeAllViewsInLayout();
            }
            if (legendsParent == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty()) {
                return;
            }
            for (Map.Entry<String, BasePieLegendsView> entry : this.legendsViewBucket.entrySet()) {
                OnPieLegendBindListener pieLegendListener = PieChartRender.this.mConfig.getPieLegendListener();
                if (!(pieLegendListener != null && pieLegendListener.onAddView(legendsParent, entry.getValue()))) {
                    legendsParent.addView(entry.getValue());
                }
            }
        }

        void onPieDrawStart(PieInfoWrapper infoWrapper) {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            if (infoWrapper == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty()) {
                return;
            }
            PLog.i("legends  >>  " + infoWrapper.getDesc());
            BasePieLegendsView basePieLegendsView = this.legendsViewBucket.get(infoWrapper.getId());
            if (basePieLegendsView != null) {
                basePieLegendsView.onPieDrawStart(infoWrapper.getPieInfo());
            }
        }

        void onPieDrawing(PieInfoWrapper infoWrapper, float progress) {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            BasePieLegendsView basePieLegendsView;
            if (infoWrapper == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty() || (basePieLegendsView = this.legendsViewBucket.get(infoWrapper.getId())) == null) {
                return;
            }
            basePieLegendsView.onPieDrawing(infoWrapper.getPieInfo(), progress);
        }

        void onPieDrawFinish(PieInfoWrapper infoWrapper) {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            BasePieLegendsView basePieLegendsView;
            if (infoWrapper == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty() || (basePieLegendsView = this.legendsViewBucket.get(infoWrapper.getId())) == null) {
                return;
            }
            basePieLegendsView.onPieDrawFinish(infoWrapper.getPieInfo());
        }

        void onPieFloatUp(PieInfoWrapper infoWrapper, float timeSet) {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            BasePieLegendsView basePieLegendsView;
            if (infoWrapper == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty() || (basePieLegendsView = this.legendsViewBucket.get(infoWrapper.getId())) == null) {
                return;
            }
            basePieLegendsView.onPieFloatUp(infoWrapper.getPieInfo(), timeSet);
        }

        void onPieFloatDown(PieInfoWrapper infoWrapper, float timeSet) {
            LinkedHashMap<String, BasePieLegendsView> linkedHashMap;
            BasePieLegendsView basePieLegendsView;
            if (infoWrapper == null || (linkedHashMap = this.legendsViewBucket) == null || linkedHashMap.isEmpty() || (basePieLegendsView = this.legendsViewBucket.get(infoWrapper.getId())) == null) {
                return;
            }
            basePieLegendsView.onPieFloatDown(infoWrapper.getPieInfo(), timeSet);
        }
    }
}