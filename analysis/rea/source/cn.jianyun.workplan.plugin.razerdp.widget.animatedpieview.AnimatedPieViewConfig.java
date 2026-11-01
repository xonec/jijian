package cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.callback.OnPieLegendBindListener;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.callback.OnPieSelectListener;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.IPieInfo;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.utils.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatedPieViewConfig {
    public static final int ABOVE = 32;
    public static final int ALIGN = 34;
    public static final int BELOW = 33;
    private static final long DEFAULT_ANIMATION_DURATION = 3000;
    private static final String DEFAULT_AUTO_DESC_FORMAT = "%1$s%%";
    private static final float DEFAULT_DESC_TEXT_SIZE = 14.0f;
    private static final float DEFAULT_FLOAT_EXPAND_ANGLE = 5.0f;
    private static final float DEFAULT_FLOAT_EXPAND_SIZE = 15.0f;
    private static final int DEFAULT_FOCUS_ALPHA_TYPE = 17;
    private static final int DEFAULT_GUIDE_LINE_WIDTH = 2;
    private static final int DEFAULT_GUIDE_MARGIN_START = 10;
    private static final int DEFAULT_GUIDE_POINT_RADIUS = 4;
    private static final float DEFAULT_SHADOW_BLUR_RADIUS = 18.0f;
    private static final float DEFAULT_SPLIT_ANGLE = 0.0f;
    private static final float DEFAULT_START_DEGREE = -90.0f;
    private static final int DEFAULT_STROKE_WIDTH = 80;
    private static final int DEFAULT_TEXT_GRAVITY = 35;
    private static final int DEFAULT_TEXT_MARGIN = 6;
    private static final long DEFAULT_TOUCH_FLOATDOWN_DURATION = 800;
    private static final long DEFAULT_TOUCH_FLOATUP_DURATION = 500;
    public static final int ECTOPIC = 35;
    public static final int FOCUS_WITHOUT_ALPHA = 18;
    public static final int FOCUS_WITH_ALPHA = 16;
    public static final int FOCUS_WITH_ALPHA_REV = 17;
    private static final String TAG = "AnimatedPieViewConfig";
    private static final long serialVersionUID = -2285434281608092357L;
    private boolean animTouch;
    private boolean animatePie;
    private Interpolator animationInterpolator;
    private String autoDescStringFormat;
    private boolean autoSize;
    private boolean canTouch;
    private boolean cubicGuide;
    private boolean drawText;
    private long duration;
    private long floatDownDuration;
    private float floatExpandAngle;
    private float floatExpandSize;
    private float floatShadowRadius;
    private long floatUpDuration;
    private int focusAlpha;
    private int focusAlphaType;
    private int guideLineMarginStart;
    private int guideLineWidth;
    private int guidePointRadius;
    boolean isRemoved;
    private WeakReference<ViewGroup> legendsGroup;
    private OnPieLegendBindListener<? extends BasePieLegendsView> legendsListener;
    private List<Pair<IPieInfo, Boolean>> mDatas;
    private OnPieSelectListener mSelectListener;
    private Typeface mTypeFace;
    private float pieRadius;
    private float pieRadiusRatio;
    private float splitAngle;
    private float startAngle;
    private boolean strokeMode;
    private int strokeWidth;
    private int textColor;
    private int textGravity;
    private int textMargin;
    private float textSize;
    public static DecimalFormat sFormateRate = new DecimalFormat("0.##");
    private static int DEFAULT_FOCUS_ALPHA = 150;
    private static final Interpolator DEFAULT_ANIMATION_INTERPOLATOR = new LinearInterpolator();

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusAlpha {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextGravity {
    }

    @Deprecated
    public AnimatedPieViewConfig setStrokePaintCap(Paint.Cap paintCap) {
        return this;
    }

    @Deprecated
    public AnimatedPieViewConfig setTextLineTransitionLength(int length) {
        return this;
    }

    public AnimatedPieViewConfig() {
        this(null);
    }

    public AnimatedPieViewConfig(AnimatedPieViewConfig config) {
        this.strokeWidth = 80;
        this.startAngle = DEFAULT_START_DEGREE;
        this.duration = 3000L;
        this.floatUpDuration = DEFAULT_TOUCH_FLOATUP_DURATION;
        this.floatDownDuration = DEFAULT_TOUCH_FLOATDOWN_DURATION;
        this.floatShadowRadius = DEFAULT_SHADOW_BLUR_RADIUS;
        this.floatExpandAngle = DEFAULT_FLOAT_EXPAND_ANGLE;
        this.floatExpandSize = DEFAULT_FLOAT_EXPAND_SIZE;
        this.autoDescStringFormat = DEFAULT_AUTO_DESC_FORMAT;
        this.autoSize = true;
        this.pieRadius = 0.0f;
        this.pieRadiusRatio = 0.0f;
        this.textSize = DEFAULT_DESC_TEXT_SIZE;
        this.textColor = -7829368;
        this.drawText = false;
        this.splitAngle = 0.0f;
        this.animatePie = true;
        this.canTouch = true;
        this.animTouch = true;
        this.focusAlphaType = 17;
        this.focusAlpha = DEFAULT_FOCUS_ALPHA;
        this.textGravity = 35;
        this.guidePointRadius = 4;
        this.guideLineMarginStart = 10;
        this.guideLineWidth = 2;
        this.cubicGuide = false;
        this.textMargin = 6;
        this.animationInterpolator = DEFAULT_ANIMATION_INTERPOLATOR;
        this.strokeMode = true;
        this.mDatas = new ArrayList();
        if (config != null) {
            copyFrom(config);
        }
    }

    public AnimatedPieViewConfig strokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    public AnimatedPieViewConfig startAngle(float startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public AnimatedPieViewConfig duration(long duration) {
        this.duration = Math.max(DEFAULT_TOUCH_FLOATUP_DURATION, duration);
        return this;
    }

    public AnimatedPieViewConfig floatUpDuration(long popupDuration) {
        this.floatUpDuration = popupDuration;
        return this;
    }

    public AnimatedPieViewConfig floatDownDuration(long floatDownDuration) {
        this.floatDownDuration = floatDownDuration;
        return this;
    }

    public AnimatedPieViewConfig floatShadowRadius(float floatShadowRadius) {
        this.floatShadowRadius = floatShadowRadius;
        return this;
    }

    public AnimatedPieViewConfig floatExpandAngle(float floatExpandAngle) {
        this.floatExpandAngle = floatExpandAngle;
        return this;
    }

    public AnimatedPieViewConfig autoDescStringFormat(String autoDescStringFormat) {
        this.autoDescStringFormat = autoDescStringFormat;
        return this;
    }

    public AnimatedPieViewConfig autoSize(boolean autoSize) {
        this.autoSize = autoSize;
        return this;
    }

    public AnimatedPieViewConfig pieRadius(float pieRadius) {
        this.pieRadius = pieRadius;
        return autoSize(pieRadius <= 0.0f);
    }

    public AnimatedPieViewConfig pieRadiusRatio(float pieRadiusRatio) {
        this.pieRadiusRatio = pieRadiusRatio;
        return autoSize(pieRadiusRatio <= 0.0f);
    }

    public AnimatedPieViewConfig textSize(float textSize) {
        this.textSize = textSize;
        return this;
    }

    public AnimatedPieViewConfig textColor(int color) {
        this.textColor = this.textColor;
        return this;
    }

    public AnimatedPieViewConfig drawText(boolean drawText) {
        this.drawText = drawText;
        return this;
    }

    public AnimatedPieViewConfig splitAngle(float splitAngle) {
        this.splitAngle = splitAngle;
        return this;
    }

    public AnimatedPieViewConfig animatePie(boolean animatePie) {
        this.animatePie = animatePie;
        return this;
    }

    public AnimatedPieViewConfig strokeMode(boolean strokeMode) {
        this.strokeMode = strokeMode;
        return this;
    }

    public AnimatedPieViewConfig canTouch(boolean canTouch) {
        this.canTouch = canTouch;
        return this;
    }

    public AnimatedPieViewConfig animOnTouch(boolean animTouch) {
        this.animTouch = animTouch;
        return this;
    }

    public <T extends IPieInfo> AnimatedPieViewConfig selectListener(OnPieSelectListener<T> selectListener) {
        this.mSelectListener = selectListener;
        return this;
    }

    public AnimatedPieViewConfig floatExpandSize(float floatExpandSize) {
        this.floatExpandSize = floatExpandSize;
        return this;
    }

    public AnimatedPieViewConfig focusAlphaType(int focusAlphaType) {
        this.focusAlphaType = focusAlphaType;
        return this;
    }

    public AnimatedPieViewConfig focusAlpha(int focusAlpha) {
        this.focusAlpha = focusAlpha;
        return this;
    }

    public AnimatedPieViewConfig textGravity(int textGravity) {
        this.textGravity = textGravity;
        return this;
    }

    public AnimatedPieViewConfig guidePointRadius(int guidePointRadius) {
        this.guidePointRadius = guidePointRadius;
        return this;
    }

    public AnimatedPieViewConfig guideLineMarginStart(int guideLineMarginStart) {
        this.guideLineMarginStart = guideLineMarginStart;
        return this;
    }

    public AnimatedPieViewConfig cubicGuide(boolean cubicGuide) {
        this.cubicGuide = cubicGuide;
        return cubicGuide ? textGravity(34) : this;
    }

    public AnimatedPieViewConfig guideLineWidth(int guideLineWidth) {
        this.guideLineWidth = guideLineWidth;
        return this;
    }

    public AnimatedPieViewConfig textMargin(int textMargin) {
        this.textMargin = textMargin;
        return this;
    }

    public AnimatedPieViewConfig interpolator(Interpolator interpolator) {
        this.animationInterpolator = interpolator;
        return this;
    }

    public AnimatedPieViewConfig legendsWith(ViewGroup legendsGroup) {
        this.legendsGroup = new WeakReference<>(legendsGroup);
        return this;
    }

    public <V extends BasePieLegendsView> AnimatedPieViewConfig legendsWith(ViewGroup legendsGroup, OnPieLegendBindListener<V> listener) {
        this.legendsGroup = new WeakReference<>(legendsGroup);
        return legendsListener(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <V extends BasePieLegendsView> AnimatedPieViewConfig legendsListener(OnPieLegendBindListener<V> legendsListener) {
        this.legendsListener = legendsListener;
        return this;
    }

    public AnimatedPieViewConfig typeFae(Typeface typeface) {
        this.mTypeFace = typeface;
        return this;
    }

    public AnimatedPieViewConfig copyFrom(AnimatedPieViewConfig config) {
        if (config == null) {
            return this;
        }
        this.mDatas.clear();
        this.mDatas.addAll(config.mDatas);
        return strokeWidth(config.strokeWidth).startAngle(config.startAngle).duration(config.duration).floatUpDuration(config.floatUpDuration).floatDownDuration(config.floatDownDuration).floatShadowRadius(config.floatShadowRadius).floatExpandAngle(config.floatExpandAngle).autoDescStringFormat(config.autoDescStringFormat).autoSize(config.autoSize).pieRadius(config.pieRadius).pieRadiusRatio(config.pieRadiusRatio).textSize(config.textSize).drawText(config.drawText).splitAngle(config.splitAngle).animatePie(config.animatePie).strokeMode(config.strokeMode).canTouch(config.canTouch).animOnTouch(config.animTouch).selectListener(config.mSelectListener).floatExpandSize(config.floatExpandSize).focusAlphaType(config.focusAlphaType).focusAlpha(config.focusAlpha).textGravity(config.textGravity).guidePointRadius(config.guidePointRadius).guideLineMarginStart(config.guideLineMarginStart).cubicGuide(config.cubicGuide).guideLineWidth(config.guideLineWidth).textMargin(config.textMargin).interpolator(config.animationInterpolator).typeFae(config.mTypeFace).legendsWith(config.getLegendsParent()).legendsListener(config.getPieLegendListener());
    }

    public AnimatedPieViewConfig addDatas(List<? extends IPieInfo> infos) {
        Iterator<? extends IPieInfo> it = infos.iterator();
        while (it.hasNext()) {
            addData(it.next());
        }
        return this;
    }

    public AnimatedPieViewConfig addData(IPieInfo info) {
        return addData(info, false);
    }

    public AnimatedPieViewConfig addData(IPieInfo info, boolean autoDesc) {
        if (info == null) {
            Log.e(TAG, "addData: pieinfo is null,abort add data");
            return this;
        }
        this.mDatas.add(Pair.create(info, Boolean.valueOf(autoDesc)));
        return this;
    }

    public AnimatedPieViewConfig removeData(IPieInfo info) {
        if (info == null) {
            return this;
        }
        Iterator<Pair<IPieInfo, Boolean>> it = this.mDatas.iterator();
        while (it.hasNext()) {
            if (it.next().first == info) {
                it.remove();
                this.isRemoved = true;
            }
        }
        return this;
    }

    public List<Pair<IPieInfo, Boolean>> getDatas() {
        return this.mDatas;
    }

    public List<IPieInfo> getRawDatas() {
        ArrayList arrayList = new ArrayList();
        if (!Util.isListEmpty(this.mDatas)) {
            Iterator<Pair<IPieInfo, Boolean>> it = this.mDatas.iterator();
            while (it.hasNext()) {
                arrayList.add((IPieInfo) it.next().first);
            }
        }
        return arrayList;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getFloatUpDuration() {
        return this.floatUpDuration;
    }

    public long getFloatDownDuration() {
        return this.floatDownDuration;
    }

    public float getFloatShadowRadius() {
        return this.floatShadowRadius;
    }

    public float getFloatExpandAngle() {
        return this.floatExpandAngle;
    }

    public String getAutoDescStringFormat() {
        return this.autoDescStringFormat;
    }

    public boolean isAutoSize() {
        return this.autoSize;
    }

    public float getPieRadius() {
        return this.pieRadius;
    }

    public float getPieRadiusRatio() {
        return this.pieRadiusRatio;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public boolean isDrawText() {
        return this.drawText;
    }

    public float getSplitAngle() {
        return this.splitAngle;
    }

    public boolean isAnimatePie() {
        return this.animatePie && !this.isRemoved;
    }

    public boolean isStrokeMode() {
        return this.strokeMode;
    }

    public boolean isCanTouch() {
        return this.canTouch;
    }

    public boolean isAnimTouch() {
        return this.animTouch;
    }

    public OnPieSelectListener getSelectListener() {
        return this.mSelectListener;
    }

    public float getFloatExpandSize() {
        return this.floatExpandSize;
    }

    public int getFocusAlphaType() {
        return this.focusAlphaType;
    }

    public int getFocusAlpha() {
        return this.focusAlpha;
    }

    public int getTextGravity() {
        return this.textGravity;
    }

    public int getGuidePointRadius() {
        return this.guidePointRadius;
    }

    public int getGuideLineMarginStart() {
        return this.guideLineMarginStart;
    }

    public boolean isCubicGuide() {
        return this.cubicGuide;
    }

    public int getGuideLineWidth() {
        return this.guideLineWidth;
    }

    public int getTextMargin() {
        return this.textMargin;
    }

    public Interpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    public ViewGroup getLegendsParent() {
        WeakReference<ViewGroup> weakReference = this.legendsGroup;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public OnPieLegendBindListener getPieLegendListener() {
        return this.legendsListener;
    }

    public Typeface getTypeFace() {
        return this.mTypeFace;
    }

    public void onFinish() {
        if (this.isRemoved) {
            this.isRemoved = false;
        }
    }

    @Deprecated
    public AnimatedPieViewConfig setStrokeWidth(int strokeWidth) {
        return strokeWidth(strokeWidth);
    }

    @Deprecated
    public AnimatedPieViewConfig setStartAngle(float startAngle) {
        return startAngle(startAngle);
    }

    @Deprecated
    public AnimatedPieViewConfig setDuration(long duration) {
        return duration(duration);
    }

    @Deprecated
    public long getTouchScaleUpDuration() {
        return getFloatUpDuration();
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchScaleUpDuration(long touchScaleUpDuration) {
        return floatUpDuration(touchScaleUpDuration);
    }

    @Deprecated
    public long getTouchScaleDownDuration() {
        return getFloatDownDuration();
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchScaleDownDuration(long touchScaleDownDuration) {
        return floatDownDuration(touchScaleDownDuration);
    }

    @Deprecated
    public float getTouchShadowRadius() {
        return getFloatShadowRadius();
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchShadowRadius(float touchShadowRadius) {
        return floatShadowRadius(touchShadowRadius);
    }

    @Deprecated
    public float getTouchExpandAngle() {
        return getFloatExpandAngle();
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchExpandAngle(float touchExpandAngle) {
        return floatExpandAngle(touchExpandAngle);
    }

    @Deprecated
    public boolean isDrawStrokeOnly() {
        return isStrokeMode();
    }

    @Deprecated
    public AnimatedPieViewConfig setDrawStrokeOnly(boolean stroke) {
        return strokeMode(stroke);
    }

    @Deprecated
    public <T extends IPieInfo> AnimatedPieViewConfig setOnPieSelectListener(OnPieSelectListener<T> listener) {
        return selectListener(listener);
    }

    @Deprecated
    public AnimatedPieViewConfig setDrawText(boolean drawText) {
        return drawText(drawText);
    }

    @Deprecated
    public AnimatedPieViewConfig setTextSize(float textSize) {
        return textSize(textSize);
    }

    @Deprecated
    public AnimatedPieViewConfig setTextMarginLine(int textMargin) {
        return textMargin(textMargin);
    }

    @Deprecated
    public AnimatedPieViewConfig setPieRadiusScale(float pieRadiusRatio) {
        return pieRadiusRatio(pieRadiusRatio);
    }

    @Deprecated
    public AnimatedPieViewConfig setTextPointRadius(int textPointRadius) {
        return guidePointRadius(textPointRadius);
    }

    @Deprecated
    public AnimatedPieViewConfig setTextLineStrokeWidth(int strokeWidth) {
        return guideLineWidth(strokeWidth);
    }

    @Deprecated
    public AnimatedPieViewConfig setTextLineStartMargin(int margin) {
        return guideLineMarginStart(margin);
    }

    @Deprecated
    public AnimatedPieViewConfig setDirectText(boolean directed) {
        return textGravity(directed ? 32 : 35);
    }

    @Deprecated
    public AnimatedPieViewConfig setCanTouch(boolean canTouch) {
        return canTouch(canTouch);
    }

    @Deprecated
    public AnimatedPieViewConfig setSplitAngle(float splitAngle) {
        return splitAngle(splitAngle);
    }

    @Deprecated
    public AnimatedPieViewConfig setFocusAlphaType(int focusAlphaType) {
        return focusAlphaType(focusAlphaType);
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchAnimation(boolean animTouch) {
        return animOnTouch(animTouch);
    }

    @Deprecated
    public AnimatedPieViewConfig setTouchScaleSize(float touchScaleSize) {
        return floatExpandSize(touchScaleSize);
    }
}