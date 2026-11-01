package cn.jianyun.workplan.module.schedule.views.main;

import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt;
import cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt;
import cn.jianyun.workplan.ui.graph.model.PieGraphItem;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScheduleHomeView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"BottomWorkChoose1View", "", "viewModel", "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;", "(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Landroidx/compose/runtime/Composer;I)V", "BottomWorkChoose2View", "ScheduleHomeView", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleHomeViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, androidx.lifecycle.ViewModel] */
    public static final void ScheduleHomeView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        String str;
        int i2;
        boolean z;
        int i3;
        final NavHostController navHostController2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1758581624);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleHomeView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1758581624, i, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView (ScheduleHomeView.kt:59)");
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
        BaseViewModel.tryReload$default((BaseViewModel) objectRef.element, null, 1, null);
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        float f2 = ((Configuration) objConsume).fontScale;
        final long sp = (f2 > 1.15f ? 1 : (f2 == 1.15f ? 0 : -1)) > 0 ? TextUnitKt.getSp(14.0f / RangesKt.coerceAtLeast(f2, 1.0f)) : TextUnitKt.getSp(16);
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
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(48)), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        MonthChooseViewKt.m6910MonthChooseViewWxQOpUA(((ScheduleMasterViewModel) objectRef.element).getCurrentDateStr(), null, TextUnitKt.getSp(18), false, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                objectRef.element.setCurrentDate(CommonDateToolKt.parseDate(it));
                objectRef.element.doChange();
            }
        }, composerStartRestartGroup, 3456, 2);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
        Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(692496968);
        if (((ScheduleMasterViewModel) objectRef.element).getBaseRepository().getAppTipInfo().getShowPurchase() && !((ScheduleMasterViewModel) objectRef.element).getBaseRepository().isAdVip()) {
            CommonUIKt.m6951SmallButtonPLvOf0("去广告", 0L, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$1$2$1
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
                    CommonUIKt.toVipPage(navHostController);
                }
            }, composerStartRestartGroup, 6, 6);
            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(5), composerStartRestartGroup, 6, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BoxViewKt.m6888HeaderIcon53ZIcWk(62361, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$1$2$2
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
                objectRef.element.setFormType(new FormType("chooseProject", null, null, 6, null));
            }
        }, composerStartRestartGroup, 6, 6);
        BoxViewKt.m6888HeaderIcon53ZIcWk(IconFont.settings, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$1$2$3
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
                objectRef.element.setFormType(new FormType("config", null, null, 6, null));
            }
        }, composerStartRestartGroup, 6, 6);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM571paddingqDBjuR0$default = PaddingKt.m571paddingqDBjuR0$default(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(80), 7, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM571paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1712055016);
        if (((ScheduleMasterViewModel) objectRef.element).getBaseRepository().getAppTipInfo().isShow() && ((ScheduleMasterViewModel) objectRef.element).getBaseRepository().getShowTip()) {
            str = "C92@4661L9:Row.kt#2w3rfo";
            i2 = -1323940314;
            GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$1
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
                    String newPage = objectRef.element.getBaseRepository().getAppTipInfo().getNewPage();
                    if (Intrinsics.areEqual(newPage, "web") && !Intrinsics.areEqual(objectRef.element.getBaseRepository().getAppTipInfo().getUrl(), "")) {
                        objectRef.element.getBaseRepository().openUrl(objectRef.element.getBaseRepository().getAppTipInfo().getUrl());
                    } else if (Intrinsics.areEqual(newPage, "purchase")) {
                        CommonUIKt.toVipPage(navHostController);
                    }
                }
            }, 7, null), false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -841921456, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(-841921456, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:106)");
                        }
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m2471Text4IGK_g("温馨提示:" + objectRef2.element.getBaseRepository().getAppTipInfo().getMessage(), PaddingKt.m571paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(10), 0.0f, 11, null), objectRef2.element.getBaseRepository().getAppTipInfo().m6669showColor0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 131056);
                        TextKt.m2471Text4IGK_g("×", ButtonViewKt.tap(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$2$1$1
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
                                objectRef2.element.getBaseRepository().getAppTipInfo().setShow(false);
                                objectRef2.element.getBaseRepository().setShowTip(false);
                                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(objectRef2.element), null, null, new AnonymousClass1(objectRef2, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$2$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: ScheduleHomeView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$2$1$1$1", f = "ScheduleHomeView.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
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
                                        if (this.$viewModel.element.getBaseRepository().cacheBoolean(this.$viewModel.element.getBaseRepository().getAppTipInfo().uid(), true, this) == coroutine_suspended) {
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
                        }), Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3462, 0, 131056);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 100663296, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
        } else {
            str = "C92@4661L9:Row.kt#2w3rfo";
            i2 = -1323940314;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712056707);
        if (!((ScheduleMasterViewModel) objectRef.element).getConfig().getShowStat()) {
            z = true;
        } else if (((ScheduleMasterViewModel) objectRef.element).getPieData().getDatalist().size() > 0) {
            composerStartRestartGroup.startReplaceableGroup(1712056795);
            z = true;
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(i2);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierHorizontalScroll$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, str);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1712056935);
            for (final PieGraphItem pieGraphItem : ((ScheduleMasterViewModel) objectRef.element).getPieData().getDatalist()) {
                BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2114596499, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$3$1$1
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
                                ComposerKt.traceEventStart(2114596499, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:134)");
                            }
                            float f3 = 10;
                            BoxViewKt.m6874BoxView536wdKU(null, 0L, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f3), CommonToolKt.color(pieGraphItem.getColor()), Dp.m6097constructorimpl(4), composer3, 200064, 3);
                            TextKt.m2471Text4IGK_g(pieGraphItem.getName() + "(" + pieGraphItem.getValue() + ")", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(8), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 6, 130038);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 3072, 7);
                CommonUIKt.m6944BlankkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            z = true;
            composerStartRestartGroup.startReplaceableGroup(1712057535);
            BoxViewKt.m6894SmallTipTextEx1dzz4("当前月份没有设置排班", 0L, 0.0f, 0.0f, null, null, composerStartRestartGroup, 6, 62);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712057636);
        if (((ScheduleMasterViewModel) objectRef.element).getShowConfigHint()) {
            GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$4
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
                    objectRef.element.setFormType(new FormType("config", null, null, 6, null));
                }
            }, 7, null), false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1040244536, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(-1040244536, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:155)");
                        }
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3285constructorimpl6 = Updater.m3285constructorimpl(composer3);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m2471Text4IGK_g("温馨提示:点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项", PaddingKt.m571paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(10), 0.0f, 11, null), MaterialTheme.INSTANCE.getColorScheme(composer3, 0 | MaterialTheme.$stable).getTertiary(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3126, 0, 131056);
                        TextKt.m2471Text4IGK_g("×", ButtonViewKt.tap(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$5$1$1
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
                                objectRef2.element.closeConfigHint();
                            }
                        }), Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3462, 0, 131056);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 100663296, MediaPlayer.MEDIA_PLAYER_ADAPTIVE_WORK_AROUND_MODE);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ScheduleCalendarViewKt.ScheduleCalendarView((ScheduleMasterViewModel) objectRef.element, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(1712058575);
        if (((ScheduleMasterViewModel) objectRef.element).fetchDuty().isEmpty()) {
            i3 = 5;
        } else {
            i3 = 5;
            GroupViewKt.m6849GroupTitleViewKLGhzwk(CommonDateToolKt.dateStr(((ScheduleMasterViewModel) objectRef.element).getCurrentDate()) + "班次", Dp.m6097constructorimpl(5), 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 931391784, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(931391784, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:175)");
                        }
                        float fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                        BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer3, 412272479, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$6.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                if ((i5 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(412272479, i5, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:176)");
                                    }
                                    ScheduleWork scheduleWorkFetchDutyWork = objectRef2.element.fetchDutyWork(objectRef2.element.getCurrentDate());
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef3 = objectRef2;
                                    WorkItemViewKt.m6758WholeWorkItemViewvz2T9sI(scheduleWorkFetchDutyWork, null, 0.0f, 0.0f, ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.ScheduleHomeView.1.2.6.1.1
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
                                            if (!Intrinsics.areEqual(objectRef3.element.fetchSecondDutyWork(objectRef3.element.getCurrentDate()).getName(), "")) {
                                                objectRef3.element.setFormType(new FormType("chooseFirstWork", null, null, 6, null));
                                            } else {
                                                ScheduleMasterViewModel.makeEdit$default(objectRef3.element, false, 1, null);
                                            }
                                        }
                                    }, 7, null), composer4, 8, 14);
                                    if (!Intrinsics.areEqual(objectRef2.element.fetchSecondDutyWork(objectRef2.element.getCurrentDate()).getName(), "")) {
                                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, 0, 1);
                                        ScheduleWork scheduleWorkFetchSecondDutyWork = objectRef2.element.fetchSecondDutyWork(objectRef2.element.getCurrentDate());
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef4 = objectRef2;
                                        WorkItemViewKt.m6758WholeWorkItemViewvz2T9sI(scheduleWorkFetchSecondDutyWork, null, 0.0f, 0.0f, ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.ScheduleHomeView.1.2.6.1.2
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
                                                objectRef4.element.setFormType(new FormType("chooseSecondWork", null, null, 6, null));
                                            }
                                        }, 7, null), composer4, 8, 14);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 3120, 5);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 196656, 28);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712059839);
        if (!Intrinsics.areEqual(((ScheduleMasterViewModel) objectRef.element).fetchDuty().getRemark(), "")) {
            GroupViewKt.m6849GroupTitleViewKLGhzwk(CommonDateToolKt.dateStr(((ScheduleMasterViewModel) objectRef.element).getCurrentDate()) + "备注", Dp.m6097constructorimpl(i3), 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1548088023, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(-1548088023, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:199)");
                        }
                        float fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                        BoxViewKt.m6876CenterRowdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer3, -2067207328, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$7.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                if ((i5 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2067207328, i5, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:200)");
                                    }
                                    String remark = objectRef2.element.fetchDuty().getRemark();
                                    final Ref.ObjectRef<ScheduleMasterViewModel> objectRef3 = objectRef2;
                                    BoxViewKt.m6894SmallTipTextEx1dzz4(remark, 0L, 0.0f, 0.0f, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.ScheduleHomeView.1.2.7.1.1
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
                                            objectRef3.element.setFormType(new FormType("showRemark", null, null, 6, null));
                                        }
                                    }, composer4, 0, 30);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 3120, 5);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 196656, 28);
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (((ScheduleMasterViewModel) objectRef.element).fetchDuty().isAdd()) {
            composerStartRestartGroup.startReplaceableGroup(1712060300);
            ButtonViewKt.m6815LongCancelButtonvHmCa5Y((String) CommonToolKt.ifv(((ScheduleMasterViewModel) objectRef.element).getHomeEdit(), "完成排班", "开启排班"), 0.0f, sp, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$8
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
                    objectRef.element.makeEdit(true);
                }
            }, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1712060528);
            BoxViewKt.m6876CenterRowdjqsMU(null, Dp.m6097constructorimpl(i3), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -923961734, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            ComposerKt.traceEventStart(-923961734, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeView.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:215)");
                        }
                        long j = sp;
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef2 = objectRef;
                        ButtonViewKt.m6813CancelButtonvHmCa5Y("设置备注", null, j, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$9.1
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
                                objectRef2.element.setFormType(new FormType("showRemark", null, null, 6, null));
                            }
                        }, composer3, 6, 2);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                        String str2 = (String) CommonToolKt.ifv(objectRef.element.getHomeEdit(), "完成排班", "开启排班");
                        long j2 = sp;
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef3 = objectRef;
                        ButtonViewKt.m6813CancelButtonvHmCa5Y(str2, null, j2, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$9.2
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
                                objectRef3.element.makeEdit(true);
                            }
                        }, composer3, 0, 2);
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                        long j3 = sp;
                        final Ref.ObjectRef<ScheduleMasterViewModel> objectRef4 = objectRef;
                        ButtonViewKt.m6813CancelButtonvHmCa5Y("第二班次", null, j3, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$9.3
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
                                objectRef4.element.setFormType(new FormType("chooseSecondWork", null, null, 6, null));
                            }
                        }, composer3, 6, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3120, 5);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.startReplaceableGroup(1712061210);
        if (((ScheduleMasterViewModel) objectRef.element).getFormType().isForm("config")) {
            ScheduleConfigViewKt.BottomScheduleConfigView(new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$10
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
                    objectRef.element.resetForm();
                }
            }, composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712061383);
        if (((ScheduleMasterViewModel) objectRef.element).getFormType().isForm("chooseProject")) {
            navHostController2 = navHostController;
            BottomProjectChooseViewKt.BottomProjectChooseView(navHostController2, (ScheduleMasterViewModel) objectRef.element, composerStartRestartGroup, 72);
        } else {
            navHostController2 = navHostController;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712061530);
        if (((ScheduleMasterViewModel) objectRef.element).getFormType().isForm("chooseFirstWork")) {
            BottomWorkChoose1View((ScheduleMasterViewModel) objectRef.element, composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1712061658);
        if (((ScheduleMasterViewModel) objectRef.element).getFormType().isForm("chooseSecondWork")) {
            BottomWorkChoose2View((ScheduleMasterViewModel) objectRef.element, composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(830720442);
        if (((ScheduleMasterViewModel) objectRef.element).getFormType().isForm("showRemark")) {
            String remark = ((ScheduleMasterViewModel) objectRef.element).fetchDuty().getRemark();
            Function1<String, Boolean> function1 = new Function1<String, Boolean>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(objectRef.element.setRemark(it));
                }
            };
            Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt$ScheduleHomeView$1$2$12
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
                    objectRef.element.resetForm();
                }
            };
            composer2 = composerStartRestartGroup;
            FormItemKt.m6845ShowInputDialogJDHDdL8(remark, null, false, 0, 0, null, 0, 0.0f, null, true, null, function1, function0, composer2, 805306368, 0, 1534);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.ScheduleHomeView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                ScheduleHomeViewKt.ScheduleHomeView(navHostController2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, cn.jianyun.workplan.module.schedule.model.ScheduleDuty] */
    public static final void BottomWorkChoose1View(final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1590704856);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomWorkChoose1View)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1590704856, i, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View (ScheduleHomeView.kt:267)");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = viewModel.fetchDuty();
        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择第一班次", true, null, null, false, Dp.m6097constructorimpl(500), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.1
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
                viewModel.resetForm();
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1871857476, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2
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
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1871857476, i2, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View.<anonymous> (ScheduleHomeView.kt:272)");
                }
                List<ScheduleWork> works = viewModel.getWorks();
                Ref.ObjectRef<ScheduleDuty> objectRef2 = objectRef;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = works.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ScheduleWork scheduleWork = (ScheduleWork) next;
                    if ((scheduleWork.getComplex() || Intrinsics.areEqual(scheduleWork.getUuid(), objectRef2.element.getSecondWorkUuid())) ? false : true) {
                        arrayList.add(next);
                    }
                }
                final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                HeaderViewKt.m6902ListDataViewosbwsH8(arrayList, null, 0.0f, false, null, ComposableLambdaKt.composableLambda(composer2, -40650875, true, new Function3<ScheduleWork, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2.2
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ScheduleWork scheduleWork2, Composer composer3, Integer num) {
                        invoke(scheduleWork2, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final ScheduleWork it2, Composer composer3, int i3) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-40650875, i3, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View.<anonymous>.<anonymous> (ScheduleHomeView.kt:273)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        final ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                        GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(companion, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2.2.1
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
                                scheduleMasterViewModel2.setFirstWork(it2);
                            }
                        }, 7, null), true, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1344605908, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2.2.2
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
                                        ComposerKt.traceEventStart(1344605908, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:276)");
                                    }
                                    float fM6097constructorimpl = Dp.m6097constructorimpl(15);
                                    final ScheduleWork scheduleWork2 = it2;
                                    BoxViewKt.m6895TwoColumnViewdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer4, -2022812403, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2.2.2.1
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
                                                    ComposerKt.traceEventStart(-2022812403, i5, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:277)");
                                                }
                                                final ScheduleWork scheduleWork3 = scheduleWork2;
                                                BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer5, 653328919, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.2.2.2.1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i6) {
                                                        if ((i6 & 11) != 2 || !composer6.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(653328919, i6, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose1View.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:278)");
                                                            }
                                                            TextKt.m2471Text4IGK_g(scheduleWork3.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer6, 0, 1);
                                                            TextKt.m2471Text4IGK_g(scheduleWork3.fetchShownTime(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer6.skipToGroupEnd();
                                                    }
                                                }), composer5, 3072, 7);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 3120, 5);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 100663344, MediaPlayer.MEDIA_PLAYER_OPTION_HW_DEC_DROP_NON_REF);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 196616, 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 12779574, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose1View.3
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
                ScheduleHomeViewKt.BottomWorkChoose1View(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.List] */
    public static final void BottomWorkChoose2View(final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-508896569);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomWorkChoose2View)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-508896569, i, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View (ScheduleHomeView.kt:290)");
        }
        ScheduleDuty scheduleDutyFetchDuty = viewModel.fetchDuty();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List<ScheduleWork> works = viewModel.getWorks();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = works.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ScheduleWork scheduleWork = (ScheduleWork) next;
            if ((scheduleWork.getComplex() || Intrinsics.areEqual(scheduleWork.getUuid(), scheduleDutyFetchDuty.getWorkUuid())) ? false : true) {
                arrayList.add(next);
            }
        }
        objectRef.element = CollectionsKt.toMutableList((Collection) arrayList);
        ((List) objectRef.element).add(new ScheduleWork("", "取消第二班次", null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048572, null));
        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择第二班次", true, null, null, false, Dp.m6097constructorimpl(500), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.1
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
                viewModel.resetForm();
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -790049189, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2
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
                        ComposerKt.traceEventStart(-790049189, i2, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View.<anonymous> (ScheduleHomeView.kt:299)");
                    }
                    List<ScheduleWork> list = objectRef.element;
                    final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                    HeaderViewKt.m6902ListDataViewosbwsH8(list, null, 0.0f, false, null, ComposableLambdaKt.composableLambda(composer2, 1041157412, true, new Function3<ScheduleWork, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2.1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ScheduleWork scheduleWork2, Composer composer3, Integer num) {
                            invoke(scheduleWork2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final ScheduleWork it2, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1041157412, i3, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View.<anonymous>.<anonymous> (ScheduleHomeView.kt:300)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            final ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                            GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(companion, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2.1.1
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
                                    scheduleMasterViewModel2.setSecondWork(it2);
                                }
                            }, 7, null), true, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1868553101, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2.1.2
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
                                            ComposerKt.traceEventStart(-1868553101, i4, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:303)");
                                        }
                                        float fM6097constructorimpl = Dp.m6097constructorimpl(15);
                                        final ScheduleWork scheduleWork2 = it2;
                                        BoxViewKt.m6895TwoColumnViewdjqsMU(null, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer4, -941004116, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2.1.2.1
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
                                                        ComposerKt.traceEventStart(-941004116, i5, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:304)");
                                                    }
                                                    final ScheduleWork scheduleWork3 = scheduleWork2;
                                                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer5, 1735137206, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.2.1.2.1.1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i6) {
                                                            if ((i6 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1735137206, i6, -1, "cn.jianyun.workplan.module.schedule.views.main.BottomWorkChoose2View.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleHomeView.kt:305)");
                                                                }
                                                                TextKt.m2471Text4IGK_g(scheduleWork3.getName(), (Modifier) null, ((Color) CommonToolKt.ifv(scheduleWork3.isAdd(), Color.m3745boximpl(ColorKt.getDeleteColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131066);
                                                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer6, 0, 1);
                                                                TextKt.m2471Text4IGK_g(scheduleWork3.fetchShownTime(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 3072, 7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 3120, 5);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 100663344, MediaPlayer.MEDIA_PLAYER_OPTION_HW_DEC_DROP_NON_REF);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 196616, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12779574, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleHomeViewKt.BottomWorkChoose2View.3
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
                ScheduleHomeViewKt.BottomWorkChoose2View(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}