// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.ui.android.lunar.ChineseCalendar
// markers: Code decompiled incorrectly, please refer to instructions dump
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.ui.android.lunar.ChineseCalendar (cn.jianyun.workplan.ui.android.lunar.ChineseCalendar)
.class public final Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;
.super Ljava/util/GregorianCalendar;
.source "ChineseCalendar.java"


# static fields
.field public static final CHINESE_DATE:I = 0x323

.field public static final CHINESE_EARTHLY_BRANCH:I = 0x327

.field public static final CHINESE_HEAVENLY_STEM:I = 0x326

.field public static final CHINESE_MONTH:I = 0x322

.field public static final CHINESE_PRINCIPLE_TERM:I = 0x325

.field public static final CHINESE_SECTIONAL_TERM:I = 0x324

.field public static final CHINESE_TERM_OR_DATE:I = 0x378

.field public static final CHINESE_YEAR:I = 0x321

.field public static final CHINESE_ZODIAC:I = 0x328

.field private static final animalNames:[Ljava/lang/String;

.field private static final baseChineseDate:I = 0xb

.field private static final baseChineseMonth:I = 0xb

.field private static final baseChineseYear:I = 0x76c

.field private static final baseDate:I = 0x1

.field private static final baseIndex:I = 0x0

.field private static final baseMonth:I = 0x1

.field private static final baseYear:I = 0x76d

.field private static final bigLeapMonthYears:[I

.field private static final branchNames:[Ljava/lang/String;

.field private static final chineseDateNames:[Ljava/lang/String;

.field private static final chineseMonthNames:[Ljava/lang/String;

.field private static final chineseMonths:[C

.field private static final chineseWeekNames:[Ljava/lang/String;

.field private static final daysInGregorianMonth:[C

.field private static final principleTermMap:[[C

.field private static final principleTermNames:[Ljava/lang/String;

.field private static final principleTermYear:[[C

.field private static final sectionalTermMap:[[C

.field private static final sectionalTermNames:[Ljava/lang/String;

.field private static final sectionalTermYear:[[C

.field private static final serialVersionUID:J = 0x8L

.field private static final stemNames:[Ljava/lang/String;


# instance fields
.field private areChineseFieldsComputed:Z

.field private areSolarTermsComputed:Z

.field private chineseDate:I

.field private chineseMonth:I

.field private chineseYear:I

.field private lastSetChinese:Z

.field private principleTerm:I

.field private sectionalTerm:I


# direct methods
.method static constructor <clinit>()V
    .registers 32

    const-string v0, ""

    const-string v1, "\u661f\u671f\u65e5"

    const-string v2, "\u661f\u671f\u4e00"

    const-string v3, "\u661f\u671f\u4e8c"

    const-string v4, "\u661f\u671f\u4e09"

    const-string v5, "\u661f\u671f\u56db"

    const-string v6, "\u661f\u671f\u4e94"

    const-string v7, "\u661f\u671f\u516d"

    .line 642
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseWeekNames:[Ljava/lang/String;

    const-string v1, ""

    const-string v2, "\u6b63"

    const-string v3, "\u4e8c"

    const-string v4, "\u4e09"

    const-string v5, "\u56db"

    const-string v6, "\u4e94"

    const-string v7, "\u516d"

    const-string v8, "\u4e03"

    const-string v9, "\u516b"

    const-string v10, "\u4e5d"

    const-string v11, "\u5341"

    const-string v12, "\u5341\u4e00"

    const-string v13, "\u5341\u4e8c"

    .line 644
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonthNames:[Ljava/lang/String;

    const-string v1, ""

    const-string v2, "\u521d\u4e00"

    const-string v3, "\u521d\u4e8c"

    const-string v4, "\u521d\u4e09"

    const-string v5, "\u521d\u56db"

    const-string v6, "\u521d\u4e94"

    const-string v7, "\u521d\u516d"

    const-string v8, "\u521d\u4e03"

    const-string v9, "\u521d\u516b"

    const-string v10, "\u521d\u4e5d"

    const-string v11, "\u521d\u5341"

    const-string v12, "\u5341\u4e00"

    const-string v13, "\u5341\u4e8c"

    const-string v14, "\u5341\u4e09"

    const-string v15, "\u5341\u56db"

    const-string v16, "\u5341\u4e94"

    const-string v17, "\u5341\u516d"

    const-string v18, "\u5341\u4e03"

    const-string v19, "\u5341\u516b"

    const-string v20, "\u5341\u4e5d"

    const-string v21, "\u4e8c\u5341"

    const-string v22, "\u5eff\u4e00"

    const-string v23, "\u5eff\u4e8c"

    const-string v24, "\u5eff\u4e09"

    const-string v25, "\u5eff\u56db"

    const-string v26, "\u5eff\u4e94"

    const-string v27, "\u5eff\u516d"

    const-string v28, "\u5eff\u4e03"

    const-string v29, "\u5eff\u516b"

    const-string v30, "\u5eff\u4e5d"

    const-string v31, "\u4e09\u5341"

    .line 646
    filled-new-array/range {v1 .. v31}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDateNames:[Ljava/lang/String;

    const-string v1, "\u5927\u5bd2"

    const-string v2, "\u96e8\u6c34"

    const-string v3, "\u6625\u5206"

    const-string v4, "\u8c37\u96e8"

    const-string v5, "\u590f\u6ee1"

    const-string v6, "\u590f\u81f3"

    const-string v7, "\u5927\u6691"

    const-string v8, "\u5904\u6691"

    const-string v9, "\u79cb\u5206"

    const-string v10, "\u971c\u964d"

    const-string v11, "\u5c0f\u96ea"

    const-string v12, "\u51ac\u81f3"

    .line 651
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermNames:[Ljava/lang/String;

    const-string v1, "\u5c0f\u5bd2"

    const-string v2, "\u7acb\u6625"

    const-string v3, "\u60ca\u86f0"

    const-string v4, "\u6e05\u660e"

    const-string v5, "\u7acb\u590f"

    const-string v6, "\u8292\u79cd"

    const-string v7, "\u5c0f\u6691"

    const-string v8, "\u7acb\u79cb"

    const-string v9, "\u767d\u9732"

    const-string v10, "\u5bd2\u9732"

    const-string v11, "\u7acb\u51ac"

    const-string v12, "\u5927\u96ea"

    .line 654
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermNames:[Ljava/lang/String;

    const-string v1, ""

    const-string v2, "\u7532"

    const-string v3, "\u4e59"

    const-string v4, "\u4e19"

    const-string v5, "\u4e01"

    const-string v6, "\u620a"

    const-string v7, "\u5df1"

    const-string v8, "\u5e9a"

    const-string v9, "\u8f9b"

    const-string v10, "\u58ec"

    const-string v11, "\u7678"

    .line 657
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->stemNames:[Ljava/lang/String;

    const-string v1, ""

    const-string v2, "\u5b50"

    const-string v3, "\u4e11"

    const-string v4, "\u5bc5"

    const-string v5, "\u536f"

    const-string v6, "\u8fb0"

    const-string v7, "\u5df3"

    const-string v8, "\u5348"

    const-string v9, "\u672a"

    const-string v10, "\u7533"

    const-string v11, "\u9149"

    const-string v12, "\u620c"

    const-string v13, "\u4ea5"

    .line 659
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->branchNames:[Ljava/lang/String;

    const-string v1, ""

    const-string v2, "\u9f20"

    const-string v3, "\u725b"

    const-string v4, "\u864e"

    const-string v5, "\u5154"

    const-string v6, "\u9f99"

    const-string v7, "\u86c7"

    const-string v8, "\u9a6c"

    const-string v9, "\u7f8a"

    const-string v10, "\u7334"

    const-string v11, "\u9e21"

    const-string v12, "\u72d7"

    const-string v13, "\u732a"

    .line 661
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->animalNames:[Ljava/lang/String;

    const/16 v0, 0x14

    new-array v0, v0, [I

    .line 664
    fill-array-data v0, :array_2a4

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->bigLeapMonthYears:[I

    const/16 v0, 0xc

    new-array v1, v0, [[C

    const/16 v2, 0x1c

    new-array v3, v2, [C

    .line 667
    fill-array-data v3, :array_2d0

    const/4 v4, 0x0

    aput-object v3, v1, v4

    new-array v3, v2, [C

    fill-array-data v3, :array_2f0

    const/4 v5, 0x1

    aput-object v3, v1, v5

    const/16 v3, 0x1d

    new-array v6, v3, [C

    fill-array-data v6, :array_310

    const/4 v7, 0x2

    aput-object v6, v1, v7

    new-array v6, v3, [C

    fill-array-data v6, :array_332

    const/4 v8, 0x3

    aput-object v6, v1, v8

    new-array v6, v3, [C

    fill-array-data v6, :array_354

    const/4 v9, 0x4

    aput-object v6, v1, v9

    const/16 v6, 0x21

    new-array v10, v6, [C

    fill-array-data v10, :array_376

    const/4 v11, 0x5

    aput-object v10, v1, v11

    new-array v10, v3, [C

    fill-array-data v10, :array_39c

    const/4 v12, 0x6

    aput-object v10, v1, v12

    new-array v6, v6, [C

    fill-array-data v6, :array_3be

    const/4 v10, 0x7

    aput-object v6, v1, v10

    new-array v6, v3, [C

    fill-array-data v6, :array_3e4

    const/16 v13, 0x8

    aput-object v6, v1, v13

    new-array v6, v3, [C

    fill-array-data v6, :array_406

    const/16 v14, 0x9

    aput-object v6, v1, v14

    new-array v6, v3, [C

    fill-array-data v6, :array_428

    const/16 v15, 0xa

    aput-object v6, v1, v15

    new-array v6, v3, [C

    fill-array-data v6, :array_44a

    const/16 v16, 0xb

    aput-object v6, v1, v16

    sput-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermMap:[[C

    new-array v1, v0, [[C

    new-array v6, v14, [C

    .line 680
    fill-array-data v6, :array_46c

    aput-object v6, v1, v4

    new-array v6, v14, [C

    fill-array-data v6, :array_47a

    aput-object v6, v1, v5

    new-array v6, v14, [C

    fill-array-data v6, :array_488

    aput-object v6, v1, v7

    new-array v6, v14, [C

    fill-array-data v6, :array_496

    aput-object v6, v1, v8

    new-array v6, v14, [C

    fill-array-data v6, :array_4a4

    aput-object v6, v1, v9

    new-array v6, v14, [C

    fill-array-data v6, :array_4b2

    aput-object v6, v1, v11

    new-array v6, v14, [C

    fill-array-data v6, :array_4c0

    aput-object v6, v1, v12

    new-array v6, v14, [C

    fill-array-data v6, :array_4ce

    aput-object v6, v1, v10

    new-array v6, v14, [C

    fill-array-data v6, :array_4dc

    aput-object v6, v1, v13

    new-array v6, v14, [C

    fill-array-data v6, :array_4ea

    aput-object v6, v1, v14

    new-array v6, v14, [C

    fill-array-data v6, :array_4f8

    aput-object v6, v1, v15

    new-array v6, v14, [C

    fill-array-data v6, :array_506

    aput-object v6, v1, v16

    sput-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermYear:[[C

    new-array v1, v0, [[C

    new-array v6, v2, [C

    .line 693
    fill-array-data v6, :array_514

    aput-object v6, v1, v4

    new-array v2, v2, [C

    fill-array-data v2, :array_534

    aput-object v2, v1, v5

    new-array v2, v3, [C

    fill-array-data v2, :array_554

    aput-object v2, v1, v7

    new-array v2, v3, [C

    fill-array-data v2, :array_576

    aput-object v2, v1, v8

    new-array v2, v3, [C

    fill-array-data v2, :array_598

    aput-object v2, v1, v9

    new-array v2, v3, [C

    fill-array-data v2, :array_5ba

    aput-object v2, v1, v11

    new-array v2, v3, [C

    fill-array-data v2, :array_5dc

    aput-object v2, v1, v12

    new-array v2, v3, [C

    fill-array-data v2, :array_5fe

    aput-object v2, v1, v10

    new-array v2, v3, [C

    fill-array-data v2, :array_620

    aput-object v2, v1, v13

    new-array v2, v3, [C

    fill-array-data v2, :array_642

    aput-object v2, v1, v14

    new-array v2, v3, [C

    fill-array-data v2, :array_664

    aput-object v2, v1, v15

    new-array v2, v3, [C

    fill-array-data v2, :array_686

    aput-object v2, v1, v16

    sput-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermMap:[[C

    new-array v1, v0, [[C

    new-array v2, v10, [C

    .line 706
    fill-array-data v2, :array_6a8

    aput-object v2, v1, v4

    new-array v2, v10, [C

    fill-array-data v2, :array_6b4

    aput-object v2, v1, v5

    new-array v2, v13, [C

    fill-array-data v2, :array_6c0

    aput-object v2, v1, v7

    new-array v2, v13, [C

    fill-array-data v2, :array_6cc

    aput-object v2, v1, v8

    new-array v2, v13, [C

    fill-array-data v2, :array_6d8

    aput-object v2, v1, v9

    new-array v2, v13, [C

    fill-array-data v2, :array_6e4

    aput-object v2, v1, v11

    new-array v2, v13, [C

    fill-array-data v2, :array_6f0

    aput-object v2, v1, v12

    new-array v2, v13, [C

    fill-array-data v2, :array_6fc

    aput-object v2, v1, v10

    new-array v2, v13, [C

    fill-array-data v2, :array_708

    aput-object v2, v1, v13

    new-array v2, v13, [C

    fill-array-data v2, :array_714

    aput-object v2, v1, v14

    new-array v2, v13, [C

    fill-array-data v2, :array_720

    aput-object v2, v1, v15

    new-array v2, v13, [C

    fill-array-data v2, :array_72c

    aput-object v2, v1, v16

    sput-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermYear:[[C

    new-array v0, v0, [C

    .line 720
    fill-array-data v0, :array_738

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInGregorianMonth:[C

    const/16 v0, 0x192

    new-array v0, v0, [C

    .line 721
    fill-array-data v0, :array_748

    sput-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    return-void

    :array_2a4
    .array-data 4
        0x6
        0xe
        0x13
        0x19
        0x21
        0x24
        0x26
        0x29
        0x2c
        0x34
        0x37
        0x4f
        0x75
        0x88
        0x93
        0x96
        0x9b
        0x9e
        0xb9
        0xc1
    .end array-data

    :array_2d0
    .array-data 2
        0x7s
        0x6s
        0x6s
        0x6s
        0x6s
        0x6s
        0x6s
        0x6s
        0x6s
        0x5s
        0x6s
        0x6s
        0x6s
        0x5s
        0x5s
        0x6s
        0x6s
        0x5s
        0x5s
        0x5s
        0x5s
        0x5s
        0x5s
        0x5s
        0x5s
        0x4s
        0x5s
        0x5s
    .end array-data

    :array_2f0
    .array-data 2
        0x5s
        0x4s
        0x5s
        0x5s
        0x5s
        0x4s
        0x4s
        0x5s
        0x5s
        0x4s
        0x4s
        0x4s
        0x4s
        0x4s
        0x4s
        0x4s
        0x4s
        0x3s
        0x4s
        0x4s
        0x4s
        0x3s
        0x3s
        0x4s
        0x4s
        0x3s
        0x3s
        0x3s
    .end array-data

    :array_310
    .array-data 2
        0x6s
        0x6s
        0x6s
        0x7s
        0x6s
        0x6s
        0x6s
        0x6s
        0x5s
        0x6s
        0x6s
        0x6s
        0x5s
        0x5s
        0x6s
        0x6s
        0x5s
        0x5s
        0x5s
        0x6s
        0x5s
        0x5s
        0x5s
        0x5s
        0x4s
        0x5s
        0x5s
        0x5s
        0x5s
    .end array-data

    nop

    :array_332
    .array-data 2
        0x5s
        0x5s
        0x6s
        0x6s
        0x5s
        0x5s
        0x5s
        0x6s
        0x5s
        0x5s
        0x5s
        0x5s
        0x4s
        0x5s
        0x5s
        0x5s
        0x4s
        0x4s
        0x5s
        0x5s
        0x4s
        0x4s
        0x4s
        0x5s
        0x4s
        0x4s
        0x4s
        0x4s
        0x5s
    .end array-data

    nop

    :array_354
    .array-data 2
        0x6s
        0x6s
        0x6s
        0x7s
        0x6s
        0x6s
        0x6s
        0x6s
        0x5s
        0x6s
        0x6s
        0x6s
        0x5s
        0x5s
        0x6s
        0x6s
        0x5s
        0x5s
        0x5s
        0x6s
        0x5s
        0x5s
        0x5s
        0x5s
        0x4s
        0x5s
        0x5s
        0x5s
        0x5s
    .end array-data

    nop

    :array_376
    .array-data 2
        0x6s
        0x6s
        0x7s
        0x7s
        0x6s
        0x6s
        0x6s
        0x7s
        0x6s
        0x6s
        0x6s
        0x6s
        0x5s
        0x6s
        0x6s
        0x6s
        0x5s
        0x5s
        0x6s
        0x6s
        0x5s
        0x5s
        0x5s
        0x6s
        0x5s
        0x5s
        0x5s
        0x5s
        0x4s
        0x5s
        0x5s
        0x5s
        0x5s
    .end array-data

    nop

    :array_39c
    .array-data 2
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x7s
        0x7s
        0x7s
        0x8s
        0x7s
        0x7s
        0x7s
        0x7s
        0x6s
        0x7s
        0x7s
        0x7s
        0x6s
        0x6s
        0x7s
        0x7s
        0x6s
        0x6s
        0x6s
        0x7s
        0x7s
    .end array-data

    nop

    :array_3be
    .array-data 2
        0x8s
        0x8s
        0x8s
        0x9s
        0x8s
        0x8s
        0x8s
        0x8s
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x7s
        0x7s
        0x7s
        0x8s
        0x7s
        0x7s
        0x7s
        0x7s
        0x6s
        0x7s
        0x7s
        0x7s
        0x6s
        0x6s
        0x7s
        0x7s
        0x7s
    .end array-data

    nop

    :array_3e4
    .array-data 2
        0x8s
        0x8s
        0x8s
        0x9s
        0x8s
        0x8s
        0x8s
        0x8s
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x7s
        0x7s
        0x7s
        0x8s
        0x7s
        0x7s
        0x7s
        0x7s
        0x6s
        0x7s
        0x7s
        0x7s
        0x7s
    .end array-data

    nop

    :array_406
    .array-data 2
        0x9s
        0x9s
        0x9s
        0x9s
        0x8s
        0x9s
        0x9s
        0x9s
        0x8s
        0x8s
        0x9s
        0x9s
        0x8s
        0x8s
        0x8s
        0x9s
        0x8s
        0x8s
        0x8s
        0x8s
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x8s
    .end array-data

    nop

    :array_428
    .array-data 2
        0x8s
        0x8s
        0x8s
        0x8s
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x7s
        0x7s
        0x7s
        0x8s
        0x7s
        0x7s
        0x7s
        0x7s
        0x6s
        0x7s
        0x7s
        0x7s
        0x6s
        0x6s
        0x7s
        0x7s
        0x7s
    .end array-data

    nop

    :array_44a
    .array-data 2
        0x7s
        0x8s
        0x8s
        0x8s
        0x7s
        0x7s
        0x8s
        0x8s
        0x7s
        0x7s
        0x7s
        0x8s
        0x7s
        0x7s
        0x7s
        0x7s
        0x6s
        0x7s
        0x7s
        0x7s
        0x6s
        0x6s
        0x7s
        0x7s
        0x6s
        0x6s
        0x6s
        0x7s
        0x7s
    .end array-data

    nop

    :array_46c
    .array-data 2
        0xds
        0x31s
        0x55s
        0x75s
        0x95s
        0xb9s
        0xc9s
        0xfas
        0xfas
    .end array-data

    nop

    :array_47a
    .array-data 2
        0xds
        0x2ds
        0x51s
        0x75s
        0x95s
        0xb9s
        0xc9s
        0xfas
        0xfas
    .end array-data

    nop

    :array_488
    .array-data 2
        0xds
        0x30s
        0x54s
        0x70s
        0x94s
        0xb8s
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_496
    .array-data 2
        0xds
        0x2ds
        0x4cs
        0x6cs
        0x8cs
        0xacs
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_4a4
    .array-data 2
        0xds
        0x2cs
        0x48s
        0x68s
        0x84s
        0xa8s
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_4b2
    .array-data 2
        0x5s
        0x21s
        0x44s
        0x60s
        0x7cs
        0x98s
        0xbcs
        0xc8s
        0xc9s
    .end array-data

    nop

    :array_4c0
    .array-data 2
        0x1ds
        0x39s
        0x55s
        0x78s
        0x94s
        0xb0s
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_4ce
    .array-data 2
        0xds
        0x30s
        0x4cs
        0x68s
        0x84s
        0xa8s
        0xc4s
        0xc8s
        0xc9s
    .end array-data

    nop

    :array_4dc
    .array-data 2
        0x19s
        0x3cs
        0x58s
        0x78s
        0x94s
        0xb8s
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_4ea
    .array-data 2
        0x10s
        0x2cs
        0x4cs
        0x6cs
        0x90s
        0xacs
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_4f8
    .array-data 2
        0x1cs
        0x3cs
        0x5cs
        0x7cs
        0xa0s
        0xc0s
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_506
    .array-data 2
        0x11s
        0x35s
        0x55s
        0x7cs
        0x9cs
        0xbcs
        0xc8s
        0xc9s
        0xfas
    .end array-data

    nop

    :array_514
    .array-data 2
        0x15s
        0x15s
        0x15s
        0x15s
        0x15s
        0x14s
        0x15s
        0x15s
        0x15s
        0x14s
        0x14s
        0x15s
        0x15s
        0x14s
        0x14s
        0x14s
        0x14s
        0x14s
        0x14s
        0x14s
        0x14s
        0x13s
        0x14s
        0x14s
        0x14s
        0x13s
        0x13s
        0x14s
    .end array-data

    :array_534
    .array-data 2
        0x14s
        0x13s
        0x13s
        0x14s
        0x14s
        0x13s
        0x13s
        0x13s
        0x13s
        0x13s
        0x13s
        0x13s
        0x13s
        0x12s
        0x13s
        0x13s
        0x13s
        0x12s
        0x12s
        0x13s
        0x13s
        0x12s
        0x12s
        0x12s
        0x12s
        0x12s
        0x12s
        0x12s
    .end array-data

    :array_554
    .array-data 2
        0x15s
        0x15s
        0x15s
        0x16s
        0x15s
        0x15s
        0x15s
        0x15s
        0x14s
        0x15s
        0x15s
        0x15s
        0x14s
        0x14s
        0x15s
        0x15s
        0x14s
        0x14s
        0x14s
        0x15s
        0x14s
        0x14s
        0x14s
        0x14s
        0x13s
        0x14s
        0x14s
        0x14s
        0x14s
    .end array-data

    nop

    :array_576
    .array-data 2
        0x14s
        0x15s
        0x15s
        0x15s
        0x14s
        0x14s
        0x15s
        0x15s
        0x14s
        0x14s
        0x14s
        0x15s
        0x14s
        0x14s
        0x14s
        0x14s
        0x13s
        0x14s
        0x14s
        0x14s
        0x13s
        0x13s
        0x14s
        0x14s
        0x13s
        0x13s
        0x13s
        0x14s
        0x14s
    .end array-data

    nop

    :array_598
    .array-data 2
        0x15s
        0x16s
        0x16s
        0x16s
        0x15s
        0x15s
        0x16s
        0x16s
        0x15s
        0x15s
        0x15s
        0x16s
        0x15s
        0x15s
        0x15s
        0x15s
        0x14s
        0x15s
        0x15s
        0x15s
        0x14s
        0x14s
        0x15s
        0x15s
        0x14s
        0x14s
        0x14s
        0x15s
        0x15s
    .end array-data

    nop

    :array_5ba
    .array-data 2
        0x16s
        0x16s
        0x16s
        0x16s
        0x15s
        0x16s
        0x16s
        0x16s
        0x15s
        0x15s
        0x16s
        0x16s
        0x15s
        0x15s
        0x15s
        0x16s
        0x15s
        0x15s
        0x15s
        0x15s
        0x14s
        0x15s
        0x15s
        0x15s
        0x14s
        0x14s
        0x15s
        0x15s
        0x15s
    .end array-data

    nop

    :array_5dc
    .array-data 2
        0x17s
        0x17s
        0x18s
        0x18s
        0x17s
        0x17s
        0x17s
        0x18s
        0x17s
        0x17s
        0x17s
        0x17s
        0x16s
        0x17s
        0x17s
        0x17s
        0x16s
        0x16s
        0x17s
        0x17s
        0x16s
        0x16s
        0x16s
        0x17s
        0x16s
        0x16s
        0x16s
        0x16s
        0x17s
    .end array-data

    nop

    :array_5fe
    .array-data 2
        0x17s
        0x18s
        0x18s
        0x18s
        0x17s
        0x17s
        0x18s
        0x18s
        0x17s
        0x17s
        0x17s
        0x18s
        0x17s
        0x17s
        0x17s
        0x17s
        0x16s
        0x17s
        0x17s
        0x17s
        0x16s
        0x16s
        0x17s
        0x17s
        0x16s
        0x16s
        0x16s
        0x17s
        0x17s
    .end array-data

    nop

    :array_620
    .array-data 2
        0x17s
        0x18s
        0x18s
        0x18s
        0x17s
        0x17s
        0x18s
        0x18s
        0x17s
        0x17s
        0x17s
        0x18s
        0x17s
        0x17s
        0x17s
        0x17s
        0x16s
        0x17s
        0x17s
        0x17s
        0x16s
        0x16s
        0x17s
        0x17s
        0x16s
        0x16s
        0x16s
        0x17s
        0x17s
    .end array-data

    nop

    :array_642
    .array-data 2
        0x18s
        0x18s
        0x18s
        0x18s
        0x17s
        0x18s
        0x18s
        0x18s
        0x17s
        0x17s
        0x18s
        0x18s
        0x17s
        0x17s
        0x17s
        0x18s
        0x17s
        0x17s
        0x17s
        0x17s
        0x16s
        0x17s
        0x17s
        0x17s
        0x16s
        0x16s
        0x17s
        0x17s
        0x17s
    .end array-data

    nop

    :array_664
    .array-data 2
        0x17s
        0x17s
        0x17s
        0x17s
        0x16s
        0x17s
        0x17s
        0x17s
        0x16s
        0x16s
        0x17s
        0x17s
        0x16s
        0x16s
        0x16s
        0x17s
        0x16s
        0x16s
        0x16s
        0x16s
        0x15s
        0x16s
        0x16s
        0x16s
        0x15s
        0x15s
        0x16s
        0x16s
        0x16s
    .end array-data

    nop

    :array_686
    .array-data 2
        0x16s
        0x16s
        0x17s
        0x17s
        0x16s
        0x16s
        0x16s
        0x17s
        0x16s
        0x16s
        0x16s
        0x16s
        0x15s
        0x16s
        0x16s
        0x16s
        0x15s
        0x15s
        0x16s
        0x16s
        0x15s
        0x15s
        0x15s
        0x16s
        0x15s
        0x15s
        0x15s
        0x15s
        0x16s
    .end array-data

    nop

    :array_6a8
    .array-data 2
        0xds
        0x2ds
        0x51s
        0x71s
        0x95s
        0xb9s
        0xc9s
    .end array-data

    nop

    :array_6b4
    .array-data 2
        0x15s
        0x39s
        0x5ds
        0x7ds
        0xa1s
        0xc1s
        0xc9s
    .end array-data

    nop

    :array_6c0
    .array-data 2
        0x15s
        0x38s
        0x58s
        0x78s
        0x98s
        0xbcs
        0xc8s
        0xc9s
    .end array-data

    :array_6cc
    .array-data 2
        0x15s
        0x31s
        0x51s
        0x74s
        0x90s
        0xb0s
        0xc8s
        0xc9s
    .end array-data

    :array_6d8
    .array-data 2
        0x11s
        0x31s
        0x4ds
        0x70s
        0x8cs
        0xa8s
        0xc8s
        0xc9s
    .end array-data

    :array_6e4
    .array-data 2
        0x1cs
        0x3cs
        0x58s
        0x74s
        0x94s
        0xb4s
        0xc8s
        0xc9s
    .end array-data

    :array_6f0
    .array-data 2
        0x19s
        0x35s
        0x54s
        0x70s
        0x90s
        0xacs
        0xc8s
        0xc9s
    .end array-data

    :array_6fc
    .array-data 2
        0x1ds
        0x39s
        0x59s
        0x78s
        0x94s
        0xb4s
        0xc8s
        0xc9s
    .end array-data

    :array_708
    .array-data 2
        0x11s
        0x2ds
        0x49s
        0x6cs
        0x8cs
        0xa8s
        0xc8s
        0xc9s
    .end array-data

    :array_714
    .array-data 2
        0x1cs
        0x3cs
        0x5cs
        0x7cs
        0xa0s
        0xc0s
        0xc8s
        0xc9s
    .end array-data

    :array_720
    .array-data 2
        0x10s
        0x2cs
        0x50s
        0x70s
        0x94s
        0xb4s
        0xc8s
        0xc9s
    .end array-data

    :array_72c
    .array-data 2
        0x11s
        0x35s
        0x58s
        0x78s
        0x9cs
        0xbcs
        0xc8s
        0xc9s
    .end array-data

    :array_738
    .array-data 2
        0x1fs
        0x1cs
        0x1fs
        0x1es
        0x1fs
        0x1es
        0x1fs
        0x1fs
        0x1es
        0x1fs
        0x1es
        0x1fs
    .end array-data

    :array_748
    .array-data 2
        0x0s
        0x4s
        0xads
        0x8s
        0x5as
        0x1s
        0xd5s
        0x54s
        0xb4s
        0x9s
        0x64s
        0x5s
        0x59s
        0x45s
        0x95s
        0xas
        0xa6s
        0x4s
        0x55s
        0x24s
        0xads
        0x8s
        0x5as
        0x62s
        0xdas
        0x4s
        0xb4s
        0x5s
        0xb4s
        0x55s
        0x52s
        0xds
        0x94s
        0xas
        0x4as
        0x2as
        0x56s
        0x2s
        0x6ds
        0x71s
        0x6ds
        0x1s
        0xdas
        0x2s
        0xd2s
        0x52s
        0xa9s
        0x5s
        0x49s
        0xds
        0x2as
        0x45s
        0x2bs
        0x9s
        0x56s
        0x1s
        0xb5s
        0x20s
        0x6ds
        0x1s
        0x59s
        0x69s
        0xd4s
        0xas
        0xa8s
        0x5s
        0xa9s
        0x56s
        0xa5s
        0x4s
        0x2bs
        0x9s
        0x9es
        0x38s
        0xb6s
        0x8s
        0xecs
        0x74s
        0x6cs
        0x5s
        0xd4s
        0xas
        0xe4s
        0x6as
        0x52s
        0x5s
        0x95s
        0xas
        0x5as
        0x42s
        0x5bs
        0x4s
        0xb6s
        0x4s
        0xb4s
        0x22s
        0x6as
        0x5s
        0x52s
        0x75s
        0xc9s
        0xas
        0x52s
        0x5s
        0x35s
        0x55s
        0x4ds
        0xas
        0x5as
        0x2s
        0x5ds
        0x31s
        0xb5s
        0x2s
        0x6as
        0x8as
        0x68s
        0x5s
        0xa9s
        0xas
        0x8as
        0x6as
        0x2as
        0x5s
        0x2ds
        0x9s
        0xaas
        0x48s
        0x5as
        0x1s
        0xb5s
        0x9s
        0xb0s
        0x39s
        0x64s
        0x5s
        0x25s
        0x75s
        0x95s
        0xas
        0x96s
        0x4s
        0x4ds
        0x54s
        0xads
        0x4s
        0xdas
        0x4s
        0xd4s
        0x44s
        0xb4s
        0x5s
        0x54s
        0x85s
        0x52s
        0xds
        0x92s
        0xas
        0x56s
        0x6as
        0x56s
        0x2s
        0x6ds
        0x2s
        0x6as
        0x41s
        0xdas
        0x2s
        0xb2s
        0xa1s
        0xa9s
        0x5s
        0x49s
        0xds
        0xas
        0x6ds
        0x2as
        0x9s
        0x56s
        0x1s
        0xads
        0x50s
        0x6ds
        0x1s
        0xd9s
        0x2s
        0xd1s
        0x3as
        0xa8s
        0x5s
        0x29s
        0x85s
        0xa5s
        0xcs
        0x2as
        0x9s
        0x96s
        0x54s
        0xb6s
        0x8s
        0x6cs
        0x9s
        0x64s
        0x45s
        0xd4s
        0xas
        0xa4s
        0x5s
        0x51s
        0x25s
        0x95s
        0xas
        0x2as
        0x72s
        0x5bs
        0x4s
        0xb6s
        0x4s
        0xacs
        0x52s
        0x6as
        0x5s
        0xd2s
        0xas
        0xa2s
        0x4as
        0x4as
        0x5s
        0x55s
        0x94s
        0x2ds
        0xas
        0x5as
        0x2s
        0x75s
        0x61s
        0xb5s
        0x2s
        0x6as
        0x3s
        0x61s
        0x45s
        0xa9s
        0xas
        0x4as
        0x5s
        0x25s
        0x25s
        0x2ds
        0x9s
        0x9as
        0x68s
        0xdas
        0x8s
        0xb4s
        0x9s
        0xa8s
        0x59s
        0x54s
        0x3s
        0xa5s
        0xas
        0x91s
        0x3as
        0x96s
        0x4s
        0xads
        0xb0s
        0xads
        0x4s
        0xdas
        0x4s
        0xf4s
        0x62s
        0xb4s
        0x5s
        0x54s
        0xbs
        0x44s
        0x5ds
        0x52s
        0xas
        0x95s
        0x4s
        0x55s
        0x22s
        0x6ds
        0x2s
        0x5as
        0x71s
        0xdas
        0x2s
        0xaas
        0x5s
        0xb2s
        0x55s
        0x49s
        0xbs
        0x4as
        0xas
        0x2ds
        0x39s
        0x36s
        0x1s
        0x6ds
        0x80s
        0x6ds
        0x1s
        0xd9s
        0x2s
        0xe9s
        0x6as
        0xa8s
        0x5s
        0x29s
        0xbs
        0x9as
        0x4cs
        0xaas
        0x8s
        0xb6s
        0x8s
        0xb4s
        0x38s
        0x6cs
        0x9s
        0x54s
        0x75s
        0xd4s
        0xas
        0xa4s
        0x5s
        0x45s
        0x55s
        0x95s
        0xas
        0x9as
        0x4s
        0x55s
        0x44s
        0xb5s
        0x4s
        0x6as
        0x82s
        0x6as
        0x5s
        0xd2s
        0xas
        0x92s
        0x6as
        0x4as
        0x5s
        0x55s
        0xas
        0x2as
        0x4as
        0x5as
        0x2s
        0xb5s
        0x2s
        0xb2s
        0x31s
        0x69s
        0x3s
        0x31s
        0x73s
        0xa9s
        0xas
        0x4as
        0x5s
        0x2ds
        0x55s
        0x2ds
        0x9s
        0x5as
        0x1s
        0xd5s
        0x48s
        0xb4s
        0x9s
        0x68s
        0x89s
        0x54s
        0xbs
        0xa4s
        0xas
        0xa5s
        0x6as
        0x95s
        0x4s
        0xads
        0x8s
        0x6as
        0x44s
        0xdas
        0x4s
        0x74s
        0x5s
        0xb0s
        0x25s
        0x54s
        0x3s
    .end array-data
.end method

.method public constructor <init>()V
    .registers 1

    .line 45
    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    return-void
.end method

.method public constructor <init>(III)V
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "y",
            "m",
            "d"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2, p3}, Ljava/util/GregorianCalendar;-><init>(III)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Calendar;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "c"
        }
    .end annotation

    .line 53
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;-><init>(Ljava/util/Date;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "d"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 49
    invoke-super {p0, p1}, Ljava/util/GregorianCalendar;->setTime(Ljava/util/Date;)V

    return-void
.end method

.method public constructor <init>(ZIII)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "isChinese",
            "y",
            "m",
            "d"
        }
    .end annotation

    .line 61
    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    if-eqz p1, :cond_15

    const/16 p1, 0x321

    .line 63
    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(II)V

    const/16 p1, 0x322

    .line 64
    invoke-virtual {p0, p1, p3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(II)V

    const/16 p1, 0x323

    .line 65
    invoke-virtual {p0, p1, p4}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(II)V

    goto :goto_18

    .line 67
    :cond_15
    invoke-virtual {p0, p2, p3, p4}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(III)V

    :goto_18
    return-void
.end method

.method private computeChineseFields()V
    .registers 8

    const/4 v0, 0x1

    .line 407
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->internalGet(I)I

    move-result v1

    const/4 v2, 0x2

    .line 408
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->internalGet(I)I

    move-result v2

    add-int/2addr v2, v0

    const/4 v3, 0x5

    .line 409
    invoke-virtual {p0, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->internalGet(I)I

    move-result v3

    const/16 v4, 0x76d

    if-lt v1, v4, :cond_7f

    const/16 v5, 0x834

    if-le v1, v5, :cond_19

    goto :goto_7f

    :cond_19
    const/16 v5, 0x7d0

    const/16 v6, 0xb

    if-ge v1, v5, :cond_28

    const/16 v5, 0x76c

    .line 420
    iput v5, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 421
    iput v6, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    .line 422
    iput v6, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    goto :goto_33

    :cond_28
    const/16 v4, 0x7cf

    .line 427
    iput v4, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 428
    iput v6, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    const/16 v4, 0x19

    .line 429
    iput v4, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    move v4, v5

    :goto_33
    const/4 v5, 0x0

    :goto_34
    if-ge v4, v1, :cond_44

    .line 435
    invoke-static {v4}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isGregorianLeapYear(I)Z

    move-result v6

    if-eqz v6, :cond_3f

    add-int/lit16 v5, v5, 0x16e

    goto :goto_41

    :cond_3f
    add-int/lit16 v5, v5, 0x16d

    :goto_41
    add-int/lit8 v4, v4, 0x1

    goto :goto_34

    :cond_44
    move v4, v0

    :goto_45
    if-ge v4, v2, :cond_51

    add-int/lit8 v6, v4, -0x1

    .line 444
    invoke-static {v1, v6}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInGregorianMonth(II)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_45

    :cond_51
    sub-int/2addr v3, v0

    add-int/2addr v5, v3

    .line 450
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    add-int/2addr v1, v5

    iput v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    .line 452
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v1, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v1

    .line 453
    :goto_60
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    if-le v2, v1, :cond_7f

    sub-int/2addr v2, v1

    .line 454
    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    .line 455
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v1, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->nextChineseMonth(II)I

    move-result v1

    iput v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    if-ne v1, v0, :cond_78

    .line 457
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr v2, v0

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 459
    :cond_78
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    invoke-static {v2, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v1

    goto :goto_60

    :cond_7f
    :goto_7f
    return-void
.end method

.method private computeGregorianFields()V
    .registers 10

    .line 346
    iget v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 347
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    .line 348
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    const/4 v3, 0x1

    .line 349
    iput-boolean v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 350
    iput-boolean v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    const/4 v4, 0x0

    .line 351
    iput-boolean v4, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    const/16 v5, 0x76c

    const/16 v6, 0x834

    if-ge v0, v5, :cond_17

    const/16 v0, 0x76b

    goto :goto_1b

    :cond_17
    if-le v0, v6, :cond_1b

    const/16 v0, 0x835

    :cond_1b
    :goto_1b
    const/16 v5, -0xc

    const/16 v7, 0xc

    if-ge v1, v5, :cond_23

    move v1, v5

    goto :goto_26

    :cond_23
    if-le v1, v7, :cond_26

    move v1, v7

    :cond_26
    :goto_26
    if-ge v2, v3, :cond_2a

    move v2, v3

    goto :goto_2f

    :cond_2a
    const/16 v5, 0x1e

    if-le v2, v5, :cond_2f

    move v2, v5

    :cond_2f
    :goto_2f
    mul-int/lit16 v5, v0, 0x2710

    .line 369
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v8

    mul-int/lit8 v8, v8, 0x64

    add-int/2addr v5, v8

    add-int/2addr v5, v2

    const v8, 0x121ef17

    if-ge v5, v8, :cond_47

    const/16 v0, 0x76d

    .line 371
    invoke-virtual {p0, v0, v4, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(III)V

    .line 372
    invoke-super {p0}, Ljava/util/GregorianCalendar;->complete()V

    goto :goto_89

    :cond_47
    const v8, 0x14073f1

    if-le v5, v8, :cond_57

    const/16 v0, 0xb

    const/16 v1, 0x1f

    .line 374
    invoke-virtual {p0, v6, v0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(III)V

    .line 375
    invoke-super {p0}, Ljava/util/GregorianCalendar;->complete()V

    goto :goto_89

    .line 377
    :cond_57
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-le v5, v7, :cond_5e

    goto :goto_5f

    :cond_5e
    move v7, v1

    .line 380
    :goto_5f
    invoke-static {v0, v7}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v1

    if-nez v1, :cond_6a

    neg-int v7, v7

    .line 383
    invoke-static {v0, v7}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v1

    :cond_6a
    if-le v2, v1, :cond_6d

    move v2, v1

    .line 388
    :cond_6d
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v1, v3

    invoke-virtual {p0, v0, v1, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->set(III)V

    .line 389
    invoke-direct {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeChineseFields()V

    .line 392
    :cond_78
    :goto_78
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    if-ne v1, v0, :cond_8d

    iget v5, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    if-eq v5, v7, :cond_81

    goto :goto_8d

    .line 399
    :cond_81
    iget v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    sub-int/2addr v2, v0

    add-int/2addr v4, v2

    const/4 v0, 0x5

    .line 401
    invoke-super {p0, v0, v4}, Ljava/util/GregorianCalendar;->add(II)V

    .line 403
    :goto_89
    invoke-direct {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeChineseFields()V

    return-void

    .line 393
    :cond_8d
    :goto_8d
    iget v5, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v1, v5}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v1

    add-int/2addr v4, v1

    .line 394
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v5, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v1, v5}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->nextChineseMonth(II)I

    move-result v1

    iput v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    if-ne v1, v3, :cond_78

    .line 396
    iget v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr v1, v3

    iput v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    goto :goto_78
.end method

.method private computeIfNeed(I)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "field"
        }
    .end annotation

    .line 322
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseField(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2c

    .line 323
    iget-boolean v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    if-nez v0, :cond_1c

    iget-boolean v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    if-nez v0, :cond_1c

    .line 324
    invoke-super {p0}, Ljava/util/GregorianCalendar;->complete()V

    .line 325
    invoke-direct {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeChineseFields()V

    .line 326
    iput-boolean v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    .line 327
    iput-boolean v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 328
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    .line 330
    :cond_1c
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseTermsField(I)Z

    move-result p1

    if-eqz p1, :cond_40

    iget-boolean p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    if-nez p1, :cond_40

    .line 331
    invoke-direct {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeSolarTerms()V

    .line 332
    iput-boolean v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    goto :goto_40

    .line 335
    :cond_2c
    iget-boolean p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    if-eqz p1, :cond_40

    iget-boolean p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    if-nez p1, :cond_40

    .line 336
    invoke-direct {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeGregorianFields()V

    .line 337
    invoke-super {p0}, Ljava/util/GregorianCalendar;->complete()V

    .line 338
    iput-boolean v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    .line 339
    iput-boolean v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 340
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    :cond_40
    :goto_40
    return-void
.end method

.method private computeSolarTerms()V
    .registers 4

    const/4 v0, 0x1

    .line 465
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->internalGet(I)I

    move-result v0

    const/4 v1, 0x2

    .line 466
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->internalGet(I)I

    move-result v1

    const/16 v2, 0x76d

    if-lt v0, v2, :cond_1f

    const/16 v2, 0x834

    if-le v0, v2, :cond_13

    goto :goto_1f

    .line 471
    :cond_13
    invoke-static {v0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTerm(II)I

    move-result v2

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTerm:I

    .line 472
    invoke-static {v0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTerm(II)I

    move-result v0

    iput v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTerm:I

    :cond_1f
    :goto_1f
    return-void
.end method

.method public static daysInChineseMonth(II)I
    .registers 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "y",
            "m"
        }
    .end annotation

    add-int/lit16 p0, p0, -0x76c

    const/4 v0, 0x0

    add-int/2addr p0, v0

    const/16 v1, 0x1d

    const/16 v2, 0x1e

    const/4 v3, 0x1

    if-gt v3, p1, :cond_1c

    const/16 v4, 0x8

    if-gt p1, v4, :cond_1c

    .line 582
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    mul-int/lit8 p0, p0, 0x2

    aget-char p0, v0, p0

    sub-int/2addr p1, v3

    shr-int/2addr p0, p1

    and-int/2addr p0, v3

    if-ne p0, v3, :cond_31

    :cond_1a
    :goto_1a
    move v0, v1

    goto :goto_52

    :cond_1c
    const/16 v4, 0x9

    if-gt v4, p1, :cond_33

    const/16 v5, 0xc

    if-gt p1, v5, :cond_33

    .line 588
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    mul-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v3

    aget-char p0, v0, p0

    sub-int/2addr p1, v4

    shr-int/2addr p0, p1

    and-int/2addr p0, v3

    if-ne p0, v3, :cond_31

    goto :goto_1a

    :cond_31
    :goto_31
    move v0, v2

    goto :goto_52

    .line 594
    :cond_33
    sget-object v4, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    mul-int/lit8 v5, p0, 0x2

    add-int/2addr v5, v3

    aget-char v3, v4, v5

    shr-int/lit8 v3, v3, 0x4

    and-int/lit8 v3, v3, 0xf

    .line 596
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-eq v3, p1, :cond_45

    goto :goto_52

    .line 600
    :cond_45
    :goto_45
    sget-object p1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->bigLeapMonthYears:[I

    array-length v3, p1

    if-ge v0, v3, :cond_1a

    .line 601
    aget p1, p1, v0

    if-ne p1, p0, :cond_4f

    goto :goto_31

    :cond_4f
    add-int/lit8 v0, v0, 0x1

    goto :goto_45

    :goto_52
    return v0
.end method

.method public static daysInGregorianMonth(II)I
    .registers 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "y",
            "m"
        }
    .end annotation

    .line 503
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInGregorianMonth:[C

    aget-char v0, v0, p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_f

    .line 504
    invoke-static {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isGregorianLeapYear(I)Z

    move-result p0

    if-eqz p0, :cond_f

    add-int/lit8 v0, v0, 0x1

    :cond_f
    return v0
.end method

.method public static getMonthLeapByYear(I)I
    .registers 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "y"
        }
    .end annotation

    add-int/lit16 p0, p0, -0x76c

    add-int/lit8 p0, p0, 0x0

    .line 564
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    mul-int/lit8 p0, p0, 0x2

    add-int/lit8 p0, p0, 0x1

    aget-char p0, v0, p0

    shr-int/lit8 p0, p0, 0x4

    and-int/lit8 p0, p0, 0xf

    neg-int p0, p0

    return p0
.end method

.method private isChineseField(I)Z
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "field"
        }
    .end annotation

    const/16 v0, 0x378

    if-eq p1, v0, :cond_9

    packed-switch p1, :pswitch_data_c

    const/4 p1, 0x0

    return p1

    :cond_9
    :pswitch_9
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_c
    .packed-switch 0x321
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch
.end method

.method private isChineseTermsField(I)Z
    .registers 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "field"
        }
    .end annotation

    const/16 v0, 0x324

    if-eq p1, v0, :cond_e

    const/16 v0, 0x325

    if-eq p1, v0, :cond_e

    const/16 v0, 0x378

    if-eq p1, v0, :cond_e

    const/4 p1, 0x0

    return p1

    :cond_e
    const/4 p1, 0x1

    return p1
.end method

.method public static isGregorianLeapYear(I)Z
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "year"
        }
    .end annotation

    .line 483
    rem-int/lit8 v0, p0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_9

    :cond_8
    move v0, v2

    .line 486
    :goto_9
    rem-int/lit8 v3, p0, 0x64

    if-nez v3, :cond_e

    goto :goto_f

    :cond_e
    move v2, v0

    .line 489
    :goto_f
    rem-int/lit16 p0, p0, 0x190

    if-nez p0, :cond_14

    goto :goto_15

    :cond_14
    move v1, v2

    :goto_15
    return v1
.end method

.method public static nextChineseMonth(II)I
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "y",
            "m"
        }
    .end annotation

    .line 619
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    if-lez p1, :cond_1a

    add-int/lit16 p0, p0, -0x76c

    add-int/lit8 p0, p0, 0x0

    .line 622
    sget-object v2, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonths:[C

    mul-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v1

    aget-char p0, v2, p0

    shr-int/lit8 p0, p0, 0x4

    and-int/lit8 p0, p0, 0xf

    if-ne p0, p1, :cond_1a

    neg-int v0, p1

    :cond_1a
    const/16 p0, 0xd

    if-ne v0, p0, :cond_1f

    goto :goto_20

    :cond_1f
    move v1, v0

    :goto_20
    return v1
.end method

.method public static principleTerm(II)I
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "y",
            "m"
        }
    .end annotation

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    const/16 v1, 0x76d

    if-lt p0, v1, :cond_3b

    const/16 v2, 0x834

    if-le p0, v2, :cond_c

    goto :goto_3b

    :cond_c
    sub-int/2addr p0, v1

    add-int/lit8 p0, p0, 0x1

    .line 540
    :goto_f
    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermYear:[[C

    add-int/lit8 v2, p1, -0x1

    aget-object v1, v1, v2

    aget-char v1, v1, v0

    if-lt p0, v1, :cond_1c

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    .line 543
    :cond_1c
    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermMap:[[C

    aget-object v1, v1, v2

    mul-int/lit8 v0, v0, 0x4

    rem-int/lit8 v2, p0, 0x4

    add-int/2addr v0, v2

    aget-char v0, v1, v0

    const/16 v1, 0xab

    const/16 v2, 0x15

    if-ne p0, v1, :cond_31

    const/4 v1, 0x3

    if-ne p1, v1, :cond_31

    move v0, v2

    :cond_31
    const/16 v1, 0xb5

    if-ne p0, v1, :cond_39

    const/4 p0, 0x5

    if-ne p1, p0, :cond_39

    goto :goto_3a

    :cond_39
    move v2, v0

    :goto_3a
    return v2

    :cond_3b
    :goto_3b
    return v0
.end method

.method public static sectionalTerm(II)I
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "y",
            "m"
        }
    .end annotation

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    const/16 v1, 0x76d

    if-lt p0, v1, :cond_40

    const/16 v2, 0x834

    if-le p0, v2, :cond_c

    goto :goto_40

    :cond_c
    sub-int/2addr p0, v1

    add-int/lit8 p0, p0, 0x1

    .line 517
    :goto_f
    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermYear:[[C

    add-int/lit8 v2, p1, -0x1

    aget-object v1, v1, v2

    aget-char v1, v1, v0

    if-lt p0, v1, :cond_1c

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    .line 520
    :cond_1c
    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermMap:[[C

    aget-object v1, v1, v2

    const/4 v2, 0x4

    mul-int/2addr v0, v2

    rem-int/lit8 v3, p0, 0x4

    add-int/2addr v0, v3

    aget-char v0, v1, v0

    const/16 v1, 0x79

    const/4 v3, 0x5

    if-ne p0, v1, :cond_2f

    if-ne p1, v2, :cond_2f

    move v0, v3

    :cond_2f
    const/16 v1, 0x84

    if-ne p0, v1, :cond_36

    if-ne p1, v2, :cond_36

    goto :goto_37

    :cond_36
    move v3, v0

    :goto_37
    const/16 v0, 0xc2

    if-ne p0, v0, :cond_3f

    const/4 p0, 0x6

    if-ne p1, p0, :cond_3f

    move v3, p0

    :cond_3f
    return v3

    :cond_40
    :goto_40
    return v0
.end method


# virtual methods
.method public add(II)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "field",
            "amount"
        }
    .end annotation

    .line 141
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeIfNeed(I)V

    .line 143
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseField(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_14

    .line 144
    invoke-super {p0, p1, p2}, Ljava/util/GregorianCalendar;->add(II)V

    .line 145
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    .line 146
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 147
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    return-void

    :cond_14
    const/4 v0, 0x1

    packed-switch p1, :pswitch_data_80

    goto :goto_6b

    .line 164
    :pswitch_19
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v2, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v2

    :goto_21
    if-ge v1, p2, :cond_6b

    .line 166
    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    add-int/2addr v3, v0

    iput v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    if-le v3, v2, :cond_43

    .line 168
    iput v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    .line 169
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v2, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->nextChineseMonth(II)I

    move-result v2

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    if-ne v2, v0, :cond_3d

    .line 171
    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr v3, v0

    iput v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 173
    :cond_3d
    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    invoke-static {v3, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v2

    :cond_43
    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :pswitch_46
    move p1, v1

    :goto_47
    if-ge p1, p2, :cond_62

    .line 157
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v2, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->nextChineseMonth(II)I

    move-result v2

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    if-ne v2, v0, :cond_5a

    .line 159
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr v2, v0

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    :cond_5a
    add-int/lit8 p1, p1, 0x1

    goto :goto_47

    .line 153
    :pswitch_5d
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr p1, p2

    iput p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 180
    :cond_62
    iput-boolean v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    .line 181
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    .line 182
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 183
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    return-void

    .line 177
    :cond_6b
    :goto_6b
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "field not supported, field : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_data_80
    .packed-switch 0x321
        :pswitch_5d
        :pswitch_46
        :pswitch_19
    .end packed-switch
.end method

.method public get(I)I
    .registers 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "field"
        }
    .end annotation

    .line 101
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeIfNeed(I)V

    .line 103
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseField(I)Z

    move-result v0

    if-nez v0, :cond_e

    .line 104
    invoke-super {p0, p1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result p1

    return p1

    :cond_e
    const/16 v0, 0x378

    const/4 v1, 0x1

    if-eq p1, v0, :cond_49

    packed-switch p1, :pswitch_data_70

    .line 136
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "field not supported, field : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :pswitch_2b
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/lit8 p1, p1, -0x4

    rem-int/lit8 p1, p1, 0xc

    :goto_31
    add-int/2addr p1, v1

    return p1

    .line 119
    :pswitch_33
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/lit8 p1, p1, -0x4

    rem-int/lit8 p1, p1, 0xa

    goto :goto_31

    .line 117
    :pswitch_3a
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTerm:I

    return p1

    .line 115
    :pswitch_3d
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTerm:I

    return p1

    .line 113
    :pswitch_40
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    return p1

    .line 111
    :pswitch_43
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    return p1

    .line 109
    :pswitch_46
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    return p1

    :cond_49
    const/4 p1, 0x5

    .line 125
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v0

    const/16 v2, 0x324

    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v3

    if-ne v0, v3, :cond_57

    goto :goto_6e

    .line 127
    :cond_57
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    const/16 v2, 0x325

    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v0

    if-ne p1, v0, :cond_64

    goto :goto_6e

    :cond_64
    const/16 v2, 0x323

    .line 129
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    if-ne p1, v1, :cond_6e

    const/16 v2, 0x322

    :cond_6e
    :goto_6e
    return v2

    nop

    :pswitch_data_70
    .packed-switch 0x321
        :pswitch_46
        :pswitch_43
        :pswitch_40
        :pswitch_3d
        :pswitch_3a
        :pswitch_33
        :pswitch_2b
        :pswitch_2b
    .end packed-switch
.end method

.method public getChinese(I)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "field"
        }
    .end annotation

    .line 226
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeIfNeed(I)V

    const/4 v0, 0x7

    if-eq p1, v0, :cond_af

    const/16 v0, 0x378

    if-eq p1, v0, :cond_a6

    const/4 v0, 0x2

    packed-switch p1, :pswitch_data_b8

    .line 253
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "field not supported, field : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 247
    :pswitch_23
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->animalNames:[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    .line 245
    :pswitch_2c
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->branchNames:[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    .line 243
    :pswitch_35
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->stemNames:[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    .line 241
    :pswitch_3e
    sget-object p1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->principleTermNames:[Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v0

    aget-object p1, p1, v0

    return-object p1

    .line 239
    :pswitch_47
    sget-object p1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->sectionalTermNames:[Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v0

    aget-object p1, p1, v0

    return-object p1

    .line 237
    :pswitch_50
    sget-object p1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDateNames:[Ljava/lang/String;

    iget v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    aget-object p1, p1, v0

    return-object p1

    .line 232
    :pswitch_57
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    const-string v0, "\u6708"

    if-lez p1, :cond_75

    .line 233
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonthNames:[Ljava/lang/String;

    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 235
    :cond_75
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "\u95f0"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonthNames:[Ljava/lang/String;

    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    neg-int v2, v2

    aget-object v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 230
    :pswitch_90
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "\u5e74"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 251
    :cond_a6
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 249
    :cond_af
    sget-object v0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseWeekNames:[Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1

    :pswitch_data_b8
    .packed-switch 0x321
        :pswitch_90
        :pswitch_57
        :pswitch_50
        :pswitch_47
        :pswitch_3e
        :pswitch_35
        :pswitch_2c
        :pswitch_23
    .end packed-switch
.end method

.method public getChineseDateString()Ljava/lang/String;
    .registers 3

    .line 274
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v1, 0x321

    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x322

    .line 275
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x323

    .line 276
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSimpleChineseDateString()Ljava/lang/String;
    .registers 6

    .line 265
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v1, 0x321

    .line 266
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "-"

    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v2, 0x322

    .line 268
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v3

    if-lez v3, :cond_31

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_45

    .line 269
    :cond_31
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "*"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 268
    :goto_45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x323

    .line 270
    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSimpleGregorianDateString()Ljava/lang/String;
    .registers 5

    .line 258
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v3, 0x2

    .line 259
    invoke-virtual {p0, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public roll(II)V
    .registers 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "field",
            "amount"
        }
    .end annotation

    .line 187
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeIfNeed(I)V

    .line 189
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseField(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_14

    .line 190
    invoke-super {p0, p1, p2}, Ljava/util/GregorianCalendar;->roll(II)V

    .line 191
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    .line 192
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 193
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    return-void

    :cond_14
    const/4 v0, 0x1

    packed-switch p1, :pswitch_data_62

    goto :goto_4d

    .line 207
    :pswitch_19
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v2, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->daysInChineseMonth(II)I

    move-result v2

    :goto_21
    if-ge v1, p2, :cond_4d

    .line 209
    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    add-int/2addr v3, v0

    iput v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    if-le v3, v2, :cond_2c

    .line 211
    iput v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    :cond_2c
    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :pswitch_2f
    move p1, v1

    :goto_30
    if-ge p1, p2, :cond_44

    .line 203
    iget v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    iget v3, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    invoke-static {v2, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->nextChineseMonth(II)I

    move-result v2

    iput v2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_30

    .line 199
    :pswitch_3f
    iget p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    add-int/2addr p1, p2

    iput p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    .line 218
    :cond_44
    iput-boolean v0, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    .line 219
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    .line 220
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 221
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    return-void

    .line 215
    :cond_4d
    :goto_4d
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "field not supported, field : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_data_62
    .packed-switch 0x321
        :pswitch_3f
        :pswitch_2f
        :pswitch_19
    .end packed-switch
.end method

.method public set(II)V
    .registers 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "field",
            "value"
        }
    .end annotation

    .line 72
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->computeIfNeed(I)V

    .line 74
    invoke-direct {p0, p1}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->isChineseField(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    packed-switch p1, :pswitch_data_3a

    .line 86
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "field not supported, field : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 83
    :pswitch_22
    iput p2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseDate:I

    goto :goto_2a

    .line 80
    :pswitch_25
    iput p2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseMonth:I

    goto :goto_2a

    .line 77
    :pswitch_28
    iput p2, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->chineseYear:I

    :goto_2a
    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    goto :goto_33

    .line 91
    :cond_2e
    invoke-super {p0, p1, p2}, Ljava/util/GregorianCalendar;->set(II)V

    .line 92
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->lastSetChinese:Z

    .line 94
    :goto_33
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areFieldsSet:Z

    .line 95
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areChineseFieldsComputed:Z

    .line 96
    iput-boolean v1, p0, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->areSolarTermsComputed:Z

    return-void

    :pswitch_data_3a
    .packed-switch 0x321
        :pswitch_28
        :pswitch_25
        :pswitch_22
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    .line 281
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 282
    invoke-virtual {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getSimpleGregorianDateString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v2, " | "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const/4 v2, 0x7

    .line 283
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v2, " | [lunar]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    .line 284
    invoke-virtual {p0}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChineseDateString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const/16 v3, 0x328

    .line 285
    invoke-virtual {p0, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v3, "year "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const/16 v3, 0x324

    .line 286
    invoke-virtual {p0, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v1

    const-string v4, "day"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    .line 287
    invoke-virtual {p0, v3}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    const/16 v2, 0x325

    .line 288
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->get(I)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    .line 289
    invoke-virtual {p0, v2}, Lcn/jianyun/workplan/ui/android/lunar/ChineseCalendar;->getChinese(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 290
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
