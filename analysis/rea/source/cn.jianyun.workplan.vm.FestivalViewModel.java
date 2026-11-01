package cn.jianyun.workplan.vm;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.model.FormType;
import com.adgain.sdk.base.models.point.PointEvent;
import dagger.hilt.android.qualifiers.ApplicationContext;
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

/* JADX INFO: compiled from: FestivalViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcn/jianyun/workplan/vm/FestivalViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "festivalApi", "Lcn/jianyun/workplan/api/BaseApi;", "context", "Landroid/content/Context;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/api/BaseApi;Landroid/content/Context;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getContext", "()Landroid/content/Context;", "getFestivalApi", "()Lcn/jianyun/workplan/api/BaseApi;", "<set-?>", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "Landroidx/compose/runtime/MutableState;", PointEvent.INIT, "", "isForm", "", "type", "", "toast", "msg", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FestivalViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;
    private final Context context;
    private final BaseApi festivalApi;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final BaseApi getFestivalApi() {
        return this.festivalApi;
    }

    public final Context getContext() {
        return this.context;
    }

    @Inject
    public FestivalViewModel(BaseRepository baseRepository, BaseApi festivalApi, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(festivalApi, "festivalApi");
        Intrinsics.checkNotNullParameter(context, "context");
        this.baseRepository = baseRepository;
        this.festivalApi = festivalApi;
        this.context = context;
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType(null, null, null, 7, null), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    public final boolean isForm(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(getFormType().getType(), type);
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.baseRepository.toast(msg);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.FestivalViewModel$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: FestivalViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.FestivalViewModel$init$1", f = "FestivalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
            return Unit.INSTANCE;
        }
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}