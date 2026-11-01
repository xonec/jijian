package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideScheduleAlarmDaoFactory implements Factory<ScheduleAlarmDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideScheduleAlarmDaoFactory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleAlarmDao get() {
        return provideScheduleAlarmDao(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideScheduleAlarmDaoFactory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideScheduleAlarmDaoFactory(appDatabaseProvider);
    }

    public static ScheduleAlarmDao provideScheduleAlarmDao(ScheduleDatabase appDatabase) {
        return (ScheduleAlarmDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideScheduleAlarmDao(appDatabase));
    }
}