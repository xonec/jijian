package cn.jianyun.workplan.main.test;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class V2ViewModel_Factory implements Factory<V2ViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public V2ViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public V2ViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static V2ViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new V2ViewModel_Factory(baseRepositoryProvider);
    }

    public static V2ViewModel newInstance(BaseRepository baseRepository) {
        return new V2ViewModel(baseRepository);
    }
}