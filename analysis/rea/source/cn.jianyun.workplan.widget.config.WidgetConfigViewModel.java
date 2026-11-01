package cn.jianyun.workplan.widget.config;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.widget.WidgetConfig;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
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

/* JADX INFO: compiled from: WidgetConfigView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcn/jianyun/workplan/widget/config/WidgetConfigViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Lcn/jianyun/workplan/widget/WidgetConfig;", "widgetConfig", "getWidgetConfig", "()Lcn/jianyun/workplan/widget/WidgetConfig;", "setWidgetConfig", "(Lcn/jianyun/workplan/widget/WidgetConfig;)V", "widgetConfig$delegate", "Landroidx/compose/runtime/MutableState;", "getRepository", "initModel", "", "model", "reload", "reloadData", "dataChanged", "", "save", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WidgetConfigViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: widgetConfig$delegate, reason: from kotlin metadata */
    private final MutableState widgetConfig;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public WidgetConfigViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.widgetConfig = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WidgetConfig(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, false, false, false, false, false, false, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null), null, 2, null);
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WidgetConfig getWidgetConfig() {
        return (WidgetConfig) this.widgetConfig.getValue();
    }

    public final void setWidgetConfig(WidgetConfig widgetConfig) {
        Intrinsics.checkNotNullParameter(widgetConfig, "<set-?>");
        this.widgetConfig.setValue(widgetConfig);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.widget.config.WidgetConfigViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetConfigView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.widget.config.WidgetConfigViewModel$reload$1", f = "WidgetConfigView.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WidgetConfigViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            WidgetConfigViewModel widgetConfigViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WidgetConfigViewModel widgetConfigViewModel2 = WidgetConfigViewModel.this;
                widgetConfigViewModel2.setOldSid(widgetConfigViewModel2.getBaseRepository().getSid());
                WidgetConfigViewModel widgetConfigViewModel3 = WidgetConfigViewModel.this;
                this.L$0 = widgetConfigViewModel3;
                this.label = 1;
                Object widgetConfig = widgetConfigViewModel3.getBaseRepository().getWidgetConfig(this);
                if (widgetConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
                widgetConfigViewModel = widgetConfigViewModel3;
                obj = widgetConfig;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                widgetConfigViewModel = (WidgetConfigViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            widgetConfigViewModel.setWidgetConfig((WidgetConfig) obj);
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

    public final void initModel(WidgetConfig model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (getInited()) {
            return;
        }
        setInited(true);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.widget.config.WidgetConfigViewModel$save$1, reason: invalid class name */
    /* JADX INFO: compiled from: WidgetConfigView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.widget.config.WidgetConfigViewModel$save$1", f = "WidgetConfigView.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_HTTP_RES_FINSIH_TIME}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WidgetConfigViewModel.this.new AnonymousClass1(continuation);
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
                if (WidgetConfigViewModel.this.getBaseRepository().setWidgetConfig(WidgetConfigViewModel.this.getWidgetConfig(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WidgetConfigViewModel.this.toast("快去桌面看看实际效果吧");
            return Unit.INSTANCE;
        }
    }

    public final void save() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}