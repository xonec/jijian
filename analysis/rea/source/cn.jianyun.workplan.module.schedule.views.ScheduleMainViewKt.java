package cn.jianyun.workplan.module.schedule.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.core.app.NotificationCompat;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.MainActivity;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt;
import cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt;
import cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt;
import cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanManageViewKt;
import cn.jianyun.workplan.module.schedule.views.setting.ScheduleSettingViewKt;
import cn.jianyun.workplan.module.schedule.views.stat.ScheduleStatViewKt;
import cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkManageViewKt;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.NavItemViewKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.alipay.sdk.m.w.a;
import com.byazt.bry.TTDownloadField;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScheduleMainView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScheduleMainView", "", "navHostController", "Landroidx/navigation/NavHostController;", TTDownloadField.TT_ACTIVITY, "Lcn/jianyun/workplan/main/MainActivity;", "(Landroidx/navigation/NavHostController;Lcn/jianyun/workplan/main/MainActivity;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleMainViewKt {
    /* JADX WARN: Type inference failed for: r4v14, types: [T, androidx.lifecycle.ViewModel] */
    public static final void ScheduleMainView(final NavHostController navHostController, final MainActivity activity, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(-148651579);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleMainView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-148651579, i, -1, "cn.jianyun.workplan.module.schedule.views.ScheduleMainView (ScheduleMainView.kt:42)");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) ScheduleMasterViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        ScaffoldKt.m2126ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -564228844, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt.ScheduleMainView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues it, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564228844, i2, -1, "cn.jianyun.workplan.module.schedule.views.ScheduleMainView.<anonymous> (ScheduleMainView.kt:46)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                    NavHostController navHostController2 = navHostController;
                    MainActivity mainActivity = activity;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer2, 6);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(PaddingKt.m569paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(6), 0.0f, 2, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1593293184);
                    if (objectRef2.element.isHomePage()) {
                        ScheduleHomeViewKt.ScheduleHomeView(navHostController2, composer2, 8);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1593293065);
                    if (objectRef2.element.isSettingPage()) {
                        ScheduleSettingViewKt.ScheduleSettingView(navHostController2, mainActivity, composer2, 72);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1593292929);
                    if (objectRef2.element.isWorkPage()) {
                        HeaderViewKt.SelfHeaderView(null, null, ComposableLambdaKt.composableLambda(composer2, 519239160, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$1$1
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
                                        ComposerKt.traceEventStart(519239160, i3, -1, "cn.jianyun.workplan.module.schedule.views.ScheduleMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleMainView.kt:63)");
                                    }
                                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef3 = objectRef2;
                                    BoxViewKt.m6876CenterRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -2103324767, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                    ComposerKt.traceEventStart(-2103324767, i4, -1, "cn.jianyun.workplan.module.schedule.views.ScheduleMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleMainView.kt:64)");
                                                }
                                                String type = objectRef3.element.getFormType().getType();
                                                List<SelectDO> listInitValues = SelectUtil.initValues("班次", "work", "轮班", "plan");
                                                Intrinsics.checkNotNullExpressionValue(listInitValues, "initValues(\"班次\",\"work\", \"轮班\", \"plan\")");
                                                final Ref.ObjectRef<ScheduleMasterViewModel> objectRef4 = objectRef3;
                                                FormItemKt.m6844SegmentPickerViewJkgoBcI(type, 0.0f, listInitValues, 0.0f, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt.ScheduleMainView.1.1.1.1.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                                        invoke2(str);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(String it2) {
                                                        Intrinsics.checkNotNullParameter(it2, "it");
                                                        objectRef4.element.setFormType(FormType.copy$default(objectRef4.element.getFormType(), it2, null, null, 6, null));
                                                    }
                                                }, composer4, 512, 10);
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
                        }), composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 3);
                        if (objectRef2.element.getFormType().isForm("work")) {
                            composer2.startReplaceableGroup(-1593292409);
                            ScheduleWorkManageViewKt.ScheduleWorkManageView(navHostController2, composer2, 8);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1593292295);
                            SchedulePlanManageViewKt.SchedulePlanManageView(navHostController2, composer2, 8);
                            composer2.endReplaceableGroup();
                        }
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1593292154);
                    if (objectRef2.element.isAlarmPage()) {
                        ScheduleAlarmManageViewKt.ScheduleAlarmManageView(navHostController2, composer2, 8);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(193501028);
                    if (objectRef2.element.isStatPage()) {
                        ScheduleStatViewKt.ScheduleStatView(composer2, 0);
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM214backgroundbw27NRU$default2 = BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    NavItemViewKt.NavItemView("排班", IconFont.home, objectRef2.element.isHomePage(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$2$1
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
                            Object obj = null;
                            String str = null;
                            int i3 = 6;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            objectRef2.element.setPageType(new FormType("home", obj, str, i3, defaultConstructorMarker));
                            objectRef2.element.setFormType(new FormType(DavPrincipal.KEY_SELF, obj, str, i3, defaultConstructorMarker));
                        }
                    }, composer2, 54, 0);
                    NavItemViewKt.NavItemView("班次", IconFont.sun, objectRef2.element.isWorkPage(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$2$2
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
                            Object obj = null;
                            String str = null;
                            int i3 = 6;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            objectRef2.element.setPageType(new FormType("work", obj, str, i3, defaultConstructorMarker));
                            objectRef2.element.setFormType(new FormType("work", obj, str, i3, defaultConstructorMarker));
                        }
                    }, composer2, 54, 0);
                    NavItemViewKt.NavItemView("提醒", IconFont.alarm, objectRef2.element.isAlarmPage(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$2$3
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
                            objectRef2.element.setPageType(new FormType(NotificationCompat.CATEGORY_ALARM, null, null, 6, null));
                        }
                    }, composer2, 54, 0);
                    NavItemViewKt.NavItemView("统计", IconFont.stat, objectRef2.element.isStatPage(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$2$4
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
                            objectRef2.element.setPageType(new FormType("stat", null, null, 6, null));
                        }
                    }, composer2, 54, 0);
                    NavItemViewKt.NavItemView("我的", IconFont.user, objectRef2.element.isSettingPage(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$2$5
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
                            objectRef2.element.setPageType(new FormType(a.x, null, null, 6, null));
                        }
                    }, composer2, 54, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(193502477);
                    if (objectRef2.element.getHomeEdit()) {
                        ScheduleOperViewKt.ScheduleOperView(navHostController2, objectRef2.element, composer2, 72);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(667500650);
                    if (objectRef2.element.getFormType().isForm("upgrade")) {
                        if (!objectRef2.element.getBaseRepository().isNetworkAvailable()) {
                            composer2.startReplaceableGroup(193502713);
                            DialogViewKt.TipDialog("网络断开", "您当前APP网络已断开，可能会影响正常使用, 快去开启手机网络吧!", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$3
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
                                    if (objectRef2.element.getBaseRepository().isNetworkAvailable()) {
                                        objectRef2.element.setFormType(new FormType(null, null, null, 7, null));
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef2.element), null, null, new AnonymousClass1(objectRef2, null), 3, null);
                                    } else {
                                        objectRef2.element.getBaseRepository().toast("快去开启手机网络吧");
                                    }
                                }

                                /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$3$1, reason: invalid class name */
                                /* JADX INFO: compiled from: ScheduleMainView.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$3$1", f = "ScheduleMainView.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Ref.ObjectRef<ScheduleMasterViewModel> $viewModel;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Ref.ObjectRef<ScheduleMasterViewModel> objectRef, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$viewModel = objectRef;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$viewModel, continuation);
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
                                            obj = this.$viewModel.element.getBaseRepository().tryUpgrade(this);
                                            if (obj == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        if (((Boolean) obj).booleanValue()) {
                                            this.$viewModel.element.setFormType(new FormType("upgrade", null, null, 6, null));
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer2, 54, 0);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(193503491);
                            DialogViewKt.TipDialog("升级提醒", "您当前版本过低，请前往手机应用市场升级", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt$ScheduleMainView$1$1$4
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
                                    objectRef2.element.getBaseRepository().toast("快去应用市场更新吧");
                                }
                            }, composer2, 54, 0);
                            composer2.endReplaceableGroup();
                        }
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 805306368, 511);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.ScheduleMainViewKt.ScheduleMainView.2
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
                ScheduleMainViewKt.ScheduleMainView(navHostController, activity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}