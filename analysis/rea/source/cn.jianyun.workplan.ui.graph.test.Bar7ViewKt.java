package cn.jianyun.workplan.ui.graph.test;

import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import cn.jianyun.workplan.ui.graph.MarkerKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.AxisComponentsKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.LineCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.LegendsKt;
import com.patrykandpatrick.vico.compose.common.VicoThemeKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.compose.common.shader.DynamicShaderKt;
import com.patrykandpatrick.vico.compose.common.shape.ShapeKt;
import com.patrykandpatrick.vico.core.cartesian.CartesianDrawContext;
import com.patrykandpatrick.vico.core.cartesian.CartesianMeasureContext;
import com.patrykandpatrick.vico.core.cartesian.axis.VerticalAxis;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.VerticalLegend;
import com.patrykandpatrick.vico.core.common.component.TextComponent;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: Bar7View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"chartColors", "", "Landroidx/compose/ui/graphics/Color;", "Bar7View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberLegend", "Lcom/patrykandpatrick/vico/core/common/VerticalLegend;", "Lcom/patrykandpatrick/vico/core/cartesian/CartesianMeasureContext;", "Lcom/patrykandpatrick/vico/core/cartesian/CartesianDrawContext;", "(Landroidx/compose/runtime/Composer;I)Lcom/patrykandpatrick/vico/core/common/VerticalLegend;", "rememberStartAxisLabel", "Lcom/patrykandpatrick/vico/core/common/component/TextComponent;", "(Landroidx/compose/runtime/Composer;I)Lcom/patrykandpatrick/vico/core/common/component/TextComponent;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar7ViewKt {
    private static final List<Color> chartColors = CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(ColorKt.Color(4290348031L)), Color.m3745boximpl(ColorKt.Color(4287738365L)), Color.m3745boximpl(ColorKt.Color(4287617791L))});

    public static final void Bar7View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(629280948);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar7View)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629280948, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar7View (Bar7View.kt:43)");
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
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass1(cartesianChartModelProducer, null), composerStartRestartGroup, 70);
            CartesianLayer[] cartesianLayerArr = new CartesianLayer[1];
            composerStartRestartGroup.startReplaceableGroup(-2127894892);
            List<Color> list = chartColors;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, ((Color) it.next()).m3765unboximpl()), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_RETRANSMISSION_TIME_MS, 0, 2042));
                composerStartRestartGroup = composerStartRestartGroup;
                arrayList = arrayList2;
                cartesianLayerArr = cartesianLayerArr;
                i3 = i3;
            }
            CartesianLayer[] cartesianLayerArr2 = cartesianLayerArr;
            Composer composer3 = composerStartRestartGroup;
            composer3.endReplaceableGroup();
            cartesianLayerArr2[0] = LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(arrayList, 0.0f, null, null, null, composer3, 8, 30);
            composer2 = composer3;
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(cartesianLayerArr2, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(rememberStartAxisLabel(composer3, 0), null, null, 0.0f, null, null, null, VerticalAxis.HorizontalLabelPosition.Inside, null, null, 0.0f, null, null, composer3, 12582920, 0, 8062), null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, null, null, null, null, 0.0f, null, composer3, 0, 0, 2047), rememberLegend(composer3, 0), null, null, null, composer3, 294984, 460), cartesianChartModelProducer, modifier3, MarkerKt.rememberMarker(null, null, false, composer3, 0, 7), null, null, VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composer3, 6, 14), null, false, null, null, null, null, composer2, ((i3 << 6) & 896) | 100667464 | (VicoZoomState.$stable << 18), 0, 7856);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar7ViewKt.Bar7View.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer4, int i5) {
                Bar7ViewKt.Bar7View(modifier2, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final TextComponent rememberStartAxisLabel(Composer composer, int i) {
        composer.startReplaceableGroup(-1100989322);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1100989322, i, -1, "cn.jianyun.workplan.ui.graph.test.rememberStartAxisLabel (Bar7View.kt:97)");
        }
        float f2 = 4;
        TextComponent textComponentM7285rememberAxisLabelComponent0bKA_ZM = AxisComponentsKt.m7285rememberAxisLabelComponent0bKA_ZM(Color.INSTANCE.m3781getBlack0d7_KjU(), 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(ShapeKt.m7352rounded3ABfNKs(Shape.INSTANCE, Dp.m6097constructorimpl(f2)), ColorKt.Color(4294621517L), (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 56, 60), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(2)), DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(f2)), null, null, composer, 2359814, TTAdConstant.IMAGE_LIST_SIZE_CODE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textComponentM7285rememberAxisLabelComponent0bKA_ZM;
    }

    private static final VerticalLegend<CartesianMeasureContext, CartesianDrawContext> rememberLegend(Composer composer, int i) {
        composer.startReplaceableGroup(-279524211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-279524211, i, -1, "cn.jianyun.workplan.ui.graph.test.rememberLegend (Bar7View.kt:110)");
        }
        composer.startReplaceableGroup(1747114072);
        List<Color> list = chartColors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(LegendsKt.rememberLegendItem(ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), ((Color) obj).m3765unboximpl(), (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 8, 60), ComponentsKt.m7332rememberTextComponenth2R6Sm8(VicoThemeKt.getVicoTheme(composer, i2).m7318getTextColor0d7_KjU(), TextUnitKt.getSp(12), null, null, 0, null, null, Typeface.MONOSPACE, null, null, composer, 16777264, 892), "x:" + i4, composer, 72));
            arrayList = arrayList2;
            i3 = i4;
            i2 = i2;
        }
        composer.endReplaceableGroup();
        float f2 = 8;
        VerticalLegend<CartesianMeasureContext, CartesianDrawContext> verticalLegendM7309rememberVerticalLegendz_eaty8 = LegendsKt.m7309rememberVerticalLegendz_eaty8(arrayList, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(4), DimensionsKt.m7307ofqDBjuR0$default(Dimensions.INSTANCE, 0.0f, Dp.m6097constructorimpl(f2), 0.0f, 0.0f, 13, null), composer, 36280, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return verticalLegendM7309rememberVerticalLegendz_eaty8;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar7ViewKt$Bar7View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar7View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar7ViewKt$Bar7View$1", f = "Bar7View.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CartesianChartModelProducer $modelProducer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$modelProducer = cartesianChartModelProducer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$modelProducer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar7ViewKt$Bar7View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar7View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar7ViewKt$Bar7View$1$1", f = "Bar7View.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02811(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02811> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02811 c02811 = new C02811(this.$modelProducer, continuation);
                c02811.L$0 = obj;
                return c02811;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineScope coroutineScope;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar7ViewKt.Bar7View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar7ViewKt.Bar7View.1.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LineCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LineCartesianLayerModel.BuilderScope lineSeries) {
                                    Intrinsics.checkNotNullParameter(lineSeries, "$this$lineSeries");
                                    for (int i2 = 0; i2 < 3; i2++) {
                                        ArrayList arrayList = new ArrayList(10);
                                        for (int i3 = 0; i3 < 10; i3++) {
                                            arrayList.add(Float.valueOf(100 + (Random.INSTANCE.nextFloat() * 200)));
                                        }
                                        lineSeries.series(arrayList);
                                    }
                                }
                            });
                        }
                    });
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02811(this.$modelProducer, null), this) == coroutine_suspended) {
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