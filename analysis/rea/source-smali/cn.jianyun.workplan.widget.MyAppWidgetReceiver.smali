// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.widget.MyAppWidgetReceiver
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.widget.MyAppWidgetReceiver (cn.jianyun.workplan.widget.MyAppWidgetReceiver)
.class public final Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;
.super Lcn/jianyun/workplan/widget/Hilt_MyAppWidgetReceiver;
.source "MyAppWidgetReceiver.kt"


# annotations
.annotation runtime Ldagger/hilt/android/AndroidEntryPoint;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;",
        "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;",
        "()V",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "glanceAppWidget",
        "Landroidx/glance/appwidget/GlanceAppWidget;",
        "getGlanceAppWidget",
        "()Landroidx/glance/appwidget/GlanceAppWidget;",
        "scheduleService",
        "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "getScheduleService",
        "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "setScheduleService",
        "(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V",
        "observeData",
        "",
        "context",
        "Landroid/content/Context;",
        "currentDate",
        "",
        "adjustMonth",
        "",
        "onEnabled",
        "onReceive",
        "intent",
        "Landroid/content/Intent;",
        "onUpdate",
        "appWidgetManager",
        "Landroid/appwidget/AppWidgetManager;",
        "appWidgetIds",
        "",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;

.field private static final currentData:Landroidx/datastore/preferences/core/Preferences$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/core/Preferences$Key<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final glanceAppWidget:Landroidx/glance/appwidget/GlanceAppWidget;

.field public scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->Companion:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;

    const/16 v0, 0x8

    sput v0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->$stable:I

    const-string v0, "currentData"

    .line 76
    invoke-static {v0}, Landroidx/datastore/preferences/core/PreferencesKeys;->stringKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->currentData:Landroidx/datastore/preferences/core/Preferences$Key;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 23
    invoke-direct {p0}, Lcn/jianyun/workplan/widget/Hilt_MyAppWidgetReceiver;-><init>()V

    .line 25
    invoke-static {}, Lkotlinx/coroutines/CoroutineScopeKt;->MainScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    iput-object v0, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 28
    new-instance v0, Lcn/jianyun/timetable/widget/AppWidgetView;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcn/jianyun/timetable/widget/AppWidgetView;-><init>(I)V

    check-cast v0, Landroidx/glance/appwidget/GlanceAppWidget;

    iput-object v0, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->glanceAppWidget:Landroidx/glance/appwidget/GlanceAppWidget;

    return-void
.end method

.method public static final synthetic access$getCurrentData$cp()Landroidx/datastore/preferences/core/Preferences$Key;
    .registers 1

    .line 22
    sget-object v0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->currentData:Landroidx/datastore/preferences/core/Preferences$Key;

    return-object v0
.end method

.method private final observeData(Landroid/content/Context;Ljava/lang/String;I)V
    .registers 14

    .line 62
    iget-object v0, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v9, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;

    const/4 v8, 0x0

    move-object v3, v9

    move-object v4, p0

    move-object v5, p2

    move v6, p3

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;-><init>(Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;Ljava/lang/String;ILandroid/content/Context;Lkotlin/coroutines/Continuation;)V

    move-object v3, v9

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public getGlanceAppWidget()Landroidx/glance/appwidget/GlanceAppWidget;
    .registers 2

    .line 28
    iget-object v0, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->glanceAppWidget:Landroidx/glance/appwidget/GlanceAppWidget;

    return-object v0
.end method

.method public final getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .registers 2

    .line 31
    iget-object v0, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    const-string v0, "scheduleService"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onEnabled(Landroid/content/Context;)V
    .registers 2

    .line 34
    invoke-super {p0, p1}, Lcn/jianyun/workplan/widget/Hilt_MyAppWidgetReceiver;->onEnabled(Landroid/content/Context;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-super {p0, p1, p2}, Lcn/jianyun/workplan/widget/Hilt_MyAppWidgetReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    const-string v0, "adjustMonth"

    .line 48
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "currentDate"

    .line 49
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_1d

    const-string v0, "0"

    :cond_1d
    if-nez v1, :cond_28

    .line 54
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 56
    :cond_28
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v2, "updateAction"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3e

    .line 57
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-direct {p0, p1, v1, p2}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->observeData(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_3e
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appWidgetManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appWidgetIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-super {p0, p1, p2, p3}, Lcn/jianyun/workplan/widget/Hilt_MyAppWidgetReceiver;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 43
    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-static {p2}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "toDateString(Date())"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->observeData(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public final setScheduleService(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    return-void
.end method

###### Class cn.jianyun.workplan.widget.MyAppWidgetReceiver.Companion (cn.jianyun.workplan.widget.MyAppWidgetReceiver$Companion)
.class public final Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;
.super Ljava/lang/Object;
.source "MyAppWidgetReceiver.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;",
        "",
        "()V",
        "currentData",
        "Landroidx/datastore/preferences/core/Preferences$Key;",
        "",
        "getCurrentData",
        "()Landroidx/datastore/preferences/core/Preferences$Key;",
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


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .registers 2

    invoke-direct {p0}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCurrentData()Landroidx/datastore/preferences/core/Preferences$Key;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/core/Preferences$Key<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    invoke-static {}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->access$getCurrentData$cp()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    return-object v0
.end method

###### Class cn.jianyun.workplan.widget.MyAppWidgetReceiver.AnonymousClass1 (cn.jianyun.workplan.widget.MyAppWidgetReceiver$observeData$1)
.class final Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "MyAppWidgetReceiver.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->observeData(Landroid/content/Context;Ljava/lang/String;I)V
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
    value = "SMAP\nMyAppWidgetReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyAppWidgetReceiver.kt\ncn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1855#2,2:80\n*S KotlinDebug\n*F\n+ 1 MyAppWidgetReceiver.kt\ncn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1\n*L\n64#1:80,2\n*E\n"
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
    c = "cn.jianyun.workplan.widget.MyAppWidgetReceiver$observeData$1"
    f = "MyAppWidgetReceiver.kt"
    i = {
        0x1,
        0x2,
        0x2,
        0x3
    }
    l = {
        0x3f,
        0x40,
        0x41,
        0x46
    }
    m = "invokeSuspend"
    n = {
        "widgetModel",
        "widgetModel",
        "it",
        "widgetModel"
    }
    s = {
        "L$0",
        "L$0",
        "L$4",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $adjustMonth:I

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $currentDate:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;Ljava/lang/String;ILandroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;",
            "Ljava/lang/String;",
            "I",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->this$0:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    iput-object p2, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$currentDate:Ljava/lang/String;

    iput p3, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$adjustMonth:I

    iput-object p4, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 9
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

    new-instance p1, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;

    iget-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->this$0:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    iget-object v2, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$currentDate:Ljava/lang/String;

    iget v3, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$adjustMonth:I

    iget-object v4, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$context:Landroid/content/Context;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;-><init>(Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;Ljava/lang/String;ILandroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 15

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 62
    iget v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_61

    if-eq v1, v6, :cond_5d

    if-eq v1, v5, :cond_55

    if-eq v1, v4, :cond_38

    if-ne v1, v3, :cond_30

    iget-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v5, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    iget-object v6, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    iget-object v7, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/widget/WidgetDataModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v1

    move-object v1, v7

    move-object v7, p0

    :goto_2b
    move-object v11, v6

    move-object v6, v5

    move-object v5, v11

    goto/16 :goto_9f

    :cond_30
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_38
    iget-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$4:Ljava/lang/Object;

    check-cast v1, Landroidx/glance/GlanceId;

    iget-object v5, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    iget-object v7, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$1:Ljava/lang/Object;

    check-cast v7, Landroid/content/Context;

    iget-object v8, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/widget/WidgetDataModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, p0

    goto/16 :goto_cf

    :cond_55
    iget-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/widget/WidgetDataModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_94

    :cond_5d
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7a

    :cond_61
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    iget-object p1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->this$0:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    invoke-virtual {p1}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$currentDate:Ljava/lang/String;

    iget v7, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$adjustMonth:I

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v6, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->label:I

    invoke-virtual {p1, v1, v7, v8}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getWidgetDataModel(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7a

    return-object v0

    .line 62
    :cond_7a
    :goto_7a
    move-object v1, p1

    check-cast v1, Lcn/jianyun/workplan/widget/WidgetDataModel;

    .line 64
    new-instance p1, Landroidx/glance/appwidget/GlanceAppWidgetManager;

    iget-object v6, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v6}, Landroidx/glance/appwidget/GlanceAppWidgetManager;-><init>(Landroid/content/Context;)V

    const-class v6, Lcn/jianyun/timetable/widget/AppWidgetView;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->label:I

    invoke-virtual {p1, v6, v7}, Landroidx/glance/appwidget/GlanceAppWidgetManager;->getGlanceIds(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_94

    return-object v0

    .line 62
    :cond_94
    :goto_94
    check-cast p1, Ljava/lang/Iterable;

    iget-object v5, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->$context:Landroid/content/Context;

    iget-object v6, p0, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->this$0:Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, p0

    :goto_9f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/glance/GlanceId;

    .line 65
    sget-object v9, Landroidx/glance/state/PreferencesGlanceStateDefinition;->INSTANCE:Landroidx/glance/state/PreferencesGlanceStateDefinition;

    check-cast v9, Landroidx/glance/state/GlanceStateDefinition;

    new-instance v10, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1$1$1;

    invoke-direct {v10, v1, v2}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1$1$1;-><init>(Lcn/jianyun/workplan/widget/WidgetDataModel;Lkotlin/coroutines/Continuation;)V

    check-cast v10, Lkotlin/jvm/functions/Function2;

    iput-object v1, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    iput-object v5, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$1:Ljava/lang/Object;

    iput-object v6, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$2:Ljava/lang/Object;

    iput-object p1, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$3:Ljava/lang/Object;

    iput-object v8, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$4:Ljava/lang/Object;

    iput v4, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->label:I

    invoke-static {v5, v9, v8, v10, v7}, Landroidx/glance/appwidget/state/GlanceAppWidgetStateKt;->updateAppWidgetState(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Landroidx/glance/GlanceId;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_c9

    return-object v0

    :cond_c9
    move-object v11, v8

    move-object v8, v1

    move-object v1, v11

    move-object v12, v6

    move-object v6, v5

    move-object v5, v12

    .line 70
    :goto_cf
    invoke-virtual {v5}, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;->getGlanceAppWidget()Landroidx/glance/appwidget/GlanceAppWidget;

    move-result-object v9

    iput-object v8, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$0:Ljava/lang/Object;

    iput-object v6, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$1:Ljava/lang/Object;

    iput-object v5, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$2:Ljava/lang/Object;

    iput-object p1, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$3:Ljava/lang/Object;

    iput-object v2, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->L$4:Ljava/lang/Object;

    iput v3, v7, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$observeData$1;->label:I

    invoke-virtual {v9, v6, v1, v7}, Landroidx/glance/appwidget/GlanceAppWidget;->update(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_e6

    return-object v0

    :cond_e6
    move-object v1, v8

    goto/16 :goto_2b

    .line 72
    :cond_e9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
