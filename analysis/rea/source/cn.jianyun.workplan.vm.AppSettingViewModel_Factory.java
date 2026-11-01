package cn.jianyun.workplan.vm;

import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class AppSettingViewModel_Factory implements Factory<AppSettingViewModel> {
    private final Provider<BaseApi> baseApiProvider;
    private final Provider<BaseRepository> baseRepositoryProvider;

    public AppSettingViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> baseApiProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.baseApiProvider = baseApiProvider;
    }

    @Override // javax.inject.Provider
    public AppSettingViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.baseApiProvider.get());
    }

    public static AppSettingViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> baseApiProvider) {
        return new AppSettingViewModel_Factory(baseRepositoryProvider, baseApiProvider);
    }

    public static AppSettingViewModel newInstance(BaseRepository baseRepository, BaseApi baseApi) {
        return new AppSettingViewModel(baseRepository, baseApi);
    }
}