package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.CommonToolKt;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: ScheduleWorkViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010,\u001a\u00020\u0013J\u0006\u0010-\u001a\u00020\u0013J\b\u0010.\u001a\u00020\u0003H\u0016J\u000e\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u0013J\b\u00101\u001a\u00020'H\u0016J\u0010\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u001eH\u0016J\u000e\u00104\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00130\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R+\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "", "choosedWorks", "getChoosedWorks", "()Ljava/util/List;", "setChoosedWorks", "(Ljava/util/List;)V", "choosedWorks$delegate", "Landroidx/compose/runtime/MutableState;", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "datalist", "getDatalist", "setDatalist", "datalist$delegate", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "setEditItem", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;)V", "editItem$delegate", "", "isDelete", "()Z", "setDelete", "(Z)V", "isDelete$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "doDelete", "", "navHostController", "Landroidx/navigation/NavHostController;", "doSort", "newOrderList", "fetchFirstWork", "fetchSecondWork", "getRepository", "initModel", "model", "reload", "reloadData", "dataChanged", "save", "toggleWork", "workUuid", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleWorkViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: choosedWorks$delegate, reason: from kotlin metadata */
    private final MutableState choosedWorks;

    /* JADX INFO: renamed from: datalist$delegate, reason: from kotlin metadata */
    private final MutableState datalist;

    /* JADX INFO: renamed from: editItem$delegate, reason: from kotlin metadata */
    private final MutableState editItem;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    private final MutableState isDelete;
    private final ScheduleService scheduleService;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    @Inject
    public ScheduleWorkViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.datalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null), null, 2, null);
        this.choosedWorks = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        setCurrentPage("ScheduleWorkView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    public final List<ScheduleWork> getDatalist() {
        return (List) this.datalist.getValue();
    }

    public final void setDatalist(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleWork getEditItem() {
        return (ScheduleWork) this.editItem.getValue();
    }

    public final void setEditItem(ScheduleWork scheduleWork) {
        Intrinsics.checkNotNullParameter(scheduleWork, "<set-?>");
        this.editItem.setValue(scheduleWork);
    }

    public final List<String> getChoosedWorks() {
        return (List) this.choosedWorks.getValue();
    }

    public final void setChoosedWorks(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.choosedWorks.setValue(list);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        setOldSid(this.baseRepository.getSid());
        reloadData(false);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$reloadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleWorkViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$reloadData$1", f = "ScheduleWorkViewModel.kt", i = {}, l = {53, 54}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleWorkViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleWorkViewModel scheduleWorkViewModel;
            ScheduleWorkViewModel scheduleWorkViewModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                scheduleWorkViewModel = ScheduleWorkViewModel.this;
                this.L$0 = scheduleWorkViewModel;
                this.label = 1;
                obj = scheduleWorkViewModel.getScheduleService().getProjectId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    scheduleWorkViewModel = (ScheduleWorkViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scheduleWorkViewModel2 = (ScheduleWorkViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scheduleWorkViewModel2.setDatalist((List) obj);
                return Unit.INSTANCE;
            }
            scheduleWorkViewModel.setCurrentProjectId((String) obj);
            ScheduleWorkViewModel scheduleWorkViewModel3 = ScheduleWorkViewModel.this;
            this.L$0 = scheduleWorkViewModel3;
            this.label = 2;
            Object objListCurrentWorkData = scheduleWorkViewModel3.getScheduleService().listCurrentWorkData(this);
            if (objListCurrentWorkData == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleWorkViewModel2 = scheduleWorkViewModel3;
            obj = objListCurrentWorkData;
            scheduleWorkViewModel2.setDatalist((List) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void initModel(ScheduleWork model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
        setEditItem(model);
        if (model.getComplex()) {
            List array = JSON.parseArray(model.getConfig(), ScheduleWork.class);
            Intrinsics.checkNotNullExpressionValue(array, "parseArray(model.config, ScheduleWork::class.java)");
            List list = array;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ScheduleWork) it.next()).getUuid());
            }
            setChoosedWorks(arrayList);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleWorkViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$save$1", f = "ScheduleWorkViewModel.kt", i = {}, l = {94, 114, 118, 129, 132}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleWorkViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x036e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:112:0x034a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:0x034b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:115:0x02e9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:0x02c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:122:0x0327 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x027b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x021c  */
        /* JADX WARN: Code duplicated, block: B:68:0x0238  */
        /* JADX WARN: Code duplicated, block: B:71:0x0255  */
        /* JADX WARN: Code duplicated, block: B:73:0x025d  */
        /* JADX WARN: Code duplicated, block: B:76:0x0274  */
        /* JADX WARN: Code duplicated, block: B:80:0x029e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:88:0x02cd  */
        /* JADX WARN: Code duplicated, block: B:93:0x0301  */
        /* JADX WARN: Code duplicated, block: B:95:0x0309  */
        /* JADX WARN: Code duplicated, block: B:98:0x0320  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0236 -> B:81:0x029f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x029c -> B:81:0x029f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 938
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void save(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doDelete$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleWorkViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doDelete$1", f = "ScheduleWorkViewModel.kt", i = {}, l = {150, 152}, m = "invokeSuspend", n = {}, s = {})
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
            return ScheduleWorkViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
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
                CommonToolKt.mlog(ScheduleWorkViewModel.this.getEditItem());
                this.label = 1;
                obj = ScheduleWorkViewModel.this.getScheduleService().isWorkUsed(ScheduleWorkViewModel.this.getEditItem().getUuid(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleWorkViewModel.this.resetForm();
                ScheduleWorkViewModel.this.getBaseRepository().reload();
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                return Unit.INSTANCE;
            }
            String str = (String) obj;
            if (CommonToolKt.isOk(str)) {
                this.label = 2;
                if (ScheduleWorkViewModel.this.getScheduleService().getScheduleWorkDao().delete(ScheduleWorkViewModel.this.getEditItem(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ScheduleWorkViewModel.this.resetForm();
                ScheduleWorkViewModel.this.getBaseRepository().reload();
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            } else {
                ScheduleWorkViewModel.this.resetForm();
                ScheduleWorkViewModel.super.toast(str);
            }
            return Unit.INSTANCE;
        }
    }

    public final void doDelete(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    public final void toggleWork(String workUuid) {
        Intrinsics.checkNotNullParameter(workUuid, "workUuid");
        if (getChoosedWorks().contains(workUuid)) {
            List<String> choosedWorks = getChoosedWorks();
            ArrayList arrayList = new ArrayList();
            for (Object obj : choosedWorks) {
                if (!Intrinsics.areEqual((String) obj, workUuid)) {
                    arrayList.add(obj);
                }
            }
            setChoosedWorks(arrayList);
            return;
        }
        if (getChoosedWorks().size() == 2) {
            this.baseRepository.toast("最多选择两个普通班次");
            return;
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) getChoosedWorks());
        mutableList.add(workUuid);
        setChoosedWorks(mutableList);
    }

    public final ScheduleWork fetchFirstWork() {
        Object next;
        if (getChoosedWorks().isEmpty() || getDatalist().isEmpty()) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        Iterator<T> it = getDatalist().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), getChoosedWorks().get(0)));
        ScheduleWork scheduleWork = (ScheduleWork) next;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }

    public final ScheduleWork fetchSecondWork() {
        Object next;
        if (getChoosedWorks().size() < 2 || getDatalist().isEmpty()) {
            return new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
        }
        Iterator<T> it = getDatalist().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), getChoosedWorks().get(1)));
        ScheduleWork scheduleWork = (ScheduleWork) next;
        return scheduleWork == null ? new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null) : scheduleWork;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doSort$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleWorkViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel$doSort$1", f = "ScheduleWorkViewModel.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $newOrderList;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newOrderList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleWorkViewModel.this.new AnonymousClass1(this.$newOrderList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleWorkViewModel scheduleWorkViewModel;
            List<String> list;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<ScheduleWork> datalist = ScheduleWorkViewModel.this.getDatalist();
                List<String> list2 = this.$newOrderList;
                scheduleWorkViewModel = ScheduleWorkViewModel.this;
                list = list2;
                it = datalist.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                scheduleWorkViewModel = (ScheduleWorkViewModel) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                ScheduleWork scheduleWork = (ScheduleWork) it.next();
                scheduleWork.setOrdinal(list.indexOf(scheduleWork.getUuid()));
                ScheduleWorkDao scheduleWorkDao = scheduleWorkViewModel.getScheduleService().getScheduleWorkDao();
                this.L$0 = list;
                this.L$1 = scheduleWorkViewModel;
                this.L$2 = it;
                this.label = 1;
                if (scheduleWorkDao.update(scheduleWork, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ScheduleWorkViewModel.this.reload();
            return Unit.INSTANCE;
        }
    }

    public final void doSort(List<String> newOrderList) {
        Intrinsics.checkNotNullParameter(newOrderList, "newOrderList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newOrderList, null), 3, null);
    }
}