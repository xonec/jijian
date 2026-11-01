package cn.jianyun.workplan.module.schedule.views.plan;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.util.CommonToolKt;
import com.alibaba.fastjson2.JSON;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlanItemView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"EditPlanItemView", "", "plan", "Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function1;", "(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PlanItemView", "(Lcn/jianyun/workplan/module/schedule/model/SchedulePlan;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlanItemViewKt {
    public static final void PlanItemView(final SchedulePlan plan, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Composer composerStartRestartGroup = composer.startRestartGroup(1742345888);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PlanItemView)P(1)");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742345888, i, -1, "cn.jianyun.workplan.module.schedule.views.plan.PlanItemView (PlanItemView.kt:18)");
        }
        final Modifier modifier3 = modifier2;
        GroupViewKt.m6850GroupViewfIyqwc(modifier2, false, false, 0.0f, 0.0f, 0.0f, ((Dp) CommonToolKt.ifv(Intrinsics.areEqual(plan.getConfig(), ""), Dp.m6095boximpl(Dp.m6097constructorimpl(20)), Dp.m6095boximpl(Dp.m6097constructorimpl(10)))).m6111unboximpl(), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 902301873, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt.PlanItemView.1
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
                        ComposerKt.traceEventStart(902301873, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.PlanItemView.<anonymous> (PlanItemView.kt:20)");
                    }
                    SchedulePlan schedulePlan = plan;
                    composer2.startReplaceableGroup(1098475987);
                    ComposerKt.sourceInformation(composer2, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer2, 0);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(866207427);
                    Iterator<T> it = schedulePlan.fetchPlans().iterator();
                    while (it.hasNext()) {
                        WorkItemViewKt.m6759WorkItemViewKBW6s6s((ScheduleWork) it.next(), false, false, null, null, null, Size.normal, Dp.m6097constructorimpl(5), Dp.m6097constructorimpl(3), null, composer2, 114819080, 574);
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
        }), composerStartRestartGroup, ((i >> 3) & 14) | 100663296, 190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt.PlanItemView.2
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
                PlanItemViewKt.PlanItemView(plan, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void EditPlanItemView(final SchedulePlan plan, Modifier modifier, final Function1<? super SchedulePlan, Unit> onClick, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(543774665);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EditPlanItemView)P(2)");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(543774665, i, -1, "cn.jianyun.workplan.module.schedule.views.plan.EditPlanItemView (PlanItemView.kt:32)");
        }
        GroupViewKt.m6850GroupViewfIyqwc(modifier2, false, false, 0.0f, 0.0f, 0.0f, ((Dp) CommonToolKt.ifv(Intrinsics.areEqual(plan.getConfig(), ""), Dp.m6095boximpl(Dp.m6097constructorimpl(20)), Dp.m6095boximpl(Dp.m6097constructorimpl(10)))).m6111unboximpl(), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -308684774, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt.EditPlanItemView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                        ComposerKt.traceEventStart(-308684774, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.EditPlanItemView.<anonymous> (PlanItemView.kt:34)");
                    }
                    final SchedulePlan schedulePlan = plan;
                    final Function1<SchedulePlan, Unit> function1 = onClick;
                    composer2.startReplaceableGroup(1098475987);
                    ComposerKt.sourceInformation(composer2, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    final int i4 = 0;
                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer2, 0);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1209953016);
                    for (Object obj : schedulePlan.fetchPlans()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        WorkItemViewKt.m6757EditWorkItemViewTN_CM5M((ScheduleWork) obj, Size.normal, Dp.m6097constructorimpl(5), null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt$EditPlanItemView$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                List mutableList = CollectionsKt.toMutableList((Collection) schedulePlan.fetchPlans());
                                mutableList.remove(i4);
                                Function1<SchedulePlan, Unit> function2 = function1;
                                SchedulePlan schedulePlan2 = schedulePlan;
                                String jSONString = JSON.toJSONString(mutableList);
                                Intrinsics.checkNotNullExpressionValue(jSONString, "s.toJSONString()");
                                function2.invoke(schedulePlan2.copy((130815 & 1) != 0 ? schedulePlan2.uuid : null, (130815 & 2) != 0 ? schedulePlan2.name : null, (130815 & 4) != 0 ? schedulePlan2.userId : null, (130815 & 8) != 0 ? schedulePlan2.gmtBegin : null, (130815 & 16) != 0 ? schedulePlan2.gmtEnd : null, (130815 & 32) != 0 ? schedulePlan2.remark : null, (130815 & 64) != 0 ? schedulePlan2.theme : null, (130815 & 128) != 0 ? schedulePlan2.projectUuid : null, (130815 & 256) != 0 ? schedulePlan2.config : jSONString, (130815 & 512) != 0 ? schedulePlan2.ordinal : 0, (130815 & 1024) != 0 ? schedulePlan2.state : 0, (130815 & 2048) != 0 ? schedulePlan2.gmtCreate : null, (130815 & 4096) != 0 ? schedulePlan2.extField1 : null, (130815 & 8192) != 0 ? schedulePlan2.extField2 : null, (130815 & 16384) != 0 ? schedulePlan2.extField3 : null, (130815 & 32768) != 0 ? schedulePlan2.cc : 0, (130815 & 65536) != 0 ? schedulePlan2.cid : null));
                            }
                        }, composer2, 440, 8);
                        i4 = i5;
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
        }), composerStartRestartGroup, ((i >> 3) & 14) | 100663296, 190);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.PlanItemViewKt.EditPlanItemView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                PlanItemViewKt.EditPlanItemView(plan, modifier3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}