package cn.jianyun.workplan.ui.component.form;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.compose.DialogNavigator;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: GroupView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001ad\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ae\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\u00192\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001ax\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001ax\u0010&\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%\u001a<\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00132\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"BlockView", "", "label", "", "padding", "Landroidx/compose/ui/unit/Dp;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "color", "Landroidx/compose/ui/graphics/Color;", "action", "Lkotlin/Function0;", "BlockView-G5g98fw", "(Ljava/lang/String;FJJJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CenterGroupView", "modifier", "Landroidx/compose/ui/Modifier;", "focus", "", "radius", "horizonPadding", "verticalPadding", "bottom", "content", "Landroidx/compose/runtime/Composable;", "CenterGroupView-J8oBhFo", "(Landroidx/compose/ui/Modifier;ZFFFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "GroupTitleView", "title", "tool", "GroupTitleView-KLGhzwk", "(Ljava/lang/String;FFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "GroupView", DialogNavigator.NAME, "startPadding", "GroupView-fI-yqwc", "(Landroidx/compose/ui/Modifier;ZZFFFFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SettingGroupView", "SettingGroupView-fI-yqwc", "ZeroGroupView", "ZeroGroupView-Kz89ssw", "(FZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GroupViewKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:138:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x033d  */
    /* JADX WARN: Code duplicated, block: B:148:0x034d  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX INFO: renamed from: GroupView-fI-yqwc, reason: not valid java name */
    public static final void m6850GroupViewfIyqwc(Modifier modifier, boolean z, boolean z2, float f2, float f3, float f4, float f5, float f6, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        float f7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier.Companion companion;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        float fM6097constructorimpl3;
        float fM6097constructorimpl4;
        float fM6097constructorimpl5;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f8;
        final float f9;
        final boolean z5;
        final float f10;
        final float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-263148843);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupView)P(5,2,3,6:c#ui.unit.Dp,7:c#ui.unit.Dp,4:c#ui.unit.Dp,8:c#ui.unit.Dp,0:c#ui.unit.Dp)");
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 112) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z4 = z2;
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
                        f7 = f2;
                        if (composerStartRestartGroup.changed(f7)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f4)) {
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
                        if (composerStartRestartGroup.changed(f5)) {
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
                        if (composerStartRestartGroup.changed(f6)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    if ((i2 & 256) != 0) {
                        if ((234881024 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i17 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i18 != 0) {
                                z3 = false;
                            }
                            if (i4 != 0) {
                                z4 = false;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl = f7;
                            }
                            if (i8 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f3;
                            }
                            if (i10 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl3 = f4;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                            } else {
                                fM6097constructorimpl4 = f5;
                            }
                            if (i14 != 0) {
                                fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl5 = f6;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                            }
                            float f12 = fM6097constructorimpl5;
                            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f8 = fM6097constructorimpl;
                            f9 = fM6097constructorimpl2;
                            z5 = z4;
                            f10 = fM6097constructorimpl3;
                            f11 = f12;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            f9 = f3;
                            f10 = f4;
                            f11 = f6;
                            z5 = z4;
                            f8 = f7;
                            fM6097constructorimpl4 = f5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier2 = companion;
                        final boolean z6 = z3;
                        final float f13 = fM6097constructorimpl4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                            public final void invoke(Composer composer2, int i19) {
                                GroupViewKt.m6850GroupViewfIyqwc(modifier2, z6, z5, f8, f9, f10, f13, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i16 = 100663296;
                    i3 |= i16;
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f14 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN5 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f14;
                    } else {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f15 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN6 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN6);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f15;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier3 = companion;
                    final boolean z7 = z3;
                    final float f16 = fM6097constructorimpl4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6850GroupViewfIyqwc(modifier3, z7, z5, f8, f9, f10, f16, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                f7 = f2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
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
                    if (composerStartRestartGroup.changed(f5)) {
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
                    if (composerStartRestartGroup.changed(f6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f17 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN7 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN7);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f17;
                    } else {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f18 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN8 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f18;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = companion;
                    final boolean z8 = z3;
                    final float f19 = fM6097constructorimpl4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6850GroupViewfIyqwc(modifier4, z8, z5, f8, f9, f10, f19, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i16 = 100663296;
                i3 |= i16;
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f110 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN9 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f110;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f111 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN10 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = companion;
                final boolean z9 = z3;
                final float f112 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier5, z9, z5, f8, f9, f10, f112, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            z4 = z2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    f7 = f2;
                    if (composerStartRestartGroup.changed(f7)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
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
                    if (composerStartRestartGroup.changed(f5)) {
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
                    if (composerStartRestartGroup.changed(f6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f113 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN11 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN11);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f113;
                    } else {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f114 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN12 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN12);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f114;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = companion;
                    final boolean z10 = z3;
                    final float f115 = fM6097constructorimpl4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6850GroupViewfIyqwc(modifier6, z10, z5, f8, f9, f10, f115, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i16 = 100663296;
                i3 |= i16;
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f116 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN13 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf10.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f116;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f117 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN14 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN14);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy11, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf11.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = companion;
                final boolean z11 = z3;
                final float f118 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier7, z11, z5, f8, f9, f10, f118, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            f7 = f2;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
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
                if (composerStartRestartGroup.changed(f5)) {
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
                if (composerStartRestartGroup.changed(f6)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f119 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN15 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN15);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy12, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf12.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f119;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f1110 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN16 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN16);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy13, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf13.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f1110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = companion;
                final boolean z12 = z3;
                final float f1111 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier8, z12, z5, f8, f9, f10, f1111, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i16 = 100663296;
            i3 |= i16;
            if ((191739611 & i3) == 38347922) {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f1112 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN17 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN17);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy14, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf14.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f1112;
            } else {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f1113 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN18 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN18);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy15, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf15.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f1113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = companion;
            final boolean z13 = z3;
            final float f1114 = fM6097constructorimpl4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                public final void invoke(Composer composer2, int i19) {
                    GroupViewKt.m6850GroupViewfIyqwc(modifier9, z13, z5, f8, f9, f10, f1114, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z4 = z2;
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
                    f7 = f2;
                    if (composerStartRestartGroup.changed(f7)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
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
                    if (composerStartRestartGroup.changed(f5)) {
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
                    if (composerStartRestartGroup.changed(f6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f1115 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN19 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN19);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy16, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap16, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf16.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f1115;
                    } else {
                        if (i17 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f3;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                        }
                        float f1116 = fM6097constructorimpl5;
                        Modifier modifierM568paddingVpY3zN110 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN110);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy17, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap17, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl.getInserting()) {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        } else {
                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf17.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = fM6097constructorimpl;
                        f9 = fM6097constructorimpl2;
                        z5 = z4;
                        f10 = fM6097constructorimpl3;
                        f11 = f1116;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier10 = companion;
                    final boolean z14 = z3;
                    final float f1117 = fM6097constructorimpl4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6850GroupViewfIyqwc(modifier10, z14, z5, f8, f9, f10, f1117, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i16 = 100663296;
                i3 |= i16;
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f1118 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN111 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy18, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap18, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf18.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f1118;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f1119 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN112 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN112);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy19, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap19, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf19.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f1119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier11 = companion;
                final boolean z15 = z3;
                final float f11110 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier11, z15, z5, f8, f9, f10, f11110, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            f7 = f2;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
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
                if (composerStartRestartGroup.changed(f5)) {
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
                if (composerStartRestartGroup.changed(f6)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f11111 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN113 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap110, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf110.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f11111;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f11112 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN114 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap111, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf111.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f11112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier12 = companion;
                final boolean z16 = z3;
                final float f11113 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier12, z16, z5, f8, f9, f10, f11113, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i16 = 100663296;
            i3 |= i16;
            if ((191739611 & i3) == 38347922) {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f11114 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN115 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN115);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy112, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap112, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf112.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f11114;
            } else {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f11115 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN116 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy113, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap113, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf113.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f11115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier13 = companion;
            final boolean z17 = z3;
            final float f11116 = fM6097constructorimpl4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                public final void invoke(Composer composer2, int i19) {
                    GroupViewKt.m6850GroupViewfIyqwc(modifier13, z17, z5, f8, f9, f10, f11116, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        z4 = z2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                f7 = f2;
                if (composerStartRestartGroup.changed(f7)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
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
                if (composerStartRestartGroup.changed(f5)) {
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
                if (composerStartRestartGroup.changed(f6)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            if ((i2 & 256) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f11117 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN117 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN117);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy114, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap114, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf114.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f11117;
                } else {
                    if (i17 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f3;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                    }
                    float f11118 = fM6097constructorimpl5;
                    Modifier modifierM568paddingVpY3zN118 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN118);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy115, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap115, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting()) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    } else {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf115.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = fM6097constructorimpl;
                    f9 = fM6097constructorimpl2;
                    z5 = z4;
                    f10 = fM6097constructorimpl3;
                    f11 = f11118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = companion;
                final boolean z18 = z3;
                final float f11119 = fM6097constructorimpl4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6850GroupViewfIyqwc(modifier14, z18, z5, f8, f9, f10, f11119, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i16 = 100663296;
            i3 |= i16;
            if ((191739611 & i3) == 38347922) {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f111110 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN119 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy116, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap116, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf116.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f111110;
            } else {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f111111 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN1110 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN1110);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy117, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap117, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf117.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f111111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = companion;
            final boolean z19 = z3;
            final float f111112 = fM6097constructorimpl4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                public final void invoke(Composer composer2, int i19) {
                    GroupViewKt.m6850GroupViewfIyqwc(modifier15, z19, z5, f8, f9, f10, f111112, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        f7 = f2;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(f3)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(f4)) {
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
            if (composerStartRestartGroup.changed(f5)) {
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
            if (composerStartRestartGroup.changed(f6)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i3 |= i15;
        }
        if ((i2 & 256) != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
            }
            if ((191739611 & i3) == 38347922) {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f111113 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN1111 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN1111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy118, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap118, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf118.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f111113;
            } else {
                if (i17 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i18 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z4 = false;
                }
                if (i6 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl = f7;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f3;
                }
                if (i10 != 0) {
                    fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl3 = f4;
                }
                if (i12 != 0) {
                    fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                } else {
                    fM6097constructorimpl4 = f5;
                }
                if (i14 != 0) {
                    fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                } else {
                    fM6097constructorimpl5 = f6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
                }
                float f111114 = fM6097constructorimpl5;
                Modifier modifierM568paddingVpY3zN1112 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN1112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy119, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap119, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf119.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = fM6097constructorimpl;
                f9 = fM6097constructorimpl2;
                z5 = z4;
                f10 = fM6097constructorimpl3;
                f11 = f111114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier16 = companion;
            final boolean z110 = z3;
            final float f111115 = fM6097constructorimpl4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

                public final void invoke(Composer composer2, int i19) {
                    GroupViewKt.m6850GroupViewfIyqwc(modifier16, z110, z5, f8, f9, f10, f111115, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i16 = 100663296;
        i3 |= i16;
        if ((191739611 & i3) == 38347922) {
            if (i17 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier;
            }
            if (i18 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i6 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl = f7;
            }
            if (i8 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl2 = f3;
            }
            if (i10 != 0) {
                fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl3 = f4;
            }
            if (i12 != 0) {
                fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
            } else {
                fM6097constructorimpl4 = f5;
            }
            if (i14 != 0) {
                fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl5 = f6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
            }
            float f111116 = fM6097constructorimpl5;
            Modifier modifierM568paddingVpY3zN1113 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN1113);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy1110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap1110, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf1110.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f8 = fM6097constructorimpl;
            f9 = fM6097constructorimpl2;
            z5 = z4;
            f10 = fM6097constructorimpl3;
            f11 = f111116;
        } else {
            if (i17 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier;
            }
            if (i18 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i6 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl = f7;
            }
            if (i8 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl2 = f3;
            }
            if (i10 != 0) {
                fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl3 = f4;
            }
            if (i12 != 0) {
                fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
            } else {
                fM6097constructorimpl4 = f5;
            }
            if (i14 != 0) {
                fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
            } else {
                fM6097constructorimpl5 = f6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263148843, i3, -1, "cn.jianyun.workplan.ui.component.form.GroupView (GroupView.kt:30)");
            }
            float f111117 = fM6097constructorimpl5;
            Modifier modifierM568paddingVpY3zN1114 = PaddingKt.m568paddingVpY3zN4(PaddingKt.m571paddingqDBjuR0$default(BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(BorderKt.m226borderxT4_qwU(PaddingKt.m571paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, fM6097constructorimpl5, 7, null), ((Dp) CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(0)))).m6111unboximpl(), ((Color) CommonToolKt.ifv(z4, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getBackground()))).m3765unboximpl(), RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(fM6097constructorimpl)), fM6097constructorimpl).then(companion), ((Color) CommonToolKt.ifv(z3, Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface()))).m3765unboximpl(), null, 2, null), fM6097constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), fM6097constructorimpl3, fM6097constructorimpl4);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN1114);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyColumnMeasurePolicy1111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap1111, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3285constructorimpl.getInserting()) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf1111.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 24) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f8 = fM6097constructorimpl;
            f9 = fM6097constructorimpl2;
            z5 = z4;
            f10 = fM6097constructorimpl3;
            f11 = f111117;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier17 = companion;
        final boolean z111 = z3;
        final float f111118 = fM6097constructorimpl4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$GroupView$2
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

            public final void invoke(Composer composer2, int i19) {
                GroupViewKt.m6850GroupViewfIyqwc(modifier17, z111, z5, f8, f9, f10, f111118, f11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d8  */
    /* JADX INFO: renamed from: BlockView-G5g98fw, reason: not valid java name */
    public static final void m6847BlockViewG5g98fw(final String label, float f2, long j, long j2, long j3, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long j4;
        int i5;
        int i6;
        long sp;
        int i7;
        int i8;
        final long j5;
        int i9;
        int i10;
        float fM6097constructorimpl;
        long sp2;
        long themeColor;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final long j6;
        final long j7;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(1051641074);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BlockView)P(3,5:c#ui.unit.Dp,4:c#ui.unit.TextUnit,2:c#ui.unit.TextUnit,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                    sp = j2;
                } else {
                    sp = j2;
                    if ((i & 7168) == 0) {
                        if (composerStartRestartGroup.changed(sp)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    j5 = j3;
                } else {
                    j5 = j3;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(j5)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(action)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((i3 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i11 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            sp2 = TextUnitKt.getSp(16);
                        } else {
                            sp2 = j4;
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(10);
                        }
                        long j8 = sp;
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                    action.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i12 = i3;
                        int i13 = i12 >> 6;
                        float f4 = fM6097constructorimpl;
                        composer2 = composerStartRestartGroup;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i12 & 14) | (i13 & 896) | (i12 & 7168), i13 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j6 = sp2;
                        j7 = j8;
                        j5 = themeColor;
                        f3 = f4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        j7 = sp;
                        j6 = j4;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i10;
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j9 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i14 = i3;
                    int i15 = i14 >> 6;
                    float f5 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion2, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i14 & 14) | (i15 & 896) | (i14 & 7168), i15 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j9;
                    j5 = themeColor;
                    f3 = f5;
                } else {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j10 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i16 = i3;
                    int i17 = i16 >> 6;
                    float f6 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion3, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | (i17 & 896) | (i16 & 7168), i17 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j10;
                    j5 = themeColor;
                    f3 = f6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
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
                        GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j4 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
                sp = j2;
            } else {
                sp = j2;
                if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changed(sp)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j11 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i18 = i3;
                    int i19 = i18 >> 6;
                    float f7 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion4, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i18 & 14) | (i19 & 896) | (i18 & 7168), i19 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j11;
                    j5 = themeColor;
                    f3 = f7;
                } else {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j12 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i110 = i3;
                    int i111 = i110 >> 6;
                    float f8 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion5, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j12, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i110 & 14) | (i111 & 896) | (i110 & 7168), i111 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j12;
                    j5 = themeColor;
                    f3 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i112) {
                        GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i10;
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j13 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion6 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i112 = i3;
                int i113 = i112 >> 6;
                float f9 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion6, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j13, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i112 & 14) | (i113 & 896) | (i112 & 7168), i113 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j13;
                j5 = themeColor;
                f3 = f9;
            } else {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j14 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion7 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i114 = i3;
                int i115 = i114 >> 6;
                float f10 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion7, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j14, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i114 & 14) | (i115 & 896) | (i114 & 7168), i115 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j14;
                j5 = themeColor;
                f3 = f10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i116) {
                    GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
                sp = j2;
            } else {
                sp = j2;
                if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changed(sp)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
                j5 = j3;
            } else {
                j5 = j3;
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j15 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i116 = i3;
                    int i117 = i116 >> 6;
                    float f11 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion8, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j15, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i116 & 14) | (i117 & 896) | (i116 & 7168), i117 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j15;
                    j5 = themeColor;
                    f3 = f11;
                } else {
                    if (i11 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        sp2 = TextUnitKt.getSp(16);
                    } else {
                        sp2 = j4;
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(10);
                    }
                    long j16 = sp;
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                                action.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i118 = i3;
                    int i119 = i118 >> 6;
                    float f12 = fM6097constructorimpl;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion9, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j16, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i118 & 14) | (i119 & 896) | (i118 & 7168), i119 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = sp2;
                    j7 = j16;
                    j5 = themeColor;
                    f3 = f12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i1110) {
                        GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i10;
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j17 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion10 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1110 = i3;
                int i1111 = i1110 >> 6;
                float f13 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion10, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j17, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1110 & 14) | (i1111 & 896) | (i1110 & 7168), i1111 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j17;
                j5 = themeColor;
                f3 = f13;
            } else {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j18 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion11 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1112 = i3;
                int i1113 = i1112 >> 6;
                float f14 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion11, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j18, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1112 & 14) | (i1113 & 896) | (i1112 & 7168), i1113 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j18;
                j5 = themeColor;
                f3 = f14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i1114) {
                    GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j4 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
            sp = j2;
        } else {
            sp = j2;
            if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(sp)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= CpioConstants.C_ISBLK;
            j5 = j3;
        } else {
            j5 = j3;
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(j5)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
        }
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j19 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion12 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1114 = i3;
                int i1115 = i1114 >> 6;
                float f15 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion12, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j19, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1114 & 14) | (i1115 & 896) | (i1114 & 7168), i1115 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j19;
                j5 = themeColor;
                f3 = f15;
            } else {
                if (i11 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i4 != 0) {
                    sp2 = TextUnitKt.getSp(16);
                } else {
                    sp2 = j4;
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(10);
                }
                long j110 = sp;
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
                }
                Modifier.Companion companion13 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                            action.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1116 = i3;
                int i1117 = i1116 >> 6;
                float f16 = fM6097constructorimpl;
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion13, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j110, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1116 & 14) | (i1117 & 896) | (i1116 & 7168), i1117 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = sp2;
                j7 = j110;
                j5 = themeColor;
                f3 = f16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i1118) {
                    GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i10;
        if ((i3 & 374491) == 74898) {
            if (i11 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f2;
            }
            if (i4 != 0) {
                sp2 = TextUnitKt.getSp(16);
            } else {
                sp2 = j4;
            }
            if (i6 != 0) {
                sp = TextUnitKt.getSp(10);
            }
            long j111 = sp;
            if (i8 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
            }
            Modifier.Companion companion14 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                        action.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                        action.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i1118 = i3;
            int i1119 = i1118 >> 6;
            float f17 = fM6097constructorimpl;
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion14, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j111, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1118 & 14) | (i1119 & 896) | (i1118 & 7168), i1119 & 14, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j6 = sp2;
            j7 = j111;
            j5 = themeColor;
            f3 = f17;
        } else {
            if (i11 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f2;
            }
            if (i4 != 0) {
                sp2 = TextUnitKt.getSp(16);
            } else {
                sp2 = j4;
            }
            if (i6 != 0) {
                sp = TextUnitKt.getSp(10);
            }
            long j112 = sp;
            if (i8 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051641074, i3, -1, "cn.jianyun.workplan.ui.component.form.BlockView (GroupView.kt:51)");
            }
            Modifier.Companion companion15 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                        action.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$1$1
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
                        action.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i11110 = i3;
            int i11111 = i11110 >> 6;
            float f18 = fM6097constructorimpl;
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(CommonUIKt.m6955mainBg9IZ8Weo(SizeKt.fillMaxSize$default(PaddingKt.m567padding3ABfNKs(ButtonViewKt.tap(companion15, (Function0) objRememberedValue), fM6097constructorimpl), 0.0f, 1, null), Dp.m6097constructorimpl(4), 0L, composerStartRestartGroup, 48, 2), Dp.m6097constructorimpl(10), 0.0f, 2, null), 0.0f, Dp.m6097constructorimpl(5), 1, null), themeColor, j112, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp2, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11110 & 14) | (i11111 & 896) | (i11110 & 7168), i11111 & 14, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j6 = sp2;
            j7 = j112;
            j5 = themeColor;
            f3 = f18;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$BlockView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11112) {
                GroupViewKt.m6847BlockViewG5g98fw(label, f3, j6, j7, j5, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x015b  */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:121:0x017d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:139:0x0202  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX INFO: renamed from: SettingGroupView-fI-yqwc, reason: not valid java name */
    public static final void m6851SettingGroupViewfIyqwc(Modifier modifier, boolean z, boolean z2, float f2, float f3, float f4, float f5, float f6, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        float f7;
        int i7;
        int i8;
        float f8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier2;
        boolean z4;
        boolean z5;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        float fM6097constructorimpl3;
        float fM6097constructorimpl4;
        float fM6097constructorimpl5;
        final float f9;
        final float f10;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final float f11;
        final float f12;
        final float f13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1895512617);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SettingGroupView)P(5,2,3,6:c#ui.unit.Dp,7:c#ui.unit.Dp,4:c#ui.unit.Dp,8:c#ui.unit.Dp,0:c#ui.unit.Dp)");
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        f7 = f2;
                        if (composerStartRestartGroup.changed(f7)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= CpioConstants.C_ISBLK;
                        f8 = f3;
                    } else {
                        f8 = f3;
                        if ((i & 57344) == 0) {
                            if (composerStartRestartGroup.changed(f8)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f4)) {
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
                        if (composerStartRestartGroup.changed(f5)) {
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
                        if (composerStartRestartGroup.changed(f6)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i18 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if (i4 != 0) {
                                z5 = false;
                            } else {
                                z5 = z3;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl = f7;
                            }
                            if (i8 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                            } else {
                                fM6097constructorimpl2 = f8;
                            }
                            if (i10 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl3 = f4;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                            } else {
                                fM6097constructorimpl4 = f5;
                            }
                            if (i14 != 0) {
                                fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                            } else {
                                fM6097constructorimpl5 = f6;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                            }
                            m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f9 = fM6097constructorimpl3;
                            f10 = fM6097constructorimpl4;
                            modifier3 = modifier2;
                            z6 = z4;
                            z7 = z5;
                            f11 = fM6097constructorimpl;
                            f12 = fM6097constructorimpl2;
                            f13 = fM6097constructorimpl5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z6 = z;
                            f9 = f4;
                            f13 = f6;
                            z7 = z3;
                            f11 = f7;
                            f12 = f8;
                            f10 = f5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$SettingGroupView$1
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

                            public final void invoke(Composer composer2, int i19) {
                                GroupViewKt.m6851SettingGroupViewfIyqwc(modifier3, z6, z7, f11, f12, f9, f10, f13, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i16 = 100663296;
                    i3 |= i16;
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl2 = f8;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                        }
                        m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f9 = fM6097constructorimpl3;
                        f10 = fM6097constructorimpl4;
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                        f11 = fM6097constructorimpl;
                        f12 = fM6097constructorimpl2;
                        f13 = fM6097constructorimpl5;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl2 = f8;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                        }
                        m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f9 = fM6097constructorimpl3;
                        f10 = fM6097constructorimpl4;
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                        f11 = fM6097constructorimpl;
                        f12 = fM6097constructorimpl2;
                        f13 = fM6097constructorimpl5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$SettingGroupView$1
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6851SettingGroupViewfIyqwc(modifier3, z6, z7, f11, f12, f9, f10, f13, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                f7 = f2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    f8 = f3;
                } else {
                    f8 = f3;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(f8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
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
                    if (composerStartRestartGroup.changed(f5)) {
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
                    if (composerStartRestartGroup.changed(f6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl2 = f8;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                        }
                        m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f9 = fM6097constructorimpl3;
                        f10 = fM6097constructorimpl4;
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                        f11 = fM6097constructorimpl;
                        f12 = fM6097constructorimpl2;
                        f13 = fM6097constructorimpl5;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
                        if (i8 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl2 = f8;
                        }
                        if (i10 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl3 = f4;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                        } else {
                            fM6097constructorimpl4 = f5;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl5 = f6;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                        }
                        m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f9 = fM6097constructorimpl3;
                        f10 = fM6097constructorimpl4;
                        modifier3 = modifier2;
                        z6 = z4;
                        z7 = z5;
                        f11 = fM6097constructorimpl;
                        f12 = fM6097constructorimpl2;
                        f13 = fM6097constructorimpl5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$SettingGroupView$1
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

                        public final void invoke(Composer composer2, int i19) {
                            GroupViewKt.m6851SettingGroupViewfIyqwc(modifier3, z6, z7, f11, f12, f9, f10, f13, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i16 = 100663296;
                i3 |= i16;
                if ((191739611 & i3) == 38347922) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl2 = f8;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                    }
                    m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f9 = fM6097constructorimpl3;
                    f10 = fM6097constructorimpl4;
                    modifier3 = modifier2;
                    z6 = z4;
                    z7 = z5;
                    f11 = fM6097constructorimpl;
                    f12 = fM6097constructorimpl2;
                    f13 = fM6097constructorimpl5;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i6 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl = f7;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl2 = f8;
                    }
                    if (i10 != 0) {
                        fM6097constructorimpl3 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl3 = f4;
                    }
                    if (i12 != 0) {
                        fM6097constructorimpl4 = Dp.m6097constructorimpl(5);
                    } else {
                        fM6097constructorimpl4 = f5;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl5 = Dp.m6097constructorimpl(10);
                    } else {
                        fM6097constructorimpl5 = f6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1895512617, i3, -1, "cn.jianyun.workplan.ui.component.form.SettingGroupView (GroupView.kt:59)");
                    }
                    m6850GroupViewfIyqwc(modifier2, z4, z5, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4, fM6097constructorimpl5, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f9 = fM6097constructorimpl3;
                    f10 = fM6097constructorimpl4;
                    modifier3 = modifier2;
                    z6 = z4;
                    z7 = z5;
                    f11 = fM6097constructorimpl;
                    f12 = fM6097constructorimpl2;
                    f13 = fM6097constructorimpl5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.GroupViewKt$SettingGroupView$1
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

                    public final void invoke(Composer composer2, int i19) {
                        GroupViewKt.m6851SettingGroupViewfIyqwc(modifier3, z6, z7, f11, f12, f9, f10, f13, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            z3 = z2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    f7 = f2;
                    if (composerStartRestartGroup.changed(f7)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    f8 = f3;
                } else {
                    f8 = f3;
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(f8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
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
                    if (composerStartRestartGroup.changed(f5)) {
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
                    if (composerStartRestartGroup.changed(f6)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z3;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(10);
                        } else {
                            fM6097constructorimpl = f7;
                        }
           

... [truncated: exceeds 400000 bytes, total 1895263 bytes]