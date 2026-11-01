package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideScheduleWorkDaoFactory implements Factory<ScheduleWorkDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideScheduleWorkDaoFactory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleWorkDao get() {
        return provideScheduleWorkDao(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideScheduleWorkDaoFactory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideScheduleWorkDaoFactory(appDatabaseProvider);
    }

    public static ScheduleWorkDao provideScheduleWorkDao(ScheduleDatabase appDatabase) {
        return (ScheduleWorkDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideScheduleWorkDao(appDatabase));
    }
}