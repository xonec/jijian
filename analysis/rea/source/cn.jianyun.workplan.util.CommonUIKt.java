package cn.jianyun.workplan.util;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.CornerRadiusKt;
import androidx.glance.layout.RowKt;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.unit.ColorProviderKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.main.RouterKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: CommonUI.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u001f\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001aF\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\"¢\u0006\u0002\b#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aZ\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\"¢\u0006\u0002\b#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aF\u0010&\u001a\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\"¢\u0006\u0002\b#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010%\u001a?\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aM\u00108\u001a\u00020\u00142\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00109\u001a\u00020:2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a?\u0010=\u001a\u00020\u00142\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020:2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aM\u0010A\u001a\u00020\u00142\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00109\u001a\u00020:2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010<\u001a\"\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u001a\u000e\u0010I\u001a\u00020\u00142\u0006\u0010D\u001a\u00020E\u001a#\u0010J\u001a\u00020K*\u00020K2\b\b\u0002\u0010L\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\u00020K*\u00020K2\b\b\u0002\u0010P\u001a\u00020\u00012\b\b\u0002\u0010>\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a-\u0010O\u001a\u00020 *\u00020 2\b\b\u0002\u0010P\u001a\u00020\u00012\b\b\u0002\u0010S\u001a\u00020TH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a#\u0010P\u001a\u00020K*\u00020K2\b\b\u0002\u0010P\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010N\u001a#\u0010P\u001a\u00020 *\u00020 2\b\b\u0002\u0010P\u001a\u00020\u0001H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010Y\u001a\u00020K*\u00020KH\u0007¢\u0006\u0002\u0010Z\"\u0016\u0010\u0000\u001a\u00020\u0001ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"BORDER_RADIUS", "Landroidx/compose/ui/unit/Dp;", "getBORDER_RADIUS", "()F", "F", "VERTICAL_GAP", "getVERTICAL_GAP", "nextPage", "", "getNextPage", "()Ljava/lang/String;", "setNextPage", "(Ljava/lang/String;)V", "nextTime", "", "getNextTime", "()J", "setNextTime", "(J)V", "BigBlank", "", "size", "BigBlank-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "Blank", "Blank-kHDZbjc", "GlanceBlank", "GlanceBlank-kHDZbjc", "GlanceOffsetView", "x", "y", "modifier", "Landroidx/glance/GlanceModifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "GlanceOffsetView-pBklqvs", "(FFLandroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "GlancePaddingView", "start", "top", "end", "bottom", "GlancePaddingView-5-DNhBc", "(FFFFLandroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "horizontal", "vertical", "GlancePaddingView-pBklqvs", "GrayLinkText", "label", "padding", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "action", "GrayLinkText-53ZIcWk", "(Ljava/lang/String;FJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LinkText", "color", "Landroidx/compose/ui/graphics/Color;", "LinkText-hf-I1UA", "(Ljava/lang/String;FJJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SmallButton", "bg", "SmallButton--PLvOf0", "(Ljava/lang/String;JJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "WarnText", "WarnText-hf-I1UA", "toPage", "navHostController", "Landroidx/navigation/NavHostController;", "newPage", "bundle", "Landroid/os/Bundle;", "toVipPage", "bottomGap", "Landroidx/compose/ui/Modifier;", "gap", "bottomGap-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "mainBg", "radius", "mainBg-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "opacity", "", "mainBg-uFdPcIQ", "(Landroidx/glance/GlanceModifier;FFLandroidx/compose/runtime/Composer;II)Landroidx/glance/GlanceModifier;", "radius-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "test", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CommonUIKt {
    private static long nextTime;
    private static final float VERTICAL_GAP = Dp.m6097constructorimpl(15);
    private static final float BORDER_RADIUS = Dp.m6097constructorimpl(12);
    private static String nextPage = "";

    public static final float getVERTICAL_GAP() {
        return VERTICAL_GAP;
    }

    public static final float getBORDER_RADIUS() {
        return BORDER_RADIUS;
    }

    /* JADX INFO: renamed from: bottomGap-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m6954bottomGap3ABfNKs$default(Modifier modifier, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = VERTICAL_GAP;
        }
        return m6953bottomGap3ABfNKs(modifier, f2);
    }

    /* JADX INFO: renamed from: bottomGap-3ABfNKs, reason: not valid java name */
    public static final Modifier m6953bottomGap3ABfNKs(Modifier bottomGap, float f2) {
        Intrinsics.checkNotNullParameter(bottomGap, "$this$bottomGap");
        return bottomGap.then(PaddingKt.m571paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f2, 7, null));
    }

    /* JADX INFO: renamed from: radius-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m6959radius3ABfNKs$default(Modifier modifier, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = BORDER_RADIUS;
        }
        return m6957radius3ABfNKs(modifier, f2);
    }

    /* JADX INFO: renamed from: radius-3ABfNKs, reason: not valid java name */
    public static final Modifier m6957radius3ABfNKs(Modifier radius, float f2) {
        Intrinsics.checkNotNullParameter(radius, "$this$radius");
        return radius.then(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m838RoundedCornerShape0680j_4(f2)));
    }

    /* JADX INFO: renamed from: radius-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m6960radius3ABfNKs$default(GlanceModifier glanceModifier, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = BORDER_RADIUS;
        }
        return m6958radius3ABfNKs(glanceModifier, f2);
    }

    /* JADX INFO: renamed from: radius-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m6958radius3ABfNKs(GlanceModifier radius, float f2) {
        Intrinsics.checkNotNullParameter(radius, "$this$radius");
        return radius.then(CornerRadiusKt.m6438cornerRadius3ABfNKs(GlanceModifier.INSTANCE, f2));
    }

    /* JADX INFO: renamed from: mainBg-9IZ8Weo, reason: not valid java name */
    public static final Modifier m6955mainBg9IZ8Weo(Modifier mainBg, float f2, long j, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(mainBg, "$this$mainBg");
        composer.startReplaceableGroup(1400564631);
        ComposerKt.sourceInformation(composer, "C(mainBg)P(1:c#ui.unit.Dp,0:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            f2 = BORDER_RADIUS;
        }
        if ((i2 & 2) != 0) {
            j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getSurface();
        }
        long j2 = j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400564631, i, -1, "cn.jianyun.workplan.util.mainBg (CommonUI.kt:59)");
        }
        Modifier modifierThen = mainBg.then(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(Modifier.INSTANCE, f2), j2, null, 2, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    /* JADX INFO: renamed from: mainBg-uFdPcIQ, reason: not valid java name */
    public static final GlanceModifier m6956mainBguFdPcIQ(GlanceModifier mainBg, float f2, float f3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(mainBg, "$this$mainBg");
        composer.startReplaceableGroup(1806412670);
        ComposerKt.sourceInformation(composer, "C(mainBg)P(1:c#ui.unit.Dp)");
        if ((i2 & 1) != 0) {
            f2 = BORDER_RADIUS;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806412670, i, -1, "cn.jianyun.workplan.util.mainBg (CommonUI.kt:67)");
        }
        GlanceModifier glanceModifierThen = mainBg.then(androidx.glance.BackgroundKt.background(CornerRadiusKt.m6438cornerRadius3ABfNKs(GlanceModifier.INSTANCE, f2), ColorProviderKt.m6643ColorProvider8_81llA(Color.m3754copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getSurface(), f4, 0.0f, 0.0f, 0.0f, 14, null))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return glanceModifierThen;
    }

    public static final Modifier test(Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceableGroup(-1089020114);
        ComposerKt.sourceInformation(composer, "C(test)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1089020114, i, -1, "cn.jianyun.workplan.util.test (CommonUI.kt:74)");
        }
        Modifier modifierThen = modifier.then(BackgroundKt.m214backgroundbw27NRU$default(Modifier.INSTANCE, CommonToolKt.randomColor$default(0, 1, null), null, 2, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x018b  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00bc, please report this as an issue */
    /* JADX INFO: renamed from: LinkText-hf-I1UA, reason: not valid java name */
    public static final void m6950LinkTexthfI1UA(final String label, float f2, long j, long j2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        final Function0<Unit> function1;
        int i9;
        float fM6097constructorimpl;
        long sp;
        long themeColor;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final long j5;
        final long j6;
        final Function0<Unit> function2;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1720504572);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinkText)P(3,4:c#ui.unit.Dp,2:c#ui.unit.TextUnit,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            function1 = function0;
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                            if (i10 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f3;
                            }
                            if (i4 != 0) {
                                sp = TextUnitKt.getSp(15);
                            } else {
                                sp = j3;
                            }
                            if (i6 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            } else {
                                themeColor = j4;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                            }
                            Modifier modifierM6957radius3ABfNKs = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                            boolean z = function1 != null;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(function1);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                        Function0<Unit> function3 = function1;
                                        if (function3 != null) {
                                            function3.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i11 = i3;
                            Function0<Unit> function3 = function1;
                            composer2 = composerStartRestartGroup;
                            float f5 = fM6097constructorimpl;
                            TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 << 3) & 7168), 0, 131056);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j5 = sp;
                            j6 = themeColor;
                            function2 = function3;
                            f4 = f5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            f4 = f3;
                            j5 = j3;
                            j6 = j4;
                            function2 = function1;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    function1 = function0;
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs2 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function4 = function1;
                                    if (function4 != null) {
                                        function4.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function4 = function1;
                                    if (function4 != null) {
                                        function4.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i12 = i3;
                        Function0<Unit> function4 = function1;
                        composer2 = composerStartRestartGroup;
                        float f6 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs2, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i12 & 14) | ((i12 >> 3) & 896) | ((i12 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function4;
                        f4 = f6;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs3 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i13 = i3;
                        Function0<Unit> function5 = function1;
                        composer2 = composerStartRestartGroup;
                        float f7 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs3, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function5;
                        f4 = f7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                            CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                j4 = j2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs4 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function6 = function1;
                                    if (function6 != null) {
                                        function6.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function6 = function1;
                                    if (function6 != null) {
                                        function6.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i14 = i3;
                        Function0<Unit> function6 = function1;
                        composer2 = composerStartRestartGroup;
                        float f8 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs4, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i14 & 14) | ((i14 >> 3) & 896) | ((i14 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function6;
                        f4 = f8;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs5 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function7 = function1;
                                    if (function7 != null) {
                                        function7.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function7 = function1;
                                    if (function7 != null) {
                                        function7.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i15 = i3;
                        Function0<Unit> function7 = function1;
                        composer2 = composerStartRestartGroup;
                        float f9 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs5, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i15 & 14) | ((i15 >> 3) & 896) | ((i15 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function7;
                        f4 = f9;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i16) {
                            CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs6 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function8 = function1;
                                if (function8 != null) {
                                    function8.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function8 = function1;
                                if (function8 != null) {
                                    function8.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i16 = i3;
                    Function0<Unit> function8 = function1;
                    composer2 = composerStartRestartGroup;
                    float f10 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs6, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | ((i16 >> 3) & 896) | ((i16 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function8;
                    f4 = f10;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs7 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function9 = function1;
                                if (function9 != null) {
                                    function9.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function9 = function1;
                                if (function9 != null) {
                                    function9.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i17 = i3;
                    Function0<Unit> function9 = function1;
                    composer2 = composerStartRestartGroup;
                    float f11 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs7, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i17 & 14) | ((i17 >> 3) & 896) | ((i17 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function9;
                    f4 = f11;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j3 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs8 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function10 = function1;
                                    if (function10 != null) {
                                        function10.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function10 = function1;
                                    if (function10 != null) {
                                        function10.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = i3;
                        Function0<Unit> function10 = function1;
                        composer2 = composerStartRestartGroup;
                        float f12 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs8, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i18 & 14) | ((i18 >> 3) & 896) | ((i18 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function10;
                        f4 = f12;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs9 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function11 = function1;
                                    if (function11 != null) {
                                        function11.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function11 = function1;
                                    if (function11 != null) {
                                        function11.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i19 = i3;
                        Function0<Unit> function11 = function1;
                        composer2 = composerStartRestartGroup;
                        float f13 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs9, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i19 & 14) | ((i19 >> 3) & 896) | ((i19 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function11;
                        f4 = f13;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i110) {
                            CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs10 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function12 = function1;
                                if (function12 != null) {
                                    function12.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function12 = function1;
                                if (function12 != null) {
                                    function12.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i110 = i3;
                    Function0<Unit> function12 = function1;
                    composer2 = composerStartRestartGroup;
                    float f14 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs10, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i110 & 14) | ((i110 >> 3) & 896) | ((i110 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function12;
                    f4 = f14;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs11 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111 = i3;
                    Function0<Unit> function13 = function1;
                    composer2 = composerStartRestartGroup;
                    float f15 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs11, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i111 & 14) | ((i111 >> 3) & 896) | ((i111 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function13;
                    f4 = f15;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs12 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function14 = function1;
                                if (function14 != null) {
                                    function14.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function14 = function1;
                                if (function14 != null) {
                                    function14.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i112 = i3;
                    Function0<Unit> function14 = function1;
                    composer2 = composerStartRestartGroup;
                    float f16 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs12, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i112 & 14) | ((i112 >> 3) & 896) | ((i112 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function14;
                    f4 = f16;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs13 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function15 = function1;
                                if (function15 != null) {
                                    function15.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function15 = function1;
                                if (function15 != null) {
                                    function15.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i113 = i3;
                    Function0<Unit> function15 = function1;
                    composer2 = composerStartRestartGroup;
                    float f17 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs13, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i113 & 14) | ((i113 >> 3) & 896) | ((i113 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function15;
                    f4 = f17;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i114) {
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs14 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function16 = function1;
                            if (function16 != null) {
                                function16.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function16 = function1;
                            if (function16 != null) {
                                function16.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i114 = i3;
                Function0<Unit> function16 = function1;
                composer2 = composerStartRestartGroup;
                float f18 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs14, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i114 & 14) | ((i114 >> 3) & 896) | ((i114 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function16;
                f4 = f18;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs15 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function17 = function1;
                            if (function17 != null) {
                                function17.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function17 = function1;
                            if (function17 != null) {
                                function17.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i115 = i3;
                Function0<Unit> function17 = function1;
                composer2 = composerStartRestartGroup;
                float f19 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs15, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i115 & 14) | ((i115 >> 3) & 896) | ((i115 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function17;
                f4 = f19;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                    CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f3 = f2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs16 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function18 = function1;
                                    if (function18 != null) {
                                        function18.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function18 = function1;
                                    if (function18 != null) {
                                        function18.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i116 = i3;
                        Function0<Unit> function18 = function1;
                        composer2 = composerStartRestartGroup;
                        float f110 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs16, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i116 & 14) | ((i116 >> 3) & 896) | ((i116 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function18;
                        f4 = f110;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        } else {
                            themeColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                        }
                        Modifier modifierM6957radius3ABfNKs17 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                        if (function1 != null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function19 = function1;
                                    if (function19 != null) {
                                        function19.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                    Function0<Unit> function19 = function1;
                                    if (function19 != null) {
                                        function19.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i117 = i3;
                        Function0<Unit> function19 = function1;
                        composer2 = composerStartRestartGroup;
                        float f111 = fM6097constructorimpl;
                        TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs17, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i117 & 14) | ((i117 >> 3) & 896) | ((i117 << 3) & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = sp;
                        j6 = themeColor;
                        function2 = function19;
                        f4 = f111;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i118) {
                            CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs18 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function110 = function1;
                                if (function110 != null) {
                                    function110.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function110 = function1;
                                if (function110 != null) {
                                    function110.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i118 = i3;
                    Function0<Unit> function110 = function1;
                    composer2 = composerStartRestartGroup;
                    float f112 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs18, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i118 & 14) | ((i118 >> 3) & 896) | ((i118 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function110;
                    f4 = f112;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs19 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function111 = function1;
                                if (function111 != null) {
                                    function111.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function111 = function1;
                                if (function111 != null) {
                                    function111.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i119 = i3;
                    Function0<Unit> function111 = function1;
                    composer2 = composerStartRestartGroup;
                    float f113 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs19, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i119 & 14) | ((i119 >> 3) & 896) | ((i119 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function111;
                    f4 = f113;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs110 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function112 = function1;
                                if (function112 != null) {
                                    function112.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function112 = function1;
                                if (function112 != null) {
                                    function112.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1110 = i3;
                    Function0<Unit> function112 = function1;
                    composer2 = composerStartRestartGroup;
                    float f114 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs110, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1110 & 14) | ((i1110 >> 3) & 896) | ((i1110 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function112;
                    f4 = f114;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs111 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function113 = function1;
                                if (function113 != null) {
                                    function113.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function113 = function1;
                                if (function113 != null) {
                                    function113.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111 = i3;
                    Function0<Unit> function113 = function1;
                    composer2 = composerStartRestartGroup;
                    float f115 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs111, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1111 & 14) | ((i1111 >> 3) & 896) | ((i1111 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function113;
                    f4 = f115;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i1112) {
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs112 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function114 = function1;
                            if (function114 != null) {
                                function114.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function114 = function1;
                            if (function114 != null) {
                                function114.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1112 = i3;
                Function0<Unit> function114 = function1;
                composer2 = composerStartRestartGroup;
                float f116 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs112, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1112 & 14) | ((i1112 >> 3) & 896) | ((i1112 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function114;
                f4 = f116;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs113 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function115 = function1;
                            if (function115 != null) {
                                function115.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function115 = function1;
                            if (function115 != null) {
                                function115.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1113 = i3;
                Function0<Unit> function115 = function1;
                composer2 = composerStartRestartGroup;
                float f117 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs113, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1113 & 14) | ((i1113 >> 3) & 896) | ((i1113 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function115;
                f4 = f117;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                    CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j3 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs114 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function116 = function1;
                                if (function116 != null) {
                                    function116.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function116 = function1;
                                if (function116 != null) {
                                    function116.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1114 = i3;
                    Function0<Unit> function116 = function1;
                    composer2 = composerStartRestartGroup;
                    float f118 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs114, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1114 & 14) | ((i1114 >> 3) & 896) | ((i1114 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function116;
                    f4 = f118;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                    }
                    Modifier modifierM6957radius3ABfNKs115 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                    if (function1 != null) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function117 = function1;
                                if (function117 != null) {
                                    function117.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                                Function0<Unit> function117 = function1;
                                if (function117 != null) {
                                    function117.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1115 = i3;
                    Function0<Unit> function117 = function1;
                    composer2 = composerStartRestartGroup;
                    float f119 = fM6097constructorimpl;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs115, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1115 & 14) | ((i1115 >> 3) & 896) | ((i1115 << 3) & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                    function2 = function117;
                    f4 = f119;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i1116) {
                        CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs116 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function118 = function1;
                            if (function118 != null) {
                                function118.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function118 = function1;
                            if (function118 != null) {
                                function118.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1116 = i3;
                Function0<Unit> function118 = function1;
                composer2 = composerStartRestartGroup;
                float f1110 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs116, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1116 & 14) | ((i1116 >> 3) & 896) | ((i1116 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function118;
                f4 = f1110;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs117 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function119 = function1;
                            if (function119 != null) {
                                function119.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function119 = function1;
                            if (function119 != null) {
                                function119.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1117 = i3;
                Function0<Unit> function119 = function1;
                composer2 = composerStartRestartGroup;
                float f1111 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs117, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1117 & 14) | ((i1117 >> 3) & 896) | ((i1117 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function119;
                f4 = f1111;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                    CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        j4 = j2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs118 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function1110 = function1;
                            if (function1110 != null) {
                                function1110.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function1110 = function1;
                            if (function1110 != null) {
                                function1110.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1118 = i3;
                Function0<Unit> function1110 = function1;
                composer2 = composerStartRestartGroup;
                float f1112 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs118, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1118 & 14) | ((i1118 >> 3) & 896) | ((i1118 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function1110;
                f4 = f1112;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
                }
                Modifier modifierM6957radius3ABfNKs119 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
                if (function1 != null) {
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function1111 = function1;
                            if (function1111 != null) {
                                function1111.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                            Function0<Unit> function1111 = function1;
                            if (function1111 != null) {
                                function1111.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1119 = i3;
                Function0<Unit> function1111 = function1;
                composer2 = composerStartRestartGroup;
                float f1113 = fM6097constructorimpl;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs119, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1119 & 14) | ((i1119 >> 3) & 896) | ((i1119 << 3) & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
                function2 = function1111;
                f4 = f1113;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11110) {
                    CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= CpioConstants.C_ISBLK;
        function1 = function0;
        if ((i3 & 46811) == 9362) {
            if (i10 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (i4 != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j3;
            }
            if (i6 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j4;
            }
            if (i8 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
            }
            Modifier modifierM6957radius3ABfNKs1110 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
            if (function1 != null) {
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                        Function0<Unit> function1112 = function1;
                        if (function1112 != null) {
                            function1112.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                        Function0<Unit> function1112 = function1;
                        if (function1112 != null) {
                            function1112.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i11110 = i3;
            Function0<Unit> function1112 = function1;
            composer2 = composerStartRestartGroup;
            float f1114 = fM6097constructorimpl;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1110, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11110 & 14) | ((i11110 >> 3) & 896) | ((i11110 << 3) & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            j6 = themeColor;
            function2 = function1112;
            f4 = f1114;
        } else {
            if (i10 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (i4 != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j3;
            }
            if (i6 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j4;
            }
            if (i8 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1720504572, i3, -1, "cn.jianyun.workplan.util.LinkText (CommonUI.kt:78)");
            }
            Modifier modifierM6957radius3ABfNKs1111 = m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(4));
            if (function1 != null) {
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                        Function0<Unit> function1113 = function1;
                        if (function1113 != null) {
                            function1113.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$1$1
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
                        Function0<Unit> function1113 = function1;
                        if (function1113 != null) {
                            function1113.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i11111 = i3;
            Function0<Unit> function1113 = function1;
            composer2 = composerStartRestartGroup;
            float f1115 = fM6097constructorimpl;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m567padding3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs1111, z, null, null, (Function0) objRememberedValue, 6, null), fM6097constructorimpl), themeColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11111 & 14) | ((i11111 >> 3) & 896) | ((i11111 << 3) & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            j6 = themeColor;
            function2 = function1113;
            f4 = f1115;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$LinkText$2
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
                CommonUIKt.m6950LinkTexthfI1UA(label, f4, j5, j6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: SmallButton--PLvOf0, reason: not valid java name */
    public static final void m6951SmallButtonPLvOf0(final String label, long j, long j2, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        int i6;
        int i7;
        long sp;
        long themeColor;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(-120062282);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SmallButton)P(3,2:c#ui.unit.TextUnit,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
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
                        sp = TextUnitKt.getSp(10);
                    } else {
                        sp = j3;
                    }
                    if (i4 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    } else {
                        themeColor = j4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(action);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                    composer2 = composerStartRestartGroup;
                    TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                    j6 = themeColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j5 = j3;
                    j6 = j4;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$2
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
                        CommonUIKt.m6951SmallButtonPLvOf0(label, j5, j6, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j4 = j2;
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
                    sp = TextUnitKt.getSp(10);
                } else {
                    sp = j3;
                }
                if (i4 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
            } else {
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(10);
                } else {
                    sp = j3;
                }
                if (i4 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$2
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
                    CommonUIKt.m6951SmallButtonPLvOf0(label, j5, j6, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        j3 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
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
                    sp = TextUnitKt.getSp(10);
                } else {
                    sp = j3;
                }
                if (i4 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
            } else {
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(10);
                } else {
                    sp = j3;
                }
                if (i4 != 0) {
                    themeColor = ColorKt.getThemeColor();
                } else {
                    themeColor = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
                }
                Modifier.Companion companion5 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(action);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                composer2 = composerStartRestartGroup;
                TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion5, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = sp;
                j6 = themeColor;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$2
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
                    CommonUIKt.m6951SmallButtonPLvOf0(label, j5, j6, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j4 = j2;
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
                sp = TextUnitKt.getSp(10);
            } else {
                sp = j3;
            }
            if (i4 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
            }
            Modifier.Companion companion6 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion6, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            j6 = themeColor;
        } else {
            if (i8 != 0) {
                sp = TextUnitKt.getSp(10);
            } else {
                sp = j3;
            }
            if (i4 != 0) {
                themeColor = ColorKt.getThemeColor();
            } else {
                themeColor = j4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-120062282, i7, -1, "cn.jianyun.workplan.util.SmallButton (CommonUI.kt:90)");
            }
            Modifier.Companion companion7 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            zChanged = composerStartRestartGroup.changed(action);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$1$1
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
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(label, PaddingKt.m569paddingVpY3zN4$default(BackgroundKt.m214backgroundbw27NRU$default(m6957radius3ABfNKs(SizeKt.m602height3ABfNKs(ClickableKt.m249clickableXHw0xAI$default(companion7, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6097constructorimpl(22)), Dp.m6097constructorimpl(8)), themeColor, null, 2, null), Dp.m6097constructorimpl(5), 0.0f, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500 | ((i7 << 6) & 7168), 6, 130032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = sp;
            j6 = themeColor;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$SmallButton$2
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
                CommonUIKt.m6951SmallButtonPLvOf0(label, j5, j6, action, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WarnText-hf-I1UA, reason: not valid java name */
    public static final void m6952WarnTexthfI1UA(final String label, float f2, long j, long j2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        Function0<Unit> function1;
        int i9;
        float fM6097constructorimpl;
        long sp;
        long importantColor;
        final float f4;
        final Function0<Unit> function2;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1972239496);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WarnText)P(3,4:c#ui.unit.Dp,2:c#ui.unit.TextUnit,1:c#ui.graphics.Color)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        j4 = j2;
                        if (composerStartRestartGroup.changed(j4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            function1 = function0;
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                            if (i10 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f3;
                            }
                            if (i4 != 0) {
                                sp = TextUnitKt.getSp(15);
                            } else {
                                sp = j3;
                            }
                            if (i6 != 0) {
                                importantColor = ColorKt.getImportantColor();
                            } else {
                                importantColor = j4;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                            }
                            m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM6097constructorimpl;
                            function2 = function1;
                            j5 = sp;
                            j6 = importantColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f4 = f3;
                            j5 = j3;
                            j6 = j4;
                            function2 = function1;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    function1 = function0;
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                j4 = j2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j3 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f3 = f2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 46811) == 9362) {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    } else {
                        if (i10 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f3;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j3;
                        }
                        if (i6 != 0) {
                            importantColor = ColorKt.getImportantColor();
                        } else {
                            importantColor = j4;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                        }
                        m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM6097constructorimpl;
                        function2 = function1;
                        j5 = sp;
                        j6 = importantColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                function1 = function0;
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j4 = j2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        j3 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 46811) == 9362) {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                } else {
                    if (i10 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f3;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j3;
                    }
                    if (i6 != 0) {
                        importantColor = ColorKt.getImportantColor();
                    } else {
                        importantColor = j4;
                    }
                    if (i8 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                    }
                    m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM6097constructorimpl;
                    function2 = function1;
                    j5 = sp;
                    j6 = importantColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function1 = function0;
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        j4 = j2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 46811) == 9362) {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            } else {
                if (i10 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j3;
                }
                if (i6 != 0) {
                    importantColor = ColorKt.getImportantColor();
                } else {
                    importantColor = j4;
                }
                if (i8 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                function2 = function1;
                j5 = sp;
                j6 = importantColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= CpioConstants.C_ISBLK;
        function1 = function0;
        if ((i3 & 46811) == 9362) {
            if (i10 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (i4 != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j3;
            }
            if (i6 != 0) {
                importantColor = ColorKt.getImportantColor();
            } else {
                importantColor = j4;
            }
            if (i8 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
            }
            m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6097constructorimpl;
            function2 = function1;
            j5 = sp;
            j6 = importantColor;
        } else {
            if (i10 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if (i4 != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j3;
            }
            if (i6 != 0) {
                importantColor = ColorKt.getImportantColor();
            } else {
                importantColor = j4;
            }
            if (i8 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1972239496, i3, -1, "cn.jianyun.workplan.util.WarnText (CommonUI.kt:98)");
            }
            m6950LinkTexthfI1UA(label, fM6097constructorimpl, sp, importantColor, function1, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6097constructorimpl;
            function2 = function1;
            j5 = sp;
            j6 = importantColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$WarnText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11) {
                CommonUIKt.m6952WarnTexthfI1UA(label, f4, j5, j6, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: GrayLinkText-53ZIcWk, reason: not valid java name */
    public static final void m6949GrayLinkText53ZIcWk(final String label, float f2, long j, final Function0<Unit> action, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        float fM6097constructorimpl;
        long sp;
        final float f4;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Composer composerStartRestartGroup = composer.startRestartGroup(1314355190);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GrayLinkText)P(2,3:c#ui.unit.Dp,1:c#ui.unit.TextUnit)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                f3 = f2;
                i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(action)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 5211) == 1042 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f3;
                }
                if ((i2 & 4) != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314355190, i3, -1, "cn.jianyun.workplan.util.GrayLinkText (CommonUI.kt:104)");
                }
                m6950LinkTexthfI1UA(label, fM6097constructorimpl, 0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getTertiary(), action, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | ((i3 << 3) & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM6097constructorimpl;
                j2 = sp;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f4 = f3;
                j2 = j;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GrayLinkText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    CommonUIKt.m6949GrayLinkText53ZIcWk(label, f4, j2, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f3 = f2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(action)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5211) == 1042) {
            if (i5 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if ((i2 & 4) != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314355190, i3, -1, "cn.jianyun.workplan.util.GrayLinkText (CommonUI.kt:104)");
            }
            m6950LinkTexthfI1UA(label, fM6097constructorimpl, 0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getTertiary(), action, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | ((i3 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6097constructorimpl;
            j2 = sp;
        } else {
            if (i5 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f3;
            }
            if ((i2 & 4) != 0) {
                sp = TextUnitKt.getSp(15);
            } else {
                sp = j;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314355190, i3, -1, "cn.jianyun.workplan.util.GrayLinkText (CommonUI.kt:104)");
            }
            m6950LinkTexthfI1UA(label, fM6097constructorimpl, 0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 0 | MaterialTheme.$stable).getTertiary(), action, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | ((i3 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM6097constructorimpl;
            j2 = sp;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GrayLinkText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                CommonUIKt.m6949GrayLinkText53ZIcWk(label, f4, j2, action, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: Blank-kHDZbjc, reason: not valid java name */
    public static final void m6944BlankkHDZbjc(final float f2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476291078);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Blank)P(0:c#ui.unit.Dp)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f2 = Dp.m6097constructorimpl(10);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476291078, i, -1, "cn.jianyun.workplan.util.Blank (CommonUI.kt:109)");
            }
            SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, f2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$Blank$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                CommonUIKt.m6944BlankkHDZbjc(f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: GlanceBlank-kHDZbjc, reason: not valid java name */
    public static final void m6945GlanceBlankkHDZbjc(final float f2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-14033370);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GlanceBlank)P(0:c#ui.unit.Dp)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f2 = Dp.m6097constructorimpl(10);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-14033370, i, -1, "cn.jianyun.workplan.util.GlanceBlank (CommonUI.kt:114)");
            }
            androidx.glance.layout.SpacerKt.Spacer(SizeModifiersKt.m6578size3ABfNKs(GlanceModifier.INSTANCE, f2), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceBlank$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                CommonUIKt.m6945GlanceBlankkHDZbjc(f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: BigBlank-kHDZbjc, reason: not valid java name */
    public static final void m6943BigBlankkHDZbjc(final float f2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-35037066);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BigBlank)P(0:c#ui.unit.Dp)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f2 = Dp.m6097constructorimpl(20);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35037066, i, -1, "cn.jianyun.workplan.util.BigBlank (CommonUI.kt:119)");
            }
            SpacerKt.Spacer(SizeKt.m616size3ABfNKs(Modifier.INSTANCE, f2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$BigBlank$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                CommonUIKt.m6943BigBlankkHDZbjc(f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: GlanceOffsetView-pBklqvs, reason: not valid java name */
    public static final void m6946GlanceOffsetViewpBklqvs(float f2, float f3, GlanceModifier glanceModifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        float f4;
        final int i3;
        float f5;
        int i4;
        GlanceModifier glanceModifier2;
        int i5;
        int i6;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        GlanceModifier glanceModifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(324143907);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GlanceOffsetView)P(2:c#ui.unit.Dp,3:c#ui.unit.Dp,1)");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f4 = f2;
        } else if ((i & 14) == 0) {
            f4 = f2;
            i3 = (composerStartRestartGroup.changed(f4) ? 4 : 2) | i;
        } else {
            f4 = f2;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                f5 = f3;
                i3 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    glanceModifier2 = glanceModifier;
                    if (composerStartRestartGroup.changed(glanceModifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        fM6097constructorimpl = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl = f4;
                    }
                    if (i8 != 0) {
                        fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                    } else {
                        fM6097constructorimpl2 = f5;
                    }
                    if (i4 != 0) {
                        glanceModifier3 = GlanceModifier.INSTANCE;
                    } else {
                        glanceModifier3 = glanceModifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
                    }
                    GlanceModifier glanceModifier4 = glanceModifier3;
                    RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Row, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(Row, "$this$Row");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                            }
                            content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    glanceModifier2 = glanceModifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    fM6097constructorimpl = f4;
                    fM6097constructorimpl2 = f5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final float f6 = fM6097constructorimpl;
                final float f7 = fM6097constructorimpl2;
                final GlanceModifier glanceModifier5 = glanceModifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$2
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

                    public final void invoke(Composer composer2, int i9) {
                        CommonUIKt.m6946GlanceOffsetViewpBklqvs(f6, f7, glanceModifier5, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            glanceModifier2 = glanceModifier;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f4;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f5;
                }
                if (i4 != 0) {
                    glanceModifier3 = GlanceModifier.INSTANCE;
                } else {
                    glanceModifier3 = glanceModifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
                }
                GlanceModifier glanceModifier6 = glanceModifier3;
                RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Row, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                        }
                        content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                glanceModifier2 = glanceModifier6;
            } else {
                if (i7 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f4;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f5;
                }
                if (i4 != 0) {
                    glanceModifier3 = GlanceModifier.INSTANCE;
                } else {
                    glanceModifier3 = glanceModifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
                }
                GlanceModifier glanceModifier7 = glanceModifier3;
                RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Row, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                        }
                        content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                glanceModifier2 = glanceModifier7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final float f8 = fM6097constructorimpl;
            final float f9 = fM6097constructorimpl2;
            final GlanceModifier glanceModifier8 = glanceModifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$2
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

                public final void invoke(Composer composer2, int i9) {
                    CommonUIKt.m6946GlanceOffsetViewpBklqvs(f8, f9, glanceModifier8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        f5 = f3;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                glanceModifier2 = glanceModifier;
                if (composerStartRestartGroup.changed(glanceModifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 5851) == 1170) {
                if (i7 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f4;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f5;
                }
                if (i4 != 0) {
                    glanceModifier3 = GlanceModifier.INSTANCE;
                } else {
                    glanceModifier3 = glanceModifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
                }
                GlanceModifier glanceModifier9 = glanceModifier3;
                RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Row, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                        }
                        content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                glanceModifier2 = glanceModifier9;
            } else {
                if (i7 != 0) {
                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl = f4;
                }
                if (i8 != 0) {
                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                } else {
                    fM6097constructorimpl2 = f5;
                }
                if (i4 != 0) {
                    glanceModifier3 = GlanceModifier.INSTANCE;
                } else {
                    glanceModifier3 = glanceModifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
                }
                GlanceModifier glanceModifier10 = glanceModifier3;
                RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Row, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                        }
                        content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                glanceModifier2 = glanceModifier10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final float f10 = fM6097constructorimpl;
            final float f11 = fM6097constructorimpl2;
            final GlanceModifier glanceModifier11 = glanceModifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$2
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

                public final void invoke(Composer composer2, int i9) {
                    CommonUIKt.m6946GlanceOffsetViewpBklqvs(f10, f11, glanceModifier11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        glanceModifier2 = glanceModifier;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170) {
            if (i7 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f4;
            }
            if (i8 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl2 = f5;
            }
            if (i4 != 0) {
                glanceModifier3 = GlanceModifier.INSTANCE;
            } else {
                glanceModifier3 = glanceModifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
            }
            GlanceModifier glanceModifier12 = glanceModifier3;
            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Row, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                    }
                    content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            glanceModifier2 = glanceModifier12;
        } else {
            if (i7 != 0) {
                fM6097constructorimpl = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl = f4;
            }
            if (i8 != 0) {
                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
            } else {
                fM6097constructorimpl2 = f5;
            }
            if (i4 != 0) {
                glanceModifier3 = GlanceModifier.INSTANCE;
            } else {
                glanceModifier3 = glanceModifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324143907, i3, -1, "cn.jianyun.workplan.util.GlanceOffsetView (CommonUI.kt:124)");
            }
            GlanceModifier glanceModifier13 = glanceModifier3;
            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, 0.0f, 0.0f, 12, null).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -14170817, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Row, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-14170817, i9, -1, "cn.jianyun.workplan.util.GlanceOffsetView.<anonymous> (CommonUI.kt:125)");
                    }
                    content.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            glanceModifier2 = glanceModifier13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final float f12 = fM6097constructorimpl;
        final float f13 = fM6097constructorimpl2;
        final GlanceModifier glanceModifier14 = glanceModifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlanceOffsetView$2
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

            public final void invoke(Composer composer2, int i9) {
                CommonUIKt.m6946GlanceOffsetViewpBklqvs(f12, f13, glanceModifier14, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0141  */
    /* JADX WARN: Code duplicated, block: B:99:0x014f  */
    /* JADX INFO: renamed from: GlancePaddingView-5-DNhBc, reason: not valid java name */
    public static final void m6947GlancePaddingView5DNhBc(float f2, float f3, float f4, float f5, GlanceModifier glanceModifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        float f6;
        final int i3;
        float f7;
        int i4;
        float f8;
        int i5;
        int i6;
        float f9;
        int i7;
        int i8;
        GlanceModifier glanceModifier2;
        int i9;
        int i10;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        float fM6097constructorimpl3;
        float fM6097constructorimpl4;
        GlanceModifier glanceModifier3;
        final float f10;
        final float f11;
        final GlanceModifier glanceModifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1515750749);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GlancePaddingView)P(4:c#ui.unit.Dp,5:c#ui.unit.Dp,2:c#ui.unit.Dp,0:c#ui.unit.Dp,3)");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            f6 = f2;
        } else if ((i & 14) == 0) {
            f6 = f2;
            i3 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i;
        } else {
            f6 = f2;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 112) == 0) {
                f7 = f3;
                i3 |= composerStartRestartGroup.changed(f7) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f8 = f4;
                    if (composerStartRestartGroup.changed(f8)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        f9 = f5;
                        if (composerStartRestartGroup.changed(f9)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            glanceModifier2 = glanceModifier;
                            if (composerStartRestartGroup.changed(glanceModifier2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((458752 & i) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                            }
                            if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                if (i11 != 0) {
                                    fM6097constructorimpl = Dp.m6097constructorimpl(0);
                                } else {
                                    fM6097constructorimpl = f6;
                                }
                                if (i12 != 0) {
                                    fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                                } else {
                                    fM6097constructorimpl2 = f7;
                                }
                                if (i4 != 0) {
                                    fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                                } else {
                                    fM6097constructorimpl3 = f8;
                                }
                                if (i6 != 0) {
                                    fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                                } else {
                                    fM6097constructorimpl4 = f9;
                                }
                                if (i8 != 0) {
                                    glanceModifier3 = GlanceModifier.INSTANCE;
                                } else {
                                    glanceModifier3 = glanceModifier2;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                                }
                                RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                        invoke(rowScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope Row, Composer composer2, int i13) {
                                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                        }
                                        content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composerStartRestartGroup, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f10 = fM6097constructorimpl4;
                                f7 = fM6097constructorimpl2;
                                f11 = fM6097constructorimpl3;
                                glanceModifier4 = glanceModifier3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                fM6097constructorimpl = f6;
                                f11 = f8;
                                f10 = f9;
                                glanceModifier4 = glanceModifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            final float f12 = fM6097constructorimpl;
                            final float f13 = f7;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$2
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

                                public final void invoke(Composer composer2, int i13) {
                                    CommonUIKt.m6947GlancePaddingView5DNhBc(f12, f13, f11, f10, glanceModifier4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                        i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        } else {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f14 = fM6097constructorimpl;
                        final float f15 = f7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$2
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

                            public final void invoke(Composer composer2, int i13) {
                                CommonUIKt.m6947GlancePaddingView5DNhBc(f14, f15, f11, f10, glanceModifier4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    glanceModifier2 = glanceModifier;
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        } else {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f16 = fM6097constructorimpl;
                        final float f17 = f7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$2
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

                            public final void invoke(Composer composer2, int i13) {
                                CommonUIKt.m6947GlancePaddingView5DNhBc(f16, f17, f11, f10, glanceModifier4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f7;
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl3 = f8;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl4 = f9;
                        }
                        if (i8 != 0) {
                            glanceModifier3 = GlanceModifier.INSTANCE;
                        } else {
                            glanceModifier3 = glanceModifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                        }
                        RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Row, Composer composer2, int i13) {
                                Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                }
                                content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f10 = fM6097constructorimpl4;
                        f7 = fM6097constructorimpl2;
                        f11 = fM6097constructorimpl3;
                        glanceModifier4 = glanceModifier3;
                    } else {
                        if (i11 != 0) {
                            fM6097constructorimpl = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl = f6;
                        }
                        if (i12 != 0) {
                            fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl2 = f7;
                        }
                        if (i4 != 0) {
                            fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl3 = f8;
                        }
                        if (i6 != 0) {
                            fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                        } else {
                            fM6097constructorimpl4 = f9;
                        }
                        if (i8 != 0) {
                            glanceModifier3 = GlanceModifier.INSTANCE;
                        } else {
                            glanceModifier3 = glanceModifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                        }
                        RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Row, Composer composer2, int i13) {
                                Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                }
                                content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f10 = fM6097constructorimpl4;
                        f7 = fM6097constructorimpl2;
                        f11 = fM6097constructorimpl3;
                        glanceModifier4 = glanceModifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f18 = fM6097constructorimpl;
                    final float f19 = f7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$2
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

                        public final void invoke(Composer composer2, int i13) {
                            CommonUIKt.m6947GlancePaddingView5DNhBc(f18, f19, f11, f10, glanceModifier4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                f9 = f5;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        glanceModifier2 = glanceModifier;
                        if (composerStartRestartGroup.changed(glanceModifier2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        } else {
                            if (i11 != 0) {
                                fM6097constructorimpl = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl = f6;
                            }
                            if (i12 != 0) {
                                fM6097constructorimpl2 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl2 = f7;
                            }
                            if (i4 != 0) {
                                fM6097constructorimpl3 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl3 = f8;
                            }
                            if (i6 != 0) {
                                fM6097constructorimpl4 = Dp.m6097constructorimpl(0);
                            } else {
                                fM6097constructorimpl4 = f9;
                            }
                            if (i8 != 0) {
                                glanceModifier3 = GlanceModifier.INSTANCE;
                            } else {
                                glanceModifier3 = glanceModifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1515750749, i3, -1, "cn.jianyun.workplan.util.GlancePaddingView (CommonUI.kt:131)");
                            }
                            RowKt.m6574RowlMAjyxE(androidx.glance.layout.PaddingKt.m6571paddingqDBjuR0(GlanceModifier.INSTANCE, fM6097constructorimpl, fM6097constructorimpl2, fM6097constructorimpl3, fM6097constructorimpl4).then(glanceModifier3), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1545499585, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Row, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1545499585, i13, -1, "cn.jianyun.workplan.util.GlancePaddingView.<anonymous> (CommonUI.kt:132)");
                                    }
                                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = fM6097constructorimpl4;
                            f7 = fM6097constructorimpl2;
                            f11 = fM6097constructorimpl3;
                            glanceModifier4 = glanceModifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f110 = fM6097constructorimpl;
                        final float f111 = f7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.util.CommonUIKt$GlancePaddingView$2
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

                            public final void invoke(Composer composer2, int i13) {
                                CommonUIKt.m6947GlancePaddingView5DNhBc(f110, f111, f11, f10, glanceModifier4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
                            fM6097constructorimpl 

... [truncated: exceeds 400000 bytes, total 646273 bytes]