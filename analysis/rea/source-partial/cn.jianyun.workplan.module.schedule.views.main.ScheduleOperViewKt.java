package cn.jianyun.workplan.module.schedule.views.main;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.os.BundleKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.RouterKt;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.route.ScheduleRouter;
import cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.thegrizzlylabs.sardineandroid.DavPrincipal;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ScheduleOperView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScheduleOperView", "", "navHostController", "Landroidx/navigation/NavHostController;", "viewModel", "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;", "(Landroidx/navigation/NavHostController;Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleOperViewKt {
    public static final void ScheduleOperView(final NavHostController navHostController, final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(2002106331);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleOperView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2002106331, i, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleOperView (ScheduleOperView.kt:55)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        float f2 = ((Configuration) objConsume).fontScale;
        boolean z = f2 > 1.15f;
        long sp = z ? TextUnitKt.getSp(12.0f / RangesKt.coerceAtLeast(f2, 1.0f)) : TextUnitKt.getSp(14);
        final long sp2 = z ? TextUnitKt.getSp(14.0f / RangesKt.coerceAtLeast(f2, 1.0f)) : TextUnitKt.getSp(16);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
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
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final long j = sp;
        BottomSheetDialogViewKt.BottomSheetDialog(null, true, false, false, false, false, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1640963883, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2
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
                String str;
                String str2;
                String str3;
                Modifier modifier;
                int i3;
                Composer composer3;
                float f3;
                int i4;
                int i5;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1640963883, i2, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleOperView.<anonymous>.<anonymous> (ScheduleOperView.kt:62)");
                    }
                    Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null), 0.0f, 1, null), ((Dp) CommonToolKt.ifv(viewModel.getFormType().isForm(DavPrincipal.KEY_SELF), Dp.m6095boximpl(Dp.m6097constructorimpl(200)), Dp.m6095boximpl(Dp.m6097constructorimpl(300)))).m6111unboximpl());
                    final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                    long j2 = j;
                    long j3 = sp2;
                    final NavHostController navHostController2 = navHostController;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM602height3ABfNKs);
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
                    float f4 = 10;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4)), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    float f5 = 2;
                    float f6 = 1;
                    String str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    TextKt.m2471Text4IGK_g("自定义排班", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$1$1
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
                            scheduleMasterViewModel.setFormType(new FormType(DavPrincipal.KEY_SELF, null, null, 6, null));
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), CommonToolKt.focusColor(scheduleMasterViewModel.getFormType().isForm(DavPrincipal.KEY_SELF), null, composer2, 0, 2), j2, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6017getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 3504, 116688);
                    TextKt.m2471Text4IGK_g("周期轮班", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$1$2
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
                            scheduleMasterViewModel.setFormType(new FormType("plan", null, null, 6, null));
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), CommonToolKt.focusColor(scheduleMasterViewModel.getFormType().isForm("plan"), null, composer2, 0, 2), j2, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6017getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 3504, 116688);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, str4);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    TextKt.m2471Text4IGK_g("清除", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$2$1
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
                            scheduleMasterViewModel.removeCurrentDay();
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), ColorKt.getDeleteColor(), j3, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196998, 0, 131024);
                    TextKt.m2471Text4IGK_g("上一天", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$2$2
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
                            scheduleMasterViewModel.goDay(-1);
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), ColorKt.getPrimaryColor(), j3, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196998, 0, 131024);
                    TextKt.m2471Text4IGK_g("下一天", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$2$3
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
                            scheduleMasterViewModel.goDay(1);
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), ColorKt.getPrimaryColor(), j3, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196998, 0, 131024);
                    TextKt.m2471Text4IGK_g("关闭", PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$1$2$4
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
                            scheduleMasterViewModel.finish();
                        }
                    }, 7, null), Dp.m6097constructorimpl(f5), Dp.m6097constructorimpl(f6)), ColorKt.getPrimaryColor(), j3, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196998, 0, 131024);
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
                    composer2.startReplaceableGroup(1555081982);
                    int i6 = 8;
                    if (scheduleMasterViewModel.getFormType().isForm(DavPrincipal.KEY_SELF)) {
                        int i7 = 2;
                        Modifier modifier2 = null;
                        boolean z2 = false;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6097constructorimpl(f4), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        composer2.startReplaceableGroup(-483455358);
                        String str5 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                        ComposerKt.sourceInformation(composer2, str5);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, str4);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl6 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        String str6 = "C79@3979L9:Column.kt#2w3rfo";
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, str6);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1098475987);
                        ComposerKt.sourceInformation(composer2, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, str4);
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor7);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl7 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl7, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            composerM3285constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            composerM3285constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                        }
                        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                        FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(411806522);
                        for (final ScheduleWork scheduleWork : scheduleMasterViewModel.getWorks()) {
                            WorkItemViewKt.m6759WorkItemViewKBW6s6s(scheduleWork, false, false, null, null, null, Size.normal, Dp.m6097constructorimpl(f4), Dp.m6097constructorimpl(i6), ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$2$1$1$1
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
                                    if (scheduleMasterViewModel.getAdding()) {
                                        scheduleMasterViewModel.toast("不要太着急了");
                                    } else {
                                        scheduleMasterViewModel.makeDuty(scheduleWork);
                                    }
                                }
                            }, 7, null), composer2, 114819080, 62);
                            modifier2 = modifier2;
                            i7 = i7;
                            str4 = str4;
                            str6 = str6;
                            str5 = str5;
                            z2 = false;
                            i6 = 8;
                        }
                        str = str4;
                        str3 = str6;
                        str2 = str5;
                        i3 = i7;
                        modifier = modifier2;
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
                    } else {
                        str = str4;
                        str2 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                        str3 = "C79@3979L9:Column.kt#2w3rfo";
                        modifier = null;
                        i3 = 2;
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1063205421);
                    if (scheduleMasterViewModel.getFormType().isForm("plan")) {
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6097constructorimpl(f4), 0.0f, i3, modifier), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, str2);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, str);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor8);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl8 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl8, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            composerM3285constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            composerM3285constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, str3);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        if (scheduleMasterViewModel.getPlans().isEmpty()) {
                            composer2.startReplaceableGroup(411807384);
                            BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("你还没有设置周期排班喔", 0, 0L, 0L, null, composer2, 6, 30);
                            composer2.endReplaceableGroup();
                            i4 = 1;
                            f3 = 0.0f;
                            composer3 = composer2;
                            i5 = 0;
                        } else {
                            composer2.startReplaceableGroup(411807509);
                            composer2.startReplaceableGroup(411807555);
                            int i8 = 0;
                            for (Object obj : scheduleMasterViewModel.getPlans()) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final SchedulePlan schedulePlan = (SchedulePlan) obj;
                                BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, -863000231, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i10) {
                                        if ((i10 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-863000231, i10, -1, "cn.jianyun.workplan.module.schedule.views.main.ScheduleOperView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleOperView.kt:147)");
                                            }
                                            BoxViewKt.m6894SmallTipTextEx1dzz4(schedulePlan.getName(), 0L, 0.0f, 0.0f, null, null, composer4, 0, 62);
                                            final ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                                            final SchedulePlan schedulePlan2 = schedulePlan;
                                            PartTitleViewKt.m6915TagViewo4cevVk("使用此轮班", 0L, false, 0.0f, false, 0L, false, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$3$1$1.1
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
                                                    scheduleMasterViewModel2.makePlanDuty(schedulePlan2);
                                                }
                                            }, composer4, 6, 126);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer2, 3072, 7);
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f6), composer2, 6, 0);
                                PlanItemViewKt.PlanItemView(schedulePlan, modifier, composer2, 8, i3);
                                float f7 = 3;
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f7), composer2, 6, 0);
                                if (i8 < scheduleMasterViewModel.getPlans().size() - 1) {
                                    DividerKt.m1870HorizontalDivider9IZ8Weo(null, Dp.m6097constructorimpl((float) 0.5d), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurfaceVariant(), composer2, 48, 1);
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f7), composer2, 6, 0);
                                }
                                i8 = i9;
                            }
                            composer2.endReplaceableGroup();
                            composer3 = composer2;
                            FormItemKt.InputNumberView("周期轮班天数", false, false, null, false, "天", false, scheduleMasterViewModel.getConfig().getAutoDay(), false, 7, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_AUDIO_DEMUX_TIME, CollectionsKt.listOf((Object[]) new String[]{"30", "60", "90", "180", "365"}), new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$3$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str7) {
                                    invoke2(str7);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                                    ScheduleConfig config = scheduleMasterViewModel2.getConfig();
                                    scheduleMasterViewModel2.setConfig(config.copy((67108863 & 1) != 0 ? config.uuid : null, (67108863 & 2) != 0 ? config.autoDay : it, (67108863 & 4) != 0 ? config.beginDay : null, (67108863 & 8) != 0 ? config.dateFontSize : null, (67108863 & 16) != 0 ? config.workFontSize : null, (67108863 & 32) != 0 ? config.timeFontSize : null, (67108863 & 64) != 0 ? config.workRadius : null, (67108863 & 128) != 0 ? config.showLunar : false, (67108863 & 256) != 0 ? config.showFestival : false, (67108863 & 512) != 0 ? config.showBeginTime : false, (67108863 & 1024) != 0 ? config.showEndTime : false, (67108863 & 2048) != 0 ? config.showHLine : false, (67108863 & 4096) != 0 ? config.fillCalendar : false, (67108863 & 8192) != 0 ? config.showRemark : false, (67108863 & 16384) != 0 ? config.showStat : false, (67108863 & 32768) != 0 ? config.protectMode : false, (67108863 & 65536) != 0 ? config.extField1 : null, (67108863 & 131072) != 0 ? config.extField2 : null, (67108863 & 262144) != 0 ? config.extField3 : null, (67108863 & 524288) != 0 ? config.extField4 : null, (67108863 & 1048576) != 0 ? config.extField5 : null, (67108863 & 2097152) != 0 ? config.projectUuid : null, (67108863 & 4194304) != 0 ? config.remark : null, (67108863 & 8388608) != 0 ? config.gmtCreate : null, (67108863 & 16777216) != 0 ? config.cc : 0, (67108863 & 33554432) != 0 ? config.cid : null));
                                    scheduleMasterViewModel.changeConfig();
                                }
                            }, composer2, 805502982, 54, 350);
                            f3 = 0.0f;
                            i4 = 1;
                            i5 = 0;
                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                            ButtonViewKt.m6815LongCancelButtonvHmCa5Y("清空从" + CommonDateToolKt.dateStr(scheduleMasterViewModel.getCurrentDate()) + "开始的" + scheduleMasterViewModel.getConfig().getAutoDay() + "天排班", 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$3$3
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
                                    scheduleMasterViewModel.setClear(true);
                                }
                            }, composer2, 0, 6);
                            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                            composer2.endReplaceableGroup();
                        }
                        ButtonViewKt.LongOkButton("添加周期轮班", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$2$1$3$4
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
                                RouterKt.navigateTo$default(navHostController2, ScheduleRouter.PlanEdit.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(new SchedulePlan(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, 131071, null)))), null, null, 12, null);
                            }
                        }, composer3, 6, i5);
                        CommonUIKt.m6944BlankkHDZbjc(f3, composer3, i5, i4);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 14156208, 57);
        composerStartRestartGroup.startReplaceableGroup(-1430699848);
        if (viewModel.getClear()) {
            DialogViewKt.DeleteDialog("真的要清空吗？", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$3
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
                    viewModel.makeClean();
                }
            }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt$ScheduleOperView$1$4
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
                    viewModel.setClear(false);
                }
            }, composerStartRestartGroup, 6, 0);
        }
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0195: INVOKE (r6v5 ?? I:??[OBJECT, ARRAY]) INTERFACE call: androidx.compose.runtime.Composer.endReplaceableGroup():void A[MD:():void (m)] in method: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt.ScheduleOperView(androidx.navigation.NavHostController, cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel, androidx.compose.runtime.Composer, int):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v5 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt.ScheduleOperView(androidx.navigation.NavHostController, cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel, androidx.compose.runtime.Composer, int):void");
    }
}