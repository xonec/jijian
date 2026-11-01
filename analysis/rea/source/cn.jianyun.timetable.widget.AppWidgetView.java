package cn.jianyun.timetable.widget;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.CompositionLocalsKt;
import androidx.glance.GlanceId;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionKt;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.appwidget.action.RunCallbackActionKt;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import cn.jianyun.workplan.util.CommonUIKt;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver;
import cn.jianyun.workplan.widget.WidgetDataModel;
import cn.jianyun.workplan.widget.calendar.WidgetCalendarViewKt;
import com.adgain.sdk.base.models.AdConstants;
import com.alibaba.fastjson2.JSON;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.poi.ss.util.IEEEDouble;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: AppWidgetView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcn/jianyun/timetable/widget/AppWidgetView;", "Landroidx/glance/appwidget/GlanceAppWidget;", "count", "", "(I)V", "getCount", "()I", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "onCompositionError", "context", "Landroid/content/Context;", "glanceId", "Landroidx/glance/GlanceId;", "appWidgetId", "throwable", "", "provideGlance", Name.MARK, "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetView extends GlanceAppWidget {
    public static final int $stable = 0;
    private final int count;

    /* JADX INFO: renamed from: cn.jianyun.timetable.widget.AppWidgetView$provideGlance$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppWidgetView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.timetable.widget.AppWidgetView", f = "AppWidgetView.kt", i = {}, l = {39}, m = "provideGlance", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppWidgetView.this.provideGlance(null, null, this);
        }
    }

    @Override // androidx.glance.appwidget.GlanceAppWidget
    public void onCompositionError(Context context, GlanceId glanceId, int appWidgetId, Throwable throwable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glanceId, "glanceId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public AppWidgetView(int i) {
        super(0, 1, null);
        this.count = i;
    }

    public final int getCount() {
        return this.count;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.glance.appwidget.GlanceAppWidget
    public Object provideGlance(Context context, GlanceId glanceId, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(345062566, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.timetable.widget.AppWidgetView.provideGlance.2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(345062566, i2, -1, "cn.jianyun.timetable.widget.AppWidgetView.provideGlance.<anonymous> (AppWidgetView.kt:38)");
                    }
                    AppWidgetView.this.Content(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            anonymousClass1.label = 1;
            if (GlanceAppWidgetKt.provideContent(this, composableLambdaComposableLambdaInstance, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void Content(Composer composer, final int i) {
        final WidgetDataModel widgetDataModel;
        Composer composerStartRestartGroup = composer.startRestartGroup(1688531473);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)");
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1688531473, i, -1, "cn.jianyun.timetable.widget.AppWidgetView.Content (AppWidgetView.kt:43)");
            }
            composerStartRestartGroup.startReplaceableGroup(-534706435);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(currentState)60@2192L7:CompositionLocals.kt#jkpf89");
            ProvidableCompositionLocal<Object> localState = CompositionLocalsKt.getLocalState();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localState);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (objConsume != null) {
                Preferences preferences = (Preferences) objConsume;
                composerStartRestartGroup.endReplaceableGroup();
                if (preferences.get(MyAppWidgetReceiver.INSTANCE.getCurrentData()) == null) {
                    composerStartRestartGroup.startReplaceableGroup(-64234679);
                    TextKt.Text("待初始化", ActionKt.clickable(GlanceModifier.INSTANCE, RunCallbackActionKt.actionRunCallback(WidgetRefreshCallback.class, ActionParametersKt.actionParametersOf(WidgetRefreshCallback.INSTANCE.getMonthKey().to(AdConstants.FAIL)))), new TextStyle(null, TextUnit.m6278boximpl(TextUnitKt.getSp(12)), null, null, null, null, null, 125, null), 0, composerStartRestartGroup, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-64234427);
                    try {
                        widgetDataModel = (WidgetDataModel) JSON.parseObject((String) preferences.get(MyAppWidgetReceiver.INSTANCE.getCurrentData()), WidgetDataModel.class);
                        if (widgetDataModel == null) {
                            widgetDataModel = new WidgetDataModel(null, null, null, null, null, null, null, null, null, null, IEEEDouble.EXPONENT_BIAS, null);
                        }
                    } catch (Exception unused) {
                        widgetDataModel = new WidgetDataModel(null, null, null, null, null, null, null, null, null, null, IEEEDouble.EXPONENT_BIAS, null);
                    }
                    ColumnKt.m6527ColumnK4GKKTE(CommonUIKt.m6958radius3ABfNKs(GlanceModifier.INSTANCE, Dp.m6097constructorimpl(8)), 0, 0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -882370133, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: cn.jianyun.timetable.widget.AppWidgetView.Content.1
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
                                ComposerKt.traceEventStart(-882370133, i2, -1, "cn.jianyun.timetable.widget.AppWidgetView.Content.<anonymous> (AppWidgetView.kt:58)");
                            }
                            WidgetCalendarViewKt.WidgetCalendarView(widgetDataModel, composer2, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.timetable.widget.AppWidgetView.Content.2
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
                AppWidgetView.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}