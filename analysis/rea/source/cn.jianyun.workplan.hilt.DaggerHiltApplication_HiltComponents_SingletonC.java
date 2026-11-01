package cn.jianyun.workplan.hilt;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.api.ConfigApi;
import cn.jianyun.workplan.api.ScheduleShareApi;
import cn.jianyun.workplan.api.ShareApi;
import cn.jianyun.workplan.api.TraceApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.main.MainActivity;
import cn.jianyun.workplan.main.MainActivity_MembersInjector;
import cn.jianyun.workplan.main.question.QuestionViewModel;
import cn.jianyun.workplan.main.question.QuestionViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.main.receiver.AlarmWidgetReceiver;
import cn.jianyun.workplan.main.receiver.AlarmWidgetReceiver_MembersInjector;
import cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel;
import cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.main.setting.local.LocalBackupViewModel;
import cn.jianyun.workplan.main.setting.local.LocalBackupViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.main.test.TestMainViewViewModel;
import cn.jianyun.workplan.main.test.TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.main.test.V1ViewModel;
import cn.jianyun.workplan.main.test.V1ViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.main.test.V2ViewModel;
import cn.jianyun.workplan.main.test.V2ViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.base.BaseDatabase;
import cn.jianyun.workplan.module.base.BaseModule;
import cn.jianyun.workplan.module.base.BaseModule_ProvideDao1Factory;
import cn.jianyun.workplan.module.base.BaseModule_ProvideDbFactory;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel;
import cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.ScheduleDatabase;
import cn.jianyun.workplan.module.schedule.ScheduleModule;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideAppDatabaseFactory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideDao5Factory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideScheduleAlarmDaoFactory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideScheduleDutyDaoFactory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideSchedulePlanDaoFactory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideScheduleProjectDaoFactory;
import cn.jianyun.workplan.module.schedule.ScheduleModule_ProvideScheduleWorkDaoFactory;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel;
import cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel;
import cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel;
import cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.ui.component.nav.SecretViewModel;
import cn.jianyun.workplan.ui.component.nav.SecretViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.ui.component.nav.SwipeViewModel;
import cn.jianyun.workplan.ui.component.nav.SwipeViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.vm.AppSettingViewModel;
import cn.jianyun.workplan.vm.AppSettingViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.vm.AppViewModel;
import cn.jianyun.workplan.vm.AppViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.vm.ColorViewModel;
import cn.jianyun.workplan.vm.ColorViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.vm.FestivalViewModel;
import cn.jianyun.workplan.vm.FestivalViewModel_HiltModules_KeyModule_ProvideFactory;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver_MembersInjector;
import cn.jianyun.workplan.widget.config.WidgetConfigViewModel;
import cn.jianyun.workplan.widget.config.WidgetConfigViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class DaggerHiltApplication_HiltComponents_SingletonC {
    private DaggerHiltApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        @Deprecated
        public Builder appModule(AppModule appModule) {
            Preconditions.checkNotNull(appModule);
            return this;
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        @Deprecated
        public Builder baseModule(BaseModule baseModule) {
            Preconditions.checkNotNull(baseModule);
            return this;
        }

        @Deprecated
        public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
            Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
            return this;
        }

        @Deprecated
        public Builder scheduleModule(ScheduleModule scheduleModule) {
            Preconditions.checkNotNull(scheduleModule);
            return this;
        }

        public HiltApplication_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements HiltApplication_HiltComponents.ActivityRetainedC.Builder {
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public HiltApplication_HiltComponents.ActivityRetainedC build() {
            return new ActivityRetainedCImpl(this.singletonCImpl);
        }
    }

    private static final class ActivityCBuilder implements HiltApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public HiltApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements HiltApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public HiltApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements HiltApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public HiltApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements HiltApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public HiltApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements HiltApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public HiltApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    private static final class ServiceCBuilder implements HiltApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public HiltApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends HiltApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl;

        private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View viewParam) {
            this.viewWithFragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private static final class FragmentCImpl extends HiltApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;

        private FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragmentParam) {
            this.fragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    private static final class ViewCImpl extends HiltApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl;

        private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
            this.viewCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    private static final class ActivityCImpl extends HiltApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
            this.activityCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // cn.jianyun.workplan.main.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity mainActivity) {
            injectMainActivity2(mainActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Set<String> getViewModelKeys() {
            return SetBuilder.newSetBuilder(25).add(AppSettingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AppViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ColorViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(FestivalViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(JgyBindViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LocalBackupViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(QuestionViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleAlarmViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleCloudManageViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleConfigViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleMasterViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SchedulePlanViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleProjectViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleShareViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleStatViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ScheduleWorkViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SecretViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SwipeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(TestMainViewViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(V1ViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(V2ViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(WebDAVUserViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(WebDavViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(WechatViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(WidgetConfigViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        private MainActivity injectMainActivity2(MainActivity instance) {
            MainActivity_MembersInjector.injectBaseRepository(instance, (BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
            return instance;
        }
    }

    private static final class ViewModelCImpl extends HiltApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Provider<AppSettingViewModel> appSettingViewModelProvider;
        private Provider<AppViewModel> appViewModelProvider;
        private Provider<ColorViewModel> colorViewModelProvider;
        private Provider<FestivalViewModel> festivalViewModelProvider;
        private Provider<JgyBindViewModel> jgyBindViewModelProvider;
        private Provider<LocalBackupViewModel> localBackupViewModelProvider;
        private Provider<QuestionViewModel> questionViewModelProvider;
        private Provider<ScheduleAlarmViewModel> scheduleAlarmViewModelProvider;
        private Provider<ScheduleCloudManageViewModel> scheduleCloudManageViewModelProvider;
        private Provider<ScheduleConfigViewModel> scheduleConfigViewModelProvider;
        private Provider<ScheduleMasterViewModel> scheduleMasterViewModelProvider;
        private Provider<SchedulePlanViewModel> schedulePlanViewModelProvider;
        private Provider<ScheduleProjectViewModel> scheduleProjectViewModelProvider;
        private Provider<ScheduleShareViewModel> scheduleShareViewModelProvider;
        private Provider<ScheduleStatViewModel> scheduleStatViewModelProvider;
        private Provider<ScheduleWorkViewModel> scheduleWorkViewModelProvider;
        private Provider<SecretViewModel> secretViewModelProvider;
        private final SingletonCImpl singletonCImpl;
        private Provider<SwipeViewModel> swipeViewModelProvider;
        private Provider<TestMainViewViewModel> testMainViewViewModelProvider;
        private Provider<V1ViewModel> v1ViewModelProvider;
        private Provider<V2ViewModel> v2ViewModelProvider;
        private final ViewModelCImpl viewModelCImpl;
        private Provider<WebDAVUserViewModel> webDAVUserViewModelProvider;
        private Provider<WebDavViewModel> webDavViewModelProvider;
        private Provider<WechatViewModel> wechatViewModelProvider;
        private Provider<WidgetConfigViewModel> widgetConfigViewModelProvider;

        private ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.viewModelCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            initialize(savedStateHandleParam, viewModelLifecycleParam);
        }

        private void initialize(final SavedStateHandle savedStateHandleParam, final ViewModelLifecycle viewModelLifecycleParam) {
            this.appSettingViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.appViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.colorViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.festivalViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.jgyBindViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.localBackupViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.questionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.scheduleAlarmViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.scheduleCloudManageViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.scheduleConfigViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.scheduleMasterViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 10);
            this.schedulePlanViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 11);
            this.scheduleProjectViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 12);
            this.scheduleShareViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 13);
            this.scheduleStatViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 14);
            this.scheduleWorkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 15);
            this.secretViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 16);
            this.swipeViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 17);
            this.testMainViewViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 18);
            this.v1ViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 19);
            this.v2ViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 20);
            this.webDAVUserViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 21);
            this.webDavViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 22);
            this.wechatViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 23);
            this.widgetConfigViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 24);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
            return MapBuilder.newMapBuilder(25).put("cn.jianyun.workplan.vm.AppSettingViewModel", this.appSettingViewModelProvider).put("cn.jianyun.workplan.vm.AppViewModel", this.appViewModelProvider).put("cn.jianyun.workplan.vm.ColorViewModel", this.colorViewModelProvider).put("cn.jianyun.workplan.vm.FestivalViewModel", this.festivalViewModelProvider).put("cn.jianyun.workplan.main.setting.cloud.jgy.JgyBindViewModel", this.jgyBindViewModelProvider).put("cn.jianyun.workplan.main.setting.local.LocalBackupViewModel", this.localBackupViewModelProvider).put("cn.jianyun.workplan.main.question.QuestionViewModel", this.questionViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleAlarmViewModel", this.scheduleAlarmViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleCloudManageViewModel", this.scheduleCloudManageViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleConfigViewModel", this.scheduleConfigViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel", this.scheduleMasterViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.SchedulePlanViewModel", this.schedulePlanViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleProjectViewModel", this.scheduleProjectViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel", this.scheduleShareViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel", this.scheduleStatViewModelProvider).put("cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel", this.scheduleWorkViewModelProvider).put("cn.jianyun.workplan.ui.component.nav.SecretViewModel", this.secretViewModelProvider).put("cn.jianyun.workplan.ui.component.nav.SwipeViewModel", this.swipeViewModelProvider).put("cn.jianyun.workplan.main.test.TestMainViewViewModel", this.testMainViewViewModelProvider).put("cn.jianyun.workplan.main.test.V1ViewModel", this.v1ViewModelProvider).put("cn.jianyun.workplan.main.test.V2ViewModel", this.v2ViewModelProvider).put("cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel", this.webDAVUserViewModelProvider).put("cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel", this.webDavViewModelProvider).put("cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel", this.wechatViewModelProvider).put("cn.jianyun.workplan.widget.config.WidgetConfigViewModel", this.widgetConfigViewModelProvider).build();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;
            private final int id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.id) {
                    case 0:
                        return (T) new AppSettingViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (BaseApi) this.singletonCImpl.provideBaseApiProvider.get());
                    case 1:
                        return (T) new AppViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 2:
                        return (T) new ColorViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 3:
                        return (T) new FestivalViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (BaseApi) this.singletonCImpl.provideBaseApiProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 4:
                        return (T) new JgyBindViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 5:
                        return (T) new LocalBackupViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 6:
                        return (T) new QuestionViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (BaseApi) this.singletonCImpl.provideBaseApiProvider.get());
                    case 7:
                        return (T) new ScheduleAlarmViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 8:
                        return (T) new ScheduleCloudManageViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 9:
                        return (T) new ScheduleConfigViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), this.singletonCImpl.scheduleConfigDao());
                    case 10:
                        return (T) new ScheduleMasterViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 11:
                        return (T) new SchedulePlanViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 12:
                        return (T) new ScheduleProjectViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 13:
                        return (T) new ScheduleShareViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get(), (ScheduleShareApi) this.singletonCImpl.provideScheduleShareApiServiceProvider.get());
                    case 14:
                        return (T) new ScheduleStatViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 15:
                        return (T) new ScheduleWorkViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get());
                    case 16:
                        return (T) new SecretViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 17:
                        return (T) new SwipeViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 18:
                        return (T) new TestMainViewViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 19:
                        return (T) new V1ViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 20:
                        return (T) new V2ViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 21:
                        return (T) new WebDAVUserViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), this.singletonCImpl.webDAVUserDao());
                    case 22:
                        return (T) new WebDavViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    case 23:
                        return (T) new WechatViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), (ScheduleService) this.singletonCImpl.scheduleServiceProvider.get(), (ShareApi) this.singletonCImpl.provideShareApiServiceProvider.get());
                    case 24:
                        return (T) new WidgetConfigViewModel((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get());
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }

    private static final class ActivityRetainedCImpl extends HiltApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
            this.activityRetainedCImpl = this;
            this.singletonCImpl = singletonCImpl;
            initialize();
        }

        private void initialize() {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;
            private final int id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider
            public T get() {
                if (this.id == 0) {
                    return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
                }
                throw new AssertionError(this.id);
            }
        }
    }

    private static final class ServiceCImpl extends HiltApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl;
        private final SingletonCImpl singletonCImpl;

        private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
            this.serviceCImpl = this;
            this.singletonCImpl = singletonCImpl;
        }
    }

    private static final class SingletonCImpl extends HiltApplication_HiltComponents.SingletonC {
        private final ApplicationContextModule applicationContextModule;
        private Provider<BaseRepository> baseRepositoryProvider;
        private Provider<DataStore<Preferences>> provideAppCacheProvider;
        private Provider<ScheduleDatabase> provideAppDatabaseProvider;
        private Provider<BaseApi> provideBaseApiProvider;
        private Provider<ConfigApi> provideConfigApiServiceProvider;
        private Provider<BaseDatabase> provideDbProvider;
        private Provider<OkHttpClient> provideOkHttpClientProvider;
        private Provider<ScheduleShareApi> provideScheduleShareApiServiceProvider;
        private Provider<ShareApi> provideShareApiServiceProvider;
        private Provider<TraceApi> provideTraceApiProvider;
        private Provider<ScheduleService> scheduleServiceProvider;
        private final SingletonCImpl singletonCImpl;

        @Override // cn.jianyun.workplan.hilt.HiltApplication_GeneratedInjector
        public void injectHiltApplication(HiltApplication hiltApplication) {
        }

        private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
            this.singletonCImpl = this;
            this.applicationContextModule = applicationContextModuleParam;
            initialize(applicationContextModuleParam);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public WebDAVUserDao webDAVUserDao() {
            return BaseModule_ProvideDao1Factory.provideDao1(this.provideDbProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScheduleProjectDao scheduleProjectDao() {
            return ScheduleModule_ProvideScheduleProjectDaoFactory.provideScheduleProjectDao(this.provideAppDatabaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScheduleDutyDao scheduleDutyDao() {
            return ScheduleModule_ProvideScheduleDutyDaoFactory.provideScheduleDutyDao(this.provideAppDatabaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScheduleWorkDao scheduleWorkDao() {
            return ScheduleModule_ProvideScheduleWorkDaoFactory.provideScheduleWorkDao(this.provideAppDatabaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SchedulePlanDao schedulePlanDao() {
            return ScheduleModule_ProvideSchedulePlanDaoFactory.provideSchedulePlanDao(this.provideAppDatabaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScheduleAlarmDao scheduleAlarmDao() {
            return ScheduleModule_ProvideScheduleAlarmDaoFactory.provideScheduleAlarmDao(this.provideAppDatabaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScheduleConfigDao scheduleConfigDao() {
            return ScheduleModule_ProvideDao5Factory.provideDao5(this.provideAppDatabaseProvider.get());
        }

        private void initialize(final ApplicationContextModule applicationContextModuleParam) {
            this.provideAppCacheProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 1));
            this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 3));
            this.provideTraceApiProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 2));
            this.provideBaseApiProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 4));
            this.provideConfigApiServiceProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 5));
            this.provideDbProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 6));
            this.baseRepositoryProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 0));
            this.provideAppDatabaseProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 8));
            this.scheduleServiceProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 7));
            this.provideScheduleShareApiServiceProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 9));
            this.provideShareApiServiceProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, 10));
        }

        @Override // cn.jianyun.workplan.main.receiver.AlarmWidgetReceiver_GeneratedInjector
        public void injectAlarmWidgetReceiver(AlarmWidgetReceiver alarmWidgetReceiver) {
            injectAlarmWidgetReceiver2(alarmWidgetReceiver);
        }

        @Override // cn.jianyun.workplan.widget.MyAppWidgetReceiver_GeneratedInjector
        public void injectMyAppWidgetReceiver(MyAppWidgetReceiver myAppWidgetReceiver) {
            injectMyAppWidgetReceiver2(myAppWidgetReceiver);
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return Collections.emptySet();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }

        private AlarmWidgetReceiver injectAlarmWidgetReceiver2(AlarmWidgetReceiver instance) {
            AlarmWidgetReceiver_MembersInjector.injectBaseRepository(instance, this.baseRepositoryProvider.get());
            return instance;
        }

        private MyAppWidgetReceiver injectMyAppWidgetReceiver2(MyAppWidgetReceiver instance) {
            MyAppWidgetReceiver_MembersInjector.injectScheduleService(instance, this.scheduleServiceProvider.get());
            return instance;
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final int id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.id = id;
            }

            @Override // javax.inject.Provider
            public T get() {
                switch (this.id) {
                    case 0:
                        return (T) new BaseRepository((DataStore) this.singletonCImpl.provideAppCacheProvider.get(), (TraceApi) this.singletonCImpl.provideTraceApiProvider.get(), (BaseApi) this.singletonCImpl.provideBaseApiProvider.get(), (ConfigApi) this.singletonCImpl.provideConfigApiServiceProvider.get(), this.singletonCImpl.webDAVUserDao(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 1:
                        return (T) AppModule_ProvideAppCacheFactory.provideAppCache(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 2:
                        return (T) AppModule_ProvideTraceApiFactory.provideTraceApi((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 3:
                        return (T) AppModule_ProvideOkHttpClientFactory.provideOkHttpClient();
                    case 4:
                        return (T) AppModule_ProvideBaseApiFactory.provideBaseApi((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 5:
                        return (T) AppModule_ProvideConfigApiServiceFactory.provideConfigApiService((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 6:
                        return (T) BaseModule_ProvideDbFactory.provideDb(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 7:
                        return (T) new ScheduleService((BaseRepository) this.singletonCImpl.baseRepositoryProvider.get(), this.singletonCImpl.scheduleProjectDao(), this.singletonCImpl.scheduleDutyDao(), this.singletonCImpl.scheduleWorkDao(), this.singletonCImpl.schedulePlanDao(), this.singletonCImpl.scheduleAlarmDao(), this.singletonCImpl.scheduleConfigDao());
                    case 8:
                        return (T) ScheduleModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 9:
                        return (T) AppModule_ProvideScheduleShareApiServiceFactory.provideScheduleShareApiService((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 10:
                        return (T) AppModule_ProvideShareApiServiceFactory.provideShareApiService((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    default:
                        throw new AssertionError(this.id);
                }
            }
        }
    }
}