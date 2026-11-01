package cn.jianyun.workplan.module.schedule.vm;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleAlarmViewModel_HiltModules {
    private ScheduleAlarmViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel")
        public abstract ViewModel binds(ScheduleAlarmViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel";
        }

        private KeyModule() {
        }
    }
}