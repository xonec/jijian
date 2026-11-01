package cn.jianyun.workplan.vm;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class FestivalViewModel_HiltModules {
    private FestivalViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.vm.FestivalViewModel")
        public abstract ViewModel binds(FestivalViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.vm.FestivalViewModel";
        }

        private KeyModule() {
        }
    }
}