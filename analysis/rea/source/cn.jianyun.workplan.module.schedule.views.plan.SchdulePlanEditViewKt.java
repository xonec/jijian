package cn.jianyun.workplan.module.schedule.views.plan;

import android.os.Bundle;
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
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.FormTypeKt;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SchdulePlanEditView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SchedulePlanEditView", "", "navHostController", "Landroidx/navigation/NavHostController;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavHostController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SchdulePlanEditViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, androidx.lifecycle.ViewModel] */
    public static final void SchedulePlanEditView(final NavHostController navHostController, final Bundle bundle, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-544632933);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SchedulePlanEditView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-544632933, i, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView (SchdulePlanEditView.kt:51)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) SchedulePlanViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        final SchedulePlan editInfo = (SchedulePlan) JSON.parseObject(bundle != null ? bundle.getString("model") : null, SchedulePlan.class);
        SchedulePlanViewModel schedulePlanViewModel = (SchedulePlanViewModel) objectRef.element;
        Intrinsics.checkNotNullExpressionValue(editInfo, "editInfo");
        schedulePlanViewModel.initModel(editInfo);
        ScaffoldKt.m2126ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -682859606, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt.SchedulePlanEditView.1
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
                        ComposerKt.traceEventStart(-682859606, i2, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView.<anonymous> (SchdulePlanEditView.kt:61)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    final Ref.ObjectRef<SchedulePlanViewModel> objectRef2 = objectRef;
                    SchedulePlan schedulePlan = editInfo;
                    final NavHostController navHostController2 = navHostController;
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
                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
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
                    HeaderViewKt.HeaderView((String) CommonToolKt.ifv(Intrinsics.areEqual(schedulePlan.getUuid(), ""), "添加轮班", "编辑轮班"), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$1
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
                            CommonToolKt.goBack$default(navHostController2, null, 2, null);
                        }
                    }, null, composer2, 0, 4);
                    Modifier modifierM571paddingqDBjuR0$default = PaddingKt.m571paddingqDBjuR0$default(ScrollKt.verticalScroll$default(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(10), Dp.m6097constructorimpl(25)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(80), 7, null);
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM571paddingqDBjuR0$default);
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
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("基本信息", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 87727687, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$1
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
                                    ComposerKt.traceEventStart(87727687, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchdulePlanEditView.kt:76)");
                                }
                                String name = objectRef2.element.getEditItem().getName();
                                final Ref.ObjectRef<SchedulePlanViewModel> objectRef3 = objectRef2;
                                FormItemKt.InputItemView("轮班名称", false, false, false, null, false, name, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$1.1
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
                                        SchedulePlanViewModel schedulePlanViewModel2 = objectRef3.element;
                                        SchedulePlan editItem = objectRef3.element.getEditItem();
                                        schedulePlanViewModel2.setEditItem(editItem.copy((130815 & 1) != 0 ? editItem.uuid : null, (130815 & 2) != 0 ? editItem.name : it2, (130815 & 4) != 0 ? editItem.userId : null, (130815 & 8) != 0 ? editItem.gmtBegin : null, (130815 & 16) != 0 ? editItem.gmtEnd : null, (130815 & 32) != 0 ? editItem.remark : null, (130815 & 64) != 0 ? editItem.theme : null, (130815 & 128) != 0 ? editItem.projectUuid : null, (130815 & 256) != 0 ? editItem.config : null, (130815 & 512) != 0 ? editItem.ordinal : 0, (130815 & 1024) != 0 ? editItem.state : 0, (130815 & 2048) != 0 ? editItem.gmtCreate : null, (130815 & 4096) != 0 ? editItem.extField1 : null, (130815 & 8192) != 0 ? editItem.extField2 : null, (130815 & 16384) != 0 ? editItem.extField3 : null, (130815 & 32768) != 0 ? editItem.cc : 0, (130815 & 65536) != 0 ? editItem.cid : null));
                                    }
                                }, composer3, 6, 446);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("周期轮班", 0.0f, 0L, 0L, ComposableLambdaKt.composableLambda(composer2, -2085278914, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$2
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
                                    ComposerKt.traceEventStart(-2085278914, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchdulePlanEditView.kt:86)");
                                }
                                final Ref.ObjectRef<SchedulePlanViewModel> objectRef3 = objectRef2;
                                BoxViewKt.m6894SmallTipTextEx1dzz4("排序", 0L, 0.0f, 0.0f, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$2.1
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
                                        objectRef3.element.setFormType(FormType.INSTANCE.sort());
                                    }
                                }, composer3, 6, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 24582, 14);
                    PlanItemViewKt.EditPlanItemView(objectRef2.element.getEditItem(), null, new Function1<SchedulePlan, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SchedulePlan schedulePlan2) {
                            invoke2(schedulePlan2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SchedulePlan it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            objectRef2.element.setEditItem(it2);
                        }
                    }, composer2, 8, 2);
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("选择下列班次加入周期轮班", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(15), 0.0f, ComposableLambdaKt.composableLambda(composer2, -447707728, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$4
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
                                    ComposerKt.traceEventStart(-447707728, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchdulePlanEditView.kt:96)");
                                }
                                final Ref.ObjectRef<SchedulePlanViewModel> objectRef3 = objectRef2;
                                composer3.startReplaceableGroup(1098475987);
                                ComposerKt.sourceInformation(composer3, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer3, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(569784964);
                                for (final ScheduleWork scheduleWork : objectRef3.element.getPlans()) {
                                    WorkItemViewKt.m6759WorkItemViewKBW6s6s(scheduleWork, false, false, null, null, null, Size.normal, Dp.m6097constructorimpl(5), Dp.m6097constructorimpl(3), ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$4$1$1$1
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
                                            List mutableList = CollectionsKt.toMutableList((Collection) objectRef3.element.getEditItem().fetchPlans());
                                            ScheduleWork scheduleWork2 = scheduleWork;
                                            mutableList.add(scheduleWork2.copy((1048063 & 1) != 0 ? scheduleWork2.uuid : null, (1048063 & 2) != 0 ? scheduleWork2.name : null, (1048063 & 4) != 0 ? scheduleWork2.userId : null, (1048063 & 8) != 0 ? scheduleWork2.gmtBegin : null, (1048063 & 16) != 0 ? scheduleWork2.gmtEnd : null, (1048063 & 32) != 0 ? scheduleWork2.remark : null, (1048063 & 64) != 0 ? scheduleWork2.theme : null, (1048063 & 128) != 0 ? scheduleWork2.projectUuid : null, (1048063 & 256) != 0 ? scheduleWork2.complex : false, (1048063 & 512) != 0 ? scheduleWork2.config : null, (1048063 & 1024) != 0 ? scheduleWork2.ordinal : 0, (1048063 & 2048) != 0 ? scheduleWork2.fullDay : false, (1048063 & 4096) != 0 ? scheduleWork2.state : 0, (1048063 & 8192) != 0 ? scheduleWork2.gmtCreate : null, (1048063 & 16384) != 0 ? scheduleWork2.subId : CommonToolKt.uuid(), (1048063 & 32768) != 0 ? scheduleWork2.extField1 : null, (1048063 & 65536) != 0 ? scheduleWork2.extField2 : null, (1048063 & 131072) != 0 ? scheduleWork2.extField3 : null, (1048063 & 262144) != 0 ? scheduleWork2.cc : 0, (1048063 & 524288) != 0 ? scheduleWork2.cid : null));
                                            SchedulePlanViewModel schedulePlanViewModel2 = objectRef3.element;
                                            SchedulePlan editItem = objectRef3.element.getEditItem();
                                            String jSONString = JSON.toJSONString(mutableList);
                                            Intrinsics.checkNotNullExpressionValue(jSONString, "oldPlans.toJSONString()");
                                            schedulePlanViewModel2.setEditItem(editItem.copy((130815 & 1) != 0 ? editItem.uuid : null, (130815 & 2) != 0 ? editItem.name : null, (130815 & 4) != 0 ? editItem.userId : null, (130815 & 8) != 0 ? editItem.gmtBegin : null, (130815 & 16) != 0 ? editItem.gmtEnd : null, (130815 & 32) != 0 ? editItem.remark : null, (130815 & 64) != 0 ? editItem.theme : null, (130815 & 128) != 0 ? editItem.projectUuid : null, (130815 & 256) != 0 ? editItem.config : jSONString, (130815 & 512) != 0 ? editItem.ordinal : 0, (130815 & 1024) != 0 ? editItem.state : 0, (130815 & 2048) != 0 ? editItem.gmtCreate : null, (130815 & 4096) != 0 ? editItem.extField1 : null, (130815 & 8192) != 0 ? editItem.extField2 : null, (130815 & 16384) != 0 ? editItem.extField3 : null, (130815 & 32768) != 0 ? editItem.cc : 0, (130815 & 65536) != 0 ? editItem.cid : null));
                                        }
                                    }, 7, null), composer3, 114819080, 62);
                                }
                                composer3.endReplaceableGroup();
                                WorkItemViewKt.m6759WorkItemViewKBW6s6s(new ScheduleWork("empty", "空", null, null, null, null, "#999999", null, false, null, 0, false, 0, null, CommonToolKt.uuid(), null, null, null, 0, null, 1032124, null), false, false, null, null, null, Size.normal, Dp.m6097constructorimpl(5), Dp.m6097constructorimpl(3), ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$4$1$2
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
                                        List mutableList = CollectionsKt.toMutableList((Collection) objectRef3.element.getEditItem().fetchPlans());
                                        mutableList.add(new ScheduleWork("empty", "空", null, null, null, null, "#999999", null, false, null, 0, false, 0, null, CommonToolKt.uuid(), null, null, null, 0, null, 1032124, null));
                                        SchedulePlanViewModel schedulePlanViewModel2 = objectRef3.element;
                                        SchedulePlan editItem = objectRef3.element.getEditItem();
                                        String jSONString = JSON.toJSONString(mutableList);
                                        Intrinsics.checkNotNullExpressionValue(jSONString, "oldPlans.toJSONString()");
                                        schedulePlanViewModel2.setEditItem(editItem.copy((130815 & 1) != 0 ? editItem.uuid : null, (130815 & 2) != 0 ? editItem.name : null, (130815 & 4) != 0 ? editItem.userId : null, (130815 & 8) != 0 ? editItem.gmtBegin : null, (130815 & 16) != 0 ? editItem.gmtEnd : null, (130815 & 32) != 0 ? editItem.remark : null, (130815 & 64) != 0 ? editItem.theme : null, (130815 & 128) != 0 ? editItem.projectUuid : null, (130815 & 256) != 0 ? editItem.config : jSONString, (130815 & 512) != 0 ? editItem.ordinal : 0, (130815 & 1024) != 0 ? editItem.state : 0, (130815 & 2048) != 0 ? editItem.gmtCreate : null, (130815 & 4096) != 0 ? editItem.extField1 : null, (130815 & 8192) != 0 ? editItem.extField2 : null, (130815 & 16384) != 0 ? editItem.extField3 : null, (130815 & 32768) != 0 ? editItem.cc : 0, (130815 & 65536) != 0 ? editItem.cid : null));
                                    }
                                }, 7, null), composer3, 114819080, 62);
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
                    }), composer2, 102236160, 191);
                    ButtonViewKt.LongOkButton("保存", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$5
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
                            objectRef2.element.save(navHostController2);
                        }
                    }, composer2, 6, 0);
                    composer2.startReplaceableGroup(483306037);
                    if (!objectRef2.element.getEditItem().isAdd()) {
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        ButtonViewKt.LongDeleteButton(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$1$2$6
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
                                objectRef2.element.setFormType(FormType.Companion.delete$default(FormType.INSTANCE, null, 1, null));
                            }
                        }, composer2, 0, 1);
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
                    composer2.startReplaceableGroup(1282505505);
                    if (objectRef2.element.getFormType().isForm(FormTypeKt.DELETE)) {
                        DialogViewKt.DeleteDialog(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$2
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
                                objectRef2.element.doDelete(navHostController2);
                            }
                        }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$3
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
                                objectRef2.element.resetForm();
                            }
                        }, composer2, 0, 1);
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(115204729);
                    if (objectRef2.element.getFormType().isSort()) {
                        List<ScheduleWork> listFetchPlans = objectRef2.element.getEditItem().fetchPlans();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFetchPlans, 10));
                        Iterator<T> it2 = listFetchPlans.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((ScheduleWork) it2.next()).toSubSelect());
                        }
                        DialogViewKt.SortDialogView("轮班排序", arrayList, ComposableLambdaKt.composableLambda(composer2, 664633449, true, new Function3<String, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer3, Integer num) {
                                invoke(str, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(String v, Composer composer3, int i3) {
                                Intrinsics.checkNotNullParameter(v, "v");
                                if ((((i3 & 14) == 0 ? (composer3.changed(v) ? 4 : 2) | i3 : i3) & 91) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(664633449, i3, -1, "cn.jianyun.workplan.module.schedule.views.plan.SchedulePlanEditView.<anonymous>.<anonymous>.<anonymous> (SchdulePlanEditView.kt:151)");
                                }
                                for (ScheduleWork scheduleWork : objectRef2.element.getEditItem().fetchPlans()) {
                                    if (Intrinsics.areEqual(scheduleWork.getSubId(), v)) {
                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(scheduleWork, false, false, null, null, null, Size.normal, Dp.m6097constructorimpl(5), Dp.m6097constructorimpl(3), null, composer3, 114819080, 574);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }), new Function1<List<? extends String>, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                                invoke2((List<String>) list);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(List<String> it3) {
                                Intrinsics.checkNotNullParameter(it3, "it");
                                objectRef2.element.doSortWork(it3);
                                objectRef2.element.setFormType(new FormType(null, null, null, 7, null));
                            }
                        }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt$SchedulePlanEditView$1$1$7
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
                                objectRef2.element.setFormType(new FormType(null, null, null, 7, null));
                            }
                        }, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_CMAF_VIDEO_FIRSTSEG_CONNECT_TIME, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.plan.SchdulePlanEditViewKt.SchedulePlanEditView.2
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
                SchdulePlanEditViewKt.SchedulePlanEditView(navHostController, bundle, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}