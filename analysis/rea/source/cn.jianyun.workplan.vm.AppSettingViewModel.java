package cn.jianyun.workplan.vm;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.setting.user.User;
import cn.jianyun.workplan.model.AppConfigModel;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt;
import cn.jianyun.workplan.util.CacheUtil;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.o;
import com.byazt.bry.TTDownloadField;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import java.util.Date;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: AppViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0014J\u0016\u0010T\u001a\u00020R2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010V\u001a\u00020\u001fJ\u0006\u0010W\u001a\u00020RJ\u000e\u0010X\u001a\u00020R2\u0006\u0010Y\u001a\u00020ZJ\u0016\u0010[\u001a\u00020R2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0014J\u0006\u0010]\u001a\u00020RJ\u001c\u0010^\u001a\u00020R2\u0006\u0010_\u001a\u00020`2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020R0bJ\u0006\u0010c\u001a\u00020RJ\u0006\u0010d\u001a\u00020RJ\u000e\u0010e\u001a\u00020\u001f2\u0006\u0010f\u001a\u00020\u0014J\u0006\u0010g\u001a\u00020\u001fJ\u000e\u0010h\u001a\u00020\u001f2\u0006\u0010i\u001a\u00020\u0014J\u0006\u0010j\u001a\u00020\u001fJ\u0006\u0010k\u001a\u00020\u001fJ\u0006\u0010l\u001a\u00020RJ\u0006\u0010m\u001a\u00020RJ\u0006\u0010n\u001a\u00020RJ\u0006\u0010o\u001a\u00020RJ\u001e\u0010p\u001a\u00020R2\b\b\u0002\u0010q\u001a\u00020r2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020R0bJ\u000e\u0010s\u001a\u00020R2\u0006\u0010t\u001a\u00020\u0014J\u0006\u0010u\u001a\u00020RR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u000f\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R+\u00101\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R+\u00106\u001a\u0002052\u0006\u0010\u0007\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u000f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001f0=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010B\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u000f\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R+\u0010G\u001a\u00020F2\u0006\u0010\u0007\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010M\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\u000f\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$¨\u0006v"}, d2 = {"Lcn/jianyun/workplan/vm/AppSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "baseApi", "Lcn/jianyun/workplan/api/BaseApi;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lcn/jianyun/workplan/api/BaseApi;)V", "<set-?>", "Lcn/jianyun/workplan/model/AppConfigModel;", "appConfig", "getAppConfig", "()Lcn/jianyun/workplan/model/AppConfigModel;", "setAppConfig", "(Lcn/jianyun/workplan/model/AppConfigModel;)V", "appConfig$delegate", "Landroidx/compose/runtime/MutableState;", "getBaseApi", "()Lcn/jianyun/workplan/api/BaseApi;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "", "brand", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "brand$delegate", "currentMode", "getCurrentMode", "setCurrentMode", "currentMode$delegate", "", "darkTheme", "getDarkTheme", "()Z", "setDarkTheme", "(Z)V", "darkTheme$delegate", "Lcn/jianyun/workplan/model/FormType;", "formType", "getFormType", "()Lcn/jianyun/workplan/model/FormType;", "setFormType", "(Lcn/jianyun/workplan/model/FormType;)V", "formType$delegate", "inited", "getInited", "setInited", "inited$delegate", "loginType", "getLoginType", "setLoginType", "loginType$delegate", "Lcn/jianyun/workplan/main/setting/user/User;", "loginUser", "getLoginUser", "()Lcn/jianyun/workplan/main/setting/user/User;", "setLoginUser", "(Lcn/jianyun/workplan/main/setting/user/User;)V", "loginUser$delegate", "notifyStatus2", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getNotifyStatus2", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "setNotifyStatus2", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "purchaseFlag", "getPurchaseFlag", "setPurchaseFlag", "purchaseFlag$delegate", "", "sid", "getSid", "()I", "setSid", "(I)V", "sid$delegate", "startApp", "getStartApp", "setStartApp", "startApp$delegate", "changeBrand", "", "it", "changeNotifyStatus", b.f2259d, "open", "checkLogin", "doExit", "navHostController", "Landroidx/navigation/NavHostController;", "doLogOut", "pwd", "doLogin", "doPurchase", TTDownloadField.TT_ACTIVITY, "Landroid/app/Activity;", "cb", "Lkotlin/Function0;", "doRegist", "doUpdateInfo", "isForm", "type", "isLogin", "isNeedSecret", "destination", "isOpenNotify", "isVip", "makeChanged", d.x, "reload", "reset", "sleep", "n", "", "toast", "msg", "tryReload", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppSettingViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: appConfig$delegate, reason: from kotlin metadata */
    private final MutableState appConfig;
    private final BaseApi baseApi;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: brand$delegate, reason: from kotlin metadata */
    private final MutableState brand;

    /* JADX INFO: renamed from: currentMode$delegate, reason: from kotlin metadata */
    private final MutableState currentMode;

    /* JADX INFO: renamed from: darkTheme$delegate, reason: from kotlin metadata */
    private final MutableState darkTheme;

    /* JADX INFO: renamed from: formType$delegate, reason: from kotlin metadata */
    private final MutableState formType;

    /* JADX INFO: renamed from: inited$delegate, reason: from kotlin metadata */
    private final MutableState inited;

    /* JADX INFO: renamed from: loginType$delegate, reason: from kotlin metadata */
    private final MutableState loginType;

    /* JADX INFO: renamed from: loginUser$delegate, reason: from kotlin metadata */
    private final MutableState loginUser;
    private SnapshotStateMap<String, Boolean> notifyStatus2;

    /* JADX INFO: renamed from: purchaseFlag$delegate, reason: from kotlin metadata */
    private final MutableState purchaseFlag;

    /* JADX INFO: renamed from: sid$delegate, reason: from kotlin metadata */
    private final MutableState sid;

    /* JADX INFO: renamed from: startApp$delegate, reason: from kotlin metadata */
    private final MutableState startApp;

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    public final BaseApi getBaseApi() {
        return this.baseApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public AppSettingViewModel(BaseRepository baseRepository, BaseApi baseApi) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        Intrinsics.checkNotNullParameter(baseApi, "baseApi");
        this.baseRepository = baseRepository;
        this.baseApi = baseApi;
        String str = null;
        String str2 = null;
        this.appConfig = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AppConfigModel(false, str, str2, null, null, 31, null), null, 2, null);
        this.formType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType(null, str, str2, 7, null == true ? 1 : 0), null, 2, null);
        this.loginType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FormType("login", str, str2, 6, null == true ? 1 : 0), null, 2, null);
        this.loginUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new User(null, str, str2, null, null == true ? 1 : 0, null, null == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, 0L, 524287, null), null, 2, null);
        this.startApp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.sid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.darkTheme = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.purchaseFlag = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.brand = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.notifyStatus2 = SnapshotStateKt.mutableStateMapOf();
        this.currentMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("year", null, 2, null);
        this.inited = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        reload();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AppConfigModel getAppConfig() {
        return (AppConfigModel) this.appConfig.getValue();
    }

    public final void setAppConfig(AppConfigModel appConfigModel) {
        Intrinsics.checkNotNullParameter(appConfigModel, "<set-?>");
        this.appConfig.setValue(appConfigModel);
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
    public final FormType getLoginType() {
        return (FormType) this.loginType.getValue();
    }

    public final void setLoginType(FormType formType) {
        Intrinsics.checkNotNullParameter(formType, "<set-?>");
        this.loginType.setValue(formType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final User getLoginUser() {
        return (User) this.loginUser.getValue();
    }

    public final void setLoginUser(User user) {
        Intrinsics.checkNotNullParameter(user, "<set-?>");
        this.loginUser.setValue(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getStartApp() {
        return ((Boolean) this.startApp.getValue()).booleanValue();
    }

    public final void setStartApp(boolean z) {
        this.startApp.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSid() {
        return ((Number) this.sid.getValue()).intValue();
    }

    public final void setSid(int i) {
        this.sid.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDarkTheme() {
        return ((Boolean) this.darkTheme.getValue()).booleanValue();
    }

    public final void setDarkTheme(boolean z) {
        this.darkTheme.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getPurchaseFlag() {
        return ((Boolean) this.purchaseFlag.getValue()).booleanValue();
    }

    public final void setPurchaseFlag(boolean z) {
        this.purchaseFlag.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getBrand() {
        return (String) this.brand.getValue();
    }

    public final void setBrand(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brand.setValue(str);
    }

    public final SnapshotStateMap<String, Boolean> getNotifyStatus2() {
        return this.notifyStatus2;
    }

    public final void setNotifyStatus2(SnapshotStateMap<String, Boolean> snapshotStateMap) {
        Intrinsics.checkNotNullParameter(snapshotStateMap, "<set-?>");
        this.notifyStatus2 = snapshotStateMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentMode() {
        return (String) this.currentMode.getValue();
    }

    public final void setCurrentMode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentMode.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInited() {
        return ((Boolean) this.inited.getValue()).booleanValue();
    }

    public final void setInited(boolean z) {
        this.inited.setValue(Boolean.valueOf(z));
    }

    public final void reset() {
        setFormType(new FormType(null, null, null, 7, null));
    }

    public final boolean isVip() {
        return getLoginUser().isVip();
    }

    public final boolean isLogin() {
        return getLoginUser().isLogin();
    }

    public final boolean isOpenNotify() {
        Boolean bool = this.notifyStatus2.get(DavPrincipal.KEY_ALL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void checkLogin() {
        if (!getLoginUser().isLogin()) {
            setFormType(new FormType("login", null, null, 6, null));
        } else {
            setFormType(new FormType("", null, null, 6, null));
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$reload$1", f = "AppViewModel.kt", i = {}, l = {110, 111, 122}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0068  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:32:0x011d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppSettingViewModel appSettingViewModel;
            AppConfigModel appConfigModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppSettingViewModel appSettingViewModel2 = AppSettingViewModel.this;
                appSettingViewModel2.setSid(appSettingViewModel2.getBaseRepository().getSid());
                this.label = 1;
                if (AppSettingViewModel.this.getBaseRepository().initApp(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        appSettingViewModel = (AppSettingViewModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        appConfigModel = (AppConfigModel) obj;
                        if (appConfigModel == null) {
                            appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
                        }
                        appSettingViewModel.setAppConfig(appConfigModel);
                        if (AppSettingViewModel.this.getAppConfig().getNeedSecret() && !Intrinsics.areEqual(AppSettingViewModel.this.getAppConfig().getSecret(), "") && !AppSettingViewModel.this.getInited()) {
                            AppSettingViewModel.this.setFormType(new FormType("check", null, null, 6, null));
                            AppSettingViewModel.this.setInited(true);
                        }
                        CommonToolKt.mlog("app config", AppSettingViewModel.this.getAppConfig());
                        AppSettingViewModel appSettingViewModel3 = AppSettingViewModel.this;
                        appSettingViewModel3.setLoginUser(appSettingViewModel3.getBaseRepository().getLoginUser());
                        AppSettingViewModel appSettingViewModel4 = AppSettingViewModel.this;
                        appSettingViewModel4.setBrand(appSettingViewModel4.getBaseRepository().getBrand());
                        AppSettingViewModel.this.getNotifyStatus2().putAll(AppSettingViewModel.this.getBaseRepository().getNotifyStatus());
                        if (!AppSettingViewModel.this.getStartApp()) {
                            CommonToolKt.mlog("ssss0");
                            this.L$0 = null;
                            this.label = 3;
                            if (DelayKt.delay(((long) 200) + ((long) (Math.random() * ((double) 100))), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CommonToolKt.mlog("ssss1");
                AppSettingViewModel.this.setStartApp(true);
                return Unit.INSTANCE;
            }
            appSettingViewModel = AppSettingViewModel.this;
            this.L$0 = appSettingViewModel;
            this.label = 2;
            obj = appSettingViewModel.getBaseRepository().getObjectCache("appConfig", AppConfigModel.class, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            appConfigModel = (AppConfigModel) obj;
            if (appConfigModel == null) {
                appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
            }
            appSettingViewModel.setAppConfig(appConfigModel);
            if (AppSettingViewModel.this.getAppConfig().getNeedSecret()) {
                AppSettingViewModel.this.setFormType(new FormType("check", null, null, 6, null));
                AppSettingViewModel.this.setInited(true);
            }
            CommonToolKt.mlog("app config", AppSettingViewModel.this.getAppConfig());
            AppSettingViewModel appSettingViewModel5 = AppSettingViewModel.this;
            appSettingViewModel5.setLoginUser(appSettingViewModel5.getBaseRepository().getLoginUser());
            AppSettingViewModel appSettingViewModel6 = AppSettingViewModel.this;
            appSettingViewModel6.setBrand(appSettingViewModel6.getBaseRepository().getBrand());
            AppSettingViewModel.this.getNotifyStatus2().putAll(AppSettingViewModel.this.getBaseRepository().getNotifyStatus());
            if (!AppSettingViewModel.this.getStartApp()) {
                CommonToolKt.mlog("ssss0");
                this.L$0 = null;
                this.label = 3;
                if (DelayKt.delay(((long) 200) + ((long) (Math.random() * ((double) 100))), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CommonToolKt.mlog("ssss1");
                AppSettingViewModel.this.setStartApp(true);
            }
            return Unit.INSTANCE;
        }
    }

    public final void reload() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$sleep$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$sleep$1", f = "AppViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $cb;
        final /* synthetic */ long $n;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$n = j;
            this.$cb = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$n, this.$cb, continuation);
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
                if (DelayKt.delay(this.$n * ((long) 100), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$cb.invoke();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void sleep$default(AppSettingViewModel appSettingViewModel, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5;
        }
        appSettingViewModel.sleep(j, function0);
    }

    public final void sleep(long n, Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(n, cb, null), 3, null);
    }

    public final void tryReload() {
        if (getSid() != this.baseRepository.getSid()) {
            reload();
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$refresh$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$refresh$1", f = "AppViewModel.kt", i = {}, l = {144, 145, 153}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ApiResult apiResult;
            User user;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (apiResult.getSuccess()) {
                            user = (User) apiResult.fetchResult();
                            if (user.getVipName() == null && !Intrinsics.areEqual(user.getVipName(), "")) {
                                AppSettingViewModel.this.getLoginUser().setVipName(user.getVipName());
                                AppSettingViewModel.this.getLoginUser().setVipDate(user.getVipDate());
                                this.label = 3;
                                if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                AppSettingViewModel.this.getBaseRepository().finish();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AppSettingViewModel.this.getBaseRepository().reload();
                AppSettingViewModel.this.reload();
                return Unit.INSTANCE;
            }
            this.label = 2;
            obj = CommonToolKt.withApi(new AppSettingViewModel$refresh$1$dd$1(AppSettingViewModel.this, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.getSuccess()) {
                user = (User) apiResult.fetchResult();
                if (user.getVipName() == null) {
                }
                AppSettingViewModel.this.getBaseRepository().finish();
            }
            return Unit.INSTANCE;
        }
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final boolean isForm(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual(getFormType().getType(), type);
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.baseRepository.toast(msg);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$makeChanged$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$makeChanged$1", f = "AppViewModel.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppSettingViewModel appSettingViewModel;
            AppConfigModel appConfigModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AppSettingViewModel.this.getBaseRepository().cacheJsonValue("appConfig", AppSettingViewModel.this.getAppConfig(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appSettingViewModel = (AppSettingViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                appConfigModel = (AppConfigModel) obj;
                if (appConfigModel == null) {
                    appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
                }
                appSettingViewModel.setAppConfig(appConfigModel);
                CommonToolKt.mlog("app config2", AppSettingViewModel.this.getAppConfig());
                AppSettingViewModel.this.getBaseRepository().reload();
                return Unit.INSTANCE;
            }
            AppSettingViewModel appSettingViewModel2 = AppSettingViewModel.this;
            this.L$0 = appSettingViewModel2;
            this.label = 2;
            Object objectCache = appSettingViewModel2.getBaseRepository().getObjectCache("appConfig", AppConfigModel.class, this);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            appSettingViewModel = appSettingViewModel2;
            obj = objectCache;
            appConfigModel = (AppConfigModel) obj;
            if (appConfigModel == null) {
                appConfigModel = new AppConfigModel(false, null, null, null, null, 31, null);
            }
            appSettingViewModel.setAppConfig(appConfigModel);
            CommonToolKt.mlog("app config2", AppSettingViewModel.this.getAppConfig());
            AppSettingViewModel.this.getBaseRepository().reload();
            return Unit.INSTANCE;
        }
    }

    public final void makeChanged() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final boolean isNeedSecret(String destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return getAppConfig().getNeedSecret() && CollectionsKt.toSet(StringsKt.split$default((CharSequence) getAppConfig().getNeedSecretApps(), new String[]{"^"}, false, 0, 6, (Object) null)).contains(destination);
    }

    public final void doLogin() {
        String strIsLoginValid = getLoginUser().isLoginValid();
        if (CommonToolKt.isOk(strIsLoginValid)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        } else {
            this.baseRepository.toast(strIsLoginValid);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doLogin$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doLogin$1", f = "AppViewModel.kt", i = {3, 4, 5}, l = {192, 193, 196, 206, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_DECODER_ERROR, 224}, m = "invokeSuspend", n = {"userInfo", "userInfo", "userInfo"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x00b6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:32:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0137  */
        /* JADX WARN: Code duplicated, block: B:36:0x013c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0146  */
        /* JADX WARN: Code duplicated, block: B:41:0x0155  */
        /* JADX WARN: Code duplicated, block: B:44:0x015a  */
        /* JADX WARN: Code duplicated, block: B:47:0x0163 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x0166  */
        /* JADX WARN: Code duplicated, block: B:52:0x016b  */
        /* JADX WARN: Code duplicated, block: B:54:0x017f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x0195 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0196  */
        /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            User loginUser;
            Object did;
            Object objLogin;
            ApiResult apiResult;
            User userCopy;
            Object localRegistTime;
            Date dateTimeString;
            long jLongValue;
            long time;
            Date dateTimeString2;
            User user;
            User user2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loginUser = AppSettingViewModel.this.getLoginUser();
                    this.L$0 = loginUser;
                    this.label = 2;
                    did = AppSettingViewModel.this.getBaseRepository().getDid(this);
                    if (did == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loginUser.setDeviceId((String) did);
                    AppSettingViewModel.this.getLoginUser().setApplication("plan");
                    AppSettingViewModel.this.getLoginUser().setPlatform(ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE);
                    this.L$0 = null;
                    this.label = 3;
                    objLogin = AppSettingViewModel.this.getBaseRepository().getApi().login(AppSettingViewModel.this.getLoginUser(), this);
                    if (objLogin == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) objLogin;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        userCopy = (User) apiResult.fetchResult();
                        if (userCopy.getRegistTime() == 0 && !Intrinsics.areEqual(userCopy.getGmtCreate(), "") && (dateTimeString = MyDateTool.parseDateTimeString(userCopy.getGmtCreate())) != null) {
                            userCopy = userCopy.copy((262143 & 1) != 0 ? userCopy.uuid : null, (262143 & 2) != 0 ? userCopy.username : null, (262143 & 4) != 0 ? userCopy.nickname : null, (262143 & 8) != 0 ? userCopy.email : null, (262143 & 16) != 0 ? userCopy.avatar : null, (262143 & 32) != 0 ? userCopy.gmtCreate : null, (262143 & 64) != 0 ? userCopy.vipName : null, (262143 & 128) != 0 ? userCopy.vipDate : null, (262143 & 256) != 0 ? userCopy.password : null, (262143 & 512) != 0 ? userCopy.confirmPassword : null, (262143 & 1024) != 0 ? userCopy.wechat : null, (262143 & 2048) != 0 ? userCopy.qq : null, (262143 & 4096) != 0 ? userCopy.city : null, (262143 & 8192) != 0 ? userCopy.mobile : null, (262143 & 16384) != 0 ? userCopy.cloudConfig : null, (262143 & 32768) != 0 ? userCopy.application : null, (262143 & 65536) != 0 ? userCopy.platform : null, (262143 & 131072) != 0 ? userCopy.deviceId : null, (262143 & 262144) != 0 ? userCopy.registTime : dateTimeString.getTime());
                        }
                        this.L$0 = userCopy;
                        this.label = 4;
                        localRegistTime = AppSettingViewModel.this.getBaseRepository().getLocalRegistTime(this);
                        if (localRegistTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue = ((Number) localRegistTime).longValue();
                        if (userCopy.getRegistTime() > 0) {
                            time = userCopy.getRegistTime();
                        } else if (!Intrinsics.areEqual(userCopy.getGmtCreate(), "") || (dateTimeString2 = MyDateTool.parseDateTimeString(userCopy.getGmtCreate())) == null) {
                            time = 0;
                        } else {
                            time = dateTimeString2.getTime();
                        }
                        if (jLongValue <= 0 && time > 0) {
                            jLongValue = Math.min(jLongValue, time);
                        } else if (jLongValue <= 0) {
                            jLongValue = time;
                        }
                        if (jLongValue > 0) {
                            this.L$0 = userCopy;
                            this.label = 5;
                            if (AppSettingViewModel.this.getBaseRepository().cacheLocalRegistTime(jLongValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        user = userCopy;
                        this.L$0 = user;
                        this.label = 6;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        user2 = user;
                        AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                        AppSettingViewModel.this.setLoginUser(user2);
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast("账号或密码错误");
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    loginUser = AppSettingViewModel.this.getLoginUser();
                    this.L$0 = loginUser;
                    this.label = 2;
                    did = AppSettingViewModel.this.getBaseRepository().getDid(this);
                    if (did == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loginUser.setDeviceId((String) did);
                    AppSettingViewModel.this.getLoginUser().setApplication("plan");
                    AppSettingViewModel.this.getLoginUser().setPlatform(ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE);
                    this.L$0 = null;
                    this.label = 3;
                    objLogin = AppSettingViewModel.this.getBaseRepository().getApi().login(AppSettingViewModel.this.getLoginUser(), this);
                    if (objLogin == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) objLogin;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        userCopy = (User) apiResult.fetchResult();
                        if (userCopy.getRegistTime() == 0) {
                            userCopy = userCopy.copy((262143 & 1) != 0 ? userCopy.uuid : null, (262143 & 2) != 0 ? userCopy.username : null, (262143 & 4) != 0 ? userCopy.nickname : null, (262143 & 8) != 0 ? userCopy.email : null, (262143 & 16) != 0 ? userCopy.avatar : null, (262143 & 32) != 0 ? userCopy.gmtCreate : null, (262143 & 64) != 0 ? userCopy.vipName : null, (262143 & 128) != 0 ? userCopy.vipDate : null, (262143 & 256) != 0 ? userCopy.password : null, (262143 & 512) != 0 ? userCopy.confirmPassword : null, (262143 & 1024) != 0 ? userCopy.wechat : null, (262143 & 2048) != 0 ? userCopy.qq : null, (262143 & 4096) != 0 ? userCopy.city : null, (262143 & 8192) != 0 ? userCopy.mobile : null, (262143 & 16384) != 0 ? userCopy.cloudConfig : null, (262143 & 32768) != 0 ? userCopy.application : null, (262143 & 65536) != 0 ? userCopy.platform : null, (262143 & 131072) != 0 ? userCopy.deviceId : null, (262143 & 262144) != 0 ? userCopy.registTime : dateTimeString.getTime());
                        }
                        this.L$0 = userCopy;
                        this.label = 4;
                        localRegistTime = AppSettingViewModel.this.getBaseRepository().getLocalRegistTime(this);
                        if (localRegistTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue = ((Number) localRegistTime).longValue();
                        if (userCopy.getRegistTime() > 0) {
                            time = userCopy.getRegistTime();
                        } else if (Intrinsics.areEqual(userCopy.getGmtCreate(), "")) {
                            time = 0;
                        } else {
                            time = 0;
                        }
                        if (jLongValue <= 0) {
                            if (jLongValue <= 0) {
                                jLongValue = time;
                            }
                        } else if (jLongValue <= 0) {
                            jLongValue = time;
                        }
                        if (jLongValue > 0) {
                            this.L$0 = userCopy;
                            this.label = 5;
                            if (AppSettingViewModel.this.getBaseRepository().cacheLocalRegistTime(jLongValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        user = userCopy;
                        this.L$0 = user;
                        this.label = 6;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        user2 = user;
                        AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                        AppSettingViewModel.this.setLoginUser(user2);
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast("账号或密码错误");
                    }
                    return Unit.INSTANCE;
                case 2:
                    loginUser = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    did = obj;
                    loginUser.setDeviceId((String) did);
                    AppSettingViewModel.this.getLoginUser().setApplication("plan");
                    AppSettingViewModel.this.getLoginUser().setPlatform(ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE);
                    this.L$0 = null;
                    this.label = 3;
                    objLogin = AppSettingViewModel.this.getBaseRepository().getApi().login(AppSettingViewModel.this.getLoginUser(), this);
                    if (objLogin == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) objLogin;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        userCopy = (User) apiResult.fetchResult();
                        if (userCopy.getRegistTime() == 0) {
                            userCopy = userCopy.copy((262143 & 1) != 0 ? userCopy.uuid : null, (262143 & 2) != 0 ? userCopy.username : null, (262143 & 4) != 0 ? userCopy.nickname : null, (262143 & 8) != 0 ? userCopy.email : null, (262143 & 16) != 0 ? userCopy.avatar : null, (262143 & 32) != 0 ? userCopy.gmtCreate : null, (262143 & 64) != 0 ? userCopy.vipName : null, (262143 & 128) != 0 ? userCopy.vipDate : null, (262143 & 256) != 0 ? userCopy.password : null, (262143 & 512) != 0 ? userCopy.confirmPassword : null, (262143 & 1024) != 0 ? userCopy.wechat : null, (262143 & 2048) != 0 ? userCopy.qq : null, (262143 & 4096) != 0 ? userCopy.city : null, (262143 & 8192) != 0 ? userCopy.mobile : null, (262143 & 16384) != 0 ? userCopy.cloudConfig : null, (262143 & 32768) != 0 ? userCopy.application : null, (262143 & 65536) != 0 ? userCopy.platform : null, (262143 & 131072) != 0 ? userCopy.deviceId : null, (262143 & 262144) != 0 ? userCopy.registTime : dateTimeString.getTime());
                        }
                        this.L$0 = userCopy;
                        this.label = 4;
                        localRegistTime = AppSettingViewModel.this.getBaseRepository().getLocalRegistTime(this);
                        if (localRegistTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue = ((Number) localRegistTime).longValue();
                        if (userCopy.getRegistTime() > 0) {
                            time = userCopy.getRegistTime();
                        } else if (Intrinsics.areEqual(userCopy.getGmtCreate(), "")) {
                            time = 0;
                        } else {
                            time = 0;
                        }
                        if (jLongValue <= 0) {
                            if (jLongValue <= 0) {
                                jLongValue = time;
                            }
                        } else if (jLongValue <= 0) {
                            jLongValue = time;
                        }
                        if (jLongValue > 0) {
                            this.L$0 = userCopy;
                            this.label = 5;
                            if (AppSettingViewModel.this.getBaseRepository().cacheLocalRegistTime(jLongValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        user = userCopy;
                        this.L$0 = user;
                        this.label = 6;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        user2 = user;
                        AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                        AppSettingViewModel.this.setLoginUser(user2);
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast("账号或密码错误");
                    }
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    objLogin = obj;
                    apiResult = (ApiResult) objLogin;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        userCopy = (User) apiResult.fetchResult();
                        if (userCopy.getRegistTime() == 0) {
                            userCopy = userCopy.copy((262143 & 1) != 0 ? userCopy.uuid : null, (262143 & 2) != 0 ? userCopy.username : null, (262143 & 4) != 0 ? userCopy.nickname : null, (262143 & 8) != 0 ? userCopy.email : null, (262143 & 16) != 0 ? userCopy.avatar : null, (262143 & 32) != 0 ? userCopy.gmtCreate : null, (262143 & 64) != 0 ? userCopy.vipName : null, (262143 & 128) != 0 ? userCopy.vipDate : null, (262143 & 256) != 0 ? userCopy.password : null, (262143 & 512) != 0 ? userCopy.confirmPassword : null, (262143 & 1024) != 0 ? userCopy.wechat : null, (262143 & 2048) != 0 ? userCopy.qq : null, (262143 & 4096) != 0 ? userCopy.city : null, (262143 & 8192) != 0 ? userCopy.mobile : null, (262143 & 16384) != 0 ? userCopy.cloudConfig : null, (262143 & 32768) != 0 ? userCopy.application : null, (262143 & 65536) != 0 ? userCopy.platform : null, (262143 & 131072) != 0 ? userCopy.deviceId : null, (262143 & 262144) != 0 ? userCopy.registTime : dateTimeString.getTime());
                        }
                        this.L$0 = userCopy;
                        this.label = 4;
                        localRegistTime = AppSettingViewModel.this.getBaseRepository().getLocalRegistTime(this);
                        if (localRegistTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue = ((Number) localRegistTime).longValue();
                        if (userCopy.getRegistTime() > 0) {
                            time = userCopy.getRegistTime();
                        } else if (Intrinsics.areEqual(userCopy.getGmtCreate(), "")) {
                            time = 0;
                        } else {
                            time = 0;
                        }
                        if (jLongValue <= 0) {
                            if (jLongValue <= 0) {
                                jLongValue = time;
                            }
                        } else if (jLongValue <= 0) {
                            jLongValue = time;
                        }
                        if (jLongValue > 0) {
                            this.L$0 = userCopy;
                            this.label = 5;
                            if (AppSettingViewModel.this.getBaseRepository().cacheLocalRegistTime(jLongValue, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        user = userCopy;
                        this.L$0 = user;
                        this.label = 6;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        user2 = user;
                        AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                        AppSettingViewModel.this.setLoginUser(user2);
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast("账号或密码错误");
                    }
                    return Unit.INSTANCE;
                case 4:
                    User user3 = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    userCopy = user3;
                    localRegistTime = obj;
                    jLongValue = ((Number) localRegistTime).longValue();
                    if (userCopy.getRegistTime() > 0) {
                        time = userCopy.getRegistTime();
                    } else if (Intrinsics.areEqual(userCopy.getGmtCreate(), "")) {
                        time = 0;
                    } else {
                        time = 0;
                    }
                    if (jLongValue <= 0) {
                        if (jLongValue <= 0) {
                            jLongValue = time;
                        }
                    } else if (jLongValue <= 0) {
                        jLongValue = time;
                    }
                    if (jLongValue > 0) {
                        this.L$0 = userCopy;
                        this.label = 5;
                        if (AppSettingViewModel.this.getBaseRepository().cacheLocalRegistTime(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    user = userCopy;
                    this.L$0 = user;
                    this.label = 6;
                    if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    user2 = user;
                    AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                    AppSettingViewModel.this.setLoginUser(user2);
                    AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    return Unit.INSTANCE;
                case 5:
                    user = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = user;
                    this.label = 6;
                    if (AppSettingViewModel.this.getBaseRepository().makeLogin(user, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    user2 = user;
                    AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                    AppSettingViewModel.this.setLoginUser(user2);
                    AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    return Unit.INSTANCE;
                case 6:
                    user2 = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    AppSettingViewModel.this.getBaseRepository().toast("登录成功");
                    AppSettingViewModel.this.setLoginUser(user2);
                    AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void doRegist() {
        String strIsRegistValid = getLoginUser().isRegistValid();
        if (CommonToolKt.isOk(strIsRegistValid)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        } else {
            this.baseRepository.toast(strIsRegistValid);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doRegist$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doRegist$1", f = "AppViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_FRAG_RANGE, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RANGE_SIZE, MediaPlayer.MEDIA_PLAYER_OPTION_HIJACK_EXIT, MediaPlayer.MEDIA_PLAYER_OPTION_DISABLE_LOOPER_TIMEOUT, MediaPlayer.MEDIA_PLAYER_OPTION_ACCURATE_LAYOUT}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00be A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            User loginUser;
            User loginUser2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    loginUser = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    loginUser.setDeviceId((String) obj);
                    AppSettingViewModel.this.getLoginUser().setApplication("plan");
                    AppSettingViewModel.this.getLoginUser().setPlatform(ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE);
                    loginUser2 = AppSettingViewModel.this.getLoginUser();
                    this.L$0 = loginUser2;
                    this.label = 3;
                    obj = AppSettingViewModel.this.getBaseRepository().getUid(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    loginUser2.setUuid((String) obj);
                    this.L$0 = null;
                    this.label = 4;
                    obj = CommonToolKt.withApi(new AppSettingViewModel$doRegist$1$rst$1(AppSettingViewModel.this, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        this.label = 5;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin((User) apiResult.fetchResult(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast(apiResult.getMessage());
                    }
                } else if (i == 3) {
                    loginUser2 = (User) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    loginUser2.setUuid((String) obj);
                    this.L$0 = null;
                    this.label = 4;
                    obj = CommonToolKt.withApi(new AppSettingViewModel$doRegist$1$rst$1(AppSettingViewModel.this, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        this.label = 5;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin((User) apiResult.fetchResult(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast(apiResult.getMessage());
                    }
                } else if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    AppSettingViewModel.this.getBaseRepository().finish();
                    if (apiResult.getSuccess()) {
                        AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                        this.label = 5;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin((User) apiResult.fetchResult(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AppSettingViewModel.this.getBaseRepository().toast(apiResult.getMessage());
                    }
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            loginUser = AppSettingViewModel.this.getLoginUser();
            this.L$0 = loginUser;
            this.label = 2;
            obj = AppSettingViewModel.this.getBaseRepository().getDid(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            loginUser.setDeviceId((String) obj);
            AppSettingViewModel.this.getLoginUser().setApplication("plan");
            AppSettingViewModel.this.getLoginUser().setPlatform(ScheduleShareDataKt.SCHEDULE_SHARE_APP_CODE);
            loginUser2 = AppSettingViewModel.this.getLoginUser();
            this.L$0 = loginUser2;
            this.label = 3;
            obj = AppSettingViewModel.this.getBaseRepository().getUid(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            loginUser2.setUuid((String) obj);
            this.L$0 = null;
            this.label = 4;
            obj = CommonToolKt.withApi(new AppSettingViewModel$doRegist$1$rst$1(AppSettingViewModel.this, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            AppSettingViewModel.this.getBaseRepository().finish();
            if (apiResult.getSuccess()) {
                AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                this.label = 5;
                if (AppSettingViewModel.this.getBaseRepository().makeLogin((User) apiResult.fetchResult(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                AppSettingViewModel.this.getBaseRepository().toast(apiResult.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doExit$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doExit$1", f = "AppViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_SAVED_HOST_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_FIRST_PACKET_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_FIRST_PACKET_TIME}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objExit;
            String str;
            String str2;
            String str3;
            BaseRepository baseRepository;
            String str4;
            Object[] objArr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    objExit = obj;
                    str = null;
                    str2 = null;
                    str3 = null;
                    AppSettingViewModel.this.setFormType(new FormType(str, str2, str3, 7, null));
                    baseRepository = AppSettingViewModel.this.getBaseRepository();
                    str4 = null;
                    objArr = 0 == true ? 1 : 0;
                    this.label = 3;
                    if (baseRepository.makeLogin(new User(str, str2, str3, null, objArr, null, null, null, str4, str4, null, null, null, null, null, null, null, null, 0L, 524287, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AppSettingViewModel.this.getBaseRepository().finish();
                AppSettingViewModel.this.getBaseRepository().reload();
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                return Unit.INSTANCE;
            }
            this.label = 2;
            objExit = AppSettingViewModel.this.getBaseRepository().getApi().exit(AppSettingViewModel.this.getLoginUser(), this);
            if (objExit == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = null;
            str2 = null;
            str3 = null;
            AppSettingViewModel.this.setFormType(new FormType(str, str2, str3, 7, null));
            baseRepository = AppSettingViewModel.this.getBaseRepository();
            str4 = null;
            objArr = 0 == true ? 1 : 0;
            this.label = 3;
            if (baseRepository.makeLogin(new User(str, str2, str3, null, objArr, null, null, null, str4, str4, null, null, null, null, null, null, null, null, 0L, 524287, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            AppSettingViewModel.this.getBaseRepository().finish();
            AppSettingViewModel.this.getBaseRepository().reload();
            CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final void doExit(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(navHostController, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doUpdateInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doUpdateInfo$1", f = "AppViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_STOP_SOURCE_ASYNC, MediaPlayer.MEDIA_PLAYER_OPTION_DISABLE_HWDEC_SEAMLESS, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_VSYNC_HELPER}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0059  */
        /* JADX WARN: Code duplicated, block: B:22:0x007b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        if (((ApiResult) obj).getSuccess()) {
                            AppSettingViewModel.this.getBaseRepository().toast("设置成功");
                            this.label = 3;
                            if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            AppSettingViewModel.this.getBaseRepository().toast("暂时失败");
                            AppSettingViewModel.this.getBaseRepository().finish();
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AppSettingViewModel.this.getBaseRepository().reload();
                AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                return Unit.INSTANCE;
            }
            this.label = 2;
            obj = CommonToolKt.withApi(new AppSettingViewModel$doUpdateInfo$1$rst$1(AppSettingViewModel.this, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((ApiResult) obj).getSuccess()) {
                AppSettingViewModel.this.getBaseRepository().toast("设置成功");
                this.label = 3;
                if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                AppSettingViewModel.this.getBaseRepository().reload();
                AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
            } else {
                AppSettingViewModel.this.getBaseRepository().toast("暂时失败");
                AppSettingViewModel.this.getBaseRepository().finish();
            }
            return Unit.INSTANCE;
        }
    }

    public final void doUpdateInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$changeNotifyStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$changeNotifyStatus$1", f = "AppViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_REFRESH_BY_TIME}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $open;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$value = str;
            this.$open = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(this.$value, this.$open, continuation);
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
                AppSettingViewModel.this.getNotifyStatus2().put(this.$value, Boxing.boxBoolean(this.$open));
                this.label = 1;
                if (AppSettingViewModel.this.getBaseRepository().makeNotifyStatus(AppSettingViewModel.this.getNotifyStatus2(), this) == coroutine_suspended) {
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

    public final void changeNotifyStatus(String value, boolean open) {
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(value, open, null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$changeBrand$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$changeBrand$1", f = "AppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(this.$it, continuation);
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
            AppSettingViewModel.this.setBrand(this.$it);
            AppSettingViewModel.this.getBaseRepository().setBrand(this.$it);
            CacheUtil.set(AppSettingViewModel.this.getBaseRepository().getContext(), "brand", this.$it);
            return Unit.INSTANCE;
        }
    }

    public final void changeBrand(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(it, null), 3, null);
    }

    public final void doPurchase(Activity activity, Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cb, "cb");
        if (getLoginUser().isLogin()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(activity, cb, null), 3, null);
        } else {
            setPurchaseFlag(true);
            setFormType(new FormType("login", null, null, 6, null));
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doPurchase$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doPurchase$1", f = "AppViewModel.kt", i = {3}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RENDER_STALL_THRESHOLD, 322, MediaPlayer.MEDIA_PLAYER_OPTION_SET_AVPH_AUDIO_PROBESIZE, MediaPlayer.MEDIA_PLAYER_OPTION_GET_FIRST_VIDEO_POS}, m = "invokeSuspend", n = {o.f2366c}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Function0<Unit> $cb;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$cb = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(this.$activity, this.$cb, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0065  */
        /* JADX WARN: Code duplicated, block: B:24:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0095  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:39:0x0100  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ApiResult apiResult;
            Map map;
            String str;
            Map map2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (apiResult.getSuccess()) {
                            PayTask payTask = new PayTask(this.$activity);
                            String str2 = (String) apiResult.fetchResult();
                            this.label = 3;
                            obj = BuildersKt.withContext(Dispatchers.getIO(), new AppSettingViewModel$doPurchase$1$result$1(payTask, str2, null), this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            map = (Map) obj;
                            if (map.get(o.f2364a) != null) {
                                str = (String) map.get(o.f2366c);
                                if (!Intrinsics.areEqual(str, "")) {
                                    AppSettingViewModel.this.getLoginUser().makeVip(AppSettingViewModel.this.getCurrentMode());
                                    this.L$0 = map;
                                    this.label = 4;
                                    if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    map2 = map;
                                }
                            } else {
                                str = (String) map.get(o.f2366c);
                                if (!Intrinsics.areEqual(str, "")) {
                                    AppSettingViewModel.this.getLoginUser().makeVip(AppSettingViewModel.this.getCurrentMode());
                                    this.L$0 = map;
                                    this.label = 4;
                                    if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    map2 = map;
                                }
                            }
                            CommonToolKt.mlog("payResult", map);
                        } else {
                            AppSettingViewModel.this.toast(apiResult.getMessage());
                        }
                        AppSettingViewModel.this.getBaseRepository().finish();
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        map = (Map) obj;
                        if (map.get(o.f2364a) != null || !Intrinsics.areEqual(map.get(o.f2364a), "6001")) {
                            str = (String) map.get(o.f2366c);
                            if (!Intrinsics.areEqual(str, "") && ((AliPayResult) JSON.parseObject(str, AliPayResult.class)).isSuccess()) {
                                AppSettingViewModel.this.getLoginUser().makeVip(AppSettingViewModel.this.getCurrentMode());
                                this.L$0 = map;
                                this.label = 4;
                                if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                map2 = map;
                            }
                        }
                        CommonToolKt.mlog("payResult", map);
                        AppSettingViewModel.this.getBaseRepository().finish();
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map2 = (Map) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AppSettingViewModel.this.toast("购买成功，感谢您的支持");
                this.$cb.invoke();
                map = map2;
                CommonToolKt.mlog("payResult", map);
                AppSettingViewModel.this.getBaseRepository().finish();
                return Unit.INSTANCE;
            }
            this.label = 2;
            obj = CommonToolKt.withApi(new AppSettingViewModel$doPurchase$1$info$1(AppSettingViewModel.this, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.getSuccess()) {
                PayTask payTask2 = new PayTask(this.$activity);
                String str3 = (String) apiResult.fetchResult();
                this.label = 3;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AppSettingViewModel$doPurchase$1$result$1(payTask2, str3, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = (Map) obj;
                if (map.get(o.f2364a) != null) {
                    str = (String) map.get(o.f2366c);
                    if (!Intrinsics.areEqual(str, "")) {
                        AppSettingViewModel.this.getLoginUser().makeVip(AppSettingViewModel.this.getCurrentMode());
                        this.L$0 = map;
                        this.label = 4;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map2 = map;
                        AppSettingViewModel.this.toast("购买成功，感谢您的支持");
                        this.$cb.invoke();
                        map = map2;
                    }
                } else {
                    str = (String) map.get(o.f2366c);
                    if (!Intrinsics.areEqual(str, "")) {
                        AppSettingViewModel.this.getLoginUser().makeVip(AppSettingViewModel.this.getCurrentMode());
                        this.L$0 = map;
                        this.label = 4;
                        if (AppSettingViewModel.this.getBaseRepository().makeLogin(AppSettingViewModel.this.getLoginUser(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map2 = map;
                        AppSettingViewModel.this.toast("购买成功，感谢您的支持");
                        this.$cb.invoke();
                        map = map2;
                    }
                }
                CommonToolKt.mlog("payResult", map);
            } else {
                AppSettingViewModel.this.toast(apiResult.getMessage());
            }
            AppSettingViewModel.this.getBaseRepository().finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.vm.AppSettingViewModel$doLogOut$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.vm.AppSettingViewModel$doLogOut$1", f = "AppViewModel.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_PTS_SYNCED_SEI_NOTIFICATION, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_LOADCONTROL_BUFFERINGTIMEOUT, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_POST_STALL_500}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavHostController $navHostController;
        final /* synthetic */ String $pwd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, NavHostController navHostController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pwd = str;
            this.$navHostController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppSettingViewModel.this.new AnonymousClass1(this.$pwd, this.$navHostController, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006e  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            User loginUser;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.loading$default(AppSettingViewModel.this.getBaseRepository(), false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        AppSettingViewModel.this.getBaseRepository().finish();
                        if (((ApiResult) obj).getSuccess()) {
                            AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                            AppSettingViewModel.this.reset();
                            loginUser = AppSettingViewModel.this.getBaseRepository().getLoginUser();
                            loginUser.setNickname("");
                            loginUser.setUsername("");
                            loginUser.setVipDate("");
                            loginUser.setVipName("");
                            loginUser.setPassword("");
                            loginUser.setConfirmPassword("");
                            this.label = 3;
                            if (AppSettingViewModel.this.getBaseRepository().makeLogin(loginUser, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            AppSettingViewModel.this.getBaseRepository().toast("密码不正确");
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AppSettingViewModel.this.getBaseRepository().finish();
                AppSettingViewModel.this.getBaseRepository().reload();
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
                return Unit.INSTANCE;
            }
            AppSettingViewModel.this.getLoginUser().setPassword(this.$pwd);
            this.label = 2;
            obj = CommonToolKt.withApi(new AppSettingViewModel$doLogOut$1$rst$1(AppSettingViewModel.this, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            AppSettingViewModel.this.getBaseRepository().finish();
            if (((ApiResult) obj).getSuccess()) {
                AppSettingViewModel.this.setFormType(new FormType(null, null, null, 7, null));
                AppSettingViewModel.this.reset();
                loginUser = AppSettingViewModel.this.getBaseRepository().getLoginUser();
                loginUser.setNickname("");
                loginUser.setUsername("");
                loginUser.setVipDate("");
                loginUser.setVipName("");
                loginUser.setPassword("");
                loginUser.setConfirmPassword("");
                this.label = 3;
                if (AppSettingViewModel.this.getBaseRepository().makeLogin(loginUser, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                AppSettingViewModel.this.getBaseRepository().finish();
                AppSettingViewModel.this.getBaseRepository().reload();
                CommonToolKt.goBack$default(this.$navHostController, null, 2, null);
            } else {
                AppSettingViewModel.this.getBaseRepository().toast("密码不正确");
            }
            return Unit.INSTANCE;
        }
    }

    public final void doLogOut(NavHostController navHostController, String pwd) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(pwd, "pwd");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(pwd, navHostController, null), 3, null);
    }
}