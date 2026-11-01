package cn.jianyun.workplan.main.setting.user;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.NavItemViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: UserDetailView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"UserDetailView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UserDetailViewKt {
    public static final void UserDetailView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(739901264);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(UserDetailView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(739901264, i, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView (UserDetailView.kt:44)");
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
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) AppSettingViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        final AppSettingViewModel appSettingViewModel = (AppSettingViewModel) viewModel;
        appSettingViewModel.tryReload();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass1(appSettingViewModel, mutableState, null), composerStartRestartGroup, 70);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = !appSettingViewModel.getFormType().isForm("edit");
        HeaderViewKt.PageView(navHostController, "我的信息", ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1537238413, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1537238413, i2, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous> (UserDetailView.kt:57)");
                    }
                    final AppSettingViewModel appSettingViewModel2 = appSettingViewModel;
                    BoxViewKt.m6888HeaderIcon53ZIcWk(IconFont.refresh, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.2.1
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
                            appSettingViewModel2.refresh();
                        }
                    }, composer2, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -513170485, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-513170485, i2, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous> (UserDetailView.kt:61)");
                    }
                    final AppSettingViewModel appSettingViewModel2 = appSettingViewModel;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -2087228286, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2087228286, i3, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous>.<anonymous> (UserDetailView.kt:62)");
                                }
                                final AppSettingViewModel appSettingViewModel3 = appSettingViewModel2;
                                BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 580116201, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.1.1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(580116201, i4, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous>.<anonymous>.<anonymous> (UserDetailView.kt:63)");
                                            }
                                            float fM6097constructorimpl = Dp.m6097constructorimpl(10);
                                            final AppSettingViewModel appSettingViewModel4 = appSettingViewModel3;
                                            BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, fM6097constructorimpl, ComposableLambdaKt.composableLambda(composer4, 1578842655, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.1.1.1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i5) {
                                                    if ((i5 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1578842655, i5, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailView.kt:64)");
                                                        }
                                                        NavItemViewKt.m6911AppLogoVieworJrPs(Dp.m6097constructorimpl(40), 0, composer5, 6, 2);
                                                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer5, 0, 1);
                                                        AppSettingViewModel appSettingViewModel5 = appSettingViewModel4;
                                                        composer5.startReplaceableGroup(-483455358);
                                                        ComposerKt.sourceInformation(composer5, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer5);
                                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        TextKt.m2471Text4IGK_g(appSettingViewModel5.getLoginUser().getUsername(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(13), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 6, 130038);
                                                        float f2 = 2;
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f2), composer5, 6, 0);
                                                        composer5.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer5, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor2);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer5);
                                                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        PartTitleViewKt.m6915TagViewo4cevVk((String) CommonToolKt.ifv(appSettingViewModel5.isVip(), appSettingViewModel5.getLoginUser().getVipName(), "普通用户"), 0L, false, 0.0f, false, ((Color) CommonToolKt.ifv(appSettingViewModel5.isVip(), Color.m3745boximpl(ColorKt.getVipColor()), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl(), true, null, composer5, 1572864, 158);
                                                        composer5.startReplaceableGroup(1548628320);
                                                        if (appSettingViewModel5.isVip()) {
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f2), composer5, 6, 0);
                                                            PartTitleViewKt.m6915TagViewo4cevVk("有效期：" + appSettingViewModel5.getLoginUser().getVipDate(), 0L, false, 0.0f, false, ColorKt.getVipColor(), true, null, composer5, 1769472, 158);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 3456, 3);
                                            long deleteColor = ColorKt.getDeleteColor();
                                            final AppSettingViewModel appSettingViewModel5 = appSettingViewModel3;
                                            PartTitleViewKt.m6915TagViewo4cevVk("退出登录", 0L, false, 0.0f, true, deleteColor, true, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.1.1.2
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
                                                    appSettingViewModel5.setFormType(new FormType(d.A, null, null, 6, null));
                                                }
                                            }, composer4, 1794054, 14);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 3072, 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    String str = (String) CommonToolKt.ifv(booleanRef.element, "其他信息", "编辑信息");
                    final Ref.BooleanRef booleanRef2 = booleanRef;
                    final AppSettingViewModel appSettingViewModel3 = appSettingViewModel;
                    BoxViewKt.m6891LeadingHintViewRuDwNsA(str, 0.0f, 0L, 0L, ComposableLambdaKt.composableLambda(composer2, -1252201112, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1252201112, i3, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous>.<anonymous> (UserDetailView.kt:86)");
                                }
                                if (booleanRef2.element) {
                                    composer3.startReplaceableGroup(-864784994);
                                    final AppSettingViewModel appSettingViewModel4 = appSettingViewModel3;
                                    BoxViewKt.m6893SmallLinkTextPZHvWI("编辑", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.2.1
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
                                            appSettingViewModel4.setFormType(new FormType("edit", null, null, 6, null));
                                        }
                                    }, composer3, 6, 6);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-864784841);
                                    final AppSettingViewModel appSettingViewModel5 = appSettingViewModel3;
                                    BoxViewKt.m6893SmallLinkTextPZHvWI("取消", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.2.2
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
                                            appSettingViewModel5.setFormType(new FormType("", null, null, 6, null));
                                        }
                                    }, composer3, 6, 6);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, CpioConstants.C_ISBLK, 14);
                    final Ref.BooleanRef booleanRef3 = booleanRef;
                    final AppSettingViewModel appSettingViewModel4 = appSettingViewModel;
                    final MutableState<Long> mutableState2 = mutableState;
                    GroupViewKt.m6851SettingGroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -505418837, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-505418837, i3, -1, "cn.jianyun.workplan.main.setting.user.UserDetailView.<anonymous>.<anonymous> (UserDetailView.kt:98)");
                                }
                                boolean z = booleanRef3.element;
                                String nickname = appSettingViewModel4.getLoginUser().getNickname();
                                final AppSettingViewModel appSettingViewModel5 = appSettingViewModel4;
                                FormItemKt.InputItemView("昵称", z, false, false, null, false, nickname, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.3.1
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
                                        AppSettingViewModel appSettingViewModel6 = appSettingViewModel5;
                                        User loginUser = appSettingViewModel6.getLoginUser();
                                        appSettingViewModel6.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : it, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                                    }
                                }, composer3, 6, 444);
                                boolean z2 = booleanRef3.element;
                                String wechat = appSettingViewModel4.getLoginUser().getWechat();
                                final AppSettingViewModel appSettingViewModel6 = appSettingViewModel4;
                                FormItemKt.InputItemView("微信", z2, false, false, null, false, wechat, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.3.2
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
                                        AppSettingViewModel appSettingViewModel7 = appSettingViewModel6;
                                        User loginUser = appSettingViewModel7.getLoginUser();
                                        appSettingViewModel7.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : it, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                                    }
                                }, composer3, 6, 444);
                                boolean z3 = booleanRef3.element;
                                String qq = appSettingViewModel4.getLoginUser().getQq();
                                final AppSettingViewModel appSettingViewModel7 = appSettingViewModel4;
                                FormItemKt.InputItemView("QQ", z3, false, false, null, false, qq, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.3.3
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
                                        AppSettingViewModel appSettingViewModel8 = appSettingViewModel7;
                                        User loginUser = appSettingViewModel8.getLoginUser();
                                        appSettingViewModel8.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : it, (262143 & 4096) != 0 ? loginUser.city : null, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                                    }
                                }, composer3, 6, 444);
                                boolean z4 = booleanRef3.element;
                                String city = appSettingViewModel4.getLoginUser().getCity();
                                final AppSettingViewModel appSettingViewModel8 = appSettingViewModel4;
                                FormItemKt.InputItemView("城市", z4, false, false, null, false, city, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.3.4
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
                                        AppSettingViewModel appSettingViewModel9 = appSettingViewModel8;
                                        User loginUser = appSettingViewModel9.getLoginUser();
                                        appSettingViewModel9.setLoginUser(loginUser.copy((262143 & 1) != 0 ? loginUser.uuid : null, (262143 & 2) != 0 ? loginUser.username : null, (262143 & 4) != 0 ? loginUser.nickname : null, (262143 & 8) != 0 ? loginUser.email : null, (262143 & 16) != 0 ? loginUser.avatar : null, (262143 & 32) != 0 ? loginUser.gmtCreate : null, (262143 & 64) != 0 ? loginUser.vipName : null, (262143 & 128) != 0 ? loginUser.vipDate : null, (262143 & 256) != 0 ? loginUser.password : null, (262143 & 512) != 0 ? loginUser.confirmPassword : null, (262143 & 1024) != 0 ? loginUser.wechat : null, (262143 & 2048) != 0 ? loginUser.qq : null, (262143 & 4096) != 0 ? loginUser.city : it, (262143 & 8192) != 0 ? loginUser.mobile : null, (262143 & 16384) != 0 ? loginUser.cloudConfig : null, (262143 & 32768) != 0 ? loginUser.application : null, (262143 & 65536) != 0 ? loginUser.platform : null, (262143 & 131072) != 0 ? loginUser.deviceId : null, (262143 & 262144) != 0 ? loginUser.registTime : 0L));
                                    }
                                }, composer3, 6, 444);
                                composer3.startReplaceableGroup(-864783849);
                                composer3.endReplaceableGroup();
                                if (Intrinsics.areEqual(appSettingViewModel4.getLoginUser().getUsername(), "15068790467")) {
                                    String jSONString = JSON.toJSONString(appSettingViewModel4.getBaseRepository().getAppTipInfo(), JSONWriter.Feature.PrettyFormat);
                                    Intrinsics.checkNotNullExpressionValue(jSONString, "toJSONString(viewModel.b…ter.Feature.PrettyFormat)");
                                    TextKt.m2471Text4IGK_g(jSONString, (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131062);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    composer2.startReplaceableGroup(1106949396);
                    if (appSettingViewModel.getFormType().isForm("edit")) {
                        final AppSettingViewModel appSettingViewModel5 = appSettingViewModel;
                        ButtonViewKt.LongOkButton("保存", new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.4
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
                                appSettingViewModel5.doUpdateInfo();
                            }
                        }, composer2, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    BoxViewKt.m6894SmallTipTextEx1dzz4("登录账号仅用于记录用户付费状态，如果需要对数据进行云备份，请自行绑定第三方云备份账号", 0L, 0.0f, 0.0f, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.5
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }, composer2, 196614, 30);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    final AppSettingViewModel appSettingViewModel6 = appSettingViewModel;
                    ButtonViewKt.m6815LongCancelButtonvHmCa5Y("我要注销账号", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.6
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
                            appSettingViewModel6.setFormType(new FormType("logOut", null, null, 6, null));
                        }
                    }, composer2, 6, 6);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                    composer2.startReplaceableGroup(1106949799);
                    if (appSettingViewModel.getFormType().isForm(d.A)) {
                        final AppSettingViewModel appSettingViewModel7 = appSettingViewModel;
                        final NavHostController navHostController2 = navHostController;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.7
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
                                appSettingViewModel7.doExit(navHostController2);
                            }
                        };
                        final AppSettingViewModel appSettingViewModel8 = appSettingViewModel;
                        DialogViewKt.ConfirmDialog("退出登录会导致当前设备的会员身份丢失喔，请问还要继续退出吗？", null, null, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.8
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
                                appSettingViewModel8.reset();
                            }
                        }, composer2, 6, 6);
                    }
                    composer2.endReplaceableGroup();
                    if (appSettingViewModel.getFormType().isForm("logOut")) {
                        int iM5805getPasswordPjHm6EE = KeyboardType.INSTANCE.m5805getPasswordPjHm6EE();
                        final AppSettingViewModel appSettingViewModel9 = appSettingViewModel;
                        final NavHostController navHostController3 = navHostController;
                        Function1<String, Boolean> function1 = new Function1<String, Boolean>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                appSettingViewModel9.doLogOut(navHostController3, it);
                                return false;
                            }
                        };
                        final AppSettingViewModel appSettingViewModel10 = appSettingViewModel;
                        FormItemKt.m6845ShowInputDialogJDHDdL8("", "提示:请输入账号密码来确认你身份，注销账号，意味之前购买的会员也会随之失效，但您本地的排班数据，我们不会删除，仅做账号注销喔！", false, 0, 0, null, iM5805getPasswordPjHm6EE, 0.0f, null, false, null, function1, new Function0<Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.3.10
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
                                appSettingViewModel10.reset();
                            }
                        }, composer2, 806879670, 0, 1464);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 25016, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.main.setting.user.UserDetailViewKt.UserDetailView.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                UserDetailViewKt.UserDetailView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long UserDetailView$lambda$1(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailView$lambda$2(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.main.setting.user.UserDetailViewKt$UserDetailView$1, reason: invalid class name */
    /* JADX INFO: compiled from: UserDetailView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.main.setting.user.UserDetailViewKt$UserDetailView$1", f = "UserDetailView.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Long> $localRegistTime$delegate;
        final /* synthetic */ AppSettingViewModel $viewModel;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppSettingViewModel appSettingViewModel, MutableState<Long> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewModel = appSettingViewModel;
            this.$localRegistTime$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$viewModel, this.$localRegistTime$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableState<Long> mutableState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState<Long> mutableState2 = this.$localRegistTime$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                Object localRegistTime = this.$viewModel.getBaseRepository().getLocalRegistTime(this);
                if (localRegistTime == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                obj = localRegistTime;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            UserDetailViewKt.UserDetailView$lambda$2(mutableState, ((Number) obj).longValue());
            return Unit.INSTANCE;
        }
    }
}