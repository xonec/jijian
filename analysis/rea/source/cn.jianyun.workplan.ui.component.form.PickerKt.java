package cn.jianyun.workplan.ui.component.form;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: Picker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ai\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0003ø\u0001\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Picker", "", "items", "", "", "state", "Lcn/jianyun/workplan/ui/component/form/PickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "startIndex", "", "visibleItemsCount", "textModifier", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "dividerColor", "Landroidx/compose/ui/graphics/Color;", "Picker-88mDfTA", "(Ljava/util/List;Lcn/jianyun/workplan/ui/component/form/PickerState;Landroidx/compose/ui/Modifier;IILandroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/runtime/Composer;II)V", "pixelsToDp", "Landroidx/compose/ui/unit/Dp;", "pixels", "(ILandroidx/compose/runtime/Composer;I)F", "rememberPickerState", "(Landroidx/compose/runtime/Composer;I)Lcn/jianyun/workplan/ui/component/form/PickerState;", "fadingEdge", "brush", "Landroidx/compose/ui/graphics/Brush;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PickerKt {
    public static final PickerState rememberPickerState(Composer composer, int i) {
        composer.startReplaceableGroup(817933591);
        ComposerKt.sourceInformation(composer, "C(rememberPickerState)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(817933591, i, -1, "cn.jianyun.workplan.ui.component.form.rememberPickerState (Picker.kt:37)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PickerState();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PickerState pickerState = (PickerState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pickerState;
    }

    /* JADX INFO: renamed from: Picker-88mDfTA, reason: not valid java name */
    public static final void m6853Picker88mDfTA(final List<String> items, PickerState pickerState, Modifier modifier, int i, int i2, Modifier modifier2, TextStyle textStyle, long j, Composer composer, final int i3, final int i4) {
        PickerState pickerStateRememberPickerState;
        int i5;
        TextStyle textStyle2;
        long background;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1590038546);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Picker)P(1,4,2,3,7,5,6,0:c#ui.graphics.Color)");
        if ((i4 & 2) != 0) {
            pickerStateRememberPickerState = rememberPickerState(composerStartRestartGroup, 0);
            i5 = i3 & (-113);
        } else {
            pickerStateRememberPickerState = pickerState;
            i5 = i3;
        }
        Modifier.Companion companion = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        int i6 = (i4 & 8) != 0 ? 0 : i;
        int i7 = (i4 & 16) != 0 ? 3 : i2;
        Modifier.Companion companion2 = (i4 & 32) != 0 ? Modifier.INSTANCE : modifier2;
        if ((i4 & 64) != 0) {
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            i5 &= -3670017;
            textStyle2 = (TextStyle) objConsume;
        } else {
            textStyle2 = textStyle;
        }
        if ((i4 & 128) != 0) {
            i5 &= -29360129;
            background = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground();
        } else {
            background = j;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1590038546, i5, -1, "cn.jianyun.workplan.ui.component.form.Picker (Picker.kt:45)");
        }
        int i8 = i7 / 2;
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(((LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % items.size())) - i8) + i6, 0, composerStartRestartGroup, 0, 2);
        FlingBehavior flingBehaviorRememberSnapFlingBehavior = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(lazyListStateRememberLazyListState, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        float fPixelsToDp = pixelsToDp(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = Brush.Companion.m3713verticalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m3745boximpl(Color.INSTANCE.m3790getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.5f), Color.m3745boximpl(Color.INSTANCE.m3781getBlack0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m3745boximpl(Color.INSTANCE.m3790getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Brush brush = (Brush) objRememberedValue2;
        EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, new PickerKt$Picker$1(lazyListStateRememberLazyListState, i8, items, pickerStateRememberPickerState, null), composerStartRestartGroup, 64);
        int i9 = (i5 >> 6) & 14;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        int i10 = i9 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i10 & 14) | (i10 & 112));
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        final int i11 = i6;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
        int i12 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
        final Modifier modifier3 = companion;
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
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 112));
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final int i13 = Integer.MAX_VALUE;
        final Modifier modifier4 = companion2;
        final TextStyle textStyle3 = textStyle2;
        final int i14 = i5;
        LazyDslKt.LazyColumn(fadingEdge(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6097constructorimpl(i7 * fPixelsToDp)), brush), lazyListStateRememberLazyListState, null, false, null, Alignment.INSTANCE.getCenterHorizontally(), flingBehaviorRememberSnapFlingBehavior, false, new Function1<LazyListScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.PickerKt$Picker$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                int i15 = i13;
                final MutableState<Integer> mutableState2 = mutableState;
                final Modifier modifier5 = modifier4;
                final TextStyle textStyle4 = textStyle3;
                final int i16 = i14;
                final List<String> list = items;
                LazyListScope.items$default(LazyColumn, i15, null, null, ComposableLambdaKt.composableLambdaInstance(-513469231, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.PickerKt$Picker$2$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope items2, int i17, Composer composer2, int i18) {
                        int i19;
                        Intrinsics.checkNotNullParameter(items2, "$this$items");
                        if ((i18 & 112) == 0) {
                            i19 = (composer2.changed(i17) ? 32 : 16) | i18;
                        } else {
                            i19 = i18;
                        }
                        if ((i19 & 721) != 144 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-513469231, i18, -1, "cn.jianyun.workplan.ui.component.form.Picker.<anonymous>.<anonymous>.<anonymous> (Picker.kt:95)");
                            }
                            String strPicker_88mDfTA$getItem = PickerKt.Picker_88mDfTA$getItem(list, i17);
                            int iM6017getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m6017getEllipsisgIe3tQ8();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            final MutableState<Integer> mutableState3 = mutableState2;
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged = composer2.changed(mutableState3);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.PickerKt$Picker$2$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                        m6854invokeozmzZPI(intSize.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                    public final void m6854invokeozmzZPI(long j2) {
                                        mutableState3.setValue(Integer.valueOf(IntSize.m6266getHeightimpl(j2)));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            TextKt.m2471Text4IGK_g(strPicker_88mDfTA$getItem, OnRemeasuredModifierKt.onSizeChanged(companion3, (Function1) objRememberedValue3).then(modifier5), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM6017getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle4, composer2, 0, (3670016 & i16) | 3120, 55292);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 6, null);
            }
        }, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 156);
        int i15 = (i5 >> 15) & 896;
        long j2 = background;
        DividerKt.m1869Divider9IZ8Weo(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(i8 * fPixelsToDp), 1, null), 0.0f, j2, composerStartRestartGroup, i15, 2);
        DividerKt.m1869Divider9IZ8Weo(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(fPixelsToDp * (i8 + 1)), 1, null), 0.0f, j2, composerStartRestartGroup, i15, 2);
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
        final PickerState pickerState2 = pickerStateRememberPickerState;
        final int i16 = i7;
        final Modifier modifier5 = companion2;
        final TextStyle textStyle4 = textStyle2;
        final long j3 = background;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.PickerKt$Picker$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i17) {
                PickerKt.m6853Picker88mDfTA(items, pickerState2, modifier3, i11, i16, modifier5, textStyle4, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Picker_88mDfTA$getItem(List<String> list, int i) {
        return list.get(i % list.size());
    }

    private static final Modifier fadingEdge(Modifier modifier, final Brush brush) {
        return DrawModifierKt.drawWithContent(GraphicsLayerModifierKt.m3915graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, CompositingStrategy.INSTANCE.m3845getOffscreenNrFUSI(), 65535, null), new Function1<ContentDrawScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.PickerKt.fadingEdge.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                DrawScope.m4297drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m3678getDstIn0nO6VwU(), 62, null);
            }
        });
    }

    private static final float pixelsToDp(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(964074021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(964074021, i2, -1, "cn.jianyun.workplan.ui.component.form.pixelsToDp (Picker.kt:130)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fMo315toDpu2uoSUM = ((Density) objConsume).mo315toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo315toDpu2uoSUM;
    }
}