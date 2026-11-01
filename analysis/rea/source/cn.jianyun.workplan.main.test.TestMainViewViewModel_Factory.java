package cn.jianyun.workplan.main.test;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class TestMainViewViewModel_Factory implements Factory<TestMainViewViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public TestMainViewViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public TestMainViewViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static TestMainViewViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new TestMainViewViewModel_Factory(baseRepositoryProvider);
    }

    public static TestMainViewViewModel newInstance(BaseRepository baseRepository) {
        return new TestMainViewViewModel(baseRepository);
    }
}