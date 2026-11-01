package cn.jianyun.workplan.ui.graph;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.graph.model.LineGraphData;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
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
import com.patrykandpatrick.vico.core.cartesian.layer.LineCartesianLayer;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.marker.LineCartesianLayerMarkerTarget;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: GroupLineView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"GroupLineView", "", "gid", "", "monthStatDatas", "", "Lcn/jianyun/workplan/ui/graph/model/LineGraphData;", "(ILjava/util/List;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GroupLineViewKt {
    public static final void GroupLineView(final int i, final List<LineGraphData> monthStatDatas, Composer composer, final int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(monthStatDatas, "monthStatDatas");
        Composer composerStartRestartGroup = composer.startRestartGroup(-825571782);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupLineView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-825571782, i2, -1, "cn.jianyun.workplan.ui.graph.GroupLineView (GroupLineView.kt:64)");
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
            composerStartRestartGroup.startReplaceableGroup(-545337353);
            EffectsKt.LaunchedEffect(Integer.valueOf(i), new AnonymousClass1(cartesianChartModelProducer, monthStatDatas, mutableState, null), composerStartRestartGroup, (i2 & 14) | 64);
            CartesianValueFormatter cartesianValueFormatter = new CartesianValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$bottomAxisValueFormatter$1
                @Override // com.patrykandpatrick.vico.core.cartesian.data.CartesianValueFormatter
                public final CharSequence format(float f2, ChartValues chartValues, AxisPosition.Vertical vertical) {
                    Intrinsics.checkNotNullParameter(chartValues, "<anonymous parameter 1>");
                    int i3 = (int) f2;
                    if (i3 >= 0 && monthStatDatas.get(0).getDatalist().size() > i3) {
                        return monthStatDatas.get(0).getDatalist().get(i3).getShowDay();
                    }
                    return "";
                }
            };
            CartesianMarker cartesianMarkerRememberMarker = MarkerKt.rememberMarker(new CartesianMarkerValueFormatter() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$marker$1
                @Override // com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter
                public final CharSequence format(CartesianDrawContext ctx, List<? extends CartesianMarker.Target> dlist) {
                    Intrinsics.checkNotNullParameter(ctx, "ctx");
                    Intrinsics.checkNotNullParameter(dlist, "dlist");
                    CommonToolKt.mlog("start");
                    if ((!dlist.isEmpty()) && (dlist.get(0) instanceof LineCartesianLayerMarkerTarget)) {
                        CartesianMarker.Target target = dlist.get(0);
                        Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.patrykandpatrick.vico.core.cartesian.marker.LineCartesianLayerMarkerTarget");
                        LineCartesianLayerMarkerTarget lineCartesianLayerMarkerTarget = (LineCartesianLayerMarkerTarget) target;
                        return monthStatDatas.get(0).fetchMarker((int) lineCartesianLayerMarkerTarget.getPoints().get(0).getEntry().getX()) + "\n" + monthStatDatas.get(1).fetchMarker((int) lineCartesianLayerMarkerTarget.getPoints().get(0).getEntry().getX());
                    }
                    return "";
                }
            }, null, false, composerStartRestartGroup, 0, 6);
            Alignment topStart = Alignment.INSTANCE.getTopStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxViewKt.m6895TwoColumnViewdjqsMU(null, Dp.m6097constructorimpl(5), 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -688174880, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    Composer composer4 = composer3;
                    int i4 = 2;
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-688174880, i3, -1, "cn.jianyun.workplan.ui.graph.GroupLineView.<anonymous>.<anonymous> (GroupLineView.kt:104)");
                        }
                        List<LineGraphData> list = monthStatDatas;
                        composer4.startReplaceableGroup(1098475987);
                        ComposerKt.sourceInformation(composer4, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        int i5 = 0;
                        MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer4, 0);
                        int i6 = -1323940314;
                        composer4.startReplaceableGroup(-1323940314);
                        String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                        ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                        int i7 = 2058660585;
                        composer4.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer4, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                        FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                        composer4.startReplaceableGroup(852645093);
                        for (LineGraphData lineGraphData : list) {
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            float f2 = 6;
                            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4)), Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(1));
                            composer4.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                            composer4.startReplaceableGroup(i6);
                            ComposerKt.sourceInformation(composer4, str);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i5);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                            Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, Integer.valueOf(i5));
                            composer4.startReplaceableGroup(i7);
                            ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            BoxViewKt.m6874BoxView536wdKU(null, 0L, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f2), CommonToolKt.color(lineGraphData.getColor()), Dp.m6097constructorimpl(3), composer3, 200064, 3);
                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(i4), composer4, 6, i5);
                            TextKt.m2471Text4IGK_g(lineGraphData.getName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(12), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 6, 130038);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer4 = composer3;
                            i7 = i7;
                            str = str;
                            i6 = -1323940314;
                            i5 = i5;
                            i4 = i4;
                        }
                        composer3.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3120, 5);
            float f2 = 2;
            CartesianChart cartesianChartRememberCartesianChart = CartesianChartKt.rememberCartesianChart(new CartesianLayer[]{LineCartesianLayerKt.m7300rememberLineCartesianLayerEUb7tLY(CollectionsKt.listOf((Object[]) new LineCartesianLayer.LineSpec[]{LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, CommonToolKt.color(monthStatDatas.get(0).getColor())), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, 8, 0, 2046), LineCartesianLayerKt.m7301rememberLineSpecUHX1sFc(DynamicShaderKt.m7335color4WTKRHQ(DynamicShader.INSTANCE, CommonToolKt.color(monthStatDatas.get(1).getColor())), 0.0f, null, 0, null, 0.0f, null, null, null, 0.0f, null, composerStartRestartGroup, 8, 0, 2046)}), Dp.m6097constructorimpl(f2), null, null, null, composerStartRestartGroup, 56, 28)}, VerticalAxisKt.m7292rememberStartAxisqmNWa6M(null, null, null, Dp.m6097constructorimpl(f2), null, null, null, null, null, null, 0.0f, null, null, composerStartRestartGroup, 3072, 0, 8183), null, null, HorizontalAxisKt.m7289rememberBottomAxisWSk2ftU(AxisComponentsKt.m7285rememberAxisLabelComponent0bKA_ZM(0L, 0L, null, null, 0, DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(0)), null, null, null, composerStartRestartGroup, 262144, 479), null, null, Dp.m6097constructorimpl(f2), null, cartesianValueFormatter, null, null, null, 0.0f, null, composerStartRestartGroup, 27656, 0, 1990), null, null, null, null, composerStartRestartGroup, 32840, 492);
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
                objRememberedValue3 = (Function1) new Function1<CartesianChartModel, Float>() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Float invoke(CartesianChartModel it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Float.valueOf(GroupLineViewKt.GroupLineView$lambda$2(mutableState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            CartesianChartHostKt.CartesianChartHost(cartesianChartRememberCartesianChart, cartesianChartModelProducer, modifierM602height3ABfNKs, cartesianMarkerRememberMarker, null, null, vicoZoomStateRememberVicoZoomState, null, false, fullWidth, (Function1) objRememberedValue3, null, null, composer2, (VicoZoomState.$stable << 18) | 1073746376, 0, 6576);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-545334252);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt.GroupLineView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i3) {
                GroupLineViewKt.GroupLineView(i, monthStatDatas, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GroupLineView$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupLineView$lambda$3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$1, reason: invalid class name */
    /* JADX INFO: compiled from: GroupLineView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$1", f = "GroupLineView.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GroupLineView.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "cn.jianyun.workplan.ui.graph.GroupLineViewKt$GroupLineView$1$1", f = "GroupLineView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CartesianChartModelProducer $modelProducer;
            final /* synthetic */ List<LineGraphData> $monthStatDatas;
            final /* synthetic */ MutableState<Float> $step$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02631(CartesianChartModelProducer cartesianChartModelProducer, List<LineGraphData> list, MutableState<Float> mutableState, Continuation<? super C02631> continuation) {
                super(2, continuation);
                this.$modelProducer = cartesianChartModelProducer;
                this.$monthStatDatas = list;
                this.$step$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02631(this.$modelProducer, this.$monthStatDatas, this.$step$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CartesianChartModelProducer cartesianChartModelProducer = this.$modelProducer;
                    final List<LineGraphData> list = this.$monthStatDatas;
                    cartesianChartModelProducer.tryRunTransaction(new Function1<CartesianChartModelProducer.Transaction, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt.GroupLineView.1.1.1
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
                            LineCartesianLayerModelKt.lineSeries(tryRunTransaction, new Function1<LineCartesianLayerModel.BuilderScope, Unit>() { // from class: cn.jianyun.workplan.ui.graph.GroupLineViewKt.GroupLineView.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    List<LineGraphData> list3 = list2;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    for (LineGraphData lineGraphData : list3) {
                                        lineSeries.series(lineGraphData.fetchXData(), lineGraphData.fetchYData());
                                        arrayList.add(Unit.INSTANCE);
                                    }
                                }
                            });
                        }
                    });
                    GroupLineViewKt.GroupLineView$lambda$3(this.$step$delegate, this.$monthStatDatas.get(0).step());
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
                if (BuildersKt.withContext(Dispatchers.getDefault(), new C02631(this.$modelProducer, this.$monthStatDatas, this.$step$delegate, null), this) == coroutine_suspended) {
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