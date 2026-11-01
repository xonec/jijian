package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class SchedulePlanViewModel_Factory implements Factory<SchedulePlanViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;

    public SchedulePlanViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    @Override // javax.inject.Provider
    public SchedulePlanViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get());
    }

    public static SchedulePlanViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        return new SchedulePlanViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider);
    }

    public static SchedulePlanViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService) {
        return new SchedulePlanViewModel(baseRepository, scheduleService);
    }
}