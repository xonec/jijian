package cn.jianyun.workplan.ui.graph;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.AnimatedPieView;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.AnimatedPieViewConfig;
import cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.data.SimplePieInfo;
import cn.jianyun.workplan.ui.component.nav.BoxViewKt;
import cn.jianyun.workplan.ui.graph.model.PieGraphData;
import cn.jianyun.workplan.ui.graph.model.PieGraphItem;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PieGraph.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"PieGraph", "", "gid", "", "pieData", "Lcn/jianyun/workplan/ui/graph/model/PieGraphData;", "(ILcn/jianyun/workplan/ui/graph/model/PieGraphData;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PieGraphKt {
    public static final void PieGraph(final int i, final PieGraphData pieData, Composer composer, final int i2) {
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(pieData, "pieData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1917182642);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PieGraph)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1917182642, i2, -1, "cn.jianyun.workplan.ui.graph.PieGraph (PieGraph.kt:43)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(mutableState2);
        PieGraphKt$PieGraph$1$1 pieGraphKt$PieGraph$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || pieGraphKt$PieGraph$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            pieGraphKt$PieGraph$1$1RememberedValue = new PieGraphKt$PieGraph$1$1(i, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(pieGraphKt$PieGraph$1$1RememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) pieGraphKt$PieGraph$1$1RememberedValue, composerStartRestartGroup, (i2 & 14) | 64);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        int i3 = 2058660585;
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (pieData.isValid()) {
            composerStartRestartGroup.startReplaceableGroup(339390112);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AndroidView_androidKt.AndroidView(new Function1<Context, AnimatedPieView>() { // from class: cn.jianyun.workplan.ui.graph.PieGraphKt$PieGraph$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public final AnimatedPieView invoke(Context it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new AnimatedPieView(it);
                }
            }, PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(-Dp.m6097constructorimpl(5)), 1, null), 0.0f, 1, null), Dp.m6097constructorimpl(MediaPlayer.MEDIA_PLAYER_OPTION_VIDEOCODEC_PIXEL_ALIGN)), Dp.m6097constructorimpl(10), Dp.m6097constructorimpl(0)), new Function1<AnimatedPieView, Unit>() { // from class: cn.jianyun.workplan.ui.graph.PieGraphKt$PieGraph$2$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedPieView animatedPieView) {
                    invoke2(animatedPieView);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimatedPieView it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AnimatedPieViewConfig animatedPieViewConfig = new AnimatedPieViewConfig();
                    animatedPieViewConfig.startAngle(-90.0f);
                    int i4 = 0;
                    for (PieGraphItem pieGraphItem : pieData.getDatalist()) {
                        animatedPieViewConfig.addData(new SimplePieInfo(pieGraphItem.getName(), CommonToolKt.toFloatData(pieGraphItem.getValue(), 2), ColorKt.m3809toArgb8_81llA(CommonToolKt.color(pieGraphItem.getColor())), pieGraphItem.label(i4)));
                        i4++;
                    }
                    animatedPieViewConfig.drawText(true);
                    animatedPieViewConfig.textSize(30.0f);
                    animatedPieViewConfig.duration(100L);
                    animatedPieViewConfig.guideLineWidth(5);
                    animatedPieViewConfig.guideLineMarginStart(12);
                    animatedPieViewConfig.cubicGuide(true);
                    animatedPieViewConfig.textMargin(1);
                    animatedPieViewConfig.textGravity(32);
                    it.applyConfig(animatedPieViewConfig);
                    CommonToolKt.mlog("gid", Integer.valueOf(i), Integer.valueOf(PieGraphKt.PieGraph$lambda$4(mutableState2)));
                    it.start();
                }
            }, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.startReplaceableGroup(339391669);
            if (Intrinsics.areEqual(pieData.getCenterText(), "")) {
                composer3 = composerStartRestartGroup;
            } else {
                composer3 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(pieData.getCenterText(), (Modifier) null, cn.jianyun.workplan.ui.theme.ColorKt.getThemeColor(), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
            }
            composer3.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            Composer composer4 = composer3;
            composer4.startReplaceableGroup(1098475987);
            ComposerKt.sourceInformation(composer4, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i4 = 0;
            MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer4, 0);
            int i5 = -1323940314;
            composer4.startReplaceableGroup(-1323940314);
            String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
            ComposerKt.sourceInformation(composer4, str);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer4);
            Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer4)), composer4, 0);
            composer4.startReplaceableGroup(i3);
            ComposerKt.sourceInformationMarkerStart(composer4, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
            FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
            composer4.startReplaceableGroup(339391964);
            for (PieGraphItem pieGraphItem : pieData.getDatalist()) {
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                float f2 = 1;
                float f3 = 6;
                Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(BorderKt.m227borderxT4_qwU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4)), Dp.m6097constructorimpl(f2), Color.m3754copywmQWz5c$default(cn.jianyun.workplan.ui.theme.ColorKt.getThemeColor(), ((Number) CommonToolKt.ifv(Intrinsics.areEqual(PieGraph$lambda$1(mutableState), pieGraphItem.getName()), Float.valueOf(1.0f), Float.valueOf(0.0f))).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), null, 4, null), 0.5f), Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f2));
                composer4.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                composer4.startReplaceableGroup(i5);
                ComposerKt.sourceInformation(composer4, str);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, i4);
                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer4.useNode();
                }
                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer4);
                Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer4)), composer4, Integer.valueOf(i4));
                composer4.startReplaceableGroup(i3);
                ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = i4;
                BoxViewKt.m6874BoxView536wdKU(null, 0L, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f3), CommonToolKt.color(pieGraphItem.getColor()), Dp.m6097constructorimpl(3), composer4, 200064, 3);
                float f4 = 2;
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f4), composer4, 6, i6);
                Composer composer5 = composer4;
                TextKt.m2471Text4IGK_g(pieGraphItem.showName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(12), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 6, 130038);
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f4), composer5, 6, i6);
                TextKt.m2471Text4IGK_g(pieGraphItem.getValue() + pieData.getUnit(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 131062);
                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(f4), composer5, 6, i6);
                TextKt.m2471Text4IGK_g(String.valueOf(pieGraphItem.percentValue()), (Modifier) null, Color.INSTANCE.m3785getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3456, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endReplaceableGroup();
                composer5.endNode();
                composer5.endReplaceableGroup();
                composer5.endReplaceableGroup();
                composer4 = composer5;
                i4 = i6;
                str = str;
                i5 = i5;
                i3 = 2058660585;
            }
            Composer composer6 = composer4;
            composer6.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endReplaceableGroup();
            composer6.endNode();
            composer6.endReplaceableGroup();
            composer6.endReplaceableGroup();
            composer6.endReplaceableGroup();
            composer2 = composer6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(339392953);
            BoxViewKt.m6880EmptyDataView6BXD4ec("暂无数据", 0L, 0L, null, composer2, 6, 14);
            composer2.endReplaceableGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.PieGraphKt.PieGraph.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                invoke(composer7, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer7, int i7) {
                PieGraphKt.PieGraph(i, pieData, composer7, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    private static final String PieGraph$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PieGraph$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PieGraph$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }
}