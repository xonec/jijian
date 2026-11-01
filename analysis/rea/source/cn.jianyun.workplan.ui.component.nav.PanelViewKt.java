package cn.jianyun.workplan.ui.component.nav;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.compose.DialogNavigator;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
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

/* JADX INFO: compiled from: PanelView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"PanelView", "", "title", "", "content", DialogNavigator.NAME, "", "tip", "color", "Landroidx/compose/ui/graphics/Color;", "opened", "body", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PanelView-3f6hBDE", "(Ljava/lang/String;Ljava/lang/String;ZZJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PanelViewKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0151  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX INFO: renamed from: PanelView-3f6hBDE, reason: not valid java name */
    public static final void m6912PanelView3f6hBDE(final String title, String str, boolean z, boolean z2, long j, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        long themeColor;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str3;
        boolean z6;
        boolean z7;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function3;
        Object objRememberedValue;
        final long j2;
        final boolean z9;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        final String str4;
        final boolean z10;
        final boolean z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2052453494);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PanelView)P(6,2,3,5,1:c#ui.graphics.Color,4)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 112) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
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
                        z5 = z2;
                        if (composerStartRestartGroup.changed(z5)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            themeColor = j;
                            if (composerStartRestartGroup.changed(themeColor)) {
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
                            if (composerStartRestartGroup.changed(z3)) {
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
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i14 != 0) {
                                str3 = "";
                            } else {
                                str3 = str2;
                            }
                            if (i4 != 0) {
                                z6 = false;
                            } else {
                                z6 = z4;
                            }
                            if (i6 != 0) {
                                z7 = false;
                            } else {
                                z7 = z5;
                            }
                            if (i8 != 0) {
                                themeColor = ColorKt.getThemeColor();
                            }
                            if (i10 != 0) {
                                z8 = false;
                            } else {
                                z8 = z3;
                            }
                            if (i12 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) objRememberedValue;
                            final int i15 = i3;
                            final boolean z12 = z7;
                            final long j3 = themeColor;
                            final boolean z13 = z6;
                            final Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                            final String str5 = str3;
                            GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                public final void invoke(Composer composer2, int i16) {
                                    int i17;
                                    Composer composer3;
                                    if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-781912423, i16, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                        }
                                        if (z12) {
                                            composer2.startReplaceableGroup(-106713881);
                                            long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState), Color.m3745boximpl(j3), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                            long sp = TextUnitKt.getSp(12);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            final MutableState<Boolean> mutableState2 = mutableState;
                                            composer2.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                            boolean zChanged = composer2.changed(mutableState2);
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        MutableState<Boolean> mutableState3 = mutableState2;
                                                        PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState3, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState3));
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer2.endReplaceableGroup();
                                            TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i15 & 14) | 3072, 0, 131056);
                                            composer2.endReplaceableGroup();
                                            composer3 = composer2;
                                            i17 = 0;
                                        } else {
                                            composer2.startReplaceableGroup(-106713711);
                                            Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                            final MutableState<Boolean> mutableState3 = mutableState;
                                            composer2.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                            boolean zChanged2 = composer2.changed(mutableState3);
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        MutableState<Boolean> mutableState4 = mutableState3;
                                                        PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState4, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4));
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceableGroup();
                                            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            String str6 = title;
                                            long j4 = j3;
                                            int i18 = i15;
                                            MutableState<Boolean> mutableState4 = mutableState;
                                            composer2.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            TextKt.m2471Text4IGK_g(str6, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4), Color.m3745boximpl(j4), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i18 & 14, 0, 131066);
                                            i17 = 0;
                                            composer3 = composer2;
                                            IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4), Color.m3745boximpl(j4), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        }
                                        if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState)) {
                                            float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z12, Dp.m6095boximpl(Dp.m6097constructorimpl(i17)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                            boolean z14 = z13;
                                            final Function2<Composer, Integer, Unit> function6 = function5;
                                            final String str7 = str5;
                                            final int i19 = i15;
                                            final boolean z15 = z12;
                                            GroupViewKt.m6850GroupViewfIyqwc(null, z14, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i20) {
                                                    Composer composer5 = composer4;
                                                    if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                        }
                                                        if (function6 == null) {
                                                            composer5.startReplaceableGroup(1212687136);
                                                            List listSplit$default = StringsKt.split$default((CharSequence) str7, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                            boolean z16 = z15;
                                                            Iterator it = listSplit$default.iterator();
                                                            while (it.hasNext()) {
                                                                TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z16, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                                composer5 = composer4;
                                                                z16 = z16;
                                                            }
                                                            composer4.endReplaceableGroup();
                                                        } else {
                                                            composer5.startReplaceableGroup(1212687399);
                                                            function6.invoke(composer5, Integer.valueOf((i19 >> 18) & 14));
                                                            composer4.endReplaceableGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer2, 100663296 | ((i15 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i15 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j2 = themeColor;
                            z9 = z8;
                            function4 = function3;
                            str4 = str3;
                            z10 = z6;
                            z11 = z7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z9 = z3;
                            str4 = str2;
                            z10 = z4;
                            z11 = z5;
                            j2 = themeColor;
                            function4 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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
                                PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    themeColor = j;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
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
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState2 = (MutableState) objRememberedValue;
                        final int i16 = i3;
                        final boolean z14 = z7;
                        final long j4 = themeColor;
                        final boolean z15 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                        final String str6 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i17) {
                                int i18;
                                Composer composer3;
                                if ((i17 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i17, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z14) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState2), Color.m3745boximpl(j4), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState3 = mutableState2;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState3);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState4 = mutableState3;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState4, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i16 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i18 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState4 = mutableState2;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState4);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState5 = mutableState4;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState5, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str7 = title;
                                        long j5 = j4;
                                        int i19 = i16;
                                        MutableState<Boolean> mutableState5 = mutableState2;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str7, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5), Color.m3745boximpl(j5), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i19 & 14, 0, 131066);
                                        i18 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5), Color.m3745boximpl(j5), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState2)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z14, Dp.m6095boximpl(Dp.m6097constructorimpl(i18)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z16 = z15;
                                        final Function2<? super Composer, ? super Integer, Unit> function7 = function6;
                                        final String str8 = str6;
                                        final int i110 = i16;
                                        final boolean z17 = z14;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z16, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function7 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str8, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z18 = z17;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z18, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z18 = z18;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function7.invoke(composer5, Integer.valueOf((i110 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i16 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i16 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    } else {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState3 = (MutableState) objRememberedValue;
                        final int i17 = i3;
                        final boolean z16 = z7;
                        final long j5 = themeColor;
                        final boolean z17 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function7 = function3;
                        final String str7 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i18) {
                                int i19;
                                Composer composer3;
                                if ((i18 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i18, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z16) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState3), Color.m3745boximpl(j5), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState4 = mutableState3;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState4);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState5 = mutableState4;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState5, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i17 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i19 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState5 = mutableState3;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState5);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState6 = mutableState5;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState6, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str8 = title;
                                        long j6 = j5;
                                        int i110 = i17;
                                        MutableState<Boolean> mutableState6 = mutableState3;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str8, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6), Color.m3745boximpl(j6), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i110 & 14, 0, 131066);
                                        i19 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6), Color.m3745boximpl(j6), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState3)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z16, Dp.m6095boximpl(Dp.m6097constructorimpl(i19)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z18 = z17;
                                        final Function2<? super Composer, ? super Integer, Unit> function8 = function7;
                                        final String str9 = str7;
                                        final int i111 = i17;
                                        final boolean z19 = z16;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z18, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function8 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str9, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z110 = z19;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z110, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z110 = z110;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function8.invoke(composer5, Integer.valueOf((i111 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i17 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i17 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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

                        public final void invoke(Composer composer2, int i18) {
                            PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                z5 = z2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        themeColor = j;
                        if (composerStartRestartGroup.changed(themeColor)) {
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
                        if (composerStartRestartGroup.changed(z3)) {
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
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState4 = (MutableState) objRememberedValue;
                        final int i18 = i3;
                        final boolean z18 = z7;
                        final long j6 = themeColor;
                        final boolean z19 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                        final String str8 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i19) {
                                int i110;
                                Composer composer3;
                                if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i19, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z18) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4), Color.m3745boximpl(j6), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState5 = mutableState4;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState5);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState6 = mutableState5;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState6, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i18 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i110 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState6 = mutableState4;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState6);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState7 = mutableState6;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState7, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str9 = title;
                                        long j7 = j6;
                                        int i111 = i18;
                                        MutableState<Boolean> mutableState7 = mutableState4;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str9, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7), Color.m3745boximpl(j7), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i111 & 14, 0, 131066);
                                        i110 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7), Color.m3745boximpl(j7), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState4)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z18, Dp.m6095boximpl(Dp.m6097constructorimpl(i110)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z110 = z19;
                                        final Function2<? super Composer, ? super Integer, Unit> function9 = function8;
                                        final String str10 = str8;
                                        final int i112 = i18;
                                        final boolean z111 = z18;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z110, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function9 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str10, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z112 = z111;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z112, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z112 = z112;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function9.invoke(composer5, Integer.valueOf((i112 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i18 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i18 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    } else {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState5 = (MutableState) objRememberedValue;
                        final int i19 = i3;
                        final boolean z110 = z7;
                        final long j7 = themeColor;
                        final boolean z111 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function9 = function3;
                        final String str9 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i110) {
                                int i111;
                                Composer composer3;
                                if ((i110 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i110, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z110) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5), Color.m3745boximpl(j7), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState6 = mutableState5;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState6);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState7 = mutableState6;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState7, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i19 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i111 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState7 = mutableState5;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState7);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState8 = mutableState7;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState8, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str10 = title;
                                        long j8 = j7;
                                        int i112 = i19;
                                        MutableState<Boolean> mutableState8 = mutableState5;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str10, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8), Color.m3745boximpl(j8), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i112 & 14, 0, 131066);
                                        i111 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8), Color.m3745boximpl(j8), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState5)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z110, Dp.m6095boximpl(Dp.m6097constructorimpl(i111)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z112 = z111;
                                        final Function2<? super Composer, ? super Integer, Unit> function10 = function9;
                                        final String str11 = str9;
                                        final int i113 = i19;
                                        final boolean z113 = z110;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z112, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function10 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str11, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z114 = z113;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z114, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z114 = z114;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function10.invoke(composer5, Integer.valueOf((i113 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i19 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i19 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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
                            PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                themeColor = j;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
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
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState6 = (MutableState) objRememberedValue;
                    final int i110 = i3;
                    final boolean z112 = z7;
                    final long j8 = themeColor;
                    final boolean z113 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function10 = function3;
                    final String str10 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i111) {
                            int i112;
                            Composer composer3;
                            if ((i111 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i111, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z112) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6), Color.m3745boximpl(j8), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState7 = mutableState6;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState7);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState8 = mutableState7;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState8, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i110 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i112 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState8 = mutableState6;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState8);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState9 = mutableState8;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState9, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str11 = title;
                                    long j9 = j8;
                                    int i113 = i110;
                                    MutableState<Boolean> mutableState9 = mutableState6;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str11, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9), Color.m3745boximpl(j9), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i113 & 14, 0, 131066);
                                    i112 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9), Color.m3745boximpl(j9), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState6)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z112, Dp.m6095boximpl(Dp.m6097constructorimpl(i112)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z114 = z113;
                                    final Function2<? super Composer, ? super Integer, Unit> function11 = function10;
                                    final String str12 = str10;
                                    final int i114 = i110;
                                    final boolean z115 = z112;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z114, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function11 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str12, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z116 = z115;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z116, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z116 = z116;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function11.invoke(composer5, Integer.valueOf((i114 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i110 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i110 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                } else {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState7 = (MutableState) objRememberedValue;
                    final int i111 = i3;
                    final boolean z114 = z7;
                    final long j9 = themeColor;
                    final boolean z115 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function11 = function3;
                    final String str11 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i112) {
                            int i113;
                            Composer composer3;
                            if ((i112 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i112, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z114) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7), Color.m3745boximpl(j9), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState8 = mutableState7;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState8);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState9 = mutableState8;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState9, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i111 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i113 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState9 = mutableState7;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState9);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState10 = mutableState9;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState10, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str12 = title;
                                    long j10 = j9;
                                    int i114 = i111;
                                    MutableState<Boolean> mutableState10 = mutableState7;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str12, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10), Color.m3745boximpl(j10), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i114 & 14, 0, 131066);
                                    i113 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10), Color.m3745boximpl(j10), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState7)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z114, Dp.m6095boximpl(Dp.m6097constructorimpl(i113)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z116 = z115;
                                    final Function2<? super Composer, ? super Integer, Unit> function12 = function11;
                                    final String str13 = str11;
                                    final int i115 = i111;
                                    final boolean z117 = z114;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z116, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function12 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str13, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z118 = z117;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z118, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z118 = z118;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function12.invoke(composer5, Integer.valueOf((i115 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i111 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i111 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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

                    public final void invoke(Composer composer2, int i112) {
                        PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            z4 = z;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        themeColor = j;
                        if (composerStartRestartGroup.changed(themeColor)) {
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
                        if (composerStartRestartGroup.changed(z3)) {
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
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState8 = (MutableState) objRememberedValue;
                        final int i112 = i3;
                        final boolean z116 = z7;
                        final long j10 = themeColor;
                        final boolean z117 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function12 = function3;
                        final String str12 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i113) {
                                int i114;
                                Composer composer3;
                                if ((i113 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i113, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z116) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8), Color.m3745boximpl(j10), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState9 = mutableState8;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState9);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState10 = mutableState9;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState10, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i112 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i114 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState10 = mutableState8;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState10);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState11 = mutableState10;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState11, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str13 = title;
                                        long j11 = j10;
                                        int i115 = i112;
                                        MutableState<Boolean> mutableState11 = mutableState8;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str13, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11), Color.m3745boximpl(j11), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i115 & 14, 0, 131066);
                                        i114 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11), Color.m3745boximpl(j11), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState8)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z116, Dp.m6095boximpl(Dp.m6097constructorimpl(i114)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z118 = z117;
                                        final Function2<? super Composer, ? super Integer, Unit> function13 = function12;
                                        final String str14 = str12;
                                        final int i116 = i112;
                                        final boolean z119 = z116;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z118, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function13 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str14, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z1110 = z119;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z1110, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z1110 = z1110;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function13.invoke(composer5, Integer.valueOf((i116 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i112 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i112 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    } else {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState9 = (MutableState) objRememberedValue;
                        final int i113 = i3;
                        final boolean z118 = z7;
                        final long j11 = themeColor;
                        final boolean z119 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function13 = function3;
                        final String str13 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i114) {
                                int i115;
                                Composer composer3;
                                if ((i114 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i114, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z118) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9), Color.m3745boximpl(j11), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState10 = mutableState9;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState10);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState11 = mutableState10;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState11, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i113 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i115 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState11 = mutableState9;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState11);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState12 = mutableState11;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState12, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str14 = title;
                                        long j12 = j11;
                                        int i116 = i113;
                                        MutableState<Boolean> mutableState12 = mutableState9;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str14, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12), Color.m3745boximpl(j12), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i116 & 14, 0, 131066);
                                        i115 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12), Color.m3745boximpl(j12), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState9)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z118, Dp.m6095boximpl(Dp.m6097constructorimpl(i115)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z1110 = z119;
                                        final Function2<? super Composer, ? super Integer, Unit> function14 = function13;
                                        final String str15 = str13;
                                        final int i117 = i113;
                                        final boolean z1111 = z118;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z1110, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function14 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str15, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z1112 = z1111;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z1112, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z1112 = z1112;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function14.invoke(composer5, Integer.valueOf((i117 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i113 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i113 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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
                            PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= CpioConstants.C_ISBLK;
                themeColor = j;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
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
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState10 = (MutableState) objRememberedValue;
                    final int i114 = i3;
                    final boolean z1110 = z7;
                    final long j12 = themeColor;
                    final boolean z1111 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function14 = function3;
                    final String str14 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i115) {
                            int i116;
                            Composer composer3;
                            if ((i115 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i115, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z1110) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10), Color.m3745boximpl(j12), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState11 = mutableState10;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState11);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState12 = mutableState11;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState12, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i114 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i116 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState12 = mutableState10;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState12);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState13 = mutableState12;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState13, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str15 = title;
                                    long j13 = j12;
                                    int i117 = i114;
                                    MutableState<Boolean> mutableState13 = mutableState10;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str15, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13), Color.m3745boximpl(j13), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i117 & 14, 0, 131066);
                                    i116 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13), Color.m3745boximpl(j13), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState10)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z1110, Dp.m6095boximpl(Dp.m6097constructorimpl(i116)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z1112 = z1111;
                                    final Function2<? super Composer, ? super Integer, Unit> function15 = function14;
                                    final String str16 = str14;
                                    final int i118 = i114;
                                    final boolean z1113 = z1110;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z1112, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function15 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str16, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z1114 = z1113;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z1114, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z1114 = z1114;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function15.invoke(composer5, Integer.valueOf((i118 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i114 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i114 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                } else {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState11 = (MutableState) objRememberedValue;
                    final int i115 = i3;
                    final boolean z1112 = z7;
                    final long j13 = themeColor;
                    final boolean z1113 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function15 = function3;
                    final String str15 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i116) {
                            int i117;
                            Composer composer3;
                            if ((i116 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i116, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z1112) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11), Color.m3745boximpl(j13), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState12 = mutableState11;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState12);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState13 = mutableState12;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState13, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i115 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i117 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState13 = mutableState11;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState13);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState14 = mutableState13;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState14, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str16 = title;
                                    long j14 = j13;
                                    int i118 = i115;
                                    MutableState<Boolean> mutableState14 = mutableState11;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str16, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14), Color.m3745boximpl(j14), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i118 & 14, 0, 131066);
                                    i117 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14), Color.m3745boximpl(j14), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState11)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z1112, Dp.m6095boximpl(Dp.m6097constructorimpl(i117)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z1114 = z1113;
                                    final Function2<? super Composer, ? super Integer, Unit> function16 = function15;
                                    final String str17 = str15;
                                    final int i119 = i115;
                                    final boolean z1115 = z1112;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z1114, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function16 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str17, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z1116 = z1115;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z1116, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z1116 = z1116;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function16.invoke(composer5, Integer.valueOf((i119 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i115 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i115 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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

                    public final void invoke(Composer composer2, int i116) {
                        PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z5 = z2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    themeColor = j;
                    if (composerStartRestartGroup.changed(themeColor)) {
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
                    if (composerStartRestartGroup.changed(z3)) {
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
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((i3 & 2995931) == 599186) {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState12 = (MutableState) objRememberedValue;
                    final int i116 = i3;
                    final boolean z1114 = z7;
                    final long j14 = themeColor;
                    final boolean z1115 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function16 = function3;
                    final String str16 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i117) {
                            int i118;
                            Composer composer3;
                            if ((i117 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i117, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z1114) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12), Color.m3745boximpl(j14), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState13 = mutableState12;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState13);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState14 = mutableState13;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState14, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i116 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i118 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState14 = mutableState12;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState14);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState15 = mutableState14;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState15, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str17 = title;
                                    long j15 = j14;
                                    int i119 = i116;
                                    MutableState<Boolean> mutableState15 = mutableState12;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str17, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15), Color.m3745boximpl(j15), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i119 & 14, 0, 131066);
                                    i118 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15), Color.m3745boximpl(j15), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState12)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z1114, Dp.m6095boximpl(Dp.m6097constructorimpl(i118)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z1116 = z1115;
                                    final Function2<? super Composer, ? super Integer, Unit> function17 = function16;
                                    final String str18 = str16;
                                    final int i1110 = i116;
                                    final boolean z1117 = z1114;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z1116, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function17 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str18, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z1118 = z1117;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z1118, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z1118 = z1118;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function17.invoke(composer5, Integer.valueOf((i1110 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i116 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i116 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                } else {
                    if (i14 != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        z7 = false;
                    } else {
                        z7 = z5;
                    }
                    if (i8 != 0) {
                        themeColor = ColorKt.getThemeColor();
                    }
                    if (i10 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i12 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<Boolean> mutableState13 = (MutableState) objRememberedValue;
                    final int i117 = i3;
                    final boolean z1116 = z7;
                    final long j15 = themeColor;
                    final boolean z1117 = z6;
                    final Function2<? super Composer, ? super Integer, Unit> function17 = function3;
                    final String str17 = str3;
                    GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        public final void invoke(Composer composer2, int i118) {
                            int i119;
                            Composer composer3;
                            if ((i118 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-781912423, i118, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                }
                                if (z1116) {
                                    composer2.startReplaceableGroup(-106713881);
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13), Color.m3745boximpl(j15), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                    long sp = TextUnitKt.getSp(12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState14 = mutableState13;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer2.changed(mutableState14);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState15 = mutableState14;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState15, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i117 & 14) | 3072, 0, 131056);
                                    composer2.endReplaceableGroup();
                                    composer3 = composer2;
                                    i119 = 0;
                                } else {
                                    composer2.startReplaceableGroup(-106713711);
                                    Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                    final MutableState<Boolean> mutableState15 = mutableState13;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer2.changed(mutableState15);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<Boolean> mutableState16 = mutableState15;
                                                PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState16, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    String str18 = title;
                                    long j16 = j15;
                                    int i1110 = i117;
                                    MutableState<Boolean> mutableState16 = mutableState13;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                    Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m2471Text4IGK_g(str18, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16), Color.m3745boximpl(j16), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i1110 & 14, 0, 131066);
                                    i119 = 0;
                                    composer3 = composer2;
                                    IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16), Color.m3745boximpl(j16), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState13)) {
                                    float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z1116, Dp.m6095boximpl(Dp.m6097constructorimpl(i119)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                    boolean z1118 = z1117;
                                    final Function2<? super Composer, ? super Integer, Unit> function18 = function17;
                                    final String str19 = str17;
                                    final int i1111 = i117;
                                    final boolean z1119 = z1116;
                                    GroupViewKt.m6850GroupViewfIyqwc(null, z1118, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            Composer composer5 = composer4;
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                }
                                                if (function18 == null) {
                                                    composer5.startReplaceableGroup(1212687136);
                                                    List listSplit$default = StringsKt.split$default((CharSequence) str19, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                    boolean z11110 = z1119;
                                                    Iterator it = listSplit$default.iterator();
                                                    while (it.hasNext()) {
                                                        TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z11110, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                        composer5 = composer4;
                                                        z11110 = z11110;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                } else {
                                                    composer5.startReplaceableGroup(1212687399);
                                                    function18.invoke(composer5, Integer.valueOf((i1111 >> 18) & 14));
                                                    composer4.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 100663296 | ((i117 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i117 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j2 = themeColor;
                    z9 = z8;
                    function4 = function3;
                    str4 = str3;
                    z10 = z6;
                    z11 = z7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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
                        PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            themeColor = j;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
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
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((i3 & 2995931) == 599186) {
                if (i14 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                }
                if (i10 != 0) {
                    z8 = false;
                } else {
                    z8 = z3;
                }
                if (i12 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableState<Boolean> mutableState14 = (MutableState) objRememberedValue;
                final int i118 = i3;
                final boolean z1118 = z7;
                final long j16 = themeColor;
                final boolean z1119 = z6;
                final Function2<? super Composer, ? super Integer, Unit> function18 = function3;
                final String str18 = str3;
                GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void invoke(Composer composer2, int i119) {
                        int i1110;
                        Composer composer3;
                        if ((i119 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-781912423, i119, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                            }
                            if (z1118) {
                                composer2.startReplaceableGroup(-106713881);
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14), Color.m3745boximpl(j16), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                long sp = TextUnitKt.getSp(12);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState15 = mutableState14;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged = composer2.changed(mutableState15);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<Boolean> mutableState16 = mutableState15;
                                            PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState16, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i118 & 14) | 3072, 0, 131056);
                                composer2.endReplaceableGroup();
                                composer3 = composer2;
                                i1110 = 0;
                            } else {
                                composer2.startReplaceableGroup(-106713711);
                                Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                final MutableState<Boolean> mutableState16 = mutableState14;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(mutableState16);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<Boolean> mutableState17 = mutableState16;
                                            PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState17, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                String str19 = title;
                                long j17 = j16;
                                int i1111 = i118;
                                MutableState<Boolean> mutableState17 = mutableState14;
                                composer2.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m2471Text4IGK_g(str19, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17), Color.m3745boximpl(j17), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i1111 & 14, 0, 131066);
                                i1110 = 0;
                                composer3 = composer2;
                                IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17), Color.m3745boximpl(j17), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState14)) {
                                float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z1118, Dp.m6095boximpl(Dp.m6097constructorimpl(i1110)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                boolean z11110 = z1119;
                                final Function2<? super Composer, ? super Integer, Unit> function19 = function18;
                                final String str110 = str18;
                                final int i1112 = i118;
                                final boolean z11111 = z1118;
                                GroupViewKt.m6850GroupViewfIyqwc(null, z11110, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i20) {
                                        Composer composer5 = composer4;
                                        if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                            }
                                            if (function19 == null) {
                                                composer5.startReplaceableGroup(1212687136);
                                                List listSplit$default = StringsKt.split$default((CharSequence) str110, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                boolean z11112 = z11111;
                                                Iterator it = listSplit$default.iterator();
                                                while (it.hasNext()) {
                                                    TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z11112, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                    composer5 = composer4;
                                                    z11112 = z11112;
                                                }
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer5.startReplaceableGroup(1212687399);
                                                function19.invoke(composer5, Integer.valueOf((i1112 >> 18) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer2, 100663296 | ((i118 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i118 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j2 = themeColor;
                z9 = z8;
                function4 = function3;
                str4 = str3;
                z10 = z6;
                z11 = z7;
            } else {
                if (i14 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    z7 = false;
                } else {
                    z7 = z5;
                }
                if (i8 != 0) {
                    themeColor = ColorKt.getThemeColor();
                }
                if (i10 != 0) {
                    z8 = false;
                } else {
                    z8 = z3;
                }
                if (i12 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final MutableState<Boolean> mutableState15 = (MutableState) objRememberedValue;
                final int i119 = i3;
                final boolean z11110 = z7;
                final long j17 = themeColor;
                final boolean z11111 = z6;
                final Function2<? super Composer, ? super Integer, Unit> function19 = function3;
                final String str19 = str3;
                GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void invoke(Composer composer2, int i1110) {
                        int i1111;
                        Composer composer3;
                        if ((i1110 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-781912423, i1110, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                            }
                            if (z11110) {
                                composer2.startReplaceableGroup(-106713881);
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15), Color.m3745boximpl(j17), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                long sp = TextUnitKt.getSp(12);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState16 = mutableState15;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged = composer2.changed(mutableState16);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<Boolean> mutableState17 = mutableState16;
                                            PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState17, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i119 & 14) | 3072, 0, 131056);
                                composer2.endReplaceableGroup();
                                composer3 = composer2;
                                i1111 = 0;
                            } else {
                                composer2.startReplaceableGroup(-106713711);
                                Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                final MutableState<Boolean> mutableState17 = mutableState15;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer2.changed(mutableState17);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<Boolean> mutableState18 = mutableState17;
                                            PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState18, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState18));
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                String str110 = title;
                                long j18 = j17;
                                int i1112 = i119;
                                MutableState<Boolean> mutableState18 = mutableState15;
                                composer2.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m2471Text4IGK_g(str110, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState18), Color.m3745boximpl(j18), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i1112 & 14, 0, 131066);
                                i1111 = 0;
                                composer3 = composer2;
                                IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState18), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState18), Color.m3745boximpl(j18), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState15)) {
                                float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z11110, Dp.m6095boximpl(Dp.m6097constructorimpl(i1111)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                boolean z11112 = z11111;
                                final Function2<? super Composer, ? super Integer, Unit> function110 = function19;
                                final String str111 = str19;
                                final int i1113 = i119;
                                final boolean z11113 = z11110;
                                GroupViewKt.m6850GroupViewfIyqwc(null, z11112, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i20) {
                                        Composer composer5 = composer4;
                                        if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                            }
                                            if (function110 == null) {
                                                composer5.startReplaceableGroup(1212687136);
                                                List listSplit$default = StringsKt.split$default((CharSequence) str111, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                boolean z11114 = z11113;
                                                Iterator it = listSplit$default.iterator();
                                                while (it.hasNext()) {
                                                    TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z11114, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                    composer5 = composer4;
                                                    z11114 = z11114;
                                                }
                                                composer4.endReplaceableGroup();
                                            } else {
                                                composer5.startReplaceableGroup(1212687399);
                                                function110.invoke(composer5, Integer.valueOf((i1113 >> 18) & 14));
                                                composer4.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer2, 100663296 | ((i119 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i119 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j2 = themeColor;
                z9 = z8;
                function4 = function3;
                str4 = str3;
                z10 = z6;
                z11 = z7;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$2
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

                public final void invoke(Composer composer2, int i1110) {
                    PanelViewKt.m6912PanelView3f6hBDE(title, str4, z10, z11, j2, z9, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        str2 = str;
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
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        themeColor = j;
                        if (composerStartRestartGroup.changed(themeColor)) {
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
                        if (composerStartRestartGroup.changed(z3)) {
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
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 2995931) == 599186) {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState16 = (MutableState) objRememberedValue;
                        final int i1110 = i3;
                        final boolean z11112 = z7;
                        final long j18 = themeColor;
                        final boolean z11113 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function3;
                        final String str110 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i1111) {
                                int i1112;
                                Composer composer3;
                                if ((i1111 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i1111, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z11112) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16), Color.m3745boximpl(j18), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState17 = mutableState16;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState17);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState18 = mutableState17;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState18, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState18));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1110 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i1112 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106713711);
                                        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(6));
                                        final MutableState<Boolean> mutableState18 = mutableState16;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer2.changed(mutableState18);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState19 = mutableState18;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState19, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState19));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(SizeKt.m602height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null), 0.0f, 1, null), Dp.m6097constructorimpl(38)), Dp.m6097constructorimpl(15), Dp.m6097constructorimpl(5));
                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        String str111 = title;
                                        long j19 = j18;
                                        int i1113 = i1110;
                                        MutableState<Boolean> mutableState19 = mutableState16;
                                        composer2.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM568paddingVpY3zN4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                                        Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m2471Text4IGK_g(str111, (Modifier) null, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState19), Color.m3745boximpl(j19), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i1113 & 14, 0, 131066);
                                        i1112 = 0;
                                        composer3 = composer2;
                                        IconViewKt.m6909IconViewRidXid8(((Number) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState19), Integer.valueOf(IconFont.down), Integer.valueOf(IconFont.right))).intValue(), 0L, ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState19), Color.m3745boximpl(j19), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | 0).getTertiary()))).m3765unboximpl(), false, null, composer2, 0, 26);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState16)) {
                                        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(z11112, Dp.m6095boximpl(Dp.m6097constructorimpl(i1112)), Dp.m6095boximpl(Dp.m6097constructorimpl(15)))).m6111unboximpl();
                                        boolean z11114 = z11113;
                                        final Function2<? super Composer, ? super Integer, Unit> function111 = function110;
                                        final String str112 = str110;
                                        final int i1114 = i1110;
                                        final boolean z11115 = z11112;
                                        GroupViewKt.m6850GroupViewfIyqwc(null, z11114, false, 0.0f, 0.0f, fM6111unboximpl, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composer3, -1323590826, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                Composer composer5 = composer4;
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1323590826, i20, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous>.<anonymous> (PanelView.kt:57)");
                                                    }
                                                    if (function111 == null) {
                                                        composer5.startReplaceableGroup(1212687136);
                                                        List listSplit$default = StringsKt.split$default((CharSequence) str112, new String[]{"\n"}, false, 0, 6, (Object) null);
                                                        boolean z11116 = z11115;
                                                        Iterator it = listSplit$default.iterator();
                                                        while (it.hasNext()) {
                                                            TextKt.m2471Text4IGK_g((String) it.next(), (Modifier) null, ((Color) CommonToolKt.ifv(z11116, Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable | 0).getPrimary()))).m3765unboximpl(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                                            CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(3), composer4, 6, 0);
                                                            composer5 = composer4;
                                                            z11116 = z11116;
                                                        }
                                                        composer4.endReplaceableGroup();
                                                    } else {
                                                        composer5.startReplaceableGroup(1212687399);
                                                        function111.invoke(composer5, Integer.valueOf((i1114 >> 18) & 14));
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer2, 100663296 | ((i1110 >> 3) & 112), MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_DECODER_ERROR);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i1110 >> 3) & 112) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = themeColor;
                        z9 = z8;
                        function4 = function3;
                        str4 = str3;
                        z10 = z6;
                        z11 = z7;
                    } else {
                        if (i14 != 0) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            z7 = false;
                        } else {
                            z7 = z5;
                        }
                        if (i8 != 0) {
                            themeColor = ColorKt.getThemeColor();
                        }
                        if (i10 != 0) {
                            z8 = false;
                        } else {
                            z8 = z3;
                        }
                        if (i12 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2052453494, i3, -1, "cn.jianyun.workplan.ui.component.nav.PanelView (PanelView.kt:29)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<Boolean> mutableState17 = (MutableState) objRememberedValue;
                        final int i1111 = i3;
                        final boolean z11114 = z7;
                        final long j19 = themeColor;
                        final boolean z11115 = z6;
                        final Function2<? super Composer, ? super Integer, Unit> function111 = function3;
                        final String str111 = str3;
                        GroupViewKt.m6852ZeroGroupViewKz89ssw(0.0f, z6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -781912423, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1
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

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final void invoke(Composer composer2, int i1112) {
                                int i1113;
                                Composer composer3;
                                if ((i1112 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-781912423, i1112, -1, "cn.jianyun.workplan.ui.component.nav.PanelView.<anonymous> (PanelView.kt:35)");
                                    }
                                    if (z11114) {
                                        composer2.startReplaceableGroup(-106713881);
                                        long jM3765unboximpl = ((Color) CommonToolKt.ifv(PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState17), Color.m3745boximpl(j19), Color.m3745boximpl(Color.INSTANCE.m3785getGray0d7_KjU()))).m3765unboximpl();
                                        long sp = TextUnitKt.getSp(12);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        final MutableState<Boolean> mutableState18 = mutableState17;
                                        composer2.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                        boolean zChanged = composer2.changed(mutableState18);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.PanelViewKt$PanelView$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<Boolean> mutableState19 = mutableState18;
                                                    PanelViewKt.PanelView_3f6hBDE$lambda$2(mutableState19, !PanelViewKt.PanelView_3f6hBDE$lambda$1(mutableState19));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(title, ButtonViewKt.tap(companion, (Function0) objRememberedValue2), jM3765unboximpl, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1111 & 14) | 3072, 0, 131056);
                                        composer2.endReplaceableGroup();
                                        composer3 = composer2;
                                        i1113 = 0;
                                    } else {
                                        composer2.startReplaceableGroup(-106

... [truncated: exceeds 400000 bytes, total 732700 bytes]