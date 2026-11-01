package cn.jianyun.workplan.ui.component.nav;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.compose.DialogNavigator;
import androidx.profileinstaller.ProfileVerifier;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.form.GroupViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.vm.AppViewModel;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: SwipeRowView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aß\u0001\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u00160\u00132 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u00162$\b\u0002\u0010\u0018\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u00160\u00132 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u00162\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"SwipeDeleteView", "", DialogNavigator.NAME, "", "sid", "", "onEdit", "Lkotlin/Function0;", "onDelete", "deleteMessage", "content", "Landroidx/compose/runtime/Composable;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SwipeRowView", "modifier", "Landroidx/compose/ui/Modifier;", "actionWidth", "Landroidx/compose/ui/unit/Dp;", "startAction", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "startFillAction", "endAction", "endFillAction", "SwipeRowView-UR9CgXA", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;FLjava/util/List;Lkotlin/jvm/functions/Function3;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwipeRowViewKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0167  */
    /* JADX WARN: Code duplicated, block: B:103:0x017e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:110:0x020c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0255  */
    /* JADX WARN: Code duplicated, block: B:117:0x0263  */
    /* JADX WARN: Code duplicated, block: B:120:0x0337  */
    /* JADX WARN: Code duplicated, block: B:123:0x0343  */
    /* JADX WARN: Code duplicated, block: B:124:0x0347  */
    /* JADX WARN: Code duplicated, block: B:127:0x036c  */
    /* JADX WARN: Code duplicated, block: B:129:0x037a  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0444  */
    /* JADX WARN: Code duplicated, block: B:141:0x0450  */
    /* JADX WARN: Code duplicated, block: B:142:0x0454  */
    /* JADX WARN: Code duplicated, block: B:145:0x0479  */
    /* JADX WARN: Code duplicated, block: B:147:0x0487  */
    /* JADX WARN: Code duplicated, block: B:151:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x056b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0577  */
    /* JADX WARN: Code duplicated, block: B:158:0x057b  */
    /* JADX WARN: Code duplicated, block: B:161:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:168:0x060e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0616  */
    /* JADX WARN: Code duplicated, block: B:173:0x068e  */
    /* JADX WARN: Code duplicated, block: B:176:0x069a  */
    /* JADX WARN: Code duplicated, block: B:177:0x069e  */
    /* JADX WARN: Code duplicated, block: B:180:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:182:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:187:0x0732  */
    /* JADX WARN: Code duplicated, block: B:189:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:192:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:193:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:196:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:198:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:202:0x0850  */
    /* JADX WARN: Code duplicated, block: B:204:0x0858  */
    /* JADX WARN: Code duplicated, block: B:207:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:210:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:211:0x08be  */
    /* JADX WARN: Code duplicated, block: B:214:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:216:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:219:0x0952  */
    /* JADX WARN: Code duplicated, block: B:224:0x0965  */
    /* JADX WARN: Code duplicated, block: B:226:0x097b  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26, types: [T, androidx.lifecycle.ViewModel] */
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
    /* JADX INFO: renamed from: SwipeRowView-UR9CgXA, reason: not valid java name */
    public static final void m6918SwipeRowViewUR9CgXA(String str, Modifier modifier, final float f2, List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final String str2;
        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> listEmptyList;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function6;
        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> listEmptyList2;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function7;
        Density density;
        final float fMo318toPx0680j_4;
        final Ref.ObjectRef objectRef;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function8;
        final float size;
        final float size2;
        Object objRememberedValue;
        final MutableFloatState mutableFloatState;
        Object objRememberedValue2;
        final MutableFloatState mutableFloatState2;
        final Ref.ObjectRef objectRef2;
        int i12;
        int i13;
        boolean zChanged;
        final Density density2;
        T t;
        String str3;
        String str4;
        int currentCompositeKeyHash;
        String str5;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BoxScopeInstance boxScopeInstance;
        Iterator it;
        final int i14;
        final int i15;
        String str6;
        String str7;
        String str8;
        String str9;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM3285constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Iterator it2;
        final int i16;
        final int i17;
        boolean zChanged2;
        Object objRememberedValue3;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM3285constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function9;
        final Modifier modifier3;
        final List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list3;
        final List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list4;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function10;
        int currentCompositeKeyHash4;
        Function0<ComposeUiNode> constructor4;
        Composer composerM3285constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Function0<ComposeUiNode> constructor5;
        Composer composerM3285constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Function0<ComposeUiNode> constructor6;
        Composer composerM3285constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float f3 = f2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(670141316);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwipeRowView)P(5,4,0:c#ui.unit.Dp,6,7,2,3)");
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i19 = i2 & 2;
        if (i19 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                i3 |= 1024;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 65536;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((i2 & 40) == 40 || (23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        } else {
                            function6 = function5;
                        }
                        if (i8 != 0) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        density = (Density) objConsume;
                        fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                        objectRef = new Ref.ObjectRef();
                        composerStartRestartGroup.startReplaceableGroup(1890788296);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        function8 = function7;
                        ?? ViewModel = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        objectRef.element = ViewModel;
                        ((SwipeViewModel) objectRef.element).tryReload();
                        size = listEmptyList.size() * fMo318toPx0680j_4;
                        int size3 = listEmptyList.size() + 1;
                        size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                        int size4 = listEmptyList2.size() + 1;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        objectRef2 = new Ref.ObjectRef();
                        int i20 = i3;
                        Float fValueOf = Float.valueOf(size);
                        i12 = size4;
                        Float fValueOf2 = Float.valueOf(size2);
                        i13 = size3;
                        Float fValueOf3 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(fValueOf3);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11 = function6;
                            density2 = density;
                            AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                    Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                    DraggableAnchors.at(DragAnchors.Start, (function11 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                    DraggableAnchors.at(DragAnchors.StartFill, (function11 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                    DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                    DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                    DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                                }
                            }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                                public final Float invoke(float f4) {
                                    return Float.valueOf(f4 * 0.5f);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                    return invoke(f4.floatValue());
                                }
                            }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                                }
                            }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(DragAnchors it3) {
                                    Intrinsics.checkNotNullParameter(it3, "it");
                                    CommonToolKt.mlog("move", it3.name());
                                    if (it3 != DragAnchors.Start) {
                                        objectRef.element.change(str2);
                                    }
                                    return true;
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(anchoredDraggableState);
                            t = anchoredDraggableState;
                        } else {
                            density2 = density;
                            t = objRememberedValue4;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        objectRef2.element = t;
                        EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        str5 = str2;
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClipToBounds);
                        Modifier modifier4 = modifier2;
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
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1150648079);
                        it = listEmptyList.iterator();
                        i14 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i21 = i14 + 1;
                            if (i14 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Function3 function12 = (Function3) next;
                            List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list5 = listEmptyList;
                            Iterator it3 = it;
                            Modifier modifierM602height3ABfNKs = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                            final int i22 = i13;
                            Modifier modifierOffset = OffsetKt.offset(modifierM602height3ABfNKs, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                    return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m6919invokeBjo55l4(Density offset) {
                                    int iRoundToInt;
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    float offset2 = objectRef2.element.getOffset();
                                    float f4 = fMo318toPx0680j_4;
                                    if (offset2 <= i22 * f4) {
                                        float f5 = -f4;
                                        float offset3 = objectRef2.element.getOffset();
                                        int i23 = i22;
                                        iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i23) * (i23 - i14)));
                                    } else {
                                        iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                                    }
                                    return IntOffsetKt.IntOffset(iRoundToInt, 0);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            String str10 = str4;
                            constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            String str11 = str3;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            function12.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            str4 = str10;
                            i13 = i22;
                            i14 = i21;
                            it = it3;
                            listEmptyList = list5;
                            str3 = str11;
                            f3 = f2;
                        }
                        i15 = i13;
                        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list6 = listEmptyList;
                        str6 = str4;
                        str7 = str3;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1150647183);
                        if (function6 == null) {
                            str9 = str6;
                            str8 = str7;
                        } else {
                            Modifier modifierOffset2 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                    return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m6920invokeBjo55l4(Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            str8 = str7;
                            ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            str9 = str6;
                            ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1150646402);
                        it2 = listEmptyList2.iterator();
                        i16 = 0;
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i23 = i16 + 1;
                            if (i16 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Function3 function13 = (Function3) next2;
                            Iterator it4 = it2;
                            Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function14 = function6;
                            final int i24 = i12;
                            Modifier modifierOffset3 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                    return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m6921invokeBjo55l4(Density offset) {
                                    int iRoundToInt;
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    float offset2 = objectRef2.element.getOffset();
                                    float f4 = fMo318toPx0680j_4;
                                    if (offset2 >= (-(i24 * f4))) {
                                        float offset3 = objectRef2.element.getOffset();
                                        int i25 = i24;
                                        iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i25) * (i25 - i16)));
                                    } else {
                                        iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                                    }
                                    return IntOffsetKt.IntOffset(iRoundToInt, 0);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOffset3);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            function13.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            i16 = i23;
                            it2 = it4;
                            i12 = i24;
                            function6 = function14;
                        }
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function15 = function6;
                        i17 = i12;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1150645515);
                        if (function8 != null) {
                            Modifier modifierOffset4 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                    return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m6922invokeBjo55l4(Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOffset4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                            Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            Unit unit3 = Unit.INSTANCE;
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                    m6923invokeozmzZPI(intSize.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m6923invokeozmzZPI(long j) {
                                    mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                    mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOffset5 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6924invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOffset5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i20 >> 18) & 112)));
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function9 = function8;
                        modifier3 = modifier4;
                        list3 = listEmptyList2;
                        list4 = list6;
                        function10 = function15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str5 = str;
                        list4 = list;
                        list3 = list2;
                        modifier3 = modifier2;
                        function10 = function5;
                        function9 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str12 = str5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$3
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

                        public final void invoke(Composer composer2, int i25) {
                            SwipeRowViewKt.m6918SwipeRowViewUR9CgXA(str12, modifier3, f2, list4, function10, list3, function9, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i11 = 12582912;
                i3 |= i11;
                if ((i2 & 40) == 40) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function5;
                    }
                    if (i8 != 0) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                    }
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume2;
                    fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                    objectRef = new Ref.ObjectRef();
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory2 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    function8 = function7;
                    ?? ViewModel2 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory2, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = ViewModel2;
                    ((SwipeViewModel) objectRef.element).tryReload();
                    size = listEmptyList.size() * fMo318toPx0680j_4;
                    int size5 = listEmptyList.size() + 1;
                    size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                    int size6 = listEmptyList2.size() + 1;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    objectRef2 = new Ref.ObjectRef();
                    int i25 = i3;
                    Float fValueOf4 = Float.valueOf(size);
                    i12 = size6;
                    Float fValueOf5 = Float.valueOf(size2);
                    i13 = size5;
                    Float fValueOf6 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(fValueOf4) | composerStartRestartGroup.changed(fValueOf5) | composerStartRestartGroup.changed(fValueOf6);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function16 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState2 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function16 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function16 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it5) {
                                Intrinsics.checkNotNullParameter(it5, "it");
                                CommonToolKt.mlog("move", it5.name());
                                if (it5 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState2);
                        t = anchoredDraggableState2;
                    } else {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function17 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState3 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function17 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function17 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it5) {
                                Intrinsics.checkNotNullParameter(it5, "it");
                                CommonToolKt.mlog("move", it5.name());
                                if (it5 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState3);
                        t = anchoredDraggableState3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef2.element = t;
                    EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                    Modifier modifierClipToBounds2 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    str5 = str2;
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierClipToBounds2);
                    Modifier modifier5 = modifier2;
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
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1150648079);
                    it = listEmptyList.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        Object next3 = it.next();
                        int i26 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function18 = (Function3) next3;
                        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list7 = listEmptyList;
                        Iterator it5 = it;
                        Modifier modifierM602height3ABfNKs2 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                        final int i27 = i13;
                        Modifier modifierOffset6 = OffsetKt.offset(modifierM602height3ABfNKs2, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6919invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 <= i27 * f4) {
                                    float f5 = -f4;
                                    float offset3 = objectRef2.element.getOffset();
                                    int i28 = i27;
                                    iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i28) * (i28 - i14)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        String str13 = str4;
                        constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierOffset6);
                        String str14 = str3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl6.getInserting()) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        } else {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function18.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        str4 = str13;
                        i13 = i27;
                        i14 = i26;
                        it = it5;
                        listEmptyList = list7;
                        str3 = str14;
                        f3 = f2;
                    }
                    i15 = i13;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list8 = listEmptyList;
                    str6 = str4;
                    str7 = str3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150647183);
                    if (function6 == null) {
                        str9 = str6;
                        str8 = str7;
                    } else {
                        Modifier modifierOffset7 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6920invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        str8 = str7;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        str9 = str6;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierOffset7);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl2.getInserting()) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        } else {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit5 = Unit.INSTANCE;
                        Unit unit6 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150646402);
                    it2 = listEmptyList2.iterator();
                    i16 = 0;
                    while (it2.hasNext()) {
                        Object next4 = it2.next();
                        int i28 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function19 = (Function3) next4;
                        Iterator it6 = it2;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function110 = function6;
                        final int i29 = i12;
                        Modifier modifierOffset8 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6921invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 >= (-(i29 * f4))) {
                                    float offset3 = objectRef2.element.getOffset();
                                    int i210 = i29;
                                    iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i210) * (i210 - i16)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierOffset8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy10, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl5.getInserting()) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        } else {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function19.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        i16 = i28;
                        it2 = it6;
                        i12 = i29;
                        function6 = function110;
                    }
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function111 = function6;
                    i17 = i12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150645515);
                    if (function8 != null) {
                        Modifier modifierOffset9 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6922invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierOffset9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy11, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl4.getInserting()) {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        } else {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf11.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit7 = Unit.INSTANCE;
                        Unit unit8 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOffset10 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6924invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierOffset10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy12, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl3.getInserting()) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    } else {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf12.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i25 >> 18) & 112)));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function9 = function8;
                    modifier3 = modifier5;
                    list3 = listEmptyList2;
                    list4 = list8;
                    function10 = function111;
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function5;
                    }
                    if (i8 != 0) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                    }
                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume3 = composerStartRestartGroup.consume(localDensity3);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume3;
                    fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                    objectRef = new Ref.ObjectRef();
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory3 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    function8 = function7;
                    ?? ViewModel3 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory3, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = ViewModel3;
                    ((SwipeViewModel) objectRef.element).tryReload();
                    size = listEmptyList.size() * fMo318toPx0680j_4;
                    int size7 = listEmptyList.size() + 1;
                    size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                    int size8 = listEmptyList2.size() + 1;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    objectRef2 = new Ref.ObjectRef();
                    int i210 = i3;
                    Float fValueOf7 = Float.valueOf(size);
                    i12 = size8;
                    Float fValueOf8 = Float.valueOf(size2);
                    i13 = size7;
                    Float fValueOf9 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(fValueOf7) | composerStartRestartGroup.changed(fValueOf8) | composerStartRestartGroup.changed(fValueOf9);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function112 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState4 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function112 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function112 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it7) {
                                Intrinsics.checkNotNullParameter(it7, "it");
                                CommonToolKt.mlog("move", it7.name());
                                if (it7 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState4);
                        t = anchoredDraggableState4;
                    } else {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function113 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState5 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function113 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function113 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it7) {
                                Intrinsics.checkNotNullParameter(it7, "it");
                                CommonToolKt.mlog("move", it7.name());
                                if (it7 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState5);
                        t = anchoredDraggableState5;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef2.element = t;
                    EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                    Modifier modifierClipToBounds3 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    str5 = str2;
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierClipToBounds3);
                    Modifier modifier6 = modifier2;
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
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1150648079);
                    it = listEmptyList.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        Object next5 = it.next();
                        int i211 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function114 = (Function3) next5;
                        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list9 = listEmptyList;
                        Iterator it7 = it;
                        Modifier modifierM602height3ABfNKs3 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                        final int i212 = i13;
                        Modifier modifierOffset11 = OffsetKt.offset(modifierM602height3ABfNKs3, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6919invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 <= i212 * f4) {
                                    float f5 = -f4;
                                    float offset3 = objectRef2.element.getOffset();
                                    int i213 = i212;
                                    iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i213) * (i213 - i14)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        String str15 = str4;
                        constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierOffset11);
                        String str16 = str3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy14, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl6.getInserting()) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        } else {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf14.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function114.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        str4 = str15;
                        i13 = i212;
                        i14 = i211;
                        it = it7;
                        listEmptyList = list9;
                        str3 = str16;
                        f3 = f2;
                    }
                    i15 = i13;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list10 = listEmptyList;
                    str6 = str4;
                    str7 = str3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150647183);
                    if (function6 == null) {
                        str9 = str6;
                        str8 = str7;
                    } else {
                        Modifier modifierOffset12 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6920invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        str8 = str7;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        str9 = str6;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierOffset12);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy15, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap15, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl2.getInserting()) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        } else {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf15.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit9 = Unit.INSTANCE;
                        Unit unit10 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150646402);
                    it2 = listEmptyList2.iterator();
                    i16 = 0;
                    while (it2.hasNext()) {
                        Object next6 = it2.next();
                        int i213 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function115 = (Function3) next6;
                        Iterator it8 = it2;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function116 = function6;
                        final int i214 = i12;
                        Modifier modifierOffset13 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6921invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 >= (-(i214 * f4))) {
                                    float offset3 = objectRef2.element.getOffset();
                                    int i215 = i214;
                                    iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i215) * (i215 - i16)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierOffset13);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy16, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap16, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl5.getInserting()) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        } else {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf16.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function115.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        i16 = i213;
                        it2 = it8;
                        i12 = i214;
                        function6 = function116;
                    }
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function117 = function6;
                    i17 = i12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150645515);
                    if (function8 != null) {
                        Modifier modifierOffset14 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6922invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierOffset14);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy17, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap17, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl4.getInserting()) {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        } else {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf17.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit11 = Unit.INSTANCE;
                        Unit unit12 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOffset15 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion3, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6924invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierOffset15);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy18, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap18, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl3.getInserting()) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    } else {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf18.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i210 >> 18) & 112)));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function9 = function8;
                    modifier3 = modifier6;
                    list3 = listEmptyList2;
                    list4 = list10;
                    function10 = function117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str17 = str5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$3
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

                    public final void invoke(Composer composer2, int i215) {
                        SwipeRowViewKt.m6918SwipeRowViewUR9CgXA(str17, modifier3, f2, list4, function10, list3, function9, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= CpioConstants.C_ISBLK;
            function5 = function3;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 65536;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((i2 & 40) == 40) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function5;
                    }
                    if (i8 != 0) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                    }
                    ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume4 = composerStartRestartGroup.consume(localDensity4);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume4;
                    fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                    objectRef = new Ref.ObjectRef();
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory4 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    function8 = function7;
                    ?? ViewModel4 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory4, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = ViewModel4;
                    ((SwipeViewModel) objectRef.element).tryReload();
                    size = listEmptyList.size() * fMo318toPx0680j_4;
                    int size9 = listEmptyList.size() + 1;
                    size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                    int size10 = listEmptyList2.size() + 1;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    objectRef2 = new Ref.ObjectRef();
                    int i215 = i3;
                    Float fValueOf10 = Float.valueOf(size);
                    i12 = size10;
                    Float fValueOf11 = Float.valueOf(size2);
                    i13 = size9;
                    Float fValueOf12 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(fValueOf10) | composerStartRestartGroup.changed(fValueOf11) | composerStartRestartGroup.changed(fValueOf12);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function118 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState6 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function118 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function118 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it9) {
                                Intrinsics.checkNotNullParameter(it9, "it");
                                CommonToolKt.mlog("move", it9.name());
                                if (it9 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState6);
                        t = anchoredDraggableState6;
                    } else {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function119 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState7 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function119 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function119 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it9) {
                                Intrinsics.checkNotNullParameter(it9, "it");
                                CommonToolKt.mlog("move", it9.name());
                                if (it9 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState7);
                        t = anchoredDraggableState7;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef2.element = t;
                    EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                    Modifier modifierClipToBounds4 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    str5 = str2;
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierClipToBounds4);
                    Modifier modifier7 = modifier2;
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
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1150648079);
                    it = listEmptyList.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        Object next7 = it.next();
                        int i216 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function1110 = (Function3) next7;
                        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list11 = listEmptyList;
                        Iterator it9 = it;
                        Modifier modifierM602height3ABfNKs4 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                        final int i217 = i13;
                        Modifier modifierOffset16 = OffsetKt.offset(modifierM602height3ABfNKs4, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6919invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 <= i217 * f4) {
                                    float f5 = -f4;
                                    float offset3 = objectRef2.element.getOffset();
                                    int i218 = i217;
                                    iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i218) * (i218 - i14)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        String str18 = str4;
                        constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierOffset16);
                        String str19 = str3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap110, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl6.getInserting()) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        } else {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf110.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function1110.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        str4 = str18;
                        i13 = i217;
                        i14 = i216;
                        it = it9;
                        listEmptyList = list11;
                        str3 = str19;
                        f3 = f2;
                    }
                    i15 = i13;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list12 = listEmptyList;
                    str6 = str4;
                    str7 = str3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150647183);
                    if (function6 == null) {
                        str9 = str6;
                        str8 = str7;
                    } else {
                        Modifier modifierOffset17 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6920invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        str8 = str7;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        str9 = str6;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierOffset17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap111, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl2.getInserting()) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        } else {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf111.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit13 = Unit.INSTANCE;
                        Unit unit14 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150646402);
                    it2 = listEmptyList2.iterator();
                    i16 = 0;
                    while (it2.hasNext()) {
                        Object next8 = it2.next();
                        int i218 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function1111 = (Function3) next8;
                        Iterator it10 = it2;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1112 = function6;
                        final int i219 = i12;
                        Modifier modifierOffset18 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6921invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 >= (-(i219 * f4))) {
                                    float offset3 = objectRef2.element.getOffset();
                                    int i2110 = i219;
                                    iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i2110) * (i2110 - i16)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierOffset18);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy112, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap112, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl5.getInserting()) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        } else {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf112.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function1111.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        i16 = i218;
                        it2 = it10;
                        i12 = i219;
                        function6 = function1112;
                    }
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1113 = function6;
                    i17 = i12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150645515);
                    if (function8 != null) {
                        Modifier modifierOffset19 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6922invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierOffset19);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy113, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap113, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl4.getInserting()) {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        } else {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf113.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit15 = Unit.INSTANCE;
                        Unit unit16 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOffset110 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion4, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6924invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierOffset110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy114, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap114, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl3.getInserting()) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    } else {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf114.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i215 >> 18) & 112)));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function9 = function8;
                    modifier3 = modifier7;
                    list3 = listEmptyList2;
                    list4 = list12;
                    function10 = function1113;
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function5;
                    }
                    if (i8 != 0) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                    }
                    ProvidableCompositionLocal<Density> localDensity5 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume5 = composerStartRestartGroup.consume(localDensity5);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume5;
                    fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                    objectRef = new Ref.ObjectRef();
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory5 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    function8 = function7;
                    ?? ViewModel5 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory5, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = ViewModel5;
                    ((SwipeViewModel) objectRef.element).tryReload();
                    size = listEmptyList.size() * fMo318toPx0680j_4;
                    int size11 = listEmptyList.size() + 1;
                    size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                    int size12 = listEmptyList2.size() + 1;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    objectRef2 = new Ref.ObjectRef();
                    int i2110 = i3;
                    Float fValueOf13 = Float.valueOf(size);
                    i12 = size12;
                    Float fValueOf14 = Float.valueOf(size2);
                    i13 = size11;
                    Float fValueOf15 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(fValueOf13) | composerStartRestartGroup.changed(fValueOf14) | composerStartRestartGroup.changed(fValueOf15);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1114 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState8 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function1114 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function1114 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it11) {
                                Intrinsics.checkNotNullParameter(it11, "it");
                                CommonToolKt.mlog("move", it11.name());
                                if (it11 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState8);
                        t = anchoredDraggableState8;
                    } else {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1115 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState9 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function1115 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function1115 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                                DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                            }
                        }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                            public final Float invoke(float f4) {
                                return Float.valueOf(f4 * 0.5f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                                return invoke(f4.floatValue());
                            }
                        }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                            }
                        }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(DragAnchors it11) {
                                Intrinsics.checkNotNullParameter(it11, "it");
                                CommonToolKt.mlog("move", it11.name());
                                if (it11 != DragAnchors.Start) {
                                    objectRef.element.change(str2);
                                }
                                return true;
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(anchoredDraggableState9);
                        t = anchoredDraggableState9;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef2.element = t;
                    EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                    Modifier modifierClipToBounds5 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    str5 = str2;
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierClipToBounds5);
                    Modifier modifier8 = modifier2;
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
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1150648079);
                    it = listEmptyList.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        Object next9 = it.next();
                        int i2111 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function1116 = (Function3) next9;
                        List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list13 = listEmptyList;
                        Iterator it11 = it;
                        Modifier modifierM602height3ABfNKs5 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                        final int i2112 = i13;
                        Modifier modifierOffset111 = OffsetKt.offset(modifierM602height3ABfNKs5, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6919invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 <= i2112 * f4) {
                                    float f5 = -f4;
                                    float offset3 = objectRef2.element.getOffset();
                                    int i2113 = i2112;
                                    iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i2113) * (i2113 - i14)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        String str110 = str4;
                        constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierOffset111);
                        String str111 = str3;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy116, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap116, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl6.getInserting()) {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        } else {
                            composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf116.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function1116.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        str4 = str110;
                        i13 = i2112;
                        i14 = i2111;
                        it = it11;
                        listEmptyList = list13;
                        str3 = str111;
                        f3 = f2;
                    }
                    i15 = i13;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list14 = listEmptyList;
                    str6 = str4;
                    str7 = str3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150647183);
                    if (function6 == null) {
                        str9 = str6;
                        str8 = str7;
                    } else {
                        Modifier modifierOffset112 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6920invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        str8 = str7;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        str9 = str6;
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierOffset112);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy117, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap117, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl2.getInserting()) {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        } else {
                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf117.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit17 = Unit.INSTANCE;
                        Unit unit18 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150646402);
                    it2 = listEmptyList2.iterator();
                    i16 = 0;
                    while (it2.hasNext()) {
                        Object next10 = it2.next();
                        int i2113 = i16 + 1;
                        if (i16 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Function3 function1117 = (Function3) next10;
                        Iterator it12 = it2;
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1118 = function6;
                        final int i2114 = i12;
                        Modifier modifierOffset113 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6921invokeBjo55l4(Density offset) {
                                int iRoundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                float offset2 = objectRef2.element.getOffset();
                                float f4 = fMo318toPx0680j_4;
                                if (offset2 >= (-(i2114 * f4))) {
                                    float offset3 = objectRef2.element.getOffset();
                                    int i2115 = i2114;
                                    iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i2115) * (i2115 - i16)));
                                } else {
                                    iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                                }
                                return IntOffsetKt.IntOffset(iRoundToInt, 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierOffset113);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy118, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap118, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl5.getInserting()) {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        } else {
                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf118.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function1117.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        i16 = i2113;
                        it2 = it12;
                        i12 = i2114;
                        function6 = function1118;
                    }
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function1119 = function6;
                    i17 = i12;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1150645515);
                    if (function8 != null) {
                        Modifier modifierOffset114 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m6922invokeBjo55l4(Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierOffset114);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy119, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap119, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3285constructorimpl4.getInserting()) {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        } else {
                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf119.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit19 = Unit.INSTANCE;
                        Unit unit110 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m6923invokeozmzZPI(intSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m6923invokeozmzZPI(long j) {
                                mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                                mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOffset115 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion5, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6924invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierOffset115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy1110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap1110, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl3.getInserting()) {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    } else {
                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf1110.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i2110 >> 18) & 112)));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function9 = function8;
                    modifier3 = modifier8;
                    list3 = listEmptyList2;
                    list4 = list14;
                    function10 = function1119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str112 = str5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$3
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

                    public final void invoke(Composer composer2, int i2115) {
                        SwipeRowViewKt.m6918SwipeRowViewUR9CgXA(str112, modifier3, f2, list4, function10, list3, function9, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i11 = 12582912;
            i3 |= i11;
            if ((i2 & 40) == 40) {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function5;
                }
                if (i8 != 0) {
                    listEmptyList2 = CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i9 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                }
                ProvidableCompositionLocal<Density> localDensity6 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume6 = composerStartRestartGroup.consume(localDensity6);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume6;
                fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                objectRef = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceableGroup(1890788296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModelProvider.Factory factoryCreateHiltViewModelFactory6 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                function8 = function7;
                ?? ViewModel6 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory6, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                objectRef.element = ViewModel6;
                ((SwipeViewModel) objectRef.element).tryReload();
                size = listEmptyList.size() * fMo318toPx0680j_4;
                int size13 = listEmptyList.size() + 1;
                size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                int size14 = listEmptyList2.size() + 1;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                objectRef2 = new Ref.ObjectRef();
                int i2115 = i3;
                Float fValueOf16 = Float.valueOf(size);
                i12 = size14;
                Float fValueOf17 = Float.valueOf(size2);
                i13 = size13;
                Float fValueOf18 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(fValueOf16) | composerStartRestartGroup.changed(fValueOf17) | composerStartRestartGroup.changed(fValueOf18);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11110 = function6;
                    density2 = density;
                    AnchoredDraggableState anchoredDraggableState10 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                            invoke2(draggableAnchorsConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                            Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                            DraggableAnchors.at(DragAnchors.Start, (function11110 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.StartFill, (function11110 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.Center, 0.0f);
                            DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                            DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                        }
                    }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                        public final Float invoke(float f4) {
                            return Float.valueOf(f4 * 0.5f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                            return invoke(f4.floatValue());
                        }
                    }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                        }
                    }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(DragAnchors it13) {
                            Intrinsics.checkNotNullParameter(it13, "it");
                            CommonToolKt.mlog("move", it13.name());
                            if (it13 != DragAnchors.Start) {
                                objectRef.element.change(str2);
                            }
                            return true;
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(anchoredDraggableState10);
                    t = anchoredDraggableState10;
                } else {
                    final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11111 = function6;
                    density2 = density;
                    AnchoredDraggableState anchoredDraggableState11 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                            invoke2(draggableAnchorsConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                            Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                            DraggableAnchors.at(DragAnchors.Start, (function11111 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.StartFill, (function11111 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.Center, 0.0f);
                            DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                            DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                        }
                    }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                        public final Float invoke(float f4) {
                            return Float.valueOf(f4 * 0.5f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                            return invoke(f4.floatValue());
                        }
                    }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                        }
                    }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(DragAnchors it13) {
                            Intrinsics.checkNotNullParameter(it13, "it");
                            CommonToolKt.mlog("move", it13.name());
                            if (it13 != DragAnchors.Start) {
                                objectRef.element.change(str2);
                            }
                            return true;
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(anchoredDraggableState11);
                    t = anchoredDraggableState11;
                }
                composerStartRestartGroup.endReplaceableGroup();
                objectRef2.element = t;
                EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                Modifier modifierClipToBounds6 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                str5 = str2;
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierClipToBounds6);
                Modifier modifier9 = modifier2;
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1150648079);
                it = listEmptyList.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    Object next11 = it.next();
                    int i2116 = i14 + 1;
                    if (i14 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Function3 function11112 = (Function3) next11;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list15 = listEmptyList;
                    Iterator it13 = it;
                    Modifier modifierM602height3ABfNKs6 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                    final int i2117 = i13;
                    Modifier modifierOffset116 = OffsetKt.offset(modifierM602height3ABfNKs6, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6919invokeBjo55l4(Density offset) {
                            int iRoundToInt;
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            float offset2 = objectRef2.element.getOffset();
                            float f4 = fMo318toPx0680j_4;
                            if (offset2 <= i2117 * f4) {
                                float f5 = -f4;
                                float offset3 = objectRef2.element.getOffset();
                                int i2118 = i2117;
                                iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i2118) * (i2118 - i14)));
                            } else {
                                iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                            }
                            return IntOffsetKt.IntOffset(iRoundToInt, 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1112 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    String str113 = str4;
                    constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierOffset116);
                    String str114 = str3;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy1112, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap1112, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl6.getInserting()) {
                        composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    } else {
                        composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf1112.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function11112.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    str4 = str113;
                    i13 = i2117;
                    i14 = i2116;
                    it = it13;
                    listEmptyList = list15;
                    str3 = str114;
                    f3 = f2;
                }
                i15 = i13;
                List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list16 = listEmptyList;
                str6 = str4;
                str7 = str3;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150647183);
                if (function6 == null) {
                    str9 = str6;
                    str8 = str7;
                } else {
                    Modifier modifierOffset117 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6920invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str8 = str7;
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1113 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str9 = str6;
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierOffset117);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy1113, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap1113, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl2.getInserting()) {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    } else {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf1113.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit111 = Unit.INSTANCE;
                    Unit unit112 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150646402);
                it2 = listEmptyList2.iterator();
                i16 = 0;
                while (it2.hasNext()) {
                    Object next12 = it2.next();
                    int i2118 = i16 + 1;
                    if (i16 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Function3 function11113 = (Function3) next12;
                    Iterator it14 = it2;
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11114 = function6;
                    final int i2119 = i12;
                    Modifier modifierOffset118 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6921invokeBjo55l4(Density offset) {
                            int iRoundToInt;
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            float offset2 = objectRef2.element.getOffset();
                            float f4 = fMo318toPx0680j_4;
                            if (offset2 >= (-(i2119 * f4))) {
                                float offset3 = objectRef2.element.getOffset();
                                int i21110 = i2119;
                                iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i21110) * (i21110 - i16)));
                            } else {
                                iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                            }
                            return IntOffsetKt.IntOffset(iRoundToInt, 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1114 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierOffset118);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy1114, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap1114, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl5.getInserting()) {
                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    } else {
                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf1114.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function11113.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i16 = i2118;
                    it2 = it14;
                    i12 = i2119;
                    function6 = function11114;
                }
                Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11115 = function6;
                i17 = i12;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150645515);
                if (function8 != null) {
                    Modifier modifierOffset119 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6922invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1115 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierOffset119);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy1115, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap1115, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl4.getInserting()) {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    } else {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf1115.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit113 = Unit.INSTANCE;
                    Unit unit114 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier.Companion companion6 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m6923invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m6923invokeozmzZPI(long j) {
                            mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                            mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m6923invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m6923invokeozmzZPI(long j) {
                            mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                            mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOffset1110 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion6, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                        return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m6924invokeBjo55l4(Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1116 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierOffset1110);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy1116, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap1116, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl3.getInserting()) {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                } else {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf1116.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i2115 >> 18) & 112)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function9 = function8;
                modifier3 = modifier9;
                list3 = listEmptyList2;
                list4 = list16;
                function10 = function11115;
            } else {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function5;
                }
                if (i8 != 0) {
                    listEmptyList2 = CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i9 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                }
                ProvidableCompositionLocal<Density> localDensity7 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume7 = composerStartRestartGroup.consume(localDensity7);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume7;
                fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                objectRef = new Ref.ObjectRef();
                composerStartRestartGroup.startReplaceableGroup(1890788296);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModelProvider.Factory factoryCreateHiltViewModelFactory7 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                function8 = function7;
                ?? ViewModel7 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory7, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                objectRef.element = ViewModel7;
                ((SwipeViewModel) objectRef.element).tryReload();
                size = listEmptyList.size() * fMo318toPx0680j_4;
                int size15 = listEmptyList.size() + 1;
                size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                int size16 = listEmptyList2.size() + 1;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                objectRef2 = new Ref.ObjectRef();
                int i21110 = i3;
                Float fValueOf19 = Float.valueOf(size);
                i12 = size16;
                Float fValueOf110 = Float.valueOf(size2);
                i13 = size15;
                Float fValueOf111 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                zChanged = composerStartRestartGroup.changed(fValueOf19) | composerStartRestartGroup.changed(fValueOf110) | composerStartRestartGroup.changed(fValueOf111);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11116 = function6;
                    density2 = density;
                    AnchoredDraggableState anchoredDraggableState12 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                            invoke2(draggableAnchorsConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                            Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                            DraggableAnchors.at(DragAnchors.Start, (function11116 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.StartFill, (function11116 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.Center, 0.0f);
                            DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                            DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                        }
                    }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                        public final Float invoke(float f4) {
                            return Float.valueOf(f4 * 0.5f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                            return invoke(f4.floatValue());
                        }
                    }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                        }
                    }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(DragAnchors it15) {
                            Intrinsics.checkNotNullParameter(it15, "it");
                            CommonToolKt.mlog("move", it15.name());
                            if (it15 != DragAnchors.Start) {
                                objectRef.element.change(str2);
                            }
                            return true;
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(anchoredDraggableState12);
                    t = anchoredDraggableState12;
                } else {
                    final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function11117 = function6;
                    density2 = density;
                    AnchoredDraggableState anchoredDraggableState13 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                            invoke2(draggableAnchorsConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                            Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                            DraggableAnchors.at(DragAnchors.Start, (function11117 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.StartFill, (function11117 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                            DraggableAnchors.at(DragAnchors.Center, 0.0f);
                            DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);
                            DraggableAnchors.at(DragAnchors.EndFill, (function8 != null ? -SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) - size2);
                        }
                    }), new Function1<Float, Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$2
                        public final Float invoke(float f4) {
                            return Float.valueOf(f4 * 0.5f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                            return invoke(f4.floatValue());
                        }
                    }, new Function0<Float>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$3
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(density2.mo318toPx0680j_4(Dp.m6097constructorimpl(50)));
                        }
                    }, new TweenSpec(350, 0, null, 6, null), new Function1<DragAnchors, Boolean>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(DragAnchors it15) {
                            Intrinsics.checkNotNullParameter(it15, "it");
                            CommonToolKt.mlog("move", it15.name());
                            if (it15 != DragAnchors.Start) {
                                objectRef.element.change(str2);
                            }
                            return true;
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(anchoredDraggableState13);
                    t = anchoredDraggableState13;
                }
                composerStartRestartGroup.endReplaceableGroup();
                objectRef2.element = t;
                EffectsKt.LaunchedEffect(((SwipeViewModel) objectRef.element).getBaseRepository().getFocusId(), new SwipeRowViewKt$SwipeRowView$1(objectRef, str2, objectRef2, null), composerStartRestartGroup, 64);
                Modifier modifierClipToBounds7 = ClipKt.clipToBounds(AnchoredDraggableKt.anchoredDraggable$default(modifier2, (AnchoredDraggableState) objectRef2.element, Orientation.Horizontal, false, false, null, false, 60, null));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                str3 = "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo";
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy1117 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                str4 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                str5 = str2;
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierClipToBounds7);
                Modifier modifier10 = modifier2;
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
                Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRememberBoxMeasurePolicy1117, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap1117, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl.getInserting()) {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf1117.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1150648079);
                it = listEmptyList.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    Object next13 = it.next();
                    int i21111 = i14 + 1;
                    if (i14 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Function3 function11118 = (Function3) next13;
                    List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list17 = listEmptyList;
                    Iterator it15 = it;
                    Modifier modifierM602height3ABfNKs7 = SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), f3), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl());
                    final int i21112 = i13;
                    Modifier modifierOffset1111 = OffsetKt.offset(modifierM602height3ABfNKs7, new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6919invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6919invokeBjo55l4(Density offset) {
                            int iRoundToInt;
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            float offset2 = objectRef2.element.getOffset();
                            float f4 = fMo318toPx0680j_4;
                            if (offset2 <= i21112 * f4) {
                                float f5 = -f4;
                                float offset3 = objectRef2.element.getOffset();
                                int i21113 = i21112;
                                iRoundToInt = MathKt.roundToInt(f5 + ((offset3 / i21113) * (i21113 - i14)));
                            } else {
                                iRoundToInt = MathKt.roundToInt(((-f4) * (i14 + 1)) + objectRef2.element.getOffset());
                            }
                            return IntOffsetKt.IntOffset(iRoundToInt, 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str3);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1118 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    String str115 = str4;
                    constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierOffset1111);
                    String str116 = str3;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl6 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl6, measurePolicyRememberBoxMeasurePolicy1118, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl6, currentCompositionLocalMap1118, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl6.getInserting()) {
                        composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    } else {
                        composerM3285constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM3285constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf1118.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function11118.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    str4 = str115;
                    i13 = i21112;
                    i14 = i21111;
                    it = it15;
                    listEmptyList = list17;
                    str3 = str116;
                    f3 = f2;
                }
                i15 = i13;
                List<? extends Function3<? super BoxScope, ? super Composer, ? super Integer, Unit>> list18 = listEmptyList;
                str6 = str4;
                str7 = str3;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150647183);
                if (function6 == null) {
                    str9 = str6;
                    str8 = str7;
                } else {
                    Modifier modifierOffset1112 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6920invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6920invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(objectRef2.element.getOffset() <= fMo318toPx0680j_4 * ((float) i15) ? MathKt.roundToInt((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) + (objectRef2.element.getOffset() / i15)) : MathKt.roundToInt(((-SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState)) - size) + objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    str8 = str7;
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy1119 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    str9 = str6;
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierOffset1112);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRememberBoxMeasurePolicy1119, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap1119, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl2.getInserting()) {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    } else {
                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf1119.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function6.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit115 = Unit.INSTANCE;
                    Unit unit116 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150646402);
                it2 = listEmptyList2.iterator();
                i16 = 0;
                while (it2.hasNext()) {
                    Object next14 = it2.next();
                    int i21113 = i16 + 1;
                    if (i16 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Function3 function11119 = (Function3) next14;
                    Iterator it16 = it2;
                    Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function111110 = function6;
                    final int i21114 = i12;
                    Modifier modifierOffset1113 = OffsetKt.offset(SizeKt.m602height3ABfNKs(SizeKt.m621width3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), f2), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$3$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6921invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6921invokeBjo55l4(Density offset) {
                            int iRoundToInt;
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            float offset2 = objectRef2.element.getOffset();
                            float f4 = fMo318toPx0680j_4;
                            if (offset2 >= (-(i21114 * f4))) {
                                float offset3 = objectRef2.element.getOffset();
                                int i21115 = i21114;
                                iRoundToInt = MathKt.roundToInt(f4 + ((offset3 / i21115) * (i21115 - i16)));
                            } else {
                                iRoundToInt = MathKt.roundToInt((f4 * (i16 + 1)) + objectRef2.element.getOffset());
                            }
                            return IntOffsetKt.IntOffset(iRoundToInt, 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11110 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierOffset1113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl5 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRememberBoxMeasurePolicy11110, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap11110, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl5.getInserting()) {
                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    } else {
                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf11110.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function11119.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i16 = i21113;
                    it2 = it16;
                    i12 = i21114;
                    function6 = function111110;
                }
                Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function111111 = function6;
                i17 = i12;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1150645515);
                if (function8 != null) {
                    Modifier modifierOffset1114 = OffsetKt.offset(SizeKt.m602height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6095boximpl(density2.mo314toDpu2uoSUM(SwipeRowView_UR9CgXA$lambda$5(mutableFloatState2))).m6111unboximpl()), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$4$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                            return IntOffset.m6216boximpl(m6922invokeBjo55l4(density3));
                        }

                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m6922invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(objectRef2.element.getOffset() >= (-(fMo318toPx0680j_4 * ((float) i17))) ? MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + (objectRef2.element.getOffset() / i17)) : MathKt.roundToInt(SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) + size2 + objectRef2.element.getOffset()), 0);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11111 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierOffset1114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3285constructorimpl4 = Updater.m3285constructorimpl(composerStartRestartGroup);
                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyRememberBoxMeasurePolicy11111, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap11111, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3285constructorimpl4.getInserting()) {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    } else {
                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf11111.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    function8.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Unit unit117 = Unit.INSTANCE;
                    Unit unit118 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier.Companion companion7 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                zChanged2 = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m6923invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m6923invokeozmzZPI(long j) {
                            mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                            mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m6923invokeozmzZPI(intSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m6923invokeozmzZPI(long j) {
                            mutableFloatState.setFloatValue(IntSize.m6267getWidthimpl(j));
                            mutableFloatState2.setFloatValue(IntSize.m6266getHeightimpl(j));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOffset1115 = OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(companion7, (Function1) objRememberedValue3), new Function1<Density, IntOffset>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$2$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                        return IntOffset.m6216boximpl(m6924invokeBjo55l4(density3));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m6924invokeBjo55l4(Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(objectRef2.element.getOffset()), 0);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, str8);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11112 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, str9);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierOffset1115);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3285constructorimpl3 = Updater.m3285constructorimpl(composerStartRestartGroup);
                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyRememberBoxMeasurePolicy11112, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap11112, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3285constructorimpl3.getInserting()) {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                } else {
                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf11112.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i21110 >> 18) & 112)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function9 = function8;
                modifier3 = modifier10;
                list3 = listEmptyList2;
                list4 = list18;
                function10 = function111111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str117 = str5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$3
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

                public final void invoke(Composer composer2, int i21115) {
                    SwipeRowViewKt.m6918SwipeRowViewUR9CgXA(str117, modifier3, f2, list4, function10, list3, function9, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changed(f3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 1024;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 65536;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((i2 & 40) == 40) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i5 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    } else {
                        function6 = function5;
                    }
                    if (i8 != 0) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(670141316, i3, -1, "cn.jianyun.workplan.ui.component.nav.SwipeRowView (SwipeRowView.kt:83)");
                    }
                    ProvidableCompositionLocal<Density> localDensity8 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume8 = composerStartRestartGroup.consume(localDensity8);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume8;
                    fMo318toPx0680j_4 = density.mo318toPx0680j_4(f3);
                    objectRef = new Ref.ObjectRef();
                    composerStartRestartGroup.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(hiltViewModel)P(1)*42@1793L7,47@1936L47,48@1995L54:HiltViewModel.kt#9mcars");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory8 = HiltViewModelKt.createHiltViewModelFactory(current, composerStartRestartGroup, 8);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    function8 = function7;
                    ?? ViewModel8 = ViewModelKt.viewModel((Class<??>) SwipeViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory8, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = ViewModel8;
                    ((SwipeViewModel) objectRef.element).tryReload();
                    size = listEmptyList.size() * fMo318toPx0680j_4;
                    int size17 = listEmptyList.size() + 1;
                    size2 = listEmptyList2.size() * fMo318toPx0680j_4;
                    int size18 = listEmptyList2.size() + 1;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    objectRef2 = new Ref.ObjectRef();
                    int i21115 = i3;
                    Float fValueOf112 = Float.valueOf(size);
                    i12 = size18;
                    Float fValueOf113 = Float.valueOf(size2);
                    i13 = size17;
                    Float fValueOf114 = Float.valueOf(SwipeRowView_UR9CgXA$lambda$2(mutableFloatState));
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(fValueOf112) | composerStartRestartGroup.changed(fValueOf113) | composerStartRestartGroup.changed(fValueOf114);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function111112 = function6;
                        density2 = density;
                        AnchoredDraggableState anchoredDraggableState14 = new AnchoredDraggableState(DragAnchors.Center, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DragAnchors>, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$state$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DragAnchors> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<DragAnchors> DraggableAnchors) {
                                Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
                                DraggableAnchors.at(DragAnchors.Start, (function111112 != null ? fMo318toPx0680j_4 : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.StartFill, (function111112 != null ? SwipeRowViewKt.SwipeRowView_UR9CgXA$lambda$2(mutableFloatState) : 0.0f) + size);
                                DraggableAnchors.at(DragAnchors.Center, 0.0f);
                                DraggableAnchors.at(DragAnchors.End, (function8 != null ? -fMo318toPx0680j_4 : 0.0f) - size2);

... [truncated: exceeds 400000 bytes, total 1210943 bytes]