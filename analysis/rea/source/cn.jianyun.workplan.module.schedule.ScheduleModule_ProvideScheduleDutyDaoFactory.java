package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideScheduleDutyDaoFactory implements Factory<ScheduleDutyDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideScheduleDutyDaoFactory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleDutyDao get() {
        return provideScheduleDutyDao(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideScheduleDutyDaoFactory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideScheduleDutyDaoFactory(appDatabaseProvider);
    }

    public static ScheduleDutyDao provideScheduleDutyDao(ScheduleDatabase appDatabase) {
        return (ScheduleDutyDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideScheduleDutyDao(appDatabase));
    }
}