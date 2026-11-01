package cn.jianyun.workplan.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class AppViewModel_Factory implements Factory<AppViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public AppViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public AppViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static AppViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new AppViewModel_Factory(baseRepositoryProvider);
    }

    public static AppViewModel newInstance(BaseRepository baseRepository) {
        return new AppViewModel(baseRepository);
    }
}