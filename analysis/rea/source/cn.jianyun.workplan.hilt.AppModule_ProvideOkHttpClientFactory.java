package cn.jianyun.workplan.hilt;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClient();
    }

    public static AppModule_ProvideOkHttpClientFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OkHttpClient provideOkHttpClient() {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideOkHttpClient());
    }

    private static final class InstanceHolder {
        private static final AppModule_ProvideOkHttpClientFactory INSTANCE = new AppModule_ProvideOkHttpClientFactory();

        private InstanceHolder() {
        }
    }
}