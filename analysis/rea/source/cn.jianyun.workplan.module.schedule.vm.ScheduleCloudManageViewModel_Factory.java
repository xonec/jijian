package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleCloudManageViewModel_Factory implements Factory<ScheduleCloudManageViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> baseServiceProvider;

    public ScheduleCloudManageViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> baseServiceProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.baseServiceProvider = baseServiceProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleCloudManageViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.baseServiceProvider.get());
    }

    public static ScheduleCloudManageViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> baseServiceProvider) {
        return new ScheduleCloudManageViewModel_Factory(baseRepositoryProvider, baseServiceProvider);
    }

    public static ScheduleCloudManageViewModel newInstance(BaseRepository baseRepository, ScheduleService baseService) {
        return new ScheduleCloudManageViewModel(baseRepository, baseService);
    }
}