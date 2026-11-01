package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleMasterViewModel_Factory implements Factory<ScheduleMasterViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;

    public ScheduleMasterViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleMasterViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get());
    }

    public static ScheduleMasterViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        return new ScheduleMasterViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider);
    }

    public static ScheduleMasterViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService) {
        return new ScheduleMasterViewModel(baseRepository, scheduleService);
    }
}