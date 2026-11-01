package cn.jianyun.workplan.ui.component.nav;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class SwipeViewModel_Factory implements Factory<SwipeViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public SwipeViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public SwipeViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static SwipeViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new SwipeViewModel_Factory(baseRepositoryProvider);
    }

    public static SwipeViewModel newInstance(BaseRepository baseRepository) {
        return new SwipeViewModel(baseRepository);
    }
}