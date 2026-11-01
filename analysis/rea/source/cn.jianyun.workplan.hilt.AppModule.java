package cn.jianyun.workplan.hilt;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.api.ConfigApi;
import cn.jianyun.workplan.api.ScheduleShareApi;
import cn.jianyun.workplan.api.ShareApi;
import cn.jianyun.workplan.api.TraceApi;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import java.time.Duration;
import java.util.List;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: AppModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0015"}, d2 = {"Lcn/jianyun/workplan/hilt/AppModule;", "", "()V", "provideAppCache", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appContext", "Landroid/content/Context;", "provideBaseApi", "Lcn/jianyun/workplan/api/BaseApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideConfigApiService", "Lcn/jianyun/workplan/api/ConfigApi;", "provideOkHttpClient", "provideScheduleShareApiService", "Lcn/jianyun/workplan/api/ScheduleShareApi;", "provideShareApiService", "Lcn/jianyun/workplan/api/ShareApi;", "provideTraceApi", "Lcn/jianyun/workplan/api/TraceApi;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Module
public final class AppModule {
    public static final int $stable = 0;
    public static final AppModule INSTANCE = new AppModule();

    private AppModule() {
    }

    @Provides
    @Singleton
    @Named("app")
    public final DataStore<Preferences> provideAppCache(@ApplicationContext final Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, new ReplaceFileCorruptionHandler(new Function1<CorruptionException, Preferences>() { // from class: cn.jianyun.workplan.hilt.AppModule.provideAppCache.1
            @Override // kotlin.jvm.functions.Function1
            public final Preferences invoke(CorruptionException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PreferencesFactory.createEmpty();
            }
        }), (List) null, CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: cn.jianyun.workplan.hilt.AppModule.provideAppCache.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return PreferenceDataStoreFile.preferencesDataStoreFile(appContext, "app");
            }
        }, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Provides
    @Singleton
    public final OkHttpClient provideOkHttpClient() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor);
        Duration durationOfSeconds = Duration.ofSeconds(1000L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(1000L)");
        return builderAddInterceptor.readTimeout(durationOfSeconds).build();
    }

    @Provides
    @Singleton
    public final TraceApi provideTraceApi(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://e.potal.cn/").client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build().create(TraceApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…ate(TraceApi::class.java)");
        return (TraceApi) objCreate;
    }

    @Provides
    @Singleton
    public final ShareApi provideShareApiService(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://duty.potal.cn").client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build().create(ShareApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…ate(ShareApi::class.java)");
        return (ShareApi) objCreate;
    }

    @Provides
    @Singleton
    public final ScheduleShareApi provideScheduleShareApiService(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://e.potal.cn/").client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build().create(ScheduleShareApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…duleShareApi::class.java)");
        return (ScheduleShareApi) objCreate;
    }

    @Provides
    @Singleton
    public final BaseApi provideBaseApi(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://www.kotal.cn").client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build().create(BaseApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…eate(BaseApi::class.java)");
        return (BaseApi) objCreate;
    }

    @Provides
    @Singleton
    public final ConfigApi provideConfigApiService(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objCreate = new Retrofit.Builder().baseUrl("https://api.potal.cn").client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build().create(ConfigApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…te(ConfigApi::class.java)");
        return (ConfigApi) objCreate;
    }
}