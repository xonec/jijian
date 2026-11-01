package cn.jianyun.workplan.module.schedule.views.work;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.ui.component.nav.IconFont;
import cn.jianyun.workplan.ui.component.nav.IconViewKt;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkItemView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"EditWorkItemView", "", "work", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "size", "Lcn/jianyun/workplan/module/schedule/views/work/Size;", "padding", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "EditWorkItemView-TN_CM5M", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lcn/jianyun/workplan/module/schedule/views/work/Size;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "WholeWorkItemView", "vpadding", "WholeWorkItemView-vz2T9sI", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lcn/jianyun/workplan/module/schedule/views/work/Size;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WorkItemView", "showBeginTime", "", "showEndTime", "workFontSize", "", "timeFontSize", "workRadius", "WorkItemView-KBW6s6s", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/views/work/Size;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WorkTimeView", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;Lcn/jianyun/workplan/module/schedule/views/work/Size;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WorkItemViewKt {
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:125:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x0267  */
    /* JADX WARN: Code duplicated, block: B:129:0x0269  */
    /* JADX WARN: Code duplicated, block: B:132:0x0298  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x030d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:160:0x0330  */
    /* JADX WARN: Code duplicated, block: B:163:0x0344  */
    /* JADX WARN: Code duplicated, block: B:165:0x0348  */
    /* JADX WARN: Code duplicated, block: B:166:0x0355  */
    /* JADX WARN: Code duplicated, block: B:169:0x035d  */
    /* JADX WARN: Code duplicated, block: B:170:0x036a  */
    /* JADX WARN: Code duplicated, block: B:171:0x036d  */
    /* JADX WARN: Code duplicated, block: B:174:0x037b  */
    /* JADX WARN: Code duplicated, block: B:176:0x040b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0417  */
    /* JADX WARN: Code duplicated, block: B:180:0x041b  */
    /* JADX WARN: Code duplicated, block: B:185:0x044e  */
    /* JADX WARN: Code duplicated, block: B:188:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:192:0x050c  */
    /* JADX WARN: Code duplicated, block: B:194:0x055f  */
    /* JADX WARN: Code duplicated, block: B:197:0x059d  */
    /* JADX WARN: Code duplicated, block: B:201:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:210:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0312 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WorkItemView-KBW6s6s, reason: not valid java name */
    public static final void m6759WorkItemViewKBW6s6s(final ScheduleWork work, boolean z, boolean z2, String str, String str2, String str3, Size size, float f2, float f3, Modifier modifier, Composer composer, final int i, final int i2) {
        Object objM7405constructorimpl;
        Object objM7405constructorimpl2;
        Object objM7405constructorimpl3;
        float fM6111unboximpl;
        float f4;
        boolean z3;
        float f5;
        boolean z4;
        float f6;
        float f7;
        float fM6111unboximpl2;
        boolean z5;
        boolean z6;
        float fM6111unboximpl3;
        float fM6097constructorimpl;
        List listListOf;
        Iterator it;
        int i3;
        long sp;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3285constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f8;
        int i4;
        long sp2;
        Intrinsics.checkNotNullParameter(work, "work");
        Composer composerStartRestartGroup = composer.startRestartGroup(1459201016);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WorkItemView)P(7,2,3,8,5,9,4,1:c#ui.unit.Dp,6:c#ui.unit.Dp)");
        final boolean z7 = (i2 & 2) != 0 ? false : z;
        boolean z8 = (i2 & 4) != 0 ? false : z2;
        String str4 = (i2 & 8) != 0 ? "11" : str;
        String str5 = (i2 & 16) == 0 ? str2 : "11";
        String str6 = (i2 & 32) != 0 ? "4" : str3;
        Size size2 = (i2 & 64) != 0 ? Size.normal : size;
        float fM6097constructorimpl2 = (i2 & 128) != 0 ? Dp.m6097constructorimpl(0) : f2;
        float fM6097constructorimpl3 = (i2 & 256) != 0 ? Dp.m6097constructorimpl(0) : f3;
        Modifier.Companion companion = (i2 & 512) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1459201016, i, -1, "cn.jianyun.workplan.module.schedule.views.work.WorkItemView (WorkItemView.kt:37)");
        }
        float f9 = 3;
        Modifier modifier3 = companion;
        float fM6111unboximpl4 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f9)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(12)), Dp.m6095boximpl(Dp.m6097constructorimpl(8))))).m6111unboximpl();
        float fM6111unboximpl5 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f9))))).m6111unboximpl();
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(str6)));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
        }
        final String str7 = str6;
        Object objIfv = CommonToolKt.ifv(size2 == Size.small, 2, CommonToolKt.ifv(size2 == Size.big, 8, 4));
        if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
            objM7405constructorimpl = objIfv;
        }
        float fM6097constructorimpl4 = Dp.m6097constructorimpl(((Number) objM7405constructorimpl).intValue());
        try {
            Result.Companion companion4 = Result.INSTANCE;
            objM7405constructorimpl2 = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(str4)));
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            objM7405constructorimpl2 = Result.m7405constructorimpl(ResultKt.createFailure(th2));
        }
        final String str8 = str4;
        Object objIfv2 = CommonToolKt.ifv(size2 == Size.small, 11, CommonToolKt.ifv(size2 == Size.big, 14, 13));
        if (Result.m7411isFailureimpl(objM7405constructorimpl2)) {
            objM7405constructorimpl2 = objIfv2;
        }
        int iIntValue = ((Number) objM7405constructorimpl2).intValue();
        long sp3 = TextUnitKt.getSp(iIntValue);
        try {
            Result.Companion companion6 = Result.INSTANCE;
            objM7405constructorimpl3 = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(str5)));
        } catch (Throwable th3) {
            Result.Companion companion7 = Result.INSTANCE;
            objM7405constructorimpl3 = Result.m7405constructorimpl(ResultKt.createFailure(th3));
        }
        final String str9 = str5;
        Object objIfv3 = CommonToolKt.ifv(size2 == Size.small, 11, CommonToolKt.ifv(size2 == Size.big, 14, 13));
        if (Result.m7411isFailureimpl(objM7405constructorimpl3)) {
            objM7405constructorimpl3 = objIfv3;
        }
        int iIntValue2 = ((Number) objM7405constructorimpl3).intValue();
        long sp4 = TextUnitKt.getSp(iIntValue2);
        if (iIntValue2 < 20) {
            if (iIntValue2 < 16) {
                fM6111unboximpl = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(14)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(15)), Dp.m6095boximpl(Dp.m6097constructorimpl(13))))).m6111unboximpl();
            } else {
                fM6111unboximpl = Dp.m6097constructorimpl(17);
            }
            f4 = fM6111unboximpl;
            if (size2 == Size.small) {
                z3 = true;
            } else {
                z3 = false;
            }
            f5 = 16;
            Dp dpM6095boximpl = Dp.m6095boximpl(Dp.m6097constructorimpl(f5));
            if (size2 == Size.big) {
                z4 = true;
            } else {
                z4 = false;
            }
            f6 = 30;
            f7 = 26;
            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z3, dpM6095boximpl, CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7))))).m6111unboximpl();
            if (iIntValue2 >= 20) {
                fM6111unboximpl3 = Dp.m6097constructorimpl(22);
            } else if (iIntValue2 >= 16) {
                if (size2 == Size.small) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Dp dpM6095boximpl2 = Dp.m6095boximpl(Dp.m6097constructorimpl(f5));
                if (size2 == Size.big) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, dpM6095boximpl2, CommonToolKt.ifv(z6, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7))))).m6111unboximpl();
            } else {
                fM6111unboximpl3 = Dp.m6097constructorimpl(18);
            }
            fM6097constructorimpl = Dp.m6097constructorimpl(60);
            listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(z7), Boolean.valueOf(z8)});
            if ((listListOf instanceof Collection) || !listListOf.isEmpty()) {
                it = listListOf.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i3 = 0;
            }
            if (size2 == Size.small) {
                fM6097constructorimpl = Dp.m6097constructorimpl(40);
            }
            if (work.getName().length() > 3) {
                if (size2 == Size.small) {
                    i4 = 8;
                    sp2 = TextUnitKt.getSp(Math.max(8, iIntValue - 3));
                } else {
                    i4 = 8;
                    sp2 = sp3;
                }
                if (size2 == Size.normal) {
                    sp = TextUnitKt.getSp(Math.max(i4, iIntValue - 2));
                } else {
                    sp = sp2;
                }
            } else {
                sp = sp3;
            }
            if (!Intrinsics.areEqual(work.getName(), "")) {
                composerStartRestartGroup.startReplaceableGroup(-1323306986);
                modifier2 = modifier3;
                Modifier modifierM621width3ABfNKs = SizeKt.m621width3ABfNKs(SizeKt.m602height3ABfNKs(PaddingKt.m568paddingVpY3zN4(BackgroundKt.background$default(CommonUIKt.m6957radius3ABfNKs(PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, fM6097constructorimpl3, 1, null), fM6097constructorimpl2, 0.0f, 2, null), fM6097constructorimpl4), work.fetchCombineColor(), null, 0.0f, 6, null).then(modifier2), fM6111unboximpl4, fM6111unboximpl5), Dp.m6097constructorimpl(fM6111unboximpl2 + Dp.m6097constructorimpl(fM6111unboximpl3 * i3))), fM6097constructorimpl);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                TextKt.m2471Text4IGK_g(work.getName(), (Modifier) null, Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 0, 129522);
                composerStartRestartGroup.startReplaceableGroup(-246890272);
                if (z7) {
                    f8 = f4;
                    TextKt.m2471Text4IGK_g(work.fetchBeginTime(), SizeKt.m602height3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m3792getWhite0d7_KjU(), sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130032);
                } else {
                    f8 = f4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1323306059);
                if (z8) {
                    TextKt.m2471Text4IGK_g(work.fetchEndTime(), SizeKt.m602height3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m3792getWhite0d7_KjU(), sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130032);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                modifier2 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(-1323305805);
                TextKt.m2471Text4IGK_g("", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 6, 0, 131070);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z9 = z8;
            final Size size3 = size2;
            final float f10 = fM6097constructorimpl2;
            final float f11 = fM6097constructorimpl3;
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt$WorkItemView$2
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
                    WorkItemViewKt.m6759WorkItemViewKBW6s6s(work, z7, z9, str8, str9, str7, size3, f10, f11, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        fM6111unboximpl = Dp.m6097constructorimpl(20);
        f4 = fM6111unboximpl;
        if (size2 == Size.small) {
            z3 = true;
        } else {
            z3 = false;
        }
        f5 = 16;
        Dp dpM6095boximpl3 = Dp.m6095boximpl(Dp.m6097constructorimpl(f5));
        if (size2 == Size.big) {
            z4 = true;
        } else {
            z4 = false;
        }
        f6 = 30;
        f7 = 26;
        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z3, dpM6095boximpl3, CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7))))).m6111unboximpl();
        if (iIntValue2 >= 20) {
            fM6111unboximpl3 = Dp.m6097constructorimpl(22);
        } else if (iIntValue2 >= 16) {
            if (size2 == Size.small) {
                z5 = true;
            } else {
                z5 = false;
            }
            Dp dpM6095boximpl4 = Dp.m6095boximpl(Dp.m6097constructorimpl(f5));
            if (size2 == Size.big) {
                z6 = true;
            } else {
                z6 = false;
            }
            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, dpM6095boximpl4, CommonToolKt.ifv(z6, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7))))).m6111unboximpl();
        } else {
            fM6111unboximpl3 = Dp.m6097constructorimpl(18);
        }
        fM6097constructorimpl = Dp.m6097constructorimpl(60);
        listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(z7), Boolean.valueOf(z8)});
        if (listListOf instanceof Collection) {
            it = listListOf.iterator();
            i3 = 0;
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
        } else {
            it = listListOf.iterator();
            i3 = 0;
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
        }
        if (size2 == Size.small) {
            fM6097constructorimpl = Dp.m6097constructorimpl(40);
        }
        if (work.getName().length() > 3) {
            if (size2 == Size.small) {
                i4 = 8;
                sp2 = TextUnitKt.getSp(Math.max(8, iIntValue - 3));
            } else {
                i4 = 8;
                sp2 = sp3;
            }
            if (size2 == Size.normal) {
                sp = TextUnitKt.getSp(Math.max(i4, iIntValue - 2));
            } else {
                sp = sp2;
            }
        } else {
            sp = sp3;
        }
        if (!Intrinsics.areEqual(work.getName(), "")) {
            composerStartRestartGroup.startReplaceableGroup(-1323306986);
            modifier2 = modifier3;
            Modifier modifierM621width3ABfNKs2 = SizeKt.m621width3ABfNKs(SizeKt.m602height3ABfNKs(PaddingKt.m568paddingVpY3zN4(BackgroundKt.background$default(CommonUIKt.m6957radius3ABfNKs(PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, fM6097constructorimpl3, 1, null), fM6097constructorimpl2, 0.0f, 2, null), fM6097constructorimpl4), work.fetchCombineColor(), null, 0.0f, 6, null).then(modifier2), fM6111unboximpl4, fM6111unboximpl5), Dp.m6097constructorimpl(fM6111unboximpl2 + Dp.m6097constructorimpl(fM6111unboximpl3 * i3))), fM6097constructorimpl);
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM621width3ABfNKs2);
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
            TextKt.m2471Text4IGK_g(work.getName(), (Modifier) null, Color.INSTANCE.m3792getWhite0d7_KjU(), sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), sp, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 0, 129522);
            composerStartRestartGroup.startReplaceableGroup(-246890272);
            if (z7) {
                f8 = f4;
                TextKt.m2471Text4IGK_g(work.fetchBeginTime(), SizeKt.m602height3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m3792getWhite0d7_KjU(), sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130032);
            } else {
                f8 = f4;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1323306059);
            if (z8) {
                TextKt.m2471Text4IGK_g(work.fetchEndTime(), SizeKt.m602height3ABfNKs(Modifier.INSTANCE, f8), Color.INSTANCE.m3792getWhite0d7_KjU(), sp4, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130032);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            modifier2 = modifier3;
            composerStartRestartGroup.startReplaceableGroup(-1323305805);
            TextKt.m2471Text4IGK_g("", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 6, 0, 131070);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z10 = z8;
        final Size size4 = size2;
        final float f12 = fM6097constructorimpl2;
        final float f13 = fM6097constructorimpl3;
        final Modifier modifier5 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt$WorkItemView$2
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
                WorkItemViewKt.m6759WorkItemViewKBW6s6s(work, z7, z10, str8, str9, str7, size4, f12, f13, modifier5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: WholeWorkItemView-vz2T9sI, reason: not valid java name */
    public static final void m6758WholeWorkItemViewvz2T9sI(final ScheduleWork work, Size size, float f2, float f3, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(work, "work");
        Composer composerStartRestartGroup = composer.startRestartGroup(347741062);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WholeWorkItemView)P(4,2,1:c#ui.unit.Dp,3:c#ui.unit.Dp)");
        Size size2 = (i2 & 2) != 0 ? Size.normal : size;
        float fM6097constructorimpl = (i2 & 4) != 0 ? Dp.m6097constructorimpl(0) : f2;
        float fM6097constructorimpl2 = (i2 & 8) != 0 ? Dp.m6097constructorimpl(0) : f3;
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(347741062, i, -1, "cn.jianyun.workplan.module.schedule.views.work.WholeWorkItemView (WorkItemView.kt:116)");
        }
        float f4 = 3;
        float f5 = 8;
        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f4)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(12)), Dp.m6095boximpl(Dp.m6097constructorimpl(f5))))).m6111unboximpl();
        float f6 = 2;
        float fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f4))))).m6111unboximpl();
        float fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f6)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(f5)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
        long packedValue = ((TextUnit) CommonToolKt.ifv(size2 == Size.small, TextUnit.m6278boximpl(TextUnitKt.getSp(11)), CommonToolKt.ifv(size2 == Size.big, TextUnit.m6278boximpl(TextUnitKt.getSp(14)), TextUnit.m6278boximpl(TextUnitKt.getSp(13))))).getPackedValue();
        if (!Intrinsics.areEqual(work.getName(), "")) {
            composerStartRestartGroup.startReplaceableGroup(826421292);
            Modifier modifierM568paddingVpY3zN4 = PaddingKt.m568paddingVpY3zN4(BackgroundKt.background$default(CommonUIKt.m6957radius3ABfNKs(PaddingKt.m569paddingVpY3zN4$default(PaddingKt.m569paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, fM6097constructorimpl2, 1, null), fM6097constructorimpl, 0.0f, 2, null), fM6111unboximpl3), work.fetchCombineColor(), null, 0.0f, 6, null).then(modifier2), fM6111unboximpl, fM6111unboximpl2);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Updater.m3292setimpl(composerM3285constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3292setimpl(composerM3285constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3285constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3285constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3276boximpl(SkippableUpdater.m3277constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2471Text4IGK_g(work.getName(), (Modifier) null, Color.INSTANCE.m3792getWhite0d7_KjU(), packedValue, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130034);
            CommonUIKt.m6944BlankkHDZbjc(0.0f, composer2, 0, 1);
            TextKt.m2471Text4IGK_g(work.fetchShownTime(), (Modifier) null, Color.INSTANCE.m3792getWhite0d7_KjU(), packedValue, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(6), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 6, 130034);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        } else {
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(826422000);
            TextKt.m2471Text4IGK_g("", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131070);
            composer2.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Size size3 = size2;
        final float f7 = fM6097constructorimpl;
        final float f8 = fM6097constructorimpl2;
        final Modifier modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt$WholeWorkItemView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i3) {
                WorkItemViewKt.m6758WholeWorkItemViewvz2T9sI(work, size3, f7, f8, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: renamed from: EditWorkItemView-TN_CM5M, reason: not valid java name */
    public static final void m6757EditWorkItemViewTN_CM5M(final ScheduleWork work, Size size, float f2, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(work, "work");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(535403717);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EditWorkItemView)P(4,3,2:c#ui.unit.Dp)");
        Size size2 = (i2 & 2) != 0 ? Size.normal : size;
        float fM6097constructorimpl = (i2 & 4) != 0 ? Dp.m6097constructorimpl(0) : f2;
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(535403717, i, -1, "cn.jianyun.workplan.module.schedule.views.work.EditWorkItemView (WorkItemView.kt:154)");
        }
        float f3 = 3;
        float fM6111unboximpl = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f3)), Dp.m6095boximpl(Dp.m6097constructorimpl(8)))).m6111unboximpl();
        float fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(1)), Dp.m6095boximpl(Dp.m6097constructorimpl(f3)))).m6111unboximpl();
        float f4 = 4;
        float fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(f4)))).m6111unboximpl();
        long packedValue = ((TextUnit) CommonToolKt.ifv(size2 == Size.small, TextUnit.m6278boximpl(TextUnitKt.getSp(11)), TextUnit.m6278boximpl(TextUnitKt.getSp(13)))).getPackedValue();
        float fM6111unboximpl4 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(20)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(30)), Dp.m6095boximpl(Dp.m6097constructorimpl(26))))).m6111unboximpl();
        float fM6097constructorimpl2 = Dp.m6097constructorimpl(60);
        Alignment topEnd = Alignment.INSTANCE.getTopEnd();
        Modifier modifierM6957radius3ABfNKs = CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(f4));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(onClick);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt$EditWorkItemView$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM249clickableXHw0xAI$default = ClickableKt.m249clickableXHw0xAI$default(modifierM6957radius3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM249clickableXHw0xAI$default);
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
        final Modifier modifier3 = modifier2;
        TextKt.m2471Text4IGK_g(work.getName(), SizeKt.wrapContentSize$default(SizeKt.m621width3ABfNKs(SizeKt.m602height3ABfNKs(PaddingKt.m568paddingVpY3zN4(BackgroundKt.background$default(CommonUIKt.m6957radius3ABfNKs(PaddingKt.m567padding3ABfNKs(Modifier.INSTANCE, fM6097constructorimpl), fM6111unboximpl3), work.fetchCombineColor(), null, 0.0f, 6, null).then(modifier2), fM6111unboximpl, fM6111unboximpl2), fM6111unboximpl4), fM6097constructorimpl2), Alignment.INSTANCE.getCenter(), false, 2, null), Color.INSTANCE.m3792getWhite0d7_KjU(), packedValue, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5960boximpl(TextAlign.INSTANCE.m5967getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 0, 130544);
        IconViewKt.m6909IconViewRidXid8(IconFont.clear, TextUnitKt.getSp(10), ColorKt.getDeleteColor(), false, BackgroundKt.m214backgroundbw27NRU$default(CommonUIKt.m6957radius3ABfNKs(Modifier.INSTANCE, Dp.m6097constructorimpl(10)), Color.INSTANCE.m3792getWhite0d7_KjU(), null, 2, null), composerStartRestartGroup, 25014, 8);
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
        final Size size3 = size2;
        final float f5 = fM6097constructorimpl;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt$EditWorkItemView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                WorkItemViewKt.m6757EditWorkItemViewTN_CM5M(work, size3, f5, modifier3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void WorkTimeView(final ScheduleWork work, Size size, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(work, "work");
        Composer composerStartRestartGroup = composer.startRestartGroup(1940796268);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WorkTimeView)P(1)");
        Size size2 = (i2 & 2) != 0 ? Size.normal : size;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1940796268, i, -1, "cn.jianyun.workplan.module.schedule.views.work.WorkTimeView (WorkItemView.kt:190)");
        }
        float f2 = 3;
        ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f2)), Dp.m6095boximpl(Dp.m6097constructorimpl(6)))).m6111unboximpl();
        ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(1)), Dp.m6095boximpl(Dp.m6097constructorimpl(f2)))).m6111unboximpl();
        ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(2)), Dp.m6095boximpl(Dp.m6097constructorimpl(4)))).m6111unboximpl();
        final Size size3 = size2;
        TextKt.m2471Text4IGK_g(work.fetchShownTime(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.schedule.views.work.WorkItemViewKt.WorkTimeView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                WorkItemViewKt.WorkTimeView(work, size3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}