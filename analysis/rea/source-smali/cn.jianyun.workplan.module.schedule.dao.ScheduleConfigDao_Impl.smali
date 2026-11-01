// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl
// markers: Method not decompiled; Method code generation error; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl)
.class public final Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;
.super Ljava/lang/Object;
.source "ScheduleConfigDao_Impl.java"

# interfaces
.implements Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfScheduleConfig:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfClearAll:Landroidx/room/SharedSQLiteStatement;


# direct methods
.method static bridge synthetic -$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__db:Landroidx/room/RoomDatabase;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fget__insertionAdapterOfScheduleConfig(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/EntityInsertionAdapter;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__insertionAdapterOfScheduleConfig:Landroidx/room/EntityInsertionAdapter;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fget__preparedStmtOfClearAll(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/SharedSQLiteStatement;
    .registers 1

    iget-object p0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__preparedStmtOfClearAll:Landroidx/room/SharedSQLiteStatement;

    return-object p0
.end method

.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "__db"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 38
    new-instance v0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$1;-><init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__insertionAdapterOfScheduleConfig:Landroidx/room/EntityInsertionAdapter;

    .line 147
    new-instance v0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$2;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$2;-><init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__preparedStmtOfClearAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 383
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "continuation"
        }
    .end annotation

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

    .line 175
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;

    invoke-direct {v1, p0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;-><init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)V

    const/4 v2, 0x1

    invoke-static {v0, v2, v1, p1}, Landroidx/room/CoroutinesRoom;->execute(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "continuation"
        }
    .end annotation

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

    .line 379
    invoke-static {p0, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao$DefaultImpls;->get(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public realGet(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "continuation"
        }
    .end annotation

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

    const-string v0, "SELECT * FROM ScheduleConfig limit 1"

    const/4 v1, 0x0

    .line 195
    invoke-static {v0, v1}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v0

    .line 196
    invoke-static {}, Landroidx/room/util/DBUtil;->createCancellationSignal()Landroid/os/CancellationSignal;

    move-result-object v2

    .line 197
    iget-object v3, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v4, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;

    invoke-direct {v4, p0, v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;-><init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomSQLiteQuery;)V

    invoke-static {v3, v1, v2, v4, p1}, Landroidx/room/CoroutinesRoom;->execute(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public set(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "item",
            "continuation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->__db:Landroidx/room/RoomDatabase;

    new-instance v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;

    invoke-direct {v1, p0, p1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;-><init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v1, p2}, Landroidx/room/CoroutinesRoom;->execute(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass1 (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl$1)
.class Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "ScheduleConfigDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomDatabase;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            "this$0",
            "database"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$1;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 46
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getUuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_b

    .line 47
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_12

    .line 49
    :cond_b
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 51
    :goto_12
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1d

    .line 52
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_24

    .line 54
    :cond_1d
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getAutoDay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 56
    :goto_24
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getBeginDay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2f

    .line 57
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_36

    .line 59
    :cond_2f
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getBeginDay()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 61
    :goto_36
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getDateFontSize()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_41

    .line 62
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_48

    .line 64
    :cond_41
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getDateFontSize()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 66
    :goto_48
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getWorkFontSize()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_53

    .line 67
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_5a

    .line 69
    :cond_53
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getWorkFontSize()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 71
    :goto_5a
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getTimeFontSize()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_65

    .line 72
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_6c

    .line 74
    :cond_65
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getTimeFontSize()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 76
    :goto_6c
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getWorkRadius()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_77

    .line 77
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_7e

    .line 79
    :cond_77
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getWorkRadius()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 81
    :goto_7e
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowLunar()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    .line 82
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 83
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowFestival()Z

    move-result v0

    const/16 v1, 0x9

    int-to-long v2, v0

    .line 84
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 85
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowBeginTime()Z

    move-result v0

    const/16 v1, 0xa

    int-to-long v2, v0

    .line 86
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 87
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowEndTime()Z

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    .line 88
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 89
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowHLine()Z

    move-result v0

    const/16 v1, 0xc

    int-to-long v2, v0

    .line 90
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 91
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getFillCalendar()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    .line 92
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 93
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowRemark()Z

    move-result v0

    const/16 v1, 0xe

    int-to-long v2, v0

    .line 94
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 95
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getShowStat()Z

    move-result v0

    const/16 v1, 0xf

    int-to-long v2, v0

    .line 96
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 97
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getProtectMode()Z

    move-result v0

    const/16 v1, 0x10

    int-to-long v2, v0

    .line 98
    invoke-interface {p1, v1, v2, v3}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 99
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField1()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_e4

    .line 100
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_eb

    .line 102
    :cond_e4
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField1()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 104
    :goto_eb
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField2()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_f7

    .line 105
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_fe

    .line 107
    :cond_f7
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField2()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 109
    :goto_fe
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField3()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_10a

    .line 110
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_111

    .line 112
    :cond_10a
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField3()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 114
    :goto_111
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField4()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_11d

    .line 115
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_124

    .line 117
    :cond_11d
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField4()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 119
    :goto_124
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField5()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_130

    .line 120
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_137

    .line 122
    :cond_130
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getExtField5()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 124
    :goto_137
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getProjectUuid()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x16

    if-nez v0, :cond_143

    .line 125
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_14a

    .line 127
    :cond_143
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getProjectUuid()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 129
    :goto_14a
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getRemark()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_156

    .line 130
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_15d

    .line 132
    :cond_156
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getRemark()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 134
    :goto_15d
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getGmtCreate()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_169

    .line 135
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_170

    .line 137
    :cond_169
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getGmtCreate()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 139
    :goto_170
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getCc()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x19

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 140
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getCid()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1a

    if-nez v0, :cond_186

    .line 141
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_18d

    .line 143
    :cond_186
    invoke-virtual {p2}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;->getCid()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_18d
    return-void
.end method

.method public bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 38
    check-cast p2, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .registers 2

    const-string v0, "INSERT OR REPLACE INTO `ScheduleConfig` (`uuid`,`autoDay`,`beginDay`,`dateFontSize`,`workFontSize`,`timeFontSize`,`workRadius`,`showLunar`,`showFestival`,`showBeginTime`,`showEndTime`,`showHLine`,`fillCalendar`,`showRemark`,`showStat`,`protectMode`,`extField1`,`extField2`,`extField3`,`extField4`,`extField5`,`projectUuid`,`remark`,`gmtCreate`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass2 (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl$2)
.class Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$2;
.super Landroidx/room/SharedSQLiteStatement;
.source "ScheduleConfigDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomDatabase;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            "this$0",
            "database"
        }
    .end annotation

    .line 147
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$2;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/SharedSQLiteStatement;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .registers 2

    const-string v0, "delete from ScheduleConfig"

    return-object v0
.end method

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass3 (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl$3)
.class Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;
.super Ljava/lang/Object;
.source "ScheduleConfigDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->set(Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

.field final synthetic val$item:Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$item"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 158
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->val$item:Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 158
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->call()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public call()Lkotlin/Unit;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 163
    :try_start_9
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__insertionAdapterOfScheduleConfig(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/EntityInsertionAdapter;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->val$item:Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    invoke-virtual {v0, v1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V

    .line 165
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1f
    .catchall {:try_start_9 .. :try_end_1f} :catchall_29

    .line 167
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-object v0

    :catchall_29
    move-exception v0

    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$3;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 168
    throw v0
.end method

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass4 (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl$4)
.class Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;
.super Ljava/lang/Object;
.source "ScheduleConfigDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->clearAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 175
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 175
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->call()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public call()Lkotlin/Unit;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__preparedStmtOfClearAll(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/SharedSQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 179
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 181
    :try_start_13
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 182
    iget-object v1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v1}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V

    .line 183
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_21
    .catchall {:try_start_13 .. :try_end_21} :catchall_34

    .line 185
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 186
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__preparedStmtOfClearAll(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/SharedSQLiteStatement;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-object v1

    :catchall_34
    move-exception v1

    .line 185
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 186
    iget-object v2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$4;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v2}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__preparedStmtOfClearAll(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/SharedSQLiteStatement;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 187
    throw v1
.end method

###### Class cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass5 (cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl$5)
.class Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;
.super Ljava/lang/Object;
.source "ScheduleConfigDao_Impl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->realGet(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

.field final synthetic val$_statement:Landroidx/room/RoomSQLiteQuery;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;Landroidx/room/RoomSQLiteQuery;)V
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$_statement"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 197
    iput-object p1, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    iput-object p2, p0, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;
    .registers 55
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 200
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->this$0:Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;

    invoke-static {v0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;->-$$Nest$fget__db(Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl;)Landroidx/room/RoomDatabase;

    move-result-object v0

    iget-object v2, v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_10
    const-string v0, "uuid"

    .line 202
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "autoDay"

    .line 203
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "beginDay"

    .line 204
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "dateFontSize"

    .line 205
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "workFontSize"

    .line 206
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "timeFontSize"

    .line 207
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "workRadius"

    .line 208
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "showLunar"

    .line 209
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "showFestival"

    .line 210
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "showBeginTime"

    .line 211
    invoke-static {v2, v13}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "showEndTime"

    .line 212
    invoke-static {v2, v14}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "showHLine"

    .line 213
    invoke-static {v2, v15}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "fillCalendar"

    .line 214
    invoke-static {v2, v3}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "showRemark"

    .line 215
    invoke-static {v2, v4}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4
    :try_end_64
    .catchall {:try_start_10 .. :try_end_64} :catchall_264

    :try_start_64
    const-string v1, "showStat"

    .line 216
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "protectMode"

    .line 217
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "extField1"

    .line 218
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "extField2"

    .line 219
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "extField3"

    .line 220
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "extField4"

    .line 221
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "extField5"

    .line 222
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "projectUuid"

    .line 223
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "remark"

    .line 224
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "gmtCreate"

    .line 225
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v25, v1

    const-string v1, "cc"

    .line 226
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v26, v1

    const-string v1, "cid"

    .line 227
    invoke-static {v2, v1}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    .line 229
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v27

    if-eqz v27, :cond_254

    .line 231
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_d1

    const/16 v28, 0x0

    goto :goto_d7

    .line 234
    :cond_d1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v28, v0

    .line 237
    :goto_d7
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_e0

    const/16 v29, 0x0

    goto :goto_e6

    .line 240
    :cond_e0
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v29, v0

    .line 243
    :goto_e6
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_ef

    const/16 v30, 0x0

    goto :goto_f5

    .line 246
    :cond_ef
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v30, v0

    .line 249
    :goto_f5
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_fe

    const/16 v31, 0x0

    goto :goto_104

    .line 252
    :cond_fe
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v31, v0

    .line 255
    :goto_104
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_10d

    const/16 v32, 0x0

    goto :goto_113

    .line 258
    :cond_10d
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v32, v0

    .line 261
    :goto_113
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_11c

    const/16 v33, 0x0

    goto :goto_122

    .line 264
    :cond_11c
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v33, v0

    .line 267
    :goto_122
    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_12b

    const/16 v34, 0x0

    goto :goto_131

    .line 270
    :cond_12b
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v34, v0

    .line 274
    :goto_131
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-eqz v0, :cond_13b

    move/from16 v35, v5

    goto :goto_13d

    :cond_13b
    const/16 v35, 0x0

    .line 278
    :goto_13d
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_146

    move/from16 v36, v5

    goto :goto_148

    :cond_146
    const/16 v36, 0x0

    .line 282
    :goto_148
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_151

    move/from16 v37, v5

    goto :goto_153

    :cond_151
    const/16 v37, 0x0

    .line 286
    :goto_153
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_15c

    move/from16 v38, v5

    goto :goto_15e

    :cond_15c
    const/16 v38, 0x0

    .line 290
    :goto_15e
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_167

    move/from16 v39, v5

    goto :goto_169

    :cond_167
    const/16 v39, 0x0

    .line 294
    :goto_169
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_172

    move/from16 v40, v5

    goto :goto_174

    :cond_172
    const/16 v40, 0x0

    .line 298
    :goto_174
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_17f

    move/from16 v41, v5

    move/from16 v0, v16

    goto :goto_183

    :cond_17f
    move/from16 v0, v16

    const/16 v41, 0x0

    .line 302
    :goto_183
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_18e

    move/from16 v42, v5

    move/from16 v0, v17

    goto :goto_192

    :cond_18e
    move/from16 v0, v17

    const/16 v42, 0x0

    .line 306
    :goto_192
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_19d

    move/from16 v43, v5

    move/from16 v0, v18

    goto :goto_1a1

    :cond_19d
    move/from16 v0, v18

    const/16 v43, 0x0

    .line 309
    :goto_1a1
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1ac

    move/from16 v0, v19

    const/16 v44, 0x0

    goto :goto_1b4

    .line 312
    :cond_1ac
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v44, v0

    move/from16 v0, v19

    .line 315
    :goto_1b4
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1bf

    move/from16 v0, v20

    const/16 v45, 0x0

    goto :goto_1c7

    .line 318
    :cond_1bf
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v45, v0

    move/from16 v0, v20

    .line 321
    :goto_1c7
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1d2

    move/from16 v0, v21

    const/16 v46, 0x0

    goto :goto_1da

    .line 324
    :cond_1d2
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v46, v0

    move/from16 v0, v21

    .line 327
    :goto_1da
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1e5

    move/from16 v0, v22

    const/16 v47, 0x0

    goto :goto_1ed

    .line 330
    :cond_1e5
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v47, v0

    move/from16 v0, v22

    .line 333
    :goto_1ed
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1f8

    move/from16 v0, v23

    const/16 v48, 0x0

    goto :goto_200

    .line 336
    :cond_1f8
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v48, v0

    move/from16 v0, v23

    .line 339
    :goto_200
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_20b

    move/from16 v0, v24

    const/16 v49, 0x0

    goto :goto_213

    .line 342
    :cond_20b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v49, v0

    move/from16 v0, v24

    .line 345
    :goto_213
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_21e

    move/from16 v0, v25

    const/16 v50, 0x0

    goto :goto_226

    .line 348
    :cond_21e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v50, v0

    move/from16 v0, v25

    .line 351
    :goto_226
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_231

    move/from16 v0, v26

    const/16 v51, 0x0

    goto :goto_239

    .line 354
    :cond_231
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v51, v0

    move/from16 v0, v26

    .line 357
    :goto_239
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v52

    .line 359
    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_246

    const/16 v53, 0x0

    goto :goto_24c

    .line 362
    :cond_246
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v53, v4

    .line 364
    :goto_24c
    new-instance v4, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-object/from16 v27, v4

    invoke-direct/range {v27 .. v53}, Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_253
    .catchall {:try_start_64 .. :try_end_253} :catchall_260

    goto :goto_255

    :cond_254
    const/4 v4, 0x0

    .line 370
    :goto_255
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    move-object/from16 v1, p0

    .line 371
    iget-object v0, v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_260
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_265

    :catchall_264
    move-exception v0

    .line 370
    :goto_265
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 371
    iget-object v2, v1, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->val$_statement:Landroidx/room/RoomSQLiteQuery;

    invoke-virtual {v2}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 372
    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 197
    invoke-virtual {p0}, Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao_Impl$5;->call()Lcn/jianyun/workplan/module/schedule/model/ScheduleConfig;

    move-result-object v0

    return-object v0
.end method
