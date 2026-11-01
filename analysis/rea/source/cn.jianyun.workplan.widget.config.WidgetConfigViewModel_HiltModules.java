package cn.jianyun.workplan.widget.config;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetConfigViewModel_HiltModules {
    private WidgetConfigViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.widget.config.WidgetConfigViewModel")
        public abstract ViewModel binds(WidgetConfigViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.widget.config.WidgetConfigViewModel";
        }

        private KeyModule() {
        }
    }
}