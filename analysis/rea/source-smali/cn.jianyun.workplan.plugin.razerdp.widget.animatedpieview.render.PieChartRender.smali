// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender
// markers: Code decompiled incorrectly, please refer to instructions dump
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender)
.class public Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.super Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/BaseRender;
.source "PieChartRender.java"

# interfaces
.implements Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/ITouchRender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;,
        Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;,
        Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;,
        Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;,
        Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
    }
.end annotation


# instance fields
.field private animAngle:F

.field private volatile animHasStart:Z

.field private volatile hasRenderDefaultSelected:Z

.field private volatile isInAnimating:Z

.field private mCachedDrawWrappers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

.field private mDataWrappers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private mDrawMode:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

.field private mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field private mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

.field private mPathMeasure:Landroid/graphics/PathMeasure;

.field private mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

.field private mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

.field private maxDescTextLength:I

.field private pieBounds:Landroid/graphics/RectF;

.field private pieRadius:F


# direct methods
.method static bridge synthetic -$$Nest$fgetisInAnimating(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Z
    .registers 1

    iget-boolean p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmDataWrappers(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmLegendsHelper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetpieBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Landroid/graphics/RectF;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetpieRadius(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)F
    .registers 1

    iget p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    return p0
.end method

.method static bridge synthetic -$$Nest$fputisInAnimating(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Z)V
    .registers 2

    iput-boolean p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    return-void
.end method

.method static bridge synthetic -$$Nest$monDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V
    .registers 1

    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->onDrawFinish()V

    return-void
.end method

.method static bridge synthetic -$$Nest$msetCurPie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->setCurPie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    return-void
.end method

.method static bridge synthetic -$$Nest$msetDrawMode(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;)V
    .registers 2

    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->setDrawMode(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;)V

    return-void
.end method

.method public constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "iPieView"
        }
    .end annotation

    .line 88
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/BaseRender;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;)V

    .line 71
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawMode:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    .line 91
    new-instance p1, Landroid/graphics/PathMeasure;

    invoke-direct {p1}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPathMeasure:Landroid/graphics/PathMeasure;

    .line 92
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    .line 93
    new-instance p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-direct {p1, p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    .line 94
    new-instance p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper-IA;)V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    const/4 p1, 0x0

    .line 95
    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    return-void
.end method

.method private absMathCos(D)F
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "angdeg"
        }
    .end annotation

    .line 796
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method private absMathSin(D)F
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "angdeg"
        }
    .end annotation

    .line 792
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method private angleToProgress(FLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "angle",
            "wrapper"
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p2, :cond_30

    .line 800
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAnimatePie()Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_30

    .line 801
    :cond_d
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gez v1, :cond_17

    const/4 p1, 0x0

    return p1

    .line 802
    :cond_17
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getToAngle()F

    move-result v1

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_20

    return v0

    .line 803
    :cond_20
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getToAngle()F

    move-result v0

    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result p2

    sub-float/2addr v0, p2

    div-float/2addr p1, v0

    return p1

    :cond_30
    :goto_30
    return v0
.end method

.method private applyAlphaToPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;Landroid/graphics/Paint;)V
    .registers 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "target",
            "paint"
        }
    .end annotation

    if-nez p2, :cond_3

    return-void

    .line 633
    :cond_3
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawMode:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    const/16 v2, 0xff

    if-ne v0, v1, :cond_f

    .line 634
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void

    .line 640
    :cond_f
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_23

    .line 642
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_37

    .line 644
    :cond_23
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    if-eqz v0, :cond_36

    .line 645
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_37

    :cond_36
    move p1, v1

    .line 648
    :goto_37
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFocusAlpha()I

    move-result v0

    rsub-int v0, v0, 0xff

    int-to-float v0, v0

    .line 649
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFocusAlphaType()I

    move-result v3

    const/16 v4, 0x10

    const/high16 v5, 0x437f0000    # 255.0f

    const/4 v6, 0x1

    if-eq v3, v4, :cond_7a

    const/16 v4, 0x11

    if-eq v3, v4, :cond_55

    .line 669
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9e

    :cond_55
    if-nez p1, :cond_60

    .line 660
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v3

    if-eqz v3, :cond_60

    move v1, v6

    :cond_60
    if-eqz p1, :cond_66

    .line 662
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9e

    .line 664
    :cond_66
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    if-eqz v1, :cond_6f

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    goto :goto_73

    :cond_6f
    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    :goto_73
    mul-float/2addr v0, p1

    sub-float/2addr v5, v0

    float-to-int p1, v5

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9e

    :cond_7a
    if-eqz p1, :cond_85

    .line 652
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v3

    if-eqz v3, :cond_85

    move v1, v6

    :cond_85
    if-eqz p1, :cond_9b

    .line 654
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    if-eqz v1, :cond_90

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    goto :goto_94

    :cond_90
    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    :goto_94
    mul-float/2addr v0, p1

    sub-float/2addr v5, v0

    float-to-int p1, v5

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9e

    .line 656
    :cond_9b
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_9e
    return-void
.end method

.method private calculateLabelX(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;IFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F
    .registers 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "pieOption",
            "iconWidth",
            "textStartX",
            "direction",
            "textWidth"
        }
    .end annotation

    const/high16 v0, 0x7fc00000    # Float.NaN

    if-nez p1, :cond_5

    return v0

    .line 535
    :cond_5
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPosition()I

    move-result v1

    .line 536
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPadding()I

    move-result p1

    .line 537
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    invoke-virtual {p4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result p4

    aget p4, v2, p4

    const/16 v2, 0x10

    packed-switch p4, :pswitch_data_2a

    return v0

    :pswitch_1b
    if-ne v1, v2, :cond_20

    goto :goto_25

    :pswitch_1e
    if-ne v1, v2, :cond_25

    :cond_20
    int-to-float p2, p5

    add-float/2addr p3, p2

    int-to-float p1, p1

    add-float/2addr p3, p1

    goto :goto_29

    :cond_25
    :goto_25
    int-to-float p2, p2

    sub-float/2addr p3, p2

    int-to-float p1, p1

    sub-float/2addr p3, p1

    :goto_29
    return p3

    :pswitch_data_2a
    .packed-switch 0x1
        :pswitch_1e
        :pswitch_1b
        :pswitch_1e
        :pswitch_1b
        :pswitch_1e
        :pswitch_1b
    .end packed-switch
.end method

.method private calculateLineGravity(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "startX",
            "startY"
        }
    .end annotation

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_f

    cmpl-float p1, p2, v0

    if-lez p1, :cond_c

    .line 611
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    goto :goto_e

    :cond_c
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    :goto_e
    return-object p1

    :cond_f
    cmpg-float p1, p1, v0

    if-gez p1, :cond_1d

    cmpl-float p1, p2, v0

    if-lez p1, :cond_1a

    .line 614
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    goto :goto_1c

    :cond_1a
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    :goto_1c
    return-object p1

    :cond_1d
    cmpl-float p1, p2, v0

    if-nez p1, :cond_29

    if-lez v1, :cond_26

    .line 617
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    goto :goto_28

    :cond_26
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    :goto_28
    return-object p1

    .line 619
    :cond_29
    sget-object p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    return-object p1
.end method

.method private calculateTextStartX(FFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F
    .registers 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "guideLineEndX1",
            "guideLineEndX2",
            "direction",
            "textWidth"
        }
    .end annotation

    .line 563
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextGravity()I

    move-result v0

    .line 564
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextMargin()I

    move-result v1

    .line 565
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    invoke-virtual {p3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result p3

    aget p3, v2, p3

    const/16 v2, 0x22

    packed-switch p3, :pswitch_data_30

    return p1

    :pswitch_1a
    if-ne v0, v2, :cond_1f

    int-to-float p1, v1

    add-float/2addr p2, p1

    goto :goto_21

    :cond_1f
    int-to-float p2, v1

    add-float/2addr p2, p1

    :goto_21
    return p2

    :pswitch_22
    if-ne v0, v2, :cond_29

    int-to-float p1, p4

    sub-float/2addr p2, p1

    int-to-float p1, v1

    sub-float/2addr p2, p1

    goto :goto_2e

    :cond_29
    int-to-float p2, p4

    sub-float/2addr p1, p2

    int-to-float p2, v1

    sub-float p2, p1, p2

    :goto_2e
    return p2

    nop

    :pswitch_data_30
    .packed-switch 0x1
        :pswitch_22
        :pswitch_1a
        :pswitch_22
        :pswitch_1a
        :pswitch_22
        :pswitch_1a
    .end packed-switch
.end method

.method private calculateTextStartY(FFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F
    .registers 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "guideLineEndY1",
            "guideLineEndY2",
            "direction",
            "textHeight"
        }
    .end annotation

    .line 580
    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextGravity()I

    move-result p2

    .line 581
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextMargin()I

    move-result v0

    .line 582
    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    invoke-virtual {p3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result p3

    aget p3, v1, p3

    const/16 v1, 0x21

    const/16 v2, 0x23

    const/16 v3, 0x20

    packed-switch p3, :pswitch_data_54

    int-to-float p2, v0

    sub-float/2addr p1, p2

    .line 604
    div-int/lit8 p4, p4, 0x2

    int-to-float p2, p4

    sub-float/2addr p1, p2

    return p1

    :pswitch_24
    if-ne p2, v3, :cond_2d

    int-to-float p2, v0

    sub-float/2addr p1, p2

    .line 597
    div-int/lit8 p4, p4, 0x2

    int-to-float p2, p4

    sub-float/2addr p1, p2

    return p1

    :cond_2d
    if-eq p2, v1, :cond_37

    if-ne p2, v2, :cond_32

    goto :goto_37

    .line 601
    :cond_32
    div-int/lit8 p4, p4, 0x2

    int-to-float p2, p4

    add-float/2addr p1, p2

    return p1

    :cond_37
    :goto_37
    int-to-float p2, v0

    add-float/2addr p1, p2

    int-to-float p2, p4

    add-float/2addr p1, p2

    return p1

    :pswitch_3c
    if-eq p2, v3, :cond_4d

    if-ne p2, v2, :cond_41

    goto :goto_4d

    :cond_41
    if-ne p2, v1, :cond_48

    int-to-float p2, v0

    add-float/2addr p1, p2

    int-to-float p2, p4

    add-float/2addr p1, p2

    return p1

    .line 591
    :cond_48
    div-int/lit8 p4, p4, 0x2

    int-to-float p2, p4

    add-float/2addr p1, p2

    return p1

    :cond_4d
    :goto_4d
    int-to-float p2, v0

    sub-float/2addr p1, p2

    .line 587
    div-int/lit8 p4, p4, 0x2

    int-to-float p2, p4

    sub-float/2addr p1, p2

    return p1

    :pswitch_data_54
    .packed-switch 0x1
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_24
        :pswitch_24
        :pswitch_24
    .end packed-switch
.end method

.method private checkAndInsertPrePie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "infoWrapper"
        }
    .end annotation

    if-eqz p1, :cond_46

    .line 733
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->isCheckPrePieCached()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_46

    .line 734
    :cond_9
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPreWrapper()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    .line 735
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lalalal  "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    const/4 v1, 0x1

    if-nez v0, :cond_2a

    .line 738
    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setCheckPrePieCached(Z)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-void

    .line 741
    :cond_2a
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_40

    .line 742
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 743
    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setCached(Z)V

    .line 744
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    invoke-virtual {v2, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 746
    :cond_40
    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setCheckPrePieCached(Z)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 747
    invoke-direct {p0, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->checkAndInsertPrePie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    :cond_46
    :goto_46
    return-void
.end method

.method private drawCachedPie(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "canvas",
            "excluded"
        }
    .end annotation

    .line 317
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/Util;->isListEmpty(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4a

    .line 318
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 319
    invoke-direct {p0, p1, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->drawText(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 320
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getAlphaDrawPaint()Landroid/graphics/Paint;

    move-result-object v7

    .line 321
    invoke-direct {p0, v1, v7}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->applyAlphaToPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;Landroid/graphics/Paint;)V

    .line 322
    invoke-virtual {v1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    goto :goto_e

    .line 325
    :cond_2b
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    .line 326
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v4

    .line 327
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getSweepAngle()F

    move-result v1

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getSplitAngle()F

    move-result v2

    sub-float v5, v1, v2

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 328
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v1

    xor-int/lit8 v6, v1, 0x1

    move-object v2, p1

    .line 325
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_e

    :cond_4a
    return-void
.end method

.method private drawText(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 27
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "canvas",
            "wrapper"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    if-nez v8, :cond_9

    return-void

    .line 336
    :cond_9
    iget-object v0, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isDrawText()Z

    move-result v0

    if-nez v0, :cond_23

    .line 337
    iget-object v0, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    if-eqz v0, :cond_22

    iget-object v0, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_22

    .line 338
    iget-object v0, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    :cond_22
    return-void

    .line 342
    :cond_23
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDesc()Ljava/lang/String;

    move-result-object v9

    const-string v0, ""

    .line 343
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    return-void

    .line 346
    :cond_30
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v10

    .line 347
    iget-object v0, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    if-nez v0, :cond_3f

    .line 348
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    .line 352
    :cond_3f
    iget-object v0, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_50

    invoke-direct {v6, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->getFixTextPos(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F

    move-result v0

    goto :goto_51

    :cond_50
    const/4 v0, 0x0

    .line 353
    :goto_51
    iget-object v2, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_62

    invoke-direct {v6, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->getFixTextPos(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F

    move-result v2

    goto :goto_63

    :cond_62
    const/4 v2, 0x0

    :goto_63
    add-float/2addr v0, v2

    .line 355
    iget v2, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    add-float/2addr v2, v0

    iget-object v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 357
    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getGuideLineMarginStart()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 358
    iget-object v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_81

    iget-object v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStrokeWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    goto :goto_82

    :cond_81
    move v3, v4

    :goto_82
    int-to-float v3, v3

    add-float/2addr v2, v3

    float-to-double v2, v2

    .line 359
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result v5

    float-to-double v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    mul-double/2addr v11, v2

    double-to-float v5, v11

    .line 360
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result v11

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double/2addr v2, v11

    double-to-float v2, v2

    .line 363
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getAlphaDrawPaint()Landroid/graphics/Paint;

    move-result-object v11

    .line 364
    iget v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    invoke-direct {v6, v3, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->angleToProgress(FLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F

    move-result v3

    float-to-double v12, v3

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    cmpl-double v3, v12, v14

    if-lez v3, :cond_c6

    .line 365
    invoke-direct {v6, v8, v11}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->applyAlphaToPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;Landroid/graphics/Paint;)V

    .line 366
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v11, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 367
    iget-object v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getGuidePointRadius()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v7, v5, v2, v3, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 378
    :cond_c6
    iget-object v3, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    iget-object v12, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v12}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextSize()F

    move-result v12

    float-to-int v12, v12

    invoke-virtual {v3, v9, v12}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->measureTextBounds(Ljava/lang/String;I)Landroid/graphics/Rect;

    move-result-object v3

    .line 379
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v12

    .line 380
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v13

    .line 383
    invoke-virtual {v8, v12, v13}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getIcon(II)Landroid/graphics/Bitmap;

    move-result-object v14

    if-eqz v14, :cond_102

    .line 388
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 389
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    .line 390
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v15

    if-nez v15, :cond_f0

    move v15, v4

    goto :goto_f8

    :cond_f0
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v15

    .line 391
    invoke-virtual {v15}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPadding()I

    move-result v15

    .line 390
    :goto_f8
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v23, v15

    move v15, v3

    move/from16 v3, v23

    goto :goto_104

    :cond_102
    move v3, v4

    move v15, v3

    .line 394
    :goto_104
    iget-object v1, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextMargin()I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v1, v3

    add-int/2addr v1, v15

    int-to-float v1, v1

    .line 397
    invoke-direct {v6, v5, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->calculateLineGravity(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    move-result-object v3

    const/high16 v17, 0x40c00000    # 6.0f

    div-float v17, v2, v17

    .line 398
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    move-result v17

    .line 400
    sget-object v18, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v19

    aget v18, v18, v19

    move/from16 v20, v5

    const-wide v4, 0x4046800000000000L    # 45.0

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    const-wide v9, -0x3fb9800000000000L    # -45.0

    packed-switch v18, :pswitch_data_2b6

    const/high16 v9, -0x40800000    # -1.0f

    move v0, v9

    move v1, v0

    goto :goto_1a1

    .line 432
    :pswitch_13c
    invoke-direct {v6, v4, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v9

    mul-float v9, v9, v17

    add-float v9, v20, v9

    add-float/2addr v9, v0

    .line 433
    invoke-direct {v6, v4, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v4

    mul-float v17, v17, v4

    add-float v17, v2, v17

    add-float v17, v17, v0

    goto :goto_186

    .line 426
    :pswitch_150
    invoke-direct {v6, v9, v10}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v4

    mul-float v4, v4, v17

    sub-float v5, v20, v4

    sub-float v4, v5, v0

    .line 427
    invoke-direct {v6, v9, v10}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v5

    mul-float v17, v17, v5

    add-float v17, v2, v17

    add-float v17, v17, v0

    goto :goto_19c

    :pswitch_165
    add-float v5, v20, v17

    add-float v9, v5, v0

    add-float/2addr v1, v9

    goto :goto_171

    :pswitch_16b
    sub-float v5, v20, v17

    sub-float v9, v5, v0

    sub-float v1, v9, v1

    :goto_171
    move v0, v2

    goto :goto_1a1

    .line 408
    :pswitch_173
    invoke-direct {v6, v4, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v9

    mul-float v9, v9, v17

    add-float v9, v20, v9

    add-float/2addr v9, v0

    .line 409
    invoke-direct {v6, v4, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v4

    mul-float v17, v17, v4

    sub-float v4, v2, v17

    sub-float v17, v4, v0

    :goto_186
    add-float/2addr v1, v9

    goto :goto_19f

    .line 402
    :pswitch_188
    invoke-direct {v6, v9, v10}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v4

    mul-float v4, v4, v17

    sub-float v5, v20, v4

    sub-float v4, v5, v0

    .line 403
    invoke-direct {v6, v9, v10}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->absMathCos(D)F

    move-result v5

    mul-float v17, v17, v5

    sub-float v5, v2, v17

    sub-float v17, v5, v0

    :goto_19c
    sub-float v1, v4, v1

    move v9, v4

    :goto_19f
    move/from16 v0, v17

    .line 441
    :goto_1a1
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 442
    iget-object v4, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getGuideLineWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 443
    sget-object v4, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 445
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getLinePath()Landroid/graphics/Path;

    move-result-object v4

    .line 446
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getLinePathMeasure()Landroid/graphics/Path;

    move-result-object v5

    move/from16 v10, v20

    .line 447
    invoke-virtual {v4, v10, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 448
    invoke-virtual {v4, v9, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 449
    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 450
    iget-object v2, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPathMeasure:Landroid/graphics/PathMeasure;

    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->nextContour()Z

    .line 451
    iget-object v2, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPathMeasure:Landroid/graphics/PathMeasure;

    const/4 v10, 0x0

    invoke-virtual {v2, v4, v10}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 452
    iget v2, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    invoke-direct {v6, v2, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->angleToProgress(FLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F

    move-result v2

    .line 453
    iget-object v4, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPathMeasure:Landroid/graphics/PathMeasure;

    invoke-virtual {v4}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v10

    mul-float/2addr v10, v2

    const/4 v8, 0x1

    move/from16 v17, v15

    const/4 v15, 0x0

    invoke-virtual {v4, v15, v10, v5, v8}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 454
    invoke-virtual {v7, v5, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 456
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 457
    iget-object v4, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextSize()F

    move-result v4

    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float/2addr v2, v4

    float-to-int v2, v2

    .line 458
    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 461
    invoke-direct {v6, v9, v1, v3, v12}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->calculateTextStartX(FFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F

    move-result v2

    .line 462
    invoke-direct {v6, v0, v0, v3, v13}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->calculateTextStartY(FFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F

    move-result v10

    .line 465
    iget v0, v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->xDirection:I

    if-ne v0, v8, :cond_20d

    move v15, v9

    goto :goto_20e

    :cond_20d
    move v15, v1

    :goto_20e
    int-to-float v0, v13

    sub-float v16, v10, v0

    .line 466
    iget-object v0, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextMargin()I

    move-result v0

    int-to-float v0, v0

    sub-float v18, v16, v0

    .line 467
    iget v0, v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->xDirection:I

    if-ne v0, v8, :cond_21f

    move v9, v1

    :cond_21f
    if-eqz v14, :cond_290

    .line 473
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v5

    move-object/from16 v0, p0

    move v1, v2

    move v2, v12

    move-object v8, v3

    move/from16 v3, v17

    move-object v4, v8

    .line 472
    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->fitTextStartXWithLabel(FIILcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;)F

    move-result v19

    .line 474
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v1

    move/from16 v2, v17

    move/from16 v3, v19

    move v5, v12

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->calculateLabelX(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;IFLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;I)F

    move-result v0

    .line 475
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_249

    cmpg-float v1, v0, v19

    if-gtz v1, :cond_249

    move v15, v0

    :cond_249
    if-nez v13, :cond_27a

    .line 480
    iget-object v1, v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextGravity()I

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_26e

    const/16 v2, 0x22

    if-eq v1, v2, :cond_267

    const/16 v2, 0x23

    if-eq v1, v2, :cond_25e

    goto :goto_27a

    .line 485
    :cond_25e
    iget v1, v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->yDirection:I

    if-nez v1, :cond_27a

    .line 486
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    goto :goto_272

    .line 490
    :cond_267
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    goto :goto_272

    .line 482
    :cond_26e
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    :goto_272
    int-to-float v1, v1

    sub-float v16, v10, v1

    move/from16 v1, v16

    move/from16 v18, v1

    goto :goto_27c

    :cond_27a
    :goto_27a
    move/from16 v1, v16

    .line 496
    :goto_27c
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_289

    .line 497
    invoke-virtual/range {p2 .. p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getIconPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-virtual {v7, v14, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_289
    move-object/from16 v1, p2

    move/from16 v0, v18

    move/from16 v2, v19

    goto :goto_294

    :cond_290
    move-object/from16 v1, p2

    move/from16 v0, v18

    .line 502
    :goto_294
    iget-object v1, v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->mTextArea:Landroid/graphics/RectF;

    invoke-virtual {v1, v15, v0, v9, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 504
    invoke-virtual {v11}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v22, :cond_2ac

    .line 505
    invoke-virtual/range {v22 .. v22}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getTypeFace()Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz v1, :cond_2ac

    .line 506
    invoke-virtual/range {v22 .. v22}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getTypeFace()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_2ac
    move-object/from16 v1, v21

    .line 509
    invoke-virtual {v7, v1, v2, v10, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 510
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void

    nop

    :pswitch_data_2b6
    .packed-switch 0x1
        :pswitch_188
        :pswitch_173
        :pswitch_16b
        :pswitch_165
        :pswitch_150
        :pswitch_13c
    .end packed-switch
.end method

.method private fitTextStartXWithLabel(FIILcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;)F
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "textStartX",
            "textBoundsWidth",
            "labelWidth",
            "direction",
            "pieOption"
        }
    .end annotation

    if-eqz p5, :cond_1f

    .line 517
    invoke-virtual {p5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPadding()I

    move-result p2

    .line 518
    invoke-virtual {p5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPosition()I

    move-result p5

    const/16 v0, 0x10

    if-eq p5, v0, :cond_f

    goto :goto_1f

    .line 520
    :cond_f
    iget p4, p4, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->xDirection:I

    const/4 p5, 0x1

    if-ge p4, p5, :cond_1a

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p3

    int-to-float p2, p2

    sub-float/2addr p1, p2

    goto :goto_1f

    :cond_1a
    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p3

    int-to-float p2, p2

    add-float/2addr p1, p2

    :cond_1f
    :goto_1f
    return p1
.end method

.method private getFixTextPos(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "wrapper"
        }
    .end annotation

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return p1

    .line 624
    :cond_4
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatExpandSize()F

    move-result v0

    goto :goto_15

    :cond_13
    const/high16 v0, 0x41200000    # 10.0f

    .line 625
    :goto_15
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_28

    .line 626
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    goto :goto_2e

    :cond_28
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result p1

    :goto_2e
    mul-float/2addr v0, p1

    return v0
.end method

.method private getLegendsView(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;ILcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "config",
            "position",
            "pieInfo"
        }
    .end annotation

    .line 189
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieLegendListener()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieLegendBindListener;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 192
    invoke-interface {p1, p2, p3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieLegendBindListener;->onCreateLegendView(ILcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    if-nez p1, :cond_18

    .line 195
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mIPieView:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;

    invoke-interface {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;->getViewContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/DefaultPieLegendsView;->newInstance(Landroid/content/Context;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/DefaultPieLegendsView;

    move-result-object p1

    :cond_18
    return-object p1
.end method

.method private measurePieRadius(FF)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "width",
            "height"
        }
    .end annotation

    .line 756
    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_f

    .line 757
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    neg-float p2, v0

    neg-float v1, v0

    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    return-void

    :cond_f
    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    div-float/2addr p2, v0

    .line 760
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/high16 p2, 0x40800000    # 4.0f

    div-float p2, p1, p2

    .line 763
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAutoSize()Z

    move-result v2

    if-eqz v2, :cond_66

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    move v1, v0

    :goto_27
    cmpl-float v2, v1, p1

    if-lez v2, :cond_5f

    cmpl-float v2, v1, v0

    if-nez v2, :cond_59

    .line 769
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isDrawText()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3b

    iget v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->maxDescTextLength:I

    goto :goto_3c

    :cond_3b
    move v1, v2

    :goto_3c
    int-to-float v1, v1

    sub-float v1, p1, v1

    .line 770
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v3

    if-eqz v3, :cond_4f

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStrokeWidth()I

    move-result v2

    shr-int/lit8 v2, v2, 0x1

    :cond_4f
    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 771
    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getGuideLineMarginStart()I

    move-result v2

    int-to-float v2, v2

    goto :goto_5d

    :cond_59
    const/high16 v2, 0x41200000    # 10.0f

    div-float v2, p1, v2

    :goto_5d
    sub-float/2addr v1, v2

    goto :goto_27

    .line 776
    :cond_5f
    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    goto :goto_90

    .line 780
    :cond_66
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieRadius()F

    move-result v2

    cmpl-float v2, v2, v1

    if-lez v2, :cond_79

    .line 781
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieRadius()F

    move-result p1

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    goto :goto_90

    .line 782
    :cond_79
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieRadiusRatio()F

    move-result v2

    cmpl-float v1, v2, v1

    if-lez v1, :cond_8e

    div-float/2addr p1, v0

    .line 783
    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieRadiusRatio()F

    move-result p2

    mul-float/2addr p1, p2

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    goto :goto_90

    .line 785
    :cond_8e
    iput p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    .line 788
    :goto_90
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    iget p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    neg-float v0, p2

    neg-float v1, p2

    invoke-virtual {p1, v0, v1, p2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method private onDrawFinish()V
    .registers 4

    const-string v0, "drawFinish"

    .line 682
    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    .line 683
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->onFinish()V

    .line 684
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAnimatePie()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 685
    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animHasStart:Z

    if-eqz v0, :cond_1a

    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    if-eqz v0, :cond_1b

    :cond_1a
    return-void

    .line 687
    :cond_1b
    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->hasRenderDefaultSelected:Z

    if-eqz v0, :cond_20

    return-void

    .line 688
    :cond_20
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 689
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v2

    if-eqz v2, :cond_26

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v2

    .line 690
    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->isDefaultSelected()Z

    move-result v2

    if-eqz v2, :cond_26

    const/4 v0, 0x1

    .line 691
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->hasRenderDefaultSelected:Z

    .line 692
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$mhandleUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    :cond_4a
    return-void
.end method

.method private prepareAnim()V
    .registers 4

    .line 202
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAnimatePie()Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 203
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    invoke-direct {v0, p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    .line 204
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getAnimationInterpolator()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 205
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->setDuration(J)V

    .line 206
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    new-instance v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;

    invoke-direct {v1, p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_2d
    return-void
.end method

.method private renderAnimDraw(Landroid/graphics/Canvas;)V
    .registers 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    .line 287
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    if-eqz v0, :cond_5c

    .line 288
    invoke-direct {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->drawCachedPie(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 289
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 290
    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v3

    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 291
    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getSplitAngle()F

    move-result v1

    sub-float v4, v0, v1

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 292
    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 293
    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDrawPaint()Landroid/graphics/Paint;

    move-result-object v6

    move-object v1, p1

    .line 289
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 294
    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getMiddleAngle()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_4f

    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getToAngle()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4f

    .line 295
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-direct {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->drawText(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 297
    :cond_4f
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    iget v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    invoke-direct {p0, v1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->angleToProgress(FLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieDrawing(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    :cond_5c
    return-void
.end method

.method private renderDraw(Landroid/graphics/Canvas;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    .line 254
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAnimatePie()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 255
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    if-eqz v0, :cond_23

    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    if-nez v0, :cond_23

    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animHasStart:Z

    if-nez v0, :cond_23

    const/4 p1, 0x1

    .line 256
    iput-boolean p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animHasStart:Z

    .line 257
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mIPieView:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;

    invoke-interface {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;->getPieView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    .line 260
    :cond_23
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderAnimDraw(Landroid/graphics/Canvas;)V

    goto :goto_2a

    .line 262
    :cond_27
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderNormalDraw(Landroid/graphics/Canvas;)V

    :goto_2a
    return-void
.end method

.method private renderNormalDraw(Landroid/graphics/Canvas;)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    .line 275
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/Util;->isListEmpty(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_22

    .line 276
    :cond_16
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 277
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_22
    const/4 v0, 0x0

    .line 279
    invoke-direct {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->drawCachedPie(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 280
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 281
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    invoke-virtual {v1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    goto :goto_2c

    .line 283
    :cond_3e
    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->onDrawFinish()V

    return-void
.end method

.method private renderTouch(Landroid/graphics/Canvas;)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    .line 267
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetsameClick(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    goto :goto_15

    :cond_f
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    :goto_15
    invoke-direct {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->drawCachedPie(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 268
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderTouchDraw(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    .line 269
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v1

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieFloatDown(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    .line 270
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderTouchDraw(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    .line 271
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieFloatUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    return-void
.end method

.method private renderTouchDraw(Landroid/graphics/Canvas;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "wrapper",
            "timeSet"
        }
    .end annotation

    if-nez p2, :cond_3

    return-void

    .line 303
    :cond_3
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {v0, p3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->setTouchBounds(F)V

    .line 304
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {v0, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->prepareTouchPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)Landroid/graphics/Paint;

    move-result-object v6

    .line 305
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatShadowRadius()F

    move-result v0

    mul-float/2addr v0, p3

    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v6, v0, v2, v2, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 306
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStrokeWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatExpandSize()F

    move-result v1

    mul-float/2addr v1, p3

    add-float/2addr v0, v1

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 307
    invoke-direct {p0, p2, v6}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->applyAlphaToPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;Landroid/graphics/Paint;)V

    .line 308
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fgettouchBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Landroid/graphics/RectF;

    move-result-object v2

    .line 309
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v0

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatExpandAngle()F

    move-result v1

    mul-float/2addr v1, p3

    sub-float v3, v0, v1

    .line 310
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getSweepAngle()F

    move-result p2

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatExpandAngle()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    mul-float/2addr v0, p3

    add-float/2addr p2, v0

    iget-object p3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {p3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getSplitAngle()F

    move-result p3

    sub-float v4, p2, p3

    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 311
    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result p2

    xor-int/lit8 v5, p2, 0x1

    move-object v1, p1

    .line 308
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method private setCurPie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "infoWrapper",
            "degree"
        }
    .end annotation

    .line 713
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    if-eqz v0, :cond_5c

    .line 714
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v0

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_f

    .line 715
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->checkAndInsertPrePie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 717
    :cond_f
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getToAngle()F

    move-result v0

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_5c

    .line 718
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setCurPie  deg = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  from = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getFromAngle()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  to  = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 719
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getToAngle()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 718
    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    .line 720
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->isCached()Z

    move-result v0

    if-nez v0, :cond_5c

    .line 721
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 722
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setCached(Z)V

    .line 726
    :cond_5c
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 727
    iput p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animAngle:F

    .line 728
    invoke-virtual {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->callInvalidate()V

    return-void
.end method

.method private setDrawMode(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "drawMode"
        }
    .end annotation

    .line 751
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    if-ne p1, v0, :cond_9

    iget-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    if-eqz v0, :cond_9

    return-void

    .line 752
    :cond_9
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawMode:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    return-void
.end method


# virtual methods
.method public forceAbortTouch()V
    .registers 1

    return-void
.end method

.method public onDestroy()V
    .registers 1

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->getDrawWidth()F

    move-result v0

    .line 234
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->getDrawHeight()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v0, v2

    div-float v2, v1, v2

    .line 239
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 241
    invoke-direct {p0, v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->measurePieRadius(FF)V

    .line 243
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode:[I

    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawMode:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2d

    const/4 v1, 0x2

    if-eq v0, v1, :cond_29

    goto :goto_30

    .line 248
    :cond_29
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderTouch(Landroid/graphics/Canvas;)V

    goto :goto_30

    .line 245
    :cond_2d
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->renderDraw(Landroid/graphics/Canvas;)V

    :goto_30
    return-void
.end method

.method public onPrepare()Z
    .registers 14

    .line 122
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mIPieView:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;

    invoke-interface {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;->getConfig()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    const/4 v1, 0x0

    if-nez v0, :cond_13

    .line 124
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->TAG:Ljava/lang/String;

    const-string v2, "onPrepare: config is null,abort draw because of preparing failed"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 127
    :cond_13
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-direct {p0, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->setDrawMode(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;)V

    .line 128
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->prepare()V

    .line 129
    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->prepareAnim()V

    .line 134
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getDatas()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_69

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    .line 135
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    invoke-interface {v6}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;->getValue()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    add-double/2addr v2, v6

    .line 136
    new-instance v6, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    invoke-direct {v6, v7}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)V

    .line 137
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v6, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setAutoDesc(Z)V

    if-eqz v4, :cond_62

    .line 140
    invoke-virtual {v4, v6}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setNextWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 141
    invoke-virtual {v6, v4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->setPreWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    .line 144
    :cond_62
    iget-object v4, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v4, v6

    goto :goto_2d

    .line 147
    :cond_69
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getLegendsParent()Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v4, 0x1

    if-eqz v0, :cond_74

    move v0, v4

    goto :goto_75

    :cond_74
    move v0, v1

    .line 150
    :goto_75
    iget-object v5, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStartAngle()F

    move-result v5

    .line 152
    iget-object v6, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v1

    :goto_82
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 153
    iget-object v9, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v8, v9}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->prepare(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 154
    iget-object v9, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v8, v5, v2, v3, v9}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->calculateDegree(FDLcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;)F

    move-result v5

    .line 155
    iget-object v9, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDesc()Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v11}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextSize()F

    move-result v11

    float-to-int v11, v11

    invoke-virtual {v9, v10, v11}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->measureTextBounds(Ljava/lang/String;I)Landroid/graphics/Rect;

    move-result-object v9

    .line 156
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    .line 157
    iget-object v10, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDesc()Ljava/lang/String;

    move-result-object v11

    iget-object v12, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    invoke-virtual {v12}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getTextSize()F

    move-result v12

    float-to-int v12, v12

    invoke-virtual {v10, v11, v12}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->measureTextBounds(Ljava/lang/String;I)Landroid/graphics/Rect;

    move-result-object v10

    .line 158
    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    move-result v10

    .line 162
    invoke-virtual {v8, v9, v10}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getIcon(II)Landroid/graphics/Bitmap;

    move-result-object v10

    if-eqz v10, :cond_e1

    .line 164
    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v11

    if-eqz v11, :cond_d8

    .line 165
    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieOption()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;

    move-result-object v11

    invoke-virtual {v11}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/PieOption;->getLabelPadding()I

    move-result v11

    goto :goto_d9

    :cond_d8
    move v11, v1

    .line 167
    :goto_d9
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    .line 168
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    goto :goto_e3

    :cond_e1
    move v11, v1

    move v12, v11

    :goto_e3
    mul-int/lit8 v11, v11, 0x2

    add-int/2addr v12, v11

    add-int/2addr v9, v12

    .line 171
    iget v10, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->maxDescTextLength:I

    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput v9, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->maxDescTextLength:I

    .line 172
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "desc >> "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDesc()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "  maxDesTextSize >> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget v10, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->maxDescTextLength:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    if-eqz v0, :cond_126

    .line 175
    iget-object v9, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mConfig:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    .line 176
    invoke-virtual {v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object v8

    .line 175
    invoke-direct {p0, v11, v7, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->getLegendsView(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;ILcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->put(Ljava/lang/String;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;)V

    :cond_126
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_82

    :cond_12a
    if-eqz v0, :cond_131

    .line 182
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->prepare()V

    :cond_131
    return v4
.end method

.method public onSizeChanged(IIIIII)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "width",
            "height",
            "paddingLeft",
            "paddingTop",
            "paddingRight",
            "paddingBottom"
        }
    .end annotation

    .line 225
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    if-eqz p1, :cond_7

    .line 226
    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$msetCenter(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V

    :cond_7
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    .line 702
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->handleTouch(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public reset()V
    .registers 3

    .line 100
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mTouchHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->reset()V

    .line 101
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mLegendsHelper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->reset()V

    .line 102
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    const/4 v0, 0x0

    .line 103
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->animHasStart:Z

    .line 104
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->isInAnimating:Z

    const/4 v1, 0x0

    .line 105
    iput v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->pieRadius:F

    .line 107
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->hasRenderDefaultSelected:Z

    .line 109
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    if-nez v0, :cond_22

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_22
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDataWrappers:Ljava/util/List;

    .line 110
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 112
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    if-nez v0, :cond_30

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_30
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mCachedDrawWrappers:Ljava/util/List;

    .line 113
    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mDrawingPie:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 116
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mRenderAnimation:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;

    .line 117
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mIPieView:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;

    invoke-interface {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/IPieView;->getPieView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.AnonymousClass1 (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$1)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;
.super Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/AnimationCallbackUtils$SimpleAnimationListener;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->prepareAnim()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 206
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/AnimationCallbackUtils$SimpleAnimationListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    .line 215
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fputisInAnimating(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Z)V

    .line 216
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$monDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    .line 209
    invoke-super {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/AnimationCallbackUtils$SimpleAnimationListener;->onAnimationStart(Landroid/view/animation/Animation;)V

    .line 210
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$1;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fputisInAnimating(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Z)V

    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.AnonymousClass2 (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$2)
.class synthetic Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;
.super Ljava/lang/Object;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode:[I

.field static final synthetic $SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 400
    invoke-static {}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    const/4 v1, 0x1

    :try_start_a
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_12} :catch_12

    :catch_12
    const/4 v0, 0x2

    :try_start_13
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v2, v3
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    :try_start_28
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v3

    const/4 v4, 0x4

    aput v4, v2, v3
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_33} :catch_33

    :catch_33
    :try_start_33
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v3

    const/4 v4, 0x5

    aput v4, v2, v3
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3e
    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$LineDirection:[I

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->ordinal()I

    move-result v3

    const/4 v4, 0x6

    aput v4, v2, v3
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_49} :catch_49

    .line 243
    :catch_49
    invoke-static {}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode:[I

    :try_start_52
    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_5a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_52 .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5a
    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$2;->$SwitchMap$cn$jianyun$workplan$plugin$razerdp$widget$animatedpieview$render$PieChartRender$DrawMode:[I

    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_64
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5a .. :try_end_64} :catch_64

    :catch_64
    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.DrawMode (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$DrawMode)
.class final enum Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;
.super Ljava/lang/Enum;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "DrawMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

.field public static final enum DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

.field public static final enum TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;


# direct methods
.method private static synthetic $values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;
    .registers 2

    .line 44
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    filled-new-array {v0, v1}, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 3

    .line 45
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    const-string v1, "DRAW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->DRAW:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    .line 46
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    const-string v1, "TOUCH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    .line 44
    invoke-static {}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->$values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->$VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    .line 44
    const-class v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    return-object p0
.end method

.method public static values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;
    .registers 1

    .line 44
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->$VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-virtual {v0}, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    return-object v0
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.LegendsHelper (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$LegendsHelper)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;
.super Ljava/lang/Object;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LegendsHelper"
.end annotation


# instance fields
.field private lastDrawingPieInfo:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field private legendsViewBucket:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;


# direct methods
.method private constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 1050
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper-IA;)V
    .registers 3

    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V

    return-void
.end method


# virtual methods
.method onPieDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "infoWrapper"
        }
    .end annotation

    if-eqz p1, :cond_22

    .line 1106
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_22

    .line 1109
    :cond_d
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    if-eqz v0, :cond_22

    .line 1111
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;->onPieDrawFinish(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)V

    :cond_22
    :goto_22
    return-void
.end method

.method onPieDrawStart(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "infoWrapper"
        }
    .end annotation

    if-eqz p1, :cond_38

    .line 1085
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_38

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_38

    .line 1088
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "legends  >>  "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    .line 1089
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    if-eqz v0, :cond_38

    .line 1091
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;->onPieDrawStart(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;)V

    :cond_38
    :goto_38
    return-void
.end method

.method onPieDrawing(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "infoWrapper",
            "progress"
        }
    .end annotation

    if-eqz p1, :cond_22

    .line 1096
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_22

    .line 1099
    :cond_d
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    if-eqz v0, :cond_22

    .line 1101
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;->onPieDrawing(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;F)V

    :cond_22
    :goto_22
    return-void
.end method

.method onPieFloatDown(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "infoWrapper",
            "timeSet"
        }
    .end annotation

    if-eqz p1, :cond_22

    .line 1126
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_22

    .line 1129
    :cond_d
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    if-eqz v0, :cond_22

    .line 1131
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;->onPieFloatDown(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;F)V

    :cond_22
    :goto_22
    return-void
.end method

.method onPieFloatUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "infoWrapper",
            "timeSet"
        }
    .end annotation

    if-eqz p1, :cond_22

    .line 1116
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_22

    .line 1119
    :cond_d
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    if-eqz v0, :cond_22

    .line 1121
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;->onPieFloatUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;F)V

    :cond_22
    :goto_22
    return-void
.end method

.method prepare()V
    .registers 6

    .line 1067
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getLegendsParent()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 1069
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    :cond_f
    if-eqz v0, :cond_59

    .line 1071
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_59

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1c

    goto :goto_59

    .line 1074
    :cond_1c
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_26
    :goto_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_59

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1075
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getPieLegendListener()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieLegendBindListener;

    move-result-object v3

    if-eqz v3, :cond_4c

    .line 1076
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;

    invoke-interface {v3, v0, v4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieLegendBindListener;->onAddView(Landroid/view/ViewGroup;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;)Z

    move-result v3

    if-eqz v3, :cond_4c

    const/4 v3, 0x1

    goto :goto_4d

    :cond_4c
    const/4 v3, 0x0

    :goto_4d
    if-nez v3, :cond_26

    .line 1078
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_26

    :cond_59
    :goto_59
    return-void
.end method

.method put(Ljava/lang/String;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/BasePieLegendsView;)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "id",
            "view"
        }
    .end annotation

    .line 1060
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_b

    .line 1061
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    .line 1063
    :cond_b
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method reset()V
    .registers 2

    .line 1056
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->legendsViewBucket:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    :cond_7
    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.LegendsHelperIA (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$LegendsHelper-IA)
.class public final synthetic Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper-IA;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.LineDirection (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$LineDirection)
.class final enum Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
.super Ljava/lang/Enum;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "LineDirection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum BOTTOM_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum BOTTOM_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum CENTER_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum CENTER_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum TOP_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

.field public static final enum TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;


# instance fields
.field xDirection:I

.field yDirection:I


# direct methods
.method private static synthetic $values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
    .registers 6

    .line 49
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    sget-object v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    sget-object v3, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    sget-object v4, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    sget-object v5, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    filled-new-array/range {v0 .. v5}, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .registers 6

    .line 50
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "TOP_RIGHT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 51
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "BOTTOM_RIGHT"

    invoke-direct {v0, v1, v3, v3, v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 52
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "TOP_LEFT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->TOP_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 53
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "BOTTOM_LEFT"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2, v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->BOTTOM_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 54
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "CENTER_RIGHT"

    const/4 v4, 0x4

    const/4 v5, -0x1

    invoke-direct {v0, v1, v4, v3, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_RIGHT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 55
    new-instance v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    const-string v1, "CENTER_LEFT"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2, v5}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->CENTER_LEFT:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    .line 49
    invoke-static {}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->$values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->$VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x0,
            0x0
        }
        names = {
            "$enum$name",
            "$enum$ordinal",
            "xDirection",
            "yDirection"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 61
    iput p3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->xDirection:I

    .line 62
    iput p4, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->yDirection:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    .line 49
    const-class v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    return-object p0
.end method

.method public static values()[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;
    .registers 1

    .line 49
    sget-object v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->$VALUES:[Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    invoke-virtual {v0}, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LineDirection;

    return-object v0
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.RenderAnimation (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$RenderAnimation)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;
.super Landroid/view/animation/Animation;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RenderAnimation"
.end annotation


# instance fields
.field private lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field final synthetic this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;


# direct methods
.method public constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 811
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    const/4 p1, 0x0

    .line 812
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "interpolatedTime",
            "t"
        }
    .end annotation

    .line 817
    invoke-super {p0, p1, p2}, Landroid/view/animation/Animation;->applyTransformation(FLandroid/view/animation/Transformation;)V

    .line 818
    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object p2

    if-eqz p2, :cond_44

    .line 821
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "interpolatedTime = "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    const/4 p2, 0x0

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_43

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p1, p2

    if-gtz p2, :cond_43

    const/high16 p2, 0x43b40000    # 360.0f

    mul-float/2addr p1, p2

    .line 823
    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStartAngle()F

    move-result p2

    add-float/2addr p1, p2

    .line 824
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->findPieinfoWithAngle(F)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object p2

    .line 825
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    if-nez p2, :cond_40

    iget-object p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    :cond_40
    invoke-static {v0, p2, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$msetCurPie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;F)V

    :cond_43
    return-void

    .line 819
    :cond_44
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "viewConfig\u4e3a\u7a7a"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public findPieinfoWithAngle(F)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "angle"
        }
    .end annotation

    .line 830
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmDataWrappers(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/Util;->isListEmpty(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    return-object v1

    .line 831
    :cond_e
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->contains(F)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 832
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object p1

    .line 834
    :cond_1b
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmDataWrappers(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 835
    invoke-virtual {v2, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->contains(F)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 836
    iput-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 837
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmLegendsHelper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;

    move-result-object p1

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$RenderAnimation;->lastFoundWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$LegendsHelper;->onPieDrawStart(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    return-object v2

    :cond_45
    return-object v1
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.TouchHelper (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$TouchHelper)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;
.super Ljava/lang/Object;
.source "PieChartRender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TouchHelper"
.end annotation


# instance fields
.field private centerX:F

.field private centerY:F

.field private expandClickRange:I

.field private floatDownAnim:Landroid/animation/ValueAnimator;

.field private floatDownTime:F

.field private floatUpAnim:Landroid/animation/ValueAnimator;

.field private floatUpTime:F

.field private floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field private lastFloatWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field private lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

.field private mTouchPaint:Landroid/graphics/Paint;

.field private sameClick:Z

.field final synthetic this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

.field private touchBounds:Landroid/graphics/RectF;

.field private touchX:F

.field private touchY:F


# direct methods
.method static bridge synthetic -$$Nest$fgetfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F
    .registers 1

    iget p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownTime:F

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)F
    .registers 1

    iget p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpTime:F

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetfloatingWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetlastFloatWrapper(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastFloatWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetsameClick(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Z
    .registers 1

    iget-boolean p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->sameClick:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgettouchBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)Landroid/graphics/RectF;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchBounds:Landroid/graphics/RectF;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;F)V
    .registers 2

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownTime:F

    return-void
.end method

.method static bridge synthetic -$$Nest$fputfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;F)V
    .registers 2

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpTime:F

    return-void
.end method

.method static bridge synthetic -$$Nest$mhandleUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 2

    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->handleUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    return-void
.end method

.method static bridge synthetic -$$Nest$msetCenter(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V
    .registers 1

    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->setCenter()V

    return-void
.end method

.method constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    const/16 v0, 0x19

    .line 869
    invoke-direct {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;I)V

    return-void
.end method

.method constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;I)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            "this$0",
            "expandClickRange"
        }
    .end annotation

    .line 872
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x40800000    # -1.0f

    .line 859
    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchX:F

    .line 860
    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchY:F

    .line 873
    iput p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->expandClickRange:I

    .line 874
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchBounds:Landroid/graphics/RectF;

    return-void
.end method

.method private handleUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "touchWrapper"
        }
    .end annotation

    .line 1021
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    sget-object v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;->TOUCH:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;

    invoke-static {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$msetDrawMode(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$DrawMode;)V

    .line 1022
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1024
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastFloatWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    const/4 v0, 0x0

    .line 1025
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    const/4 v0, 0x1

    .line 1026
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->sameClick:Z

    goto :goto_21

    .line 1028
    :cond_18
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastFloatWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 1029
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    const/4 v0, 0x0

    .line 1030
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->sameClick:Z

    .line 1033
    :goto_21
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isAnimTouch()Z

    move-result v0

    if-eqz v0, :cond_38

    .line 1034
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 1035
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_43

    :cond_38
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1037
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpTime:F

    .line 1038
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownTime:F

    .line 1039
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->callInvalidate()V

    .line 1042
    :goto_43
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getSelectListener()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieSelectListener;

    move-result-object v0

    if-eqz v0, :cond_66

    .line 1043
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getSelectListener()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieSelectListener;

    move-result-object v0

    .line 1044
    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getPieInfo()Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;

    move-result-object v1

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    invoke-virtual {p1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {v0, v1, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/callback/OnPieSelectListener;->onSelectPie(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/data/IPieInfo;Z)V

    :cond_66
    return-void
.end method

.method private setCenter()V
    .registers 3

    .line 927
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    iget-object v0, v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->getDrawWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerX:F

    .line 928
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    iget-object v0, v0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->mPieManager:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/manager/PieManager;->getDrawHeight()F

    move-result v0

    div-float/2addr v0, v1

    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerY:F

    return-void
.end method


# virtual methods
.method findLabelTouchWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "x",
            "y"
        }
    .end annotation

    .line 963
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    if-eqz v0, :cond_d

    invoke-virtual {v0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->containsLabelTouch(FF)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 964
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object p1

    .line 966
    :cond_d
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmDataWrappers(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 967
    invoke-virtual {v1, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->containsLabelTouch(FF)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 968
    iput-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object v1

    :cond_2c
    const/4 p1, 0x0

    return-object p1
.end method

.method findWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "x",
            "y"
        }
    .end annotation

    .line 977
    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerY:F

    sub-float/2addr p2, v0

    float-to-double v0, p2

    iget p2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerX:F

    sub-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_1c

    const-wide v0, 0x4076800000000000L    # 360.0

    add-double/2addr p1, v0

    .line 981
    :cond_1c
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    if-eqz v0, :cond_2a

    double-to-float v1, p1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->containsTouch(F)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 982
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object p1

    .line 984
    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "touch\u89d2\u5ea6 = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog;->i(Ljava/lang/String;)V

    .line 985
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmDataWrappers(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    double-to-float v2, p1

    .line 986
    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->containsTouch(F)Z

    move-result v2

    if-eqz v2, :cond_46

    .line 987
    iput-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    return-object v1

    :cond_5c
    const/4 p1, 0x0

    return-object p1
.end method

.method handleTouch(Landroid/view/MotionEvent;)Z
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    .line 1003
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_44

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isCanTouch()Z

    move-result v0

    if-eqz v0, :cond_44

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetisInAnimating(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_44

    .line 1004
    :cond_1e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_37

    if-eq v0, v2, :cond_28

    return v1

    .line 1010
    :cond_28
    iget p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchX:F

    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchY:F

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->pointToPieInfoWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object p1

    if-nez p1, :cond_33

    return v1

    .line 1012
    :cond_33
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->handleUp(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)V

    return v2

    .line 1006
    :cond_37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchX:F

    .line 1007
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchY:F

    return v2

    :cond_44
    :goto_44
    return v1
.end method

.method pointToPieInfoWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;
    .registers 13
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "x",
            "y"
        }
    .end annotation

    .line 942
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v0

    .line 943
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getStrokeWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    .line 945
    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieRadius(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)F

    move-result v3

    if-eqz v0, :cond_22

    div-float v4, v1, v2

    add-float/2addr v3, v4

    :cond_22
    if-eqz v0, :cond_2d

    .line 947
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieRadius(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)F

    move-result v0

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    goto :goto_2e

    :cond_2d
    const/4 v0, 0x0

    .line 949
    :goto_2e
    iget v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerX:F

    sub-float v1, p1, v1

    float-to-double v1, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    iget v6, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerY:F

    sub-float v6, p2, v6

    float-to-double v6, v6

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v1, v6

    .line 951
    iget v6, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->expandClickRange:I

    int-to-double v6, v6

    float-to-double v8, v0

    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    add-double/2addr v6, v8

    cmpl-double v0, v1, v6

    if-ltz v0, :cond_5f

    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->expandClickRange:I

    int-to-double v6, v0

    float-to-double v8, v3

    .line 952
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    add-double/2addr v6, v3

    cmpg-double v0, v1, v6

    if-gtz v0, :cond_5f

    const/4 v0, 0x1

    goto :goto_60

    :cond_5f
    const/4 v0, 0x0

    :goto_60
    if-nez v0, :cond_7b

    .line 954
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isDrawText()Z

    move-result v0

    if-eqz v0, :cond_79

    .line 955
    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerX:F

    sub-float/2addr p1, v0

    iget v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerY:F

    sub-float/2addr p2, v0

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->findLabelTouchWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object p1

    return-object p1

    :cond_79
    const/4 p1, 0x0

    return-object p1

    .line 959
    :cond_7b
    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->findWrapper(FF)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    move-result-object p1

    return-object p1
.end method

.method prepare()V
    .registers 5

    .line 899
    invoke-direct {p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->setCenter()V

    .line 901
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->mTouchPaint:Landroid/graphics/Paint;

    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 903
    fill-array-data v1, :array_66

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    .line 904
    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatUpDuration()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 905
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 906
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    new-instance v2, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;

    invoke-direct {v2, p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v0, v0, [F

    .line 914
    fill-array-data v0, :array_6e

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    .line 915
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatDownDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 916
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 917
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    new-instance v1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;

    invoke-direct {v1, p0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;-><init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    nop

    :array_66
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_6e
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method prepareTouchPaint(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;)Landroid/graphics/Paint;
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "wrapper"
        }
    .end annotation

    .line 932
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->mTouchPaint:Landroid/graphics/Paint;

    if-nez v0, :cond_c

    .line 933
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->mTouchPaint:Landroid/graphics/Paint;

    :cond_c
    if-eqz p1, :cond_17

    .line 936
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->mTouchPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;->getDrawPaint()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 938
    :cond_17
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->mTouchPaint:Landroid/graphics/Paint;

    return-object p1
.end method

.method reset()V
    .registers 4

    const/4 v0, 0x0

    .line 878
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerX:F

    .line 879
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->centerY:F

    .line 880
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchBounds:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->setEmpty()V

    .line 881
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    const/4 v2, 0x2

    if-nez v1, :cond_18

    new-array v1, v2, [F

    fill-array-data v1, :array_44

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    :cond_18
    iput-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpAnim:Landroid/animation/ValueAnimator;

    .line 882
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 883
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpTime:F

    .line 885
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    if-nez v1, :cond_2c

    new-array v1, v2, [F

    fill-array-data v1, :array_4c

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    :cond_2c
    iput-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatDownAnim:Landroid/animation/ValueAnimator;

    .line 886
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 887
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatUpTime:F

    const/4 v0, 0x0

    .line 889
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->floatingWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 890
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastFloatWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    .line 891
    iput-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->lastTouchWrapper:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieInfoWrapper;

    const/high16 v0, -0x40800000    # -1.0f

    .line 893
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchX:F

    .line 894
    iput v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchY:F

    const/4 v0, 0x0

    .line 895
    iput-boolean v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->sameClick:Z

    return-void

    :array_44
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_4c
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method setTouchBounds(F)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeSet"
        }
    .end annotation

    .line 995
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->isStrokeMode()Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetmConfig(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/AnimatedPieViewConfig;->getFloatExpandSize()F

    move-result v0

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    .line 996
    :goto_18
    iget-object v1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->touchBounds:Landroid/graphics/RectF;

    iget-object v2, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v2}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p1

    sub-float/2addr v2, v0

    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v0

    iget-object v3, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v3}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Landroid/graphics/RectF;

    move-result-object v3

    iget v3, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v3, v0

    iget-object v4, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-static {v4}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->-$$Nest$fgetpieBounds(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;)Landroid/graphics/RectF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v4, v0

    invoke-virtual {v1, v2, p1, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.TouchHelper.AnonymousClass1 (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$TouchHelper$1)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;
.super Ljava/lang/Object;
.source "PieChartRender.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$1"
        }
    .end annotation

    .line 906
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    .line 909
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fputfloatUpTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;F)V

    .line 910
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$1;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    iget-object p1, p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->callInvalidate()V

    return-void
.end method

###### Class cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender.TouchHelper.AnonymousClass2 (cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender$TouchHelper$2)
.class Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;
.super Ljava/lang/Object;
.source "PieChartRender.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$1"
        }
    .end annotation

    .line 917
    iput-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    .line 920
    iget-object v0, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->-$$Nest$fputfloatDownTime(Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;F)V

    .line 921
    iget-object p1, p0, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper$2;->this$1:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;

    iget-object p1, p1, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender$TouchHelper;->this$0:Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;

    invoke-virtual {p1}, Lcn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender;->callInvalidate()V

    return-void
.end method
