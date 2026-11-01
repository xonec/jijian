// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel)
.class public final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;
.super Lcn/jianyun/workplan/module/base/vm/BaseViewModel;
.source "ScheduleMasterViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleMasterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleMasterViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n81#2:421\n107#2,2:422\n81#2:424\n107#2,2:425\n81#2:427\n107#2,2:428\n81#2:430\n107#2,2:431\n81#2:433\n107#2,2:434\n81#2:436\n107#2,2:437\n81#2:439\n107#2,2:440\n81#2:442\n107#2,2:443\n81#2:445\n107#2,2:446\n81#2:448\n107#2,2:449\n81#2:451\n107#2,2:452\n81#2:454\n107#2,2:455\n81#2:457\n107#2,2:458\n81#2:460\n107#2,2:461\n81#2:463\n107#2,2:464\n81#2:466\n107#2,2:467\n81#2:469\n107#2,2:470\n81#2:472\n107#2,2:473\n81#2:475\n107#2,2:476\n1#3:478\n*S KotlinDebug\n*F\n+ 1 ScheduleMasterViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel\n*L\n45#1:421\n45#1:422,2\n47#1:424\n47#1:425,2\n48#1:427\n48#1:428,2\n49#1:430\n49#1:431,2\n51#1:433\n51#1:434,2\n53#1:436\n53#1:437,2\n54#1:439\n54#1:440,2\n55#1:442\n55#1:443,2\n57#1:445\n57#1:446,2\n58#1:448\n58#1:449,2\n59#1:451\n59#1:452,2\n60#1:454\n60#1:455,2\n62#1:457\n62#1:458,2\n63#1:460\n63#1:461,2\n64#1:463\n64#1:464,2\n66#1:466\n66#1:467,2\n68#1:469\n68#1:470,2\n74#1:472\n74#1:473,2\n75#1:475\n75#1:476,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008%\u0008\u0007\u0018\u0000 \u00a1\u00012\u00020\u0001:\u0002\u00a1\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010|\u001a\u00020}J\u000e\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020eJ\u0007\u0010\u0080\u0001\u001a\u00020}J\u0007\u0010\u0081\u0001\u001a\u00020}J\u0007\u0010\u0082\u0001\u001a\u00020,J\u0010\u0010\u0083\u0001\u001a\u00020$2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0010\u0010\u0085\u0001\u001a\u00020w2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0010\u0010\u0086\u0001\u001a\u00020w2\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0007\u0010\u0087\u0001\u001a\u00020}J\u0007\u0010\u0088\u0001\u001a\u00020$J\t\u0010\u0089\u0001\u001a\u00020\u0003H\u0016J\u0010\u0010\u008a\u0001\u001a\u00020}2\u0007\u0010\u008b\u0001\u001a\u000203J\u0007\u0010\u008c\u0001\u001a\u00020\u0008J\u0010\u0010\u008d\u0001\u001a\u00020\u00082\u0007\u0010\u0084\u0001\u001a\u00020\u001dJ\u0007\u0010\u008e\u0001\u001a\u00020\u0008J\u0007\u0010\u008f\u0001\u001a\u00020\u0008J\u0007\u0010\u0090\u0001\u001a\u00020\u0008J\u0007\u0010\u0091\u0001\u001a\u00020\u0008J\u0007\u0010\u0092\u0001\u001a\u00020}J\u0010\u0010\u0093\u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wJ\u0012\u0010\u0095\u0001\u001a\u00020}2\t\u0008\u0002\u0010\u0096\u0001\u001a\u00020\u0008J\u000f\u0010\u0097\u0001\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020`J\u0007\u0010\u0098\u0001\u001a\u00020}J\t\u0010\u0099\u0001\u001a\u00020}H\u0016J\u0012\u0010\u009a\u0001\u001a\u00020}2\u0007\u0010\u009b\u0001\u001a\u00020\u0008H\u0016J\u0007\u0010\u009c\u0001\u001a\u00020}J\u0010\u0010\u009d\u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wJ\u0010\u0010\u009e\u0001\u001a\u00020\u00082\u0007\u0010\u009f\u0001\u001a\u00020$J\u0010\u0010\u00a0\u0001\u001a\u00020}2\u0007\u0010\u0094\u0001\u001a\u00020wR+\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R+\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u000b\"\u0004\u0008\u0014\u0010\rR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u000f\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001d8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u000f\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008*\u0010\u000f\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R7\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00082\u0010\u000f\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R+\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u0002038F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u0010\u000f\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108RC\u0010<\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020;0:2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020;0:8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008A\u0010\u000f\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R+\u0010B\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008E\u0010\u000f\u001a\u0004\u0008C\u0010\u000b\"\u0004\u0008D\u0010\rR+\u0010F\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008H\u0010\u000f\u001a\u0004\u0008F\u0010\u000b\"\u0004\u0008G\u0010\rRC\u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020I0+0+2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020I0+0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010\u000f\u001a\u0004\u0008K\u0010/\"\u0004\u0008L\u00101R+\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020N8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008T\u0010\u000f\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR7\u0010U\u001a\u0008\u0012\u0004\u0012\u00020,0+2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008X\u0010\u000f\u001a\u0004\u0008V\u0010/\"\u0004\u0008W\u00101R+\u0010Z\u001a\u00020Y2\u0006\u0010\u0007\u001a\u00020Y8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008_\u0010\u000f\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R7\u0010a\u001a\u0008\u0012\u0004\u0012\u00020`0+2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020`0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008d\u0010\u000f\u001a\u0004\u0008b\u0010/\"\u0004\u0008c\u00101R7\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0+2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020e0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008i\u0010\u000f\u001a\u0004\u0008g\u0010/\"\u0004\u0008h\u00101R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008j\u0010kR+\u0010l\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008o\u0010\u000f\u001a\u0004\u0008m\u0010\u000b\"\u0004\u0008n\u0010\rR+\u0010q\u001a\u00020p2\u0006\u0010\u0007\u001a\u00020p8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008v\u0010\u000f\u001a\u0004\u0008r\u0010s\"\u0004\u0008t\u0010uR7\u0010x\u001a\u0008\u0012\u0004\u0012\u00020w0+2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020w0+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008{\u0010\u000f\u001a\u0004\u0008y\u0010/\"\u0004\u0008z\u00101\u00a8\u0006\u00a2\u0001"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
        "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;",
        "baseRepository",
        "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "scheduleService",
        "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V",
        "<set-?>",
        "",
        "adding",
        "getAdding",
        "()Z",
        "setAdding",
        "(Z)V",
        "adding$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getBaseRepository",
        "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "clear",
        "getClear",
        "setClear",
        "clear$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
        "config",
        "getConfig",
        "()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
        "setConfig",
        "(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V",
        "config$delegate",
        "Ljava/util/Date;",
        "currentDate",
        "getCurrentDate",
        "()Ljava/util/Date;",
        "setCurrentDate",
        "(Ljava/util/Date;)V",
        "currentDate$delegate",
        "",
        "currentProjectName",
        "getCurrentProjectName",
        "()Ljava/lang/String;",
        "setCurrentProjectName",
        "(Ljava/lang/String;)V",
        "currentProjectName$delegate",
        "",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
        "dutys",
        "getDutys",
        "()Ljava/util/List;",
        "setDutys",
        "(Ljava/util/List;)V",
        "dutys$delegate",
        "",
        "gid",
        "getGid",
        "()I",
        "setGid",
        "(I)V",
        "gid$delegate",
        "",
        "Lcn/jianyun/workplan/api/FestivalData;",
        "holidayMap",
        "getHolidayMap",
        "()Ljava/util/Map;",
        "setHolidayMap",
        "(Ljava/util/Map;)V",
        "holidayMap$delegate",
        "homeEdit",
        "getHomeEdit",
        "setHomeEdit",
        "homeEdit$delegate",
        "isEmptyWork",
        "setEmptyWork",
        "isEmptyWork$delegate",
        "Lcn/jianyun/workplan/model/MonthDateInfo;",
        "monthInfos",
        "getMonthInfos",
        "setMonthInfos",
        "monthInfos$delegate",
        "Lcn/jianyun/workplan/model/FormType;",
        "pageType",
        "getPageType",
        "()Lcn/jianyun/workplan/model/FormType;",
        "setPageType",
        "(Lcn/jianyun/workplan/model/FormType;)V",
        "pageType$delegate",
        "periodDutys",
        "getPeriodDutys",
        "setPeriodDutys",
        "periodDutys$delegate",
        "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;",
        "pieData",
        "getPieData",
        "()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;",
        "setPieData",
        "(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V",
        "pieData$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
        "plans",
        "getPlans",
        "setPlans",
        "plans$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
        "projectList",
        "getProjectList",
        "setProjectList",
        "projectList$delegate",
        "getScheduleService",
        "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;",
        "showConfigHint",
        "getShowConfigHint",
        "setShowConfigHint",
        "showConfigHint$delegate",
        "Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;",
        "statModel",
        "getStatModel",
        "()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;",
        "setStatModel",
        "(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V",
        "statModel$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
        "works",
        "getWorks",
        "setWorks",
        "works$delegate",
        "changeConfig",
        "",
        "changeProject",
        "it",
        "closeConfigHint",
        "doChange",
        "fetchDuty",
        "fetchDutyRemark",
        "date",
        "fetchDutyWork",
        "fetchSecondDutyWork",
        "finish",
        "getCurrentDateStr",
        "getRepository",
        "goDay",
        "day",
        "isAlarmPage",
        "isFocus",
        "isHomePage",
        "isSettingPage",
        "isStatPage",
        "isWorkPage",
        "makeClean",
        "makeDuty",
        "work",
        "makeEdit",
        "toggle",
        "makePlanDuty",
        "makeStat",
        "reload",
        "reloadData",
        "dataChanged",
        "removeCurrentDay",
        "setFirstWork",
        "setRemark",
        "remark",
        "setSecondWork",
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

.field private static final CONFIG_HINT_KEY:Ljava/lang/String; = "home_config_hint_dismissed"

.field public static final Companion:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;


# instance fields
.field private final adding$delegate:Landroidx/compose/runtime/MutableState;

.field private final baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

.field private final clear$delegate:Landroidx/compose/runtime/MutableState;

.field private final config$delegate:Landroidx/compose/runtime/MutableState;

.field private final currentDate$delegate:Landroidx/compose/runtime/MutableState;

.field private final currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

.field private final dutys$delegate:Landroidx/compose/runtime/MutableState;

.field private final gid$delegate:Landroidx/compose/runtime/MutableState;

.field private final holidayMap$delegate:Landroidx/compose/runtime/MutableState;

.field private final homeEdit$delegate:Landroidx/compose/runtime/MutableState;

.field private final isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

.field private final monthInfos$delegate:Landroidx/compose/runtime/MutableState;

.field private final pageType$delegate:Landroidx/compose/runtime/MutableState;

.field private final periodDutys$delegate:Landroidx/compose/runtime/MutableState;

.field private final pieData$delegate:Landroidx/compose/runtime/MutableState;

.field private final plans$delegate:Landroidx/compose/runtime/MutableState;

.field private final projectList$delegate:Landroidx/compose/runtime/MutableState;

.field private final scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

.field private final showConfigHint$delegate:Landroidx/compose/runtime/MutableState;

.field private final statModel$delegate:Landroidx/compose/runtime/MutableState;

.field private final works$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->Companion:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V
    .registers 38
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "baseRepository"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scheduleService"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct/range {p0 .. p0}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;-><init>()V

    .line 37
    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    .line 38
    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    .line 45
    new-instance v1, Lcn/jianyun/workplan/model/FormType;

    const-string v5, "home"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    .line 47
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    .line 48
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    .line 49
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 51
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 53
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, ""

    .line 54
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    .line 55
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x0

    .line 57
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    .line 59
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x1

    .line 60
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->showConfigHint$delegate:Landroidx/compose/runtime/MutableState;

    .line 62
    new-instance v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-object v6, v5

    const/4 v8, 0x0

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

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x3ffffff

    const/16 v34, 0x0

    invoke-direct/range {v6 .. v34}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    .line 63
    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    iput-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    .line 64
    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    .line 66
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    .line 68
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->monthInfos$delegate:Landroidx/compose/runtime/MutableState;

    .line 74
    new-instance v1, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    const/4 v4, 0x3

    invoke-direct {v1, v2, v2, v4, v2}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 75
    new-instance v1, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v9, 0xf

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, "ScheduleMasterView"

    .line 78
    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentPage(Ljava/lang/String;)V

    .line 79
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reload()V

    return-void
.end method

.method public static synthetic makeEdit$default(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    .line 82
    :cond_5
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makeEdit(Z)V

    return-void
.end method


# virtual methods
.method public final changeConfig()V
    .registers 8

    .line 350
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final changeProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V
    .registers 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final closeConfigHint()V
    .registers 8

    const/4 v0, 0x0

    .line 157
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setShowConfigHint(Z)V

    .line 158
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final doChange()V
    .registers 2

    const/4 v0, 0x0

    .line 153
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    return-void
.end method

.method public final fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;
    .registers 19

    .line 182
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getDutys()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 183
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v3

    invoke-static {v3}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_2b

    :cond_2a
    const/4 v1, 0x0

    .line 182
    :goto_2b
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v1, :cond_47

    .line 184
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

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

    const/16 v16, 0x1fff

    const/16 v17, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v17}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_47
    return-object v1
.end method

.method public final fetchDutyRemark(Ljava/util/Date;)Ljava/lang/String;
    .registers 6

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getDutys()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 191
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_2c

    :cond_2b
    const/4 v1, 0x0

    .line 190
    :goto_2c
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v1, :cond_33

    const-string p1, ""

    return-object p1

    .line 196
    :cond_33
    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final fetchDutyWork(Ljava/util/Date;)Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;
    .registers 29

    const-string v0, "date"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getDutys()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 202
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_2f

    :cond_2e
    move-object v2, v3

    .line 201
    :goto_2f
    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v2, :cond_5c

    .line 205
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v4, v0

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

    return-object v0

    .line 207
    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getWorks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_66

    move-object v3, v1

    :cond_82
    check-cast v3, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-nez v3, :cond_af

    .line 209
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v4, v0

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

    return-object v0

    :cond_af
    return-object v3
.end method

.method public final fetchSecondDutyWork(Ljava/util/Date;)Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;
    .registers 29

    const-string v0, "date"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getDutys()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 217
    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v4

    invoke-static/range {p1 .. p1}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_2f

    :cond_2e
    move-object v2, v3

    .line 216
    :goto_2f
    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v2, :cond_5c

    .line 220
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v4, v0

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

    return-object v0

    .line 222
    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getWorks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_66

    move-object v3, v1

    :cond_82
    check-cast v3, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-nez v3, :cond_af

    .line 224
    new-instance v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-object v4, v0

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

    return-object v0

    :cond_af
    return-object v3
.end method

.method public final finish()V
    .registers 8

    const/4 v0, 0x0

    .line 250
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setHomeEdit(Z)V

    .line 251
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final getAdding()Z
    .registers 2

    .line 63
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 460
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 37
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getClear()Z
    .registers 2

    .line 64
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 463
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;
    .registers 2

    .line 62
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 457
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    return-object v0
.end method

.method public final getCurrentDate()Ljava/util/Date;
    .registers 2

    .line 53
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 436
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public final getCurrentDateStr()Ljava/lang/String;
    .registers 3

    .line 71
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toDateString(currentDate)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCurrentProjectName()Ljava/lang/String;
    .registers 2

    .line 54
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 439
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getDutys()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 430
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getGid()I
    .registers 2

    .line 58
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 448
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final getHolidayMap()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcn/jianyun/workplan/api/FestivalData;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 451
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final getHomeEdit()Z
    .registers 2

    .line 57
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 445
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getMonthInfos()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/model/MonthDateInfo;",
            ">;>;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->monthInfos$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 469
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getPageType()Lcn/jianyun/workplan/model/FormType;
    .registers 2

    .line 45
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 421
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/model/FormType;

    return-object v0
.end method

.method public final getPeriodDutys()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 433
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getPieData()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;
    .registers 2

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 475
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    return-object v0
.end method

.method public final getPlans()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 427
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getProjectList()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 442
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 97
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .registers 2

    .line 38
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    return-object v0
.end method

.method public final getShowConfigHint()Z
    .registers 2

    .line 60
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->showConfigHint$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 454
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;
    .registers 2

    .line 74
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 472
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    return-object v0
.end method

.method public final getWorks()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            ">;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 424
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final goDay(I)V
    .registers 4

    .line 241
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getMonth()I

    move-result v0

    .line 242
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1, p1}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object p1

    const-string v1, "gapDay(currentDate, day)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentDate(Ljava/util/Date;)V

    .line 243
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getMonth()I

    move-result p1

    if-eq v0, p1, :cond_25

    .line 245
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->doChange()V

    :cond_25
    return-void
.end method

.method public final isAlarmPage()Z
    .registers 3

    .line 170
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/model/FormType;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "alarm"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isEmptyWork()Z
    .registers 2

    .line 66
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 466
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isFocus(Ljava/util/Date;)Z
    .registers 3

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 149
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isHomePage()Z
    .registers 3

    .line 164
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/model/FormType;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "home"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isSettingPage()Z
    .registers 3

    .line 176
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/model/FormType;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setting"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isStatPage()Z
    .registers 3

    .line 173
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/model/FormType;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "stat"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isWorkPage()Z
    .registers 3

    .line 167
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/model/FormType;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "work"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final makeClean()V
    .registers 8

    .line 406
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final makeDuty(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 9

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 258
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setAdding(Z)V

    .line 260
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final makeEdit(Z)V
    .registers 8

    if-eqz p1, :cond_c

    .line 83
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getHomeEdit()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 84
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->finish()V

    goto :goto_2b

    .line 87
    :cond_c
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->isEmptyWork()Z

    move-result p1

    if-eqz p1, :cond_18

    const-string p1, "\u8bf7\u5148\u8bbe\u7f6e\u597d\u73ed\u6b21\u518d\u6765\u6392\u73ed"

    .line 88
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->toast(Ljava/lang/String;)V

    return-void

    :cond_18
    const/4 p1, 0x1

    .line 91
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setHomeEdit(Z)V

    .line 92
    new-instance p1, Lcn/jianyun/workplan/model/FormType;

    const-string v1, "self"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    :goto_2b
    return-void
.end method

.method public final makePlanDuty(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;)V
    .registers 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final makeStat()V
    .registers 8

    .line 302
    new-instance v0, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/util/MyDateTool;->getStartDayOfMonth(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    const-string v2, "getStartDayOfMonth(currentDate)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v2

    invoke-static {v2}, Lcn/jianyun/workplan/util/MyDateTool;->getLastDayStringOfMonth(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getLastDayStringOfMonth(currentDate)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setStatModel(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V

    .line 303
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->isValid()Z

    move-result v0

    if-nez v0, :cond_31

    return-void

    .line 306
    :cond_31
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public reload()V
    .registers 8

    .line 102
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public reloadData(Z)V
    .registers 9

    .line 136
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;ZLkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final removeCurrentDay()V
    .registers 8

    .line 230
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setAdding(Z)V
    .registers 3

    .line 63
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 461
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setClear(Z)V
    .registers 3

    .line 64
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 464
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setConfig(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    .line 458
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setCurrentDate(Ljava/util/Date;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    .line 437
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setCurrentProjectName(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    .line 440
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDutys(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 431
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setEmptyWork(Z)V
    .registers 3

    .line 66
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 467
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setFirstWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 9

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v0

    .line 358
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->setWorkUuid(Ljava/lang/String;)V

    .line 360
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setGid(I)V
    .registers 3

    .line 58
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 449
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setHolidayMap(Ljava/util/Map;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcn/jianyun/workplan/api/FestivalData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    .line 452
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setHomeEdit(Z)V
    .registers 3

    .line 57
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 446
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setMonthInfos(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/model/MonthDateInfo;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->monthInfos$delegate:Landroidx/compose/runtime/MutableState;

    .line 470
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPageType(Lcn/jianyun/workplan/model/FormType;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    .line 422
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPeriodDutys(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 434
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    .line 476
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPlans(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    .line 428
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setProjectList(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    .line 443
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setRemark(Ljava/lang/String;)Z
    .registers 9

    const-string v0, "remark"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    const/4 p1, 0x1

    return p1
.end method

.method public final setSecondWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 9

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v0

    .line 369
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->setSecondWorkUuid(Ljava/lang/String;)V

    .line 371
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setShowConfigHint(Z)V
    .registers 3

    .line 60
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->showConfigHint$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 455
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setStatModel(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 473
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setWorks(Ljava/util/List;)V
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

    .line 47
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    .line 425
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.Companion (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$Companion)
.class public final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;
.super Ljava/lang/Object;
.source "ScheduleMasterViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;",
        "",
        "()V",
        "CONFIG_HINT_KEY",
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


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .registers 2

    invoke-direct {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$Companion;-><init>()V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeConfig$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->changeConfig()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeConfig$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x15f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 350
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_36

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 351
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getConfigDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeConfig$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->set(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_36

    return-object v0

    .line 352
    :cond_36
    :goto_36
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeProject$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->changeProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$changeProject$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x155
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 340
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_32

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 341
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->label:I

    invoke-virtual {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 342
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    .line 343
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 344
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 345
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->resetForm()V

    .line 346
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$closeConfigHint$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->closeConfigHint()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$closeConfigHint$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x9f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 158
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 159
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$closeConfigHint$1;->label:I

    const-string v3, "home_config_hint_dismissed"

    invoke-virtual {p1, v3, v2, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheBoolean(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2e

    return-object v0

    .line 160
    :cond_2e
    :goto_2e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$finish$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->finish()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$finish$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0xfd
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 251
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_35

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 252
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 253
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$finish$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_35

    return-object v0

    .line 254
    :cond_35
    :goto_35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeClean$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makeClean()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeClean$1"
    f = "ScheduleMasterViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x197,
        0x19a
    }
    m = "invokeSuspend"
    n = {
        "i"
    }
    s = {
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 406
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_24

    if-eq v1, v4, :cond_20

    if-ne v1, v2, :cond_18

    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->I$1:I

    iget v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->I$0:I

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_80

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3a

    :cond_24
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 407
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->label:I

    const/4 v5, 0x0

    invoke-static {p1, v3, v1, v4, v5}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3a

    return-object v0

    .line 408
    :cond_3a
    :goto_3a
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result p1

    move v1, p1

    move v5, v3

    move-object p1, p0

    :goto_4b
    if-ge v5, v1, :cond_82

    .line 409
    iget-object v6, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v6

    invoke-static {v6, v5}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 410
    iget-object v7, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v7

    iget-object v8, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "toDateString(day)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p1

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v5, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->I$0:I

    iput v1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->I$1:I

    iput v2, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->label:I

    invoke-interface {v7, v8, v6, v9}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_80

    return-object v0

    :cond_80
    :goto_80
    add-int/2addr v5, v4

    goto :goto_4b

    .line 412
    :cond_82
    iget-object v0, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 413
    iget-object v0, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 414
    iget-object v0, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v0, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setClear(Z)V

    .line 415
    iget-object p1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    const-string v0, "\u5468\u671f\u5185\u73ed\u6b21\u5df2\u88ab\u6e05\u7a7a"

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 416
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeDuty$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makeDuty(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeDuty$1"
    f = "ScheduleMasterViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x105,
        0x109,
        0x113
    }
    m = "invokeSuspend"
    n = {
        "oldRemark"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 24

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 260
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2e

    if-eq v2, v5, :cond_28

    if-eq v2, v4, :cond_20

    if-ne v2, v3, :cond_18

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_dd

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_90

    :cond_28
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_53

    :cond_2e
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 261
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v2

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->label:I

    invoke-interface {v2, v6, v7, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->findByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_53

    return-object v1

    .line 260
    :cond_53
    :goto_53
    check-cast v2, Ljava/util/List;

    .line 262
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-eqz v6, :cond_63

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_65

    :cond_63
    const-string v6, ""

    .line 264
    :cond_65
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_92

    .line 265
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v2

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v8

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->label:I

    invoke-interface {v2, v7, v8, v9}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8f

    return-object v1

    :cond_8f
    move-object v2, v6

    :goto_90
    move-object v13, v2

    goto :goto_93

    :cond_92
    move-object v13, v6

    .line 268
    :goto_93
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v7

    .line 269
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v8

    .line 270
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v12

    .line 271
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchFirstWorkUuid()Ljava/lang/String;

    move-result-object v10

    .line 272
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchSecondWorkUuid()Ljava/lang/String;

    move-result-object v11

    .line 267
    new-instance v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1f84

    const/16 v21, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v21}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 275
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    const/4 v7, 0x0

    iput-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->label:I

    invoke-interface {v4, v2, v6}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_dd

    return-object v1

    .line 277
    :cond_dd
    :goto_dd
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v2

    invoke-static {v2, v5}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v2

    const-string v3, "gapDay(currentDate, 1)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentDate(Ljava/util/Date;)V

    .line 278
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 279
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setAdding(Z)V

    .line 280
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makePlanDuty$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makePlanDuty(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makePlanDuty$1"
    f = "ScheduleMasterViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x11d,
        0x121,
        0x125
    }
    m = "invokeSuspend"
    n = {
        "works",
        "day",
        "i",
        "works",
        "i"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 32

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 284
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->label:I

    const-string v3, "toDateString(day)"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_49

    if-eq v2, v8, :cond_45

    if-eq v2, v7, :cond_32

    if-ne v2, v6, :cond_2a

    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$1:I

    iget v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$0:I

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v0

    :cond_23
    move-object/from16 v29, v9

    move v9, v2

    move-object/from16 v2, v29

    goto/16 :goto_10c

    :cond_2a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_32
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$1:I

    iget v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$0:I

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/util/Date;

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v9

    move-object v9, v10

    move-object v10, v0

    goto :goto_af

    :cond_45
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5e

    :cond_49
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 285
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v2

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v8, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->label:I

    invoke-static {v2, v5, v9, v8, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5e

    return-object v1

    .line 286
    :cond_5e
    :goto_5e
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->fetchPlans()Ljava/util/List;

    move-result-object v2

    .line 287
    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v9

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result v9

    move-object v10, v0

    :goto_73
    if-ge v5, v9, :cond_10f

    .line 288
    iget-object v11, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v11

    invoke-static {v11, v5}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v11

    .line 289
    iget-object v12, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v12

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v12

    iget-object v13, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v11}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v10

    check-cast v15, Lkotlin/coroutines/Continuation;

    iput-object v2, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    iput-object v11, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    iput v5, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$0:I

    iput v9, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$1:I

    iput v7, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->label:I

    invoke-interface {v12, v13, v14, v15}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v1, :cond_aa

    return-object v1

    :cond_aa
    move/from16 v29, v9

    move-object v9, v2

    move/from16 v2, v29

    .line 291
    :goto_af
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    rem-int v12, v5, v12

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 292
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v14

    iget-object v13, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v19

    invoke-static {v11}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchFirstWorkUuid()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchSecondWorkUuid()Ljava/lang/String;

    move-result-object v18

    new-instance v11, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1fc4

    const/16 v28, 0x0

    move-object v13, v11

    invoke-direct/range {v13 .. v28}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 293
    iget-object v12, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v12

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v12

    move-object v13, v10

    check-cast v13, Lkotlin/coroutines/Continuation;

    iput-object v9, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    iput v5, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$0:I

    iput v2, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->I$1:I

    iput v6, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->label:I

    invoke-interface {v12, v11, v13}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_23

    return-object v1

    :goto_10c
    add-int/2addr v5, v8

    goto/16 :goto_73

    .line 295
    :cond_10f
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1, v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 296
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 297
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u5468\u671f\u8f6e\u73ed\u8bbe\u7f6e\u6210\u529f"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 298
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeStat$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makeStat()V
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
    value = "SMAP\nScheduleMasterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleMasterViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n1855#2,2:421\n1855#2:423\n1856#2:425\n1549#2:426\n1620#2,3:427\n1#3:424\n*S KotlinDebug\n*F\n+ 1 ScheduleMasterViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1\n*L\n312#1:421,2\n315#1:423\n315#1:425\n328#1:426\n328#1:427,3\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$makeStat$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x133
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 21

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 306
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1f

    if-ne v2, v3, :cond_17

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_55

    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 307
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v6

    invoke-virtual {v6}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getBeginDate()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getEndDate()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->label:I

    invoke-interface {v4, v5, v6, v7, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_54

    return-object v1

    :cond_54
    move-object v1, v2

    :goto_55
    check-cast v4, Ljava/util/List;

    invoke-virtual {v1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setPeriodDutys(Ljava/util/List;)V

    .line 308
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPeriodDutys()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setDutys(Ljava/util/List;)V

    .line 311
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getWorks()Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 312
    iget-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    .line 421
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_78
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_89

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    const/4 v5, 0x0

    .line 313
    invoke-virtual {v4, v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    goto :goto_78

    .line 315
    :cond_89
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPeriodDutys()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 423
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_95
    :goto_95
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_104

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 317
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_c6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a9

    goto :goto_c7

    :cond_c6
    move-object v6, v7

    :goto_c7
    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-eqz v6, :cond_d3

    .line 319
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v6, v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    .line 322
    :cond_d3
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_db
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_db

    move-object v7, v6

    :cond_f7
    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-eqz v7, :cond_95

    .line 324
    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v7, v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    goto :goto_95

    .line 328
    :cond_104
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    .line 426
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 427
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_119
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_143

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 428
    check-cast v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 329
    new-instance v12, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getTheme()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v10, 0x8

    const/4 v11, 0x0

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 428
    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_119

    .line 429
    :cond_143
    move-object v15, v2

    check-cast v15, Ljava/util/List;

    .line 332
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    const-string v13, "\u73ed\u6b21\u7edf\u8ba1"

    const-string v14, "\u6b21"

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    invoke-static/range {v13 .. v18}, Lcn/jianyun/workplan/ui/graph/model/PieGraphDataKt;->makePieStatData$default(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IILjava/lang/Object;)Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V

    .line 333
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getGid()I

    move-result v2

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setGid(I)V

    .line 335
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getPieData()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-result-object v1

    const-string v2, "make data"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 336
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reload$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reload()V
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
    value = "SMAP\nScheduleMasterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleMasterViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n1#2:421\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reload$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x68,
        0x69,
        0x6a,
        0x6e,
        0x77,
        0x78,
        0x79,
        0x7a,
        0x7e,
        0x7f,
        0x83
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 102
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v1, :pswitch_data_24c

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_14
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_249

    :pswitch_19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_21c

    :pswitch_1e
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1fc

    :pswitch_27
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1cb

    :pswitch_30
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1a6

    :pswitch_39
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_182

    :pswitch_42
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_168

    :pswitch_4b
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_10e

    :pswitch_50
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_ac

    :pswitch_58
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_8e

    :pswitch_60
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_79

    :pswitch_64
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryInitProject(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_79

    return-object v0

    .line 105
    :cond_79
    :goto_79
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8e

    return-object v0

    :cond_8e
    :goto_8e
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 106
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleProjectDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-interface {p1, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_ac

    return-object v0

    :cond_ac
    :goto_ac
    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setProjectList(Ljava/util/List;)V

    .line 107
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getProjectList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_bf
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_db

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_bf

    goto :goto_dc

    :cond_db
    move-object v5, v4

    :goto_dc
    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    if-nez v5, :cond_122

    .line 109
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getProjectList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 110
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10e

    return-object v0

    .line 111
    :cond_10e
    :goto_10e
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getProjectList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    goto :goto_12b

    .line 114
    :cond_122
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    .line 117
    :goto_12b
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    new-instance v1, Lcn/jianyun/workplan/model/FormType;

    const-string v6, "self"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    .line 118
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setOldSid(I)V

    .line 119
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5}, Lcn/jianyun/workplan/util/MyDateTool;->getYear(Ljava/util/Date;)I

    move-result v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v5, v6}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_168

    return-object v0

    :cond_168
    :goto_168
    check-cast p1, Ljava/util/Map;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setHolidayMap(Ljava/util/Map;)V

    .line 120
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_182

    return-object v0

    :cond_182
    :goto_182
    check-cast p1, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setConfig(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V

    .line 121
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object p1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x7

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-interface {p1, v5, v6}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1a6

    return-object v0

    :cond_1a6
    :goto_1a6
    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setWorks(Ljava/util/List;)V

    .line 122
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    move-result-object p1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/16 v7, 0x8

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-interface {p1, v5, v6}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1cb

    return-object v0

    :cond_1cb
    :goto_1cb
    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setPlans(Ljava/util/List;)V

    .line 123
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getWorks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setEmptyWork(Z)V

    .line 125
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    check-cast p1, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;

    invoke-static {p1, v2, v3, v4}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;->reloadData$default(Lcn/jianyun/workplan/module/base/vm/BaseViewModel;ZILjava/lang/Object;)V

    .line 126
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/16 v5, 0x9

    iput v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    const-string v5, "home_config_hint_dismissed"

    invoke-virtual {p1, v5, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->booleanCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1fc

    return-object v0

    :cond_1fc
    :goto_1fc
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setShowConfigHint(Z)V

    .line 127
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/16 v2, 0xa

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->tryUpgrade(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_21c

    return-object v0

    :cond_21c
    :goto_21c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_235

    .line 129
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    new-instance v7, Lcn/jianyun/workplan/model/FormType;

    const-string v2, "upgrade"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    .line 131
    :cond_235
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/16 v2, 0xb

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reload$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_249

    return-object v0

    .line 132
    :cond_249
    :goto_249
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_24c
    .packed-switch 0x0
        :pswitch_64
        :pswitch_60
        :pswitch_58
        :pswitch_50
        :pswitch_4b
        :pswitch_42
        :pswitch_39
        :pswitch_30
        :pswitch_27
        :pswitch_1e
        :pswitch_19
        :pswitch_14
    .end packed-switch
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reloadData$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$reloadData$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x8c,
        0x8d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $dataChanged:Z

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;ZLkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-boolean p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->$dataChanged:Z

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-boolean v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->$dataChanged:Z

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;ZLkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 136
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1f

    if-eq v1, v3, :cond_1b

    if-ne v1, v2, :cond_13

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8f

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7d

    :cond_1f
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 137
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v1

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->isMondayFirst()Z

    move-result v4

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowFestival()Z

    move-result v5

    iget-object v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getHolidayMap()Ljava/util/Map;

    move-result-object v6

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    iget-object v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getFillCalendar()Z

    move-result v6

    invoke-static {v1, v4, v5, v6}, Lcn/jianyun/workplan/util/MyDateTool;->getMonthInfo(Ljava/util/Date;ZLjava/util/Map;Z)Ljava/util/List;

    move-result-object v1

    const-string v4, "getMonthInfo(currentDate\u2026f()),config.fillCalendar)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setMonthInfos(Ljava/util/List;)V

    .line 138
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->makeStat()V

    .line 139
    iget-boolean p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->$dataChanged:Z

    if-eqz p1, :cond_8f

    .line 140
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->notifyWidget(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7d

    return-object v0

    .line 141
    :cond_7d
    :goto_7d
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$reloadData$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->makeNotify(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8f

    return-object v0

    .line 143
    :cond_8f
    :goto_8f
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$removeCurrentDay$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->removeCurrentDay()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$removeCurrentDay$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0xe7,
        0xea
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 230
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6d

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_43

    :cond_1e
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 231
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->label:I

    invoke-interface {p1, v1, v4, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->findByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_43

    return-object v0

    .line 230
    :cond_43
    :goto_43
    check-cast p1, Ljava/util/List;

    .line 233
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_72

    .line 234
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->label:I

    invoke-interface {p1, v1, v4, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6d

    return-object v0

    .line 235
    :cond_6d
    :goto_6d
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 237
    :cond_72
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setFirstWork$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setFirstWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setFirstWork$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x169
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 360
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_32

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 361
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 362
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 363
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->resetForm()V

    .line 364
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 365
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setRemark$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setRemark(Ljava/lang/String;)Z
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setRemark$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x185,
        0x188,
        0x18a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $remark:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->$remark:Ljava/lang/String;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->$remark:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 25

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 380
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2b

    if-eq v2, v5, :cond_26

    if-eq v2, v4, :cond_26

    if-ne v2, v3, :cond_1e

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_dd

    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_aa

    :cond_2b
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 381
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v6

    .line 382
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->isAdd()Z

    move-result v2

    if-eqz v2, :cond_7a

    .line 383
    new-instance v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 384
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v8

    .line 385
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 386
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v13

    .line 387
    iget-object v14, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->$remark:Ljava/lang/String;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1f9c

    const/16 v22, 0x0

    move-object v7, v2

    .line 383
    invoke-direct/range {v7 .. v22}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 389
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->label:I

    invoke-interface {v4, v2, v6}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_aa

    return-object v1

    .line 392
    :cond_7a
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->$remark:Ljava/lang/String;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1fbf

    const/16 v21, 0x0

    invoke-static/range {v6 .. v21}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->copy$default(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v6

    move-object v7, v0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->label:I

    invoke-interface {v2, v6, v7}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_aa

    return-object v1

    .line 394
    :cond_aa
    :goto_aa
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    .line 395
    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v6

    .line 396
    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getBeginDate()Ljava/lang/String;

    move-result-object v7

    .line 397
    iget-object v8, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v8

    invoke-virtual {v8}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getEndDate()Ljava/lang/String;

    move-result-object v8

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    .line 394
    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->label:I

    invoke-interface {v4, v6, v7, v8, v9}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_dc

    return-object v1

    :cond_dc
    move-object v1, v2

    :goto_dd
    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setDutys(Ljava/util/List;)V

    .line 399
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getDutys()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setPeriodDutys(Ljava/util/List;)V

    .line 400
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 401
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setSecondWork$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleMasterViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->setSecondWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel$setSecondWork$1"
    f = "ScheduleMasterViewModel.kt"
    i = {}
    l = {
        0x174
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 371
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_32

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 372
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 373
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->reloadData(Z)V

    .line 374
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->resetForm()V

    .line 375
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 376
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
