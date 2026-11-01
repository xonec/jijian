package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.CommonToolKt;
import com.alibaba.fastjson2.JSON;
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

/* JADX INFO: compiled from: SchedulePlanViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0014\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\nJ\u0014\u0010-\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\nJ\b\u0010.\u001a\u00020\u0003H\u0016J\u000e\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u000bJ\b\u00101\u001a\u00020'H\u0016J\u0010\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u0019H\u0016J\u000e\u00104\u001a\u00020'2\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001f0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00065"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/SchedulePlanViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "datalist", "getDatalist", "()Ljava/util/List;", "setDatalist", "(Ljava/util/List;)V", "datalist$delegate", "Landroidx/compose/runtime/MutableState;", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "setEditItem", "(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;)V", "editItem$delegate", "", "isDelete", "()Z", "setDelete", "(Z)V", "isDelete$delegate", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "plans", "getPlans", "setPlans", "plans$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "doDelete", "", "navHostController", "Landroidx/navigation/NavHostController;", "doSort", "newOrderList", "", "doSortWork", "getRepository", "initModel", "model", "reload", "reloadData", "dataChanged", "save", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SchedulePlanViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: datalist$delegate, reason: from kotlin metadata */
    private final MutableState datalist;

    /* JADX INFO: renamed from: editItem$delegate, reason: from kotlin metadata */
    private final MutableState editItem;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    private final MutableState isDelete;

    /* JADX INFO: renamed from: plans$delegate, reason: from kotlin metadata */
    private final MutableState plans;
    private final ScheduleService scheduleService;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    @Inject
    public SchedulePlanViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.plans = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SchedulePlan(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, 131071, null), null, 2, null);
        this.datalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        setCurrentPage("SchedulePlanView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    public final List<ScheduleWork> getPlans() {
        return (List) this.plans.getValue();
    }

    public final void setPlans(List<ScheduleWork> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.plans.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SchedulePlan getEditItem() {
        return (SchedulePlan) this.editItem.getValue();
    }

    public final void setEditItem(SchedulePlan schedulePlan) {
        Intrinsics.checkNotNullParameter(schedulePlan, "<set-?>");
        this.editItem.setValue(schedulePlan);
    }

    public final List<SchedulePlan> getDatalist() {
        return (List) this.datalist.getValue();
    }

    public final void setDatalist(List<SchedulePlan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist.setValue(list);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: SchedulePlanViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$reload$1", f = "SchedulePlanViewModel.kt", i = {}, l = {49, 50, 51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SchedulePlanViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SchedulePlanViewModel schedulePlanViewModel;
            SchedulePlanViewModel schedulePlanViewModel2;
            SchedulePlanViewModel schedulePlanViewModel3;
            Object objListCurrentPlanData;
            SchedulePlanViewModel schedulePlanViewModel4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SchedulePlanViewModel schedulePlanViewModel5 = SchedulePlanViewModel.this;
                schedulePlanViewModel5.setOldSid(schedulePlanViewModel5.getBaseRepository().getSid());
                schedulePlanViewModel = SchedulePlanViewModel.this;
                this.L$0 = schedulePlanViewModel;
                this.label = 1;
                obj = schedulePlanViewModel.getScheduleService().getProjectId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    schedulePlanViewModel = (SchedulePlanViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    schedulePlanViewModel2 = (SchedulePlanViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    schedulePlanViewModel2.setPlans((List) obj);
                    schedulePlanViewModel3 = SchedulePlanViewModel.this;
                    this.L$0 = schedulePlanViewModel3;
                    this.label = 3;
                    objListCurrentPlanData = schedulePlanViewModel3.getScheduleService().listCurrentPlanData(this);
                    if (objListCurrentPlanData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    schedulePlanViewModel4 = schedulePlanViewModel3;
                    obj = objListCurrentPlanData;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    schedulePlanViewModel4 = (SchedulePlanViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                schedulePlanViewModel4.setDatalist((List) obj);
                CommonToolKt.mlog("reload data");
                return Unit.INSTANCE;
            }
            schedulePlanViewModel.setCurrentProjectId((String) obj);
            schedulePlanViewModel2 = SchedulePlanViewModel.this;
            this.L$0 = schedulePlanViewModel2;
            this.label = 2;
            obj = schedulePlanViewModel2.getScheduleService().listCurrentWorkData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            schedulePlanViewModel2.setPlans((List) obj);
            schedulePlanViewModel3 = SchedulePlanViewModel.this;
            this.L$0 = schedulePlanViewModel3;
            this.label = 3;
            objListCurrentPlanData = schedulePlanViewModel3.getScheduleService().listCurrentPlanData(this);
            if (objListCurrentPlanData == coroutine_suspended) {
                return coroutine_suspended;
            }
            schedulePlanViewModel4 = schedulePlanViewModel3;
            obj = objListCurrentPlanData;
            schedulePlanViewModel4.setDatalist((List) obj);
            CommonToolKt.mlog("reload data");
            return Unit.INSTANCE;
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

    public final void initModel(SchedulePlan model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
        setEditItem(model);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: SchedulePlanViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$save$1", f = "SchedulePlanViewModel.kt", i = {}, l = {79, 88}, m = "invokeSuspend", n = {}, s = {})
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
            return SchedulePlanViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
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
                String strIsValid = SchedulePlanViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    if (SchedulePlanViewModel.this.getEditItem().isAdd()) {
                        List<SchedulePlan> datalist = SchedulePlanViewModel.this.getDatalist();
                        SchedulePlanViewModel schedulePlanViewModel = SchedulePlanViewModel.this;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : datalist) {
                            if (Intrinsics.areEqual(schedulePlanViewModel.getEditItem().getName(), ((SchedulePlan) obj2).getName())) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            SchedulePlanViewModel.this.getBaseRepository().toast("存在相同名称");
                            return Unit.INSTANCE;
                        }
                        SchedulePlanViewModel.this.getEditItem().setProjectUuid(SchedulePlanViewModel.this.getCurrentProjectId());
                        SchedulePlanViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                        this.label = 1;
                        if (SchedulePlanViewModel.this.getScheduleService().getSchedulePlanDao().insert(SchedulePlanViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SchedulePlanViewModel.this.getEditItem().setOrdinal(SchedulePlanViewModel.this.getDatalist().size() + 100);
                        SchedulePlanViewModel.this.getBaseRepository().toast("添加成功");
                        SchedulePlanViewModel.this.getBaseRepository().reload();
                        SchedulePlanViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                    } else {
                        List<SchedulePlan> datalist2 = SchedulePlanViewModel.this.getDatalist();
                        SchedulePlanViewModel schedulePlanViewModel2 = SchedulePlanViewModel.this;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : datalist2) {
                            if (Intrinsics.areEqual(schedulePlanViewModel2.getEditItem().getName(), ((SchedulePlan) obj3).getName())) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.size() == 2) {
                            SchedulePlanViewModel.this.getBaseRepository().toast("存在相同名称");
                            return Unit.INSTANCE;
                        }
                        this.label = 2;
                        if (SchedulePlanViewModel.this.getScheduleService().getSchedulePlanDao().update(SchedulePlanViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SchedulePlanViewModel.this.getBaseRepository().toast("编辑成功");
                        SchedulePlanViewModel.this.getBaseRepository().reload();
                        SchedulePlanViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                    }
                } else {
                    SchedulePlanViewModel.this.getBaseRepository().toast(strIsValid);
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                SchedulePlanViewModel.this.getEditItem().setOrdinal(SchedulePlanViewModel.this.getDatalist().size() + 100);
                SchedulePlanViewModel.this.getBaseRepository().toast("添加成功");
                SchedulePlanViewModel.this.getBaseRepository().reload();
                SchedulePlanViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SchedulePlanViewModel.this.getBaseRepository().toast("编辑成功");
                SchedulePlanViewModel.this.getBaseRepository().reload();
                SchedulePlanViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void save(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doDelete$1, reason: invalid class name */
    /* JADX INFO: compiled from: SchedulePlanViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doDelete$1", f = "SchedulePlanViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
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
            return SchedulePlanViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
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
                if (SchedulePlanViewModel.this.getScheduleService().getSchedulePlanDao().delete(SchedulePlanViewModel.this.getEditItem(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SchedulePlanViewModel.this.resetForm();
            SchedulePlanViewModel.this.getBaseRepository().reload();
            CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void doDelete(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSort$1, reason: invalid class name */
    /* JADX INFO: compiled from: SchedulePlanViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSort$1", f = "SchedulePlanViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
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
            return SchedulePlanViewModel.this.new AnonymousClass1(this.$newOrderList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SchedulePlanViewModel schedulePlanViewModel;
            List<String> list;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<SchedulePlan> datalist = SchedulePlanViewModel.this.getDatalist();
                List<String> list2 = this.$newOrderList;
                schedulePlanViewModel = SchedulePlanViewModel.this;
                list = list2;
                it = datalist.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                schedulePlanViewModel = (SchedulePlanViewModel) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                SchedulePlan schedulePlan = (SchedulePlan) it.next();
                schedulePlan.setOrdinal(list.indexOf(schedulePlan.getUuid()));
                SchedulePlanDao schedulePlanDao = schedulePlanViewModel.getScheduleService().getSchedulePlanDao();
                this.L$0 = list;
                this.L$1 = schedulePlanViewModel;
                this.L$2 = it;
                this.label = 1;
                if (schedulePlanDao.update(schedulePlan, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SchedulePlanViewModel.this.reload();
            return Unit.INSTANCE;
        }
    }

    public final void doSort(List<String> newOrderList) {
        Intrinsics.checkNotNullParameter(newOrderList, "newOrderList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newOrderList, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSortWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: SchedulePlanViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSortWork$1", f = "SchedulePlanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $newOrderList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newOrderList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SchedulePlanViewModel.this.new AnonymousClass1(this.$newOrderList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<ScheduleWork> listFetchPlans = SchedulePlanViewModel.this.getEditItem().fetchPlans();
            List<String> list = this.$newOrderList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFetchPlans, 10));
            for (ScheduleWork scheduleWork : listFetchPlans) {
                scheduleWork.setOrdinal(list.indexOf(scheduleWork.getSubId()));
                arrayList.add(scheduleWork);
            }
            final SchedulePlanViewModel$doSortWork$1$newWorks$2 schedulePlanViewModel$doSortWork$1$newWorks$2 = new Function2<ScheduleWork, ScheduleWork, Integer>() { // from class: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSortWork$1$newWorks$2
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(ScheduleWork scheduleWork2, ScheduleWork scheduleWork3) {
                    return Integer.valueOf(scheduleWork2.getOrdinal() - scheduleWork3.getOrdinal());
                }
            };
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel$doSortWork$1$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return SchedulePlanViewModel.AnonymousClass1.invokeSuspend$lambda$1(schedulePlanViewModel$doSortWork$1$newWorks$2, obj2, obj3);
                }
            });
            SchedulePlanViewModel schedulePlanViewModel = SchedulePlanViewModel.this;
            SchedulePlan editItem = schedulePlanViewModel.getEditItem();
            String jSONString = JSON.toJSONString(listSortedWith);
            Intrinsics.checkNotNullExpressionValue(jSONString, "newWorks.toJSONString()");
            schedulePlanViewModel.setEditItem(editItem.copy((130815 & 1) != 0 ? editItem.uuid : null, (130815 & 2) != 0 ? editItem.name : null, (130815 & 4) != 0 ? editItem.userId : null, (130815 & 8) != 0 ? editItem.gmtBegin : null, (130815 & 16) != 0 ? editItem.gmtEnd : null, (130815 & 32) != 0 ? editItem.remark : null, (130815 & 64) != 0 ? editItem.theme : null, (130815 & 128) != 0 ? editItem.projectUuid : null, (130815 & 256) != 0 ? editItem.config : jSONString, (130815 & 512) != 0 ? editItem.ordinal : 0, (130815 & 1024) != 0 ? editItem.state : 0, (130815 & 2048) != 0 ? editItem.gmtCreate : null, (130815 & 4096) != 0 ? editItem.extField1 : null, (130815 & 8192) != 0 ? editItem.extField2 : null, (130815 & 16384) != 0 ? editItem.extField3 : null, (130815 & 32768) != 0 ? editItem.cc : 0, (130815 & 65536) != 0 ? editItem.cid : null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }
    }

    public final void doSortWork(List<String> newOrderList) {
        Intrinsics.checkNotNullParameter(newOrderList, "newOrderList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newOrderList, null), 3, null);
    }
}