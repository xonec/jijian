package cn.jianyun.workplan.main.setting.cloud.jgy;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class JgyBindViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static JgyBindViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(JgyBindViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final JgyBindViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new JgyBindViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}