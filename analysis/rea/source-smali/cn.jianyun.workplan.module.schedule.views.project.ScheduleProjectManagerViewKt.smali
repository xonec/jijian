// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt
// markers: Method not decompiled; Method code generation error; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt)
.class public final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt;
.super Ljava/lang/Object;
.source "ScheduleProjectManagerView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleProjectManagerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,144:1\n43#2,7:145\n86#3,6:152\n*S KotlinDebug\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt\n*L\n37#1:145,7\n37#1:152,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "ScheduleProjectManagerView",
        "",
        "navHostController",
        "Landroidx/navigation/NavHostController;",
        "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final ScheduleProjectManagerView(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
    .registers 15

    const-string v0, "navHostController"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x415e4eaa

    .line 35
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    const-string v1, "C(ScheduleProjectManagerView)"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1d

    const/4 v1, -0x1

    const-string v2, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView (ScheduleProjectManagerView.kt:34)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    :cond_1d
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const v1, 0x70b323c8

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v1, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 145
    sget-object v1, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    sget v2, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    invoke-virtual {v1, p1, v2}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v2

    if-eqz v2, :cond_b8

    const/4 v3, 0x0

    const/16 v1, 0x8

    .line 150
    invoke-static {v2, p1, v1}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v4

    const v1, 0x671a9c9b

    .line 151
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v1, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 152
    instance-of v1, v2, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v1, :cond_55

    .line 153
    move-object v1, v2

    check-cast v1, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v1}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v1

    goto :goto_59

    .line 155
    :cond_55
    sget-object v1, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    check-cast v1, Landroidx/lifecycle/viewmodel/CreationExtras;

    :goto_59
    move-object v5, v1

    const-class v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    const v7, 0x9048

    const/4 v8, 0x0

    move-object v6, p1

    .line 157
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v1

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 151
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 37
    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v2, "\u9879\u76ee\u7ba1\u7406"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 42
    new-instance v1, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;

    invoke-direct {v1, v0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const v6, -0x65b0967d

    const/4 v7, 0x1

    invoke-static {p1, v6, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x0

    .line 58
    new-instance v1, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;

    invoke-direct {v1, v0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const v0, 0x71316b41

    invoke-static {p1, v0, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const v10, 0xc30038    # 1.7908E-38f

    const/16 v11, 0x5c

    move-object v1, p0

    move v7, v8

    move-object v8, v0

    move-object v9, p1

    .line 39
    invoke-static/range {v1 .. v11}, Lcn/jianyun/workplan/ui/component/nav/HeaderViewKt;->PageWithFooterView-0vH8DBg(Landroidx/navigation/NavHostController;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_a6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-nez p1, :cond_ad

    goto :goto_b7

    :cond_ad
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;-><init>(Landroidx/navigation/NavHostController;I)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_b7
    return-void

    .line 145
    :cond_b8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt;->ScheduleProjectManagerView(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 42
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .registers 12

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_10

    .line 44
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_10

    .line 57
    :cond_c
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_7e

    .line 44
    :cond_10
    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, -0x1

    const-string v1, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous> (ScheduleProjectManagerView.kt:41)"

    const v2, -0x65b0967d

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1f
    iget-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_5c

    const p2, -0x6fd6f15e

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v0, "\u6dfb\u52a0\u9879\u76ee"

    const-string v1, "\u9879\u76ee\u6392\u5e8f"

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 45
    new-instance p2, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2, v4}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    new-instance p2, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2, v5}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function0;

    const/16 v7, 0x36

    const/16 v8, 0xc

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lcn/jianyun/workplan/ui/component/form/ButtonViewKt;->OkAndCancelButtonGroup-1yyLQnY(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 44
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_75

    :cond_5c
    const p2, -0x6fd6f00f

    .line 52
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 53
    new-instance p2, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2, v0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast p2, Lkotlin/jvm/functions/Function0;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const-string v2, "\u6dfb\u52a0\u9879\u76ee"

    invoke-static {v2, p2, p1, v0, v1}, Lcn/jianyun/workplan/ui/component/form/ButtonViewKt;->LongOkButton(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 52
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    :goto_75
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7e
    :goto_7e
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass1.C02401 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 45
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 21

    move-object/from16 v0, p0

    .line 46
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    new-instance v15, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1fff

    const/16 v18, 0x0

    move-object v2, v15

    move-object/from16 v19, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v2 .. v17}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    .line 47
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    sget-object v2, Lcn/jianyun/workplan/model/FormType;->Companion:Lcn/jianyun/workplan/model/FormType$Companion;

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Lcn/jianyun/workplan/model/FormType$Companion;->add$default(Lcn/jianyun/workplan/model/FormType$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lcn/jianyun/workplan/model/FormType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass1.AnonymousClass2 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 45
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 3

    .line 49
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    sget-object v1, Lcn/jianyun/workplan/model/FormType;->Companion:Lcn/jianyun/workplan/model/FormType$Companion;

    invoke-virtual {v1}, Lcn/jianyun/workplan/model/FormType$Companion;->sort()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass1.AnonymousClass3 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 53
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 21

    move-object/from16 v0, p0

    .line 54
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    new-instance v15, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1fff

    const/16 v18, 0x0

    move-object v2, v15

    move-object/from16 v19, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v2 .. v17}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    .line 55
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$1$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    sget-object v2, Lcn/jianyun/workplan/model/FormType;->Companion:Lcn/jianyun/workplan/model/FormType$Companion;

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Lcn/jianyun/workplan/model/FormType$Companion;->add$default(Lcn/jianyun/workplan/model/FormType$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lcn/jianyun/workplan/model/FormType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt;->ScheduleProjectManagerView(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleProjectManagerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1855#2,2:145\n1549#2:147\n1620#2,3:148\n*S KotlinDebug\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2\n*L\n64#1:145,2\n133#1:147\n133#1:148,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 58
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .registers 37

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v15, 0x2

    if-ne v2, v15, :cond_17

    .line 60
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_17

    .line 139
    :cond_12
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_275

    .line 60
    :cond_17
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_26

    const/4 v2, -0x1

    const-string v3, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous> (ScheduleProjectManagerView.kt:57)"

    const v4, 0x71316b41

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_26
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v13, 0x1

    if-eqz v1, :cond_50

    const v1, -0x6fd6ef1d

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v1, "\u6682\u65e0\u9879\u76ee"

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/16 v9, 0xe

    move-object/from16 v7, p1

    .line 61
    invoke-static/range {v1 .. v9}, Lcn/jianyun/workplan/ui/component/nav/BoxViewKt;->EmptyDataView-6BXD4ec(Ljava/lang/String;JJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 60
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_aa

    :cond_50
    const v1, -0x6fd6eedb

    .line 63
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 64
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 145
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_68
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    .line 65
    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;

    invoke-direct {v4, v10, v1}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    new-instance v5, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;

    invoke-direct {v5, v10, v1}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    const-string v6, "\u5220\u9664\u9879\u76ee\uff0c\u4f1a\u628a\u9879\u76ee\u4e0b\u6240\u6709\u6392\u73ed\u6570\u636e\u7ea7\u8054\u5220\u9664\uff0c\u786e\u5b9a\u8fd8\u8981\u7ee7\u7eed\u5417\uff1f"

    .line 76
    new-instance v7, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;

    invoke-direct {v7, v1, v10}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;-><init>(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const v1, 0x1dbb5118

    invoke-static {v14, v1, v13, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const v8, 0x36000

    const/4 v9, 0x1

    move v1, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, p1

    .line 65
    invoke-static/range {v1 .. v9}, Lcn/jianyun/workplan/ui/component/nav/SwipeRowViewKt;->SwipeDeleteView(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    goto :goto_68

    .line 63
    :cond_a7
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    :goto_aa
    const v1, -0x6fd6eaa8

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 91
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getFormType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/model/FormType;->isAdd()Z

    move-result v1

    if-nez v1, :cond_d5

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getFormType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/model/FormType;->isUpdate()Z

    move-result v1

    if-eqz v1, :cond_d1

    goto :goto_d5

    :cond_d1
    move-object v0, v14

    move/from16 v18, v15

    goto :goto_110

    .line 93
    :cond_d5
    :goto_d5
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 92
    new-instance v12, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;

    iget-object v13, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v12, v13}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v12, Lkotlin/jvm/functions/Function1;

    new-instance v13, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;

    iget-object v15, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v13, v15}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v13, Lkotlin/jvm/functions/Function0;

    const/4 v15, 0x1

    const/high16 v17, 0x30000000

    const/16 v18, 0x2

    move/from16 v15, v17

    const/16 v16, 0x0

    const/16 v17, 0x5fe

    move-object v0, v14

    move-object/from16 v14, p1

    invoke-static/range {v1 .. v17}, Lcn/jianyun/workplan/ui/component/form/FormItemKt;->ShowInputDialog-JDHDdL8(Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;IFLjava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    :goto_110
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v1, -0x6fd6e82c

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    move-object v7, v0

    move-object/from16 v0, p0

    .line 111
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getFormType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    const-string v2, "detail"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/model/FormType;->isForm(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1d2

    const-string v1, "\u9009\u62e9\u4e00\u9879\u64cd\u4f5c"

    .line 112
    new-instance v2, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2, v3}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 v3, 0x3

    new-array v3, v3, [Lcn/jianyun/workplan/ui/component/form/SheetModel;

    .line 114
    new-instance v4, Lcn/jianyun/workplan/ui/component/form/SheetModel;

    const-string v9, "\u5207\u6362\u4e3a\u5f53\u524d\u9879\u76ee"

    invoke-static {}, Lcn/jianyun/workplan/ui/theme/ColorKt;->getThemeColor()J

    move-result-wide v10

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    move-result-object v5

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    xor-int/lit8 v12, v5, 0x1

    new-instance v5, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5, v8}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function0;

    const/4 v14, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v14}, Lcn/jianyun/workplan/ui/component/form/SheetModel;-><init>(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x0

    aput-object v4, v3, v13

    .line 116
    new-instance v4, Lcn/jianyun/workplan/ui/component/form/SheetModel;

    const-string v20, "\u7f16\u8f91\u9879\u76ee\u540d\u79f0"

    invoke-static {}, Lcn/jianyun/workplan/ui/theme/ColorKt;->getThemeColor()J

    move-result-wide v21

    const/16 v23, 0x0

    .line 114
    new-instance v5, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5, v8}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    move-object/from16 v24, v5

    check-cast v24, Lkotlin/jvm/functions/Function0;

    const/16 v25, 0x4

    const/16 v26, 0x0

    move-object/from16 v19, v4

    .line 116
    invoke-direct/range {v19 .. v26}, Lcn/jianyun/workplan/ui/component/form/SheetModel;-><init>(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v4, v3, v6

    .line 118
    new-instance v4, Lcn/jianyun/workplan/ui/component/form/SheetModel;

    const-string v28, "\u5220\u9664\u9879\u76ee"

    invoke-static {}, Lcn/jianyun/workplan/ui/theme/ColorKt;->getDeleteColor()J

    move-result-wide v29

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v6, :cond_1b0

    move/from16 v31, v6

    goto :goto_1b2

    :cond_1b0
    move/from16 v31, v13

    .line 114
    :goto_1b2
    new-instance v5, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5, v6}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    move-object/from16 v32, v5

    check-cast v32, Lkotlin/jvm/functions/Function0;

    const/16 v33, 0x0

    move-object/from16 v27, v4

    .line 118
    invoke-direct/range {v27 .. v33}, Lcn/jianyun/workplan/ui/component/form/SheetModel;-><init>(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v4, v3, v18

    .line 114
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v5, 0x206

    const/4 v6, 0x0

    move-object/from16 v4, p1

    .line 112
    invoke-static/range {v1 .. v6}, Lcn/jianyun/workplan/ui/component/form/DialogViewKt;->SheetDialog(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    :cond_1d2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v1, -0x6fd6e5b1

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 123
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getFormType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/model/FormType;->isDelete()Z

    move-result v1

    if-eqz v1, :cond_206

    const-string v1, "\u5220\u9664\u9879\u76ee\uff0c\u4f1a\u628a\u9879\u76ee\u4e0b\u6240\u6709\u6392\u73ed\u6570\u636e\u7ea7\u8054\u5220\u9664\uff0c\u786e\u5b9a\u8fd8\u8981\u7ee7\u7eed\u5417"

    .line 124
    new-instance v2, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2, v3}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    new-instance v3, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;

    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3, v4}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v6}, Lcn/jianyun/workplan/ui/component/form/DialogViewKt;->DeleteDialog(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    :cond_206
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 132
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getFormType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/model/FormType;->isSort()Z

    move-result v1

    if-eqz v1, :cond_26c

    const-string v1, "\u9879\u76ee\u6392\u5e8f"

    .line 133
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 147
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 148
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_238
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_24c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 149
    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    .line 133
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->toSelect()Lcn/jianyun/workplan/util/SelectDO;

    move-result-object v4

    .line 149
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_238

    .line 150
    :cond_24c
    move-object v2, v3

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    .line 133
    new-instance v4, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4, v5}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v5, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5, v6}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    const/16 v8, 0x46

    const/4 v9, 0x4

    move-object/from16 v6, p1

    move v7, v8

    move v8, v9

    invoke-static/range {v1 .. v8}, Lcn/jianyun/workplan/ui/component/form/DialogViewKt;->SortDialogView(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    :cond_26c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_275

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_275
    :goto_275
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass11 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 133
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->doSort(Ljava/util/List;)V

    .line 135
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$11;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    new-instance v6, Lcn/jianyun/workplan/model/FormType;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass12 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 133
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 9

    .line 137
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$12;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    new-instance v7, Lcn/jianyun/workplan/model/FormType;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.C02412 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 21

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "it"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ""

    .line 96
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4e

    .line 97
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1ffd

    const/16 v17, 0x0

    move-object/from16 v3, p1

    move-object/from16 v18, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-static/range {v1 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->copy$default(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v2, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    .line 98
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->save()V

    const/4 v1, 0x1

    goto :goto_4f

    :cond_4e
    const/4 v1, 0x0

    .line 102
    :goto_4f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 92
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$2;->invoke(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass3 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 92
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 2

    .line 106
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->resetForm()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass4 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 112
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 2

    .line 113
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$4;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->resetForm()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass5 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 114
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 2

    .line 115
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$5;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->makeCurrentProject()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass6 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 114
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 5

    .line 117
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$6;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    sget-object v1, Lcn/jianyun/workplan/model/FormType;->Companion:Lcn/jianyun/workplan/model/FormType$Companion;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lcn/jianyun/workplan/model/FormType$Companion;->edit$default(Lcn/jianyun/workplan/model/FormType$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass7 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 114
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 5

    .line 119
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$7;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    sget-object v1, Lcn/jianyun/workplan/model/FormType;->Companion:Lcn/jianyun/workplan/model/FormType$Companion;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lcn/jianyun/workplan/model/FormType$Companion;->delete$default(Lcn/jianyun/workplan/model/FormType$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lcn/jianyun/workplan/model/FormType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass8 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 124
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 2

    .line 125
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$8;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->doDelete()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass2.AnonymousClass9 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 124
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 2

    .line 127
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$9;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->resetForm()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 65
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 9

    .line 66
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    .line 67
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    new-instance v7, Lcn/jianyun/workplan/model/FormType;

    const-string v2, "detail"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 65
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .registers 3

    .line 69
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getDatalist()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1d

    .line 70
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    const-string v1, "\u81f3\u5c11\u4fdd\u7559\u4e00\u4e2a\u9879\u76ee"

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->toast(Ljava/lang/String;)V

    goto :goto_31

    .line 73
    :cond_1d
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V

    .line 74
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$2;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->doDelete()V

    :goto_31
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleProjectManagerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,144:1\n154#2:145\n74#3,6:146\n80#3:180\n84#3:185\n79#4,11:152\n92#4:184\n456#5,8:163\n464#5,3:177\n467#5,3:181\n3737#6,6:171\n*S KotlinDebug\n*F\n+ 1 ScheduleProjectManagerView.kt\ncn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3\n*L\n77#1:145\n77#1:146,6\n77#1:180\n77#1:185\n77#1:152,11\n77#1:184\n77#1:163,8\n77#1:177,3\n77#1:181,3\n77#1:171,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 76
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .registers 14

    and-int/lit8 v1, p2, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_11

    .line 77
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_11

    .line 86
    :cond_c
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_12d

    .line 77
    :cond_11
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_20

    const/4 v1, -0x1

    const-string v2, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous>.<anonymous>.<anonymous> (ScheduleProjectManagerView.kt:75)"

    const v3, 0x1dbb5118

    invoke-static {v3, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0xf

    int-to-float v1, v1

    .line 145
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 77
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget-object v7, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const v2, -0x1cd0f17e

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo"

    invoke-static {p1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 146
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    .line 147
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v3

    const/4 v4, 0x0

    .line 150
    invoke-static {v2, v3, p1, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    const v3, -0x4ee9b9da

    .line 151
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const-string v3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh"

    invoke-static {p1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 152
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 153
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 155
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    .line 162
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    .line 163
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v8

    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    if-nez v8, :cond_77

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 164
    :cond_77
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 165
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-eqz v8, :cond_84

    .line 166
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_87

    .line 168
    :cond_84
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 170
    :goto_87
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 157
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v6, v2, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 172
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_b7

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c5

    .line 173
    :cond_b7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 177
    :cond_c5
    invoke-static {p1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, p1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    .line 178
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, 0x107e0298

    const-string v2, "C79@3979L9:Column.kt#2w3rfo"

    .line 180
    invoke-static {p1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 78
    new-instance v4, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;

    invoke-direct {v4, v7, v1}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;-><init>(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const v1, 0x49e774c4    # 1896088.5f

    const/4 v5, 0x1

    invoke-static {p1, v1, v5, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/16 v5, 0xc00

    const/4 v6, 0x7

    move v1, v2

    move v2, v3

    move-object v3, v4

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcn/jianyun/workplan/ui/component/nav/BoxViewKt;->VerticalRow-djqs-MU(Landroidx/compose/ui/Modifier;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 85
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getGmtCreate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3e

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Lcn/jianyun/workplan/ui/component/nav/BoxViewKt;->OnlySmallTipText-8TGbp0M(Ljava/lang/String;IJJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 180
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 181
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 182
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 183
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 184
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 185
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_12d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_12d
    :goto_12d
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field final synthetic $viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 78
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .registers 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_14

    .line 79
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_14

    .line 83
    :cond_10
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_89

    .line 79
    :cond_14
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_23

    const/4 v2, -0x1

    const-string v3, "cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleProjectManagerView.kt:77)"

    const v4, 0x49e774c4    # 1896088.5f

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_23
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const v26, 0x1fffe

    move-object/from16 v23, p1

    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v14, p1

    .line 80
    invoke-static {v3, v14, v1, v2}, Lcn/jianyun/workplan/util/CommonUIKt;->Blank-kHDZbjc(FLandroidx/compose/runtime/Composer;II)V

    .line 81
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$2$1$3$1$1;->$viewModel:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_80

    const-string v4, "\u5f53\u524d\u9879\u76ee"

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x6

    const/16 v16, 0xfe

    move-object/from16 v14, p1

    .line 82
    invoke-static/range {v4 .. v16}, Lcn/jianyun/workplan/ui/component/nav/PartTitleViewKt;->TagView-o4cevVk(Ljava/lang/String;JZFZJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    :cond_80
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_89

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_89
    :goto_89
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt.AnonymousClass3 (cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3)
.class final Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ScheduleProjectManagerView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt;->ScheduleProjectManagerView(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $navHostController:Landroidx/navigation/NavHostController;


# direct methods
.method constructor <init>(Landroidx/navigation/NavHostController;I)V
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;->$navHostController:Landroidx/navigation/NavHostController;

    iput p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .registers 4

    iget-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;->$navHostController:Landroidx/navigation/NavHostController;

    iget v0, p0, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt$ScheduleProjectManagerView$3;->$$changed:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v0

    invoke-static {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt;->ScheduleProjectManagerView(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
