package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideSchedulePlanDaoFactory implements Factory<SchedulePlanDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideSchedulePlanDaoFactory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public SchedulePlanDao get() {
        return provideSchedulePlanDao(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideSchedulePlanDaoFactory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideSchedulePlanDaoFactory(appDatabaseProvider);
    }

    public static SchedulePlanDao provideSchedulePlanDao(ScheduleDatabase appDatabase) {
        return (SchedulePlanDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideSchedulePlanDao(appDatabase));
    }
}