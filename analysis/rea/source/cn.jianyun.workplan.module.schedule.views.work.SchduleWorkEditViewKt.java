package cn.jianyun.workplan.module.schedule.views.work;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import androidx.room.FtsOptions;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PanelViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import cn.qsfty.workplan.component.CalendarViewKt;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SchduleWorkEditView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScheduleWorkEditView", "", "navHostController", "Landroidx/navigation/NavHostController;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavHostController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SchduleWorkEditViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, androidx.lifecycle.ViewModel] */
    public static final void ScheduleWorkEditView(final NavHostController navHostController, final Bundle bundle, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-526989389);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleWorkEditView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-526989389, i, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView (SchduleWorkEditView.kt:68)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) ScheduleWorkViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        ScheduleWork editInfo = (ScheduleWork) JSON.parseObject(bundle != null ? bundle.getString("model") : null, ScheduleWork.class);
        ScheduleWorkViewModel scheduleWorkViewModel = (ScheduleWorkViewModel) objectRef.element;
        Intrinsics.checkNotNullExpressionValue(editInfo, "editInfo");
        scheduleWorkViewModel.initModel(editInfo);
        ScaffoldKt.m2126ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -665216062, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt.ScheduleWorkEditView.1
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
                        ComposerKt.traceEventStart(-665216062, i2, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous> (SchduleWorkEditView.kt:78)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef2 = objectRef;
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
                    HeaderViewKt.HeaderView((String) CommonToolKt.ifv(objectRef2.element.getEditItem().isAdd(), "添加班次", "编辑班次"), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$1
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
                    float f2 = 10;
                    Modifier modifierM571paddingqDBjuR0$default = PaddingKt.m571paddingqDBjuR0$default(ScrollKt.verticalScroll$default(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(25)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(80), 7, null);
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
                    composer2.startReplaceableGroup(1174614086);
                    if (objectRef2.element.getEditItem().isAdd()) {
                        BoxViewKt.m6876CenterRowdjqsMU(null, Dp.m6097constructorimpl(f2), 0.0f, ComposableLambdaKt.composableLambda(composer2, -2050933570, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$1
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
                                        ComposerKt.traceEventStart(-2050933570, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:94)");
                                    }
                                    String str = (String) CommonToolKt.ifv(objectRef2.element.getEditItem().getComplex(), "combine", FtsOptions.TOKENIZER_SIMPLE);
                                    List<SelectDO> WORK_TYPES = SelectUtil.WORK_TYPES;
                                    Intrinsics.checkNotNullExpressionValue(WORK_TYPES, "WORK_TYPES");
                                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef3 = objectRef2;
                                    FormItemKt.m6844SegmentPickerViewJkgoBcI(str, 0.0f, WORK_TYPES, 0.0f, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$1.1
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
                                        public final void invoke2(String it2) {
                                            Intrinsics.checkNotNullParameter(it2, "it");
                                            ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef3.element;
                                            ScheduleWork editItem = objectRef3.element.getEditItem();
                                            scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : Intrinsics.areEqual(it2, "combine"), (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
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
                        }), composer2, 3120, 5);
                    }
                    composer2.endReplaceableGroup();
                    if (objectRef2.element.getEditItem().getComplex()) {
                        composer2.startReplaceableGroup(1174614555);
                        PanelViewKt.m6912PanelView3f6hBDE("了解组合班次?", null, false, false, 0L, false, ComposableSingletons$SchduleWorkEditViewKt.INSTANCE.m6756getLambda1$app_release(), composer2, 1572870, 62);
                        boolean z = true;
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 812995405, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$2
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
                                        ComposerKt.traceEventStart(812995405, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:111)");
                                    }
                                    String name = objectRef2.element.getEditItem().getName();
                                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef3 = objectRef2;
                                    FormItemKt.InputItemView("组合班次命名", false, false, false, null, false, name, false, null, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$2.1
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
                                            ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef3.element;
                                            ScheduleWork editItem = objectRef3.element.getEditItem();
                                            scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : it2, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
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
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("从已有普通班次中选择两个", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        composer2.startReplaceableGroup(1174615523);
                        for (final ScheduleWork scheduleWork : objectRef2.element.getDatalist()) {
                            if (!scheduleWork.getComplex()) {
                                GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$3$1
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
                                        objectRef2.element.toggleWork(scheduleWork.getUuid());
                                    }
                                }, 7, null), false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(20), 0.0f, ComposableLambdaKt.composableLambda(composer2, -2062850109, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$3$2
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
                                                ComposerKt.traceEventStart(-2062850109, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:125)");
                                            }
                                            final ScheduleWork scheduleWork2 = scheduleWork;
                                            final Ref.ObjectRef<ScheduleWorkViewModel> objectRef3 = objectRef2;
                                            BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -363725718, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$3$2.1
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
                                                            ComposerKt.traceEventStart(-363725718, i4, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:126)");
                                                        }
                                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(scheduleWork2, false, false, null, null, null, null, 0.0f, 0.0f, null, composer4, 8, 1022);
                                                        if (objectRef3.element.getChoosedWorks().contains(scheduleWork2.getUuid())) {
                                                            float f3 = 20;
                                                            BoxViewKt.m6874BoxView536wdKU(String.valueOf(objectRef3.element.getChoosedWorks().indexOf(scheduleWork2.getUuid()) + 1), 0L, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f3), ColorKt.getThemeColor(), Dp.m6097constructorimpl(5), composer4, 224640, 2);
                                                        }
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
                                }), composer2, 102236160, 190);
                            }
                            z = true;
                        }
                        composer2.endReplaceableGroup();
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("样式预览", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        BoxViewKt.m6876CenterRowdjqsMU(null, Dp.m6097constructorimpl(20), 0.0f, ComposableLambdaKt.composableLambda(composer2, 1830226023, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$4
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
                                        ComposerKt.traceEventStart(1830226023, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:138)");
                                    }
                                    Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(SizeKt.m602height3ABfNKs(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null), Dp.m6097constructorimpl(88)), Dp.m6097constructorimpl(6), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(3), 1, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Ref.ObjectRef<ScheduleWorkViewModel> objectRef3 = objectRef2;
                                    composer3.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default);
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
                                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                    Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(40)), Dp.m6097constructorimpl(32));
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM602height3ABfNKs);
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
                                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g("21", SizeKt.m621width3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(26)), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), TextUnitKt.getSp(12), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196662, 6, 129496);
                                    CalendarViewKt.m6968VerticalViewg5HRv50("初六", 0L, TextUnitKt.getSp(8), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(97308571);
                                    if (!Intrinsics.areEqual(objectRef3.element.fetchFirstWork().getName(), "")) {
                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(objectRef3.element.fetchFirstWork(), false, false, null, null, null, Size.small, 0.0f, 0.0f, null, composer3, 1572872, 958);
                                    }
                                    composer3.endReplaceableGroup();
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(2), composer3, 6, 0);
                                    composer3.startReplaceableGroup(-1074275078);
                                    if (!Intrinsics.areEqual(objectRef3.element.fetchSecondWork().getName(), "")) {
                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(objectRef3.element.fetchSecondWork(), false, false, null, null, null, Size.small, 0.0f, 0.0f, null, composer3, 1572872, 958);
                                    }
                                    composer3.endReplaceableGroup();
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
                        }), composer2, 3120, 5);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1174618358);
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("基本信息", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1792284068, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5
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
                                        ComposerKt.traceEventStart(1792284068, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:175)");
                                    }
                                    String name = objectRef2.element.getEditItem().getName();
                                    List listListOf = CollectionsKt.listOf((Object[]) new String[]{"早班", "中班", "晚班", "白班", "夜班", "休息", "请假", "休假"});
                                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef3 = objectRef2;
                                    FormItemKt.InputItemView("班次名称", false, false, false, null, false, name, false, listListOf, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.1
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
                                            ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef3.element;
                                            ScheduleWork editItem = objectRef3.element.getEditItem();
                                            scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : it2, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                        }
                                    }, composer3, 100663302, 190);
                                    boolean fullDay = objectRef2.element.getEditItem().getFullDay();
                                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef4 = objectRef2;
                                    FormItemKt.SwitchItemView("是否全天", fullDay, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean z2) {
                                            ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef4.element;
                                            ScheduleWork editItem = objectRef4.element.getEditItem();
                                            scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : z2, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                        }
                                    }, composer3, 6);
                                    composer3.startReplaceableGroup(-1074273980);
                                    if (!objectRef2.element.getEditItem().getFullDay()) {
                                        String gmtBegin = objectRef2.element.getEditItem().getGmtBegin();
                                        final Ref.ObjectRef<ScheduleWorkViewModel> objectRef5 = objectRef2;
                                        FormItemKt.TimePickerItemView3("开始时间", gmtBegin, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.3
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
                                                ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef5.element;
                                                ScheduleWork editItem = objectRef5.element.getEditItem();
                                                scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : it2, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                            }
                                        }, composer3, 6);
                                        String gmtEnd = objectRef2.element.getEditItem().getGmtEnd();
                                        final Ref.ObjectRef<ScheduleWorkViewModel> objectRef6 = objectRef2;
                                        FormItemKt.TimePickerItemView3("结束时间", gmtEnd, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.4
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
                                                ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef6.element;
                                                ScheduleWork editItem = objectRef6.element.getEditItem();
                                                scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : it2, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                            }
                                        }, composer3, 6);
                                        String extField1 = objectRef2.element.getEditItem().getExtField1();
                                        final Ref.ObjectRef<ScheduleWorkViewModel> objectRef7 = objectRef2;
                                        FormItemKt.TimePickerItemView3("休息时长", extField1, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.5
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
                                                ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef7.element;
                                                ScheduleWork editItem = objectRef7.element.getEditItem();
                                                scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : null, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : it2, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                            }
                                        }, composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    String theme = objectRef2.element.getEditItem().getTheme();
                                    final Ref.ObjectRef<ScheduleWorkViewModel> objectRef8 = objectRef2;
                                    FormItemKt.ColorSelectItemView("班次颜色", theme, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$5.6
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
                                            ScheduleWorkViewModel scheduleWorkViewModel2 = objectRef8.element;
                                            ScheduleWork editItem = objectRef8.element.getEditItem();
                                            scheduleWorkViewModel2.setEditItem(editItem.copy((1048063 & 1) != 0 ? editItem.uuid : null, (1048063 & 2) != 0 ? editItem.name : null, (1048063 & 4) != 0 ? editItem.userId : null, (1048063 & 8) != 0 ? editItem.gmtBegin : null, (1048063 & 16) != 0 ? editItem.gmtEnd : null, (1048063 & 32) != 0 ? editItem.remark : null, (1048063 & 64) != 0 ? editItem.theme : it2, (1048063 & 128) != 0 ? editItem.projectUuid : null, (1048063 & 256) != 0 ? editItem.complex : false, (1048063 & 512) != 0 ? editItem.config : null, (1048063 & 1024) != 0 ? editItem.ordinal : 0, (1048063 & 2048) != 0 ? editItem.fullDay : false, (1048063 & 4096) != 0 ? editItem.state : 0, (1048063 & 8192) != 0 ? editItem.gmtCreate : null, (1048063 & 16384) != 0 ? editItem.subId : null, (1048063 & 32768) != 0 ? editItem.extField1 : null, (1048063 & 65536) != 0 ? editItem.extField2 : null, (1048063 & 131072) != 0 ? editItem.extField3 : null, (1048063 & 262144) != 0 ? editItem.cc : 0, (1048063 & 524288) != 0 ? editItem.cid : null));
                                        }
                                    }, composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 100663296, 255);
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("样式预览", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        GroupViewKt.m6848CenterGroupViewJ8oBhFo(null, false, 0.0f, 0.0f, Dp.m6097constructorimpl(20), 0.0f, ComposableLambdaKt.composableLambda(composer2, -175462441, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$6
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
                                        ComposerKt.traceEventStart(-175462441, i3, -1, "cn.jianyun.workplan.module.schedule.views.work.ScheduleWorkEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchduleWorkEditView.kt:223)");
                                    }
                                    if (!Intrinsics.areEqual(objectRef2.element.getEditItem().getName(), "") && !Intrinsics.areEqual(objectRef2.element.getEditItem().getTheme(), "")) {
                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(objectRef2.element.getEditItem(), false, false, null, null, null, null, 0.0f, 0.0f, null, composer3, 8, 1022);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 1597440, 47);
                        composer2.endReplaceableGroup();
                    }
                    ButtonViewKt.LongOkButton("保存", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$7
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
                    composer2.startReplaceableGroup(-656620167);
                    if (!objectRef2.element.getEditItem().isAdd()) {
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        ButtonViewKt.LongDeleteButton(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$1$2$8
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
                    composer2.startReplaceableGroup(1506868420);
                    if (objectRef2.element.getFormType().isDelete()) {
                        DialogViewKt.DeleteDialog(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$2
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
                        }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt$ScheduleWorkEditView$1$1$3
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.SchduleWorkEditViewKt.ScheduleWorkEditView.2
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
                SchduleWorkEditViewKt.ScheduleWorkEditView(navHostController, bundle, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}