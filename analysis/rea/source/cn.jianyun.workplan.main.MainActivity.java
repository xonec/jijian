package cn.jianyun.workplan.main;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.splashscreen.SplashScreen;
import androidx.lifecycle.LifecycleOwnerKt;
import cn.jianyun.workplan.R;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.model.ScheduleShareDataKt;
import cn.jianyun.workplan.util.CommonToolKt;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager;
import dagger.hilt.android.AndroidEntryPoint;
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
import my.nanihadesuka.compose.TestTagsScrollbar;
import org.apache.logging.log4j.message.ParameterizedMessage;
import pro.dxys.ad.AdSdk;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020-J\n\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000204J\u0006\u00105\u001a\u000201J\u0012\u00106\u001a\u0002012\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u000201H\u0014J\b\u0010:\u001a\u000201H\u0014J\b\u0010;\u001a\u000201H\u0014J\u000e\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0019J\u0018\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d¨\u0006E"}, d2 = {"Lcn/jianyun/workplan/main/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "setBaseRepository", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "dyAd", "Lcom/bytedance/sdk/openadsdk/TTAdNative;", "getDyAd", "()Lcom/bytedance/sdk/openadsdk/TTAdNative;", "setDyAd", "(Lcom/bytedance/sdk/openadsdk/TTAdNative;)V", "dy_ad_id", "", "getDy_ad_id", "()Ljava/lang/String;", "setDy_ad_id", "(Ljava/lang/String;)V", "dy_app_id", "getDy_app_id", "setDy_app_id", "initDy", "", "getInitDy", "()Z", "setInitDy", "(Z)V", "initGdk", "getInitGdk", "setInitGdk", "lastAdTime", "", "getLastAdTime", "()J", "setLastAdTime", "(J)V", "recoverFlag", "getRecoverFlag", "setRecoverFlag", "buildConfig", "Lcom/bytedance/sdk/openadsdk/TTAdConfig;", "buildSplashAdslot", "Lcom/bytedance/sdk/openadsdk/AdSlot;", "getTTCustomController", "Lcom/bytedance/sdk/openadsdk/TTCustomController;", "initDyAd", "", "loadAds", "mustAd", "", "loadSplashAd", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRestart", "onResume", "onlineDebug", "msg", "onlineTest", "showSplashAd", "ad", "Lcom/bytedance/sdk/openadsdk/CSJSplashAd;", TestTagsScrollbar.container, "Landroid/view/ViewGroup;", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AndroidEntryPoint
public final class MainActivity extends Hilt_MainActivity {
    public static final String EXTRA_TARGET_ROUTE = "target_route";
    public static final String UPDATE_INTRO_KEY = "update_intro_20260508_v3";

    @Inject
    public BaseRepository baseRepository;
    public TTAdNative dyAd;
    private boolean initDy;
    private boolean initGdk;
    private long lastAdTime;
    private boolean recoverFlag;
    public static final int $stable = 8;
    private String dy_app_id = (String) CommonToolKt.ifv(false, "5761363", "5768812");
    private String dy_ad_id = (String) CommonToolKt.ifv(false, "103754403", "103819592");

    public final BaseRepository getBaseRepository() {
        BaseRepository baseRepository = this.baseRepository;
        if (baseRepository != null) {
            return baseRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseRepository");
        return null;
    }

    public final void setBaseRepository(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "<set-?>");
        this.baseRepository = baseRepository;
    }

    public final TTAdNative getDyAd() {
        TTAdNative tTAdNative = this.dyAd;
        if (tTAdNative != null) {
            return tTAdNative;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dyAd");
        return null;
    }

    public final void setDyAd(TTAdNative tTAdNative) {
        Intrinsics.checkNotNullParameter(tTAdNative, "<set-?>");
        this.dyAd = tTAdNative;
    }

    public final String getDy_app_id() {
        return this.dy_app_id;
    }

    public final void setDy_app_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dy_app_id = str;
    }

    public final String getDy_ad_id() {
        return this.dy_ad_id;
    }

    public final void setDy_ad_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dy_ad_id = str;
    }

    public final long getLastAdTime() {
        return this.lastAdTime;
    }

    public final void setLastAdTime(long j) {
        this.lastAdTime = j;
    }

    public final boolean getRecoverFlag() {
        return this.recoverFlag;
    }

    public final void setRecoverFlag(boolean z) {
        this.recoverFlag = z;
    }

    public final boolean getInitDy() {
        return this.initDy;
    }

    public final void setInitDy(boolean z) {
        this.initDy = z;
    }

    public final boolean getInitGdk() {
        return this.initGdk;
    }

    public final void setInitGdk(boolean z) {
        this.initGdk = z;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen.INSTANCE.installSplashScreen(this).setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: cn.jianyun.workplan.main.MainActivity.onCreate.1
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean shouldKeepOnScreen() {
                return false;
            }
        });
        setContentView(R.layout.main);
        ((ComposeView) findViewById(R.id.container)).setContent(ComposableLambdaKt.composableLambdaInstance(-1296979713, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.MainActivity.onCreate.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1296979713, i, -1, "cn.jianyun.workplan.main.MainActivity.onCreate.<anonymous> (MainActivity.kt:147)");
                }
                MainActivityKt.MainScreen(MainActivity.this.getBaseRepository(), MainActivity.this, composer, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.MainActivity$onCreate$3, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.MainActivity$onCreate$3", f = "MainActivity.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (MainActivity.this.getBaseRepository().initApp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (MainActivity.this.getBaseRepository().hasRegist()) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.onlineDebug(mainActivity.getDy_app_id() + ParameterizedMessage.ERROR_MSG_SEPARATOR + MainActivity.this.getDy_ad_id());
                    MainActivity.loadAds$default(MainActivity.this, 0, 1, null);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean onlineTest() {
        return Intrinsics.areEqual(getBaseRepository().getLoginUser().getUsername(), "15068790467");
    }

    public final void onlineDebug(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (onlineTest()) {
            getBaseRepository().toast(msg);
        }
    }

    public static /* synthetic */ void loadAds$default(MainActivity mainActivity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        mainActivity.loadAds(i);
    }

    public final void loadAds(int mustAd) {
        if (onlineTest() || !getBaseRepository().isAdVip()) {
            CommonToolKt.mlog("gapAds", Long.valueOf((System.currentTimeMillis() - this.lastAdTime) / ((long) 1000)), Integer.valueOf(getBaseRepository().getAppTipInfo().getScreenAdsGapMinute()));
            if (System.currentTimeMillis() - this.lastAdTime < getBaseRepository().getAppTipInfo().getScreenAdsGapMinute() * 1000 * 60) {
                return;
            }
            if (!this.initGdk) {
                AdSdk.initAdn(getApplication(), ScheduleShareDataKt.SCHEDULE_SHARE_APP_ID);
                this.initGdk = true;
            }
            this.lastAdTime = System.currentTimeMillis();
            if (mustAd == 0) {
                onlineDebug("加载抖音广告" + getBaseRepository().getRegistDay());
                initDyAd();
            }
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        CommonToolKt.mlog("restart", "111");
        super.onRestart();
        loadAds$default(this, 0, 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        CommonToolKt.mlog("activity onResume");
    }

    private final void initDyAd() {
        if (this.initDy) {
            CommonToolKt.mlog("prepare2 initDyAds");
            loadSplashAd();
        } else {
            CommonToolKt.mlog("prepare initDyAds");
            TTAdSdk.init(getBaseRepository().getContext(), buildConfig());
            TTAdSdk.start(new TTAdSdk.Callback() { // from class: cn.jianyun.workplan.main.MainActivity.initDyAd.1
                @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                public void success() {
                    TTAdNative adNativeLoader = TTAdSdk.getAdManager().createAdNative(MainActivity.this);
                    MainActivity mainActivity = this;
                    Intrinsics.checkNotNullExpressionValue(adNativeLoader, "adNativeLoader");
                    mainActivity.setDyAd(adNativeLoader);
                    this.loadSplashAd();
                    this.setInitDy(true);
                    CommonToolKt.mlog("initDyAds");
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
                public void fail(int code, String msg) {
                    CommonToolKt.mlog("initDyAdFail", msg);
                    this.onlineDebug("加载抖音失败：" + msg);
                }
            });
        }
    }

    public final AdSlot buildSplashAdslot() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(this.dy_ad_id).setIsAutoPlay(true).setImageAcceptedSize(displayMetrics.widthPixels, displayMetrics.heightPixels).build();
        Intrinsics.checkNotNullExpressionValue(adSlotBuild, "Builder()\n            .s…tPx)\n            .build()");
        return adSlotBuild;
    }

    public final void loadSplashAd() {
        getDyAd().loadSplashAd(buildSplashAdslot(), new TTAdNative.CSJSplashAdListener() { // from class: cn.jianyun.workplan.main.MainActivity.loadSplashAd.1
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashRenderFail(CSJSplashAd p0, CSJAdError p1) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashLoadSuccess(CSJSplashAd p0) {
                CommonToolKt.mlog("loadDyAdSucess");
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashLoadFail(CSJAdError error) {
                Object[] objArr = new Object[2];
                objArr[0] = "loadDyAdFail";
                objArr[1] = error != null ? error.getMsg() : null;
                CommonToolKt.mlog(objArr);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.CSJSplashAdListener
            public void onSplashRenderSuccess(CSJSplashAd csjSplashAd) {
                FrameLayout pr = (FrameLayout) MainActivity.this.findViewById(R.id.ads1);
                pr.setVisibility(0);
                MainActivity.this.getBaseRepository().setAdVip(true);
                MainActivity mainActivity = MainActivity.this;
                Intrinsics.checkNotNullExpressionValue(pr, "pr");
                mainActivity.showSplashAd(csjSplashAd, pr);
                MainActivity.this.getBaseRepository().postEvent2("ad1Success");
                if (MainActivity.this.getRecoverFlag()) {
                    MainActivity.this.getBaseRepository().postEvent2("recoverAd1Success");
                }
                MainActivity.this.setRecoverFlag(false);
            }
        }, 3000);
    }

    public final void showSplashAd(final CSJSplashAd ad, final ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (ad != null) {
            ad.setSplashAdListener(new CSJSplashAd.SplashAdListener() { // from class: cn.jianyun.workplan.main.MainActivity$showSplashAd$1$1
                @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                public void onSplashAdShow(CSJSplashAd csjSplashAd) {
                    CommonToolKt.mlog("showDyAd");
                    container.setVisibility(0);
                    MediationSplashManager mediationManager = ad.getMediationManager();
                    if (mediationManager == null || mediationManager.getShowEcpm() == null) {
                        return;
                    }
                    mediationManager.getShowEcpm().getEcpm();
                    mediationManager.getShowEcpm().getSdkName();
                    mediationManager.getShowEcpm().getSlotId();
                }

                @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                public void onSplashAdClick(CSJSplashAd csjSplashAd) {
                    CommonToolKt.mlog("clickDyAds");
                }

                @Override // com.bytedance.sdk.openadsdk.CSJSplashAd.SplashAdListener
                public void onSplashAdClose(CSJSplashAd csjSplashAd, int p1) {
                    container.setVisibility(8);
                    container.removeAllViews();
                    CommonToolKt.mlog("closeDyAds");
                }
            });
            ad.showSplashView(container);
        }
    }

    private final TTAdConfig buildConfig() {
        TTAdConfig tTAdConfigBuild = new TTAdConfig.Builder().appId(this.dy_app_id).appName("极简排班").useMediation(true).debug(false).themeStatus(0).supportMultiProcess(false).customController(getTTCustomController()).build();
        Intrinsics.checkNotNullExpressionValue(tTAdConfigBuild, "Builder()\n            .a…置隐私权\n            .build()");
        return tTAdConfigBuild;
    }

    private final TTCustomController getTTCustomController() {
        return new TTCustomController() { // from class: cn.jianyun.workplan.main.MainActivity.getTTCustomController.1
            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public boolean isCanUseAndroidId() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public boolean isCanUseLocation() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public boolean isCanUsePhoneState() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public boolean isCanUseWifiState() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public boolean isCanUseWriteExternal() {
                return true;
            }

            @Override // com.bytedance.sdk.openadsdk.TTCustomController
            public MediationPrivacyConfig getMediationPrivacyConfig() {
                return new MediationPrivacyConfig() { // from class: cn.jianyun.workplan.main.MainActivity$getTTCustomController$1$getMediationPrivacyConfig$1
                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig, com.bytedance.sdk.openadsdk.mediation.init.IMediationPrivacyConfig
                    public boolean isLimitPersonalAds() {
                        return false;
                    }

                    @Override // com.bytedance.sdk.openadsdk.mediation.init.MediationPrivacyConfig, com.bytedance.sdk.openadsdk.mediation.init.IMediationPrivacyConfig
                    public boolean isProgrammaticRecommend() {
                        return true;
                    }
                };
            }
        };
    }
}