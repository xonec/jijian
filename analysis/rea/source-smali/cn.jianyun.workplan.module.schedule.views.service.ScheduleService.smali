// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.views.service.ScheduleService
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService (cn.jianyun.workplan.module.schedule.views.service.ScheduleService)
.class public final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
.super Ljava/lang/Object;
.source "ScheduleService.kt"

# interfaces
.implements Lcn/jianyun/workplan/main/base/service/BaseService;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleService.kt\ncn/jianyun/workplan/module/schedule/views/service/ScheduleService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,377:1\n1855#2:378\n766#2:379\n857#2,2:380\n1855#2,2:382\n1856#2:384\n766#2:385\n857#2,2:386\n1549#2:388\n1620#2,3:389\n766#2:392\n857#2,2:393\n1855#2:395\n1856#2:397\n1549#2:398\n1620#2,3:399\n1855#2,2:402\n1855#2,2:404\n1855#2,2:406\n1855#2,2:408\n1855#2,2:410\n1855#2,2:412\n1855#2,2:414\n766#2:416\n857#2,2:417\n1855#2,2:419\n766#2:421\n857#2,2:422\n1855#2,2:424\n766#2:426\n857#2,2:427\n1855#2,2:429\n766#2:431\n857#2,2:432\n1855#2,2:434\n1549#2:436\n1620#2,3:437\n1549#2:440\n1620#2,3:441\n1549#2:444\n1620#2,3:445\n1549#2:448\n1620#2,3:449\n766#2:452\n857#2,2:453\n1855#2,2:455\n766#2:457\n857#2,2:458\n1855#2,2:460\n766#2:462\n857#2,2:463\n1855#2,2:465\n766#2:467\n857#2,2:468\n1855#2,2:470\n1#3:396\n*S KotlinDebug\n*F\n+ 1 ScheduleService.kt\ncn/jianyun/workplan/module/schedule/views/service/ScheduleService\n*L\n87#1:378\n89#1:379\n89#1:380,2\n93#1:382,2\n87#1:384\n105#1:385\n105#1:386,2\n105#1:388\n105#1:389,3\n113#1:392\n113#1:393,2\n113#1:395\n113#1:397\n132#1:398\n132#1:399,3\n144#1:402,2\n157#1:404,2\n213#1:406,2\n217#1:408,2\n221#1:410,2\n225#1:412,2\n229#1:414,2\n266#1:416\n266#1:417,2\n266#1:419,2\n269#1:421\n269#1:422,2\n269#1:424,2\n272#1:426\n272#1:427,2\n272#1:429,2\n275#1:431\n275#1:432,2\n275#1:434,2\n283#1:436\n283#1:437,3\n284#1:440\n284#1:441,3\n285#1:444\n285#1:445,3\n286#1:448\n286#1:449,3\n288#1:452\n288#1:453,2\n288#1:455,2\n293#1:457\n293#1:458,2\n293#1:460,2\n298#1:462\n298#1:463,2\n298#1:465,2\n303#1:467\n303#1:468,2\n303#1:470,2\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B?\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0008\u0010\'\u001a\u00020(H\u0016J\u0011\u0010)\u001a\u00020*H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0008\u0010+\u001a\u00020\u0003H\u0016J#\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(2\u0008\u0008\u0002\u0010/\u001a\u000200H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J!\u00102\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0011\u00106\u001a\u000207H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u0017\u0010;\u001a\u0008\u0012\u0004\u0012\u00020=0<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0017\u0010>\u001a\u0008\u0012\u0004\u0012\u00020?0<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0017\u0010@\u001a\u0008\u0012\u0004\u0012\u00020A0<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0017\u0010B\u001a\u0008\u0012\u0004\u0012\u00020=0<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J8\u0010C\u001a\u0008\u0012\u0004\u0012\u00020D0<2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020=0<2\u0006\u00109\u001a\u00020(2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020A0<2\u0006\u0010G\u001a\u00020(J8\u0010H\u001a\u0008\u0012\u0004\u0012\u00020=0<2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020=0<2\u0006\u00109\u001a\u00020(2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020A0<2\u0006\u0010G\u001a\u00020(J\u0011\u0010I\u001a\u00020#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u0010J\u001a\u00020#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u0010K\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u0010L\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u0010M\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010N\u001a\u00020#2\u0006\u00103\u001a\u00020OH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ!\u0010Q\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006R"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "Lcn/jianyun/workplan/main/base/service/BaseService;",
        "baseRepository",
        "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "scheduleProjectDao",
        "Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;",
        "scheduleDutyDao",
        "Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;",
        "scheduleWorkDao",
        "Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;",
        "schedulePlanDao",
        "Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;",
        "alarmDao",
        "Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;",
        "configDao",
        "Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;",
        "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;)V",
        "getAlarmDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;",
        "getBaseRepository",
        "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "getConfigDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;",
        "getScheduleDutyDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;",
        "getSchedulePlanDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;",
        "getScheduleProjectDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;",
        "getScheduleWorkDao",
        "()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;",
        "clearAll",
        "Lcn/jianyun/workplan/model/CloudFile;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteByProject",
        "",
        "project",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
        "(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getBizName",
        "",
        "getConfig",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
        "getRepository",
        "getWidgetDataModel",
        "Lcn/jianyun/workplan/widget/WidgetDataModel;",
        "curDate",
        "adjustMonth",
        "",
        "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "increaseByProject",
        "backupData",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;",
        "(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isEmpty",
        "",
        "isWorkUsed",
        "workUuid",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "listCurrentAlarmData",
        "",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
        "listCurrentPlanData",
        "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
        "listCurrentWorkData",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
        "loadCurrentAlarmDataWithNextTime",
        "makeAlarm",
        "Lcn/jianyun/workplan/main/base/model/NotifyInfo;",
        "alarms",
        "works",
        "day",
        "makeNextAlarm",
        "makeNotify",
        "notifyWidget",
        "prepareBackupData",
        "tryInitProject",
        "tryNotify",
        "writeAll",
        "Lcn/jianyun/workplan/module/base/dto/BaseBackupData;",
        "(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "writeByProject",
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
.field private final alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

.field private final baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

.field private final configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

.field private final scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

.field private final schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

.field private final scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

.field private final scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;)V
    .registers 9
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "baseRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleProjectDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleDutyDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleWorkDao"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulePlanDao"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmDao"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configDao"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    .line 42
    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    .line 43
    iput-object p3, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    .line 44
    iput-object p4, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    .line 45
    iput-object p5, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    .line 46
    iput-object p6, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    .line 47
    iput-object p7, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    return-void
.end method

.method public static synthetic getWidgetDataModel$default(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Ljava/lang/String;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_5

    const/4 p2, 0x0

    .line 336
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getWidgetDataModel(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public changeFileFormat(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/main/base/model/BasicCloudData;",
            ">;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->changeFileFormat(Lcn/jianyun/workplan/main/base/service/BaseService;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public cleanLocalData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->cleanLocalData(Lcn/jianyun/workplan/main/base/service/BaseService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cleanWebdavCloud(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->cleanWebdavCloud(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/model/CloudFile;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 198
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    packed-switch v2, :pswitch_data_f2

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2c
    iget-object v0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/model/CloudFile;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_f1

    :pswitch_35
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/model/CloudFile;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_df

    :pswitch_42
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/model/CloudFile;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_cf

    :pswitch_4f
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/model/CloudFile;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_bf

    :pswitch_5b
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/model/CloudFile;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_af

    :pswitch_67
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/model/CloudFile;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_9f

    :pswitch_73
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v2

    goto :goto_8c

    :pswitch_7c
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 200
    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->prepareBackupData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8b

    return-object v1

    :cond_8b
    move-object v3, p0

    .line 198
    :goto_8c
    check-cast p1, Lcn/jianyun/workplan/model/CloudFile;

    .line 201
    iget-object v2, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {v2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9e

    return-object v1

    :cond_9e
    move-object v2, p1

    .line 202
    :goto_9f
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_af

    return-object v1

    .line 203
    :cond_af
    :goto_af
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_bf

    return-object v1

    .line 204
    :cond_bf
    :goto_bf
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_cf

    return-object v1

    .line 205
    :cond_cf
    :goto_cf
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_df

    return-object v1

    .line 206
    :cond_df
    :goto_df
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->L$1:Ljava/lang/Object;

    const/4 v3, 0x7

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f0

    return-object v1

    :cond_f0
    move-object v0, v2

    :goto_f1
    return-object v0

    :pswitch_data_f2
    .packed-switch 0x0
        :pswitch_7c
        :pswitch_73
        :pswitch_67
        :pswitch_5b
        :pswitch_4f
        :pswitch_42
        :pswitch_35
        :pswitch_2c
    .end packed-switch
.end method

.method public final deleteByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 254
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_6f

    if-eq v2, v7, :cond_63

    if-eq v2, v6, :cond_57

    if-eq v2, v5, :cond_4b

    if-eq v2, v4, :cond_3f

    if-ne v2, v3, :cond_37

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c4

    :cond_37
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3f
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_b4

    :cond_4b
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_a5

    :cond_57
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_96

    :cond_63
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_87

    :cond_6f
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 255
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object p2

    .line 256
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    invoke-interface {v2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->delete(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_85

    return-object v1

    :cond_85
    move-object v2, p0

    move-object p1, p2

    .line 257
    :goto_87
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->deleteByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_96

    return-object v1

    .line 258
    :cond_96
    :goto_96
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->deleteByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a5

    return-object v1

    .line 259
    :cond_a5
    :goto_a5
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_b4

    return-object v1

    .line 260
    :cond_b4
    :goto_b4
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    const/4 v2, 0x0

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->deleteByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c4

    return-object v1

    .line 261
    :cond_c4
    :goto_c4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public deleteLocalFile(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->deleteLocalFile(Lcn/jianyun/workplan/main/base/service/BaseService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteWebdavFile(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2, p3}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->deleteWebdavFile(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/module/base/model/WebDAVUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getAlarmDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;
    .registers 2

    .line 46
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    return-object v0
.end method

.method public final getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 41
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public getBizName()Ljava/lang/String;
    .registers 2

    const-string v0, "Schedule"

    return-object v0
.end method

.method public final getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 331
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    invoke-interface {v0, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getConfigDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;
    .registers 2

    .line 47
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    return-object v0
.end method

.method public getNotifyBizName()Ljava/lang/String;
    .registers 2

    .line 39
    invoke-static {p0}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->getNotifyBizName(Lcn/jianyun/workplan/main/base/service/BaseService;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->getProjectId(Lcn/jianyun/workplan/main/base/service/BaseService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 50
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;
    .registers 2

    .line 43
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    return-object v0
.end method

.method public final getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;
    .registers 2

    .line 45
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    return-object v0
.end method

.method public final getScheduleProjectDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;
    .registers 2

    .line 42
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    return-object v0
.end method

.method public final getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;
    .registers 2

    .line 44
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    return-object v0
.end method

.method public final getWidgetDataModel(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/widget/WidgetDataModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;

    iget v3, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 336
    iget v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    packed-switch v4, :pswitch_data_212

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_30
    iget-object v3, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/widget/WidgetDataModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_208

    :pswitch_3d
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/widget/WidgetDataModel;

    iget-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v6

    goto/16 :goto_1f0

    :pswitch_50
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/widget/WidgetDataModel;

    iget-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Date;

    iget-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1b4

    :pswitch_61
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    iget-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/widget/WidgetDataModel;

    iget-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    iget-object v8, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_17d

    :pswitch_76
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/widget/WidgetDataModel;

    iget-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    iget-object v8, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_13d

    :pswitch_8b
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/widget/WidgetDataModel;

    iget-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/Date;

    iget-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v20, v6

    move-object v6, v4

    move-object/from16 v4, v20

    goto/16 :goto_125

    :pswitch_a1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 337
    invoke-static/range {p1 .. p1}, Lcn/jianyun/workplan/util/MyDateTool;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    move/from16 v4, p2

    .line 338
    invoke-static {v1, v4}, Lcn/jianyun/workplan/util/MyDateTool;->gapMonth(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v1

    .line 340
    invoke-static {v1}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 342
    new-instance v15, Lcn/jianyun/workplan/widget/WidgetDataModel;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x3ff

    const/16 v19, 0x0

    move-object v6, v15

    move-object v5, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    invoke-direct/range {v6 .. v18}, Lcn/jianyun/workplan/widget/WidgetDataModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/widget/WidgetConfig;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v6, "now"

    .line 343
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setDate(Ljava/lang/String;)V

    const-string v4, "MM\u6708"

    .line 344
    invoke-static {v1, v4}, Lcn/jianyun/workplan/util/MyDateTool;->format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "format(currentDate, PATTERN_MONTH_ONLY)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setMonth(Ljava/lang/String;)V

    const-string v4, "yyyy\u5e74"

    .line 345
    invoke-static {v1, v4}, Lcn/jianyun/workplan/util/MyDateTool;->format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "format(currentDate, PATTERN_YEAR_CHINESE)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setYear(Ljava/lang/String;)V

    const-string v4, "dd\u65e5"

    .line 346
    invoke-static {v1, v4}, Lcn/jianyun/workplan/util/MyDateTool;->format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "format(currentDate, PATTERN_DAY_CHINESE)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setDay(Ljava/lang/String;)V

    .line 348
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-static {v6}, Lcn/jianyun/workplan/util/MyDateTool;->getYear(Ljava/util/Date;)I

    move-result v6

    iput-object v0, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    iput-object v5, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-virtual {v4, v6, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_11e

    return-object v3

    :cond_11e
    move-object v7, v0

    move-object v6, v5

    move-object/from16 v20, v4

    move-object v4, v1

    move-object/from16 v1, v20

    .line 336
    :goto_125
    check-cast v1, Ljava/util/Map;

    .line 350
    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    iput-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-virtual {v7, v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_139

    return-object v3

    :cond_139
    move-object v8, v7

    move-object v7, v4

    move-object v4, v1

    move-object v1, v5

    .line 336
    :goto_13d
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    .line 352
    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->isMondayFirst()Z

    move-result v5

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowFestival()Z

    move-result v9

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v10

    invoke-static {v9, v4, v10}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getFillCalendar()Z

    move-result v10

    invoke-static {v7, v5, v9, v10}, Lcn/jianyun/workplan/util/MyDateTool;->getMonthInfo(Ljava/util/Date;ZLjava/util/Map;Z)Ljava/util/List;

    move-result-object v5

    const-string v9, "monthInfos"

    .line 354
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setMonthInfos(Ljava/util/List;)V

    .line 355
    invoke-virtual {v6, v4}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setHolidayMap(Ljava/util/Map;)V

    .line 357
    iget-object v4, v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object v8, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    iput-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-virtual {v4, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getWidgetConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_178

    return-object v3

    :cond_178
    move-object/from16 v20, v4

    move-object v4, v1

    move-object/from16 v1, v20

    .line 336
    :goto_17d
    check-cast v1, Lcn/jianyun/workplan/widget/WidgetConfig;

    .line 358
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowLunar()Z

    move-result v5

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/widget/WidgetConfig;->setShowLunar(Z)V

    .line 359
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowFestival()Z

    move-result v5

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/widget/WidgetConfig;->setShowFestival(Z)V

    .line 360
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->isMondayFirst()Z

    move-result v5

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/widget/WidgetConfig;->setMondayFirst(Z)V

    .line 361
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowHLine()Z

    move-result v4

    invoke-virtual {v1, v4}, Lcn/jianyun/workplan/widget/WidgetConfig;->setShowLine(Z)V

    .line 362
    invoke-virtual {v6, v1}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setWidgetConfig(Lcn/jianyun/workplan/widget/WidgetConfig;)V

    .line 364
    iput-object v8, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    iput-object v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$3:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-virtual {v8, v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1b1

    return-object v3

    :cond_1b1
    move-object v4, v6

    move-object v6, v7

    move-object v7, v8

    .line 336
    :goto_1b4
    check-cast v1, Ljava/lang/String;

    .line 366
    new-instance v5, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    invoke-static {v6}, Lcn/jianyun/workplan/util/MyDateTool;->getStartDayOfMonth(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    const-string v9, "getStartDayOfMonth(currentDate)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6}, Lcn/jianyun/workplan/util/MyDateTool;->getLastDayStringOfMonth(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "getLastDayStringOfMonth(currentDate)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v8, v6}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    iget-object v6, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    invoke-virtual {v5}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getBeginDate()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getEndDate()Ljava/lang/String;

    move-result-object v5

    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    const/4 v9, 0x5

    iput v9, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-interface {v6, v1, v8, v5, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_1eb

    return-object v3

    :cond_1eb
    move-object/from16 v20, v5

    move-object v5, v1

    move-object/from16 v1, v20

    .line 336
    :goto_1f0
    check-cast v1, Ljava/util/List;

    .line 368
    iget-object v6, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$1:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x6

    iput v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    invoke-interface {v6, v5, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_205

    return-object v3

    :cond_205
    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    .line 336
    :goto_208
    check-cast v1, Ljava/util/List;

    .line 370
    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setDutys(Ljava/util/List;)V

    .line 371
    invoke-virtual {v2, v1}, Lcn/jianyun/workplan/widget/WidgetDataModel;->setWorks(Ljava/util/List;)V

    return-object v2

    nop

    :pswitch_data_212
    .packed-switch 0x0
        :pswitch_a1
        :pswitch_8b
        :pswitch_76
        :pswitch_61
        :pswitch_50
        :pswitch_3d
        :pswitch_30
    .end packed-switch
.end method

.method public getWorkSpace()Ljava/lang/String;
    .registers 2

    .line 39
    invoke-static {p0}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->getWorkSpace(Lcn/jianyun/workplan/main/base/service/BaseService;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final increaseByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;

    invoke-direct {v0, p0, p3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 280
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_3b4

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2f
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_37e

    :pswitch_40
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_317

    :pswitch_5d
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2ae

    :pswitch_7e
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$7:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_245

    :pswitch_a3
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1e2

    :pswitch_c0
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v2

    move-object v2, p2

    move-object p2, p1

    goto/16 :goto_1a3

    :pswitch_de
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_161

    :pswitch_f3
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_121

    :pswitch_107
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 282
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object p2

    .line 283
    iget-object p3, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {p3, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_120

    return-object v1

    :cond_120
    move-object v5, p0

    .line 280
    :goto_121
    check-cast p3, Ljava/lang/Iterable;

    .line 436
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p3, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 437
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_132
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_146

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 438
    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 283
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v6

    .line 438
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_132

    .line 439
    :cond_146
    move-object p3, v2

    check-cast p3, Ljava/util/List;

    .line 284
    iget-object v2, v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {v2, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_15d

    return-object v1

    :cond_15d
    move-object v11, v2

    move-object v2, p1

    move-object p1, p3

    move-object p3, v11

    .line 280
    :goto_161
    check-cast p3, Ljava/lang/Iterable;

    .line 440
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {p3, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 441
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_172
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_186

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 442
    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 284
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->getUuid()Ljava/lang/String;

    move-result-object v7

    .line 442
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_172

    .line 443
    :cond_186
    check-cast v6, Ljava/util/List;

    .line 285
    iget-object p3, v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {p3, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_19e

    return-object v1

    :cond_19e
    move-object v7, v5

    move-object v5, p2

    move-object p2, v6

    move-object v6, v2

    move-object v2, p1

    .line 280
    :goto_1a3
    check-cast p3, Ljava/lang/Iterable;

    .line 444
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p3, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {p1, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p1, Ljava/util/Collection;

    .line 445
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1b4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c8

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 446
    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 285
    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getUuid()Ljava/lang/String;

    move-result-object v8

    .line 446
    invoke-interface {p1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1b4

    .line 447
    :cond_1c8
    check-cast p1, Ljava/util/List;

    .line 286
    iget-object p3, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {p3, v5, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1e2

    return-object v1

    .line 280
    :cond_1e2
    :goto_1e2
    check-cast p3, Ljava/lang/Iterable;

    .line 448
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {p3, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 449
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1f3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_207

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 450
    check-cast v3, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 286
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getUuid()Ljava/lang/String;

    move-result-object v3

    .line 450
    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1f3

    .line 451
    :cond_207
    check-cast v8, Ljava/util/List;

    .line 288
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getWorkList()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    .line 452
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 453
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_21a
    :goto_21a
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_235

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 288
    invoke-virtual {v10}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getProjectUuid()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_21a

    .line 453
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_21a

    .line 454
    :cond_235
    check-cast v3, Ljava/util/List;

    .line 452
    check-cast v3, Ljava/lang/Iterable;

    .line 455
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    move-object v3, p2

    move-object p2, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v2

    move-object v2, p1

    move-object p1, p3

    :cond_245
    :goto_245
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_277

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 289
    invoke-virtual {p3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_245

    .line 290
    iget-object v9, v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$7:Ljava/lang/Object;

    const/4 v10, 0x5

    iput v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {v9, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_245

    return-object v1

    .line 293
    :cond_277
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getPlanList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 457
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 458
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_288
    :goto_288
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 293
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->getProjectUuid()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_288

    .line 458
    invoke-interface {p3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_288

    .line 459
    :cond_2a3
    check-cast p3, Ljava/util/List;

    .line 457
    check-cast p3, Ljava/lang/Iterable;

    .line 460
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :cond_2ae
    :goto_2ae
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2e0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 294
    invoke-virtual {p3}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->getUuid()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2ae

    .line 295
    iget-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$7:Ljava/lang/Object;

    const/4 v9, 0x6

    iput v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {v8, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->insert(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_2ae

    return-object v1

    .line 298
    :cond_2e0
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getDutyList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 462
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 463
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2f1
    :goto_2f1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_30c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 298
    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getProjectUuid()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2f1

    .line 463
    invoke-interface {p3, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2f1

    .line 464
    :cond_30c
    check-cast p3, Ljava/util/List;

    .line 462
    check-cast p3, Ljava/lang/Iterable;

    .line 465
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v3, v5

    move-object v5, v6

    move-object v6, v7

    :cond_317
    :goto_317
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_349

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 299
    invoke-virtual {p3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getUuid()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_317

    .line 300
    iget-object v7, v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$7:Ljava/lang/Object;

    const/4 v8, 0x7

    iput v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {v7, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_317

    return-object v1

    .line 303
    :cond_349
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getAlarmList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 467
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 468
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_35a
    :goto_35a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_375

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 303
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getProjectUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_35a

    .line 468
    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_35a

    .line 469
    :cond_375
    check-cast p3, Ljava/util/List;

    .line 467
    check-cast p3, Ljava/lang/Iterable;

    .line 470
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v2, v6

    :cond_37e
    :goto_37e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3b1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 304
    invoke-virtual {p3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_37e

    .line 305
    iget-object v3, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$5:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->L$7:Ljava/lang/Object;

    const/16 v5, 0x8

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    invoke-interface {v3, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_37e

    return-object v1

    .line 308
    :cond_3b1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_3b4
    .packed-switch 0x0
        :pswitch_107
        :pswitch_f3
        :pswitch_de
        :pswitch_c0
        :pswitch_a3
        :pswitch_7e
        :pswitch_5d
        :pswitch_40
        :pswitch_2f
    .end packed-switch
.end method

.method public isCloudOk(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->isCloudOk(Lcn/jianyun/workplan/main/base/service/BaseService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 237
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_40

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 238
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_40

    return-object v1

    :cond_40
    :goto_40
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final isWorkUsed(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 241
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_50

    if-eq v2, v5, :cond_44

    if-eq v2, v4, :cond_38

    if-ne v2, v3, :cond_30

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_98

    :cond_30
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_38
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7d

    :cond_44
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_63

    :cond_50
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 242
    iget-object p2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->findWork(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_62

    return-object v1

    :cond_62
    move-object v2, p0

    :goto_63
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-lez p2, :cond_6e

    const-string p1, "\u8be5\u73ed\u6b21\u5df2\u88ab\u6392\u73ed\uff0c\u7981\u6b62\u5220\u9664"

    return-object p1

    .line 245
    :cond_6e
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->findWork(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7d

    return-object v1

    :cond_7d
    :goto_7d
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    if-lez p2, :cond_88

    const-string p1, "\u8be5\u73ed\u6b21\u5df2\u88ab\u7528\u4e8e\u7ec4\u5408\u73ed\u6b21\uff0c\u7981\u6b62\u5220\u9664"

    return-object p1

    .line 248
    :cond_88
    iget-object p2, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    const/4 v2, 0x0

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->findWork(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_98

    return-object v1

    :cond_98
    :goto_98
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-lez p1, :cond_a3

    const-string p1, "\u8be5\u73ed\u6b21\u5df2\u88ab\u7528\u4e8e\u5468\u671f\u6392\u73ed\uff0c\u7981\u6b62\u5220\u9664"

    return-object p1

    :cond_a3
    const-string p1, "ok"

    return-object p1
.end method

.method public final listCurrentAlarmData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 326
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3d

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_3d
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 327
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4d

    return-object v1

    :cond_4d
    :goto_4d
    check-cast p1, Ljava/lang/String;

    const/4 v4, 0x0

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    invoke-interface {v2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5b

    return-object v1

    :cond_5b
    :goto_5b
    return-object p1
.end method

.method public final listCurrentPlanData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 322
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3d

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_3d
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 323
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4d

    return-object v1

    :cond_4d
    :goto_4d
    check-cast p1, Ljava/lang/String;

    const/4 v4, 0x0

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    invoke-interface {v2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5b

    return-object v1

    :cond_5b
    :goto_5b
    return-object p1
.end method

.method public final listCurrentWorkData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 318
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3d

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_3d
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 319
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4d

    return-object v1

    :cond_4d
    :goto_4d
    check-cast p1, Ljava/lang/String;

    const/4 v4, 0x0

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    invoke-interface {v2, p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5b

    return-object v1

    :cond_5b
    :goto_5b
    return-object p1
.end method

.method public loadCloudData(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            "Lcn/jianyun/workplan/main/base/model/BasicCloudData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/api/ApiResult<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2, p3}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->loadCloudData(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadCurrentAlarmDataWithNextTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 127
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, ""

    if-eqz v2, :cond_88

    if-eq v2, v6, :cond_70

    if-eq v2, v5, :cond_57

    if-eq v2, v4, :cond_4a

    if-ne v2, v3, :cond_42

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_140

    :cond_42
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4a
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_123

    :cond_57
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_10b

    :cond_70
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_bb

    :cond_88
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 129
    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x7

    .line 130
    invoke-static {p1, v8}, Lcn/jianyun/workplan/util/CommonDateToolKt;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 132
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    iput-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$3:Ljava/lang/Object;

    iput-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$4:Ljava/lang/Object;

    iput v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentAlarmData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_b5

    return-object v1

    :cond_b5
    move-object v10, p0

    move-object v9, v2

    move-object v2, v8

    move-object v8, p1

    move-object p1, v6

    move-object v6, v2

    .line 127
    :goto_bb
    check-cast p1, Ljava/lang/Iterable;

    .line 398
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {p1, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .line 399
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_ce
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_e1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 400
    check-cast v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 133
    invoke-virtual {v12, v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->setNextTime(Ljava/lang/String;)V

    .line 400
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_ce

    .line 401
    :cond_e1
    check-cast v11, Ljava/util/List;

    .line 132
    iput-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 136
    iget-object p1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_f2

    .line 137
    iget-object p1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object p1

    .line 139
    :cond_f2
    iget-object v2, v10, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$4:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    invoke-virtual {v10, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_107

    return-object v1

    :cond_107
    move-object v5, v6

    move-object v6, v8

    move-object v8, v9

    move-object v9, v10

    :goto_10b
    check-cast p1, Ljava/lang/String;

    iput-object v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    iput-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$3:Ljava/lang/Object;

    iput-object v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$4:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    invoke-interface {v2, p1, v8, v6, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_121

    return-object v1

    :cond_121
    move-object v2, v5

    move-object v4, v9

    .line 127
    :goto_123
    check-cast p1, Ljava/util/List;

    .line 140
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_12e

    .line 141
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object p1

    .line 143
    :cond_12e
    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    invoke-virtual {v4, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentWorkData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_13d

    return-object v1

    :cond_13d
    move-object v1, p1

    move-object p1, v0

    move-object v0, v4

    .line 127
    :goto_140
    check-cast p1, Ljava/util/List;

    .line 144
    check-cast v1, Ljava/lang/Iterable;

    .line 402
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_148
    :goto_148
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 145
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_170

    .line 146
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v4, v5, p1, v6}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNextAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 148
    :cond_170
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_148

    .line 149
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v5, p1, v3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNextAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_148

    .line 152
    :cond_18d
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object p1
.end method

.method public loadLocalBackupData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/main/base/model/BasicCloudData;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->loadLocalBackupData(Lcn/jianyun/workplan/main/base/service/BaseService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public loadLocalData(Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/main/base/model/BasicCloudData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/api/ApiResult<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->loadLocalData(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public loadWebDavCloudFiles(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/main/base/model/BasicCloudData;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->loadWebDavCloudFiles(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final makeAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/main/base/model/NotifyInfo;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "alarms"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workUuid"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "works"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "day"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .line 113
    check-cast v0, Ljava/lang/Iterable;

    .line 392
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 393
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_30
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 113
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getWorkUuid()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_30

    .line 393
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_30

    .line 394
    :cond_4b
    check-cast v5, Ljava/util/List;

    .line 392
    check-cast v5, Ljava/lang/Iterable;

    .line 395
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_53
    :goto_53
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 114
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getBeforeDay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result v6

    .line 115
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getNotifyTime()Ljava/lang/String;

    move-result-object v7

    .line 116
    move-object v8, v2

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_72
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_8b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_72

    goto :goto_8c

    :cond_8b
    move-object v9, v10

    :goto_8c
    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-eqz v9, :cond_94

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v10

    .line 118
    :cond_94
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0xa

    if-ne v8, v9, :cond_53

    if-eqz v10, :cond_53

    .line 119
    invoke-static/range {p4 .. p4}, Lcn/jianyun/workplan/util/CommonDateToolKt;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-static {v8, v6}, Lcn/jianyun/workplan/util/CommonDateToolKt;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 120
    invoke-static {v6}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 121
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->beforeInfo2()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getAlarm()Z

    move-result v16

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->realRemark()Ljava/lang/String;

    move-result-object v14

    new-instance v5, Lcn/jianyun/workplan/main/base/model/NotifyInfo;

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x21

    const/16 v19, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v19}, Lcn/jianyun/workplan/main/base/model/NotifyInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_53

    :cond_f0
    return-object v3
.end method

.method public makeLocalBackup(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->makeLocalBackup(Lcn/jianyun/workplan/main/base/service/BaseService;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final makeNextAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .registers 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "alarms"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workUuid"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "works"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "day"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/List;

    .line 157
    check-cast v0, Ljava/lang/Iterable;

    .line 404
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 159
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getWorkUuid()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_129

    .line 160
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getBeforeDay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result v6

    .line 161
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getNotifyTime()Ljava/lang/String;

    move-result-object v7

    .line 162
    move-object v8, v2

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_52
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_6b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_52

    goto :goto_6c

    :cond_6b
    move-object v9, v10

    :goto_6c
    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-eqz v9, :cond_74

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v10

    .line 164
    :cond_74
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0xa

    if-ne v8, v9, :cond_129

    if-eqz v10, :cond_129

    .line 165
    invoke-static/range {p4 .. p4}, Lcn/jianyun/workplan/util/CommonDateToolKt;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-static {v8, v6}, Lcn/jianyun/workplan/util/CommonDateToolKt;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 166
    invoke-static {v8}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 167
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-static {v11}, Lcn/jianyun/workplan/util/MyDateTool;->toDateTimeString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    const-string v11, "notify info:{}, {},{},{},{}"

    .line 169
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getBeforeDay()Ljava/lang/String;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getNextTime()Ljava/lang/String;

    move-result-object v16

    invoke-static {v8}, Lcn/jianyun/workplan/util/MyDateTool;->getDayInfo(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object v14, v9

    move-object v6, v15

    filled-new-array/range {v11 .. v17}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    const-string v11, "nowTime"

    .line 170
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_129

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getNextTime()Ljava/lang/String;

    move-result-object v6

    const-string v9, ""

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_129

    .line 171
    invoke-static {v8}, Lcn/jianyun/workplan/util/MyDateTool;->getDayInfo(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->setNextTime(Ljava/lang/String;)V

    .line 172
    invoke-static {v8}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->setNextAlertTime(Ljava/lang/String;)V

    .line 176
    :cond_129
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_29

    :cond_12e
    return-object v3
.end method

.method public makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, ""

    instance-of v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;

    if-eqz v3, :cond_1a

    move-object v3, v0

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;

    iget v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_1a

    iget v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    sub-int/2addr v0, v5

    iput v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    goto :goto_1f

    :cond_1a
    new-instance v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;

    invoke-direct {v3, v1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_1f
    iget-object v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v10

    .line 72
    iget v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eqz v4, :cond_c2

    if-eq v4, v15, :cond_b9

    if-eq v4, v14, :cond_a5

    if-eq v4, v13, :cond_83

    if-eq v4, v12, :cond_62

    if-ne v4, v11, :cond_5a

    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v14, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    :try_start_54
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_57} :catch_2c7

    move v12, v11

    goto/16 :goto_1db

    :cond_5a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    iget-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v14, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    :try_start_7e
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_81} :catch_2c7

    goto/16 :goto_184

    :cond_83
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    iget-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    :try_start_9b
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_9e
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_9e} :catch_2c7

    move-object/from16 v19, v5

    move-object v5, v4

    :goto_a1
    move-object/from16 v4, v19

    goto/16 :goto_15e

    :cond_a5
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    :try_start_b5
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_b8
    .catch Ljava/lang/Exception; {:try_start_b5 .. :try_end_b8} :catch_2c7

    goto :goto_121

    :cond_b9
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    :try_start_bd
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_c0
    .catch Ljava/lang/Exception; {:try_start_bd .. :try_end_c0} :catch_2c7

    move-object v7, v4

    goto :goto_d9

    :cond_c2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    :try_start_c5
    iget-object v4, v1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const-string v5, "calendarA"

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    iput-object v1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    iput v15, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    move-object v7, v3

    invoke-static/range {v4 .. v9}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_d8

    return-object v10

    :cond_d8
    move-object v7, v1

    :goto_d9
    const-string v4, "1"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e4

    .line 77
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 79
    :cond_e4
    iget-object v0, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/util/CalendarReminderUtils;->cleanCalendarEvent(Landroid/content/Context;)V

    .line 80
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 81
    invoke-static {v0}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    const/16 v4, 0xe

    .line 82
    invoke-static {v0, v4}, Lcn/jianyun/workplan/util/CommonDateToolKt;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 83
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 85
    iget-object v0, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    iput-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    iput-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    iput v14, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    invoke-interface {v0, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_121

    return-object v10

    .line 72
    :cond_121
    :goto_121
    check-cast v0, Ljava/util/List;

    .line 87
    check-cast v0, Ljava/lang/Iterable;

    .line 378
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v8, v6

    move-object v9, v7

    move-object v6, v4

    move-object v7, v5

    move-object v5, v0

    :goto_12e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_246

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    .line 88
    iget-object v4, v9, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v14

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    iput-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    iput-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    iput-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    iput-object v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$6:Ljava/lang/Object;

    iput v13, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    invoke-interface {v4, v14, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_158

    return-object v10

    :cond_158
    move-object/from16 v19, v5

    move-object v5, v0

    move-object v0, v4

    goto/16 :goto_a1

    .line 72
    :goto_15e
    check-cast v0, Ljava/util/List;

    .line 89
    iget-object v11, v9, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v14

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    iput-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    iput-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    iput-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    iput-object v5, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    iput-object v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$6:Ljava/lang/Object;

    iput v12, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    invoke-interface {v11, v14, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_17d

    return-object v10

    :cond_17d
    move-object v14, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v4

    move-object v4, v0

    move-object v0, v11

    .line 72
    :goto_184
    check-cast v0, Ljava/lang/Iterable;

    .line 379
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .line 380
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_191
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1aa

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v17, v12

    check-cast v17, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 89
    invoke-virtual/range {v17 .. v17}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getOpened()Z

    move-result v17

    if-eqz v17, :cond_1a8

    .line 380
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1a8
    const/4 v12, 0x4

    goto :goto_191

    .line 381
    :cond_1aa
    move-object v0, v11

    check-cast v0, Ljava/util/List;

    .line 90
    move-object v11, v0

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    xor-int/2addr v11, v15

    if-eqz v11, :cond_23b

    .line 91
    iget-object v11, v14, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v5

    iput-object v14, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$1:Ljava/lang/Object;

    iput-object v8, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$2:Ljava/lang/Object;

    iput-object v7, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$3:Ljava/lang/Object;

    iput-object v6, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$4:Ljava/lang/Object;

    iput-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$5:Ljava/lang/Object;

    iput-object v0, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->L$6:Ljava/lang/Object;

    const/4 v12, 0x5

    iput v12, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    invoke-interface {v11, v5, v9, v8, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_1d5

    return-object v10

    :cond_1d5
    move-object/from16 v19, v4

    move-object v4, v0

    move-object v0, v5

    move-object/from16 v5, v19

    .line 72
    :goto_1db
    check-cast v0, Ljava/util/List;

    .line 92
    move-object v11, v0

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    xor-int/2addr v11, v15

    if-eqz v11, :cond_23b

    .line 93
    check-cast v0, Ljava/lang/Iterable;

    .line 382
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1ed
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_23b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 94
    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_218

    .line 95
    iget-object v12, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v4, v13, v5, v15}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v12, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 97
    :cond_218
    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_237

    .line 98
    iget-object v12, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14, v4, v13, v5, v11}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeAlarm(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v12, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_237
    const/4 v12, 0x5

    const/4 v13, 0x3

    const/4 v15, 0x1

    goto :goto_1ed

    :cond_23b
    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v14

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v15, 0x1

    goto/16 :goto_12e

    .line 104
    :cond_246
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcn/jianyun/workplan/util/MyDateTool;->toDateTimeString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 105
    iget-object v2, v9, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    .line 385
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 386
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_264
    :goto_264
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_289

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcn/jianyun/workplan/main/base/model/NotifyInfo;

    .line 105
    invoke-virtual {v6}, Lcn/jianyun/workplan/main/base/model/NotifyInfo;->getNotifyTime()Ljava/lang/String;

    move-result-object v6

    const-string v7, "nowTime"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_282

    const/4 v6, 0x1

    goto :goto_283

    :cond_282
    const/4 v6, 0x0

    :goto_283
    if-eqz v6, :cond_264

    .line 386
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_264

    .line 387
    :cond_289
    check-cast v4, Ljava/util/List;

    .line 385
    check-cast v4, Ljava/lang/Iterable;

    .line 388
    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 389
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_29e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2c1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 390
    move-object v10, v4

    check-cast v10, Lcn/jianyun/workplan/main/base/model/NotifyInfo;

    .line 105
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getNotifyBizName()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x3e

    const/16 v18, 0x0

    invoke-static/range {v10 .. v18}, Lcn/jianyun/workplan/main/base/model/NotifyInfo;->copy$default(Lcn/jianyun/workplan/main/base/model/NotifyInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcn/jianyun/workplan/main/base/model/NotifyInfo;

    move-result-object v4

    .line 390
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_29e

    .line 391
    :cond_2c1
    check-cast v0, Ljava/util/List;

    .line 105
    invoke-static {v2, v0}, Lcn/jianyun/workplan/util/CalendarReminderUtils;->batchAddCalendarEvent(Landroid/content/Context;Ljava/util/List;)Z
    :try_end_2c6
    .catch Ljava/lang/Exception; {:try_start_c5 .. :try_end_2c6} :catch_2c7

    goto :goto_2d1

    :catch_2c7
    move-exception v0

    const-string v2, "writeCalendarError"

    .line 108
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 110
    :goto_2d1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public makeWebDavCloudBackup(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->makeWebDavCloudBackup(Lcn/jianyun/workplan/main/base/service/BaseService;Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public notifyWidget(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 58
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_19

    return-object p1

    :cond_19
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public prepareBackupData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/model/CloudFile;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 181
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    packed-switch v2, :pswitch_data_196

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2e
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v1

    move-object v9, v5

    move-object v8, v6

    move-object v6, v7

    goto/16 :goto_139

    :pswitch_4f
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v8

    move-object v8, v7

    move-object v7, v12

    goto/16 :goto_118

    :pswitch_6b
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_fa

    :pswitch_80
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v2

    goto :goto_e3

    :pswitch_93
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_cb

    :pswitch_9f
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v2

    goto :goto_b9

    :pswitch_a8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 183
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b8

    return-object v1

    :cond_b8
    move-object v5, p0

    .line 181
    :goto_b9
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    .line 184
    iget-object p1, v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_cb

    return-object v1

    .line 181
    :cond_cb
    :goto_cb
    check-cast p1, Ljava/util/List;

    .line 185
    iget-object v6, v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {v6, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_df

    return-object v1

    :cond_df
    move-object v7, v5

    move-object v5, p1

    move-object p1, v6

    move-object v6, v2

    .line 181
    :goto_e3
    move-object v2, p1

    check-cast v2, Ljava/util/List;

    .line 186
    iget-object p1, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {p1, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_fa

    return-object v1

    .line 181
    :cond_fa
    :goto_fa
    check-cast p1, Ljava/util/List;

    .line 187
    iget-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$4:Ljava/lang/Object;

    const/4 v9, 0x5

    iput v9, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {v8, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v1, :cond_112

    return-object v1

    :cond_112
    move-object v12, v2

    move-object v2, p1

    move-object p1, v8

    move-object v8, v6

    move-object v6, v5

    move-object v5, v12

    .line 181
    :goto_118
    check-cast p1, Ljava/util/List;

    .line 188
    iget-object v9, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->L$5:Ljava/lang/Object;

    const/4 v10, 0x6

    iput v10, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    invoke-interface {v9, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_132

    return-object v1

    :cond_132
    move-object v10, p1

    move-object p1, v0

    move-object v9, v5

    move-object v0, v7

    move-object v12, v8

    move-object v8, v6

    move-object v6, v12

    .line 181
    :goto_139
    move-object v11, p1

    check-cast v11, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    .line 190
    new-instance p1, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    move-object v5, p1

    move-object v7, v2

    invoke-direct/range {v5 .. v11}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V

    .line 191
    new-instance v1, Lcn/jianyun/workplan/model/CloudFile;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->encryptData()Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    invoke-direct {v1, v5, p1, v4, v5}, Lcn/jianyun/workplan/model/CloudFile;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 192
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    .line 193
    invoke-virtual {v1}, Lcn/jianyun/workplan/model/CloudFile;->fileSize()Ljava/lang/String;

    move-result-object v2

    .line 194
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getBizName()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "toLowerCase(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v4, "_"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v2, ".workplan."

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 195
    invoke-static {v1, p1, v5, v3, v5}, Lcn/jianyun/workplan/model/CloudFile;->copy$default(Lcn/jianyun/workplan/model/CloudFile;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcn/jianyun/workplan/model/CloudFile;

    move-result-object p1

    return-object p1

    :pswitch_data_196
    .packed-switch 0x0
        :pswitch_a8
        :pswitch_9f
        :pswitch_93
        :pswitch_80
        :pswitch_6b
        :pswitch_4f
        :pswitch_2e
    .end packed-switch
.end method

.method public setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 39
    invoke-static {p0, p1, p2}, Lcn/jianyun/workplan/main/base/service/BaseService$DefaultImpls;->setProjectId(Lcn/jianyun/workplan/main/base/service/BaseService;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final tryInitProject(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;

    iget v3, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 310
    iget v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_4d

    if-eq v4, v7, :cond_45

    if-eq v4, v6, :cond_3d

    if-ne v4, v5, :cond_35

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b2

    :cond_35
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3d
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_a3

    :cond_45
    iget-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5e

    :cond_4d
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 311
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object v0, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->L$0:Ljava/lang/Object;

    iput v7, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    invoke-interface {v1, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5d

    return-object v3

    :cond_5d
    move-object v4, v0

    .line 310
    :goto_5e
    check-cast v1, Ljava/util/List;

    .line 312
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b5

    .line 313
    iget-object v1, v4, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    new-instance v15, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    const-string v8, "default"

    const-string v9, "\u9ed8\u8ba4\u9879\u76ee"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1fec

    const/16 v23, 0x0

    move-object v7, v15

    move-object v5, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move/from16 v21, v22

    move-object/from16 v22, v23

    invoke-direct/range {v7 .. v22}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->L$0:Ljava/lang/Object;

    iput v6, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    invoke-interface {v1, v5, v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a3

    return-object v3

    :cond_a3
    :goto_a3
    const/4 v1, 0x0

    .line 314
    iput-object v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    const-string v1, "default"

    invoke-virtual {v4, v1, v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b2

    return-object v3

    .line 316
    :cond_b2
    :goto_b2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_b5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final tryNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 63
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    const-string v3, "notifyT"

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4a

    if-eq v2, v6, :cond_42

    if-eq v2, v5, :cond_3a

    if-ne v2, v4, :cond_32

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7f

    :cond_32
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_73

    :cond_42
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5b

    :cond_4a
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    invoke-virtual {p1, v3, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheHour(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5a

    return-object v1

    :cond_5a
    move-object v2, p0

    :goto_5b
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ge p1, v6, :cond_66

    .line 66
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 68
    :cond_66
    iget-object p1, v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    invoke-virtual {p1, v3, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheNow(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_73

    return-object v1

    :cond_73
    :goto_73
    const/4 p1, 0x0

    .line 69
    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    invoke-virtual {v2, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7f

    return-object v1

    .line 70
    :cond_7f
    :goto_7f
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public writeAll(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/base/dto/BaseBackupData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 210
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    packed-switch v2, :pswitch_data_174

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2c
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_170

    :pswitch_31
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_13b

    :pswitch_42
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_113

    :pswitch_53
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_eb

    :pswitch_64
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_c3

    :pswitch_74
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_9b

    :pswitch_84
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const-string p2, "null cannot be cast to non-null type cn.jianyun.workplan.module.schedule.model.ScheduleBackupData"

    .line 211
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    .line 213
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getProjectList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 406
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v3, p0

    move-object v2, p1

    move-object p1, p2

    :cond_9b
    :goto_9b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    .line 214
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {v4, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9b

    return-object v1

    .line 217
    :cond_b9
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getDutyList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 408
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_c3
    :goto_c3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_e1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 218
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {v4, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_c3

    return-object v1

    .line 221
    :cond_e1
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getAlarmList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 410
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_eb
    :goto_eb
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_109

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 222
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {v4, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_eb

    return-object v1

    .line 225
    :cond_109
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getPlanList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 412
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_113
    :goto_113
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_131

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 226
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x4

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {v4, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->insert(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_113

    return-object v1

    .line 229
    :cond_131
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getWorkList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 414
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13b
    :goto_13b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_159

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 230
    iget-object v4, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {v4, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_13b

    return-object v1

    .line 233
    :cond_159
    iget-object p1, v3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->configDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getAppConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object p2

    const/4 v2, 0x0

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    invoke-interface {p1, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->set(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_170

    return-object v1

    .line 235
    :cond_170
    :goto_170
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_174
    .packed-switch 0x0
        :pswitch_84
        :pswitch_74
        :pswitch_64
        :pswitch_53
        :pswitch_42
        :pswitch_31
        :pswitch_2c
    .end packed-switch
.end method

.method public final writeByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;

    iget v1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;

    invoke-direct {v0, p0, p3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 263
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_97

    if-eq v2, v7, :cond_85

    if-eq v2, v6, :cond_71

    if-eq v2, v5, :cond_5c

    if-eq v2, v4, :cond_47

    if-ne v2, v3, :cond_3f

    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1e4

    :cond_3f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_47
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_190

    :cond_5c
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_13c

    :cond_71
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_e8

    :cond_85
    iget-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, p2

    goto :goto_b0

    :cond_97
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 264
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object p3

    .line 265
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleProjectDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    iput-object p0, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    iput v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    invoke-interface {v2, p2, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_af

    return-object v1

    :cond_af
    move-object v2, p0

    .line 266
    :goto_b0
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getWorkList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 416
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 417
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_c1
    :goto_c1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_dc

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 266
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getProjectUuid()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c1

    .line 417
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c1

    .line 418
    :cond_dc
    check-cast v7, Ljava/util/List;

    .line 416
    check-cast v7, Ljava/lang/Iterable;

    .line 419
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v7, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, p3

    :cond_e8
    :goto_e8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_107

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 267
    iget-object v8, v7, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleWorkDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    iput v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    invoke-interface {v8, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_e8

    return-object v1

    .line 269
    :cond_107
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getPlanList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 421
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 422
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_118
    :goto_118
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_133

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 269
    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->getProjectUuid()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_118

    .line 422
    invoke-interface {p3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_118

    .line 423
    :cond_133
    check-cast p3, Ljava/util/List;

    .line 421
    check-cast p3, Ljava/lang/Iterable;

    .line 424
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, v7

    :cond_13c
    :goto_13c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_15b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    .line 270
    iget-object v7, v6, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->schedulePlanDao:Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    invoke-interface {v7, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->insert(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_13c

    return-object v1

    .line 272
    :cond_15b
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getDutyList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 426
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 427
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_16c
    :goto_16c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_187

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 272
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getProjectUuid()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16c

    .line 427
    invoke-interface {p3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16c

    .line 428
    :cond_187
    check-cast p3, Ljava/util/List;

    .line 426
    check-cast p3, Ljava/lang/Iterable;

    .line 429
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, v6

    :cond_190
    :goto_190
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1af

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 273
    iget-object v6, v5, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->scheduleDutyDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    invoke-interface {v6, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_190

    return-object v1

    .line 275
    :cond_1af
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;->getAlarmList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 431
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/util/Collection;

    .line 432
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1c0
    :goto_1c0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1db

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 275
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;->getProjectUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1c0

    .line 432
    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1c0

    .line 433
    :cond_1db
    check-cast p3, Ljava/util/List;

    .line 431
    check-cast p3, Ljava/lang/Iterable;

    .line 434
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object p2, v5

    :cond_1e4
    :goto_1e4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_204

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;

    .line 276
    iget-object v2, p2, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->alarmDao:Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;

    iput-object p2, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    invoke-interface {v2, p3, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1e4

    return-object v1

    .line 278
    :cond_204
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$clearAll$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4,
        0x4,
        0x5,
        0x5,
        0x6
    }
    l = {
        0xc8,
        0xc9,
        0xca,
        0xcb,
        0xcc,
        0xcd,
        0xce
    }
    m = "clearAll"
    n = {
        "this",
        "this",
        "currentBackupData",
        "this",
        "currentBackupData",
        "this",
        "currentBackupData",
        "this",
        "currentBackupData",
        "this",
        "currentBackupData",
        "currentBackupData"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$clearAll$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$deleteByProject$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->deleteByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x100,
        0x101,
        0x102,
        0x103,
        0x104
    }
    m = "deleteByProject"
    n = {
        "this",
        "projectUuid",
        "this",
        "projectUuid",
        "this",
        "projectUuid",
        "this",
        "projectUuid"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$deleteByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->deleteByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$getWidgetDataModel$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getWidgetDataModel(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5
    }
    l = {
        0x15c,
        0x15e,
        0x165,
        0x16c,
        0x16f,
        0x170
    }
    m = "getWidgetDataModel"
    n = {
        "this",
        "currentDate",
        "widgetData",
        "this",
        "currentDate",
        "widgetData",
        "holidayMap",
        "this",
        "currentDate",
        "widgetData",
        "config",
        "this",
        "currentDate",
        "widgetData",
        "this",
        "widgetData",
        "projectId",
        "widgetData",
        "periodDutys"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$getWidgetDataModel$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getWidgetDataModel(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$increaseByProject$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->increaseByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x7,
        0x7
    }
    l = {
        0x11b,
        0x11c,
        0x11d,
        0x11e,
        0x122,
        0x127,
        0x12c,
        0x131
    }
    m = "increaseByProject"
    n = {
        "this",
        "backupData",
        "projectUuid",
        "this",
        "backupData",
        "projectUuid",
        "localWorkList",
        "this",
        "backupData",
        "projectUuid",
        "localWorkList",
        "localPlanList",
        "this",
        "backupData",
        "projectUuid",
        "localWorkList",
        "localPlanList",
        "localDutyList",
        "this",
        "backupData",
        "projectUuid",
        "localWorkList",
        "localPlanList",
        "localDutyList",
        "localAlarmList",
        "this",
        "backupData",
        "projectUuid",
        "localPlanList",
        "localDutyList",
        "localAlarmList",
        "this",
        "backupData",
        "projectUuid",
        "localDutyList",
        "localAlarmList",
        "this",
        "localAlarmList"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$increaseByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->increaseByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$isEmpty$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->isEmpty(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {}
    l = {
        0xee
    }
    m = "isEmpty"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isEmpty$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->isEmpty(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$isWorkUsed$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->isWorkUsed(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0xf2,
        0xf5,
        0xf8
    }
    m = "isWorkUsed"
    n = {
        "this",
        "workUuid",
        "this",
        "workUuid"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$isWorkUsed$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->isWorkUsed(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentAlarmData$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentAlarmData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {}
    l = {
        0x147,
        0x147
    }
    m = "listCurrentAlarmData"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentAlarmData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentAlarmData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentPlanData$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentPlanData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {}
    l = {
        0x143,
        0x143
    }
    m = "listCurrentPlanData"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentPlanData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentPlanData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$listCurrentWorkData$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentWorkData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {}
    l = {
        0x13f,
        0x13f
    }
    m = "listCurrentWorkData"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$listCurrentWorkData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->listCurrentWorkData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$loadCurrentAlarmDataWithNextTime$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->loadCurrentAlarmDataWithNextTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x84,
        0x8b,
        0x8b,
        0x8f
    }
    m = "loadCurrentAlarmDataWithNextTime"
    n = {
        "this",
        "beginDay",
        "endDay",
        "alarms",
        "this",
        "beginDay",
        "endDay",
        "alarms",
        "this",
        "alarms",
        "this",
        "alarms",
        "dutys"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$loadCurrentAlarmDataWithNextTime$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->loadCurrentAlarmDataWithNextTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$makeNotify$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x4c,
        0x55,
        0x58,
        0x59,
        0x5b
    }
    m = "makeNotify"
    n = {
        "this",
        "this",
        "beginDay",
        "endDay",
        "notifyInfos",
        "this",
        "beginDay",
        "endDay",
        "notifyInfos",
        "project",
        "this",
        "beginDay",
        "endDay",
        "notifyInfos",
        "project",
        "works",
        "this",
        "beginDay",
        "endDay",
        "notifyInfos",
        "works",
        "alarmInfos"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$5",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$5",
        "L$6",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$5",
        "L$6"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$makeNotify$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass2 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$notifyWidget$2)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->notifyWidget(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService$notifyWidget$2"
    f = "ScheduleService.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;-><init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 58
    iget v0, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->label:I

    if-nez v0, :cond_16

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$notifyWidget$2;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reloadWidget()V

    .line 60
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 58
    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$prepareBackupData$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->prepareBackupData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5
    }
    l = {
        0xb7,
        0xb8,
        0xb9,
        0xba,
        0xbb,
        0xbc
    }
    m = "prepareBackupData"
    n = {
        "this",
        "this",
        "projectList",
        "this",
        "projectList",
        "workList",
        "this",
        "projectList",
        "workList",
        "planList",
        "this",
        "projectList",
        "workList",
        "planList",
        "datalist",
        "this",
        "projectList",
        "workList",
        "planList",
        "datalist",
        "alarmList"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$prepareBackupData$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->prepareBackupData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$tryInitProject$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryInitProject(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x137,
        0x139,
        0x13a
    }
    m = "tryInitProject"
    n = {
        "this",
        "this"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryInitProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryInitProject(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$tryNotify$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x40,
        0x44,
        0x45
    }
    m = "tryNotify"
    n = {
        "this",
        "this"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$tryNotify$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$writeAll$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->writeAll(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x4,
        0x4
    }
    l = {
        0xd6,
        0xda,
        0xde,
        0xe2,
        0xe6,
        0xe9
    }
    m = "writeAll"
    n = {
        "this",
        "scheduleData",
        "this",
        "scheduleData",
        "this",
        "scheduleData",
        "this",
        "scheduleData",
        "this",
        "scheduleData"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeAll$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->writeAll(Lcn/jianyun/workplan/module/base/dto/BaseBackupData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.views.service.ScheduleService.AnonymousClass1 (cn.jianyun.workplan.module.schedule.views.service.ScheduleService$writeByProject$1)
.class final Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "ScheduleService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->writeByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.module.schedule.views.service.ScheduleService"
    f = "ScheduleService.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4
    }
    l = {
        0x109,
        0x10b,
        0x10e,
        0x111,
        0x114
    }
    m = "writeByProject"
    n = {
        "this",
        "backupData",
        "projectUuid",
        "this",
        "backupData",
        "projectUuid",
        "this",
        "backupData",
        "projectUuid",
        "this",
        "backupData",
        "projectUuid",
        "this"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService$writeByProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->writeByProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
