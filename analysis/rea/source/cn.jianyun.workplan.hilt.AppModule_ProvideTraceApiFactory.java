package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.api.TraceApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideTraceApiFactory implements Factory<TraceApi> {
    private final Provider<OkHttpClient> okHttpClientProvider;

    public AppModule_ProvideTraceApiFactory(Provider<OkHttpClient> okHttpClientProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
    }

    @Override // javax.inject.Provider
    public TraceApi get() {
        return provideTraceApi(this.okHttpClientProvider.get());
    }

    public static AppModule_ProvideTraceApiFactory create(Provider<OkHttpClient> okHttpClientProvider) {
        return new AppModule_ProvideTraceApiFactory(okHttpClientProvider);
    }

    public static TraceApi provideTraceApi(OkHttpClient okHttpClient) {
        return (TraceApi) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTraceApi(okHttpClient));
    }
}