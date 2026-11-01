// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel (cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel)
.class public final Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;
.super Lcn/jianyun/workplan/module/base/vm/BaseViewModel;
.source "ScheduleWorkViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleWorkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n81#2:206\n107#2,2:207\n81#2:209\n107#2,2:210\n81#2:212\n107#2,2:213\n81#2:215\n107#2,2:216\n1549#3:218\n1620#3,3:219\n766#3:222\n857#3,2:223\n288#3,2:225\n288#3,2:227\n*S KotlinDebug\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel\n*L\n32#1:206\n32#1:207,2\n33#1:209\n33#1:210,2\n34#1:212\n34#1:213,2\n35#1:215\n35#1:216,2\n65#1:218\n65#1:219,3\n166#1:222\n166#1:223,2\n183#1:225,2\n190#1:227,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u00020\'2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010,\u001a\u00020\u0013J\u0006\u0010-\u001a\u00020\u0013J\u0008\u0010.\u001a\u00020\u0003H\u0016J\u000e\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\u0013J\u0008\u00101\u001a\u00020\'H\u0016J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020\u001eH\u0016J\u000e\u00104\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u000e\u00105\u001a\u00020\'2\u0006\u00106\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R7\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R7\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00130\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u000e\"\u0004\u0008\u0016\u0010\u0010R+\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u0012\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%\u00a8\u00067"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;",
        "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;",
        "baseRepository",
        "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "scheduleService",
        "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V",
        "getBaseRepository",
        "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "<set-?>",
        "",
        "",
        "choosedWorks",
        "getChoosedWorks",
        "()Ljava/util/List;",
        "setChoosedWorks",
        "(Ljava/util/List;)V",
        "choosedWorks$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
        "datalist",
        "getDatalist",
        "setDatalist",
        "datalist$delegate",
        "editItem",
        "getEditItem",
        "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
        "setEditItem",
        "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V",
        "editItem$delegate",
        "",
        "isDelete",
        "()Z",
        "setDelete",
        "(Z)V",
        "isDelete$delegate",
        "getScheduleService",
        "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "doDelete",
        "",
        "navHostController",
        "Landroidx/navigation/NavHostController;",
        "doSort",
        "newOrderList",
        "fetchFirstWork",
        "fetchSecondWork",
        "getRepository",
        "initModel",
        "model",
        "reload",
        "reloadData",
        "dataChanged",
        "save",
        "toggleWork",
        "workUuid",
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

.field private final choosedWorks$delegate:Landroidx/compose/runtime/MutableState;

.field private final datalist$delegate:Landroidx/compose/runtime/MutableState;

.field private final editItem$delegate:Landroidx/compose/runtime/MutableState;

.field private final isDelete$delegate:Landroidx/compose/runtime/MutableState;

.field private final scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V
    .registers 30
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "baseRepository"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scheduleService"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct/range {p0 .. p0}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;-><init>()V

    .line 28
    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    .line 29
    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v1, 0x0

    .line 32
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->isDelete$delegate:Landroidx/compose/runtime/MutableState;

    .line 33
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->datalist$delegate:Landroidx/compose/runtime/MutableState;

    .line 34
    new-instance v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v4, v1

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

    const v25, 0xfffff

    const/16 v26, 0x0

    invoke-direct/range {v4 .. v26}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->editItem$delegate:Landroidx/compose/runtime/MutableState;

    .line 35
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->choosedWorks$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, "ScheduleWorkView"

    .line 38
    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setCurrentPage(Ljava/lang/String;)V

    .line 39
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->reload()V

    return-void
.end method

.method public static final synthetic access$toast$s-998435949(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Ljava/lang/String;)V
    .registers 2

    .line 26
    invoke-super {p0, p1}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;->toast(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final doDelete(Landroidx/navigation/NavHostController;)V
    .registers 9

    const-string v0, "navHostController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final doSort(Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "newOrderList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final fetchFirstWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;
    .registers 26

    .line 180
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6c

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_6c

    .line 183
    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 225
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_40

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 183
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_41

    :cond_40
    const/4 v1, 0x0

    :goto_41
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-nez v1, :cond_6b

    new-instance v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v2, v1

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfffff

    const/16 v24, 0x0

    invoke-direct/range {v2 .. v24}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6b
    return-object v1

    .line 181
    :cond_6c
    :goto_6c
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v2, v0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfffff

    const/16 v24, 0x0

    invoke-direct/range {v2 .. v24}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final fetchSecondWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;
    .registers 26

    .line 187
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6d

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_6d

    .line 190
    :cond_16
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 227
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 190
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_42

    :cond_41
    const/4 v1, 0x0

    :goto_42
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-nez v1, :cond_6c

    new-instance v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v2, v1

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfffff

    const/16 v24, 0x0

    invoke-direct/range {v2 .. v24}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6c
    return-object v1

    .line 188
    :cond_6d
    :goto_6d
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v2, v0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0xfffff

    const/16 v24, 0x0

    invoke-direct/range {v2 .. v24}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 28
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getChoosedWorks()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->choosedWorks$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 215
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getDatalist()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->datalist$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 209
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;
    .registers 2

    .line 34
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->editItem$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 212
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    return-object v0
.end method

.method public getRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 43
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .registers 2

    .line 29
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    return-object v0
.end method

.method public final initModel(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getInited()Z

    move-result v0

    if-eqz v0, :cond_c

    return-void

    :cond_c
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setInited(Z)V

    .line 63
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V

    .line 64
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getComplex()Z

    move-result v0

    if-eqz v0, :cond_54

    .line 65
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getConfig()Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/JSON;->parseArray(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    const-string v0, "parseArray(model.config, ScheduleWork::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 218
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 219
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 220
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 65
    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v1

    .line 220
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    .line 221
    :cond_4f
    check-cast v0, Ljava/util/List;

    .line 65
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setChoosedWorks(Ljava/util/List;)V

    :cond_54
    return-void
.end method

.method public final isDelete()Z
    .registers 2

    .line 32
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->isDelete$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 206
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public reload()V
    .registers 2

    .line 47
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result v0

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setOldSid(I)V

    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->reloadData(Z)V

    return-void
.end method

.method public reloadData(Z)V
    .registers 8

    .line 52
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;

    const/4 v3, 0x0

    invoke-direct {p1, p0, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final save(Landroidx/navigation/NavHostController;)V
    .registers 9

    const-string v0, "navHostController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setChoosedWorks(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->choosedWorks$delegate:Landroidx/compose/runtime/MutableState;

    .line 216
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDatalist(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->datalist$delegate:Landroidx/compose/runtime/MutableState;

    .line 210
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDelete(Z)V
    .registers 3

    .line 32
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->isDelete$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 207
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setEditItem(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->editItem$delegate:Landroidx/compose/runtime/MutableState;

    .line 213
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final toggleWork(Ljava/lang/String;)V
    .registers 6

    const-string v0, "workUuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3f

    .line 166
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 222
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 223
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    .line 166
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_20

    .line 223
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 224
    :cond_39
    check-cast v1, Ljava/util/List;

    .line 166
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setChoosedWorks(Ljava/util/List;)V

    goto :goto_64

    .line 169
    :cond_3f
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_54

    .line 170
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const-string v0, "\u6700\u591a\u9009\u62e9\u4e24\u4e2a\u666e\u901a\u73ed\u6b21"

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    return-void

    .line 173
    :cond_54
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 174
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setChoosedWorks(Ljava/util/List;)V

    :goto_64
    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doDelete$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleWorkViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->doDelete(Landroidx/navigation/NavHostController;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doDelete$1"
    f = "ScheduleWorkViewModel.kt"
    i = {}
    l = {
        0x96,
        0x98
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $navHostController:Landroidx/navigation/NavHostController;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->$navHostController:Landroidx/navigation/NavHostController;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->$navHostController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 147
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_1e

    if-eq v1, v2, :cond_1a

    if-ne v1, v3, :cond_12

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6e

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_1e
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 149
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 150
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v1

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->label:I

    invoke-virtual {p1, v1, v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->isWorkUsed(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4a

    return-object v0

    .line 147
    :cond_4a
    :goto_4a
    check-cast p1, Ljava/lang/String;

    .line 151
    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->isOk(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_83

    .line 152
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->label:I

    invoke-interface {p1, v1, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->delete(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6e

    return-object v0

    .line 153
    :cond_6e
    :goto_6e
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->resetForm()V

    .line 154
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 155
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->$navHostController:Landroidx/navigation/NavHostController;

    const/4 v0, 0x0

    invoke-static {p1, v0, v3, v0}, Lcn/jianyun/workplan/util/CommonToolKt;->goBack$default(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_8d

    .line 158
    :cond_83
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->resetForm()V

    .line 159
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doDelete$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-static {v0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->access$toast$s-998435949(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Ljava/lang/String;)V

    .line 161
    :goto_8d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doSort$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleWorkViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->doSort(Ljava/util/List;)V
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
    value = "SMAP\nScheduleWorkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1855#2,2:206\n*S KotlinDebug\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1\n*L\n195#1:206,2\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doSort$1"
    f = "ScheduleWorkViewModel.kt"
    i = {}
    l = {
        0xc7
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $newOrderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->$newOrderList:Ljava/util/List;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->$newOrderList:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 194
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_23

    if-ne v1, v2, :cond_1b

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_38

    :cond_1b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 195
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->$newOrderList:Ljava/util/List;

    iget-object v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 206
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, v1

    move-object v1, p1

    :goto_38
    move-object p1, p0

    :cond_39
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_67

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 196
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v6

    .line 198
    invoke-virtual {v5, v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setOrdinal(I)V

    .line 199
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v6

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object v6

    iput-object v4, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$0:Ljava/lang/Object;

    iput-object v3, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$1:Ljava/lang/Object;

    iput-object v1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->L$2:Ljava/lang/Object;

    iput v2, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->label:I

    invoke-interface {v6, v5, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_39

    return-object v0

    .line 201
    :cond_67
    iget-object p1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$doSort$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->reload()V

    .line 202
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$reloadData$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleWorkViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->reloadData(Z)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$reloadData$1"
    f = "ScheduleWorkViewModel.kt"
    i = {}
    l = {
        0x35,
        0x36
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 52
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_26

    if-eq v1, v3, :cond_1e

    if-ne v1, v2, :cond_16

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_58

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->label:I

    invoke-virtual {p1, v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3d

    return-object v0

    :cond_3d
    :goto_3d
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$reloadData$1;->label:I

    invoke-virtual {v1, v3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentWorkData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_56

    return-object v0

    :cond_56
    move-object v0, p1

    move-object p1, v1

    :goto_58
    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setDatalist(Ljava/util/List;)V

    .line 55
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$save$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleWorkViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->save(Landroidx/navigation/NavHostController;)V
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
    value = "SMAP\nScheduleWorkViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JSON.kt\ncom/alibaba/fastjson2/JSONKt\n*L\n1#1,205:1\n1549#2:206\n1620#2,2:207\n223#2,2:209\n1622#2:211\n766#2:213\n857#2,2:214\n766#2:216\n857#2,2:217\n1855#2:219\n1864#2,3:220\n1856#2:224\n1855#2:225\n1864#2,3:226\n1856#2:230\n537#3:212\n537#3:223\n537#3:229\n*S KotlinDebug\n*F\n+ 1 ScheduleWorkViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1\n*L\n78#1:206\n78#1:207,2\n79#1:209,2\n78#1:211\n84#1:213\n84#1:214,2\n98#1:216\n98#1:217,2\n104#1:219\n108#1:220,3\n104#1:224\n120#1:225\n123#1:226,3\n120#1:230\n80#1:212\n113#1:223\n128#1:229\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$save$1"
    f = "ScheduleWorkViewModel.kt"
    i = {}
    l = {
        0x5e,
        0x72,
        0x76,
        0x81,
        0x84
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $navHostController:Landroidx/navigation/NavHostController;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->$navHostController:Landroidx/navigation/NavHostController;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->$navHostController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;Landroidx/navigation/NavHostController;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 19

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 70
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v2, :cond_53

    if-eq v2, v7, :cond_4e

    if-eq v2, v8, :cond_40

    if-eq v2, v5, :cond_38

    if-eq v2, v4, :cond_29

    if-ne v2, v3, :cond_21

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v0

    goto/16 :goto_36f

    :cond_21
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_29
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v0

    move v10, v4

    goto/16 :goto_2c7

    :cond_38
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    move-object v3, v0

    goto/16 :goto_2bc

    :cond_40
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v0

    goto/16 :goto_29f

    :cond_4e
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1ac

    :cond_53
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->isValid()Ljava/lang/String;

    move-result-object v2

    .line 72
    invoke-static {v2}, Lcn/jianyun/workplan/util/CommonToolKt;->isOk(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_39e

    .line 73
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getComplex()Z

    move-result v2

    if-eqz v2, :cond_f6

    .line 74
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v2, v8, :cond_8c

    .line 75
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u5fc5\u987b\u9009\u62e9\u4e24\u4e2a\u666e\u901a\u73ed\u6b21"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 76
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 78
    :cond_8c
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getChoosedWorks()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    iget-object v11, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 206
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .line 207
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_ad
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 208
    check-cast v13, Ljava/lang/String;

    .line 79
    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .line 209
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_c3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e0

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 79
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_de

    .line 208
    invoke-interface {v12, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x5

    goto :goto_ad

    :cond_de
    const/4 v3, 0x5

    goto :goto_c3

    .line 210
    :cond_e0
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 211
    :cond_e8
    check-cast v12, Ljava/util/List;

    .line 212
    invoke-static {v12}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v10, "choosedWorks.map{one ->\n\u2026         }.toJSONString()"

    .line 80
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setConfig(Ljava/lang/String;)V

    .line 83
    :cond_f6
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->isAdd()Z

    move-result v2

    const-string v3, "\u5b58\u5728\u76f8\u540c\u540d\u79f0"

    if-eqz v2, :cond_1ba

    .line 84
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 213
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 214
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_119
    :goto_119
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 84
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v11

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_119

    .line 214
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_119

    .line 215
    :cond_13c
    check-cast v5, Ljava/util/List;

    .line 84
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_150

    .line 85
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 86
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 88
    :cond_150
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setUuid(Ljava/lang/String;)V

    .line 89
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setProjectUuid(Ljava/lang/String;)V

    .line 90
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x64

    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setOrdinal(I)V

    .line 92
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v2

    const-string v3, "add work"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 94
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object v2

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v3

    move-object v4, v0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    invoke-interface {v2, v3, v4}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1ac

    return-object v1

    .line 95
    :cond_1ac
    :goto_1ac
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u6dfb\u52a0\u6210\u529f"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    move-object v3, v0

    goto/16 :goto_37f

    .line 98
    :cond_1ba
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 216
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .line 217
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1cf
    :goto_1cf
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1f2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 98
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v13

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1cf

    .line 217
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1cf

    .line 218
    :cond_1f2
    check-cast v10, Ljava/util/List;

    .line 98
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v8, :cond_206

    .line 99
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 100
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 104
    :cond_206
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getDatalist()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 219
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v7, v3

    move-object v3, v0

    :goto_216
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2a2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 105
    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getConfig()Ljava/lang/String;

    move-result-object v11

    check-cast v11, Ljava/lang/CharSequence;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v12

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v11, v12, v6, v8, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_29f

    .line 107
    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getConfig()Ljava/lang/String;

    move-result-object v11

    const-class v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/JSON;->parseArray(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v11

    const-string v12, "works"

    .line 108
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    .line 221
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v13, v6

    :goto_24f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_27e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v13, 0x1

    if-gez v13, :cond_260

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_260
    check-cast v14, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 109
    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27b

    .line 110
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v4

    invoke-interface {v11, v13, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_27b
    move v13, v15

    const/4 v4, 0x4

    goto :goto_24f

    .line 223
    :cond_27e
    invoke-static {v11}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v11, "works.toJSONString()"

    .line 113
    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setConfig(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object v4

    iput-object v7, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    iput v8, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    invoke-interface {v4, v10, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_29f

    return-object v1

    :cond_29f
    :goto_29f
    const/4 v4, 0x4

    goto/16 :goto_216

    .line 118
    :cond_2a2
    iget-object v2, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    move-result-object v2

    move-object v4, v3

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    iput v5, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    invoke-interface {v2, v4}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2bc

    return-object v1

    .line 70
    :cond_2bc
    :goto_2bc
    check-cast v2, Ljava/util/List;

    .line 120
    check-cast v2, Ljava/lang/Iterable;

    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    .line 225
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v5, v4

    :cond_2c7
    :goto_2c7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_34e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 121
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->getConfig()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v10

    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v7, v10, v6, v8, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_34b

    .line 122
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->fetchPlans()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v7

    .line 123
    move-object v10, v7

    check-cast v10, Ljava/lang/Iterable;

    .line 227
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v11, v6

    :goto_2fb
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_329

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v11, 0x1

    if-gez v11, :cond_30c

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_30c
    check-cast v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 124
    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v14

    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_327

    .line 125
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v12

    invoke-interface {v7, v11, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_327
    move v11, v13

    goto :goto_2fb

    .line 229
    :cond_329
    invoke-static {v7}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "plans.toJSONString()"

    .line 128
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->setConfig(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    move-result-object v7

    iput-object v5, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    iput-object v2, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    const/4 v10, 0x4

    iput v10, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    invoke-interface {v7, v4, v3}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->update(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_2c7

    return-object v1

    :cond_34b
    const/4 v10, 0x4

    goto/16 :goto_2c7

    .line 132
    :cond_34e
    iget-object v2, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object v2

    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getEditItem()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v4

    move-object v5, v3

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->L$1:Ljava/lang/Object;

    const/4 v6, 0x5

    iput v6, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->label:I

    invoke-interface {v2, v4, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_36f

    return-object v1

    .line 133
    :cond_36f
    :goto_36f
    iget-object v1, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->reload()V

    .line 134
    iget-object v1, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u7f16\u8f91\u6210\u529f"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 136
    :goto_37f
    iget-object v1, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 137
    iget-object v1, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    new-instance v2, Lcn/jianyun/workplan/model/FormType;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x7

    const/4 v15, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    .line 138
    iget-object v1, v3, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->$navHostController:Landroidx/navigation/NavHostController;

    invoke-static {v1, v9, v8, v9}, Lcn/jianyun/workplan/util/CommonToolKt;->goBack$default(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_3a7

    .line 141
    :cond_39e
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel$save$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 143
    :goto_3a7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
