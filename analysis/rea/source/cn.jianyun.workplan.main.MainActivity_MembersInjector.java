package cn.jianyun.workplan.main;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public MainActivity_MembersInjector(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    public static MembersInjector<MainActivity> create(Provider<BaseRepository> baseRepositoryProvider) {
        return new MainActivity_MembersInjector(baseRepositoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainActivity instance) {
        injectBaseRepository(instance, this.baseRepositoryProvider.get());
    }

    public static void injectBaseRepository(MainActivity instance, BaseRepository baseRepository) {
        instance.baseRepository = baseRepository;
    }
}