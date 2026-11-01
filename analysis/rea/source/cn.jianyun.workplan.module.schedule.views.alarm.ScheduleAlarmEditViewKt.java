package cn.jianyun.workplan.module.schedule.views.alarm;

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
import androidx.compose.ui.graphics.Color;
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
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.model.FormType;
import cn.jianyun.workplan.model.FormTypeKt;
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyTimeTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.adgain.sdk.base.models.AdConstants;
import com.alibaba.fastjson2.JSON;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.apache.logging.log4j.message.ParameterizedMessage;

/* JADX INFO: compiled from: ScheduleAlarmEditView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScheduleAlarmEditView", "", "navHostController", "Landroidx/navigation/NavHostController;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavHostController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleAlarmEditViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, androidx.lifecycle.ViewModel] */
    public static final void ScheduleAlarmEditView(final NavHostController navHostController, final Bundle bundle, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1568732556);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleAlarmEditView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1568732556, i, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditView (ScheduleAlarmEditView.kt:60)");
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
        ?? ViewModel = ViewModelKt.viewModel((Class<??>) ScheduleAlarmViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        objectRef.element = ViewModel;
        final ScheduleAlarm editInfo = (ScheduleAlarm) JSON.parseObject(bundle != null ? bundle.getString("model") : null, ScheduleAlarm.class);
        ScheduleAlarmViewModel scheduleAlarmViewModel = (ScheduleAlarmViewModel) objectRef.element;
        Intrinsics.checkNotNullExpressionValue(editInfo, "editInfo");
        scheduleAlarmViewModel.initModel(editInfo);
        ScaffoldKt.m2126ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1351428635, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt.ScheduleAlarmEditView.1
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
                Composer composer3 = composer2;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1351428635, i2, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditView.<anonymous> (ScheduleAlarmEditView.kt:70)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                    final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef2 = objectRef;
                    ScheduleAlarm scheduleAlarm = editInfo;
                    final NavHostController navHostController2 = navHostController;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    int i3 = 0;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor);
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
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getBackground(), null, 2, null);
                    composer3.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor2);
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
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str = (String) CommonToolKt.ifv(scheduleAlarm.isAdd(), "添加提醒", "编辑提醒");
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$1
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
                    };
                    NavHostController navHostController3 = navHostController2;
                    String str2 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                    HeaderViewKt.HeaderView(str, function0, null, composer2, 0, 4);
                    float f2 = 10;
                    Modifier modifierM571paddingqDBjuR0$default = PaddingKt.m571paddingqDBjuR0$default(ScrollKt.verticalScroll$default(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(25)), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(80), 7, null);
                    composer3.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer3, str2);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM571paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor3);
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
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String str3 = "C79@3979L9:Column.kt#2w3rfo";
                    boolean z = true;
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("选择班次", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    composer3.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                    int i4 = -1323940314;
                    composer3.startReplaceableGroup(-1323940314);
                    String str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    ComposerKt.sourceInformation(composer3, str4);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierHorizontalScroll$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer2);
                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1791252425);
                    for (final ScheduleWork scheduleWork : objectRef2.element.getWorks()) {
                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m623widthInVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(8)), false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$1$1$1
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
                                objectRef2.element.setCurrentWork(scheduleWork);
                                ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef2.element;
                                ScheduleAlarm editItem = objectRef2.element.getEditItem();
                                scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : null, (131039 & 16) != 0 ? editItem.notifyTime : null, (131039 & 32) != 0 ? editItem.workUuid : scheduleWork.getUuid(), (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : false, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : null, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                            }
                        }, 7, null), ((Color) CommonToolKt.ifv(Intrinsics.areEqual(objectRef2.element.getEditItem().getWorkUuid(), scheduleWork.getUuid()), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i3).getSurface()))).m3765unboximpl(), null, 2, null), Dp.m6097constructorimpl(120), 0.0f, 2, null), Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f2));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        composer3.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer3, str2);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        composer3.startReplaceableGroup(i4);
                        ComposerKt.sourceInformation(composer3, str4);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, i3);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer2);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer3, Integer.valueOf(i3));
                        composer3.startReplaceableGroup(2058660585);
                        String str5 = str3;
                        ComposerKt.sourceInformationMarkerStart(composer3, 276693656, str5);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        Ref.ObjectRef<ScheduleAlarmViewModel> objectRef3 = objectRef2;
                        TextKt.m2471Text4IGK_g(scheduleWork.getName(), (Modifier) null, ((Color) CommonToolKt.ifv(Intrinsics.areEqual(objectRef2.element.getEditItem().getWorkUuid(), scheduleWork.getUuid()), Color.m3745boximpl(Color.INSTANCE.m3792getWhite0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131034);
                        TextKt.m2471Text4IGK_g(scheduleWork.fetchShownTime(), (Modifier) null, ((Color) CommonToolKt.ifv(Intrinsics.areEqual(objectRef3.element.getEditItem().getWorkUuid(), scheduleWork.getUuid()), Color.m3745boximpl(Color.INSTANCE.m3792getWhite0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        i3 = 0;
                        CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
                        composer3 = composer2;
                        z = true;
                        str3 = str5;
                        str4 = str4;
                        i4 = i4;
                        str2 = str2;
                        navHostController3 = navHostController3;
                        objectRef2 = objectRef3;
                    }
                    Composer composer4 = composer3;
                    final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef4 = objectRef2;
                    final NavHostController navHostController4 = navHostController3;
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxViewKt.m6891LeadingHintViewRuDwNsA("提醒设置", 0.0f, 0L, 0L, null, composer2, 6, 30);
                    int i5 = i3;
                    GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer4, 292736568, z, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i6) {
                            if ((i6 & 11) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(292736568, i6, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleAlarmEditView.kt:114)");
                                }
                                String beforeDay = objectRef4.element.getEditItem().getBeforeDay();
                                final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef5 = objectRef4;
                                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str6) {
                                        invoke2(str6);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it2) {
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef5.element;
                                        ScheduleAlarm editItem = objectRef5.element.getEditItem();
                                        scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : it2, (131039 & 16) != 0 ? editItem.notifyTime : null, (131039 & 32) != 0 ? editItem.workUuid : null, (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : false, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : null, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                                    }
                                };
                                List<SelectDO> BEFORE_NOTIFY_DAYS = SelectUtil.BEFORE_NOTIFY_DAYS;
                                Intrinsics.checkNotNullExpressionValue(BEFORE_NOTIFY_DAYS, "BEFORE_NOTIFY_DAYS");
                                FormItemKt.SelectItemView("什么时候提醒", false, false, false, beforeDay, function1, BEFORE_NOTIFY_DAYS, composer5, 2097158, 14);
                                String notifyTime = objectRef4.element.getEditItem().getNotifyTime();
                                final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef6 = objectRef4;
                                FormItemKt.TimePickerItemView3("提醒时间", notifyTime, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$2.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str6) {
                                        invoke2(str6);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it2) {
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef6.element;
                                        ScheduleAlarm editItem = objectRef6.element.getEditItem();
                                        scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : null, (131039 & 16) != 0 ? editItem.notifyTime : it2, (131039 & 32) != 0 ? editItem.workUuid : null, (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : false, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : null, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                                    }
                                }, composer5, 6);
                                boolean alarm = objectRef4.element.getEditItem().getAlarm();
                                final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef7 = objectRef4;
                                FormItemKt.SwitchItemView("是否强提醒", alarm, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$2.3
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
                                        ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef7.element;
                                        ScheduleAlarm editItem = objectRef7.element.getEditItem();
                                        scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : null, (131039 & 16) != 0 ? editItem.notifyTime : null, (131039 & 32) != 0 ? editItem.workUuid : null, (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : z2, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : null, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                                    }
                                }, composer5, 6);
                                composer5.startReplaceableGroup(-331836787);
                                if (objectRef4.element.getEditItem().getAlarm()) {
                                    PartTitleViewKt.m6915TagViewo4cevVk("开启后，系统日程提醒会有铃声提醒，不只是滴一下的那种提醒，但这个只有部分安卓机型支持", 0L, false, 0.0f, false, 0L, true, null, composer5, 1572870, 190);
                                }
                                composer5.endReplaceableGroup();
                                List listListOf = CollectionsKt.listOf((Object[]) new String[]{"上班打卡", "下班打卡"});
                                String remark = objectRef4.element.getEditItem().getRemark();
                                final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef8 = objectRef4;
                                FormItemKt.InputItemView("备注", false, false, false, null, false, remark, false, listListOf, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$2.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str6) {
                                        invoke2(str6);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String it2) {
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef8.element;
                                        ScheduleAlarm editItem = objectRef8.element.getEditItem();
                                        scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : null, (131039 & 16) != 0 ? editItem.notifyTime : null, (131039 & 32) != 0 ? editItem.workUuid : null, (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : false, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : it2, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                                    }
                                }, composer5, 100663302, 190);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }), composer2, 100663296, 255);
                    composer4.startReplaceableGroup(-1791249466);
                    if (!objectRef4.element.getCurrentWork().getFullDay()) {
                        BoxViewKt.m6891LeadingHintViewRuDwNsA("快捷选项", 0.0f, 0L, 0L, null, composer2, 6, 30);
                        List<SelectDO> listInitValues = SelectUtil.initValues("上班前30分钟", "a:30", "上班前10分钟", "a:10", "下班前5分钟", "b:5");
                        Intrinsics.checkNotNullExpressionValue(listInitValues, "initValues(\"上班前30分钟\", \"a… \"a:10\", \"下班前5分钟\", \"b:5\")");
                        PartTitleViewKt.m6913FlowTagView1tP8Re8(null, false, false, true, listInitValues, 0.0f, 0.0f, new Function1<String, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str6) {
                                invoke2(str6);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String mode) {
                                Object next;
                                Intrinsics.checkNotNullParameter(mode, "mode");
                                List<ScheduleWork> works = objectRef4.element.getWorks();
                                Ref.ObjectRef<ScheduleAlarmViewModel> objectRef5 = objectRef4;
                                Iterator<T> it2 = works.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!Intrinsics.areEqual(((ScheduleWork) next).getUuid(), objectRef5.element.getEditItem().getWorkUuid()));
                                ScheduleWork scheduleWork2 = (ScheduleWork) next;
                                if (scheduleWork2 == null) {
                                    objectRef4.element.getBaseRepository().toast("请先选择一个班次");
                                    return;
                                }
                                String gmtBegin = scheduleWork2.getGmtBegin();
                                String gmtEnd = scheduleWork2.getGmtEnd();
                                List listSplit$default = StringsKt.split$default((CharSequence) mode, new String[]{ParameterizedMessage.ERROR_MSG_SEPARATOR}, false, 0, 6, (Object) null);
                                String str6 = (String) listSplit$default.get(0);
                                String newTime = MyTimeTool.gapTime(Intrinsics.areEqual(str6, "b") ? gmtEnd : gmtBegin, -CommonToolKt.toIntData((String) listSplit$default.get(1)));
                                if (Intrinsics.areEqual(str6, "a")) {
                                    if (newTime.compareTo(gmtBegin) > 0) {
                                        ScheduleAlarmViewModel scheduleAlarmViewModel2 = objectRef4.element;
                                        ScheduleAlarm editItem = objectRef4.element.getEditItem();
                                        scheduleAlarmViewModel2.setEditItem(editItem.copy((131039 & 1) != 0 ? editItem.uuid : null, (131039 & 2) != 0 ? editItem.name : null, (131039 & 4) != 0 ? editItem.type : null, (131039 & 8) != 0 ? editItem.beforeDay : "-1", (131039 & 16) != 0 ? editItem.notifyTime : null, (131039 & 32) != 0 ? editItem.workUuid : null, (131039 & 64) != 0 ? editItem.projectUuid : null, (131039 & 128) != 0 ? editItem.alarm : false, (131039 & 256) != 0 ? editItem.opened : false, (131039 & 512) != 0 ? editItem.nextTime : null, (131039 & 1024) != 0 ? editItem.remark : null, (131039 & 2048) != 0 ? editItem.gmtCreate : null, (131039 & 4096) != 0 ? editItem.extField1 : null, (131039 & 8192) != 0 ? editItem.extField2 : null, (131039 & 16384) != 0 ? editItem.extField3 : null, (131039 & 32768) != 0 ? editItem.cc : 0, (131039 & 65536) != 0 ? editItem.cid : null));
                                    } else {
                                        ScheduleAlarmViewModel scheduleAlarmViewModel3 = objectRef4.element;
                                        ScheduleAlarm editItem2 = objectRef4.element.getEditItem();
                                        scheduleAlarmViewModel3.setEditItem(editItem2.copy((131039 & 1) != 0 ? editItem2.uuid : null, (131039 & 2) != 0 ? editItem2.name : null, (131039 & 4) != 0 ? editItem2.type : null, (131039 & 8) != 0 ? editItem2.beforeDay : AdConstants.FAIL, (131039 & 16) != 0 ? editItem2.notifyTime : null, (131039 & 32) != 0 ? editItem2.workUuid : null, (131039 & 64) != 0 ? editItem2.projectUuid : null, (131039 & 128) != 0 ? editItem2.alarm : false, (131039 & 256) != 0 ? editItem2.opened : false, (131039 & 512) != 0 ? editItem2.nextTime : null, (131039 & 1024) != 0 ? editItem2.remark : null, (131039 & 2048) != 0 ? editItem2.gmtCreate : null, (131039 & 4096) != 0 ? editItem2.extField1 : null, (131039 & 8192) != 0 ? editItem2.extField2 : null, (131039 & 16384) != 0 ? editItem2.extField3 : null, (131039 & 32768) != 0 ? editItem2.cc : 0, (131039 & 65536) != 0 ? editItem2.cid : null));
                                    }
                                }
                                if (Intrinsics.areEqual(str6, "b")) {
                                    if (gmtEnd.compareTo(gmtBegin) < 0) {
                                        ScheduleAlarmViewModel scheduleAlarmViewModel4 = objectRef4.element;
                                        ScheduleAlarm editItem3 = objectRef4.element.getEditItem();
                                        scheduleAlarmViewModel4.setEditItem(editItem3.copy((131039 & 1) != 0 ? editItem3.uuid : null, (131039 & 2) != 0 ? editItem3.name : null, (131039 & 4) != 0 ? editItem3.type : null, (131039 & 8) != 0 ? editItem3.beforeDay : "1", (131039 & 16) != 0 ? editItem3.notifyTime : null, (131039 & 32) != 0 ? editItem3.workUuid : null, (131039 & 64) != 0 ? editItem3.projectUuid : null, (131039 & 128) != 0 ? editItem3.alarm : false, (131039 & 256) != 0 ? editItem3.opened : false, (131039 & 512) != 0 ? editItem3.nextTime : null, (131039 & 1024) != 0 ? editItem3.remark : null, (131039 & 2048) != 0 ? editItem3.gmtCreate : null, (131039 & 4096) != 0 ? editItem3.extField1 : null, (131039 & 8192) != 0 ? editItem3.extField2 : null, (131039 & 16384) != 0 ? editItem3.extField3 : null, (131039 & 32768) != 0 ? editItem3.cc : 0, (131039 & 65536) != 0 ? editItem3.cid : null));
                                    } else {
                                        ScheduleAlarmViewModel scheduleAlarmViewModel5 = objectRef4.element;
                                        ScheduleAlarm editItem4 = objectRef4.element.getEditItem();
                                        scheduleAlarmViewModel5.setEditItem(editItem4.copy((131039 & 1) != 0 ? editItem4.uuid : null, (131039 & 2) != 0 ? editItem4.name : null, (131039 & 4) != 0 ? editItem4.type : null, (131039 & 8) != 0 ? editItem4.beforeDay : AdConstants.FAIL, (131039 & 16) != 0 ? editItem4.notifyTime : null, (131039 & 32) != 0 ? editItem4.workUuid : null, (131039 & 64) != 0 ? editItem4.projectUuid : null, (131039 & 128) != 0 ? editItem4.alarm : false, (131039 & 256) != 0 ? editItem4.opened : false, (131039 & 512) != 0 ? editItem4.nextTime : null, (131039 & 1024) != 0 ? editItem4.remark : null, (131039 & 2048) != 0 ? editItem4.gmtCreate : null, (131039 & 4096) != 0 ? editItem4.extField1 : null, (131039 & 8192) != 0 ? editItem4.extField2 : null, (131039 & 16384) != 0 ? editItem4.extField3 : null, (131039 & 32768) != 0 ? editItem4.cc : 0, (131039 & 65536) != 0 ? editItem4.cid : null));
                                    }
                                }
                                ScheduleAlarmViewModel scheduleAlarmViewModel6 = objectRef4.element;
                                ScheduleAlarm editItem5 = objectRef4.element.getEditItem();
                                Intrinsics.checkNotNullExpressionValue(newTime, "newTime");
                                scheduleAlarmViewModel6.setEditItem(editItem5.copy((131039 & 1) != 0 ? editItem5.uuid : null, (131039 & 2) != 0 ? editItem5.name : null, (131039 & 4) != 0 ? editItem5.type : null, (131039 & 8) != 0 ? editItem5.beforeDay : null, (131039 & 16) != 0 ? editItem5.notifyTime : newTime, (131039 & 32) != 0 ? editItem5.workUuid : null, (131039 & 64) != 0 ? editItem5.projectUuid : null, (131039 & 128) != 0 ? editItem5.alarm : false, (131039 & 256) != 0 ? editItem5.opened : false, (131039 & 512) != 0 ? editItem5.nextTime : null, (131039 & 1024) != 0 ? editItem5.remark : null, (131039 & 2048) != 0 ? editItem5.gmtCreate : null, (131039 & 4096) != 0 ? editItem5.extField1 : null, (131039 & 8192) != 0 ? editItem5.extField2 : null, (131039 & 16384) != 0 ? editItem5.extField3 : null, (131039 & 32768) != 0 ? editItem5.cc : 0, (131039 & 65536) != 0 ? editItem5.cid : null));
                            }
                        }, composer2, 35840, 103);
                    }
                    composer2.endReplaceableGroup();
                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(20), composer4, 6, i5);
                    ButtonViewKt.LongOkButton("保存", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$4
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
                            objectRef4.element.save(navHostController4);
                        }
                    }, composer4, 6, i5);
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer4, i5, 1);
                    composer4.startReplaceableGroup(331805235);
                    if (!objectRef4.element.getEditItem().isAdd()) {
                        ButtonViewKt.LongDeleteButton(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$1$2$5
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
                                objectRef4.element.setFormType(FormType.Companion.delete$default(FormType.INSTANCE, null, 1, null));
                            }
                        }, composer4, i5, 1);
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
                    composer4.startReplaceableGroup(1649189214);
                    if (objectRef4.element.getFormType().isForm(FormTypeKt.DELETE)) {
                        DialogViewKt.DeleteDialog(null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$2
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
                                objectRef4.element.doDelete(navHostController4);
                            }
                        }, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt$ScheduleAlarmEditView$1$1$3
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
                                objectRef4.element.resetForm();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmEditViewKt.ScheduleAlarmEditView.2
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
                ScheduleAlarmEditViewKt.ScheduleAlarmEditView(navHostController, bundle, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}