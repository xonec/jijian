package cn.jianyun.workplan.module.schedule;

import android.content.Context;
import androidx.room.Room;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScheduleModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lcn/jianyun/workplan/module/schedule/ScheduleModule;", "", "()V", "provideAppDatabase", "Lcn/jianyun/workplan/module/schedule/ScheduleDatabase;", "appContext", "Landroid/content/Context;", "provideDao5", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleConfigDao;", "appDatabase", "provideScheduleAlarmDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleAlarmDao;", "provideScheduleDutyDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleDutyDao;", "provideSchedulePlanDao", "Lcn/jianyun/workplan/module/schedule/dao/SchedulePlanDao;", "provideScheduleProjectDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleProjectDao;", "provideScheduleWorkDao", "Lcn/jianyun/workplan/module/schedule/dao/ScheduleWorkDao;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Module
public final class ScheduleModule {
    public static final int $stable = 0;
    public static final ScheduleModule INSTANCE = new ScheduleModule();

    private ScheduleModule() {
    }

    @Provides
    @Singleton
    public final ScheduleDatabase provideAppDatabase(@ApplicationContext Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return (ScheduleDatabase) Room.databaseBuilder(appContext, ScheduleDatabase.class, "ScheduleDb12").addMigrations(ScheduleDatabaseKt.getMIGRATION_1_2()).addMigrations(ScheduleDatabaseKt.getMIGRATION_2_3()).addMigrations(ScheduleDatabaseKt.getMIGRATION_3_4()).addMigrations(ScheduleDatabaseKt.getMIGRATION_4_5()).build();
    }

    @Provides
    public final ScheduleProjectDao provideScheduleProjectDao(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.projectDao();
    }

    @Provides
    public final ScheduleWorkDao provideScheduleWorkDao(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.workDao();
    }

    @Provides
    public final SchedulePlanDao provideSchedulePlanDao(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.planDao();
    }

    @Provides
    public final ScheduleDutyDao provideScheduleDutyDao(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.dutyDao();
    }

    @Provides
    public final ScheduleAlarmDao provideScheduleAlarmDao(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.alarmDao();
    }

    @Provides
    public final ScheduleConfigDao provideDao5(ScheduleDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.configDao();
    }
}