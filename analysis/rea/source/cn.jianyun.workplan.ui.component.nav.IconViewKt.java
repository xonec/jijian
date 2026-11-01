package cn.jianyun.workplan.ui.component.nav;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.theme.TypeKt;
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

/* JADX INFO: compiled from: IconView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aE\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"CircleIconView", "", "icon", "", "iconSize", "Landroidx/compose/ui/unit/TextUnit;", "wrapperSize", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "bold", "", "modifier", "Landroidx/compose/ui/Modifier;", "modifier2", "CircleIconView-B6Dfk3U", "(IJFJZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FocusText", "text", "", "focus", "fontSize", "FocusText-a5Y-_hM", "(Ljava/lang/String;ZJLandroidx/compose/runtime/Composer;II)V", "IconView", "IconView-RidXid8", "(IJJZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconViewKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[PHI: r3 r4 r9 r11
      0x00c6: PHI (r3v21 int) = (r3v17 int), (r3v22 int) binds: [B:81:0x00ed, B:70:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r4v6 long) = (r4v2 long), (r4v8 long) binds: [B:81:0x00ed, B:70:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r9v9 long) = (r9v2 long), (r9v1 long) binds: [B:81:0x00ed, B:70:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r11v13 boolean) = (r11v3 boolean), (r11v2 boolean) binds: [B:81:0x00ed, B:70:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: IconView-RidXid8, reason: not valid java name */
    public static final void m6909IconViewRidXid8(final int i, long j, long j2, boolean z, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long primary;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        long sp;
        Modifier modifier3;
        long j4;
        int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2053031219);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IconView)P(2,3:c#ui.unit.TextUnit,1:c#ui.graphics.Color)");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 112) == 0) {
                j3 = j;
                i4 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                primary = j2;
                if ((i3 & 4) == 0 || !composerStartRestartGroup.changed(primary)) {
                    i10 = 128;
                } else {
                    i10 = 256;
                }
                i4 |= i10;
            } else {
                primary = j2;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((57344 & i2) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((46811 & i4) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                sp = TextUnitKt.getSp(14);
                            } else {
                                sp = j3;
                            }
                            if ((i3 & 4) != 0) {
                                primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                            if (i7 != 0) {
                                modifier3 = Modifier.INSTANCE;
                                j4 = primary;
                            }
                            i9 = i4;
                            boolean z3 = z2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                            }
                            TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z3, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z2 = z3;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            sp = j3;
                        }
                        j4 = primary;
                        modifier3 = modifier2;
                        i9 = i4;
                        boolean z4 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                        }
                        TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z4, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z4;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        sp = j3;
                        j4 = primary;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final long j5 = sp;
                    final long j6 = j4;
                    final boolean z5 = z2;
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            IconViewKt.m6909IconViewRidXid8(i, j5, j6, z5, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i4 |= CpioConstants.C_ISBLK;
                modifier2 = modifier;
                if ((46811 & i4) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z6 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z6, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z6;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z7 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z7, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z7;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j7 = sp;
                final long j8 = j4;
                final boolean z8 = z2;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        IconViewKt.m6909IconViewRidXid8(i, j7, j8, z8, modifier5, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 3072;
            z2 = z;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((46811 & i4) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z9 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z9, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z9;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z10 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z10, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z10;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j9 = sp;
                final long j10 = j4;
                final boolean z11 = z2;
                final Modifier modifier6 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        IconViewKt.m6909IconViewRidXid8(i, j9, j10, z11, modifier6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= CpioConstants.C_ISBLK;
            modifier2 = modifier;
            if ((46811 & i4) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z12 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z12, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z12;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z13 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z13, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z13;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j11 = sp;
            final long j12 = j4;
            final boolean z14 = z2;
            final Modifier modifier7 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    IconViewKt.m6909IconViewRidXid8(i, j11, j12, z14, modifier7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        j3 = j;
        if ((i2 & 896) == 0) {
            primary = j2;
            if ((i3 & 4) == 0) {
                i10 = 128;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        } else {
            primary = j2;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((46811 & i4) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z15 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z15, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z15;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j3;
                        }
                        if ((i3 & 4) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            modifier3 = Modifier.INSTANCE;
                            j4 = primary;
                        } else {
                            j4 = primary;
                            modifier3 = modifier2;
                        }
                    }
                    i9 = i4;
                    boolean z16 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                    }
                    TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z16, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z16;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j13 = sp;
                final long j14 = j4;
                final boolean z17 = z2;
                final Modifier modifier8 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        IconViewKt.m6909IconViewRidXid8(i, j13, j14, z17, modifier8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= CpioConstants.C_ISBLK;
            modifier2 = modifier;
            if ((46811 & i4) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z18 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z18, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z18;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z19 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z19, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z19;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j15 = sp;
            final long j16 = j4;
            final boolean z110 = z2;
            final Modifier modifier9 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    IconViewKt.m6909IconViewRidXid8(i, j15, j16, z110, modifier9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        z2 = z;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((57344 & i2) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((46811 & i4) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z111 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z111, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z111;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j3;
                    }
                    if ((i3 & 4) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                        j4 = primary;
                    } else {
                        j4 = primary;
                        modifier3 = modifier2;
                    }
                }
                i9 = i4;
                boolean z112 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
                }
                TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z112, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z112;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j17 = sp;
            final long j18 = j4;
            final boolean z113 = z2;
            final Modifier modifier10 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    IconViewKt.m6909IconViewRidXid8(i, j17, j18, z113, modifier10, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= CpioConstants.C_ISBLK;
        modifier2 = modifier;
        if ((46811 & i4) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j3;
                }
                if ((i3 & 4) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -897;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    j4 = primary;
                } else {
                    j4 = primary;
                    modifier3 = modifier2;
                }
            } else {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j3;
                }
                if ((i3 & 4) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -897;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    j4 = primary;
                } else {
                    j4 = primary;
                    modifier3 = modifier2;
                }
            }
            i9 = i4;
            boolean z114 = z2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
            }
            TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z114, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z114;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j3;
                }
                if ((i3 & 4) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -897;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    j4 = primary;
                } else {
                    j4 = primary;
                    modifier3 = modifier2;
                }
            } else {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j3;
                }
                if ((i3 & 4) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -897;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                    j4 = primary;
                } else {
                    j4 = primary;
                    modifier3 = modifier2;
                }
            }
            i9 = i4;
            boolean z115 = z2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053031219, i9, -1, "cn.jianyun.workplan.ui.component.nav.IconView (IconView.kt:24)");
            }
            TextKt.m2471Text4IGK_g(String.valueOf((char) i), modifier3, j4, sp, (FontStyle) null, (FontWeight) CommonToolKt.ifv(z115, FontWeight.INSTANCE.getMedium(), FontWeight.INSTANCE.getNormal()), TypeKt.getRemixicon(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(10), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i9 >> 9) & 112) | 1572864 | (i9 & 896) | ((i9 << 6) & 7168), 6, 129936);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z115;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j19 = sp;
        final long j110 = j4;
        final boolean z116 = z2;
        final Modifier modifier11 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$IconView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i12) {
                IconViewKt.m6909IconViewRidXid8(i, j19, j110, z116, modifier11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0152  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:119:0x0219  */
    /* JADX WARN: Code duplicated, block: B:121:0x0227  */
    /* JADX WARN: Code duplicated, block: B:124:0x028f  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0136  */
    /* JADX INFO: renamed from: CircleIconView-B6Dfk3U, reason: not valid java name */
    public static final void m6907CircleIconViewB6Dfk3U(final int i, long j, float f2, long j2, boolean z, Modifier modifier, Modifier modifier2, Composer composer, final int i2, final int i3) {
        int i4;
        long sp;
        int i5;
        float fM6097constructorimpl;
        int i6;
        long primary;
        int i7;
        boolean z2;
        int i8;
        int i9;
        Modifier modifier3;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        Modifier modifier4;
        Modifier modifier5;
        int i13;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f3;
        final long j3;
        final Modifier modifier6;
        final Modifier modifier7;
        final boolean z3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(223152674);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircleIconView)P(2,3:c#ui.unit.TextUnit,6:c#ui.unit.Dp,1:c#ui.graphics.Color)");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 112) == 0) {
                sp = j;
                i4 |= composerStartRestartGroup.changed(sp) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    fM6097constructorimpl = f2;
                    if (composerStartRestartGroup.changed(fM6097constructorimpl)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 7168) == 0) {
                    if ((i3 & 8) == 0) {
                        primary = j2;
                        int i15 = composerStartRestartGroup.changed(primary) ? 2048 : 1024;
                        i4 |= i15;
                    } else {
                        primary = j2;
                    }
                    i4 |= i15;
                } else {
                    primary = j2;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    modifier3 = modifier;
                } else {
                    modifier3 = modifier;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(modifier3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i4 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            sp = TextUnitKt.getSp(14);
                        }
                        if (i5 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(16);
                        }
                        if ((i3 & 8) != 0) {
                            primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                            i4 &= -7169;
                        }
                        if (i7 != 0) {
                            z2 = false;
                        }
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier3;
                        }
                        if (i11 != 0) {
                            modifier5 = companion;
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                            modifier5 = companion;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier4 = modifier2;
                        modifier5 = modifier3;
                    }
                    float f4 = fM6097constructorimpl;
                    boolean z4 = z2;
                    i13 = i4;
                    long j5 = primary;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
                    }
                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4 / 2)).then(modifier4), f4), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i16 = i13 >> 3;
                    Modifier modifier8 = modifier4;
                    m6909IconViewRidXid8(i, sp, j5, z4, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = f4;
                    j3 = sp;
                    modifier6 = modifier5;
                    modifier7 = modifier8;
                    z3 = z4;
                    j4 = j5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier7 = modifier2;
                    f3 = fM6097constructorimpl;
                    j4 = primary;
                    modifier6 = modifier3;
                    j3 = sp;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$CircleIconView$2
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
                        IconViewKt.m6907CircleIconViewB6Dfk3U(i, j3, f3, j4, z3, modifier6, modifier7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            fM6097constructorimpl = f2;
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    primary = j2;
                    if (composerStartRestartGroup.changed(primary)) {
                    }
                    i4 |= i15;
                } else {
                    primary = j2;
                }
                i4 |= i15;
            } else {
                primary = j2;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                i4 |= CpioConstants.C_ISBLK;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier3 = modifier;
            } else {
                modifier3 = modifier;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(modifier3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(modifier2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i4 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                } else {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                }
                float f5 = fM6097constructorimpl;
                boolean z5 = z2;
                i13 = i4;
                long j6 = primary;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
                }
                Modifier modifierM214backgroundbw27NRU$default2 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f5 / 2)).then(modifier4), f5), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default2);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i17 = i13 >> 3;
                Modifier modifier9 = modifier4;
                m6909IconViewRidXid8(i, sp, j6, z5, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f5;
                j3 = sp;
                modifier6 = modifier5;
                modifier7 = modifier9;
                z3 = z5;
                j4 = j6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                } else {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                }
                float f6 = fM6097constructorimpl;
                boolean z6 = z2;
                i13 = i4;
                long j7 = primary;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
                }
                Modifier modifierM214backgroundbw27NRU$default3 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f6 / 2)).then(modifier4), f6), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
                Alignment center3 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default3);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i18 = i13 >> 3;
                Modifier modifier10 = modifier4;
                m6909IconViewRidXid8(i, sp, j7, z6, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f6;
                j3 = sp;
                modifier6 = modifier5;
                modifier7 = modifier10;
                z3 = z6;
                j4 = j7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$CircleIconView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i19) {
                    IconViewKt.m6907CircleIconViewB6Dfk3U(i, j3, f3, j4, z3, modifier6, modifier7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        sp = j;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 896) == 0) {
                fM6097constructorimpl = f2;
                if (composerStartRestartGroup.changed(fM6097constructorimpl)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    primary = j2;
                    if (composerStartRestartGroup.changed(primary)) {
                    }
                    i4 |= i15;
                } else {
                    primary = j2;
                }
                i4 |= i15;
            } else {
                primary = j2;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                i4 |= CpioConstants.C_ISBLK;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier3 = modifier;
            } else {
                modifier3 = modifier;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(modifier3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(modifier2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i4 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                } else {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                }
                float f7 = fM6097constructorimpl;
                boolean z7 = z2;
                i13 = i4;
                long j8 = primary;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
                }
                Modifier modifierM214backgroundbw27NRU$default4 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f7 / 2)).then(modifier4), f7), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
                Alignment center4 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default4);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                int i19 = i13 >> 3;
                Modifier modifier11 = modifier4;
                m6909IconViewRidXid8(i, sp, j8, z7, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344), 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f7;
                j3 = sp;
                modifier6 = modifier5;
                modifier7 = modifier11;
                z3 = z7;
                j4 = j8;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                } else {
                    if (i14 != 0) {
                        sp = TextUnitKt.getSp(14);
                    }
                    if (i5 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(16);
                    }
                    if ((i3 & 8) != 0) {
                        primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier3;
                    }
                    if (i11 != 0) {
                        modifier5 = companion;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                        modifier5 = companion;
                    }
                }
                float f8 = fM6097constructorimpl;
                boolean z8 = z2;
                i13 = i4;
                long j9 = primary;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
                }
                Modifier modifierM214backgroundbw27NRU$default5 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f8 / 2)).then(modifier4), f8), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
                Alignment center5 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default5);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                int i110 = i13 >> 3;
                Modifier modifier12 = modifier4;
                m6909IconViewRidXid8(i, sp, j9, z8, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i110 & 896) | (i110 & 7168) | (i110 & 57344), 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f8;
                j3 = sp;
                modifier6 = modifier5;
                modifier7 = modifier12;
                z3 = z8;
                j4 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$CircleIconView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i111) {
                    IconViewKt.m6907CircleIconViewB6Dfk3U(i, j3, f3, j4, z3, modifier6, modifier7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        fM6097constructorimpl = f2;
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                primary = j2;
                if (composerStartRestartGroup.changed(primary)) {
                }
                i4 |= i15;
            } else {
                primary = j2;
            }
            i4 |= i15;
        } else {
            primary = j2;
        }
        i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= CpioConstants.C_ISBLK;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier3 = modifier;
        } else {
            modifier3 = modifier;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changed(modifier3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(modifier2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((i4 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    sp = TextUnitKt.getSp(14);
                }
                if (i5 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(16);
                }
                if ((i3 & 8) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier3;
                }
                if (i11 != 0) {
                    modifier5 = companion;
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                    modifier5 = companion;
                }
            } else {
                if (i14 != 0) {
                    sp = TextUnitKt.getSp(14);
                }
                if (i5 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(16);
                }
                if ((i3 & 8) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier3;
                }
                if (i11 != 0) {
                    modifier5 = companion;
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                    modifier5 = companion;
                }
            }
            float f9 = fM6097constructorimpl;
            boolean z9 = z2;
            i13 = i4;
            long j10 = primary;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
            }
            Modifier modifierM214backgroundbw27NRU$default6 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f9 / 2)).then(modifier4), f9), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
            Alignment center6 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default6);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            int i111 = i13 >> 3;
            Modifier modifier13 = modifier4;
            m6909IconViewRidXid8(i, sp, j10, z9, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i111 & 896) | (i111 & 7168) | (i111 & 57344), 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f9;
            j3 = sp;
            modifier6 = modifier5;
            modifier7 = modifier13;
            z3 = z9;
            j4 = j10;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    sp = TextUnitKt.getSp(14);
                }
                if (i5 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(16);
                }
                if ((i3 & 8) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier3;
                }
                if (i11 != 0) {
                    modifier5 = companion;
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                    modifier5 = companion;
                }
            } else {
                if (i14 != 0) {
                    sp = TextUnitKt.getSp(14);
                }
                if (i5 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(16);
                }
                if ((i3 & 8) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary();
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier3;
                }
                if (i11 != 0) {
                    modifier5 = companion;
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                    modifier5 = companion;
                }
            }
            float f10 = fM6097constructorimpl;
            boolean z10 = z2;
            i13 = i4;
            long j11 = primary;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(223152674, i13, -1, "cn.jianyun.workplan.ui.component.nav.CircleIconView (IconView.kt:29)");
            }
            Modifier modifierM214backgroundbw27NRU$default7 = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m616size3ABfNKs(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f10 / 2)).then(modifier4), f10), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), null, 2, null);
            Alignment center7 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM214backgroundbw27NRU$default7);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            int i112 = i13 >> 3;
            Modifier modifier14 = modifier4;
            m6909IconViewRidXid8(i, sp, j11, z10, modifier5, composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i112 & 896) | (i112 & 7168) | (i112 & 57344), 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f10;
            j3 = sp;
            modifier6 = modifier5;
            modifier7 = modifier14;
            z3 = z10;
            j4 = j11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$CircleIconView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i113) {
                IconViewKt.m6907CircleIconViewB6Dfk3U(i, j3, f3, j4, z3, modifier6, modifier7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: FocusText-a5Y-_hM, reason: not valid java name */
    public static final void m6908FocusTexta5Y_hM(final String text, final boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        long sp;
        Composer composer2;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(502591060);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FocusText)P(2!,1:c#ui.unit.TextUnit)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 896) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    sp = TextUnitKt.getSp(16);
                } else {
                    sp = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(502591060, i4, -1, "cn.jianyun.workplan.ui.component.nav.FocusText (IconView.kt:41)");
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(text, (Modifier) null, CommonToolKt.focusColor(z, null, composerStartRestartGroup, (i4 >> 3) & 14, 2), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i4 & 14) | ((i4 << 3) & 7168), 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = sp;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j3 = j2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$FocusText$1
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
                    IconViewKt.m6908FocusTexta5Y_hM(text, z, j3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j2 = j;
        i4 = i3;
        if ((i4 & 731) == 146) {
            if (i5 != 0) {
                sp = TextUnitKt.getSp(16);
            } else {
                sp = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502591060, i4, -1, "cn.jianyun.workplan.ui.component.nav.FocusText (IconView.kt:41)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(text, (Modifier) null, CommonToolKt.focusColor(z, null, composerStartRestartGroup, (i4 >> 3) & 14, 2), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i4 & 14) | ((i4 << 3) & 7168), 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = sp;
        } else {
            if (i5 != 0) {
                sp = TextUnitKt.getSp(16);
            } else {
                sp = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502591060, i4, -1, "cn.jianyun.workplan.ui.component.nav.FocusText (IconView.kt:41)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(text, (Modifier) null, CommonToolKt.focusColor(z, null, composerStartRestartGroup, (i4 >> 3) & 14, 2), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i4 & 14) | ((i4 << 3) & 7168), 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = sp;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.IconViewKt$FocusText$1
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
                IconViewKt.m6908FocusTexta5Y_hM(text, z, j3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}