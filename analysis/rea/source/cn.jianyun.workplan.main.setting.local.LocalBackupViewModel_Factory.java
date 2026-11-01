package cn.jianyun.workplan.main.setting.local;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalBackupViewModel_Factory implements Factory<LocalBackupViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public LocalBackupViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public LocalBackupViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static LocalBackupViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new LocalBackupViewModel_Factory(baseRepositoryProvider);
    }

    public static LocalBackupViewModel newInstance(BaseRepository baseRepository) {
        return new LocalBackupViewModel(baseRepository);
    }
}