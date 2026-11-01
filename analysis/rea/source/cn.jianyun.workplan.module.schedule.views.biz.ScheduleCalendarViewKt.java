package cn.jianyun.workplan.module.schedule.views.biz;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.model.MonthDateInfo;
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyDateTool;
import cn.qsfty.workplan.component.CalendarViewKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: ScheduleCalendarView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aB\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001aB\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0010"}, d2 = {"BottomNavView", "", "viewModel", "Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;", "(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Landroidx/compose/runtime/Composer;I)V", "ScheduleCalendarBodyView", "monthInfos", "", "Lcn/jianyun/workplan/model/MonthDateInfo;", "content", "Lkotlin/Function1;", "Ljava/util/Date;", "Landroidx/compose/runtime/Composable;", "(Lcn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel;Ljava/util/List;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "ScheduleCalendarMonthView", "ScheduleCalendarView", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScheduleCalendarViewKt {
    public static final void ScheduleCalendarView(final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1447228724);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleCalendarView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1447228724, i, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarView (ScheduleCalendarView.kt:71)");
        }
        Date currentDate = viewModel.getCurrentDate();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(currentDate);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MyDateTool.getStartDayOfMonth(viewModel.getCurrentDate());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Date date = (Date) objRememberedValue;
        Boolean boolValueOf = Boolean.valueOf(viewModel.getConfig().getShowFestival());
        Map<String, FestivalData> holidayMap = viewModel.getHolidayMap();
        composerStartRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean zChanged2 = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(holidayMap);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = viewModel.getConfig().getShowFestival() ? viewModel.getHolidayMap() : MapsKt.emptyMap();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Map map = (Map) objRememberedValue2;
        Object[] objArr = {Boolean.valueOf(viewModel.getConfig().isMondayFirst()), Boolean.valueOf(viewModel.getConfig().getFillCalendar()), Boolean.valueOf(viewModel.getConfig().getShowFestival()), viewModel.getHolidayMap()};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged3 = false;
        for (int i2 = 0; i2 < 4; i2++) {
            zChanged3 |= composerStartRestartGroup.changed(objArr[i2]);
        }
        LinkedHashMap linkedHashMapRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || linkedHashMapRememberedValue == Composer.INSTANCE.getEmpty()) {
            linkedHashMapRememberedValue = new LinkedHashMap();
            composerStartRestartGroup.updateRememberedValue(linkedHashMapRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Map map2 = (Map) linkedHashMapRememberedValue;
        List<ScheduleWork> works = viewModel.getWorks();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(works, 10)), 16));
        for (Object obj : works) {
            linkedHashMap.put(((ScheduleWork) obj).getUuid(), obj);
        }
        List<ScheduleDuty> dutys = viewModel.getDutys();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(dutys, 10)), 16));
        for (ScheduleDuty scheduleDuty : dutys) {
            String day = scheduleDuty.getDay();
            ScheduleWork scheduleWork = (ScheduleWork) linkedHashMap.get(scheduleDuty.getWorkUuid());
            if (scheduleWork == null) {
                scheduleWork = new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
            }
            ScheduleWork scheduleWork2 = (ScheduleWork) linkedHashMap.get(scheduleDuty.getSecondWorkUuid());
            if (scheduleWork2 == null) {
                scheduleWork2 = new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null);
            }
            Pair pair = TuplesKt.to(day, new CalendarDayUi(scheduleWork, scheduleWork2, scheduleDuty.getRemark()));
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(date, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue3;
        composerStartRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue4 = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, 0, composerStartRestartGroup, 6, 2);
        final FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$currentVisibleIndex$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    return Integer.valueOf(lazyListStateRememberLazyListState.getFirstVisibleItemIndex());
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State state = (State) objRememberedValue5;
        EffectsKt.LaunchedEffect(Integer.valueOf(ScheduleCalendarView$lambda$9(state)), new AnonymousClass1(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, date, viewModel, state, mutableState, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(date, new AnonymousClass2(date, lazyListStateRememberLazyListState, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, mutableState, null), composerStartRestartGroup, 72);
        float fM6097constructorimpl = Dp.m6097constructorimpl(2);
        final int i3 = LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        GroupViewKt.m6850GroupViewfIyqwc(null, false, false, 0.0f, 0.0f, fM6097constructorimpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1969702723, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1969702723, i4, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarView.<anonymous> (ScheduleCalendarView.kt:126)");
                    }
                    CalendarViewKt.CalendarHeaderView(viewModel.getConfig().isMondayFirst(), composer2, 0, 0);
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Integer.valueOf(i3), new AnonymousClass1(coroutineScope, i3, lazyListStateRememberLazyListState, null));
                    LazyListState lazyListState = lazyListStateRememberLazyListState;
                    FlingBehavior flingBehavior = flingBehaviorRememberSnapFlingBehavior;
                    final int i5 = i3;
                    final Map<String, List<List<MonthDateInfo>>> map3 = map2;
                    final MutableState<Date> mutableState2 = mutableState;
                    final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                    final Map<String, FestivalData> map4 = map;
                    final Map<String, CalendarDayUi> map5 = linkedHashMap2;
                    LazyDslKt.LazyRow(modifierPointerInput, lazyListState, null, false, null, null, flingBehavior, false, new Function1<LazyListScope, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyRow) {
                            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                            AnonymousClass1 anonymousClass1 = new Function1<Integer, Object>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.2.1
                                public final Object invoke(int i6) {
                                    return Integer.valueOf(i6);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }
                            };
                            final int i6 = i5;
                            final Map<String, List<List<MonthDateInfo>>> map6 = map3;
                            final MutableState<Date> mutableState3 = mutableState2;
                            final ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                            final Map<String, FestivalData> map7 = map4;
                            final Map<String, CalendarDayUi> map8 = map5;
                            LazyListScope.items$default(LazyRow, Integer.MAX_VALUE, anonymousClass1, null, ComposableLambdaKt.composableLambdaInstance(1153839480, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope items, int i7, Composer composer3, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(items, "$this$items");
                                    if ((i8 & 14) == 0) {
                                        i9 = (composer3.changed(items) ? 4 : 2) | i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i8 & 112) == 0) {
                                        i9 |= composer3.changed(i7) ? 32 : 16;
                                    }
                                    if ((i9 & 731) != 146 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1153839480, i8, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarView.<anonymous>.<anonymous>.<anonymous> (ScheduleCalendarView.kt:165)");
                                        }
                                        Date startDayOfMonth = MyDateTool.getStartDayOfMonth(MyDateTool.gapMonth(ScheduleCalendarViewKt.ScheduleCalendarView$lambda$6(mutableState3), i7 - i6));
                                        String monthKey = MyDateTool.toMonthString(startDayOfMonth);
                                        Map<String, List<List<MonthDateInfo>>> map9 = map6;
                                        Intrinsics.checkNotNullExpressionValue(monthKey, "monthKey");
                                        ScheduleMasterViewModel scheduleMasterViewModel3 = scheduleMasterViewModel2;
                                        Map<String, FestivalData> map10 = map7;
                                        List<List<MonthDateInfo>> monthInfo = map9.get(monthKey);
                                        if (monthInfo == null) {
                                            monthInfo = MyDateTool.getMonthInfo(startDayOfMonth, scheduleMasterViewModel3.getConfig().isMondayFirst(), map10, scheduleMasterViewModel3.getConfig().getFillCalendar());
                                            Intrinsics.checkNotNullExpressionValue(monthInfo, "getMonthInfo(\n          …dar\n                    )");
                                            map9.put(monthKey, monthInfo);
                                        }
                                        List<List<MonthDateInfo>> list = monthInfo;
                                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(LazyItemScope.fillParentMaxWidth$default(items, Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                                        Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                                        final ScheduleMasterViewModel scheduleMasterViewModel4 = scheduleMasterViewModel2;
                                        final Map<String, CalendarDayUi> map11 = map8;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentSize$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer3);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ScheduleCalendarViewKt.ScheduleCalendarMonthView(scheduleMasterViewModel4, list, ComposableLambdaKt.composableLambda(composer3, 1645569441, true, new Function3<Date, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$2$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Date date2, Composer composer4, Integer num) {
                                                invoke(date2, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Date date2, Composer composer4, int i10) {
                                                Intrinsics.checkNotNullParameter(date2, "date");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1645569441, i10, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScheduleCalendarView.kt:184)");
                                                }
                                                CalendarDayUi calendarDayUi = map11.get(CommonDateToolKt.dateStr(date2));
                                                if (calendarDayUi == null) {
                                                    calendarDayUi = new CalendarDayUi(new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null), new ScheduleWork(null, null, null, null, null, null, null, null, false, null, 0, false, 0, null, null, null, null, null, 0, null, 1048575, null), "");
                                                }
                                                CalendarDayUi calendarDayUi2 = calendarDayUi;
                                                float f2 = 3;
                                                WorkItemViewKt.m6759WorkItemViewKBW6s6s(calendarDayUi2.getFirstWork(), scheduleMasterViewModel4.getConfig().getShowBeginTime(), scheduleMasterViewModel4.getConfig().getShowEndTime(), scheduleMasterViewModel4.getConfig().getWorkFontSize(), scheduleMasterViewModel4.getConfig().getTimeFontSize(), scheduleMasterViewModel4.getConfig().getWorkRadius(), Size.small, Dp.m6097constructorimpl(f2), 0.0f, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 819462152, 256);
                                                composer4.startReplaceableGroup(1537275818);
                                                if (!Intrinsics.areEqual(calendarDayUi2.getSecondWork().getName(), "")) {
                                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(2), composer4, 6, 0);
                                                    WorkItemViewKt.m6759WorkItemViewKBW6s6s(calendarDayUi2.getSecondWork(), scheduleMasterViewModel4.getConfig().getShowBeginTime(), scheduleMasterViewModel4.getConfig().getShowEndTime(), scheduleMasterViewModel4.getConfig().getWorkFontSize(), scheduleMasterViewModel4.getConfig().getTimeFontSize(), scheduleMasterViewModel4.getConfig().getWorkRadius(), Size.small, Dp.m6097constructorimpl(f2), 0.0f, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer4, 819462152, 256);
                                                }
                                                composer4.endReplaceableGroup();
                                                if (scheduleMasterViewModel4.getConfig().getShowRemark()) {
                                                    TextKt.m2471Text4IGK_g(calendarDayUi2.getRemark(), (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(8), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3456, 6, 130034);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_CMAF_HTTP_RES_FINISH_TIME);
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
                            }), 4, null);
                        }
                    }, composer2, 12582912, 60);
                    ScheduleCalendarViewKt.BottomNavView(viewModel, composer2, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1, reason: invalid class name */
            /* JADX INFO: compiled from: ScheduleCalendarView.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1", f = "ScheduleCalendarView.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ int $baseIndex;
                final /* synthetic */ LazyListState $listState;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CoroutineScope coroutineScope, int i, LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$scope = coroutineScope;
                    this.$baseIndex = i;
                    this.$listState = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$baseIndex, this.$listState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        final Ref.FloatRef floatRef = new Ref.FloatRef();
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m6749invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m6749invokek4lQ0M(long j) {
                                floatRef.element = 0.0f;
                            }
                        };
                        final CoroutineScope coroutineScope = this.$scope;
                        final int i2 = this.$baseIndex;
                        final LazyListState lazyListState = this.$listState;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.1.2
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
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C02171(floatRef, i2, lazyListState, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1$2$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: ScheduleCalendarView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1$2$1", f = "ScheduleCalendarView.kt", i = {}, l = {152, 154}, m = "invokeSuspend", n = {}, s = {})
                            static final class C02171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ int $baseIndex;
                                final /* synthetic */ LazyListState $listState;
                                final /* synthetic */ Ref.FloatRef $totalDrag;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02171(Ref.FloatRef floatRef, int i, LazyListState lazyListState, Continuation<? super C02171> continuation) {
                                    super(2, continuation);
                                    this.$totalDrag = floatRef;
                                    this.$baseIndex = i;
                                    this.$listState = lazyListState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C02171(this.$totalDrag, this.$baseIndex, this.$listState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C02171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    int i;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        if (Math.abs(this.$totalDrag.element) >= 80.0f) {
                                            if (this.$totalDrag.element > 0.0f) {
                                                i = this.$baseIndex - 1;
                                            } else {
                                                i = this.$baseIndex + 1;
                                            }
                                            LazyListState lazyListState = this.$listState;
                                            this.label = 1;
                                            if (LazyListState.animateScrollToItem$default(lazyListState, i, 0, this, 2, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            this.label = 2;
                                            if (LazyListState.animateScrollToItem$default(this.$listState, this.$baseIndex, 0, this, 2, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1 && i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        final CoroutineScope coroutineScope2 = this.$scope;
                        final LazyListState lazyListState2 = this.$listState;
                        final int i3 = this.$baseIndex;
                        this.label = 1;
                        if (DragGestureDetectorKt.detectHorizontalDragGestures(pointerInputScope, function1, function0, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.1.3
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
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C02191(lazyListState2, i3, null), 3, null);
                            }

                            /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1$3$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: ScheduleCalendarView.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$3$1$3$1", f = "ScheduleCalendarView.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
                            static final class C02191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ int $baseIndex;
                                final /* synthetic */ LazyListState $listState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02191(LazyListState lazyListState, int i, Continuation<? super C02191> continuation) {
                                    super(2, continuation);
                                    this.$listState = lazyListState;
                                    this.$baseIndex = i;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C02191(this.$listState, this.$baseIndex, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C02191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (LazyListState.animateScrollToItem$default(this.$listState, this.$baseIndex, 0, this, 2, null) == coroutine_suspended) {
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
                        }, new Function2<PointerInputChange, Float, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.3.1.4
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f2) {
                                invoke(pointerInputChange, f2.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PointerInputChange change, float f2) {
                                Intrinsics.checkNotNullParameter(change, "change");
                                floatRef.element += f2;
                            }
                        }, this) == coroutine_suspended) {
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
        }), composerStartRestartGroup, 100859904, MediaPlayer.MEDIA_PLAYER_OPTION_OUTPUT_LOG);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarView.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                ScheduleCalendarViewKt.ScheduleCalendarView(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date ScheduleCalendarView$lambda$6(MutableState<Date> mutableState) {
        return mutableState.getValue();
    }

    public static final void ScheduleCalendarMonthView(final ScheduleMasterViewModel viewModel, final List<? extends List<MonthDateInfo>> monthInfos, final Function3<? super Date, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(monthInfos, "monthInfos");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1378834565);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleCalendarMonthView)P(2,1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1378834565, i, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarMonthView (ScheduleCalendarView.kt:228)");
        }
        ScheduleCalendarBodyView(viewModel, monthInfos, content, composerStartRestartGroup, (i & 896) | 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarMonthView.1
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

            public final void invoke(Composer composer2, int i2) {
                ScheduleCalendarViewKt.ScheduleCalendarMonthView(viewModel, monthInfos, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final void BottomNavView(final ScheduleMasterViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-437903973);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomNavView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-437903973, i, -1, "cn.jianyun.workplan.module.schedule.views.biz.BottomNavView (ScheduleCalendarView.kt:233)");
        }
        BoxViewKt.m6895TwoColumnViewdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1551979348, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.BottomNavView.1
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
                        ComposerKt.traceEventStart(1551979348, i2, -1, "cn.jianyun.workplan.module.schedule.views.biz.BottomNavView.<anonymous> (ScheduleCalendarView.kt:234)");
                    }
                    float f2 = 6;
                    Modifier modifierM6955mainBg9IZ8Weo = CommonUIKt.m6955mainBg9IZ8Weo(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), 0L, composer2, 54, 2);
                    final ScheduleMasterViewModel scheduleMasterViewModel = viewModel;
                    float f3 = 10;
                    float f4 = 3;
                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(modifierM6955mainBg9IZ8Weo, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.BottomNavView.1.1
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
                            ScheduleMasterViewModel scheduleMasterViewModel2 = scheduleMasterViewModel;
                            Date startDayOfMonth = MyDateTool.getStartDayOfMonth(MyDateTool.gapMonth(scheduleMasterViewModel2.getCurrentDate(), -1));
                            Intrinsics.checkNotNullExpressionValue(startDayOfMonth, "getStartDayOfMonth(\n    …te, -1)\n                )");
                            scheduleMasterViewModel2.setCurrentDate(startDayOfMonth);
                            scheduleMasterViewModel.doChange();
                        }
                    }, 7, null), Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
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
                    IconViewKt.m6909IconViewRidXid8(60000, 0L, Color.INSTANCE.m3785getGray0d7_KjU(), false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 26);
                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f4), composer2, 6, 0);
                    TextKt.m2471Text4IGK_g("上个月", (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(57567580);
                    if (!Intrinsics.areEqual(viewModel.getCurrentDateStr(), MyDateTool.toDateString(new Date()))) {
                        Modifier modifierM6955mainBg9IZ8Weo2 = CommonUIKt.m6955mainBg9IZ8Weo(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), 0L, composer2, 54, 2);
                        final ScheduleMasterViewModel scheduleMasterViewModel2 = viewModel;
                        TextKt.m2471Text4IGK_g("今天", SizeKt.wrapContentSize$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6955mainBg9IZ8Weo2, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.BottomNavView.1.3
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
                                scheduleMasterViewModel2.setCurrentDate(new Date());
                                scheduleMasterViewModel2.doChange();
                            }
                        }, 7, null), Dp.m6097constructorimpl(60)), Dp.m6097constructorimpl(30)), null, false, 3, null), ColorKt.getDeleteColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131056);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM6955mainBg9IZ8Weo3 = CommonUIKt.m6955mainBg9IZ8Weo(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), 0L, composer2, 54, 2);
                    final ScheduleMasterViewModel scheduleMasterViewModel3 = viewModel;
                    Modifier modifierM568paddingVpY3zN5 = PaddingKt.m568paddingVpY3zN4(ClickableKt.m249clickableXHw0xAI$default(modifierM6955mainBg9IZ8Weo3, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.BottomNavView.1.4
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
                            ScheduleMasterViewModel scheduleMasterViewModel4 = scheduleMasterViewModel3;
                            Date startDayOfMonth = MyDateTool.getStartDayOfMonth(MyDateTool.gapMonth(scheduleMasterViewModel4.getCurrentDate(), 1));
                            Intrinsics.checkNotNullExpressionValue(startDayOfMonth, "getStartDayOfMonth(\n    …ate, 1)\n                )");
                            scheduleMasterViewModel4.setCurrentDate(startDayOfMonth);
                            scheduleMasterViewModel3.doChange();
                        }
                    }, 7, null), Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4));
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN5);
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
                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    TextKt.m2471Text4IGK_g("下个月", (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 0, 131066);
                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f4), composer2, 6, 0);
                    IconViewKt.m6909IconViewRidXid8(60012, 0L, Color.INSTANCE.m3785getGray0d7_KjU(), false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 26);
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
        }), composerStartRestartGroup, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.BottomNavView.2
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
                ScheduleCalendarViewKt.BottomNavView(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final void ScheduleCalendarBodyView(final ScheduleMasterViewModel scheduleMasterViewModel, final List<? extends List<MonthDateInfo>> monthInfos, final Function3<? super Date, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        Object objM7405constructorimpl;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        MonthDateInfo monthDateInfo;
        Function3<? super Date, ? super Composer, ? super Integer, Unit> function4;
        int i2;
        final ScheduleMasterViewModel viewModel = scheduleMasterViewModel;
        Function3<? super Date, ? super Composer, ? super Integer, Unit> content = function3;
        int i3 = i;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(monthInfos, "monthInfos");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(808079155);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScheduleCalendarBodyView)P(2,1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(808079155, i3, -1, "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarBodyView (ScheduleCalendarView.kt:284)");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(scheduleMasterViewModel.getConfig().getDateFontSize())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
            objM7405constructorimpl = 17;
        }
        long sp = TextUnitKt.getSp(((Number) objM7405constructorimpl).intValue());
        if (TextUnit.m6288getValueimpl(sp) >= 24.0f) {
            fM6097constructorimpl = Dp.m6097constructorimpl(34);
        } else if (TextUnit.m6288getValueimpl(sp) >= 20.0f) {
            fM6097constructorimpl = Dp.m6097constructorimpl(30);
        } else {
            fM6097constructorimpl = Dp.m6097constructorimpl(26);
        }
        if (TextUnit.m6288getValueimpl(sp) >= 24.0f) {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(42);
        } else if (TextUnit.m6288getValueimpl(sp) >= 20.0f) {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(38);
        } else {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(36);
        }
        float f2 = fM6097constructorimpl2;
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        Modifier.Companion companion3 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
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
        String str2 = "C73@3426L9:Box.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f3 = 10;
        Modifier modifierM571paddingqDBjuR0$default = PaddingKt.m571paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(f3), 0.0f, Dp.m6097constructorimpl(f3), 5, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        String str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
        String str4 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM571paddingqDBjuR0$default);
        float f4 = f3;
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
        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        String str5 = "C79@3979L9:Column.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-164102149);
        Iterator<T> it = monthInfos.iterator();
        while (it.hasNext()) {
            List<MonthDateInfo> list = (List) it.next();
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, str);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            String str6 = str2;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierHeight);
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
            Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1307684563);
            for (final MonthDateInfo monthDateInfo2 : list) {
                float f5 = 4;
                float f6 = 1;
                float f7 = 2;
                Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance, PaddingKt.m569paddingVpY3zN4$default(BorderKt.m226borderxT4_qwU(ButtonViewKt.tap(CommonUIKt.m6957radius3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(f5)), new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarBodyView$1$1$1$1$1$1
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
                        if (Intrinsics.areEqual(monthDateInfo2.getDay(), "")) {
                            return;
                        }
                        viewModel.setCurrentDate(monthDateInfo2.getDate());
                    }
                }), Dp.m6097constructorimpl(f6), ((Color) CommonToolKt.ifv(viewModel.isFocus(monthDateInfo2.getDate()), Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(6))), Dp.m6097constructorimpl(f7), 0.0f, 2, null), 1.0f, false, 2, null), ((Color) CommonToolKt.ifv(viewModel.isFocus(monthDateInfo2.getDate()), Color.m3745boximpl(Color.m3754copywmQWz5c$default(ColorKt.getThemeColor(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), 0.0f, Dp.m6097constructorimpl(3), 1, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, centerHorizontally, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, str5);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                boolean z = scheduleMasterViewModel.getConfig().getShowLunar() || (scheduleMasterViewModel.getConfig().getShowFestival() && monthDateInfo2.getHoliday());
                float f8 = 8;
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                Modifier modifierM569paddingVpY3zN4$default2 = PaddingKt.m569paddingVpY3zN4$default(SizeKt.m602height3ABfNKs(SizeKt.m601defaultMinSizeVpY3zN4$default(BackgroundKt.m213backgroundbw27NRU(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f8)), ((Color) CommonToolKt.ifv(monthDateInfo2.getToday(), Color.m3745boximpl(Color.m3754copywmQWz5c$default(ColorKt.getDeleteColor(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3745boximpl(Color.INSTANCE.m3790getTransparent0d7_KjU()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f8))), ((Dp) CommonToolKt.ifv(z, Dp.m6095boximpl(Dp.m6097constructorimpl(46)), Dp.m6095boximpl(Dp.m6097constructorimpl(40)))).m6111unboximpl(), 0.0f, 2, null), f2), ((Dp) CommonToolKt.ifv(z, Dp.m6095boximpl(Dp.m6097constructorimpl(f5)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7)))).m6111unboximpl(), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default2);
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
                Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                String str7 = str;
                float f9 = f4;
                String str8 = str6;
                String str9 = str5;
                String str10 = str4;
                String str11 = str3;
                Composer composer2 = composerStartRestartGroup;
                float f10 = f2;
                TextKt.m2471Text4IGK_g(monthDateInfo2.getDay(), SizeKt.m621width3ABfNKs(Modifier.INSTANCE, fM6097constructorimpl), monthDateInfo2.m6704fetchDayColorWaAFU9c(composerStartRestartGroup, 8), sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(monthDateInfo2.getToday(), FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getMedium()), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 129488);
                composer2.startReplaceableGroup(-1238073942);
                if (z) {
                    Modifier modifierM571paddingqDBjuR0$default2 = PaddingKt.m571paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(f6), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, str11);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, str7);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM571paddingqDBjuR0$default2);
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
                    Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, str8);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    monthDateInfo = monthDateInfo2;
                    CalendarViewKt.m6968VerticalViewg5HRv50(monthDateInfo2.getLunarDay(), MonthDateInfo.m6703fetchLunarColorvNxB06k$default(monthDateInfo2, null, 1, null), TextUnitKt.getSp(8), composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                } else {
                    monthDateInfo = monthDateInfo2;
                }
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1240514879);
                if (Intrinsics.areEqual(monthDateInfo.getDay(), "")) {
                    function4 = function3;
                    i2 = i;
                } else {
                    i2 = i;
                    function4 = function3;
                    function4.invoke(monthDateInfo.getDate(), composer2, Integer.valueOf(((i2 >> 3) & 112) | 8));
                }
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                str3 = str11;
                str6 = str8;
                str = str7;
                content = function4;
                i3 = i2;
                composerStartRestartGroup = composer2;
                f4 = f9;
                rowScopeInstance = rowScopeInstance2;
                str5 = str9;
                str4 = str10;
                f2 = f10;
                viewModel = scheduleMasterViewModel;
            }
            String str12 = str;
            Composer composer3 = composerStartRestartGroup;
            float f11 = f2;
            String str13 = str5;
            String str14 = str4;
            String str15 = str3;
            float f12 = f4;
            String str16 = str6;
            composer3.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (scheduleMasterViewModel.getConfig().getShowHLine()) {
                composer3.startReplaceableGroup(231769328);
                float f13 = 5;
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f13), composer3, 6, 0);
                TextKt.m2471Text4IGK_g("", SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null), 0.0f, 1, null), Dp.m6097constructorimpl(1)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131068);
                composer3 = composer3;
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f13), composer3, 6, 0);
                composer3.endReplaceableGroup();
            } else {
                composer3.startReplaceableGroup(231769637);
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f12), composer3, 6, 0);
                composer3.endReplaceableGroup();
            }
            i3 = i;
            str3 = str15;
            str2 = str16;
            str = str12;
            composerStartRestartGroup = composer3;
            f4 = f12;
            str5 = str13;
            str4 = str14;
            f2 = f11;
            viewModel = scheduleMasterViewModel;
            content = function3;
        }
        Composer composer4 = composerStartRestartGroup;
        composer4.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endReplaceableGroup();
        composer4.endNode();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        String bigMonth = MyDateTool.getBigMonth(scheduleMasterViewModel.getCurrentDate());
        long sp2 = TextUnitKt.getSp(80);
        long jM3754copywmQWz5c$default = Color.m3754copywmQWz5c$default(Color.INSTANCE.m3785getGray0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        Intrinsics.checkNotNullExpressionValue(bigMonth, "getBigMonth(viewModel.currentDate)");
        TextKt.m2471Text4IGK_g(bigMonth, (Modifier) null, jM3754copywmQWz5c$default, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3456, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endReplaceableGroup();
        composer4.endNode();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt.ScheduleCalendarBodyView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                invoke(composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer5, int i4) {
                ScheduleCalendarViewKt.ScheduleCalendarBodyView(scheduleMasterViewModel, monthInfos, function3, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScheduleCalendarView$lambda$7(MutableState<Date> mutableState, Date date) {
        mutableState.setValue(date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ScheduleCalendarView$lambda$9(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCalendarView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$1", f = "ScheduleCalendarView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Date> $anchorMonthStart$delegate;
        final /* synthetic */ int $baseIndex;
        final /* synthetic */ Date $currentMonthStart;
        final /* synthetic */ State<Integer> $currentVisibleIndex$delegate;
        final /* synthetic */ ScheduleMasterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, Date date, ScheduleMasterViewModel scheduleMasterViewModel, State<Integer> state, MutableState<Date> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$baseIndex = i;
            this.$currentMonthStart = date;
            this.$viewModel = scheduleMasterViewModel;
            this.$currentVisibleIndex$delegate = state;
            this.$anchorMonthStart$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$baseIndex, this.$currentMonthStart, this.$viewModel, this.$currentVisibleIndex$delegate, this.$anchorMonthStart$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Date targetMonthStart = MyDateTool.getStartDayOfMonth(MyDateTool.gapMonth(ScheduleCalendarViewKt.ScheduleCalendarView$lambda$6(this.$anchorMonthStart$delegate), ScheduleCalendarViewKt.ScheduleCalendarView$lambda$9(this.$currentVisibleIndex$delegate) - this.$baseIndex));
                Intrinsics.checkNotNullExpressionValue(targetMonthStart, "targetMonthStart");
                String strDateStr = CommonDateToolKt.dateStr(targetMonthStart);
                Date currentMonthStart = this.$currentMonthStart;
                Intrinsics.checkNotNullExpressionValue(currentMonthStart, "currentMonthStart");
                if (!Intrinsics.areEqual(strDateStr, CommonDateToolKt.dateStr(currentMonthStart)) && !Intrinsics.areEqual(CommonDateToolKt.dateStr(this.$viewModel.getCurrentDate()), CommonDateToolKt.dateStr(targetMonthStart))) {
                    this.$viewModel.setCurrentDate(targetMonthStart);
                    this.$viewModel.doChange();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScheduleCalendarView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.module.schedule.views.biz.ScheduleCalendarViewKt$ScheduleCalendarView$2", f = "ScheduleCalendarView.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Date> $anchorMonthStart$delegate;
        final /* synthetic */ int $baseIndex;
        final /* synthetic */ Date $currentMonthStart;
        final /* synthetic */ LazyListState $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Date date, LazyListState lazyListState, int i, MutableState<Date> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentMonthStart = date;
            this.$listState = lazyListState;
            this.$baseIndex = i;
            this.$anchorMonthStart$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentMonthStart, this.$listState, this.$baseIndex, this.$anchorMonthStart$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Date currentMonthStart = this.$currentMonthStart;
                Intrinsics.checkNotNullExpressionValue(currentMonthStart, "currentMonthStart");
                String strDateStr = CommonDateToolKt.dateStr(currentMonthStart);
                Date anchorMonthStart = ScheduleCalendarViewKt.ScheduleCalendarView$lambda$6(this.$anchorMonthStart$delegate);
                Intrinsics.checkNotNullExpressionValue(anchorMonthStart, "anchorMonthStart");
                if (!Intrinsics.areEqual(strDateStr, CommonDateToolKt.dateStr(anchorMonthStart))) {
                    ScheduleCalendarViewKt.ScheduleCalendarView$lambda$7(this.$anchorMonthStart$delegate, this.$currentMonthStart);
                    int firstVisibleItemIndex = this.$listState.getFirstVisibleItemIndex();
                    int i2 = this.$baseIndex;
                    if (firstVisibleItemIndex != i2) {
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(this.$listState, i2, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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
}