package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.CommonToolKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u001fJ\u000e\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020\u0003H\u0016J\u000e\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020\u0014J\b\u0010?\u001a\u000206H\u0016J\u0010\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020\u001fH\u0016J\u000e\u0010B\u001a\u0002062\u0006\u0010:\u001a\u00020;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R7\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0.2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0011\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006C"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleAlarmViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "currentWork", "getCurrentWork", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "setCurrentWork", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V", "currentWork$delegate", "Landroidx/compose/runtime/MutableState;", "datalist", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "getDatalist", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setDatalist", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;", "setEditItem", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleAlarm;)V", "editItem$delegate", "", "isDelete", "()Z", "setDelete", "(Z)V", "isDelete$delegate", "", "newSize", "getNewSize", "()I", "setNewSize", "(I)V", "newSize$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "", "works", "getWorks", "()Ljava/util/List;", "setWorks", "(Ljava/util/List;)V", "works$delegate", "doChangeState", "", NotificationCompat.CATEGORY_ALARM, "flag", "doDelete", "navHostController", "Landroidx/navigation/NavHostController;", "getRepository", "initModel", "model", "reload", "reloadData", "dataChanged", "save", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleAlarmViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: currentWork$delegate, reason: from kotlin metadata */
    private final MutableState currentWork;
    private SnapshotStateList<ScheduleAlarm> datalist;

    /* JADX INFO: renamed from: editItem$delegate, reason: from kotlin metadata */
    private final MutableState editItem;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    private final MutableState isDelete;

    /* JADX INFO: renamed from: newSize$delegate, reason: from kotlin metadata */
    private final MutableState newSize;
    private final ScheduleService scheduleService;

    /* JADX INFO: renamed from: works$delegate, reason: from kotlin metadata */
    private final MutableState works;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    @Inject
    public ScheduleAlarmViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.works = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleAlarm(str, str2, str3, str4, str5, str6, str7, false, z, str8, null, null, null, str9, str10, 0, str11, 131071, null), null, 2, null);
        this.datalist = SnapshotStateKt.mutableStateListOf();
        this.newSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.currentWork = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleWork(str, str2, str3, str4, str5, str6, str7, null, z, str8, 0, false, 0, str9, str10, null, str11, null, 0, null, 1048575, null), null, 2, null);
        setCurrentPage("ScheduleAlarmView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    public final List<ScheduleWork> getWorks() {
        return (List) this.works.getValue();
    }

    public final void setWorks(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.works.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleAlarm getEditItem() {
        return (ScheduleAlarm) this.editItem.getValue();
    }

    public final void setEditItem(ScheduleAlarm scheduleAlarm) {
        Intrinsics.checkNotNullParameter(scheduleAlarm, "<set-?>");
        this.editItem.setValue(scheduleAlarm);
    }

    public final SnapshotStateList<ScheduleAlarm> getDatalist() {
        return this.datalist;
    }

    public final void setDatalist(SnapshotStateList<ScheduleAlarm> snapshotStateList) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<set-?>");
        this.datalist = snapshotStateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getNewSize() {
        return ((Number) this.newSize.getValue()).intValue();
    }

    public final void setNewSize(int i) {
        this.newSize.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleWork getCurrentWork() {
        return (ScheduleWork) this.currentWork.getValue();
    }

    public final void setCurrentWork(ScheduleWork scheduleWork) {
        Intrinsics.checkNotNullParameter(scheduleWork, "<set-?>");
        this.currentWork.setValue(scheduleWork);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1", f = "ScheduleAlarmViewModel.kt", i = {0, 1, 2}, l = {52, 53, 55}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ScheduleAlarmViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0096  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:32:0x0107  */
        /* JADX WARN: Code duplicated, block: B:34:0x010f  */
        /* JADX WARN: Code duplicated, block: B:38:0x012e  */
        /* JADX WARN: Code duplicated, block: B:48:0x0144 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0090 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            ScheduleAlarmViewModel scheduleAlarmViewModel;
            ScheduleAlarmViewModel scheduleAlarmViewModel2;
            CoroutineScope coroutineScope2;
            ArrayList arrayList;
            CoroutineScope coroutineScope3;
            ScheduleAlarmViewModel scheduleAlarmViewModel3;
            int i;
            ScheduleAlarm scheduleAlarm;
            Iterator<T> it;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    scheduleAlarmViewModel = (ScheduleAlarmViewModel) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    scheduleAlarmViewModel2 = (ScheduleAlarmViewModel) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (!((ScheduleWork) obj2).getComplex()) {
                            arrayList.add(obj2);
                        }
                    }
                    scheduleAlarmViewModel2.setWorks(arrayList);
                    this.L$0 = coroutineScope2;
                    this.L$1 = null;
                    this.label = 3;
                    obj = ScheduleAlarmViewModel.this.getScheduleService().loadCurrentAlarmDataWithNextTime(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope2;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope3 = coroutineScope4;
                }
                List list = (List) obj;
                ScheduleAlarmViewModel.this.setNewSize(list.size());
                ScheduleAlarmViewModel.this.getDatalist().clear();
                SnapshotStateList<ScheduleAlarm> datalist = ScheduleAlarmViewModel.this.getDatalist();
                final AnonymousClass2 anonymousClass2 = new Function2<ScheduleAlarm, ScheduleAlarm, Integer>() { // from class: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel.reload.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final Integer invoke(ScheduleAlarm scheduleAlarm2, ScheduleAlarm scheduleAlarm3) {
                        return Integer.valueOf(scheduleAlarm2.fetchOrder() - scheduleAlarm3.fetchOrder());
                    }
                };
                datalist.addAll(CollectionsKt.sortedWith(list, new Comparator() { // from class: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ScheduleAlarmViewModel.AnonymousClass1.invokeSuspend$lambda$1(anonymousClass2, obj3, obj4);
                    }
                }));
                SnapshotStateList<ScheduleAlarm> datalist2 = ScheduleAlarmViewModel.this.getDatalist();
                scheduleAlarmViewModel3 = ScheduleAlarmViewModel.this;
                i = 0;
                for (ScheduleAlarm scheduleAlarm2 : datalist2) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    scheduleAlarm = scheduleAlarm2;
                    ScheduleAlarm scheduleAlarm3 = scheduleAlarmViewModel3.getDatalist().get(i);
                    it = scheduleAlarmViewModel3.getWorks().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), scheduleAlarm.getWorkUuid()));
                    scheduleAlarm3.setRefWork((ScheduleWork) next);
                    i = i3;
                }
                BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new AnonymousClass4(ScheduleAlarmViewModel.this, null), 3, null);
                CommonToolKt.mlog("reload data");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            ScheduleAlarmViewModel scheduleAlarmViewModel4 = ScheduleAlarmViewModel.this;
            scheduleAlarmViewModel4.setOldSid(scheduleAlarmViewModel4.getBaseRepository().getSid());
            scheduleAlarmViewModel = ScheduleAlarmViewModel.this;
            this.L$0 = coroutineScope;
            this.L$1 = scheduleAlarmViewModel;
            this.label = 1;
            obj = scheduleAlarmViewModel.getScheduleService().getProjectId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleAlarmViewModel.setCurrentProjectId((String) obj);
            scheduleAlarmViewModel2 = ScheduleAlarmViewModel.this;
            this.L$0 = coroutineScope;
            this.L$1 = scheduleAlarmViewModel2;
            this.label = 2;
            obj = scheduleAlarmViewModel2.getScheduleService().listCurrentWorkData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope2 = coroutineScope;
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                if (!((ScheduleWork) obj2).getComplex()) {
                    arrayList.add(obj2);
                }
            }
            scheduleAlarmViewModel2.setWorks(arrayList);
            this.L$0 = coroutineScope2;
            this.L$1 = null;
            this.label = 3;
            obj = ScheduleAlarmViewModel.this.getScheduleService().loadCurrentAlarmDataWithNextTime(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope3 = coroutineScope2;
            List list2 = (List) obj;
            ScheduleAlarmViewModel.this.setNewSize(list2.size());
            ScheduleAlarmViewModel.this.getDatalist().clear();
            SnapshotStateList<ScheduleAlarm> datalist3 = ScheduleAlarmViewModel.this.getDatalist();
            final Function2 anonymousClass3 = new Function2<ScheduleAlarm, ScheduleAlarm, Integer>() { // from class: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel.reload.1.2
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(ScheduleAlarm scheduleAlarm4, ScheduleAlarm scheduleAlarm5) {
                    return Integer.valueOf(scheduleAlarm4.fetchOrder() - scheduleAlarm5.fetchOrder());
                }
            };
            datalist3.addAll(CollectionsKt.sortedWith(list2, new Comparator() { // from class: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return ScheduleAlarmViewModel.AnonymousClass1.invokeSuspend$lambda$1(anonymousClass3, obj3, obj4);
                }
            }));
            SnapshotStateList<ScheduleAlarm> datalist4 = ScheduleAlarmViewModel.this.getDatalist();
            scheduleAlarmViewModel3 = ScheduleAlarmViewModel.this;
            i = 0;
            while (r12.hasNext()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                scheduleAlarm = scheduleAlarm2;
                ScheduleAlarm scheduleAlarm4 = scheduleAlarmViewModel3.getDatalist().get(i);
                it = scheduleAlarmViewModel3.getWorks().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), scheduleAlarm.getWorkUuid()));
                scheduleAlarm4.setRefWork((ScheduleWork) next);
                i = i4;
            }
            BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new AnonymousClass4(ScheduleAlarmViewModel.this, null), 3, null);
            CommonToolKt.mlog("reload data");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$reload$1$4", f = "ScheduleAlarmViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ScheduleAlarmViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ScheduleAlarmViewModel scheduleAlarmViewModel, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = scheduleAlarmViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.getScheduleService().makeNotify(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void initModel(ScheduleAlarm model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
        setEditItem(model);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$save$1", f = "ScheduleAlarmViewModel.kt", i = {}, l = {92, 96}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAlarmViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strIsValid = ScheduleAlarmViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    ScheduleAlarmViewModel.this.getEditItem().setOpened(true);
                    if (ScheduleAlarmViewModel.this.getEditItem().isAdd()) {
                        ScheduleAlarmViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                        ScheduleAlarmViewModel.this.getEditItem().setProjectUuid(ScheduleAlarmViewModel.this.getCurrentProjectId());
                        this.label = 1;
                        if (ScheduleAlarmViewModel.this.getScheduleService().getAlarmDao().insert(ScheduleAlarmViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleAlarmViewModel.this.getBaseRepository().toast("添加成功");
                        ScheduleAlarmViewModel.this.getBaseRepository().reload();
                        ScheduleAlarmViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                    } else {
                        this.label = 2;
                        if (ScheduleAlarmViewModel.this.getScheduleService().getAlarmDao().update(ScheduleAlarmViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleAlarmViewModel.this.getBaseRepository().toast("编辑成功");
                        ScheduleAlarmViewModel.this.getBaseRepository().reload();
                        ScheduleAlarmViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                    }
                } else {
                    ScheduleAlarmViewModel.this.getBaseRepository().toast(strIsValid);
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ScheduleAlarmViewModel.this.getBaseRepository().toast("添加成功");
                ScheduleAlarmViewModel.this.getBaseRepository().reload();
                ScheduleAlarmViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScheduleAlarmViewModel.this.getBaseRepository().toast("编辑成功");
                ScheduleAlarmViewModel.this.getBaseRepository().reload();
                ScheduleAlarmViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void save(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    public final void doChangeState(ScheduleAlarm alarm, boolean flag) {
        Intrinsics.checkNotNullParameter(alarm, "alarm");
        CommonToolKt.mlog("new state", Boolean.valueOf(flag));
        alarm.setOpened(flag);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(alarm, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$doChangeState$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$doChangeState$1", f = "ScheduleAlarmViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleAlarm $alarm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleAlarm scheduleAlarm, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$alarm = scheduleAlarm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAlarmViewModel.this.new AnonymousClass1(this.$alarm, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleAlarmViewModel.this.getScheduleService().getAlarmDao().update(this.$alarm, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleAlarmViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$doDelete$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleAlarmViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel$doDelete$1", f = "ScheduleAlarmViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAlarmViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScheduleAlarmViewModel.this.getScheduleService().getAlarmDao().delete(ScheduleAlarmViewModel.this.getEditItem(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleAlarmViewModel.this.resetForm();
            ScheduleAlarmViewModel.this.getBaseRepository().reload();
            CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void doDelete(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }
}