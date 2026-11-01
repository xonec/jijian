// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel
// markers: Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel)
.class public final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;
.super Lcn/jianyun/workplan/module/base/vm/BaseViewModel;
.source "ScheduleStatViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScheduleStatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n81#2:552\n107#2,2:553\n81#2:555\n107#2,2:556\n81#2:558\n107#2,2:559\n81#2:561\n107#2,2:562\n81#2:564\n107#2,2:565\n81#2:567\n107#2,2:568\n81#2:570\n107#2,2:571\n81#2:573\n107#2,2:574\n81#2:576\n107#2,2:577\n81#2:579\n107#2,2:580\n81#2:582\n107#2,2:583\n81#2:585\n107#2,2:586\n81#2:588\n107#2,2:589\n81#2:591\n107#2,2:592\n81#2:594\n107#2,2:595\n81#2:597\n107#2,2:598\n81#2:600\n107#2,2:601\n81#2:603\n107#2,2:604\n81#2:606\n107#2,2:607\n81#2:609\n107#2,2:610\n81#2:612\n107#2,2:613\n1#3:615\n*S KotlinDebug\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel\n*L\n50#1:552\n50#1:553,2\n52#1:555\n52#1:556,2\n53#1:558\n53#1:559,2\n54#1:561\n54#1:562,2\n56#1:564\n56#1:565,2\n58#1:567\n58#1:568,2\n59#1:570\n59#1:571,2\n60#1:573\n60#1:574,2\n62#1:576\n62#1:577,2\n63#1:579\n63#1:580,2\n64#1:582\n64#1:583,2\n66#1:585\n66#1:586,2\n67#1:588\n67#1:589,2\n68#1:591\n68#1:592,2\n70#1:594\n70#1:595,2\n73#1:597\n73#1:598,2\n74#1:600\n74#1:601,2\n75#1:603\n75#1:604,2\n81#1:606\n81#1:607,2\n82#1:609\n82#1:610,2\n83#1:612\n83#1:613,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008&\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020iJ\u0008\u0010\u0088\u0001\u001a\u00030\u0085\u0001J\u0008\u0010\u0089\u0001\u001a\u00030\u0085\u0001J\u0012\u0010\u008a\u0001\u001a\u00020$2\u0007\u0010\u008b\u0001\u001a\u00020$H\u0002J\u0007\u0010\u008c\u0001\u001a\u00020:J\u0010\u0010\u008d\u0001\u001a\u00020$2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u008f\u0001\u001a\u00020\u007f2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u0090\u0001\u001a\u00020\u007f2\u0007\u0010\u008e\u0001\u001a\u00020\u001dJ\u0010\u0010\u0091\u0001\u001a\u00020$2\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\u0008\u0010\u0093\u0001\u001a\u00030\u0085\u0001J\u0007\u0010\u0094\u0001\u001a\u00020$J\t\u0010\u0095\u0001\u001a\u00020\u0003H\u0016J\u0011\u0010\u0096\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0097\u0001\u001a\u00020?J\u0007\u0010\u0098\u0001\u001a\u00020\u0008J\u0007\u0010\u0099\u0001\u001a\u00020\u0008J\u0007\u0010\u009a\u0001\u001a\u00020\u0008J\u0007\u0010\u009b\u0001\u001a\u00020\u0008J\u0007\u0010\u009c\u0001\u001a\u00020\u0008J\u0008\u0010\u009d\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u009e\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\u0013\u0010\u009f\u0001\u001a\u00030\u0085\u00012\t\u0008\u0002\u0010\u00a0\u0001\u001a\u00020\u0008J\u0011\u0010\u00a1\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0087\u0001\u001a\u00020dJ\u0008\u0010\u00a2\u0001\u001a\u00030\u0085\u0001J\n\u0010\u00a3\u0001\u001a\u00030\u0085\u0001H\u0016J\u0013\u0010\u00a4\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u00a5\u0001\u001a\u00020\u0008H\u0016J\u0008\u0010\u00a6\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u00a7\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fJ\u0010\u0010\u00a8\u0001\u001a\u00020\u00082\u0007\u0010\u00a9\u0001\u001a\u00020$J\u0011\u0010\u00aa\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u007fR+\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R+\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u000b\"\u0004\u0008\u0014\u0010\rR+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u000f\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001d8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u000f\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008*\u0010\u000f\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R+\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u0010\u000f\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R7\u00104\u001a\u0008\u0012\u0004\u0012\u000203022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u000203028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u0010\u000f\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R7\u0010;\u001a\u0008\u0012\u0004\u0012\u00020:022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020:028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008>\u0010\u000f\u001a\u0004\u0008<\u00106\"\u0004\u0008=\u00108R+\u0010@\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020?8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008E\u0010\u000f\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DRC\u0010H\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020G0F2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020G0F8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010\u000f\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR+\u0010N\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008Q\u0010\u000f\u001a\u0004\u0008O\u0010\u000b\"\u0004\u0008P\u0010\rR+\u0010R\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008T\u0010\u000f\u001a\u0004\u0008R\u0010\u000b\"\u0004\u0008S\u0010\rR+\u0010V\u001a\u00020U2\u0006\u0010\u0007\u001a\u00020U8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008[\u0010\u000f\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR7\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020:022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020:028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008_\u0010\u000f\u001a\u0004\u0008]\u00106\"\u0004\u0008^\u00108R+\u0010`\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020+8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008c\u0010\u000f\u001a\u0004\u0008a\u0010.\"\u0004\u0008b\u00100R7\u0010e\u001a\u0008\u0012\u0004\u0012\u00020d022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020d028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008h\u0010\u000f\u001a\u0004\u0008f\u00106\"\u0004\u0008g\u00108R7\u0010j\u001a\u0008\u0012\u0004\u0012\u00020i022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020i028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008m\u0010\u000f\u001a\u0004\u0008k\u00106\"\u0004\u0008l\u00108R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010oR+\u0010q\u001a\u00020p2\u0006\u0010\u0007\u001a\u00020p8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008v\u0010\u000f\u001a\u0004\u0008r\u0010s\"\u0004\u0008t\u0010uR+\u0010w\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008z\u0010\u000f\u001a\u0004\u0008x\u0010\'\"\u0004\u0008y\u0010)RC\u0010{\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0F2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0F8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008~\u0010\u000f\u001a\u0004\u0008|\u0010J\"\u0004\u0008}\u0010LR;\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u007f022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u007f028F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u0083\u0001\u0010\u000f\u001a\u0005\u0008\u0081\u0001\u00106\"\u0005\u0008\u0082\u0001\u00108\u00a8\u0006\u00ab\u0001"
    }
    d2 = {
        "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
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
        "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;",
        "durationPieData",
        "getDurationPieData",
        "()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;",
        "setDurationPieData",
        "(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V",
        "durationPieData$delegate",
        "",
        "Lcn/jianyun/workplan/module/schedule/model/DutyDetail;",
        "dutyList",
        "getDutyList",
        "()Ljava/util/List;",
        "setDutyList",
        "(Ljava/util/List;)V",
        "dutyList$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
        "dutys",
        "getDutys",
        "setDutys",
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
        "pieData",
        "getPieData",
        "setPieData",
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
        "Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;",
        "statModel",
        "getStatModel",
        "()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;",
        "setStatModel",
        "(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V",
        "statModel$delegate",
        "totalDuration",
        "getTotalDuration",
        "setTotalDuration",
        "totalDuration$delegate",
        "workDurationMap",
        "getWorkDurationMap",
        "setWorkDurationMap",
        "workDurationMap$delegate",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
        "works",
        "getWorks",
        "setWorks",
        "works$delegate",
        "changeConfig",
        "",
        "changeProject",
        "it",
        "doChange",
        "doExport",
        "exportDurationText",
        "value",
        "fetchDuty",
        "fetchDutyRemark",
        "date",
        "fetchDutyWork",
        "fetchSecondDutyWork",
        "fetchWorkDuration",
        "work",
        "finish",
        "getCurrentDateStr",
        "getRepository",
        "goDay",
        "day",
        "isAlarmPage",
        "isHomePage",
        "isSettingPage",
        "isStatPage",
        "isWorkPage",
        "makeClean",
        "makeDuty",
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
.field private final adding$delegate:Landroidx/compose/runtime/MutableState;

.field private final baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

.field private final clear$delegate:Landroidx/compose/runtime/MutableState;

.field private final config$delegate:Landroidx/compose/runtime/MutableState;

.field private final currentDate$delegate:Landroidx/compose/runtime/MutableState;

.field private final currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

.field private final durationPieData$delegate:Landroidx/compose/runtime/MutableState;

.field private final dutyList$delegate:Landroidx/compose/runtime/MutableState;

.field private final dutys$delegate:Landroidx/compose/runtime/MutableState;

.field private final gid$delegate:Landroidx/compose/runtime/MutableState;

.field private final holidayMap$delegate:Landroidx/compose/runtime/MutableState;

.field private final homeEdit$delegate:Landroidx/compose/runtime/MutableState;

.field private final isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

.field private final pageType$delegate:Landroidx/compose/runtime/MutableState;

.field private final periodDutys$delegate:Landroidx/compose/runtime/MutableState;

.field private final pieData$delegate:Landroidx/compose/runtime/MutableState;

.field private final plans$delegate:Landroidx/compose/runtime/MutableState;

.field private final projectList$delegate:Landroidx/compose/runtime/MutableState;

.field private final scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

.field private final statModel$delegate:Landroidx/compose/runtime/MutableState;

.field private final totalDuration$delegate:Landroidx/compose/runtime/MutableState;

.field private final workDurationMap$delegate:Landroidx/compose/runtime/MutableState;

.field private final works$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .registers 0

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

    .line 48
    invoke-direct/range {p0 .. p0}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;-><init>()V

    .line 46
    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    .line 47
    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    .line 50
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

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    .line 52
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    .line 53
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    .line 54
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 56
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 58
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, ""

    .line 59
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    .line 60
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    .line 62
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    .line 64
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    .line 66
    new-instance v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-object v6, v4

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

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    .line 67
    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    .line 68
    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x1

    .line 70
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    .line 73
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutyList$delegate:Landroidx/compose/runtime/MutableState;

    .line 74
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->workDurationMap$delegate:Landroidx/compose/runtime/MutableState;

    .line 75
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->totalDuration$delegate:Landroidx/compose/runtime/MutableState;

    .line 81
    new-instance v1, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    const/4 v4, 0x3

    invoke-direct {v1, v2, v2, v4, v2}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 82
    new-instance v1, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v9, 0xf

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    .line 83
    new-instance v1, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->durationPieData$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, "ScheduleMasterView"

    .line 86
    invoke-virtual {v0, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentPage(Ljava/lang/String;)V

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reload()V

    return-void
.end method

.method public static final synthetic access$exportDurationText(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 44
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->exportDurationText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final exportDurationText(Ljava/lang/String;)Ljava/lang/String;
    .registers 9

    .line 468
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v6, "--"

    if-eqz v1, :cond_c

    return-object v6

    :cond_c
    const-string v1, ":"

    .line 471
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 472
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_22

    return-object p1

    :cond_22
    const/4 p1, 0x0

    .line 475
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_34

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_35

    :cond_34
    move v1, p1

    :goto_35
    const/4 v2, 0x1

    .line 476
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :cond_46
    if-gtz v1, :cond_4b

    if-gtz p1, :cond_4b

    return-object v6

    :cond_4b
    const-string v0, "\u5c0f\u65f6"

    const-string v2, "\u5206\u949f"

    if-lez v1, :cond_6d

    if-lez p1, :cond_6d

    .line 481
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_92

    :cond_6d
    if-lez v1, :cond_81

    .line 482
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_92

    .line 483
    :cond_81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_92
    return-object p1
.end method

.method public static synthetic makeEdit$default(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    .line 90
    :cond_5
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makeEdit(Z)V

    return-void
.end method


# virtual methods
.method public final changeConfig()V
    .registers 8

    .line 499
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

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

    .line 488
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V

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

    .line 143
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    return-void
.end method

.method public final doExport()V
    .registers 8

    .line 385
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;
    .registers 19

    .line 165
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutys()Ljava/util/List;

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

    .line 166
    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v3

    invoke-static {v3}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_2b

    :cond_2a
    const/4 v1, 0x0

    .line 165
    :goto_2b
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v1, :cond_47

    .line 167
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

    .line 173
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutys()Ljava/util/List;

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

    .line 174
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

    .line 173
    :goto_2c
    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v1, :cond_33

    const-string p1, ""

    return-object p1

    .line 179
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

    .line 184
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutys()Ljava/util/List;

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

    .line 185
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

    .line 184
    :goto_2f
    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v2, :cond_5c

    .line 188
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

    .line 190
    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getWorks()Ljava/util/List;

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

    .line 192
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

    .line 199
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutys()Ljava/util/List;

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

    .line 200
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

    .line 199
    :goto_2f
    check-cast v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    if-nez v2, :cond_5c

    .line 203
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

    .line 205
    :cond_5c
    invoke-virtual/range {p0 .. p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getWorks()Ljava/util/List;

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

    .line 207
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

.method public final fetchWorkDuration(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)Ljava/lang/String;
    .registers 7

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getFullDay()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_8b

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtBegin()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8b

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtEnd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    goto :goto_8b

    .line 372
    :cond_22
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtEnd()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtBegin()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtEnd()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getGmtBegin()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_3a

    const/4 v3, 0x1

    goto :goto_3b

    :cond_3a
    const/4 v3, 0x0

    :goto_3b
    invoke-static {v0, v2, v3}, Lcn/jianyun/workplan/util/MyDataTool;->minusTime(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 373
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getExtField1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "totalDuration"

    if-eqz v1, :cond_4f

    .line 374
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 376
    :cond_4f
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcn/jianyun/workplan/util/CommonToolKt;->timeToFloat(Ljava/lang/String;I)F

    move-result v0

    .line 377
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getExtField1()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lcn/jianyun/workplan/util/CommonToolKt;->timeToFloat(Ljava/lang/String;I)F

    move-result p1

    sub-float/2addr v0, p1

    const/4 p1, 0x0

    .line 378
    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result p1

    float-to-int v0, p1

    int-to-float v2, v0

    sub-float/2addr p1, v2

    const/16 v2, 0x3c

    int-to-float v2, v2

    mul-float/2addr p1, v2

    float-to-int p1, p1

    .line 381
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%d:%02d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_8b
    :goto_8b
    return-object v1
.end method

.method public final finish()V
    .registers 2

    const/4 v0, 0x0

    .line 228
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setHomeEdit(Z)V

    return-void
.end method

.method public final getAdding()Z
    .registers 2

    .line 67
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 588
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 46
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getClear()Z
    .registers 2

    .line 68
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 591
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;
    .registers 2

    .line 66
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 585
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    return-object v0
.end method

.method public final getCurrentDate()Ljava/util/Date;
    .registers 2

    .line 58
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 567
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public final getCurrentDateStr()Ljava/lang/String;
    .registers 3

    .line 78
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toDateString(currentDate)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCurrentProjectName()Ljava/lang/String;
    .registers 2

    .line 59
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 570
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getDurationPieData()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;
    .registers 2

    .line 83
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->durationPieData$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 612
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    return-object v0
.end method

.method public final getDutyList()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/DutyDetail;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutyList$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 597
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

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

    .line 54
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 561
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getGid()I
    .registers 2

    .line 63
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 579
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

    .line 64
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 582
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final getHomeEdit()Z
    .registers 2

    .line 62
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 576
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getPageType()Lcn/jianyun/workplan/model/FormType;
    .registers 2

    .line 50
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 552
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

    .line 56
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 564
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getPieData()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;
    .registers 2

    .line 82
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 609
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

    .line 53
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 558
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

    .line 60
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 573
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;
    .registers 2

    .line 105
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->baseRepository:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    return-object v0
.end method

.method public final getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;
    .registers 2

    .line 47
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->scheduleService:Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    return-object v0
.end method

.method public final getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;
    .registers 2

    .line 81
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 606
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    return-object v0
.end method

.method public final getTotalDuration()Ljava/lang/String;
    .registers 2

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->totalDuration$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 603
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkDurationMap()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->workDurationMap$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 600
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

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

    .line 52
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 555
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final goDay(I)V
    .registers 3

    .line 224
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0, p1}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object p1

    const-string v0, "gapDay(currentDate, day)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentDate(Ljava/util/Date;)V

    return-void
.end method

.method public final isAlarmPage()Z
    .registers 3

    .line 153
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

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

    .line 70
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 594
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isHomePage()Z
    .registers 3

    .line 147
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

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

    .line 159
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

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

    .line 156
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

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

    .line 150
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPageType()Lcn/jianyun/workplan/model/FormType;

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

    .line 538
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

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

    .line 232
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setAdding(Z)V

    .line 234
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final makeEdit(Z)V
    .registers 8

    if-eqz p1, :cond_d

    .line 91
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getHomeEdit()Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x0

    .line 92
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setHomeEdit(Z)V

    goto :goto_2c

    .line 95
    :cond_d
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->isEmptyWork()Z

    move-result p1

    if-eqz p1, :cond_19

    const-string p1, "\u8bf7\u5148\u8bbe\u7f6e\u597d\u73ed\u6b21\u518d\u6765\u6392\u73ed"

    .line 96
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->toast(Ljava/lang/String;)V

    return-void

    :cond_19
    const/4 p1, 0x1

    .line 99
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setHomeEdit(Z)V

    .line 100
    new-instance p1, Lcn/jianyun/workplan/model/FormType;

    const-string v1, "self"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    :goto_2c
    return-void
.end method

.method public final makePlanDuty(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;)V
    .registers 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, p1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final makeStat()V
    .registers 8

    .line 268
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->isValid()Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    .line 271
    :cond_b
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public reload()V
    .registers 8

    .line 109
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public reloadData(Z)V
    .registers 8

    .line 137
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;

    const/4 v3, 0x0

    invoke-direct {p1, p0, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final removeCurrentDay()V
    .registers 8

    .line 213
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setAdding(Z)V
    .registers 3

    .line 67
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->adding$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 589
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setClear(Z)V
    .registers 3

    .line 68
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->clear$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 592
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setConfig(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->config$delegate:Landroidx/compose/runtime/MutableState;

    .line 586
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setCurrentDate(Ljava/util/Date;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentDate$delegate:Landroidx/compose/runtime/MutableState;

    .line 568
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setCurrentProjectName(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->currentProjectName$delegate:Landroidx/compose/runtime/MutableState;

    .line 571
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDurationPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->durationPieData$delegate:Landroidx/compose/runtime/MutableState;

    .line 613
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setDutyList(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/schedule/model/DutyDetail;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutyList$delegate:Landroidx/compose/runtime/MutableState;

    .line 598
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

    .line 54
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->dutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 562
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setEmptyWork(Z)V
    .registers 3

    .line 70
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->isEmptyWork$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 595
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setFirstWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
    .registers 9

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v0

    .line 507
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->setWorkUuid(Ljava/lang/String;)V

    .line 509
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setGid(I)V
    .registers 3

    .line 63
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->gid$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 580
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

    .line 64
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->holidayMap$delegate:Landroidx/compose/runtime/MutableState;

    .line 583
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setHomeEdit(Z)V
    .registers 3

    .line 62
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->homeEdit$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 577
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPageType(Lcn/jianyun/workplan/model/FormType;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pageType$delegate:Landroidx/compose/runtime/MutableState;

    .line 553
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

    .line 56
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->periodDutys$delegate:Landroidx/compose/runtime/MutableState;

    .line 565
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->pieData$delegate:Landroidx/compose/runtime/MutableState;

    .line 610
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

    .line 53
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->plans$delegate:Landroidx/compose/runtime/MutableState;

    .line 559
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

    .line 60
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->projectList$delegate:Landroidx/compose/runtime/MutableState;

    .line 574
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setRemark(Ljava/lang/String;)Z
    .registers 9

    const-string v0, "remark"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 528
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->setRemark(Ljava/lang/String;)V

    .line 529
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

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

    .line 516
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->fetchDuty()Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-result-object v0

    .line 517
    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->setSecondWorkUuid(Ljava/lang/String;)V

    .line 519
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setStatModel(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->statModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 607
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setTotalDuration(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->totalDuration$delegate:Landroidx/compose/runtime/MutableState;

    .line 604
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setWorkDurationMap(Ljava/util/Map;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->workDurationMap$delegate:Landroidx/compose/runtime/MutableState;

    .line 601
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

    .line 52
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->works$delegate:Landroidx/compose/runtime/MutableState;

    .line 556
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeConfig$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->changeConfig()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeConfig$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x1f4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 499
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->label:I

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

    .line 500
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getConfigDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeConfig$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;->set(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_36

    return-object v0

    .line 501
    :cond_36
    :goto_36
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeProject$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->changeProject(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$changeProject$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x1e9
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 488
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->label:I

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

    .line 489
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v1

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->label:I

    invoke-virtual {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 490
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    .line 491
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->$it:Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 492
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentDate(Ljava/util/Date;)V

    .line 493
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 494
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$changeProject$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->resetForm()V

    .line 495
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$doExport$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->doExport()V
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
    value = "SMAP\nScheduleStatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1855#2,2:552\n1864#2,2:554\n1866#2:559\n13374#3,3:556\n1#4:560\n*S KotlinDebug\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1\n*L\n396#1:552,2\n411#1:554,2\n411#1:559\n413#1:556,3\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$doExport$1"
    f = "ScheduleStatViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x186
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 20

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 385
    iget v2, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1d

    if-ne v2, v3, :cond_15

    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_52

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .line 386
    iget-object v4, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutyList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3e

    .line 387
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    const-string v2, "\u6ca1\u6709\u6570\u636e\u53ef\u5bfc\u51fa"

    invoke-virtual {v0, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 388
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 390
    :cond_3e
    iget-object v4, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->L$0:Ljava/lang/Object;

    iput v3, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->label:I

    invoke-virtual {v4, v3, v5}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_52

    return-object v0

    .line 391
    :cond_52
    :goto_52
    new-instance v0, Lorg/apache/poi/xssf/usermodel/XSSFWorkbook;

    invoke-direct {v0}, Lorg/apache/poi/xssf/usermodel/XSSFWorkbook;-><init>()V

    move-object v2, v0

    check-cast v2, Lorg/apache/poi/ss/usermodel/Workbook;

    :try_start_5a
    const-string v0, "\u6392\u73ed\u660e\u7ec6"

    .line 393
    invoke-interface {v2, v0}, Lorg/apache/poi/ss/usermodel/Workbook;->createSheet(Ljava/lang/String;)Lorg/apache/poi/ss/usermodel/Sheet;

    move-result-object v0

    .line 394
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    const/16 v5, 0x8

    new-array v6, v5, [Ljava/lang/String;

    const-string v7, "\u65e5\u671f"

    const/4 v8, 0x0

    aput-object v7, v6, v8

    const-string v7, "\u661f\u671f"

    aput-object v7, v6, v3

    const-string v7, "\u73ed\u6b21"

    const/4 v9, 0x2

    aput-object v7, v6, v9

    const-string v7, "\u4e0a\u73ed"

    const/4 v10, 0x3

    aput-object v7, v6, v10

    const-string v7, "\u4e0b\u73ed"

    const/4 v11, 0x4

    aput-object v7, v6, v11

    const-string v7, "\u4f11\u606f\u65f6\u957f"

    const/4 v12, 0x5

    aput-object v7, v6, v12

    const-string v7, "\u5de5\u4f5c\u65f6\u957f"

    const/4 v13, 0x6

    aput-object v7, v6, v13

    const-string v7, "\u5907\u6ce8"

    const/4 v14, 0x7

    aput-object v7, v6, v14

    .line 395
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    iget-object v6, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getDutyList()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    iget-object v7, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    .line 552
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_101

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;

    new-array v14, v5, [Ljava/lang/String;

    .line 399
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDay()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v8

    .line 400
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getWeekday()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v3

    .line 401
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v9

    .line 402
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchBeginTime()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v10

    .line 403
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchEndTime()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v11

    .line 404
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getWork()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getExtField1()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->access$exportDurationText(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v14, v12

    .line 405
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDuration()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->access$exportDurationText(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v14, v13

    .line 406
    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getRemark()Ljava/lang/String;

    move-result-object v5

    const/4 v15, 0x7

    aput-object v5, v14, v15

    .line 397
    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x8

    const/4 v14, 0x7

    goto :goto_a3

    .line 411
    :cond_101
    check-cast v4, Ljava/lang/Iterable;

    .line 555
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v8

    :goto_108
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_138

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_119

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_119
    check-cast v6, [Ljava/lang/String;

    .line 412
    invoke-interface {v0, v5}, Lorg/apache/poi/ss/usermodel/Sheet;->createRow(I)Lorg/apache/poi/ss/usermodel/Row;

    move-result-object v5

    .line 557
    array-length v14, v6

    move v13, v8

    move v15, v13

    :goto_122
    if-ge v15, v14, :cond_135

    aget-object v12, v6, v15

    add-int/lit8 v17, v13, 0x1

    .line 414
    invoke-interface {v5, v13}, Lorg/apache/poi/ss/usermodel/Row;->createCell(I)Lorg/apache/poi/ss/usermodel/Cell;

    move-result-object v13

    invoke-interface {v13, v12}, Lorg/apache/poi/ss/usermodel/Cell;->setCellValue(Ljava/lang/String;)V

    add-int/lit8 v15, v15, 0x1

    move/from16 v13, v17

    const/4 v12, 0x5

    goto :goto_122

    :cond_135
    move v5, v7

    const/4 v13, 0x6

    goto :goto_108

    :cond_138
    const/16 v4, 0xc00

    .line 418
    invoke-interface {v0, v8, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    const/16 v4, 0x800

    .line 419
    invoke-interface {v0, v3, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    const/16 v4, 0xa00

    .line 420
    invoke-interface {v0, v9, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    .line 421
    invoke-interface {v0, v10, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    .line 422
    invoke-interface {v0, v11, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    const/4 v5, 0x5

    .line 423
    invoke-interface {v0, v5, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    const/4 v5, 0x6

    .line 424
    invoke-interface {v0, v5, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    const/16 v4, 0x1800

    const/4 v5, 0x7

    .line 425
    invoke-interface {v0, v5, v4}, Lorg/apache/poi/ss/usermodel/Sheet;->setColumnWidth(II)V

    .line 427
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_176

    .line 428
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_176

    .line 429
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_176
    if-nez v0, :cond_1a4

    .line 432
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    const-string v3, "\u5bfc\u51fa\u76ee\u5f55\u4e0d\u53ef\u7528"

    invoke-virtual {v0, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 433
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_185
    .catch Ljava/io/IOException; {:try_start_5a .. :try_end_185} :catch_26c
    .catchall {:try_start_5a .. :try_end_185} :catchall_269

    .line 461
    :try_start_185
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v2}, Lorg/apache/poi/ss/usermodel/Workbook;->close()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_18f
    .catchall {:try_start_185 .. :try_end_18f} :catchall_190

    goto :goto_19a

    :catchall_190
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    :goto_19a
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    return-object v3

    .line 435
    :cond_1a4
    :try_start_1a4
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    const-string v5, "yyyyMMdd_HHmmss"

    invoke-static {v4, v5}, Lcn/jianyun/workplan/util/MyDateTool;->format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 436
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u6781\u7b80\u6392\u73ed\u660e\u7ec6_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ".xlsx"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 437
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    check-cast v4, Ljava/io/Closeable;
    :try_end_1d5
    .catch Ljava/io/IOException; {:try_start_1a4 .. :try_end_1d5} :catch_26c
    .catchall {:try_start_1a4 .. :try_end_1d5} :catchall_269

    :try_start_1d5
    move-object v0, v4

    check-cast v0, Ljava/io/FileOutputStream;

    .line 438
    check-cast v0, Ljava/io/OutputStream;

    invoke-interface {v2, v0}, Lorg/apache/poi/ss/usermodel/Workbook;->write(Ljava/io/OutputStream;)V

    .line 439
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1df
    .catchall {:try_start_1d5 .. :try_end_1df} :catchall_260

    const/4 v0, 0x0

    .line 437
    :try_start_1e0
    invoke-static {v4, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 440
    invoke-interface {v2}, Lorg/apache/poi/ss/usermodel/Workbook;->close()V

    .line 443
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 444
    iget-object v4, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ".TTFileProvider"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 442
    invoke-static {v0, v4, v5}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 447
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-string v5, "android.intent.action.SEND"

    .line 448
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "android.intent.extra.STREAM"

    .line 449
    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v4, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    .line 450
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 451
    invoke-virtual {v4, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v0, "\u5206\u4eab\u6392\u73ed\u660e\u7ec6"

    .line 453
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v4, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v3, 0x10000000

    .line 454
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 456
    iget-object v3, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v3

    invoke-virtual {v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 457
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    const-string v3, "\u5df2\u5bfc\u51fa\u5230\u4e0b\u8f7d\u76ee\u5f55"

    invoke-virtual {v0, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V
    :try_end_253
    .catch Ljava/io/IOException; {:try_start_1e0 .. :try_end_253} :catch_26c
    .catchall {:try_start_1e0 .. :try_end_253} :catchall_269

    .line 461
    :try_start_253
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v2}, Lorg/apache/poi/ss/usermodel/Workbook;->close()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_25d
    .catchall {:try_start_253 .. :try_end_25d} :catchall_25e

    goto :goto_28c

    :catchall_25e
    move-exception v0

    goto :goto_283

    :catchall_260
    move-exception v0

    move-object v3, v0

    .line 437
    :try_start_262
    throw v3
    :try_end_263
    .catchall {:try_start_262 .. :try_end_263} :catchall_263

    :catchall_263
    move-exception v0

    move-object v5, v0

    :try_start_265
    invoke-static {v4, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_269
    .catch Ljava/io/IOException; {:try_start_265 .. :try_end_269} :catch_26c
    .catchall {:try_start_265 .. :try_end_269} :catchall_269

    :catchall_269
    move-exception v0

    move-object v3, v0

    goto :goto_298

    .line 459
    :catch_26c
    :try_start_26c
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    const-string v3, "\u5bfc\u51fa\u5931\u8d25"

    invoke-virtual {v0, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V
    :try_end_277
    .catchall {:try_start_26c .. :try_end_277} :catchall_269

    .line 461
    :try_start_277
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v2}, Lorg/apache/poi/ss/usermodel/Workbook;->close()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_281
    .catchall {:try_start_277 .. :try_end_281} :catchall_282

    goto :goto_28c

    :catchall_282
    move-exception v0

    :goto_283
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    :goto_28c
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 464
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 461
    :goto_298
    :try_start_298
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {v2}, Lorg/apache/poi/ss/usermodel/Workbook;->close()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2a2
    .catchall {:try_start_298 .. :try_end_2a2} :catchall_2a3

    goto :goto_2ad

    :catchall_2a3
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    :goto_2ad
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$doExport$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    throw v3
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeClean$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makeClean()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeClean$1"
    f = "ScheduleStatViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x21b,
        0x21e
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

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 538
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_24

    if-eq v1, v4, :cond_20

    if-ne v1, v3, :cond_18

    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->I$1:I

    iget v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->I$0:I

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_7f

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

    .line 539
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->label:I

    const/4 v5, 0x0

    invoke-static {p1, v2, v1, v4, v5}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3a

    return-object v0

    .line 540
    :cond_3a
    :goto_3a
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result p1

    move v1, p1

    move-object p1, p0

    :goto_4a
    if-ge v2, v1, :cond_81

    .line 541
    iget-object v5, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5, v2}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v5

    .line 542
    iget-object v6, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v6

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v6

    iget-object v7, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "toDateString(day)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p1

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v2, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->I$0:I

    iput v1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->I$1:I

    iput v3, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->label:I

    invoke-interface {v6, v7, v5, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_7f

    return-object v0

    :cond_7f
    :goto_7f
    add-int/2addr v2, v4

    goto :goto_4a

    .line 544
    :cond_81
    iget-object v0, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 545
    iget-object v0, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 546
    iget-object p1, p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeClean$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    const-string v0, "\u5468\u671f\u5185\u73ed\u6b21\u5df2\u88ab\u6e05\u7a7a"

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 547
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeDuty$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makeDuty(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeDuty$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0xeb,
        0xee,
        0xf1
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 24

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 234
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2a

    if-eq v2, v5, :cond_24

    if-eq v2, v4, :cond_20

    if-ne v2, v3, :cond_18

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c1

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_79

    :cond_24
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_4f

    :cond_2a
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 235
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v2

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->label:I

    invoke-interface {v2, v6, v7, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->findByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4f

    return-object v1

    .line 234
    :cond_4f
    :goto_4f
    check-cast v2, Ljava/util/List;

    .line 237
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_79

    .line 238
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v2

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v2

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->label:I

    invoke-interface {v2, v6, v7, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_79

    return-object v1

    .line 240
    :cond_79
    :goto_79
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v8

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v12

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchFirstWorkUuid()Ljava/lang/String;

    move-result-object v10

    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->$work:Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->fetchSecondWorkUuid()Ljava/lang/String;

    move-result-object v11

    new-instance v2, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1fc4

    const/16 v21, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v21}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 241
    iget-object v4, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->label:I

    invoke-interface {v4, v2, v6}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c1

    return-object v1

    .line 243
    :cond_c1
    :goto_c1
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v2

    invoke-static {v2, v5}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v2

    const-string v3, "gapDay(currentDate, 1)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentDate(Ljava/util/Date;)V

    .line 244
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1, v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 245
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setAdding(Z)V

    .line 246
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makePlanDuty$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makePlanDuty(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makePlanDuty$1"
    f = "ScheduleStatViewModel.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0xfb,
        0xff,
        0x103
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

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 32

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 250
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->label:I

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

    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$1:I

    iget v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$0:I

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

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
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$1:I

    iget v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$0:I

    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/util/Date;

    iget-object v10, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

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

    .line 251
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v2

    move-object v9, v0

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput v8, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->label:I

    invoke-static {v2, v5, v9, v8, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5e

    return-object v1

    .line 252
    :cond_5e
    :goto_5e
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->$it:Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;->fetchPlans()Ljava/util/List;

    move-result-object v2

    .line 253
    iget-object v9, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getConfig()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v9

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcn/jianyun/workplan/util/CommonToolKt;->toIntData(Ljava/lang/String;)I

    move-result v9

    move-object v10, v0

    :goto_73
    if-ge v5, v9, :cond_10f

    .line 254
    iget-object v11, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v11}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v11

    invoke-static {v11, v5}, Lcn/jianyun/workplan/util/MyDateTool;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v11

    .line 255
    iget-object v12, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v12

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v12

    iget-object v13, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v11}, Lcn/jianyun/workplan/util/MyDateTool;->toDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v10

    check-cast v15, Lkotlin/coroutines/Continuation;

    iput-object v2, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    iput-object v11, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    iput v5, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$0:I

    iput v9, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$1:I

    iput v7, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->label:I

    invoke-interface {v12, v13, v14, v15}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v1, :cond_aa

    return-object v1

    :cond_aa
    move/from16 v29, v9

    move-object v9, v2

    move/from16 v2, v29

    .line 257
    :goto_af
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    rem-int v12, v5, v12

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 258
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v14

    iget-object v13, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

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

    .line 259
    iget-object v12, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v12

    invoke-virtual {v12}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v12

    move-object v13, v10

    check-cast v13, Lkotlin/coroutines/Continuation;

    iput-object v9, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->L$1:Ljava/lang/Object;

    iput v5, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$0:I

    iput v2, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->I$1:I

    iput v6, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->label:I

    invoke-interface {v12, v11, v13}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->insert(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_23

    return-object v1

    :goto_10c
    add-int/2addr v5, v8

    goto/16 :goto_73

    .line 261
    :cond_10f
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1, v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 262
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 263
    iget-object v1, v10, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makePlanDuty$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    const-string v2, "\u5468\u671f\u8f6e\u73ed\u8bbe\u7f6e\u6210\u529f"

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    .line 264
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeStat$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makeStat()V
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
    value = "SMAP\nScheduleStatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1855#2,2:552\n1855#2:554\n1856#2:556\n1549#2:557\n1620#2,3:558\n766#2:561\n857#2,2:562\n1179#2,2:564\n1253#2,4:566\n766#2:570\n857#2,2:571\n1549#2:573\n1620#2,3:574\n1#3:555\n*S KotlinDebug\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1\n*L\n282#1:552,2\n285#1:554\n285#1:556\n334#1:557\n334#1:558,3\n339#1:561\n339#1:562,2\n339#1:564,2\n339#1:566,4\n351#1:570\n351#1:571,2\n351#1:573\n351#1:574,3\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$makeStat$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x110
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 34

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 271
    iget v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1f

    if-ne v2, v3, :cond_17

    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    .line 272
    iget-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v4

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object v4

    iget-object v5, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v6

    invoke-virtual {v6}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getBeginDate()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v7}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getStatModel()Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;->getEndDate()Ljava/lang/String;

    move-result-object v7

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->label:I

    invoke-interface {v4, v5, v6, v7, v8}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->listByPeriod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_54

    return-object v1

    :cond_54
    move-object v1, v2

    :goto_55
    check-cast v4, Ljava/util/List;

    invoke-virtual {v1, v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setPeriodDutys(Ljava/util/List;)V

    .line 273
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPeriodDutys()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setDutys(Ljava/util/List;)V

    .line 276
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 277
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v4, Ljava/util/Map;

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 278
    new-instance v4, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 281
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getWorks()Ljava/util/List;

    move-result-object v6

    iput-object v6, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 282
    iget-object v6, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    .line 552
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_99
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_aa

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 283
    invoke-virtual {v7, v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    goto :goto_99

    .line 285
    :cond_aa
    iget-object v6, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPeriodDutys()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    iget-object v7, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    .line 554
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, ""

    if-eqz v9, :cond_275

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    .line 287
    iget-object v12, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_ce
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_ea

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getWorkUuid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_ce

    goto :goto_eb

    :cond_ea
    const/4 v13, 0x0

    :goto_eb
    check-cast v13, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    const-string v12, "getWeekdayName(MyDateTool.parseDate(duty.day))"

    if-eqz v13, :cond_17d

    .line 289
    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v14

    add-int/2addr v14, v3

    invoke-virtual {v13, v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    .line 291
    new-instance v14, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1f

    const/16 v22, 0x0

    move-object v15, v14

    invoke-direct/range {v15 .. v22}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;-><init>(Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 292
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setDay(Ljava/lang/String;)V

    .line 293
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcn/jianyun/workplan/util/MyDateTool;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v15

    invoke-static {v15}, Lcn/jianyun/workplan/util/MyDateTool;->getWeekdayName(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setWeekday(Ljava/lang/String;)V

    .line 294
    invoke-virtual {v14, v13}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V

    .line 295
    invoke-virtual {v7, v13}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->fetchWorkDuration(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setDuration(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setRemark(Ljava/lang/String;)V

    .line 297
    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDuration()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_174

    .line 298
    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDuration()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lcn/jianyun/workplan/util/CommonToolKt;->timeToFloat(Ljava/lang/String;I)F

    move-result v15

    .line 299
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v8

    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    if-eqz v3, :cond_166

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_167

    :cond_166
    const/4 v3, 0x0

    :goto_167
    add-float/2addr v3, v15

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v11, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    iget v3, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    add-float/2addr v3, v15

    iput v3, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 302
    :cond_174
    iget-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    goto :goto_17e

    :cond_17d
    const/4 v3, 0x0

    .line 305
    :goto_17e
    iget-object v8, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_186
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1a3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getSecondWorkUuid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_186

    move-object v14, v11

    goto :goto_1a4

    :cond_1a3
    const/4 v14, 0x0

    :goto_1a4
    check-cast v14, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    if-eqz v14, :cond_236

    .line 307
    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v3

    const/4 v8, 0x1

    add-int/2addr v3, v8

    invoke-virtual {v14, v3}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->setCnt(I)V

    .line 309
    new-instance v3, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x1f

    const/16 v26, 0x0

    move-object/from16 v19, v3

    invoke-direct/range {v19 .. v26}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;-><init>(Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 310
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setDay(Ljava/lang/String;)V

    .line 311
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcn/jianyun/workplan/util/MyDateTool;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-static {v8}, Lcn/jianyun/workplan/util/MyDateTool;->getWeekdayName(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setWeekday(Ljava/lang/String;)V

    .line 312
    invoke-virtual {v3, v14}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V

    .line 313
    invoke-virtual {v7, v14}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->fetchWorkDuration(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setDuration(Ljava/lang/String;)V

    .line 314
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->setRemark(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDuration()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22e

    .line 316
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;->getDuration()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x1

    invoke-static {v8, v11}, Lcn/jianyun/workplan/util/CommonToolKt;->timeToFloat(Ljava/lang/String;I)F

    move-result v8

    .line 317
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v13

    iget-object v15, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    invoke-virtual {v14}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Float;

    if-eqz v14, :cond_220

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v14

    goto :goto_221

    :cond_220
    const/4 v14, 0x0

    :goto_221
    add-float/2addr v14, v8

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v14

    invoke-interface {v11, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    iget v11, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    add-float/2addr v11, v8

    iput v11, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 320
    :cond_22e
    iget-object v8, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x1

    :cond_236
    if-nez v3, :cond_271

    .line 323
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_271

    .line 324
    iget-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    .line 325
    new-instance v8, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;

    .line 326
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v20

    .line 327
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getDay()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcn/jianyun/workplan/util/MyDateTool;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    invoke-static {v10}, Lcn/jianyun/workplan/util/MyDateTool;->getWeekdayName(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 328
    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;->getRemark()Ljava/lang/String;

    move-result-object v24

    const/16 v25, 0xc

    const/16 v26, 0x0

    move-object/from16 v19, v8

    move-object/from16 v21, v10

    .line 325
    invoke-direct/range {v19 .. v26}, Lcn/jianyun/workplan/module/schedule/model/DutyDetail;-><init>(Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 324
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_271
    const/4 v3, 0x1

    const/4 v8, 0x0

    goto/16 :goto_b8

    .line 334
    :cond_275
    iget-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    .line 557
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 558
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_28a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2b7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 559
    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 335
    new-instance v9, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getCnt()I

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getTheme()Ljava/lang/String;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    move-object/from16 v19, v9

    invoke-direct/range {v19 .. v25}, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 559
    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_28a

    .line 560
    :cond_2b7
    move-object/from16 v28, v6

    check-cast v28, Ljava/util/List;

    .line 338
    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-virtual {v3, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setDutyList(Ljava/util/List;)V

    .line 339
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    .line 561
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 562
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2d5
    :goto_2d5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2f4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 339
    iget-object v11, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    invoke-virtual {v9}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v11, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2d5

    .line 562
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2d5

    .line 563
    :cond_2f4
    check-cast v6, Ljava/util/List;

    .line 561
    check-cast v6, Ljava/lang/Iterable;

    .line 564
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    const/16 v8, 0x10

    invoke-static {v3, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    .line 565
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v8, Ljava/util/Map;

    .line 566
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_311
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v9, "h"

    const-string v11, "format(...)"

    const-string v12, "%.1f"

    if-eqz v6, :cond_376

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 567
    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 340
    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v14, 0x1

    new-array v15, v14, [Ljava/lang/Object;

    iget-object v14, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v14, Ljava/util/Map;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    if-eqz v6, :cond_341

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_342

    :cond_341
    const/4 v6, 0x0

    :goto_342
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v14, 0x0

    aput-object v6, v15, v14

    const/4 v6, 0x1

    invoke-static {v15, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-static {v12, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v13, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 567
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v8, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_311

    .line 339
    :cond_376
    invoke-virtual {v1, v8}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setWorkDurationMap(Ljava/util/Map;)V

    .line 342
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget v3, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    const/4 v6, 0x0

    cmpl-float v3, v3, v6

    if-lez v3, :cond_3ab

    .line 343
    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    iget v3, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 342
    :cond_3ab
    invoke-virtual {v1, v10}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setTotalDuration(Ljava/lang/String;)V

    .line 348
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    .line 351
    iget-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    .line 570
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .line 571
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3bf
    :goto_3bf
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3de

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 351
    iget-object v10, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    invoke-virtual {v8}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3bf

    .line 571
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3bf

    .line 572
    :cond_3de
    check-cast v4, Ljava/util/List;

    .line 570
    check-cast v4, Ljava/lang/Iterable;

    .line 573
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 574
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3f1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_446

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 575
    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;

    .line 352
    new-instance v7, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;

    .line 353
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getName()Ljava/lang/String;

    move-result-object v20

    .line 354
    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v8, 0x1

    new-array v10, v8, [Ljava/lang/Object;

    iget-object v8, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getUuid()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    if-eqz v8, :cond_41d

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    goto :goto_41e

    :cond_41d
    move v8, v6

    :goto_41e
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v8

    const/4 v13, 0x0

    aput-object v8, v10, v13

    const/4 v8, 0x1

    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;->getTheme()Ljava/lang/String;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    move-object/from16 v19, v7

    move-object/from16 v21, v8

    .line 352
    invoke-direct/range {v19 .. v25}, Lcn/jianyun/workplan/ui/graph/model/PieGraphItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 575
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3f1

    .line 576
    :cond_446
    check-cast v3, Ljava/util/List;

    const-string v2, "\u65f6\u957f\u7edf\u8ba1"

    const/4 v4, 0x1

    .line 348
    invoke-static {v2, v9, v3, v4}, Lcn/jianyun/workplan/ui/graph/model/PieGraphDataKt;->makePieStatData(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-result-object v2

    .line 359
    iget-object v3, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    .line 360
    invoke-virtual {v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getTotalDuration()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcn/jianyun/workplan/ui/graph/model/PieGraphData;->setCenterText(Ljava/lang/String;)V

    .line 348
    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setDurationPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V

    .line 362
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    const-string v26, "\u73ed\u6b21\u7edf\u8ba1"

    const-string v27, "\u6b21"

    const/16 v29, 0x0

    const/16 v30, 0x8

    const/16 v31, 0x0

    invoke-static/range {v26 .. v31}, Lcn/jianyun/workplan/ui/graph/model/PieGraphDataKt;->makePieStatData$default(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IILjava/lang/Object;)Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setPieData(Lcn/jianyun/workplan/ui/graph/model/PieGraphData;)V

    .line 363
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getGid()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setGid(I)V

    .line 364
    iget-object v1, v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$makeStat$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getPieData()Lcn/jianyun/workplan/ui/graph/model/PieGraphData;

    move-result-object v1

    const-string v2, "make data"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 365
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reload$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reload()V
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
    value = "SMAP\nScheduleStatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleStatViewModel.kt\ncn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reload$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x6f,
        0x70,
        0x71,
        0x75,
        0x7e,
        0x7f,
        0x80,
        0x81
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 109
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v1, :pswitch_data_202

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_14
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1ba

    :pswitch_1d
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_193

    :pswitch_26
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_16f

    :pswitch_2f
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_155

    :pswitch_38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_fb

    :pswitch_3d
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_99

    :pswitch_45
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7b

    :pswitch_4d
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_66

    :pswitch_51
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 111
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->tryInitProject(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_66

    return-object v0

    .line 112
    :cond_66
    :goto_66
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-virtual {p1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getProjectId(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7b

    return-object v0

    :cond_7b
    :goto_7b
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 113
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleProjectDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-interface {p1, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_99

    return-object v0

    :cond_99
    :goto_99
    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setProjectList(Ljava/util/List;)V

    .line 114
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getProjectList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_ac
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v6}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_ac

    goto :goto_c9

    :cond_c8
    move-object v5, v3

    :goto_c9
    check-cast v5, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    if-nez v5, :cond_10f

    .line 116
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getProjectList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectId(Ljava/lang/String;)V

    .line 117
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-virtual {p1, v1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->setProjectId(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_fb

    return-object v0

    .line 118
    :cond_fb
    :goto_fb
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getProjectList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    goto :goto_118

    .line 121
    :cond_10f
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setCurrentProjectName(Ljava/lang/String;)V

    .line 124
    :goto_118
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    new-instance v1, Lcn/jianyun/workplan/model/FormType;

    const-string v6, "self"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lcn/jianyun/workplan/model/FormType;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setFormType(Lcn/jianyun/workplan/model/FormType;)V

    .line 125
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result v1

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setOldSid(I)V

    .line 126
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5}, Lcn/jianyun/workplan/util/MyDateTool;->getYear(Ljava/util/Date;)I

    move-result v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-virtual {p1, v5, v6}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_155

    return-object v0

    :cond_155
    :goto_155
    check-cast p1, Ljava/util/Map;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setHolidayMap(Ljava/util/Map;)V

    .line 127
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-virtual {p1, v5}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16f

    return-object v0

    :cond_16f
    :goto_16f
    check-cast p1, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setConfig(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V

    .line 128
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleWorkDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;

    move-result-object p1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x7

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-interface {p1, v5, v6}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_193

    return-object v0

    :cond_193
    :goto_193
    check-cast p1, Ljava/util/List;

    invoke-virtual {v1, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setWorks(Ljava/util/List;)V

    .line 129
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getSchedulePlanDao()Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;

    move-result-object v1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->L$0:Ljava/lang/Object;

    const/16 v7, 0x8

    iput v7, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->label:I

    invoke-interface {v1, v5, v6}, Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;->listByProject(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1b8

    return-object v0

    :cond_1b8
    move-object v0, p1

    move-object p1, v1

    :goto_1ba
    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setPlans(Ljava/util/List;)V

    .line 130
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getWorks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setEmptyWork(Z)V

    .line 131
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    new-instance v0, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/util/MyDateTool;->getStartDayOfMonth(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    const-string v5, "getStartDayOfMonth(currentDate)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v5}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDate()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5}, Lcn/jianyun/workplan/util/MyDateTool;->getLastDayStringOfMonth(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "getLastDayStringOfMonth(currentDate)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v5}, Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setStatModel(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;)V

    .line 132
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reload$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    check-cast p1, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;

    invoke-static {p1, v4, v2, v3}, Lcn/jianyun/workplan/module/base/vm/BaseViewModel;->reloadData$default(Lcn/jianyun/workplan/module/base/vm/BaseViewModel;ZILjava/lang/Object;)V

    .line 133
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_202
    .packed-switch 0x0
        :pswitch_51
        :pswitch_4d
        :pswitch_45
        :pswitch_3d
        :pswitch_38
        :pswitch_2f
        :pswitch_26
        :pswitch_1d
        :pswitch_14
    .end packed-switch
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reloadData$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$reloadData$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 137
    iget v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->label:I

    if-nez v0, :cond_12

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 138
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$reloadData$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->makeStat()V

    .line 139
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 137
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$removeCurrentDay$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->removeCurrentDay()V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$removeCurrentDay$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0xd6,
        0xd9
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 213
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->label:I

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

    .line 214
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->label:I

    invoke-interface {p1, v1, v4, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->findByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_43

    return-object v0

    .line 213
    :cond_43
    :goto_43
    check-cast p1, Ljava/util/List;

    .line 216
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_72

    .line 217
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentProjectId()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {v4}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getCurrentDateStr()Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->label:I

    invoke-interface {p1, v1, v4, v5}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->deleteByDay(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6d

    return-object v0

    .line 218
    :cond_6d
    :goto_6d
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$removeCurrentDay$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1, v3}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 220
    :cond_72
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setFirstWork$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setFirstWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setFirstWork$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x1fe
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 509
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->label:I

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

    .line 510
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 511
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->resetForm()V

    .line 512
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setFirstWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 513
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setRemark$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setRemark(Ljava/lang/String;)Z
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setRemark$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x212
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $t:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->$t:Lkotlin/jvm/internal/Ref$ObjectRef;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->$t:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 529
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->label:I

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

    .line 530
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->$t:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_36

    return-object v0

    .line 531
    :cond_36
    :goto_36
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reload()V

    .line 532
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setRemark$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1, v2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->reloadData(Z)V

    .line 533
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel.AnonymousClass1 (cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setSecondWork$1)
.class final Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ScheduleStatViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->setSecondWork(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V
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
    c = "cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel$setSecondWork$1"
    f = "ScheduleStatViewModel.kt"
    i = {}
    l = {
        0x208
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

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

    new-instance p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;

    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;-><init>(Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 519
    iget v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->label:I

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

    .line 520
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getScheduleService()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;->getScheduleDutyDao()Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;

    move-result-object p1

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->$t:Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->label:I

    invoke-interface {p1, v1, v3}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;->update(Lcn/jianyun/workplan/module/schedule/model/ScheduleDuty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    return-object v0

    .line 521
    :cond_32
    :goto_32
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->resetForm()V

    .line 522
    iget-object p1, p0, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel$setSecondWork$1;->this$0:Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;

    invoke-virtual {p1}, Lcn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel;->getBaseRepository()Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reload()V

    .line 523
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
