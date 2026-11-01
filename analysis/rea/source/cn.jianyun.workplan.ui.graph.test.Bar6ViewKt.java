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
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomState;
import com.patrykandpatrick.vico.compose.cartesian.VicoZoomStateKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.decoration.HorizontalBoxKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.ColumnCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.axis.HorizontalAxis;
import com.patrykandpatrick.vico.core.cartesian.axis.VerticalAxis;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.data.ChartValues;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.decoration.HorizontalBox;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.layer.ColumnCartesianLayer;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.data.ExtraStore;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shape.CorneredShape;
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
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: Bar6View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"bottomAxisValueFormatter", "Lcom/patrykandpatrick/vico/core/cartesian/data/CartesianValueFormatter;", "columnColors", "", "Landroidx/compose/ui/graphics/Color;", "daysOfWeek", "", "horizontalBoxColor", "J", "Bar6View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberHorizontalBox", "Lcom/patrykandpatrick/vico/core/cartesian/decoration/HorizontalBox;", "(Landroidx/compose/runtime/Composer;I)Lcom/patrykandpatrick/vico/core/cartesian/decoration/HorizontalBox;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar6ViewKt {
    private static final List<Color> columnColors = CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(ColorKt.Color(4282279256L)), Color.m3745boximpl(ColorKt.Color(4284384106L)), Color.m3745boximpl(ColorKt.Color(4289051278L))});
    private static final long horizontalBoxColor = ColorKt.Color(4293518767L);
    private static final List<String> daysOfWeek = CollectionsKt.listOf((Object[]) new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"});
    private static final CartesianValueFormatter bottomAxisValueFormatter = new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt$bottomAxisValueFormatter$1
        @Override // com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter
        public final CharSequence format(float f2, ChartValues chartValues, AxisPosition.Vertical vertical) {
            Intrinsics.checkNotNullParameter(chartValues, "<anonymous parameter 1>");
            return (CharSequence) Bar6ViewKt.daysOfWeek.get(((int) f2) % Bar6ViewKt.daysOfWeek.size());
        }
    };

    public static final void Bar6View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1557140810);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar6View)");
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
                ComposerKt.traceEventStart(-1557140810, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar6View (Bar6View.kt:35)");
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
            boolean z = false;
            HorizontalBox horizontalBoxRememberHorizontalBox = rememberHorizontalBox(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Shape.Companion.cut$default(Shape.INSTANCE, 50, 0, 0, 0, 14, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CorneredShape corneredShape = (CorneredShape) objRememberedValue2;
            CartesianLayer[] cartesianLayerArr = new CartesianLayer[1];
            ColumnCartesianLayer.ColumnProvider.Companion companion = ColumnCartesianLayer.ColumnProvider.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(2138442945);
            List<Color> list = columnColors;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(ComponentsKt.m7329rememberLineComponentab1Xxas(((Color) it.next()).m3765unboximpl(), Dp.m6097constructorimpl(8), corneredShape, null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUX_NONBLOCK_READ, 120));
                arrayList = arrayList2;
                z = z;
                cartesianLayerArr = cartesianLayerArr;
                i3 = i3;
                companion = companion;
                horizontalBoxRememberHorizontalBox = horizontalBoxRememberHorizontalBox;
                cartesianChartModelProducer = cartesianChartModelProducer;
            }
            HorizontalBox horizontalBox = horizontalBoxRememberHorizontalBox;
            CartesianLayer[] cartesianLayerArr2 = cartesianLayerArr;
            CartesianChartModelProducer cartesianChartModelProducer2 = cartesianChartModelProducer;
            int i5 = i3;
            composerStartRestartGroup.endReplaceableGroup();
            cartesianLayerArr2[z ? 1 : 0] = ColumnCartesianLayerKt.m7298rememberColumnCartesianLayer6blBNOA(companion.series(arrayList), 0.0f, 0.0f, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 8, 0, 2046);
            VerticalAxis<AxisPosition.Vertical.Start> verticalAxisM7292rememberStartAxisqmNWa6M = VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, 0.0f, null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 0, 0, 8191);
            HorizontalAxis<AxisPosition.Horizontal.Bottom> horizontalAxisM7289rememberBottomAxisWSk2ftU = HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, bottomAxisValueFormatter, null, null, null, 0.0f, null, composerStartRestartGroup, 262144, 0, 2015);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(horizontalBox);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = CollectionsKt.listOf(horizontalBox);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(cartesianLayerArr2, verticalAxisM7292rememberStartAxisqmNWa6M, null, null, horizontalAxisM7289rememberBottomAxisWSk2ftU, null, null, (List) objRememberedValue3, null, composerStartRestartGroup, 16810056, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_VIDEO_DEMUX_TIME), cartesianChartModelProducer2, modifier3, MarkerKt.rememberMarker(null, null, false, composerStartRestartGroup, 0, 7), null, null, VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composerStartRestartGroup, 6, 14), null, false, null, null, null, null, composer2, ((i5 << 6) & 896) | 100667464 | (VicoZoomState.$stable << 18), 0, 7856);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt.Bar6View.4
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
                Bar6ViewKt.Bar6View(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final HorizontalBox rememberHorizontalBox(Composer composer, int i) {
        composer.startReplaceableGroup(-1962402016);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1962402016, i, -1, "cn.jianyun.workplan.ui.graph.test.rememberHorizontalBox (Bar6View.kt:85)");
        }
        AnonymousClass1 anonymousClass1 = new Function1<ExtraStore, ClosedFloatingPointRange<Float>>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt.rememberHorizontalBox.1
            @Override // kotlin.jvm.functions.Function1
            public final ClosedFloatingPointRange<Float> invoke(ExtraStore it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RangesKt.rangeTo(7.0f, 14.0f);
            }
        };
        long j = horizontalBoxColor;
        HorizontalBox horizontalBoxRememberHorizontalBox = HorizontalBoxKt.rememberHorizontalBox(anonymousClass1, ComponentsKt.m7331rememberShapeComponentwPRqli4((Shape) null, Color.m3754copywmQWz5c$default(j, 0.36f, 0.0f, 0.0f, 0.0f, 14, null), (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 48, 61), ComponentsKt.m7332rememberTextComponenth2R6Sm8(Color.INSTANCE.m3781getBlack0d7_KjU(), 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getRectangle(), j, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 56, 60), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(8), Dp.m6097constructorimpl(2)), DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(4)), Typeface.MONOSPACE, null, null, composer, 19137030, 794), null, null, null, 0.0f, null, composer, 582, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_SEEK_INTERRUPT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return horizontalBoxRememberHorizontalBox;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt$Bar6View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar6View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar6ViewKt$Bar6View$1", f = "Bar6View.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt$Bar6View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar6View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar6ViewKt$Bar6View$1$1", f = "Bar6View.kt", i = {0}, l = {54}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02781(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02781> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02781 c02781 = new C02781(this.$modelProducer, continuation);
                c02781.L$0 = obj;
                return c02781;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt.Bar6View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            ColumnCartesianLayerModelKt.columnSeries(tryRunTransaction, new Function1<ColumnCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar6ViewKt.Bar6View.1.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ColumnCartesianLayerModel.BuilderScope columnSeries) {
                                    Intrinsics.checkNotNullParameter(columnSeries, "$this$columnSeries");
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        ArrayList arrayList = new ArrayList(10);
                                        for (int i3 = 0; i3 < 10; i3++) {
                                            arrayList.add(Float.valueOf(200 + (Random.INSTANCE.nextFloat() * 300)));
                                        }
                                        columnSeries.series(arrayList);
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02781(this.$modelProducer, null), this) == coroutine_suspended) {
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