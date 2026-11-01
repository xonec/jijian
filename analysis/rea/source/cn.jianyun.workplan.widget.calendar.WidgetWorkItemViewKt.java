package cn.jianyun.workplan.widget.calendar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.glance.BackgroundKt;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.ColorProviderKt;
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: WidgetWorkItemView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"WidgetWorkItemView", "", "work", "Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;", "showBeginTime", "", "showEndTime", "workFontSize", "", "timeFontSize", "size", "Lcn/jianyun/workplan/module/schedule/views/work/Size;", "padding", "Landroidx/compose/ui/unit/Dp;", "vpadding", "modifier", "Landroidx/glance/GlanceModifier;", "WidgetWorkItemView-EQC0FA8", "(Lcn/jianyun/workplan/module/schedule/model/ScheduleWork;ZZLjava/lang/String;Ljava/lang/String;Lcn/jianyun/workplan/module/schedule/views/work/Size;FFLandroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetWorkItemViewKt {
    /* JADX WARN: Code duplicated, block: B:111:0x022f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x0243  */
    /* JADX WARN: Code duplicated, block: B:119:0x0272  */
    /* JADX WARN: Code duplicated, block: B:120:0x027a  */
    /* JADX WARN: Code duplicated, block: B:122:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0287  */
    /* JADX WARN: Code duplicated, block: B:125:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x028d  */
    /* JADX WARN: Code duplicated, block: B:129:0x029b  */
    /* JADX WARN: Code duplicated, block: B:130:0x029d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0308  */
    /* JADX WARN: Code duplicated, block: B:144:0x0312  */
    /* JADX WARN: Code duplicated, block: B:151:0x032e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0336  */
    /* JADX WARN: Code duplicated, block: B:154:0x033e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0352  */
    /* JADX WARN: Code duplicated, block: B:159:0x0356  */
    /* JADX WARN: Code duplicated, block: B:162:0x0368  */
    /* JADX WARN: Code duplicated, block: B:165:0x0382  */
    /* JADX WARN: Code duplicated, block: B:166:0x0410  */
    /* JADX WARN: Code duplicated, block: B:169:0x043a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0444  */
    /* JADX WARN: Code duplicated, block: B:179:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x030c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WidgetWorkItemView-EQC0FA8, reason: not valid java name */
    public static final void m6966WidgetWorkItemViewEQC0FA8(final ScheduleWork work, boolean z, boolean z2, String str, String str2, Size size, float f2, float f3, GlanceModifier glanceModifier, Composer composer, final int i, final int i2) {
        Object objM7405constructorimpl;
        Object objM7405constructorimpl2;
        float fM6111unboximpl;
        boolean z3;
        boolean z4;
        float f4;
        final float f5;
        GlanceModifier glanceModifier2;
        float f6;
        float fM6111unboximpl2;
        boolean z5;
        boolean z6;
        float fM6111unboximpl3;
        boolean z7;
        float fM6111unboximpl4;
        int i3;
        List listListOf;
        Iterator it;
        GlanceModifier glanceModifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(work, "work");
        Composer composerStartRestartGroup = composer.startRestartGroup(-75877917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetWorkItemView)P(7,2,3,8,5,4,1:c#ui.unit.Dp,6:c#ui.unit.Dp)");
        final boolean z8 = (i2 & 2) != 0 ? false : z;
        boolean z9 = (i2 & 4) != 0 ? false : z2;
        String str3 = (i2 & 8) != 0 ? "11" : str;
        String str4 = (i2 & 16) == 0 ? str2 : "11";
        Size size2 = (i2 & 32) != 0 ? Size.normal : size;
        float fM6097constructorimpl = (i2 & 64) != 0 ? Dp.m6097constructorimpl(0) : f2;
        float fM6097constructorimpl2 = (i2 & 128) != 0 ? Dp.m6097constructorimpl(0) : f3;
        GlanceModifier.Companion companion = (i2 & 256) != 0 ? GlanceModifier.INSTANCE : glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-75877917, i, -1, "cn.jianyun.workplan.widget.calendar.WidgetWorkItemView (WidgetWorkItemView.kt:24)");
        }
        float f7 = 3;
        float f8 = 8;
        float fM6111unboximpl5 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f7)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(12)), Dp.m6095boximpl(Dp.m6097constructorimpl(f8))))).m6111unboximpl();
        float f9 = 2;
        float fM6111unboximpl6 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f9)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(6)), Dp.m6095boximpl(Dp.m6097constructorimpl(f7))))).m6111unboximpl();
        float fM6111unboximpl7 = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(f9)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(f8)), Dp.m6095boximpl(Dp.m6097constructorimpl(4))))).m6111unboximpl();
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(str3)));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
        }
        final String str5 = str3;
        Object objIfv = CommonToolKt.ifv(size2 == Size.small, 11, CommonToolKt.ifv(size2 == Size.big, 14, 13));
        if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
            objM7405constructorimpl = objIfv;
        }
        int iIntValue = ((Number) objM7405constructorimpl).intValue();
        try {
            Result.Companion companion4 = Result.INSTANCE;
            objM7405constructorimpl2 = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(str4)));
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            objM7405constructorimpl2 = Result.m7405constructorimpl(ResultKt.createFailure(th2));
        }
        final String str6 = str4;
        Object objIfv2 = CommonToolKt.ifv(size2 == Size.small, 11, CommonToolKt.ifv(size2 == Size.big, 14, 13));
        if (Result.m7411isFailureimpl(objM7405constructorimpl2)) {
            objM7405constructorimpl2 = objIfv2;
        }
        int iIntValue2 = ((Number) objM7405constructorimpl2).intValue();
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = TextUnitKt.getSp(iIntValue);
        final long sp = TextUnitKt.getSp(iIntValue2);
        if (iIntValue2 < 20) {
            if (iIntValue2 < 16) {
                fM6111unboximpl = ((Dp) CommonToolKt.ifv(size2 == Size.small, Dp.m6095boximpl(Dp.m6097constructorimpl(14)), CommonToolKt.ifv(size2 == Size.big, Dp.m6095boximpl(Dp.m6097constructorimpl(15)), Dp.m6095boximpl(Dp.m6097constructorimpl(13))))).m6111unboximpl();
            } else {
                fM6111unboximpl = Dp.m6097constructorimpl(17);
            }
            if (size2 == Size.small) {
                z3 = true;
            } else {
                z3 = false;
            }
            Dp dpM6095boximpl = Dp.m6095boximpl(Dp.m6097constructorimpl(20));
            if (size2 == Size.big) {
                z4 = true;
            } else {
                z4 = false;
            }
            f4 = 30;
            f5 = fM6111unboximpl;
            glanceModifier2 = companion;
            f6 = 26;
            fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z3, dpM6095boximpl, CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f4)), Dp.m6095boximpl(Dp.m6097constructorimpl(f6))))).m6111unboximpl();
            if (iIntValue2 >= 20) {
                fM6111unboximpl3 = Dp.m6097constructorimpl(22);
            } else if (iIntValue2 >= 16) {
                if (size2 == Size.small) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Dp dpM6095boximpl2 = Dp.m6095boximpl(Dp.m6097constructorimpl(16));
                if (size2 == Size.big) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, dpM6095boximpl2, CommonToolKt.ifv(z6, Dp.m6095boximpl(Dp.m6097constructorimpl(f4)), Dp.m6095boximpl(Dp.m6097constructorimpl(f6))))).m6111unboximpl();
            } else {
                fM6111unboximpl3 = Dp.m6097constructorimpl(18);
            }
            if (size2 == Size.small) {
                z7 = true;
            } else {
                z7 = false;
            }
            fM6111unboximpl4 = ((Dp) CommonToolKt.ifv(z7, Dp.m6095boximpl(Dp.m6097constructorimpl(40)), Dp.m6095boximpl(Dp.m6097constructorimpl(60)))).m6111unboximpl();
            i3 = 0;
            listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(z8), Boolean.valueOf(z9)});
            if ((listListOf instanceof Collection) || !listListOf.isEmpty()) {
                it = listListOf.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue() && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (Math.max(iIntValue, iIntValue2) >= 20) {
                if (Math.max(iIntValue, iIntValue2) >= 16) {
                    fM6111unboximpl4 = Dp.m6097constructorimpl(48);
                }
            } else {
                fM6111unboximpl4 = Dp.m6097constructorimpl(56);
            }
            if (work.getName().length() > 3) {
                if (size2 == Size.small) {
                    longRef.element = TextUnitKt.getSp(Math.max(8, iIntValue - 3));
                }
                if (size2 == Size.normal) {
                    longRef.element = TextUnitKt.getSp(Math.max(8, iIntValue - 2));
                }
            }
            if (!Intrinsics.areEqual(work.getName(), "")) {
                composerStartRestartGroup.startReplaceableGroup(-1176120692);
                glanceModifier3 = glanceModifier2;
                final boolean z10 = z8;
                final boolean z11 = z9;
                ColumnKt.m6527ColumnK4GKKTE(SizeModifiersKt.m6580width3ABfNKs(SizeModifiersKt.m6577height3ABfNKs(PaddingKt.m6569paddingVpY3zN4(BackgroundKt.background(CommonUIKt.m6958radius3ABfNKs(PaddingKt.m6570paddingVpY3zN4$default(PaddingKt.m6570paddingVpY3zN4$default(GlanceModifier.INSTANCE, 0.0f, fM6097constructorimpl2, 1, null), fM6097constructorimpl, 0.0f, 2, null), fM6111unboximpl7), ColorProviderKt.m6643ColorProvider8_81llA(CommonToolKt.color(work.getTheme()))).then(glanceModifier3), fM6111unboximpl5, fM6111unboximpl6), Dp.m6097constructorimpl(fM6111unboximpl2 + Dp.m6097constructorimpl(fM6111unboximpl3 * i3))), fM6111unboximpl4), Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w(), Alignment.INSTANCE.m6502getCenterHorizontallyPGIyAqw(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 59453612, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetWorkItemViewKt$WidgetWorkItemView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Column, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(Column, "$this$Column");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(59453612, i4, -1, "cn.jianyun.workplan.widget.calendar.WidgetWorkItemView.<anonymous> (WidgetWorkItemView.kt:75)");
                        }
                        String name = work.getName();
                        long j = longRef.element;
                        TextKt.Text(name, null, new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(j), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 10);
                        composer2.startReplaceableGroup(-629345811);
                        if (z10) {
                            TextKt.Text(work.fetchBeginTime(), SizeModifiersKt.m6577height3ABfNKs(GlanceModifier.INSTANCE, f5), new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(sp), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 8);
                        }
                        composer2.endReplaceableGroup();
                        if (z11) {
                            TextKt.Text(work.fetchEndTime(), SizeModifiersKt.m6577height3ABfNKs(GlanceModifier.INSTANCE, f5), new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(sp), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                glanceModifier3 = glanceModifier2;
                composerStartRestartGroup.startReplaceableGroup(-1176119106);
                TextKt.Text("", null, null, 0, composerStartRestartGroup, 6, 14);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z12 = z9;
            final Size size3 = size2;
            final float f10 = fM6097constructorimpl;
            final float f11 = fM6097constructorimpl2;
            final GlanceModifier glanceModifier4 = glanceModifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetWorkItemViewKt$WidgetWorkItemView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    WidgetWorkItemViewKt.m6966WidgetWorkItemViewEQC0FA8(work, z8, z12, str5, str6, size3, f10, f11, glanceModifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        fM6111unboximpl = Dp.m6097constructorimpl(20);
        if (size2 == Size.small) {
            z3 = true;
        } else {
            z3 = false;
        }
        Dp dpM6095boximpl3 = Dp.m6095boximpl(Dp.m6097constructorimpl(20));
        if (size2 == Size.big) {
            z4 = true;
        } else {
            z4 = false;
        }
        f4 = 30;
        f5 = fM6111unboximpl;
        glanceModifier2 = companion;
        f6 = 26;
        fM6111unboximpl2 = ((Dp) CommonToolKt.ifv(z3, dpM6095boximpl3, CommonToolKt.ifv(z4, Dp.m6095boximpl(Dp.m6097constructorimpl(f4)), Dp.m6095boximpl(Dp.m6097constructorimpl(f6))))).m6111unboximpl();
        if (iIntValue2 >= 20) {
            fM6111unboximpl3 = Dp.m6097constructorimpl(22);
        } else if (iIntValue2 >= 16) {
            if (size2 == Size.small) {
                z5 = true;
            } else {
                z5 = false;
            }
            Dp dpM6095boximpl4 = Dp.m6095boximpl(Dp.m6097constructorimpl(16));
            if (size2 == Size.big) {
                z6 = true;
            } else {
                z6 = false;
            }
            fM6111unboximpl3 = ((Dp) CommonToolKt.ifv(z5, dpM6095boximpl4, CommonToolKt.ifv(z6, Dp.m6095boximpl(Dp.m6097constructorimpl(f4)), Dp.m6095boximpl(Dp.m6097constructorimpl(f6))))).m6111unboximpl();
        } else {
            fM6111unboximpl3 = Dp.m6097constructorimpl(18);
        }
        if (size2 == Size.small) {
            z7 = true;
        } else {
            z7 = false;
        }
        fM6111unboximpl4 = ((Dp) CommonToolKt.ifv(z7, Dp.m6095boximpl(Dp.m6097constructorimpl(40)), Dp.m6095boximpl(Dp.m6097constructorimpl(60)))).m6111unboximpl();
        i3 = 0;
        listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(z8), Boolean.valueOf(z9)});
        if (listListOf instanceof Collection) {
            it = listListOf.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
        } else {
            it = listListOf.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                }
            }
        }
        if (Math.max(iIntValue, iIntValue2) >= 20) {
            if (Math.max(iIntValue, iIntValue2) >= 16) {
                fM6111unboximpl4 = Dp.m6097constructorimpl(48);
            }
        } else {
            fM6111unboximpl4 = Dp.m6097constructorimpl(56);
        }
        if (work.getName().length() > 3) {
            if (size2 == Size.small) {
                longRef.element = TextUnitKt.getSp(Math.max(8, iIntValue - 3));
            }
            if (size2 == Size.normal) {
                longRef.element = TextUnitKt.getSp(Math.max(8, iIntValue - 2));
            }
        }
        if (!Intrinsics.areEqual(work.getName(), "")) {
            composerStartRestartGroup.startReplaceableGroup(-1176120692);
            glanceModifier3 = glanceModifier2;
            final boolean z13 = z8;
            final boolean z14 = z9;
            ColumnKt.m6527ColumnK4GKKTE(SizeModifiersKt.m6580width3ABfNKs(SizeModifiersKt.m6577height3ABfNKs(PaddingKt.m6569paddingVpY3zN4(BackgroundKt.background(CommonUIKt.m6958radius3ABfNKs(PaddingKt.m6570paddingVpY3zN4$default(PaddingKt.m6570paddingVpY3zN4$default(GlanceModifier.INSTANCE, 0.0f, fM6097constructorimpl2, 1, null), fM6097constructorimpl, 0.0f, 2, null), fM6111unboximpl7), ColorProviderKt.m6643ColorProvider8_81llA(CommonToolKt.color(work.getTheme()))).then(glanceModifier3), fM6111unboximpl5, fM6111unboximpl6), Dp.m6097constructorimpl(fM6111unboximpl2 + Dp.m6097constructorimpl(fM6111unboximpl3 * i3))), fM6111unboximpl4), Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w(), Alignment.INSTANCE.m6502getCenterHorizontallyPGIyAqw(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 59453612, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetWorkItemViewKt$WidgetWorkItemView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Column, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(Column, "$this$Column");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(59453612, i4, -1, "cn.jianyun.workplan.widget.calendar.WidgetWorkItemView.<anonymous> (WidgetWorkItemView.kt:75)");
                    }
                    String name = work.getName();
                    long j = longRef.element;
                    TextKt.Text(name, null, new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(j), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 10);
                    composer2.startReplaceableGroup(-629345811);
                    if (z13) {
                        TextKt.Text(work.fetchBeginTime(), SizeModifiersKt.m6577height3ABfNKs(GlanceModifier.INSTANCE, f5), new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(sp), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 8);
                    }
                    composer2.endReplaceableGroup();
                    if (z14) {
                        TextKt.Text(work.fetchEndTime(), SizeModifiersKt.m6577height3ABfNKs(GlanceModifier.INSTANCE, f5), new TextStyle(ColorProviderKt.m6643ColorProvider8_81llA(Color.INSTANCE.m3792getWhite0d7_KjU()), TextUnit.m6278boximpl(sp), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer2, 0, 8);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 3072, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            glanceModifier3 = glanceModifier2;
            composerStartRestartGroup.startReplaceableGroup(-1176119106);
            TextKt.Text("", null, null, 0, composerStartRestartGroup, 6, 14);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z15 = z9;
        final Size size4 = size2;
        final float f12 = fM6097constructorimpl;
        final float f13 = fM6097constructorimpl2;
        final GlanceModifier glanceModifier5 = glanceModifier3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetWorkItemViewKt$WidgetWorkItemView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                WidgetWorkItemViewKt.m6966WidgetWorkItemViewEQC0FA8(work, z8, z15, str5, str6, size4, f12, f13, glanceModifier5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}