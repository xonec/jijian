package cn.jianyun.workplan.module.schedule.vm;

import cn.jianyun.workplan.api.ScheduleShareApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleShareViewModel_Factory implements Factory<ScheduleShareViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;
    private final Provider<ScheduleShareApi> shareApiProvider;

    public ScheduleShareViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider, Provider<ScheduleShareApi> shareApiProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
        this.shareApiProvider = shareApiProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleShareViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get(), this.shareApiProvider.get());
    }

    public static ScheduleShareViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider, Provider<ScheduleShareApi> shareApiProvider) {
        return new ScheduleShareViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider, shareApiProvider);
    }

    public static ScheduleShareViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService, ScheduleShareApi shareApi) {
        return new ScheduleShareViewModel(baseRepository, scheduleService, shareApi);
    }
}