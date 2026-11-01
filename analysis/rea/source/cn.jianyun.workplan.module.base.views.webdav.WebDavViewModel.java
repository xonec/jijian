package cn.jianyun.workplan.module.base.views.webdav;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.MyWebdavTool;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.wangmai.permission.androidsupport.FileProvider;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

/* JADX INFO: compiled from: WebDavDataView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020#J\u0006\u00105\u001a\u00020\u001cJ\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\bJ\u0006\u00108\u001a\u000203R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR+\u0010.\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\r¨\u00069"}, d2 = {"Lcn/jianyun/workplan/module/base/views/webdav/WebDavViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "", "currentPath", "getCurrentPath", "()Ljava/lang/String;", "setCurrentPath", "(Ljava/lang/String;)V", "currentPath$delegate", "Landroidx/compose/runtime/MutableState;", "defaultPath", "getDefaultPath", "setDefaultPath", "defaultPath$delegate", "", "Lcom/thegrizzlylabs/sardineandroid/DavResource;", "files", "getFiles", "()Ljava/util/List;", "setFiles", "(Ljava/util/List;)V", "files$delegate", "", "inited", "getInited", "()Z", "setInited", "(Z)V", "inited$delegate", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "loginUser", "getLoginUser", "()Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "setLoginUser", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;)V", "loginUser$delegate", "msg", "getMsg", "setMsg", "msg$delegate", "parentPath", "getParentPath", "setParentPath", "parentPath$delegate", "initModel", "", "user", "isRootPath", "loadData", FileProvider.ATTR_PATH, "reload", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebDavViewModel extends ViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: currentPath$delegate, reason: from kotlin metadata */
    private final MutableState currentPath;

    /* JADX INFO: renamed from: defaultPath$delegate, reason: from kotlin metadata */
    private final MutableState defaultPath;

    /* JADX INFO: renamed from: files$delegate, reason: from kotlin metadata */
    private final MutableState files;

    /* JADX INFO: renamed from: inited$delegate, reason: from kotlin metadata */
    private final MutableState inited;

    /* JADX INFO: renamed from: loginUser$delegate, reason: from kotlin metadata */
    private final MutableState loginUser;

    /* JADX INFO: renamed from: msg$delegate, reason: from kotlin metadata */
    private final MutableState msg;

    /* JADX INFO: renamed from: parentPath$delegate, reason: from kotlin metadata */
    private final MutableState parentPath;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public WebDavViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.loginUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WebDAVUser(null, null, null, null, null, null, null, false, false, 0, false, null, false, 8191, null), null, 2, null);
        this.currentPath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PackagingURIHelper.FORWARD_SLASH_STRING, null, 2, null);
        this.parentPath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PackagingURIHelper.FORWARD_SLASH_STRING, null, 2, null);
        this.files = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.msg = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.inited = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.defaultPath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebDAVUser getLoginUser() {
        return (WebDAVUser) this.loginUser.getValue();
    }

    public final void setLoginUser(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "<set-?>");
        this.loginUser.setValue(webDAVUser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentPath() {
        return (String) this.currentPath.getValue();
    }

    public final void setCurrentPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentPath.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getParentPath() {
        return (String) this.parentPath.getValue();
    }

    public final void setParentPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.parentPath.setValue(str);
    }

    public final List<DavResource> getFiles() {
        return (List) this.files.getValue();
    }

    public final void setFiles(List<? extends DavResource> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.files.setValue(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getMsg() {
        return (String) this.msg.getValue();
    }

    public final void setMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInited() {
        return ((Boolean) this.inited.getValue()).booleanValue();
    }

    public final void setInited(boolean z) {
        this.inited.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getDefaultPath() {
        return (String) this.defaultPath.getValue();
    }

    public final void setDefaultPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultPath.setValue(str);
    }

    public final void initModel(WebDAVUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (getInited()) {
            return;
        }
        setInited(true);
        setLoginUser(user);
        setDefaultPath(MyWebdavTool.INSTANCE.getDefaultPath(user));
        reload();
    }

    public final void reload() {
        loadData(getDefaultPath());
    }

    public final boolean isRootPath() {
        return Intrinsics.areEqual(getCurrentPath(), getDefaultPath());
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel$loadData$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebDavDataView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel$loadData$1", f = "WebDavDataView.kt", i = {}, l = {151, 152, 154}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $newPath;
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<String> objectRef, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newPath = objectRef;
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebDavViewModel.this.new AnonymousClass1(this.$newPath, this.$path, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    WebDAVUser loginUser = WebDavViewModel.this.getLoginUser();
                    this.label = 3;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new WebDavViewModel$loadData$1$rst$1(this.$newPath, WebDavViewModel.this, loginUser, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult.getSuccess()) {
                    WebDavViewModel webDavViewModel = WebDavViewModel.this;
                    Object objFetchResult = apiResult.fetchResult();
                    Intrinsics.checkNotNull(objFetchResult, "null cannot be cast to non-null type kotlin.collections.List<com.thegrizzlylabs.sardineandroid.DavResource>");
                    webDavViewModel.setFiles((List) objFetchResult);
                    WebDavViewModel.this.setMsg("");
                } else {
                    WebDavViewModel.this.setMsg(apiResult.getMessage());
                    WebDavViewModel.this.setFiles(CollectionsKt.emptyList());
                }
                WebDavViewModel.this.setCurrentPath(this.$newPath.element);
                WebDavViewModel.this.setParentPath(this.$path);
                WebDavViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (WebDavViewModel.this.getBaseRepository().loading(false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.label = 2;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WebDAVUser loginUser2 = WebDavViewModel.this.getLoginUser();
            this.label = 3;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new WebDavViewModel$loadData$1$rst$1(this.$newPath, WebDavViewModel.this, loginUser2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.getSuccess()) {
                WebDavViewModel webDavViewModel2 = WebDavViewModel.this;
                Object objFetchResult2 = apiResult.fetchResult();
                Intrinsics.checkNotNull(objFetchResult2, "null cannot be cast to non-null type kotlin.collections.List<com.thegrizzlylabs.sardineandroid.DavResource>");
                webDavViewModel2.setFiles((List) objFetchResult2);
                WebDavViewModel.this.setMsg("");
            } else {
                WebDavViewModel.this.setMsg(apiResult.getMessage());
                WebDavViewModel.this.setFiles(CollectionsKt.emptyList());
            }
            WebDavViewModel.this.setCurrentPath(this.$newPath.element);
            WebDavViewModel.this.setParentPath(this.$path);
            WebDavViewModel.this.getBaseRepository().finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadData(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = path;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(objectRef, path, null), 3, null);
    }
}