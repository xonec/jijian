package cn.jianyun.workplan.module.schedule.views.config;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ScheduleConfigView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a7\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"BottomScheduleConfigView", "", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ScheduleConfigView", "modifier", "Landroidx/compose/ui/Modifier;", "padding", "Landroidx/compose/ui/unit/Dp;", "ScheduleConfigView-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleConfigViewKt {
    public static final void BottomScheduleConfigView(final Function0<Unit> onDismiss, Composer composer, final int i) {
        final int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1097815859);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomScheduleConfigView)");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1097815859, i2, -1, "cn.jianyun.workplan.module.schedule.views.config.BottomScheduleConfigView (ScheduleConfigView.kt:23)");
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
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ScheduleConfigViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            final ScheduleConfigViewModel scheduleConfigViewModel = (ScheduleConfigViewModel) viewModel;
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float f2 = ((Configuration) objConsume).fontScale;
            final long sp = (f2 > 1.15f ? 1 : (f2 == 1.15f ? 0 : -1)) > 0 ? TextUnitKt.getSp(12.0f / RangesKt.coerceAtLeast(f2, 1.0f)) : TextUnitKt.getSp(14);
            DialogViewKt.m6840BottomDialogVieweHTjO5g("日历显示设置", false, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1536134325, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt.BottomScheduleConfigView.1
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
                            ComposerKt.traceEventStart(1536134325, i3, -1, "cn.jianyun.workplan.module.schedule.views.config.BottomScheduleConfigView.<anonymous> (ScheduleConfigView.kt:29)");
                        }
                        long j = sp;
                        final ScheduleConfigViewModel scheduleConfigViewModel2 = scheduleConfigViewModel;
                        final Function0<Unit> function0 = onDismiss;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        float f3 = 5;
                        CommonUIKt.m6952WarnTexthfI1UA("取消", Dp.m6097constructorimpl(f3), j, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$BottomScheduleConfigView$1$1$1
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
                                scheduleConfigViewModel2.cancelEdit();
                                function0.invoke();
                            }
                        }, composer2, 54, 8);
                        CommonUIKt.m6950LinkTexthfI1UA("保存", Dp.m6097constructorimpl(f3), j, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$BottomScheduleConfigView$1$1$2
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
                                scheduleConfigViewModel2.save(function0);
                            }
                        }, composer2, 54, 8);
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
            }), true, 0.0f, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt.BottomScheduleConfigView.2
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
                    scheduleConfigViewModel.cancelEdit();
                    onDismiss.invoke();
                }
            }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1103418297, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt.BottomScheduleConfigView.3
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
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1103418297, i3, -1, "cn.jianyun.workplan.module.schedule.views.config.BottomScheduleConfigView.<anonymous> (ScheduleConfigView.kt:42)");
                    }
                    ScheduleConfigViewKt.m6750ScheduleConfigViewuFdPcIQ(null, 0.0f, onDismiss, composer2, (i2 << 6) & 896, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 12610566, 38);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt.BottomScheduleConfigView.4
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
                ScheduleConfigViewKt.BottomScheduleConfigView(onDismiss, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ScheduleConfigView-uFdPcIQ, reason: not valid java name */
    public static final void m6750ScheduleConfigViewuFdPcIQ(Modifier modifier, float f2, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        Modifier.Companion companion;
        float fM6097constructorimpl;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(647811779);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleConfigView)P(!1,2:c#ui.unit.Dp)");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(647811779, i4, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView (ScheduleConfigView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(1890788296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
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
                ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ScheduleConfigViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                final ScheduleConfigViewModel scheduleConfigViewModel = (ScheduleConfigViewModel) viewModel;
                Modifier modifierThen = Modifier.INSTANCE.then(companion);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                GroupViewKt.m6852ZeroGroupViewKz89ssw(fM6097constructorimpl, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1743644792, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1743644792, i7, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView.<anonymous>.<anonymous> (ScheduleConfigView.kt:59)");
                            }
                            float fM6097constructorimpl2 = Dp.m6097constructorimpl(60);
                            String beginDay = scheduleConfigViewModel.getEditItem().getBeginDay();
                            List<SelectDO> MONDAY_OR_SUNDAY = SelectUtil.MONDAY_OR_SUNDAY;
                            Intrinsics.checkNotNullExpressionValue(MONDAY_OR_SUNDAY, "MONDAY_OR_SUNDAY");
                            final ScheduleConfigViewModel scheduleConfigViewModel2 = scheduleConfigViewModel;
                            FormItemKt.m6843SegmentItemViewRfXq3Jk("一周开始日", fM6097constructorimpl2, false, beginDay, MONDAY_OR_SUNDAY, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.1
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
                                    ScheduleConfigViewModel scheduleConfigViewModel3 = scheduleConfigViewModel2;
                                    ScheduleConfig editItem = scheduleConfigViewModel3.getEditItem();
                                    scheduleConfigViewModel3.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : it, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 32822, 4);
                            String dateFontSize = scheduleConfigViewModel.getEditItem().getDateFontSize();
                            final ScheduleConfigViewModel scheduleConfigViewModel3 = scheduleConfigViewModel;
                            Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.2
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
                                    ScheduleConfigViewModel scheduleConfigViewModel4 = scheduleConfigViewModel3;
                                    ScheduleConfig editItem = scheduleConfigViewModel4.getEditItem();
                                    scheduleConfigViewModel4.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : it, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            };
                            List<SelectDO> CHOOSE_FONT_SIZES = SelectUtil.CHOOSE_FONT_SIZES;
                            Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES, "CHOOSE_FONT_SIZES");
                            FormItemKt.SelectItemView("日期字号", false, false, false, dateFontSize, function1, CHOOSE_FONT_SIZES, composer2, 2097158, 14);
                            String workFontSize = scheduleConfigViewModel.getEditItem().getWorkFontSize();
                            final ScheduleConfigViewModel scheduleConfigViewModel4 = scheduleConfigViewModel;
                            Function1<String, Unit> function2 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.3
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
                                    ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel4;
                                    ScheduleConfig editItem = scheduleConfigViewModel5.getEditItem();
                                    scheduleConfigViewModel5.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : it, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            };
                            List<SelectDO> CHOOSE_FONT_SIZES2 = SelectUtil.CHOOSE_FONT_SIZES;
                            Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES2, "CHOOSE_FONT_SIZES");
                            FormItemKt.SelectItemView("班次字号", false, false, false, workFontSize, function2, CHOOSE_FONT_SIZES2, composer2, 2097158, 14);
                            String timeFontSize = scheduleConfigViewModel.getEditItem().getTimeFontSize();
                            final ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel;
                            Function1<String, Unit> function3 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.4
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
                                    ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel5;
                                    ScheduleConfig editItem = scheduleConfigViewModel6.getEditItem();
                                    scheduleConfigViewModel6.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : it, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            };
                            List<SelectDO> CHOOSE_FONT_SIZES3 = SelectUtil.CHOOSE_FONT_SIZES;
                            Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES3, "CHOOSE_FONT_SIZES");
                            FormItemKt.SelectItemView("时间字号", false, false, false, timeFontSize, function3, CHOOSE_FONT_SIZES3, composer2, 2097158, 14);
                            String workRadius = scheduleConfigViewModel.getEditItem().getWorkRadius();
                            final ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel;
                            Function1<String, Unit> function4 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.5
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
                                    ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel6;
                                    ScheduleConfig editItem = scheduleConfigViewModel7.getEditItem();
                                    scheduleConfigViewModel7.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : it, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            };
                            List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "", 0, 10);
                            Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"\", 0, 10)");
                            FormItemKt.SelectItemView("班次圆角", false, false, false, workRadius, function4, listInitWithUnit, composer2, 2097158, 14);
                            boolean showLunar = scheduleConfigViewModel.getEditItem().getShowLunar();
                            final ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示中国农历", showLunar, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.6
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel7;
                                    ScheduleConfig editItem = scheduleConfigViewModel8.getEditItem();
                                    scheduleConfigViewModel8.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : z, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showFestival = scheduleConfigViewModel.getEditItem().getShowFestival();
                            final ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示中国节假日", showFestival, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.7
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel8;
                                    ScheduleConfig editItem = scheduleConfigViewModel9.getEditItem();
                                    scheduleConfigViewModel9.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : z, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showBeginTime = scheduleConfigViewModel.getEditItem().getShowBeginTime();
                            final ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示上班时间", showBeginTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.8
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel9;
                                    ScheduleConfig editItem = scheduleConfigViewModel10.getEditItem();
                                    scheduleConfigViewModel10.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : z, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showEndTime = scheduleConfigViewModel.getEditItem().getShowEndTime();
                            final ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示下班时间", showEndTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.9
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel10;
                                    ScheduleConfig editItem = scheduleConfigViewModel11.getEditItem();
                                    scheduleConfigViewModel11.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : z, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showRemark = scheduleConfigViewModel.getEditItem().getShowRemark();
                            final ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示备注", showRemark, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.10
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel11;
                                    ScheduleConfig editItem = scheduleConfigViewModel12.getEditItem();
                                    scheduleConfigViewModel12.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : z, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showStat = scheduleConfigViewModel.getEditItem().getShowStat();
                            final ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示统计指标", showStat, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.11
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel12;
                                    ScheduleConfig editItem = scheduleConfigViewModel13.getEditItem();
                                    scheduleConfigViewModel13.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : z, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            boolean showHLine = scheduleConfigViewModel.getEditItem().getShowHLine();
                            final ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel;
                            FormItemKt.SwitchItemView("显示分割线", showHLine, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.12
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z) {
                                    ScheduleConfigViewModel scheduleConfigViewModel14 = scheduleConfigViewModel13;
                                    ScheduleConfig editItem = scheduleConfigViewModel14.getEditItem();
                                    scheduleConfigViewModel14.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : z, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                                }
                            }, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i4 >> 3) & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 2);
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
                companion = modifier;
                fM6097constructorimpl = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier2 = companion;
            final float f4 = fM6097constructorimpl;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ScheduleConfigViewKt.m6750ScheduleConfigViewuFdPcIQ(modifier2, f4, onDismiss, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f3 = f2;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier;
            }
            if (i6 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647811779, i4, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView (ScheduleConfigView.kt:51)");
            }
            composerStartRestartGroup.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel((Class<ViewModel>) ScheduleConfigViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory2, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            final ScheduleConfigViewModel scheduleConfigViewModel2 = (ScheduleConfigViewModel) viewModel2;
            Modifier modifierThen2 = Modifier.INSTANCE.then(companion);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            GroupViewKt.m6852ZeroGroupViewKz89ssw(fM6097constructorimpl, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1743644792, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1743644792, i7, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView.<anonymous>.<anonymous> (ScheduleConfigView.kt:59)");
                        }
                        float fM6097constructorimpl2 = Dp.m6097constructorimpl(60);
                        String beginDay = scheduleConfigViewModel2.getEditItem().getBeginDay();
                        List<SelectDO> MONDAY_OR_SUNDAY = SelectUtil.MONDAY_OR_SUNDAY;
                        Intrinsics.checkNotNullExpressionValue(MONDAY_OR_SUNDAY, "MONDAY_OR_SUNDAY");
                        final ScheduleConfigViewModel scheduleConfigViewModel3 = scheduleConfigViewModel2;
                        FormItemKt.m6843SegmentItemViewRfXq3Jk("一周开始日", fM6097constructorimpl2, false, beginDay, MONDAY_OR_SUNDAY, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.1
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
                                ScheduleConfigViewModel scheduleConfigViewModel4 = scheduleConfigViewModel3;
                                ScheduleConfig editItem = scheduleConfigViewModel4.getEditItem();
                                scheduleConfigViewModel4.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : it, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 32822, 4);
                        String dateFontSize = scheduleConfigViewModel2.getEditItem().getDateFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel4 = scheduleConfigViewModel2;
                        Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.2
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
                                ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel4;
                                ScheduleConfig editItem = scheduleConfigViewModel5.getEditItem();
                                scheduleConfigViewModel5.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : it, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("日期字号", false, false, false, dateFontSize, function1, CHOOSE_FONT_SIZES, composer2, 2097158, 14);
                        String workFontSize = scheduleConfigViewModel2.getEditItem().getWorkFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel2;
                        Function1<String, Unit> function2 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.3
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
                                ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel5;
                                ScheduleConfig editItem = scheduleConfigViewModel6.getEditItem();
                                scheduleConfigViewModel6.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : it, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES2 = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES2, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("班次字号", false, false, false, workFontSize, function2, CHOOSE_FONT_SIZES2, composer2, 2097158, 14);
                        String timeFontSize = scheduleConfigViewModel2.getEditItem().getTimeFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel2;
                        Function1<String, Unit> function3 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.4
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
                                ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel6;
                                ScheduleConfig editItem = scheduleConfigViewModel7.getEditItem();
                                scheduleConfigViewModel7.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : it, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES3 = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES3, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("时间字号", false, false, false, timeFontSize, function3, CHOOSE_FONT_SIZES3, composer2, 2097158, 14);
                        String workRadius = scheduleConfigViewModel2.getEditItem().getWorkRadius();
                        final ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel2;
                        Function1<String, Unit> function4 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.5
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
                                ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel7;
                                ScheduleConfig editItem = scheduleConfigViewModel8.getEditItem();
                                scheduleConfigViewModel8.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : it, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "", 0, 10);
                        Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"\", 0, 10)");
                        FormItemKt.SelectItemView("班次圆角", false, false, false, workRadius, function4, listInitWithUnit, composer2, 2097158, 14);
                        boolean showLunar = scheduleConfigViewModel2.getEditItem().getShowLunar();
                        final ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示中国农历", showLunar, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.6
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel8;
                                ScheduleConfig editItem = scheduleConfigViewModel9.getEditItem();
                                scheduleConfigViewModel9.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : z, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showFestival = scheduleConfigViewModel2.getEditItem().getShowFestival();
                        final ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示中国节假日", showFestival, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.7
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel9;
                                ScheduleConfig editItem = scheduleConfigViewModel10.getEditItem();
                                scheduleConfigViewModel10.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : z, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showBeginTime = scheduleConfigViewModel2.getEditItem().getShowBeginTime();
                        final ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示上班时间", showBeginTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.8
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel10;
                                ScheduleConfig editItem = scheduleConfigViewModel11.getEditItem();
                                scheduleConfigViewModel11.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : z, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showEndTime = scheduleConfigViewModel2.getEditItem().getShowEndTime();
                        final ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示下班时间", showEndTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.9
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel11;
                                ScheduleConfig editItem = scheduleConfigViewModel12.getEditItem();
                                scheduleConfigViewModel12.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : z, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showRemark = scheduleConfigViewModel2.getEditItem().getShowRemark();
                        final ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示备注", showRemark, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.10
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel12;
                                ScheduleConfig editItem = scheduleConfigViewModel13.getEditItem();
                                scheduleConfigViewModel13.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : z, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showStat = scheduleConfigViewModel2.getEditItem().getShowStat();
                        final ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示统计指标", showStat, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.11
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel14 = scheduleConfigViewModel13;
                                ScheduleConfig editItem = scheduleConfigViewModel14.getEditItem();
                                scheduleConfigViewModel14.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : z, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showHLine = scheduleConfigViewModel2.getEditItem().getShowHLine();
                        final ScheduleConfigViewModel scheduleConfigViewModel14 = scheduleConfigViewModel2;
                        FormItemKt.SwitchItemView("显示分割线", showHLine, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.12
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel15 = scheduleConfigViewModel14;
                                ScheduleConfig editItem = scheduleConfigViewModel15.getEditItem();
                                scheduleConfigViewModel15.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : z, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i4 >> 3) & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i5 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier;
            }
            if (i6 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647811779, i4, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView (ScheduleConfigView.kt:51)");
            }
            composerStartRestartGroup.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory3 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel3 = ViewModelKt.viewModel((Class<ViewModel>) ScheduleConfigViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory3, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            final ScheduleConfigViewModel scheduleConfigViewModel3 = (ScheduleConfigViewModel) viewModel3;
            Modifier modifierThen3 = Modifier.INSTANCE.then(companion);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            GroupViewKt.m6852ZeroGroupViewKz89ssw(fM6097constructorimpl, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1743644792, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1743644792, i7, -1, "cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigView.<anonymous>.<anonymous> (ScheduleConfigView.kt:59)");
                        }
                        float fM6097constructorimpl2 = Dp.m6097constructorimpl(60);
                        String beginDay = scheduleConfigViewModel3.getEditItem().getBeginDay();
                        List<SelectDO> MONDAY_OR_SUNDAY = SelectUtil.MONDAY_OR_SUNDAY;
                        Intrinsics.checkNotNullExpressionValue(MONDAY_OR_SUNDAY, "MONDAY_OR_SUNDAY");
                        final ScheduleConfigViewModel scheduleConfigViewModel4 = scheduleConfigViewModel3;
                        FormItemKt.m6843SegmentItemViewRfXq3Jk("一周开始日", fM6097constructorimpl2, false, beginDay, MONDAY_OR_SUNDAY, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.1
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
                                ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel4;
                                ScheduleConfig editItem = scheduleConfigViewModel5.getEditItem();
                                scheduleConfigViewModel5.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : it, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 32822, 4);
                        String dateFontSize = scheduleConfigViewModel3.getEditItem().getDateFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel5 = scheduleConfigViewModel3;
                        Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.2
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
                                ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel5;
                                ScheduleConfig editItem = scheduleConfigViewModel6.getEditItem();
                                scheduleConfigViewModel6.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : it, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("日期字号", false, false, false, dateFontSize, function1, CHOOSE_FONT_SIZES, composer2, 2097158, 14);
                        String workFontSize = scheduleConfigViewModel3.getEditItem().getWorkFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel6 = scheduleConfigViewModel3;
                        Function1<String, Unit> function2 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.3
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
                                ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel6;
                                ScheduleConfig editItem = scheduleConfigViewModel7.getEditItem();
                                scheduleConfigViewModel7.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : it, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES2 = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES2, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("班次字号", false, false, false, workFontSize, function2, CHOOSE_FONT_SIZES2, composer2, 2097158, 14);
                        String timeFontSize = scheduleConfigViewModel3.getEditItem().getTimeFontSize();
                        final ScheduleConfigViewModel scheduleConfigViewModel7 = scheduleConfigViewModel3;
                        Function1<String, Unit> function3 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.4
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
                                ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel7;
                                ScheduleConfig editItem = scheduleConfigViewModel8.getEditItem();
                                scheduleConfigViewModel8.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : it, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> CHOOSE_FONT_SIZES3 = SelectUtil.CHOOSE_FONT_SIZES;
                        Intrinsics.checkNotNullExpressionValue(CHOOSE_FONT_SIZES3, "CHOOSE_FONT_SIZES");
                        FormItemKt.SelectItemView("时间字号", false, false, false, timeFontSize, function3, CHOOSE_FONT_SIZES3, composer2, 2097158, 14);
                        String workRadius = scheduleConfigViewModel3.getEditItem().getWorkRadius();
                        final ScheduleConfigViewModel scheduleConfigViewModel8 = scheduleConfigViewModel3;
                        Function1<String, Unit> function4 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.5
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
                                ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel8;
                                ScheduleConfig editItem = scheduleConfigViewModel9.getEditItem();
                                scheduleConfigViewModel9.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : it, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        };
                        List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "", 0, 10);
                        Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"\", 0, 10)");
                        FormItemKt.SelectItemView("班次圆角", false, false, false, workRadius, function4, listInitWithUnit, composer2, 2097158, 14);
                        boolean showLunar = scheduleConfigViewModel3.getEditItem().getShowLunar();
                        final ScheduleConfigViewModel scheduleConfigViewModel9 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示中国农历", showLunar, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.6
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel9;
                                ScheduleConfig editItem = scheduleConfigViewModel10.getEditItem();
                                scheduleConfigViewModel10.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : z, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showFestival = scheduleConfigViewModel3.getEditItem().getShowFestival();
                        final ScheduleConfigViewModel scheduleConfigViewModel10 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示中国节假日", showFestival, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.7
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel10;
                                ScheduleConfig editItem = scheduleConfigViewModel11.getEditItem();
                                scheduleConfigViewModel11.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : z, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showBeginTime = scheduleConfigViewModel3.getEditItem().getShowBeginTime();
                        final ScheduleConfigViewModel scheduleConfigViewModel11 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示上班时间", showBeginTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.8
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel11;
                                ScheduleConfig editItem = scheduleConfigViewModel12.getEditItem();
                                scheduleConfigViewModel12.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : z, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showEndTime = scheduleConfigViewModel3.getEditItem().getShowEndTime();
                        final ScheduleConfigViewModel scheduleConfigViewModel12 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示下班时间", showEndTime, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.9
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel12;
                                ScheduleConfig editItem = scheduleConfigViewModel13.getEditItem();
                                scheduleConfigViewModel13.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : z, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showRemark = scheduleConfigViewModel3.getEditItem().getShowRemark();
                        final ScheduleConfigViewModel scheduleConfigViewModel13 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示备注", showRemark, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.10
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel14 = scheduleConfigViewModel13;
                                ScheduleConfig editItem = scheduleConfigViewModel14.getEditItem();
                                scheduleConfigViewModel14.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : z, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showStat = scheduleConfigViewModel3.getEditItem().getShowStat();
                        final ScheduleConfigViewModel scheduleConfigViewModel14 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示统计指标", showStat, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.11
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel15 = scheduleConfigViewModel14;
                                ScheduleConfig editItem = scheduleConfigViewModel15.getEditItem();
                                scheduleConfigViewModel15.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : false, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : z, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        boolean showHLine = scheduleConfigViewModel3.getEditItem().getShowHLine();
                        final ScheduleConfigViewModel scheduleConfigViewModel15 = scheduleConfigViewModel3;
                        FormItemKt.SwitchItemView("显示分割线", showHLine, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$1$1.12
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                ScheduleConfigViewModel scheduleConfigViewModel16 = scheduleConfigViewModel15;
                                ScheduleConfig editItem = scheduleConfigViewModel16.getEditItem();
                                scheduleConfigViewModel16.setEditItem(editItem.copy((67108863 & 1) != 0 ? editItem.uuid : null, (67108863 & 2) != 0 ? editItem.autoDay : null, (67108863 & 4) != 0 ? editItem.beginDay : null, (67108863 & 8) != 0 ? editItem.dateFontSize : null, (67108863 & 16) != 0 ? editItem.workFontSize : null, (67108863 & 32) != 0 ? editItem.timeFontSize : null, (67108863 & 64) != 0 ? editItem.workRadius : null, (67108863 & 128) != 0 ? editItem.showLunar : false, (67108863 & 256) != 0 ? editItem.showFestival : false, (67108863 & 512) != 0 ? editItem.showBeginTime : false, (67108863 & 1024) != 0 ? editItem.showEndTime : false, (67108863 & 2048) != 0 ? editItem.showHLine : z, (67108863 & 4096) != 0 ? editItem.fillCalendar : false, (67108863 & 8192) != 0 ? editItem.showRemark : false, (67108863 & 16384) != 0 ? editItem.showStat : false, (67108863 & 32768) != 0 ? editItem.protectMode : false, (67108863 & 65536) != 0 ? editItem.extField1 : null, (67108863 & 131072) != 0 ? editItem.extField2 : null, (67108863 & 262144) != 0 ? editItem.extField3 : null, (67108863 & 524288) != 0 ? editItem.extField4 : null, (67108863 & 1048576) != 0 ? editItem.extField5 : null, (67108863 & 2097152) != 0 ? editItem.projectUuid : null, (67108863 & 4194304) != 0 ? editItem.remark : null, (67108863 & 8388608) != 0 ? editItem.gmtCreate : null, (67108863 & 16777216) != 0 ? editItem.cc : 0, (67108863 & 33554432) != 0 ? editItem.cid : null));
                            }
                        }, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i4 >> 3) & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = companion;
        final float f5 = fM6097constructorimpl;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.config.ScheduleConfigViewKt$ScheduleConfigView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                ScheduleConfigViewKt.m6750ScheduleConfigViewuFdPcIQ(modifier3, f5, onDismiss, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}