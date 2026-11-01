package cn.jianyun.workplan.ui.component.sort;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.adgain.sdk.base.models.AdConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: rememberDragDropState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\f\u001a^\u0010\r\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u001221\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001e"}, d2 = {"offsetEnd", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getOffsetEnd", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)I", "rememberDragDropState", "Lcn/jianyun/workplan/ui/component/sort/DragDropState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onSwap", "Lkotlin/Function2;", "", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcn/jianyun/workplan/ui/component/sort/DragDropState;", "DraggableItem", "Landroidx/compose/foundation/lazy/LazyItemScope;", "dragDropState", AdConstants.index, "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lkotlin/ParameterName;", "name", "isDragging", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/LazyItemScope;Lcn/jianyun/workplan/ui/component/sort/DragDropState;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "getVisibleItemInfoFor", "absoluteIndex", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RememberDragDropStateKt {
    public static final DragDropState rememberDragDropState(LazyListState lazyListState, Function2<? super Integer, ? super Integer, Unit> onSwap, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onSwap, "onSwap");
        composer.startReplaceableGroup(298736357);
        ComposerKt.sourceInformation(composer, "C(rememberDragDropState)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298736357, i, -1, "cn.jianyun.workplan.ui.component.sort.rememberDragDropState (rememberDragDropState.kt:22)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(lazyListState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new DragDropState(lazyListState, context, coroutineScope, onSwap);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        DragDropState dragDropState = (DragDropState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dragDropState;
    }

    public static final LazyListItemInfo getVisibleItemInfoFor(LazyListState lazyListState, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "<this>");
        return (LazyListItemInfo) CollectionsKt.getOrNull(lazyListState.getLayoutInfo().getVisibleItemsInfo(), i - ((LazyListItemInfo) CollectionsKt.first((List) lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex());
    }

    public static final int getOffsetEnd(LazyListItemInfo lazyListItemInfo) {
        Intrinsics.checkNotNullParameter(lazyListItemInfo, "<this>");
        return lazyListItemInfo.getOffset() + lazyListItemInfo.getSize();
    }

    public static final void DraggableItem(final LazyItemScope lazyItemScope, final DragDropState dragDropState, final int i, Modifier modifier, final Function4<? super ColumnScope, ? super Boolean, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        Modifier.Companion companionGraphicsLayer;
        Intrinsics.checkNotNullParameter(lazyItemScope, "<this>");
        Intrinsics.checkNotNullParameter(dragDropState, "dragDropState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1737098718);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DraggableItem)P(1,2,3)");
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1737098718, i2, -1, "cn.jianyun.workplan.ui.component.sort.DraggableItem (rememberDragDropState.kt:51)");
        }
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(dragDropState.getDraggingItemOffset$app_release() * 0.67f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
        final State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(dragDropState.getPreviousItemOffset$app_release().getValue().floatValue() * 0.67f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
        Integer currentIndexOfDraggedItem = dragDropState.getCurrentIndexOfDraggedItem();
        boolean z = currentIndexOfDraggedItem != null && i == currentIndexOfDraggedItem.intValue();
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(1875260180);
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(Modifier.INSTANCE, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.RememberDragDropStateKt$DraggableItem$draggingModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayer) {
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.setTranslationY(RememberDragDropStateKt.DraggableItem$lambda$1(stateAnimateFloatAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierZIndex, (Function1) objRememberedValue);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            Integer previousIndexOfDraggedItem$app_release = dragDropState.getPreviousIndexOfDraggedItem$app_release();
            if (previousIndexOfDraggedItem$app_release != null && i == previousIndexOfDraggedItem$app_release.intValue()) {
                composerStartRestartGroup.startReplaceableGroup(1875260371);
                Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(Modifier.INSTANCE, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.RememberDragDropStateKt$DraggableItem$draggingModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayer) {
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.setTranslationY(RememberDragDropStateKt.DraggableItem$lambda$2(stateAnimateFloatAsState2));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierZIndex2, (Function1) objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1875260508);
                composerStartRestartGroup.endReplaceableGroup();
                companionGraphicsLayer = Modifier.INSTANCE;
            }
        }
        Modifier modifierThen = modifier2.then(companionGraphicsLayer);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        content.invoke(ColumnScopeInstance.INSTANCE, Boolean.valueOf(z), composerStartRestartGroup, Integer.valueOf(((i2 >> 6) & 896) | 6));
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.sort.RememberDragDropStateKt.DraggableItem.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                RememberDragDropStateKt.DraggableItem(lazyItemScope, dragDropState, i, modifier3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DraggableItem$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DraggableItem$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}