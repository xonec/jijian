package cn.jianyun.workplan.main.setting.cloud.jgy;

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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JgyBindView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"JgyBindView", "", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JgyBindViewKt {
    public static final void JgyBindView(final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(854287895);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(JgyBindView)");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(854287895, i2, -1, "cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindView (JgyBindView.kt:79)");
            }
            composerStartRestartGroup.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) JgyBindViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            final JgyBindViewModel jgyBindViewModel = (JgyBindViewModel) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            HeaderViewKt.HeaderView("绑定坚果云账号", null, null, composerStartRestartGroup, 6, 6);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            FormItemKt.InnerInputItemView("账号", "请输入坚果云账号", false, false, false, jgyBindViewModel.getLoginUser().getUsername(), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    JgyBindViewModel jgyBindViewModel2 = jgyBindViewModel;
                    WebDAVUser loginUser = jgyBindViewModel2.getLoginUser();
                    jgyBindViewModel2.setLoginUser(loginUser.copy((8063 & 1) != 0 ? loginUser.uuid : null, (8063 & 2) != 0 ? loginUser.url : null, (8063 & 4) != 0 ? loginUser.username : it, (8063 & 8) != 0 ? loginUser.password : null, (8063 & 16) != 0 ? loginUser.platform : null, (8063 & 32) != 0 ? loginUser.type : null, (8063 & 64) != 0 ? loginUser.defaultPath : null, (8063 & 128) != 0 ? loginUser.masterNode : false, (8063 & 256) != 0 ? loginUser.bind : false, (8063 & 512) != 0 ? loginUser.ordinal : 0, (8063 & 1024) != 0 ? loginUser.shown : false, (8063 & 2048) != 0 ? loginUser.message : null, (8063 & 4096) != 0 ? loginUser.cloud : false));
                }
            }, composerStartRestartGroup, 54, 28);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            FormItemKt.InnerInputItemView("密码", "请输入坚果云应用密码", false, true, false, jgyBindViewModel.getLoginUser().getPassword(), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    JgyBindViewModel jgyBindViewModel2 = jgyBindViewModel;
                    WebDAVUser loginUser = jgyBindViewModel2.getLoginUser();
                    jgyBindViewModel2.setLoginUser(loginUser.copy((8063 & 1) != 0 ? loginUser.uuid : null, (8063 & 2) != 0 ? loginUser.url : null, (8063 & 4) != 0 ? loginUser.username : null, (8063 & 8) != 0 ? loginUser.password : it, (8063 & 16) != 0 ? loginUser.platform : null, (8063 & 32) != 0 ? loginUser.type : null, (8063 & 64) != 0 ? loginUser.defaultPath : null, (8063 & 128) != 0 ? loginUser.masterNode : false, (8063 & 256) != 0 ? loginUser.bind : false, (8063 & 512) != 0 ? loginUser.ordinal : 0, (8063 & 1024) != 0 ? loginUser.shown : false, (8063 & 2048) != 0 ? loginUser.message : null, (8063 & 4096) != 0 ? loginUser.cloud : false));
                }
            }, composerStartRestartGroup, 3126, 20);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            BoxViewKt.m6893SmallLinkTextPZHvWI("查看坚果云webdav账号设置教程?", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3078, 6);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$4
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
                    JgyBindViewModel jgyBindViewModel2 = jgyBindViewModel;
                    final Function0<Unit> function1 = onDismiss;
                    jgyBindViewModel2.doBind(new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$4.1
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
                            function1.invoke();
                        }
                    });
                }
            };
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(onDismiss);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt$JgyBindView$1$5$1
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
                        onDismiss.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("登录", null, 0.0f, 0.0f, function0, (Function0) objRememberedValue, composerStartRestartGroup, 6, 14);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewKt.JgyBindView.2
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
                JgyBindViewKt.JgyBindView(onDismiss, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}