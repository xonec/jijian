package cn.jianyun.workplan.vm;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class AppSettingViewModel_HiltModules {
    private AppSettingViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.vm.AppSettingViewModel")
        public abstract ViewModel binds(AppSettingViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.vm.AppSettingViewModel";
        }

        private KeyModule() {
        }
    }
}