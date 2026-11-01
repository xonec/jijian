package cn.jianyun.workplan.module.schedule.views.wechat;

import cn.jianyun.workplan.api.ShareApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class WechatViewModel_Factory implements Factory<WechatViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleService> scheduleServiceProvider;
    private final Provider<ShareApi> shareApiProvider;

    public WechatViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider, Provider<ShareApi> shareApiProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleServiceProvider = scheduleServiceProvider;
        this.shareApiProvider = shareApiProvider;
    }

    @Override // javax.inject.Provider
    public WechatViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleServiceProvider.get(), this.shareApiProvider.get());
    }

    public static WechatViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleService> scheduleServiceProvider, Provider<ShareApi> shareApiProvider) {
        return new WechatViewModel_Factory(baseRepositoryProvider, scheduleServiceProvider, shareApiProvider);
    }

    public static WechatViewModel newInstance(BaseRepository baseRepository, ScheduleService scheduleService, ShareApi shareApi) {
        return new WechatViewModel(baseRepository, scheduleService, shareApi);
    }
}