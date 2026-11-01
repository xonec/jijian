package cn.jianyun.workplan.widget;

import cn.jianyun.workplan.module.schedule.views.service.ScheduleService;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class MyAppWidgetReceiver_MembersInjector implements MembersInjector<MyAppWidgetReceiver> {
    private final Provider<ScheduleService> scheduleServiceProvider;

    public MyAppWidgetReceiver_MembersInjector(Provider<ScheduleService> scheduleServiceProvider) {
        this.scheduleServiceProvider = scheduleServiceProvider;
    }

    public static MembersInjector<MyAppWidgetReceiver> create(Provider<ScheduleService> scheduleServiceProvider) {
        return new MyAppWidgetReceiver_MembersInjector(scheduleServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MyAppWidgetReceiver instance) {
        injectScheduleService(instance, this.scheduleServiceProvider.get());
    }

    public static void injectScheduleService(MyAppWidgetReceiver instance, ScheduleService scheduleService) {
        instance.scheduleService = scheduleService;
    }
}