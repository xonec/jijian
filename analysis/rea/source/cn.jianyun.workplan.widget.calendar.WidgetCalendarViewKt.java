package cn.jianyun.workplan.widget.calendar;

import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.glance.BackgroundKt;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionKt;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.action.StartActivityActionKt;
import androidx.glance.appwidget.action.RunCallbackActionKt;
import androidx.glance.appwidget.action.StartActivityIntentActionKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.RowKt;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import cn.jianyun.timetable.widget.WidgetRefreshCallback;
import cn.jianyun.workplan.BuildConfig;
import cn.jianyun.workplan.main.MainActivity;
import cn.jianyun.workplan.main.Router;
import cn.jianyun.workplan.module.schedule.views.work.Size;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.widget.WidgetDataModel;
import com.adgain.sdk.base.models.AdConstants;
import com.alipay.sdk.m.t.e;
import com.bykv.vk.component.ttvideo.player.C;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetCalendarView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"WidgetCalendarView", "", e.m, "Lcn/jianyun/workplan/widget/WidgetDataModel;", "(Lcn/jianyun/workplan/widget/WidgetDataModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetCalendarViewKt {
    public static final void WidgetCalendarView(final WidgetDataModel data, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500004102);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetCalendarView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1500004102, i, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarView (WidgetCalendarView.kt:31)");
        }
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(BuildConfig.APPLICATION_ID, MainActivity.class.getName());
        intent.putExtra(MainActivity.EXTRA_TARGET_ROUTE, Router.Widget.INSTANCE.getRoute());
        intent.addFlags(C.ENCODING_PCM_MU_LAW);
        ColumnKt.m6527ColumnK4GKKTE(null, 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2018368836, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt.WidgetCalendarView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Column, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(Column, "$this$Column");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2018368836, i2, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarView.<anonymous> (WidgetCalendarView.kt:37)");
                }
                float f2 = 10;
                GlanceModifier glanceModifierM6570paddingVpY3zN4$default = PaddingKt.m6570paddingVpY3zN4$default(SizeModifiersKt.fillMaxWidth(BackgroundKt.background(PaddingKt.m6570paddingVpY3zN4$default(GlanceModifier.INSTANCE, Dp.m6097constructorimpl(f2), 0.0f, 2, null), data.getWidgetConfig().headerBgProvider())), 0.0f, Dp.m6097constructorimpl(f2), 1, null);
                int iM6503getCenterVerticallymnfRV0w = Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w();
                final WidgetDataModel widgetDataModel = data;
                final Intent intent2 = intent;
                RowKt.m6574RowlMAjyxE(glanceModifierM6570paddingVpY3zN4$default, 0, iM6503getCenterVerticallymnfRV0w, ComposableLambdaKt.composableLambda(composer2, 1243489632, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt.WidgetCalendarView.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(RowScope Row, Composer composer3, int i3) {
                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1243489632, i3, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarView.<anonymous>.<anonymous> (WidgetCalendarView.kt:43)");
                        }
                        TextKt.Text(widgetDataModel.getYear() + widgetDataModel.getMonth() + "排班", ActionKt.clickable(GlanceModifier.INSTANCE, StartActivityIntentActionKt.actionStartActivity(intent2, ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]))), new TextStyle(widgetDataModel.getWidgetConfig().headerTextProvider(), TextUnit.m6278boximpl(TextUnitKt.getSp(16)), FontWeight.m6601boximpl(FontWeight.INSTANCE.m6609getMediumWjrlUT0()), null, null, null, null, 120, null), 0, composer3, 0, 8);
                        TextKt.Text("", Row.defaultWeight(GlanceModifier.INSTANCE), null, 0, composer3, 6, 12);
                        TextKt.Text("上个月", ActionKt.clickable(GlanceModifier.INSTANCE, RunCallbackActionKt.actionRunCallback(WidgetRefreshCallback.class, ActionParametersKt.actionParametersOf(WidgetRefreshCallback.INSTANCE.getMonthKey().to("-1"), WidgetRefreshCallback.INSTANCE.getCurrentDate().to(widgetDataModel.getDate())))), new TextStyle(widgetDataModel.getWidgetConfig().headerTextProvider(), TextUnit.m6278boximpl(TextUnitKt.getSp(10)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 124, null), 0, composer3, 6, 8);
                        CommonUIKt.m6945GlanceBlankkHDZbjc(0.0f, composer3, 0, 1);
                        TextKt.Text("本月", ActionKt.clickable(GlanceModifier.INSTANCE, RunCallbackActionKt.actionRunCallback(WidgetRefreshCallback.class, ActionParametersKt.actionParametersOf(WidgetRefreshCallback.INSTANCE.getMonthKey().to(AdConstants.FAIL)))), new TextStyle(widgetDataModel.getWidgetConfig().headerTextProvider(), TextUnit.m6278boximpl(TextUnitKt.getSp(10)), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, 124, null), 0, composer3, 6, 8);
                        CommonUIKt.m6945GlanceBlankkHDZbjc(0.0f, composer3, 0, 1);
                        TextKt.Text("下个月", ActionKt.clickable(GlanceModifier.INSTANCE, RunCallbackActionKt.actionRunCallback(WidgetRefreshCallback.class, ActionParametersKt.actionParametersOf(WidgetRefreshCallback.INSTANCE.getMonthKey().to("1"), WidgetRefreshCallback.INSTANCE.getCurrentDate().to(widgetDataModel.getDate())))), new TextStyle(widgetDataModel.getWidgetConfig().headerTextProvider(), TextUnit.m6278boximpl(TextUnitKt.getSp(10)), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 124, null), 0, composer3, 6, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 3072, 2);
                GlanceModifier glanceModifierM6570paddingVpY3zN4$default2 = PaddingKt.m6570paddingVpY3zN4$default(BackgroundKt.background(ActionKt.clickable(GlanceModifier.INSTANCE, StartActivityActionKt.actionStartActivity(MainActivity.class, ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]))), data.getWidgetConfig().bodyBgProvider()), Dp.m6097constructorimpl(5), 0.0f, 2, null);
                final WidgetDataModel widgetDataModel2 = data;
                ColumnKt.m6527ColumnK4GKKTE(glanceModifierM6570paddingVpY3zN4$default2, 0, 0, ComposableLambdaKt.composableLambda(composer2, 962939022, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt.WidgetCalendarView.1.2
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Column2, Composer composer3, int i3) {
                        Intrinsics.checkNotNullParameter(Column2, "$this$Column");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(962939022, i3, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarView.<anonymous>.<anonymous> (WidgetCalendarView.kt:76)");
                        }
                        WidgetCalendarHeaderViewKt.WidgetCalendarHeaderView(widgetDataModel2.getWidgetConfig().getMondayFirst(), widgetDataModel2.getWidgetConfig(), composer3, 64, 0);
                        WidgetDataModel widgetDataModel3 = widgetDataModel2;
                        final WidgetDataModel widgetDataModel4 = widgetDataModel2;
                        WidgetCalendarBodyViewKt.WidgetCalendarBodyView(widgetDataModel3, ComposableLambdaKt.composableLambda(composer3, -1670447547, true, new Function3<Date, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt.WidgetCalendarView.1.2.1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Date date, Composer composer4, Integer num) {
                                invoke(date, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Date date, Composer composer4, int i4) {
                                Intrinsics.checkNotNullParameter(date, "date");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1670447547, i4, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarView.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarView.kt:78)");
                                }
                                float f3 = 3;
                                WidgetWorkItemViewKt.m6966WidgetWorkItemViewEQC0FA8(widgetDataModel4.fetchDutyWork(date), widgetDataModel4.getWidgetConfig().getShowBeginTime(), widgetDataModel4.getWidgetConfig().getShowEndTime(), widgetDataModel4.getWidgetConfig().getWorkFontSize(), widgetDataModel4.getWidgetConfig().getTimeFontSize(), Size.small, Dp.m6097constructorimpl(f3), 0.0f, SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE), composer4, 1769480, 128);
                                composer4.startReplaceableGroup(1129688136);
                                if (!Intrinsics.areEqual(widgetDataModel4.fetchSecondDutyWork(date).getName(), "")) {
                                    CommonUIKt.m6945GlanceBlankkHDZbjc(Dp.m6097constructorimpl(2), composer4, 6, 0);
                                    WidgetWorkItemViewKt.m6966WidgetWorkItemViewEQC0FA8(widgetDataModel4.fetchSecondDutyWork(date), widgetDataModel4.getWidgetConfig().getShowBeginTime(), widgetDataModel4.getWidgetConfig().getShowEndTime(), widgetDataModel4.getWidgetConfig().getWorkFontSize(), widgetDataModel4.getWidgetConfig().getTimeFontSize(), Size.small, Dp.m6097constructorimpl(f3), 0.0f, SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE), composer4, 1769480, 128);
                                }
                                composer4.endReplaceableGroup();
                                if (widgetDataModel4.getWidgetConfig().getShowRemark()) {
                                    TextKt.Text(widgetDataModel4.fetchDutyRemark(date), null, new TextStyle(widgetDataModel4.getWidgetConfig().markProvider(), TextUnit.m6278boximpl(TextUnitKt.getSp(8)), null, null, null, null, null, 124, null), 0, composer4, 0, 10);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer3, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt.WidgetCalendarView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                WidgetCalendarViewKt.WidgetCalendarView(data, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}