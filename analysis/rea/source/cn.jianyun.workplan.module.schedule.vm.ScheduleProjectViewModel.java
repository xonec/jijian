package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import java.util.ArrayList;
import java.util.Collection;
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

/* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\nJ\b\u0010&\u001a\u00020\u0003H\u0016J\u0006\u0010'\u001a\u00020\"J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0006\u0010+\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleProjectViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "datalist", "getDatalist", "()Ljava/util/List;", "setDatalist", "(Ljava/util/List;)V", "datalist$delegate", "Landroidx/compose/runtime/MutableState;", "editItem", "getEditItem", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "setEditItem", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;)V", "editItem$delegate", "", "isDelete", "()Z", "setDelete", "(Z)V", "isDelete$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "doDelete", "", "doSort", "newOrderList", "", "getRepository", "makeCurrentProject", "reload", "reloadData", "dataChanged", "save", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleProjectViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

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
    public ScheduleProjectViewModel(BaseRepository baseRepository, ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.datalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.editItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleProject(null, null, null, null, 0, 0, false, null, null, null, null, 0, null, 8191, null), null, 2, null);
        setCurrentPage("ScheduleProjectView");
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    public final List<ScheduleProject> getDatalist() {
        return (List) this.datalist.getValue();
    }

    public final void setDatalist(List<ScheduleProject> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleProject getEditItem() {
        return (ScheduleProject) this.editItem.getValue();
    }

    public final void setEditItem(ScheduleProject scheduleProject) {
        Intrinsics.checkNotNullParameter(scheduleProject, "<set-?>");
        this.editItem.setValue(scheduleProject);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$reload$1", f = "ScheduleProjectViewModel.kt", i = {}, l = {43, 44, 46, 50, 51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleProjectViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x009b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x009c  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ed A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x0101 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0102  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleProjectViewModel scheduleProjectViewModel;
            ScheduleProjectViewModel scheduleProjectViewModel2;
            ScheduleProjectViewModel scheduleProjectViewModel3;
            Iterator<T> it;
            Object next;
            ScheduleProjectViewModel scheduleProjectViewModel4;
            Object projectId;
            ScheduleProjectViewModel scheduleProjectViewModel5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                scheduleProjectViewModel = ScheduleProjectViewModel.this;
                this.L$0 = scheduleProjectViewModel;
                this.label = 1;
                obj = scheduleProjectViewModel.getScheduleService().getProjectId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    scheduleProjectViewModel = (ScheduleProjectViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    scheduleProjectViewModel2 = (ScheduleProjectViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    scheduleProjectViewModel2.setDatalist((List) obj);
                    if (ScheduleProjectViewModel.this.getDatalist().isEmpty()) {
                        this.L$0 = null;
                        this.label = 3;
                        if (ScheduleProjectViewModel.this.getScheduleService().tryInitProject(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        List<ScheduleProject> datalist = ScheduleProjectViewModel.this.getDatalist();
                        scheduleProjectViewModel3 = ScheduleProjectViewModel.this;
                        it = datalist.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleProjectViewModel3.getCurrentProjectId()));
                        if (next == null) {
                            this.L$0 = null;
                            this.label = 4;
                            if (ScheduleProjectViewModel.this.getScheduleService().setProjectId(ScheduleProjectViewModel.this.getDatalist().get(0).getUuid(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            scheduleProjectViewModel4 = ScheduleProjectViewModel.this;
                            this.L$0 = scheduleProjectViewModel4;
                            this.label = 5;
                            projectId = scheduleProjectViewModel4.getScheduleService().getProjectId(this);
                            if (projectId == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            scheduleProjectViewModel5 = scheduleProjectViewModel4;
                            obj = projectId;
                            scheduleProjectViewModel5.setCurrentProjectId((String) obj);
                        }
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        scheduleProjectViewModel4 = ScheduleProjectViewModel.this;
                        this.L$0 = scheduleProjectViewModel4;
                        this.label = 5;
                        projectId = scheduleProjectViewModel4.getScheduleService().getProjectId(this);
                        if (projectId == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scheduleProjectViewModel5 = scheduleProjectViewModel4;
                        obj = projectId;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        scheduleProjectViewModel5 = (ScheduleProjectViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    scheduleProjectViewModel5.setCurrentProjectId((String) obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            scheduleProjectViewModel.setCurrentProjectId((String) obj);
            scheduleProjectViewModel2 = ScheduleProjectViewModel.this;
            this.L$0 = scheduleProjectViewModel2;
            this.label = 2;
            obj = scheduleProjectViewModel2.getScheduleService().getScheduleProjectDao().list(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleProjectViewModel2.setDatalist((List) obj);
            if (ScheduleProjectViewModel.this.getDatalist().isEmpty()) {
                this.L$0 = null;
                this.label = 3;
                if (ScheduleProjectViewModel.this.getScheduleService().tryInitProject(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                List<ScheduleProject> datalist2 = ScheduleProjectViewModel.this.getDatalist();
                scheduleProjectViewModel3 = ScheduleProjectViewModel.this;
                it = datalist2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleProjectViewModel3.getCurrentProjectId()));
                if (next == null) {
                    this.L$0 = null;
                    this.label = 4;
                    if (ScheduleProjectViewModel.this.getScheduleService().setProjectId(ScheduleProjectViewModel.this.getDatalist().get(0).getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleProjectViewModel4 = ScheduleProjectViewModel.this;
                    this.L$0 = scheduleProjectViewModel4;
                    this.label = 5;
                    projectId = scheduleProjectViewModel4.getScheduleService().getProjectId(this);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleProjectViewModel5 = scheduleProjectViewModel4;
                    obj = projectId;
                    scheduleProjectViewModel5.setCurrentProjectId((String) obj);
                }
            }
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

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$save$1", f = "ScheduleProjectViewModel.kt", i = {}, l = {75, 83}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleProjectViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strIsValid = ScheduleProjectViewModel.this.getEditItem().isValid();
                if (CommonToolKt.isOk(strIsValid)) {
                    if (ScheduleProjectViewModel.this.getEditItem().isAdd()) {
                        List<ScheduleProject> datalist = ScheduleProjectViewModel.this.getDatalist();
                        ScheduleProjectViewModel scheduleProjectViewModel = ScheduleProjectViewModel.this;
                        if (!(datalist instanceof Collection) || !datalist.isEmpty()) {
                            Iterator<T> it = datalist.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (Intrinsics.areEqual(scheduleProjectViewModel.getEditItem().getName(), ((ScheduleProject) it.next()).getName())) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        if (z) {
                            ScheduleProjectViewModel.this.getBaseRepository().toast("存在相同名称");
                            return Unit.INSTANCE;
                        }
                        ScheduleProjectViewModel.this.getEditItem().setUuid(CommonToolKt.uuid());
                        ScheduleProject editItem = ScheduleProjectViewModel.this.getEditItem();
                        String currentTime = MyDateTool.getCurrentTime();
                        Intrinsics.checkNotNullExpressionValue(currentTime, "getCurrentTime()");
                        editItem.setGmtCreate(currentTime);
                        if (ScheduleProjectViewModel.this.getDatalist().size() > 0) {
                            ScheduleProjectViewModel.this.getEditItem().setOrdinal(ScheduleProjectViewModel.this.getDatalist().get(0).getOrdinal() - 100);
                        }
                        this.label = 1;
                        if (ScheduleProjectViewModel.this.getScheduleService().getScheduleProjectDao().insert(ScheduleProjectViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleProjectViewModel.this.getBaseRepository().toast("添加成功");
                        ScheduleProjectViewModel.this.reload();
                        ScheduleProjectViewModel.this.getBaseRepository().reload();
                        ScheduleProjectViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    } else {
                        List<ScheduleProject> datalist2 = ScheduleProjectViewModel.this.getDatalist();
                        ScheduleProjectViewModel scheduleProjectViewModel2 = ScheduleProjectViewModel.this;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : datalist2) {
                            if (Intrinsics.areEqual(scheduleProjectViewModel2.getEditItem().getName(), ((ScheduleProject) obj2).getName())) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.size() == 2) {
                            ScheduleProjectViewModel.this.getBaseRepository().toast("存在相同名称");
                            return Unit.INSTANCE;
                        }
                        this.label = 2;
                        if (ScheduleProjectViewModel.this.getScheduleService().getScheduleProjectDao().update(ScheduleProjectViewModel.this.getEditItem(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ScheduleProjectViewModel.this.getBaseRepository().toast("编辑成功");
                        ScheduleProjectViewModel.this.reload();
                        ScheduleProjectViewModel.this.getBaseRepository().reload();
                        ScheduleProjectViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    }
                } else {
                    ScheduleProjectViewModel.this.getBaseRepository().toast(strIsValid);
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ScheduleProjectViewModel.this.getBaseRepository().toast("添加成功");
                ScheduleProjectViewModel.this.reload();
                ScheduleProjectViewModel.this.getBaseRepository().reload();
                ScheduleProjectViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScheduleProjectViewModel.this.getBaseRepository().toast("编辑成功");
                ScheduleProjectViewModel.this.reload();
                ScheduleProjectViewModel.this.getBaseRepository().reload();
                ScheduleProjectViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void save() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$doDelete$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$doDelete$1", f = "ScheduleProjectViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleProjectViewModel.this.new AnonymousClass1(continuation);
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
                if (ScheduleProjectViewModel.this.getScheduleService().deleteByProject(ScheduleProjectViewModel.this.getEditItem(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleProjectViewModel.this.resetForm();
            Intrinsics.areEqual(ScheduleProjectViewModel.this.getEditItem().getUuid(), ScheduleProjectViewModel.this.getCurrentProjectId());
            ScheduleProjectViewModel.this.reload();
            ScheduleProjectViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void doDelete() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$makeCurrentProject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$makeCurrentProject$1", f = "ScheduleProjectViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleProjectViewModel.this.new AnonymousClass1(continuation);
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
                ScheduleProjectViewModel scheduleProjectViewModel = ScheduleProjectViewModel.this;
                scheduleProjectViewModel.setCurrentProjectId(scheduleProjectViewModel.getEditItem().getUuid());
                this.label = 1;
                if (ScheduleProjectViewModel.this.getScheduleService().setProjectId(ScheduleProjectViewModel.this.getEditItem().getUuid(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ScheduleProjectViewModel.this.resetForm();
            ScheduleProjectViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void makeCurrentProject() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$doSort$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleProjectViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel$doSort$1", f = "ScheduleProjectViewModel.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
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
            return ScheduleProjectViewModel.this.new AnonymousClass1(this.$newOrderList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleProjectViewModel scheduleProjectViewModel;
            List<String> list;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<ScheduleProject> datalist = ScheduleProjectViewModel.this.getDatalist();
                List<String> list2 = this.$newOrderList;
                scheduleProjectViewModel = ScheduleProjectViewModel.this;
                list = list2;
                it = datalist.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                scheduleProjectViewModel = (ScheduleProjectViewModel) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                ScheduleProject scheduleProject = (ScheduleProject) it.next();
                scheduleProject.setOrdinal(list.indexOf(scheduleProject.getUuid()));
                if (Intrinsics.areEqual(scheduleProject.getGmtCreate(), "")) {
                    String currentTime = MyDateTool.getCurrentTime();
                    Intrinsics.checkNotNullExpressionValue(currentTime, "getCurrentTime()");
                    scheduleProject.setGmtCreate(currentTime);
                }
                ScheduleProjectDao scheduleProjectDao = scheduleProjectViewModel.getScheduleService().getScheduleProjectDao();
                this.L$0 = list;
                this.L$1 = scheduleProjectViewModel;
                this.L$2 = it;
                this.label = 1;
                if (scheduleProjectDao.update(scheduleProject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ScheduleProjectViewModel.this.reload();
            return Unit.INSTANCE;
        }
    }

    public final void doSort(List<String> newOrderList) {
        Intrinsics.checkNotNullParameter(newOrderList, "newOrderList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(newOrderList, null), 3, null);
    }
}