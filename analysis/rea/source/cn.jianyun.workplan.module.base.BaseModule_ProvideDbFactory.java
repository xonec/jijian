package cn.jianyun.workplan.module.base;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseModule_ProvideDbFactory implements Factory<BaseDatabase> {
    private final Provider<Context> appContextProvider;

    public BaseModule_ProvideDbFactory(Provider<Context> appContextProvider) {
        this.appContextProvider = appContextProvider;
    }

    @Override // javax.inject.Provider
    public BaseDatabase get() {
        return provideDb(this.appContextProvider.get());
    }

    public static BaseModule_ProvideDbFactory create(Provider<Context> appContextProvider) {
        return new BaseModule_ProvideDbFactory(appContextProvider);
    }

    public static BaseDatabase provideDb(Context appContext) {
        return (BaseDatabase) Preconditions.checkNotNullFromProvides(BaseModule.INSTANCE.provideDb(appContext));
    }
}