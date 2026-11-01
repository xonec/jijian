package cn.jianyun.workplan.module.schedule.views.wechat;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.api.ShareApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.poi.ss.formula.functions.Complex;

/* JADX INFO: compiled from: WechatView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "shareApi", "Lcn/jianyun/workplan/api/ShareApi;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;Lcn/jianyun/workplan/api/ShareApi;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "getShareApi", "()Lcn/jianyun/workplan/api/ShareApi;", "<set-?>", "", "userUuid", "getUserUuid", "()Ljava/lang/String;", "setUserUuid", "(Ljava/lang/String;)V", "userUuid$delegate", "Landroidx/compose/runtime/MutableState;", "doSave", "", "navHostController", "Landroidx/navigation/NavHostController;", "getRepository", "reload", "reloadData", "dataChanged", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WechatViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final ScheduleService scheduleService;
    private final ShareApi shareApi;

    /* JADX INFO: renamed from: userUuid$delegate, reason: from kotlin metadata */
    private final MutableState userUuid;

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
    }

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final ScheduleService getScheduleService() {
        return this.scheduleService;
    }

    public final ShareApi getShareApi() {
        return this.shareApi;
    }

    @Inject
    public WechatViewModel(BaseRepository baseRepository, ScheduleService scheduleService, ShareApi shareApi) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(scheduleService, "scheduleService");
        Intrinsics.checkNotNullParameter(shareApi, "shareApi");
        this.baseRepository = baseRepository;
        this.scheduleService = scheduleService;
        this.shareApi = shareApi;
        this.userUuid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getUserUuid() {
        return (String) this.userUuid.getValue();
    }

    public final void setUserUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userUuid.setValue(str);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    public final void doSave(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        if (Intrinsics.areEqual(getUserUuid(), "")) {
            this.baseRepository.toast("用户ID不能为空");
        } else if (getUserUuid().length() == 8) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
        } else {
            this.baseRepository.toast("用户ID是8位喔");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$doSave$1, reason: invalid class name */
    /* JADX INFO: compiled from: WechatView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$doSave$1", f = "WechatView.kt", i = {3, 3, 4, 4, 4, 5, 5, 6}, l = {89, 90, 91, 103, 107, 121, 124, 129}, m = "invokeSuspend", n = {"projects", "pro", "projects", "pro", Complex.DEFAULT_SUFFIX, "projects", "pro", "projects"}, s = {"L$0", "L$3", "L$0", "L$3", "L$4", "L$0", "L$3", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WechatViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0128  */
        /* JADX WARN: Code duplicated, block: B:34:0x014f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0150  */
        /* JADX WARN: Code duplicated, block: B:39:0x0177  */
        /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:48:0x0223  */
        /* JADX WARN: Code duplicated, block: B:50:0x0231  */
        /* JADX WARN: Code duplicated, block: B:51:0x0266  */
        /* JADX WARN: Code duplicated, block: B:54:0x0276  */
        /* JADX WARN: Code duplicated, block: B:64:0x02c5 A[LOOP:2: B:43:0x01e2->B:64:0x02c5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:68:0x02d9  */
        /* JADX WARN: Code duplicated, block: B:84:0x0300 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:0: B:66:0x02d3->B:86:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x01d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:? A[LOOP:1: B:37:0x0171->B:90:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0291 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x02c4 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x02c8 -> B:66:0x02d3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instruction units count: 890
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: WechatView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$reload$1", f = "WechatView.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WechatViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            WechatViewModel wechatViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WechatViewModel wechatViewModel2 = WechatViewModel.this;
                wechatViewModel2.setOldSid(wechatViewModel2.getBaseRepository().getSid());
                WechatViewModel wechatViewModel3 = WechatViewModel.this;
                this.L$0 = wechatViewModel3;
                this.label = 1;
                Object cache$default = BaseRepository.getCache$default(wechatViewModel3.getBaseRepository(), "wechatUserUuid", null, this, 2, null);
                if (cache$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wechatViewModel = wechatViewModel3;
                obj = cache$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wechatViewModel = (WechatViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            wechatViewModel.setUserUuid((String) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}