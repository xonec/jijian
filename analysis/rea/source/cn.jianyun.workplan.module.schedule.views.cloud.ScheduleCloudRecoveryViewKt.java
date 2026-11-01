package cn.jianyun.workplan.module.schedule.views.cloud;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleCloudRecoveryView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ScheduleCloudRecoveryView", "", "viewModel", "Lcn/jianyun/workplan/module/schedule/vm/ScheduleCloudManageViewModel;", "(Lcn/jianyun/workplan/module/schedule/vm/ScheduleCloudManageViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleCloudRecoveryViewKt {
    public static final void ScheduleCloudRecoveryView(final ScheduleCloudManageViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(506170358);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleCloudRecoveryView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(506170358, i, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView (ScheduleCloudRecoveryView.kt:27)");
        }
        DialogViewKt.m6840BottomDialogVieweHTjO5g("从备份文件导入数据", true, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 754703838, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.1
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
                        ComposerKt.traceEventStart(754703838, i2, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous> (ScheduleCloudRecoveryView.kt:30)");
                    }
                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel = viewModel;
                    BoxViewKt.m6888HeaderIcon53ZIcWk(IconFont.info2, 0.0f, 0L, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.1.1
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
                            scheduleCloudManageViewModel.setTip(new FormType("about", null, null, 6, null));
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
        }), false, 0.0f, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.2
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
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1809491938, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3
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
                        ComposerKt.traceEventStart(1809491938, i2, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous> (ScheduleCloudRecoveryView.kt:36)");
                    }
                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel = viewModel;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 504438709, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.1
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
                                    ComposerKt.traceEventStart(504438709, i3, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous>.<anonymous> (ScheduleCloudRecoveryView.kt:38)");
                                }
                                final ScheduleCloudManageViewModel scheduleCloudManageViewModel2 = scheduleCloudManageViewModel;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.1.1
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
                                        scheduleCloudManageViewModel2.doBatchImport();
                                    }
                                };
                                final ScheduleCloudManageViewModel scheduleCloudManageViewModel3 = scheduleCloudManageViewModel;
                                ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY("全量覆盖导入", "删除备份", 0.0f, 0.0f, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.1.2
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
                                        scheduleCloudManageViewModel3.setFormType(new FormType("showBackupData_deleteBackup", null, null, 6, null));
                                    }
                                }, composer3, 54, 12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel2 = viewModel;
                    HeaderViewKt.m6906WithFooterViewuFdPcIQ(composableLambda, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1280686263, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.2
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
                                    ComposerKt.traceEventStart(1280686263, i3, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous>.<anonymous> (ScheduleCloudRecoveryView.kt:44)");
                                }
                                List<ScheduleProject> projectList = scheduleCloudManageViewModel2.getCurrentBackupData().getProjectList();
                                final ScheduleCloudManageViewModel scheduleCloudManageViewModel3 = scheduleCloudManageViewModel2;
                                HeaderViewKt.m6902ListDataViewosbwsH8(projectList, null, 0.0f, false, null, ComposableLambdaKt.composableLambda(composer3, 1101705194, true, new Function3<ScheduleProject, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.2.1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ScheduleProject scheduleProject, Composer composer4, Integer num) {
                                        invoke(scheduleProject, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final ScheduleProject it, Composer composer4, int i4) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1101705194, i4, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous>.<anonymous>.<anonymous> (ScheduleCloudRecoveryView.kt:45)");
                                        }
                                        float fM6097constructorimpl = Dp.m6097constructorimpl(10);
                                        final ScheduleCloudManageViewModel scheduleCloudManageViewModel4 = scheduleCloudManageViewModel3;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, fM6097constructorimpl, 0.0f, ComposableLambdaKt.composableLambda(composer4, -1880942599, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                        ComposerKt.traceEventStart(-1880942599, i5, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleCloudRecoveryView.kt:46)");
                                                    }
                                                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel5 = scheduleCloudManageViewModel4;
                                                    final ScheduleProject scheduleProject = it;
                                                    BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer5, 741001074, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.2.1.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    ComposerKt.traceEventStart(741001074, i6, -1, "cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleCloudRecoveryView.kt:47)");
                                                                }
                                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                ScheduleProject scheduleProject2 = scheduleProject;
                                                                composer6.startReplaceableGroup(693286680);
                                                                ComposerKt.sourceInformation(composer6, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer6, 48);
                                                                composer6.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer6, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer6.startReusableNode();
                                                                if (composer6.getInserting()) {
                                                                    composer6.createNode(constructor);
                                                                } else {
                                                                    composer6.useNode();
                                                                }
                                                                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer6);
                                                                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer6)), composer6, 0);
                                                                composer6.startReplaceableGroup(2058660585);
                                                                ComposerKt.sourceInformationMarkerStart(composer6, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                TextKt.m2471Text4IGK_g(scheduleProject2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 0, 0, 131070);
                                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                if (scheduleCloudManageViewModel5.getCurrentList().contains(scheduleProject.getUuid())) {
                                                                    composer6.startReplaceableGroup(-860947872);
                                                                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel6 = scheduleCloudManageViewModel5;
                                                                    final ScheduleProject scheduleProject3 = scheduleProject;
                                                                    composer6.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer6, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer6, 0);
                                                                    composer6.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer6, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                                                    if (!(composer6.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer6.startReusableNode();
                                                                    if (composer6.getInserting()) {
                                                                        composer6.createNode(constructor2);
                                                                    } else {
                                                                        composer6.useNode();
                                                                    }
                                                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer6);
                                                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                    }
                                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer6)), composer6, 0);
                                                                    composer6.startReplaceableGroup(2058660585);
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                                    PartTitleViewKt.m6915TagViewo4cevVk("增量导入", 0L, false, 0.0f, true, 0L, true, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt$ScheduleCloudRecoveryView$3$2$1$1$1$2$1
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
                                                                            scheduleCloudManageViewModel6.doAddImport(scheduleProject3);
                                                                        }
                                                                    }, composer6, 1597446, 46);
                                                                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer6, 0, 1);
                                                                    PartTitleViewKt.m6915TagViewo4cevVk("覆盖导入", 0L, false, 0.0f, true, 0L, true, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt$ScheduleCloudRecoveryView$3$2$1$1$1$2$2
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
                                                                            scheduleCloudManageViewModel6.doCoverImport(scheduleProject3);
                                                                        }
                                                                    }, composer6, 1597446, 46);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    composer6.endReplaceableGroup();
                                                                    composer6.endNode();
                                                                    composer6.endReplaceableGroup();
                                                                    composer6.endReplaceableGroup();
                                                                    composer6.endReplaceableGroup();
                                                                } else {
                                                                    composer6.startReplaceableGroup(-860947353);
                                                                    long themeColor = ColorKt.getThemeColor();
                                                                    final ScheduleCloudManageViewModel scheduleCloudManageViewModel7 = scheduleCloudManageViewModel5;
                                                                    final ScheduleProject scheduleProject4 = scheduleProject;
                                                                    PartTitleViewKt.m6915TagViewo4cevVk("全新导入", 0L, false, 0.0f, true, themeColor, false, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.2.1.1.1.3
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
                                                                            scheduleCloudManageViewModel7.doNewImport(scheduleProject4);
                                                                        }
                                                                    }, composer6, 221190, 78);
                                                                    composer6.endReplaceableGroup();
                                                                }
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
                                        }), composer4, 102236160, 191);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 196616, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                    composer2.startReplaceableGroup(263663089);
                    if (viewModel.getFormType().isForm("showBackupData_deleteBackup")) {
                        final ScheduleCloudManageViewModel scheduleCloudManageViewModel3 = viewModel;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.3
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
                                scheduleCloudManageViewModel3.deleteBackup();
                            }
                        };
                        final ScheduleCloudManageViewModel scheduleCloudManageViewModel4 = viewModel;
                        DialogViewKt.DeleteDialog("确定要删除此备份", function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.4
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
                                scheduleCloudManageViewModel4.setFormType(new FormType("showBackupData", null, null, 6, null));
                            }
                        }, composer2, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    if (viewModel.getTip().isForm("about")) {
                        String strOneLine = CommonToolKt.oneLine("\n                1. 增量导入：将备份文件中新的数据写入当前项目<br>\n                2. 覆盖导入：先将本地项目删除，然后导入备份文件里的项目，即以备份文件项目为主<br>\n                3. 全新导入：将备份文件里新的项目直接导入<br>\n            ");
                        final ScheduleCloudManageViewModel scheduleCloudManageViewModel5 = viewModel;
                        DialogViewKt.TipDialog("关于几种导入", strOneLine, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.3.5
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
                                scheduleCloudManageViewModel5.setTip(new FormType(null, null, null, 7, null));
                            }
                        }, composer2, 6, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12586038, 52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.cloud.ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView.4
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
                ScheduleCloudRecoveryViewKt.ScheduleCloudRecoveryView(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}