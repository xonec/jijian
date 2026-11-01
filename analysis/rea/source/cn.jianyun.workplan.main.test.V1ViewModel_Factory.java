package cn.jianyun.workplan.main.test;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class V1ViewModel_Factory implements Factory<V1ViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public V1ViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public V1ViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static V1ViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new V1ViewModel_Factory(baseRepositoryProvider);
    }

    public static V1ViewModel newInstance(BaseRepository baseRepository) {
        return new V1ViewModel(baseRepository);
    }
}