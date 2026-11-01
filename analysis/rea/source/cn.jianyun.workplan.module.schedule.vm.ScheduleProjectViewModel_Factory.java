package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleProjectViewModel_Factory implements Factory<ScheduleProjectViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;

    public ScheduleProjectViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleProjectViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get());
    }

    public static ScheduleProjectViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        return new ScheduleProjectViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider);
    }

    public static ScheduleProjectViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService) {
        return new ScheduleProjectViewModel(baseRepository, scheduleService);
    }
}