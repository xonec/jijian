package cn.jianyun.workplan.ui.component.nav;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import cn.jianyun.workplan.ui.android.lunar.GregorianLunarCalendarView;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.model.kt.RangeDate;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.util.SelectDO;
import cn.jianyun.workplan.util.SelectUtil;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: compiled from: MonthChooseView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001aQ\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"DateRangeChooseView", "", b.f2259d, "Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;", "clearable", "", "mini", "future", "onChange", "Lkotlin/Function1;", "(Lcn/jianyun/workplan/ui/component/model/kt/RangeDate;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MonthChooseView", "", "beginDay", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "showNav", "MonthChooseView-WxQOpUA", "(Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "YearChooseView", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MonthChooseViewKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0255  */
    /* JADX WARN: Code duplicated, block: B:101:0x0274  */
    /* JADX WARN: Code duplicated, block: B:104:0x028f  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02de  */
    /* JADX WARN: Code duplicated, block: B:111:0x0313  */
    /* JADX WARN: Code duplicated, block: B:114:0x032c  */
    /* JADX WARN: Code duplicated, block: B:119:0x033e  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Date] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.Object, java.util.Date] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: MonthChooseView-WxQOpUA, reason: not valid java name */
    public static final void m6910MonthChooseViewWxQOpUA(String str, String str2, long j, boolean z, final Function1<? super String, Unit> onChange, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        long j2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        final int i9;
        String str5;
        String str6;
        long sp;
        boolean z3;
        final Ref.ObjectRef objectRef;
        final Ref.ObjectRef objectRef2;
        Object objRememberedValue;
        final MutableState mutableState;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final String str7;
        final String str8;
        final long j3;
        final boolean z4;
        Object objRememberedValue2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1313558549);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MonthChooseView)P(4!1,1:c#ui.unit.TextUnit,3)");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
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
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(onChange)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i3;
                    if ((46811 & i9) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i11 != 0) {
                            str6 = "1";
                        } else {
                            str6 = str4;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(15);
                        } else {
                            sp = j2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                        }
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = new Date();
                        objectRef2 = new Ref.ObjectRef();
                        objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                        if (str5.length() == 10) {
                            ?? dateString = MyDateTool.parseDateString(str5);
                            Intrinsics.checkNotNullExpressionValue(dateString, "parseDateString(value)");
                            objectRef.element = dateString;
                            objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                        final boolean z5 = z3;
                        final long j4 = sp;
                        BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                            public final void invoke(Composer composer3, int i12) {
                                int i13;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                    }
                                    composer3.startReplaceableGroup(1379735397);
                                    if (z5) {
                                        long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                        Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        final Function1<String, Unit> function1 = onChange;
                                        final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                        IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion2, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function1<String, Unit> function2 = function1;
                                                String dateString2 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                                Intrinsics.checkNotNullExpressionValue(dateString2, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                                function2.invoke(dateString2);
                                            }
                                        }, 7, null), composer3, 199686, 22);
                                        i13 = 0;
                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    } else {
                                        i13 = 0;
                                    }
                                    composer3.endReplaceableGroup();
                                    String month = objectRef2.element;
                                    long jM3765unboximpl = ((Color) CommonToolKt.ifv(z5, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    final MutableState<Boolean> mutableState2 = mutableState;
                                    composer3.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer3.changed(mutableState2);
                                    Object objRememberedValue5 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState2, true);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierTap = ButtonViewKt.tap(companion3, (Function0) objRememberedValue5);
                                    Intrinsics.checkNotNullExpressionValue(month, "month");
                                    TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                    if (z5) {
                                        CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                        long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        final Function1<String, Unit> function2 = onChange;
                                        final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                        IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function1<String, Unit> function3 = function2;
                                                String dateString2 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                                Intrinsics.checkNotNullExpressionValue(dateString2, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                                function3.invoke(dateString2);
                                            }
                                        }, 7, null), composer3, 3078, 54);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, 3072, 7);
                        composerStartRestartGroup.startReplaceableGroup(-209567040);
                        if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                snapshotMutationPolicy = null;
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                snapshotMutationPolicy = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final MutableState mutableState2 = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final MutableState mutableState3 = (MutableState) objRememberedValue3;
                            float fM6097constructorimpl = Dp.m6097constructorimpl(300);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final String str9 = str6;
                            composer2 = composerStartRestartGroup;
                            DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r14v2 */
                                /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r14v5 */
                                /* JADX WARN: Type inference failed for: r15v2 */
                                /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                                /* JADX WARN: Type inference failed for: r15v4 */
                                /* JADX WARN: Type inference failed for: r30v2 */
                                /* JADX WARN: Type inference failed for: r31v3 */
                                /* JADX WARN: Type inference failed for: r31v5 */
                                public final void invoke(Composer composer3, int i12) {
                                    final MutableState<String> mutableState4;
                                    ?? r14;
                                    Composer composer4 = composer3;
                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                        }
                                        final MutableState<String> mutableState5 = mutableState2;
                                        MutableState<String> mutableState6 = mutableState3;
                                        Function1<String, Unit> function1 = onChange;
                                        String str10 = str9;
                                        MutableState<Boolean> mutableState7 = mutableState;
                                        composer4.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        String str11 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                        ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3 function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                        Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion3, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                        composer4.startReplaceableGroup(-483455358);
                                        String str12 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                        ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3 function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                        Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        String str13 = "C79@3979L9:Column.kt#2w3rfo";
                                        ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(974088888);
                                        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                        while (true) {
                                            mutableState4 = mutableState6;
                                            r14 = 0;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            final String str14 = (String) it.next();
                                            String str15 = str14 + "年";
                                            Function1<String, Unit> function2 = function1;
                                            long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str14, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState5)), null, composer4, 0, 2);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            composer4.startReplaceableGroup(511388516);
                                            ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                            boolean zChanged2 = composer4.changed(mutableState5) | composer4.changed(str14);
                                            Object objRememberedValue5 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        mutableState5.setValue(str14);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer3.endReplaceableGroup();
                                            TextKt.m2471Text4IGK_g(str15, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion4, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                            composer4 = composer3;
                                            f2 = f2;
                                            mutableState7 = mutableState7;
                                            str10 = str10;
                                            str11 = str11;
                                            mutableState6 = mutableState4;
                                            function1 = function2;
                                            str13 = str13;
                                            str12 = str12;
                                            mutableState5 = mutableState5;
                                        }
                                        final MutableState<String> mutableState8 = mutableState5;
                                        String str16 = str11;
                                        String str17 = str13;
                                        final MutableState<Boolean> mutableState9 = mutableState7;
                                        final String str18 = str10;
                                        final Function1<String, Unit> function3 = function1;
                                        composer3.endReplaceableGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        ?? r15 = 0;
                                        float f3 = 0;
                                        float f4 = 20;
                                        int i13 = 3;
                                        DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                        Composer composer5 = composer3;
                                        Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                        composer5.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer5, str12);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer5, str16);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                        Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str17);
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(1098475987);
                                        ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer5, str16);
                                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion5);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer5.createNode(constructor5);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                        Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                            composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                            composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        }
                                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                        FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(1614631462);
                                        List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                        Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                        for (final SelectDO selectDO : listInitWithUnit) {
                                            String label = selectDO.label;
                                            long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState4)), r14, composer5, r15, 2);
                                            int i14 = i13;
                                            float f5 = f4;
                                            float f6 = f3;
                                            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    MutableState<String> mutableState10 = mutableState4;
                                                    String str19 = selectDO.value;
                                                    Intrinsics.checkNotNullExpressionValue(str19, "it.value");
                                                    mutableState10.setValue(str19);
                                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState9, false);
                                                    Function1<String, Unit> function4 = function3;
                                                    String dateString2 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState8), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState4), str18));
                                                    Intrinsics.checkNotNullExpressionValue(dateString2, "toDateString(\n          …                        )");
                                                    function4.invoke(dateString2);
                                                }
                                            }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                            Intrinsics.checkNotNullExpressionValue(label, "label");
                                            TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                            composer5 = composer3;
                                            i13 = i14;
                                            f4 = f5;
                                            f3 = f6;
                                            r14 = r14;
                                            r15 = r15 == true ? 1 : 0;
                                        }
                                        composer3.endReplaceableGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 12779526, 30);
                        } else {
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str7 = str5;
                        str8 = str6;
                        j3 = sp;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str7 = str3;
                        str8 = str4;
                        j3 = j2;
                        z4 = z2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$2
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

                        public final void invoke(Composer composer3, int i12) {
                            MonthChooseViewKt.m6910MonthChooseViewWxQOpUA(str7, str8, j3, z4, onChange, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                z2 = z;
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onChange)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((46811 & i9) == 9362) {
                    if (i10 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i11 != 0) {
                        str6 = "1";
                    } else {
                        str6 = str4;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                    }
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Date();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                    if (str5.length() == 10) {
                        ?? dateString2 = MyDateTool.parseDateString(str5);
                        Intrinsics.checkNotNullExpressionValue(dateString2, "parseDateString(value)");
                        objectRef.element = dateString2;
                        objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
                    final boolean z6 = z3;
                    final long j5 = sp;
                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                        public final void invoke(Composer composer3, int i12) {
                            int i13;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                }
                                composer3.startReplaceableGroup(1379735397);
                                if (z6) {
                                    long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function1 = onChange;
                                    final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion3, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function2 = function1;
                                            String dateString3 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                            Intrinsics.checkNotNullExpressionValue(dateString3, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                            function2.invoke(dateString3);
                                        }
                                    }, 7, null), composer3, 199686, 22);
                                    i13 = 0;
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                } else {
                                    i13 = 0;
                                }
                                composer3.endReplaceableGroup();
                                String month = objectRef2.element;
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(z6, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState4 = mutableState;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(mutableState4);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState4, true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierTap = ButtonViewKt.tap(companion4, (Function0) objRememberedValue5);
                                Intrinsics.checkNotNullExpressionValue(month, "month");
                                TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                if (z6) {
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function2 = onChange;
                                    final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion5, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function3 = function2;
                                            String dateString3 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                            Intrinsics.checkNotNullExpressionValue(dateString3, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                            function3.invoke(dateString3);
                                        }
                                    }, 7, null), composer3, 3078, 54);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 3072, 7);
                    composerStartRestartGroup.startReplaceableGroup(-209567040);
                    if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState4 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState5 = (MutableState) objRememberedValue3;
                        float fM6097constructorimpl2 = Dp.m6097constructorimpl(300);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final String str10 = str6;
                        composer2 = composerStartRestartGroup;
                        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl2, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r15v4 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r31v3 */
                            /* JADX WARN: Type inference failed for: r31v5 */
                            public final void invoke(Composer composer3, int i12) {
                                final MutableState<String> mutableState6;
                                ?? r14;
                                Composer composer4 = composer3;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                    }
                                    final MutableState<String> mutableState7 = mutableState4;
                                    MutableState<String> mutableState8 = mutableState5;
                                    Function1<String, Unit> function1 = onChange;
                                    String str11 = str10;
                                    MutableState<Boolean> mutableState9 = mutableState;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    String str12 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion4, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                    composer4.startReplaceableGroup(-483455358);
                                    String str13 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    String str14 = "C79@3979L9:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(974088888);
                                    Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                    while (true) {
                                        mutableState6 = mutableState8;
                                        r14 = 0;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        final String str15 = (String) it.next();
                                        String str16 = str15 + "年";
                                        Function1<String, Unit> function2 = function1;
                                        long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str15, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState7)), null, composer4, 0, 2);
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer4.changed(mutableState7) | composer4.changed(str15);
                                        Object objRememberedValue5 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    mutableState7.setValue(str15);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer3.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(str16, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion5, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer4 = composer3;
                                        f2 = f2;
                                        mutableState9 = mutableState9;
                                        str11 = str11;
                                        str12 = str12;
                                        mutableState8 = mutableState6;
                                        function1 = function2;
                                        str14 = str14;
                                        str13 = str13;
                                        mutableState7 = mutableState7;
                                    }
                                    final MutableState<String> mutableState10 = mutableState7;
                                    String str17 = str12;
                                    String str18 = str14;
                                    final MutableState<Boolean> mutableState11 = mutableState9;
                                    final String str19 = str11;
                                    final Function1<? super String, Unit> function3 = function1;
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ?? r15 = 0;
                                    float f3 = 0;
                                    float f4 = 20;
                                    int i13 = 3;
                                    DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                    Composer composer5 = composer3;
                                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                    composer5.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer5, str13);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str17);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str18);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1098475987);
                                    ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str17);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion6);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1614631462);
                                    List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                    Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                    for (final SelectDO selectDO : listInitWithUnit) {
                                        String label = selectDO.label;
                                        long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState6)), r14, composer5, r15, 2);
                                        int i14 = i13;
                                        float f5 = f4;
                                        float f6 = f3;
                                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<String> mutableState12 = mutableState6;
                                                String str110 = selectDO.value;
                                                Intrinsics.checkNotNullExpressionValue(str110, "it.value");
                                                mutableState12.setValue(str110);
                                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState11, false);
                                                Function1<String, Unit> function4 = function3;
                                                String dateString3 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState10), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState6), str19));
                                                Intrinsics.checkNotNullExpressionValue(dateString3, "toDateString(\n          …                        )");
                                                function4.invoke(dateString3);
                                            }
                                        }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                        Intrinsics.checkNotNullExpressionValue(label, "label");
                                        TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer5 = composer3;
                                        i13 = i14;
                                        f4 = f5;
                                        f3 = f6;
                                        r14 = r14;
                                        r15 = r15 == true ? 1 : 0;
                                    }
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 12779526, 30);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str7 = str5;
                    str8 = str6;
                    j3 = sp;
                    z4 = z3;
                } else {
                    if (i10 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i11 != 0) {
                        str6 = "1";
                    } else {
                        str6 = str4;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                    }
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Date();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                    if (str5.length() == 10) {
                        ?? dateString3 = MyDateTool.parseDateString(str5);
                        Intrinsics.checkNotNullExpressionValue(dateString3, "parseDateString(value)");
                        objectRef.element = dateString3;
                        objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
                    final boolean z7 = z3;
                    final long j6 = sp;
                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                        public final void invoke(Composer composer3, int i12) {
                            int i13;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                }
                                composer3.startReplaceableGroup(1379735397);
                                if (z7) {
                                    long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function1 = onChange;
                                    final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion4, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function2 = function1;
                                            String dateString4 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                            Intrinsics.checkNotNullExpressionValue(dateString4, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                            function2.invoke(dateString4);
                                        }
                                    }, 7, null), composer3, 199686, 22);
                                    i13 = 0;
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                } else {
                                    i13 = 0;
                                }
                                composer3.endReplaceableGroup();
                                String month = objectRef2.element;
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(z7, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState6 = mutableState;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(mutableState6);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState6, true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierTap = ButtonViewKt.tap(companion5, (Function0) objRememberedValue5);
                                Intrinsics.checkNotNullExpressionValue(month, "month");
                                TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j6, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                if (z7) {
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function2 = onChange;
                                    final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion6, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function3 = function2;
                                            String dateString4 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                            Intrinsics.checkNotNullExpressionValue(dateString4, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                            function3.invoke(dateString4);
                                        }
                                    }, 7, null), composer3, 3078, 54);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 3072, 7);
                    composerStartRestartGroup.startReplaceableGroup(-209567040);
                    if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState6 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState7 = (MutableState) objRememberedValue3;
                        float fM6097constructorimpl3 = Dp.m6097constructorimpl(300);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final String str11 = str6;
                        composer2 = composerStartRestartGroup;
                        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl3, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r15v4 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r31v3 */
                            /* JADX WARN: Type inference failed for: r31v5 */
                            public final void invoke(Composer composer3, int i12) {
                                final MutableState<String> mutableState8;
                                ?? r14;
                                Composer composer4 = composer3;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                    }
                                    final MutableState<String> mutableState9 = mutableState6;
                                    MutableState<String> mutableState10 = mutableState7;
                                    Function1<String, Unit> function1 = onChange;
                                    String str12 = str11;
                                    MutableState<Boolean> mutableState11 = mutableState;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    String str13 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion5, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                    composer4.startReplaceableGroup(-483455358);
                                    String str14 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    String str15 = "C79@3979L9:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(974088888);
                                    Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                    while (true) {
                                        mutableState8 = mutableState10;
                                        r14 = 0;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        final String str16 = (String) it.next();
                                        String str17 = str16 + "年";
                                        Function1<String, Unit> function2 = function1;
                                        long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str16, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState9)), null, composer4, 0, 2);
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer4.changed(mutableState9) | composer4.changed(str16);
                                        Object objRememberedValue5 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    mutableState9.setValue(str16);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer3.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(str17, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion6, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer4 = composer3;
                                        f2 = f2;
                                        mutableState11 = mutableState11;
                                        str12 = str12;
                                        str13 = str13;
                                        mutableState10 = mutableState8;
                                        function1 = function2;
                                        str15 = str15;
                                        str14 = str14;
                                        mutableState9 = mutableState9;
                                    }
                                    final MutableState<String> mutableState12 = mutableState9;
                                    String str18 = str13;
                                    String str19 = str15;
                                    final MutableState<Boolean> mutableState13 = mutableState11;
                                    final String str110 = str12;
                                    final Function1<? super String, Unit> function3 = function1;
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ?? r15 = 0;
                                    float f3 = 0;
                                    float f4 = 20;
                                    int i13 = 3;
                                    DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                    Composer composer5 = composer3;
                                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                    composer5.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer5, str14);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str18);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str19);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1098475987);
                                    ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str18);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion7);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1614631462);
                                    List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                    Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                    for (final SelectDO selectDO : listInitWithUnit) {
                                        String label = selectDO.label;
                                        long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState8)), r14, composer5, r15, 2);
                                        int i14 = i13;
                                        float f5 = f4;
                                        float f6 = f3;
                                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<String> mutableState14 = mutableState8;
                                                String str111 = selectDO.value;
                                                Intrinsics.checkNotNullExpressionValue(str111, "it.value");
                                                mutableState14.setValue(str111);
                                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState13, false);
                                                Function1<String, Unit> function4 = function3;
                                                String dateString4 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState12), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState8), str110));
                                                Intrinsics.checkNotNullExpressionValue(dateString4, "toDateString(\n          …                        )");
                                                function4.invoke(dateString4);
                                            }
                                        }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                        Intrinsics.checkNotNullExpressionValue(label, "label");
                                        TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer5 = composer3;
                                        i13 = i14;
                                        f4 = f5;
                                        f3 = f6;
                                        r14 = r14;
                                        r15 = r15 == true ? 1 : 0;
                                    }
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 12779526, 30);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str7 = str5;
                    str8 = str6;
                    j3 = sp;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$2
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

                    public final void invoke(Composer composer3, int i12) {
                        MonthChooseViewKt.m6910MonthChooseViewWxQOpUA(str7, str8, j3, z4, onChange, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500;
            j2 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onChange)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((46811 & i9) == 9362) {
                    if (i10 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i11 != 0) {
                        str6 = "1";
                    } else {
                        str6 = str4;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                    }
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Date();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                    if (str5.length() == 10) {
                        ?? dateString4 = MyDateTool.parseDateString(str5);
                        Intrinsics.checkNotNullExpressionValue(dateString4, "parseDateString(value)");
                        objectRef.element = dateString4;
                        objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
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
                    final boolean z8 = z3;
                    final long j7 = sp;
                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                        public final void invoke(Composer composer3, int i12) {
                            int i13;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                }
                                composer3.startReplaceableGroup(1379735397);
                                if (z8) {
                                    long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function1 = onChange;
                                    final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion5, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function2 = function1;
                                            String dateString5 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                            Intrinsics.checkNotNullExpressionValue(dateString5, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                            function2.invoke(dateString5);
                                        }
                                    }, 7, null), composer3, 199686, 22);
                                    i13 = 0;
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                } else {
                                    i13 = 0;
                                }
                                composer3.endReplaceableGroup();
                                String month = objectRef2.element;
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(z8, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState8 = mutableState;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(mutableState8);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState8, true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierTap = ButtonViewKt.tap(companion6, (Function0) objRememberedValue5);
                                Intrinsics.checkNotNullExpressionValue(month, "month");
                                TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                if (z8) {
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function2 = onChange;
                                    final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion7, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function3 = function2;
                                            String dateString5 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                            Intrinsics.checkNotNullExpressionValue(dateString5, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                            function3.invoke(dateString5);
                                        }
                                    }, 7, null), composer3, 3078, 54);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 3072, 7);
                    composerStartRestartGroup.startReplaceableGroup(-209567040);
                    if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState8 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState9 = (MutableState) objRememberedValue3;
                        float fM6097constructorimpl4 = Dp.m6097constructorimpl(300);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final String str12 = str6;
                        composer2 = composerStartRestartGroup;
                        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl4, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r15v4 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r31v3 */
                            /* JADX WARN: Type inference failed for: r31v5 */
                            public final void invoke(Composer composer3, int i12) {
                                final MutableState<String> mutableState10;
                                ?? r14;
                                Composer composer4 = composer3;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                    }
                                    final MutableState<String> mutableState11 = mutableState8;
                                    MutableState<String> mutableState12 = mutableState9;
                                    Function1<String, Unit> function1 = onChange;
                                    String str13 = str12;
                                    MutableState<Boolean> mutableState13 = mutableState;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    String str14 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion5);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion6, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                    composer4.startReplaceableGroup(-483455358);
                                    String str15 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    String str16 = "C79@3979L9:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(974088888);
                                    Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                    while (true) {
                                        mutableState10 = mutableState12;
                                        r14 = 0;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        final String str17 = (String) it.next();
                                        String str18 = str17 + "年";
                                        Function1<String, Unit> function2 = function1;
                                        long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str17, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState11)), null, composer4, 0, 2);
                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer4.changed(mutableState11) | composer4.changed(str17);
                                        Object objRememberedValue5 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    mutableState11.setValue(str17);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer3.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(str18, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion7, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer4 = composer3;
                                        f2 = f2;
                                        mutableState13 = mutableState13;
                                        str13 = str13;
                                        str14 = str14;
                                        mutableState12 = mutableState10;
                                        function1 = function2;
                                        str16 = str16;
                                        str15 = str15;
                                        mutableState11 = mutableState11;
                                    }
                                    final MutableState<String> mutableState14 = mutableState11;
                                    String str19 = str14;
                                    String str110 = str16;
                                    final MutableState<Boolean> mutableState15 = mutableState13;
                                    final String str111 = str13;
                                    final Function1<? super String, Unit> function3 = function1;
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ?? r15 = 0;
                                    float f3 = 0;
                                    float f4 = 20;
                                    int i13 = 3;
                                    DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                    Composer composer5 = composer3;
                                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                    composer5.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer5, str15);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str19);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str110);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1098475987);
                                    ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str19);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion8);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1614631462);
                                    List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                    Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                    for (final SelectDO selectDO : listInitWithUnit) {
                                        String label = selectDO.label;
                                        long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState10)), r14, composer5, r15, 2);
                                        int i14 = i13;
                                        float f5 = f4;
                                        float f6 = f3;
                                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<String> mutableState16 = mutableState10;
                                                String str112 = selectDO.value;
                                                Intrinsics.checkNotNullExpressionValue(str112, "it.value");
                                                mutableState16.setValue(str112);
                                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState15, false);
                                                Function1<String, Unit> function4 = function3;
                                                String dateString5 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState14), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState10), str111));
                                                Intrinsics.checkNotNullExpressionValue(dateString5, "toDateString(\n          …                        )");
                                                function4.invoke(dateString5);
                                            }
                                        }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                        Intrinsics.checkNotNullExpressionValue(label, "label");
                                        TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer5 = composer3;
                                        i13 = i14;
                                        f4 = f5;
                                        f3 = f6;
                                        r14 = r14;
                                        r15 = r15 == true ? 1 : 0;
                                    }
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 12779526, 30);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str7 = str5;
                    str8 = str6;
                    j3 = sp;
                    z4 = z3;
                } else {
                    if (i10 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i11 != 0) {
                        str6 = "1";
                    } else {
                        str6 = str4;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                    }
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Date();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                    if (str5.length() == 10) {
                        ?? dateString5 = MyDateTool.parseDateString(str5);
                        Intrinsics.checkNotNullExpressionValue(dateString5, "parseDateString(value)");
                        objectRef.element = dateString5;
                        objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion5);
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
                    final boolean z9 = z3;
                    final long j8 = sp;
                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                        public final void invoke(Composer composer3, int i12) {
                            int i13;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                }
                                composer3.startReplaceableGroup(1379735397);
                                if (z9) {
                                    long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function1 = onChange;
                                    final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion6, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function2 = function1;
                                            String dateString6 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                            Intrinsics.checkNotNullExpressionValue(dateString6, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                            function2.invoke(dateString6);
                                        }
                                    }, 7, null), composer3, 199686, 22);
                                    i13 = 0;
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                } else {
                                    i13 = 0;
                                }
                                composer3.endReplaceableGroup();
                                String month = objectRef2.element;
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(z9, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState10 = mutableState;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(mutableState10);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState10, true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierTap = ButtonViewKt.tap(companion7, (Function0) objRememberedValue5);
                                Intrinsics.checkNotNullExpressionValue(month, "month");
                                TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                if (z9) {
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function2 = onChange;
                                    final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion8, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function3 = function2;
                                            String dateString6 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                            Intrinsics.checkNotNullExpressionValue(dateString6, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                            function3.invoke(dateString6);
                                        }
                                    }, 7, null), composer3, 3078, 54);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 3072, 7);
                    composerStartRestartGroup.startReplaceableGroup(-209567040);
                    if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState10 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState11 = (MutableState) objRememberedValue3;
                        float fM6097constructorimpl5 = Dp.m6097constructorimpl(300);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final String str13 = str6;
                        composer2 = composerStartRestartGroup;
                        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl5, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r15v4 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r31v3 */
                            /* JADX WARN: Type inference failed for: r31v5 */
                            public final void invoke(Composer composer3, int i12) {
                                final MutableState<String> mutableState12;
                                ?? r14;
                                Composer composer4 = composer3;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                    }
                                    final MutableState<String> mutableState13 = mutableState10;
                                    MutableState<String> mutableState14 = mutableState11;
                                    Function1<String, Unit> function1 = onChange;
                                    String str14 = str13;
                                    MutableState<Boolean> mutableState15 = mutableState;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    String str15 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion6);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                    float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion7, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                    composer4.startReplaceableGroup(-483455358);
                                    String str16 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    String str17 = "C79@3979L9:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(974088888);
                                    Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                    while (true) {
                                        mutableState12 = mutableState14;
                                        r14 = 0;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        final String str18 = (String) it.next();
                                        String str19 = str18 + "年";
                                        Function1<String, Unit> function2 = function1;
                                        long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str18, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState13)), null, composer4, 0, 2);
                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean zChanged2 = composer4.changed(mutableState13) | composer4.changed(str18);
                                        Object objRememberedValue5 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    mutableState13.setValue(str18);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer3.endReplaceableGroup();
                                        TextKt.m2471Text4IGK_g(str19, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion8, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer4 = composer3;
                                        f2 = f2;
                                        mutableState15 = mutableState15;
                                        str14 = str14;
                                        str15 = str15;
                                        mutableState14 = mutableState12;
                                        function1 = function2;
                                        str17 = str17;
                                        str16 = str16;
                                        mutableState13 = mutableState13;
                                    }
                                    final MutableState<String> mutableState16 = mutableState13;
                                    String str110 = str15;
                                    String str111 = str17;
                                    final MutableState<Boolean> mutableState17 = mutableState15;
                                    final String str112 = str14;
                                    final Function1<? super String, Unit> function3 = function1;
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ?? r15 = 0;
                                    float f3 = 0;
                                    float f4 = 20;
                                    int i13 = 3;
                                    DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                    Composer composer5 = composer3;
                                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                    composer5.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer5, str16);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str110);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str111);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1098475987);
                                    ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, str110);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion9);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                    FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1614631462);
                                    List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                    Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                    for (final SelectDO selectDO : listInitWithUnit) {
                                        String label = selectDO.label;
                                        long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState12)), r14, composer5, r15, 2);
                                        int i14 = i13;
                                        float f5 = f4;
                                        float f6 = f3;
                                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                MutableState<String> mutableState18 = mutableState12;
                                                String str113 = selectDO.value;
                                                Intrinsics.checkNotNullExpressionValue(str113, "it.value");
                                                mutableState18.setValue(str113);
                                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState17, false);
                                                Function1<String, Unit> function4 = function3;
                                                String dateString6 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState16), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState12), str112));
                                                Intrinsics.checkNotNullExpressionValue(dateString6, "toDateString(\n          …                        )");
                                                function4.invoke(dateString6);
                                            }
                                        }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                        Intrinsics.checkNotNullExpressionValue(label, "label");
                                        TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                        composer5 = composer3;
                                        i13 = i14;
                                        f4 = f5;
                                        f3 = f6;
                                        r14 = r14;
                                        r15 = r15 == true ? 1 : 0;
                                    }
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 12779526, 30);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str7 = str5;
                    str8 = str6;
                    j3 = sp;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$2
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

                    public final void invoke(Composer composer3, int i12) {
                        MonthChooseViewKt.m6910MonthChooseViewWxQOpUA(str7, str8, j3, z4, onChange, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onChange)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i3;
            if ((46811 & i9) == 9362) {
                if (i10 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i11 != 0) {
                    str6 = "1";
                } else {
                    str6 = str4;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                }
                objectRef = new Ref.ObjectRef();
                objectRef.element = new Date();
                objectRef2 = new Ref.ObjectRef();
                objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                if (str5.length() == 10) {
                    ?? dateString6 = MyDateTool.parseDateString(str5);
                    Intrinsics.checkNotNullExpressionValue(dateString6, "parseDateString(value)");
                    objectRef.element = dateString6;
                    objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                Modifier.Companion companion6 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion6);
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
                final boolean z10 = z3;
                final long j9 = sp;
                BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                    public final void invoke(Composer composer3, int i12) {
                        int i13;
                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                            }
                            composer3.startReplaceableGroup(1379735397);
                            if (z10) {
                                long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                final Function1<? super String, Unit> function1 = onChange;
                                final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion7, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function1<String, Unit> function2 = function1;
                                        String dateString7 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                        Intrinsics.checkNotNullExpressionValue(dateString7, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                        function2.invoke(dateString7);
                                    }
                                }, 7, null), composer3, 199686, 22);
                                i13 = 0;
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                            } else {
                                i13 = 0;
                            }
                            composer3.endReplaceableGroup();
                            String month = objectRef2.element;
                            long jM3765unboximpl = ((Color) CommonToolKt.ifv(z10, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                            Modifier.Companion companion8 = Modifier.INSTANCE;
                            final MutableState<Boolean> mutableState12 = mutableState;
                            composer3.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer3.changed(mutableState12);
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState12, true);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierTap = ButtonViewKt.tap(companion8, (Function0) objRememberedValue5);
                            Intrinsics.checkNotNullExpressionValue(month, "month");
                            TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                            if (z10) {
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                final Function1<? super String, Unit> function2 = onChange;
                                final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion9, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function1<String, Unit> function3 = function2;
                                        String dateString7 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                        Intrinsics.checkNotNullExpressionValue(dateString7, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                        function3.invoke(dateString7);
                                    }
                                }, 7, null), composer3, 3078, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 3072, 7);
                composerStartRestartGroup.startReplaceableGroup(-209567040);
                if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        snapshotMutationPolicy = null;
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<String> mutableState12 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<String> mutableState13 = (MutableState) objRememberedValue3;
                    float fM6097constructorimpl6 = Dp.m6097constructorimpl(300);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final String str14 = str6;
                    composer2 = composerStartRestartGroup;
                    DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl6, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r14v2 */
                        /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r14v5 */
                        /* JADX WARN: Type inference failed for: r15v2 */
                        /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r15v4 */
                        /* JADX WARN: Type inference failed for: r30v2 */
                        /* JADX WARN: Type inference failed for: r31v3 */
                        /* JADX WARN: Type inference failed for: r31v5 */
                        public final void invoke(Composer composer3, int i12) {
                            final MutableState<String> mutableState14;
                            ?? r14;
                            Composer composer4 = composer3;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                }
                                final MutableState<String> mutableState15 = mutableState12;
                                MutableState<String> mutableState16 = mutableState13;
                                Function1<String, Unit> function1 = onChange;
                                String str15 = str14;
                                MutableState<Boolean> mutableState17 = mutableState;
                                composer4.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                String str16 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3 function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion7);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion8, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                composer4.startReplaceableGroup(-483455358);
                                String str17 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3 function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                String str18 = "C79@3979L9:Column.kt#2w3rfo";
                                ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(974088888);
                                Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                while (true) {
                                    mutableState14 = mutableState16;
                                    r14 = 0;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    final String str19 = (String) it.next();
                                    String str110 = str19 + "年";
                                    Function1<String, Unit> function2 = function1;
                                    long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str19, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState15)), null, composer4, 0, 2);
                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer4.changed(mutableState15) | composer4.changed(str19);
                                    Object objRememberedValue5 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                mutableState15.setValue(str19);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(str110, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion9, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                    composer4 = composer3;
                                    f2 = f2;
                                    mutableState17 = mutableState17;
                                    str15 = str15;
                                    str16 = str16;
                                    mutableState16 = mutableState14;
                                    function1 = function2;
                                    str18 = str18;
                                    str17 = str17;
                                    mutableState15 = mutableState15;
                                }
                                final MutableState<String> mutableState18 = mutableState15;
                                String str111 = str16;
                                String str112 = str18;
                                final MutableState<Boolean> mutableState19 = mutableState17;
                                final String str113 = str15;
                                final Function1<? super String, Unit> function3 = function1;
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ?? r15 = 0;
                                float f3 = 0;
                                float f4 = 20;
                                int i13 = 3;
                                DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                Composer composer5 = composer3;
                                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                composer5.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer5, str17);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                composer5.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer5, str111);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str112);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(1098475987);
                                ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                composer5.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer5, str111);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion10);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf10.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(1614631462);
                                List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                for (final SelectDO selectDO : listInitWithUnit) {
                                    String label = selectDO.label;
                                    long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState14)), r14, composer5, r15, 2);
                                    int i14 = i13;
                                    float f5 = f4;
                                    float f6 = f3;
                                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<String> mutableState110 = mutableState14;
                                            String str114 = selectDO.value;
                                            Intrinsics.checkNotNullExpressionValue(str114, "it.value");
                                            mutableState110.setValue(str114);
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState19, false);
                                            Function1<String, Unit> function4 = function3;
                                            String dateString7 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState18), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState14), str113));
                                            Intrinsics.checkNotNullExpressionValue(dateString7, "toDateString(\n          …                        )");
                                            function4.invoke(dateString7);
                                        }
                                    }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                    Intrinsics.checkNotNullExpressionValue(label, "label");
                                    TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                    composer5 = composer3;
                                    i13 = i14;
                                    f4 = f5;
                                    f3 = f6;
                                    r14 = r14;
                                    r15 = r15 == true ? 1 : 0;
                                }
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 12779526, 30);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str7 = str5;
                str8 = str6;
                j3 = sp;
                z4 = z3;
            } else {
                if (i10 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i11 != 0) {
                    str6 = "1";
                } else {
                    str6 = str4;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(15);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                }
                objectRef = new Ref.ObjectRef();
                objectRef.element = new Date();
                objectRef2 = new Ref.ObjectRef();
                objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                if (str5.length() == 10) {
                    ?? dateString7 = MyDateTool.parseDateString(str5);
                    Intrinsics.checkNotNullExpressionValue(dateString7, "parseDateString(value)");
                    objectRef.element = dateString7;
                    objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                Modifier.Companion companion7 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion7);
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
                final boolean z11 = z3;
                final long j10 = sp;
                BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                    public final void invoke(Composer composer3, int i12) {
                        int i13;
                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                            }
                            composer3.startReplaceableGroup(1379735397);
                            if (z11) {
                                long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                final Function1<? super String, Unit> function1 = onChange;
                                final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion8, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function1<String, Unit> function2 = function1;
                                        String dateString8 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                        Intrinsics.checkNotNullExpressionValue(dateString8, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                        function2.invoke(dateString8);
                                    }
                                }, 7, null), composer3, 199686, 22);
                                i13 = 0;
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                            } else {
                                i13 = 0;
                            }
                            composer3.endReplaceableGroup();
                            String month = objectRef2.element;
                            long jM3765unboximpl = ((Color) CommonToolKt.ifv(z11, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                            Modifier.Companion companion9 = Modifier.INSTANCE;
                            final MutableState<Boolean> mutableState14 = mutableState;
                            composer3.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                            boolean zChanged2 = composer3.changed(mutableState14);
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState14, true);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierTap = ButtonViewKt.tap(companion9, (Function0) objRememberedValue5);
                            Intrinsics.checkNotNullExpressionValue(month, "month");
                            TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j10, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                            if (z11) {
                                CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                final Function1<? super String, Unit> function2 = onChange;
                                final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion10, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Function1<String, Unit> function3 = function2;
                                        String dateString8 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                        Intrinsics.checkNotNullExpressionValue(dateString8, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                        function3.invoke(dateString8);
                                    }
                                }, 7, null), composer3, 3078, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 3072, 7);
                composerStartRestartGroup.startReplaceableGroup(-209567040);
                if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        snapshotMutationPolicy = null;
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<String> mutableState14 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final MutableState<String> mutableState15 = (MutableState) objRememberedValue3;
                    float fM6097constructorimpl7 = Dp.m6097constructorimpl(300);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final String str15 = str6;
                    composer2 = composerStartRestartGroup;
                    DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl7, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r14v2 */
                        /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r14v5 */
                        /* JADX WARN: Type inference failed for: r15v2 */
                        /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r15v4 */
                        /* JADX WARN: Type inference failed for: r30v2 */
                        /* JADX WARN: Type inference failed for: r31v3 */
                        /* JADX WARN: Type inference failed for: r31v5 */
                        public final void invoke(Composer composer3, int i12) {
                            final MutableState<String> mutableState16;
                            ?? r14;
                            Composer composer4 = composer3;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                }
                                final MutableState<String> mutableState17 = mutableState14;
                                MutableState<String> mutableState18 = mutableState15;
                                Function1<String, Unit> function1 = onChange;
                                String str16 = str15;
                                MutableState<Boolean> mutableState19 = mutableState;
                                composer4.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                String str17 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3 function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion8);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf8.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion9, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                composer4.startReplaceableGroup(-483455358);
                                String str18 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3 function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM3285constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                String str19 = "C79@3979L9:Column.kt#2w3rfo";
                                ComposerKt.sourceInformationMarkerStart(composer4, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(974088888);
                                Iterator it = CollectionsKt.listOf((Object[]) new String[]{"2022", "2023", "2024", "2025", "2026", "2027", "2028"}).iterator();
                                while (true) {
                                    mutableState16 = mutableState18;
                                    r14 = 0;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    final String str110 = (String) it.next();
                                    String str111 = str110 + "年";
                                    Function1<String, Unit> function2 = function1;
                                    long jFocusColor = CommonToolKt.focusColor(Intrinsics.areEqual(str110, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState17)), null, composer4, 0, 2);
                                    Modifier.Companion companion10 = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer4, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged2 = composer4.changed(mutableState17) | composer4.changed(str110);
                                    Object objRememberedValue5 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                mutableState17.setValue(str110);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    TextKt.m2471Text4IGK_g(str111, SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth$default(ButtonViewKt.tap(companion10, (Function0) objRememberedValue5), 0.0f, 1, null), Dp.m6097constructorimpl(0), Dp.m6097constructorimpl(20)), null, false, 3, null), jFocusColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                    composer4 = composer3;
                                    f2 = f2;
                                    mutableState19 = mutableState19;
                                    str16 = str16;
                                    str17 = str17;
                                    mutableState18 = mutableState16;
                                    function1 = function2;
                                    str19 = str19;
                                    str18 = str18;
                                    mutableState17 = mutableState17;
                                }
                                final MutableState<String> mutableState110 = mutableState17;
                                String str112 = str17;
                                String str113 = str19;
                                final MutableState<Boolean> mutableState111 = mutableState19;
                                final String str114 = str16;
                                final Function1<? super String, Unit> function3 = function1;
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ?? r15 = 0;
                                float f3 = 0;
                                float f4 = 20;
                                int i13 = 3;
                                DividerKt.m1871VerticalDivider9IZ8Weo(PaddingKt.m568paddingVpY3zN4(Modifier.INSTANCE, Dp.m6097constructorimpl(f3), Dp.m6097constructorimpl(f4)), 0.0f, Color.INSTANCE.m3785getGray0d7_KjU(), composer3, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 2);
                                Composer composer5 = composer3;
                                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), 3.0f, false, 2, null);
                                composer5.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer5, str18);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                composer5.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer5, str112);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl4 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl4, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM3285constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM3285constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf10.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer5, 276693656, str113);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(1098475987);
                                ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                Modifier.Companion companion11 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(Arrangement.INSTANCE.getStart(), Arrangement.INSTANCE.getTop(), Integer.MAX_VALUE, composer5, 0);
                                composer5.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer5, str112);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(companion11);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3285constructorimpl5 = Updater.m3285constructorimpl(composer3);
                                Updater.m3292setimpl(composerM3285constructorimpl5, measurePolicyRowMeasurementHelper, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3292setimpl(composerM3285constructorimpl5, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3285constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM3285constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM3285constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf11.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(1614631462);
                                List<SelectDO> listInitWithUnit = SelectUtil.initWithUnit("", "月", 1, 12);
                                Intrinsics.checkNotNullExpressionValue(listInitWithUnit, "initWithUnit(\"\", \"月\", 1, 12)");
                                for (final SelectDO selectDO : listInitWithUnit) {
                                    String label = selectDO.label;
                                    long jFocusColor2 = CommonToolKt.focusColor(Intrinsics.areEqual(selectDO.value, MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState16)), r14, composer5, r15, 2);
                                    int i14 = i13;
                                    float f5 = f4;
                                    float f6 = f3;
                                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m568paddingVpY3zN4(SizeKt.fillMaxWidth(ButtonViewKt.tap(Modifier.INSTANCE, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3$1$2$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MutableState<String> mutableState112 = mutableState16;
                                            String str115 = selectDO.value;
                                            Intrinsics.checkNotNullExpressionValue(str115, "it.value");
                                            mutableState112.setValue(str115);
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState111, false);
                                            Function1<String, Unit> function4 = function3;
                                            String dateString8 = MyDateTool.toDateString(MyDateTool.make(MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$4(mutableState110), MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$10$lambda$7(mutableState16), str114));
                                            Intrinsics.checkNotNullExpressionValue(dateString8, "toDateString(\n          …                        )");
                                            function4.invoke(dateString8);
                                        }
                                    }), 0.33f), Dp.m6097constructorimpl(f6), Dp.m6097constructorimpl(f5)), r14, r15, i14, r14);
                                    Intrinsics.checkNotNullExpressionValue(label, "label");
                                    TextKt.m2471Text4IGK_g(label, modifierWrapContentSize$default, jFocusColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
                                    composer5 = composer3;
                                    i13 = i14;
                                    f4 = f5;
                                    f3 = f6;
                                    r14 = r14;
                                    r15 = r15 == true ? 1 : 0;
                                }
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 12779526, 30);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str7 = str5;
                str8 = str6;
                j3 = sp;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$2
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

                public final void invoke(Composer composer3, int i12) {
                    MonthChooseViewKt.m6910MonthChooseViewWxQOpUA(str7, str8, j3, z4, onChange, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        str4 = str2;
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
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onChange)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((46811 & i9) == 9362) {
                    if (i10 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i11 != 0) {
                        str6 = "1";
                    } else {
                        str6 = str4;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(15);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313558549, i9, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView (MonthChooseView.kt:63)");
                    }
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new Date();
                    objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = MyDateTool.toChineseMonthString(new Date());
                    if (str5.length() == 10) {
                        ?? dateString8 = MyDateTool.parseDateString(str5);
                        Intrinsics.checkNotNullExpressionValue(dateString8, "parseDateString(value)");
                        objectRef.element = dateString8;
                        objectRef2.element = MyDateTool.toChineseMonthString(MyDateTool.parseDateString(str5));
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion8);
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
                    final boolean z12 = z3;
                    final long j11 = sp;
                    BoxViewKt.m6898VerticalRowdjqsMU(null, 0.0f, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1902640345, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1
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

                        public final void invoke(Composer composer3, int i12) {
                            int i13;
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1902640345, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:75)");
                                }
                                composer3.startReplaceableGroup(1379735397);
                                if (z12) {
                                    long jM3785getGray0d7_KjU = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier modifierRotate = RotateKt.rotate(Modifier.INSTANCE, 180.0f);
                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function1 = onChange;
                                    final Ref.ObjectRef<Date> objectRef3 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU, false, modifierRotate, ClickableKt.m249clickableXHw0xAI$default(companion9, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function2 = function1;
                                            String dateString9 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef3.element, -1));
                                            Intrinsics.checkNotNullExpressionValue(dateString9, "toDateString(MyDateTool.gapMonth(realMonth, -1))");
                                            function2.invoke(dateString9);
                                        }
                                    }, 7, null), composer3, 199686, 22);
                                    i13 = 0;
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                } else {
                                    i13 = 0;
                                }
                                composer3.endReplaceableGroup();
                                String month = objectRef2.element;
                                long jM3765unboximpl = ((Color) CommonToolKt.ifv(z12, Color.m3745boximpl(ColorKt.getThemeColor()), Color.m3745boximpl(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable | i13).getPrimary()))).m3765unboximpl();
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                final MutableState<Boolean> mutableState16 = mutableState;
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(mutableState16);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState16, true);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierTap = ButtonViewKt.tap(companion10, (Function0) objRememberedValue5);
                                Intrinsics.checkNotNullExpressionValue(month, "month");
                                TextKt.m2471Text4IGK_g(month, modifierTap, jM3765unboximpl, j11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, (i9 << 3) & 7168, 0, 131056);
                                if (z12) {
                                    CommonUIKt.m6944BlankkHDZbjc(Dp.m6097constructorimpl(10), composer3, 6, 0);
                                    long jM3785getGray0d7_KjU2 = Color.INSTANCE.m3785getGray0d7_KjU();
                                    Modifier.Companion companion11 = Modifier.INSTANCE;
                                    final Function1<? super String, Unit> function2 = onChange;
                                    final Ref.ObjectRef<Date> objectRef4 = objectRef;
                                    IconViewKt.m6907CircleIconViewB6Dfk3U(IconFont.right2, 0L, 0.0f, jM3785getGray0d7_KjU2, false, null, ClickableKt.m249clickableXHw0xAI$default(companion11, false, null, null, new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Function1<String, Unit> function3 = function2;
                                            String dateString9 = MyDateTool.toDateString(MyDateTool.gapMonth(objectRef4.element, 1));
                                            Intrinsics.checkNotNullExpressionValue(dateString9, "toDateString(MyDateTool.gapMonth(realMonth, 1))");
                                            function3.invoke(dateString9);
                                        }
                                    }, 7, null), composer3, 3078, 54);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 3072, 7);
                    composerStartRestartGroup.startReplaceableGroup(-209567040);
                    if (MonthChooseView_WxQOpUA$lambda$1(mutableState)) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getYear((Date) objectRef.element)).toString(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState16 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new StringBuilder().append(MyDateTool.getMonth((Date) objectRef.element)).toString(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableState<String> mutableState17 = (MutableState) objRememberedValue3;
                        float fM6097constructorimpl8 = Dp.m6097constructorimpl(300);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MonthChooseViewKt.MonthChooseView_WxQOpUA$lambda$2(mutableState, false);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final String str16 = str6;
                        composer2 = composerStartRestartGroup;
                        DialogViewKt.m6840BottomDialogVieweHTjO5g("选择月份", false, null, null, false, fM6097constructorimpl8, (Function0) objRememberedValue4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 22250536, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$MonthChooseView$1$3
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

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v2 */
                            /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.material3.ColorScheme, androidx.compose.ui.Alignment, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r15v4 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r31v3 */
                            /* JADX WARN: Type inference failed for: r31v5 */
                            public final void invoke(Composer composer3, int i12) {
                                final MutableState<String> mutableState18;
                                ?? r14;
                                Composer composer4 = composer3;
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(22250536, i12, -1, "cn.jianyun.workplan.ui.component.nav.MonthChooseView.<anonymous>.<anonymous> (MonthChooseView.kt:101)");
                                    }
                                    final MutableState<String> mutableState19 = mutableState16;
                                    MutableState<String> mutableState110 = mutableState17;
                                    Function1<String, Unit> function1 = onChange;
                                    String str17 = str16;
                                    MutableState<Boolean> mutableState111 = mutableState;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    String str18 = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion9);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl2, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3285constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3285constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier.Companion companion10 = Modifier.INSTANCE;
                                    float f2 = MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, ScrollKt.verticalScroll$default(SizeKt.m602height3ABfNKs(companion10, Dp.m6097constructorimpl(f2)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                                    composer4.startReplaceableGroup(-483455358);
                                    String str19 = "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo";
                                    ComposerKt.sourceInformation(composer4, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3 function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3285constructorimpl3 = Updater.m3285constructorimpl(composer3);
                                    Updater.m3292setimpl(composerM3285constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3292setimpl(composerM3285constructorimpl3, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3285constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM3285constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM3285constructorimpl3.apply(Integer.valueOf(currentComp

... [truncated: exceeds 400000 bytes, total 1566730 bytes]