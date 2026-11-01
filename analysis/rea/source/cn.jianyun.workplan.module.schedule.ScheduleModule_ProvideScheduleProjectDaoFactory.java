package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideScheduleProjectDaoFactory implements Factory<ScheduleProjectDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideScheduleProjectDaoFactory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleProjectDao get() {
        return provideScheduleProjectDao(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideScheduleProjectDaoFactory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideScheduleProjectDaoFactory(appDatabaseProvider);
    }

    public static ScheduleProjectDao provideScheduleProjectDao(ScheduleDatabase appDatabase) {
        return (ScheduleProjectDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideScheduleProjectDao(appDatabase));
    }
}