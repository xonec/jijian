package cn.jianyun.workplan.main.setting.cloud.jgy;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyWebdavTool;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: JgyBindView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "loginUser", "getLoginUser", "()Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "setLoginUser", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;)V", "loginUser$delegate", "Landroidx/compose/runtime/MutableState;", "doBind", "", "onDismiss", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JgyBindViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: loginUser$delegate, reason: from kotlin metadata */
    private final MutableState loginUser;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public JgyBindViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.loginUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WebDAVUser(null, null, null, null, null, null, null, false, false, 0, false, null, false, 8191, null), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebDAVUser getLoginUser() {
        return (WebDAVUser) this.loginUser.getValue();
    }

    public final void setLoginUser(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "<set-?>");
        this.loginUser.setValue(webDAVUser);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel$doBind$1, reason: invalid class name */
    /* JADX INFO: compiled from: JgyBindView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel$doBind$1", f = "JgyBindView.kt", i = {}, l = {42, 50}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onDismiss;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onDismiss = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JgyBindViewModel.this.new AnonymousClass1(this.$onDismiss, continuation);
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
                String strIsValid = JgyBindViewModel.this.getLoginUser().isValid();
                if (!CommonToolKt.isOk(strIsValid)) {
                    JgyBindViewModel.this.getBaseRepository().toast(strIsValid);
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (BaseRepository.loading$default(JgyBindViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
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
                JgyBindViewModel.this.getBaseRepository().reload();
                JgyBindViewModel.this.getBaseRepository().toast("绑定成功");
                this.$onDismiss.invoke();
                JgyBindViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            JgyBindViewModel.this.getLoginUser().setUrl("https://dav.jianguoyun.com/dav/");
            if (MyWebdavTool.INSTANCE.check(JgyBindViewModel.this.getLoginUser())) {
                BaseRepository baseRepository = JgyBindViewModel.this.getBaseRepository();
                WebDAVUser loginUser = JgyBindViewModel.this.getLoginUser();
                this.label = 2;
                if (baseRepository.makeJgyUser(loginUser.copy((8063 & 1) != 0 ? loginUser.uuid : null, (8063 & 2) != 0 ? loginUser.url : null, (8063 & 4) != 0 ? loginUser.username : null, (8063 & 8) != 0 ? loginUser.password : null, (8063 & 16) != 0 ? loginUser.platform : "坚果云", (8063 & 32) != 0 ? loginUser.type : null, (8063 & 64) != 0 ? loginUser.defaultPath : null, (8063 & 128) != 0 ? loginUser.masterNode : false, (8063 & 256) != 0 ? loginUser.bind : true, (8063 & 512) != 0 ? loginUser.ordinal : 0, (8063 & 1024) != 0 ? loginUser.shown : false, (8063 & 2048) != 0 ? loginUser.message : null, (8063 & 4096) != 0 ? loginUser.cloud : false), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                JgyBindViewModel.this.getBaseRepository().reload();
                JgyBindViewModel.this.getBaseRepository().toast("绑定成功");
                this.$onDismiss.invoke();
            } else {
                JgyBindViewModel.this.getBaseRepository().toast("账号或密码错误");
            }
            JgyBindViewModel.this.getBaseRepository().finish();
            return Unit.INSTANCE;
        }
    }

    public final void doBind(Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(onDismiss, null), 2, null);
    }
}