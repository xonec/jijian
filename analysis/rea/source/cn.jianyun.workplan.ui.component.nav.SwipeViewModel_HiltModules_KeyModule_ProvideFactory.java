package cn.jianyun.workplan.ui.component.nav;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class SwipeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static SwipeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SwipeViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final SwipeViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SwipeViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}