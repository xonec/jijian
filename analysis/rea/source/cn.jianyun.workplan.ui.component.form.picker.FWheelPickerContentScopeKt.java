package cn.jianyun.workplan.ui.component.form.picker;

import android.util.Log;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.profileinstaller.ProfileVerifier;
import com.adgain.sdk.base.models.AdConstants;
import com.bykv.vk.component.ttvideo.player.C;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: FWheelPickerContentScope.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u001723\b\u0002\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001b21\u0010\u001c\u001a-\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0087\u0002\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u001723\b\u0002\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001b21\u0010\u001c\u001a-\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001f\u001aD\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u000f2\u0013\b\u0002\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0017H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aû\u0001\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u001721\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\u001a\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001b21\u0010\u001c\u001a-\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u001bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\"\u0010+\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00122\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0016H\u0080\bø\u0001\u0002\u001a?\u0010.\u001a\u00020\u0003*\u00020/2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"FHorizontalWheelPicker", "", "count", "", "state", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", AdConstants.index, "", "itemWidth", "Landroidx/compose/ui/unit/Dp;", "unfocusedCount", "userScrollEnabled", "", "reverseLayout", "debug", "focus", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "contentWrapper", "Lkotlin/Function2;", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentWrapperScope;", "Lkotlin/ExtensionFunctionType;", "content", "Lcn/jianyun/workplan/ui/component/form/picker/FWheelPickerContentScope;", "FHorizontalWheelPicker-05tvjtU", "(ILcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;FIZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "FVerticalWheelPicker", "itemHeight", "FVerticalWheelPicker-05tvjtU", "ItemSizeBox", "isVertical", "itemSize", "ItemSizeBox-942rkJo", "(Landroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "WheelPicker", "WheelPicker-lYrZsNM", "(ZILcn/jianyun/workplan/ui/component/form/picker/FWheelPickerState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;FIZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "logMsg", "block", "", "flingItemCount", "Landroidx/compose/ui/unit/Velocity;", "decay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "flingItemCount-eWP-teA", "(JZILandroidx/compose/animation/core/DecayAnimationSpec;Z)I", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FWheelPickerContentScopeKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x0201  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0211  */
    /* JADX WARN: Code duplicated, block: B:170:0x0217  */
    /* JADX WARN: Code duplicated, block: B:171:0x0222  */
    /* JADX WARN: Code duplicated, block: B:175:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x029f  */
    /* JADX WARN: Code duplicated, block: B:183:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x01cd, please report this as an issue */
    /* JADX INFO: renamed from: FVerticalWheelPicker-05tvjtU, reason: not valid java name */
    public static final void m6865FVerticalWheelPicker05tvjtU(final int i, FWheelPickerState fWheelPickerState, Modifier modifier, Function1<? super Integer, ? extends Object> function1, float f2, int i2, boolean z, boolean z2, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, final Function4<? super FWheelPickerContentScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        FWheelPickerState fWheelPickerStateRememberFWheelPickerState;
        Modifier.Companion companion;
        Function1<? super Integer, ? extends Object> function3;
        float fM6097constructorimpl;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function2M6860getLambda1$app_release;
        Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> defaultWheelPickerContentWrapper;
        boolean z5;
        FWheelPickerState fWheelPickerState2;
        Modifier modifier2;
        boolean z6;
        Function1<? super Integer, ? extends Object> function5;
        boolean z7;
        int i24;
        int i25;
        float f3;
        Composer composer2;
        final FWheelPickerState fWheelPickerState3;
        final Modifier modifier3;
        final Function1<? super Integer, ? extends Object> function6;
        final float f4;
        final int i26;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        final Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2116035053);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FVerticalWheelPicker)P(2,9,7,6,5:c#ui.unit.Dp,10,11,8,3,4,1)");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 16;
        }
        int i28 = i5 & 4;
        if (i28 == 0) {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 = i2;
                } else {
                    i12 = i2;
                    if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i6 |= i13;
                    }
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                if (i20 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = C.ENCODING_PCM_A_LAW;
                    } else {
                        i21 = C.ENCODING_PCM_MU_LAW;
                    }
                    i6 |= i21;
                }
                if ((i4 & 14) == 0) {
                    i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
                } else {
                    i22 = i4;
                }
                if ((i5 & 2048) != 0) {
                    i22 |= 48;
                } else if ((i4 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i22 |= i23;
                }
                if (i27 == 2 || (1533916891 & i6) != 306783378 || (i22 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i27 != 0) {
                            fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                            i6 &= -113;
                        } else {
                            fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                        }
                        if (i28 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i7 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(40);
                        } else {
                            fM6097constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            i12 = 1;
                        }
                        boolean z11 = i14 == 0 ? z : true;
                        if (i16 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        boolean z12 = i18 == 0 ? z3 : false;
                        if (i20 != 0) {
                            function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                        } else {
                            function2M6860getLambda1$app_release = function2;
                        }
                        if ((i5 & 1024) != 0) {
                            i22 &= -15;
                            defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                        } else {
                            defaultWheelPickerContentWrapper = function4;
                        }
                        z5 = z4;
                        fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                        modifier2 = companion;
                        z6 = z12;
                        function5 = function3;
                        z7 = z11;
                        i24 = i12;
                        i25 = i22;
                        f3 = fM6097constructorimpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i27 != 0) {
                            i6 &= -113;
                        }
                        if ((i5 & 1024) != 0) {
                            i22 &= -15;
                        }
                        fWheelPickerState2 = fWheelPickerState;
                        modifier2 = modifier;
                        function5 = function1;
                        z7 = z;
                        z5 = z2;
                        z6 = z3;
                        function2M6860getLambda1$app_release = function2;
                        defaultWheelPickerContentWrapper = function4;
                        i24 = i12;
                        i25 = i22;
                        f3 = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
                    }
                    int i29 = i6 << 3;
                    int i30 = i25 << 3;
                    composer2 = composerStartRestartGroup;
                    m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i29 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i29 & 7168) | (57344 & i29) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), ((i6 >> 27) & 14) | (i30 & 112) | (i30 & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fWheelPickerState3 = fWheelPickerState2;
                    modifier3 = modifier2;
                    function6 = function5;
                    f4 = f3;
                    i26 = i24;
                    z8 = z7;
                    z9 = z5;
                    z10 = z6;
                    function7 = function2M6860getLambda1$app_release;
                    function8 = defaultWheelPickerContentWrapper;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    fWheelPickerState3 = fWheelPickerState;
                    modifier3 = modifier;
                    function6 = function1;
                    f4 = f2;
                    z8 = z;
                    z9 = z2;
                    z10 = z3;
                    function8 = function4;
                    i26 = i12;
                    composer2 = composerStartRestartGroup;
                    function7 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FVerticalWheelPicker$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i31) {
                        FWheelPickerContentScopeKt.m6865FVerticalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
            }
            i6 |= 3072;
            i9 = i5 & 16;
            if (i9 != 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2;
            } else {
                i12 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            if (i20 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = C.ENCODING_PCM_A_LAW;
                } else {
                    i21 = C.ENCODING_PCM_MU_LAW;
                }
                i6 |= i21;
            }
            if ((i4 & 14) == 0) {
                i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
            } else {
                i22 = i4;
            }
            if ((i5 & 2048) != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i22 |= i23;
            }
            if (i27 == 2) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
                }
                int i210 = i6 << 3;
                int i31 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i210 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i210 & 7168) | (57344 & i210) | (i210 & 458752) | (i210 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), ((i6 >> 27) & 14) | (i31 & 112) | (i31 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6860getLambda1$app_release;
                function8 = defaultWheelPickerContentWrapper;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
                }
                int i211 = i6 << 3;
                int i32 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i211 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i211 & 7168) | (57344 & i211) | (i211 & 458752) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), ((i6 >> 27) & 14) | (i32 & 112) | (i32 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6860getLambda1$app_release;
                function8 = defaultWheelPickerContentWrapper;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FVerticalWheelPicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i33) {
                    FWheelPickerContentScopeKt.m6865FVerticalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2;
            } else {
                i12 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            if (i20 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = C.ENCODING_PCM_A_LAW;
                } else {
                    i21 = C.ENCODING_PCM_MU_LAW;
                }
                i6 |= i21;
            }
            if ((i4 & 14) == 0) {
                i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
            } else {
                i22 = i4;
            }
            if ((i5 & 2048) != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i22 |= i23;
            }
            if (i27 == 2) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
                }
                int i212 = i6 << 3;
                int i33 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i212 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i212 & 7168) | (57344 & i212) | (i212 & 458752) | (i212 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), ((i6 >> 27) & 14) | (i33 & 112) | (i33 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6860getLambda1$app_release;
                function8 = defaultWheelPickerContentWrapper;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(40);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                    } else {
                        function2M6860getLambda1$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
                }
                int i213 = i6 << 3;
                int i34 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i213 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i213 & 7168) | (57344 & i213) | (i213 & 458752) | (i213 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), ((i6 >> 27) & 14) | (i34 & 112) | (i34 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6860getLambda1$app_release;
                function8 = defaultWheelPickerContentWrapper;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FVerticalWheelPicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i35) {
                    FWheelPickerContentScopeKt.m6865FVerticalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 |= 3072;
        i9 = i5 & 16;
        if (i9 != 0) {
            i6 |= CpioConstants.C_ISBLK;
        } else if ((i3 & 57344) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        i11 = i5 & 32;
        if (i11 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 = i2;
        } else {
            i12 = i2;
            if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i6 |= i13;
            }
        }
        i14 = i5 & 64;
        if (i14 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        i16 = i5 & 128;
        if (i16 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i6 |= i17;
        }
        i18 = i5 & 256;
        if (i18 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i6 |= i19;
        }
        i20 = i5 & 512;
        if (i20 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = C.ENCODING_PCM_A_LAW;
            } else {
                i21 = C.ENCODING_PCM_MU_LAW;
            }
            i6 |= i21;
        }
        if ((i4 & 14) == 0) {
            i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
        } else {
            i22 = i4;
        }
        if ((i5 & 2048) != 0) {
            i22 |= 48;
        } else if ((i4 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i22 |= i23;
        }
        if (i27 == 2) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(40);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                } else {
                    function2M6860getLambda1$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            } else {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(40);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                } else {
                    function2M6860getLambda1$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
            }
            int i214 = i6 << 3;
            int i35 = i25 << 3;
            composer2 = composerStartRestartGroup;
            m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i214 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i214 & 7168) | (57344 & i214) | (i214 & 458752) | (i214 & 3670016) | (i214 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), ((i6 >> 27) & 14) | (i35 & 112) | (i35 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fWheelPickerState3 = fWheelPickerState2;
            modifier3 = modifier2;
            function6 = function5;
            f4 = f3;
            i26 = i24;
            z8 = z7;
            z9 = z5;
            z10 = z6;
            function7 = function2M6860getLambda1$app_release;
            function8 = defaultWheelPickerContentWrapper;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(40);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                } else {
                    function2M6860getLambda1$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            } else {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(40);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6860getLambda1$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6860getLambda1$app_release();
                } else {
                    function2M6860getLambda1$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2116035053, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FVerticalWheelPicker (FWheelPickerContentScope.kt:43)");
            }
            int i215 = i6 << 3;
            int i36 = i25 << 3;
            composer2 = composerStartRestartGroup;
            m6867WheelPickerlYrZsNM(true, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6860getLambda1$app_release, defaultWheelPickerContentWrapper, content, composer2, (i215 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i215 & 7168) | (57344 & i215) | (i215 & 458752) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), ((i6 >> 27) & 14) | (i36 & 112) | (i36 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fWheelPickerState3 = fWheelPickerState2;
            modifier3 = modifier2;
            function6 = function5;
            f4 = f3;
            i26 = i24;
            z8 = z7;
            z9 = z5;
            z10 = z6;
            function7 = function2M6860getLambda1$app_release;
            function8 = defaultWheelPickerContentWrapper;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FVerticalWheelPicker$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i37) {
                FWheelPickerContentScopeKt.m6865FVerticalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:161:0x0201  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0211  */
    /* JADX WARN: Code duplicated, block: B:170:0x0217  */
    /* JADX WARN: Code duplicated, block: B:171:0x0222  */
    /* JADX WARN: Code duplicated, block: B:175:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x029f  */
    /* JADX WARN: Code duplicated, block: B:183:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x01cd, please report this as an issue */
    /* JADX INFO: renamed from: FHorizontalWheelPicker-05tvjtU, reason: not valid java name */
    public static final void m6864FHorizontalWheelPicker05tvjtU(final int i, FWheelPickerState fWheelPickerState, Modifier modifier, Function1<? super Integer, ? extends Object> function1, float f2, int i2, boolean z, boolean z2, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, final Function4<? super FWheelPickerContentScope, ? super Integer, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        FWheelPickerState fWheelPickerStateRememberFWheelPickerState;
        Modifier.Companion companion;
        Function1<? super Integer, ? extends Object> function3;
        float fM6097constructorimpl;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function2M6861getLambda2$app_release;
        Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> defaultWheelPickerContentWrapper;
        boolean z5;
        FWheelPickerState fWheelPickerState2;
        Modifier modifier2;
        boolean z6;
        Function1<? super Integer, ? extends Object> function5;
        boolean z7;
        int i24;
        int i25;
        float f3;
        Composer composer2;
        final FWheelPickerState fWheelPickerState3;
        final Modifier modifier3;
        final Function1<? super Integer, ? extends Object> function6;
        final float f4;
        final int i26;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        final Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(80780993);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FHorizontalWheelPicker)P(2,9,7,6,5:c#ui.unit.Dp,10,11,8,3,4,1)");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 16;
        }
        int i28 = i5 & 4;
        if (i28 == 0) {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else if ((i3 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 = i2;
                } else {
                    i12 = i2;
                    if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i12)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i6 |= i13;
                    }
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                if (i20 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = C.ENCODING_PCM_A_LAW;
                    } else {
                        i21 = C.ENCODING_PCM_MU_LAW;
                    }
                    i6 |= i21;
                }
                if ((i4 & 14) == 0) {
                    i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
                } else {
                    i22 = i4;
                }
                if ((i5 & 2048) != 0) {
                    i22 |= 48;
                } else if ((i4 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i22 |= i23;
                }
                if (i27 == 2 || (1533916891 & i6) != 306783378 || (i22 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i27 != 0) {
                            fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                            i6 &= -113;
                        } else {
                            fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                        }
                        if (i28 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i7 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        if (i9 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(35);
                        } else {
                            fM6097constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            i12 = 1;
                        }
                        boolean z11 = i14 == 0 ? z : true;
                        if (i16 != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        boolean z12 = i18 == 0 ? z3 : false;
                        if (i20 != 0) {
                            function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                        } else {
                            function2M6861getLambda2$app_release = function2;
                        }
                        if ((i5 & 1024) != 0) {
                            i22 &= -15;
                            defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                        } else {
                            defaultWheelPickerContentWrapper = function4;
                        }
                        z5 = z4;
                        fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                        modifier2 = companion;
                        z6 = z12;
                        function5 = function3;
                        z7 = z11;
                        i24 = i12;
                        i25 = i22;
                        f3 = fM6097constructorimpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if (i27 != 0) {
                            i6 &= -113;
                        }
                        if ((i5 & 1024) != 0) {
                            i22 &= -15;
                        }
                        fWheelPickerState2 = fWheelPickerState;
                        modifier2 = modifier;
                        function5 = function1;
                        z7 = z;
                        z5 = z2;
                        z6 = z3;
                        function2M6861getLambda2$app_release = function2;
                        defaultWheelPickerContentWrapper = function4;
                        i24 = i12;
                        i25 = i22;
                        f3 = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
                    }
                    int i29 = i6 << 3;
                    int i30 = i25 << 3;
                    composer2 = composerStartRestartGroup;
                    m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i29 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i29 & 7168) | (57344 & i29) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), ((i6 >> 27) & 14) | (i30 & 112) | (i30 & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fWheelPickerState3 = fWheelPickerState2;
                    modifier3 = modifier2;
                    function6 = function5;
                    f4 = f3;
                    i26 = i24;
                    z8 = z7;
                    z9 = z5;
                    z10 = z6;
                    function7 = function2M6861getLambda2$app_release;
                    function8 = defaultWheelPickerContentWrapper;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    fWheelPickerState3 = fWheelPickerState;
                    modifier3 = modifier;
                    function6 = function1;
                    f4 = f2;
                    z8 = z;
                    z9 = z2;
                    z10 = z3;
                    function8 = function4;
                    i26 = i12;
                    composer2 = composerStartRestartGroup;
                    function7 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FHorizontalWheelPicker$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i31) {
                        FWheelPickerContentScopeKt.m6864FHorizontalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
            }
            i6 |= 3072;
            i9 = i5 & 16;
            if (i9 != 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2;
            } else {
                i12 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            if (i20 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = C.ENCODING_PCM_A_LAW;
                } else {
                    i21 = C.ENCODING_PCM_MU_LAW;
                }
                i6 |= i21;
            }
            if ((i4 & 14) == 0) {
                i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
            } else {
                i22 = i4;
            }
            if ((i5 & 2048) != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i22 |= i23;
            }
            if (i27 == 2) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
                }
                int i210 = i6 << 3;
                int i31 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i210 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i210 & 7168) | (57344 & i210) | (i210 & 458752) | (i210 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), ((i6 >> 27) & 14) | (i31 & 112) | (i31 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6861getLambda2$app_release;
                function8 = defaultWheelPickerContentWrapper;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
                }
                int i211 = i6 << 3;
                int i32 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i211 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i211 & 7168) | (57344 & i211) | (i211 & 458752) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), ((i6 >> 27) & 14) | (i32 & 112) | (i32 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6861getLambda2$app_release;
                function8 = defaultWheelPickerContentWrapper;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FHorizontalWheelPicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i33) {
                    FWheelPickerContentScopeKt.m6864FHorizontalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                i6 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i2;
            } else {
                i12 = i2;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i12)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            if (i20 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = C.ENCODING_PCM_A_LAW;
                } else {
                    i21 = C.ENCODING_PCM_MU_LAW;
                }
                i6 |= i21;
            }
            if ((i4 & 14) == 0) {
                i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
            } else {
                i22 = i4;
            }
            if ((i5 & 2048) != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i22 |= i23;
            }
            if (i27 == 2) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
                }
                int i212 = i6 << 3;
                int i33 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i212 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i212 & 7168) | (57344 & i212) | (i212 & 458752) | (i212 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), ((i6 >> 27) & 14) | (i33 & 112) | (i33 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6861getLambda2$app_release;
                function8 = defaultWheelPickerContentWrapper;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                } else {
                    if (i27 != 0) {
                        fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                        i6 &= -113;
                    } else {
                        fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                    }
                    if (i28 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i7 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i9 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(35);
                    } else {
                        fM6097constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        i12 = 1;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    if (i18 == 0) {
                    }
                    if (i20 != 0) {
                        function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                    } else {
                        function2M6861getLambda2$app_release = function2;
                    }
                    if ((i5 & 1024) != 0) {
                        i22 &= -15;
                        defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                    } else {
                        defaultWheelPickerContentWrapper = function4;
                    }
                    z5 = z4;
                    fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                    modifier2 = companion;
                    z6 = z12;
                    function5 = function3;
                    z7 = z11;
                    i24 = i12;
                    i25 = i22;
                    f3 = fM6097constructorimpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
                }
                int i213 = i6 << 3;
                int i34 = i25 << 3;
                composer2 = composerStartRestartGroup;
                m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i213 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i213 & 7168) | (57344 & i213) | (i213 & 458752) | (i213 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), ((i6 >> 27) & 14) | (i34 & 112) | (i34 & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fWheelPickerState3 = fWheelPickerState2;
                modifier3 = modifier2;
                function6 = function5;
                f4 = f3;
                i26 = i24;
                z8 = z7;
                z9 = z5;
                z10 = z6;
                function7 = function2M6861getLambda2$app_release;
                function8 = defaultWheelPickerContentWrapper;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FHorizontalWheelPicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i35) {
                    FWheelPickerContentScopeKt.m6864FHorizontalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 |= 3072;
        i9 = i5 & 16;
        if (i9 != 0) {
            i6 |= CpioConstants.C_ISBLK;
        } else if ((i3 & 57344) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        i11 = i5 & 32;
        if (i11 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 = i2;
        } else {
            i12 = i2;
            if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i6 |= i13;
            }
        }
        i14 = i5 & 64;
        if (i14 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        i16 = i5 & 128;
        if (i16 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i6 |= i17;
        }
        i18 = i5 & 256;
        if (i18 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i6 |= i19;
        }
        i20 = i5 & 512;
        if (i20 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = C.ENCODING_PCM_A_LAW;
            } else {
                i21 = C.ENCODING_PCM_MU_LAW;
            }
            i6 |= i21;
        }
        if ((i4 & 14) == 0) {
            i22 = i4 | (((i5 & 1024) == 0 || !composerStartRestartGroup.changedInstance(function4)) ? 2 : 4);
        } else {
            i22 = i4;
        }
        if ((i5 & 2048) != 0) {
            i22 |= 48;
        } else if ((i4 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i22 |= i23;
        }
        if (i27 == 2) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(35);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                } else {
                    function2M6861getLambda2$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            } else {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(35);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                } else {
                    function2M6861getLambda2$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
            }
            int i214 = i6 << 3;
            int i35 = i25 << 3;
            composer2 = composerStartRestartGroup;
            m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i214 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i214 & 7168) | (57344 & i214) | (i214 & 458752) | (i214 & 3670016) | (i214 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), ((i6 >> 27) & 14) | (i35 & 112) | (i35 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fWheelPickerState3 = fWheelPickerState2;
            modifier3 = modifier2;
            function6 = function5;
            f4 = f3;
            i26 = i24;
            z8 = z7;
            z9 = z5;
            z10 = z6;
            function7 = function2M6861getLambda2$app_release;
            function8 = defaultWheelPickerContentWrapper;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(35);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                } else {
                    function2M6861getLambda2$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            } else {
                if (i27 != 0) {
                    fWheelPickerStateRememberFWheelPickerState = RememberFWheelPickerStateKt.rememberFWheelPickerState(0, composerStartRestartGroup, 0, 1);
                    i6 &= -113;
                } else {
                    fWheelPickerStateRememberFWheelPickerState = fWheelPickerState;
                }
                if (i28 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i7 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i9 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(35);
                } else {
                    fM6097constructorimpl = f2;
                }
                if (i11 != 0) {
                    i12 = 1;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i18 == 0) {
                }
                if (i20 != 0) {
                    function2M6861getLambda2$app_release = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6861getLambda2$app_release();
                } else {
                    function2M6861getLambda2$app_release = function2;
                }
                if ((i5 & 1024) != 0) {
                    i22 &= -15;
                    defaultWheelPickerContentWrapper = FWheelPickerFocusVerticalKt.getDefaultWheelPickerContentWrapper();
                } else {
                    defaultWheelPickerContentWrapper = function4;
                }
                z5 = z4;
                fWheelPickerState2 = fWheelPickerStateRememberFWheelPickerState;
                modifier2 = companion;
                z6 = z12;
                function5 = function3;
                z7 = z11;
                i24 = i12;
                i25 = i22;
                f3 = fM6097constructorimpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(80780993, i6, i25, "cn.jianyun.workplan.ui.component.form.picker.FHorizontalWheelPicker (FWheelPickerContentScope.kt:76)");
            }
            int i215 = i6 << 3;
            int i36 = i25 << 3;
            composer2 = composerStartRestartGroup;
            m6867WheelPickerlYrZsNM(false, i, fWheelPickerState2, modifier2, function5, f3, i24, z7, z5, z6, function2M6861getLambda2$app_release, defaultWheelPickerContentWrapper, content, composer2, (i215 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_TCP_FAST_OPEN_SUCCESS | (i215 & 7168) | (57344 & i215) | (i215 & 458752) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), ((i6 >> 27) & 14) | (i36 & 112) | (i36 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fWheelPickerState3 = fWheelPickerState2;
            modifier3 = modifier2;
            function6 = function5;
            f4 = f3;
            i26 = i24;
            z8 = z7;
            z9 = z5;
            z10 = z6;
            function7 = function2M6861getLambda2$app_release;
            function8 = defaultWheelPickerContentWrapper;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$FHorizontalWheelPicker$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i37) {
                FWheelPickerContentScopeKt.m6864FHorizontalWheelPicker05tvjtU(i, fWheelPickerState3, modifier3, function6, f4, i26, z8, z9, z10, function7, function8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: WheelPicker-lYrZsNM, reason: not valid java name */
    public static final void m6867WheelPickerlYrZsNM(final boolean z, final int i, final FWheelPickerState fWheelPickerState, final Modifier modifier, final Function1<? super Integer, ? extends Object> function1, final float f2, final int i2, final boolean z2, final boolean z3, final boolean z4, final Function2<? super Composer, ? super Integer, Unit> function2, final Function4<? super FWheelPickerContentWrapperScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, final Function4<? super FWheelPickerContentScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, Composer composer, final int i3, final int i4) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1159843767);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1159843767, i3, i4, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker (FWheelPickerContentScope.kt:108)");
        }
        if (!(i >= 0)) {
            throw new IllegalArgumentException("require count >= 0".toString());
        }
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException("require unfocusedCount >= 1".toString());
        }
        fWheelPickerState.setDebug$app_release(z4);
        EffectsKt.LaunchedEffect(fWheelPickerState, Integer.valueOf(i), new FWheelPickerContentScopeKt$WheelPicker$3(fWheelPickerState, i, null), composerStartRestartGroup, (i3 & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_CURRENT_DOWNLOAD_INDEX);
        composerStartRestartGroup.startReplaceableGroup(499230858);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(fWheelPickerState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new WheelPickerNestedScrollConnection(fWheelPickerState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        WheelPickerNestedScrollConnection wheelPickerNestedScrollConnection = (WheelPickerNestedScrollConnection) objRememberedValue;
        wheelPickerNestedScrollConnection.setVertical(Boolean.valueOf(z));
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        wheelPickerNestedScrollConnection.setItemSizePx(Integer.valueOf(((Density) objConsume).mo312roundToPx0680j_4(f2)));
        wheelPickerNestedScrollConnection.setReverseLayout(Boolean.valueOf(z3));
        composerStartRestartGroup.endReplaceableGroup();
        Dp dpM6095boximpl = Dp.m6095boximpl(f2);
        Integer numValueOf = Integer.valueOf(i2);
        int i5 = i3 >> 15;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean zChanged2 = composerStartRestartGroup.changed(dpM6095boximpl) | composerStartRestartGroup.changed(numValueOf);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = Dp.m6095boximpl(Dp.m6097constructorimpl(((i2 * 2) + 1) * f2));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float fM6111unboximpl = ((Dp) objRememberedValue2).m6111unboximpl();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged3 = composerStartRestartGroup.changed(fWheelPickerState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new FWheelPickerContentWrapperScopeImpl(new WheelPickerContentScopeImpl(fWheelPickerState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final FWheelPickerContentWrapperScopeImpl fWheelPickerContentWrapperScopeImpl = (FWheelPickerContentWrapperScopeImpl) objRememberedValue3;
        fWheelPickerContentWrapperScopeImpl.setContent(function5);
        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier, wheelPickerNestedScrollConnection, null, 2, null);
        if (Dp.m6096compareTo0680j_4(fM6111unboximpl, Dp.m6097constructorimpl(0)) > 0) {
            if (z) {
                modifierNestedScroll$default = SizeKt.m623widthInVpY3zN4$default(SizeKt.m602height3ABfNKs(modifierNestedScroll$default, fM6111unboximpl), Dp.m6097constructorimpl(40), 0.0f, 2, null);
            } else {
                modifierNestedScroll$default = SizeKt.m604heightInVpY3zN4$default(SizeKt.m621width3ABfNKs(modifierNestedScroll$default, fM6111unboximpl), Dp.m6097constructorimpl(40), 0.0f, 2, null);
            }
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierNestedScroll$default);
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
        Function1<LazyListScope, Unit> function3 = new Function1<LazyListScope, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$5$lazyListScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyListScope lazyListScope) {
                Intrinsics.checkNotNullParameter(lazyListScope, "$this$null");
                int i6 = i2;
                final boolean z5 = z;
                final float f3 = f2;
                final int i7 = i3;
                for (int i8 = 0; i8 < i6; i8++) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(474612900, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$5$lazyListScope$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                            invoke(lazyItemScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i9 & 81) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(474612900, i9, -1, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FWheelPickerContentScope.kt:169)");
                                }
                                boolean z6 = z5;
                                float f4 = f3;
                                int i10 = i7;
                                FWheelPickerContentScopeKt.m6866ItemSizeBox942rkJo(null, z6, f4, null, composer2, ((i10 << 3) & 112) | ((i10 >> 9) & 896), 9);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), 3, null);
                }
                int i9 = i;
                Function1<Integer, Object> function6 = function1;
                final boolean z6 = z;
                final float f4 = f2;
                final int i10 = i3;
                final Function4<FWheelPickerContentWrapperScope, Integer, Composer, Integer, Unit> function7 = function4;
                final FWheelPickerContentWrapperScopeImpl fWheelPickerContentWrapperScopeImpl2 = fWheelPickerContentWrapperScopeImpl;
                final int i11 = i4;
                LazyListScope.items$default(lazyListScope, i9, function6, null, ComposableLambdaKt.composableLambdaInstance(-969360759, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$5$lazyListScope$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope items, final int i12, Composer composer2, int i13) {
                        final int i14;
                        Intrinsics.checkNotNullParameter(items, "$this$items");
                        if ((i13 & 112) == 0) {
                            i14 = i13 | (composer2.changed(i12) ? 32 : 16);
                        } else {
                            i14 = i13;
                        }
                        if ((i14 & 721) != 144 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-969360759, i14, -1, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker.<anonymous>.<anonymous>.<anonymous> (FWheelPickerContentScope.kt:180)");
                            }
                            boolean z7 = z6;
                            float f5 = f4;
                            final Function4<FWheelPickerContentWrapperScope, Integer, Composer, Integer, Unit> function8 = function7;
                            final FWheelPickerContentWrapperScopeImpl fWheelPickerContentWrapperScopeImpl3 = fWheelPickerContentWrapperScopeImpl2;
                            final int i15 = i11;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -99274496, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt.WheelPicker.5.lazyListScope.1.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i16) {
                                    if ((i16 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-99274496, i16, -1, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FWheelPickerContentScope.kt:184)");
                                    }
                                    function8.invoke(fWheelPickerContentWrapperScopeImpl3, Integer.valueOf(i12), composer3, Integer.valueOf((i14 & 112) | 8 | ((i15 << 3) & 896)));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i16 = i10;
                            FWheelPickerContentScopeKt.m6866ItemSizeBox942rkJo(null, z7, f5, composableLambda, composer2, ((i16 << 3) & 112) | 3072 | ((i16 >> 9) & 896), 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 4, null);
                int i12 = i2;
                final boolean z7 = z;
                final float f5 = f2;
                final int i13 = i3;
                for (int i14 = 0; i14 < i12; i14++) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(368766157, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$5$lazyListScope$1$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                            invoke(lazyItemScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer2, int i15) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i15 & 81) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(368766157, i15, -1, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FWheelPickerContentScope.kt:190)");
                                }
                                boolean z8 = z7;
                                float f6 = f5;
                                int i16 = i13;
                                FWheelPickerContentScopeKt.m6866ItemSizeBox942rkJo(null, z8, f6, null, composer2, ((i16 << 3) & 112) | ((i16 >> 9) & 896), 9);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), 3, null);
                }
            }
        };
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(2142999440);
            LazyDslKt.LazyColumn(boxScopeInstance.matchParentSize(Modifier.INSTANCE), fWheelPickerState.getLazyListState(), null, z3, null, Alignment.INSTANCE.getCenterHorizontally(), null, z2, function3, composerStartRestartGroup, 196608 | (i5 & 7168) | (29360128 & i3), 84);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(2142999806);
            LazyDslKt.LazyRow(boxScopeInstance.matchParentSize(Modifier.INSTANCE), fWheelPickerState.getLazyListState(), null, z3, null, Alignment.INSTANCE.getCenterVertically(), null, z2, function3, composerStartRestartGroup, 196608 | (i5 & 7168) | (29360128 & i3), 84);
            composerStartRestartGroup.endReplaceableGroup();
        }
        m6866ItemSizeBox942rkJo(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), z, f2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1525547608, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$5$1
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

            public final void invoke(Composer composer2, int i6) {
                if ((i6 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525547608, i6, -1, "cn.jianyun.workplan.ui.component.form.picker.WheelPicker.<anonymous>.<anonymous> (FWheelPickerContentScope.kt:223)");
                }
                function2.invoke(composer2, Integer.valueOf(i4 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, ((i3 << 3) & 112) | 3072 | ((i3 >> 9) & 896), 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$6
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

            public final void invoke(Composer composer2, int i6) {
                FWheelPickerContentScopeKt.m6867WheelPickerlYrZsNM(z, i, fWheelPickerState, modifier, function1, f2, i2, z2, z3, z4, function2, function4, function5, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ItemSizeBox-942rkJo, reason: not valid java name */
    public static final void m6866ItemSizeBox942rkJo(Modifier modifier, final boolean z, final float f2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifierM621width3ABfNKs;
        Composer composerStartRestartGroup = composer.startRestartGroup(943762092);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function2 = ComposableSingletons$FWheelPickerContentScopeKt.INSTANCE.m6862getLambda3$app_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943762092, i3, -1, "cn.jianyun.workplan.ui.component.form.picker.ItemSizeBox (FWheelPickerContentScope.kt:230)");
            }
            if (z) {
                modifierM621width3ABfNKs = SizeKt.m602height3ABfNKs(modifier, f2);
            } else {
                modifierM621width3ABfNKs = SizeKt.m621width3ABfNKs(modifier, f2);
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM621width3ABfNKs);
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final Function2<? super Composer, ? super Integer, Unit> function3 = function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$ItemSizeBox$3
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

            public final void invoke(Composer composer2, int i6) {
                FWheelPickerContentScopeKt.m6866ItemSizeBox942rkJo(modifier2, z, f2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: flingItemCount-eWP-teA, reason: not valid java name */
    public static final int m6871flingItemCounteWPteA(long j, boolean z, int i, DecayAnimationSpec<Float> decayAnimationSpec, boolean z2) {
        if (i <= 0) {
            return 0;
        }
        int iCalculateTargetValue = (int) (DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, z ? Velocity.m6333getYimpl(j) : Velocity.m6332getXimpl(j)) / i);
        return z2 ? -iCalculateTargetValue : iCalculateTargetValue;
    }

    public static final void logMsg(boolean z, Function0<String> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            Log.i("FWheelPicker", block.invoke());
        }
    }
}