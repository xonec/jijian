package cn.jianyun.workplan.module.schedule.views.service;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleService_Factory implements Factory<ScheduleService> {
    private final Provider<ScheduleAlarmDao> alarmDaoProvider;
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<ScheduleConfigDao> configDaoProvider;
    private final Provider<ScheduleDutyDao> scheduleDutyDaoProvider;
    private final Provider<SchedulePlanDao> schedulePlanDaoProvider;
    private final Provider<ScheduleProjectDao> scheduleProjectDaoProvider;
    private final Provider<ScheduleWorkDao> scheduleWorkDaoProvider;

    public ScheduleService_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleProjectDao> scheduleProjectDaoProvider, Provider<ScheduleDutyDao> scheduleDutyDaoProvider, Provider<ScheduleWorkDao> scheduleWorkDaoProvider, Provider<SchedulePlanDao> schedulePlanDaoProvider, Provider<ScheduleAlarmDao> alarmDaoProvider, Provider<ScheduleConfigDao> configDaoProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.scheduleProjectDaoProvider = scheduleProjectDaoProvider;
        this.scheduleDutyDaoProvider = scheduleDutyDaoProvider;
        this.scheduleWorkDaoProvider = scheduleWorkDaoProvider;
        this.schedulePlanDaoProvider = schedulePlanDaoProvider;
        this.alarmDaoProvider = alarmDaoProvider;
        this.configDaoProvider = configDaoProvider;
    }

    @Override // javax.inject.Provider
    public ScheduleService get() {
        return newInstance(this.baseRepositoryProvider.get(), this.scheduleProjectDaoProvider.get(), this.scheduleDutyDaoProvider.get(), this.scheduleWorkDaoProvider.get(), this.schedulePlanDaoProvider.get(), this.alarmDaoProvider.get(), this.configDaoProvider.get());
    }

    public static ScheduleService_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<ScheduleProjectDao> scheduleProjectDaoProvider, Provider<ScheduleDutyDao> scheduleDutyDaoProvider, Provider<ScheduleWorkDao> scheduleWorkDaoProvider, Provider<SchedulePlanDao> schedulePlanDaoProvider, Provider<ScheduleAlarmDao> alarmDaoProvider, Provider<ScheduleConfigDao> configDaoProvider) {
        return new ScheduleService_Factory(baseRepositoryProvider, scheduleProjectDaoProvider, scheduleDutyDaoProvider, scheduleWorkDaoProvider, schedulePlanDaoProvider, alarmDaoProvider, configDaoProvider);
    }

    public static ScheduleService newInstance(BaseRepository baseRepository, ScheduleProjectDao scheduleProjectDao, ScheduleDutyDao scheduleDutyDao, ScheduleWorkDao scheduleWorkDao, SchedulePlanDao schedulePlanDao, ScheduleAlarmDao alarmDao, ScheduleConfigDao configDao) {
        return new ScheduleService(baseRepository, scheduleProjectDao, scheduleDutyDao, scheduleWorkDao, schedulePlanDao, alarmDao, configDao);
    }
}