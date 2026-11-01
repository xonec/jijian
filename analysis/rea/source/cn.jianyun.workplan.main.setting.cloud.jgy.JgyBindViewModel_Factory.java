package cn.jianyun.workplan.main.setting.cloud.jgy;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class JgyBindViewModel_Factory implements Factory<JgyBindViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public JgyBindViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public JgyBindViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static JgyBindViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new JgyBindViewModel_Factory(baseRepositoryProvider);
    }

    public static JgyBindViewModel newInstance(BaseRepository baseRepository) {
        return new JgyBindViewModel(baseRepository);
    }
}