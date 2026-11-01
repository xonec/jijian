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
import cn.jianyun.workplan.ui.graph.MarkerKt;
import com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLDataLoader;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.FadingEdgesKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.LineCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.compose.common.shader.DynamicShaderKt;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.VerticalAxis;
import com.patrykandpatrick.vico.core.cartesian.data.AxisValueOverrider;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: Bar4View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"axisValueOverrider", "Lcom/patrykandpatrick/vico/core/cartesian/data/AxisValueOverrider;", "bottomAxisLabelBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "lineColor", "Bar4View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar4ViewKt {
    private static final long lineColor = ColorKt.Color(4294949632L);
    private static final long bottomAxisLabelBackgroundColor = ColorKt.Color(4288525713L);
    private static final AxisValueOverrider axisValueOverrider = AxisValueOverrider.INSTANCE.adaptiveYValues(1.2f, true);

    public static final void Bar4View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1635017030);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar4View)");
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
                ComposerKt.traceEventStart(-1635017030, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar4View (Bar4View.kt:38)");
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
            DynamicShader.Companion companion = DynamicShader.INSTANCE;
            long j = lineColor;
            int i5 = i3;
            composer2 = composerStartRestartGroup;
            float f2 = 8;
            float f3 = 2;
            float f4 = 4;
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(new CartesianLayer[]{LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(CollectionsKt.listOf(LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(companion, j), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, 8, 0, 2046)), 0.0f, axisValueOverrider, null, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_CURRENT_DOWNLOAD_INDEX, 26)}, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, 0.0f, null, null, null, VerticalAxis.HorizontalLabelPosition.Inside, null, null, 0.0f, ComponentsKt.m7332rememberTextComponenth2R6Sm8(Color.INSTANCE.m3781getBlack0d7_KjU(), 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), j, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer2, 56, 60), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f3)), DimensionsKt.m7307ofqDBjuR0$default(Dimensions.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(f4), 0.0f, 11, null), Typeface.MONOSPACE, null, null, composer2, 19137030, 794), "y", composer2, 12607488, 448, 1903), null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, null, null, ComponentsKt.m7332rememberTextComponenth2R6Sm8(Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), bottomAxisLabelBackgroundColor, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer2, 56, 60), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f3)), DimensionsKt.m7307ofqDBjuR0$default(Dimensions.INSTANCE, 0.0f, Dp.m6097constructorimpl(f4), 0.0f, 0.0f, 13, null), Typeface.MONOSPACE, null, null, composer2, 19137030, 794), "x", 0.0f, null, composer2, 117440512, 0, 1663), null, FadingEdgesKt.m7276rememberFadingEdgesif577FI(0.0f, 0.0f, null, composer2, 0, 7), null, null, composer2, 2129992, 428), cartesianChartModelProducer, modifier3, MarkerKt.rememberMarker(null, null, false, composer2, 0, 7), null, null, VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composer2, 6, 14), null, false, HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), null, null, null, composer2, ((i5 << 6) & 896) | 1174409288 | (VicoZoomState.$stable << 18), 0, AVMDLDataLoader.KeyIsNetSchedulerBlockErrCount);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar4ViewKt.Bar4View.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i6) {
                Bar4ViewKt.Bar4View(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar4ViewKt$Bar4View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar4View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar4ViewKt$Bar4View$1", f = "Bar4View.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar4ViewKt$Bar4View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar4View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar4ViewKt$Bar4View$1$1", f = "Bar4View.kt", i = {0}, l = {48}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02721(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02721> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02721 c02721 = new C02721(this.$modelProducer, continuation);
                c02721.L$0 = obj;
                return c02721;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar4ViewKt.Bar4View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar4ViewKt.Bar4View.1.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LineCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LineCartesianLayerModel.BuilderScope lineSeries) {
                                    Intrinsics.checkNotNullParameter(lineSeries, "$this$lineSeries");
                                    ArrayList arrayList = new ArrayList(10);
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        arrayList.add(Float.valueOf(Random.INSTANCE.nextFloat() * 20));
                                    }
                                    lineSeries.series(arrayList);
                                }
                            });
                        }
                    });
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(2000L, this) == coroutine_suspended) {
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02721(this.$modelProducer, null), this) == coroutine_suspended) {
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