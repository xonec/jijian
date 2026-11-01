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
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.AxisComponentsKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.LineCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.shader.DynamicShaderKt;
import com.patrykandpatrick.vico.core.cartesian.CartesianChart;
import com.patrykandpatrick.vico.core.cartesian.CartesianDrawContext;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModel;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.data.ChartValues;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
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

/* JADX INFO: compiled from: GraphLineView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"GraphLineView", "", "monthStatData", "Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "(Lcn/jianyun/workplan/ui/graph/model/LineGraphData;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GraphLineViewKt {
    public static final void GraphLineView(final LineGraphData monthStatData, Composer composer, final int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(monthStatData, "monthStatData");
        Composer composerStartRestartGroup = composer.startRestartGroup(98977863);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GraphLineView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(98977863, i, -1, "cn.jianyun.workplan.ui.graph.GraphLineView (GraphLineView.kt:38)");
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
        final MutableState mutableState = (MutableState) objRememberedValue2;
        if (monthStatData.getDatalist().size() > 0) {
            composerStartRestartGroup.startReplaceableGroup(-385566642);
            EffectsKt.LaunchedEffect(monthStatData.getDatalist(), new AnonymousClass1(monthStatData, cartesianChartModelProducer, mutableState, null), composerStartRestartGroup, 72);
            CartesianValueFormatter cartesianValueFormatter = new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$bottomAxisValueFormatter$1
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
            CartesianMarker cartesianMarkerRememberMarker = MarkerKt.rememberMarker(new CartesianMarkerValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$marker$1
                @Override // com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter
                public final CharSequence format(CartesianDrawContext ctx, List<? extends CartesianMarker.Target> dlist) {
                    Intrinsics.checkNotNullParameter(ctx, "ctx");
                    Intrinsics.checkNotNullParameter(dlist, "dlist");
                    return monthStatData.fetchMarker((int) ((CartesianMarker.Target) CollectionsKt.first((List) dlist)).getX());
                }
            }, null, false, composerStartRestartGroup, 0, 6);
            List listListOf = CollectionsKt.listOf(LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, ColorKt.getThemeColor()), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, 8, 0, 2046));
            float f2 = 2;
            CartesianChart cartesianChartRememberCartesianChart = CartesianChartKt.rememberCartesianChart(new CartesianLayer[]{LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(listListOf, Dp.m6097constructorimpl(f2), null, null, null, composerStartRestartGroup, 56, 28)}, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, Dp.m6097constructorimpl(f2), null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 3072, 0, 8183), null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(AxisComponentsKt.m7285rememberAxisLabelComponent0bKA_ZM(0L, 0L, null, null, 0, DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(0)), null, null, null, composerStartRestartGroup, 262144, 479), null, null, Dp.m6097constructorimpl(f2), null, cartesianValueFormatter, null, null, null, 0.0f, null, composerStartRestartGroup, 27656, 0, 1990), null, null, null, null, composerStartRestartGroup, 32840, 492);
            Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(250));
            float f3 = 8;
            HorizontalLayout.FullWidth fullWidthM7279fullWidthqDBjuR0$default = HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f3), 3, null);
            VicoZoomState vicoZoomStateRememberVicoZoomState = VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composerStartRestartGroup, 6, 14);
            HorizontalLayout.FullWidth fullWidth = fullWidthM7279fullWidthqDBjuR0$default;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<CartesianChartModel, Float>() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Float invoke(CartesianChartModel it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Float.valueOf(GraphLineViewKt.GraphLineView$lambda$2(mutableState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            CartesianChartHostKt.CartesianChartHost(cartesianChartRememberCartesianChart, cartesianChartModelProducer, modifierM602height3ABfNKs, cartesianMarkerRememberMarker, null, null, vicoZoomStateRememberVicoZoomState, null, false, fullWidth, (Function1) objRememberedValue3, null, null, composer2, (VicoZoomState.$stable << 18) | 1073746376, 0, 6576);
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-385564756);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt.GraphLineView.3
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
                GraphLineViewKt.GraphLineView(monthStatData, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GraphLineView$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GraphLineView$lambda$3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$1, reason: invalid class name */
    /* JADX INFO: compiled from: GraphLineView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$1", f = "GraphLineView.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GraphLineView.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GraphLineViewKt$GraphLineView$1$1", f = "GraphLineView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            final /* synthetic */ LineGraphData $monthStatData;
            final /* synthetic */ MutableState<Float> $step$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02571(CartesianChartModelProducer cartesianChartModelProducer, LineGraphData lineGraphData, MutableState<Float> mutableState, Continuation<? super C02571> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
                this.$monthStatData = lineGraphData;
                this.$step$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02571(this.$modelProducer, this.$monthStatData, this.$step$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CartesianChartModelProducer cartesianChartModelProducer = this.$modelProducer;
                    final LineGraphData lineGraphData = this.$monthStatData;
                    cartesianChartModelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt.GraphLineView.1.1.1
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
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GraphLineViewKt.GraphLineView.1.1.1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LineCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LineCartesianLayerModel.BuilderScope lineSeries) {
                                    Intrinsics.checkNotNullParameter(lineSeries, "$this$lineSeries");
                                    lineSeries.series(lineGraphData2.fetchXData(), lineGraphData2.fetchYData());
                                }
                            });
                        }
                    });
                    GraphLineViewKt.GraphLineView$lambda$3(this.$step$delegate, this.$monthStatData.step());
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
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02571(this.$modelProducer, this.$monthStatData, this.$step$delegate, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CommonToolKt.mlog("xData", this.$monthStatData.getUnit(), Boxing.boxInt(this.$monthStatData.getDatalist().size()), this.$monthStatData.fetchXData(), this.$monthStatData.fetchYData());
            return Unit.INSTANCE;
        }
    }
}