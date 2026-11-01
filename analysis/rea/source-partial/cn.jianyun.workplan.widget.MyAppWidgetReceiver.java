package cn.jianyun.workplan.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.glance.appwidget.GlanceAppWidget;
import cn.jianyun.timetable.widget.AppWidgetView;
import cn.jianyun.timetable.widget.WidgetRefreshCallback;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.util.MyDateTool;
import com.adgain.sdk.base.models.AdConstants;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: MyAppWidgetReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcn/jianyun/workplan/widget/MyAppWidgetReceiver;", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "glanceAppWidget", "Landroidx/glance/appwidget/GlanceAppWidget;", "getGlanceAppWidget", "()Landroidx/glance/appwidget/GlanceAppWidget;", "scheduleService", "Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "getScheduleService", "()Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;", "setScheduleService", "(Lcn/jianyun/workplan/module/schedule/views/service/ScheduleService;)V", "observeData", "", "context", "Landroid/content/Context;", "currentDate", "", "adjustMonth", "", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AndroidEntryPoint
public final class MyAppWidgetReceiver extends Hilt_MyAppWidgetReceiver {
    private final CoroutineScope coroutineScope = CoroutineScopeKt.MainScope();
    private final GlanceAppWidget glanceAppWidget = new AppWidgetView(0);

    @Inject
    public ScheduleService scheduleService;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Preferences.Key<String> currentData = PreferencesKeys.stringKey("currentData");

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public GlanceAppWidget getGlanceAppWidget() {
        return this.glanceAppWidget;
    }

    public final ScheduleService getScheduleService() {
        ScheduleService scheduleService = this.scheduleService;
        if (scheduleService != null) {
            return scheduleService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scheduleService");
        return null;
    }

    public final void setScheduleService(ScheduleService scheduleService) {
        Intrinsics.checkNotNullParameter(scheduleService, "<set-?>");
        this.scheduleService = scheduleService;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        String dateString = MyDateTool.toDateString(new Date());
        Intrinsics.checkNotNullExpressionValue(dateString, "toDateString(Date())");
        observeData(context, dateString, 0);
    }

    @Override // cn.jianyun.workplan.widget.Hilt_MyAppWidgetReceiver, androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        String stringExtra = intent.getStringExtra("adjustMonth");
        String stringExtra2 = intent.getStringExtra("currentDate");
        if (stringExtra == null) {
            stringExtra = AdConstants.FAIL;
        }
        if (stringExtra2 == null) {
            stringExtra2 = MyDateTool.toDateString(new Date());
        }
        if (Intrinsics.areEqual(intent.getAction(), WidgetRefreshCallback.UPDATE_ACTION)) {
            Intrinsics.checkNotNull(stringExtra2);
            observeData(context, stringExtra2, Integer.parseInt(stringExtra));
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.widget.MyAppWidgetReceiver$observeData$1, reason: invalid class name */
    /* JADX INFO: compiled from: MyAppWidgetReceiver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.widget.MyAppWidgetReceiver$observeData$1", f = "MyAppWidgetReceiver.kt", i = {1, 2, 2, 3}, l = {63, 64, 65, 70}, m = "invokeSuspend", n = {"widgetModel", "widgetModel", "it", "widgetModel"}, s = {"L$0", "L$0", "L$4", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $adjustMonth;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $currentDate;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, int i, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDate = str;
            this.$adjustMonth = i;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MyAppWidgetReceiver.this.new AnonymousClass1(this.$currentDate, this.$adjustMonth, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e6 -> B:9:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.widget.MyAppWidgetReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void observeData(Context context, String currentDate, int adjustMonth) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(currentDate, adjustMonth, context, null), 3, null);
    }

    /* JADX INFO: compiled from: MyAppWidgetReceiver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/jianyun/workplan/widget/MyAppWidgetReceiver$Companion;", "", "()V", "currentData", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getCurrentData", "()Landroidx/datastore/preferences/core/Preferences$Key;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Preferences.Key<String> getCurrentData() {
            return MyAppWidgetReceiver.currentData;
        }
    }
}