package cn.jianyun.workplan.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "WorkplanTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.m1740darkColorSchemeCXl9yA$default(ColorKt.getDarkPrimaryColor(), 0, 0, 0, 0, ColorKt.getDarkSecondColor(), 0, 0, 0, ColorKt.getDarkThirdColor(), 0, 0, 0, ColorKt.getDarkBg0Color(), 0, ColorKt.getDarkBgColor(), 0, ColorKt.getDarkSelectColor(), 0, 0, 0, 0, ColorKt.getDarkDeleteColor(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4366882, 15, null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m1744lightColorSchemeCXl9yA$default(ColorKt.getLightPrimaryColor(), 0, 0, 0, 0, ColorKt.getLightSecondColor(), 0, 0, 0, ColorKt.getLightThirdColor(), 0, 0, 0, ColorKt.getLightBgColor(), ColorKt.getLightPrimaryColor(), ColorKt.getLightBg0Color(), 0, ColorKt.getLightSelectColor(), 0, 0, 0, 0, ColorKt.getLightDeleteColor(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4383266, 15, null);

    public static final void WorkplanTheme(final boolean z, boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final ColorScheme colorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-571515980);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WorkplanTheme)P(1,2)");
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571515980, i3, -1, "cn.jianyun.workplan.ui.theme.WorkplanTheme (Theme.kt:50)");
            }
            if (z2 && Build.VERSION.SDK_INT >= 31) {
                colorScheme = z ? DarkColorScheme : LightColorScheme;
            } else if (z) {
                colorScheme = DarkColorScheme;
            } else {
                colorScheme = LightColorScheme;
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final View view = (View) objConsume;
            composerStartRestartGroup.startReplaceableGroup(-610618829);
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.theme.ThemeKt.WorkplanTheme.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Context context = view.getContext();
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                        Window window = ((Activity) context).getWindow();
                        window.setStatusBarColor(androidx.compose.ui.graphics.ColorKt.m3809toArgb8_81llA(colorScheme.getBackground()));
                        window.setNavigationBarColor(androidx.compose.ui.graphics.ColorKt.m3809toArgb8_81llA(colorScheme.getBackground()));
                        WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(!z);
                    }
                }, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Log.d("primary", Color.m3763toStringimpl(colorScheme.getPrimary()));
            MaterialThemeKt.MaterialTheme(colorScheme, null, TypeKt.getTypography(), content, composerStartRestartGroup, ((i3 << 3) & 7168) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z3 = z;
        final boolean z4 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.theme.ThemeKt.WorkplanTheme.2
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

            public final void invoke(Composer composer2, int i5) {
                ThemeKt.WorkplanTheme(z3, z4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}