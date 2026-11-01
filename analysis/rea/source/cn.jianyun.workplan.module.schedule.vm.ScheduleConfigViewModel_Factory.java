package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleConfigViewModel_Factory implements Factory<ScheduleConfigViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleConfigDao> daoProvider;

    public ScheduleConfigViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleConfigDao> daoProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.daoProvider = daoProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleConfigViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.daoProvider.get());
    }

    public static ScheduleConfigViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleConfigDao> daoProvider) {
        return new ScheduleConfigViewModel_Factory(baseRepositoryProvider, daoProvider);
    }

    public static ScheduleConfigViewModel newInstance(BaseRepository baseRepository, ScheduleConfigDao dao) {
        return new ScheduleConfigViewModel(baseRepository, dao);
    }
}