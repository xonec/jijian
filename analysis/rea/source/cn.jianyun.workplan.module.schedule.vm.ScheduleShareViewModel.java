package cn.jianyun.workplan.module.schedule.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.api.ScheduleShareApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import cn.jianyun.workplan.module.schedule.model.IosAlarmDO;
import cn.jianyun.workplan.module.schedule.model.IosDutyDO;
import cn.jianyun.workplan.module.schedule.model.IosProjectDO;
import cn.jianyun.workplan.module.schedule.model.IosSchedulePlanDO;
import cn.jianyun.workplan.module.schedule.model.IosWorkPlanDO;
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.model.ScheduleShareData;
import cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt;
import cn.jianyun.workplan.module.schedule.model.ScheduleSharePostData;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.util.MyRandomTool;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.poi.hssf.record.UnknownRecord;

/* JADX INFO: compiled from: ScheduleShareViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010/\u001a\u000200H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J\u0006\u00102\u001a\u000203J\u0016\u00104\u001a\u0002032\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020306J\u0006\u00107\u001a\u000203J\b\u00108\u001a\u00020\u0003H\u0016J\u0019\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020;H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010<J\b\u0010=\u001a\u000203H\u0016J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020(H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R+\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R+\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R+\u0010)\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0013\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lcn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "shareApi", "Lcn/jianyun/workplan/api/ScheduleShareApi;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lcn/jianyun/workplan/api/ScheduleShareApi;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "currentProjectName", "getCurrentProjectName", "()Ljava/lang/String;", "setCurrentProjectName", "(Ljava/lang/String;)V", "currentProjectName$delegate", "Landroidx/compose/runtime/MutableState;", "importSecret", "getImportSecret", "setImportSecret", "importSecret$delegate", "newProjectName", "getNewProjectName", "setNewProjectName", "newProjectName$delegate", "page", "getPage", "setPage", "page$delegate", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "getShareApi", "()Lcn/jianyun/workplan/api/ScheduleShareApi;", "shareSecret", "getShareSecret", "setShareSecret", "shareSecret$delegate", "", "shared", "getShared", "()Z", "setShared", "(Z)V", "shared$delegate", "buildPostData", "Lcn/jianyun/workplan/module/schedule/model/ScheduleSharePostData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copySecret", "", "doImport", "onSuccess", "Lkotlin/Function0;", "doShare", "getRepository", "importShareData", "source", "Lcn/jianyun/workplan/module/schedule/model/ScheduleShareData;", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleShareData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reload", "reloadData", "dataChanged", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScheduleShareViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: currentProjectName$delegate, reason: from kotlin metadata */
    private final MutableState currentProjectName;

    /* JADX INFO: renamed from: importSecret$delegate, reason: from kotlin metadata */
    private final MutableState importSecret;

    /* JADX INFO: renamed from: newProjectName$delegate, reason: from kotlin metadata */
    private final MutableState newProjectName;

    /* JADX INFO: renamed from: page$delegate, reason: from kotlin metadata */
    private final MutableState page;
    private final ScheduleService scheduleService;
    private final ScheduleShareApi shareApi;

    /* JADX INFO: renamed from: shareSecret$delegate, reason: from kotlin metadata */
    private final MutableState shareSecret;

    /* JADX INFO: renamed from: shared$delegate, reason: from kotlin metadata */
    private final MutableState shared;

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$buildPostData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleShareViewModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel", f = "ScheduleShareViewModel.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, l = {135, 136, 137, 138, 139, 140}, m = "buildPostData", n = {"this", "this", "projectId", "this", "projectId", "project", "this", "projectId", "project", "duties", "this", "projectId", "project", "duties", "works", "this", "projectId", "project", "duties", "works", "plans"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleShareViewModel.this.buildPostData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$importShareData$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleShareViewModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel", f = "ScheduleShareViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5}, l = {202, MediaPlayer.MEDIA_PLAYER_OPTION_MEDIACODEC_DROP_NONREF, MediaPlayer.MEDIA_PLAYER_OPTION_FASTOPEN_LIVE_STREAM, 226, MediaPlayer.MEDIA_PLAYER_OPTION_NETWORK_TRY_COUNT, UnknownRecord.BITMAP_00E9, 234}, m = "importShareData", n = {"this", "newData", "firstProjectId", "name", "index$iv", "this", "newData", "firstProjectId", "this", "newData", "firstProjectId", "this", "newData", "firstProjectId", "this", "firstProjectId", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScheduleShareViewModel.this.importShareData(null, this);
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
    }

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    public final ScheduleShareApi getShareApi() {
        return this.shareApi;
    }

    @Inject
    public ScheduleShareViewModel(BaseRepository baseRepository, ScheduleService scheduleService, ScheduleShareApi shareApi) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        Intrinsics.checkNotNullParameter(shareApi, "shareApi");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.shareApi = shareApi;
        this.page = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("share", null, 2, null);
        this.shareSecret = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.importSecret = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.newProjectName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.currentProjectName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.shared = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getPage() {
        return (String) this.page.getValue();
    }

    public final void setPage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.page.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getShareSecret() {
        return (String) this.shareSecret.getValue();
    }

    public final void setShareSecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareSecret.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getImportSecret() {
        return (String) this.importSecret.getValue();
    }

    public final void setImportSecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.importSecret.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getNewProjectName() {
        return (String) this.newProjectName.getValue();
    }

    public final void setNewProjectName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newProjectName.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentProjectName() {
        return (String) this.currentProjectName.getValue();
    }

    public final void setCurrentProjectName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentProjectName.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShared() {
        return ((Boolean) this.shared.getValue()).booleanValue();
    }

    public final void setShared(boolean z) {
        this.shared.setValue(Boolean.valueOf(z));
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleShareViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$reload$1", f = "ScheduleShareViewModel.kt", i = {}, l = {58, 59}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleShareViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x008b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0080 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleShareViewModel scheduleShareViewModel;
            ScheduleShareViewModel scheduleShareViewModel2;
            ScheduleShareViewModel scheduleShareViewModel3;
            Iterator it;
            Object next;
            ScheduleProject scheduleProject;
            String name;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                scheduleShareViewModel = ScheduleShareViewModel.this;
                this.L$0 = scheduleShareViewModel;
                this.label = 1;
                obj = scheduleShareViewModel.getScheduleService().getProjectId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    scheduleShareViewModel = (ScheduleShareViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scheduleShareViewModel2 = (ScheduleShareViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scheduleShareViewModel3 = ScheduleShareViewModel.this;
                it = ((Iterable) obj).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleShareViewModel3.getCurrentProjectId()));
                scheduleProject = (ScheduleProject) next;
                if (scheduleProject != null || (name = scheduleProject.getName()) == null) {
                    name = "";
                }
                scheduleShareViewModel2.setCurrentProjectName(name);
                return Unit.INSTANCE;
            }
            scheduleShareViewModel.setCurrentProjectId((String) obj);
            ScheduleShareViewModel scheduleShareViewModel4 = ScheduleShareViewModel.this;
            this.L$0 = scheduleShareViewModel4;
            this.label = 2;
            Object list = scheduleShareViewModel4.getScheduleService().getScheduleProjectDao().list(this);
            if (list == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleShareViewModel2 = scheduleShareViewModel4;
            obj = list;
            scheduleShareViewModel3 = ScheduleShareViewModel.this;
            it = ((Iterable) obj).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), scheduleShareViewModel3.getCurrentProjectId()));
            scheduleProject = (ScheduleProject) next;
            if (scheduleProject != null) {
                name = "";
            } else {
                name = "";
            }
            scheduleShareViewModel2.setCurrentProjectName(name);
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void copySecret() {
        if (StringsKt.isBlank(getShareSecret())) {
            toast("暂无可复制秘钥");
        } else {
            this.baseRepository.copyData(getShareSecret(), true);
        }
    }

    public final void doShare() {
        if (this.baseRepository.getLoading()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doShare$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleShareViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doShare$1", f = "ScheduleShareViewModel.kt", i = {2}, l = {80, 81, 82}, m = "invokeSuspend", n = {"shareData"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleShareViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0067  */
        /* JADX WARN: Code duplicated, block: B:24:0x007a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScheduleSharePostData scheduleSharePostData;
            Object objWithApi;
            ScheduleSharePostData scheduleSharePostData2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(ScheduleShareViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    scheduleSharePostData = (ScheduleSharePostData) obj;
                    this.L$0 = scheduleSharePostData;
                    this.label = 3;
                    objWithApi = CommonToolKt.withApi(new ScheduleShareViewModel$doShare$1$result$1(ScheduleShareViewModel.this, scheduleSharePostData, null), this);
                    if (objWithApi == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleSharePostData2 = scheduleSharePostData;
                    obj = objWithApi;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scheduleSharePostData2 = (ScheduleSharePostData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleShareViewModel.this.getBaseRepository().finish();
                if (!((ApiResult) obj).getSuccess()) {
                    ScheduleShareViewModel.this.toast("分享失败，请检查网络是否正常");
                    return Unit.INSTANCE;
                }
                ScheduleShareViewModel.this.setShared(true);
                ScheduleShareViewModel.this.setShareSecret(scheduleSharePostData2.getShareId());
                return Unit.INSTANCE;
            }
            this.label = 2;
            obj = ScheduleShareViewModel.this.buildPostData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleSharePostData = (ScheduleSharePostData) obj;
            this.L$0 = scheduleSharePostData;
            this.label = 3;
            objWithApi = CommonToolKt.withApi(new ScheduleShareViewModel$doShare$1$result$1(ScheduleShareViewModel.this, scheduleSharePostData, null), this);
            if (objWithApi == coroutine_suspended) {
                return coroutine_suspended;
            }
            scheduleSharePostData2 = scheduleSharePostData;
            obj = objWithApi;
            ScheduleShareViewModel.this.getBaseRepository().finish();
            if (!((ApiResult) obj).getSuccess()) {
                ScheduleShareViewModel.this.toast("分享失败，请检查网络是否正常");
                return Unit.INSTANCE;
            }
            ScheduleShareViewModel.this.setShared(true);
            ScheduleShareViewModel.this.setShareSecret(scheduleSharePostData2.getShareId());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void doImport$default(ScheduleShareViewModel scheduleShareViewModel, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel.doImport.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        scheduleShareViewModel.doImport(function0);
    }

    public final void doImport(Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (this.baseRepository.getLoading()) {
            return;
        }
        String string = StringsKt.trim((CharSequence) getImportSecret()).toString();
        if (StringsKt.isBlank(string)) {
            toast("秘钥不能为空");
        } else if (string.length() == 6 || string.length() == 8) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(onSuccess, string, null), 3, null);
        } else {
            toast("秘钥错误");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doImport$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleShareViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doImport$2", f = "ScheduleShareViewModel.kt", i = {}, l = {109, 110, 125}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $secret;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function0<Unit> function0, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onSuccess = function0;
            this.$secret = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleShareViewModel.this.new AnonymousClass2(this.$onSuccess, this.$secret, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(ScheduleShareViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    ScheduleSharePostData scheduleSharePostData = (ScheduleSharePostData) apiResult.getResult();
                    if (apiResult.getSuccess() || scheduleSharePostData == null) {
                        ScheduleShareViewModel.this.getBaseRepository().finish();
                        ScheduleShareViewModel.this.toast("秘钥错误");
                        return Unit.INSTANCE;
                    }
                    ScheduleShareData scheduleShareData = ScheduleShareData.INSTANCE.parse(scheduleSharePostData.getContent());
                    if (scheduleShareData != null && !scheduleShareData.getProjects().isEmpty()) {
                        this.label = 3;
                        if (ScheduleShareViewModel.this.importShareData(scheduleShareData, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        ScheduleShareViewModel.this.getBaseRepository().finish();
                        ScheduleShareViewModel.this.toast("没有数据喔");
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ScheduleShareViewModel.this.getBaseRepository().finish();
                ScheduleShareViewModel.this.getBaseRepository().reload();
                ScheduleShareViewModel.this.toast("导入成功");
                ScheduleShareViewModel.this.setFormType(new FormType("importSuccess", null, null, 6, null));
                this.$onSuccess.invoke();
                return Unit.INSTANCE;
            }
            this.label = 2;
            obj = CommonToolKt.withApi(new ScheduleShareViewModel$doImport$2$result$1(ScheduleShareViewModel.this, this.$secret, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            ScheduleSharePostData scheduleSharePostData2 = (ScheduleSharePostData) apiResult.getResult();
            if (apiResult.getSuccess()) {
            }
            ScheduleShareViewModel.this.getBaseRepository().finish();
            ScheduleShareViewModel.this.toast("秘钥错误");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0147  */
    /* JADX WARN: Code duplicated, block: B:45:0x016b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
    /* JADX WARN: Code duplicated, block: B:53:0x019a A[LOOP:0: B:51:0x0194->B:53:0x019a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c3 A[LOOP:1: B:55:0x01bd->B:57:0x01c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec A[LOOP:2: B:59:0x01e6->B:61:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0215 A[LOOP:3: B:63:0x020f->B:65:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0253  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object buildPostData(Continuation<? super ScheduleSharePostData> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleShareViewModel scheduleShareViewModel;
        String str;
        Iterator it;
        Object next;
        ScheduleProject scheduleProject;
        ScheduleShareViewModel scheduleShareViewModel2;
        ScheduleProject scheduleProject2;
        String str2;
        List list;
        List list2;
        Object objListByProject;
        List list3;
        String str3;
        ScheduleProject scheduleProject3;
        List list4;
        List list5;
        Object objListByProject2;
        List list6;
        ScheduleShareViewModel scheduleShareViewModel3;
        String str4;
        ArrayList arrayList;
        Iterator it2;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        Iterator it4;
        ArrayList arrayList4;
        Iterator it5;
        String uuid;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object projectId = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(projectId);
                ScheduleService scheduleService = this.scheduleService;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                projectId = scheduleService.getProjectId(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel = this;
                str = (String) projectId;
                ScheduleProjectDao scheduleProjectDao = scheduleShareViewModel.scheduleService.getScheduleProjectDao();
                anonymousClass1.L$0 = scheduleShareViewModel;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 2;
                projectId = scheduleProjectDao.list(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = ((Iterable) projectId).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    scheduleProject = (ScheduleProject) next;
                    ScheduleDutyDao scheduleDutyDao = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = scheduleProject;
                    anonymousClass1.label = 3;
                    projectId = scheduleDutyDao.listByProject(str, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleShareViewModel2 = scheduleShareViewModel;
                    scheduleProject2 = scheduleProject;
                    str2 = str;
                    list = (List) projectId;
                    ScheduleWorkDao scheduleWorkDao = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.label = 4;
                    projectId = scheduleWorkDao.listByProject(str2, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = (List) projectId;
                    SchedulePlanDao schedulePlanDao = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.L$4 = list2;
                    anonymousClass1.label = 5;
                    objListByProject = schedulePlanDao.listByProject(str2, anonymousClass1);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list7 = list;
                    list3 = list2;
                    projectId = objListByProject;
                    str3 = str2;
                    scheduleProject3 = scheduleProject2;
                    list4 = list7;
                    list5 = (List) projectId;
                    ScheduleAlarmDao alarmDao = scheduleShareViewModel2.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = scheduleProject3;
                    anonymousClass1.L$3 = list4;
                    anonymousClass1.L$4 = list3;
                    anonymousClass1.L$5 = list5;
                    anonymousClass1.label = 6;
                    objListByProject2 = alarmDao.listByProject(str3, anonymousClass1);
                    if (objListByProject2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list6 = list5;
                    projectId = objListByProject2;
                    scheduleShareViewModel3 = scheduleShareViewModel2;
                    str4 = str3;
                    List list8 = (List) projectId;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    List listListOfNotNull = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                    List list9 = list4;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                    it2 = list9.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                    }
                    ArrayList arrayList5 = arrayList;
                    List list10 = list3;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                    it3 = list10.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                    }
                    ArrayList arrayList6 = arrayList2;
                    List list11 = list6;
                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
                    it4 = list11.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                    }
                    ArrayList arrayList7 = arrayList3;
                    List list12 = list8;
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
                    it5 = list12.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                    }
                    String json = new ScheduleShareData(str5, false, false, str6, str7, listListOfNotNull, arrayList5, arrayList6, arrayList7, arrayList4, null, str4, 1055, null).toJson();
                    String shareId = MyRandomTool.random(6);
                    String strUuid = CommonToolKt.uuid();
                    uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                    if (StringsKt.isBlank(uuid)) {
                        uuid = scheduleShareViewModel3.baseRepository.getUid();
                    }
                    String str8 = uuid;
                    String str9 = list4.size() + "条排班数据";
                    String str10 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                    String str11 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                    String str12 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                    Intrinsics.checkNotNullExpressionValue(shareId, "shareId");
                    return new ScheduleSharePostData(strUuid, str11, str12, shareId, true, str10, str9, json, str8, false, true, null, null, 6144, null);
                } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), str));
                scheduleProject = (ScheduleProject) next;
                ScheduleDutyDao scheduleDutyDao2 = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                anonymousClass1.L$0 = scheduleShareViewModel;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = scheduleProject;
                anonymousClass1.label = 3;
                projectId = scheduleDutyDao2.listByProject(str, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel2 = scheduleShareViewModel;
                scheduleProject2 = scheduleProject;
                str2 = str;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao2 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.label = 4;
                projectId = scheduleWorkDao2.listByProject(str2, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) projectId;
                SchedulePlanDao schedulePlanDao2 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = list2;
                anonymousClass1.label = 5;
                objListByProject = schedulePlanDao2.listByProject(str2, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list13 = list;
                list3 = list2;
                projectId = objListByProject;
                str3 = str2;
                scheduleProject3 = scheduleProject2;
                list4 = list13;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao2 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao2.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list14 = (List) projectId;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                List listListOfNotNull2 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list15 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list15, 10));
                it2 = list15.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList8 = arrayList;
                List list16 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list16, 10));
                it3 = list16.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList9 = arrayList2;
                List list17 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list17, 10));
                it4 = list17.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList10 = arrayList3;
                List list18 = list14;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list18, 10));
                it5 = list18.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json2 = new ScheduleShareData(str13, false, false, str14, str15, listListOfNotNull2, arrayList8, arrayList9, arrayList10, arrayList4, null, str4, 1055, null).toJson();
                String shareId2 = MyRandomTool.random(6);
                String strUuid2 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str16 = uuid;
                String str17 = list4.size() + "条排班数据";
                String str18 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str19 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str110 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId2, "shareId");
                return new ScheduleSharePostData(strUuid2, str19, str110, shareId2, true, str18, str17, json2, str16, false, true, null, null, 6144, null);
            case 1:
                ScheduleShareViewModel scheduleShareViewModel4 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                scheduleShareViewModel = scheduleShareViewModel4;
                str = (String) projectId;
                ScheduleProjectDao scheduleProjectDao2 = scheduleShareViewModel.scheduleService.getScheduleProjectDao();
                anonymousClass1.L$0 = scheduleShareViewModel;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 2;
                projectId = scheduleProjectDao2.list(anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = ((Iterable) projectId).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    scheduleProject = (ScheduleProject) next;
                    ScheduleDutyDao scheduleDutyDao3 = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = scheduleProject;
                    anonymousClass1.label = 3;
                    projectId = scheduleDutyDao3.listByProject(str, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleShareViewModel2 = scheduleShareViewModel;
                    scheduleProject2 = scheduleProject;
                    str2 = str;
                    list = (List) projectId;
                    ScheduleWorkDao scheduleWorkDao3 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.label = 4;
                    projectId = scheduleWorkDao3.listByProject(str2, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = (List) projectId;
                    SchedulePlanDao schedulePlanDao3 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.L$4 = list2;
                    anonymousClass1.label = 5;
                    objListByProject = schedulePlanDao3.listByProject(str2, anonymousClass1);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list19 = list;
                    list3 = list2;
                    projectId = objListByProject;
                    str3 = str2;
                    scheduleProject3 = scheduleProject2;
                    list4 = list19;
                    list5 = (List) projectId;
                    ScheduleAlarmDao alarmDao3 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = scheduleProject3;
                    anonymousClass1.L$3 = list4;
                    anonymousClass1.L$4 = list3;
                    anonymousClass1.L$5 = list5;
                    anonymousClass1.label = 6;
                    objListByProject2 = alarmDao3.listByProject(str3, anonymousClass1);
                    if (objListByProject2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list6 = list5;
                    projectId = objListByProject2;
                    scheduleShareViewModel3 = scheduleShareViewModel2;
                    str4 = str3;
                    List list110 = (List) projectId;
                    String str111 = null;
                    String str112 = null;
                    String str113 = null;
                    List listListOfNotNull3 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                    List list111 = list4;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111, 10));
                    it2 = list111.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                    }
                    ArrayList arrayList11 = arrayList;
                    List list112 = list3;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list112, 10));
                    it3 = list112.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                    }
                    ArrayList arrayList12 = arrayList2;
                    List list113 = list6;
                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list113, 10));
                    it4 = list113.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                    }
                    ArrayList arrayList13 = arrayList3;
                    List list114 = list110;
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list114, 10));
                    it5 = list114.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                    }
                    String json3 = new ScheduleShareData(str111, false, false, str112, str113, listListOfNotNull3, arrayList11, arrayList12, arrayList13, arrayList4, null, str4, 1055, null).toJson();
                    String shareId3 = MyRandomTool.random(6);
                    String strUuid3 = CommonToolKt.uuid();
                    uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                    if (StringsKt.isBlank(uuid)) {
                        uuid = scheduleShareViewModel3.baseRepository.getUid();
                    }
                    String str114 = uuid;
                    String str115 = list4.size() + "条排班数据";
                    String str116 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                    String str117 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                    String str118 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                    Intrinsics.checkNotNullExpressionValue(shareId3, "shareId");
                    return new ScheduleSharePostData(strUuid3, str117, str118, shareId3, true, str116, str115, json3, str114, false, true, null, null, 6144, null);
                } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), str));
                scheduleProject = (ScheduleProject) next;
                ScheduleDutyDao scheduleDutyDao4 = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                anonymousClass1.L$0 = scheduleShareViewModel;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = scheduleProject;
                anonymousClass1.label = 3;
                projectId = scheduleDutyDao4.listByProject(str, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel2 = scheduleShareViewModel;
                scheduleProject2 = scheduleProject;
                str2 = str;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao4 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.label = 4;
                projectId = scheduleWorkDao4.listByProject(str2, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) projectId;
                SchedulePlanDao schedulePlanDao4 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = list2;
                anonymousClass1.label = 5;
                objListByProject = schedulePlanDao4.listByProject(str2, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list115 = list;
                list3 = list2;
                projectId = objListByProject;
                str3 = str2;
                scheduleProject3 = scheduleProject2;
                list4 = list115;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao4 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao4.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list116 = (List) projectId;
                String str119 = null;
                String str1110 = null;
                String str1111 = null;
                List listListOfNotNull4 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list117 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list117, 10));
                it2 = list117.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList14 = arrayList;
                List list118 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list118, 10));
                it3 = list118.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList15 = arrayList2;
                List list119 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list119, 10));
                it4 = list119.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList16 = arrayList3;
                List list1110 = list116;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1110, 10));
                it5 = list1110.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json4 = new ScheduleShareData(str119, false, false, str1110, str1111, listListOfNotNull4, arrayList14, arrayList15, arrayList16, arrayList4, null, str4, 1055, null).toJson();
                String shareId4 = MyRandomTool.random(6);
                String strUuid4 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str1112 = uuid;
                String str1113 = list4.size() + "条排班数据";
                String str1114 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str1115 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str1116 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId4, "shareId");
                return new ScheduleSharePostData(strUuid4, str1115, str1116, shareId4, true, str1114, str1113, json4, str1112, false, true, null, null, 6144, null);
            case 2:
                str = (String) anonymousClass1.L$1;
                scheduleShareViewModel = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                it = ((Iterable) projectId).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    scheduleProject = (ScheduleProject) next;
                    ScheduleDutyDao scheduleDutyDao5 = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = scheduleProject;
                    anonymousClass1.label = 3;
                    projectId = scheduleDutyDao5.listByProject(str, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scheduleShareViewModel2 = scheduleShareViewModel;
                    scheduleProject2 = scheduleProject;
                    str2 = str;
                    list = (List) projectId;
                    ScheduleWorkDao scheduleWorkDao5 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.label = 4;
                    projectId = scheduleWorkDao5.listByProject(str2, anonymousClass1);
                    if (projectId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = (List) projectId;
                    SchedulePlanDao schedulePlanDao5 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str2;
                    anonymousClass1.L$2 = scheduleProject2;
                    anonymousClass1.L$3 = list;
                    anonymousClass1.L$4 = list2;
                    anonymousClass1.label = 5;
                    objListByProject = schedulePlanDao5.listByProject(str2, anonymousClass1);
                    if (objListByProject == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List list1111 = list;
                    list3 = list2;
                    projectId = objListByProject;
                    str3 = str2;
                    scheduleProject3 = scheduleProject2;
                    list4 = list1111;
                    list5 = (List) projectId;
                    ScheduleAlarmDao alarmDao5 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = scheduleProject3;
                    anonymousClass1.L$3 = list4;
                    anonymousClass1.L$4 = list3;
                    anonymousClass1.L$5 = list5;
                    anonymousClass1.label = 6;
                    objListByProject2 = alarmDao5.listByProject(str3, anonymousClass1);
                    if (objListByProject2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list6 = list5;
                    projectId = objListByProject2;
                    scheduleShareViewModel3 = scheduleShareViewModel2;
                    str4 = str3;
                    List list1112 = (List) projectId;
                    String str1117 = null;
                    String str1118 = null;
                    String str1119 = null;
                    List listListOfNotNull5 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                    List list1113 = list4;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1113, 10));
                    it2 = list1113.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                    }
                    ArrayList arrayList17 = arrayList;
                    List list1114 = list3;
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1114, 10));
                    it3 = list1114.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                    }
                    ArrayList arrayList18 = arrayList2;
                    List list1115 = list6;
                    arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1115, 10));
                    it4 = list1115.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                    }
                    ArrayList arrayList19 = arrayList3;
                    List list1116 = list1112;
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1116, 10));
                    it5 = list1116.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                    }
                    String json5 = new ScheduleShareData(str1117, false, false, str1118, str1119, listListOfNotNull5, arrayList17, arrayList18, arrayList19, arrayList4, null, str4, 1055, null).toJson();
                    String shareId5 = MyRandomTool.random(6);
                    String strUuid5 = CommonToolKt.uuid();
                    uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                    if (StringsKt.isBlank(uuid)) {
                        uuid = scheduleShareViewModel3.baseRepository.getUid();
                    }
                    String str11110 = uuid;
                    String str11111 = list4.size() + "条排班数据";
                    String str11112 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                    String str11113 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                    String str11114 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                    Intrinsics.checkNotNullExpressionValue(shareId5, "shareId");
                    return new ScheduleSharePostData(strUuid5, str11113, str11114, shareId5, true, str11112, str11111, json5, str11110, false, true, null, null, 6144, null);
                } while (!Intrinsics.areEqual(((ScheduleProject) next).getUuid(), str));
                scheduleProject = (ScheduleProject) next;
                ScheduleDutyDao scheduleDutyDao6 = scheduleShareViewModel.scheduleService.getScheduleDutyDao();
                anonymousClass1.L$0 = scheduleShareViewModel;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = scheduleProject;
                anonymousClass1.label = 3;
                projectId = scheduleDutyDao6.listByProject(str, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel2 = scheduleShareViewModel;
                scheduleProject2 = scheduleProject;
                str2 = str;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao6 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.label = 4;
                projectId = scheduleWorkDao6.listByProject(str2, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) projectId;
                SchedulePlanDao schedulePlanDao6 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = list2;
                anonymousClass1.label = 5;
                objListByProject = schedulePlanDao6.listByProject(str2, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list1117 = list;
                list3 = list2;
                projectId = objListByProject;
                str3 = str2;
                scheduleProject3 = scheduleProject2;
                list4 = list1117;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao6 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao6.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list1118 = (List) projectId;
                String str11115 = null;
                String str11116 = null;
                String str11117 = null;
                List listListOfNotNull6 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list1119 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1119, 10));
                it2 = list1119.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList110 = arrayList;
                List list11110 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11110, 10));
                it3 = list11110.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList111 = arrayList2;
                List list11111 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11111, 10));
                it4 = list11111.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList112 = arrayList3;
                List list11112 = list1118;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11112, 10));
                it5 = list11112.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json6 = new ScheduleShareData(str11115, false, false, str11116, str11117, listListOfNotNull6, arrayList110, arrayList111, arrayList112, arrayList4, null, str4, 1055, null).toJson();
                String shareId6 = MyRandomTool.random(6);
                String strUuid6 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str11118 = uuid;
                String str11119 = list4.size() + "条排班数据";
                String str111110 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str111111 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str111112 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId6, "shareId");
                return new ScheduleSharePostData(strUuid6, str111111, str111112, shareId6, true, str111110, str11119, json6, str11118, false, true, null, null, 6144, null);
            case 3:
                ScheduleProject scheduleProject4 = (ScheduleProject) anonymousClass1.L$2;
                String str20 = (String) anonymousClass1.L$1;
                ScheduleShareViewModel scheduleShareViewModel5 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                scheduleShareViewModel2 = scheduleShareViewModel5;
                str2 = str20;
                scheduleProject2 = scheduleProject4;
                list = (List) projectId;
                ScheduleWorkDao scheduleWorkDao7 = scheduleShareViewModel2.scheduleService.getScheduleWorkDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.label = 4;
                projectId = scheduleWorkDao7.listByProject(str2, anonymousClass1);
                if (projectId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) projectId;
                SchedulePlanDao schedulePlanDao7 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = list2;
                anonymousClass1.label = 5;
                objListByProject = schedulePlanDao7.listByProject(str2, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list11113 = list;
                list3 = list2;
                projectId = objListByProject;
                str3 = str2;
                scheduleProject3 = scheduleProject2;
                list4 = list11113;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao7 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao7.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list11114 = (List) projectId;
                String str111113 = null;
                String str111114 = null;
                String str111115 = null;
                List listListOfNotNull7 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list11115 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11115, 10));
                it2 = list11115.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList113 = arrayList;
                List list11116 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11116, 10));
                it3 = list11116.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList114 = arrayList2;
                List list11117 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11117, 10));
                it4 = list11117.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList115 = arrayList3;
                List list11118 = list11114;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11118, 10));
                it5 = list11118.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json7 = new ScheduleShareData(str111113, false, false, str111114, str111115, listListOfNotNull7, arrayList113, arrayList114, arrayList115, arrayList4, null, str4, 1055, null).toJson();
                String shareId7 = MyRandomTool.random(6);
                String strUuid7 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str111116 = uuid;
                String str111117 = list4.size() + "条排班数据";
                String str111118 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str111119 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str1111110 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId7, "shareId");
                return new ScheduleSharePostData(strUuid7, str111119, str1111110, shareId7, true, str111118, str111117, json7, str111116, false, true, null, null, 6144, null);
            case 4:
                list = (List) anonymousClass1.L$3;
                scheduleProject2 = (ScheduleProject) anonymousClass1.L$2;
                str2 = (String) anonymousClass1.L$1;
                scheduleShareViewModel2 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                list2 = (List) projectId;
                SchedulePlanDao schedulePlanDao8 = scheduleShareViewModel2.scheduleService.getSchedulePlanDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str2;
                anonymousClass1.L$2 = scheduleProject2;
                anonymousClass1.L$3 = list;
                anonymousClass1.L$4 = list2;
                anonymousClass1.label = 5;
                objListByProject = schedulePlanDao8.listByProject(str2, anonymousClass1);
                if (objListByProject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list11119 = list;
                list3 = list2;
                projectId = objListByProject;
                str3 = str2;
                scheduleProject3 = scheduleProject2;
                list4 = list11119;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao8 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao8.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list111110 = (List) projectId;
                String str1111111 = null;
                String str1111112 = null;
                String str1111113 = null;
                List listListOfNotNull8 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list111111 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111111, 10));
                it2 = list111111.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList116 = arrayList;
                List list111112 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111112, 10));
                it3 = list111112.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList117 = arrayList2;
                List list111113 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111113, 10));
                it4 = list111113.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList118 = arrayList3;
                List list111114 = list111110;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111114, 10));
                it5 = list111114.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json8 = new ScheduleShareData(str1111111, false, false, str1111112, str1111113, listListOfNotNull8, arrayList116, arrayList117, arrayList118, arrayList4, null, str4, 1055, null).toJson();
                String shareId8 = MyRandomTool.random(6);
                String strUuid8 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str1111114 = uuid;
                String str1111115 = list4.size() + "条排班数据";
                String str1111116 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str1111117 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str1111118 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId8, "shareId");
                return new ScheduleSharePostData(strUuid8, str1111117, str1111118, shareId8, true, str1111116, str1111115, json8, str1111114, false, true, null, null, 6144, null);
            case 5:
                list3 = (List) anonymousClass1.L$4;
                list4 = (List) anonymousClass1.L$3;
                scheduleProject3 = (ScheduleProject) anonymousClass1.L$2;
                String str21 = (String) anonymousClass1.L$1;
                ScheduleShareViewModel scheduleShareViewModel6 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                str3 = str21;
                scheduleShareViewModel2 = scheduleShareViewModel6;
                list5 = (List) projectId;
                ScheduleAlarmDao alarmDao9 = scheduleShareViewModel2.scheduleService.getAlarmDao();
                anonymousClass1.L$0 = scheduleShareViewModel2;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = scheduleProject3;
                anonymousClass1.L$3 = list4;
                anonymousClass1.L$4 = list3;
                anonymousClass1.L$5 = list5;
                anonymousClass1.label = 6;
                objListByProject2 = alarmDao9.listByProject(str3, anonymousClass1);
                if (objListByProject2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list5;
                projectId = objListByProject2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                str4 = str3;
                List list111115 = (List) projectId;
                String str1111119 = null;
                String str11111110 = null;
                String str11111111 = null;
                List listListOfNotNull9 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list111116 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111116, 10));
                it2 = list111116.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList119 = arrayList;
                List list111117 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111117, 10));
                it3 = list111117.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList1110 = arrayList2;
                List list111118 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111118, 10));
                it4 = list111118.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList1111 = arrayList3;
                List list111119 = list111115;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list111119, 10));
                it5 = list111119.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json9 = new ScheduleShareData(str1111119, false, false, str11111110, str11111111, listListOfNotNull9, arrayList119, arrayList1110, arrayList1111, arrayList4, null, str4, 1055, null).toJson();
                String shareId9 = MyRandomTool.random(6);
                String strUuid9 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str11111112 = uuid;
                String str11111113 = list4.size() + "条排班数据";
                String str11111114 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str11111115 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str11111116 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId9, "shareId");
                return new ScheduleSharePostData(strUuid9, str11111115, str11111116, shareId9, true, str11111114, str11111113, json9, str11111112, false, true, null, null, 6144, null);
            case 6:
                list6 = (List) anonymousClass1.L$5;
                list3 = (List) anonymousClass1.L$4;
                list4 = (List) anonymousClass1.L$3;
                scheduleProject3 = (ScheduleProject) anonymousClass1.L$2;
                String str22 = (String) anonymousClass1.L$1;
                scheduleShareViewModel3 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(projectId);
                str4 = str22;
                List list1111110 = (List) projectId;
                String str11111117 = null;
                String str11111118 = null;
                String str11111119 = null;
                List listListOfNotNull10 = CollectionsKt.listOfNotNull(scheduleProject3 != null ? ScheduleShareDataKt.toIosProject(scheduleProject3) : null);
                List list1111111 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1111111, 10));
                it2 = list1111111.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ScheduleShareDataKt.toIosDuty((ScheduleDuty) it2.next()));
                }
                ArrayList arrayList1112 = arrayList;
                List list1111112 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1111112, 10));
                it3 = list1111112.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ScheduleShareDataKt.toIosWorkPlan((ScheduleWork) it3.next()));
                }
                ArrayList arrayList1113 = arrayList2;
                List list1111113 = list6;
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1111113, 10));
                it4 = list1111113.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toIosSchedulePlan((SchedulePlan) it4.next()));
                }
                ArrayList arrayList1114 = arrayList3;
                List list1111114 = list1111110;
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1111114, 10));
                it5 = list1111114.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(ScheduleShareDataKt.toIosAlarm((ScheduleAlarm) it5.next()));
                }
                String json10 = new ScheduleShareData(str11111117, false, false, str11111118, str11111119, listListOfNotNull10, arrayList1112, arrayList1113, arrayList1114, arrayList4, null, str4, 1055, null).toJson();
                String shareId10 = MyRandomTool.random(6);
                String strUuid10 = CommonToolKt.uuid();
                uuid = scheduleShareViewModel3.baseRepository.getLoginUser().getUuid();
                if (StringsKt.isBlank(uuid)) {
                    uuid = scheduleShareViewModel3.baseRepository.getUid();
                }
                String str111111110 = uuid;
                String str111111111 = list4.size() + "条排班数据";
                String str111111112 = "极简排班" + MyDateTool.toDateTimeString(new Date());
                String str111111113 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID;
                String str111111114 = ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE;
                Intrinsics.checkNotNullExpressionValue(shareId10, "shareId");
                return new ScheduleSharePostData(strUuid10, str111111113, str111111114, shareId10, true, str111111112, str111111111, json10, str111111110, false, true, null, null, 6144, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x0400 A[LOOP:4: B:106:0x03fa->B:108:0x0400, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x043e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0479 A[LOOP:2: B:116:0x0473->B:118:0x0479, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0497  */
    /* JADX WARN: Code duplicated, block: B:127:0x04cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:131:0x04db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[LOOP:0: B:120:0x0491->B:139:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[LOOP:1: B:110:0x0438->B:143:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:3: B:100:0x03bf->B:148:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[LOOP:5: B:90:0x0367->B:153:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0201  */
    /* JADX WARN: Code duplicated, block: B:56:0x0214  */
    /* JADX WARN: Code duplicated, block: B:58:0x0225  */
    /* JADX WARN: Code duplicated, block: B:59:0x025f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0291 A[LOOP:7: B:47:0x01f3->B:63:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x02af  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:82:0x030e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0313  */
    /* JADX WARN: Code duplicated, block: B:85:0x0316  */
    /* JADX WARN: Code duplicated, block: B:92:0x036d  */
    /* JADX WARN: Code duplicated, block: B:98:0x03a8 A[LOOP:6: B:96:0x03a2->B:98:0x03a8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, java.lang.String] */
    public final Object importShareData(ScheduleShareData scheduleShareData, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ScheduleShareViewModel scheduleShareViewModel;
        String uuid;
        int i;
        ScheduleShareData scheduleShareData2;
        ScheduleShareViewModel scheduleShareViewModel2;
        String string;
        Iterator it;
        ArrayList arrayList;
        String str;
        ScheduleShareData scheduleShareData3;
        ScheduleShareViewModel scheduleShareViewModel3;
        Iterator it2;
        ScheduleWork scheduleWork;
        ArrayList arrayList2;
        Iterator<T> it3;
        Object next;
        IosWorkPlanDO iosWorkPlanDO;
        ScheduleWork scheduleWork2;
        int i2;
        IosProjectDO iosProjectDO;
        String str2;
        ScheduleProjectDao scheduleProjectDao;
        ScheduleProject scheduleProject;
        ArrayList arrayList3;
        Iterator<T> it4;
        Iterator it5;
        ScheduleWork scheduleWork3;
        ScheduleWorkDao scheduleWorkDao;
        ArrayList arrayList4;
        Iterator<T> it6;
        Iterator it7;
        SchedulePlan schedulePlan;
        SchedulePlanDao schedulePlanDao;
        ArrayList arrayList5;
        Iterator<T> it8;
        Iterator it9;
        String str3;
        ScheduleDuty scheduleDuty;
        ScheduleDutyDao scheduleDutyDao;
        ScheduleService scheduleService;
        ScheduleShareViewModel scheduleShareViewModel4;
        ScheduleAlarm scheduleAlarm;
        ScheduleAlarmDao alarmDao;
        ScheduleService scheduleService2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
                scheduleShareViewModel = this;
            } else {
                scheduleShareViewModel = this;
                anonymousClass1 = scheduleShareViewModel.new AnonymousClass1(continuation);
            }
        } else {
            scheduleShareViewModel = this;
            anonymousClass1 = scheduleShareViewModel.new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ?? jSONString = JSON.toJSONString(scheduleShareData);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = jSONString;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Iterator<T> it10 = scheduleShareData.getProjects().iterator();
                while (it10.hasNext()) {
                    linkedHashMap.put(((IosProjectDO) it10.next()).getUuid(), CommonToolKt.uuid());
                }
                Iterator<T> it11 = scheduleShareData.getWorkPlans().iterator();
                while (it11.hasNext()) {
                    linkedHashMap2.put(((IosWorkPlanDO) it11.next()).getUuid(), CommonToolKt.uuid());
                }
                Iterator<T> it12 = scheduleShareData.getSchedulePlans().iterator();
                while (it12.hasNext()) {
                    linkedHashMap3.put(((IosSchedulePlanDO) it12.next()).getUuid(), CommonToolKt.uuid());
                }
                Iterator<T> it13 = scheduleShareData.getAlarms().iterator();
                while (it13.hasNext()) {
                    linkedHashMap4.put(((IosAlarmDO) it13.next()).getUuid(), CommonToolKt.uuid());
                }
                for (Map.Entry entry : MapsKt.plus(MapsKt.plus(MapsKt.plus(linkedHashMap, linkedHashMap2), linkedHashMap3), linkedHashMap4).entrySet()) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    if (!StringsKt.isBlank(str4)) {
                        T newJson = objectRef.element;
                        Intrinsics.checkNotNullExpressionValue(newJson, "newJson");
                        objectRef.element = StringsKt.replace$default((String) newJson, str4, str5, false, 4, (Object) null);
                    }
                }
                ScheduleShareData scheduleShareData4 = (ScheduleShareData) JSON.parseObject((String) objectRef.element, ScheduleShareData.class);
                IosProjectDO iosProjectDO2 = (IosProjectDO) CollectionsKt.firstOrNull((List) scheduleShareData4.getProjects());
                if (iosProjectDO2 == null || (uuid = iosProjectDO2.getUuid()) == null) {
                    return Unit.INSTANCE;
                }
                i = 0;
                scheduleShareData2 = scheduleShareData4;
                scheduleShareViewModel2 = scheduleShareViewModel;
                string = StringsKt.trim((CharSequence) getNewProjectName()).toString();
                it = scheduleShareData4.getProjects().iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    iosProjectDO = (IosProjectDO) next2;
                    if (!(!StringsKt.isBlank(string)) && i == 0) {
                        str2 = string;
                    } else if (!StringsKt.isBlank(iosProjectDO.getName())) {
                        str2 = CollectionsKt.first(StringsKt.split$default((CharSequence) iosProjectDO.getName(), new String[]{"_"}, false, 0, 6, (Object) null)) + "_导入" + MyRandomTool.randomNumber(100, 1000);
                    } else {
                        str2 = "导入排班" + MyRandomTool.randomNumber(100, 1000);
                    }
                    scheduleProjectDao = scheduleShareViewModel2.scheduleService.getScheduleProjectDao();
                    scheduleProject = ScheduleShareDataKt.toScheduleProject(iosProjectDO, str2);
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = scheduleShareData2;
                    anonymousClass1.L$2 = uuid;
                    anonymousClass1.L$3 = string;
                    anonymousClass1.L$4 = it;
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.label = 1;
                    if (scheduleProjectDao.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i2;
                }
                List<IosWorkPlanDO> workPlans = scheduleShareData2.getWorkPlans();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(workPlans, 10));
                for (IosWorkPlanDO iosWorkPlanDO2 : workPlans) {
                    scheduleWork = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO2);
                    if (iosWorkPlanDO2.getWorkIds().isEmpty() ^ z) {
                        List<String> workIds = iosWorkPlanDO2.getWorkIds();
                        arrayList2 = new ArrayList();
                        for (String str6 : workIds) {
                            it3 = scheduleShareData2.getWorkPlans().iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                } else {
                                    next = null;
                                }
                                iosWorkPlanDO = (IosWorkPlanDO) next;
                                if (iosWorkPlanDO != null) {
                                    scheduleWork2 = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO);
                                } else {
                                    scheduleWork2 = null;
                                }
                                if (scheduleWork2 != null) {
                                    arrayList2.add(scheduleWork2);
                                }
                            } while (!Intrinsics.areEqual(((IosWorkPlanDO) next).getUuid(), str6));
                            iosWorkPlanDO = (IosWorkPlanDO) next;
                            if (iosWorkPlanDO != null) {
                                scheduleWork2 = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO);
                            } else {
                                scheduleWork2 = null;
                            }
                            if (scheduleWork2 != null) {
                                arrayList2.add(scheduleWork2);
                            }
                        }
                        String jSONString2 = JSON.toJSONString(arrayList2);
                        Intrinsics.checkNotNullExpressionValue(jSONString2, "childWorks.toJSONString()");
                        scheduleWork = scheduleWork.copy((1048063 & 1) != 0 ? scheduleWork.uuid : null, (1048063 & 2) != 0 ? scheduleWork.name : null, (1048063 & 4) != 0 ? scheduleWork.userId : null, (1048063 & 8) != 0 ? scheduleWork.gmtBegin : null, (1048063 & 16) != 0 ? scheduleWork.gmtEnd : null, (1048063 & 32) != 0 ? scheduleWork.remark : null, (1048063 & 64) != 0 ? scheduleWork.theme : null, (1048063 & 128) != 0 ? scheduleWork.projectUuid : null, (1048063 & 256) != 0 ? scheduleWork.complex : false, (1048063 & 512) != 0 ? scheduleWork.config : jSONString2, (1048063 & 1024) != 0 ? scheduleWork.ordinal : 0, (1048063 & 2048) != 0 ? scheduleWork.fullDay : false, (1048063 & 4096) != 0 ? scheduleWork.state : 0, (1048063 & 8192) != 0 ? scheduleWork.gmtCreate : null, (1048063 & 16384) != 0 ? scheduleWork.subId : null, (1048063 & 32768) != 0 ? scheduleWork.extField1 : null, (1048063 & 65536) != 0 ? scheduleWork.extField2 : null, (1048063 & 131072) != 0 ? scheduleWork.extField3 : null, (1048063 & 262144) != 0 ? scheduleWork.cc : 0, (1048063 & 524288) != 0 ? scheduleWork.cid : null);
                    }
                    arrayList.add(scheduleWork);
                    z = true;
                }
                Iterator it14 = arrayList.iterator();
                str = uuid;
                scheduleShareData3 = scheduleShareData2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                it2 = it14;
                while (it2.hasNext()) {
                    scheduleWork3 = (ScheduleWork) it2.next();
                    scheduleWorkDao = scheduleShareViewModel3.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 2;
                    if (scheduleWorkDao.insert(scheduleWork3, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosSchedulePlanDO> schedulePlans = scheduleShareData3.getSchedulePlans();
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(schedulePlans, 10));
                it4 = schedulePlans.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toSchedulePlan((IosSchedulePlanDO) it4.next()));
                }
                it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    schedulePlan = (SchedulePlan) it5.next();
                    schedulePlanDao = scheduleShareViewModel3.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it5;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosDutyDO> duties = scheduleShareData3.getDuties();
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(duties, 10));
                it6 = duties.iterator();
                while (it6.hasNext()) {
                    ScheduleDuty scheduleDuty2 = ScheduleShareDataKt.toScheduleDuty((IosDutyDO) it6.next());
                    arrayList4.add(scheduleDuty2.copy((8190 & 1) != 0 ? scheduleDuty2.uuid : CommonToolKt.uuid(), (8190 & 2) != 0 ? scheduleDuty2.day : null, (8190 & 4) != 0 ? scheduleDuty2.userId : null, (8190 & 8) != 0 ? scheduleDuty2.workUuid : null, (8190 & 16) != 0 ? scheduleDuty2.secondWorkUuid : null, (8190 & 32) != 0 ? scheduleDuty2.projectUuid : null, (8190 & 64) != 0 ? scheduleDuty2.remark : null, (8190 & 128) != 0 ? scheduleDuty2.gmtCreate : null, (8190 & 256) != 0 ? scheduleDuty2.extField1 : null, (8190 & 512) != 0 ? scheduleDuty2.extField2 : null, (8190 & 1024) != 0 ? scheduleDuty2.extField3 : null, (8190 & 2048) != 0 ? scheduleDuty2.cc : 0, (8190 & 4096) != 0 ? scheduleDuty2.cid : null));
                }
                it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    scheduleDutyDao = scheduleShareViewModel3.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it7;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosAlarmDO> alarms = scheduleShareData3.getAlarms();
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(alarms, 10));
                it8 = alarms.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(ScheduleShareDataKt.toScheduleAlarm((IosAlarmDO) it8.next()));
                }
                it9 = arrayList5.iterator();
                str3 = str;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = anonymousClass1.I$0;
                it = (Iterator) anonymousClass1.L$4;
                string = (String) anonymousClass1.L$3;
                String str7 = (String) anonymousClass1.L$2;
                scheduleShareData2 = (ScheduleShareData) anonymousClass1.L$1;
                scheduleShareViewModel2 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                i = i3;
                uuid = str7;
                while (it.hasNext()) {
                    Object next3 = it.next();
                    i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    iosProjectDO = (IosProjectDO) next3;
                    if (!(!StringsKt.isBlank(string))) {
                        if (!StringsKt.isBlank(iosProjectDO.getName())) {
                            str2 = CollectionsKt.first(StringsKt.split$default((CharSequence) iosProjectDO.getName(), new String[]{"_"}, false, 0, 6, (Object) null)) + "_导入" + MyRandomTool.randomNumber(100, 1000);
                        } else {
                            str2 = "导入排班" + MyRandomTool.randomNumber(100, 1000);
                        }
                    } else if (!StringsKt.isBlank(iosProjectDO.getName())) {
                        str2 = CollectionsKt.first(StringsKt.split$default((CharSequence) iosProjectDO.getName(), new String[]{"_"}, false, 0, 6, (Object) null)) + "_导入" + MyRandomTool.randomNumber(100, 1000);
                    } else {
                        str2 = "导入排班" + MyRandomTool.randomNumber(100, 1000);
                    }
                    scheduleProjectDao = scheduleShareViewModel2.scheduleService.getScheduleProjectDao();
                    scheduleProject = ScheduleShareDataKt.toScheduleProject(iosProjectDO, str2);
                    anonymousClass1.L$0 = scheduleShareViewModel2;
                    anonymousClass1.L$1 = scheduleShareData2;
                    anonymousClass1.L$2 = uuid;
                    anonymousClass1.L$3 = string;
                    anonymousClass1.L$4 = it;
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.label = 1;
                    if (scheduleProjectDao.insert(scheduleProject, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i2;
                }
                List<IosWorkPlanDO> workPlans2 = scheduleShareData2.getWorkPlans();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(workPlans2, 10));
                while (r0.hasNext()) {
                    scheduleWork = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO2);
                    if (iosWorkPlanDO2.getWorkIds().isEmpty() ^ z) {
                        List<String> workIds2 = iosWorkPlanDO2.getWorkIds();
                        arrayList2 = new ArrayList();
                        while (r9.hasNext()) {
                            it3 = scheduleShareData2.getWorkPlans().iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                } else {
                                    next = null;
                                }
                                iosWorkPlanDO = (IosWorkPlanDO) next;
                                if (iosWorkPlanDO != null) {
                                    scheduleWork2 = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO);
                                } else {
                                    scheduleWork2 = null;
                                }
                                if (scheduleWork2 != null) {
                                    arrayList2.add(scheduleWork2);
                                }
                            } while (!Intrinsics.areEqual(((IosWorkPlanDO) next).getUuid(), str6));
                            iosWorkPlanDO = (IosWorkPlanDO) next;
                            if (iosWorkPlanDO != null) {
                                scheduleWork2 = ScheduleShareDataKt.toScheduleWork(iosWorkPlanDO);
                            } else {
                                scheduleWork2 = null;
                            }
                            if (scheduleWork2 != null) {
                                arrayList2.add(scheduleWork2);
                            }
                        }
                        String jSONString3 = JSON.toJSONString(arrayList2);
                        Intrinsics.checkNotNullExpressionValue(jSONString3, "childWorks.toJSONString()");
                        scheduleWork = scheduleWork.copy((1048063 & 1) != 0 ? scheduleWork.uuid : null, (1048063 & 2) != 0 ? scheduleWork.name : null, (1048063 & 4) != 0 ? scheduleWork.userId : null, (1048063 & 8) != 0 ? scheduleWork.gmtBegin : null, (1048063 & 16) != 0 ? scheduleWork.gmtEnd : null, (1048063 & 32) != 0 ? scheduleWork.remark : null, (1048063 & 64) != 0 ? scheduleWork.theme : null, (1048063 & 128) != 0 ? scheduleWork.projectUuid : null, (1048063 & 256) != 0 ? scheduleWork.complex : false, (1048063 & 512) != 0 ? scheduleWork.config : jSONString3, (1048063 & 1024) != 0 ? scheduleWork.ordinal : 0, (1048063 & 2048) != 0 ? scheduleWork.fullDay : false, (1048063 & 4096) != 0 ? scheduleWork.state : 0, (1048063 & 8192) != 0 ? scheduleWork.gmtCreate : null, (1048063 & 16384) != 0 ? scheduleWork.subId : null, (1048063 & 32768) != 0 ? scheduleWork.extField1 : null, (1048063 & 65536) != 0 ? scheduleWork.extField2 : null, (1048063 & 131072) != 0 ? scheduleWork.extField3 : null, (1048063 & 262144) != 0 ? scheduleWork.cc : 0, (1048063 & 524288) != 0 ? scheduleWork.cid : null);
                    }
                    arrayList.add(scheduleWork);
                    z = true;
                }
                Iterator it15 = arrayList.iterator();
                str = uuid;
                scheduleShareData3 = scheduleShareData2;
                scheduleShareViewModel3 = scheduleShareViewModel2;
                it2 = it15;
                while (it2.hasNext()) {
                    scheduleWork3 = (ScheduleWork) it2.next();
                    scheduleWorkDao = scheduleShareViewModel3.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 2;
                    if (scheduleWorkDao.insert(scheduleWork3, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosSchedulePlanDO> schedulePlans2 = scheduleShareData3.getSchedulePlans();
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(schedulePlans2, 10));
                it4 = schedulePlans2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toSchedulePlan((IosSchedulePlanDO) it4.next()));
                }
                it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    schedulePlan = (SchedulePlan) it5.next();
                    schedulePlanDao = scheduleShareViewModel3.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it5;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosDutyDO> duties2 = scheduleShareData3.getDuties();
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(duties2, 10));
                it6 = duties2.iterator();
                while (it6.hasNext()) {
                    ScheduleDuty scheduleDuty3 = ScheduleShareDataKt.toScheduleDuty((IosDutyDO) it6.next());
                    arrayList4.add(scheduleDuty3.copy((8190 & 1) != 0 ? scheduleDuty3.uuid : CommonToolKt.uuid(), (8190 & 2) != 0 ? scheduleDuty3.day : null, (8190 & 4) != 0 ? scheduleDuty3.userId : null, (8190 & 8) != 0 ? scheduleDuty3.workUuid : null, (8190 & 16) != 0 ? scheduleDuty3.secondWorkUuid : null, (8190 & 32) != 0 ? scheduleDuty3.projectUuid : null, (8190 & 64) != 0 ? scheduleDuty3.remark : null, (8190 & 128) != 0 ? scheduleDuty3.gmtCreate : null, (8190 & 256) != 0 ? scheduleDuty3.extField1 : null, (8190 & 512) != 0 ? scheduleDuty3.extField2 : null, (8190 & 1024) != 0 ? scheduleDuty3.extField3 : null, (8190 & 2048) != 0 ? scheduleDuty3.cc : 0, (8190 & 4096) != 0 ? scheduleDuty3.cid : null));
                }
                it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    scheduleDutyDao = scheduleShareViewModel3.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it7;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosAlarmDO> alarms2 = scheduleShareData3.getAlarms();
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(alarms2, 10));
                it8 = alarms2.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(ScheduleShareDataKt.toScheduleAlarm((IosAlarmDO) it8.next()));
                }
                it9 = arrayList5.iterator();
                str3 = str;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                it2 = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleShareData3 = (ScheduleShareData) anonymousClass1.L$1;
                scheduleShareViewModel3 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it2.hasNext()) {
                    scheduleWork3 = (ScheduleWork) it2.next();
                    scheduleWorkDao = scheduleShareViewModel3.scheduleService.getScheduleWorkDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 2;
                    if (scheduleWorkDao.insert(scheduleWork3, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosSchedulePlanDO> schedulePlans3 = scheduleShareData3.getSchedulePlans();
                arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(schedulePlans3, 10));
                it4 = schedulePlans3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(ScheduleShareDataKt.toSchedulePlan((IosSchedulePlanDO) it4.next()));
                }
                it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    schedulePlan = (SchedulePlan) it5.next();
                    schedulePlanDao = scheduleShareViewModel3.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it5;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosDutyDO> duties3 = scheduleShareData3.getDuties();
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(duties3, 10));
                it6 = duties3.iterator();
                while (it6.hasNext()) {
                    ScheduleDuty scheduleDuty4 = ScheduleShareDataKt.toScheduleDuty((IosDutyDO) it6.next());
                    arrayList4.add(scheduleDuty4.copy((8190 & 1) != 0 ? scheduleDuty4.uuid : CommonToolKt.uuid(), (8190 & 2) != 0 ? scheduleDuty4.day : null, (8190 & 4) != 0 ? scheduleDuty4.userId : null, (8190 & 8) != 0 ? scheduleDuty4.workUuid : null, (8190 & 16) != 0 ? scheduleDuty4.secondWorkUuid : null, (8190 & 32) != 0 ? scheduleDuty4.projectUuid : null, (8190 & 64) != 0 ? scheduleDuty4.remark : null, (8190 & 128) != 0 ? scheduleDuty4.gmtCreate : null, (8190 & 256) != 0 ? scheduleDuty4.extField1 : null, (8190 & 512) != 0 ? scheduleDuty4.extField2 : null, (8190 & 1024) != 0 ? scheduleDuty4.extField3 : null, (8190 & 2048) != 0 ? scheduleDuty4.cc : 0, (8190 & 4096) != 0 ? scheduleDuty4.cid : null));
                }
                it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    scheduleDutyDao = scheduleShareViewModel3.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it7;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosAlarmDO> alarms3 = scheduleShareData3.getAlarms();
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(alarms3, 10));
                it8 = alarms3.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(ScheduleShareDataKt.toScheduleAlarm((IosAlarmDO) it8.next()));
                }
                it9 = arrayList5.iterator();
                str3 = str;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 3:
                it5 = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleShareData3 = (ScheduleShareData) anonymousClass1.L$1;
                scheduleShareViewModel3 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it5.hasNext()) {
                    schedulePlan = (SchedulePlan) it5.next();
                    schedulePlanDao = scheduleShareViewModel3.scheduleService.getSchedulePlanDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it5;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 3;
                    if (schedulePlanDao.insert(schedulePlan, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosDutyDO> duties4 = scheduleShareData3.getDuties();
                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(duties4, 10));
                it6 = duties4.iterator();
                while (it6.hasNext()) {
                    ScheduleDuty scheduleDuty5 = ScheduleShareDataKt.toScheduleDuty((IosDutyDO) it6.next());
                    arrayList4.add(scheduleDuty5.copy((8190 & 1) != 0 ? scheduleDuty5.uuid : CommonToolKt.uuid(), (8190 & 2) != 0 ? scheduleDuty5.day : null, (8190 & 4) != 0 ? scheduleDuty5.userId : null, (8190 & 8) != 0 ? scheduleDuty5.workUuid : null, (8190 & 16) != 0 ? scheduleDuty5.secondWorkUuid : null, (8190 & 32) != 0 ? scheduleDuty5.projectUuid : null, (8190 & 64) != 0 ? scheduleDuty5.remark : null, (8190 & 128) != 0 ? scheduleDuty5.gmtCreate : null, (8190 & 256) != 0 ? scheduleDuty5.extField1 : null, (8190 & 512) != 0 ? scheduleDuty5.extField2 : null, (8190 & 1024) != 0 ? scheduleDuty5.extField3 : null, (8190 & 2048) != 0 ? scheduleDuty5.cc : 0, (8190 & 4096) != 0 ? scheduleDuty5.cid : null));
                }
                it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    scheduleDutyDao = scheduleShareViewModel3.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it7;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosAlarmDO> alarms4 = scheduleShareData3.getAlarms();
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(alarms4, 10));
                it8 = alarms4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(ScheduleShareDataKt.toScheduleAlarm((IosAlarmDO) it8.next()));
                }
                it9 = arrayList5.iterator();
                str3 = str;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 4:
                it7 = (Iterator) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                scheduleShareData3 = (ScheduleShareData) anonymousClass1.L$1;
                scheduleShareViewModel3 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                while (it7.hasNext()) {
                    scheduleDuty = (ScheduleDuty) it7.next();
                    scheduleDutyDao = scheduleShareViewModel3.scheduleService.getScheduleDutyDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = scheduleShareData3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = it7;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 4;
                    if (scheduleDutyDao.insert(scheduleDuty, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                List<IosAlarmDO> alarms5 = scheduleShareData3.getAlarms();
                arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(alarms5, 10));
                it8 = alarms5.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(ScheduleShareDataKt.toScheduleAlarm((IosAlarmDO) it8.next()));
                }
                it9 = arrayList5.iterator();
                str3 = str;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 5:
                it9 = (Iterator) anonymousClass1.L$2;
                str3 = (String) anonymousClass1.L$1;
                ScheduleShareViewModel scheduleShareViewModel5 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                scheduleShareViewModel3 = scheduleShareViewModel5;
                while (it9.hasNext()) {
                    scheduleAlarm = (ScheduleAlarm) it9.next();
                    alarmDao = scheduleShareViewModel3.scheduleService.getAlarmDao();
                    anonymousClass1.L$0 = scheduleShareViewModel3;
                    anonymousClass1.L$1 = str3;
                    anonymousClass1.L$2 = it9;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.label = 5;
                    if (alarmDao.insert(scheduleAlarm, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                scheduleService = scheduleShareViewModel3.scheduleService;
                anonymousClass1.L$0 = scheduleShareViewModel3;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 6;
                if (scheduleService.setProjectId(str3, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                scheduleShareViewModel4 = scheduleShareViewModel3;
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 6:
                scheduleShareViewModel4 = (ScheduleShareViewModel) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                scheduleService2 = scheduleShareViewModel4.scheduleService;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 7;
                if (scheduleService2.notifyWidget(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}