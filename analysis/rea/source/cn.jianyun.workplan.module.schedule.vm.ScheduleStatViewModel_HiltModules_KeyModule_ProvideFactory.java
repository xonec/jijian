package cn.jianyun.workplan.module.schedule.vm;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(ScheduleStatViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}