package cn.jianyun.workplan.ui.component.nav;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.compose.DialogNavigator;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.SelectDO;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: PartTitleView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001as\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\t\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001ak\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"DialogTitleView", "", "title", "", "tip", "rightTool", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FlowTagView", b.f2259d, "singleLine", "", "big", DialogNavigator.NAME, "options", "", "Lcn/jianyun/workplan/util/SelectDO;", "vpadding", "Landroidx/compose/ui/unit/Dp;", "hpadding", "onClick", "Lkotlin/Function1;", "FlowTagView-1tP8Re8", "(Ljava/lang/String;ZZZLjava/util/List;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "unit", "FlowTagView-DzVHIIc", "(Ljava/util/List;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PartTitleView", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "TagView", "tag", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "round", "offsetY", "color", "Landroidx/compose/ui/graphics/Color;", "hollow", "TagView-o4cevVk", "(Ljava/lang/String;JZFZJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PartTitleViewKt {
    public static final void PartTitleView(final String title, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(1938213680);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PartTitleView)");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1938213680, i2, -1, "cn.jianyun.workplan.ui.component.nav.PartTitleView (PartTitleView.kt:37)");
            }
            Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(15), 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default);
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
            long sp = TextUnitKt.getSp(13);
            long sp2 = TextUnitKt.getSp(13);
            long jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
            float f2 = 2;
            float f3 = 40;
            float f4 = 12;
            float f5 = 6;
            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(OffsetKt.m527offsetVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f2), Dp.m6097constructorimpl(f2)), Dp.m6097constructorimpl(f3)), CommonToolKt.color("#F26B1F"), null, 2, null), Dp.m6097constructorimpl(f4), Dp.m6097constructorimpl(f5));
            composer2 = composerStartRestartGroup;
            int i3 = i2 & 14;
            TextKt.m2471Text4IGK_g(title, modifierM568paddingVpY3zN4, jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i3 | 3456, 6, 130032);
            TextKt.m2471Text4IGK_g(title, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f3)), ColorKt.getThemeColor(), null, 2, null), Dp.m6097constructorimpl(f4), Dp.m6097constructorimpl(f5)), Color.INSTANCE.m3792getWhite0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(13), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i3 | 3504, 6, 130032);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt.PartTitleView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                PartTitleViewKt.PartTitleView(title, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:119:0x0201  */
    /* JADX WARN: Code duplicated, block: B:121:0x021f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x0310  */
    /* JADX WARN: Code duplicated, block: B:133:0x0318  */
    /* JADX WARN: Code duplicated, block: B:137:0x0391  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0136  */
    /* JADX INFO: renamed from: TagView-o4cevVk, reason: not valid java name */
    public static final void m6915TagViewo4cevVk(final String tag, long j, boolean z, float f2, boolean z2, long j2, boolean z3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        long sp;
        int i4;
        boolean z4;
        int i5;
        int i6;
        float fM6097constructorimpl;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        long themeColor;
        boolean z6;
        final Function0<Unit> function1;
        float fM6111unboximpl;
        float fM6111unboximpl2;
        float fM6111unboximpl3;
        long packedValue;
        final Function0<Unit> function2;
        boolean zChanged;
        Object objRememberedValue;
        float f3;
        Function0<Unit> function3;
        Composer composer2;
        boolean z7;
        final long j4;
        final long j5;
        final boolean z8;
        final float f4;
        final boolean z9;
        final Function0<Unit> function4;
        final boolean z10;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998658315);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TagView)P(7,2:c#ui.unit.TextUnit,6,4:c#ui.unit.Dp!1,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(tag) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 == 0) {
            if ((i & 112) == 0) {
                sp = j;
                i3 |= composerStartRestartGroup.changed(sp) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z4 = z;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        fM6097constructorimpl = f2;
                        if (composerStartRestartGroup.changed(fM6097constructorimpl)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            z5 = z2;
                            if (composerStartRestartGroup.changed(z5)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((i & 458752) == 0) {
                                if (composerStartRestartGroup.changed(j2)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & 64;
                            if (i12 != 0) {
                                i3 |= 1572864;
                            } else if ((i & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(z3)) {
                                    i13 = 1048576;
                                } else {
                                    i13 = 524288;
                                }
                                i3 |= i13;
                            }
                            i14 = i2 & 128;
                            if (i14 != 0) {
                                i3 |= 12582912;
                            } else if ((i & 29360128) == 0) {
                                if (composerStartRestartGroup.changedInstance(function0)) {
                                    i15 = 8388608;
                                } else {
                                    i15 = 4194304;
                                }
                                i3 |= i15;
                            }
                            i16 = i3;
                            if ((23967451 & i16) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i17 != 0) {
                                    sp = TextUnitKt.getSp(11);
                                }
                                j3 = sp;
                                if (i4 != 0) {
                                    z4 = false;
                                }
                                if (i6 != 0) {
                                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                if (i10 != 0) {
                                    themeColor = ColorKt.getThemeColor();
                                } else {
                                    themeColor = j2;
                                }
                                if (i12 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    function1 = null;
                                } else {
                                    function1 = function0;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                                }
                                float f5 = 6;
                                fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f5)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                                float f6 = 3;
                                fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f5)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f6))))).m6111unboximpl();
                                fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                                packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                                if (z6) {
                                    composerStartRestartGroup.startReplaceableGroup(1163113560);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    zChanged2 = composerStartRestartGroup.changed(function1);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function0<Unit> function5 = function1;
                                                if (function5 != null) {
                                                    function5.invoke();
                                                }
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    f3 = fM6097constructorimpl;
                                    function3 = function1;
                                    TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    z7 = z4;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    function2 = function1;
                                    boolean z11 = z4;
                                    float f7 = fM6097constructorimpl;
                                    composerStartRestartGroup.startReplaceableGroup(1163113874);
                                    FontWeight fontWeight = (FontWeight) CommonToolKt.ifv(z11, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                    long jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                                    Modifier modifierM6957radius3ABfNKs2 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f7, 1, null), fM6111unboximpl);
                                    boolean z12 = function2 != null;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(function2);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function0<Unit> function5 = function2;
                                                if (function5 != null) {
                                                    function5.invoke();
                                                }
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    f3 = f7;
                                    function3 = function2;
                                    composer2 = composerStartRestartGroup;
                                    z7 = z11;
                                    TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs2, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU, j3, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                    composer2.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j4 = j3;
                                j5 = themeColor;
                                z8 = z6;
                                f4 = f3;
                                z9 = z5;
                                function4 = function3;
                                z10 = z7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function4 = function0;
                                composer2 = composerStartRestartGroup;
                                j4 = sp;
                                z10 = z4;
                                f4 = fM6097constructorimpl;
                                z9 = z5;
                                j5 = j2;
                                z8 = z3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z3)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        if (i14 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i3;
                        if ((23967451 & i16) == 4793490) {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f8 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f8)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f9 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f8)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f9))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f9)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs3 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs3, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z13 = z4;
                                float f10 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight2 = (FontWeight) CommonToolKt.ifv(z13, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU2 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs4 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f10, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f10;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z13;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs4, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU2, j3, (FontStyle) null, fontWeight2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        } else {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f11 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f12 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f12))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f12)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs5 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs5, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z14 = z4;
                                float f13 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight3 = (FontWeight) CommonToolKt.ifv(z14, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU3 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs6 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f13, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f13;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z14;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs6, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU3, j3, (FontStyle) null, fontWeight3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    z5 = z2;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(j2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z3)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        if (i14 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i3;
                        if ((23967451 & i16) == 4793490) {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f14 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f14)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f15 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f14)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f15))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f15)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs7 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs7, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z15 = z4;
                                float f16 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight4 = (FontWeight) CommonToolKt.ifv(z15, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU4 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs8 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f16, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f16;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z15;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs8, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU4, j3, (FontStyle) null, fontWeight4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        } else {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f17 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f17)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f18 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f17)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f18))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f18)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs9 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs9, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z16 = z4;
                                float f19 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight5 = (FontWeight) CommonToolKt.ifv(z16, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU5 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs10 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f19, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f19;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z16;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs10, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU5, j3, (FontStyle) null, fontWeight5, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f110 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f110)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f111 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f110)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs11 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z17 = z4;
                            float f112 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight6 = (FontWeight) CommonToolKt.ifv(z17, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU6 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs12 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f112, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f112;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z17;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs12, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU6, j3, (FontStyle) null, fontWeight6, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f113 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f113)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f114 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f113)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f114))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f114)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs13 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs13, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z18 = z4;
                            float f115 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight7 = (FontWeight) CommonToolKt.ifv(z18, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU7 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs14 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f115, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f115;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z18;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs14, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU7, j3, (FontStyle) null, fontWeight7, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                fM6097constructorimpl = f2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        z5 = z2;
                        if (composerStartRestartGroup.changed(z5)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(j2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z3)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        if (i14 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i3;
                        if ((23967451 & i16) == 4793490) {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f116 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f116)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f117 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f116)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f117))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f117)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs15 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs15, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z19 = z4;
                                float f118 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight8 = (FontWeight) CommonToolKt.ifv(z19, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU8 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs16 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f118, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f118;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z19;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs16, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU8, j3, (FontStyle) null, fontWeight8, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        } else {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f119 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f119)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f1110 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f119)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1110))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1110)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs17 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs17, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z110 = z4;
                                float f1111 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight9 = (FontWeight) CommonToolKt.ifv(z110, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU9 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs18 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1111, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f1111;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z110;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs18, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU9, j3, (FontStyle) null, fontWeight9, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f1112 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1112)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1113 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1112)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1113))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1113)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs19 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs19, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z111 = z4;
                            float f1114 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight10 = (FontWeight) CommonToolKt.ifv(z111, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU10 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs110 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1114, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f1114;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z111;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs110, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU10, j3, (FontStyle) null, fontWeight10, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f1115 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1115)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1116 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1115)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1116))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1116)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs111, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z112 = z4;
                            float f1117 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight11 = (FontWeight) CommonToolKt.ifv(z112, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU11 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs112 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1117, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f1117;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z112;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs112, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU11, j3, (FontStyle) null, fontWeight11, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                z5 = z2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(j2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f1118 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1118)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1119 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1118)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1119))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1119)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs113 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs113, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z113 = z4;
                            float f11110 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight12 = (FontWeight) CommonToolKt.ifv(z113, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU12 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs114 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11110, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f11110;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z113;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs114, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU12, j3, (FontStyle) null, fontWeight12, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f11111 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f11112 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11112))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11112)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs115 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs115, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z114 = z4;
                            float f11113 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight13 = (FontWeight) CommonToolKt.ifv(z114, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU13 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs116 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11113, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f11113;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z114;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs116, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU13, j3, (FontStyle) null, fontWeight13, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i3;
                if ((23967451 & i16) == 4793490) {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f11114 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11114)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f11115 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11114)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11115))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11115)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs117 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs117, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z115 = z4;
                        float f11116 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight14 = (FontWeight) CommonToolKt.ifv(z115, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU14 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs118 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11116, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f11116;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z115;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs118, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU14, j3, (FontStyle) null, fontWeight14, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                } else {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f11117 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11117)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f11118 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11117)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11118))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11118)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs119 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs119, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z116 = z4;
                        float f11119 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight15 = (FontWeight) CommonToolKt.ifv(z116, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU15 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs1110 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11119, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f11119;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z116;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1110, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU15, j3, (FontStyle) null, fontWeight15, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i18) {
                        PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            z4 = z;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    fM6097constructorimpl = f2;
                    if (composerStartRestartGroup.changed(fM6097constructorimpl)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        z5 = z2;
                        if (composerStartRestartGroup.changed(z5)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(j2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z3)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        if (i14 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i3;
                        if ((23967451 & i16) == 4793490) {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f111110 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111110)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f111111 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111110)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111111))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs1111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs1111, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z117 = z4;
                                float f111112 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight16 = (FontWeight) CommonToolKt.ifv(z117, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU16 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs1112 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111112, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f111112;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z117;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1112, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU16, j3, (FontStyle) null, fontWeight16, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        } else {
                            if (i17 != 0) {
                                sp = TextUnitKt.getSp(11);
                            }
                            j3 = sp;
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i8 != 0) {
                                z5 = false;
                            }
                            if (i10 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i12 != 0) {
                                z6 = false;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                            }
                            float f111113 = 6;
                            fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111113)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                            float f111114 = 3;
                            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111113)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111114))))).m6111unboximpl();
                            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111114)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                            packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                            if (z6) {
                                composerStartRestartGroup.startReplaceableGroup(1163113560);
                                Modifier modifierM6957radius3ABfNKs1113 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function1;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = fM6097constructorimpl;
                                function3 = function1;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs1113, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                                composerStartRestartGroup.endReplaceableGroup();
                                z7 = z4;
                                composer2 = composerStartRestartGroup;
                            } else {
                                function2 = function1;
                                boolean z118 = z4;
                                float f111115 = fM6097constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(1163113874);
                                FontWeight fontWeight17 = (FontWeight) CommonToolKt.ifv(z118, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                                long jM3792getWhite0d7_KjU17 = Color.INSTANCE.m3792getWhite0d7_KjU();
                                Modifier modifierM6957radius3ABfNKs1114 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111115, 1, null), fM6111unboximpl);
                                if (function2 != null) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function0<Unit> function5 = function2;
                                            if (function5 != null) {
                                                function5.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                f3 = f111115;
                                function3 = function2;
                                composer2 = composerStartRestartGroup;
                                z7 = z118;
                                TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1114, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU17, j3, (FontStyle) null, fontWeight17, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                            j5 = themeColor;
                            z8 = z6;
                            f4 = f3;
                            z9 = z5;
                            function4 = function3;
                            z10 = z7;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f111116 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111116)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f111117 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111116)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111117))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111117)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs1115 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs1115, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z119 = z4;
                            float f111118 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight18 = (FontWeight) CommonToolKt.ifv(z119, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU18 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs1116 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111118, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f111118;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z119;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1116, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU18, j3, (FontStyle) null, fontWeight18, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f111119 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111119)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1111110 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111119)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1111110))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111110)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs1117 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs1117, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z1110 = z4;
                            float f1111111 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight19 = (FontWeight) CommonToolKt.ifv(z1110, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU19 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs1118 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1111111, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f1111111;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z1110;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1118, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU19, j3, (FontStyle) null, fontWeight19, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                z5 = z2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(j2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f1111112 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111112)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1111113 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111112)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1111113))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111113)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs1119 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs1119, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z1111 = z4;
                            float f1111114 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight110 = (FontWeight) CommonToolKt.ifv(z1111, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU110 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs11110 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1111114, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f1111114;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z1111;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11110, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU110, j3, (FontStyle) null, fontWeight110, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f1111115 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111115)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f1111116 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111115)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1111116))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111116)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs11111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11111, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z1112 = z4;
                            float f1111117 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight111 = (FontWeight) CommonToolKt.ifv(z1112, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU111 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs11112 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f1111117, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f1111117;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z1112;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11112, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU111, j3, (FontStyle) null, fontWeight111, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i3;
                if ((23967451 & i16) == 4793490) {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f1111118 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111118)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f1111119 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111118)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f1111119))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f1111119)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs11113 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11113, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z1113 = z4;
                        float f11111110 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight112 = (FontWeight) CommonToolKt.ifv(z1113, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU112 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs11114 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11111110, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f11111110;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z1113;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11114, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU112, j3, (FontStyle) null, fontWeight112, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                } else {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f11111111 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111111)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f11111112 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111111)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11111112))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111112)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs11115 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11115, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z1114 = z4;
                        float f11111113 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight113 = (FontWeight) CommonToolKt.ifv(z1114, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU113 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs11116 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11111113, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f11111113;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z1114;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11116, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU113, j3, (FontStyle) null, fontWeight113, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i18) {
                        PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            fM6097constructorimpl = f2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(j2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i3;
                    if ((23967451 & i16) == 4793490) {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f11111114 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111114)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f11111115 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111114)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11111115))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111115)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs11117 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11117, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z1115 = z4;
                            float f11111116 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight114 = (FontWeight) CommonToolKt.ifv(z1115, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU114 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs11118 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11111116, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f11111116;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z1115;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11118, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU114, j3, (FontStyle) null, fontWeight114, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    } else {
                        if (i17 != 0) {
                            sp = TextUnitKt.getSp(11);
                        }
                        j3 = sp;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        if (i10 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i12 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                        }
                        float f11111117 = 6;
                        fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111117)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                        float f11111118 = 3;
                        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111117)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f11111118))))).m6111unboximpl();
                        fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f11111118)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                        packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                        if (z6) {
                            composerStartRestartGroup.startReplaceableGroup(1163113560);
                            Modifier modifierM6957radius3ABfNKs11119 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function1;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = fM6097constructorimpl;
                            function3 = function1;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs11119, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                            composerStartRestartGroup.endReplaceableGroup();
                            z7 = z4;
                            composer2 = composerStartRestartGroup;
                        } else {
                            function2 = function1;
                            boolean z1116 = z4;
                            float f11111119 = fM6097constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(1163113874);
                            FontWeight fontWeight115 = (FontWeight) CommonToolKt.ifv(z1116, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                            long jM3792getWhite0d7_KjU115 = Color.INSTANCE.m3792getWhite0d7_KjU();
                            Modifier modifierM6957radius3ABfNKs111110 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f11111119, 1, null), fM6111unboximpl);
                            if (function2 != null) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function0<Unit> function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            f3 = f11111119;
                            function3 = function2;
                            composer2 = composerStartRestartGroup;
                            z7 = z1116;
                            TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs111110, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU115, j3, (FontStyle) null, fontWeight115, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        j5 = themeColor;
                        z8 = z6;
                        f4 = f3;
                        z9 = z5;
                        function4 = function3;
                        z10 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i3;
                if ((23967451 & i16) == 4793490) {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f111111110 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111110)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f111111111 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111110)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111111111))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111111)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs111111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs111111, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z1117 = z4;
                        float f111111112 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight116 = (FontWeight) CommonToolKt.ifv(z1117, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU116 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs111112 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111111112, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f111111112;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z1117;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs111112, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU116, j3, (FontStyle) null, fontWeight116, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                } else {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f111111113 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111113)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f111111114 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111113)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111111114))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111114)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs111113 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs111113, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z1118 = z4;
                        float f111111115 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight117 = (FontWeight) CommonToolKt.ifv(z1118, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU117 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs111114 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111111115, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f111111115;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z1118;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs111114, z12, null, null, (Function0) objRememberedValue, 6, null), themeColor, null, 2, null), fM6111unboximpl2, fM6111unboximpl3), jM3792getWhite0d7_KjU117, j3, (FontStyle) null, fontWeight117, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i16 << 6) & 7168), 0, 130000);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j4 = j3;
                    j5 = themeColor;
                    z8 = z6;
                    f4 = f3;
                    z9 = z5;
                    function4 = function3;
                    z10 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i18) {
                        PartTitleViewKt.m6915TagViewo4cevVk(tag, j4, z10, f4, z9, j5, z8, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            z5 = z2;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(j2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i3;
                if ((23967451 & i16) == 4793490) {
                    if (i17 != 0) {
                        sp = TextUnitKt.getSp(11);
                    }
                    j3 = sp;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    }
                    if (i8 != 0) {
                        z5 = false;
                    }
                    if (i10 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i12 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998658315, i16, -1, "cn.jianyun.workplan.ui.component.nav.TagView (PartTitleView.kt:55)");
                    }
                    float f111111116 = 6;
                    fM6111unboximpl = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111116)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
                    float f111111117 = 3;
                    fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111116)), CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(8)), Dp.m6095boximpl(Dp.m6097constructorimpl(f111111117))))).m6111unboximpl();
                    fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, Dp.m6095boximpl(Dp.m6097constructorimpl(f111111117)), Dp.m6095boximpl(Dp.m6097constructorimpl(1)))).m6111unboximpl();
                    packedValue = ((TextUnit) CommonToolKt.ifv(z5, TextUnit.m6278boximpl(TextUnitKt.getSp(13)), TextUnit.m6278boximpl(TextUnitKt.getSp(11)))).getPackedValue();
                    if (z6) {
                        composerStartRestartGroup.startReplaceableGroup(1163113560);
                        Modifier modifierM6957radius3ABfNKs111115 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, fM6111unboximpl);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function1;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = fM6097constructorimpl;
                        function3 = function1;
                        TextKt.m2471Text4IGK_g(tag, PaddingKt.m568paddingVpY3zN4(BackgroundKt.m214backgroundbw27NRU$default(ButtonViewKt.tap(modifierM6957radius3ABfNKs111115, (Function0) objRememberedValue2), Color.m3754copywmQWz5c$default(themeColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), fM6111unboximpl2, fM6111unboximpl3), themeColor, j3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, packedValue, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 14) | ((i16 >> 9) & 896) | ((i16 << 6) & 7168), 0, 130032);
                        composerStartRestartGroup.endReplaceableGroup();
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                    } else {
                        function2 = function1;
                        boolean z1119 = z4;
                        float f111111118 = fM6097constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(1163113874);
                        FontWeight fontWeight118 = (FontWeight) CommonToolKt.ifv(z1119, FontWeight.INSTANCE.getBold(), FontWeight.INSTANCE.getNormal());
                        long jM3792getWhite0d7_KjU118 = Color.INSTANCE.m3792getWhite0d7_KjU();
                        Modifier modifierM6957radius3ABfNKs111116 = CommonUIKt.m6957radius3ABfNKs(OffsetKt.m528offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, f111111118, 1, null), fM6111unboximpl);
                        if (function2 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PartTitleViewKt$TagView$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Function0<Unit> function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        f3 = f111111118;
                        function3 = function2;
                        composer2 = composerStartRestartGroup;
                        z7 = z1119;
                        TextKt.m2471Text4IGK_g(tag

... [truncated: exceeds 400000 bytes, total 889079 bytes]