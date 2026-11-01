package cn.jianyun.workplan.ui.graph.test;

import android.graphics.PorterDuff;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import cn.jianyun.workplan.ui.graph.MarkerKt;
import cn.jianyun.workplan.util.CommonToolKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartHostKt;
import com.patrykandpatrick.vico.compose.cartesian.CartesianChartKt;
import com.patrykandpatrick.vico.compose.cartesian.HorizontalLayoutKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.AxisComponentsKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.HorizontalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.axis.VerticalAxisKt;
import com.patrykandpatrick.vico.compose.cartesian.layer.LineCartesianLayerKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.compose.common.shader.DynamicShaderKt;
import com.patrykandpatrick.vico.compose.common.shape.ShapeKt;
import com.patrykandpatrick.vico.core.cartesian.HorizontalLayout;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisItemPlacer;
import com.patrykandpatrick.vico.core.cartesian.axis.AxisPosition;
import com.patrykandpatrick.vico.core.cartesian.axis.VerticalAxis;
import com.patrykandpatrick.vico.core.cartesian.data.CartesianChartModelProducer;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModel;
import com.patrykandpatrick.vico.core.cartesian.data.LineCartesianLayerModelKt;
import com.patrykandpatrick.vico.core.cartesian.layer.CartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.component.LineComponent;
import com.patrykandpatrick.vico.core.common.component.TextComponent;
import com.patrykandpatrick.vico.core.common.data.ExtraStore;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shader.TopBottomShader;
import com.patrykandpatrick.vico.core.common.shape.DashedShape;
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
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: Bar9View.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018CX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"chartColors", "", "Landroidx/compose/ui/graphics/Color;", "getChartColors", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "x", "", "Bar9View", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Bar9ViewKt {
    private static final List<Integer> x = CollectionsKt.toList(new IntRange(1, 100));

    public static final void Bar9View(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(707157168);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Bar9View)");
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
                ComposerKt.traceEventStart(707157168, i3, -1, "cn.jianyun.workplan.ui.graph.test.Bar9View (Bar9View.kt:44)");
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
            List<Color> chartColors = getChartColors(composerStartRestartGroup, 0);
            CartesianMarker cartesianMarkerRememberMarker = MarkerKt.rememberMarker(null, null, false, composerStartRestartGroup, 0, 7);
            float f2 = 6;
            float f3 = 1;
            int i5 = i3;
            float f4 = 2;
            CartesianLayer[] cartesianLayerArr = {LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(CollectionsKt.listOf(LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(new TopBottomShader(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, chartColors.get(0).m3765unboximpl()), DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, chartColors.get(1).m3765unboximpl()), 0.0f, 4, null), 0.0f, new TopBottomShader(DynamicShader.INSTANCE.compose(DynamicShaderKt.m7337component6a0pyJM$default(DynamicShader.INSTANCE, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), chartColors.get(0).m3765unboximpl(), (DynamicShader) null, DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(f3)), 0.0f, 0L, composerStartRestartGroup, 4104, 52), Dp.m6097constructorimpl(f2), false, null, null, 28, null), DynamicShaderKt.verticalGradient$default(DynamicShader.INSTANCE, new Color[]{Color.m3745boximpl(Color.INSTANCE.m3781getBlack0d7_KjU()), Color.m3745boximpl(Color.INSTANCE.m3790getTransparent0d7_KjU())}, null, 2, null), PorterDuff.Mode.DST_IN), DynamicShader.INSTANCE.compose(DynamicShaderKt.m7337component6a0pyJM$default(DynamicShader.INSTANCE, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getRectangle(), chartColors.get(1).m3765unboximpl(), (DynamicShader) null, DimensionsKt.m7305ofVpY3zN4$default(Dimensions.INSTANCE, Dp.m6097constructorimpl(f4), 0.0f, 2, null), 0.0f, 0L, composerStartRestartGroup, 4104, 52), Dp.m6097constructorimpl(5), false, null, null, 24, null), DynamicShaderKt.verticalGradient$default(DynamicShader.INSTANCE, new Color[]{Color.m3745boximpl(Color.INSTANCE.m3790getTransparent0d7_KjU()), Color.m3745boximpl(Color.INSTANCE.m3781getBlack0d7_KjU())}, null, 2, null), PorterDuff.Mode.DST_IN), 0.0f, 4, null), 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_CURRENT_DOWNLOAD_INDEX, 0, 2042)), 0.0f, null, null, null, composerStartRestartGroup, 8, 30)};
            float f5 = 8;
            composer2 = composerStartRestartGroup;
            TextComponent textComponentM7285rememberAxisLabelComponent0bKA_ZM = AxisComponentsKt.m7285rememberAxisLabelComponent0bKA_ZM(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getOnBackground(), 0L, ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), Color.INSTANCE.m3790getTransparent0d7_KjU(), (DynamicShader) null, (Dimensions) null, Dp.m6097constructorimpl(f3), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getOutlineVariant(), composerStartRestartGroup, 24632, 12), null, 0, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f4)), DimensionsKt.m7307ofqDBjuR0$default(Dimensions.INSTANCE, 0.0f, 0.0f, Dp.m6097constructorimpl(f5), 0.0f, 11, null), null, null, composerStartRestartGroup, 2359808, TTAdConstant.IMAGE_LIST_SIZE_CODE);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getOutlineVariant();
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = ShapeKt.m7345dashedJS8el8$default(Shape.INSTANCE, Shape.INSTANCE.getPill(), Dp.m6097constructorimpl(4), Dp.m6097constructorimpl(f5), (DashedShape.FitStrategy) null, 8, (Object) null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            LineComponent lineComponentM7329rememberLineComponentab1Xxas = ComponentsKt.m7329rememberLineComponentab1Xxas(outlineVariant, 0.0f, (Shape) objRememberedValue2, null, null, 0.0f, 0L, composer2, 512, 122);
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = AxisItemPlacer.Vertical.Companion.count$default(AxisItemPlacer.Vertical.INSTANCE, new Function1<ExtraStore, Integer>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt$Bar9View$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(ExtraStore it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return 4;
                    }
                }, false, 2, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            VerticalAxis<AxisPosition.Vertical.Start> verticalAxisM7292rememberStartAxisqmNWa6M = VerticalAxisKt.m7292rememberStartAxisqmNWa6M(textComponentM7285rememberAxisLabelComponent0bKA_ZM, null, null, 0.0f, lineComponentM7329rememberLineComponentab1Xxas, null, null, null, null, (AxisItemPlacer.Vertical) objRememberedValue3, 0.0f, null, null, composer2, 1073775032, 0, 7656);
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = AxisItemPlacer.Horizontal.Companion.default$default(AxisItemPlacer.Horizontal.INSTANCE, 3, 0, false, true, 6, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            CartesianChartHostKt.CartesianChartHost(CartesianChartKt.rememberCartesianChart(cartesianLayerArr, verticalAxisM7292rememberStartAxisqmNWa6M, null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(null, null, null, 0.0f, null, null, null, null, null, 0.0f, (AxisItemPlacer.Horizontal) objRememberedValue4, composer2, CpioConstants.C_ISBLK, 8, 1007), null, null, null, null, composer2, 32840, 492), cartesianChartModelProducer, modifier3, cartesianMarkerRememberMarker, null, null, null, null, false, HorizontalLayoutKt.m7279fullWidthqDBjuR0$default(HorizontalLayout.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), null, null, null, composer2, ((i5 << 6) & 896) | 1174409288, 0, 7408);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt.Bar9View.5
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
                Bar9ViewKt.Bar9View(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final List<Color> getChartColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1804028037, i, -1, "cn.jianyun.workplan.ui.graph.test.<get-chartColors> (Bar9View.kt:176)");
        }
        List<Color> listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3745boximpl(CommonToolKt.randomColor(102)), Color.m3745boximpl(CommonToolKt.randomColor(202))});
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listListOf;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt$Bar9View$1, reason: invalid class name */
    /* JADX INFO: compiled from: Bar9View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar9ViewKt$Bar9View$1", f = "Bar9View.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt$Bar9View$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Bar9View.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.test.Bar9ViewKt$Bar9View$1$1", f = "Bar9View.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
        static final class C02871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02871(CartesianChartModelProducer cartesianChartModelProducer, Continuation<? super C02871> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02871 c02871 = new C02871(this.$modelProducer, continuation);
                c02871.L$0 = obj;
                return c02871;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.$modelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt.Bar9View.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CartesianChartModelProducer.Transaction transaction) {
                            invoke2(transaction);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CartesianChartModelProducer.Transaction tryRunTransaction) {
                            Intrinsics.checkNotNullParameter(tryRunTransaction, "$this$tryRunTransaction");
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.test.Bar9ViewKt.Bar9View.1.1.1.1
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02871(this.$modelProducer, null), this) == coroutine_suspended) {
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