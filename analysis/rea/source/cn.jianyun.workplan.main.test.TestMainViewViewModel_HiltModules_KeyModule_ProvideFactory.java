package cn.jianyun.workplan.main.test;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TestMainViewViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}