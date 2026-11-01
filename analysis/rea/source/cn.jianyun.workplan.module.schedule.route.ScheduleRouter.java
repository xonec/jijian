package cn.jianyun.workplan.module.schedule.route;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ScheduleRouter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "AlarmEdit", "CloudManage", "PlanEdit", "ProjectManage", "ShareData", "WorkEdit", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$AlarmEdit;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$CloudManage;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$PlanEdit;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$ProjectManage;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$ShareData;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$WorkEdit;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScheduleRouter {
    public static final int $stable = 0;
    private final String route;

    public /* synthetic */ ScheduleRouter(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$ProjectManage;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProjectManage extends ScheduleRouter {
        public static final int $stable = 0;
        public static final ProjectManage INSTANCE = new ProjectManage();

        private ProjectManage() {
            super("ScheduleProjectManage", null);
        }
    }

    private ScheduleRouter(String str) {
        this.route = str;
    }

    public String getRoute() {
        return this.route;
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$WorkEdit;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WorkEdit extends ScheduleRouter {
        public static final int $stable = 0;
        public static final WorkEdit INSTANCE = new WorkEdit();

        private WorkEdit() {
            super("ScheduleWorkEdit", null);
        }
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$PlanEdit;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlanEdit extends ScheduleRouter {
        public static final int $stable = 0;
        public static final PlanEdit INSTANCE = new PlanEdit();

        private PlanEdit() {
            super("SchedulePlanEdit", null);
        }
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$AlarmEdit;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlarmEdit extends ScheduleRouter {
        public static final int $stable = 0;
        public static final AlarmEdit INSTANCE = new AlarmEdit();

        private AlarmEdit() {
            super("ScheduleAlarmEdit", null);
        }
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$CloudManage;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CloudManage extends ScheduleRouter {
        public static final int $stable = 0;
        public static final CloudManage INSTANCE = new CloudManage();

        private CloudManage() {
            super("ScheduleCloudManage", null);
        }
    }

    /* JADX INFO: compiled from: ScheduleRouter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter$ShareData;", "Lcn/jianyun/workplan/module/schedule/route/ScheduleRouter;", "()V", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareData extends ScheduleRouter {
        public static final int $stable = 0;
        public static final ShareData INSTANCE = new ShareData();

        private ShareData() {
            super("ScheduleShareData", null);
        }
    }
}