package cn.jianyun.workplan.ui.graph;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.graph.model.LineGraphData;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.ColumnCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.core.cartesian.CartesianDrawContext;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.data.ChartValues;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.layer.ColumnCartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: compiled from: GraphBarView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"GraphBarView", "", "monthStatData", "Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "(Lcn/jianyun/workplan/ui/graph/model/LineGraphData;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GraphBarViewKt {
    public static final void GraphBarView(final LineGraphData monthStatData, Composer composer, final int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(monthStatData, "monthStatData");
        Composer composerStartRestartGroup = composer.startRestartGroup(17530967);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GraphBarView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(17530967, i, -1, "cn.jianyun.workplan.ui.graph.GraphBarView (GraphBarView.kt:40)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = CartesianChartModelProducer.Companion.build$default(CartesianChartModelProducer.INSTANCE, null, null, 3, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CartesianChartModelProducer cartesianChartModelProducer = (CartesianChartModelProducer) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(monthStatData.step()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        if (monthStatData.getDatalist().size() > 0) {
            composerStartRestartGroup.startReplaceableGroup(-886295341);
            EffectsKt.LaunchedEffect(monthStatData.getDatalist(), new AnonymousClass1(monthStatData, cartesianChartModelProducer, mutableState, null), composerStartRestartGroup, 72);
            new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$bottomAxisValueFormatter$1
                @Override // com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter
                public final CharSequence format(float f2, ChartValues chartValues, AxisPosition.Vertical vertical) {
                    Intrinsics.checkNotNullParameter(chartValues, "<anonymous parameter 1>");
                    int i2 = (int) f2;
                    if (i2 >= 0 && monthStatData.getDatalist().size() > i2) {
                        return monthStatData.getDatalist().get(i2).getShowDay();
                    }
                    return "";
                }
            };
            MarkerKt.rememberMarker(new CartesianMarkerValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$marker$1
                @Override // com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter
                public final CharSequence format(CartesianDrawContext ctx, List<? extends CartesianMarker.Target> dlist) {
                    Intrinsics.checkNotNullParameter(ctx, "ctx");
                    Intrinsics.checkNotNullParameter(dlist, "dlist");
                    return monthStatData.fetchMarker((int) ((CartesianMarker.Target) CollectionsKt.first((List) dlist)).getX());
                }
            }, null, false, composerStartRestartGroup, 0, 6);
            float f2 = 8;
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(new CartesianLayer[]{ColumnCartesianLayerKt.m7298rememberColumnCartesianLayer6blBNOA(ColumnCartesianLayer.ColumnProvider.INSTANCE.series(ComponentsKt.m7329rememberLineComponentab1Xxas(ColorKt.getThemeColor(), Dp.m6097constructorimpl(5), Shape.Companion.rounded$default(Shape.INSTANCE, 10.2f, 10.2f, 0.0f, 0.0f, 12, (Object) null), null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEIDA_PLAYER_OPTION_IGNORE_DIRECTLY_BUFFERING, 120)), 0.0f, 0.0f, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 8, 0, 2046)}, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, Dp.m6097constructorimpl(2), null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 3072, 0, 8183), null, null, null, null, null, null, null, composerStartRestartGroup, 72, TarConstants.XSTAR_MAGIC_OFFSET), cartesianChartModelProducer, SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(250)), null, null, null, VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composerStartRestartGroup, 6, 14), null, false, HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f2), 3, null), null, null, null, composerStartRestartGroup, (VicoZoomState.$stable << 18) | 1073742280, 0, 7608);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-886292890);
            BoxViewKt.m6880EmptyDataView6BXD4ec("暂无数据", 0L, 0L, null, composer2, 6, 14);
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphBarViewKt.GraphBarView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i2) {
                GraphBarViewKt.GraphBarView(monthStatData, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GraphBarView$lambda$3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$1, reason: invalid class name */
    /* JADX INFO: compiled from: GraphBarView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$1", f = "GraphBarView.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CartesianChartModelProducer $modelProducer;
        final /* synthetic */ LineGraphData $monthStatData;
        final /* synthetic */ MutableState<Float> $step$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LineGraphData lineGraphData, CartesianChartModelProducer cartesianChartModelProducer, MutableState<Float> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$monthStatData = lineGraphData;
            this.$modelProducer = cartesianChartModelProducer;
            this.$step$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$monthStatData, this.$modelProducer, this.$step$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GraphBarView.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GraphBarViewKt$GraphBarView$1$1", f = "GraphBarView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            final /* synthetic */ LineGraphData $monthStatData;
            final /* synthetic */ MutableState<Float> $step$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02541(CartesianChartModelProducer cartesianChartModelProducer, LineGraphData lineGraphData, MutableState<Float> mutableState, Continuation<? super C02541> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
                this.$monthStatData = lineGraphData;
                this.$step$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02541(this.$modelProducer, this.$monthStatData, this.$step$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CartesianChartModelProducer cartesianChartModelProducer = this.$modelProducer;
                    final LineGraphData lineGraphData = this.$monthStatData;
                    cartesianChartModelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphBarViewKt.GraphBarView.1.1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            final LineGraphData lineGraphData2 = lineGraphData;
                            ColumnCartesianLayerModelKt.columnSeries(tryRunTransaction, new Function1<ColumnCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphBarViewKt.GraphBarView.1.1.1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ColumnCartesianLayerModel.BuilderScope columnSeries) {
                                    Intrinsics.checkNotNullParameter(columnSeries, "$this$columnSeries");
                                    columnSeries.series(lineGraphData2.fetchXData(), lineGraphData2.fetchYData());
                                }
                            });
                        }
                    });
                    GraphBarViewKt.GraphBarView$lambda$3(this.$step$delegate, this.$monthStatData.step());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonToolKt.mlog("xData", this.$monthStatData.getUnit(), Boxing.boxInt(this.$monthStatData.getDatalist().size()), this.$monthStatData.fetchXData(), this.$monthStatData.fetchYData());
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02541(this.$modelProducer, this.$monthStatData, this.$step$delegate, null), this) == coroutine_suspended) {
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
}