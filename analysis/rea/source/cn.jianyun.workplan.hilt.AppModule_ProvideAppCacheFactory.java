package cn.jianyun.workplan.hilt;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideAppCacheFactory implements Factory<DataStore<Preferences>> {
    private final Provider<Context> appContextProvider;

    public AppModule_ProvideAppCacheFactory(Provider<Context> appContextProvider) {
        this.appContextProvider = appContextProvider;
    }

    @Override // javax.inject.Provider
    public DataStore<Preferences> get() {
        return provideAppCache(this.appContextProvider.get());
    }

    public static AppModule_ProvideAppCacheFactory create(Provider<Context> appContextProvider) {
        return new AppModule_ProvideAppCacheFactory(appContextProvider);
    }

    public static DataStore<Preferences> provideAppCache(Context appContext) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppCache(appContext));
    }
}