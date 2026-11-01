package cn.jianyun.workplan.widget.calendar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.RowKt;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.widget.WidgetConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetCalendarHeaderView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"WidgetCalendarHeaderView", "", "mondayFirst", "", "config", "Lcn/jianyun/workplan/widget/WidgetConfig;", "(ZLcn/jianyun/workplan/widget/WidgetConfig;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetCalendarHeaderViewKt {
    public static final void WidgetCalendarHeaderView(final boolean z, final WidgetConfig config, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(config, "config");
        Composer composerStartRestartGroup = composer.startRestartGroup(1691452213);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetCalendarHeaderView)P(1)");
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1691452213, i, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarHeaderView (WidgetCalendarHeaderView.kt:21)");
        }
        final List<String> monthHeaderInfo = MyDateTool.getMonthHeaderInfo(z);
        RowKt.m6574RowlMAjyxE(SizeModifiersKt.m6577height3ABfNKs(SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE), Dp.m6097constructorimpl(30)), 0, Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 482746521, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarHeaderViewKt.WidgetCalendarHeaderView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Row, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(Row, "$this$Row");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(482746521, i3, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarHeaderView.<anonymous> (WidgetCalendarHeaderView.kt:25)");
                }
                List<String> weeks = monthHeaderInfo;
                Intrinsics.checkNotNullExpressionValue(weeks, "weeks");
                WidgetConfig widgetConfig = config;
                for (String it : weeks) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    GlanceModifier glanceModifierDefaultWeight = Row.defaultWeight(GlanceModifier.INSTANCE);
                    int iM6618getCenterROrN78o = TextAlign.INSTANCE.m6618getCenterROrN78o();
                    long sp = TextUnitKt.getSp(12);
                    TextKt.Text(it, glanceModifierDefaultWeight, new TextStyle(widgetConfig.textProvider(), TextUnit.m6278boximpl(sp), FontWeight.m6601boximpl(FontWeight.INSTANCE.m6609getMediumWjrlUT0()), null, TextAlign.m6611boximpl(iM6618getCenterROrN78o), null, null, 104, null), 0, composer2, 0, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 3072, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarHeaderViewKt.WidgetCalendarHeaderView.2
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
                WidgetCalendarHeaderViewKt.WidgetCalendarHeaderView(z, config, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}