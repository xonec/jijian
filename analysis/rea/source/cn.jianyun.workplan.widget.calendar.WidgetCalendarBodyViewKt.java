package cn.jianyun.workplan.widget.calendar;

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
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.action.ActionKt;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.action.StartActivityActionKt;
import androidx.glance.appwidget.lazy.LazyItemScope;
import androidx.glance.appwidget.lazy.LazyListKt;
import androidx.glance.appwidget.lazy.LazyListScope;
import androidx.glance.color.DayNightColorProvider;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.BoxKt;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.RowKt;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.ColorProvider;
import cn.jianyun.workplan.R;
import cn.jianyun.workplan.main.MainActivity;
import cn.jianyun.workplan.model.MonthDateInfo;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.widget.WidgetConfig;
import cn.jianyun.workplan.widget.WidgetDataModel;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: WidgetCalendarBodyView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"WidgetCalendarBodyView", "", "viewModel", "Lcn/jianyun/workplan/widget/WidgetDataModel;", "content", "Lkotlin/Function1;", "Ljava/util/Date;", "Landroidx/compose/runtime/Composable;", "(Lcn/jianyun/workplan/widget/WidgetDataModel;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "WidgetVerticalView", "text", "", "modifier", "Landroidx/glance/GlanceModifier;", "color", "Landroidx/glance/unit/ColorProvider;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "WidgetVerticalView-JHQioms", "(Ljava/lang/String;Landroidx/glance/GlanceModifier;Landroidx/glance/unit/ColorProvider;JLandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetCalendarBodyViewKt {
    public static final void WidgetCalendarBodyView(final WidgetDataModel viewModel, final Function3<? super Date, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Object objM7405constructorimpl;
        float fM6097constructorimpl;
        float fM6097constructorimpl2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520218297);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetCalendarBodyView)P(1)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1520218297, i, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView (WidgetCalendarBodyView.kt:34)");
        }
        final WidgetConfig widgetConfig = viewModel.getWidgetConfig();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(Integer.valueOf(Integer.parseInt(widgetConfig.getDateFontSize())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7405constructorimpl = Result.m7405constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7411isFailureimpl(objM7405constructorimpl)) {
            objM7405constructorimpl = 17;
        }
        int iIntValue = ((Number) objM7405constructorimpl).intValue();
        final long sp = TextUnitKt.getSp(iIntValue);
        if (iIntValue >= 24) {
            fM6097constructorimpl = Dp.m6097constructorimpl(34);
        } else if (iIntValue >= 20) {
            fM6097constructorimpl = Dp.m6097constructorimpl(30);
        } else {
            fM6097constructorimpl = Dp.m6097constructorimpl(26);
        }
        final float f2 = fM6097constructorimpl;
        if (iIntValue >= 24) {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(40);
        } else if (iIntValue >= 20) {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(35);
        } else {
            fM6097constructorimpl2 = Dp.m6097constructorimpl(30);
        }
        final float f3 = fM6097constructorimpl2;
        BoxKt.Box(null, Alignment.INSTANCE.getCenter(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -326353879, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt.WidgetCalendarBodyView.1
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

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-326353879, i2, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous> (WidgetCalendarBodyView.kt:48)");
                    }
                    float f4 = 2;
                    GlanceModifier glanceModifierM6572paddingqDBjuR0$default = PaddingKt.m6572paddingqDBjuR0$default(GlanceModifier.INSTANCE, 0.0f, Dp.m6097constructorimpl(f4), 0.0f, Dp.m6097constructorimpl(f4), 5, null);
                    final WidgetDataModel widgetDataModel = viewModel;
                    final float f5 = f3;
                    final Function3<Date, Composer, Integer, Unit> function3 = content;
                    final int i3 = i;
                    final WidgetConfig widgetConfig2 = widgetConfig;
                    final long j = sp;
                    final float f6 = f2;
                    LazyListKt.m6473LazyColumnEiNPFjs(glanceModifierM6572paddingqDBjuR0$default, 0, new Function1<LazyListScope, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt.WidgetCalendarBodyView.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final WidgetDataModel widgetDataModel2 = widgetDataModel;
                            final float f7 = f5;
                            final Function3<Date, Composer, Integer, Unit> function4 = function3;
                            final int i4 = i3;
                            final WidgetConfig widgetConfig3 = widgetConfig2;
                            final long j2 = j;
                            final float f8 = f6;
                            LazyListScope.item$default(LazyColumn, 0L, ComposableLambdaKt.composableLambdaInstance(768176246, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt.WidgetCalendarBodyView.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer3, Integer num) {
                                    invoke(lazyItemScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer3, int i5) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(768176246, i5, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarBodyView.kt:50)");
                                    }
                                    final WidgetDataModel widgetDataModel3 = widgetDataModel2;
                                    final float f9 = f7;
                                    final Function3<Date, Composer, Integer, Unit> function5 = function4;
                                    final int i6 = i4;
                                    final WidgetConfig widgetConfig4 = widgetConfig3;
                                    final long j3 = j2;
                                    final float f10 = f8;
                                    ColumnKt.m6527ColumnK4GKKTE(null, 0, 0, ComposableLambdaKt.composableLambda(composer3, -1497318804, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt.WidgetCalendarBodyView.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer4, Integer num) {
                                            invoke(columnScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(ColumnScope Column, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(Column, "$this$Column");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1497318804, i7, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarBodyView.kt:51)");
                                            }
                                            composer4.startReplaceableGroup(-515710480);
                                            List<List<MonthDateInfo>> monthInfos = widgetDataModel3.getMonthInfos();
                                            float f11 = f9;
                                            Function3<Date, Composer, Integer, Unit> function6 = function5;
                                            int i8 = i6;
                                            WidgetConfig widgetConfig5 = widgetConfig4;
                                            long j4 = j3;
                                            float f12 = f10;
                                            Iterator<T> it = monthInfos.iterator();
                                            while (it.hasNext()) {
                                                final List list = (List) it.next();
                                                final float f13 = f11;
                                                final Function3<Date, Composer, Integer, Unit> function7 = function6;
                                                final int i9 = i8;
                                                final WidgetConfig widgetConfig6 = widgetConfig5;
                                                final float f14 = f12;
                                                final long j5 = j4;
                                                RowKt.m6574RowlMAjyxE(SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE), 0, 0, ComposableLambdaKt.composableLambda(composer4, -1823752411, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt$WidgetCalendarBodyView$1$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer5, Integer num) {
                                                        invoke(rowScope, composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(RowScope rowScope, Composer composer5, int i10) {
                                                        RowScope Row = rowScope;
                                                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1823752411, i10, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarBodyView.kt:53)");
                                                        }
                                                        List<MonthDateInfo> list2 = list;
                                                        final float f15 = f13;
                                                        final Function3<Date, Composer, Integer, Unit> function8 = function7;
                                                        final int i11 = i9;
                                                        final WidgetConfig widgetConfig7 = widgetConfig6;
                                                        final long j6 = j5;
                                                        final float f16 = f14;
                                                        for (final MonthDateInfo monthDateInfo : list2) {
                                                            ColumnKt.m6527ColumnK4GKKTE(PaddingKt.m6570paddingVpY3zN4$default(Row.defaultWeight(PaddingKt.m6570paddingVpY3zN4$default(CommonUIKt.m6958radius3ABfNKs(ActionKt.clickable(GlanceModifier.INSTANCE, StartActivityActionKt.actionStartActivity(MainActivity.class, ActionParametersKt.actionParametersOf(new ActionParameters.Pair[0]))), Dp.m6097constructorimpl(4)), Dp.m6097constructorimpl(2), 0.0f, 2, null)), 0.0f, Dp.m6097constructorimpl(1), 1, null), Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w(), Alignment.INSTANCE.m6502getCenterHorizontallyPGIyAqw(), ComposableLambdaKt.composableLambda(composer5, 2099111114, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt$WidgetCalendarBodyView$1$1$1$1$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(3);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function3
                                                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer6, Integer num) {
                                                                    invoke(columnScope, composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(ColumnScope Column2, Composer composer6, int i12) {
                                                                    Intrinsics.checkNotNullParameter(Column2, "$this$Column");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(2099111114, i12, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarBodyView.kt:63)");
                                                                    }
                                                                    GlanceModifier glanceModifierM6577height3ABfNKs = SizeModifiersKt.m6577height3ABfNKs(SizeModifiersKt.m6580width3ABfNKs(GlanceModifier.INSTANCE, Dp.m6097constructorimpl(40)), f15);
                                                                    int iM6502getCenterHorizontallyPGIyAqw = Alignment.INSTANCE.m6502getCenterHorizontallyPGIyAqw();
                                                                    int iM6503getCenterVerticallymnfRV0w = Alignment.INSTANCE.m6503getCenterVerticallymnfRV0w();
                                                                    final MonthDateInfo monthDateInfo2 = monthDateInfo;
                                                                    final WidgetConfig widgetConfig8 = widgetConfig7;
                                                                    final long j7 = j6;
                                                                    final float f17 = f16;
                                                                    RowKt.m6574RowlMAjyxE(glanceModifierM6577height3ABfNKs, iM6502getCenterHorizontallyPGIyAqw, iM6503getCenterVerticallymnfRV0w, ComposableLambdaKt.composableLambda(composer6, -1817581082, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt$WidgetCalendarBodyView$1$1$1$1$1$1$1$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(3);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function3
                                                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope2, Composer composer7, Integer num) {
                                                                            invoke(rowScope2, composer7, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(RowScope Row2, Composer composer7, int i13) {
                                                                            Intrinsics.checkNotNullParameter(Row2, "$this$Row");
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-1817581082, i13, -1, "cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WidgetCalendarBodyView.kt:68)");
                                                                            }
                                                                            TextKt.Text(monthDateInfo2.getDay(), BackgroundKt.m6406backgroundPLcKuY0$default(SizeModifiersKt.m6580width3ABfNKs(GlanceModifier.INSTANCE, f17), (ImageProvider) CommonToolKt.ifv(monthDateInfo2.getToday(), ImageKt.ImageProvider(R.drawable.widget_today), ImageKt.ImageProvider(R.drawable.widget_otherday)), 0, null, 6, null), new TextStyle(widgetConfig8.textProvider(), TextUnit.m6278boximpl(j7), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composer7, 0, 8);
                                                                            if (widgetConfig8.getShowLunar() || (widgetConfig8.getShowFestival() && monthDateInfo2.getHoliday())) {
                                                                                WidgetCalendarBodyViewKt.m6965WidgetVerticalViewJHQioms(monthDateInfo2.getLunarDay(), null, new DayNightColorProvider(monthDateInfo2.m6705fetchLunarColorvNxB06k(widgetConfig8.getTintColor()), monthDateInfo2.m6705fetchLunarColorvNxB06k(widgetConfig8.getDarkTintColor()), null), TextUnitKt.getSp(6), composer7, ((DayNightColorProvider.$stable | 0) << 6) | 3072, 2);
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }), composer6, 3072, 0);
                                                                    if (!Intrinsics.areEqual(monthDateInfo.getDay(), "")) {
                                                                        function8.invoke(monthDateInfo.getDate(), composer6, Integer.valueOf((i11 & 112) | 8));
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }), composer5, 3072, 0);
                                                            Row = rowScope;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), composer4, 3072, 6);
                                                i8 = i8;
                                                f11 = f11;
                                                j4 = j4;
                                                widgetConfig5 = widgetConfig5;
                                                function6 = function6;
                                                f12 = f14;
                                            }
                                            composer4.endReplaceableGroup();
                                            CommonUIKt.m6945GlanceBlankkHDZbjc(Dp.m6097constructorimpl(5), composer4, 6, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer3, 3072, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 1, null);
                        }
                    }, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((Alignment.$stable | 0) << 3) | MediaPlayer.MEDIA_PLAYER_OPTION_RENDER_STALL_500, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt.WidgetCalendarBodyView.2
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

            public final void invoke(Composer composer2, int i2) {
                WidgetCalendarBodyViewKt.WidgetCalendarBodyView(viewModel, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: renamed from: WidgetVerticalView-JHQioms, reason: not valid java name */
    public static final void m6965WidgetVerticalViewJHQioms(final String text, GlanceModifier glanceModifier, final ColorProvider color, final long j, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Composer composerStartRestartGroup = composer.startRestartGroup(327959802);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WidgetVerticalView)P(3,2!,1:c#ui.unit.TextUnit)");
        GlanceModifier.Companion companion = (i2 & 2) != 0 ? GlanceModifier.INSTANCE : glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(327959802, i, -1, "cn.jianyun.workplan.widget.calendar.WidgetVerticalView (WidgetCalendarBodyView.kt:109)");
        }
        List listSplit$default = StringsKt.split$default((CharSequence) text, new String[]{""}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) obj).toString(), "")) {
                arrayList.add(obj);
            }
        }
        TextKt.Text(CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null), companion, new TextStyle(color, TextUnit.m6278boximpl(j), null, null, TextAlign.m6611boximpl(TextAlign.INSTANCE.m6618getCenterROrN78o()), null, null, 108, null), 0, composerStartRestartGroup, i & 112, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final GlanceModifier glanceModifier2 = companion;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.widget.calendar.WidgetCalendarBodyViewKt$WidgetVerticalView$1
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
                WidgetCalendarBodyViewKt.m6965WidgetVerticalViewJHQioms(text, glanceModifier2, color, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}