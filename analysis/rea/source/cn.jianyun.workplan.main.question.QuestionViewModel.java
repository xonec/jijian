package cn.jianyun.workplan.main.question;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.util.CommonToolKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: QuestionViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcn/jianyun/workplan/main/question/QuestionViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "api", "Lcn/jianyun/workplan/api/BaseApi;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/api/BaseApi;)V", "getApi", "()Lcn/jianyun/workplan/api/BaseApi;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "currentModule", "getCurrentModule", "()Ljava/lang/String;", "setCurrentModule", "(Ljava/lang/String;)V", "currentModule$delegate", "Landroidx/compose/runtime/MutableState;", "questions", "", "Lcn/jianyun/workplan/main/question/QuestionModel;", "getQuestions", "()Ljava/util/List;", "setQuestions", "(Ljava/util/List;)V", "getRepository", "initModel", "", "module", "reload", "reloadData", "dataChanged", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QuestionViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseApi api;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: currentModule$delegate, reason: from kotlin metadata */
    private final MutableState currentModule;
    private List<QuestionModel> questions;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final BaseApi getApi() {
        return this.api;
    }

    @Inject
    public QuestionViewModel(BaseRepository baseRepository, BaseApi api) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(api, "api");
        this.baseRepository = baseRepository;
        this.api = api;
        this.currentModule = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.questions = new ArrayList();
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentModule() {
        return (String) this.currentModule.getValue();
    }

    public final void setCurrentModule(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentModule.setValue(str);
    }

    public final List<QuestionModel> getQuestions() {
        return this.questions;
    }

    public final void setQuestions(List<QuestionModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.questions = list;
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.question.QuestionViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: QuestionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.question.QuestionViewModel$reload$1", f = "QuestionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionViewModel.this.new AnonymousClass1(continuation);
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
            QuestionViewModel questionViewModel = QuestionViewModel.this;
            questionViewModel.setOldSid(questionViewModel.getBaseRepository().getSid());
            BaseViewModel.reloadData$default(QuestionViewModel.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
        if (this.questions.isEmpty()) {
            int i = 0;
            int i2 = 8;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.questions.add(new QuestionModel("入门", "关于我们？", "一个致力于开发工具软件的公司，让用户能真正体验到技术带来的便捷性", i, i2, defaultConstructorMarker));
            this.questions.add(new QuestionModel("入门", "极简排班适合哪些人用？", "如果你上班不规律，时而上班次1，时而上班次2，那么恭喜你，非常适合使用极简排班APP来规划你的排班", i, i2, defaultConstructorMarker));
            this.questions.add(new QuestionModel("入门", "极简排班如何使用？", CommonToolKt.oneLine("\n                第一步：添加自定义班次，如早班，晚班，并设置好上下班时间<br>\n                第二步：添加周期排班，如果你的班次在以某一个周期在循环排班，那么你只要建立这一周期的排班情况，就可以通过首页周期排班功能循环设置排班了<br>\n                第三步：首页进行排班，用户既可以自定义排班，也可以周期排班<br>\n                第四步：设置提醒，基于班次设置提醒\n            "), i, i2, defaultConstructorMarker));
            this.questions.add(new QuestionModel("入门", "用户排班数据存储在哪里？", "您的排班信息，安全又私密。我们承诺，所有的排班数据仅存储于您的个人设备上，不会上传至任何服务器。这意味着，即使我们的服务器遇到任何问题，您的排班信息也安全无忧，确保您享受流畅无忧的APP体验。", i, i2, defaultConstructorMarker));
            this.questions.add(new QuestionModel("入门", "为什么你们不做云备份？", "开发者认为只有数据掌握在用户自己手里，对用户才是负责任的，这样既保证了用户数据的安全性，也避免开发者服务器遭受攻击，导致用户无法访问APP，影响用户正常操作", i, i2, defaultConstructorMarker));
            this.questions.add(new QuestionModel("入门", "后续有哪些开发规划？", CommonToolKt.oneLine("1.支持分享和导入排班<br>"), i, i2, defaultConstructorMarker));
        }
    }

    public final void initModel(String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        if (getInited()) {
            return;
        }
        setInited(true);
        setCurrentModule(module);
    }
}