package cn.jianyun.workplan.module.schedule.views.wechat;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class WechatViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static WechatViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(WechatViewModel_HiltModules.KeyModule.provide());
    }

    private static final class InstanceHolder {
        private static final WechatViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WechatViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}