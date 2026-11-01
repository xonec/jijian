// [jadx java-decompile failed → smali]
// target: cn.jianyun.workplan.hilt.respo.BaseRepository
// markers: Code decompiled incorrectly, please refer to instructions dump; Method not decompiled; Method dump skipped, instruction units count
// (Java body was an anti-decompile stub; showing smali. Pass smali_fallback=false for the partial Java.)

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository (cn.jianyun.workplan.hilt.respo.BaseRepository)
.class public final Lcn/jianyun/workplan/hilt/respo/BaseRepository;
.super Ljava/lang/Object;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepository.kt\ncn/jianyun/workplan/hilt/respo/BaseRepository\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n81#2:789\n107#2,2:790\n81#2:792\n107#2,2:793\n81#2:795\n107#2,2:796\n81#2:798\n107#2,2:799\n81#2:801\n107#2,2:802\n81#2:804\n107#2,2:805\n81#2:807\n107#2,2:808\n81#2:810\n107#2,2:811\n1855#3,2:813\n1549#3:815\n1620#3,3:816\n1855#3,2:819\n1549#3:821\n1620#3,3:822\n1855#3,2:825\n*S KotlinDebug\n*F\n+ 1 BaseRepository.kt\ncn/jianyun/workplan/hilt/respo/BaseRepository\n*L\n75#1:789\n75#1:790,2\n77#1:792\n77#1:793,2\n84#1:795\n84#1:796,2\n85#1:798\n85#1:799,2\n86#1:801\n86#1:802,2\n87#1:804\n87#1:805,2\n89#1:807\n89#1:808,2\n90#1:810\n90#1:811,2\n295#1:813,2\n727#1:815\n727#1:816,3\n727#1:819,2\n759#1:821\n759#1:822,3\n764#1:825,2\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0010\t\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008/\u0008\u0007\u0018\u00002\u00020\u0001BA\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ!\u0010s\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010vJ!\u0010w\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010xJ!\u0010y\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020HH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ\'\u0010{\u001a\u00020t\"\u0004\u0008\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u0002H|H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u001a\u0010~\u001a\u00020t2\u0006\u0010\u007f\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0080\u0001J#\u0010\u0081\u0001\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0082\u0001J\u001a\u0010\u0083\u0001\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u0013\u0010\u0084\u0001\u001a\u00020tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u00020t2\u0007\u0010\u0087\u0001\u001a\u00020\u001f2\t\u0008\u0002\u0010\u0088\u0001\u001a\u00020\u0011J\u0012\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001J\u0007\u0010\u008c\u0001\u001a\u00020HJ)\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u008e\u00010M2\u0007\u0010\u008f\u0001\u001a\u00020HH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0090\u0001J\u0007\u0010\u0091\u0001\u001a\u00020HJ\u0007\u0010\u0092\u0001\u001a\u00020tJ\u0013\u0010\u0093\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J8\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0095\u0001\"\u0004\u0008\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0097\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0098\u0001J%\u0010\u0099\u0001\u001a\u00020\u001f2\u0006\u0010q\u001a\u00020\u001f2\t\u0008\u0002\u0010\u009a\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010vJ\u001a\u0010\u009b\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u001a\u0010\u009c\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u001a\u0010\u009d\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u0007\u0010\u009e\u0001\u001a\u00020\u001fJ\u0013\u0010\u009f\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0013\u0010\u00a0\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0014\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0013\u0010\u00a3\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0013\u0010\u00a4\u0001\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0012\u0010O\u001a\u00020tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J3\u0010\u00a5\u0001\u001a\u0004\u0018\u0001H|\"\u0004\u0008\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0097\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0098\u0001J\u0012\u0010U\u001a\u00020HH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0012\u0010i\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0014\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0014\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0007\u0010\u00aa\u0001\u001a\u00020\u0011J\u0013\u0010\u00ab\u0001\u001a\u00020tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u001a\u0010\u00ac\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ#\u0010\u00ac\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001f2\u0007\u0010\u009a\u0001\u001a\u00020HH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zJ\u0007\u0010\u00ad\u0001\u001a\u00020\u0011J\u0007\u0010\u00ae\u0001\u001a\u00020\u0011J\u0019\u0010\u00af\u0001\u001a\u00020\u00112\u0007\u0010\u00b0\u0001\u001a\u00020\u001f2\u0007\u0010\u00b1\u0001\u001a\u00020HJ\u0007\u0010\u00b2\u0001\u001a\u00020\u0011J\u000f\u0010\u00b2\u0001\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0007\u0010\u00b3\u0001\u001a\u00020\u0011J\u0007\u0010\u00b4\u0001\u001a\u00020\u0011J\u001b\u0010\u00b5\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a7\u00010\u0095\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u001d\u0010<\u001a\u00020t2\t\u0008\u0002\u0010\u00b6\u0001\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b7\u0001J\u001a\u0010\u00b8\u0001\u001a\u00020.2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u001c\u0010\u00b9\u0001\u001a\u00020t2\u0007\u0010A\u001a\u00030\u00a7\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ba\u0001J\u001c\u0010\u00bb\u0001\u001a\u00020t2\u0007\u0010\u00bc\u0001\u001a\u00020@H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00bd\u0001J(\u0010\u00be\u0001\u001a\u00020t2\u0013\u0010\u00bf\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110MH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c0\u0001J\u0013\u0010\u00c1\u0001\u001a\u00020tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0010\u0010\u00c2\u0001\u001a\u00020t2\u0007\u0010\u00c3\u0001\u001a\u00020\u001fJ\u0007\u0010\u00c4\u0001\u001a\u00020tJ\u001b\u0010\u00c5\u0001\u001a\u00020t2\u0007\u0010\u00c6\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u0010\u0010\u00c7\u0001\u001a\u00020t2\u0007\u0010\u00c6\u0001\u001a\u00020\u001fJ\u001b\u0010\u00c8\u0001\u001a\u00020t2\u0007\u0010\u00b0\u0001\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u0013\u0010\u00c9\u0001\u001a\u00020tH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0007\u0010\u00ca\u0001\u001a\u00020tJ\u0013\u0010\u00cb\u0001\u001a\u00020tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0007\u0010\u00cc\u0001\u001a\u00020tJ\u001d\u0010\u00cd\u0001\u001a\u00020t2\u0008\u0010\u00ce\u0001\u001a\u00030\u00a2\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00cf\u0001J\u001d\u0010\u00d0\u0001\u001a\u00020t2\u0008\u0010\u00d1\u0001\u001a\u00030\u00a9\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00d2\u0001J\u001a\u0010\u00d3\u0001\u001a\u00020\u001f2\u0006\u0010q\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010rJ\u000f\u0010b\u001a\u00020t2\u0007\u0010\u00d4\u0001\u001a\u00020\u001fJ\u0013\u0010\u00d5\u0001\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u0010\u0010\u00d6\u0001\u001a\u00020H2\u0007\u0010\u00d7\u0001\u001a\u00020\u001fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R+\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008*\u0010!\"\u0004\u0008+\u0010#R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020.8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00084\u0010-\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R+\u00105\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00088\u0010-\u001a\u0004\u00086\u0010!\"\u0004\u00087\u0010#R\u001a\u00109\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010\u0013\"\u0004\u0008;\u0010\u0015R+\u0010<\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008?\u0010-\u001a\u0004\u0008=\u0010\u0013\"\u0004\u0008>\u0010\u0015R+\u0010A\u001a\u00020@2\u0006\u0010(\u001a\u00020@8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008F\u0010-\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER\u001a\u0010G\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LRC\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110M2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110M8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008S\u0010-\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR\u001a\u0010T\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008U\u0010J\"\u0004\u0008V\u0010LR+\u0010W\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008Z\u0010-\u001a\u0004\u0008X\u0010\u0013\"\u0004\u0008Y\u0010\u0015R+\u0010[\u001a\u00020H2\u0006\u0010(\u001a\u00020H8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008^\u0010-\u001a\u0004\u0008\\\u0010J\"\u0004\u0008]\u0010LR\u001a\u0010_\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008`\u0010!\"\u0004\u0008a\u0010#R\u001c\u0010b\u001a\u0004\u0018\u00010cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008i\u0010!\"\u0004\u0008j\u0010#R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008k\u0010lR\u001a\u0010m\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008n\u0010\u0013\"\u0004\u0008o\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00d8\u0001"
    }
    d2 = {
        "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
        "",
        "datastore",
        "Landroidx/datastore/core/DataStore;",
        "Landroidx/datastore/preferences/core/Preferences;",
        "traceApi",
        "Lcn/jianyun/workplan/api/TraceApi;",
        "api",
        "Lcn/jianyun/workplan/api/BaseApi;",
        "configApi",
        "Lcn/jianyun/workplan/api/ConfigApi;",
        "webDAVUserDao",
        "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;",
        "context",
        "Landroid/content/Context;",
        "(Landroidx/datastore/core/DataStore;Lcn/jianyun/workplan/api/TraceApi;Lcn/jianyun/workplan/api/BaseApi;Lcn/jianyun/workplan/api/ConfigApi;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;Landroid/content/Context;)V",
        "adVip",
        "",
        "getAdVip",
        "()Z",
        "setAdVip",
        "(Z)V",
        "getApi",
        "()Lcn/jianyun/workplan/api/BaseApi;",
        "appTipInfo",
        "Lcn/jianyun/workplan/api/dto/AppTipInfo;",
        "getAppTipInfo",
        "()Lcn/jianyun/workplan/api/dto/AppTipInfo;",
        "setAppTipInfo",
        "(Lcn/jianyun/workplan/api/dto/AppTipInfo;)V",
        "brand",
        "",
        "getBrand",
        "()Ljava/lang/String;",
        "setBrand",
        "(Ljava/lang/String;)V",
        "getConfigApi",
        "()Lcn/jianyun/workplan/api/ConfigApi;",
        "getContext",
        "()Landroid/content/Context;",
        "<set-?>",
        "currentPage",
        "getCurrentPage",
        "setCurrentPage",
        "currentPage$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "finishTime",
        "getFinishTime",
        "()J",
        "setFinishTime",
        "(J)V",
        "finishTime$delegate",
        "focusId",
        "getFocusId",
        "setFocusId",
        "focusId$delegate",
        "inited",
        "getInited",
        "setInited",
        "loading",
        "getLoading",
        "setLoading",
        "loading$delegate",
        "Lcn/jianyun/workplan/main/setting/user/User;",
        "loginUser",
        "getLoginUser",
        "()Lcn/jianyun/workplan/main/setting/user/User;",
        "setLoginUser",
        "(Lcn/jianyun/workplan/main/setting/user/User;)V",
        "loginUser$delegate",
        "minVipDay",
        "",
        "getMinVipDay",
        "()I",
        "setMinVipDay",
        "(I)V",
        "",
        "notifyStatus",
        "getNotifyStatus",
        "()Ljava/util/Map;",
        "setNotifyStatus",
        "(Ljava/util/Map;)V",
        "notifyStatus$delegate",
        "registDay",
        "getRegistDay",
        "setRegistDay",
        "showTip",
        "getShowTip",
        "setShowTip",
        "showTip$delegate",
        "sid",
        "getSid",
        "setSid",
        "sid$delegate",
        "sp",
        "getSp",
        "setSp",
        "toast",
        "Landroid/widget/Toast;",
        "getToast",
        "()Landroid/widget/Toast;",
        "setToast",
        "(Landroid/widget/Toast;)V",
        "uid",
        "getUid",
        "setUid",
        "getWebDAVUserDao",
        "()Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;",
        "wx",
        "getWx",
        "setWx",
        "booleanCache",
        "key",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cache",
        "",
        "value",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheBoolean",
        "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheInt",
        "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheJsonValue",
        "T",
        "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheLocalRegistTime",
        "time",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheLong",
        "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cacheNow",
        "cleanOldAlarms",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "copyData",
        "data",
        "showMsg",
        "enhanceTraceInfo",
        "Lcn/jianyun/workplan/api/TraceInfo;",
        "traceInfo",
        "fetchAdsValue",
        "fetchHoliday",
        "Lcn/jianyun/workplan/api/FestivalData;",
        "year",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchRecoverAdsValue",
        "finish",
        "getAppTheme",
        "getArrayCache",
        "",
        "cls",
        "Ljava/lang/Class;",
        "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCache",
        "defaultValue",
        "getCacheDay",
        "getCacheHour",
        "getCacheMinute",
        "getCurrentVersion",
        "getDid",
        "getLatestVersion",
        "getLocalBackupConfig",
        "Lcn/jianyun/workplan/model/LocalBackupConfig;",
        "getLocalPath",
        "getLocalRegistTime",
        "getObjectCache",
        "getWebDAVUser",
        "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
        "getWidgetConfig",
        "Lcn/jianyun/workplan/widget/WidgetConfig;",
        "hasRegist",
        "initApp",
        "intCache",
        "isAdVip",
        "isLogin",
        "isNeedReload",
        "page",
        "oldSid",
        "isNetworkAvailable",
        "isRealVip",
        "isVip",
        "listWebDAVUser",
        "delay",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "longCache",
        "makeJgyUser",
        "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeLogin",
        "uu",
        "(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeNotifyStatus",
        "map",
        "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeRegist",
        "openUrl",
        "url",
        "playTap",
        "postEvent",
        "event",
        "postEvent2",
        "postPage",
        "prepareRefreshWidgetData",
        "reload",
        "reloadAppData",
        "reloadWidget",
        "setLocalBackupConfig",
        "config",
        "(Lcn/jianyun/workplan/model/LocalBackupConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setWidgetConfig",
        "widgetConfig",
        "(Lcn/jianyun/workplan/widget/WidgetConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "timeCache",
        "msg",
        "tryUpgrade",
        "weightedRandom",
        "ratio",
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
.field private adVip:Z

.field private final api:Lcn/jianyun/workplan/api/BaseApi;

.field private appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

.field private brand:Ljava/lang/String;

.field private final configApi:Lcn/jianyun/workplan/api/ConfigApi;

.field private final context:Landroid/content/Context;

.field private final currentPage$delegate:Landroidx/compose/runtime/MutableState;

.field private final datastore:Landroidx/datastore/core/DataStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/core/DataStore<",
            "Landroidx/datastore/preferences/core/Preferences;",
            ">;"
        }
    .end annotation
.end field

.field private final finishTime$delegate:Landroidx/compose/runtime/MutableState;

.field private final focusId$delegate:Landroidx/compose/runtime/MutableState;

.field private inited:Z

.field private final loading$delegate:Landroidx/compose/runtime/MutableState;

.field private final loginUser$delegate:Landroidx/compose/runtime/MutableState;

.field private minVipDay:I

.field private final notifyStatus$delegate:Landroidx/compose/runtime/MutableState;

.field private registDay:I

.field private final showTip$delegate:Landroidx/compose/runtime/MutableState;

.field private final sid$delegate:Landroidx/compose/runtime/MutableState;

.field private sp:Ljava/lang/String;

.field private toast:Landroid/widget/Toast;

.field private final traceApi:Lcn/jianyun/workplan/api/TraceApi;

.field private uid:Ljava/lang/String;

.field private final webDAVUserDao:Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;

.field private wx:Z


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Lcn/jianyun/workplan/api/TraceApi;Lcn/jianyun/workplan/api/BaseApi;Lcn/jianyun/workplan/api/ConfigApi;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;Landroid/content/Context;)V
    .registers 54
    .param p1    # Landroidx/datastore/core/DataStore;
        .annotation runtime Ljavax/inject/Named;
            value = "app"
        .end annotation
    .end param
    .param p6    # Landroid/content/Context;
        .annotation runtime Ldagger/hilt/android/qualifiers/ApplicationContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/core/DataStore<",
            "Landroidx/datastore/preferences/core/Preferences;",
            ">;",
            "Lcn/jianyun/workplan/api/TraceApi;",
            "Lcn/jianyun/workplan/api/BaseApi;",
            "Lcn/jianyun/workplan/api/ConfigApi;",
            "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "datastore"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "traceApi"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "api"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "configApi"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "webDAVUserDao"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "context"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    .line 67
    iput-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->traceApi:Lcn/jianyun/workplan/api/TraceApi;

    .line 68
    iput-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->api:Lcn/jianyun/workplan/api/BaseApi;

    .line 69
    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->configApi:Lcn/jianyun/workplan/api/ConfigApi;

    .line 70
    iput-object v5, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->webDAVUserDao:Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;

    .line 71
    iput-object v6, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 75
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->currentPage$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    .line 84
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 77
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sid$delegate:Landroidx/compose/runtime/MutableState;

    .line 80
    iput-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sp:Ljava/lang/String;

    const/4 v4, 0x5

    .line 81
    iput v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->minVipDay:I

    .line 84
    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->showTip$delegate:Landroidx/compose/runtime/MutableState;

    .line 85
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->focusId$delegate:Landroidx/compose/runtime/MutableState;

    .line 86
    invoke-static {v5, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$delegate:Landroidx/compose/runtime/MutableState;

    const-wide/16 v4, 0x0

    .line 87
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finishTime$delegate:Landroidx/compose/runtime/MutableState;

    .line 88
    iput-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->brand:Ljava/lang/String;

    .line 89
    new-instance v4, Lcn/jianyun/workplan/main/setting/user/User;

    move-object v5, v4

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

    const-wide/16 v24, 0x0

    const v26, 0x7ffff

    const/16 v27, 0x0

    invoke-direct/range {v5 .. v27}, Lcn/jianyun/workplan/main/setting/user/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loginUser$delegate:Landroidx/compose/runtime/MutableState;

    .line 90
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    iput-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->notifyStatus$delegate:Landroidx/compose/runtime/MutableState;

    .line 91
    new-instance v3, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-object v4, v3

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, -0x1

    const/16 v45, 0x3f

    const/16 v46, 0x0

    invoke-direct/range {v4 .. v46}, Lcn/jianyun/workplan/api/dto/AppTipInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIILjava/lang/String;IIZZIIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZLjava/lang/String;Ljava/lang/String;ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    .line 92
    iput-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    const-string v1, "qz init base repository"

    const-string v3, "base repository"

    .line 147
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;

    invoke-direct {v1, v0, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x1

    invoke-static {v2, v1, v3, v2}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 156
    sget-object v3, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    const/4 v4, 0x0

    new-instance v6, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;

    invoke-direct {v6, v0, v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    move-object v1, v6

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x3

    const/4 v6, 0x0

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v1

    move/from16 p5, v2

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getTraceApi$p(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)Lcn/jianyun/workplan/api/TraceApi;
    .registers 1

    .line 64
    iget-object p0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->traceApi:Lcn/jianyun/workplan/api/TraceApi;

    return-object p0
.end method

.method public static synthetic copyData$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;ZILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    .line 322
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->copyData(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic getCache$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_6

    const-string p2, ""

    .line 352
    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic loading$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 5

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_5

    move p1, p4

    .line 132
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final booleanCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 479
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_40

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 480
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    const-string p2, "false"

    invoke-virtual {p0, p1, p2, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_40

    return-object v1

    .line 479
    :cond_40
    :goto_40
    check-cast p2, Ljava/lang/String;

    .line 482
    :try_start_42
    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_4a} :catch_4b

    return-object p1

    :catch_4b
    const/4 p1, 0x0

    .line 485
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_15

    return-object p1

    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheBoolean(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 474
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;-><init>(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_15

    return-object p1

    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheInt(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 357
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;-><init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_15

    return-object p1

    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 490
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "toJSONString(value)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_14

    return-object p1

    :cond_14
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheLocalRegistTime(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_9

    .line 556
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    const-string v0, "localRegistTime"

    .line 558
    invoke-virtual {p0, v0, p1, p2, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheLong(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_16

    return-object p1

    :cond_16
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheLong(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 423
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p3, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;-><init>(Ljava/lang/String;JLkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p4}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_15

    return-object p1

    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cacheNow(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
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

    .line 429
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    new-instance v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_15

    return-object p1

    :cond_15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final cleanOldAlarms(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 11
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    move-object v4, v0

    iget-object p1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 723
    iget v1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3b

    if-ne v1, v2, :cond_33

    iget-object v0, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->L$1:Ljava/lang/Object;

    check-cast v0, Landroid/app/AlarmManager;

    iget-object v1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_62

    :cond_33
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3b
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 724
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-class v1, Landroid/app/AlarmManager;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/AlarmManager;

    const-string v3, "alarmIds"

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    .line 725
    iput-object p0, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->L$0:Ljava/lang/Object;

    iput-object p1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->L$1:Ljava/lang/Object;

    iput v2, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    move-object v1, p0

    move-object v2, v3

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    invoke-static/range {v1 .. v6}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5f

    return-object v0

    :cond_5f
    move-object v0, p1

    move-object p1, v1

    move-object v1, p0

    .line 723
    :goto_62
    check-cast p1, Ljava/lang/String;

    const-string v2, ""

    .line 726
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_db

    .line 727
    move-object v3, p1

    check-cast v3, Ljava/lang/CharSequence;

    const-string p1, ","

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 815
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 816
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_90
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 817
    check-cast v3, Ljava/lang/String;

    .line 727
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v3

    .line 817
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_90

    .line 818
    :cond_a8
    check-cast v2, Ljava/util/List;

    .line 815
    check-cast v2, Ljava/lang/Iterable;

    .line 819
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_b0
    :goto_b0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_db

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .line 728
    new-instance v4, Landroid/content/Intent;

    iget-object v5, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-class v6, Lcn/jianyun/workplan/main/receiver/AlarmWidgetReceiver;

    invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 731
    :try_start_c9
    iget-object v5, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const v6, 0x186a0

    int-to-long v6, v6

    .line 732
    div-long/2addr v2, v6

    long-to-int v2, v2

    const/high16 v3, 0xc000000

    .line 730
    invoke-static {v5, v2, v4, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 736
    invoke-virtual {v0, v2}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_da
    .catch Ljava/lang/Exception; {:try_start_c9 .. :try_end_da} :catch_b0

    goto :goto_b0

    .line 743
    :cond_db
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final copyData(Ljava/lang/String;Z)V
    .registers 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v1, "text"

    .line 324
    check-cast v1, Ljava/lang/CharSequence;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    if-eqz p2, :cond_28

    const-string p1, "\u590d\u5236\u6210\u529f"

    .line 326
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast(Ljava/lang/String;)V

    :cond_28
    return-void
.end method

.method public final enhanceTraceInfo(Lcn/jianyun/workplan/api/TraceInfo;)Lcn/jianyun/workplan/api/TraceInfo;
    .registers 7

    const-string v0, "traceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 629
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1a

    const/4 v0, 0x1

    goto :goto_1b

    :cond_1a
    move v0, v2

    :goto_1b
    const-string v1, "1"

    const-string v3, "0"

    .line 634
    invoke-static {v0, v1, v3}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v4, "dark"

    invoke-virtual {p1, v4, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v4, "BRAND"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "brand"

    invoke-virtual {p1, v4, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "platform"

    const-string v4, "vivo"

    .line 643
    invoke-virtual {p1, v0, v4}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v4, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v2, "context.packageManager.g\u2026ckageName, 0).versionName"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "appVersion"

    invoke-virtual {p1, v2, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/main/setting/user/User;->getRegistDay()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "registerDay"

    invoke-virtual {p1, v2, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/main/setting/user/User;->isVip()Z

    move-result v0

    invoke-static {v0, v1, v3}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "vip"

    invoke-virtual {p1, v1, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sysVersion"

    invoke-virtual {p1, v1, v0}, Lcn/jianyun/workplan/api/TraceInfo;->addField(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fetchAdsValue()I
    .registers 2

    .line 374
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v0}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getAdsValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->weightedRandom(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcn/jianyun/workplan/api/FestivalData;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 283
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    const/4 v3, 0x0

    const-string v4, "lastYear"

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-string v8, "hyear"

    if-eqz v2, :cond_5b

    if-eq v2, v7, :cond_4d

    if-eq v2, v6, :cond_42

    if-ne v2, v5, :cond_3a

    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    :try_start_35
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_38} :catch_126

    goto/16 :goto_123

    :cond_3a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_42
    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->I$0:I

    iget-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    :try_start_48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4b
    .catch Ljava/lang/Exception; {:try_start_48 .. :try_end_4b} :catch_126

    goto/16 :goto_c1

    :cond_4d
    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->I$0:I

    iget-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    iget-object v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    :try_start_57
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5a
    .catch Ljava/lang/Exception; {:try_start_57 .. :try_end_5a} :catch_126

    goto :goto_92

    :cond_5b
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const-string p2, "start fetch festival data"

    .line 284
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    .line 287
    :try_start_67
    iget-object p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-wide/16 v9, 0x0

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p2, v4, v2}, Lcn/jianyun/workplan/util/CacheUtil;->getLong(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v2

    .line 288
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-class v9, Lcn/jianyun/workplan/api/FestivalData;

    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$1:Ljava/lang/Object;

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->I$0:I

    iput v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    invoke-virtual {p0, p2, v9, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getArrayCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_91

    return-object v1

    :cond_91
    move-object v7, p0

    .line 283
    :goto_92
    check-cast p2, Ljava/util/List;

    .line 289
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_af

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const-string v11, "lstTime"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    sub-long/2addr v9, v11

    const-wide/32 v11, 0x19bfcc00

    cmp-long v2, v9, v11

    if-lez v2, :cond_d7

    .line 290
    :cond_af
    iget-object p2, v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->api:Lcn/jianyun/workplan/api/BaseApi;

    iput-object v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$1:Ljava/lang/Object;

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->I$0:I

    iput v6, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    invoke-interface {p2, p1, v0}, Lcn/jianyun/workplan/api/BaseApi;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_c0

    return-object v1

    :cond_c0
    move-object v2, v7

    .line 283
    :goto_c1
    check-cast p2, Lcn/jianyun/workplan/api/ApiResult;

    .line 291
    invoke-virtual {p2}, Lcn/jianyun/workplan/api/ApiResult;->fetchResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 292
    iget-object v6, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v9, v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v6, v4, v7}, Lcn/jianyun/workplan/util/CacheUtil;->setLong(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;)V

    move-object v7, v2

    .line 294
    :cond_d7
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v4, Ljava/util/Map;

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 295
    move-object v4, p2

    check-cast v4, Ljava/lang/Iterable;

    .line 813
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_ec
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_104

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcn/jianyun/workplan/api/FestivalData;

    .line 296
    iget-object v9, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    invoke-virtual {v6}, Lcn/jianyun/workplan/api/FestivalData;->getDate()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_ec

    .line 298
    :cond_104
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    invoke-virtual {v7, p1, p2, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_122

    return-object v1

    :cond_122
    move-object p1, v2

    .line 300
    :goto_123
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
    :try_end_125
    .catch Ljava/lang/Exception; {:try_start_67 .. :try_end_125} :catch_126

    return-object p1

    .line 303
    :catch_126
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final fetchRecoverAdsValue()I
    .registers 2

    .line 378
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v0}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getRecoverAdsValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->weightedRandom(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final finish()V
    .registers 5

    .line 217
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getFinishTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_10

    const/4 v0, 0x0

    .line 218
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoading(Z)V

    :cond_10
    return-void
.end method

.method public final getAdVip()Z
    .registers 2

    .line 78
    iget-boolean v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->adVip:Z

    return v0
.end method

.method public final getApi()Lcn/jianyun/workplan/api/BaseApi;
    .registers 2

    .line 68
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->api:Lcn/jianyun/workplan/api/BaseApi;

    return-object v0
.end method

.method public final getAppTheme(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
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

    const-string v0, "appMode"

    const-string v1, "auto"

    .line 594
    invoke-virtual {p0, v0, v1, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;
    .registers 2

    .line 91
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    return-object v0
.end method

.method public final getArrayCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;

    invoke-direct {v0, p0, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 503
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->L$0:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/Class;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_47

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_37
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 504
    iput-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    const-string p3, "{}"

    invoke-virtual {p0, p1, p3, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_47

    return-object v1

    .line 503
    :cond_47
    :goto_47
    check-cast p3, Ljava/lang/String;

    .line 506
    :try_start_49
    invoke-static {p3, p2}, Lcom/alibaba/fastjson2/JSON;->parseArray(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    const-string p2, "parseArray(value, cls)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_52} :catch_53

    return-object p1

    .line 509
    :catch_53
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getBrand()Ljava/lang/String;
    .registers 2

    .line 88
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 353
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->datastore:Landroidx/datastore/core/DataStore;

    invoke-static {v0, p1, p2, p3}, Lcn/jianyun/workplan/util/CommonToolKt;->getStringValue(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getCacheDay(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 458
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 459
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_3e
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_50

    const/4 p1, 0x0

    .line 461
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 463
    :cond_50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const/16 p1, 0x3e8

    int-to-long p1, p1

    .line 464
    div-long/2addr v0, p1

    const/16 p1, 0xe10

    int-to-long p1, p1

    div-long/2addr v0, p1

    const/16 p1, 0x18

    int-to-long p1, p1

    div-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final getCacheHour(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 452
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 453
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_3e
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    .line 454
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const/16 p1, 0x3e8

    int-to-long p1, p1

    .line 455
    div-long/2addr v0, p1

    const/16 p1, 0xe10

    int-to-long p1, p1

    div-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final getCacheMinute(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 467
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 468
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_3e
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    .line 469
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const/16 p1, 0x3e8

    int-to-long p1, p1

    .line 470
    div-long/2addr v0, p1

    const/16 p1, 0x3c

    int-to-long p1, p1

    div-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final getConfigApi()Lcn/jianyun/workplan/api/ConfigApi;
    .registers 2

    .line 69
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->configApi:Lcn/jianyun/workplan/api/ConfigApi;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .registers 2

    .line 71
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getCurrentPage()Ljava/lang/String;
    .registers 2

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->currentPage$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 789
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentVersion()Ljava/lang/String;
    .registers 4

    .line 276
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v0, :cond_17

    const-string v0, "1.0.0"

    :cond_17
    return-object v0
.end method

.method public final getDid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 11
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 266
    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    const/4 v8, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_41

    if-eq v1, v2, :cond_39

    if-ne v1, v8, :cond_31

    iget-object v0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_76

    :cond_31
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_39
    iget-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_58

    :cond_41
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const-string p1, "did"

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 267
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    move-object v1, p0

    move-object v2, p1

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache$default(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_57

    return-object v7

    :cond_57
    move-object v1, p0

    .line 266
    :goto_58
    check-cast p1, Ljava/lang/String;

    const-string v2, ""

    .line 268
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_77

    .line 269
    sget-object p1, Lcn/jianyun/workplan/util/MyPhoneTool;->INSTANCE:Lcn/jianyun/workplan/util/MyPhoneTool;

    invoke-virtual {p1}, Lcn/jianyun/workplan/util/MyPhoneTool;->getDid()Ljava/lang/String;

    move-result-object p1

    .line 270
    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->L$0:Ljava/lang/Object;

    iput v8, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    const-string v2, "did"

    invoke-virtual {v1, v2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_75

    return-object v7

    :cond_75
    move-object v0, p1

    :goto_76
    move-object p1, v0

    :cond_77
    return-object p1
.end method

.method public final getFinishTime()J
    .registers 3

    .line 87
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finishTime$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 804
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getFocusId()Ljava/lang/String;
    .registers 2

    .line 85
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->focusId$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 798
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getInited()Z
    .registers 2

    .line 83
    iget-boolean v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->inited:Z

    return v0
.end method

.method public final getLatestVersion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 660
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_46

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 661
    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$version$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$version$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    invoke-static {p1, v0}, Lcn/jianyun/workplan/util/CommonToolKt;->withApi(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_46

    return-object v1

    .line 660
    :cond_46
    :goto_46
    check-cast p1, Lcn/jianyun/workplan/api/ApiResult;

    .line 664
    invoke-virtual {p1}, Lcn/jianyun/workplan/api/ApiResult;->getSuccess()Z

    move-result v0

    const-string v1, "1.0.0"

    if-eqz v0, :cond_5a

    .line 665
    invoke-virtual {p1}, Lcn/jianyun/workplan/api/ApiResult;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_59

    goto :goto_5a

    :cond_59
    move-object v1, p1

    :cond_5a
    :goto_5a
    return-object v1
.end method

.method public final getLoading()Z
    .registers 2

    .line 86
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 801
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getLocalBackupConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/model/LocalBackupConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 585
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_42

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 586
    const-class p1, Lcn/jianyun/workplan/model/LocalBackupConfig;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    const-string v2, "localBackup"

    invoke-virtual {p0, v2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_42

    return-object v1

    :cond_42
    :goto_42
    check-cast p1, Lcn/jianyun/workplan/model/LocalBackupConfig;

    if-nez p1, :cond_51

    new-instance p1, Lcn/jianyun/workplan/model/LocalBackupConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcn/jianyun/workplan/model/LocalBackupConfig;-><init>(Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_51
    return-object p1
.end method

.method public final getLocalPath(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 582
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 583
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalBackupConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_3e
    check-cast p1, Lcn/jianyun/workplan/model/LocalBackupConfig;

    invoke-virtual {p1}, Lcn/jianyun/workplan/model/LocalBackupConfig;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getLocalRegistTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 543
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object v0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_47

    :cond_2e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 544
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    const-string p1, "localRegistTime"

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_46

    return-object v1

    :cond_46
    move-object v0, p0

    :goto_47
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_58

    .line 546
    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 548
    :cond_58
    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/main/setting/user/User;->getGmtCreate()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7f

    .line 549
    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/main/setting/user/User;->getGmtCreate()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/MyDateTool;->parseDateTimeString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_7a

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    :cond_7a
    invoke-static {v3, v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 551
    :cond_7f
    invoke-static {v3, v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;
    .registers 2

    .line 89
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loginUser$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 807
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/jianyun/workplan/main/setting/user/User;

    return-object v0
.end method

.method public final getMinVipDay()I
    .registers 2

    .line 81
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->minVipDay:I

    return v0
.end method

.method public final getNotifyStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 573
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object v0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_49

    :cond_2e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 574
    const-class p1, Ljava/util/Map;

    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    const-string v2, "notifyStatus"

    invoke-virtual {p0, v2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_48

    return-object v1

    :cond_48
    move-object v0, p0

    :goto_49
    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_51

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_51
    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setNotifyStatus(Ljava/util/Map;)V

    .line 575
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getNotifyStatus()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->notifyStatus$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 810
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;

    invoke-direct {v0, p0, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 493
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->L$0:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/Class;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_47

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_37
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 494
    iput-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    const-string p3, "{}"

    invoke-virtual {p0, p1, p3, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_47

    return-object v1

    .line 493
    :cond_47
    :goto_47
    check-cast p3, Ljava/lang/String;

    .line 496
    :try_start_49
    invoke-static {p3, p2}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_4d} :catch_4e

    return-object p1

    :catch_4e
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getRegistDay()I
    .registers 2

    .line 82
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->registDay:I

    return v0
.end method

.method public final getRegistDay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 654
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object v0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_45

    :cond_2e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 655
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_44

    return-object v1

    :cond_44
    move-object v0, p0

    .line 656
    :goto_45
    invoke-virtual {v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object p1

    invoke-virtual {p1}, Lcn/jianyun/workplan/main/setting/user/User;->getRegistDay()I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final getShowTip()Z
    .registers 2

    .line 84
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->showTip$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 795
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getSid()I
    .registers 2

    .line 77
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sid$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 792
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final getSp()Ljava/lang/String;
    .registers 2

    .line 80
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sp:Ljava/lang/String;

    return-object v0
.end method

.method public final getToast()Landroid/widget/Toast;
    .registers 2

    .line 76
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast:Landroid/widget/Toast;

    return-object v0
.end method

.method public final getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 38
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;

    iget v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 222
    iget v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    const-string v5, "localRegistTime"

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_62

    if-eq v4, v8, :cond_5a

    if-eq v4, v7, :cond_49

    if-ne v4, v6, :cond_41

    iget-wide v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->J$0:J

    iget-object v5, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcn/jianyun/workplan/main/setting/user/User;

    iget-object v2, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e6

    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_49
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/main/setting/user/User;

    iget-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v35, v7

    move-object v7, v4

    move-object/from16 v4, v35

    goto :goto_8b

    :cond_5a
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_75

    :cond_62
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 223
    const-class v1, Lcn/jianyun/workplan/main/setting/user/User;

    iput-object v0, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    iput v8, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    const-string v4, "uu"

    invoke-virtual {v0, v4, v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_74

    return-object v3

    :cond_74
    move-object v4, v0

    .line 222
    :goto_75
    check-cast v1, Lcn/jianyun/workplan/main/setting/user/User;

    if-eqz v1, :cond_f0

    .line 225
    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    invoke-virtual {v4, v5, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_86

    return-object v3

    :cond_86
    move-object/from16 v35, v7

    move-object v7, v1

    move-object/from16 v1, v35

    :goto_8b
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .line 226
    invoke-virtual {v7}, Lcn/jianyun/workplan/main/setting/user/User;->getRegistTime()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v1, v10, v12

    if-lez v1, :cond_a0

    .line 227
    invoke-virtual {v7}, Lcn/jianyun/workplan/main/setting/user/User;->getRegistTime()J

    move-result-wide v10

    goto :goto_bc

    .line 228
    :cond_a0
    invoke-virtual {v7}, Lcn/jianyun/workplan/main/setting/user/User;->getGmtCreate()Ljava/lang/String;

    move-result-object v1

    const-string v10, ""

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_bb

    .line 229
    invoke-virtual {v7}, Lcn/jianyun/workplan/main/setting/user/User;->getGmtCreate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcn/jianyun/workplan/util/MyDateTool;->parseDateTimeString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_bb

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    goto :goto_bc

    :cond_bb
    move-wide v10, v12

    :goto_bc
    cmp-long v1, v8, v12

    if-lez v1, :cond_c9

    cmp-long v14, v10, v12

    if-lez v14, :cond_c9

    .line 234
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    goto :goto_cc

    :cond_c9
    if-lez v1, :cond_cc

    move-wide v10, v8

    :cond_cc
    :goto_cc
    cmp-long v1, v10, v12

    if-lez v1, :cond_e9

    cmp-long v1, v10, v8

    if-eqz v1, :cond_e9

    .line 239
    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->L$1:Ljava/lang/Object;

    iput-wide v10, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->J$0:J

    iput v6, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    invoke-virtual {v4, v5, v10, v11, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheLong(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e3

    return-object v3

    :cond_e3
    move-object v2, v4

    move-object v5, v7

    move-wide v3, v10

    :goto_e6
    move-wide v10, v3

    move-object v7, v5

    move-object v4, v2

    .line 241
    :cond_e9
    invoke-virtual {v7, v10, v11}, Lcn/jianyun/workplan/main/setting/user/User;->setRegistTime(J)V

    .line 242
    invoke-virtual {v4, v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoginUser(Lcn/jianyun/workplan/main/setting/user/User;)V

    goto :goto_121

    .line 245
    :cond_f0
    new-instance v1, Lcn/jianyun/workplan/main/setting/user/User;

    move-object v12, v1

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

    const-wide/16 v31, 0x0

    const v33, 0x7ffff

    const/16 v34, 0x0

    invoke-direct/range {v12 .. v34}, Lcn/jianyun/workplan/main/setting/user/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoginUser(Lcn/jianyun/workplan/main/setting/user/User;)V

    .line 247
    :goto_121
    invoke-virtual {v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v1

    invoke-virtual {v1}, Lcn/jianyun/workplan/main/setting/user/User;->getUuid()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public final getUid()Ljava/lang/String;
    .registers 2

    .line 92
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebDAVUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 566
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->webDAVUserDao:Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;

    invoke-interface {v0, p1}, Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;->getMasterOne(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getWebDAVUserDao()Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;
    .registers 2

    .line 70
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->webDAVUserDao:Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;

    return-object v0
.end method

.method public final getWidgetConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/widget/WidgetConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;

    iget v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 706
    iget v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_36

    if-ne v4, v5, :cond_2e

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_46

    :cond_2e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_36
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 707
    const-class v1, Lcn/jianyun/workplan/widget/WidgetConfig;

    iput v5, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    const-string v4, "widgetConfig"

    invoke-virtual {v0, v4, v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_46

    return-object v3

    :cond_46
    :goto_46
    check-cast v1, Lcn/jianyun/workplan/widget/WidgetConfig;

    if-nez v1, :cond_78

    new-instance v1, Lcn/jianyun/workplan/widget/WidgetConfig;

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const v27, 0xffffff

    const/16 v28, 0x0

    invoke-direct/range {v2 .. v28}, Lcn/jianyun/workplan/widget/WidgetConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_78
    return-object v1
.end method

.method public final getWx()Z
    .registers 2

    .line 79
    iget-boolean v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->wx:Z

    return v0
.end method

.method public final hasRegist()Z
    .registers 4

    .line 104
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final initApp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 55
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

    instance-of v2, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;

    iget v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 203
    iget v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_70

    if-eq v4, v9, :cond_68

    if-eq v4, v8, :cond_60

    if-eq v4, v7, :cond_54

    if-eq v4, v6, :cond_4b

    if-ne v4, v5, :cond_43

    iget-object v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v2, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_d8

    :cond_43
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4b
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c5

    :cond_54
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_ae

    :cond_60
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_a0

    :cond_68
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_95

    :cond_70
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 204
    iget-boolean v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->inited:Z

    if-eqz v1, :cond_7a

    .line 205
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 207
    :cond_7a
    iget-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-string v4, "brand"

    invoke-static {v1, v4}, Lcn/jianyun/workplan/util/CacheUtil;->get(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "get(context, \"brand\")"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->brand:Ljava/lang/String;

    .line 208
    iput-object v0, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    iput v9, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    invoke-virtual {v0, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_94

    return-object v3

    :cond_94
    move-object v4, v0

    .line 209
    :goto_95
    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    iput v8, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    invoke-virtual {v4, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getDid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a0

    return-object v3

    .line 210
    :cond_a0
    :goto_a0
    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    invoke-virtual {v4, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getRegistDay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_ad

    return-object v3

    :cond_ad
    move-object v7, v4

    :goto_ae
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iput v1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->registDay:I

    .line 211
    iput-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    invoke-virtual {v7, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getNotifyStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_c4

    return-object v3

    :cond_c4
    move-object v4, v7

    .line 212
    :goto_c5
    const-class v1, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    const-string v5, "appTipConfig"

    invoke-virtual {v4, v5, v1, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d6

    return-object v3

    :cond_d6
    move-object v2, v4

    move-object v3, v2

    :goto_d8
    check-cast v1, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    if-nez v1, :cond_12f

    new-instance v1, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-object v10, v1

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

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    const/16 v51, 0x3f

    const/16 v52, 0x0

    invoke-direct/range {v10 .. v52}, Lcn/jianyun/workplan/api/dto/AppTipInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIILjava/lang/String;IIZZIIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZLjava/lang/String;Ljava/lang/String;ZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_12f
    iput-object v1, v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    .line 213
    iput-boolean v9, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->inited:Z

    .line 214
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final intCache(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;

    if-eqz v0, :cond_14

    move-object v0, p3

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;

    invoke-direct {v0, p0, p3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 362
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_42

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 363
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    invoke-virtual {p0, p1, p2, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_42

    return-object v1

    .line 362
    :cond_42
    :goto_42
    check-cast p3, Ljava/lang/String;

    .line 365
    :try_start_44
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_4c
    .catch Ljava/lang/Exception; {:try_start_44 .. :try_end_4c} :catch_4d

    return-object p1

    :catch_4d
    const/4 p1, 0x0

    .line 368
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final intCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 419
    invoke-virtual {p0, p1, v0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->intCache(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isAdVip()Z
    .registers 6

    .line 114
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->minVipDay:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x5

    if-ge v0, v3, :cond_9

    move v0, v1

    goto :goto_a

    :cond_9
    move v0, v2

    :goto_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->minVipDay:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 115
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v3

    invoke-virtual {v3}, Lcn/jianyun/workplan/main/setting/user/User;->getVipDate()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_45

    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v3

    invoke-virtual {v3}, Lcn/jianyun/workplan/main/setting/user/User;->getVipDate()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-static {v4}, Lcn/jianyun/workplan/util/CommonDateToolKt;->dateStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_4b

    :cond_45
    iget v3, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->registDay:I

    if-ge v3, v0, :cond_4a

    goto :goto_4b

    :cond_4a
    move v1, v2

    :cond_4b
    :goto_4b
    return v1
.end method

.method public final isLogin()Z
    .registers 3

    .line 96
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/main/setting/user/User;->getUuid()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/main/setting/user/User;->getUsername()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    const/4 v0, 0x1

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    return v0
.end method

.method public final isNeedReload(Ljava/lang/String;I)Z
    .registers 4

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result p1

    if-eq p2, p1, :cond_d

    const/4 p1, 0x1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    return p1
.end method

.method public final isNetworkAvailable()Z
    .registers 4

    const/4 v0, 0x1

    .line 673
    :try_start_1
    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 674
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_14} :catch_18

    if-eqz v1, :cond_17

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :catch_18
    :goto_18
    return v0
.end method

.method public final isNetworkAvailable(Landroid/content/Context;)Z
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivity"

    .line 514
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 516
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1a

    return v1

    .line 517
    :cond_1a
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1

    if-nez p1, :cond_21

    return v1

    :cond_21
    const/4 v0, 0x1

    .line 519
    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_2a

    :goto_28
    move v1, v0

    goto :goto_41

    .line 520
    :cond_2a
    invoke-virtual {p1, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_31

    goto :goto_28

    :cond_31
    const/4 v2, 0x3

    .line 522
    invoke-virtual {p1, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_39

    goto :goto_28

    :cond_39
    const/4 v2, 0x2

    .line 524
    invoke-virtual {p1, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_41

    goto :goto_28

    :cond_41
    :goto_41
    return v1
.end method

.method public final isRealVip()Z
    .registers 2

    .line 119
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoginUser()Lcn/jianyun/workplan/main/setting/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcn/jianyun/workplan/main/setting/user/User;->isVip()Z

    move-result v0

    return v0
.end method

.method public final isVip()Z
    .registers 2

    .line 110
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->isAdVip()Z

    move-result v0

    if-nez v0, :cond_d

    iget-boolean v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->adVip:Z

    if-eqz v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    return v0
.end method

.method public final listWebDAVUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcn/jianyun/workplan/module/base/model/WebDAVUser;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 570
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->webDAVUserDao:Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;

    invoke-interface {v0, p1}, Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;->list(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loading(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
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

    .line 133
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoading()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 134
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    const/4 v0, 0x1

    .line 136
    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoading(Z)V

    if-eqz p1, :cond_2a

    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 p1, 0xc8

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setFinishTime(J)V

    const-wide/16 v0, 0xc8

    .line 139
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_27

    return-object p1

    :cond_27
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 142
    :cond_2a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setFinishTime(J)V

    .line 144
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 434
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_40

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 435
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    const-string p2, "0"

    invoke-virtual {p0, p1, p2, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_40

    return-object v1

    .line 434
    :cond_40
    :goto_40
    check-cast p2, Ljava/lang/String;

    .line 437
    :try_start_42
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_4a} :catch_4b

    return-object p1

    :catch_4b
    const-wide/16 p1, 0x0

    .line 440
    invoke-static {p1, p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final makeJgyUser(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
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

    const-string v0, "jgy"

    .line 562
    invoke-virtual {p0, v0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_d

    return-object p1

    :cond_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final makeLogin(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/main/setting/user/User;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 538
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3a

    if-ne v2, v3, :cond_32

    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/main/setting/user/User;

    iget-object v0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_32
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 539
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    const-string p2, "uu"

    invoke-virtual {p0, p2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4c

    return-object v1

    :cond_4c
    move-object v0, p0

    .line 540
    :goto_4d
    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setLoginUser(Lcn/jianyun/workplan/main/setting/user/User;)V

    .line 541
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final makeNotifyStatus(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 577
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3d

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5a

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_3d
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 578
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    const-string p2, "notifyStatus"

    invoke-virtual {p0, p2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4d

    return-object v1

    :cond_4d
    move-object p1, p0

    :goto_4e
    const/4 p2, 0x0

    .line 579
    iput-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getNotifyStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5a

    return-object v1

    .line 580
    :cond_5a
    :goto_5a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final makeRegist(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 14
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

    instance-of v0, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;

    if-eqz v0, :cond_14

    move-object v0, p1

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;

    invoke-direct {v0, p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 250
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    const-string v3, "uu"

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_62

    if-eq v2, v7, :cond_5a

    if-eq v2, v6, :cond_4b

    if-eq v2, v5, :cond_3e

    if-ne v2, v4, :cond_36

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_d0

    :cond_36
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3e
    iget-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/main/setting/user/User;

    iget-object v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_ba

    :cond_4b
    iget-wide v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->J$0:J

    iget-object v6, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/main/setting/user/User;

    iget-object v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v6

    goto :goto_a9

    :cond_5a
    iget-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_73

    :cond_62
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 251
    const-class p1, Lcn/jianyun/workplan/main/setting/user/User;

    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    iput v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    invoke-virtual {p0, v3, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_72

    return-object v1

    :cond_72
    move-object v2, p0

    .line 250
    :goto_73
    check-cast p1, Lcn/jianyun/workplan/main/setting/user/User;

    if-eqz p1, :cond_86

    .line 252
    invoke-virtual {p1}, Lcn/jianyun/workplan/main/setting/user/User;->getUuid()Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_86

    .line 253
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 255
    :cond_86
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 257
    invoke-virtual {p1, v7, v8}, Lcn/jianyun/workplan/main/setting/user/User;->setRegistTime(J)V

    .line 258
    invoke-static {}, Lcn/jianyun/workplan/util/CommonToolKt;->uuid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1, v9}, Lcn/jianyun/workplan/main/setting/user/User;->setUuid(Ljava/lang/String;)V

    .line 259
    iput-object v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$1:Ljava/lang/Object;

    iput-wide v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->J$0:J

    iput v6, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    invoke-virtual {v2, v3, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_a6

    return-object v1

    :cond_a6
    move-wide v10, v7

    move-object v7, v2

    move-wide v2, v10

    .line 260
    :goto_a9
    iput-object v7, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    const-string v5, "localRegistTime"

    invoke-virtual {v7, v5, v2, v3, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheLong(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b8

    return-object v1

    :cond_b8
    move-object v2, p1

    move-object v3, v7

    .line 261
    :goto_ba
    invoke-virtual {v2}, Lcn/jianyun/workplan/main/setting/user/User;->getUuid()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    const/4 p1, 0x0

    .line 262
    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    const-string p1, "home"

    invoke-virtual {v3, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postPage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d0

    return-object v1

    .line 263
    :cond_d0
    :goto_d0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final openUrl(Ljava/lang/String;)V
    .registers 4

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 124
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 125
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 127
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final playTap()V
    .registers 4

    .line 534
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 535
    invoke-virtual {v0, v1, v2}, Landroid/media/AudioManager;->playSoundEffect(IF)V

    return-void
.end method

.method public final postEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 14
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

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 597
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_66

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 598
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v2, Lcn/jianyun/workplan/api/TraceInfo;

    const-string v5, "event"

    iget-object v7, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v4, v2

    move-object v6, p1

    invoke-direct/range {v4 .. v10}, Lcn/jianyun/workplan/api/TraceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 599
    iget-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/api/TraceInfo;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->enhanceTraceInfo(Lcn/jianyun/workplan/api/TraceInfo;)Lcn/jianyun/workplan/api/TraceInfo;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 600
    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$dd$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, p2, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$dd$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    invoke-static {p1, v0}, Lcn/jianyun/workplan/util/CommonToolKt;->withApi(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_66

    return-object v1

    .line 597
    :cond_66
    :goto_66
    check-cast p2, Lcn/jianyun/workplan/api/ApiResult;

    .line 603
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final postEvent2(Ljava/lang/String;)V
    .registers 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v8, Lcn/jianyun/workplan/api/TraceInfo;

    const-string v2, "event"

    iget-object v4, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lcn/jianyun/workplan/api/TraceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 607
    iget-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/api/TraceInfo;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->enhanceTraceInfo(Lcn/jianyun/workplan/api/TraceInfo;)Lcn/jianyun/workplan/api/TraceInfo;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 609
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {p1}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getNeedStat()Z

    move-result p1

    if-eqz p1, :cond_42

    .line 610
    sget-object p1, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, p1

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_42
    return-void
.end method

.method public final postPage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 14
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

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 618
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_66

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 619
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v2, Lcn/jianyun/workplan/api/TraceInfo;

    const-string v5, "page"

    iget-object v7, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v4, v2

    move-object v6, p1

    invoke-direct/range {v4 .. v10}, Lcn/jianyun/workplan/api/TraceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 620
    iget-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/api/TraceInfo;

    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->enhanceTraceInfo(Lcn/jianyun/workplan/api/TraceInfo;)Lcn/jianyun/workplan/api/TraceInfo;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 621
    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$dd$1;

    const/4 v2, 0x0

    invoke-direct {p1, p0, p2, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$dd$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postPage$1;->label:I

    invoke-static {p1, v0}, Lcn/jianyun/workplan/util/CommonToolKt;->withApi(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_66

    return-object v1

    .line 618
    :cond_66
    :goto_66
    check-cast p2, Lcn/jianyun/workplan/api/ApiResult;

    .line 624
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final prepareRefreshWidgetData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 21
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

    instance-of v2, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;

    iget v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 745
    iget v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_53

    if-eq v4, v7, :cond_47

    if-ne v4, v6, :cond_3f

    iget-object v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$1:Ljava/lang/Object;

    check-cast v4, Landroid/app/AlarmManager;

    iget-object v2, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_101

    :cond_3f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_47
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$1:Ljava/lang/Object;

    check-cast v4, Landroid/app/AlarmManager;

    iget-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_7e

    :cond_53
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 746
    iget-object v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-class v4, Landroid/app/AlarmManager;

    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/AlarmManager;

    .line 747
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1f

    if-lt v4, v8, :cond_6f

    .line 748
    invoke-virtual {v1}, Landroid/app/AlarmManager;->canScheduleExactAlarms()Z

    move-result v4

    if-nez v4, :cond_6f

    .line 749
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 753
    :cond_6f
    iput-object v0, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    invoke-virtual {v0, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cleanOldAlarms(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7c

    return-object v3

    :cond_7c
    move-object v7, v0

    move-object v4, v1

    .line 754
    :goto_7e
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    move v8, v5

    :goto_86
    const/16 v9, 0x8

    if-ge v8, v9, :cond_a2

    .line 756
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    add-int/lit8 v8, v8, 0x1

    invoke-static {v9, v8}, Lcn/jianyun/workplan/util/CommonDateToolKt;->gapDay(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v9

    invoke-static {v9}, Lcn/jianyun/workplan/util/MyDateTool;->getStartOfDay(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v9

    const-string v10, "getStartOfDay(Date().gapDay(i + 1))"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_86

    .line 759
    :cond_a2
    move-object v8, v1

    check-cast v8, Ljava/lang/Iterable;

    .line 821
    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v8, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .line 822
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_ce

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 823
    check-cast v10, Ljava/util/Date;

    .line 759
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-static {v10, v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v10

    .line 823
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b6

    .line 824
    :cond_ce
    check-cast v9, Ljava/util/List;

    .line 821
    move-object v10, v9

    check-cast v10, Ljava/lang/Iterable;

    const-string v8, ","

    .line 759
    move-object v11, v8

    check-cast v11, Ljava/lang/CharSequence;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x3e

    const/16 v18, 0x0

    invoke-static/range {v10 .. v18}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    .line 760
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_103

    .line 761
    iput-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$prepareRefreshWidgetData$1;->label:I

    const-string v6, "alarmIds"

    invoke-virtual {v7, v6, v8, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_ff

    return-object v3

    :cond_ff
    move-object v3, v1

    move-object v2, v7

    :goto_101
    move-object v7, v2

    move-object v1, v3

    .line 764
    :cond_103
    check-cast v1, Ljava/lang/Iterable;

    .line 825
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_109
    :goto_109
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_141

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    .line 765
    new-instance v3, Landroid/content/Intent;

    iget-object v6, v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-class v8, Lcn/jianyun/workplan/main/receiver/AlarmWidgetReceiver;

    invoke-direct {v3, v6, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "reloadWidget"

    .line 766
    invoke-static {v2}, Lcn/jianyun/workplan/util/MyDateTool;->toDateTimeString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 771
    :try_start_127
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    .line 773
    iget-object v6, v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    .line 774
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    const v2, 0x186a0

    int-to-long v12, v2

    div-long/2addr v10, v12

    long-to-int v2, v10

    const/high16 v10, 0xc000000

    .line 772
    invoke-static {v6, v2, v3, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 769
    invoke-virtual {v4, v5, v8, v9, v2}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V
    :try_end_140
    .catch Ljava/lang/Exception; {:try_start_127 .. :try_end_140} :catch_109

    goto :goto_109

    .line 784
    :cond_141
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final reload()V
    .registers 8

    .line 308
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoading()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 309
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 311
    :cond_9
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getSid()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setSid(I)V

    .line 312
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$reload$1;

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$reload$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final reloadAppData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
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

    .line 318
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reloadWidget()V

    .line 319
    invoke-virtual {p0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->prepareRefreshWidgetData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_e

    return-object p1

    :cond_e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final reloadWidget()V
    .registers 4

    .line 711
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    const-class v2, Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "updateAction"

    .line 712
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 714
    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final setAdVip(Z)V
    .registers 2

    .line 78
    iput-boolean p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->adVip:Z

    return-void
.end method

.method public final setAppTipInfo(Lcn/jianyun/workplan/api/dto/AppTipInfo;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->appTipInfo:Lcn/jianyun/workplan/api/dto/AppTipInfo;

    return-void
.end method

.method public final setBrand(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->brand:Ljava/lang/String;

    return-void
.end method

.method public final setCurrentPage(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->currentPage$delegate:Landroidx/compose/runtime/MutableState;

    .line 790
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setFinishTime(J)V
    .registers 4

    .line 87
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finishTime$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 805
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setFocusId(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->focusId$delegate:Landroidx/compose/runtime/MutableState;

    .line 799
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setInited(Z)V
    .registers 2

    .line 83
    iput-boolean p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->inited:Z

    return-void
.end method

.method public final setLoading(Z)V
    .registers 3

    .line 86
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loading$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 802
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setLocalBackupConfig(Lcn/jianyun/workplan/model/LocalBackupConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/model/LocalBackupConfig;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "localBackup"

    .line 590
    invoke-virtual {p0, v0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_d

    return-object p1

    :cond_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final setLoginUser(Lcn/jianyun/workplan/main/setting/user/User;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->loginUser$delegate:Landroidx/compose/runtime/MutableState;

    .line 808
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setMinVipDay(I)V
    .registers 2

    .line 81
    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->minVipDay:I

    return-void
.end method

.method public final setNotifyStatus(Ljava/util/Map;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->notifyStatus$delegate:Landroidx/compose/runtime/MutableState;

    .line 811
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setRegistDay(I)V
    .registers 2

    .line 82
    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->registDay:I

    return-void
.end method

.method public final setShowTip(Z)V
    .registers 3

    .line 84
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->showTip$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 796
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSid(I)V
    .registers 3

    .line 77
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sid$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 793
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSp(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->sp:Ljava/lang/String;

    return-void
.end method

.method public final setToast(Landroid/widget/Toast;)V
    .registers 2

    .line 76
    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast:Landroid/widget/Toast;

    return-void
.end method

.method public final setUid(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->uid:Ljava/lang/String;

    return-void
.end method

.method public final setWidgetConfig(Lcn/jianyun/workplan/widget/WidgetConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/widget/WidgetConfig;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 717
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_47

    :cond_2e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 718
    iput-object p0, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$setWidgetConfig$1;->label:I

    const-string p2, "widgetConfig"

    invoke-virtual {p0, p2, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_46

    return-object v1

    :cond_46
    move-object p1, p0

    .line 719
    :goto_47
    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reloadWidget()V

    .line 720
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final setWx(Z)V
    .registers 2

    .line 79
    iput-boolean p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->wx:Z

    return-void
.end method

.method public final timeCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 7
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

    instance-of v0, p2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;

    if-eqz v0, :cond_14

    move-object v0, p2

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;

    iget v1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_14

    iget p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->label:I

    goto :goto_19

    :cond_14
    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;

    invoke-direct {v0, p0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_19
    iget-object p2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 444
    iget v2, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v3, :cond_2a

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_32
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 445
    iput v3, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$timeCache$1;->label:I

    invoke-virtual {p0, p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_3e
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_4d

    const-string p1, ""

    return-object p1

    .line 449
    :cond_4d
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lcn/jianyun/workplan/util/CommonDateToolKt;->datetimeStr(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toast(Ljava/lang/String;)V
    .registers 4

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLoading()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 332
    invoke-virtual {p0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->finish()V

    .line 334
    :cond_e
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast:Landroid/widget/Toast;

    if-eqz v0, :cond_18

    .line 335
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 338
    :cond_18
    :try_start_18
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->getToastMessageLength(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->toast:Landroid/widget/Toast;

    .line 339
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_2d} :catch_2e

    goto :goto_38

    :catch_2e
    move-exception p1

    const-string v0, "toast error"

    .line 342
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcn/jianyun/workplan/util/CommonToolKt;->mlog([Ljava/lang/Object;)V

    :goto_38
    return-void
.end method

.method public final tryUpgrade(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 20
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;

    iget v3, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_18

    iget v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    goto :goto_1d

    :cond_18
    new-instance v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;

    invoke-direct {v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    :goto_1d
    iget-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 683
    iget v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    const-string v5, "lvt"

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_54

    if-eq v4, v8, :cond_4c

    if-eq v4, v7, :cond_40

    if-ne v4, v6, :cond_38

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_102

    :cond_38
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_40
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_97

    :cond_4c
    iget-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_63

    :cond_54
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 686
    iput-object v0, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$0:Ljava/lang/Object;

    iput v8, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    invoke-virtual {v0, v5, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheHour(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_62

    return-object v3

    :cond_62
    move-object v4, v0

    :goto_63
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/16 v10, 0x48

    if-ge v1, v10, :cond_72

    .line 688
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    .line 690
    :cond_72
    iget-object v1, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v10, v4, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->context:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 691
    iput-object v4, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    invoke-virtual {v4, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLatestVersion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_91

    return-object v3

    :cond_91
    move-object/from16 v17, v4

    move-object v4, v1

    move-object v1, v7

    move-object/from16 v7, v17

    :goto_97
    check-cast v1, Ljava/lang/String;

    const-string v10, "currentVersion"

    .line 692
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v4

    check-cast v11, Ljava/lang/CharSequence;

    const-string v12, "."

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v10

    invoke-virtual {v4, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v10, "substring(...)"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 693
    move-object v11, v1

    check-cast v11, Ljava/lang/CharSequence;

    const-string v12, "."

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v10

    invoke-virtual {v1, v9, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 694
    invoke-virtual {v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->isNetworkAvailable()Z

    move-result v10

    if-nez v10, :cond_cd

    .line 695
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    .line 697
    :cond_cd
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v1, v10}, Lcn/jianyun/workplan/util/MyDataTool;->toInteger(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v8

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lcn/jianyun/workplan/util/MyDataTool;->toInteger(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v4

    const-string v10, "toInteger(max1, 0)"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-le v1, v4, :cond_f4

    .line 698
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_f4
    const/4 v1, 0x0

    .line 701
    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository$tryUpgrade$1;->label:I

    invoke-virtual {v7, v5, v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheNow(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_102

    return-object v3

    .line 702
    :cond_102
    :goto_102
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public final weightedRandom(Ljava/lang/String;)I
    .registers 14

    const-string v0, "ratio"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, ":"

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v0, v2, v4, v5, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    const-string p1, "10:1"

    .line 387
    :cond_18
    move-object v6, p1

    check-cast v6, Ljava/lang/CharSequence;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 389
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "\u9519\u8bef\uff1a\u6bd4\u503c\u683c\u5f0f\u4e0d\u6b63\u786e\uff0c\u5e94\u4e3a \'\u6743\u91cd1:\u6743\u91cd2\' \u7684\u6b63\u6574\u6570\u683c\u5f0f"

    const/4 v2, 0x1

    if-eq v0, v5, :cond_36

    .line 390
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v2

    .line 394
    :cond_36
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 395
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz v0, :cond_79

    if-eqz p1, :cond_79

    .line 397
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_79

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-gtz v3, :cond_5b

    goto :goto_79

    .line 403
    :cond_5b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr v1, p1

    .line 406
    new-instance p1, Lkotlin/ranges/IntRange;

    invoke-direct {p1, v2, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    sget-object v1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    check-cast v1, Lkotlin/random/Random;

    invoke-static {p1, v1}, Lkotlin/ranges/RangesKt;->random(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I

    move-result p1

    .line 409
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt p1, v0, :cond_78

    move v5, v2

    :cond_78
    return v5

    .line 398
    :cond_79
    :goto_79
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v2
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;-><init>(Landroidx/datastore/core/DataStore;Lcn/jianyun/workplan/api/TraceApi;Lcn/jianyun/workplan/api/BaseApi;Lcn/jianyun/workplan/api/ConfigApi;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;Landroid/content/Context;)V
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
        "Ljava/lang/Integer;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$1"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x95
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

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

    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;

    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 148
    iget v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_30

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 149
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2e

    return-object v0

    :cond_2e
    move-object v0, p1

    move-object p1, v1

    :goto_30
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setUid(Ljava/lang/String;)V

    const-string p1, "qz init base repository finish"

    const-string v0, "base repository finish"

    .line 150
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;-><init>(Landroidx/datastore/core/DataStore;Lcn/jianyun/workplan/api/TraceApi;Lcn/jianyun/workplan/api/BaseApi;Lcn/jianyun/workplan/api/ConfigApi;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;Landroid/content/Context;)V
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
    value = "SMAP\nBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepository.kt\ncn/jianyun/workplan/hilt/respo/BaseRepository$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n766#2:789\n857#2,2:790\n766#2:792\n857#2,2:793\n*S KotlinDebug\n*F\n+ 1 BaseRepository.kt\ncn/jianyun/workplan/hilt/respo/BaseRepository$2\n*L\n167#1:789\n167#1:790,2\n180#1:792\n180#1:793,2\n*E\n"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$2"
    f = "BaseRepository.kt"
    i = {
        0x3,
        0x3,
        0x3,
        0x3,
        0x4
    }
    l = {
        0x9e,
        0x9f,
        0xa1,
        0xa7,
        0xab,
        0xbf
    }
    m = "invokeSuspend"
    n = {
        "ks",
        "destination$iv$iv",
        "element$iv$iv",
        "one",
        "ks"
    }
    s = {
        "L$0",
        "L$2",
        "L$4",
        "L$5",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $that:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

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

    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;

    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 16

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 156
    iget v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    const-string v2, "app_config"

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v1, :pswitch_data_2cc

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2c9

    :pswitch_1b
    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_199

    :pswitch_27
    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$5:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    iget-object v6, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$4:Ljava/lang/Object;

    iget-object v7, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$1:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v10, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v11, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v10

    move-object v10, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_ef

    :pswitch_4a
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_9c

    :pswitch_4e
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_86

    :pswitch_52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_75

    :pswitch_56
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 157
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2c9

    .line 158
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->reloadAppData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_75

    return-object v0

    .line 159
    :cond_75
    :goto_75
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v6, 0x2

    iput v6, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    const-string v6, "home"

    invoke-virtual {p1, v6, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postPage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_86

    return-object v0

    .line 161
    :cond_86
    :goto_86
    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2$ds$1;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p1, v1, v5}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2$ds$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v6, 0x3

    iput v6, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    invoke-static {p1, v1}, Lcn/jianyun/workplan/util/CommonToolKt;->withApi(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9c

    return-object v0

    .line 156
    :cond_9c
    :goto_9c
    check-cast p1, Lcn/jianyun/workplan/api/ApiResult;

    .line 164
    invoke-virtual {p1}, Lcn/jianyun/workplan/api/ApiResult;->getSuccess()Z

    move-result v1

    if-eqz v1, :cond_2c9

    .line 165
    invoke-virtual {p1}, Lcn/jianyun/workplan/api/ApiResult;->fetchResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 167
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v6, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 789
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 790
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v9, v6

    move-object v8, v7

    move-object v7, v1

    move-object v1, p1

    move-object p1, p0

    :goto_bf
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_110

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    .line 167
    iget-object v11, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$0:Ljava/lang/Object;

    iput-object v9, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$1:Ljava/lang/Object;

    iput-object v8, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$2:Ljava/lang/Object;

    iput-object v7, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$3:Ljava/lang/Object;

    iput-object v6, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$4:Ljava/lang/Object;

    iput-object v10, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$5:Ljava/lang/Object;

    const/4 v12, 0x4

    iput v12, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    invoke-virtual {v10, v11, p1}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->isShown(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_e6

    return-object v0

    :cond_e6
    move-object v13, v0

    move-object v0, p1

    move-object p1, v11

    move-object v11, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move-object v1, v13

    :goto_ef
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_103

    invoke-virtual {v10}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_103

    move p1, v3

    goto :goto_104

    :cond_103
    move p1, v4

    :goto_104
    if-eqz p1, :cond_109

    .line 790
    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_109
    move-object p1, v0

    move-object v0, v1

    move-object v1, v6

    move-object v7, v8

    move-object v8, v9

    move-object v9, v11

    goto :goto_bf

    .line 791
    :cond_110
    check-cast v8, Ljava/util/List;

    .line 168
    move-object v6, v8

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v3

    if-eqz v6, :cond_1bb

    .line 169
    iget-object v6, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v6, v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setAppTipInfo(Lcn/jianyun/workplan/api/dto/AppTipInfo;)V

    .line 170
    iget-object v6, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v7, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getMinVipDay()I

    move-result v7

    const/4 v8, 0x5

    if-ge v7, v8, :cond_144

    move v7, v3

    goto :goto_145

    :cond_144
    move v7, v4

    :goto_145
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v9

    iget-object v10, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v10, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v10, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v10}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v10

    invoke-virtual {v10}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getMinVipDay()I

    move-result v10

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v9, v10}, Lcn/jianyun/workplan/util/CommonToolKt;->ifv(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v6, v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setMinVipDay(I)V

    .line 171
    iget-object v6, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v7, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v7, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v7}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->uid()Ljava/lang/String;

    move-result-object v7

    move-object v9, p1

    check-cast v9, Lkotlin/coroutines/Continuation;

    iput-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$0:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$3:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$4:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$5:Ljava/lang/Object;

    iput v8, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    invoke-virtual {v6, v7, v9}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->booleanCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_194

    return-object v0

    :cond_194
    move-object v13, v0

    move-object v0, p1

    move-object p1, v6

    move-object v6, v1

    move-object v1, v13

    :goto_199
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1b7

    .line 172
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {p1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setShow(Z)V

    .line 173
    iget-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {p1, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setShowTip(Z)V

    :cond_1b7
    move-object p1, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_1d1

    .line 177
    :cond_1bb
    iget-object v3, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setShow(Z)V

    .line 178
    iget-object v3, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v3, v4}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->setShowTip(Z)V

    .line 180
    :goto_1d1
    check-cast v1, Ljava/lang/Iterable;

    .line 792
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 793
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1de
    :goto_1de
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    .line 180
    invoke-virtual {v7}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1de

    .line 793
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1de

    .line 794
    :cond_1f9
    check-cast v3, Ljava/util/List;

    .line 181
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2c9

    .line 182
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getOpenScreenAds()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setOpenScreenAds(Z)V

    .line 183
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getScreenAdsGapMinute()I

    move-result v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setScreenAdsGapMinute(I)V

    .line 184
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getMinVipDay()I

    move-result v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setMinVipDay(I)V

    .line 186
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getAdsValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setAdsValue(Ljava/lang/String;)V

    .line 187
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getOpenRecover()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setOpenRecover(Z)V

    .line 188
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getRecoverAdsValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setRecoverAdsValue(Ljava/lang/String;)V

    .line 189
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/jianyun/workplan/api/dto/AppTipInfo;

    invoke-virtual {v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->getNeedStat()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcn/jianyun/workplan/api/dto/AppTipInfo;->setNeedStat(Z)V

    .line 191
    iget-object v1, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v2, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->$that:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-virtual {v2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getAppTipInfo()Lcn/jianyun/workplan/api/dto/AppTipInfo;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$0:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$3:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$4:Ljava/lang/Object;

    iput-object v5, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->L$5:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$2;->label:I

    const-string p1, "appTipConfig"

    invoke-virtual {v1, p1, v2, v3}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheJsonValue(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2c9

    return-object v0

    .line 196
    :cond_2c9
    :goto_2c9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :pswitch_data_2cc
    .packed-switch 0x0
        :pswitch_56
        :pswitch_52
        :pswitch_4e
        :pswitch_4a
        :pswitch_27
        :pswitch_1b
        :pswitch_16
    .end packed-switch
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$booleanCache$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->booleanCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x1e0
    }
    m = "booleanCache"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$booleanCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->booleanCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$cache$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cache(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/datastore/preferences/core/MutablePreferences;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/datastore/preferences/core/MutablePreferences;"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cache$2"
    f = "BaseRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $value:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$key:Ljava/lang/String;

    iput-object p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$value:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 6
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

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$key:Ljava/lang/String;

    iget-object v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$value:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/core/MutablePreferences;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 347
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->label:I

    if-nez v0, :cond_1e

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    .line 348
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$key:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcn/jianyun/workplan/util/CommonToolKt;->makePKey$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cache$2;->$value:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/core/MutablePreferences;->set(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    .line 349
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 347
    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$cacheBoolean$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheBoolean(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/datastore/preferences/core/MutablePreferences;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/datastore/preferences/core/MutablePreferences;"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheBoolean$2"
    f = "BaseRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $value:Z

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$key:Ljava/lang/String;

    iput-boolean p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$value:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 6
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

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$key:Ljava/lang/String;

    iget-boolean v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$value:Z

    invoke-direct {v0, v1, v2, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;-><init>(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/core/MutablePreferences;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 474
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->label:I

    if-nez v0, :cond_22

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    .line 475
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$key:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcn/jianyun/workplan/util/CommonToolKt;->makePKey$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    iget-boolean v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheBoolean$2;->$value:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/core/MutablePreferences;->set(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    .line 476
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 474
    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$cacheInt$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheInt(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/datastore/preferences/core/MutablePreferences;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/datastore/preferences/core/MutablePreferences;"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheInt$2"
    f = "BaseRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $value:I

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$key:Ljava/lang/String;

    iput p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$value:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 6
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

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$key:Ljava/lang/String;

    iget v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$value:I

    invoke-direct {v0, v1, v2, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;-><init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/core/MutablePreferences;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 357
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->label:I

    if-nez v0, :cond_22

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    .line 358
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$key:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcn/jianyun/workplan/util/CommonToolKt;->makePKey$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    iget v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheInt$2;->$value:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/core/MutablePreferences;->set(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    .line 359
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 357
    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$cacheLong$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheLong(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/datastore/preferences/core/MutablePreferences;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/datastore/preferences/core/MutablePreferences;"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheLong$2"
    f = "BaseRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field final synthetic $value:J

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;JLkotlin/coroutines/Continuation;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$key:Ljava/lang/String;

    iput-wide p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$value:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .registers 7
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

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$key:Ljava/lang/String;

    iget-wide v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$value:J

    invoke-direct {v0, v1, v2, v3, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;-><init>(Ljava/lang/String;JLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/core/MutablePreferences;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 423
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->label:I

    if-nez v0, :cond_22

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    .line 424
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$key:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcn/jianyun/workplan/util/CommonToolKt;->makePKey$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    iget-wide v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheLong$2;->$value:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/core/MutablePreferences;->set(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    .line 425
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 423
    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2 (cn.jianyun.workplan.hilt.respo.BaseRepository$cacheNow$2)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cacheNow(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/datastore/preferences/core/MutablePreferences;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/datastore/preferences/core/MutablePreferences;"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheNow$2"
    f = "BaseRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $key:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->$key:Ljava/lang/String;

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

    new-instance v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->$key:Ljava/lang/String;

    invoke-direct {v0, v1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/core/MutablePreferences;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->invoke(Landroidx/datastore/preferences/core/MutablePreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 429
    iget v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->label:I

    if-nez v0, :cond_24

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/datastore/preferences/core/MutablePreferences;

    .line 430
    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cacheNow$2;->$key:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcn/jianyun/workplan/util/CommonToolKt;->makePKey$default(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/datastore/preferences/core/MutablePreferences;->set(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    .line 431
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 429
    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$cleanOldAlarms$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cleanOldAlarms(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x2d5
    }
    m = "cleanOldAlarms"
    n = {
        "this",
        "alarmManager"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$cleanOldAlarms$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->cleanOldAlarms(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$fetchHoliday$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x2
    }
    l = {
        0x120,
        0x122,
        0x12a
    }
    m = "fetchHoliday"
    n = {
        "this",
        "lstTime",
        "year",
        "this",
        "year",
        "rst"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "I$0",
        "L$0"
    }
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$fetchHoliday$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->fetchHoliday(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getArrayCache$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getArrayCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0
    }
    l = {
        0x1f8
    }
    m = "getArrayCache"
    n = {
        "cls"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getArrayCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getArrayCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheDay$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheDay(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x1cb
    }
    m = "getCacheDay"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheDay$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheDay(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheHour$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheHour(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x1c5
    }
    m = "getCacheHour"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheHour$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheHour(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheMinute$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheMinute(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x1d4
    }
    m = "getCacheMinute"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getCacheMinute$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getCacheMinute(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getDid$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getDid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x10b,
        0x10e
    }
    m = "getDid"
    n = {
        "this",
        "did"
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

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getDid$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getDid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getLatestVersion$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLatestVersion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x295
    }
    m = "getLatestVersion"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLatestVersion$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLatestVersion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalBackupConfig$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalBackupConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x24a
    }
    m = "getLocalBackupConfig"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalBackupConfig$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalBackupConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalPath$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalPath(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x247
    }
    m = "getLocalPath"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalPath$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalPath(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalRegistTime$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalRegistTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0
    }
    l = {
        0x220
    }
    m = "getLocalRegistTime"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getLocalRegistTime$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalRegistTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getNotifyStatus$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getNotifyStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x23e
    }
    m = "getNotifyStatus"
    n = {}
    s = {}
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getNotifyStatus$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getNotifyStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getObjectCache$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0
    }
    l = {
        0x1ee
    }
    m = "getObjectCache"
    n = {
        "cls"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getObjectCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getObjectCache(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getRegistDay$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getRegistDay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0
    }
    l = {
        0x28f
    }
    m = "getRegistDay"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getRegistDay$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getRegistDay(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getUid$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xdf,
        0xe1,
        0xef
    }
    m = "getUid"
    n = {
        "this",
        "this",
        "uu",
        "this",
        "uu",
        "finalLocalRegistTime"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "J$0"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getUid$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getUid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$getWidgetConfig$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getWidgetConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x2c3
    }
    m = "getWidgetConfig"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$getWidgetConfig$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getWidgetConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$hasRegist$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->hasRegist()Z
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$hasRegist$1"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x69
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

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

    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;

    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p1, v0, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 104
    iget v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_28

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$hasRegist$1;->label:I

    invoke-virtual {p1, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->getLocalRegistTime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_28

    return-object v0

    :cond_28
    :goto_28
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-lez p1, :cond_35

    goto :goto_36

    :cond_35
    const/4 v2, 0x0

    :goto_36
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$initApp$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->initApp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x3,
        0x4
    }
    l = {
        0xd0,
        0xd1,
        0xd2,
        0xd3,
        0xd4
    }
    m = "initApp"
    n = {
        "this",
        "this",
        "this",
        "this",
        "this"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$initApp$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->initApp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$intCache$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->intCache(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x16b
    }
    m = "intCache"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$intCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->intCache(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$longCache$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x1b3
    }
    m = "longCache"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$longCache$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->longCache(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$makeLogin$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeLogin(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x21b
    }
    m = "makeLogin"
    n = {
        "this",
        "uu"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeLogin$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeLogin(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$makeNotifyStatus$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeNotifyStatus(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0
    }
    l = {
        0x242,
        0x243
    }
    m = "makeNotifyStatus"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeNotifyStatus$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeNotifyStatus(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$makeRegist$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeRegist(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0xfb,
        0x103,
        0x104,
        0x106
    }
    m = "makeRegist"
    n = {
        "this",
        "this",
        "newUser",
        "now",
        "this",
        "newUser"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "J$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$makeRegist$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->makeRegist(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "BaseRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x258
    }
    m = "postEvent"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->label:I

    iget-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v1}, Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

###### Class cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass1 (cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent2$1)
.class final Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "BaseRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/jianyun/workplan/hilt/respo/BaseRepository;->postEvent2(Ljava/lang/String;)V
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
    c = "cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent2$1"
    f = "BaseRepository.kt"
    i = {}
    l = {
        0x263
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $traceInfo:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/api/TraceInfo;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;


# direct methods
.method constructor <init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcn/jianyun/workplan/api/TraceInfo;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iput-object p2, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->$traceInfo:Lkotlin/jvm/internal/Ref$ObjectRef;

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

    new-instance p1, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;

    iget-object v0, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->this$0:Lcn/jianyun/workplan/hilt/respo/BaseRepository;

    iget-object v1, p0, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->$traceInfo:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1, v0, v1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;-><init>(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcn/jianyun/workplan/hilt/respo/BaseRepository$postEvent2$1;->create(Ljava/lang/Obj

... [truncated: exceeds 400000 bytes, total 424218 bytes]