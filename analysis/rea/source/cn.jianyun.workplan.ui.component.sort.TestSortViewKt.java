package cn.jianyun.workplan.ui.component.sort;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: TestSortView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"DragNDropItemsList", "", "items", "", "Lcn/jianyun/workplan/util/SelectDO;", "renderAction", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "onChange", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TestSortViewKt {
    public static final void DragNDropItemsList(final List<? extends SelectDO> items, Function3<? super String, ? super Composer, ? super Integer, Unit> function3, final Function1<? super List<? extends SelectDO>, Unit> onChange, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(183131232);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DragNDropItemsList)P(!1,2)");
        final Function3<? super String, ? super Composer, ? super Integer, Unit> function4 = (i2 & 2) != 0 ? null : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183131232, i, -1, "cn.jianyun.workplan.ui.component.sort.DragNDropItemsList (TestSortView.kt:23)");
        }
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(items);
        DragDropColumnKt.DragDropColumn((List) SnapshotStateKt.collectAsState(FlowKt.asStateFlow(MutableStateFlow), null, composerStartRestartGroup, 8, 1).getValue(), new AnonymousClass1(MutableStateFlow, onChange), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2038803740, true, new Function5<LazyItemScope, SelectDO, Boolean, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.TestSortViewKt.DragNDropItemsList.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, SelectDO selectDO, Boolean bool, Composer composer2, Integer num) {
                invoke(lazyItemScope, selectDO, bool.booleanValue(), composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope DragDropColumn, final SelectDO item, boolean z, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(DragDropColumn, "$this$DragDropColumn");
                Intrinsics.checkNotNullParameter(item, "item");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2038803740, i3, -1, "cn.jianyun.workplan.ui.component.sort.DragNDropItemsList.<anonymous> (TestSortView.kt:45)");
                }
                Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(CommonUIKt.m6955mainBg9IZ8Weo(Modifier.INSTANCE, 0.0f, ((Color) CommonToolKt.ifv(z, Color.m3745boximpl(Color.m3754copywmQWz5c$default(ColorKt.getThemeColor(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getSurfaceVariant()))).m3765unboximpl(), composer2, 6, 1), Dp.m6097constructorimpl(12), Dp.m6097constructorimpl(8));
                final Function3<String, Composer, Integer, Unit> function5 = function4;
                final int i4 = i;
                BoxViewKt.m6895TwoColumnViewdjqsMU(modifierM568paddingVpY3zN4, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer2, 641448989, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.TestSortViewKt.DragNDropItemsList.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(641448989, i5, -1, "cn.jianyun.workplan.ui.component.sort.DragNDropItemsList.<anonymous>.<anonymous> (TestSortView.kt:46)");
                            }
                            if (function5 != null) {
                                composer3.startReplaceableGroup(642288176);
                                Function3<String, Composer, Integer, Unit> function6 = function5;
                                String str = item.value;
                                Intrinsics.checkNotNullExpressionValue(str, "item.value");
                                function6.invoke(str, composer3, Integer.valueOf(i4 & 112));
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(642288249);
                                String str2 = item.label;
                                Intrinsics.checkNotNullExpressionValue(str2, "item.label");
                                TextKt.m2471Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                composer3.endReplaceableGroup();
                            }
                            IconViewKt.m6909IconViewRidXid8(62361, 0L, 0L, false, null, composer3, 6, 30);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_RETRANSMISSION_TIME_MS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.TestSortViewKt.DragNDropItemsList.3
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
                TestSortViewKt.DragNDropItemsList(items, function4, onChange, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DragNDropItemsList$swapItems(MutableStateFlow<List<SelectDO>> mutableStateFlow, Function1<? super List<? extends SelectDO>, Unit> function1, int i, int i2) {
        SelectDO selectDO = mutableStateFlow.getValue().get(i);
        SelectDO selectDO2 = mutableStateFlow.getValue().get(i2);
        List<SelectDO> mutableList = CollectionsKt.toMutableList((Collection) mutableStateFlow.getValue());
        mutableList.set(i, selectDO2);
        mutableList.set(i2, selectDO);
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), mutableList)) {
        }
        function1.invoke(mutableList);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.component.sort.TestSortViewKt$DragNDropItemsList$1, reason: invalid class name */
    /* JADX INFO: compiled from: TestSortView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ MutableStateFlow<List<SelectDO>> $mutableUiState;
        final /* synthetic */ Function1<List<? extends SelectDO>, Unit> $onChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MutableStateFlow<List<SelectDO>> mutableStateFlow, Function1<? super List<? extends SelectDO>, Unit> function1) {
            super(2, Intrinsics.Kotlin.class, "swapItems", "DragNDropItemsList$swapItems(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;II)V", 0);
            this.$mutableUiState = mutableStateFlow;
            this.$onChange = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2) {
            TestSortViewKt.DragNDropItemsList$swapItems(this.$mutableUiState, this.$onChange, i, i2);
        }
    }
}