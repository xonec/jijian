package cn.jianyun.workplan.module.base.views.webdav;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class WebDavViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static WebDavViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(WebDavViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final WebDavViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WebDavViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}