package cn.jianyun.workplan.module.base.views.webdav;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class WebDavViewModel_Factory implements Factory<WebDavViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public WebDavViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public WebDavViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static WebDavViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new WebDavViewModel_Factory(baseRepositoryProvider);
    }

    public static WebDavViewModel newInstance(BaseRepository baseRepository) {
        return new WebDavViewModel(baseRepository);
    }
}