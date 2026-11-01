package cn.jianyun.workplan.module.base.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.base.model.BasicCloudData;
import cn.jianyun.workplan.main.base.service.BaseService;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.LocalBackupConfig;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.CommonToolKt;
import com.wangmai.permission.androidsupport.FileProvider;
import java.util.List;
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

/* JADX INFO: compiled from: BaseCloudViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0004H&J\u0006\u0010P\u001a\u00020NJ\u0006\u0010Q\u001a\u00020NJ\b\u0010R\u001a\u00020NH\u0016J\b\u0010S\u001a\u00020NH&J\b\u0010T\u001a\u00020UH&J\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020%J\u0006\u0010Y\u001a\u00020%J\u000e\u0010Z\u001a\u00020N2\u0006\u0010[\u001a\u00020\rJ\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010_\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020NH\u0016J\b\u0010b\u001a\u00020NH\u0016J\u0006\u0010c\u001a\u00020NJ\u000e\u0010d\u001a\u00020N2\u0006\u0010e\u001a\u00020\u0004J\u000e\u0010f\u001a\u00020N2\u0006\u0010g\u001a\u00020\u0004J\u0006\u0010h\u001a\u00020NR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u000b\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R+\u00100\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u000b\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R7\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u000b\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012R+\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u000b\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR+\u0010<\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u000b\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010B\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u000b\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R+\u0010G\u001a\u00020F2\u0006\u0010\u0003\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lcn/jianyun/workplan/module/base/vm/BaseCloudViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "", "backType", "getBackType", "()Ljava/lang/String;", "setBackType", "(Ljava/lang/String;)V", "backType$delegate", "Landroidx/compose/runtime/MutableState;", "", "Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "cloudDatalist", "getCloudDatalist", "()Ljava/util/List;", "setCloudDatalist", "(Ljava/util/List;)V", "cloudDatalist$delegate", "currentCloudData", "getCurrentCloudData", "()Lcn/jianyun/workplan/main/base/model/BasicCloudData;", "setCurrentCloudData", "(Lcn/jianyun/workplan/main/base/model/BasicCloudData;)V", "currentCloudData$delegate", "datalist", "getDatalist", "setDatalist", "datalist$delegate", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "", "hasLoadCloud", "getHasLoadCloud", "()Z", "setHasLoadCloud", "(Z)V", "hasLoadCloud$delegate", "inited", "getInited", "setInited", "inited$delegate", "isEmpty", "setEmpty", "isEmpty$delegate", "localDatalist", "getLocalDatalist", "setLocalDatalist", "localDatalist$delegate", "localPath", "getLocalPath", "setLocalPath", "localPath$delegate", "", "oldSid", "getOldSid", "()I", "setOldSid", "(I)V", "oldSid$delegate", "tip", "getTip", "setTip", "tip$delegate", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "webDavUser", "getWebDavUser", "()Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "setWebDavUser", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;)V", "webDavUser$delegate", "changeBackType", "", "type", "cleanBackup", "deleteBackup", "doBackup", "doBatchImport", "getCloudService", "Lcn/jianyun/workplan/main/base/service/BaseService;", "getRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "hasData", "isValid", "justShowBackupDialog", "model", "loadBackData", "Lcn/jianyun/workplan/api/ApiResult;", "", "cloudData", "(Lcn/jianyun/workplan/main/base/model/BasicCloudData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reload", "reloadData", "resetForm", "saveLocalData", FileProvider.ATTR_PATH, "toast", "msg", "tryReload", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseCloudViewModel extends ViewModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: currentCloudData$delegate, reason: from kotlin metadata */
    private final MutableState currentCloudData;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    /* JADX INFO: renamed from: tip$delegate, reason: from kotlin metadata */
    private final MutableState tip;

    /* JADX INFO: renamed from: webDavUser$delegate, reason: from kotlin metadata */
    private final MutableState webDavUser;

    /* JADX INFO: renamed from: inited$delegate, reason: from kotlin metadata */
    private final MutableState inited = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* JADX INFO: renamed from: oldSid$delegate, reason: from kotlin metadata */
    private final MutableState oldSid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: datalist$delegate, reason: from kotlin metadata */
    private final MutableState datalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: localDatalist$delegate, reason: from kotlin metadata */
    private final MutableState localDatalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: cloudDatalist$delegate, reason: from kotlin metadata */
    private final MutableState cloudDatalist = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: localPath$delegate, reason: from kotlin metadata */
    private final MutableState localPath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: backType$delegate, reason: from kotlin metadata */
    private final MutableState backType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("local", null, 2, null);

    /* JADX INFO: renamed from: hasLoadCloud$delegate, reason: from kotlin metadata */
    private final MutableState hasLoadCloud = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* JADX INFO: renamed from: isEmpty$delegate, reason: from kotlin metadata */
    private final MutableState isEmpty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    public abstract void changeBackType(String type);

    public abstract void doBatchImport();

    public abstract BaseService getCloudService();

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCloudViewModel() {
        String str = null;
        String str2 = null;
        String str3 = null;
        this.webDavUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WebDAVUser(null, str, str2, null, null, str3, null, false, false, 0, false, null, false, 8191, null), null, 2, null);
        int i = 6;
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("", str, str2, i, null == true ? 1 : 0), null, 2, null);
        this.tip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("", str, str2, i, null == true ? 1 : 0), null, 2, null);
        this.currentCloudData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new BasicCloudData(null, str, str2, null, null == true ? 1 : 0, str3, 63, null), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInited() {
        return ((Boolean) this.inited.getValue()).booleanValue();
    }

    public final void setInited(boolean z) {
        this.inited.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOldSid() {
        return ((Number) this.oldSid.getValue()).intValue();
    }

    public final void setOldSid(int i) {
        this.oldSid.setValue(Integer.valueOf(i));
    }

    public final List<BasicCloudData> getDatalist() {
        return (List) this.datalist.getValue();
    }

    public final void setDatalist(List<BasicCloudData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datalist.setValue(list);
    }

    public final List<BasicCloudData> getLocalDatalist() {
        return (List) this.localDatalist.getValue();
    }

    public final void setLocalDatalist(List<BasicCloudData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.localDatalist.setValue(list);
    }

    public final List<BasicCloudData> getCloudDatalist() {
        return (List) this.cloudDatalist.getValue();
    }

    public final void setCloudDatalist(List<BasicCloudData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cloudDatalist.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebDAVUser getWebDavUser() {
        return (WebDAVUser) this.webDavUser.getValue();
    }

    public final void setWebDavUser(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "<set-?>");
        this.webDavUser.setValue(webDAVUser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getLocalPath() {
        return (String) this.localPath.getValue();
    }

    public final void setLocalPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localPath.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getFormType() {
        return (FormType) this.formType.getValue();
    }

    public final void setFormType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.formType.setValue(formType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FormType getTip() {
        return (FormType) this.tip.getValue();
    }

    public final void setTip(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.tip.setValue(formType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BasicCloudData getCurrentCloudData() {
        return (BasicCloudData) this.currentCloudData.getValue();
    }

    public final void setCurrentCloudData(BasicCloudData basicCloudData) {
        Intrinsics.checkNotNullParameter(basicCloudData, "<set-?>");
        this.currentCloudData.setValue(basicCloudData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getBackType() {
        return (String) this.backType.getValue();
    }

    public final void setBackType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backType.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasLoadCloud() {
        return ((Boolean) this.hasLoadCloud.getValue()).booleanValue();
    }

    public final void setHasLoadCloud(boolean z) {
        this.hasLoadCloud.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isEmpty() {
        return ((Boolean) this.isEmpty.getValue()).booleanValue();
    }

    public final void setEmpty(boolean z) {
        this.isEmpty.setValue(Boolean.valueOf(z));
    }

    public final BaseRepository getRepository() {
        return getCloudService().getRepository();
    }

    public final void tryReload() {
        if (getOldSid() != getRepository().getSid()) {
            reload();
        }
    }

    public final boolean isValid() {
        if (Intrinsics.areEqual(getBackType(), "local")) {
            return !Intrinsics.areEqual(getLocalPath(), "");
        }
        return getWebDavUser().getBind();
    }

    public final boolean hasData() {
        if (Intrinsics.areEqual(getBackType(), "local")) {
            return !getDatalist().isEmpty();
        }
        return !getCloudDatalist().isEmpty();
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$reload$1", f = "BaseCloudViewModel.kt", i = {}, l = {68, 69, 70}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BaseCloudViewModel baseCloudViewModel;
            BaseCloudViewModel baseCloudViewModel2;
            BaseCloudViewModel baseCloudViewModel3;
            Object objIsEmpty;
            BaseCloudViewModel baseCloudViewModel4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseCloudViewModel baseCloudViewModel5 = BaseCloudViewModel.this;
                baseCloudViewModel5.setOldSid(baseCloudViewModel5.getRepository().getSid());
                baseCloudViewModel = BaseCloudViewModel.this;
                this.L$0 = baseCloudViewModel;
                this.label = 1;
                obj = baseCloudViewModel.getRepository().getWebDAVUser(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    baseCloudViewModel = (BaseCloudViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    baseCloudViewModel2 = (BaseCloudViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    baseCloudViewModel2.setLocalPath((String) obj);
                    baseCloudViewModel3 = BaseCloudViewModel.this;
                    this.L$0 = baseCloudViewModel3;
                    this.label = 3;
                    objIsEmpty = baseCloudViewModel3.getCloudService().isEmpty(this);
                    if (objIsEmpty == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseCloudViewModel4 = baseCloudViewModel3;
                    obj = objIsEmpty;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    baseCloudViewModel4 = (BaseCloudViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                baseCloudViewModel4.setEmpty(((Boolean) obj).booleanValue());
                BaseCloudViewModel.this.reloadData();
                return Unit.INSTANCE;
            }
            baseCloudViewModel.setWebDavUser((WebDAVUser) obj);
            baseCloudViewModel2 = BaseCloudViewModel.this;
            this.L$0 = baseCloudViewModel2;
            this.label = 2;
            obj = baseCloudViewModel2.getRepository().getLocalPath(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseCloudViewModel2.setLocalPath((String) obj);
            baseCloudViewModel3 = BaseCloudViewModel.this;
            this.L$0 = baseCloudViewModel3;
            this.label = 3;
            objIsEmpty = baseCloudViewModel3.getCloudService().isEmpty(this);
            if (objIsEmpty == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseCloudViewModel4 = baseCloudViewModel3;
            obj = objIsEmpty;
            baseCloudViewModel4.setEmpty(((Boolean) obj).booleanValue());
            BaseCloudViewModel.this.reloadData();
            return Unit.INSTANCE;
        }
    }

    public void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$reloadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$reloadData$1", f = "BaseCloudViewModel.kt", i = {}, l = {79, 80, 84}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BaseCloudViewModel baseCloudViewModel;
            BaseCloudViewModel baseCloudViewModel2;
            Object objLoadWebDavCloudFiles;
            BaseCloudViewModel baseCloudViewModel3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(BaseCloudViewModel.this.getRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        baseCloudViewModel = (BaseCloudViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        baseCloudViewModel.setLocalDatalist((List) obj);
                        CommonToolKt.mlog("local files", BaseCloudViewModel.this.getLocalDatalist());
                        if (Intrinsics.areEqual(BaseCloudViewModel.this.getBackType(), "cloud")) {
                            baseCloudViewModel2 = BaseCloudViewModel.this;
                            this.L$0 = baseCloudViewModel2;
                            this.label = 3;
                            objLoadWebDavCloudFiles = baseCloudViewModel2.getCloudService().loadWebDavCloudFiles(BaseCloudViewModel.this.getWebDavUser(), this);
                            if (objLoadWebDavCloudFiles == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            baseCloudViewModel3 = baseCloudViewModel2;
                            obj = objLoadWebDavCloudFiles;
                        }
                        BaseCloudViewModel baseCloudViewModel4 = BaseCloudViewModel.this;
                        baseCloudViewModel4.changeBackType(baseCloudViewModel4.getBackType());
                        BaseCloudViewModel.this.getRepository().finish();
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    baseCloudViewModel3 = (BaseCloudViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                baseCloudViewModel3.setCloudDatalist((List) obj);
                BaseCloudViewModel baseCloudViewModel5 = BaseCloudViewModel.this;
                baseCloudViewModel5.changeBackType(baseCloudViewModel5.getBackType());
                BaseCloudViewModel.this.getRepository().finish();
                return Unit.INSTANCE;
            }
            baseCloudViewModel = BaseCloudViewModel.this;
            this.L$0 = baseCloudViewModel;
            this.label = 2;
            obj = baseCloudViewModel.getCloudService().loadLocalBackupData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseCloudViewModel.setLocalDatalist((List) obj);
            CommonToolKt.mlog("local files", BaseCloudViewModel.this.getLocalDatalist());
            if (Intrinsics.areEqual(BaseCloudViewModel.this.getBackType(), "cloud")) {
                baseCloudViewModel2 = BaseCloudViewModel.this;
                this.L$0 = baseCloudViewModel2;
                this.label = 3;
                objLoadWebDavCloudFiles = baseCloudViewModel2.getCloudService().loadWebDavCloudFiles(BaseCloudViewModel.this.getWebDavUser(), this);
                if (objLoadWebDavCloudFiles == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseCloudViewModel3 = baseCloudViewModel2;
                obj = objLoadWebDavCloudFiles;
                baseCloudViewModel3.setCloudDatalist((List) obj);
            }
            BaseCloudViewModel baseCloudViewModel6 = BaseCloudViewModel.this;
            baseCloudViewModel6.changeBackType(baseCloudViewModel6.getBackType());
            BaseCloudViewModel.this.getRepository().finish();
            return Unit.INSTANCE;
        }
    }

    public void reloadData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public void doBackup() {
        if (!isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        } else {
            getRepository().toast("当前没有数据可以备份");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$doBackup$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$doBackup$1", f = "BaseCloudViewModel.kt", i = {}, l = {97, 99, 102}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(continuation);
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
                if (BaseRepository.loading$default(BaseCloudViewModel.this.getRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BaseCloudViewModel.this.reloadData();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(BaseCloudViewModel.this.getBackType(), "local")) {
                this.label = 2;
                if (BaseCloudViewModel.this.getCloudService().makeLocalBackup(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 3;
                if (BaseCloudViewModel.this.getCloudService().makeWebDavCloudBackup(BaseCloudViewModel.this.getWebDavUser(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseCloudViewModel.this.reloadData();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$cleanBackup$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$cleanBackup$1", f = "BaseCloudViewModel.kt", i = {}, l = {110, 112, 115}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(continuation);
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
                if (BaseRepository.loading$default(BaseCloudViewModel.this.getRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BaseCloudViewModel.this.reloadData();
                BaseCloudViewModel.this.resetForm();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(BaseCloudViewModel.this.getBackType(), "local")) {
                this.label = 2;
                if (BaseCloudViewModel.this.getCloudService().cleanLocalData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 3;
                if (BaseCloudViewModel.this.getCloudService().cleanWebdavCloud(BaseCloudViewModel.this.getWebDavUser(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseCloudViewModel.this.reloadData();
            BaseCloudViewModel.this.resetForm();
            return Unit.INSTANCE;
        }
    }

    public final void cleanBackup() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$loadBackData$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcn/jianyun/workplan/api/ApiResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$loadBackData$2", f = "BaseCloudViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<Object>>, Object> {
        final /* synthetic */ BasicCloudData $cloudData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BasicCloudData basicCloudData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$cloudData = basicCloudData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass2(this.$cloudData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<Object>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BaseCloudViewModel.this.getCloudService().loadLocalData(this.$cloudData, this);
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

    public final Object loadBackData(BasicCloudData basicCloudData, Continuation<? super ApiResult<Object>> continuation) {
        if (Intrinsics.areEqual(getBackType(), "local")) {
            return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(basicCloudData, null), continuation);
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(basicCloudData, null), continuation);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$loadBackData$3, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcn/jianyun/workplan/api/ApiResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$loadBackData$3", f = "BaseCloudViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<Object>>, Object> {
        final /* synthetic */ BasicCloudData $cloudData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(BasicCloudData basicCloudData, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$cloudData = basicCloudData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass3(this.$cloudData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<Object>> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BaseCloudViewModel.this.getCloudService().loadCloudData(BaseCloudViewModel.this.getWebDavUser(), this.$cloudData, this);
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

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        getRepository().toast(msg);
    }

    public final void resetForm() {
        setFormType(new FormType(null, null, null, 7, null));
    }

    public final void justShowBackupDialog(BasicCloudData model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setCurrentCloudData(model);
        setFormType(new FormType("showBackupData", model, null, 4, null));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1", f = "BaseCloudViewModel.kt", i = {}, l = {150, 152, 157}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(continuation);
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
                if (BaseRepository.loading$default(BaseCloudViewModel.this.getRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BaseCloudViewModel.this.resetForm();
                BaseCloudViewModel.this.getRepository().reload();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(BaseCloudViewModel.this.getBackType(), "local")) {
                this.label = 2;
                if (BuildersKt.withContext(Dispatchers.getIO(), new C02121(BaseCloudViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 3;
                if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(BaseCloudViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseCloudViewModel.this.resetForm();
            BaseCloudViewModel.this.getRepository().reload();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: BaseCloudViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1$1", f = "BaseCloudViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
        static final class C02121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BaseCloudViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02121(BaseCloudViewModel baseCloudViewModel, Continuation<? super C02121> continuation) {
                super(2, continuation);
                this.this$0 = baseCloudViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02121(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.getCloudService().deleteLocalFile(this.this$0.getCurrentCloudData().getFileName(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: BaseCloudViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$deleteBackup$1$2", f = "BaseCloudViewModel.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BaseCloudViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BaseCloudViewModel baseCloudViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = baseCloudViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.getCloudService().deleteWebdavFile(this.this$0.getWebDavUser(), this.this$0.getCurrentCloudData().getFileName(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void deleteBackup() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$saveLocalData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseCloudViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.vm.BaseCloudViewModel$saveLocalData$1", f = "BaseCloudViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseCloudViewModel.this.new AnonymousClass1(this.$path, continuation);
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
                if (BaseCloudViewModel.this.getRepository().setLocalBackupConfig(new LocalBackupConfig(this.$path, false, null, 6, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void saveLocalData(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(path, null), 3, null);
    }
}