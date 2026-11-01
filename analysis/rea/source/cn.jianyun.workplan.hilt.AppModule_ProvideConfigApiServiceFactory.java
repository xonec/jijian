package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.api.ConfigApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideConfigApiServiceFactory implements Factory<ConfigApi> {
    private final Provider<OkHttpClient> okHttpClientProvider;

    public AppModule_ProvideConfigApiServiceFactory(Provider<OkHttpClient> okHttpClientProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
    }

    @Override // javax.inject.Provider
    public ConfigApi get() {
        return provideConfigApiService(this.okHttpClientProvider.get());
    }

    public static AppModule_ProvideConfigApiServiceFactory create(Provider<OkHttpClient> okHttpClientProvider) {
        return new AppModule_ProvideConfigApiServiceFactory(okHttpClientProvider);
    }

    public static ConfigApi provideConfigApiService(OkHttpClient okHttpClient) {
        return (ConfigApi) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideConfigApiService(okHttpClient));
    }
}