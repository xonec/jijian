package cn.jianyun.timetable.widget;

import android.content.Context;
import android.content.Intent;
import androidx.glance.GlanceId;
import androidx.glance.action.ActionParameters;
import androidx.glance.appwidget.action.ActionCallback;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver;
import com.adgain.sdk.base.models.AdConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetRefreshCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcn/jianyun/timetable/widget/WidgetRefreshCallback;", "Landroidx/glance/appwidget/action/ActionCallback;", "()V", "onAction", "", "context", "Landroid/content/Context;", "glanceId", "Landroidx/glance/GlanceId;", "parameters", "Landroidx/glance/action/ActionParameters;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Landroidx/glance/action/ActionParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WidgetRefreshCallback implements ActionCallback {
    public static final int $stable = 0;
    public static final String UPDATE_ACTION = "updateAction";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ActionParameters.Key<String> monthKey = new ActionParameters.Key<>("ADJUST_MONTH");
    private static final ActionParameters.Key<String> currentDate = new ActionParameters.Key<>("CURRENT_DATE");

    /* JADX INFO: compiled from: WidgetRefreshCallback.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcn/jianyun/timetable/widget/WidgetRefreshCallback$Companion;", "", "()V", "UPDATE_ACTION", "", "currentDate", "Landroidx/glance/action/ActionParameters$Key;", "getCurrentDate", "()Landroidx/glance/action/ActionParameters$Key;", "monthKey", "getMonthKey", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActionParameters.Key<String> getMonthKey() {
            return WidgetRefreshCallback.monthKey;
        }

        public final ActionParameters.Key<String> getCurrentDate() {
            return WidgetRefreshCallback.currentDate;
        }
    }

    @Override // androidx.glance.appwidget.action.ActionCallback
    public Object onAction(Context context, GlanceId glanceId, ActionParameters actionParameters, Continuation<? super Unit> continuation) {
        String str = (String) actionParameters.get(monthKey);
        if (str == null) {
            str = AdConstants.FAIL;
        }
        String dateString = (String) actionParameters.get(currentDate);
        if (dateString == null) {
            dateString = MyDateTool.toDateString(new Date());
            Intrinsics.checkNotNullExpressionValue(dateString, "toDateString(Date())");
        }
        Intent intent = new Intent(context, (Class<?>) MyAppWidgetReceiver.class);
        intent.setAction(UPDATE_ACTION);
        intent.putExtra("adjustMonth", str);
        intent.putExtra("currentDate", dateString);
        context.sendBroadcast(intent);
        return Unit.INSTANCE;
    }
}