package cn.jianyun.workplan.ui.component.bottomdialog;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: BottomSheetDialogView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¨\u0006\u0014"}, d2 = {"BottomSheetDialog", "", "modifier", "Landroidx/compose/ui/Modifier;", "visible", "", "layer", "draggable", "cancelable", "canceledOnTouchOutside", "onDismissRequest", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;ZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "InnerDialog", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "clickableNoRipple", "onClick", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BottomSheetDialogViewKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:129:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x025d  */
    /* JADX WARN: Code duplicated, block: B:133:0x02af  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:141:0x0304  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static final void BottomSheetDialog(Modifier modifier, final boolean z, boolean z2, boolean z3, boolean z4, boolean z5, final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        final boolean z10;
        final boolean z11;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z12;
        final Modifier modifier3;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(646119093);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheetDialog)P(5,7,4,3!2,6)");
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 896) == 0) {
                z6 = z2;
                i3 |= composerStartRestartGroup.changed(z6) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z7 = z3;
                    if (composerStartRestartGroup.changed(z7)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(onDismissRequest)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                    }
                    if ((i2 & 128) != 0) {
                        if ((29360128 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                        }
                        if ((23967451 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            if (i4 != 0) {
                                z9 = false;
                            } else {
                                z9 = z7;
                            }
                            if (i6 != 0) {
                                z10 = true;
                            } else {
                                z10 = z4;
                            }
                            if (i8 != 0) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-583534678);
                            if (z8) {
                                Boolean boolValueOf = Boolean.valueOf(z10);
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(onDismissRequest);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z10) {
                                                onDismissRequest.invoke();
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                            composerStartRestartGroup.startReplaceableGroup(-1543960787);
                            if (z8) {
                                AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i14) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-740575378, i14, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                        }
                                        Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                        Object objValueOf = Boolean.valueOf(z11);
                                        final Function0<Unit> function0 = onDismissRequest;
                                        final boolean z16 = z11;
                                        composer2.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    if (z16) {
                                                        function0.invoke();
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i14 = i3 >> 3;
                            int i15 = i3 >> 6;
                            InnerDialog(boxScopeInstance, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i14 & 896) | (i14 & 7168) | (i15 & 57344) | (i15 & 458752));
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z12 = z10;
                            modifier3 = modifier2;
                            z13 = z11;
                            z14 = z8;
                            z15 = z9;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z12 = z4;
                            modifier3 = modifier2;
                            z14 = z6;
                            z15 = z7;
                            z13 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                            public final void invoke(Composer composer2, int i16) {
                                BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i11 = 12582912;
                    i3 |= i11;
                    if ((23967451 & i3) == 4793490) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf2 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
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
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i16) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i16, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i16 = i3 >> 3;
                        int i17 = i3 >> 6;
                        InnerDialog(boxScopeInstance2, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i16 & 896) | (i16 & 7168) | (i17 & 57344) | (i17 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf3 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
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
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i18) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i18, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = i3 >> 3;
                        int i19 = i3 >> 6;
                        InnerDialog(boxScopeInstance3, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i18 & 896) | (i18 & 7168) | (i19 & 57344) | (i19 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                        public final void invoke(Composer composer2, int i110) {
                            BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 1572864;
                i3 |= i10;
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf4 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierThen4);
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
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i110) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i110, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i110 = i3 >> 3;
                        int i111 = i3 >> 6;
                        InnerDialog(boxScopeInstance4, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i110 & 896) | (i110 & 7168) | (i111 & 57344) | (i111 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf5 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen5);
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
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i112) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i112, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i112 = i3 >> 3;
                        int i113 = i3 >> 6;
                        InnerDialog(boxScopeInstance5, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i112 & 896) | (i112 & 7168) | (i113 & 57344) | (i113 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                        public final void invoke(Composer composer2, int i114) {
                            BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i11 = 12582912;
                i3 |= i11;
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf6 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierThen6);
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
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i114) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i114, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i114 = i3 >> 3;
                    int i115 = i3 >> 6;
                    InnerDialog(boxScopeInstance6, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i114 & 896) | (i114 & 7168) | (i115 & 57344) | (i115 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf7 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf7) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierThen7);
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
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i116) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i116, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i116 = i3 >> 3;
                    int i117 = i3 >> 6;
                    InnerDialog(boxScopeInstance7, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i116 & 896) | (i116 & 7168) | (i117 & 57344) | (i117 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i118) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z7 = z3;
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(z4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(z5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(onDismissRequest)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf8 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf8) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen8 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierThen8);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i118) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i118, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i118 = i3 >> 3;
                        int i119 = i3 >> 6;
                        InnerDialog(boxScopeInstance8, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i118 & 896) | (i118 & 7168) | (i119 & 57344) | (i119 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf9 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen9 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierThen9);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1110) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i1110, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i1110 = i3 >> 3;
                        int i1111 = i3 >> 6;
                        InnerDialog(boxScopeInstance9, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1110 & 896) | (i1110 & 7168) | (i1111 & 57344) | (i1111 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                        public final void invoke(Composer composer2, int i1112) {
                            BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i11 = 12582912;
                i3 |= i11;
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf10 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf10) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen10 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierThen10);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1112) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1112, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1112 = i3 >> 3;
                    int i1113 = i3 >> 6;
                    InnerDialog(boxScopeInstance10, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1112 & 896) | (i1112 & 7168) | (i1113 & 57344) | (i1113 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf11 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf11) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierThen11);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy11, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1114) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1114, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1114 = i3 >> 3;
                    int i1115 = i3 >> 6;
                    InnerDialog(boxScopeInstance11, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1114 & 896) | (i1114 & 7168) | (i1115 & 57344) | (i1115 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i1116) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf12 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen12 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierThen12);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy12, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1116) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1116, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1116 = i3 >> 3;
                    int i1117 = i3 >> 6;
                    InnerDialog(boxScopeInstance12, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1116 & 896) | (i1116 & 7168) | (i1117 & 57344) | (i1117 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf13 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf13) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen13 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierThen13);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy13, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1118) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1118, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1118 = i3 >> 3;
                    int i1119 = i3 >> 6;
                    InnerDialog(boxScopeInstance13, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1118 & 896) | (i1118 & 7168) | (i1119 & 57344) | (i1119 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i11110) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i11 = 12582912;
            i3 |= i11;
            if ((23967451 & i3) == 4793490) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf14 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf14) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen14 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierThen14);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy14, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1543960787);
                if (z8) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11110) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740575378, i11110, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                            }
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                            Object objValueOf = Boolean.valueOf(z11);
                            final Function0<Unit> function0 = onDismissRequest;
                            final boolean z16 = z11;
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z16) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11110 = i3 >> 3;
                int i11111 = i3 >> 6;
                InnerDialog(boxScopeInstance14, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i11110 & 896) | (i11110 & 7168) | (i11111 & 57344) | (i11111 & 458752));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z10;
                modifier3 = modifier2;
                z13 = z11;
                z14 = z8;
                z15 = z9;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf15 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen15 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierThen15);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy15, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1543960787);
                if (z8) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11112) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740575378, i11112, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                            }
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                            Object objValueOf = Boolean.valueOf(z11);
                            final Function0<Unit> function0 = onDismissRequest;
                            final boolean z16 = z11;
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z16) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i11112 = i3 >> 3;
                int i11113 = i3 >> 6;
                InnerDialog(boxScopeInstance15, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i11112 & 896) | (i11112 & 7168) | (i11113 & 57344) | (i11113 & 458752));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z10;
                modifier3 = modifier2;
                z13 = z11;
                z14 = z8;
                z15 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                public final void invoke(Composer composer2, int i11114) {
                    BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        z6 = z2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z7 = z3;
                if (composerStartRestartGroup.changed(z7)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(z4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(z5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(onDismissRequest)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i3) == 4793490) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf16 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf16) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen16 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierThen16);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy16, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11114) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i11114, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11114 = i3 >> 3;
                        int i11115 = i3 >> 6;
                        InnerDialog(boxScopeInstance16, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i11114 & 896) | (i11114 & 7168) | (i11115 & 57344) | (i11115 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z8 = true;
                        } else {
                            z8 = z6;
                        }
                        if (i4 != 0) {
                            z9 = false;
                        } else {
                            z9 = z7;
                        }
                        if (i6 != 0) {
                            z10 = true;
                        } else {
                            z10 = z4;
                        }
                        if (i8 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-583534678);
                        if (z8) {
                            Boolean boolValueOf17 = Boolean.valueOf(z10);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf17) | composerStartRestartGroup.changed(onDismissRequest);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z10) {
                                            onDismissRequest.invoke();
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen17 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierThen17);
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
                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy17, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1543960787);
                        if (z8) {
                            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11116) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-740575378, i11116, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                    }
                                    Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                    Object objValueOf = Boolean.valueOf(z11);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    final boolean z16 = z11;
                                    composer2.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                if (z16) {
                                                    function0.invoke();
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11116 = i3 >> 3;
                        int i11117 = i3 >> 6;
                        InnerDialog(boxScopeInstance17, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i11116 & 896) | (i11116 & 7168) | (i11117 & 57344) | (i11117 & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z10;
                        modifier3 = modifier2;
                        z13 = z11;
                        z14 = z8;
                        z15 = z9;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                        public final void invoke(Composer composer2, int i11118) {
                            BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i11 = 12582912;
                i3 |= i11;
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf18 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf18) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen18 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierThen18);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy18, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i11118) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i11118, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i11118 = i3 >> 3;
                    int i11119 = i3 >> 6;
                    InnerDialog(boxScopeInstance18, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i11118 & 896) | (i11118 & 7168) | (i11119 & 57344) | (i11119 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf19 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf19) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen19 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierThen19);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy19, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i111110) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i111110, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111110 = i3 >> 3;
                    int i111111 = i3 >> 6;
                    InnerDialog(boxScopeInstance19, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i111110 & 896) | (i111110 & 7168) | (i111111 & 57344) | (i111111 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i111112) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 1572864;
            i3 |= i10;
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf110 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf110) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen110 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierThen110);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i111112) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i111112, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111112 = i3 >> 3;
                    int i111113 = i3 >> 6;
                    InnerDialog(boxScopeInstance110, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i111112 & 896) | (i111112 & 7168) | (i111113 & 57344) | (i111113 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf111 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf111) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierThen111);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i111114) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i111114, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i111114 = i3 >> 3;
                    int i111115 = i3 >> 6;
                    InnerDialog(boxScopeInstance111, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i111114 & 896) | (i111114 & 7168) | (i111115 & 57344) | (i111115 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i111116) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i11 = 12582912;
            i3 |= i11;
            if ((23967451 & i3) == 4793490) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf112 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf112) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen112 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierThen112);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy112, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1543960787);
                if (z8) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i111116) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740575378, i111116, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                            }
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                            Object objValueOf = Boolean.valueOf(z11);
                            final Function0<Unit> function0 = onDismissRequest;
                            final boolean z16 = z11;
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z16) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i111116 = i3 >> 3;
                int i111117 = i3 >> 6;
                InnerDialog(boxScopeInstance112, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i111116 & 896) | (i111116 & 7168) | (i111117 & 57344) | (i111117 & 458752));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z10;
                modifier3 = modifier2;
                z13 = z11;
                z14 = z8;
                z15 = z9;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf113 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf113) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen113 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierThen113);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy113, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1543960787);
                if (z8) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i111118) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740575378, i111118, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                            }
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                            Object objValueOf = Boolean.valueOf(z11);
                            final Function0<Unit> function0 = onDismissRequest;
                            final boolean z16 = z11;
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z16) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i111118 = i3 >> 3;
                int i111119 = i3 >> 6;
                InnerDialog(boxScopeInstance113, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i111118 & 896) | (i111118 & 7168) | (i111119 & 57344) | (i111119 & 458752));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z10;
                modifier3 = modifier2;
                z13 = z11;
                z14 = z8;
                z15 = z9;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                public final void invoke(Composer composer2, int i1111110) {
                    BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z7 = z3;
        i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(z4)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(z5)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(onDismissRequest)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf114 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf114) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen114 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierThen114);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy114, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1111110) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1111110, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111110 = i3 >> 3;
                    int i1111111 = i3 >> 6;
                    InnerDialog(boxScopeInstance114, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1111110 & 896) | (i1111110 & 7168) | (i1111111 & 57344) | (i1111111 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    } else {
                        z8 = z6;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z7;
                    }
                    if (i6 != 0) {
                        z10 = true;
                    } else {
                        z10 = z4;
                    }
                    if (i8 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-583534678);
                    if (z8) {
                        Boolean boolValueOf115 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf115) | composerStartRestartGroup.changed(onDismissRequest);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z10) {
                                        onDismissRequest.invoke();
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen115 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierThen115);
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
                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy115, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1543960787);
                    if (z8) {
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1111112) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740575378, i1111112, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                                }
                                Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                                Object objValueOf = Boolean.valueOf(z11);
                                final Function0<Unit> function0 = onDismissRequest;
                                final boolean z16 = z11;
                                composer2.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (z16) {
                                                function0.invoke();
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i1111112 = i3 >> 3;
                    int i1111113 = i3 >> 6;
                    InnerDialog(boxScopeInstance115, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1111112 & 896) | (i1111112 & 7168) | (i1111113 & 57344) | (i1111113 & 458752));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z10;
                    modifier3 = modifier2;
                    z13 = z11;
                    z14 = z8;
                    z15 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt.BottomSheetDialog.3
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

                    public final void invoke(Composer composer2, int i1111114) {
                        BottomSheetDialogViewKt.BottomSheetDialog(modifier3, z, z14, z15, z12, z13, onDismissRequest, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i11 = 12582912;
            i3 |= i11;
            if ((23967451 & i3) == 4793490) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf116 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf116) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen116 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierThen116);
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy116, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1543960787);
                if (z8) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -740575378, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i1111114) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740575378, i1111114, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialogView.kt:70)");
                            }
                            Modifier modifierM214backgroundbw27NRU$default = BackgroundKt.m214backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(1291845632), null, 2, null);
                            Object objValueOf = Boolean.valueOf(z11);
                            final Function0<Unit> function0 = onDismissRequest;
                            final boolean z16 = z11;
                            composer2.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            boolean zChanged2 = composer2.changed(objValueOf) | composer2.changed(function0);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$2$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (z16) {
                                            function0.invoke();
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(BottomSheetDialogViewKt.clickableNoRipple(modifierM214backgroundbw27NRU$default, (Function0) objRememberedValue2), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i1111114 = i3 >> 3;
                int i1111115 = i3 >> 6;
                InnerDialog(boxScopeInstance116, z, z9, z10, onDismissRequest, content, composerStartRestartGroup, (i3 & 112) | 6 | (i1111114 & 896) | (i1111114 & 7168) | (i1111115 & 57344) | (i1111115 & 458752));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z10;
                modifier3 = modifier2;
                z13 = z11;
                z14 = z8;
                z15 = z9;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z8 = true;
                } else {
                    z8 = z6;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z7;
                }
                if (i6 != 0) {
                    z10 = true;
                } else {
                    z10 = z4;
                }
                if (i8 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(646119093, i3, -1, "cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialog (BottomSheetDialogView.kt:46)");
                }
                composerStartRestartGroup.startReplaceableGroup(-583534678);
                if (z8) {
                    Boolean boolValueOf117 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(boolValueOf117) | composerStartRestartGroup.changed(onDismissRequest);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$BottomSheetDialog$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z10) {
                                    onDismissRequest.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen117 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<Ski

... [truncated: exceeds 400000 bytes, total 488680 bytes]