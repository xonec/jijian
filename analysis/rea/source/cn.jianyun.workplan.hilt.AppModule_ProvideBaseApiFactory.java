package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.api.BaseApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideBaseApiFactory implements Factory<BaseApi> {
    private final Provider<OkHttpClient> okHttpClientProvider;

    public AppModule_ProvideBaseApiFactory(Provider<OkHttpClient> okHttpClientProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
    }

    @Override // javax.inject.Provider
    public BaseApi get() {
        return provideBaseApi(this.okHttpClientProvider.get());
    }

    public static AppModule_ProvideBaseApiFactory create(Provider<OkHttpClient> okHttpClientProvider) {
        return new AppModule_ProvideBaseApiFactory(okHttpClientProvider);
    }

    public static BaseApi provideBaseApi(OkHttpClient okHttpClient) {
        return (BaseApi) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBaseApi(okHttpClient));
    }
}