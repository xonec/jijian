package cn.jianyun.workplan.ui.component.nav;

import android.content.Context;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class SecretViewModel_Factory implements Factory<SecretViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<Context> contextProvider;

    public SecretViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<Context> contextProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SecretViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.contextProvider.get());
    }

    public static SecretViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<Context> contextProvider) {
        return new SecretViewModel_Factory(baseRepositoryProvider, contextProvider);
    }

    public static SecretViewModel newInstance(BaseRepository baseRepository, Context context) {
        return new SecretViewModel(baseRepository, context);
    }
}