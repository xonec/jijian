package cn.jianyun.workplan.module.schedule.views.alarm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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
import androidx.core.os.BundleKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import cn.jianyun.workplan.main.RouterKt;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.route.ScheduleRouter;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.FormItemKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.HeaderViewKt;
import cn.jianyun.workplan.ui.component.nav.PartTitleViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.C;
import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.MultiplePermissionsStateKt;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScheduleAlarmManageView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ScheduleAlarmManageView", "", "navHostController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleAlarmManageViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.google.accompanist.permissions.MultiplePermissionsState] */
    public static final void ScheduleAlarmManageView(final NavHostController navHostController, Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1715556944);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleAlarmManageView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1715556944, i, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageView (ScheduleAlarmManageView.kt:66)");
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
        BaseViewModel.tryReload$default((BaseViewModel) objectRef.element, null, 1, null);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Context context = (Context) objConsume;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = MultiplePermissionsStateKt.rememberMultiplePermissionsState(CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}), null, composerStartRestartGroup, 0, 2);
        HeaderViewKt.SimpleSubAppPageView(null, null, "班次提醒", ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2102990087, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt.ScheduleAlarmManageView.1
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
                boolean z;
                Composer composer3;
                int i3;
                float f2;
                int i4;
                int i5;
                String str;
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2102990087, i2, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageView.<anonymous> (ScheduleAlarmManageView.kt:78)");
                }
                List<PermissionState> permissions = objectRef2.element.getPermissions();
                boolean z2 = true;
                if (!(permissions instanceof Collection) || !permissions.isEmpty()) {
                    Iterator<T> it = permissions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!Intrinsics.areEqual(((PermissionState) it.next()).getStatus(), PermissionStatus.Granted.INSTANCE)) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                String str2 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                if (z) {
                    composer2.startReplaceableGroup(647141536);
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass2(objectRef, null), composer2, 70);
                    if (objectRef.element.getNewSize() == 0) {
                        composer2.startReplaceableGroup(647141806);
                        i5 = 10;
                        BoxViewKt.m6881EmptyIconDataViewjxWH9Kg("暂无提醒", 0, 0L, 0L, null, composer2, 6, 30);
                        composer2.endReplaceableGroup();
                        str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    } else {
                        i5 = 10;
                        composer2.startReplaceableGroup(647141888);
                        SnapshotStateList<ScheduleAlarm> datalist = objectRef.element.getDatalist();
                        final NavHostController navHostController2 = navHostController;
                        final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef3 = objectRef;
                        for (final ScheduleAlarm scheduleAlarm : datalist) {
                            GroupViewKt.m6850GroupViewfIyqwc(ClickableKt.m249clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$3$1
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
                                    RouterKt.navigateTo$default(navHostController2, ScheduleRouter.AlarmEdit.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(scheduleAlarm))), null, null, 12, null);
                                }
                            }, 7, null), false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(20), 0.0f, ComposableLambdaKt.composableLambda(composer2, -394676762, z2, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$3$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-394676762, i6, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageView.<anonymous>.<anonymous>.<anonymous> (ScheduleAlarmManageView.kt:99)");
                                        }
                                        final ScheduleAlarm scheduleAlarm2 = scheduleAlarm;
                                        final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef4 = objectRef3;
                                        BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer4, -1477076129, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$3$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i7) {
                                                int i8;
                                                if ((i7 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1477076129, i7, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleAlarmManageView.kt:100)");
                                                    }
                                                    final ScheduleAlarm scheduleAlarm3 = scheduleAlarm2;
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
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    composer5.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer5, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
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
                                                    String notifyTime = scheduleAlarm3.getNotifyTime();
                                                    TextDecoration textDecoration = (TextDecoration) CommonToolKt.ifv(scheduleAlarm3.getOpened(), TextDecoration.INSTANCE.getNone(), TextDecoration.INSTANCE.getLineThrough());
                                                    TextKt.m2471Text4IGK_g(notifyTime, (Modifier) null, ((Color) CommonToolKt.ifv(scheduleAlarm3.getOpened(), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, textDecoration, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 199680, 0, 130770);
                                                    composer5.startReplaceableGroup(1848909189);
                                                    if (scheduleAlarm3.getRefWork() != null) {
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(8), composer5, 6, 0);
                                                        ScheduleWork refWork = scheduleAlarm3.getRefWork();
                                                        Intrinsics.checkNotNull(refWork);
                                                        i8 = 0;
                                                        WorkItemViewKt.m6759WorkItemViewKBW6s6s(refWork, false, false, null, null, null, Size.small, 0.0f, 0.0f, null, composer5, 1572872, 958);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer5, 6, 0);
                                                        ScheduleWork refWork2 = scheduleAlarm3.getRefWork();
                                                        Intrinsics.checkNotNull(refWork2);
                                                        TextKt.m2471Text4IGK_g(refWork2.fetchShownTime(), (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3456, 0, 131058);
                                                    } else {
                                                        i8 = 0;
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(5), composer5, 6, i8);
                                                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer5, 1636328499, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$3$2$1$1$2
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i9) {
                                                            if ((i9 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1636328499, i9, -1, "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleAlarmManageView.kt:117)");
                                                                }
                                                                PartTitleViewKt.m6915TagViewo4cevVk((String) CommonToolKt.ifv(scheduleAlarm3.getAlarm(), "强提醒", "普通提醒"), 0L, false, 0.0f, false, ((Color) CommonToolKt.ifv(scheduleAlarm3.getOpened(), CommonToolKt.ifv(scheduleAlarm3.getAlarm(), Color.m3745boximpl(ColorKt.getDeleteColor()), Color.m3745boximpl(ColorKt.getThemeColor())), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl(), true, null, composer6, 1572864, 158);
                                                                float f3 = 3;
                                                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f3), composer6, 6, 0);
                                                                PartTitleViewKt.m6915TagViewo4cevVk(scheduleAlarm3.beforeInfo(), 0L, false, 0.0f, false, Color.INSTANCE.m3785getGray0d7_KjU(), true, null, composer6, 1769472, 158);
                                                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f3), composer6, 6, 0);
                                                                TextKt.m2471Text4IGK_g(scheduleAlarm3.getRemark(), (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 3456, 0, 131058);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 3072, 7);
                                                    if (scheduleAlarm3.getOpened()) {
                                                        composer5.startReplaceableGroup(1848910219);
                                                        BoxViewKt.m6892OnlySmallTipText8TGbp0M(String.valueOf(scheduleAlarm3.nextTimeInfo()), 0, 0L, 0L, 0.0f, null, composer5, 0, 62);
                                                        composer5.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1848910368);
                                                        TextKt.m2471Text4IGK_g("提醒已关闭", (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3462, 0, 131058);
                                                        composer5.endReplaceableGroup();
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    boolean opened = scheduleAlarm2.getOpened();
                                                    final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef5 = objectRef4;
                                                    final ScheduleAlarm scheduleAlarm4 = scheduleAlarm2;
                                                    FormItemKt.SingleSwitch(opened, new Function1<Boolean, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt.ScheduleAlarmManageView.1.3.2.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                            invoke(bool.booleanValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(boolean z3) {
                                                            objectRef5.element.doChangeState(scheduleAlarm4, z3);
                                                        }
                                                    }, composer5, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 3072, 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer2, 102236160, 190);
                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer2, 6, 0);
                            objectRef3 = objectRef3;
                            navHostController2 = navHostController2;
                            str2 = str2;
                            z2 = true;
                        }
                        str = str2;
                        composer2.endReplaceableGroup();
                    }
                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(50)), Dp.m6097constructorimpl(i5));
                    final NavHostController navHostController3 = navHostController;
                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt.ScheduleAlarmManageView.1.4
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
                            RouterKt.navigateTo$default(navHostController3, ScheduleRouter.AlarmEdit.INSTANCE.getRoute(), BundleKt.bundleOf(TuplesKt.to("model", JSON.toJSONString(new SchedulePlan(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, 131071, null)))), null, null, 12, null);
                        }
                    }, 7, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurface(), null, 2, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, str);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                    TextKt.m2471Text4IGK_g("添加提醒", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131070);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    f2 = 0.0f;
                    i4 = 1;
                    i3 = 0;
                } else {
                    composer3 = composer2;
                    composer3.startReplaceableGroup(647145142);
                    final Ref.ObjectRef<MultiplePermissionsState> objectRef4 = objectRef2;
                    final Ref.ObjectRef<ScheduleAlarmViewModel> objectRef5 = objectRef;
                    final Context context2 = context;
                    composer3.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    i3 = 0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                    composer3.startReplaceableGroup(-740915969);
                    if (objectRef4.element.getPermissions().get(0).getStatus() instanceof PermissionStatus.Denied) {
                        ButtonViewKt.LongOkButton("授权极简排班操作您的日历（更新数据）", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$6$1
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
                                if (PermissionsUtilKt.getShouldShowRationale(objectRef4.element.getPermissions().get(0).getStatus())) {
                                    objectRef4.element.getPermissions().get(0).launchPermissionRequest();
                                    return;
                                }
                                objectRef5.element.getBaseRepository().toast("请前往系统设置页面允许极简排班访问您的日历");
                                Intent intent = new Intent();
                                intent.addFlags(C.ENCODING_PCM_MU_LAW);
                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                                context2.startActivity(intent);
                            }
                        }, composer3, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    f2 = 0.0f;
                    i4 = 1;
                    CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                    composer3.startReplaceableGroup(647146616);
                    if (objectRef4.element.getPermissions().get(1).getStatus() instanceof PermissionStatus.Denied) {
                        ButtonViewKt.LongOkButton("授权极简排班查询您的日历（查询数据）", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$6$2
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
                                if (PermissionsUtilKt.getShouldShowRationale(objectRef4.element.getPermissions().get(1).getStatus())) {
                                    objectRef4.element.getPermissions().get(1).launchPermissionRequest();
                                    return;
                                }
                                objectRef5.element.getBaseRepository().toast("请前往系统设置页面允许极简排班访问您的日历");
                                Intent intent = new Intent();
                                intent.addFlags(C.ENCODING_PCM_MU_LAW);
                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                                context2.startActivity(intent);
                            }
                        }, composer3, 6, 0);
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                CommonUIKt.m6944BlankkHDZbjc(f2, composer3, i3, i4);
                GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, 0.0f, Dp.m6097constructorimpl(i3), 0.0f, ComposableSingletons$ScheduleAlarmManageViewKt.INSTANCE.m6748getLambda1$app_release(), composer2, 102236160, 191);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: ScheduleAlarmManageView.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$2", f = "ScheduleAlarmManageView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Ref.ObjectRef<ScheduleAlarmViewModel> $viewModel;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Ref.ObjectRef<ScheduleAlarmViewModel> objectRef, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$viewModel = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$viewModel, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$2$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: ScheduleAlarmManageView.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt$ScheduleAlarmManageView$1$2$1", f = "ScheduleAlarmManageView.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
                static final class C02141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.ObjectRef<ScheduleAlarmViewModel> $viewModel;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02141(Ref.ObjectRef<ScheduleAlarmViewModel> objectRef, Continuation<? super C02141> continuation) {
                        super(2, continuation);
                        this.$viewModel = objectRef;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C02141(this.$viewModel, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C02141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$viewModel.element.getBaseRepository().cache("calendarA", "1", this) == coroutine_suspended) {
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

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(this.$viewModel.element), null, null, new C02141(this.$viewModel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }), composerStartRestartGroup, 3456, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.alarm.ScheduleAlarmManageViewKt.ScheduleAlarmManageView.2
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
                ScheduleAlarmManageViewKt.ScheduleAlarmManageView(navHostController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}