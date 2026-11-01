package cn.jianyun.workplan.ui.component.nav;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
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

/* JADX INFO: compiled from: SwipeRowView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcn/jianyun/workplan/ui/component/nav/SwipeViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "focusId", "getFocusId", "()Ljava/lang/String;", "setFocusId", "(Ljava/lang/String;)V", "focusId$delegate", "Landroidx/compose/runtime/MutableState;", "", "sid", "getSid", "()I", "setSid", "(I)V", "sid$delegate", "change", "", "fid", "reload", "tryReload", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwipeViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: focusId$delegate, reason: from kotlin metadata */
    private final MutableState focusId;

    /* JADX INFO: renamed from: sid$delegate, reason: from kotlin metadata */
    private final MutableState sid;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public SwipeViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.focusId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        setFocusId(baseRepository.getFocusId());
        this.sid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFocusId() {
        return (String) this.focusId.getValue();
    }

    public final void setFocusId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusId.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSid() {
        return ((Number) this.sid.getValue()).intValue();
    }

    public final void setSid(int i) {
        this.sid.setValue(Integer.valueOf(i));
    }

    public final void tryReload() {
        if (getSid() != this.baseRepository.getSid()) {
            reload();
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.nav.SwipeViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: SwipeRowView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.component.nav.SwipeViewModel$reload$1", f = "SwipeRowView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SwipeViewModel.this.new AnonymousClass1(continuation);
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
            SwipeViewModel swipeViewModel = SwipeViewModel.this;
            swipeViewModel.setSid(swipeViewModel.getBaseRepository().getSid());
            SwipeViewModel swipeViewModel2 = SwipeViewModel.this;
            swipeViewModel2.setFocusId(swipeViewModel2.getBaseRepository().getFocusId());
            return Unit.INSTANCE;
        }
    }

    public final void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void change(String fid) {
        Intrinsics.checkNotNullParameter(fid, "fid");
        this.baseRepository.setFocusId(fid);
    }
}