package cn.jianyun.workplan.module.schedule;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleModule_ProvideAppDatabaseFactory implements Factory<ScheduleDatabase> {
    private final Provider<Context> appContextProvider;

    public ScheduleModule_ProvideAppDatabaseFactory(Provider<Context> appContextProvider) {
        this.appContextProvider = appContextProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleDatabase get() {
        return provideAppDatabase(this.appContextProvider.get());
    }

    public static ScheduleModule_ProvideAppDatabaseFactory create(Provider<Context> appContextProvider) {
        return new ScheduleModule_ProvideAppDatabaseFactory(appContextProvider);
    }

    public static ScheduleDatabase provideAppDatabase(Context appContext) {
        return (ScheduleDatabase) Preconditions.checkNotNullFromProvides(ScheduleModule.INSTANCE.provideAppDatabase(appContext));
    }
}