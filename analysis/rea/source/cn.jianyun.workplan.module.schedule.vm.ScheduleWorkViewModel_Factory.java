package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleWorkViewModel_Factory implements Factory<ScheduleWorkViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;

    public ScheduleWorkViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleWorkViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get());
    }

    public static ScheduleWorkViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        return new ScheduleWorkViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider);
    }

    public static ScheduleWorkViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService) {
        return new ScheduleWorkViewModel(baseRepository, scheduleService);
    }
}