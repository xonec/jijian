package cn.jianyun.workplan.module.base;

import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseModule_ProvideDao1Factory implements Factory<WebDAVUserDao> {
    private final Provider<BaseDatabase> appDatabaseProvider;

    public BaseModule_ProvideDao1Factory(Provider<BaseDatabase> appDatabaseProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
    }

    @Override // javax.inject.Provider
    public WebDAVUserDao get() {
        return provideDao1(this.appDatabaseProvider.get());
    }

    public static BaseModule_ProvideDao1Factory create(Provider<BaseDatabase> appDatabaseProvider) {
        return new BaseModule_ProvideDao1Factory(appDatabaseProvider);
    }

    public static WebDAVUserDao provideDao1(BaseDatabase appDatabase) {
        return (WebDAVUserDao) Preconditions.checkNotNullFromProvides(BaseModule.INSTANCE.provideDao1(appDatabase));
    }
}