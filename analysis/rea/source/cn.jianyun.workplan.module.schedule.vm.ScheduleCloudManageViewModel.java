package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.base.model.BasicCloudData;
import cn.jianyun.workplan.main.base.service.BaseService;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseCloudViewModel;
import cn.jianyun.workplan.module.schedule.model.ScheduleBackupData;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001dH\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\b\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleCloudManageViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseCloudViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "baseService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getBaseService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "<set-?>", "Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;", "currentBackupData", "getCurrentBackupData", "()Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;", "setCurrentBackupData", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleBackupData;)V", "currentBackupData$delegate", "Landroidx/compose/runtime/MutableState;", "", "", "currentList", "getCurrentList", "()Ljava/util/List;", "setCurrentList", "(Ljava/util/List;)V", "currentList$delegate", "changeBackType", "", "type", "doAddImport", "it", "Lcn/jianyun/workplan/module/schedule/model/ScheduleProject;", "doBatchImport", "doCoverImport", "doNewImport", "getCloudService", "Lcn/jianyun/workplan/main/base/service/BaseService;", "loadBackupData", "cloudData", "Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleCloudManageViewModel extends BaseCloudViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final ScheduleService baseService;

    /* JADX INFO: renamed from: currentBackupData$delegate, reason: from kotlin metadata */
    private final MutableState currentBackupData;

    /* JADX INFO: renamed from: currentList$delegate, reason: from kotlin metadata */
    private final MutableState currentList;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getBaseService() {
        return this.baseService;
    }

    @Inject
    public ScheduleCloudManageViewModel(BaseRepository baseRepository, ScheduleService baseService) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(baseService, "baseService");
        this.baseRepository = baseRepository;
        this.baseService = baseService;
        this.currentBackupData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ScheduleBackupData(null, null, null, null, null, null, 63, null), null, 2, null);
        this.currentList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScheduleBackupData getCurrentBackupData() {
        return (ScheduleBackupData) this.currentBackupData.getValue();
    }

    public final void setCurrentBackupData(ScheduleBackupData scheduleBackupData) {
        Intrinsics.checkNotNullParameter(scheduleBackupData, "<set-?>");
        this.currentBackupData.setValue(scheduleBackupData);
    }

    public final List<String> getCurrentList() {
        return (List) this.currentList.getValue();
    }

    public final void setCurrentList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.currentList.setValue(list);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseCloudViewModel
    public BaseService getCloudService() {
        return this.baseService;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$changeBackType$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$changeBackType$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {46, 47}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $type;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleCloudManageViewModel scheduleCloudManageViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleCloudManageViewModel.this.setBackType(this.$type);
                if (Intrinsics.areEqual(this.$type, "local")) {
                    ScheduleCloudManageViewModel scheduleCloudManageViewModel2 = ScheduleCloudManageViewModel.this;
                    scheduleCloudManageViewModel2.setDatalist(scheduleCloudManageViewModel2.getLocalDatalist());
                } else {
                    if (!ScheduleCloudManageViewModel.this.getHasLoadCloud()) {
                        this.label = 1;
                        if (ScheduleCloudManageViewModel.this.getBaseRepository().loading(true, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    ScheduleCloudManageViewModel scheduleCloudManageViewModel3 = ScheduleCloudManageViewModel.this;
                    scheduleCloudManageViewModel3.setDatalist(scheduleCloudManageViewModel3.getCloudDatalist());
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scheduleCloudManageViewModel = (ScheduleCloudManageViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            scheduleCloudManageViewModel.setCloudDatalist((List) obj);
            ScheduleCloudManageViewModel.this.getBaseRepository().finish();
            ScheduleCloudManageViewModel.this.setHasLoadCloud(true);
            ScheduleCloudManageViewModel scheduleCloudManageViewModel4 = ScheduleCloudManageViewModel.this;
            scheduleCloudManageViewModel4.setDatalist(scheduleCloudManageViewModel4.getCloudDatalist());
            return Unit.INSTANCE;
            ScheduleCloudManageViewModel scheduleCloudManageViewModel5 = ScheduleCloudManageViewModel.this;
            this.L$0 = scheduleCloudManageViewModel5;
            this.label = 2;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C02501(ScheduleCloudManageViewModel.this, null), this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleCloudManageViewModel = scheduleCloudManageViewModel5;
            obj = objWithContext;
            scheduleCloudManageViewModel.setCloudDatalist((List) obj);
            ScheduleCloudManageViewModel.this.getBaseRepository().finish();
            ScheduleCloudManageViewModel.this.setHasLoadCloud(true);
            ScheduleCloudManageViewModel scheduleCloudManageViewModel6 = ScheduleCloudManageViewModel.this;
            scheduleCloudManageViewModel6.setDatalist(scheduleCloudManageViewModel6.getCloudDatalist());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$changeBackType$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$changeBackType$1$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
        static final class C02501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BasicCloudData>>, Object> {
            int label;
            final /* synthetic */ ScheduleCloudManageViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02501(ScheduleCloudManageViewModel scheduleCloudManageViewModel, Continuation<? super C02501> continuation) {
                super(2, continuation);
                this.this$0 = scheduleCloudManageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02501(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends BasicCloudData>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<BasicCloudData>>) continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<BasicCloudData>> continuation) {
                return ((C02501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = this.this$0.getCloudService().loadWebDavCloudFiles(this.this$0.getWebDavUser(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseCloudViewModel
    public void changeBackType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(type, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$loadBackupData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$loadBackupData$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {60, 61, 68}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BasicCloudData $cloudData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BasicCloudData basicCloudData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cloudData = basicCloudData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(this.$cloudData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        /* JADX WARN: Code duplicated, block: B:21:0x0063  */
        /* JADX WARN: Code duplicated, block: B:23:0x0090 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0091  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac A[LOOP:0: B:26:0x00a6->B:28:0x00ac, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ApiResult apiResult;
            ScheduleCloudManageViewModel scheduleCloudManageViewModel;
            Object list;
            ScheduleCloudManageViewModel scheduleCloudManageViewModel2;
            ArrayList arrayList;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (!apiResult.getSuccess()) {
                            ScheduleCloudManageViewModel.this.getBaseRepository().toast("读取失败，请联系开发者");
                        } else {
                            ScheduleCloudManageViewModel.this.setCurrentCloudData(this.$cloudData);
                            ScheduleCloudManageViewModel.this.setCurrentBackupData(ScheduleBackupData.INSTANCE.parse(apiResult.fetchResult()));
                            scheduleCloudManageViewModel = ScheduleCloudManageViewModel.this;
                            this.L$0 = scheduleCloudManageViewModel;
                            this.label = 3;
                            list = scheduleCloudManageViewModel.getBaseService().getScheduleProjectDao().list(this);
                            if (list == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            scheduleCloudManageViewModel2 = scheduleCloudManageViewModel;
                            obj = list;
                        }
                        ScheduleCloudManageViewModel.this.getBaseRepository().finish();
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scheduleCloudManageViewModel2 = (ScheduleCloudManageViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ScheduleProject) it.next()).getUuid());
                }
                scheduleCloudManageViewModel2.setCurrentList(arrayList);
                ScheduleCloudManageViewModel.this.setFormType(new FormType("showBackupData", null, null, 6, null));
                ScheduleCloudManageViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ScheduleCloudManageViewModel.this.getBaseRepository().loading(true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 2;
            obj = ScheduleCloudManageViewModel.super.loadBackData(this.$cloudData, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (!apiResult.getSuccess()) {
                ScheduleCloudManageViewModel.this.getBaseRepository().toast("读取失败，请联系开发者");
            } else {
                ScheduleCloudManageViewModel.this.setCurrentCloudData(this.$cloudData);
                ScheduleCloudManageViewModel.this.setCurrentBackupData(ScheduleBackupData.INSTANCE.parse(apiResult.fetchResult()));
                scheduleCloudManageViewModel = ScheduleCloudManageViewModel.this;
                this.L$0 = scheduleCloudManageViewModel;
                this.label = 3;
                list = scheduleCloudManageViewModel.getBaseService().getScheduleProjectDao().list(this);
                if (list == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleCloudManageViewModel2 = scheduleCloudManageViewModel;
                obj = list;
                Iterable iterable2 = (Iterable) obj;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ScheduleProject) it.next()).getUuid());
                }
                scheduleCloudManageViewModel2.setCurrentList(arrayList);
                ScheduleCloudManageViewModel.this.setFormType(new FormType("showBackupData", null, null, 6, null));
            }
            ScheduleCloudManageViewModel.this.getBaseRepository().finish();
            return Unit.INSTANCE;
        }
    }

    public final void loadBackupData(BasicCloudData cloudData) {
        Intrinsics.checkNotNullParameter(cloudData, "cloudData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(cloudData, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doAddImport$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doAddImport$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {80, 81}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleProject $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleProject scheduleProject, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = scheduleProject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(this.$it, continuation);
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
                if (BaseRepository.loading$default(ScheduleCloudManageViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
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
                ScheduleCloudManageViewModel.this.resetForm();
                ScheduleCloudManageViewModel.this.getBaseRepository().reload();
                return Unit.INSTANCE;
            }
            this.label = 2;
            if (ScheduleCloudManageViewModel.this.getBaseService().increaseByProject(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this.$it, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleCloudManageViewModel.this.resetForm();
            ScheduleCloudManageViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void doAddImport(ScheduleProject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doCoverImport$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doCoverImport$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {89, 91, 92, 94}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleProject $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleProject scheduleProject, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = scheduleProject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0071 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0092 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(ScheduleCloudManageViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    if (ScheduleCloudManageViewModel.this.getBaseService().writeByProject(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this.$it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ScheduleCloudManageViewModel.this.getBaseRepository().finish();
                    this.label = 4;
                    if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    ScheduleCloudManageViewModel.this.getBaseRepository().finish();
                    this.label = 4;
                    if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleCloudManageViewModel.this.resetForm();
                ScheduleCloudManageViewModel.this.getBaseRepository().reload();
                return Unit.INSTANCE;
            }
            this.label = 2;
            if (ScheduleCloudManageViewModel.this.getBaseService().deleteByProject(this.$it, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 3;
            if (ScheduleCloudManageViewModel.this.getBaseService().writeByProject(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this.$it, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleCloudManageViewModel.this.getBaseRepository().finish();
            this.label = 4;
            if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleCloudManageViewModel.this.resetForm();
            ScheduleCloudManageViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void doCoverImport(ScheduleProject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doNewImport$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doNewImport$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {102, 104, 105}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScheduleProject $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScheduleProject scheduleProject, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = scheduleProject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(ScheduleCloudManageViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleCloudManageViewModel.this.resetForm();
                ScheduleCloudManageViewModel.this.getBaseRepository().reload();
                return Unit.INSTANCE;
            }
            this.label = 2;
            if (ScheduleCloudManageViewModel.this.getBaseService().writeByProject(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this.$it, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 3;
            if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(this.$it.getUuid(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleCloudManageViewModel.this.resetForm();
            ScheduleCloudManageViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void doNewImport(ScheduleProject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doBatchImport$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCloudManageViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel$doBatchImport$1", f = "ScheduleCloudManageViewModel.kt", i = {}, l = {114, 115, 116, 117}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleCloudManageViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(ScheduleCloudManageViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    if (ScheduleCloudManageViewModel.this.getBaseService().writeAll(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 4;
                    if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(ScheduleCloudManageViewModel.this.getCurrentBackupData().getProjectList().get(0).getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 4;
                    if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(ScheduleCloudManageViewModel.this.getCurrentBackupData().getProjectList().get(0).getUuid(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleCloudManageViewModel.this.resetForm();
                ScheduleCloudManageViewModel.this.getBaseRepository().reload();
                return Unit.INSTANCE;
            }
            this.label = 2;
            if (ScheduleCloudManageViewModel.this.getBaseService().clearAll(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 3;
            if (ScheduleCloudManageViewModel.this.getBaseService().writeAll(ScheduleCloudManageViewModel.this.getCurrentBackupData(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 4;
            if (ScheduleCloudManageViewModel.this.getBaseService().setProjectId(ScheduleCloudManageViewModel.this.getCurrentBackupData().getProjectList().get(0).getUuid(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleCloudManageViewModel.this.resetForm();
            ScheduleCloudManageViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseCloudViewModel
    public void doBatchImport() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}