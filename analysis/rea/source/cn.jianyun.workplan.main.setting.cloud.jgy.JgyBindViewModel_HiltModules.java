package cn.jianyun.workplan.main.setting.cloud.jgy;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class JgyBindViewModel_HiltModules {
    private JgyBindViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel")
        public abstract ViewModel binds(JgyBindViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel";
        }

        private KeyModule() {
        }
    }
}