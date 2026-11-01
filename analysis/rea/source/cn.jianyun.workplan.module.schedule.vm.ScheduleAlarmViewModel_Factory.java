package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleAlarmViewModel_Factory implements Factory<ScheduleAlarmViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;

    public ScheduleAlarmViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleAlarmViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get());
    }

    public static ScheduleAlarmViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider) {
        return new ScheduleAlarmViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider);
    }

    public static ScheduleAlarmViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService) {
        return new ScheduleAlarmViewModel(baseRepository, scheduleService);
    }
}