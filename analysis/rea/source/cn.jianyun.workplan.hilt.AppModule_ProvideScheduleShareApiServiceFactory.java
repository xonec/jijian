package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.api.ScheduleShareApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideScheduleShareApiServiceFactory implements Factory<ScheduleShareApi> {
    private final Provider<OkHttpClient> okHttpClientProvider;

    public AppModule_ProvideScheduleShareApiServiceFactory(Provider<OkHttpClient> okHttpClientProvider) {
        this.okHttpClientProvider = okHttpClientProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleShareApi get() {
        return provideScheduleShareApiService(this.okHttpClientProvider.get());
    }

    public static AppModule_ProvideScheduleShareApiServiceFactory create(Provider<OkHttpClient> okHttpClientProvider) {
        return new AppModule_ProvideScheduleShareApiServiceFactory(okHttpClientProvider);
    }

    public static ScheduleShareApi provideScheduleShareApiService(OkHttpClient okHttpClient) {
        return (ScheduleShareApi) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideScheduleShareApiService(okHttpClient));
    }
}