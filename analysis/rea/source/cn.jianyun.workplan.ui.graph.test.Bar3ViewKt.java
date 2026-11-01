package cn.jianyun.workplan.ui.graph.test;

import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.ui.graph.MarkerKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.decoration.HorizontalLineKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.ColumnCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisItemPlacer;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.axis.VerticalAxis;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.data.ChartValues;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.ColumnCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.decoration.HorizontalLine;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.layer.ColumnCartesianLayer;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.component.LineComponent;
import com.patrykandpatrick.vico.core.common.component.ShapeComponent;
import com.patrykandpatrick.vico.core.common.component.TextComponent;
import com.patrykandpatrick.vico.core.common.data.ExtraStore;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
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

/* JADX INFO: compiled from: Bar3View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\b\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\r\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"6\u0010\n\u001a(\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u0014\u0012\u000e\b\u0001\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0018"}, d2 = {"HORIZONTAL_LINE_COLOR", "", "HORIZONTAL_LINE_LABEL_HORIZONTAL_PADDING_DP", "", "HORIZONTAL_LINE_LABEL_MARGIN_DP", "HORIZONTAL_LINE_LABEL_VERTICAL_PADDING_DP", "HORIZONTAL_LINE_THICKNESS_DP", "HORIZONTAL_LINE_Y", "bottomAxisValueFormatter", "Lcom/patrykandpatrick/vico/core/cartesian/data/CartesianValueFormatter;", "monthNames", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "Bar3View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getViewHorizontalLine", "Lcom/patrykandpatrick/vico/core/cartesian/decoration/HorizontalLine;", "rememberComposeHorizontalLine", "(Landroidx/compose/runtime/Composer;I)Lcom/patrykandpatrick/vico/core/cartesian/decoration/HorizontalLine;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar3ViewKt {
    private static final int HORIZONTAL_LINE_COLOR = -2893786;
    private static final float HORIZONTAL_LINE_LABEL_HORIZONTAL_PADDING_DP = 8.0f;
    private static final float HORIZONTAL_LINE_LABEL_MARGIN_DP = 4.0f;
    private static final float HORIZONTAL_LINE_LABEL_VERTICAL_PADDING_DP = 2.0f;
    private static final float HORIZONTAL_LINE_THICKNESS_DP = 2.0f;
    private static final float HORIZONTAL_LINE_Y = 14.0f;
    private static final String[] monthNames = DateFormatSymbols.getInstance(Locale.US).getShortMonths();
    private static final CartesianValueFormatter bottomAxisValueFormatter = new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt$bottomAxisValueFormatter$1
        @Override // com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter
        public final CharSequence format(float f2, ChartValues chartValues, AxisPosition.Vertical vertical) {
            Intrinsics.checkNotNullParameter(chartValues, "<anonymous parameter 1>");
            int i = (int) f2;
            return Bar3ViewKt.monthNames[i % 12] + " ’" + ((i / 12) + 20);
        }
    };

    public static final void Bar3View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(473528508);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar3View)");
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
                ComposerKt.traceEventStart(473528508, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar3View (Bar3View.kt:42)");
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
            ColumnCartesianLayer.ColumnProvider.Companion companion = ColumnCartesianLayer.ColumnProvider.INSTANCE;
            LineComponent[] lineComponentArr = new LineComponent[1];
            long jColor = ColorKt.Color(4294923520L);
            float fM6097constructorimpl = Dp.m6097constructorimpl(16);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Shape.INSTANCE.rounded(40);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i5 = i3;
            lineComponentArr[0] = ComponentsKt.m7329rememberLineComponentab1Xxas(jColor, fM6097constructorimpl, (Shape) objRememberedValue2, null, null, 0.0f, 0L, composerStartRestartGroup, MediaPlayer.MEIDA_PLAYER_OPTION_IGNORE_DIRECTLY_BUFFERING, 120);
            cartesianLayerArr[0] = ColumnCartesianLayerKt.m7298rememberColumnCartesianLayer6blBNOA(companion.series(lineComponentArr), 0.0f, 0.0f, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 8, 0, 2046);
            VerticalAxis<AxisPosition.Vertical.Start> verticalAxisM7292rememberStartAxisqmNWa6M = VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, 0.0f, null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 0, 0, 8191);
            CartesianValueFormatter cartesianValueFormatter = bottomAxisValueFormatter;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = AxisItemPlacer.Horizontal.Companion.default$default(AxisItemPlacer.Horizontal.INSTANCE, 3, 0, false, true, 6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(cartesianLayerArr, verticalAxisM7292rememberStartAxisqmNWa6M, null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, cartesianValueFormatter, null, null, null, 0.0f, (AxisItemPlacer.Horizontal) objRememberedValue3, composerStartRestartGroup, 262144, 8, 991), null, null, CollectionsKt.listOf(rememberComposeHorizontalLine(composerStartRestartGroup, 0)), null, composerStartRestartGroup, 16810056, MediaPlayer.MEDIA_PLAYER_OPTION_LAST_VIDEO_DEMUX_TIME), cartesianChartModelProducer, modifier3, MarkerKt.rememberMarker(null, null, false, composerStartRestartGroup, 0, 7), null, null, null, null, false, HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), null, null, null, composer2, ((i5 << 6) & 896) | 1073745992, 0, 7664);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt.Bar3View.4
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
                Bar3ViewKt.Bar3View(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final HorizontalLine rememberComposeHorizontalLine(Composer composer, int i) {
        composer.startReplaceableGroup(-1296501899);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1296501899, i, -1, "cn.jianyun.workplan.ui.graph.test.rememberComposeHorizontalLine (Bar3View.kt:87)");
        }
        long jColor = ColorKt.Color(HORIZONTAL_LINE_COLOR);
        HorizontalLine horizontalLineRememberHorizontalLine = HorizontalLineKt.rememberHorizontalLine(new Function1<ExtraStore, Float>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt.rememberComposeHorizontalLine.1
            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(ExtraStore it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(Bar3ViewKt.HORIZONTAL_LINE_Y);
            }
        }, ComponentsKt.m7329rememberLineComponentab1Xxas(jColor, Dp.m6097constructorimpl(2.0f), null, null, null, 0.0f, 0L, composer, 54, 124), ComponentsKt.m7332rememberTextComponenth2R6Sm8(0L, 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), jColor, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 56, 60), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(8.0f), Dp.m6097constructorimpl(2.0f)), DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(4.0f)), Typeface.MONOSPACE, null, null, composer, 19137024, 795), null, null, null, 0.0f, null, composer, 582, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_SEEK_INTERRUPT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return horizontalLineRememberHorizontalLine;
    }

    private static final HorizontalLine getViewHorizontalLine() {
        AnonymousClass1 anonymousClass1 = new Function1<ExtraStore, Float>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt.getViewHorizontalLine.1
            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(ExtraStore it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(Bar3ViewKt.HORIZONTAL_LINE_Y);
            }
        };
        LineComponent lineComponent = new LineComponent(HORIZONTAL_LINE_COLOR, 2.0f, null, null, null, 0.0f, 0, 124, null);
        TextComponent.Companion companion = TextComponent.INSTANCE;
        TextComponent.Builder builder = new TextComponent.Builder();
        builder.setBackground(new ShapeComponent(Shape.INSTANCE.getPill(), HORIZONTAL_LINE_COLOR, null, null, 0.0f, 0, 60, null));
        builder.setPadding(new Dimensions(2.0f, 8.0f));
        builder.setMargins(new Dimensions(4.0f));
        builder.setTypeface(Typeface.MONOSPACE);
        Unit unit = Unit.INSTANCE;
        return new HorizontalLine(anonymousClass1, lineComponent, builder.build(), null, null, null, 0.0f, null, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_SEEK_INTERRUPT, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt$Bar3View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar3View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar3ViewKt$Bar3View$1", f = "Bar3View.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt$Bar3View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar3View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar3ViewKt$Bar3View$1$1", f = "Bar3View.kt", i = {0}, l = {51}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02691(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02691> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02691 c02691 = new C02691(this.$modelProducer, continuation);
                c02691.L$0 = obj;
                return c02691;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt.Bar3View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            ColumnCartesianLayerModelKt.columnSeries(tryRunTransaction, new Function1<ColumnCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar3ViewKt.Bar3View.1.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnCartesianLayerModel.BuilderScope builderScope) {
                                    invoke2(builderScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ColumnCartesianLayerModel.BuilderScope columnSeries) {
                                    Intrinsics.checkNotNullParameter(columnSeries, "$this$columnSeries");
                                    ArrayList arrayList = new ArrayList(47);
                                    for (int i2 = 0; i2 < 47; i2++) {
                                        arrayList.add(Float.valueOf(2 + (Random.INSTANCE.nextFloat() * 18)));
                                    }
                                    columnSeries.series(arrayList);
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02691(this.$modelProducer, null), this) == coroutine_suspended) {
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