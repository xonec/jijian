package cn.jianyun.workplan.module.schedule;

import androidx.room.RoomDatabase;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScheduleDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcn/jianyun/workplan/module/schedule/ScheduleDatabase;", "Landroidx/room/RoomDatabase;", "()V", "alarmDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;", "configDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "dutyDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;", "planDao", "Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;", "projectDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;", "workDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScheduleDatabase extends RoomDatabase {
    public static final int $stable = 0;

    public abstract ScheduleAlarmDao alarmDao();

    public abstract ScheduleConfigDao configDao();

    public abstract ScheduleDutyDao dutyDao();

    public abstract SchedulePlanDao planDao();

    public abstract ScheduleProjectDao projectDao();

    public abstract ScheduleWorkDao workDao();
}