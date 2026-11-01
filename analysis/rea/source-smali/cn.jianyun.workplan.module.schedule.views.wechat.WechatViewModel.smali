// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel (cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel)
.class public final Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;
.super Lcn/jianyun/workplan/module/base/vm/BaseViewModel;
.source "WechatView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWechatView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WechatView.kt\ncn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,149:1\n81#2:150\n107#2,2:151\n*S KotlinDebug\n*F\n+ 1 WechatView.kt\ncn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel\n*L\n69#1:150\n69#1:151,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0008\u0010\u001c\u001a\u00020\u0003H\u0016J\u0008\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006!"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;",
        "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;",
        "baseRepository",
        "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "scheduleService",
        "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "shareApi",
        "Lcn/jianyun/workplan/api/ShareApi;",
        "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lcn/jianyun/workplan/api/ShareApi;)V",
        "getBaseRepository",
        "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "getScheduleService",
        "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "getShareApi",
        "()Lcn/jianyun/workplan/api/ShareApi;",
        "<set-?>",
        "",
        "userUuid",
        "getUserUuid",
        "()Ljava/lang/String;",
        "setUserUuid",
        "(Ljava/lang/String;)V",
        "userUuid$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "doSave",
        "",
        "navHostController",
        "Landroidx/navigation/NavHostController;",
        "getRepository",
        "reload",
        "reloadData",
        "dataChanged",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

.field private final scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

.field private final shareApi:Lcn/jianyun/workplan/api/ShareApi;

.field private final userUuid$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lcn/jianyun/workplan/api/ShareApi;)V
    .registers 5
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "baseRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;-><init>()V

    .line 63
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    .line 64
    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    .line 65
    iput-object p3, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->shareApi:Lcn/jianyun/workplan/api/ShareApi;

    const/4 p1, 0x0

    const/4 p2, 0x2

    const-string p3, ""

    .line 69
    invoke-static {p3, p1, p2, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->userUuid$delegate:Landroidx/compose/runtime/MutableState;

    .line 71
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->reload()V

    return-void
.end method


# virtual methods
.method public final doSave(Landroidx/navigation/NavHostController;)V
    .registers 9

    const-string v0, "navHostController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getUserUuid()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 80
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const-string v0, "\u7528\u6237ID\u4e0d\u80fd\u4e3a\u7a7a"

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    return-void

    .line 83
    :cond_19
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getUserUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2d

    .line 84
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const-string v0, "\u7528\u6237ID\u662f8\u4f4d\u5594"

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    return-void

    .line 87
    :cond_2d
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 63
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public getRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .registers 2

    .line 64
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    return-object v0
.end method

.method public final getShareApi()Lcn/jianyun/workplan/api/ShareApi;
    .registers 2

    .line 65
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->shareApi:Lcn/jianyun/workplan/api/ShareApi;

    return-object v0
.end method

.method public final getUserUuid()Ljava/lang/String;
    .registers 2

    .line 69
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->userUuid$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 150
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public reload()V
    .registers 8

    .line 139
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public reloadData(Z)V
    .registers 2

    return-void
.end method

.method public final setUserUuid(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->userUuid$delegate:Landroidx/compose/runtime/MutableState;

    .line 151
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$doSave$1)
.class final Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WechatView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->doSave(Landroidx/navigation/NavHostController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWechatView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WechatView.kt\ncn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1855#2:150\n1855#2,2:151\n1855#2:153\n1549#2:154\n1620#2,2:155\n223#2,2:157\n1622#2:159\n1856#2:160\n1855#2,2:161\n1856#2:163\n*S KotlinDebug\n*F\n+ 1 WechatView.kt\ncn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1\n*L\n102#1:150\n105#1:151,2\n109#1:153\n111#1:154\n111#1:155,2\n116#1:157,2\n111#1:159\n109#1:160\n123#1:161,2\n102#1:163\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$doSave$1"
    f = "WechatView.kt"
    i = {
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x6
    }
    l = {
        0x59,
        0x5a,
        0x5b,
        0x67,
        0x6b,
        0x79,
        0x7c,
        0x81
    }
    m = "invokeSuspend"
    n = {
        "projects",
        "pro",
        "projects",
        "pro",
        "i",
        "projects",
        "pro",
        "projects"
    }
    s = {
        "L$0",
        "L$3",
        "L$0",
        "L$3",
        "L$4",
        "L$0",
        "L$3",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $navHostController:Landroidx/navigation/NavHostController;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->$navHostController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->$navHostController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 42

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 87
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_364

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_16
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v0

    goto/16 :goto_33c

    :pswitch_1c
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v8

    move-object v8, v7

    move-object v7, v0

    goto/16 :goto_2d3

    :pswitch_34
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/api/dto/ProjectDTO;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v9

    move-object v9, v7

    move-object v7, v0

    goto/16 :goto_2c5

    :pswitch_50
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/api/dto/ProjectDTO;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v0

    goto/16 :goto_171

    :pswitch_72
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/api/dto/ProjectDTO;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v0

    goto/16 :goto_158

    :pswitch_8b
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_e9

    :pswitch_91
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_d3

    :pswitch_95
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_bf

    :pswitch_99
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoading(Z)V

    .line 89
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v2

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getUserUuid()Ljava/lang/String;

    move-result-object v6

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    const-string v8, "wechatUserUuid"

    invoke-virtual {v2, v8, v6, v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_bf

    return-object v1

    .line 90
    :cond_bf
    :goto_bf
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v2

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    const-string v7, "wechatImport"

    invoke-virtual {v2, v7, v6}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_d3

    return-object v1

    .line 91
    :cond_d3
    :goto_d3
    new-instance v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1$data$1;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-direct {v2, v6, v5}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1$data$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    const/4 v7, 0x3

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-static {v2, v6}, Lcn/jianyun/workplan/util/CommonToolKt;->withApi(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_e9

    return-object v1

    .line 87
    :cond_e9
    :goto_e9
    check-cast v2, Lcn/jianyun/workplan/api/ApiResult;

    .line 95
    invoke-virtual {v2}, Lcn/jianyun/workplan/api/ApiResult;->getSuccess()Z

    move-result v6

    if-eqz v6, :cond_357

    .line 96
    invoke-virtual {v2}, Lcn/jianyun/workplan/api/ApiResult;->getResult()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    .line 97
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_117

    .line 98
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u6ca1\u6709\u6570\u636e"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 99
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 100
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 102
    :cond_117
    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    .line 150
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v2

    move-object v2, v0

    :goto_122
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_307

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcn/jianyun/workplan/api/dto/ProjectDTO;

    .line 103
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v10

    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleProjectDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    move-result-object v10

    invoke-virtual {v9}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->toProject()Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    move-result-object v11

    iput-object v8, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    iput-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    const/4 v12, 0x4

    iput v12, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-interface {v10, v11, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_150

    return-object v1

    :cond_150
    move-object/from16 v39, v6

    move-object v6, v2

    move-object v2, v9

    move-object v9, v8

    move-object v8, v7

    move-object/from16 v7, v39

    .line 104
    :goto_158
    new-instance v10, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 105
    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->getWorks()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .line 151
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object/from16 v39, v8

    move-object v8, v2

    move-object v2, v11

    move-object v11, v9

    move-object v9, v7

    move-object v7, v6

    move-object v6, v10

    move-object/from16 v10, v39

    :cond_171
    :goto_171
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1d6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcn/jianyun/workplan/api/dto/WorkDTO;

    .line 106
    iget v13, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v13, v4

    iput v13, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 107
    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v13

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object v13

    invoke-virtual {v12}, Lcn/jianyun/workplan/api/dto/WorkDTO;->toWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    iget v12, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move/from16 v25, v12

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const v35, 0xffbff

    const/16 v36, 0x0

    invoke-static/range {v14 .. v36}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->copy$default(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v12

    iput-object v11, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    iput-object v10, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    iput-object v9, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    iput-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    iput-object v6, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    iput-object v2, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    const/4 v14, 0x5

    iput v14, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-interface {v13, v12, v7}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v1, :cond_171

    return-object v1

    .line 109
    :cond_1d6
    invoke-virtual {v8}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->getPlans()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 153
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v6, v8

    move-object v8, v10

    :goto_1e2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2c8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcn/jianyun/workplan/api/dto/PlanDTO;

    .line 110
    invoke-virtual {v10}, Lcn/jianyun/workplan/api/dto/PlanDTO;->toPlan()Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    move-result-object v12

    .line 111
    invoke-virtual {v10}, Lcn/jianyun/workplan/api/dto/PlanDTO;->getDetail()Ljava/lang/String;

    move-result-object v10

    move-object v13, v10

    check-cast v13, Ljava/lang/CharSequence;

    const-string v10, ","

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x6

    const/16 v18, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    .line 154
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v10, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .line 155
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_21d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_299

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 156
    check-cast v14, Ljava/lang/String;

    const-string v15, "empty"

    .line 112
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_266

    .line 113
    new-instance v14, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object/from16 v16, v14

    const-string v17, "empty"

    const-string v18, "\u7a7a"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v37, 0xffffc

    const/16 v38, 0x0

    invoke-direct/range {v16 .. v38}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_28a

    .line 116
    :cond_266
    invoke-virtual {v6}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->getWorks()Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    .line 157
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_270
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_291

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcn/jianyun/workplan/api/dto/WorkDTO;

    .line 116
    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/api/dto/WorkDTO;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28f

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/api/dto/WorkDTO;->toWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v14

    .line 156
    :goto_28a
    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x2

    goto :goto_21d

    :cond_28f
    const/4 v3, 0x2

    goto :goto_270

    .line 158
    :cond_291
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 159
    :cond_299
    check-cast v13, Ljava/util/List;

    .line 120
    invoke-static {v13}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v10, "toJSONString(workPlans)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->setConfig(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v3

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    move-result-object v3

    iput-object v11, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    iput-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    iput-object v9, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    iput-object v6, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    iput-object v2, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    iput-object v5, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    const/4 v10, 0x6

    iput v10, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-interface {v3, v12, v7}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->insert(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2c5

    return-object v1

    :cond_2c5
    :goto_2c5
    const/4 v3, 0x2

    goto/16 :goto_1e2

    .line 123
    :cond_2c8
    invoke-virtual {v6}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->getDutys()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 161
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v6, v9

    :cond_2d3
    :goto_2d3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_301

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcn/jianyun/workplan/api/dto/DutyDTO;

    .line 124
    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v9

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v9

    invoke-virtual {v3}, Lcn/jianyun/workplan/api/dto/DutyDTO;->toDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v3

    iput-object v11, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    iput-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    iput-object v6, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    iput-object v2, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    iput-object v5, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    iput-object v5, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    const/4 v10, 0x7

    iput v10, v7, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-interface {v9, v3, v7}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2d3

    return-object v1

    :cond_301
    move-object v2, v7

    move-object v7, v8

    move-object v8, v11

    const/4 v3, 0x2

    goto/16 :goto_122

    .line 128
    :cond_307
    move-object v3, v8

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-eqz v3, :cond_345

    .line 129
    iget-object v3, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcn/jianyun/workplan/api/dto/ProjectDTO;

    invoke-virtual {v4}, Lcn/jianyun/workplan/api/dto/ProjectDTO;->getUuid()Ljava/lang/String;

    move-result-object v4

    move-object v6, v2

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$0:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$1:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$3:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->L$5:Ljava/lang/Object;

    const/16 v7, 0x8

    iput v7, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->label:I

    invoke-virtual {v3, v4, v6}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_33c

    return-object v1

    .line 130
    :cond_33c
    :goto_33c
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 132
    :cond_345
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v3, "\u5bfc\u5165\u6210\u529f"

    invoke-virtual {v1, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 133
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->$navHostController:Landroidx/navigation/NavHostController;

    const/4 v3, 0x2

    invoke-static {v1, v5, v3, v5}, Lcn/jianyun/workplan/util/CommonToolKt;->goBack$default(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_358

    :cond_357
    move-object v2, v0

    .line 135
    :goto_358
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$doSave$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 136
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_364
    .packed-switch 0x0
        :pswitch_99
        :pswitch_95
        :pswitch_91
        :pswitch_8b
        :pswitch_72
        :pswitch_50
        :pswitch_34
        :pswitch_1c
        :pswitch_16
    .end packed-switch
.end method

###### Class cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$reload$1)
.class final Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WechatView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->reload()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$reload$1"
    f = "WechatView.kt"
    i = {}
    l = {
        0x8d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 139
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_46

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 140
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->setOldSid(I)V

    .line 141
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v3

    const-string v4, "wechatUserUuid"

    const/4 v5, 0x0

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    const/4 v7, 0x2

    const/4 v8, 0x0

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel$reload$1;->label:I

    invoke-static/range {v3 .. v8}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_44

    return-object v0

    :cond_44
    move-object v0, p1

    move-object p1, v1

    :goto_46
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;->setUserUuid(Ljava/lang/String;)V

    .line 142
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
