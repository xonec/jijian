package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.api.ShareApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideShareApiServiceFactory implements Factory<ShareApi> {
    private final Provider<OkHttpClient> okHttpClientProvider;

    public AppModule_ProvideShareApiServiceFactory(Provider<OkHttpClient> okHttpClientProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
    }

    @Override // javax.inject.Provider
    public ShareApi get() {
        return provideShareApiService(this.okHttpClientProvider.get());
    }

    public static AppModule_ProvideShareApiServiceFactory create(Provider<OkHttpClient> okHttpClientProvider) {
        return new AppModule_ProvideShareApiServiceFactory(okHttpClientProvider);
    }

    public static ShareApi provideShareApiService(OkHttpClient okHttpClient) {
        return (ShareApi) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideShareApiService(okHttpClient));
    }
}