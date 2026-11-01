package cn.jianyun.workplan.hilt;

import cn.jianyun.workplan.main.MainActivity_GeneratedInjector;
import cn.jianyun.workplan.main.question.QuestionViewModel_HiltModules;
import cn.jianyun.workplan.main.receiver.AlarmWidgetReceiver_GeneratedInjector;
import cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel_HiltModules;
import cn.jianyun.workplan.main.setting.local.LocalBackupViewModel_HiltModules;
import cn.jianyun.workplan.main.test.TestMainViewViewModel_HiltModules;
import cn.jianyun.workplan.main.test.V1ViewModel_HiltModules;
import cn.jianyun.workplan.main.test.V2ViewModel_HiltModules;
import cn.jianyun.workplan.module.base.BaseModule;
import cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel_HiltModules;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.ScheduleModule;
import cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel_HiltModules;
import cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel_HiltModules;
import cn.jianyun.workplan.ui.component.nav.SecretViewModel_HiltModules;
import cn.jianyun.workplan.ui.component.nav.SwipeViewModel_HiltModules;
import cn.jianyun.workplan.vm.AppSettingViewModel_HiltModules;
import cn.jianyun.workplan.vm.AppViewModel_HiltModules;
import cn.jianyun.workplan.vm.ColorViewModel_HiltModules;
import cn.jianyun.workplan.vm.FestivalViewModel_HiltModules;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver_GeneratedInjector;
import cn.jianyun.workplan.widget.config.WidgetConfigViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes2.dex */
public final class HiltApplication_HiltComponents {

    @Subcomponent(modules = {FragmentCBuilderModule.class, ViewCBuilderModule.class, HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class})
    public static abstract class ActivityC implements MainActivity_GeneratedInjector, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityC.class})
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @Subcomponent(modules = {AppSettingViewModel_HiltModules.KeyModule.class, AppViewModel_HiltModules.KeyModule.class, ColorViewModel_HiltModules.KeyModule.class, FestivalViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, JgyBindViewModel_HiltModules.KeyModule.class, LocalBackupViewModel_HiltModules.KeyModule.class, QuestionViewModel_HiltModules.KeyModule.class, ScheduleAlarmViewModel_HiltModules.KeyModule.class, ScheduleCloudManageViewModel_HiltModules.KeyModule.class, ScheduleConfigViewModel_HiltModules.KeyModule.class, ScheduleMasterViewModel_HiltModules.KeyModule.class, SchedulePlanViewModel_HiltModules.KeyModule.class, ScheduleProjectViewModel_HiltModules.KeyModule.class, ScheduleShareViewModel_HiltModules.KeyModule.class, ScheduleStatViewModel_HiltModules.KeyModule.class, ScheduleWorkViewModel_HiltModules.KeyModule.class, SecretViewModel_HiltModules.KeyModule.class, SwipeViewModel_HiltModules.KeyModule.class, TestMainViewViewModel_HiltModules.KeyModule.class, V1ViewModel_HiltModules.KeyModule.class, V2ViewModel_HiltModules.KeyModule.class, WebDAVUserViewModel_HiltModules.KeyModule.class, WebDavViewModel_HiltModules.KeyModule.class, WechatViewModel_HiltModules.KeyModule.class, WidgetConfigViewModel_HiltModules.KeyModule.class})
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityRetainedC.class})
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    public static abstract class FragmentC implements FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends FragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {FragmentC.class})
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @Subcomponent
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ServiceComponentBuilder {
        }
    }

    @Module(subcomponents = {ServiceC.class})
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Component(modules = {AppModule.class, ApplicationContextModule.class, BaseModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, ScheduleModule.class})
    @Singleton
    public static abstract class SingletonC implements HiltApplication_GeneratedInjector, AlarmWidgetReceiver_GeneratedInjector, MyAppWidgetReceiver_GeneratedInjector, FragmentGetContextFix.FragmentGetContextFixEntryPoint, HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewC.class})
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @Subcomponent(modules = {AppSettingViewModel_HiltModules.BindsModule.class, AppViewModel_HiltModules.BindsModule.class, ColorViewModel_HiltModules.BindsModule.class, FestivalViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, JgyBindViewModel_HiltModules.BindsModule.class, LocalBackupViewModel_HiltModules.BindsModule.class, QuestionViewModel_HiltModules.BindsModule.class, ScheduleAlarmViewModel_HiltModules.BindsModule.class, ScheduleCloudManageViewModel_HiltModules.BindsModule.class, ScheduleConfigViewModel_HiltModules.BindsModule.class, ScheduleMasterViewModel_HiltModules.BindsModule.class, SchedulePlanViewModel_HiltModules.BindsModule.class, ScheduleProjectViewModel_HiltModules.BindsModule.class, ScheduleShareViewModel_HiltModules.BindsModule.class, ScheduleStatViewModel_HiltModules.BindsModule.class, ScheduleWorkViewModel_HiltModules.BindsModule.class, SecretViewModel_HiltModules.BindsModule.class, SwipeViewModel_HiltModules.BindsModule.class, TestMainViewViewModel_HiltModules.BindsModule.class, V1ViewModel_HiltModules.BindsModule.class, V2ViewModel_HiltModules.BindsModule.class, WebDAVUserViewModel_HiltModules.BindsModule.class, WebDavViewModel_HiltModules.BindsModule.class, WechatViewModel_HiltModules.BindsModule.class, WidgetConfigViewModel_HiltModules.BindsModule.class})
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewModelComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewModelC.class})
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @Subcomponent
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private HiltApplication_HiltComponents() {
    }
}