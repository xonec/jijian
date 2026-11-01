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
import cn.jianyun.workplan.ui.graph.model.LineGraphData;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.AxisComponentsKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.ColumnCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.core.cartesian.CartesianChart;
import com.patrykandpatrick.vico.core.cartesian.CartesianDrawContext;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisItemPlacer;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModel;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.data.ChartValues;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.layer.ColumnCartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.marker.ColumnCartesianLayerMarkerTarget;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.data.ExtraStore;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: GroupBarView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"COLUMN_THICKNESS_DP", "", "startAxisItemPlacer", "Lcom/patrykandpatrick/vico/core/cartesian/axis/AxisItemPlacer$Vertical;", "GroupBarView", "", "monthStatDatas", "", "Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GroupBarViewKt {
    private static final int COLUMN_THICKNESS_DP = 10;
    private static final AxisItemPlacer.Vertical startAxisItemPlacer = AxisItemPlacer.Vertical.Companion.count$default(AxisItemPlacer.Vertical.INSTANCE, new Function1<ExtraStore, Integer>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt$startAxisItemPlacer$1
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(ExtraStore it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return 2;
        }
    }, false, 2, null);

    public static final void GroupBarView(final List<LineGraphData> monthStatDatas, Composer composer, final int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(monthStatDatas, "monthStatDatas");
        Composer composerStartRestartGroup = composer.startRestartGroup(-84665155);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupBarView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-84665155, i, -1, "cn.jianyun.workplan.ui.graph.GroupBarView (GroupBarView.kt:39)");
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
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue2;
        if (monthStatDatas.size() > 0) {
            EffectsKt.LaunchedEffect(Integer.valueOf(monthStatDatas.size()), new AnonymousClass1(cartesianChartModelProducer, monthStatDatas, mutableState, null), composerStartRestartGroup, 64);
            CartesianValueFormatter cartesianValueFormatter = new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$bottomAxisValueFormatter$1
                @Override // com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter
                public final CharSequence format(float f2, ChartValues chartValues, AxisPosition.Vertical vertical) {
                    Intrinsics.checkNotNullParameter(chartValues, "<anonymous parameter 1>");
                    int i2 = (int) f2;
                    if (i2 >= 0 && monthStatDatas.get(0).getDatalist().size() > i2) {
                        return monthStatDatas.get(0).getDatalist().get(i2).getShowDay();
                    }
                    return "";
                }
            };
            CartesianMarker cartesianMarkerRememberMarker = MarkerKt.rememberMarker(new CartesianMarkerValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$marker$1
                @Override // com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter
                public final CharSequence format(CartesianDrawContext ctx, List<? extends CartesianMarker.Target> dlist) {
                    Intrinsics.checkNotNullParameter(ctx, "ctx");
                    Intrinsics.checkNotNullParameter(dlist, "dlist");
                    CommonToolKt.mlog("start");
                    if ((!dlist.isEmpty()) && (dlist.get(0) instanceof ColumnCartesianLayerMarkerTarget)) {
                        CartesianMarker.Target target = dlist.get(0);
                        Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.patrykandpatrick.vico.core.cartesian.marker.ColumnCartesianLayerMarkerTarget");
                        ColumnCartesianLayerMarkerTarget columnCartesianLayerMarkerTarget = (ColumnCartesianLayerMarkerTarget) target;
                        return monthStatDatas.get(0).fetchMarker((int) columnCartesianLayerMarkerTarget.getColumns().get(0).getEntry().getX()) + "\n" + monthStatDatas.get(1).fetchMarker((int) columnCartesianLayerMarkerTarget.getColumns().get(0).getEntry().getX());
                    }
                    return "";
                }
            }, null, false, composerStartRestartGroup, 0, 6);
            float f2 = 5;
            float f3 = 2;
            CartesianChart cartesianChartRememberCartesianChart = CartesianChartKt.rememberCartesianChart(new CartesianLayer[]{ColumnCartesianLayerKt.m7298rememberColumnCartesianLayer6blBNOA(ColumnCartesianLayer.ColumnProvider.INSTANCE.series(ComponentsKt.m7329rememberLineComponentab1Xxas(ColorKt.getThemeColor(), Dp.m6097constructorimpl(f2), Shape.Companion.rounded$default(Shape.INSTANCE, 0, 0, 0, 0, 3, (Object) null), null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEIDA_PLAYER_OPTION_IGNORE_DIRECTLY_BUFFERING, 120), ComponentsKt.m7329rememberLineComponentab1Xxas(ColorKt.getDeleteColor(), Dp.m6097constructorimpl(f2), Shape.Companion.rounded$default(Shape.INSTANCE, 20, 20, 0, 0, 12, (Object) null), null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEIDA_PLAYER_OPTION_IGNORE_DIRECTLY_BUFFERING, 120)), Dp.m6097constructorimpl(f3), 0.0f, new Function1<ExtraStore, ColumnCartesianLayer.MergeMode>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt.GroupBarView.2
                @Override // kotlin.jvm.functions.Function1
                public final ColumnCartesianLayer.MergeMode invoke(ExtraStore it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return ColumnCartesianLayer.MergeMode.Stacked;
                }
            }, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 3128, 0, 2036)}, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, Dp.m6097constructorimpl(f3), null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 3072, 0, 8183), null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(AxisComponentsKt.m7285rememberAxisLabelComponent0bKA_ZM(0L, 0L, null, null, 0, DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(0)), null, null, null, composerStartRestartGroup, 262144, 479), null, null, Dp.m6097constructorimpl(f3), null, cartesianValueFormatter, null, null, null, 0.0f, null, composerStartRestartGroup, 27656, 0, 1990), null, null, null, null, composerStartRestartGroup, 32840, 492);
            Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(250));
            float f4 = 8;
            HorizontalLayout.FullWidth fullWidthM7279fullWidthqDBjuR0$default = HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(f4), Dp.m6097constructorimpl(f4), 3, null);
            VicoZoomState vicoZoomStateRememberVicoZoomState = VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composerStartRestartGroup, 6, 14);
            HorizontalLayout.FullWidth fullWidth = fullWidthM7279fullWidthqDBjuR0$default;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<CartesianChartModel, Float>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Float invoke(CartesianChartModel it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Float.valueOf(GroupBarViewKt.GroupBarView$lambda$2(mutableState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            CartesianChartHostKt.CartesianChartHost(cartesianChartRememberCartesianChart, cartesianChartModelProducer, modifierM602height3ABfNKs, cartesianMarkerRememberMarker, null, null, vicoZoomStateRememberVicoZoomState, null, false, fullWidth, (Function1) objRememberedValue3, null, null, composer2, (VicoZoomState.$stable << 18) | 1073746376, 0, 6576);
        } else {
            composer2 = composerStartRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt.GroupBarView.4
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
                GroupBarViewKt.GroupBarView(monthStatDatas, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GroupBarView$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupBarView$lambda$3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$1, reason: invalid class name */
    /* JADX INFO: compiled from: GroupBarView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$1", f = "GroupBarView.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CartesianChartModelProducer $modelProducer;
        final /* synthetic */ List<LineGraphData> $monthStatDatas;
        final /* synthetic */ MutableState<Float> $step$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CartesianChartModelProducer cartesianChartModelProducer, List<LineGraphData> list, MutableState<Float> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$modelProducer = cartesianChartModelProducer;
            this.$monthStatDatas = list;
            this.$step$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$modelProducer, this.$monthStatDatas, this.$step$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GroupBarView.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GroupBarViewKt$GroupBarView$1$1", f = "GroupBarView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            final /* synthetic */ List<LineGraphData> $monthStatDatas;
            final /* synthetic */ MutableState<Float> $step$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02601(CartesianChartModelProducer cartesianChartModelProducer, List<LineGraphData> list, MutableState<Float> mutableState, Continuation<? super C02601> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
                this.$monthStatDatas = list;
                this.$step$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02601(this.$modelProducer, this.$monthStatDatas, this.$step$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CartesianChartModelProducer cartesianChartModelProducer = this.$modelProducer;
                    final List<LineGraphData> list = this.$monthStatDatas;
                    cartesianChartModelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt.GroupBarView.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            final List<LineGraphData> list2 = list;
                            ColumnCartesianLayerModelKt.columnSeries(tryRunTransaction, new Function1<ColumnCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupBarViewKt.GroupBarView.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    List<LineGraphData> list3 = list2;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    for (LineGraphData lineGraphData : list3) {
                                        columnSeries.series(lineGraphData.fetchXData(), lineGraphData.fetchYData());
                                        arrayList.add(Unit.INSTANCE);
                                    }
                                }
                            });
                        }
                    });
                    GroupBarViewKt.GroupBarView$lambda$3(this.$step$delegate, this.$monthStatDatas.get(0).step());
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02601(this.$modelProducer, this.$monthStatDatas, this.$step$delegate, null), this) == coroutine_suspended) {
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