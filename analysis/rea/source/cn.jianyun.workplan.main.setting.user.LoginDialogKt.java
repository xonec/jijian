package cn.jianyun.workplan.main.setting.user;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import com.adgain.sdk.base.models.AdConstants;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoginDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"LoginDialog", "", "viewModel", "Lcn/jianyun/workplan/vm/AppSettingViewModel;", "type", "", "backAction", "Lkotlin/Function0;", "(Lcn/jianyun/workplan/vm/AppSettingViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LoginDialogKt {
    public static final void LoginDialog(final AppSettingViewModel viewModel, final String str, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1443848193);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LoginDialog)P(2,1)");
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1443848193, i, -1, "cn.jianyun.workplan.main.setting.user.LoginDialog (LoginDialog.kt:32)");
        }
        DialogViewKt.SelfDialog(false, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                viewModel.setFormType(new FormType(null, null, null, 7, null));
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1558842556, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1558842556, i3, -1, "cn.jianyun.workplan.main.setting.user.LoginDialog.<anonymous> (LoginDialog.kt:36)");
                    }
                    float f2 = 10;
                    BoxViewKt.m6876CenterRowdjqsMU(null, Dp.m6097constructorimpl(f2), 0.0f, ComposableSingletons$LoginDialogKt.INSTANCE.m6695getLambda1$app_release(), composer2, 3120, 5);
                    float fM6097constructorimpl = Dp.m6097constructorimpl(f2);
                    float fM6097constructorimpl2 = Dp.m6097constructorimpl(20);
                    final AppSettingViewModel appSettingViewModel = viewModel;
                    BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, fM6097constructorimpl2, ComposableLambdaKt.composableLambda(composer2, 1407797426, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1407797426, i4, -1, "cn.jianyun.workplan.main.setting.user.LoginDialog.<anonymous>.<anonymous> (LoginDialog.kt:44)");
                                }
                                String type = appSettingViewModel.getLoginType().getType();
                                List<SelectDO> LOGIN_TYPES = SelectUtil.LOGIN_TYPES;
                                Intrinsics.checkNotNullExpressionValue(LOGIN_TYPES, "LOGIN_TYPES");
                                final AppSettingViewModel appSettingViewModel2 = appSettingViewModel;
                                FormItemKt.m6844SegmentPickerViewJkgoBcI(type, 0.0f, LOGIN_TYPES, 0.0f, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                        invoke2(str2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        appSettingViewModel2.setLoginType(new FormType(it, null, null, 6, null));
                                    }
                                }, composer3, 512, 10);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 3504, 1);
                    composer2.startReplaceableGroup(-73578499);
                    if (viewModel.getPurchaseFlag()) {
                        CommonUIKt.m6952WarnTexthfI1UA("请登录或注册账号后再购买，避免无法绑定会员身份", 0.0f, TextUnitKt.getSp(14), 0L, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 26);
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f2), composer2, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-73578353);
                    if (Intrinsics.areEqual(str, AdConstants.feedback)) {
                        CommonUIKt.m6952WarnTexthfI1UA("请登录或注册账号后再反馈，避免无法查看回复", 0.0f, TextUnitKt.getSp(12), 0L, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 26);
                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f2), composer2, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    final AppSettingViewModel appSettingViewModel2 = viewModel;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    FormItemKt.InnerInputItemView("账号", "邮箱或手机号", false, false, false, appSettingViewModel2.getLoginUser().getUsername(), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt$LoginDialog$2$2$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                            invoke2(str2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppSettingViewModel appSettingViewModel3 = appSettingViewModel2;
                            User loginUser = appSettingViewModel3.getLoginUser();
                            appSettingViewModel3.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : it, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                        }
                    }, composer2, 54, 28);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    FormItemKt.InnerInputItemView("密码", null, false, true, false, appSettingViewModel2.getLoginUser().getPassword(), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt$LoginDialog$2$2$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                            invoke2(str2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AppSettingViewModel appSettingViewModel3 = appSettingViewModel2;
                            User loginUser = appSettingViewModel3.getLoginUser();
                            appSettingViewModel3.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : it, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                        }
                    }, composer2, 3078, 22);
                    composer2.startReplaceableGroup(-73577744);
                    if (appSettingViewModel2.getLoginType().isForm("regist")) {
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        FormItemKt.InnerInputItemView("确认", "请输入确认密码", false, true, false, appSettingViewModel2.getLoginUser().getConfirmPassword(), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt$LoginDialog$2$2$3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AppSettingViewModel appSettingViewModel3 = appSettingViewModel2;
                                User loginUser = appSettingViewModel3.getLoginUser();
                                appSettingViewModel3.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : it, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                            }
                        }, composer2, 3126, 20);
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (viewModel.getLoginType().isForm("regist")) {
                        composer2.startReplaceableGroup(-73577344);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        BoxViewKt.m6894SmallTipTextEx1dzz4("注意：目前仅用于绑定您的付费状态和反馈意见", 0L, 0.0f, 0.0f, null, null, composer2, 6, 62);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final AppSettingViewModel appSettingViewModel3 = viewModel;
                        Function0<Unit> function1 = new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.3
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                appSettingViewModel3.doRegist();
                            }
                        };
                        final AppSettingViewModel appSettingViewModel4 = viewModel;
                        final Function0<Unit> function2 = function0;
                        ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("确认注册", null, 0.0f, 0.0f, function1, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                appSettingViewModel4.setFormType(new FormType(null, null, null, 7, null));
                                Function0<Unit> function3 = function2;
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        }, composer2, 6, 14);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-73576999);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        final AppSettingViewModel appSettingViewModel5 = viewModel;
                        Function0<Unit> function3 = new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.5
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                appSettingViewModel5.doLogin();
                            }
                        };
                        final AppSettingViewModel appSettingViewModel6 = viewModel;
                        final Function0<Unit> function4 = function0;
                        ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("登录", null, 0.0f, 0.0f, function3, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                appSettingViewModel6.setFormType(new FormType(null, null, null, 7, null));
                                Function0<Unit> function5 = function4;
                                if (function5 != null) {
                                    function5.invoke();
                                }
                            }
                        }, composer2, 6, 14);
                        composer2.endReplaceableGroup();
                    }
                    final AppSettingViewModel appSettingViewModel7 = viewModel;
                    final Function0<Unit> function5 = function0;
                    BackHandlerKt.BackHandler(false, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.2.7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            appSettingViewModel7.setFormType(new FormType(null, null, null, 7, null));
                            Function0<Unit> function6 = function5;
                            if (function6 != null) {
                                function6.invoke();
                            }
                        }
                    }, composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
        BackHandlerKt.BackHandler(false, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                viewModel.setFormType(new FormType(null, null, null, 7, null));
                Function0<Unit> function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        }, composerStartRestartGroup, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str2 = str;
        final Function0<Unit> function1 = function0;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.LoginDialogKt.LoginDialog.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                LoginDialogKt.LoginDialog(viewModel, str2, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}