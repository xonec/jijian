package cn.jianyun.workplan.ui.component.form;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.ui.ComposedModifierKt;
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
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaFormat;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: ButtonView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0013\u001a=\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001aA\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a%\u0010'\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010(\u001a%\u0010*\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010(\u001a%\u0010+\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010(\u001aY\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a=\u00105\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0013\u001a/\u00106\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u00107\u001a\u00020\u0005*\u00020\u00052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"Cancel2Button", "", "label", "", "modifier", "Landroidx/compose/ui/Modifier;", "action", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CancelButton", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "CancelButton-vHmCa5Y", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DeleteOrHideButton", "hideLabel", "deleteLabel", "hideAction", "deleteAction", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DoubleButtonGroup", "label1", "label2", "okAction1", "okAction2", "LinkButton", MediaFormat.KEY_WIDTH, "Landroidx/compose/ui/unit/Dp;", MediaFormat.KEY_HEIGHT, "background", "Landroidx/compose/ui/graphics/Color;", "color", "LinkButton-iPolEAI", "(Ljava/lang/String;FFJJJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LongCancelButton", "fration", "", "LongCancelButton-vHmCa5Y", "(Ljava/lang/String;FJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LongDeleteButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LongOkButton", "LongPrivateButton", "LongVipButton", "OkAndCancelButtonGroup", "okLabel", "cancelLabel", "padding", "hpadding", "okAction", "cancelAction", "OkAndCancelButtonGroup-1yyLQnY", "(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OkAndDeleteButtonGroup", "OkButton", "tap", "onClick", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ButtonViewKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:105:0x017b  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x020c  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x011e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c  */
    /* JADX INFO: renamed from: LinkButton-iPolEAI, reason: not valid java name */
    public static final void m6814LinkButtoniPolEAI(String str, float f2, float f3, long j, long j2, long j3, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        int i3;
        float fM6097constructorimpl;
        int i4;
        float fM6097constructorimpl2;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2;
        long sp;
        long themeColor;
        long jM3792getWhite0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        final long j5;
        final float f4;
        final long j6;
        String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(324613139);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinkButton)P(5,6:c#ui.unit.Dp,4:c#ui.unit.Dp,3:c#ui.unit.TextUnit,1:c#ui.graphics.Color,2:c#ui.graphics.Color)");
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                fM6097constructorimpl = f2;
                i3 |= composerStartRestartGroup.changed(fM6097constructorimpl) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    fM6097constructorimpl2 = f3;
                    if (composerStartRestartGroup.changed(fM6097constructorimpl2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        j4 = j;
                        if (composerStartRestartGroup.changed(j4)) {
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
                        if (composerStartRestartGroup.changed(j2)) {
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
                        if (composerStartRestartGroup.changed(j3)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(action)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i13 != 0) {
                                str2 = "确定";
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(60);
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                            }
                            if (i6 != 0) {
                                sp = TextUnitKt.getSp(13);
                            } else {
                                sp = j4;
                            }
                            if (i8 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j2;
                            }
                            if (i10 != 0) {
                                jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                            } else {
                                jM3792getWhite0d7_KjU = j3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                            }
                            Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(action);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            int i15 = i3 >> 9;
                            TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i15 & 896) | (i3 & 7168), i15 & 14, 130032);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j5 = sp;
                            f4 = fM6097constructorimpl2;
                            j6 = jM3792getWhite0d7_KjU;
                            str3 = str2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            str3 = str;
                            themeColor = j2;
                            f4 = fM6097constructorimpl2;
                            j5 = j4;
                            j6 = j3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final String str4 = str3;
                        final float f5 = fM6097constructorimpl;
                        final long j7 = themeColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i16) {
                                ButtonViewKt.m6814LinkButtoniPolEAI(str4, f5, f4, j5, j7, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i12 = 1572864;
                    i3 |= i12;
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs2 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i16 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs2, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i16 & 896) | (i3 & 7168), i16 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    } else {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs3 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i17 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs3, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i17 & 896) | (i3 & 7168), i17 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str5 = str3;
                    final float f6 = fM6097constructorimpl;
                    final long j8 = themeColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i18) {
                            ButtonViewKt.m6814LinkButtoniPolEAI(str5, f6, f4, j5, j8, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                j4 = j;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(j2)) {
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
                    if (composerStartRestartGroup.changed(j3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(action)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs4 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i18 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs4, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i18 & 896) | (i3 & 7168), i18 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    } else {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs5 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i19 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs5, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i19 & 896) | (i3 & 7168), i19 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str6 = str3;
                    final float f7 = fM6097constructorimpl;
                    final long j9 = themeColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i110) {
                            ButtonViewKt.m6814LinkButtoniPolEAI(str6, f7, f4, j5, j9, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs6 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i110 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs6, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i110 & 896) | (i3 & 7168), i110 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs7 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i111 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs7, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i111 & 896) | (i3 & 7168), i111 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str7 = str3;
                final float f8 = fM6097constructorimpl;
                final long j10 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i112) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str7, f8, f4, j5, j10, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            fM6097constructorimpl2 = f3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
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
                    if (composerStartRestartGroup.changed(j2)) {
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
                    if (composerStartRestartGroup.changed(j3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(action)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs8 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i112 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs8, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i112 & 896) | (i3 & 7168), i112 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    } else {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs9 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i113 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs9, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i113 & 896) | (i3 & 7168), i113 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str8 = str3;
                    final float f9 = fM6097constructorimpl;
                    final long j11 = themeColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i114) {
                            ButtonViewKt.m6814LinkButtoniPolEAI(str8, f9, f4, j5, j11, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs10 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i114 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs10, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i114 & 896) | (i3 & 7168), i114 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs11 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i115 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i115 & 896) | (i3 & 7168), i115 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str9 = str3;
                final float f10 = fM6097constructorimpl;
                final long j12 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i116) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str9, f10, f4, j5, j12, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
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
                if (composerStartRestartGroup.changed(j3)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs12 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i116 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs12, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i116 & 896) | (i3 & 7168), i116 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs13 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i117 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs13, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i117 & 896) | (i3 & 7168), i117 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str10 = str3;
                final float f11 = fM6097constructorimpl;
                final long j13 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i118) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str10, f11, f4, j5, j13, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs14 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i118 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs14, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i118 & 896) | (i3 & 7168), i118 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            } else {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs15 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i119 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs15, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i119 & 896) | (i3 & 7168), i119 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str11 = str3;
            final float f12 = fM6097constructorimpl;
            final long j14 = themeColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i1110) {
                    ButtonViewKt.m6814LinkButtoniPolEAI(str11, f12, f4, j5, j14, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        fM6097constructorimpl = f2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                fM6097constructorimpl2 = f3;
                if (composerStartRestartGroup.changed(fM6097constructorimpl2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
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
                    if (composerStartRestartGroup.changed(j2)) {
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
                    if (composerStartRestartGroup.changed(j3)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(action)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs16 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i1110 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs16, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1110 & 896) | (i3 & 7168), i1110 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    } else {
                        if (i13 != 0) {
                            str2 = "确定";
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(60);
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                        }
                        if (i6 != 0) {
                            sp = TextUnitKt.getSp(13);
                        } else {
                            sp = j4;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j2;
                        }
                        if (i10 != 0) {
                            jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                        } else {
                            jM3792getWhite0d7_KjU = j3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                        }
                        Modifier modifierM6957radius3ABfNKs17 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(action);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        int i1111 = i3 >> 9;
                        TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs17, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1111 & 896) | (i3 & 7168), i1111 & 14, 130032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        f4 = fM6097constructorimpl2;
                        j6 = jM3792getWhite0d7_KjU;
                        str3 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str12 = str3;
                    final float f13 = fM6097constructorimpl;
                    final long j15 = themeColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1112) {
                            ButtonViewKt.m6814LinkButtoniPolEAI(str12, f13, f4, j5, j15, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 1572864;
                i3 |= i12;
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs18 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1112 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs18, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1112 & 896) | (i3 & 7168), i1112 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs19 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1113 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs19, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1113 & 896) | (i3 & 7168), i1113 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str13 = str3;
                final float f14 = fM6097constructorimpl;
                final long j16 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1114) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str13, f14, f4, j5, j16, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
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
                if (composerStartRestartGroup.changed(j3)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs110 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1114 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs110, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1114 & 896) | (i3 & 7168), i1114 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1115 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs111, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1115 & 896) | (i3 & 7168), i1115 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str14 = str3;
                final float f15 = fM6097constructorimpl;
                final long j17 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1116) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str14, f15, f4, j5, j17, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs112 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i1116 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs112, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1116 & 896) | (i3 & 7168), i1116 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            } else {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs113 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i1117 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs113, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1117 & 896) | (i3 & 7168), i1117 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str15 = str3;
            final float f16 = fM6097constructorimpl;
            final long j18 = themeColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i1118) {
                    ButtonViewKt.m6814LinkButtoniPolEAI(str15, f16, f4, j5, j18, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        fM6097constructorimpl2 = f3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
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
                if (composerStartRestartGroup.changed(j2)) {
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
                if (composerStartRestartGroup.changed(j3)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs114 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1118 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs114, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1118 & 896) | (i3 & 7168), i1118 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                } else {
                    if (i13 != 0) {
                        str2 = "确定";
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(60);
                    }
                    if (i4 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                    }
                    if (i6 != 0) {
                        sp = TextUnitKt.getSp(13);
                    } else {
                        sp = j4;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j2;
                    }
                    if (i10 != 0) {
                        jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                    } else {
                        jM3792getWhite0d7_KjU = j3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                    }
                    Modifier modifierM6957radius3ABfNKs115 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    int i1119 = i3 >> 9;
                    TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs115, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i1119 & 896) | (i3 & 7168), i1119 & 14, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    f4 = fM6097constructorimpl2;
                    j6 = jM3792getWhite0d7_KjU;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str16 = str3;
                final float f17 = fM6097constructorimpl;
                final long j19 = themeColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11110) {
                        ButtonViewKt.m6814LinkButtoniPolEAI(str16, f17, f4, j5, j19, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 1572864;
            i3 |= i12;
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs116 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i11110 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs116, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11110 & 896) | (i3 & 7168), i11110 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            } else {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs117 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i11111 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs117, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11111 & 896) | (i3 & 7168), i11111 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str17 = str3;
            final float f18 = fM6097constructorimpl;
            final long j110 = themeColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11112) {
                    ButtonViewKt.m6814LinkButtoniPolEAI(str17, f18, f4, j5, j110, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        j4 = j;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(j2)) {
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
            if (composerStartRestartGroup.changed(j3)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
            }
            if ((i3 & 2995931) == 599186) {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs118 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i11112 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs118, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11112 & 896) | (i3 & 7168), i11112 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            } else {
                if (i13 != 0) {
                    str2 = "确定";
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(60);
                }
                if (i4 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
                }
                if (i6 != 0) {
                    sp = TextUnitKt.getSp(13);
                } else {
                    sp = j4;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j2;
                }
                if (i10 != 0) {
                    jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
                } else {
                    jM3792getWhite0d7_KjU = j3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
                }
                Modifier modifierM6957radius3ABfNKs119 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                int i11113 = i3 >> 9;
                TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs119, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11113 & 896) | (i3 & 7168), i11113 & 14, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                f4 = fM6097constructorimpl2;
                j6 = jM3792getWhite0d7_KjU;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str18 = str3;
            final float f19 = fM6097constructorimpl;
            final long j111 = themeColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11114) {
                    ButtonViewKt.m6814LinkButtoniPolEAI(str18, f19, f4, j5, j111, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i12 = 1572864;
        i3 |= i12;
        if ((i3 & 2995931) == 599186) {
            if (i13 != 0) {
                str2 = "确定";
            } else {
                str2 = str;
            }
            if (i14 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(60);
            }
            if (i4 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
            }
            if (i6 != 0) {
                sp = TextUnitKt.getSp(13);
            } else {
                sp = j4;
            }
            if (i8 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j2;
            }
            if (i10 != 0) {
                jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
            } else {
                jM3792getWhite0d7_KjU = j3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
            }
            Modifier modifierM6957radius3ABfNKs1110 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
            int i11114 = i3 >> 9;
            TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1110, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11114 & 896) | (i3 & 7168), i11114 & 14, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            f4 = fM6097constructorimpl2;
            j6 = jM3792getWhite0d7_KjU;
            str3 = str2;
        } else {
            if (i13 != 0) {
                str2 = "确定";
            } else {
                str2 = str;
            }
            if (i14 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(60);
            }
            if (i4 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(25);
            }
            if (i6 != 0) {
                sp = TextUnitKt.getSp(13);
            } else {
                sp = j4;
            }
            if (i8 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j2;
            }
            if (i10 != 0) {
                jM3792getWhite0d7_KjU = Color.INSTANCE.m3792getWhite0d7_KjU();
            } else {
                jM3792getWhite0d7_KjU = j3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324613139, i3, -1, "cn.jianyun.workplan.ui.component.form.LinkButton (ButtonView.kt:37)");
            }
            Modifier modifierM6957radius3ABfNKs1111 = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$1$1
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
            int i11115 = i3 >> 9;
            TextKt.m2471Text4IGK_g(str2, SizeKt.wrapContentWidth$default(SizeKt.wrapContentHeight$default(BackgroundKt.m214backgroundbw27NRU$default(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1111, false, null, null, (Function0) objRememberedValue, 7, null), fM6097constructorimpl), fM6097constructorimpl2), themeColor, null, 2, null), null, false, 3, null), null, false, 3, null), jM3792getWhite0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | (i11115 & 896) | (i3 & 7168), i11115 & 14, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            f4 = fM6097constructorimpl2;
            j6 = jM3792getWhite0d7_KjU;
            str3 = str2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str19 = str3;
        final float f110 = fM6097constructorimpl;
        final long j112 = themeColor;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LinkButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11116) {
                ButtonViewKt.m6814LinkButtoniPolEAI(str19, f110, f4, j5, j112, j6, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void LongOkButton(String str, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-420555032);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LongOkButton)P(1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        final int i5 = i3;
        if ((i5 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            String str3 = i4 != 0 ? "确定" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-420555032, i5, -1, "cn.jianyun.workplan.ui.component.form.LongOkButton (ButtonView.kt:46)");
            }
            final String str4 = str3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(action, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -102354216, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongOkButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i6 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-102354216, i6, -1, "cn.jianyun.workplan.ui.component.form.LongOkButton.<anonymous> (ButtonView.kt:51)");
                    }
                    TextKt.m2471Text4IGK_g(str4, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i5 >> 3) & 14) | 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongOkButton.2
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
                ButtonViewKt.LongOkButton(str2, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void LongPrivateButton(String str, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(1712339957);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LongPrivateButton)P(1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        final int i5 = i3;
        if ((i5 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            String str3 = i4 != 0 ? "确定" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1712339957, i5, -1, "cn.jianyun.workplan.ui.component.form.LongPrivateButton (ButtonView.kt:59)");
            }
            final String str4 = str3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(action, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getPrivateColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2013582853, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongPrivateButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i6 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2013582853, i6, -1, "cn.jianyun.workplan.ui.component.form.LongPrivateButton.<anonymous> (ButtonView.kt:64)");
                    }
                    TextKt.m2471Text4IGK_g(str4, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i5 >> 3) & 14) | 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongPrivateButton.2
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
                ButtonViewKt.LongPrivateButton(str2, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void LongVipButton(String str, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1938399333);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LongVipButton)P(1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        final int i5 = i3;
        if ((i5 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            String str3 = i4 != 0 ? "确定" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1938399333, i5, -1, "cn.jianyun.workplan.ui.component.form.LongVipButton (ButtonView.kt:71)");
            }
            final String str4 = str3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(action, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getVipColor(), Color.INSTANCE.m3781getBlack0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -664108629, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongVipButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i6 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-664108629, i6, -1, "cn.jianyun.workplan.ui.component.form.LongVipButton.<anonymous> (ButtonView.kt:76)");
                    }
                    TextKt.m2471Text4IGK_g(str4, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i5 >> 3) & 14) | 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongVipButton.2
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
                ButtonViewKt.LongVipButton(str2, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: LongCancelButton-vHmCa5Y, reason: not valid java name */
    public static final void m6815LongCancelButtonvHmCa5Y(String str, float f2, long j, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        float f3;
        int i4;
        long j2;
        int i5;
        int i6;
        final int i7;
        String str3;
        float f4;
        long jM6299getUnspecifiedXSAIIZE;
        final long j3;
        final String str4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-364508879);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LongCancelButton)P(3,2,1:c#ui.unit.TextUnit)");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        str3 = "取消";
                    } else {
                        str3 = str2;
                    }
                    if (i9 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f3;
                    }
                    if (i4 != 0) {
                        jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                    } else {
                        jM6299getUnspecifiedXSAIIZE = j2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
                    }
                    final long j4 = jM6299getUnspecifiedXSAIIZE;
                    float f6 = f4;
                    final String str5 = str3;
                    ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer2, int i10) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i10 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                            }
                            Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                            String str6 = str5;
                            long j5 = j4;
                            int i11 = i7;
                            TextKt.m2471Text4IGK_g(str6, modifierM569paddingVpY3zN4$default, 0L, j5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    str4 = str5;
                    f5 = f6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str4 = str2;
                    f5 = f3;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        ButtonViewKt.m6815LongCancelButtonvHmCa5Y(str4, f5, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j2 = j;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f3;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
                }
                final long j5 = jM6299getUnspecifiedXSAIIZE;
                float f7 = f4;
                final String str6 = str3;
                ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                        String str7 = str6;
                        long j6 = j5;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str7, modifierM569paddingVpY3zN4$default, 0L, j6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j5;
                str4 = str6;
                f5 = f7;
            } else {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f3;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
                }
                final long j6 = jM6299getUnspecifiedXSAIIZE;
                float f8 = f4;
                final String str7 = str3;
                ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                        String str8 = str7;
                        long j7 = j6;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str8, modifierM569paddingVpY3zN4$default, 0L, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j6;
                str4 = str7;
                f5 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ButtonViewKt.m6815LongCancelButtonvHmCa5Y(str4, f5, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f3 = f2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f3;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
                }
                final long j7 = jM6299getUnspecifiedXSAIIZE;
                float f9 = f4;
                final String str8 = str3;
                ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                        String str9 = str8;
                        long j8 = j7;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str9, modifierM569paddingVpY3zN4$default, 0L, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j7;
                str4 = str8;
                f5 = f9;
            } else {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f3;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
                }
                final long j8 = jM6299getUnspecifiedXSAIIZE;
                float f10 = f4;
                final String str9 = str3;
                ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                        String str10 = str9;
                        long j9 = j8;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str10, modifierM569paddingVpY3zN4$default, 0L, j9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j8;
                str4 = str9;
                f5 = f10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ButtonViewKt.m6815LongCancelButtonvHmCa5Y(str4, f5, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j2 = j;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(action)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if (i4 != 0) {
                jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
            } else {
                jM6299getUnspecifiedXSAIIZE = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
            }
            final long j9 = jM6299getUnspecifiedXSAIIZE;
            float f11 = f4;
            final String str10 = str3;
            ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i10 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                    }
                    Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                    String str11 = str10;
                    long j10 = j9;
                    int i11 = i7;
                    TextKt.m2471Text4IGK_g(str11, modifierM569paddingVpY3zN4$default, 0L, j10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j9;
            str4 = str10;
            f5 = f11;
        } else {
            if (i8 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if (i4 != 0) {
                jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
            } else {
                jM6299getUnspecifiedXSAIIZE = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364508879, i7, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton (ButtonView.kt:84)");
            }
            final long j10 = jM6299getUnspecifiedXSAIIZE;
            float f12 = f4;
            final String str11 = str3;
            ButtonKt.Button(action, SizeKt.fillMaxWidth(Modifier.INSTANCE, f4), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 484165441, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i10 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(484165441, i10, -1, "cn.jianyun.workplan.ui.component.form.LongCancelButton.<anonymous> (ButtonView.kt:88)");
                    }
                    Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null);
                    String str12 = str11;
                    long j11 = j10;
                    int i11 = i7;
                    TextKt.m2471Text4IGK_g(str12, modifierM569paddingVpY3zN4$default, 0L, j11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j10;
            str4 = str11;
            f5 = f12;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$LongCancelButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                ButtonViewKt.m6815LongCancelButtonvHmCa5Y(str4, f5, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: CancelButton-vHmCa5Y, reason: not valid java name */
    public static final void m6813CancelButtonvHmCa5Y(String str, Modifier modifier, long j, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int i5;
        int i6;
        final int i7;
        String str3;
        Modifier modifier3;
        long jM6299getUnspecifiedXSAIIZE;
        final long j3;
        final String str4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1780017088);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CancelButton)P(2,3,1:c#ui.unit.TextUnit)");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(action)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        str3 = "取消";
                    } else {
                        str3 = str2;
                    }
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                    } else {
                        jM6299getUnspecifiedXSAIIZE = j2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
                    }
                    final long j4 = jM6299getUnspecifiedXSAIIZE;
                    Modifier modifier5 = modifier3;
                    final String str5 = str3;
                    ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer2, int i10) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i10 & 81) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                            }
                            Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                            String str6 = str5;
                            long j5 = j4;
                            int i11 = i7;
                            TextKt.m2471Text4IGK_g(str6, modifierM569paddingVpY3zN4$default, 0L, j5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    str4 = str5;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    str4 = str2;
                    modifier4 = modifier2;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        ButtonViewKt.m6813CancelButtonvHmCa5Y(str4, modifier4, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j2 = j;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
                }
                final long j5 = jM6299getUnspecifiedXSAIIZE;
                Modifier modifier6 = modifier3;
                final String str6 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                        String str7 = str6;
                        long j6 = j5;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str7, modifierM569paddingVpY3zN4$default, 0L, j6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j5;
                str4 = str6;
                modifier4 = modifier6;
            } else {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
                }
                final long j6 = jM6299getUnspecifiedXSAIIZE;
                Modifier modifier7 = modifier3;
                final String str7 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                        String str8 = str7;
                        long j7 = j6;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str8, modifierM569paddingVpY3zN4$default, 0L, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j6;
                str4 = str7;
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ButtonViewKt.m6813CancelButtonvHmCa5Y(str4, modifier4, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
                }
                final long j7 = jM6299getUnspecifiedXSAIIZE;
                Modifier modifier8 = modifier3;
                final String str8 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                        String str9 = str8;
                        long j8 = j7;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str9, modifierM569paddingVpY3zN4$default, 0L, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j7;
                str4 = str8;
                modifier4 = modifier8;
            } else {
                if (i8 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
                } else {
                    jM6299getUnspecifiedXSAIIZE = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
                }
                final long j8 = jM6299getUnspecifiedXSAIIZE;
                Modifier modifier9 = modifier3;
                final String str9 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i10) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i10 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                        String str10 = str9;
                        long j9 = j8;
                        int i11 = i7;
                        TextKt.m2471Text4IGK_g(str10, modifierM569paddingVpY3zN4$default, 0L, j9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j8;
                str4 = str9;
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    ButtonViewKt.m6813CancelButtonvHmCa5Y(str4, modifier4, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j2 = j;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(action)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
            } else {
                jM6299getUnspecifiedXSAIIZE = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
            }
            final long j9 = jM6299getUnspecifiedXSAIIZE;
            Modifier modifier10 = modifier3;
            final String str10 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i10 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                    }
                    Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                    String str11 = str10;
                    long j10 = j9;
                    int i11 = i7;
                    TextKt.m2471Text4IGK_g(str11, modifierM569paddingVpY3zN4$default, 0L, j10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j9;
            str4 = str10;
            modifier4 = modifier10;
        } else {
            if (i8 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                jM6299getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6299getUnspecifiedXSAIIZE();
            } else {
                jM6299getUnspecifiedXSAIIZE = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1780017088, i7, -1, "cn.jianyun.workplan.ui.component.form.CancelButton (ButtonView.kt:94)");
            }
            final long j10 = jM6299getUnspecifiedXSAIIZE;
            Modifier modifier11 = modifier3;
            final String str11 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurface(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSecondary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -644261840, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i10) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i10 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-644261840, i10, -1, "cn.jianyun.workplan.ui.component.form.CancelButton.<anonymous> (ButtonView.kt:98)");
                    }
                    Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null);
                    String str12 = str11;
                    long j11 = j10;
                    int i11 = i7;
                    TextKt.m2471Text4IGK_g(str12, modifierM569paddingVpY3zN4$default, 0L, j11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | 48 | ((i11 << 3) & 7168), 0, 131060);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i7 >> 9) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j10;
            str4 = str11;
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$CancelButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                ButtonViewKt.m6813CancelButtonvHmCa5Y(str4, modifier4, j3, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void Cancel2Button(String str, Modifier modifier, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int i4;
        final int i5;
        String str3;
        Modifier modifier3;
        final String str4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-186450995);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Cancel2Button)P(1,2)");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    str3 = "取消";
                } else {
                    str3 = str2;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-186450995, i5, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button (ButtonView.kt:103)");
                }
                Modifier modifier5 = modifier3;
                final String str5 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -519296067, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.Cancel2Button.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i8 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-519296067, i8, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button.<anonymous> (ButtonView.kt:107)");
                        }
                        TextKt.m2471Text4IGK_g(str5, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str5;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str4 = str2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.Cancel2Button.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ButtonViewKt.Cancel2Button(str4, modifier4, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(action)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186450995, i5, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button (ButtonView.kt:103)");
            }
            Modifier modifier6 = modifier3;
            final String str6 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -519296067, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.Cancel2Button.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i8 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-519296067, i8, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button.<anonymous> (ButtonView.kt:107)");
                    }
                    TextKt.m2471Text4IGK_g(str6, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str6;
            modifier4 = modifier6;
        } else {
            if (i6 != 0) {
                str3 = "取消";
            } else {
                str3 = str2;
            }
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186450995, i5, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button (ButtonView.kt:103)");
            }
            Modifier modifier7 = modifier3;
            final String str7 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -519296067, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.Cancel2Button.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i8 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-519296067, i8, -1, "cn.jianyun.workplan.ui.component.form.Cancel2Button.<anonymous> (ButtonView.kt:107)");
                    }
                    TextKt.m2471Text4IGK_g(str7, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str7;
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.Cancel2Button.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ButtonViewKt.Cancel2Button(str4, modifier4, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void OkButton(String str, Modifier modifier, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int i4;
        final int i5;
        String str3;
        Modifier modifier3;
        final String str4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(655254093);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OkButton)P(1,2)");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    str3 = "确认";
                } else {
                    str3 = str2;
                }
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(655254093, i5, -1, "cn.jianyun.workplan.ui.component.form.OkButton (ButtonView.kt:114)");
                }
                Modifier modifier5 = modifier3;
                final String str5 = str3;
                ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956496989, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.OkButton.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i8 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(956496989, i8, -1, "cn.jianyun.workplan.ui.component.form.OkButton.<anonymous> (ButtonView.kt:118)");
                        }
                        TextKt.m2471Text4IGK_g(str5, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str5;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str4 = str2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.OkButton.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ButtonViewKt.OkButton(str4, modifier4, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(action)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                str3 = "确认";
            } else {
                str3 = str2;
            }
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(655254093, i5, -1, "cn.jianyun.workplan.ui.component.form.OkButton (ButtonView.kt:114)");
            }
            Modifier modifier6 = modifier3;
            final String str6 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956496989, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.OkButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i8 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(956496989, i8, -1, "cn.jianyun.workplan.ui.component.form.OkButton.<anonymous> (ButtonView.kt:118)");
                    }
                    TextKt.m2471Text4IGK_g(str6, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str6;
            modifier4 = modifier6;
        } else {
            if (i6 != 0) {
                str3 = "确认";
            } else {
                str3 = str2;
            }
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(655254093, i5, -1, "cn.jianyun.workplan.ui.component.form.OkButton (ButtonView.kt:114)");
            }
            Modifier modifier7 = modifier3;
            final String str7 = str3;
            ButtonKt.Button(action, Modifier.INSTANCE.then(modifier3), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 956496989, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.OkButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i8 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(956496989, i8, -1, "cn.jianyun.workplan.ui.component.form.OkButton.<anonymous> (ButtonView.kt:118)");
                    }
                    TextKt.m2471Text4IGK_g(str7, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(3), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i5 >> 6) & 14) | 805306368, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str7;
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.OkButton.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ButtonViewKt.OkButton(str4, modifier4, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void LongDeleteButton(String str, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(1189659385);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LongDeleteButton)P(1)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        final int i5 = i3;
        if ((i5 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            String str3 = i4 != 0 ? "删除" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1189659385, i5, -1, "cn.jianyun.workplan.ui.component.form.LongDeleteButton (ButtonView.kt:125)");
            }
            final String str4 = str3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(action, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getError(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 48, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 368092905, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongDeleteButton.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i6 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(368092905, i6, -1, "cn.jianyun.workplan.ui.component.form.LongDeleteButton.<anonymous> (ButtonView.kt:130)");
                    }
                    TextKt.m2471Text4IGK_g(str4, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i5 & 14) | 48, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i5 >> 3) & 14) | 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.LongDeleteButton.2
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
                ButtonViewKt.LongDeleteButton(str2, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x0289  */
    /* JADX WARN: Code duplicated, block: B:78:0x0297  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void DeleteOrHideButton(String str, String str2, final Function0<Unit> hideAction, final Function0<Unit> deleteAction, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        int i5;
        final int i6;
        String str5;
        String str6;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final String str7;
        final String str8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hideAction, "hideAction");
        Intrinsics.checkNotNullParameter(deleteAction, "deleteAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(348064199);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DeleteOrHideButton)P(3,1,2)");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(hideAction)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(deleteAction)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    str5 = "隐藏";
                } else {
                    str5 = str3;
                }
                if (i8 != 0) {
                    str6 = "删除";
                } else {
                    str6 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(348064199, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton (ButtonView.kt:138)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f2 = 12;
                final String str9 = str6;
                final String str10 = str5;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(hideAction, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f2)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getPrimaryColor(), 0L, 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -1018513421, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i9 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1018513421, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:143)");
                        }
                        TextKt.m2471Text4IGK_g(str10, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i6 & 14) | 432, 0, 131064);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, ((i6 >> 6) & 14) | 805306368, 484);
                SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
                ButtonKt.Button(deleteAction, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f2)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getDeleteColor(), 0L, 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -327960996, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i9 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-327960996, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:150)");
                        }
                        TextKt.m2471Text4IGK_g(str9, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i6 >> 3) & 14) | 432, 0, 131064);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, ((i6 >> 9) & 14) | 805306368, 484);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str7 = str10;
                str8 = str9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str7 = str3;
                str8 = str4;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.DeleteOrHideButton.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    ButtonViewKt.DeleteOrHideButton(str7, str8, hideAction, deleteAction, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        str4 = str2;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(hideAction)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(deleteAction)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        i6 = i3;
        if ((i6 & 5851) == 1170) {
            if (i7 != 0) {
                str5 = "隐藏";
            } else {
                str5 = str3;
            }
            if (i8 != 0) {
                str6 = "删除";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348064199, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton (ButtonView.kt:138)");
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            float f3 = 12;
            final String str11 = str6;
            final String str12 = str5;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(hideAction, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f3)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getPrimaryColor(), 0L, 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -1018513421, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i9) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i9 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1018513421, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:143)");
                    }
                    TextKt.m2471Text4IGK_g(str12, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i6 & 14) | 432, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i6 >> 6) & 14) | 805306368, 484);
            SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
            ButtonKt.Button(deleteAction, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f3)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getDeleteColor(), 0L, 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -327960996, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i9) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i9 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-327960996, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:150)");
                    }
                    TextKt.m2471Text4IGK_g(str11, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i6 >> 3) & 14) | 432, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i6 >> 9) & 14) | 805306368, 484);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str7 = str12;
            str8 = str11;
        } else {
            if (i7 != 0) {
                str5 = "隐藏";
            } else {
                str5 = str3;
            }
            if (i8 != 0) {
                str6 = "删除";
            } else {
                str6 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348064199, i6, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton (ButtonView.kt:138)");
            }
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
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
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            float f4 = 12;
            final String str13 = str6;
            final String str14 = str5;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(hideAction, rowScopeInstance3.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f4)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getPrimaryColor(), 0L, 0L, 0L, composerStartRestartGroup, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -1018513421, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i9) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i9 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1018513421, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:143)");
                    }
                    TextKt.m2471Text4IGK_g(str14, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i6 & 14) | 432, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i6 >> 6) & 14) | 805306368, 484);
            SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
            ButtonKt.Button(deleteAction, rowScopeInstance3.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f4)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getDeleteColor(), 0L, 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -327960996, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$DeleteOrHideButton$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i9) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i9 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-327960996, i9, -1, "cn.jianyun.workplan.ui.component.form.DeleteOrHideButton.<anonymous>.<anonymous> (ButtonView.kt:150)");
                    }
                    TextKt.m2471Text4IGK_g(str13, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(5), 1, null), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i6 >> 3) & 14) | 432, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i6 >> 9) & 14) | 805306368, 484);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str7 = str14;
            str8 = str13;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt.DeleteOrHideButton.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i9) {
                ButtonViewKt.DeleteOrHideButton(str7, str8, hideAction, deleteAction, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0308  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:96:0x019d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f7  */
    /* JADX INFO: renamed from: OkAndCancelButtonGroup-1yyLQnY, reason: not valid java name */
    public static final void m6816OkAndCancelButtonGroup1yyLQnY(String str, String str2, float f2, float f3, final Function0<Unit> okAction, final Function0<Unit> cancelAction, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        float fM6097constructorimpl;
        int i5;
        int i6;
        float fM6097constructorimpl2;
        int i7;
        int i8;
        int i9;
        final int i10;
        String str5;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final String str6;
        final String str7;
        final float f4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(okAction, "okAction");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-59100899);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OkAndCancelButtonGroup)P(4,1,5:c#ui.unit.Dp,2:c#ui.unit.Dp,3)");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 112) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    fM6097constructorimpl = f2;
                    if (composerStartRestartGroup.changed(fM6097constructorimpl)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        fM6097constructorimpl2 = f3;
                        if (composerStartRestartGroup.changed(fM6097constructorimpl2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(okAction)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(cancelAction)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                        }
                        i10 = i3;
                        if ((374491 & i10) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i11 != 0) {
                                str5 = "确定";
                            } else {
                                str5 = str3;
                            }
                            if (i12 != 0) {
                                str4 = "取消";
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-59100899, i10, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup (ButtonView.kt:158)");
                            }
                            Modifier modifierM569paddingVpY3zN4$default = PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m567padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fM6097constructorimpl), fM6097constructorimpl2, 0.0f, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                            composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            float f6 = 12;
                            final String str8 = str5;
                            final String str9 = str4;
                            float f7 = fM6097constructorimpl;
                            float f8 = fM6097constructorimpl2;
                            composer2 = composerStartRestartGroup;
                            ButtonKt.Button(cancelAction, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f6)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 1108547657, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i13) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1108547657, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:163)");
                                    }
                                    TextKt.m2471Text4IGK_g(str9, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i10 >> 3) & 14) | 48, 0, 131064);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, ((i10 >> 15) & 14) | 805306368, 484);
                            SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
                            ButtonKt.Button(okAction, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f6)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 342091634, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i13) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(342091634, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:170)");
                                    }
                                    TextKt.m2471Text4IGK_g(str8, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i10 & 14) | 48, 0, 131068);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, ((i10 >> 12) & 14) | 805306368, 484);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str6 = str8;
                            str7 = str9;
                            f4 = f7;
                            f5 = f8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            str6 = str3;
                            str7 = str4;
                            f4 = fM6097constructorimpl;
                            f5 = fM6097constructorimpl2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i13) {
                                ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY(str6, str7, f4, f5, okAction, cancelAction, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i9 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i9;
                    i10 = i3;
                    if ((374491 & i10) == 74898) {
                        if (i11 != 0) {
                            str5 = "确定";
                        } else {
                            str5 = str3;
                        }
                        if (i12 != 0) {
                            str4 = "取消";
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-59100899, i10, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup (ButtonView.kt:158)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default2 = PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m567padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fM6097constructorimpl), fM6097constructorimpl2, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default2);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        float f9 = 12;
                        final String str10 = str5;
                        final String str11 = str4;
                        float f10 = fM6097constructorimpl;
                        float f11 = fM6097constructorimpl2;
                        composer2 = composerStartRestartGroup;
                        ButtonKt.Button(cancelAction, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f9)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 1108547657, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1108547657, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:163)");
                                }
                                TextKt.m2471Text4IGK_g(str11, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i10 >> 3) & 14) | 48, 0, 131064);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i10 >> 15) & 14) | 805306368, 484);
                        SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
                        ButtonKt.Button(okAction, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f9)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 342091634, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(342091634, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:170)");
                                }
                                TextKt.m2471Text4IGK_g(str10, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i10 & 14) | 48, 0, 131068);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i10 >> 12) & 14) | 805306368, 484);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str10;
                        str7 = str11;
                        f4 = f10;
                        f5 = f11;
                    } else {
                        if (i11 != 0) {
                            str5 = "确定";
                        } else {
                            str5 = str3;
                        }
                        if (i12 != 0) {
                            str4 = "取消";
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-59100899, i10, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup (ButtonView.kt:158)");
                        }
                        Modifier modifierM569paddingVpY3zN4$default3 = PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m567padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fM6097constructorimpl), fM6097constructorimpl2, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM569paddingVpY3zN4$default3);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        float f12 = 12;
                        final String str12 = str5;
                        final String str13 = str4;
                        float f13 = fM6097constructorimpl;
                        float f14 = fM6097constructorimpl2;
                        composer2 = composerStartRestartGroup;
                        ButtonKt.Button(cancelAction, rowScopeInstance3.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable | 0).getPrimary(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable | 0) << 12, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 1108547657, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1108547657, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:163)");
                                }
                                TextKt.m2471Text4IGK_g(str13, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i10 >> 3) & 14) | 48, 0, 131064);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i10 >> 15) & 14) | 805306368, 484);
                        SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), composer2, 6);
                        ButtonKt.Button(okAction, rowScopeInstance3.weight(Modifier.INSTANCE, 1.0f, true), false, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(Dp.m6097constructorimpl(f12)), ButtonDefaults.INSTANCE.m1612buttonColorsro_MJ88(ColorKt.getThemeColor(), Color.INSTANCE.m3792getWhite0d7_KjU(), 0L, 0L, composer2, ((ButtonDefaults.$stable | 0) << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 342091634, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i13) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(342091634, i13, -1, "cn.jianyun.workplan.ui.component.form.OkAndCancelButtonGroup.<anonymous>.<anonymous> (ButtonView.kt:170)");
                                }
                                TextKt.m2471Text4IGK_g(str12, PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(2), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i10 & 14) | 48, 0, 131068);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, ((i10 >> 12) & 14) | 805306368, 484);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str12;
                        str7 = str13;
                        f4 = f13;
                        f5 = f14;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.form.ButtonViewKt$OkAndCancelButtonGroup$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i13) {
                            ButtonViewKt.m6816OkAndCancelButtonGroup1yyLQnY(str6, str7, f4, f5, okAction, cancelAction, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                fM6097constructorimpl2 = f3;
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(okAction)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i2 & 32) != 0) {
              

... [truncated: exceeds 400000 bytes, total 786608 bytes]