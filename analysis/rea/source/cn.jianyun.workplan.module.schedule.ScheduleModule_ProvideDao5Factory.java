package cn.jianyun.workplan.module.schedule;

import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideDao5Factory implements Factory<ScheduleConfigDao> {
    private final Provider<ScheduleDatabase> appDatabaseProvider;

    public ScheduleModule_ProvideDao5Factory(Provider<ScheduleDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleConfigDao get() {
        return provideDao5(this.appDatabaseProvider.get());
    }

    public static ScheduleModule_ProvideDao5Factory create(Provider<ScheduleDatabase> appDatabaseProvider) {
        return new ScheduleModule_ProvideDao5Factory(appDatabaseProvider);
    }

    public static ScheduleConfigDao provideDao5(ScheduleDatabase appDatabase) {
        return (ScheduleConfigDao) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideDao5(appDatabase));
    }
}