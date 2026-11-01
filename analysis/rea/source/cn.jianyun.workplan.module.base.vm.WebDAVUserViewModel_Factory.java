package cn.jianyun.workplan.module.base.vm;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class WebDAVUserViewModel_Factory implements Factory<WebDAVUserViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<WebDAVUserDao> daoProvider;

    public WebDAVUserViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<WebDAVUserDao> daoProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.daoProvider = daoProvider;
    }

    @Override // javax.inject.Provider
    public WebDAVUserViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.daoProvider.get());
    }

    public static WebDAVUserViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<WebDAVUserDao> daoProvider) {
        return new WebDAVUserViewModel_Factory(baseRepositoryProvider, daoProvider);
    }

    public static WebDAVUserViewModel newInstance(BaseRepository baseRepository, WebDAVUserDao dao) {
        return new WebDAVUserViewModel(baseRepository, dao);
    }
}