package cn.jianyun.workplan.ui.graph.test;

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
import com.patrykandpatrick.vico.compose.cartesian.layer.ColumnCartesianLayerKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.LineCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.compose.common.shader.DynamicShaderKt;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.layer.ColumnCartesianLayer;
import com.patrykandpatrick.vico.core.common.data.ExtraStore;
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
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: Bar8View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"color1", "Landroidx/compose/ui/graphics/Color;", "J", "color2", "color3", "color4", "columnChartColors", "", "Bar8View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar8ViewKt {
    private static final long color1;
    private static final long color2;
    private static final long color3;
    private static final long color4;
    private static final List<Color> columnChartColors;

    public static final void Bar8View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1479264590);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar8View)");
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
                ComposerKt.traceEventStart(-1479264590, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar8View (Bar8View.kt:38)");
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
            CartesianLayer[] cartesianLayerArr = new CartesianLayer[2];
            ColumnCartesianLayer.ColumnProvider.Companion companion = ColumnCartesianLayer.ColumnProvider.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-2099266146);
            List<Color> list = columnChartColors;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(ComponentsKt.m7329rememberLineComponentab1Xxas(((Color) it.next()).m3765unboximpl(), Dp.m6097constructorimpl(8), Shape.INSTANCE.rounded(40), null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_DEMUX_NONBLOCK_READ, 120));
                arrayList = arrayList2;
                cartesianLayerArr = cartesianLayerArr;
                i3 = i3;
                companion = companion;
            }
            CartesianLayer[] cartesianLayerArr2 = cartesianLayerArr;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            cartesianLayerArr2[0] = ColumnCartesianLayerKt.m7298rememberColumnCartesianLayer6blBNOA(companion.series(arrayList), 0.0f, 0.0f, new Function1<ExtraStore, ColumnCartesianLayer.MergeMode>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt.Bar8View.3
                @Override // kotlin.jvm.functions.Function1
                public final ColumnCartesianLayer.MergeMode invoke(ExtraStore it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return ColumnCartesianLayer.MergeMode.Stacked;
                }
            }, AxisPosition.Vertical.Start.INSTANCE, null, null, null, 0.0f, null, null, composerStartRestartGroup, 35848, 0, 2022);
            cartesianLayerArr2[1] = LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(CollectionsKt.listOf(LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, color4), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composer2, 8, 0, 2046)), 0.0f, null, AxisPosition.Vertical.End.INSTANCE, null, composer2, 4104, 22);
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(cartesianLayerArr2, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, 0.0f, null, null, null, null, null, null, 0.0f, null, null, composer2, CpioConstants.C_ISBLK, 0, 8175), null, VerticalAxisKt.m7291rememberEndAxisqmNWa6M(null, null, null, 0.0f, null, null, null, null, null, null, 0.0f, null, null, composer2, CpioConstants.C_ISBLK, 0, 8175), HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, null, null, null, null, 0.0f, null, composer2, 0, 0, 2047), null, null, null, null, composer2, 36936, 484), cartesianChartModelProducer, modifier3, MarkerKt.rememberMarker(null, null, false, composer2, 0, 7), null, null, VicoZoomStateKt.rememberVicoZoomState(false, null, null, null, composer2, 6, 14), null, false, null, null, null, null, composer2, ((i3 << 6) & 896) | 100667464 | (VicoZoomState.$stable << 18), 0, 7856);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt.Bar8View.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i5) {
                Bar8ViewKt.Bar8View(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    static {
        long jColor = ColorKt.Color(4289026650L);
        color1 = jColor;
        long jColor2 = ColorKt.Color(4292048235L);
        color2 = jColor2;
        long jColor3 = ColorKt.Color(4293958525L);
        color3 = jColor3;
        color4 = ColorKt.Color(4294951841L);
        columnChartColors = CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(jColor), Color.m3745boximpl(jColor2), Color.m3745boximpl(jColor3)});
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt$Bar8View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar8View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar8ViewKt$Bar8View$1", f = "Bar8View.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt$Bar8View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar8View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar8ViewKt$Bar8View$1$1", f = "Bar8View.kt", i = {0}, l = {57}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02841(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02841> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02841 c02841 = new C02841(this.$modelProducer, continuation);
                c02841.L$0 = obj;
                return c02841;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt.Bar8View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar8ViewKt.Bar8View.1.1.1.1
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02841(this.$modelProducer, null), this) == coroutine_suspended) {
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